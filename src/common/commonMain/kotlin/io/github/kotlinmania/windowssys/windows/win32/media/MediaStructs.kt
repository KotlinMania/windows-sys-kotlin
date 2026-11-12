@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class Mmtime(
    public var wType: UInt = 0u,
    public var u: Mmtime0 = Mmtime0(),
)

public data class Mmtime0(
    public var ms: UInt = 0u,
    public var sample: UInt = 0u,
    public var cb: UInt = 0u,
    public var ticks: UInt = 0u,
    public var smpte: Mmtime00 = Mmtime00(),
    public var midi: Mmtime01 = Mmtime01(),
)

public data class Mmtime01(
    public var songptrpos: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmtime01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmtime01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Mmtime01 =
                    Mmtime01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Mmtime01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.songptrpos)
                }
            }
    }
}

public data class Mmtime00(
    public var hour: UByte = 0u,
    public var min: UByte = 0u,
    public var sec: UByte = 0u,
    public var frame: UByte = 0u,
    public var fps: UByte = 0u,
    public var dummy: UByte = 0u,
    public var pad: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mmtime00) return false
        if (this.hour != other.hour) return false
        if (this.min != other.min) return false
        if (this.sec != other.sec) return false
        if (this.frame != other.frame) return false
        if (this.fps != other.fps) return false
        if (this.dummy != other.dummy) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hour.hashCode()
        result = 31 * result + this.min.hashCode()
        result = 31 * result + this.sec.hashCode()
        result = 31 * result + this.frame.hashCode()
        result = 31 * result + this.fps.hashCode()
        result = 31 * result + this.dummy.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmtime00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmtime00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Mmtime00 =
                    Mmtime00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Mmtime00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.min)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.sec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.frame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.fps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.dummy)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.pad)
                }
            }
    }
}

public data class Timecaps(
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timecaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timecaps> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Timecaps =
                    Timecaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Timecaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wPeriodMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.wPeriodMax)
                }
            }
    }
}

public data class Timecode(
    public var anonymous: Timecode0 = Timecode0(),
    public var qw: ULong = 0uL,
)

public data class Timecode0(
    public var wFrameRate: UShort = 0u,
    public var wFrameFract: UShort = 0u,
    public var dwFrames: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timecode0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timecode0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Timecode0 =
                    Timecode0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Timecode0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wFrameRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wFrameFract)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFrames)
                }
            }
    }
}

public data class TimecodeSample(
    public var qwTick: Long = 0L,
    public var timecode: Timecode = Timecode(),
    public var dwUser: UInt = 0u,
    public var dwFlags: TimecodeSampleFlags = 0u,
)
