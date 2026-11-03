@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.media

public data class MMTIME(public var wType: UInt = 0u, public var u: MMTIME_0 = MMTIME_0())

public data class MMTIME_0(
    public var ms: UInt = 0u,
    public var sample: UInt = 0u,
    public var cb: UInt = 0u,
    public var ticks: UInt = 0u,
    public var smpte: MMTIME_0_0 = MMTIME_0_0(),
    public var midi: MMTIME_0_1 = MMTIME_0_1(),
)

public data class MMTIME_0_1(public var songptrpos: UInt = 0u)

public data class MMTIME_0_0(
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
        if (other !is MMTIME_0_0) return false
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
}

public data class TIMECAPS(public var wPeriodMin: UInt = 0u, public var wPeriodMax: UInt = 0u)

public data class TIMECODE(public var Anonymous: TIMECODE_0 = TIMECODE_0(), public var qw: ULong = 0uL)

public data class TIMECODE_0(
    public var wFrameRate: UShort = 0u,
    public var wFrameFract: UShort = 0u,
    public var dwFrames: UInt = 0u,
)

public data class TIMECODE_SAMPLE(
    public var qwTick: Long = 0L,
    public var timecode: TIMECODE = TIMECODE(),
    public var dwUser: UInt = 0u,
    public var dwFlags: TIMECODE_SAMPLE_FLAGS = 0u,
)
