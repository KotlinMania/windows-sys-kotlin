@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionRecord64
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry32
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry64

public data class ArrayDimension(
    public var lowerBound: Long = 0L,
    public var length: ULong = 0uL,
    public var stride: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArrayDimension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArrayDimension> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ArrayDimension =
                    ArrayDimension(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ArrayDimension) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lowerBound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stride)
                }
            }
    }
}

public class Busdata internal constructor(
    public var busDataType: UInt,
    public var busNumber: UInt,
    public var slotNumber: UInt,
    bufferCtorArg: MutPtr,
    public var offset: UInt,
    public var length: UInt,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        busDataType = 0u,
        busNumber = 0u,
        slotNumber = 0u,
        bufferCtorArg = MutPtr(0L),
        offset = 0u,
        length = 0u,
    )

    public operator fun component1(): UInt = this.busDataType

    public operator fun component2(): UInt = this.busNumber

    public operator fun component3(): UInt = this.slotNumber

    public operator fun component4(): MutPtr = this.buffer

    public operator fun component5(): UInt = this.offset

    public operator fun component6(): UInt = this.length

    public fun copy(busDataType: UInt = this.busDataType, busNumber: UInt = this.busNumber, slotNumber: UInt = this.slotNumber, buffer: MutPtr = this.buffer, offset: UInt = this.offset, length: UInt = this.length): Busdata = Busdata(busDataType = busDataType, busNumber = busNumber, slotNumber = slotNumber, bufferCtorArg = buffer, offset = offset, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Busdata) return false
        if (this.busDataType != other.busDataType) return false
        if (this.busNumber != other.busNumber) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.buffer != other.buffer) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.busDataType.hashCode()
        result = 31 * result + this.busNumber.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Busdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Busdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Busdata =
                    Busdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Busdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.busDataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.slotNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.length)
                }
            }

        public operator fun invoke(
            busDataType: UInt = 0u,
            busNumber: UInt = 0u,
            slotNumber: UInt = 0u,
            buffer: MutPtr = MutPtr(0L),
            offset: UInt = 0u,
            length: UInt = 0u,
        ): Busdata =
            Busdata(
                busDataType = busDataType,
                busNumber = busNumber,
                slotNumber = slotNumber,
                bufferCtorArg = buffer,
                offset = offset,
                length = length,
            )
    }
}

public class CkclData internal constructor(
    nextLogEventCtorArg: MutPtr,
    tAnalyzeStringCtorArg: Pstr,
    public var tAnalyzeReturnType: TanalyzeReturn,
) {
    public var nextLogEvent: MutPtr = nextLogEventCtorArg
        internal set

    public var tAnalyzeString: Pstr = tAnalyzeStringCtorArg
        internal set

    public constructor() : this(
        nextLogEventCtorArg = MutPtr(0L),
        tAnalyzeStringCtorArg = MutPtr(0L),
        tAnalyzeReturnType = 0,
    )

    public operator fun component1(): MutPtr = this.nextLogEvent

    public operator fun component2(): Pstr = this.tAnalyzeString

    public operator fun component3(): TanalyzeReturn = this.tAnalyzeReturnType

    public fun copy(nextLogEvent: MutPtr = this.nextLogEvent, tAnalyzeString: Pstr = this.tAnalyzeString, tAnalyzeReturnType: TanalyzeReturn = this.tAnalyzeReturnType): CkclData = CkclData(nextLogEventCtorArg = nextLogEvent, tAnalyzeStringCtorArg = tAnalyzeString, tAnalyzeReturnType = tAnalyzeReturnType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CkclData) return false
        if (this.nextLogEvent != other.nextLogEvent) return false
        if (this.tAnalyzeString != other.tAnalyzeString) return false
        if (this.tAnalyzeReturnType != other.tAnalyzeReturnType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextLogEvent.hashCode()
        result = 31 * result + this.tAnalyzeString.hashCode()
        result = 31 * result + this.tAnalyzeReturnType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nextLogEvent: MutPtr = MutPtr(0L),
            tAnalyzeString: Pstr = MutPtr(0L),
            tAnalyzeReturnType: TanalyzeReturn = 0,
        ): CkclData =
            CkclData(
                nextLogEventCtorArg = nextLogEvent,
                tAnalyzeStringCtorArg = tAnalyzeString,
                tAnalyzeReturnType = tAnalyzeReturnType,
            )
    }
}

public class CkclListhead internal constructor(
    logEventListHeadCtorArg: MutPtr,
    heapCtorArg: Handle,
) {
    public var logEventListHead: MutPtr = logEventListHeadCtorArg
        internal set

    public var heap: Handle = heapCtorArg
        internal set

    public constructor() : this(
        logEventListHeadCtorArg = MutPtr(0L),
        heapCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.logEventListHead

    public operator fun component2(): Handle = this.heap

    public fun copy(logEventListHead: MutPtr = this.logEventListHead, heap: Handle = this.heap): CkclListhead = CkclListhead(logEventListHeadCtorArg = logEventListHead, heapCtorArg = heap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CkclListhead) return false
        if (this.logEventListHead != other.logEventListHead) return false
        if (this.heap != other.heap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logEventListHead.hashCode()
        result = 31 * result + this.heap.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logEventListHead: MutPtr = MutPtr(0L),
            heap: Handle = MutPtr(0L),
        ): CkclListhead =
            CkclListhead(
                logEventListHeadCtorArg = logEventListHead,
                heapCtorArg = heap,
            )
    }
}

public data class CpuInfo(
    public var type: UInt = 0u,
    public var numCPUs: UInt = 0u,
    public var currentProc: UInt = 0u,
    public var procInfo: List<DebugProcessorIdentificationAll> = List(2048) { DebugProcessorIdentificationAll() },
    public var mhz: UInt = 0u,
)

public data class CpuInfoV1(
    public var type: UInt = 0u,
    public var numCPUs: UInt = 0u,
    public var currentProc: UInt = 0u,
    public var procInfo: List<DebugProcessorIdentificationAll> = List(32) { DebugProcessorIdentificationAll() },
    public var mhz: UInt = 0u,
)

public data class CpuInfoV2(
    public var type: UInt = 0u,
    public var numCPUs: UInt = 0u,
    public var currentProc: UInt = 0u,
    public var procInfo: List<DebugProcessorIdentificationAll> = List(1280) { DebugProcessorIdentificationAll() },
    public var mhz: UInt = 0u,
)

public data class DbgkdDebugDataHeader32(
    public var list: ListEntry32 = ListEntry32(),
    public var ownerTag: UInt = 0u,
    public var size: UInt = 0u,
)

public data class DbgkdDebugDataHeader64(
    public var list: ListEntry64 = ListEntry64(),
    public var ownerTag: UInt = 0u,
    public var size: UInt = 0u,
)

public data class DbgkdGetVersion32(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var protocolVersion: UShort = 0u,
    public var flags: UShort = 0u,
    public var kernBase: UInt = 0u,
    public var psLoadedModuleList: UInt = 0u,
    public var machineType: UShort = 0u,
    public var thCallbackStack: UShort = 0u,
    public var nextCallback: UShort = 0u,
    public var framePointer: UShort = 0u,
    public var kiCallUserMode: UInt = 0u,
    public var keUserCallbackDispatcher: UInt = 0u,
    public var breakpointWithStatus: UInt = 0u,
    public var debuggerDataList: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbgkdGetVersion32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbgkdGetVersion32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DbgkdGetVersion32 =
                    DbgkdGetVersion32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: DbgkdGetVersion32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.protocolVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.kernBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.psLoadedModuleList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.machineType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.thCallbackStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.nextCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.framePointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.kiCallUserMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.keUserCallbackDispatcher)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.breakpointWithStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.debuggerDataList)
                }
            }
    }
}

public data class DbgkdGetVersion64(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var protocolVersion: UByte = 0u,
    public var kdSecondaryVersion: UByte = 0u,
    public var flags: UShort = 0u,
    public var machineType: UShort = 0u,
    public var maxPacketType: UByte = 0u,
    public var maxStateChange: UByte = 0u,
    public var maxManipulate: UByte = 0u,
    public var simulation: UByte = 0u,
    public var unused: UShortArray = UShortArray(1),
    public var kernBase: ULong = 0uL,
    public var psLoadedModuleList: ULong = 0uL,
    public var debuggerDataList: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbgkdGetVersion64) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.protocolVersion != other.protocolVersion) return false
        if (this.kdSecondaryVersion != other.kdSecondaryVersion) return false
        if (this.flags != other.flags) return false
        if (this.machineType != other.machineType) return false
        if (this.maxPacketType != other.maxPacketType) return false
        if (this.maxStateChange != other.maxStateChange) return false
        if (this.maxManipulate != other.maxManipulate) return false
        if (this.simulation != other.simulation) return false
        if (!this.unused.contentEquals(other.unused)) return false
        if (this.kernBase != other.kernBase) return false
        if (this.psLoadedModuleList != other.psLoadedModuleList) return false
        if (this.debuggerDataList != other.debuggerDataList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.protocolVersion.hashCode()
        result = 31 * result + this.kdSecondaryVersion.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.machineType.hashCode()
        result = 31 * result + this.maxPacketType.hashCode()
        result = 31 * result + this.maxStateChange.hashCode()
        result = 31 * result + this.maxManipulate.hashCode()
        result = 31 * result + this.simulation.hashCode()
        result = 31 * result + this.unused.contentHashCode()
        result = 31 * result + this.kernBase.hashCode()
        result = 31 * result + this.psLoadedModuleList.hashCode()
        result = 31 * result + this.debuggerDataList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbgkdGetVersion64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbgkdGetVersion64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DbgkdGetVersion64 =
                    DbgkdGetVersion64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 14L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: DbgkdGetVersion64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.protocolVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.kdSecondaryVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.machineType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.maxPacketType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.maxStateChange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.maxManipulate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.simulation)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 14L, value.unused.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.kernBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.psLoadedModuleList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.debuggerDataList)
                }
            }
    }
}

public data class DbgThreadAttributes(
    public var threadIndex: UInt = 0u,
    public var processID: ULong = 0uL,
    public var threadID: ULong = 0uL,
    public var attributeBits: ULong = 0uL,
    public var boolBits: UInt = 0u,
    public var blockedOnPID: ULong = 0uL,
    public var blockedOnTID: ULong = 0uL,
    public var critSecAddress: ULong = 0uL,
    public var timeoutMsec: UInt = 0u,
    public var stringData: ByteArray = ByteArray(100),
    public var symName: ByteArray = ByteArray(100),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbgThreadAttributes) return false
        if (this.threadIndex != other.threadIndex) return false
        if (this.processID != other.processID) return false
        if (this.threadID != other.threadID) return false
        if (this.attributeBits != other.attributeBits) return false
        if (this.boolBits != other.boolBits) return false
        if (this.blockedOnPID != other.blockedOnPID) return false
        if (this.blockedOnTID != other.blockedOnTID) return false
        if (this.critSecAddress != other.critSecAddress) return false
        if (this.timeoutMsec != other.timeoutMsec) return false
        if (!this.stringData.contentEquals(other.stringData)) return false
        if (!this.symName.contentEquals(other.symName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadIndex.hashCode()
        result = 31 * result + this.processID.hashCode()
        result = 31 * result + this.threadID.hashCode()
        result = 31 * result + this.attributeBits.hashCode()
        result = 31 * result + this.boolBits.hashCode()
        result = 31 * result + this.blockedOnPID.hashCode()
        result = 31 * result + this.blockedOnTID.hashCode()
        result = 31 * result + this.critSecAddress.hashCode()
        result = 31 * result + this.timeoutMsec.hashCode()
        result = 31 * result + this.stringData.contentHashCode()
        result = 31 * result + this.symName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbgThreadAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbgThreadAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): DbgThreadAttributes =
                    DbgThreadAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (100).toInt())
                        ).readNative(addr + 68L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (100).toInt())
                        ).readNative(addr + 168L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DbgThreadAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.processID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.threadID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.attributeBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.boolBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.blockedOnPID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.blockedOnTID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.critSecAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.timeoutMsec)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (100).toInt())
                    ).writeNative(addr + 68L, value.stringData.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (100).toInt())
                    ).writeNative(addr + 168L, value.symName.toList())
                }
            }
    }
}

public data class DebugAnalysisProcessorInfo(
    public var sizeOfStruct: UInt = 0u,
    public var model: UInt = 0u,
    public var family: UInt = 0u,
    public var stepping: UInt = 0u,
    public var architecture: UInt = 0u,
    public var revision: UInt = 0u,
    public var currentClockSpeed: UInt = 0u,
    public var currentVoltage: UInt = 0u,
    public var maxClockSpeed: UInt = 0u,
    public var processorType: UInt = 0u,
    public var deviceID: ByteArray = ByteArray(32),
    public var manufacturer: ByteArray = ByteArray(64),
    public var name: ByteArray = ByteArray(64),
    public var version: ByteArray = ByteArray(64),
    public var description: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugAnalysisProcessorInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.model != other.model) return false
        if (this.family != other.family) return false
        if (this.stepping != other.stepping) return false
        if (this.architecture != other.architecture) return false
        if (this.revision != other.revision) return false
        if (this.currentClockSpeed != other.currentClockSpeed) return false
        if (this.currentVoltage != other.currentVoltage) return false
        if (this.maxClockSpeed != other.maxClockSpeed) return false
        if (this.processorType != other.processorType) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        if (!this.manufacturer.contentEquals(other.manufacturer)) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.model.hashCode()
        result = 31 * result + this.family.hashCode()
        result = 31 * result + this.stepping.hashCode()
        result = 31 * result + this.architecture.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.currentClockSpeed.hashCode()
        result = 31 * result + this.currentVoltage.hashCode()
        result = 31 * result + this.maxClockSpeed.hashCode()
        result = 31 * result + this.processorType.hashCode()
        result = 31 * result + this.deviceID.contentHashCode()
        result = 31 * result + this.manufacturer.contentHashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugAnalysisProcessorInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugAnalysisProcessorInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 328L
                override fun readNative(addr: Long): DebugAnalysisProcessorInfo =
                    DebugAnalysisProcessorInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 40L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 72L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 136L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 200L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 264L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugAnalysisProcessorInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.model)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.family)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.stepping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.architecture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentClockSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.currentVoltage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maxClockSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.processorType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 40L, value.deviceID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 72L, value.manufacturer.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 136L, value.name.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 200L, value.version.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 264L, value.description.toList())
                }
            }
    }
}

public data class DebugBreakpointParameters(
    public var offset: ULong = 0uL,
    public var id: UInt = 0u,
    public var breakType: UInt = 0u,
    public var procType: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataSize: UInt = 0u,
    public var dataAccessType: UInt = 0u,
    public var passCount: UInt = 0u,
    public var currentPassCount: UInt = 0u,
    public var matchThread: UInt = 0u,
    public var commandSize: UInt = 0u,
    public var offsetExpressionSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugBreakpointParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugBreakpointParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): DebugBreakpointParameters =
                    DebugBreakpointParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: DebugBreakpointParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.breakType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.procType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dataAccessType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.passCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.currentPassCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.matchThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.commandSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.offsetExpressionSize)
                }
            }
    }
}

public data class DebugCachedSymbolInfo(
    public var modBase: ULong = 0uL,
    public var arg1: ULong = 0uL,
    public var arg2: ULong = 0uL,
    public var id: UInt = 0u,
    public var arg3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCachedSymbolInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCachedSymbolInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugCachedSymbolInfo =
                    DebugCachedSymbolInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DebugCachedSymbolInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.modBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.arg1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.arg2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.arg3)
                }
            }
    }
}

public data class DebugClientContext(
    public var cbSize: UInt = 0u,
    public var eClient: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugClientContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugClientContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DebugClientContext =
                    DebugClientContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DebugClientContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eClient)
                }
            }
    }
}

public data class DebugCpuMicrocodeVersion(
    public var sizeOfStruct: UInt = 0u,
    public var cachedSignature: Long = 0L,
    public var initialSignature: Long = 0L,
    public var processorModel: UInt = 0u,
    public var processorFamily: UInt = 0u,
    public var processorStepping: UInt = 0u,
    public var processorArchRev: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCpuMicrocodeVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCpuMicrocodeVersion> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DebugCpuMicrocodeVersion =
                    DebugCpuMicrocodeVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: DebugCpuMicrocodeVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.cachedSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.initialSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.processorModel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.processorFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.processorStepping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.processorArchRev)
                }
            }
    }
}

public data class DebugCpuSpeedInfo(
    public var sizeOfStruct: UInt = 0u,
    public var currentSpeed: UInt = 0u,
    public var ratedSpeed: UInt = 0u,
    public var nameString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugCpuSpeedInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.currentSpeed != other.currentSpeed) return false
        if (this.ratedSpeed != other.ratedSpeed) return false
        if (!this.nameString.contentEquals(other.nameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.currentSpeed.hashCode()
        result = 31 * result + this.ratedSpeed.hashCode()
        result = 31 * result + this.nameString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCpuSpeedInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCpuSpeedInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): DebugCpuSpeedInfo =
                    DebugCpuSpeedInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DebugCpuSpeedInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.currentSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ratedSpeed)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 12L, value.nameString.toList())
                }
            }
    }
}

public data class DebugCreateProcessOptions(
    public var createFlags: UInt = 0u,
    public var engCreateFlags: UInt = 0u,
    public var verifierFlags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCreateProcessOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugCreateProcessOptions> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugCreateProcessOptions =
                    DebugCreateProcessOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DebugCreateProcessOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.createFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.engCreateFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.verifierFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class DebugDecodeError(
    public var sizeOfStruct: UInt = 0u,
    public var code: UInt = 0u,
    public var treatAsStatus: Bool = 0,
    public var source: ByteArray = ByteArray(64),
    public var message: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugDecodeError) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.code != other.code) return false
        if (this.treatAsStatus != other.treatAsStatus) return false
        if (!this.source.contentEquals(other.source)) return false
        if (!this.message.contentEquals(other.message)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.treatAsStatus.hashCode()
        result = 31 * result + this.source.contentHashCode()
        result = 31 * result + this.message.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDecodeError> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDecodeError> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 336L
                override fun readNative(addr: Long): DebugDecodeError =
                    DebugDecodeError(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 76L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugDecodeError) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.treatAsStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 12L, value.source.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 76L, value.message.toList())
                }
            }
    }
}

public data class DebugDeviceObjectInfo(
    public var sizeOfStruct: UInt = 0u,
    public var devObjAddress: ULong = 0uL,
    public var referenceCount: UInt = 0u,
    public var qBusy: Bool = 0,
    public var driverObject: ULong = 0uL,
    public var currentIrp: ULong = 0uL,
    public var devExtension: ULong = 0uL,
    public var devObjExtension: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDeviceObjectInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDeviceObjectInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): DebugDeviceObjectInfo =
                    DebugDeviceObjectInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: DebugDeviceObjectInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.devObjAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.referenceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.qBusy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.driverObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.currentIrp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.devExtension)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.devObjExtension)
                }
            }
    }
}

public data class DebugDriverObjectInfo(
    public var sizeOfStruct: UInt = 0u,
    public var driverSize: UInt = 0u,
    public var driverObjAddress: ULong = 0uL,
    public var driverStart: ULong = 0uL,
    public var driverExtension: ULong = 0uL,
    public var deviceObject: ULong = 0uL,
    public var driverName: DebugDriverObjectInfo0 = DebugDriverObjectInfo0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDriverObjectInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDriverObjectInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): DebugDriverObjectInfo =
                    DebugDriverObjectInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (DebugDriverObjectInfo0.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: DebugDriverObjectInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.driverSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.driverObjAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.driverStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.driverExtension)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.deviceObject)
                    (DebugDriverObjectInfo0.typeLayout()).writeNative(addr + 40L, value.driverName)
                }
            }
    }
}

public data class DebugDriverObjectInfo0(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDriverObjectInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugDriverObjectInfo0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugDriverObjectInfo0 =
                    DebugDriverObjectInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DebugDriverObjectInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.buffer)
                }
            }
    }
}

public data class DebugEventContext(
    public var size: UInt = 0u,
    public var processEngineId: UInt = 0u,
    public var threadEngineId: UInt = 0u,
    public var frameEngineId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugEventContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugEventContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugEventContext =
                    DebugEventContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DebugEventContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.processEngineId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.threadEngineId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.frameEngineId)
                }
            }
    }
}

public data class DebugExceptionFilterParameters(
    public var executionOption: UInt = 0u,
    public var continueOption: UInt = 0u,
    public var textSize: UInt = 0u,
    public var commandSize: UInt = 0u,
    public var secondCommandSize: UInt = 0u,
    public var exceptionCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugExceptionFilterParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugExceptionFilterParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DebugExceptionFilterParameters =
                    DebugExceptionFilterParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DebugExceptionFilterParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.executionOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.continueOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.textSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.commandSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.secondCommandSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.exceptionCode)
                }
            }
    }
}

public data class DebugGetTextCompletionsIn(
    public var flags: UInt = 0u,
    public var matchCountLimit: UInt = 0u,
    public var reserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugGetTextCompletionsIn) return false
        if (this.flags != other.flags) return false
        if (this.matchCountLimit != other.matchCountLimit) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.matchCountLimit.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugGetTextCompletionsIn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugGetTextCompletionsIn> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugGetTextCompletionsIn =
                    DebugGetTextCompletionsIn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: DebugGetTextCompletionsIn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.matchCountLimit)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                }
            }
    }
}

public data class DebugGetTextCompletionsOut(
    public var flags: UInt = 0u,
    public var replaceIndex: UInt = 0u,
    public var matchCount: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugGetTextCompletionsOut) return false
        if (this.flags != other.flags) return false
        if (this.replaceIndex != other.replaceIndex) return false
        if (this.matchCount != other.matchCount) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.replaceIndex.hashCode()
        result = 31 * result + this.matchCount.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugGetTextCompletionsOut> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugGetTextCompletionsOut> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugGetTextCompletionsOut =
                    DebugGetTextCompletionsOut(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: DebugGetTextCompletionsOut) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.replaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.matchCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 16L, value.reserved2.toList())
                }
            }
    }
}

public data class DebugHandleDataBasic(
    public var typeNameSize: UInt = 0u,
    public var objectNameSize: UInt = 0u,
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugHandleDataBasic> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugHandleDataBasic> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DebugHandleDataBasic =
                    DebugHandleDataBasic(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DebugHandleDataBasic) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.typeNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.objectNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.grantedAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.handleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pointerCount)
                }
            }
    }
}

public data class DebugIrpInfo(
    public var sizeOfStruct: UInt = 0u,
    public var irpAddress: ULong = 0uL,
    public var ioStatus: UInt = 0u,
    public var stackCount: UInt = 0u,
    public var currentLocation: UInt = 0u,
    public var mdlAddress: ULong = 0uL,
    public var thread: ULong = 0uL,
    public var cancelRoutine: ULong = 0uL,
    public var currentStack: DebugIrpStackInfo = DebugIrpStackInfo(),
    public var stack: List<DebugIrpStackInfo> = List(10) { DebugIrpStackInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugIrpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugIrpInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 496L
                override fun readNative(addr: Long): DebugIrpInfo =
                    DebugIrpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (DebugIrpStackInfo.typeLayout()).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DebugIrpStackInfo.typeLayout(), (10).toInt())
                        ).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: DebugIrpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.irpAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ioStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.stackCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentLocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.mdlAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.thread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.cancelRoutine)
                    (DebugIrpStackInfo.typeLayout()).writeNative(addr + 56L, value.currentStack)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DebugIrpStackInfo.typeLayout(), (10).toInt())
                    ).writeNative(addr + 96L, value.stack)
                }
            }
    }
}

public data class DebugIrpStackInfo(
    public var major: UByte = 0u,
    public var minor: UByte = 0u,
    public var deviceObject: ULong = 0uL,
    public var fileObject: ULong = 0uL,
    public var completionRoutine: ULong = 0uL,
    public var stackAddress: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugIrpStackInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugIrpStackInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): DebugIrpStackInfo =
                    DebugIrpStackInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: DebugIrpStackInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.major)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.deviceObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fileObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.completionRoutine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.stackAddress)
                }
            }
    }
}

public data class DebugLastEventInfoBreakpoint(
    public var id: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoBreakpoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoBreakpoint> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DebugLastEventInfoBreakpoint =
                    DebugLastEventInfoBreakpoint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugLastEventInfoBreakpoint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                }
            }
    }
}

public data class DebugLastEventInfoException(
    public var exceptionRecord: ExceptionRecord64 = ExceptionRecord64(),
    public var firstChance: UInt = 0u,
)

public data class DebugLastEventInfoExitProcess(
    public var exitCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoExitProcess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoExitProcess> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DebugLastEventInfoExitProcess =
                    DebugLastEventInfoExitProcess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugLastEventInfoExitProcess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.exitCode)
                }
            }
    }
}

public data class DebugLastEventInfoExitThread(
    public var exitCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoExitThread> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoExitThread> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DebugLastEventInfoExitThread =
                    DebugLastEventInfoExitThread(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugLastEventInfoExitThread) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.exitCode)
                }
            }
    }
}

public data class DebugLastEventInfoLoadModule(
    public var base: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoLoadModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoLoadModule> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DebugLastEventInfoLoadModule =
                    DebugLastEventInfoLoadModule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugLastEventInfoLoadModule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.base)
                }
            }
    }
}

public data class DebugLastEventInfoServiceException(
    public var kind: UInt = 0u,
    public var dataSize: UInt = 0u,
    public var address: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoServiceException> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoServiceException> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugLastEventInfoServiceException =
                    DebugLastEventInfoServiceException(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DebugLastEventInfoServiceException) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.kind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                }
            }
    }
}

public data class DebugLastEventInfoSystemError(
    public var error: UInt = 0u,
    public var level: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoSystemError> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoSystemError> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DebugLastEventInfoSystemError =
                    DebugLastEventInfoSystemError(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DebugLastEventInfoSystemError) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.error)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.level)
                }
            }
    }
}

public data class DebugLastEventInfoUnloadModule(
    public var base: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoUnloadModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugLastEventInfoUnloadModule> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DebugLastEventInfoUnloadModule =
                    DebugLastEventInfoUnloadModule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugLastEventInfoUnloadModule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.base)
                }
            }
    }
}

public data class DebugModuleAndId(
    public var moduleBase: ULong = 0uL,
    public var id: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugModuleAndId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugModuleAndId> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugModuleAndId =
                    DebugModuleAndId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DebugModuleAndId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.moduleBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.id)
                }
            }
    }
}

public data class DebugModuleParameters(
    public var base: ULong = 0uL,
    public var size: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checksum: UInt = 0u,
    public var flags: UInt = 0u,
    public var symbolType: UInt = 0u,
    public var imageNameSize: UInt = 0u,
    public var moduleNameSize: UInt = 0u,
    public var loadedImageNameSize: UInt = 0u,
    public var symbolFileNameSize: UInt = 0u,
    public var mappedImageNameSize: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugModuleParameters) return false
        if (this.base != other.base) return false
        if (this.size != other.size) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (this.checksum != other.checksum) return false
        if (this.flags != other.flags) return false
        if (this.symbolType != other.symbolType) return false
        if (this.imageNameSize != other.imageNameSize) return false
        if (this.moduleNameSize != other.moduleNameSize) return false
        if (this.loadedImageNameSize != other.loadedImageNameSize) return false
        if (this.symbolFileNameSize != other.symbolFileNameSize) return false
        if (this.mappedImageNameSize != other.mappedImageNameSize) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.symbolType.hashCode()
        result = 31 * result + this.imageNameSize.hashCode()
        result = 31 * result + this.moduleNameSize.hashCode()
        result = 31 * result + this.loadedImageNameSize.hashCode()
        result = 31 * result + this.symbolFileNameSize.hashCode()
        result = 31 * result + this.mappedImageNameSize.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugModuleParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugModuleParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DebugModuleParameters =
                    DebugModuleParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 48L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: DebugModuleParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.symbolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.imageNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.moduleNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.loadedImageNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.symbolFileNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.mappedImageNameSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 48L, value.reserved.toList())
                }
            }
    }
}

public data class DebugOffsetRegion(
    public var base: ULong = 0uL,
    public var size: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugOffsetRegion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugOffsetRegion> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugOffsetRegion =
                    DebugOffsetRegion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DebugOffsetRegion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.size)
                }
            }
    }
}

public data class DebugPnpTriageInfo(
    public var sizeOfStruct: UInt = 0u,
    public var lockAddress: ULong = 0uL,
    public var lockActiveCount: Int = 0,
    public var lockContentionCount: UInt = 0u,
    public var lockNumberOfExclusiveWaiters: UInt = 0u,
    public var lockNumberOfSharedWaiters: UInt = 0u,
    public var lockFlag: UShort = 0u,
    public var triagedThread: ULong = 0uL,
    public var threadCount: Int = 0,
    public var triagedThreadWaitTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugPnpTriageInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugPnpTriageInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DebugPnpTriageInfo =
                    DebugPnpTriageInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DebugPnpTriageInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lockAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lockActiveCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.lockContentionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.lockNumberOfExclusiveWaiters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.lockNumberOfSharedWaiters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.lockFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.triagedThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.threadCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.triagedThreadWaitTime)
                }
            }
    }
}

public data class DebugPooltagDescription(
    public var sizeOfStruct: UInt = 0u,
    public var poolTag: UInt = 0u,
    public var description: ByteArray = ByteArray(260),
    public var binary: ByteArray = ByteArray(32),
    public var owner: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugPooltagDescription) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.poolTag != other.poolTag) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.binary.contentEquals(other.binary)) return false
        if (!this.owner.contentEquals(other.owner)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.poolTag.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.binary.contentHashCode()
        result = 31 * result + this.owner.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugPooltagDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugPooltagDescription> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 332L
                override fun readNative(addr: Long): DebugPooltagDescription =
                    DebugPooltagDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 268L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 300L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugPooltagDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.poolTag)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 8L, value.description.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 268L, value.binary.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 300L, value.owner.toList())
                }
            }
    }
}

public data class DebugPoolData(
    public var sizeofStruct: UInt = 0u,
    public var poolBlock: ULong = 0uL,
    public var pool: ULong = 0uL,
    public var previousSize: UInt = 0u,
    public var size: UInt = 0u,
    public var poolTag: UInt = 0u,
    public var processBilled: ULong = 0uL,
    public var anonymous: DebugPoolData0 = DebugPoolData0(),
    public var reserved2: ULongArray = ULongArray(4),
    public var poolTagDescription: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugPoolData) return false
        if (this.sizeofStruct != other.sizeofStruct) return false
        if (this.poolBlock != other.poolBlock) return false
        if (this.pool != other.pool) return false
        if (this.previousSize != other.previousSize) return false
        if (this.size != other.size) return false
        if (this.poolTag != other.poolTag) return false
        if (this.processBilled != other.processBilled) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.poolTagDescription.contentEquals(other.poolTagDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofStruct.hashCode()
        result = 31 * result + this.poolBlock.hashCode()
        result = 31 * result + this.pool.hashCode()
        result = 31 * result + this.previousSize.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.poolTag.hashCode()
        result = 31 * result + this.processBilled.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.poolTagDescription.contentHashCode()
        return result
    }
}

public data class DebugPoolData0(
    public var anonymous: DebugPoolData00 = DebugPoolData00(),
    public var asUlong: UInt = 0u,
)

public data class DebugPoolData00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugPoolData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugPoolData00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DebugPoolData00 =
                    DebugPoolData00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DebugPoolData00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DebugProcessorIdentificationAll(
    public var alpha: DebugProcessorIdentificationAlpha = DebugProcessorIdentificationAlpha(),
    public var amd64: DebugProcessorIdentificationAmd64 = DebugProcessorIdentificationAmd64(),
    public var ia64: DebugProcessorIdentificationIa64 = DebugProcessorIdentificationIa64(),
    public var x86: DebugProcessorIdentificationX86 = DebugProcessorIdentificationX86(),
    public var arm: DebugProcessorIdentificationArm = DebugProcessorIdentificationArm(),
    public var arm64: DebugProcessorIdentificationArm64 = DebugProcessorIdentificationArm64(),
)

public data class DebugProcessorIdentificationAlpha(
    public var type: UInt = 0u,
    public var revision: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationAlpha> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationAlpha> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DebugProcessorIdentificationAlpha =
                    DebugProcessorIdentificationAlpha(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DebugProcessorIdentificationAlpha) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.revision)
                }
            }
    }
}

public data class DebugProcessorIdentificationAmd64(
    public var family: UInt = 0u,
    public var model: UInt = 0u,
    public var stepping: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationAmd64) return false
        if (this.family != other.family) return false
        if (this.model != other.model) return false
        if (this.stepping != other.stepping) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.family.hashCode()
        result = 31 * result + this.model.hashCode()
        result = 31 * result + this.stepping.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationAmd64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationAmd64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DebugProcessorIdentificationAmd64 =
                    DebugProcessorIdentificationAmd64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugProcessorIdentificationAmd64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.family)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.model)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stepping)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 12L, value.vendorString.toList())
                }
            }
    }
}

public data class DebugProcessorIdentificationArm(
    public var model: UInt = 0u,
    public var revision: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationArm) return false
        if (this.model != other.model) return false
        if (this.revision != other.revision) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.model.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationArm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationArm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DebugProcessorIdentificationArm =
                    DebugProcessorIdentificationArm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugProcessorIdentificationArm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.model)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.revision)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 8L, value.vendorString.toList())
                }
            }
    }
}

public data class DebugProcessorIdentificationArm64(
    public var model: UInt = 0u,
    public var revision: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationArm64) return false
        if (this.model != other.model) return false
        if (this.revision != other.revision) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.model.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationArm64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationArm64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DebugProcessorIdentificationArm64 =
                    DebugProcessorIdentificationArm64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugProcessorIdentificationArm64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.model)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.revision)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 8L, value.vendorString.toList())
                }
            }
    }
}

public data class DebugProcessorIdentificationIa64(
    public var model: UInt = 0u,
    public var revision: UInt = 0u,
    public var family: UInt = 0u,
    public var archRev: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationIa64) return false
        if (this.model != other.model) return false
        if (this.revision != other.revision) return false
        if (this.family != other.family) return false
        if (this.archRev != other.archRev) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.model.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.family.hashCode()
        result = 31 * result + this.archRev.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationIa64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationIa64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugProcessorIdentificationIa64 =
                    DebugProcessorIdentificationIa64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 16L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugProcessorIdentificationIa64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.model)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.family)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.archRev)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 16L, value.vendorString.toList())
                }
            }
    }
}

public data class DebugProcessorIdentificationX86(
    public var family: UInt = 0u,
    public var model: UInt = 0u,
    public var stepping: UInt = 0u,
    public var vendorString: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugProcessorIdentificationX86) return false
        if (this.family != other.family) return false
        if (this.model != other.model) return false
        if (this.stepping != other.stepping) return false
        if (!this.vendorString.contentEquals(other.vendorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.family.hashCode()
        result = 31 * result + this.model.hashCode()
        result = 31 * result + this.stepping.hashCode()
        result = 31 * result + this.vendorString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationX86> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProcessorIdentificationX86> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DebugProcessorIdentificationX86 =
                    DebugProcessorIdentificationX86(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugProcessorIdentificationX86) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.family)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.model)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stepping)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 12L, value.vendorString.toList())
                }
            }
    }
}

public class DebugReadUserMinidumpStream internal constructor(
    public var streamType: UInt,
    public var flags: UInt,
    public var offset: ULong,
    bufferCtorArg: MutPtr,
    public var bufferSize: UInt,
    public var bufferUsed: UInt,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        streamType = 0u,
        flags = 0u,
        offset = 0uL,
        bufferCtorArg = MutPtr(0L),
        bufferSize = 0u,
        bufferUsed = 0u,
    )

    public operator fun component1(): UInt = this.streamType

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): ULong = this.offset

    public operator fun component4(): MutPtr = this.buffer

    public operator fun component5(): UInt = this.bufferSize

    public operator fun component6(): UInt = this.bufferUsed

    public fun copy(streamType: UInt = this.streamType, flags: UInt = this.flags, offset: ULong = this.offset, buffer: MutPtr = this.buffer, bufferSize: UInt = this.bufferSize, bufferUsed: UInt = this.bufferUsed): DebugReadUserMinidumpStream = DebugReadUserMinidumpStream(streamType = streamType, flags = flags, offset = offset, bufferCtorArg = buffer, bufferSize = bufferSize, bufferUsed = bufferUsed)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugReadUserMinidumpStream) return false
        if (this.streamType != other.streamType) return false
        if (this.flags != other.flags) return false
        if (this.offset != other.offset) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.bufferUsed != other.bufferUsed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.streamType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.bufferUsed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugReadUserMinidumpStream> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugReadUserMinidumpStream> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugReadUserMinidumpStream =
                    DebugReadUserMinidumpStream(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DebugReadUserMinidumpStream) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.streamType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bufferUsed)
                }
            }

        public operator fun invoke(
            streamType: UInt = 0u,
            flags: UInt = 0u,
            offset: ULong = 0uL,
            buffer: MutPtr = MutPtr(0L),
            bufferSize: UInt = 0u,
            bufferUsed: UInt = 0u,
        ): DebugReadUserMinidumpStream =
            DebugReadUserMinidumpStream(
                streamType = streamType,
                flags = flags,
                offset = offset,
                bufferCtorArg = buffer,
                bufferSize = bufferSize,
                bufferUsed = bufferUsed,
            )
    }
}

public data class DebugRegisterDescription(
    public var type: UInt = 0u,
    public var flags: UInt = 0u,
    public var subregMaster: UInt = 0u,
    public var subregLength: UInt = 0u,
    public var subregMask: ULong = 0uL,
    public var subregShift: UInt = 0u,
    public var reserved0: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugRegisterDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugRegisterDescription> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugRegisterDescription =
                    DebugRegisterDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DebugRegisterDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.subregMaster)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.subregLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.subregMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.subregShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved0)
                }
            }
    }
}

public class DebugSmbiosInfo(
    public var sizeOfStruct: UInt = 0u,
    public var smbiosMajorVersion: UByte = 0u,
    public var smbiosMinorVersion: UByte = 0u,
    public var dMIVersion: UByte = 0u,
    public var tableSize: UInt = 0u,
    public var biosMajorRelease: UByte = 0u,
    public var biosMinorRelease: UByte = 0u,
    public var firmwareMajorRelease: UByte = 0u,
    public var firmwareMinorRelease: UByte = 0u,
    public var baseBoardManufacturer: ByteArray = ByteArray(64),
    public var baseBoardProduct: ByteArray = ByteArray(64),
    public var baseBoardVersion: ByteArray = ByteArray(64),
    public var biosReleaseDate: ByteArray = ByteArray(64),
    public var biosVendor: ByteArray = ByteArray(64),
    public var biosVersion: ByteArray = ByteArray(64),
    public var systemFamily: ByteArray = ByteArray(64),
    public var systemManufacturer: ByteArray = ByteArray(64),
    public var systemProductName: ByteArray = ByteArray(64),
    public var systemSKU: ByteArray = ByteArray(64),
    public var systemVersion: ByteArray = ByteArray(64),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSmbiosInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSmbiosInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 720L
                override fun readNative(addr: Long): DebugSmbiosInfo =
                    DebugSmbiosInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 16L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 80L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 144L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 208L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 272L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 336L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 400L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 464L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 528L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 592L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 656L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DebugSmbiosInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.smbiosMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.smbiosMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.dMIVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tableSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.biosMajorRelease)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.biosMinorRelease)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.firmwareMajorRelease)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.firmwareMinorRelease)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 16L, value.baseBoardManufacturer.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 80L, value.baseBoardProduct.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 144L, value.baseBoardVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 208L, value.biosReleaseDate.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 272L, value.biosVendor.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 336L, value.biosVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 400L, value.systemFamily.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 464L, value.systemManufacturer.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 528L, value.systemProductName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 592L, value.systemSKU.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 656L, value.systemVersion.toList())
                }
            }
    }
}

public data class DebugSpecificFilterParameters(
    public var executionOption: UInt = 0u,
    public var continueOption: UInt = 0u,
    public var textSize: UInt = 0u,
    public var commandSize: UInt = 0u,
    public var argumentSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSpecificFilterParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSpecificFilterParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DebugSpecificFilterParameters =
                    DebugSpecificFilterParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DebugSpecificFilterParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.executionOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.continueOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.textSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.commandSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.argumentSize)
                }
            }
    }
}

public data class DebugStackFrame(
    public var instructionOffset: ULong = 0uL,
    public var returnOffset: ULong = 0uL,
    public var frameOffset: ULong = 0uL,
    public var stackOffset: ULong = 0uL,
    public var funcTableEntry: ULong = 0uL,
    public var params: ULongArray = ULongArray(4),
    public var reserved: ULongArray = ULongArray(6),
    public var virtual: Bool = 0,
    public var frameNumber: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugStackFrame) return false
        if (this.instructionOffset != other.instructionOffset) return false
        if (this.returnOffset != other.returnOffset) return false
        if (this.frameOffset != other.frameOffset) return false
        if (this.stackOffset != other.stackOffset) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.virtual != other.virtual) return false
        if (this.frameNumber != other.frameNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionOffset.hashCode()
        result = 31 * result + this.returnOffset.hashCode()
        result = 31 * result + this.frameOffset.hashCode()
        result = 31 * result + this.stackOffset.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.frameNumber.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugStackFrame> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugStackFrame> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): DebugStackFrame =
                    DebugStackFrame(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 40L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 72L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                    )
                override fun writeNative(addr: Long, value: DebugStackFrame) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.instructionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.returnOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.frameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.stackOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.funcTableEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 40L, value.params.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 72L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.virtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.frameNumber)
                }
            }
    }
}

public data class DebugStackFrameEx(
    public var instructionOffset: ULong = 0uL,
    public var returnOffset: ULong = 0uL,
    public var frameOffset: ULong = 0uL,
    public var stackOffset: ULong = 0uL,
    public var funcTableEntry: ULong = 0uL,
    public var params: ULongArray = ULongArray(4),
    public var reserved: ULongArray = ULongArray(6),
    public var virtual: Bool = 0,
    public var frameNumber: UInt = 0u,
    public var inlineFrameContext: UInt = 0u,
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugStackFrameEx) return false
        if (this.instructionOffset != other.instructionOffset) return false
        if (this.returnOffset != other.returnOffset) return false
        if (this.frameOffset != other.frameOffset) return false
        if (this.stackOffset != other.stackOffset) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.virtual != other.virtual) return false
        if (this.frameNumber != other.frameNumber) return false
        if (this.inlineFrameContext != other.inlineFrameContext) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionOffset.hashCode()
        result = 31 * result + this.returnOffset.hashCode()
        result = 31 * result + this.frameOffset.hashCode()
        result = 31 * result + this.stackOffset.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.frameNumber.hashCode()
        result = 31 * result + this.inlineFrameContext.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugStackFrameEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugStackFrameEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): DebugStackFrameEx =
                    DebugStackFrameEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 40L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 72L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                    )
                override fun writeNative(addr: Long, value: DebugStackFrameEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.instructionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.returnOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.frameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.stackOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.funcTableEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 40L, value.params.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 72L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.virtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.frameNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.inlineFrameContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.reserved1)
                }
            }
    }
}

public data class DebugSymbolEntry(
    public var moduleBase: ULong = 0uL,
    public var offset: ULong = 0uL,
    public var id: ULong = 0uL,
    public var arg64: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var typeId: UInt = 0u,
    public var nameSize: UInt = 0u,
    public var token: UInt = 0u,
    public var tag: UInt = 0u,
    public var arg32: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSymbolEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSymbolEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DebugSymbolEntry =
                    DebugSymbolEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: DebugSymbolEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.moduleBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.arg64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.typeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.nameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.token)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.arg32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.reserved)
                }
            }
    }
}

public data class DebugSymbolParameters(
    public var module: ULong = 0uL,
    public var typeId: UInt = 0u,
    public var parentSymbol: UInt = 0u,
    public var subElements: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSymbolParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSymbolParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DebugSymbolParameters =
                    DebugSymbolParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DebugSymbolParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.module)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.typeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.parentSymbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.subElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.reserved)
                }
            }
    }
}

public data class DebugSymbolSourceEntry(
    public var moduleBase: ULong = 0uL,
    public var offset: ULong = 0uL,
    public var fileNameId: ULong = 0uL,
    public var engineInternal: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var fileNameSize: UInt = 0u,
    public var startLine: UInt = 0u,
    public var endLine: UInt = 0u,
    public var startColumn: UInt = 0u,
    public var endColumn: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSymbolSourceEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugSymbolSourceEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DebugSymbolSourceEntry =
                    DebugSymbolSourceEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: DebugSymbolSourceEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.moduleBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fileNameId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.engineInternal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fileNameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.startLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.endLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.startColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.endColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.reserved)
                }
            }
    }
}

public data class DebugThreadBasicInformation(
    public var valid: UInt = 0u,
    public var exitStatus: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var createTime: ULong = 0uL,
    public var exitTime: ULong = 0uL,
    public var kernelTime: ULong = 0uL,
    public var userTime: ULong = 0uL,
    public var startOffset: ULong = 0uL,
    public var affinity: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugThreadBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugThreadBasicInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DebugThreadBasicInformation =
                    DebugThreadBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DebugThreadBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.valid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.exitStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.priorityClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.createTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.exitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.userTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.startOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.affinity)
                }
            }
    }
}

public class DebugTriageFollowupInfo internal constructor(
    public var sizeOfStruct: UInt,
    public var ownerNameSize: UInt,
    ownerNameCtorArg: Pstr,
) {
    public var ownerName: Pstr = ownerNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        ownerNameSize = 0u,
        ownerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.ownerNameSize

    public operator fun component3(): Pstr = this.ownerName

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, ownerNameSize: UInt = this.ownerNameSize, ownerName: Pstr = this.ownerName): DebugTriageFollowupInfo = DebugTriageFollowupInfo(sizeOfStruct = sizeOfStruct, ownerNameSize = ownerNameSize, ownerNameCtorArg = ownerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugTriageFollowupInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.ownerNameSize != other.ownerNameSize) return false
        if (this.ownerName != other.ownerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.ownerNameSize.hashCode()
        result = 31 * result + this.ownerName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            ownerNameSize: UInt = 0u,
            ownerName: Pstr = MutPtr(0L),
        ): DebugTriageFollowupInfo =
            DebugTriageFollowupInfo(
                sizeOfStruct = sizeOfStruct,
                ownerNameSize = ownerNameSize,
                ownerNameCtorArg = ownerName,
            )
    }
}

public class DebugTriageFollowupInfo2 internal constructor(
    public var sizeOfStruct: UInt,
    public var ownerNameSize: UInt,
    ownerNameCtorArg: Pstr,
    public var featurePathSize: UInt,
    featurePathCtorArg: Pstr,
) {
    public var ownerName: Pstr = ownerNameCtorArg
        internal set

    public var featurePath: Pstr = featurePathCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        ownerNameSize = 0u,
        ownerNameCtorArg = MutPtr(0L),
        featurePathSize = 0u,
        featurePathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.ownerNameSize

    public operator fun component3(): Pstr = this.ownerName

    public operator fun component4(): UInt = this.featurePathSize

    public operator fun component5(): Pstr = this.featurePath

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, ownerNameSize: UInt = this.ownerNameSize, ownerName: Pstr = this.ownerName, featurePathSize: UInt = this.featurePathSize, featurePath: Pstr = this.featurePath): DebugTriageFollowupInfo2 = DebugTriageFollowupInfo2(sizeOfStruct = sizeOfStruct, ownerNameSize = ownerNameSize, ownerNameCtorArg = ownerName, featurePathSize = featurePathSize, featurePathCtorArg = featurePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugTriageFollowupInfo2) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.ownerNameSize != other.ownerNameSize) return false
        if (this.ownerName != other.ownerName) return false
        if (this.featurePathSize != other.featurePathSize) return false
        if (this.featurePath != other.featurePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.ownerNameSize.hashCode()
        result = 31 * result + this.ownerName.hashCode()
        result = 31 * result + this.featurePathSize.hashCode()
        result = 31 * result + this.featurePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            ownerNameSize: UInt = 0u,
            ownerName: Pstr = MutPtr(0L),
            featurePathSize: UInt = 0u,
            featurePath: Pstr = MutPtr(0L),
        ): DebugTriageFollowupInfo2 =
            DebugTriageFollowupInfo2(
                sizeOfStruct = sizeOfStruct,
                ownerNameSize = ownerNameSize,
                ownerNameCtorArg = ownerName,
                featurePathSize = featurePathSize,
                featurePathCtorArg = featurePath,
            )
    }
}

public data class DebugTypedData(
    public var modBase: ULong = 0uL,
    public var offset: ULong = 0uL,
    public var engineHandle: ULong = 0uL,
    public var data: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var typeId: UInt = 0u,
    public var baseTypeId: UInt = 0u,
    public var tag: UInt = 0u,
    public var register: UInt = 0u,
    public var internal: ULongArray = ULongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugTypedData) return false
        if (this.modBase != other.modBase) return false
        if (this.offset != other.offset) return false
        if (this.engineHandle != other.engineHandle) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.typeId != other.typeId) return false
        if (this.baseTypeId != other.baseTypeId) return false
        if (this.tag != other.tag) return false
        if (this.register != other.register) return false
        if (!this.internal.contentEquals(other.internal)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modBase.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.engineHandle.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.typeId.hashCode()
        result = 31 * result + this.baseTypeId.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.internal.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugTypedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugTypedData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): DebugTypedData =
                    DebugTypedData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (9).toInt())
                        ).readNative(addr + 56L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: DebugTypedData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.modBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.engineHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.typeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.baseTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.register)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (9).toInt())
                    ).writeNative(addr + 56L, value.internal.toList())
                }
            }
    }
}

public data class DebugValue(
    public var anonymous: DebugValue0 = DebugValue0(),
    public var tailOfRawBytes: UInt = 0u,
    public var type: UInt = 0u,
)

public class DebugValue0(
    public var i8: UByte = 0u,
    public var i16: UShort = 0u,
    public var i32: UInt = 0u,
    public var anonymous: DebugValue00 = DebugValue00(),
    public var f32: Float = 0.0f,
    public var f64: Double = 0.0,
    public var f80Bytes: UByteArray = UByteArray(10),
    public var f82Bytes: UByteArray = UByteArray(11),
    public var f128Bytes: UByteArray = UByteArray(16),
    public var vi8: UByteArray = UByteArray(16),
    public var vi16: UShortArray = UShortArray(8),
    public var vi32: UIntArray = UIntArray(4),
    public var vi64: ULongArray = ULongArray(2),
    public var vf32: FloatArray = FloatArray(4),
    public var vf64: DoubleArray = DoubleArray(2),
    public var i64Parts32: DebugValue01 = DebugValue01(),
    public var f128Parts64: DebugValue02 = DebugValue02(),
    public var rawBytes: UByteArray = UByteArray(24),
)

public data class DebugValue00(
    public var i64: ULong = 0uL,
    public var nat: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugValue00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugValue00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugValue00 =
                    DebugValue00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DebugValue00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.i64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.nat)
                }
            }
    }
}

public data class DebugValue02(
    public var lowPart: ULong = 0uL,
    public var highPart: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugValue02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugValue02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DebugValue02 =
                    DebugValue02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DebugValue02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.highPart)
                }
            }
    }
}

public data class DebugValue01(
    public var lowPart: UInt = 0u,
    public var highPart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugValue01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugValue01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DebugValue01 =
                    DebugValue01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DebugValue01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.highPart)
                }
            }
    }
}

public data class Extstacktrace(
    public var framePointer: UInt = 0u,
    public var programCounter: UInt = 0u,
    public var returnAddress: UInt = 0u,
    public var args: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extstacktrace) return false
        if (this.framePointer != other.framePointer) return false
        if (this.programCounter != other.programCounter) return false
        if (this.returnAddress != other.returnAddress) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.framePointer.hashCode()
        result = 31 * result + this.programCounter.hashCode()
        result = 31 * result + this.returnAddress.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extstacktrace> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extstacktrace> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Extstacktrace =
                    Extstacktrace(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Extstacktrace) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.framePointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.programCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.returnAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 12L, value.args.toList())
                }
            }
    }
}

public data class Extstacktrace32(
    public var framePointer: UInt = 0u,
    public var programCounter: UInt = 0u,
    public var returnAddress: UInt = 0u,
    public var args: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extstacktrace32) return false
        if (this.framePointer != other.framePointer) return false
        if (this.programCounter != other.programCounter) return false
        if (this.returnAddress != other.returnAddress) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.framePointer.hashCode()
        result = 31 * result + this.programCounter.hashCode()
        result = 31 * result + this.returnAddress.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extstacktrace32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extstacktrace32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Extstacktrace32 =
                    Extstacktrace32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Extstacktrace32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.framePointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.programCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.returnAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 12L, value.args.toList())
                }
            }
    }
}

public data class Extstacktrace64(
    public var framePointer: ULong = 0uL,
    public var programCounter: ULong = 0uL,
    public var returnAddress: ULong = 0uL,
    public var args: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extstacktrace64) return false
        if (this.framePointer != other.framePointer) return false
        if (this.programCounter != other.programCounter) return false
        if (this.returnAddress != other.returnAddress) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.framePointer.hashCode()
        result = 31 * result + this.programCounter.hashCode()
        result = 31 * result + this.returnAddress.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extstacktrace64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extstacktrace64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Extstacktrace64 =
                    Extstacktrace64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 24L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: Extstacktrace64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.framePointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.programCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.returnAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 24L, value.args.toList())
                }
            }
    }
}

public data class ExtApiVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var revision: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtApiVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtApiVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ExtApiVersion =
                    ExtApiVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ExtApiVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public class ExtCabXmlData internal constructor(
    public var sizeOfStruct: UInt,
    xmlObjectTagCtorArg: Pcwstr,
    public var numSubTags: UInt,
    public var subTags: List<ExtCabXmlData0>,
) {
    public var xmlObjectTag: Pcwstr = xmlObjectTagCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        xmlObjectTagCtorArg = ConstPtr(0L),
        numSubTags = 0u,
        subTags = List(1) { ExtCabXmlData0() },
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): Pcwstr = this.xmlObjectTag

    public operator fun component3(): UInt = this.numSubTags

    public operator fun component4(): List<ExtCabXmlData0> = this.subTags

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, xmlObjectTag: Pcwstr = this.xmlObjectTag, numSubTags: UInt = this.numSubTags, subTags: List<ExtCabXmlData0> = this.subTags): ExtCabXmlData = ExtCabXmlData(sizeOfStruct = sizeOfStruct, xmlObjectTagCtorArg = xmlObjectTag, numSubTags = numSubTags, subTags = subTags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtCabXmlData) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.xmlObjectTag != other.xmlObjectTag) return false
        if (this.numSubTags != other.numSubTags) return false
        if (this.subTags != other.subTags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.xmlObjectTag.hashCode()
        result = 31 * result + this.numSubTags.hashCode()
        result = 31 * result + this.subTags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            xmlObjectTag: Pcwstr = ConstPtr(0L),
            numSubTags: UInt = 0u,
            subTags: List<ExtCabXmlData0> = List(1) { ExtCabXmlData0() },
        ): ExtCabXmlData =
            ExtCabXmlData(
                sizeOfStruct = sizeOfStruct,
                xmlObjectTagCtorArg = xmlObjectTag,
                numSubTags = numSubTags,
                subTags = subTags,
            )
    }
}

public class ExtCabXmlData0 internal constructor(
    subTagCtorArg: Pcwstr,
    matchPatternCtorArg: Pcwstr,
    returnTextCtorArg: Pwstr,
    public var returnTextSize: UInt,
    public var bitfield: UInt,
    public var reserved2: UInt,
) {
    public var subTag: Pcwstr = subTagCtorArg
        internal set

    public var matchPattern: Pcwstr = matchPatternCtorArg
        internal set

    public var returnText: Pwstr = returnTextCtorArg
        internal set

    public constructor() : this(
        subTagCtorArg = ConstPtr(0L),
        matchPatternCtorArg = ConstPtr(0L),
        returnTextCtorArg = MutPtr(0L),
        returnTextSize = 0u,
        bitfield = 0u,
        reserved2 = 0u,
    )

    public operator fun component1(): Pcwstr = this.subTag

    public operator fun component2(): Pcwstr = this.matchPattern

    public operator fun component3(): Pwstr = this.returnText

    public operator fun component4(): UInt = this.returnTextSize

    public operator fun component5(): UInt = this.bitfield

    public operator fun component6(): UInt = this.reserved2

    public fun copy(subTag: Pcwstr = this.subTag, matchPattern: Pcwstr = this.matchPattern, returnText: Pwstr = this.returnText, returnTextSize: UInt = this.returnTextSize, bitfield: UInt = this.bitfield, reserved2: UInt = this.reserved2): ExtCabXmlData0 = ExtCabXmlData0(subTagCtorArg = subTag, matchPatternCtorArg = matchPattern, returnTextCtorArg = returnText, returnTextSize = returnTextSize, bitfield = bitfield, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtCabXmlData0) return false
        if (this.subTag != other.subTag) return false
        if (this.matchPattern != other.matchPattern) return false
        if (this.returnText != other.returnText) return false
        if (this.returnTextSize != other.returnTextSize) return false
        if (this.bitfield != other.bitfield) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subTag.hashCode()
        result = 31 * result + this.matchPattern.hashCode()
        result = 31 * result + this.returnText.hashCode()
        result = 31 * result + this.returnTextSize.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subTag: Pcwstr = ConstPtr(0L),
            matchPattern: Pcwstr = ConstPtr(0L),
            returnText: Pwstr = MutPtr(0L),
            returnTextSize: UInt = 0u,
            bitfield: UInt = 0u,
            reserved2: UInt = 0u,
        ): ExtCabXmlData0 =
            ExtCabXmlData0(
                subTagCtorArg = subTag,
                matchPatternCtorArg = matchPattern,
                returnTextCtorArg = returnText,
                returnTextSize = returnTextSize,
                bitfield = bitfield,
                reserved2 = reserved2,
            )
    }
}

public class ExtFindFile internal constructor(
    fileNameCtorArg: Pcwstr,
    public var indexedSize: ULong,
    public var imageTimeDateStamp: UInt,
    public var imageCheckSum: UInt,
    extraInfoCtorArg: MutPtr,
    public var extraInfoSize: UInt,
    public var flags: UInt,
    fileMappingCtorArg: MutPtr,
    public var fileMappingSize: ULong,
    fileHandleCtorArg: Handle,
    foundFileNameCtorArg: Pwstr,
    public var foundFileNameChars: UInt,
) {
    public var fileName: Pcwstr = fileNameCtorArg
        internal set

    public var extraInfo: MutPtr = extraInfoCtorArg
        internal set

    public var fileMapping: MutPtr = fileMappingCtorArg
        internal set

    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public var foundFileName: Pwstr = foundFileNameCtorArg
        internal set

    public constructor() : this(
        fileNameCtorArg = ConstPtr(0L),
        indexedSize = 0uL,
        imageTimeDateStamp = 0u,
        imageCheckSum = 0u,
        extraInfoCtorArg = MutPtr(0L),
        extraInfoSize = 0u,
        flags = 0u,
        fileMappingCtorArg = MutPtr(0L),
        fileMappingSize = 0uL,
        fileHandleCtorArg = MutPtr(0L),
        foundFileNameCtorArg = MutPtr(0L),
        foundFileNameChars = 0u,
    )

    public operator fun component1(): Pcwstr = this.fileName

    public operator fun component2(): ULong = this.indexedSize

    public operator fun component3(): UInt = this.imageTimeDateStamp

    public operator fun component4(): UInt = this.imageCheckSum

    public operator fun component5(): MutPtr = this.extraInfo

    public operator fun component6(): UInt = this.extraInfoSize

    public operator fun component7(): UInt = this.flags

    public operator fun component8(): MutPtr = this.fileMapping

    public operator fun component9(): ULong = this.fileMappingSize

    public operator fun component10(): Handle = this.fileHandle

    public operator fun component11(): Pwstr = this.foundFileName

    public operator fun component12(): UInt = this.foundFileNameChars

    public fun copy(fileName: Pcwstr = this.fileName, indexedSize: ULong = this.indexedSize, imageTimeDateStamp: UInt = this.imageTimeDateStamp, imageCheckSum: UInt = this.imageCheckSum, extraInfo: MutPtr = this.extraInfo, extraInfoSize: UInt = this.extraInfoSize, flags: UInt = this.flags, fileMapping: MutPtr = this.fileMapping, fileMappingSize: ULong = this.fileMappingSize, fileHandle: Handle = this.fileHandle, foundFileName: Pwstr = this.foundFileName, foundFileNameChars: UInt = this.foundFileNameChars): ExtFindFile = ExtFindFile(fileNameCtorArg = fileName, indexedSize = indexedSize, imageTimeDateStamp = imageTimeDateStamp, imageCheckSum = imageCheckSum, extraInfoCtorArg = extraInfo, extraInfoSize = extraInfoSize, flags = flags, fileMappingCtorArg = fileMapping, fileMappingSize = fileMappingSize, fileHandleCtorArg = fileHandle, foundFileNameCtorArg = foundFileName, foundFileNameChars = foundFileNameChars)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtFindFile) return false
        if (this.fileName != other.fileName) return false
        if (this.indexedSize != other.indexedSize) return false
        if (this.imageTimeDateStamp != other.imageTimeDateStamp) return false
        if (this.imageCheckSum != other.imageCheckSum) return false
        if (this.extraInfo != other.extraInfo) return false
        if (this.extraInfoSize != other.extraInfoSize) return false
        if (this.flags != other.flags) return false
        if (this.fileMapping != other.fileMapping) return false
        if (this.fileMappingSize != other.fileMappingSize) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.foundFileName != other.foundFileName) return false
        if (this.foundFileNameChars != other.foundFileNameChars) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileName.hashCode()
        result = 31 * result + this.indexedSize.hashCode()
        result = 31 * result + this.imageTimeDateStamp.hashCode()
        result = 31 * result + this.imageCheckSum.hashCode()
        result = 31 * result + this.extraInfo.hashCode()
        result = 31 * result + this.extraInfoSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fileMapping.hashCode()
        result = 31 * result + this.fileMappingSize.hashCode()
        result = 31 * result + this.fileHandle.hashCode()
        result = 31 * result + this.foundFileName.hashCode()
        result = 31 * result + this.foundFileNameChars.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fileName: Pcwstr = ConstPtr(0L),
            indexedSize: ULong = 0uL,
            imageTimeDateStamp: UInt = 0u,
            imageCheckSum: UInt = 0u,
            extraInfo: MutPtr = MutPtr(0L),
            extraInfoSize: UInt = 0u,
            flags: UInt = 0u,
            fileMapping: MutPtr = MutPtr(0L),
            fileMappingSize: ULong = 0uL,
            fileHandle: Handle = MutPtr(0L),
            foundFileName: Pwstr = MutPtr(0L),
            foundFileNameChars: UInt = 0u,
        ): ExtFindFile =
            ExtFindFile(
                fileNameCtorArg = fileName,
                indexedSize = indexedSize,
                imageTimeDateStamp = imageTimeDateStamp,
                imageCheckSum = imageCheckSum,
                extraInfoCtorArg = extraInfo,
                extraInfoSize = extraInfoSize,
                flags = flags,
                fileMappingCtorArg = fileMapping,
                fileMappingSize = fileMappingSize,
                fileHandleCtorArg = fileHandle,
                foundFileNameCtorArg = foundFileName,
                foundFileNameChars = foundFileNameChars,
            )
    }
}

public class ExtMatchPatternA internal constructor(
    strCtorArg: Pcstr,
    patternCtorArg: Pcstr,
    public var caseSensitive: UInt,
) {
    public var str: Pcstr = strCtorArg
        internal set

    public var pattern: Pcstr = patternCtorArg
        internal set

    public constructor() : this(
        strCtorArg = ConstPtr(0L),
        patternCtorArg = ConstPtr(0L),
        caseSensitive = 0u,
    )

    public operator fun component1(): Pcstr = this.str

    public operator fun component2(): Pcstr = this.pattern

    public operator fun component3(): UInt = this.caseSensitive

    public fun copy(str: Pcstr = this.str, pattern: Pcstr = this.pattern, caseSensitive: UInt = this.caseSensitive): ExtMatchPatternA = ExtMatchPatternA(strCtorArg = str, patternCtorArg = pattern, caseSensitive = caseSensitive)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtMatchPatternA) return false
        if (this.str != other.str) return false
        if (this.pattern != other.pattern) return false
        if (this.caseSensitive != other.caseSensitive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.str.hashCode()
        result = 31 * result + this.pattern.hashCode()
        result = 31 * result + this.caseSensitive.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            str: Pcstr = ConstPtr(0L),
            pattern: Pcstr = ConstPtr(0L),
            caseSensitive: UInt = 0u,
        ): ExtMatchPatternA =
            ExtMatchPatternA(
                strCtorArg = str,
                patternCtorArg = pattern,
                caseSensitive = caseSensitive,
            )
    }
}

public class ExtTypedData(
    public var operation: ExtTdop = 0,
    public var flags: UInt = 0u,
    public var inData: DebugTypedData = DebugTypedData(),
    public var outData: DebugTypedData = DebugTypedData(),
    public var inStrIndex: UInt = 0u,
    public var in32: UInt = 0u,
    public var out32: UInt = 0u,
    public var in64: ULong = 0uL,
    public var out64: ULong = 0uL,
    public var strBufferIndex: UInt = 0u,
    public var strBufferChars: UInt = 0u,
    public var strCharsNeeded: UInt = 0u,
    public var dataBufferIndex: UInt = 0u,
    public var dataBufferBytes: UInt = 0u,
    public var dataBytesNeeded: UInt = 0u,
    public var status: Hresult = 0,
    public var reserved: ULongArray = ULongArray(8),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtTypedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtTypedData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 392L
                override fun readNative(addr: Long): ExtTypedData =
                    ExtTypedData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (DebugTypedData.typeLayout()).readNative(addr + 8L),
                        (DebugTypedData.typeLayout()).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 300L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 304L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 308L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 312L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 316L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 320L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 328L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: ExtTypedData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (DebugTypedData.typeLayout()).writeNative(addr + 8L, value.inData)
                    (DebugTypedData.typeLayout()).writeNative(addr + 136L, value.outData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.inStrIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.in32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.out32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 280L, value.in64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 288L, value.out64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 296L, value.strBufferIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 300L, value.strBufferChars)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 304L, value.strCharsNeeded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 308L, value.dataBufferIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 312L, value.dataBufferBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 316L, value.dataBytesNeeded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 320L, value.status)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 328L, value.reserved.toList())
                }
            }
    }
}

public data class FaEntry(
    public var tag: DebugFlrParamType = 0,
    public var fullSize: UShort = 0u,
    public var dataSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FaEntry =
                    FaEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: FaEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.fullSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.dataSize)
                }
            }
    }
}

public class FieldInfo internal constructor(
    fNameCtorArg: MutPtr,
    printNameCtorArg: MutPtr,
    public var size: UInt,
    public var fOptions: UInt,
    public var address: ULong,
    public var anonymous: FieldInfo0,
    public var typeId: UInt,
    public var fieldOffset: UInt,
    public var bufferSize: UInt,
    public var bitField: FieldInfo1,
    public var bitfield: UInt,
) {
    public var fName: MutPtr = fNameCtorArg
        internal set

    public var printName: MutPtr = printNameCtorArg
        internal set

    public constructor() : this(
        fNameCtorArg = MutPtr(0L),
        printNameCtorArg = MutPtr(0L),
        size = 0u,
        fOptions = 0u,
        address = 0uL,
        anonymous = FieldInfo0(),
        typeId = 0u,
        fieldOffset = 0u,
        bufferSize = 0u,
        bitField = FieldInfo1(),
        bitfield = 0u,
    )

    public operator fun component1(): MutPtr = this.fName

    public operator fun component2(): MutPtr = this.printName

    public operator fun component3(): UInt = this.size

    public operator fun component4(): UInt = this.fOptions

    public operator fun component5(): ULong = this.address

    public operator fun component6(): FieldInfo0 = this.anonymous

    public operator fun component7(): UInt = this.typeId

    public operator fun component8(): UInt = this.fieldOffset

    public operator fun component9(): UInt = this.bufferSize

    public operator fun component10(): FieldInfo1 = this.bitField

    public operator fun component11(): UInt = this.bitfield

    public fun copy(fName: MutPtr = this.fName, printName: MutPtr = this.printName, size: UInt = this.size, fOptions: UInt = this.fOptions, address: ULong = this.address, anonymous: FieldInfo0 = this.anonymous, typeId: UInt = this.typeId, fieldOffset: UInt = this.fieldOffset, bufferSize: UInt = this.bufferSize, bitField: FieldInfo1 = this.bitField, bitfield: UInt = this.bitfield): FieldInfo = FieldInfo(fNameCtorArg = fName, printNameCtorArg = printName, size = size, fOptions = fOptions, address = address, anonymous = anonymous, typeId = typeId, fieldOffset = fieldOffset, bufferSize = bufferSize, bitField = bitField, bitfield = bitfield)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FieldInfo) return false
        if (this.fName != other.fName) return false
        if (this.printName != other.printName) return false
        if (this.size != other.size) return false
        if (this.fOptions != other.fOptions) return false
        if (this.address != other.address) return false
        if (this.anonymous != other.anonymous) return false
        if (this.typeId != other.typeId) return false
        if (this.fieldOffset != other.fieldOffset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.bitField != other.bitField) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fName.hashCode()
        result = 31 * result + this.printName.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.fOptions.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.typeId.hashCode()
        result = 31 * result + this.fieldOffset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.bitField.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fName: MutPtr = MutPtr(0L),
            printName: MutPtr = MutPtr(0L),
            size: UInt = 0u,
            fOptions: UInt = 0u,
            address: ULong = 0uL,
            anonymous: FieldInfo0 = FieldInfo0(),
            typeId: UInt = 0u,
            fieldOffset: UInt = 0u,
            bufferSize: UInt = 0u,
            bitField: FieldInfo1 = FieldInfo1(),
            bitfield: UInt = 0u,
        ): FieldInfo =
            FieldInfo(
                fNameCtorArg = fName,
                printNameCtorArg = printName,
                size = size,
                fOptions = fOptions,
                address = address,
                anonymous = anonymous,
                typeId = typeId,
                fieldOffset = fieldOffset,
                bufferSize = bufferSize,
                bitField = bitField,
                bitfield = bitfield,
            )
    }
}

public class FieldInfo0 internal constructor(
    fieldCallBackCtorArg: MutPtr,
    pBufferCtorArg: MutPtr,
) {
    public var fieldCallBack: MutPtr = fieldCallBackCtorArg
        internal set

    public var pBuffer: MutPtr = pBufferCtorArg
        internal set

    public constructor() : this(
        fieldCallBackCtorArg = MutPtr(0L),
        pBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.fieldCallBack

    public operator fun component2(): MutPtr = this.pBuffer

    public fun copy(fieldCallBack: MutPtr = this.fieldCallBack, pBuffer: MutPtr = this.pBuffer): FieldInfo0 = FieldInfo0(fieldCallBackCtorArg = fieldCallBack, pBufferCtorArg = pBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FieldInfo0) return false
        if (this.fieldCallBack != other.fieldCallBack) return false
        if (this.pBuffer != other.pBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fieldCallBack.hashCode()
        result = 31 * result + this.pBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fieldCallBack: MutPtr = MutPtr(0L),
            pBuffer: MutPtr = MutPtr(0L),
        ): FieldInfo0 =
            FieldInfo0(
                fieldCallBackCtorArg = fieldCallBack,
                pBufferCtorArg = pBuffer,
            )
    }
}

public data class FieldInfo1(
    public var position: UShort = 0u,
    public var size: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FieldInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FieldInfo1> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FieldInfo1 =
                    FieldInfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FieldInfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.position)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                }
            }
    }
}

public class GetContextEx internal constructor(
    public var status: UInt,
    public var contextSize: UInt,
    pContextCtorArg: MutPtr,
) {
    public var pContext: MutPtr = pContextCtorArg
        internal set

    public constructor() : this(
        status = 0u,
        contextSize = 0u,
        pContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.status

    public operator fun component2(): UInt = this.contextSize

    public operator fun component3(): MutPtr = this.pContext

    public fun copy(status: UInt = this.status, contextSize: UInt = this.contextSize, pContext: MutPtr = this.pContext): GetContextEx = GetContextEx(status = status, contextSize = contextSize, pContextCtorArg = pContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetContextEx) return false
        if (this.status != other.status) return false
        if (this.contextSize != other.contextSize) return false
        if (this.pContext != other.pContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.contextSize.hashCode()
        result = 31 * result + this.pContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetContextEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetContextEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GetContextEx =
                    GetContextEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GetContextEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.contextSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pContext)
                }
            }

        public operator fun invoke(
            status: UInt = 0u,
            contextSize: UInt = 0u,
            pContext: MutPtr = MutPtr(0L),
        ): GetContextEx =
            GetContextEx(
                status = status,
                contextSize = contextSize,
                pContextCtorArg = pContext,
            )
    }
}

public data class GetCurrentProcessAddress(
    public var processor: UInt = 0u,
    public var currentThread: ULong = 0uL,
    public var address: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetCurrentProcessAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetCurrentProcessAddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): GetCurrentProcessAddress =
                    GetCurrentProcessAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: GetCurrentProcessAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.currentThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.address)
                }
            }
    }
}

public data class GetCurrentThreadAddress(
    public var processor: UInt = 0u,
    public var address: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetCurrentThreadAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetCurrentThreadAddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GetCurrentThreadAddress =
                    GetCurrentThreadAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GetCurrentThreadAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                }
            }
    }
}

public class GetExpressionEx internal constructor(
    expressionCtorArg: Pcstr,
    remainderCtorArg: Pcstr,
    public var value: ULong,
) {
    public var expression: Pcstr = expressionCtorArg
        internal set

    public var remainder: Pcstr = remainderCtorArg
        internal set

    public constructor() : this(
        expressionCtorArg = ConstPtr(0L),
        remainderCtorArg = ConstPtr(0L),
        value = 0uL,
    )

    public operator fun component1(): Pcstr = this.expression

    public operator fun component2(): Pcstr = this.remainder

    public operator fun component3(): ULong = this.value

    public fun copy(expression: Pcstr = this.expression, remainder: Pcstr = this.remainder, value: ULong = this.value): GetExpressionEx = GetExpressionEx(expressionCtorArg = expression, remainderCtorArg = remainder, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetExpressionEx) return false
        if (this.expression != other.expression) return false
        if (this.remainder != other.remainder) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.expression.hashCode()
        result = 31 * result + this.remainder.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            expression: Pcstr = ConstPtr(0L),
            remainder: Pcstr = ConstPtr(0L),
            value: ULong = 0uL,
        ): GetExpressionEx =
            GetExpressionEx(
                expressionCtorArg = expression,
                remainderCtorArg = remainder,
                value = value,
            )
    }
}

public class GetInputLine internal constructor(
    promptCtorArg: Pcstr,
    bufferCtorArg: Pstr,
    public var bufferSize: UInt,
    public var inputSize: UInt,
) {
    public var prompt: Pcstr = promptCtorArg
        internal set

    public var buffer: Pstr = bufferCtorArg
        internal set

    public constructor() : this(
        promptCtorArg = ConstPtr(0L),
        bufferCtorArg = MutPtr(0L),
        bufferSize = 0u,
        inputSize = 0u,
    )

    public operator fun component1(): Pcstr = this.prompt

    public operator fun component2(): Pstr = this.buffer

    public operator fun component3(): UInt = this.bufferSize

    public operator fun component4(): UInt = this.inputSize

    public fun copy(prompt: Pcstr = this.prompt, buffer: Pstr = this.buffer, bufferSize: UInt = this.bufferSize, inputSize: UInt = this.inputSize): GetInputLine = GetInputLine(promptCtorArg = prompt, bufferCtorArg = buffer, bufferSize = bufferSize, inputSize = inputSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetInputLine) return false
        if (this.prompt != other.prompt) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.inputSize != other.inputSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prompt.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.inputSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            prompt: Pcstr = ConstPtr(0L),
            buffer: Pstr = MutPtr(0L),
            bufferSize: UInt = 0u,
            inputSize: UInt = 0u,
        ): GetInputLine =
            GetInputLine(
                promptCtorArg = prompt,
                bufferCtorArg = buffer,
                bufferSize = bufferSize,
                inputSize = inputSize,
            )
    }
}

public data class GetPebAddress(
    public var currentThread: ULong = 0uL,
    public var address: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetPebAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetPebAddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GetPebAddress =
                    GetPebAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GetPebAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.currentThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                }
            }
    }
}

public class GetSetSympath internal constructor(
    argsCtorArg: Pcstr,
    resultCtorArg: Pstr,
    public var length: Int,
) {
    public var args: Pcstr = argsCtorArg
        internal set

    public var result: Pstr = resultCtorArg
        internal set

    public constructor() : this(
        argsCtorArg = ConstPtr(0L),
        resultCtorArg = MutPtr(0L),
        length = 0,
    )

    public operator fun component1(): Pcstr = this.args

    public operator fun component2(): Pstr = this.result

    public operator fun component3(): Int = this.length

    public fun copy(args: Pcstr = this.args, result: Pstr = this.result, length: Int = this.length): GetSetSympath = GetSetSympath(argsCtorArg = args, resultCtorArg = result, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetSetSympath) return false
        if (this.args != other.args) return false
        if (this.result != other.result) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.args.hashCode()
        result = 31 * result + this.result.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            args: Pcstr = ConstPtr(0L),
            result: Pstr = MutPtr(0L),
            length: Int = 0,
        ): GetSetSympath =
            GetSetSympath(
                argsCtorArg = args,
                resultCtorArg = result,
                length = length,
            )
    }
}

public data class GetTebAddress(
    public var address: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetTebAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetTebAddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GetTebAddress =
                    GetTebAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GetTebAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.address)
                }
            }
    }
}

public data class InlineFrameContext(
    public var contextValue: UInt = 0u,
    public var anonymous: InlineFrameContext0 = InlineFrameContext0(),
)

public data class InlineFrameContext0(
    public var frameId: UByte = 0u,
    public var frameType: UByte = 0u,
    public var frameSignature: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InlineFrameContext0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InlineFrameContext0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): InlineFrameContext0 =
                    InlineFrameContext0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: InlineFrameContext0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.frameId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.frameType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.frameSignature)
                }
            }
    }
}

public data class Iospace(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iospace> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iospace> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Iospace =
                    Iospace(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Iospace) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class Iospace32(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iospace32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iospace32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Iospace32 =
                    Iospace32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Iospace32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class Iospace64(
    public var address: ULong = 0uL,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iospace64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iospace64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Iospace64 =
                    Iospace64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Iospace64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.data)
                }
            }
    }
}

public data class IospaceEx(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
    public var interfaceType: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var addressSpace: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IospaceEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IospaceEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IospaceEx =
                    IospaceEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: IospaceEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.interfaceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.addressSpace)
                }
            }
    }
}

public data class IospaceEx32(
    public var address: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
    public var interfaceType: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var addressSpace: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IospaceEx32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IospaceEx32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IospaceEx32 =
                    IospaceEx32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: IospaceEx32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.interfaceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.addressSpace)
                }
            }
    }
}

public data class IospaceEx64(
    public var address: ULong = 0uL,
    public var length: UInt = 0u,
    public var data: UInt = 0u,
    public var interfaceType: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var addressSpace: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IospaceEx64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IospaceEx64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): IospaceEx64 =
                    IospaceEx64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IospaceEx64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.interfaceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.addressSpace)
                }
            }
    }
}

public class KddebuggerData32 {
    public var header: DbgkdDebugDataHeader32 = DbgkdDebugDataHeader32()

    public var kernBase: UInt = 0u

    public var breakpointWithStatus: UInt = 0u

    public var savedContext: UInt = 0u

    public var thCallbackStack: UShort = 0u

    public var nextCallback: UShort = 0u

    public var framePointer: UShort = 0u

    public var bitfield: UShort = 0u

    public var kiCallUserMode: UInt = 0u

    public var keUserCallbackDispatcher: UInt = 0u

    public var psLoadedModuleList: UInt = 0u

    public var psActiveProcessHead: UInt = 0u

    public var pspCidTable: UInt = 0u

    public var expSystemResourcesList: UInt = 0u

    public var expPagedPoolDescriptor: UInt = 0u

    public var expNumberOfPagedPools: UInt = 0u

    public var keTimeIncrement: UInt = 0u

    public var keBugCheckCallbackListHead: UInt = 0u

    public var kiBugcheckData: UInt = 0u

    public var iopErrorLogListHead: UInt = 0u

    public var obpRootDirectoryObject: UInt = 0u

    public var obpTypeObjectType: UInt = 0u

    public var mmSystemCacheStart: UInt = 0u

    public var mmSystemCacheEnd: UInt = 0u

    public var mmSystemCacheWs: UInt = 0u

    public var mmPfnDatabase: UInt = 0u

    public var mmSystemPtesStart: UInt = 0u

    public var mmSystemPtesEnd: UInt = 0u

    public var mmSubsectionBase: UInt = 0u

    public var mmNumberOfPagingFiles: UInt = 0u

    public var mmLowestPhysicalPage: UInt = 0u

    public var mmHighestPhysicalPage: UInt = 0u

    public var mmNumberOfPhysicalPages: UInt = 0u

    public var mmMaximumNonPagedPoolInBytes: UInt = 0u

    public var mmNonPagedSystemStart: UInt = 0u

    public var mmNonPagedPoolStart: UInt = 0u

    public var mmNonPagedPoolEnd: UInt = 0u

    public var mmPagedPoolStart: UInt = 0u

    public var mmPagedPoolEnd: UInt = 0u

    public var mmPagedPoolInformation: UInt = 0u

    public var mmPageSize: UInt = 0u

    public var mmSizeOfPagedPoolInBytes: UInt = 0u

    public var mmTotalCommitLimit: UInt = 0u

    public var mmTotalCommittedPages: UInt = 0u

    public var mmSharedCommit: UInt = 0u

    public var mmDriverCommit: UInt = 0u

    public var mmProcessCommit: UInt = 0u

    public var mmPagedPoolCommit: UInt = 0u

    public var mmExtendedCommit: UInt = 0u

    public var mmZeroedPageListHead: UInt = 0u

    public var mmFreePageListHead: UInt = 0u

    public var mmStandbyPageListHead: UInt = 0u

    public var mmModifiedPageListHead: UInt = 0u

    public var mmModifiedNoWritePageListHead: UInt = 0u

    public var mmAvailablePages: UInt = 0u

    public var mmResidentAvailablePages: UInt = 0u

    public var poolTrackTable: UInt = 0u

    public var nonPagedPoolDescriptor: UInt = 0u

    public var mmHighestUserAddress: UInt = 0u

    public var mmSystemRangeStart: UInt = 0u

    public var mmUserProbeAddress: UInt = 0u

    public var kdPrintCircularBuffer: UInt = 0u

    public var kdPrintCircularBufferEnd: UInt = 0u

    public var kdPrintWritePointer: UInt = 0u

    public var kdPrintRolloverCount: UInt = 0u

    public var mmLoadedUserImageList: UInt = 0u
}

public class KddebuggerData64 {
    public var header: DbgkdDebugDataHeader64 = DbgkdDebugDataHeader64()

    public var kernBase: ULong = 0uL

    public var breakpointWithStatus: ULong = 0uL

    public var savedContext: ULong = 0uL

    public var thCallbackStack: UShort = 0u

    public var nextCallback: UShort = 0u

    public var framePointer: UShort = 0u

    public var bitfield: UShort = 0u

    public var kiCallUserMode: ULong = 0uL

    public var keUserCallbackDispatcher: ULong = 0uL

    public var psLoadedModuleList: ULong = 0uL

    public var psActiveProcessHead: ULong = 0uL

    public var pspCidTable: ULong = 0uL

    public var expSystemResourcesList: ULong = 0uL

    public var expPagedPoolDescriptor: ULong = 0uL

    public var expNumberOfPagedPools: ULong = 0uL

    public var keTimeIncrement: ULong = 0uL

    public var keBugCheckCallbackListHead: ULong = 0uL

    public var kiBugcheckData: ULong = 0uL

    public var iopErrorLogListHead: ULong = 0uL

    public var obpRootDirectoryObject: ULong = 0uL

    public var obpTypeObjectType: ULong = 0uL

    public var mmSystemCacheStart: ULong = 0uL

    public var mmSystemCacheEnd: ULong = 0uL

    public var mmSystemCacheWs: ULong = 0uL

    public var mmPfnDatabase: ULong = 0uL

    public var mmSystemPtesStart: ULong = 0uL

    public var mmSystemPtesEnd: ULong = 0uL

    public var mmSubsectionBase: ULong = 0uL

    public var mmNumberOfPagingFiles: ULong = 0uL

    public var mmLowestPhysicalPage: ULong = 0uL

    public var mmHighestPhysicalPage: ULong = 0uL

    public var mmNumberOfPhysicalPages: ULong = 0uL

    public var mmMaximumNonPagedPoolInBytes: ULong = 0uL

    public var mmNonPagedSystemStart: ULong = 0uL

    public var mmNonPagedPoolStart: ULong = 0uL

    public var mmNonPagedPoolEnd: ULong = 0uL

    public var mmPagedPoolStart: ULong = 0uL

    public var mmPagedPoolEnd: ULong = 0uL

    public var mmPagedPoolInformation: ULong = 0uL

    public var mmPageSize: ULong = 0uL

    public var mmSizeOfPagedPoolInBytes: ULong = 0uL

    public var mmTotalCommitLimit: ULong = 0uL

    public var mmTotalCommittedPages: ULong = 0uL

    public var mmSharedCommit: ULong = 0uL

    public var mmDriverCommit: ULong = 0uL

    public var mmProcessCommit: ULong = 0uL

    public var mmPagedPoolCommit: ULong = 0uL

    public var mmExtendedCommit: ULong = 0uL

    public var mmZeroedPageListHead: ULong = 0uL

    public var mmFreePageListHead: ULong = 0uL

    public var mmStandbyPageListHead: ULong = 0uL

    public var mmModifiedPageListHead: ULong = 0uL

    public var mmModifiedNoWritePageListHead: ULong = 0uL

    public var mmAvailablePages: ULong = 0uL

    public var mmResidentAvailablePages: ULong = 0uL

    public var poolTrackTable: ULong = 0uL

    public var nonPagedPoolDescriptor: ULong = 0uL

    public var mmHighestUserAddress: ULong = 0uL

    public var mmSystemRangeStart: ULong = 0uL

    public var mmUserProbeAddress: ULong = 0uL

    public var kdPrintCircularBuffer: ULong = 0uL

    public var kdPrintCircularBufferEnd: ULong = 0uL

    public var kdPrintWritePointer: ULong = 0uL

    public var kdPrintRolloverCount: ULong = 0uL

    public var mmLoadedUserImageList: ULong = 0uL

    public var ntBuildLab: ULong = 0uL

    public var kiNormalSystemCall: ULong = 0uL

    public var kiProcessorBlock: ULong = 0uL

    public var mmUnloadedDrivers: ULong = 0uL

    public var mmLastUnloadedDriver: ULong = 0uL

    public var mmTriageActionTaken: ULong = 0uL

    public var mmSpecialPoolTag: ULong = 0uL

    public var kernelVerifier: ULong = 0uL

    public var mmVerifierData: ULong = 0uL

    public var mmAllocatedNonPagedPool: ULong = 0uL

    public var mmPeakCommitment: ULong = 0uL

    public var mmTotalCommitLimitMaximum: ULong = 0uL

    public var cmNtCSDVersion: ULong = 0uL

    public var mmPhysicalMemoryBlock: ULong = 0uL

    public var mmSessionBase: ULong = 0uL

    public var mmSessionSize: ULong = 0uL

    public var mmSystemParentTablePage: ULong = 0uL

    public var mmVirtualTranslationBase: ULong = 0uL

    public var offsetKThreadNextProcessor: UShort = 0u

    public var offsetKThreadTeb: UShort = 0u

    public var offsetKThreadKernelStack: UShort = 0u

    public var offsetKThreadInitialStack: UShort = 0u

    public var offsetKThreadApcProcess: UShort = 0u

    public var offsetKThreadState: UShort = 0u

    public var offsetKThreadBStore: UShort = 0u

    public var offsetKThreadBStoreLimit: UShort = 0u

    public var sizeEProcess: UShort = 0u

    public var offsetEprocessPeb: UShort = 0u

    public var offsetEprocessParentCID: UShort = 0u

    public var offsetEprocessDirectoryTableBase: UShort = 0u

    public var sizePrcb: UShort = 0u

    public var offsetPrcbDpcRoutine: UShort = 0u

    public var offsetPrcbCurrentThread: UShort = 0u

    public var offsetPrcbMhz: UShort = 0u

    public var offsetPrcbCpuType: UShort = 0u

    public var offsetPrcbVendorString: UShort = 0u

    public var offsetPrcbProcStateContext: UShort = 0u

    public var offsetPrcbNumber: UShort = 0u

    public var sizeEThread: UShort = 0u

    public var l1tfHighPhysicalBitIndex: UByte = 0u

    public var l1tfSwizzleBitIndex: UByte = 0u

    public var padding0: UInt = 0u

    public var kdPrintCircularBufferPtr: ULong = 0uL

    public var kdPrintBufferSize: ULong = 0uL

    public var keLoaderBlock: ULong = 0uL

    public var sizePcr: UShort = 0u

    public var offsetPcrSelfPcr: UShort = 0u

    public var offsetPcrCurrentPrcb: UShort = 0u

    public var offsetPcrContainedPrcb: UShort = 0u

    public var offsetPcrInitialBStore: UShort = 0u

    public var offsetPcrBStoreLimit: UShort = 0u

    public var offsetPcrInitialStack: UShort = 0u

    public var offsetPcrStackLimit: UShort = 0u

    public var offsetPrcbPcrPage: UShort = 0u

    public var offsetPrcbProcStateSpecialReg: UShort = 0u

    public var gdtR0Code: UShort = 0u

    public var gdtR0Data: UShort = 0u

    public var gdtR0Pcr: UShort = 0u

    public var gdtR3Code: UShort = 0u

    public var gdtR3Data: UShort = 0u

    public var gdtR3Teb: UShort = 0u

    public var gdtLdt: UShort = 0u

    public var gdtTss: UShort = 0u

    public var gdt64R3CmCode: UShort = 0u

    public var gdt64R3CmTeb: UShort = 0u

    public var iopNumTriageDumpDataBlocks: ULong = 0uL

    public var iopTriageDumpDataBlocks: ULong = 0uL

    public var vfCrashDataBlock: ULong = 0uL

    public var mmBadPagesDetected: ULong = 0uL

    public var mmZeroedPageSingleBitErrorsDetected: ULong = 0uL

    public var etwpDebuggerData: ULong = 0uL

    public var offsetPrcbContext: UShort = 0u

    public var offsetPrcbMaxBreakpoints: UShort = 0u

    public var offsetPrcbMaxWatchpoints: UShort = 0u

    public var offsetKThreadStackLimit: UInt = 0u

    public var offsetKThreadStackBase: UInt = 0u

    public var offsetKThreadQueueListEntry: UInt = 0u

    public var offsetEThreadIrpList: UInt = 0u

    public var offsetPrcbIdleThread: UShort = 0u

    public var offsetPrcbNormalDpcState: UShort = 0u

    public var offsetPrcbDpcStack: UShort = 0u

    public var offsetPrcbIsrStack: UShort = 0u

    public var sizeKdpcStackFrame: UShort = 0u

    public var offsetKPriQueueThreadListHead: UShort = 0u

    public var offsetKThreadWaitReason: UShort = 0u

    public var padding1: UShort = 0u

    public var pteBase: ULong = 0uL

    public var retpolineStubFunctionTable: ULong = 0uL

    public var retpolineStubFunctionTableSize: UInt = 0u

    public var retpolineStubOffset: UInt = 0u

    public var retpolineStubSize: UInt = 0u

    public var offsetEProcessMmHotPatchContext: UShort = 0u

    public var offsetKThreadShadowStackLimit: UInt = 0u

    public var offsetKThreadShadowStackBase: UInt = 0u

    public var shadowStackEnabled: ULong = 0uL

    public var pointerAuthMask: ULong = 0uL

    public var offsetPrcbExceptionStack: UShort = 0u
}

public class KdextsLockInfo internal constructor(
    public var sizeOfStruct: UInt,
    public var address: ULong,
    public var owningThread: ULong,
    public var exclusiveOwned: Bool,
    public var numOwners: UInt,
    public var contentionCount: UInt,
    public var numExclusiveWaiters: UInt,
    public var numSharedWaiters: UInt,
    pOwnerThreadsCtorArg: MutPtr,
    pWaiterThreadsCtorArg: MutPtr,
) {
    public var pOwnerThreads: MutPtr = pOwnerThreadsCtorArg
        internal set

    public var pWaiterThreads: MutPtr = pWaiterThreadsCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        address = 0uL,
        owningThread = 0uL,
        exclusiveOwned = 0,
        numOwners = 0u,
        contentionCount = 0u,
        numExclusiveWaiters = 0u,
        numSharedWaiters = 0u,
        pOwnerThreadsCtorArg = MutPtr(0L),
        pWaiterThreadsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): ULong = this.address

    public operator fun component3(): ULong = this.owningThread

    public operator fun component4(): Bool = this.exclusiveOwned

    public operator fun component5(): UInt = this.numOwners

    public operator fun component6(): UInt = this.contentionCount

    public operator fun component7(): UInt = this.numExclusiveWaiters

    public operator fun component8(): UInt = this.numSharedWaiters

    public operator fun component9(): MutPtr = this.pOwnerThreads

    public operator fun component10(): MutPtr = this.pWaiterThreads

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, address: ULong = this.address, owningThread: ULong = this.owningThread, exclusiveOwned: Bool = this.exclusiveOwned, numOwners: UInt = this.numOwners, contentionCount: UInt = this.contentionCount, numExclusiveWaiters: UInt = this.numExclusiveWaiters, numSharedWaiters: UInt = this.numSharedWaiters, pOwnerThreads: MutPtr = this.pOwnerThreads, pWaiterThreads: MutPtr = this.pWaiterThreads): KdextsLockInfo = KdextsLockInfo(sizeOfStruct = sizeOfStruct, address = address, owningThread = owningThread, exclusiveOwned = exclusiveOwned, numOwners = numOwners, contentionCount = contentionCount, numExclusiveWaiters = numExclusiveWaiters, numSharedWaiters = numSharedWaiters, pOwnerThreadsCtorArg = pOwnerThreads, pWaiterThreadsCtorArg = pWaiterThreads)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KdextsLockInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.address != other.address) return false
        if (this.owningThread != other.owningThread) return false
        if (this.exclusiveOwned != other.exclusiveOwned) return false
        if (this.numOwners != other.numOwners) return false
        if (this.contentionCount != other.contentionCount) return false
        if (this.numExclusiveWaiters != other.numExclusiveWaiters) return false
        if (this.numSharedWaiters != other.numSharedWaiters) return false
        if (this.pOwnerThreads != other.pOwnerThreads) return false
        if (this.pWaiterThreads != other.pWaiterThreads) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.owningThread.hashCode()
        result = 31 * result + this.exclusiveOwned.hashCode()
        result = 31 * result + this.numOwners.hashCode()
        result = 31 * result + this.contentionCount.hashCode()
        result = 31 * result + this.numExclusiveWaiters.hashCode()
        result = 31 * result + this.numSharedWaiters.hashCode()
        result = 31 * result + this.pOwnerThreads.hashCode()
        result = 31 * result + this.pWaiterThreads.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextsLockInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextsLockInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): KdextsLockInfo =
                    KdextsLockInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: KdextsLockInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.owningThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.exclusiveOwned)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.numOwners)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.contentionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.numExclusiveWaiters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.numSharedWaiters)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.pOwnerThreads)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.pWaiterThreads)
                }
            }

        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            address: ULong = 0uL,
            owningThread: ULong = 0uL,
            exclusiveOwned: Bool = 0,
            numOwners: UInt = 0u,
            contentionCount: UInt = 0u,
            numExclusiveWaiters: UInt = 0u,
            numSharedWaiters: UInt = 0u,
            pOwnerThreads: MutPtr = MutPtr(0L),
            pWaiterThreads: MutPtr = MutPtr(0L),
        ): KdextsLockInfo =
            KdextsLockInfo(
                sizeOfStruct = sizeOfStruct,
                address = address,
                owningThread = owningThread,
                exclusiveOwned = exclusiveOwned,
                numOwners = numOwners,
                contentionCount = contentionCount,
                numExclusiveWaiters = numExclusiveWaiters,
                numSharedWaiters = numSharedWaiters,
                pOwnerThreadsCtorArg = pOwnerThreads,
                pWaiterThreadsCtorArg = pWaiterThreads,
            )
    }
}

public data class KdextsPteInfo(
    public var sizeOfStruct: UInt = 0u,
    public var virtualAddress: ULong = 0uL,
    public var ppeAddress: ULong = 0uL,
    public var pdeAddress: ULong = 0uL,
    public var pteAddress: ULong = 0uL,
    public var pfn: ULong = 0uL,
    public var levels: ULong = 0uL,
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextsPteInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextsPteInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): KdextsPteInfo =
                    KdextsPteInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: KdextsPteInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.virtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ppeAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pdeAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pteAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pfn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.levels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.bitfield2)
                }
            }
    }
}

public data class KdextFilelockOwner(
    public var sizeofstruct: UInt = 0u,
    public var fileObject: ULong = 0uL,
    public var ownerThread: ULong = 0uL,
    public var waitIrp: ULong = 0uL,
    public var deviceObject: ULong = 0uL,
    public var blockingDirver: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KdextFilelockOwner) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (this.fileObject != other.fileObject) return false
        if (this.ownerThread != other.ownerThread) return false
        if (this.waitIrp != other.waitIrp) return false
        if (this.deviceObject != other.deviceObject) return false
        if (!this.blockingDirver.contentEquals(other.blockingDirver)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.ownerThread.hashCode()
        result = 31 * result + this.waitIrp.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.blockingDirver.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextFilelockOwner> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextFilelockOwner> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): KdextFilelockOwner =
                    KdextFilelockOwner(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 40L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: KdextFilelockOwner) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeofstruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fileObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ownerThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.waitIrp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.deviceObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 40L, value.blockingDirver.toList())
                }
            }
    }
}

public data class KdextHandleInformation(
    public var handleTableEntry: ULong = 0uL,
    public var handle: ULong = 0uL,
    public var obj: ULong = 0uL,
    public var objectBody: ULong = 0uL,
    public var grantedAccess: ULong = 0uL,
    public var handleAttributes: UInt = 0u,
    public var pagedOut: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextHandleInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextHandleInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): KdextHandleInformation =
                    KdextHandleInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: KdextHandleInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.handleTableEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.obj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.objectBody)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.grantedAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.handleAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 44L, value.pagedOut)
                }
            }
    }
}

public class KdextProcessFindParams internal constructor(
    public var sizeofStruct: UInt,
    public var pid: UInt,
    public var session: UInt,
    imageNameCtorArg: Pstr,
) {
    public var imageName: Pstr = imageNameCtorArg
        internal set

    public constructor() : this(
        sizeofStruct = 0u,
        pid = 0u,
        session = 0u,
        imageNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sizeofStruct

    public operator fun component2(): UInt = this.pid

    public operator fun component3(): UInt = this.session

    public operator fun component4(): Pstr = this.imageName

    public fun copy(sizeofStruct: UInt = this.sizeofStruct, pid: UInt = this.pid, session: UInt = this.session, imageName: Pstr = this.imageName): KdextProcessFindParams = KdextProcessFindParams(sizeofStruct = sizeofStruct, pid = pid, session = session, imageNameCtorArg = imageName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KdextProcessFindParams) return false
        if (this.sizeofStruct != other.sizeofStruct) return false
        if (this.pid != other.pid) return false
        if (this.session != other.session) return false
        if (this.imageName != other.imageName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofStruct.hashCode()
        result = 31 * result + this.pid.hashCode()
        result = 31 * result + this.session.hashCode()
        result = 31 * result + this.imageName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeofStruct: UInt = 0u,
            pid: UInt = 0u,
            session: UInt = 0u,
            imageName: Pstr = MutPtr(0L),
        ): KdextProcessFindParams =
            KdextProcessFindParams(
                sizeofStruct = sizeofStruct,
                pid = pid,
                session = session,
                imageNameCtorArg = imageName,
            )
    }
}

public data class KdextThreadFindParams(
    public var sizeofStruct: UInt = 0u,
    public var stackPointer: ULong = 0uL,
    public var cid: UInt = 0u,
    public var thread: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextThreadFindParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdextThreadFindParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KdextThreadFindParams =
                    KdextThreadFindParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KdextThreadFindParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeofStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stackPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.thread)
                }
            }
    }
}

public data class Location(
    public var hostDefined: ULong = 0uL,
    public var offset: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Location> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Location> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Location =
                    Location(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Location) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hostDefined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                }
            }
    }
}

public class OsInfo(
    public var majorVer: UInt = 0u,
    public var minorVer: UInt = 0u,
    public var build: UInt = 0u,
    public var buildQfe: UInt = 0u,
    public var productType: UInt = 0u,
    public var suite: UInt = 0u,
    public var revision: UInt = 0u,
    public var s: OsInfo0 = OsInfo0(),
    public var srvPackNumber: UInt = 0u,
    public var servicePackBuild: UInt = 0u,
    public var architecture: UInt = 0u,
    public var lcid: UInt = 0u,
    public var name: ByteArray = ByteArray(64),
    public var fullName: ByteArray = ByteArray(256),
    public var language: ByteArray = ByteArray(30),
    public var buildVersion: ByteArray = ByteArray(64),
    public var servicePackString: ByteArray = ByteArray(64),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): OsInfo =
                    OsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (OsInfo0.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 48L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 112L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (30).toInt())
                        ).readNative(addr + 368L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 398L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 462L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: OsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.majorVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minorVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.build)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.buildQfe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.productType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.suite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.revision)
                    (OsInfo0.typeLayout()).writeNative(addr + 28L, value.s)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.srvPackNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.servicePackBuild)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.architecture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.lcid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 48L, value.name.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 112L, value.fullName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (30).toInt())
                    ).writeNative(addr + 368L, value.language.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 398L, value.buildVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 462L, value.servicePackString.toList())
                }
            }
    }
}

public data class OsInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): OsInfo0 =
                    OsInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: OsInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class OsInfoV1(
    public var type: OsType = 0,
    public var anonymous: OsInfoV10 = OsInfoV10(),
    public var productType: UInt = 0u,
    public var suite: UInt = 0u,
    public var s: OsInfoV11 = OsInfoV11(),
    public var srvPackNumber: UInt = 0u,
    public var language: ByteArray = ByteArray(30),
    public var osString: ByteArray = ByteArray(64),
    public var servicePackString: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OsInfoV1) return false
        if (this.type != other.type) return false
        if (this.anonymous != other.anonymous) return false
        if (this.productType != other.productType) return false
        if (this.suite != other.suite) return false
        if (this.s != other.s) return false
        if (this.srvPackNumber != other.srvPackNumber) return false
        if (!this.language.contentEquals(other.language)) return false
        if (!this.osString.contentEquals(other.osString)) return false
        if (!this.servicePackString.contentEquals(other.servicePackString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.productType.hashCode()
        result = 31 * result + this.suite.hashCode()
        result = 31 * result + this.s.hashCode()
        result = 31 * result + this.srvPackNumber.hashCode()
        result = 31 * result + this.language.contentHashCode()
        result = 31 * result + this.osString.contentHashCode()
        result = 31 * result + this.servicePackString.contentHashCode()
        return result
    }
}

public data class OsInfoV10(
    public var version: OsInfoV100 = OsInfoV100(),
    public var ver64: ULong = 0uL,
)

public data class OsInfoV100(
    public var major: UInt = 0u,
    public var minor: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfoV100> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfoV100> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): OsInfoV100 =
                    OsInfoV100(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: OsInfoV100) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.major)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minor)
                }
            }
    }
}

public data class OsInfoV11(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfoV11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsInfoV11> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): OsInfoV11 =
                    OsInfoV11(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: OsInfoV11) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Physical(
    public var address: ULong = 0uL,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Physical) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Physical> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Physical> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Physical =
                    Physical(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Physical) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bufLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.buf.toList())
                }
            }
    }
}

public data class PhysicalToVirtual(
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var pdeAddress: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalToVirtual> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalToVirtual> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PhysicalToVirtual =
                    PhysicalToVirtual(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PhysicalToVirtual) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pdeAddress)
                }
            }
    }
}

public data class PhysicalWithFlags(
    public var address: ULong = 0uL,
    public var bufLen: UInt = 0u,
    public var flags: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalWithFlags) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (this.flags != other.flags) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalWithFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalWithFlags> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PhysicalWithFlags =
                    PhysicalWithFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PhysicalWithFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bufLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.buf.toList())
                }
            }
    }
}

public class PointerSearchPhysical internal constructor(
    public var offset: ULong,
    public var length: ULong,
    public var pointerMin: ULong,
    public var pointerMax: ULong,
    public var flags: UInt,
    matchOffsetsCtorArg: MutPtr,
    public var matchOffsetsSize: UInt,
    public var matchOffsetsCount: UInt,
) {
    public var matchOffsets: MutPtr = matchOffsetsCtorArg
        internal set

    public constructor() : this(
        offset = 0uL,
        length = 0uL,
        pointerMin = 0uL,
        pointerMax = 0uL,
        flags = 0u,
        matchOffsetsCtorArg = MutPtr(0L),
        matchOffsetsSize = 0u,
        matchOffsetsCount = 0u,
    )

    public operator fun component1(): ULong = this.offset

    public operator fun component2(): ULong = this.length

    public operator fun component3(): ULong = this.pointerMin

    public operator fun component4(): ULong = this.pointerMax

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): MutPtr = this.matchOffsets

    public operator fun component7(): UInt = this.matchOffsetsSize

    public operator fun component8(): UInt = this.matchOffsetsCount

    public fun copy(offset: ULong = this.offset, length: ULong = this.length, pointerMin: ULong = this.pointerMin, pointerMax: ULong = this.pointerMax, flags: UInt = this.flags, matchOffsets: MutPtr = this.matchOffsets, matchOffsetsSize: UInt = this.matchOffsetsSize, matchOffsetsCount: UInt = this.matchOffsetsCount): PointerSearchPhysical = PointerSearchPhysical(offset = offset, length = length, pointerMin = pointerMin, pointerMax = pointerMax, flags = flags, matchOffsetsCtorArg = matchOffsets, matchOffsetsSize = matchOffsetsSize, matchOffsetsCount = matchOffsetsCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PointerSearchPhysical) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        if (this.pointerMin != other.pointerMin) return false
        if (this.pointerMax != other.pointerMax) return false
        if (this.flags != other.flags) return false
        if (this.matchOffsets != other.matchOffsets) return false
        if (this.matchOffsetsSize != other.matchOffsetsSize) return false
        if (this.matchOffsetsCount != other.matchOffsetsCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.pointerMin.hashCode()
        result = 31 * result + this.pointerMax.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.matchOffsets.hashCode()
        result = 31 * result + this.matchOffsetsSize.hashCode()
        result = 31 * result + this.matchOffsetsCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointerSearchPhysical> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointerSearchPhysical> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): PointerSearchPhysical =
                    PointerSearchPhysical(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: PointerSearchPhysical) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pointerMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pointerMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.matchOffsets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.matchOffsetsSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.matchOffsetsCount)
                }
            }

        public operator fun invoke(
            offset: ULong = 0uL,
            length: ULong = 0uL,
            pointerMin: ULong = 0uL,
            pointerMax: ULong = 0uL,
            flags: UInt = 0u,
            matchOffsets: MutPtr = MutPtr(0L),
            matchOffsetsSize: UInt = 0u,
            matchOffsetsCount: UInt = 0u,
        ): PointerSearchPhysical =
            PointerSearchPhysical(
                offset = offset,
                length = length,
                pointerMin = pointerMin,
                pointerMax = pointerMax,
                flags = flags,
                matchOffsetsCtorArg = matchOffsets,
                matchOffsetsSize = matchOffsetsSize,
                matchOffsetsCount = matchOffsetsCount,
            )
    }
}

public data class Processorinfo(
    public var processor: UShort = 0u,
    public var numberProcessors: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Processorinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Processorinfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Processorinfo =
                    Processorinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Processorinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.processor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.numberProcessors)
                }
            }
    }
}

public data class ProcessCommitUsage(
    public var imageFileName: UByteArray = UByteArray(16),
    public var clientId: ULong = 0uL,
    public var processAddress: ULong = 0uL,
    public var commitCharge: ULong = 0uL,
    public var sharedCommitCharge: ULong = 0uL,
    public var releasedCommitDebt: ULong = 0uL,
    public var reserved: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessCommitUsage) return false
        if (!this.imageFileName.contentEquals(other.imageFileName)) return false
        if (this.clientId != other.clientId) return false
        if (this.processAddress != other.processAddress) return false
        if (this.commitCharge != other.commitCharge) return false
        if (this.sharedCommitCharge != other.sharedCommitCharge) return false
        if (this.releasedCommitDebt != other.releasedCommitDebt) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.imageFileName.contentHashCode()
        result = 31 * result + this.clientId.hashCode()
        result = 31 * result + this.processAddress.hashCode()
        result = 31 * result + this.commitCharge.hashCode()
        result = 31 * result + this.sharedCommitCharge.hashCode()
        result = 31 * result + this.releasedCommitDebt.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessCommitUsage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessCommitUsage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): ProcessCommitUsage =
                    ProcessCommitUsage(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: ProcessCommitUsage) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.imageFileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.clientId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.processAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.commitCharge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.sharedCommitCharge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.releasedCommitDebt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.reserved)
                }
            }
    }
}

public data class ProcessNameEntry(
    public var processId: UInt = 0u,
    public var nameOffset: UInt = 0u,
    public var nameSize: UInt = 0u,
    public var nextEntry: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessNameEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessNameEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ProcessNameEntry =
                    ProcessNameEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ProcessNameEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nextEntry)
                }
            }
    }
}

public data class Readcontrolspace(
    public var processor: UShort = 0u,
    public var address: UInt = 0u,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Readcontrolspace) return false
        if (this.processor != other.processor) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processor.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Readcontrolspace> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Readcontrolspace> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Readcontrolspace =
                    Readcontrolspace(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Readcontrolspace) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.processor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bufLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.buf.toList())
                }
            }
    }
}

public data class Readcontrolspace32(
    public var processor: UShort = 0u,
    public var address: UInt = 0u,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Readcontrolspace32) return false
        if (this.processor != other.processor) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processor.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Readcontrolspace32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Readcontrolspace32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Readcontrolspace32 =
                    Readcontrolspace32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Readcontrolspace32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.processor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bufLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.buf.toList())
                }
            }
    }
}

public data class Readcontrolspace64(
    public var processor: UShort = 0u,
    public var address: ULong = 0uL,
    public var bufLen: UInt = 0u,
    public var buf: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Readcontrolspace64) return false
        if (this.processor != other.processor) return false
        if (this.address != other.address) return false
        if (this.bufLen != other.bufLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processor.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.bufLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Readcontrolspace64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Readcontrolspace64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Readcontrolspace64 =
                    Readcontrolspace64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Readcontrolspace64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.processor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bufLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.buf.toList())
                }
            }
    }
}

public data class ReadWriteMsr(
    public var msr: UInt = 0u,
    public var value: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadWriteMsr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadWriteMsr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ReadWriteMsr =
                    ReadWriteMsr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ReadWriteMsr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.msr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class Searchmemory internal constructor(
    public var searchAddress: ULong,
    public var searchLength: ULong,
    public var foundAddress: ULong,
    public var patternLength: UInt,
    patternCtorArg: MutPtr,
) {
    public var pattern: MutPtr = patternCtorArg
        internal set

    public constructor() : this(
        searchAddress = 0uL,
        searchLength = 0uL,
        foundAddress = 0uL,
        patternLength = 0u,
        patternCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.searchAddress

    public operator fun component2(): ULong = this.searchLength

    public operator fun component3(): ULong = this.foundAddress

    public operator fun component4(): UInt = this.patternLength

    public operator fun component5(): MutPtr = this.pattern

    public fun copy(searchAddress: ULong = this.searchAddress, searchLength: ULong = this.searchLength, foundAddress: ULong = this.foundAddress, patternLength: UInt = this.patternLength, pattern: MutPtr = this.pattern): Searchmemory = Searchmemory(searchAddress = searchAddress, searchLength = searchLength, foundAddress = foundAddress, patternLength = patternLength, patternCtorArg = pattern)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Searchmemory) return false
        if (this.searchAddress != other.searchAddress) return false
        if (this.searchLength != other.searchLength) return false
        if (this.foundAddress != other.foundAddress) return false
        if (this.patternLength != other.patternLength) return false
        if (this.pattern != other.pattern) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.searchAddress.hashCode()
        result = 31 * result + this.searchLength.hashCode()
        result = 31 * result + this.foundAddress.hashCode()
        result = 31 * result + this.patternLength.hashCode()
        result = 31 * result + this.pattern.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Searchmemory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Searchmemory> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Searchmemory =
                    Searchmemory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Searchmemory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.searchAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.searchLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.foundAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.patternLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pattern)
                }
            }

        public operator fun invoke(
            searchAddress: ULong = 0uL,
            searchLength: ULong = 0uL,
            foundAddress: ULong = 0uL,
            patternLength: UInt = 0u,
            pattern: MutPtr = MutPtr(0L),
        ): Searchmemory =
            Searchmemory(
                searchAddress = searchAddress,
                searchLength = searchLength,
                foundAddress = foundAddress,
                patternLength = patternLength,
                patternCtorArg = pattern,
            )
    }
}

public class StackSrcInfo internal constructor(
    imagePathCtorArg: Pcwstr,
    moduleNameCtorArg: Pcwstr,
    functionCtorArg: Pcwstr,
    public var displacement: UInt,
    public var row: UInt,
    public var column: UInt,
) {
    public var imagePath: Pcwstr = imagePathCtorArg
        internal set

    public var moduleName: Pcwstr = moduleNameCtorArg
        internal set

    public var function: Pcwstr = functionCtorArg
        internal set

    public constructor() : this(
        imagePathCtorArg = ConstPtr(0L),
        moduleNameCtorArg = ConstPtr(0L),
        functionCtorArg = ConstPtr(0L),
        displacement = 0u,
        row = 0u,
        column = 0u,
    )

    public operator fun component1(): Pcwstr = this.imagePath

    public operator fun component2(): Pcwstr = this.moduleName

    public operator fun component3(): Pcwstr = this.function

    public operator fun component4(): UInt = this.displacement

    public operator fun component5(): UInt = this.row

    public operator fun component6(): UInt = this.column

    public fun copy(imagePath: Pcwstr = this.imagePath, moduleName: Pcwstr = this.moduleName, function: Pcwstr = this.function, displacement: UInt = this.displacement, row: UInt = this.row, column: UInt = this.column): StackSrcInfo = StackSrcInfo(imagePathCtorArg = imagePath, moduleNameCtorArg = moduleName, functionCtorArg = function, displacement = displacement, row = row, column = column)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackSrcInfo) return false
        if (this.imagePath != other.imagePath) return false
        if (this.moduleName != other.moduleName) return false
        if (this.function != other.function) return false
        if (this.displacement != other.displacement) return false
        if (this.row != other.row) return false
        if (this.column != other.column) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.imagePath.hashCode()
        result = 31 * result + this.moduleName.hashCode()
        result = 31 * result + this.function.hashCode()
        result = 31 * result + this.displacement.hashCode()
        result = 31 * result + this.row.hashCode()
        result = 31 * result + this.column.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            imagePath: Pcwstr = ConstPtr(0L),
            moduleName: Pcwstr = ConstPtr(0L),
            function: Pcwstr = ConstPtr(0L),
            displacement: UInt = 0u,
            row: UInt = 0u,
            column: UInt = 0u,
        ): StackSrcInfo =
            StackSrcInfo(
                imagePathCtorArg = imagePath,
                moduleNameCtorArg = moduleName,
                functionCtorArg = function,
                displacement = displacement,
                row = row,
                column = column,
            )
    }
}

public data class StackSymFrameInfo(
    public var stackFrameEx: DebugStackFrameEx = DebugStackFrameEx(),
    public var srcInfo: StackSrcInfo = StackSrcInfo(),
)

public data class SymbolInfoEx(
    public var sizeOfStruct: UInt = 0u,
    public var typeOfInfo: UInt = 0u,
    public var offset: ULong = 0uL,
    public var line: UInt = 0u,
    public var displacement: UInt = 0u,
    public var reserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfoEx) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.typeOfInfo != other.typeOfInfo) return false
        if (this.offset != other.offset) return false
        if (this.line != other.line) return false
        if (this.displacement != other.displacement) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.typeOfInfo.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.line.hashCode()
        result = 31 * result + this.displacement.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfoEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): SymbolInfoEx =
                    SymbolInfoEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SymbolInfoEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.typeOfInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.line)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.displacement)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 24L, value.reserved.toList())
                }
            }
    }
}

public class SymDumpParam internal constructor(
    public var size: UInt,
    sNameCtorArg: MutPtr,
    public var options: UInt,
    public var addr: ULong,
    listLinkCtorArg: MutPtr,
    public var anonymous: SymDumpParam0,
    public var callbackRoutine: PsymDumpFieldCallback,
    public var nFields: UInt,
    fieldsCtorArg: MutPtr,
    public var modBase: ULong,
    public var typeId: UInt,
    public var typeSize: UInt,
    public var bufferSize: UInt,
    public var bitfield: UInt,
) {
    public var sName: MutPtr = sNameCtorArg
        internal set

    public var listLink: MutPtr = listLinkCtorArg
        internal set

    public var fields: MutPtr = fieldsCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        sNameCtorArg = MutPtr(0L),
        options = 0u,
        addr = 0uL,
        listLinkCtorArg = MutPtr(0L),
        anonymous = SymDumpParam0(),
        callbackRoutine = null,
        nFields = 0u,
        fieldsCtorArg = MutPtr(0L),
        modBase = 0uL,
        typeId = 0u,
        typeSize = 0u,
        bufferSize = 0u,
        bitfield = 0u,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr = this.sName

    public operator fun component3(): UInt = this.options

    public operator fun component4(): ULong = this.addr

    public operator fun component5(): MutPtr = this.listLink

    public operator fun component6(): SymDumpParam0 = this.anonymous

    public operator fun component7(): PsymDumpFieldCallback = this.callbackRoutine

    public operator fun component8(): UInt = this.nFields

    public operator fun component9(): MutPtr = this.fields

    public operator fun component10(): ULong = this.modBase

    public operator fun component11(): UInt = this.typeId

    public operator fun component12(): UInt = this.typeSize

    public operator fun component13(): UInt = this.bufferSize

    public operator fun component14(): UInt = this.bitfield

    public fun copy(size: UInt = this.size, sName: MutPtr = this.sName, options: UInt = this.options, addr: ULong = this.addr, listLink: MutPtr = this.listLink, anonymous: SymDumpParam0 = this.anonymous, callbackRoutine: PsymDumpFieldCallback = this.callbackRoutine, nFields: UInt = this.nFields, fields: MutPtr = this.fields, modBase: ULong = this.modBase, typeId: UInt = this.typeId, typeSize: UInt = this.typeSize, bufferSize: UInt = this.bufferSize, bitfield: UInt = this.bitfield): SymDumpParam = SymDumpParam(size = size, sNameCtorArg = sName, options = options, addr = addr, listLinkCtorArg = listLink, anonymous = anonymous, callbackRoutine = callbackRoutine, nFields = nFields, fieldsCtorArg = fields, modBase = modBase, typeId = typeId, typeSize = typeSize, bufferSize = bufferSize, bitfield = bitfield)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymDumpParam) return false
        if (this.size != other.size) return false
        if (this.sName != other.sName) return false
        if (this.options != other.options) return false
        if (this.addr != other.addr) return false
        if (this.listLink != other.listLink) return false
        if (this.anonymous != other.anonymous) return false
        if (this.callbackRoutine != other.callbackRoutine) return false
        if (this.nFields != other.nFields) return false
        if (this.fields != other.fields) return false
        if (this.modBase != other.modBase) return false
        if (this.typeId != other.typeId) return false
        if (this.typeSize != other.typeSize) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.sName.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.addr.hashCode()
        result = 31 * result + this.listLink.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.callbackRoutine.hashCode()
        result = 31 * result + this.nFields.hashCode()
        result = 31 * result + this.fields.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.typeId.hashCode()
        result = 31 * result + this.typeSize.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            sName: MutPtr = MutPtr(0L),
            options: UInt = 0u,
            addr: ULong = 0uL,
            listLink: MutPtr = MutPtr(0L),
            anonymous: SymDumpParam0 = SymDumpParam0(),
            callbackRoutine: PsymDumpFieldCallback = null,
            nFields: UInt = 0u,
            fields: MutPtr = MutPtr(0L),
            modBase: ULong = 0uL,
            typeId: UInt = 0u,
            typeSize: UInt = 0u,
            bufferSize: UInt = 0u,
            bitfield: UInt = 0u,
        ): SymDumpParam =
            SymDumpParam(
                size = size,
                sNameCtorArg = sName,
                options = options,
                addr = addr,
                listLinkCtorArg = listLink,
                anonymous = anonymous,
                callbackRoutine = callbackRoutine,
                nFields = nFields,
                fieldsCtorArg = fields,
                modBase = modBase,
                typeId = typeId,
                typeSize = typeSize,
                bufferSize = bufferSize,
                bitfield = bitfield,
            )
    }
}

public class SymDumpParam0 internal constructor(
    contextCtorArg: MutPtr,
    pBufferCtorArg: MutPtr,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public var pBuffer: MutPtr = pBufferCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        pBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.context

    public operator fun component2(): MutPtr = this.pBuffer

    public fun copy(context: MutPtr = this.context, pBuffer: MutPtr = this.pBuffer): SymDumpParam0 = SymDumpParam0(contextCtorArg = context, pBufferCtorArg = pBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymDumpParam0) return false
        if (this.context != other.context) return false
        if (this.pBuffer != other.pBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.pBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            context: MutPtr = MutPtr(0L),
            pBuffer: MutPtr = MutPtr(0L),
        ): SymDumpParam0 =
            SymDumpParam0(
                contextCtorArg = context,
                pBufferCtorArg = pBuffer,
            )
    }
}

public data class ScriptDebugEventInformation(
    public var debugEvent: ScriptDebugEvent = 0,
    public var eventPosition: ScriptDebugPosition = ScriptDebugPosition(),
    public var eventSpanEnd: ScriptDebugPosition = ScriptDebugPosition(),
    public var u: ScriptDebugEventInformation0 = ScriptDebugEventInformation0(),
)

public data class ScriptDebugEventInformation0(
    public var exceptionInformation: ScriptDebugEventInformation00 = ScriptDebugEventInformation00(),
    public var breakpointInformation: ScriptDebugEventInformation01 = ScriptDebugEventInformation01(),
)

public data class ScriptDebugEventInformation01(
    public var breakpointId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDebugEventInformation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDebugEventInformation01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScriptDebugEventInformation01 =
                    ScriptDebugEventInformation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScriptDebugEventInformation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.breakpointId)
                }
            }
    }
}

public data class ScriptDebugEventInformation00(
    public var isUncaught: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDebugEventInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDebugEventInformation00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ScriptDebugEventInformation00 =
                    ScriptDebugEventInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScriptDebugEventInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.isUncaught)
                }
            }
    }
}

public data class ScriptDebugPosition(
    public var line: UInt = 0u,
    public var column: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDebugPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDebugPosition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScriptDebugPosition =
                    ScriptDebugPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScriptDebugPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.line)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.column)
                }
            }
    }
}

public data class TargetDebugInfo(
    public var sizeOfStruct: UInt = 0u,
    public var entryDate: ULong = 0uL,
    public var debugeeClass: UInt = 0u,
    public var sysUpTime: ULong = 0uL,
    public var appUpTime: ULong = 0uL,
    public var crashTime: ULong = 0uL,
    public var osInfo: OsInfo = OsInfo(),
    public var cpu: CpuInfo = CpuInfo(),
    public var dumpFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDebugInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.entryDate != other.entryDate) return false
        if (this.debugeeClass != other.debugeeClass) return false
        if (this.sysUpTime != other.sysUpTime) return false
        if (this.appUpTime != other.appUpTime) return false
        if (this.crashTime != other.crashTime) return false
        if (this.osInfo != other.osInfo) return false
        if (this.cpu != other.cpu) return false
        if (!this.dumpFile.contentEquals(other.dumpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.entryDate.hashCode()
        result = 31 * result + this.debugeeClass.hashCode()
        result = 31 * result + this.sysUpTime.hashCode()
        result = 31 * result + this.appUpTime.hashCode()
        result = 31 * result + this.crashTime.hashCode()
        result = 31 * result + this.osInfo.hashCode()
        result = 31 * result + this.cpu.hashCode()
        result = 31 * result + this.dumpFile.contentHashCode()
        return result
    }
}

public class TargetDebugInfoV1 internal constructor(
    public var sizeOfStruct: UInt,
    public var id: ULong,
    public var source: ULong,
    public var entryDate: ULong,
    public var sysUpTime: ULong,
    public var appUpTime: ULong,
    public var crashTime: ULong,
    public var mode: ULong,
    public var osInfo: OsInfoV1,
    public var cpu: CpuInfoV1,
    public var dumpFile: ByteArray,
    failureDataCtorArg: MutPtr,
    public var stackTr: ByteArray,
) {
    public var failureData: MutPtr = failureDataCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        id = 0uL,
        source = 0uL,
        entryDate = 0uL,
        sysUpTime = 0uL,
        appUpTime = 0uL,
        crashTime = 0uL,
        mode = 0uL,
        osInfo = OsInfoV1(),
        cpu = CpuInfoV1(),
        dumpFile = ByteArray(260),
        failureDataCtorArg = MutPtr(0L),
        stackTr = ByteArray(4096),
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): ULong = this.id

    public operator fun component3(): ULong = this.source

    public operator fun component4(): ULong = this.entryDate

    public operator fun component5(): ULong = this.sysUpTime

    public operator fun component6(): ULong = this.appUpTime

    public operator fun component7(): ULong = this.crashTime

    public operator fun component8(): ULong = this.mode

    public operator fun component9(): OsInfoV1 = this.osInfo

    public operator fun component10(): CpuInfoV1 = this.cpu

    public operator fun component11(): ByteArray = this.dumpFile

    public operator fun component12(): MutPtr = this.failureData

    public operator fun component13(): ByteArray = this.stackTr

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, id: ULong = this.id, source: ULong = this.source, entryDate: ULong = this.entryDate, sysUpTime: ULong = this.sysUpTime, appUpTime: ULong = this.appUpTime, crashTime: ULong = this.crashTime, mode: ULong = this.mode, osInfo: OsInfoV1 = this.osInfo, cpu: CpuInfoV1 = this.cpu, dumpFile: ByteArray = this.dumpFile, failureData: MutPtr = this.failureData, stackTr: ByteArray = this.stackTr): TargetDebugInfoV1 = TargetDebugInfoV1(sizeOfStruct = sizeOfStruct, id = id, source = source, entryDate = entryDate, sysUpTime = sysUpTime, appUpTime = appUpTime, crashTime = crashTime, mode = mode, osInfo = osInfo, cpu = cpu, dumpFile = dumpFile, failureDataCtorArg = failureData, stackTr = stackTr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDebugInfoV1) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.id != other.id) return false
        if (this.source != other.source) return false
        if (this.entryDate != other.entryDate) return false
        if (this.sysUpTime != other.sysUpTime) return false
        if (this.appUpTime != other.appUpTime) return false
        if (this.crashTime != other.crashTime) return false
        if (this.mode != other.mode) return false
        if (this.osInfo != other.osInfo) return false
        if (this.cpu != other.cpu) return false
        if (!this.dumpFile.contentEquals(other.dumpFile)) return false
        if (this.failureData != other.failureData) return false
        if (!this.stackTr.contentEquals(other.stackTr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.entryDate.hashCode()
        result = 31 * result + this.sysUpTime.hashCode()
        result = 31 * result + this.appUpTime.hashCode()
        result = 31 * result + this.crashTime.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.osInfo.hashCode()
        result = 31 * result + this.cpu.hashCode()
        result = 31 * result + this.dumpFile.contentHashCode()
        result = 31 * result + this.failureData.hashCode()
        result = 31 * result + this.stackTr.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            id: ULong = 0uL,
            source: ULong = 0uL,
            entryDate: ULong = 0uL,
            sysUpTime: ULong = 0uL,
            appUpTime: ULong = 0uL,
            crashTime: ULong = 0uL,
            mode: ULong = 0uL,
            osInfo: OsInfoV1 = OsInfoV1(),
            cpu: CpuInfoV1 = CpuInfoV1(),
            dumpFile: ByteArray = ByteArray(260),
            failureData: MutPtr = MutPtr(0L),
            stackTr: ByteArray = ByteArray(4096),
        ): TargetDebugInfoV1 =
            TargetDebugInfoV1(
                sizeOfStruct = sizeOfStruct,
                id = id,
                source = source,
                entryDate = entryDate,
                sysUpTime = sysUpTime,
                appUpTime = appUpTime,
                crashTime = crashTime,
                mode = mode,
                osInfo = osInfo,
                cpu = cpu,
                dumpFile = dumpFile,
                failureDataCtorArg = failureData,
                stackTr = stackTr,
            )
    }
}

public data class TargetDebugInfoV2(
    public var sizeOfStruct: UInt = 0u,
    public var entryDate: ULong = 0uL,
    public var debugeeClass: UInt = 0u,
    public var sysUpTime: ULong = 0uL,
    public var appUpTime: ULong = 0uL,
    public var crashTime: ULong = 0uL,
    public var osInfo: OsInfo = OsInfo(),
    public var cpu: CpuInfoV2 = CpuInfoV2(),
    public var dumpFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TargetDebugInfoV2) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.entryDate != other.entryDate) return false
        if (this.debugeeClass != other.debugeeClass) return false
        if (this.sysUpTime != other.sysUpTime) return false
        if (this.appUpTime != other.appUpTime) return false
        if (this.crashTime != other.crashTime) return false
        if (this.osInfo != other.osInfo) return false
        if (this.cpu != other.cpu) return false
        if (!this.dumpFile.contentEquals(other.dumpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.entryDate.hashCode()
        result = 31 * result + this.debugeeClass.hashCode()
        result = 31 * result + this.sysUpTime.hashCode()
        result = 31 * result + this.appUpTime.hashCode()
        result = 31 * result + this.crashTime.hashCode()
        result = 31 * result + this.osInfo.hashCode()
        result = 31 * result + this.cpu.hashCode()
        result = 31 * result + this.dumpFile.contentHashCode()
        return result
    }
}

public data class TranslateVirtualToPhysical(
    public var virtual: ULong = 0uL,
    public var physical: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TranslateVirtualToPhysical> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TranslateVirtualToPhysical> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TranslateVirtualToPhysical =
                    TranslateVirtualToPhysical(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TranslateVirtualToPhysical) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.virtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.physical)
                }
            }
    }
}

public data class VirtualToPhysical(
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var pdeAddress: ULong = 0uL,
    public var virtual: ULong = 0uL,
    public var physical: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualToPhysical> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualToPhysical> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): VirtualToPhysical =
                    VirtualToPhysical(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: VirtualToPhysical) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pdeAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.virtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.physical)
                }
            }
    }
}

public class WdbgextsClrDataInterface internal constructor(
    iidCtorArg: ConstPtr,
    ifaceCtorArg: MutPtr,
) {
    public var iid: ConstPtr = iidCtorArg
        internal set

    public var iface: MutPtr = ifaceCtorArg
        internal set

    public constructor() : this(
        iidCtorArg = ConstPtr(0L),
        ifaceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.iid

    public operator fun component2(): MutPtr = this.iface

    public fun copy(iid: ConstPtr = this.iid, iface: MutPtr = this.iface): WdbgextsClrDataInterface = WdbgextsClrDataInterface(iidCtorArg = iid, ifaceCtorArg = iface)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdbgextsClrDataInterface) return false
        if (this.iid != other.iid) return false
        if (this.iface != other.iface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iid.hashCode()
        result = 31 * result + this.iface.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsClrDataInterface> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsClrDataInterface> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WdbgextsClrDataInterface =
                    WdbgextsClrDataInterface(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WdbgextsClrDataInterface) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.iid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.iface)
                }
            }

        public operator fun invoke(
            iid: ConstPtr = ConstPtr(0L),
            iface: MutPtr = MutPtr(0L),
        ): WdbgextsClrDataInterface =
            WdbgextsClrDataInterface(
                iidCtorArg = iid,
                ifaceCtorArg = iface,
            )
    }
}

public class WdbgextsDisassembleBuffer internal constructor(
    public var inOffset: ULong,
    public var outOffset: ULong,
    public var addrFlags: UInt,
    public var formatFlags: UInt,
    public var dataBufferBytes: UInt,
    public var disasmBufferChars: UInt,
    dataBufferCtorArg: MutPtr,
    disasmBufferCtorArg: Pwstr,
    public var reserved0: ULongArray,
) {
    public var dataBuffer: MutPtr = dataBufferCtorArg
        internal set

    public var disasmBuffer: Pwstr = disasmBufferCtorArg
        internal set

    public constructor() : this(
        inOffset = 0uL,
        outOffset = 0uL,
        addrFlags = 0u,
        formatFlags = 0u,
        dataBufferBytes = 0u,
        disasmBufferChars = 0u,
        dataBufferCtorArg = MutPtr(0L),
        disasmBufferCtorArg = MutPtr(0L),
        reserved0 = ULongArray(3),
    )

    public operator fun component1(): ULong = this.inOffset

    public operator fun component2(): ULong = this.outOffset

    public operator fun component3(): UInt = this.addrFlags

    public operator fun component4(): UInt = this.formatFlags

    public operator fun component5(): UInt = this.dataBufferBytes

    public operator fun component6(): UInt = this.disasmBufferChars

    public operator fun component7(): MutPtr = this.dataBuffer

    public operator fun component8(): Pwstr = this.disasmBuffer

    public operator fun component9(): ULongArray = this.reserved0

    public fun copy(inOffset: ULong = this.inOffset, outOffset: ULong = this.outOffset, addrFlags: UInt = this.addrFlags, formatFlags: UInt = this.formatFlags, dataBufferBytes: UInt = this.dataBufferBytes, disasmBufferChars: UInt = this.disasmBufferChars, dataBuffer: MutPtr = this.dataBuffer, disasmBuffer: Pwstr = this.disasmBuffer, reserved0: ULongArray = this.reserved0): WdbgextsDisassembleBuffer = WdbgextsDisassembleBuffer(inOffset = inOffset, outOffset = outOffset, addrFlags = addrFlags, formatFlags = formatFlags, dataBufferBytes = dataBufferBytes, disasmBufferChars = disasmBufferChars, dataBufferCtorArg = dataBuffer, disasmBufferCtorArg = disasmBuffer, reserved0 = reserved0)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdbgextsDisassembleBuffer) return false
        if (this.inOffset != other.inOffset) return false
        if (this.outOffset != other.outOffset) return false
        if (this.addrFlags != other.addrFlags) return false
        if (this.formatFlags != other.formatFlags) return false
        if (this.dataBufferBytes != other.dataBufferBytes) return false
        if (this.disasmBufferChars != other.disasmBufferChars) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.disasmBuffer != other.disasmBuffer) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inOffset.hashCode()
        result = 31 * result + this.outOffset.hashCode()
        result = 31 * result + this.addrFlags.hashCode()
        result = 31 * result + this.formatFlags.hashCode()
        result = 31 * result + this.dataBufferBytes.hashCode()
        result = 31 * result + this.disasmBufferChars.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.disasmBuffer.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inOffset: ULong = 0uL,
            outOffset: ULong = 0uL,
            addrFlags: UInt = 0u,
            formatFlags: UInt = 0u,
            dataBufferBytes: UInt = 0u,
            disasmBufferChars: UInt = 0u,
            dataBuffer: MutPtr = MutPtr(0L),
            disasmBuffer: Pwstr = MutPtr(0L),
            reserved0: ULongArray = ULongArray(3),
        ): WdbgextsDisassembleBuffer =
            WdbgextsDisassembleBuffer(
                inOffset = inOffset,
                outOffset = outOffset,
                addrFlags = addrFlags,
                formatFlags = formatFlags,
                dataBufferBytes = dataBufferBytes,
                disasmBufferChars = disasmBufferChars,
                dataBufferCtorArg = dataBuffer,
                disasmBufferCtorArg = disasmBuffer,
                reserved0 = reserved0,
            )
    }
}

public data class WdbgextsModuleInRange(
    public var start: ULong = 0uL,
    public var end: ULong = 0uL,
    public var foundModBase: ULong = 0uL,
    public var foundModSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsModuleInRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsModuleInRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): WdbgextsModuleInRange =
                    WdbgextsModuleInRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WdbgextsModuleInRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.end)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.foundModBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.foundModSize)
                }
            }
    }
}

public class WdbgextsQueryInterface internal constructor(
    iidCtorArg: ConstPtr,
    ifaceCtorArg: MutPtr,
) {
    public var iid: ConstPtr = iidCtorArg
        internal set

    public var iface: MutPtr = ifaceCtorArg
        internal set

    public constructor() : this(
        iidCtorArg = ConstPtr(0L),
        ifaceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.iid

    public operator fun component2(): MutPtr = this.iface

    public fun copy(iid: ConstPtr = this.iid, iface: MutPtr = this.iface): WdbgextsQueryInterface = WdbgextsQueryInterface(iidCtorArg = iid, ifaceCtorArg = iface)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdbgextsQueryInterface) return false
        if (this.iid != other.iid) return false
        if (this.iface != other.iface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iid.hashCode()
        result = 31 * result + this.iface.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsQueryInterface> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsQueryInterface> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WdbgextsQueryInterface =
                    WdbgextsQueryInterface(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WdbgextsQueryInterface) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.iid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.iface)
                }
            }

        public operator fun invoke(
            iid: ConstPtr = ConstPtr(0L),
            iface: MutPtr = MutPtr(0L),
        ): WdbgextsQueryInterface =
            WdbgextsQueryInterface(
                iidCtorArg = iid,
                ifaceCtorArg = iface,
            )
    }
}

public data class WdbgextsThreadOsInfo(
    public var threadId: UInt = 0u,
    public var exitStatus: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var createTime: ULong = 0uL,
    public var exitTime: ULong = 0uL,
    public var kernelTime: ULong = 0uL,
    public var userTime: ULong = 0uL,
    public var startOffset: ULong = 0uL,
    public var affinity: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsThreadOsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdbgextsThreadOsInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): WdbgextsThreadOsInfo =
                    WdbgextsThreadOsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: WdbgextsThreadOsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.exitStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.priorityClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.createTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.exitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.userTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.startOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.affinity)
                }
            }
    }
}

public data class WindbgExtensionApis(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol = null,
    public var lpDisasmRoutine: PwindbgDisasm = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadProcessMemoryRoutine: PwindbgReadProcessMemoryRoutine = null,
    public var lpWriteProcessMemoryRoutine: PwindbgWriteProcessMemoryRoutine = null,
    public var lpGetThreadContextRoutine: PwindbgGetThreadContextRoutine = null,
    public var lpSetThreadContextRoutine: PwindbgSetThreadContextRoutine = null,
    public var lpIoctlRoutine: PwindbgIoctlRoutine = null,
    public var lpStackTraceRoutine: PwindbgStacktraceRoutine = null,
)

public data class WindbgExtensionApis32(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression32 = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol32 = null,
    public var lpDisasmRoutine: PwindbgDisasm32 = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadProcessMemoryRoutine: PwindbgReadProcessMemoryRoutine32 = null,
    public var lpWriteProcessMemoryRoutine: PwindbgWriteProcessMemoryRoutine32 = null,
    public var lpGetThreadContextRoutine: PwindbgGetThreadContextRoutine = null,
    public var lpSetThreadContextRoutine: PwindbgSetThreadContextRoutine = null,
    public var lpIoctlRoutine: PwindbgIoctlRoutine = null,
    public var lpStackTraceRoutine: PwindbgStacktraceRoutine32 = null,
)

public data class WindbgExtensionApis64(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression64 = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol64 = null,
    public var lpDisasmRoutine: PwindbgDisasm64 = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadProcessMemoryRoutine: PwindbgReadProcessMemoryRoutine64 = null,
    public var lpWriteProcessMemoryRoutine: PwindbgWriteProcessMemoryRoutine64 = null,
    public var lpGetThreadContextRoutine: PwindbgGetThreadContextRoutine = null,
    public var lpSetThreadContextRoutine: PwindbgSetThreadContextRoutine = null,
    public var lpIoctlRoutine: PwindbgIoctlRoutine = null,
    public var lpStackTraceRoutine: PwindbgStacktraceRoutine64 = null,
)

public data class WindbgOldkdExtensionApis(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression32 = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol32 = null,
    public var lpDisasmRoutine: PwindbgDisasm32 = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
    public var lpReadVirtualMemRoutine: PwindbgReadProcessMemoryRoutine32 = null,
    public var lpWriteVirtualMemRoutine: PwindbgWriteProcessMemoryRoutine32 = null,
    public var lpReadPhysicalMemRoutine: PwindbgOldkdReadPhysicalMemory = null,
    public var lpWritePhysicalMemRoutine: PwindbgOldkdWritePhysicalMemory = null,
)

public data class WindbgOldExtensionApis(
    public var nSize: UInt = 0u,
    public var lpOutputRoutine: PwindbgOutputRoutine = null,
    public var lpGetExpressionRoutine: PwindbgGetExpression = null,
    public var lpGetSymbolRoutine: PwindbgGetSymbol = null,
    public var lpDisasmRoutine: PwindbgDisasm = null,
    public var lpCheckControlCRoutine: PwindbgCheckControlC = null,
)

public data class XmlDriverNodeInfo(
    public var fileName: ByteArray = ByteArray(64),
    public var fileSize: ULong = 0uL,
    public var creationDate: ULong = 0uL,
    public var version: ByteArray = ByteArray(64),
    public var manufacturer: ByteArray = ByteArray(260),
    public var productName: ByteArray = ByteArray(260),
    public var group: ByteArray = ByteArray(260),
    public var altitude: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XmlDriverNodeInfo) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.fileSize != other.fileSize) return false
        if (this.creationDate != other.creationDate) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.manufacturer.contentEquals(other.manufacturer)) return false
        if (!this.productName.contentEquals(other.productName)) return false
        if (!this.group.contentEquals(other.group)) return false
        if (!this.altitude.contentEquals(other.altitude)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileName.contentHashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.creationDate.hashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.manufacturer.contentHashCode()
        result = 31 * result + this.productName.contentHashCode()
        result = 31 * result + this.group.contentHashCode()
        result = 31 * result + this.altitude.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XmlDriverNodeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XmlDriverNodeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1184L
                override fun readNative(addr: Long): XmlDriverNodeInfo =
                    XmlDriverNodeInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 80L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 144L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 404L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 664L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 924L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: XmlDriverNodeInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr, value.fileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.creationDate)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 80L, value.version.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 144L, value.manufacturer.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 404L, value.productName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 664L, value.group.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 924L, value.altitude.toList())
                }
            }
    }
}
