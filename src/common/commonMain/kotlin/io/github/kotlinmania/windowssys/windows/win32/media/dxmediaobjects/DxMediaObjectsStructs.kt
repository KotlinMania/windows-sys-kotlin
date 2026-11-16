package io.github.kotlinmania.windowssys.windows.win32.media.dxmediaobjects

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid

public class DmoMediaType internal constructor(
    public var majortype: Guid,
    public var subtype: Guid,
    public var bFixedSizeSamples: Bool,
    public var bTemporalCompression: Bool,
    public var lSampleSize: UInt,
    public var formattype: Guid,
    pUnkCtorArg: MutPtr,
    public var cbFormat: UInt,
    pbFormatCtorArg: MutPtr,
) {
    public var pUnk: MutPtr = pUnkCtorArg
        internal set

    public var pbFormat: MutPtr = pbFormatCtorArg
        internal set

    public constructor() : this(
        majortype = Guid(),
        subtype = Guid(),
        bFixedSizeSamples = 0,
        bTemporalCompression = 0,
        lSampleSize = 0u,
        formattype = Guid(),
        pUnkCtorArg = MutPtr(0L),
        cbFormat = 0u,
        pbFormatCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.majortype

    public operator fun component2(): Guid = this.subtype

    public operator fun component3(): Bool = this.bFixedSizeSamples

    public operator fun component4(): Bool = this.bTemporalCompression

    public operator fun component5(): UInt = this.lSampleSize

    public operator fun component6(): Guid = this.formattype

    public operator fun component7(): MutPtr = this.pUnk

    public operator fun component8(): UInt = this.cbFormat

    public operator fun component9(): MutPtr = this.pbFormat

    public fun copy(majortype: Guid = this.majortype, subtype: Guid = this.subtype, bFixedSizeSamples: Bool = this.bFixedSizeSamples, bTemporalCompression: Bool = this.bTemporalCompression, lSampleSize: UInt = this.lSampleSize, formattype: Guid = this.formattype, pUnk: MutPtr = this.pUnk, cbFormat: UInt = this.cbFormat, pbFormat: MutPtr = this.pbFormat): DmoMediaType = DmoMediaType(majortype = majortype, subtype = subtype, bFixedSizeSamples = bFixedSizeSamples, bTemporalCompression = bTemporalCompression, lSampleSize = lSampleSize, formattype = formattype, pUnkCtorArg = pUnk, cbFormat = cbFormat, pbFormatCtorArg = pbFormat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DmoMediaType) return false
        if (this.majortype != other.majortype) return false
        if (this.subtype != other.subtype) return false
        if (this.bFixedSizeSamples != other.bFixedSizeSamples) return false
        if (this.bTemporalCompression != other.bTemporalCompression) return false
        if (this.lSampleSize != other.lSampleSize) return false
        if (this.formattype != other.formattype) return false
        if (this.pUnk != other.pUnk) return false
        if (this.cbFormat != other.cbFormat) return false
        if (this.pbFormat != other.pbFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majortype.hashCode()
        result = 31 * result + this.subtype.hashCode()
        result = 31 * result + this.bFixedSizeSamples.hashCode()
        result = 31 * result + this.bTemporalCompression.hashCode()
        result = 31 * result + this.lSampleSize.hashCode()
        result = 31 * result + this.formattype.hashCode()
        result = 31 * result + this.pUnk.hashCode()
        result = 31 * result + this.cbFormat.hashCode()
        result = 31 * result + this.pbFormat.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            majortype: Guid = Guid(),
            subtype: Guid = Guid(),
            bFixedSizeSamples: Bool = 0,
            bTemporalCompression: Bool = 0,
            lSampleSize: UInt = 0u,
            formattype: Guid = Guid(),
            pUnk: MutPtr = MutPtr(0L),
            cbFormat: UInt = 0u,
            pbFormat: MutPtr = MutPtr(0L),
        ): DmoMediaType =
            DmoMediaType(
                majortype = majortype,
                subtype = subtype,
                bFixedSizeSamples = bFixedSizeSamples,
                bTemporalCompression = bTemporalCompression,
                lSampleSize = lSampleSize,
                formattype = formattype,
                pUnkCtorArg = pUnk,
                cbFormat = cbFormat,
                pbFormatCtorArg = pbFormat,
            )
    }
}

public class DmoOutputDataBuffer internal constructor(
    pBufferCtorArg: MutPtr,
    public var dwStatus: UInt,
    public var rtTimestamp: Long,
    public var rtTimelength: Long,
) {
    public var pBuffer: MutPtr = pBufferCtorArg
        internal set

    public constructor() : this(
        pBufferCtorArg = MutPtr(0L),
        dwStatus = 0u,
        rtTimestamp = 0L,
        rtTimelength = 0L,
    )

    public operator fun component1(): MutPtr = this.pBuffer

    public operator fun component2(): UInt = this.dwStatus

    public operator fun component3(): Long = this.rtTimestamp

    public operator fun component4(): Long = this.rtTimelength

    public fun copy(pBuffer: MutPtr = this.pBuffer, dwStatus: UInt = this.dwStatus, rtTimestamp: Long = this.rtTimestamp, rtTimelength: Long = this.rtTimelength): DmoOutputDataBuffer = DmoOutputDataBuffer(pBufferCtorArg = pBuffer, dwStatus = dwStatus, rtTimestamp = rtTimestamp, rtTimelength = rtTimelength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DmoOutputDataBuffer) return false
        if (this.pBuffer != other.pBuffer) return false
        if (this.dwStatus != other.dwStatus) return false
        if (this.rtTimestamp != other.rtTimestamp) return false
        if (this.rtTimelength != other.rtTimelength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pBuffer.hashCode()
        result = 31 * result + this.dwStatus.hashCode()
        result = 31 * result + this.rtTimestamp.hashCode()
        result = 31 * result + this.rtTimelength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmoOutputDataBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DmoOutputDataBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DmoOutputDataBuffer =
                    DmoOutputDataBuffer(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DmoOutputDataBuffer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.rtTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.rtTimelength)
                }
            }

        public operator fun invoke(
            pBuffer: MutPtr = MutPtr(0L),
            dwStatus: UInt = 0u,
            rtTimestamp: Long = 0L,
            rtTimelength: Long = 0L,
        ): DmoOutputDataBuffer =
            DmoOutputDataBuffer(
                pBufferCtorArg = pBuffer,
                dwStatus = dwStatus,
                rtTimestamp = rtTimestamp,
                rtTimelength = rtTimelength,
            )
    }
}

public data class DmoPartialMediatype(
    public var type: Guid = Guid(),
    public var subtype: Guid = Guid(),
)
