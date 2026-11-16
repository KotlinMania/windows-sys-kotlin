@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfoheader
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.media.Htask
import io.github.kotlinmania.windowssys.windows.win32.media.Lptimecallback
import io.github.kotlinmania.windowssys.windows.win32.media.audio.Hmixer
import io.github.kotlinmania.windowssys.windows.win32.media.audio.Hwave
import io.github.kotlinmania.windowssys.windows.win32.media.audio.Waveformatex

public data class Adpcmcoefset(
    public var iCoef1: Short = 0,
    public var iCoef2: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adpcmcoefset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adpcmcoefset> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Adpcmcoefset =
                    Adpcmcoefset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Adpcmcoefset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.iCoef1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.iCoef2)
                }
            }
    }
}

public data class Adpcmewaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public data class Adpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
    public var wNumCoef: UShort = 0u,
    public var aCoef: List<Adpcmcoefset> = List(1) { Adpcmcoefset() },
)

public data class Aptxwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class AudiofileAf10waveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class AudiofileAf36waveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public class Avicompressoptions internal constructor(
    public var fccType: UInt,
    public var fccHandler: UInt,
    public var dwKeyFrameEvery: UInt,
    public var dwQuality: UInt,
    public var dwBytesPerSecond: UInt,
    public var dwFlags: UInt,
    lpFormatCtorArg: MutPtr,
    public var cbFormat: UInt,
    lpParmsCtorArg: MutPtr,
    public var cbParms: UInt,
    public var dwInterleaveEvery: UInt,
) {
    public var lpFormat: MutPtr = lpFormatCtorArg
        internal set

    public var lpParms: MutPtr = lpParmsCtorArg
        internal set

    public constructor() : this(
        fccType = 0u,
        fccHandler = 0u,
        dwKeyFrameEvery = 0u,
        dwQuality = 0u,
        dwBytesPerSecond = 0u,
        dwFlags = 0u,
        lpFormatCtorArg = MutPtr(0L),
        cbFormat = 0u,
        lpParmsCtorArg = MutPtr(0L),
        cbParms = 0u,
        dwInterleaveEvery = 0u,
    )

    public operator fun component1(): UInt = this.fccType

    public operator fun component2(): UInt = this.fccHandler

    public operator fun component3(): UInt = this.dwKeyFrameEvery

    public operator fun component4(): UInt = this.dwQuality

    public operator fun component5(): UInt = this.dwBytesPerSecond

    public operator fun component6(): UInt = this.dwFlags

    public operator fun component7(): MutPtr = this.lpFormat

    public operator fun component8(): UInt = this.cbFormat

    public operator fun component9(): MutPtr = this.lpParms

    public operator fun component10(): UInt = this.cbParms

    public operator fun component11(): UInt = this.dwInterleaveEvery

    public fun copy(fccType: UInt = this.fccType, fccHandler: UInt = this.fccHandler, dwKeyFrameEvery: UInt = this.dwKeyFrameEvery, dwQuality: UInt = this.dwQuality, dwBytesPerSecond: UInt = this.dwBytesPerSecond, dwFlags: UInt = this.dwFlags, lpFormat: MutPtr = this.lpFormat, cbFormat: UInt = this.cbFormat, lpParms: MutPtr = this.lpParms, cbParms: UInt = this.cbParms, dwInterleaveEvery: UInt = this.dwInterleaveEvery): Avicompressoptions = Avicompressoptions(fccType = fccType, fccHandler = fccHandler, dwKeyFrameEvery = dwKeyFrameEvery, dwQuality = dwQuality, dwBytesPerSecond = dwBytesPerSecond, dwFlags = dwFlags, lpFormatCtorArg = lpFormat, cbFormat = cbFormat, lpParmsCtorArg = lpParms, cbParms = cbParms, dwInterleaveEvery = dwInterleaveEvery)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Avicompressoptions) return false
        if (this.fccType != other.fccType) return false
        if (this.fccHandler != other.fccHandler) return false
        if (this.dwKeyFrameEvery != other.dwKeyFrameEvery) return false
        if (this.dwQuality != other.dwQuality) return false
        if (this.dwBytesPerSecond != other.dwBytesPerSecond) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpFormat != other.lpFormat) return false
        if (this.cbFormat != other.cbFormat) return false
        if (this.lpParms != other.lpParms) return false
        if (this.cbParms != other.cbParms) return false
        if (this.dwInterleaveEvery != other.dwInterleaveEvery) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fccType.hashCode()
        result = 31 * result + this.fccHandler.hashCode()
        result = 31 * result + this.dwKeyFrameEvery.hashCode()
        result = 31 * result + this.dwQuality.hashCode()
        result = 31 * result + this.dwBytesPerSecond.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpFormat.hashCode()
        result = 31 * result + this.cbFormat.hashCode()
        result = 31 * result + this.lpParms.hashCode()
        result = 31 * result + this.cbParms.hashCode()
        result = 31 * result + this.dwInterleaveEvery.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Avicompressoptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Avicompressoptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Avicompressoptions =
                    Avicompressoptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: Avicompressoptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fccType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fccHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwKeyFrameEvery)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwBytesPerSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.lpParms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbParms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwInterleaveEvery)
                }
            }

        public operator fun invoke(
            fccType: UInt = 0u,
            fccHandler: UInt = 0u,
            dwKeyFrameEvery: UInt = 0u,
            dwQuality: UInt = 0u,
            dwBytesPerSecond: UInt = 0u,
            dwFlags: UInt = 0u,
            lpFormat: MutPtr = MutPtr(0L),
            cbFormat: UInt = 0u,
            lpParms: MutPtr = MutPtr(0L),
            cbParms: UInt = 0u,
            dwInterleaveEvery: UInt = 0u,
        ): Avicompressoptions =
            Avicompressoptions(
                fccType = fccType,
                fccHandler = fccHandler,
                dwKeyFrameEvery = dwKeyFrameEvery,
                dwQuality = dwQuality,
                dwBytesPerSecond = dwBytesPerSecond,
                dwFlags = dwFlags,
                lpFormatCtorArg = lpFormat,
                cbFormat = cbFormat,
                lpParmsCtorArg = lpParms,
                cbParms = cbParms,
                dwInterleaveEvery = dwInterleaveEvery,
            )
    }
}

public data class Avifileinfoa(
    public var dwMaxBytesPerSec: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var dwStreams: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwEditCount: UInt = 0u,
    public var szFileType: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Avifileinfoa) return false
        if (this.dwMaxBytesPerSec != other.dwMaxBytesPerSec) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCaps != other.dwCaps) return false
        if (this.dwStreams != other.dwStreams) return false
        if (this.dwSuggestedBufferSize != other.dwSuggestedBufferSize) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwScale != other.dwScale) return false
        if (this.dwRate != other.dwRate) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwEditCount != other.dwEditCount) return false
        if (!this.szFileType.contentEquals(other.szFileType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMaxBytesPerSec.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwCaps.hashCode()
        result = 31 * result + this.dwStreams.hashCode()
        result = 31 * result + this.dwSuggestedBufferSize.hashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwScale.hashCode()
        result = 31 * result + this.dwRate.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.dwEditCount.hashCode()
        result = 31 * result + this.szFileType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Avifileinfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Avifileinfoa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 108L
                override fun readNative(addr: Long): Avifileinfoa =
                    Avifileinfoa(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 44L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Avifileinfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMaxBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSuggestedBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwEditCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 44L, value.szFileType.toList())
                }
            }
    }
}

public data class Avifileinfow(
    public var dwMaxBytesPerSec: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var dwStreams: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwEditCount: UInt = 0u,
    public var szFileType: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Avifileinfow) return false
        if (this.dwMaxBytesPerSec != other.dwMaxBytesPerSec) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCaps != other.dwCaps) return false
        if (this.dwStreams != other.dwStreams) return false
        if (this.dwSuggestedBufferSize != other.dwSuggestedBufferSize) return false
        if (this.dwWidth != other.dwWidth) return false
        if (this.dwHeight != other.dwHeight) return false
        if (this.dwScale != other.dwScale) return false
        if (this.dwRate != other.dwRate) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwEditCount != other.dwEditCount) return false
        if (!this.szFileType.contentEquals(other.szFileType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMaxBytesPerSec.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwCaps.hashCode()
        result = 31 * result + this.dwStreams.hashCode()
        result = 31 * result + this.dwSuggestedBufferSize.hashCode()
        result = 31 * result + this.dwWidth.hashCode()
        result = 31 * result + this.dwHeight.hashCode()
        result = 31 * result + this.dwScale.hashCode()
        result = 31 * result + this.dwRate.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.dwEditCount.hashCode()
        result = 31 * result + this.szFileType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Avifileinfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Avifileinfow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 172L
                override fun readNative(addr: Long): Avifileinfow =
                    Avifileinfow(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 44L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Avifileinfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMaxBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSuggestedBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwEditCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 44L, value.szFileType.toList())
                }
            }
    }
}

public class Avistreaminfoa(
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var wPriority: UShort = 0u,
    public var wLanguage: UShort = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwStart: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwInitialFrames: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var dwSampleSize: UInt = 0u,
    public var rcFrame: Rect = Rect(),
    public var dwEditCount: UInt = 0u,
    public var dwFormatChangeCount: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
)

public class Avistreaminfow(
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCaps: UInt = 0u,
    public var wPriority: UShort = 0u,
    public var wLanguage: UShort = 0u,
    public var dwScale: UInt = 0u,
    public var dwRate: UInt = 0u,
    public var dwStart: UInt = 0u,
    public var dwLength: UInt = 0u,
    public var dwInitialFrames: UInt = 0u,
    public var dwSuggestedBufferSize: UInt = 0u,
    public var dwQuality: UInt = 0u,
    public var dwSampleSize: UInt = 0u,
    public var rcFrame: Rect = Rect(),
    public var dwEditCount: UInt = 0u,
    public var dwFormatChangeCount: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
)

public class Capdrivercaps internal constructor(
    public var wDeviceIndex: UInt,
    public var fHasOverlay: Bool,
    public var fHasDlgVideoSource: Bool,
    public var fHasDlgVideoFormat: Bool,
    public var fHasDlgVideoDisplay: Bool,
    public var fCaptureInitialized: Bool,
    public var fDriverSuppliesPalettes: Bool,
    hVideoInCtorArg: Handle,
    hVideoOutCtorArg: Handle,
    hVideoExtInCtorArg: Handle,
    hVideoExtOutCtorArg: Handle,
) {
    public var hVideoIn: Handle = hVideoInCtorArg
        internal set

    public var hVideoOut: Handle = hVideoOutCtorArg
        internal set

    public var hVideoExtIn: Handle = hVideoExtInCtorArg
        internal set

    public var hVideoExtOut: Handle = hVideoExtOutCtorArg
        internal set

    public constructor() : this(
        wDeviceIndex = 0u,
        fHasOverlay = 0,
        fHasDlgVideoSource = 0,
        fHasDlgVideoFormat = 0,
        fHasDlgVideoDisplay = 0,
        fCaptureInitialized = 0,
        fDriverSuppliesPalettes = 0,
        hVideoInCtorArg = MutPtr(0L),
        hVideoOutCtorArg = MutPtr(0L),
        hVideoExtInCtorArg = MutPtr(0L),
        hVideoExtOutCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.wDeviceIndex

    public operator fun component2(): Bool = this.fHasOverlay

    public operator fun component3(): Bool = this.fHasDlgVideoSource

    public operator fun component4(): Bool = this.fHasDlgVideoFormat

    public operator fun component5(): Bool = this.fHasDlgVideoDisplay

    public operator fun component6(): Bool = this.fCaptureInitialized

    public operator fun component7(): Bool = this.fDriverSuppliesPalettes

    public operator fun component8(): Handle = this.hVideoIn

    public operator fun component9(): Handle = this.hVideoOut

    public operator fun component10(): Handle = this.hVideoExtIn

    public operator fun component11(): Handle = this.hVideoExtOut

    public fun copy(wDeviceIndex: UInt = this.wDeviceIndex, fHasOverlay: Bool = this.fHasOverlay, fHasDlgVideoSource: Bool = this.fHasDlgVideoSource, fHasDlgVideoFormat: Bool = this.fHasDlgVideoFormat, fHasDlgVideoDisplay: Bool = this.fHasDlgVideoDisplay, fCaptureInitialized: Bool = this.fCaptureInitialized, fDriverSuppliesPalettes: Bool = this.fDriverSuppliesPalettes, hVideoIn: Handle = this.hVideoIn, hVideoOut: Handle = this.hVideoOut, hVideoExtIn: Handle = this.hVideoExtIn, hVideoExtOut: Handle = this.hVideoExtOut): Capdrivercaps = Capdrivercaps(wDeviceIndex = wDeviceIndex, fHasOverlay = fHasOverlay, fHasDlgVideoSource = fHasDlgVideoSource, fHasDlgVideoFormat = fHasDlgVideoFormat, fHasDlgVideoDisplay = fHasDlgVideoDisplay, fCaptureInitialized = fCaptureInitialized, fDriverSuppliesPalettes = fDriverSuppliesPalettes, hVideoInCtorArg = hVideoIn, hVideoOutCtorArg = hVideoOut, hVideoExtInCtorArg = hVideoExtIn, hVideoExtOutCtorArg = hVideoExtOut)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Capdrivercaps) return false
        if (this.wDeviceIndex != other.wDeviceIndex) return false
        if (this.fHasOverlay != other.fHasOverlay) return false
        if (this.fHasDlgVideoSource != other.fHasDlgVideoSource) return false
        if (this.fHasDlgVideoFormat != other.fHasDlgVideoFormat) return false
        if (this.fHasDlgVideoDisplay != other.fHasDlgVideoDisplay) return false
        if (this.fCaptureInitialized != other.fCaptureInitialized) return false
        if (this.fDriverSuppliesPalettes != other.fDriverSuppliesPalettes) return false
        if (this.hVideoIn != other.hVideoIn) return false
        if (this.hVideoOut != other.hVideoOut) return false
        if (this.hVideoExtIn != other.hVideoExtIn) return false
        if (this.hVideoExtOut != other.hVideoExtOut) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wDeviceIndex.hashCode()
        result = 31 * result + this.fHasOverlay.hashCode()
        result = 31 * result + this.fHasDlgVideoSource.hashCode()
        result = 31 * result + this.fHasDlgVideoFormat.hashCode()
        result = 31 * result + this.fHasDlgVideoDisplay.hashCode()
        result = 31 * result + this.fCaptureInitialized.hashCode()
        result = 31 * result + this.fDriverSuppliesPalettes.hashCode()
        result = 31 * result + this.hVideoIn.hashCode()
        result = 31 * result + this.hVideoOut.hashCode()
        result = 31 * result + this.hVideoExtIn.hashCode()
        result = 31 * result + this.hVideoExtOut.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wDeviceIndex: UInt = 0u,
            fHasOverlay: Bool = 0,
            fHasDlgVideoSource: Bool = 0,
            fHasDlgVideoFormat: Bool = 0,
            fHasDlgVideoDisplay: Bool = 0,
            fCaptureInitialized: Bool = 0,
            fDriverSuppliesPalettes: Bool = 0,
            hVideoIn: Handle = MutPtr(0L),
            hVideoOut: Handle = MutPtr(0L),
            hVideoExtIn: Handle = MutPtr(0L),
            hVideoExtOut: Handle = MutPtr(0L),
        ): Capdrivercaps =
            Capdrivercaps(
                wDeviceIndex = wDeviceIndex,
                fHasOverlay = fHasOverlay,
                fHasDlgVideoSource = fHasDlgVideoSource,
                fHasDlgVideoFormat = fHasDlgVideoFormat,
                fHasDlgVideoDisplay = fHasDlgVideoDisplay,
                fCaptureInitialized = fCaptureInitialized,
                fDriverSuppliesPalettes = fDriverSuppliesPalettes,
                hVideoInCtorArg = hVideoIn,
                hVideoOutCtorArg = hVideoOut,
                hVideoExtInCtorArg = hVideoExtIn,
                hVideoExtOutCtorArg = hVideoExtOut,
            )
    }
}

public class Capinfochunk internal constructor(
    public var fccInfoID: UInt,
    lpDataCtorArg: MutPtr,
    public var cbData: Int,
) {
    public var lpData: MutPtr = lpDataCtorArg
        internal set

    public constructor() : this(
        fccInfoID = 0u,
        lpDataCtorArg = MutPtr(0L),
        cbData = 0,
    )

    public operator fun component1(): UInt = this.fccInfoID

    public operator fun component2(): MutPtr = this.lpData

    public operator fun component3(): Int = this.cbData

    public fun copy(fccInfoID: UInt = this.fccInfoID, lpData: MutPtr = this.lpData, cbData: Int = this.cbData): Capinfochunk = Capinfochunk(fccInfoID = fccInfoID, lpDataCtorArg = lpData, cbData = cbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Capinfochunk) return false
        if (this.fccInfoID != other.fccInfoID) return false
        if (this.lpData != other.lpData) return false
        if (this.cbData != other.cbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fccInfoID.hashCode()
        result = 31 * result + this.lpData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Capinfochunk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Capinfochunk> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Capinfochunk =
                    Capinfochunk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Capinfochunk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fccInfoID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cbData)
                }
            }

        public operator fun invoke(
            fccInfoID: UInt = 0u,
            lpData: MutPtr = MutPtr(0L),
            cbData: Int = 0,
        ): Capinfochunk =
            Capinfochunk(
                fccInfoID = fccInfoID,
                lpDataCtorArg = lpData,
                cbData = cbData,
            )
    }
}

public class Capstatus internal constructor(
    public var uiImageWidth: UInt,
    public var uiImageHeight: UInt,
    public var fLiveWindow: Bool,
    public var fOverlayWindow: Bool,
    public var fScale: Bool,
    public var ptScroll: Point,
    public var fUsingDefaultPalette: Bool,
    public var fAudioHardware: Bool,
    public var fCapFileExists: Bool,
    public var dwCurrentVideoFrame: UInt,
    public var dwCurrentVideoFramesDropped: UInt,
    public var dwCurrentWaveSamples: UInt,
    public var dwCurrentTimeElapsedMS: UInt,
    hPalCurrentCtorArg: Hpalette,
    public var fCapturingNow: Bool,
    public var dwReturn: UInt,
    public var wNumVideoAllocated: UInt,
    public var wNumAudioAllocated: UInt,
) {
    public var hPalCurrent: Hpalette = hPalCurrentCtorArg
        internal set

    public constructor() : this(
        uiImageWidth = 0u,
        uiImageHeight = 0u,
        fLiveWindow = 0,
        fOverlayWindow = 0,
        fScale = 0,
        ptScroll = Point(),
        fUsingDefaultPalette = 0,
        fAudioHardware = 0,
        fCapFileExists = 0,
        dwCurrentVideoFrame = 0u,
        dwCurrentVideoFramesDropped = 0u,
        dwCurrentWaveSamples = 0u,
        dwCurrentTimeElapsedMS = 0u,
        hPalCurrentCtorArg = MutPtr(0L),
        fCapturingNow = 0,
        dwReturn = 0u,
        wNumVideoAllocated = 0u,
        wNumAudioAllocated = 0u,
    )

    public companion object {
        public operator fun invoke(
            uiImageWidth: UInt = 0u,
            uiImageHeight: UInt = 0u,
            fLiveWindow: Bool = 0,
            fOverlayWindow: Bool = 0,
            fScale: Bool = 0,
            ptScroll: Point = Point(),
            fUsingDefaultPalette: Bool = 0,
            fAudioHardware: Bool = 0,
            fCapFileExists: Bool = 0,
            dwCurrentVideoFrame: UInt = 0u,
            dwCurrentVideoFramesDropped: UInt = 0u,
            dwCurrentWaveSamples: UInt = 0u,
            dwCurrentTimeElapsedMS: UInt = 0u,
            hPalCurrent: Hpalette = MutPtr(0L),
            fCapturingNow: Bool = 0,
            dwReturn: UInt = 0u,
            wNumVideoAllocated: UInt = 0u,
            wNumAudioAllocated: UInt = 0u,
        ): Capstatus =
            Capstatus(
                uiImageWidth = uiImageWidth,
                uiImageHeight = uiImageHeight,
                fLiveWindow = fLiveWindow,
                fOverlayWindow = fOverlayWindow,
                fScale = fScale,
                ptScroll = ptScroll,
                fUsingDefaultPalette = fUsingDefaultPalette,
                fAudioHardware = fAudioHardware,
                fCapFileExists = fCapFileExists,
                dwCurrentVideoFrame = dwCurrentVideoFrame,
                dwCurrentVideoFramesDropped = dwCurrentVideoFramesDropped,
                dwCurrentWaveSamples = dwCurrentWaveSamples,
                dwCurrentTimeElapsedMS = dwCurrentTimeElapsedMS,
                hPalCurrentCtorArg = hPalCurrent,
                fCapturingNow = fCapturingNow,
                dwReturn = dwReturn,
                wNumVideoAllocated = wNumVideoAllocated,
                wNumAudioAllocated = wNumAudioAllocated,
            )
    }
}

public class Captureparms(
    public var dwRequestMicroSecPerFrame: UInt = 0u,
    public var fMakeUserHitOKToCapture: Bool = 0,
    public var wPercentDropForError: UInt = 0u,
    public var fYield: Bool = 0,
    public var dwIndexSize: UInt = 0u,
    public var wChunkGranularity: UInt = 0u,
    public var fUsingDOSMemory: Bool = 0,
    public var wNumVideoRequested: UInt = 0u,
    public var fCaptureAudio: Bool = 0,
    public var wNumAudioRequested: UInt = 0u,
    public var vKeyAbort: UInt = 0u,
    public var fAbortLeftMouse: Bool = 0,
    public var fAbortRightMouse: Bool = 0,
    public var fLimitEnabled: Bool = 0,
    public var wTimeLimit: UInt = 0u,
    public var fMCIControl: Bool = 0,
    public var fStepMCIDevice: Bool = 0,
    public var dwMCIStartTime: UInt = 0u,
    public var dwMCIStopTime: UInt = 0u,
    public var fStepCaptureAt2x: Bool = 0,
    public var wStepCaptureAverageFrames: UInt = 0u,
    public var dwAudioBufferSize: UInt = 0u,
    public var fDisableWriteCache: Bool = 0,
    public var aVStreamMaster: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Captureparms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Captureparms> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): Captureparms =
                    Captureparms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: Captureparms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRequestMicroSecPerFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fMakeUserHitOKToCapture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.wPercentDropForError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.fYield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwIndexSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.wChunkGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fUsingDOSMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.wNumVideoRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.fCaptureAudio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.wNumAudioRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.vKeyAbort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.fAbortLeftMouse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.fAbortRightMouse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.fLimitEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.wTimeLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.fMCIControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.fStepMCIDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwMCIStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwMCIStopTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.fStepCaptureAt2x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.wStepCaptureAverageFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwAudioBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.fDisableWriteCache)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.aVStreamMaster)
                }
            }
    }
}

public data class ChannelCaps(
    public var dwFlags: UInt = 0u,
    public var dwSrcRectXMod: UInt = 0u,
    public var dwSrcRectYMod: UInt = 0u,
    public var dwSrcRectWidthMod: UInt = 0u,
    public var dwSrcRectHeightMod: UInt = 0u,
    public var dwDstRectXMod: UInt = 0u,
    public var dwDstRectYMod: UInt = 0u,
    public var dwDstRectWidthMod: UInt = 0u,
    public var dwDstRectHeightMod: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): ChannelCaps =
                    ChannelCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ChannelCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSrcRectXMod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSrcRectYMod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSrcRectWidthMod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSrcRectHeightMod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwDstRectXMod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwDstRectYMod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwDstRectWidthMod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwDstRectHeightMod)
                }
            }
    }
}

public class Compvars internal constructor(
    public var cbSize: Int,
    public var dwFlags: UInt,
    hicCtorArg: Hic,
    public var fccType: UInt,
    public var fccHandler: UInt,
    lpbiInCtorArg: MutPtr,
    lpbiOutCtorArg: MutPtr,
    lpBitsOutCtorArg: MutPtr,
    lpBitsPrevCtorArg: MutPtr,
    public var lFrame: Int,
    public var lKey: Int,
    public var lDataRate: Int,
    public var lQ: Int,
    public var lKeyCount: Int,
    lpStateCtorArg: MutPtr,
    public var cbState: Int,
) {
    public var hic: Hic = hicCtorArg
        internal set

    public var lpbiIn: MutPtr = lpbiInCtorArg
        internal set

    public var lpbiOut: MutPtr = lpbiOutCtorArg
        internal set

    public var lpBitsOut: MutPtr = lpBitsOutCtorArg
        internal set

    public var lpBitsPrev: MutPtr = lpBitsPrevCtorArg
        internal set

    public var lpState: MutPtr = lpStateCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        dwFlags = 0u,
        hicCtorArg = MutPtr(0L),
        fccType = 0u,
        fccHandler = 0u,
        lpbiInCtorArg = MutPtr(0L),
        lpbiOutCtorArg = MutPtr(0L),
        lpBitsOutCtorArg = MutPtr(0L),
        lpBitsPrevCtorArg = MutPtr(0L),
        lFrame = 0,
        lKey = 0,
        lDataRate = 0,
        lQ = 0,
        lKeyCount = 0,
        lpStateCtorArg = MutPtr(0L),
        cbState = 0,
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hic = this.hic

    public operator fun component4(): UInt = this.fccType

    public operator fun component5(): UInt = this.fccHandler

    public operator fun component6(): MutPtr = this.lpbiIn

    public operator fun component7(): MutPtr = this.lpbiOut

    public operator fun component8(): MutPtr = this.lpBitsOut

    public operator fun component9(): MutPtr = this.lpBitsPrev

    public operator fun component10(): Int = this.lFrame

    public operator fun component11(): Int = this.lKey

    public operator fun component12(): Int = this.lDataRate

    public operator fun component13(): Int = this.lQ

    public operator fun component14(): Int = this.lKeyCount

    public operator fun component15(): MutPtr = this.lpState

    public operator fun component16(): Int = this.cbState

    public fun copy(cbSize: Int = this.cbSize, dwFlags: UInt = this.dwFlags, hic: Hic = this.hic, fccType: UInt = this.fccType, fccHandler: UInt = this.fccHandler, lpbiIn: MutPtr = this.lpbiIn, lpbiOut: MutPtr = this.lpbiOut, lpBitsOut: MutPtr = this.lpBitsOut, lpBitsPrev: MutPtr = this.lpBitsPrev, lFrame: Int = this.lFrame, lKey: Int = this.lKey, lDataRate: Int = this.lDataRate, lQ: Int = this.lQ, lKeyCount: Int = this.lKeyCount, lpState: MutPtr = this.lpState, cbState: Int = this.cbState): Compvars = Compvars(cbSize = cbSize, dwFlags = dwFlags, hicCtorArg = hic, fccType = fccType, fccHandler = fccHandler, lpbiInCtorArg = lpbiIn, lpbiOutCtorArg = lpbiOut, lpBitsOutCtorArg = lpBitsOut, lpBitsPrevCtorArg = lpBitsPrev, lFrame = lFrame, lKey = lKey, lDataRate = lDataRate, lQ = lQ, lKeyCount = lKeyCount, lpStateCtorArg = lpState, cbState = cbState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Compvars) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hic != other.hic) return false
        if (this.fccType != other.fccType) return false
        if (this.fccHandler != other.fccHandler) return false
        if (this.lpbiIn != other.lpbiIn) return false
        if (this.lpbiOut != other.lpbiOut) return false
        if (this.lpBitsOut != other.lpBitsOut) return false
        if (this.lpBitsPrev != other.lpBitsPrev) return false
        if (this.lFrame != other.lFrame) return false
        if (this.lKey != other.lKey) return false
        if (this.lDataRate != other.lDataRate) return false
        if (this.lQ != other.lQ) return false
        if (this.lKeyCount != other.lKeyCount) return false
        if (this.lpState != other.lpState) return false
        if (this.cbState != other.cbState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hic.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccHandler.hashCode()
        result = 31 * result + this.lpbiIn.hashCode()
        result = 31 * result + this.lpbiOut.hashCode()
        result = 31 * result + this.lpBitsOut.hashCode()
        result = 31 * result + this.lpBitsPrev.hashCode()
        result = 31 * result + this.lFrame.hashCode()
        result = 31 * result + this.lKey.hashCode()
        result = 31 * result + this.lDataRate.hashCode()
        result = 31 * result + this.lQ.hashCode()
        result = 31 * result + this.lKeyCount.hashCode()
        result = 31 * result + this.lpState.hashCode()
        result = 31 * result + this.cbState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Compvars> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Compvars> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): Compvars =
                    Compvars(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: Compvars) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.hic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fccType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.fccHandler)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpbiIn)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.lpbiOut)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.lpBitsOut)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.lpBitsPrev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.lFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.lKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.lDataRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.lQ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.lKeyCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 80L, value.lpState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.cbState)
                }
            }

        public operator fun invoke(
            cbSize: Int = 0,
            dwFlags: UInt = 0u,
            hic: Hic = MutPtr(0L),
            fccType: UInt = 0u,
            fccHandler: UInt = 0u,
            lpbiIn: MutPtr = MutPtr(0L),
            lpbiOut: MutPtr = MutPtr(0L),
            lpBitsOut: MutPtr = MutPtr(0L),
            lpBitsPrev: MutPtr = MutPtr(0L),
            lFrame: Int = 0,
            lKey: Int = 0,
            lDataRate: Int = 0,
            lQ: Int = 0,
            lKeyCount: Int = 0,
            lpState: MutPtr = MutPtr(0L),
            cbState: Int = 0,
        ): Compvars =
            Compvars(
                cbSize = cbSize,
                dwFlags = dwFlags,
                hicCtorArg = hic,
                fccType = fccType,
                fccHandler = fccHandler,
                lpbiInCtorArg = lpbiIn,
                lpbiOutCtorArg = lpbiOut,
                lpBitsOutCtorArg = lpBitsOut,
                lpBitsPrevCtorArg = lpBitsPrev,
                lFrame = lFrame,
                lKey = lKey,
                lDataRate = lDataRate,
                lQ = lQ,
                lKeyCount = lKeyCount,
                lpStateCtorArg = lpState,
                cbState = cbState,
            )
    }
}

public data class Contrescr10waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public data class Contresvqlpcwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public data class Creativeadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
)

public data class Creativefastspeech10waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
)

public data class Creativefastspeech8waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
)

public data class Csimaadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Dialogicokiadpcmwaveformat(
    public var ewf: Waveformatex = Waveformatex(),
)

public data class Digiadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public data class Digifixwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Digirealwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public data class Digistdwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Dolbyac2waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var nAuxBitsCode: UShort = 0u,
)

public data class Drawdibtime(
    public var timeCount: Int = 0,
    public var timeDraw: Int = 0,
    public var timeDecompress: Int = 0,
    public var timeDither: Int = 0,
    public var timeStretch: Int = 0,
    public var timeBlt: Int = 0,
    public var timeSetDIBits: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Drawdibtime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Drawdibtime> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Drawdibtime =
                    Drawdibtime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Drawdibtime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.timeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.timeDraw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.timeDecompress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.timeDither)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.timeStretch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.timeBlt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.timeSetDIBits)
                }
            }
    }
}

public data class Drmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wReserved: UShort = 0u,
    public var ulContentId: UInt = 0u,
    public var wfxSecure: Waveformatex = Waveformatex(),
)

public class Drvconfiginfo internal constructor(
    public var dwDCISize: UInt,
    lpszDCISectionNameCtorArg: Pcwstr,
    lpszDCIAliasNameCtorArg: Pcwstr,
) {
    public var lpszDCISectionName: Pcwstr = lpszDCISectionNameCtorArg
        internal set

    public var lpszDCIAliasName: Pcwstr = lpszDCIAliasNameCtorArg
        internal set

    public constructor() : this(
        dwDCISize = 0u,
        lpszDCISectionNameCtorArg = ConstPtr(0L),
        lpszDCIAliasNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwDCISize

    public operator fun component2(): Pcwstr = this.lpszDCISectionName

    public operator fun component3(): Pcwstr = this.lpszDCIAliasName

    public fun copy(dwDCISize: UInt = this.dwDCISize, lpszDCISectionName: Pcwstr = this.lpszDCISectionName, lpszDCIAliasName: Pcwstr = this.lpszDCIAliasName): Drvconfiginfo = Drvconfiginfo(dwDCISize = dwDCISize, lpszDCISectionNameCtorArg = lpszDCISectionName, lpszDCIAliasNameCtorArg = lpszDCIAliasName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Drvconfiginfo) return false
        if (this.dwDCISize != other.dwDCISize) return false
        if (this.lpszDCISectionName != other.lpszDCISectionName) return false
        if (this.lpszDCIAliasName != other.lpszDCIAliasName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDCISize.hashCode()
        result = 31 * result + this.lpszDCISectionName.hashCode()
        result = 31 * result + this.lpszDCIAliasName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwDCISize: UInt = 0u,
            lpszDCISectionName: Pcwstr = ConstPtr(0L),
            lpszDCIAliasName: Pcwstr = ConstPtr(0L),
        ): Drvconfiginfo =
            Drvconfiginfo(
                dwDCISize = dwDCISize,
                lpszDCISectionNameCtorArg = lpszDCISectionName,
                lpszDCIAliasNameCtorArg = lpszDCIAliasName,
            )
    }
}

public class Drvconfiginfoex internal constructor(
    public var dwDCISize: UInt,
    lpszDCISectionNameCtorArg: Pcwstr,
    lpszDCIAliasNameCtorArg: Pcwstr,
    public var dnDevNode: UInt,
) {
    public var lpszDCISectionName: Pcwstr = lpszDCISectionNameCtorArg
        internal set

    public var lpszDCIAliasName: Pcwstr = lpszDCIAliasNameCtorArg
        internal set

    public constructor() : this(
        dwDCISize = 0u,
        lpszDCISectionNameCtorArg = ConstPtr(0L),
        lpszDCIAliasNameCtorArg = ConstPtr(0L),
        dnDevNode = 0u,
    )

    public operator fun component1(): UInt = this.dwDCISize

    public operator fun component2(): Pcwstr = this.lpszDCISectionName

    public operator fun component3(): Pcwstr = this.lpszDCIAliasName

    public operator fun component4(): UInt = this.dnDevNode

    public fun copy(dwDCISize: UInt = this.dwDCISize, lpszDCISectionName: Pcwstr = this.lpszDCISectionName, lpszDCIAliasName: Pcwstr = this.lpszDCIAliasName, dnDevNode: UInt = this.dnDevNode): Drvconfiginfoex = Drvconfiginfoex(dwDCISize = dwDCISize, lpszDCISectionNameCtorArg = lpszDCISectionName, lpszDCIAliasNameCtorArg = lpszDCIAliasName, dnDevNode = dnDevNode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Drvconfiginfoex) return false
        if (this.dwDCISize != other.dwDCISize) return false
        if (this.lpszDCISectionName != other.lpszDCISectionName) return false
        if (this.lpszDCIAliasName != other.lpszDCIAliasName) return false
        if (this.dnDevNode != other.dnDevNode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDCISize.hashCode()
        result = 31 * result + this.lpszDCISectionName.hashCode()
        result = 31 * result + this.lpszDCIAliasName.hashCode()
        result = 31 * result + this.dnDevNode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwDCISize: UInt = 0u,
            lpszDCISectionName: Pcwstr = ConstPtr(0L),
            lpszDCIAliasName: Pcwstr = ConstPtr(0L),
            dnDevNode: UInt = 0u,
        ): Drvconfiginfoex =
            Drvconfiginfoex(
                dwDCISize = dwDCISize,
                lpszDCISectionNameCtorArg = lpszDCISectionName,
                lpszDCIAliasNameCtorArg = lpszDCIAliasName,
                dnDevNode = dnDevNode,
            )
    }
}

public data class DrvmIoctlData(
    public var dwSize: UInt = 0u,
    public var dwCmd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrvmIoctlData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrvmIoctlData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DrvmIoctlData =
                    DrvmIoctlData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DrvmIoctlData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCmd)
                }
            }
    }
}

public data class Dviadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public data class Echosc1waveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Exbminfoheader(
    public var bmi: Bitmapinfoheader = Bitmapinfoheader(),
    public var biExtDataOffset: UInt = 0u,
)

public data class FmtownsSndWaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
)

public data class G721Adpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var nAuxBlockSize: UShort = 0u,
)

public data class G723Adpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var cbExtraSize: UShort = 0u,
    public var nAuxBlockSize: UShort = 0u,
)

public data class Gsm610waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public class Iccompress internal constructor(
    public var dwFlags: UInt,
    lpbiOutputCtorArg: MutPtr,
    lpOutputCtorArg: MutPtr,
    lpbiInputCtorArg: MutPtr,
    lpInputCtorArg: MutPtr,
    lpckidCtorArg: MutPtr,
    lpdwFlagsCtorArg: MutPtr,
    public var lFrameNum: Int,
    public var dwFrameSize: UInt,
    public var dwQuality: UInt,
    lpbiPrevCtorArg: MutPtr,
    lpPrevCtorArg: MutPtr,
) {
    public var lpbiOutput: MutPtr = lpbiOutputCtorArg
        internal set

    public var lpOutput: MutPtr = lpOutputCtorArg
        internal set

    public var lpbiInput: MutPtr = lpbiInputCtorArg
        internal set

    public var lpInput: MutPtr = lpInputCtorArg
        internal set

    public var lpckid: MutPtr = lpckidCtorArg
        internal set

    public var lpdwFlags: MutPtr = lpdwFlagsCtorArg
        internal set

    public var lpbiPrev: MutPtr = lpbiPrevCtorArg
        internal set

    public var lpPrev: MutPtr = lpPrevCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        lpbiOutputCtorArg = MutPtr(0L),
        lpOutputCtorArg = MutPtr(0L),
        lpbiInputCtorArg = MutPtr(0L),
        lpInputCtorArg = MutPtr(0L),
        lpckidCtorArg = MutPtr(0L),
        lpdwFlagsCtorArg = MutPtr(0L),
        lFrameNum = 0,
        dwFrameSize = 0u,
        dwQuality = 0u,
        lpbiPrevCtorArg = MutPtr(0L),
        lpPrevCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): MutPtr = this.lpbiOutput

    public operator fun component3(): MutPtr = this.lpOutput

    public operator fun component4(): MutPtr = this.lpbiInput

    public operator fun component5(): MutPtr = this.lpInput

    public operator fun component6(): MutPtr = this.lpckid

    public operator fun component7(): MutPtr = this.lpdwFlags

    public operator fun component8(): Int = this.lFrameNum

    public operator fun component9(): UInt = this.dwFrameSize

    public operator fun component10(): UInt = this.dwQuality

    public operator fun component11(): MutPtr = this.lpbiPrev

    public operator fun component12(): MutPtr = this.lpPrev

    public fun copy(dwFlags: UInt = this.dwFlags, lpbiOutput: MutPtr = this.lpbiOutput, lpOutput: MutPtr = this.lpOutput, lpbiInput: MutPtr = this.lpbiInput, lpInput: MutPtr = this.lpInput, lpckid: MutPtr = this.lpckid, lpdwFlags: MutPtr = this.lpdwFlags, lFrameNum: Int = this.lFrameNum, dwFrameSize: UInt = this.dwFrameSize, dwQuality: UInt = this.dwQuality, lpbiPrev: MutPtr = this.lpbiPrev, lpPrev: MutPtr = this.lpPrev): Iccompress = Iccompress(dwFlags = dwFlags, lpbiOutputCtorArg = lpbiOutput, lpOutputCtorArg = lpOutput, lpbiInputCtorArg = lpbiInput, lpInputCtorArg = lpInput, lpckidCtorArg = lpckid, lpdwFlagsCtorArg = lpdwFlags, lFrameNum = lFrameNum, dwFrameSize = dwFrameSize, dwQuality = dwQuality, lpbiPrevCtorArg = lpbiPrev, lpPrevCtorArg = lpPrev)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iccompress) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpbiOutput != other.lpbiOutput) return false
        if (this.lpOutput != other.lpOutput) return false
        if (this.lpbiInput != other.lpbiInput) return false
        if (this.lpInput != other.lpInput) return false
        if (this.lpckid != other.lpckid) return false
        if (this.lpdwFlags != other.lpdwFlags) return false
        if (this.lFrameNum != other.lFrameNum) return false
        if (this.dwFrameSize != other.dwFrameSize) return false
        if (this.dwQuality != other.dwQuality) return false
        if (this.lpbiPrev != other.lpbiPrev) return false
        if (this.lpPrev != other.lpPrev) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.lpbiOutput.hashCode()
        result = 31 * result + this.lpOutput.hashCode()
        result = 31 * result + this.lpbiInput.hashCode()
        result = 31 * result + this.lpInput.hashCode()
        result = 31 * result + this.lpckid.hashCode()
        result = 31 * result + this.lpdwFlags.hashCode()
        result = 31 * result + this.lFrameNum.hashCode()
        result = 31 * result + this.dwFrameSize.hashCode()
        result = 31 * result + this.dwQuality.hashCode()
        result = 31 * result + this.lpbiPrev.hashCode()
        result = 31 * result + this.lpPrev.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iccompress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iccompress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): Iccompress =
                    Iccompress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Iccompress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbiOutput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lpOutput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpbiInput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.lpInput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.lpckid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.lpdwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.lFrameNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwQuality)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 72L, value.lpbiPrev)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 80L, value.lpPrev)
                }
            }

        public operator fun invoke(
            dwFlags: UInt = 0u,
            lpbiOutput: MutPtr = MutPtr(0L),
            lpOutput: MutPtr = MutPtr(0L),
            lpbiInput: MutPtr = MutPtr(0L),
            lpInput: MutPtr = MutPtr(0L),
            lpckid: MutPtr = MutPtr(0L),
            lpdwFlags: MutPtr = MutPtr(0L),
            lFrameNum: Int = 0,
            dwFrameSize: UInt = 0u,
            dwQuality: UInt = 0u,
            lpbiPrev: MutPtr = MutPtr(0L),
            lpPrev: MutPtr = MutPtr(0L),
        ): Iccompress =
            Iccompress(
                dwFlags = dwFlags,
                lpbiOutputCtorArg = lpbiOutput,
                lpOutputCtorArg = lpOutput,
                lpbiInputCtorArg = lpbiInput,
                lpInputCtorArg = lpInput,
                lpckidCtorArg = lpckid,
                lpdwFlagsCtorArg = lpdwFlags,
                lFrameNum = lFrameNum,
                dwFrameSize = dwFrameSize,
                dwQuality = dwQuality,
                lpbiPrevCtorArg = lpbiPrev,
                lpPrevCtorArg = lpPrev,
            )
    }
}

public class Iccompressframes internal constructor(
    public var dwFlags: UInt,
    lpbiOutputCtorArg: MutPtr,
    public var lOutput: Lparam,
    lpbiInputCtorArg: MutPtr,
    public var lInput: Lparam,
    public var lStartFrame: Int,
    public var lFrameCount: Int,
    public var lQuality: Int,
    public var lDataRate: Int,
    public var lKeyRate: Int,
    public var dwRate: UInt,
    public var dwScale: UInt,
    public var dwOverheadPerFrame: UInt,
    public var dwReserved2: UInt,
    public var getData: Int,
    public var putData: Int,
) {
    public var lpbiOutput: MutPtr = lpbiOutputCtorArg
        internal set

    public var lpbiInput: MutPtr = lpbiInputCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        lpbiOutputCtorArg = MutPtr(0L),
        lOutput = 0L,
        lpbiInputCtorArg = MutPtr(0L),
        lInput = 0L,
        lStartFrame = 0,
        lFrameCount = 0,
        lQuality = 0,
        lDataRate = 0,
        lKeyRate = 0,
        dwRate = 0u,
        dwScale = 0u,
        dwOverheadPerFrame = 0u,
        dwReserved2 = 0u,
        getData = 0,
        putData = 0,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): MutPtr = this.lpbiOutput

    public operator fun component3(): Lparam = this.lOutput

    public operator fun component4(): MutPtr = this.lpbiInput

    public operator fun component5(): Lparam = this.lInput

    public operator fun component6(): Int = this.lStartFrame

    public operator fun component7(): Int = this.lFrameCount

    public operator fun component8(): Int = this.lQuality

    public operator fun component9(): Int = this.lDataRate

    public operator fun component10(): Int = this.lKeyRate

    public operator fun component11(): UInt = this.dwRate

    public operator fun component12(): UInt = this.dwScale

    public operator fun component13(): UInt = this.dwOverheadPerFrame

    public operator fun component14(): UInt = this.dwReserved2

    public operator fun component15(): Int = this.getData

    public operator fun component16(): Int = this.putData

    public fun copy(dwFlags: UInt = this.dwFlags, lpbiOutput: MutPtr = this.lpbiOutput, lOutput: Lparam = this.lOutput, lpbiInput: MutPtr = this.lpbiInput, lInput: Lparam = this.lInput, lStartFrame: Int = this.lStartFrame, lFrameCount: Int = this.lFrameCount, lQuality: Int = this.lQuality, lDataRate: Int = this.lDataRate, lKeyRate: Int = this.lKeyRate, dwRate: UInt = this.dwRate, dwScale: UInt = this.dwScale, dwOverheadPerFrame: UInt = this.dwOverheadPerFrame, dwReserved2: UInt = this.dwReserved2, getData: Int = this.getData, putData: Int = this.putData): Iccompressframes = Iccompressframes(dwFlags = dwFlags, lpbiOutputCtorArg = lpbiOutput, lOutput = lOutput, lpbiInputCtorArg = lpbiInput, lInput = lInput, lStartFrame = lStartFrame, lFrameCount = lFrameCount, lQuality = lQuality, lDataRate = lDataRate, lKeyRate = lKeyRate, dwRate = dwRate, dwScale = dwScale, dwOverheadPerFrame = dwOverheadPerFrame, dwReserved2 = dwReserved2, getData = getData, putData = putData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iccompressframes) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpbiOutput != other.lpbiOutput) return false
        if (this.lOutput != other.lOutput) return false
        if (this.lpbiInput != other.lpbiInput) return false
        if (this.lInput != other.lInput) return false
        if (this.lStartFrame != other.lStartFrame) return false
        if (this.lFrameCount != other.lFrameCount) return false
        if (this.lQuality != other.lQuality) return false
        if (this.lDataRate != other.lDataRate) return false
        if (this.lKeyRate != other.lKeyRate) return false
        if (this.dwRate != other.dwRate) return false
        if (this.dwScale != other.dwScale) return false
        if (this.dwOverheadPerFrame != other.dwOverheadPerFrame) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        if (this.getData != other.getData) return false
        if (this.putData != other.putData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.lpbiOutput.hashCode()
        result = 31 * result + this.lOutput.hashCode()
        result = 31 * result + this.lpbiInput.hashCode()
        result = 31 * result + this.lInput.hashCode()
        result = 31 * result + this.lStartFrame.hashCode()
        result = 31 * result + this.lFrameCount.hashCode()
        result = 31 * result + this.lQuality.hashCode()
        result = 31 * result + this.lDataRate.hashCode()
        result = 31 * result + this.lKeyRate.hashCode()
        result = 31 * result + this.dwRate.hashCode()
        result = 31 * result + this.dwScale.hashCode()
        result = 31 * result + this.dwOverheadPerFrame.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        result = 31 * result + this.getData.hashCode()
        result = 31 * result + this.putData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iccompressframes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iccompressframes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): Iccompressframes =
                    Iccompressframes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: Iccompressframes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbiOutput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lOutput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpbiInput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.lInput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.lStartFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.lFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.lQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.lDataRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.lKeyRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwOverheadPerFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.getData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.putData)
                }
            }

        public operator fun invoke(
            dwFlags: UInt = 0u,
            lpbiOutput: MutPtr = MutPtr(0L),
            lOutput: Lparam = 0L,
            lpbiInput: MutPtr = MutPtr(0L),
            lInput: Lparam = 0L,
            lStartFrame: Int = 0,
            lFrameCount: Int = 0,
            lQuality: Int = 0,
            lDataRate: Int = 0,
            lKeyRate: Int = 0,
            dwRate: UInt = 0u,
            dwScale: UInt = 0u,
            dwOverheadPerFrame: UInt = 0u,
            dwReserved2: UInt = 0u,
            getData: Int = 0,
            putData: Int = 0,
        ): Iccompressframes =
            Iccompressframes(
                dwFlags = dwFlags,
                lpbiOutputCtorArg = lpbiOutput,
                lOutput = lOutput,
                lpbiInputCtorArg = lpbiInput,
                lInput = lInput,
                lStartFrame = lStartFrame,
                lFrameCount = lFrameCount,
                lQuality = lQuality,
                lDataRate = lDataRate,
                lKeyRate = lKeyRate,
                dwRate = dwRate,
                dwScale = dwScale,
                dwOverheadPerFrame = dwOverheadPerFrame,
                dwReserved2 = dwReserved2,
                getData = getData,
                putData = putData,
            )
    }
}

public class Icdecompress internal constructor(
    public var dwFlags: UInt,
    lpbiInputCtorArg: MutPtr,
    lpInputCtorArg: MutPtr,
    lpbiOutputCtorArg: MutPtr,
    lpOutputCtorArg: MutPtr,
    public var ckid: UInt,
) {
    public var lpbiInput: MutPtr = lpbiInputCtorArg
        internal set

    public var lpInput: MutPtr = lpInputCtorArg
        internal set

    public var lpbiOutput: MutPtr = lpbiOutputCtorArg
        internal set

    public var lpOutput: MutPtr = lpOutputCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        lpbiInputCtorArg = MutPtr(0L),
        lpInputCtorArg = MutPtr(0L),
        lpbiOutputCtorArg = MutPtr(0L),
        lpOutputCtorArg = MutPtr(0L),
        ckid = 0u,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): MutPtr = this.lpbiInput

    public operator fun component3(): MutPtr = this.lpInput

    public operator fun component4(): MutPtr = this.lpbiOutput

    public operator fun component5(): MutPtr = this.lpOutput

    public operator fun component6(): UInt = this.ckid

    public fun copy(dwFlags: UInt = this.dwFlags, lpbiInput: MutPtr = this.lpbiInput, lpInput: MutPtr = this.lpInput, lpbiOutput: MutPtr = this.lpbiOutput, lpOutput: MutPtr = this.lpOutput, ckid: UInt = this.ckid): Icdecompress = Icdecompress(dwFlags = dwFlags, lpbiInputCtorArg = lpbiInput, lpInputCtorArg = lpInput, lpbiOutputCtorArg = lpbiOutput, lpOutputCtorArg = lpOutput, ckid = ckid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icdecompress) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpbiInput != other.lpbiInput) return false
        if (this.lpInput != other.lpInput) return false
        if (this.lpbiOutput != other.lpbiOutput) return false
        if (this.lpOutput != other.lpOutput) return false
        if (this.ckid != other.ckid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.lpbiInput.hashCode()
        result = 31 * result + this.lpInput.hashCode()
        result = 31 * result + this.lpbiOutput.hashCode()
        result = 31 * result + this.lpOutput.hashCode()
        result = 31 * result + this.ckid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdecompress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdecompress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Icdecompress =
                    Icdecompress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Icdecompress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbiInput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lpInput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpbiOutput)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.lpOutput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ckid)
                }
            }

        public operator fun invoke(
            dwFlags: UInt = 0u,
            lpbiInput: MutPtr = MutPtr(0L),
            lpInput: MutPtr = MutPtr(0L),
            lpbiOutput: MutPtr = MutPtr(0L),
            lpOutput: MutPtr = MutPtr(0L),
            ckid: UInt = 0u,
        ): Icdecompress =
            Icdecompress(
                dwFlags = dwFlags,
                lpbiInputCtorArg = lpbiInput,
                lpInputCtorArg = lpInput,
                lpbiOutputCtorArg = lpbiOutput,
                lpOutputCtorArg = lpOutput,
                ckid = ckid,
            )
    }
}

public class Icdecompressex internal constructor(
    public var dwFlags: UInt,
    lpbiSrcCtorArg: MutPtr,
    lpSrcCtorArg: MutPtr,
    lpbiDstCtorArg: MutPtr,
    lpDstCtorArg: MutPtr,
    public var xDst: Int,
    public var yDst: Int,
    public var dxDst: Int,
    public var dyDst: Int,
    public var xSrc: Int,
    public var ySrc: Int,
    public var dxSrc: Int,
    public var dySrc: Int,
) {
    public var lpbiSrc: MutPtr = lpbiSrcCtorArg
        internal set

    public var lpSrc: MutPtr = lpSrcCtorArg
        internal set

    public var lpbiDst: MutPtr = lpbiDstCtorArg
        internal set

    public var lpDst: MutPtr = lpDstCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        lpbiSrcCtorArg = MutPtr(0L),
        lpSrcCtorArg = MutPtr(0L),
        lpbiDstCtorArg = MutPtr(0L),
        lpDstCtorArg = MutPtr(0L),
        xDst = 0,
        yDst = 0,
        dxDst = 0,
        dyDst = 0,
        xSrc = 0,
        ySrc = 0,
        dxSrc = 0,
        dySrc = 0,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): MutPtr = this.lpbiSrc

    public operator fun component3(): MutPtr = this.lpSrc

    public operator fun component4(): MutPtr = this.lpbiDst

    public operator fun component5(): MutPtr = this.lpDst

    public operator fun component6(): Int = this.xDst

    public operator fun component7(): Int = this.yDst

    public operator fun component8(): Int = this.dxDst

    public operator fun component9(): Int = this.dyDst

    public operator fun component10(): Int = this.xSrc

    public operator fun component11(): Int = this.ySrc

    public operator fun component12(): Int = this.dxSrc

    public operator fun component13(): Int = this.dySrc

    public fun copy(dwFlags: UInt = this.dwFlags, lpbiSrc: MutPtr = this.lpbiSrc, lpSrc: MutPtr = this.lpSrc, lpbiDst: MutPtr = this.lpbiDst, lpDst: MutPtr = this.lpDst, xDst: Int = this.xDst, yDst: Int = this.yDst, dxDst: Int = this.dxDst, dyDst: Int = this.dyDst, xSrc: Int = this.xSrc, ySrc: Int = this.ySrc, dxSrc: Int = this.dxSrc, dySrc: Int = this.dySrc): Icdecompressex = Icdecompressex(dwFlags = dwFlags, lpbiSrcCtorArg = lpbiSrc, lpSrcCtorArg = lpSrc, lpbiDstCtorArg = lpbiDst, lpDstCtorArg = lpDst, xDst = xDst, yDst = yDst, dxDst = dxDst, dyDst = dyDst, xSrc = xSrc, ySrc = ySrc, dxSrc = dxSrc, dySrc = dySrc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icdecompressex) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpbiSrc != other.lpbiSrc) return false
        if (this.lpSrc != other.lpSrc) return false
        if (this.lpbiDst != other.lpbiDst) return false
        if (this.lpDst != other.lpDst) return false
        if (this.xDst != other.xDst) return false
        if (this.yDst != other.yDst) return false
        if (this.dxDst != other.dxDst) return false
        if (this.dyDst != other.dyDst) return false
        if (this.xSrc != other.xSrc) return false
        if (this.ySrc != other.ySrc) return false
        if (this.dxSrc != other.dxSrc) return false
        if (this.dySrc != other.dySrc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.lpbiSrc.hashCode()
        result = 31 * result + this.lpSrc.hashCode()
        result = 31 * result + this.lpbiDst.hashCode()
        result = 31 * result + this.lpDst.hashCode()
        result = 31 * result + this.xDst.hashCode()
        result = 31 * result + this.yDst.hashCode()
        result = 31 * result + this.dxDst.hashCode()
        result = 31 * result + this.dyDst.hashCode()
        result = 31 * result + this.xSrc.hashCode()
        result = 31 * result + this.ySrc.hashCode()
        result = 31 * result + this.dxSrc.hashCode()
        result = 31 * result + this.dySrc.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdecompressex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdecompressex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Icdecompressex =
                    Icdecompressex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: Icdecompressex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbiSrc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lpSrc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpbiDst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.lpDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.xDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.yDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.dxDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.dyDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.xSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.ySrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.dxSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.dySrc)
                }
            }

        public operator fun invoke(
            dwFlags: UInt = 0u,
            lpbiSrc: MutPtr = MutPtr(0L),
            lpSrc: MutPtr = MutPtr(0L),
            lpbiDst: MutPtr = MutPtr(0L),
            lpDst: MutPtr = MutPtr(0L),
            xDst: Int = 0,
            yDst: Int = 0,
            dxDst: Int = 0,
            dyDst: Int = 0,
            xSrc: Int = 0,
            ySrc: Int = 0,
            dxSrc: Int = 0,
            dySrc: Int = 0,
        ): Icdecompressex =
            Icdecompressex(
                dwFlags = dwFlags,
                lpbiSrcCtorArg = lpbiSrc,
                lpSrcCtorArg = lpSrc,
                lpbiDstCtorArg = lpbiDst,
                lpDstCtorArg = lpDst,
                xDst = xDst,
                yDst = yDst,
                dxDst = dxDst,
                dyDst = dyDst,
                xSrc = xSrc,
                ySrc = ySrc,
                dxSrc = dxSrc,
                dySrc = dySrc,
            )
    }
}

public class Icdraw internal constructor(
    public var dwFlags: UInt,
    lpFormatCtorArg: MutPtr,
    lpDataCtorArg: MutPtr,
    public var cbData: UInt,
    public var lTime: Int,
) {
    public var lpFormat: MutPtr = lpFormatCtorArg
        internal set

    public var lpData: MutPtr = lpDataCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        lpFormatCtorArg = MutPtr(0L),
        lpDataCtorArg = MutPtr(0L),
        cbData = 0u,
        lTime = 0,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): MutPtr = this.lpFormat

    public operator fun component3(): MutPtr = this.lpData

    public operator fun component4(): UInt = this.cbData

    public operator fun component5(): Int = this.lTime

    public fun copy(dwFlags: UInt = this.dwFlags, lpFormat: MutPtr = this.lpFormat, lpData: MutPtr = this.lpData, cbData: UInt = this.cbData, lTime: Int = this.lTime): Icdraw = Icdraw(dwFlags = dwFlags, lpFormatCtorArg = lpFormat, lpDataCtorArg = lpData, cbData = cbData, lTime = lTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icdraw) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpFormat != other.lpFormat) return false
        if (this.lpData != other.lpData) return false
        if (this.cbData != other.cbData) return false
        if (this.lTime != other.lTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.lpFormat.hashCode()
        result = 31 * result + this.lpData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.lTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdraw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdraw> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Icdraw =
                    Icdraw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Icdraw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lpData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.lTime)
                }
            }

        public operator fun invoke(
            dwFlags: UInt = 0u,
            lpFormat: MutPtr = MutPtr(0L),
            lpData: MutPtr = MutPtr(0L),
            cbData: UInt = 0u,
            lTime: Int = 0,
        ): Icdraw =
            Icdraw(
                dwFlags = dwFlags,
                lpFormatCtorArg = lpFormat,
                lpDataCtorArg = lpData,
                cbData = cbData,
                lTime = lTime,
            )
    }
}

public class Icdrawbegin internal constructor(
    public var dwFlags: UInt,
    hpalCtorArg: Hpalette,
    hwndCtorArg: Hwnd,
    hdcCtorArg: Hdc,
    public var xDst: Int,
    public var yDst: Int,
    public var dxDst: Int,
    public var dyDst: Int,
    lpbiCtorArg: MutPtr,
    public var xSrc: Int,
    public var ySrc: Int,
    public var dxSrc: Int,
    public var dySrc: Int,
    public var dwRate: UInt,
    public var dwScale: UInt,
) {
    public var hpal: Hpalette = hpalCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var hdc: Hdc = hdcCtorArg
        internal set

    public var lpbi: MutPtr = lpbiCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        hpalCtorArg = MutPtr(0L),
        hwndCtorArg = MutPtr(0L),
        hdcCtorArg = MutPtr(0L),
        xDst = 0,
        yDst = 0,
        dxDst = 0,
        dyDst = 0,
        lpbiCtorArg = MutPtr(0L),
        xSrc = 0,
        ySrc = 0,
        dxSrc = 0,
        dySrc = 0,
        dwRate = 0u,
        dwScale = 0u,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Hpalette = this.hpal

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Hdc = this.hdc

    public operator fun component5(): Int = this.xDst

    public operator fun component6(): Int = this.yDst

    public operator fun component7(): Int = this.dxDst

    public operator fun component8(): Int = this.dyDst

    public operator fun component9(): MutPtr = this.lpbi

    public operator fun component10(): Int = this.xSrc

    public operator fun component11(): Int = this.ySrc

    public operator fun component12(): Int = this.dxSrc

    public operator fun component13(): Int = this.dySrc

    public operator fun component14(): UInt = this.dwRate

    public operator fun component15(): UInt = this.dwScale

    public fun copy(dwFlags: UInt = this.dwFlags, hpal: Hpalette = this.hpal, hwnd: Hwnd = this.hwnd, hdc: Hdc = this.hdc, xDst: Int = this.xDst, yDst: Int = this.yDst, dxDst: Int = this.dxDst, dyDst: Int = this.dyDst, lpbi: MutPtr = this.lpbi, xSrc: Int = this.xSrc, ySrc: Int = this.ySrc, dxSrc: Int = this.dxSrc, dySrc: Int = this.dySrc, dwRate: UInt = this.dwRate, dwScale: UInt = this.dwScale): Icdrawbegin = Icdrawbegin(dwFlags = dwFlags, hpalCtorArg = hpal, hwndCtorArg = hwnd, hdcCtorArg = hdc, xDst = xDst, yDst = yDst, dxDst = dxDst, dyDst = dyDst, lpbiCtorArg = lpbi, xSrc = xSrc, ySrc = ySrc, dxSrc = dxSrc, dySrc = dySrc, dwRate = dwRate, dwScale = dwScale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icdrawbegin) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hpal != other.hpal) return false
        if (this.hwnd != other.hwnd) return false
        if (this.hdc != other.hdc) return false
        if (this.xDst != other.xDst) return false
        if (this.yDst != other.yDst) return false
        if (this.dxDst != other.dxDst) return false
        if (this.dyDst != other.dyDst) return false
        if (this.lpbi != other.lpbi) return false
        if (this.xSrc != other.xSrc) return false
        if (this.ySrc != other.ySrc) return false
        if (this.dxSrc != other.dxSrc) return false
        if (this.dySrc != other.dySrc) return false
        if (this.dwRate != other.dwRate) return false
        if (this.dwScale != other.dwScale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.hpal.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.hdc.hashCode()
        result = 31 * result + this.xDst.hashCode()
        result = 31 * result + this.yDst.hashCode()
        result = 31 * result + this.dxDst.hashCode()
        result = 31 * result + this.dyDst.hashCode()
        result = 31 * result + this.lpbi.hashCode()
        result = 31 * result + this.xSrc.hashCode()
        result = 31 * result + this.ySrc.hashCode()
        result = 31 * result + this.dxSrc.hashCode()
        result = 31 * result + this.dySrc.hashCode()
        result = 31 * result + this.dwRate.hashCode()
        result = 31 * result + this.dwScale.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            hpal: Hpalette = MutPtr(0L),
            hwnd: Hwnd = MutPtr(0L),
            hdc: Hdc = MutPtr(0L),
            xDst: Int = 0,
            yDst: Int = 0,
            dxDst: Int = 0,
            dyDst: Int = 0,
            lpbi: MutPtr = MutPtr(0L),
            xSrc: Int = 0,
            ySrc: Int = 0,
            dxSrc: Int = 0,
            dySrc: Int = 0,
            dwRate: UInt = 0u,
            dwScale: UInt = 0u,
        ): Icdrawbegin =
            Icdrawbegin(
                dwFlags = dwFlags,
                hpalCtorArg = hpal,
                hwndCtorArg = hwnd,
                hdcCtorArg = hdc,
                xDst = xDst,
                yDst = yDst,
                dxDst = dxDst,
                dyDst = dyDst,
                lpbiCtorArg = lpbi,
                xSrc = xSrc,
                ySrc = ySrc,
                dxSrc = dxSrc,
                dySrc = dySrc,
                dwRate = dwRate,
                dwScale = dwScale,
            )
    }
}

public class Icdrawsuggest internal constructor(
    lpbiInCtorArg: MutPtr,
    lpbiSuggestCtorArg: MutPtr,
    public var dxSrc: Int,
    public var dySrc: Int,
    public var dxDst: Int,
    public var dyDst: Int,
    hicDecompressorCtorArg: Hic,
) {
    public var lpbiIn: MutPtr = lpbiInCtorArg
        internal set

    public var lpbiSuggest: MutPtr = lpbiSuggestCtorArg
        internal set

    public var hicDecompressor: Hic = hicDecompressorCtorArg
        internal set

    public constructor() : this(
        lpbiInCtorArg = MutPtr(0L),
        lpbiSuggestCtorArg = MutPtr(0L),
        dxSrc = 0,
        dySrc = 0,
        dxDst = 0,
        dyDst = 0,
        hicDecompressorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.lpbiIn

    public operator fun component2(): MutPtr = this.lpbiSuggest

    public operator fun component3(): Int = this.dxSrc

    public operator fun component4(): Int = this.dySrc

    public operator fun component5(): Int = this.dxDst

    public operator fun component6(): Int = this.dyDst

    public operator fun component7(): Hic = this.hicDecompressor

    public fun copy(lpbiIn: MutPtr = this.lpbiIn, lpbiSuggest: MutPtr = this.lpbiSuggest, dxSrc: Int = this.dxSrc, dySrc: Int = this.dySrc, dxDst: Int = this.dxDst, dyDst: Int = this.dyDst, hicDecompressor: Hic = this.hicDecompressor): Icdrawsuggest = Icdrawsuggest(lpbiInCtorArg = lpbiIn, lpbiSuggestCtorArg = lpbiSuggest, dxSrc = dxSrc, dySrc = dySrc, dxDst = dxDst, dyDst = dyDst, hicDecompressorCtorArg = hicDecompressor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icdrawsuggest) return false
        if (this.lpbiIn != other.lpbiIn) return false
        if (this.lpbiSuggest != other.lpbiSuggest) return false
        if (this.dxSrc != other.dxSrc) return false
        if (this.dySrc != other.dySrc) return false
        if (this.dxDst != other.dxDst) return false
        if (this.dyDst != other.dyDst) return false
        if (this.hicDecompressor != other.hicDecompressor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpbiIn.hashCode()
        result = 31 * result + this.lpbiSuggest.hashCode()
        result = 31 * result + this.dxSrc.hashCode()
        result = 31 * result + this.dySrc.hashCode()
        result = 31 * result + this.dxDst.hashCode()
        result = 31 * result + this.dyDst.hashCode()
        result = 31 * result + this.hicDecompressor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdrawsuggest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icdrawsuggest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Icdrawsuggest =
                    Icdrawsuggest(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Icdrawsuggest) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.lpbiIn)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbiSuggest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.dxSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.dySrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.dxDst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.dyDst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.hicDecompressor)
                }
            }

        public operator fun invoke(
            lpbiIn: MutPtr = MutPtr(0L),
            lpbiSuggest: MutPtr = MutPtr(0L),
            dxSrc: Int = 0,
            dySrc: Int = 0,
            dxDst: Int = 0,
            dyDst: Int = 0,
            hicDecompressor: Hic = MutPtr(0L),
        ): Icdrawsuggest =
            Icdrawsuggest(
                lpbiInCtorArg = lpbiIn,
                lpbiSuggestCtorArg = lpbiSuggest,
                dxSrc = dxSrc,
                dySrc = dySrc,
                dxDst = dxDst,
                dyDst = dyDst,
                hicDecompressorCtorArg = hicDecompressor,
            )
    }
}

public data class Icinfo(
    public var dwSize: UInt = 0u,
    public var fccType: UInt = 0u,
    public var fccHandler: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwVersionICM: UInt = 0u,
    public var szName: UShortArray = UShortArray(16),
    public var szDescription: UShortArray = UShortArray(128),
    public var szDriver: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fccType != other.fccType) return false
        if (this.fccHandler != other.fccHandler) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwVersionICM != other.dwVersionICM) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szDriver.contentEquals(other.szDriver)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccHandler.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwVersionICM.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szDriver.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 568L
                override fun readNative(addr: Long): Icinfo =
                    Icinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 56L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 312L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Icinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fccType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fccHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwVersionICM)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 24L, value.szName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 56L, value.szDescription.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 312L, value.szDriver.toList())
                }
            }
    }
}

public class Icopen internal constructor(
    public var dwSize: UInt,
    public var fccType: UInt,
    public var fccHandler: UInt,
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    public var dwError: Lresult,
    pV1ReservedCtorArg: MutPtr,
    pV2ReservedCtorArg: MutPtr,
    public var dnDevNode: UInt,
) {
    public var pV1Reserved: MutPtr = pV1ReservedCtorArg
        internal set

    public var pV2Reserved: MutPtr = pV2ReservedCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        fccType = 0u,
        fccHandler = 0u,
        dwVersion = 0u,
        dwFlags = 0u,
        dwError = 0L,
        pV1ReservedCtorArg = MutPtr(0L),
        pV2ReservedCtorArg = MutPtr(0L),
        dnDevNode = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.fccType

    public operator fun component3(): UInt = this.fccHandler

    public operator fun component4(): UInt = this.dwVersion

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): Lresult = this.dwError

    public operator fun component7(): MutPtr = this.pV1Reserved

    public operator fun component8(): MutPtr = this.pV2Reserved

    public operator fun component9(): UInt = this.dnDevNode

    public fun copy(dwSize: UInt = this.dwSize, fccType: UInt = this.fccType, fccHandler: UInt = this.fccHandler, dwVersion: UInt = this.dwVersion, dwFlags: UInt = this.dwFlags, dwError: Lresult = this.dwError, pV1Reserved: MutPtr = this.pV1Reserved, pV2Reserved: MutPtr = this.pV2Reserved, dnDevNode: UInt = this.dnDevNode): Icopen = Icopen(dwSize = dwSize, fccType = fccType, fccHandler = fccHandler, dwVersion = dwVersion, dwFlags = dwFlags, dwError = dwError, pV1ReservedCtorArg = pV1Reserved, pV2ReservedCtorArg = pV2Reserved, dnDevNode = dnDevNode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icopen) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fccType != other.fccType) return false
        if (this.fccHandler != other.fccHandler) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwError != other.dwError) return false
        if (this.pV1Reserved != other.pV1Reserved) return false
        if (this.pV2Reserved != other.pV2Reserved) return false
        if (this.dnDevNode != other.dnDevNode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fccType.hashCode()
        result = 31 * result + this.fccHandler.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.pV1Reserved.hashCode()
        result = 31 * result + this.pV2Reserved.hashCode()
        result = 31 * result + this.dnDevNode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icopen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icopen> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Icopen =
                    Icopen(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Icopen) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fccType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fccHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pV1Reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pV2Reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dnDevNode)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            fccType: UInt = 0u,
            fccHandler: UInt = 0u,
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            dwError: Lresult = 0L,
            pV1Reserved: MutPtr = MutPtr(0L),
            pV2Reserved: MutPtr = MutPtr(0L),
            dnDevNode: UInt = 0u,
        ): Icopen =
            Icopen(
                dwSize = dwSize,
                fccType = fccType,
                fccHandler = fccHandler,
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                dwError = dwError,
                pV1ReservedCtorArg = pV1Reserved,
                pV2ReservedCtorArg = pV2Reserved,
                dnDevNode = dnDevNode,
            )
    }
}

public class Icpalette internal constructor(
    public var dwFlags: UInt,
    public var iStart: Int,
    public var iLen: Int,
    lppeCtorArg: MutPtr,
) {
    public var lppe: MutPtr = lppeCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        iStart = 0,
        iLen = 0,
        lppeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Int = this.iStart

    public operator fun component3(): Int = this.iLen

    public operator fun component4(): MutPtr = this.lppe

    public fun copy(dwFlags: UInt = this.dwFlags, iStart: Int = this.iStart, iLen: Int = this.iLen, lppe: MutPtr = this.lppe): Icpalette = Icpalette(dwFlags = dwFlags, iStart = iStart, iLen = iLen, lppeCtorArg = lppe)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Icpalette) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.iStart != other.iStart) return false
        if (this.iLen != other.iLen) return false
        if (this.lppe != other.lppe) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.iStart.hashCode()
        result = 31 * result + this.iLen.hashCode()
        result = 31 * result + this.lppe.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icpalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icpalette> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Icpalette =
                    Icpalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Icpalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lppe)
                }
            }

        public operator fun invoke(
            dwFlags: UInt = 0u,
            iStart: Int = 0,
            iLen: Int = 0,
            lppe: MutPtr = MutPtr(0L),
        ): Icpalette =
            Icpalette(
                dwFlags = dwFlags,
                iStart = iStart,
                iLen = iLen,
                lppeCtorArg = lppe,
            )
    }
}

public data class Icsetstatusproc(
    public var dwFlags: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var status: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icsetstatusproc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icsetstatusproc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Icsetstatusproc =
                    Icsetstatusproc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Icsetstatusproc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lParam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.status)
                }
            }
    }
}

public data class Imaadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public class Joycaps2a(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: ByteArray = ByteArray(32),
    public var szOEMVxD: ByteArray = ByteArray(260),
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
)

public class Joycaps2w(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: UShortArray = UShortArray(32),
    public var szOEMVxD: UShortArray = UShortArray(260),
    public var manufacturerGuid: Guid = Guid(),
    public var productGuid: Guid = Guid(),
    public var nameGuid: Guid = Guid(),
)

public class Joycapsa(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: ByteArray = ByteArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: ByteArray = ByteArray(32),
    public var szOEMVxD: ByteArray = ByteArray(260),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joycapsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joycapsa> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 404L
                override fun readNative(addr: Long): Joycapsa =
                    Joycapsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 112L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 144L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Joycapsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 4L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.wXmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.wXmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.wYmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.wYmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.wZmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.wZmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.wNumButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.wPeriodMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.wPeriodMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.wRmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.wRmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.wUmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.wUmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.wVmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.wVmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.wCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.wMaxAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.wNumAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.wMaxButtons)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 112L, value.szRegKey.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 144L, value.szOEMVxD.toList())
                }
            }
    }
}

public class Joycapsw(
    public var wMid: UShort = 0u,
    public var wPid: UShort = 0u,
    public var szPname: UShortArray = UShortArray(32),
    public var wXmin: UInt = 0u,
    public var wXmax: UInt = 0u,
    public var wYmin: UInt = 0u,
    public var wYmax: UInt = 0u,
    public var wZmin: UInt = 0u,
    public var wZmax: UInt = 0u,
    public var wNumButtons: UInt = 0u,
    public var wPeriodMin: UInt = 0u,
    public var wPeriodMax: UInt = 0u,
    public var wRmin: UInt = 0u,
    public var wRmax: UInt = 0u,
    public var wUmin: UInt = 0u,
    public var wUmax: UInt = 0u,
    public var wVmin: UInt = 0u,
    public var wVmax: UInt = 0u,
    public var wCaps: UInt = 0u,
    public var wMaxAxes: UInt = 0u,
    public var wNumAxes: UInt = 0u,
    public var wMaxButtons: UInt = 0u,
    public var szRegKey: UShortArray = UShortArray(32),
    public var szOEMVxD: UShortArray = UShortArray(260),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joycapsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joycapsw> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 728L
                override fun readNative(addr: Long): Joycapsw =
                    Joycapsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 144L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 208L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Joycapsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 4L, value.szPname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.wXmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.wXmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.wYmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.wYmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.wZmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.wZmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.wNumButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.wPeriodMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.wPeriodMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.wRmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.wRmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.wUmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.wUmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.wVmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.wVmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.wCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.wMaxAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.wNumAxes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.wMaxButtons)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 144L, value.szRegKey.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 208L, value.szOEMVxD.toList())
                }
            }
    }
}

public data class Joyinfo(
    public var wXpos: UInt = 0u,
    public var wYpos: UInt = 0u,
    public var wZpos: UInt = 0u,
    public var wButtons: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyinfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Joyinfo =
                    Joyinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Joyinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wXpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.wYpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.wZpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wButtons)
                }
            }
    }
}

public data class Joyinfoex(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwXpos: UInt = 0u,
    public var dwYpos: UInt = 0u,
    public var dwZpos: UInt = 0u,
    public var dwRpos: UInt = 0u,
    public var dwUpos: UInt = 0u,
    public var dwVpos: UInt = 0u,
    public var dwButtons: UInt = 0u,
    public var dwButtonNumber: UInt = 0u,
    public var dwPOV: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyinfoex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Joyinfoex> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Joyinfoex =
                    Joyinfoex(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Joyinfoex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwXpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwYpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwZpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwRpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwUpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwVpos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwButtonNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwPOV)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwReserved2)
                }
            }
    }
}

public data class Jpeginfoheader(
    public var jPEGSize: UInt = 0u,
    public var jPEGProcess: UInt = 0u,
    public var jPEGColorSpaceID: UInt = 0u,
    public var jPEGBitsPerSample: UInt = 0u,
    public var jPEGHSubSampling: UInt = 0u,
    public var jPEGVSubSampling: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Jpeginfoheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Jpeginfoheader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Jpeginfoheader =
                    Jpeginfoheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Jpeginfoheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.jPEGSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.jPEGProcess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.jPEGColorSpaceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.jPEGBitsPerSample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.jPEGHSubSampling)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.jPEGVSubSampling)
                }
            }
    }
}

public class MciAnimOpenParmsa internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcstr,
    lpstrElementNameCtorArg: Pcstr,
    lpstrAliasCtorArg: Pcstr,
    public var dwStyle: UInt,
    hWndParentCtorArg: Hwnd,
) {
    public var lpstrDeviceType: Pcstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcstr = lpstrAliasCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
        dwStyle = 0u,
        hWndParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcstr = this.lpstrDeviceType

    public operator fun component4(): Pcstr = this.lpstrElementName

    public operator fun component5(): Pcstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwStyle

    public operator fun component7(): Hwnd = this.hWndParent

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcstr = this.lpstrDeviceType, lpstrElementName: Pcstr = this.lpstrElementName, lpstrAlias: Pcstr = this.lpstrAlias, dwStyle: UInt = this.dwStyle, hWndParent: Hwnd = this.hWndParent): MciAnimOpenParmsa = MciAnimOpenParmsa(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwStyle = dwStyle, hWndParentCtorArg = hWndParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciAnimOpenParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.hWndParent != other.hWndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcstr = ConstPtr(0L),
            lpstrElementName: Pcstr = ConstPtr(0L),
            lpstrAlias: Pcstr = ConstPtr(0L),
            dwStyle: UInt = 0u,
            hWndParent: Hwnd = MutPtr(0L),
        ): MciAnimOpenParmsa =
            MciAnimOpenParmsa(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwStyle = dwStyle,
                hWndParentCtorArg = hWndParent,
            )
    }
}

public class MciAnimOpenParmsw internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcwstr,
    lpstrElementNameCtorArg: Pcwstr,
    lpstrAliasCtorArg: Pcwstr,
    public var dwStyle: UInt,
    hWndParentCtorArg: Hwnd,
) {
    public var lpstrDeviceType: Pcwstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcwstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcwstr = lpstrAliasCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
        dwStyle = 0u,
        hWndParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcwstr = this.lpstrDeviceType

    public operator fun component4(): Pcwstr = this.lpstrElementName

    public operator fun component5(): Pcwstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwStyle

    public operator fun component7(): Hwnd = this.hWndParent

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcwstr = this.lpstrDeviceType, lpstrElementName: Pcwstr = this.lpstrElementName, lpstrAlias: Pcwstr = this.lpstrAlias, dwStyle: UInt = this.dwStyle, hWndParent: Hwnd = this.hWndParent): MciAnimOpenParmsw = MciAnimOpenParmsw(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwStyle = dwStyle, hWndParentCtorArg = hWndParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciAnimOpenParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.hWndParent != other.hWndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcwstr = ConstPtr(0L),
            lpstrElementName: Pcwstr = ConstPtr(0L),
            lpstrAlias: Pcwstr = ConstPtr(0L),
            dwStyle: UInt = 0u,
            hWndParent: Hwnd = MutPtr(0L),
        ): MciAnimOpenParmsw =
            MciAnimOpenParmsw(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwStyle = dwStyle,
                hWndParentCtorArg = hWndParent,
            )
    }
}

public data class MciAnimPlayParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var dwSpeed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciAnimPlayParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciAnimPlayParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MciAnimPlayParms =
                    MciAnimPlayParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MciAnimPlayParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSpeed)
                }
            }
    }
}

public data class MciAnimRectParms(
    public var dwCallback: Int = 0,
    public var rc: Rect = Rect(),
)

public data class MciAnimStepParms(
    public var dwCallback: Int = 0,
    public var dwFrames: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciAnimStepParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciAnimStepParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MciAnimStepParms =
                    MciAnimStepParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MciAnimStepParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrames)
                }
            }
    }
}

public class MciAnimUpdateParms internal constructor(
    public var dwCallback: Int,
    public var rc: Rect,
    hDCCtorArg: Hdc,
) {
    public var hDC: Hdc = hDCCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        rc = Rect(),
        hDCCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Rect = this.rc

    public operator fun component3(): Hdc = this.hDC

    public fun copy(dwCallback: Int = this.dwCallback, rc: Rect = this.rc, hDC: Hdc = this.hDC): MciAnimUpdateParms = MciAnimUpdateParms(dwCallback = dwCallback, rc = rc, hDCCtorArg = hDC)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciAnimUpdateParms) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.rc != other.rc) return false
        if (this.hDC != other.hDC) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.rc.hashCode()
        result = 31 * result + this.hDC.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            rc: Rect = Rect(),
            hDC: Hdc = MutPtr(0L),
        ): MciAnimUpdateParms =
            MciAnimUpdateParms(
                dwCallback = dwCallback,
                rc = rc,
                hDCCtorArg = hDC,
            )
    }
}

public class MciAnimWindowParmsa internal constructor(
    public var dwCallback: Int,
    hWndCtorArg: Hwnd,
    public var nCmdShow: UInt,
    lpstrTextCtorArg: Pcstr,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var lpstrText: Pcstr = lpstrTextCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        hWndCtorArg = MutPtr(0L),
        nCmdShow = 0u,
        lpstrTextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.nCmdShow

    public operator fun component4(): Pcstr = this.lpstrText

    public fun copy(dwCallback: Int = this.dwCallback, hWnd: Hwnd = this.hWnd, nCmdShow: UInt = this.nCmdShow, lpstrText: Pcstr = this.lpstrText): MciAnimWindowParmsa = MciAnimWindowParmsa(dwCallback = dwCallback, hWndCtorArg = hWnd, nCmdShow = nCmdShow, lpstrTextCtorArg = lpstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciAnimWindowParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.hWnd != other.hWnd) return false
        if (this.nCmdShow != other.nCmdShow) return false
        if (this.lpstrText != other.lpstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.nCmdShow.hashCode()
        result = 31 * result + this.lpstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            hWnd: Hwnd = MutPtr(0L),
            nCmdShow: UInt = 0u,
            lpstrText: Pcstr = ConstPtr(0L),
        ): MciAnimWindowParmsa =
            MciAnimWindowParmsa(
                dwCallback = dwCallback,
                hWndCtorArg = hWnd,
                nCmdShow = nCmdShow,
                lpstrTextCtorArg = lpstrText,
            )
    }
}

public class MciAnimWindowParmsw internal constructor(
    public var dwCallback: Int,
    hWndCtorArg: Hwnd,
    public var nCmdShow: UInt,
    lpstrTextCtorArg: Pcwstr,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var lpstrText: Pcwstr = lpstrTextCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        hWndCtorArg = MutPtr(0L),
        nCmdShow = 0u,
        lpstrTextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.nCmdShow

    public operator fun component4(): Pcwstr = this.lpstrText

    public fun copy(dwCallback: Int = this.dwCallback, hWnd: Hwnd = this.hWnd, nCmdShow: UInt = this.nCmdShow, lpstrText: Pcwstr = this.lpstrText): MciAnimWindowParmsw = MciAnimWindowParmsw(dwCallback = dwCallback, hWndCtorArg = hWnd, nCmdShow = nCmdShow, lpstrTextCtorArg = lpstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciAnimWindowParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.hWnd != other.hWnd) return false
        if (this.nCmdShow != other.nCmdShow) return false
        if (this.lpstrText != other.lpstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.nCmdShow.hashCode()
        result = 31 * result + this.lpstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            hWnd: Hwnd = MutPtr(0L),
            nCmdShow: UInt = 0u,
            lpstrText: Pcwstr = ConstPtr(0L),
        ): MciAnimWindowParmsw =
            MciAnimWindowParmsw(
                dwCallback = dwCallback,
                hWndCtorArg = hWnd,
                nCmdShow = nCmdShow,
                lpstrTextCtorArg = lpstrText,
            )
    }
}

public class MciBreakParms internal constructor(
    public var dwCallback: Int,
    public var nVirtKey: Int,
    hwndBreakCtorArg: Hwnd,
) {
    public var hwndBreak: Hwnd = hwndBreakCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        nVirtKey = 0,
        hwndBreakCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Int = this.nVirtKey

    public operator fun component3(): Hwnd = this.hwndBreak

    public fun copy(dwCallback: Int = this.dwCallback, nVirtKey: Int = this.nVirtKey, hwndBreak: Hwnd = this.hwndBreak): MciBreakParms = MciBreakParms(dwCallback = dwCallback, nVirtKey = nVirtKey, hwndBreakCtorArg = hwndBreak)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciBreakParms) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.nVirtKey != other.nVirtKey) return false
        if (this.hwndBreak != other.hwndBreak) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.nVirtKey.hashCode()
        result = 31 * result + this.hwndBreak.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            nVirtKey: Int = 0,
            hwndBreak: Hwnd = MutPtr(0L),
        ): MciBreakParms =
            MciBreakParms(
                dwCallback = dwCallback,
                nVirtKey = nVirtKey,
                hwndBreakCtorArg = hwndBreak,
            )
    }
}

public class MciDgvCaptureParmsa internal constructor(
    public var dwCallback: Int,
    lpstrFileNameCtorArg: Pstr,
    public var rc: Rect,
) {
    public var lpstrFileName: Pstr = lpstrFileNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrFileNameCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrFileName

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpstrFileName: Pstr = this.lpstrFileName, rc: Rect = this.rc): MciDgvCaptureParmsa = MciDgvCaptureParmsa(dwCallback = dwCallback, lpstrFileNameCtorArg = lpstrFileName, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvCaptureParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrFileName != other.lpstrFileName) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrFileName.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrFileName: Pstr = MutPtr(0L),
            rc: Rect = Rect(),
        ): MciDgvCaptureParmsa =
            MciDgvCaptureParmsa(
                dwCallback = dwCallback,
                lpstrFileNameCtorArg = lpstrFileName,
                rc = rc,
            )
    }
}

public class MciDgvCaptureParmsw internal constructor(
    public var dwCallback: Int,
    lpstrFileNameCtorArg: Pwstr,
    public var rc: Rect,
) {
    public var lpstrFileName: Pwstr = lpstrFileNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrFileNameCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrFileName

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpstrFileName: Pwstr = this.lpstrFileName, rc: Rect = this.rc): MciDgvCaptureParmsw = MciDgvCaptureParmsw(dwCallback = dwCallback, lpstrFileNameCtorArg = lpstrFileName, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvCaptureParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrFileName != other.lpstrFileName) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrFileName.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrFileName: Pwstr = MutPtr(0L),
            rc: Rect = Rect(),
        ): MciDgvCaptureParmsw =
            MciDgvCaptureParmsw(
                dwCallback = dwCallback,
                lpstrFileNameCtorArg = lpstrFileName,
                rc = rc,
            )
    }
}

public data class MciDgvCopyParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvCueParms(
    public var dwCallback: Int = 0,
    public var dwTo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvCueParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvCueParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MciDgvCueParms =
                    MciDgvCueParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MciDgvCueParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTo)
                }
            }
    }
}

public data class MciDgvCutParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvDeleteParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public class MciDgvInfoParmsa internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pstr,
    public var dwRetSize: UInt,
    public var dwItem: UInt,
) {
    public var lpstrReturn: Pstr = lpstrReturnCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwRetSize = 0u,
        dwItem = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwRetSize

    public operator fun component4(): UInt = this.dwItem

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pstr = this.lpstrReturn, dwRetSize: UInt = this.dwRetSize, dwItem: UInt = this.dwItem): MciDgvInfoParmsa = MciDgvInfoParmsa(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwRetSize = dwRetSize, dwItem = dwItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvInfoParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwRetSize != other.dwRetSize) return false
        if (this.dwItem != other.dwItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwRetSize.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pstr = MutPtr(0L),
            dwRetSize: UInt = 0u,
            dwItem: UInt = 0u,
        ): MciDgvInfoParmsa =
            MciDgvInfoParmsa(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwRetSize = dwRetSize,
                dwItem = dwItem,
            )
    }
}

public class MciDgvInfoParmsw internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pwstr,
    public var dwRetSize: UInt,
    public var dwItem: UInt,
) {
    public var lpstrReturn: Pwstr = lpstrReturnCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwRetSize = 0u,
        dwItem = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwRetSize

    public operator fun component4(): UInt = this.dwItem

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pwstr = this.lpstrReturn, dwRetSize: UInt = this.dwRetSize, dwItem: UInt = this.dwItem): MciDgvInfoParmsw = MciDgvInfoParmsw(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwRetSize = dwRetSize, dwItem = dwItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvInfoParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwRetSize != other.dwRetSize) return false
        if (this.dwItem != other.dwItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwRetSize.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pwstr = MutPtr(0L),
            dwRetSize: UInt = 0u,
            dwItem: UInt = 0u,
        ): MciDgvInfoParmsw =
            MciDgvInfoParmsw(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwRetSize = dwRetSize,
                dwItem = dwItem,
            )
    }
}

public class MciDgvListParmsa internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pstr,
    public var dwLength: UInt,
    public var dwNumber: UInt,
    public var dwItem: UInt,
    lpstrAlgorithmCtorArg: Pstr,
) {
    public var lpstrReturn: Pstr = lpstrReturnCtorArg
        internal set

    public var lpstrAlgorithm: Pstr = lpstrAlgorithmCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwLength = 0u,
        dwNumber = 0u,
        dwItem = 0u,
        lpstrAlgorithmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwLength

    public operator fun component4(): UInt = this.dwNumber

    public operator fun component5(): UInt = this.dwItem

    public operator fun component6(): Pstr = this.lpstrAlgorithm

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pstr = this.lpstrReturn, dwLength: UInt = this.dwLength, dwNumber: UInt = this.dwNumber, dwItem: UInt = this.dwItem, lpstrAlgorithm: Pstr = this.lpstrAlgorithm): MciDgvListParmsa = MciDgvListParmsa(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwLength = dwLength, dwNumber = dwNumber, dwItem = dwItem, lpstrAlgorithmCtorArg = lpstrAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvListParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwNumber != other.dwNumber) return false
        if (this.dwItem != other.dwItem) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.dwNumber.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pstr = MutPtr(0L),
            dwLength: UInt = 0u,
            dwNumber: UInt = 0u,
            dwItem: UInt = 0u,
            lpstrAlgorithm: Pstr = MutPtr(0L),
        ): MciDgvListParmsa =
            MciDgvListParmsa(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwLength = dwLength,
                dwNumber = dwNumber,
                dwItem = dwItem,
                lpstrAlgorithmCtorArg = lpstrAlgorithm,
            )
    }
}

public class MciDgvListParmsw internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pwstr,
    public var dwLength: UInt,
    public var dwNumber: UInt,
    public var dwItem: UInt,
    lpstrAlgorithmCtorArg: Pwstr,
) {
    public var lpstrReturn: Pwstr = lpstrReturnCtorArg
        internal set

    public var lpstrAlgorithm: Pwstr = lpstrAlgorithmCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwLength = 0u,
        dwNumber = 0u,
        dwItem = 0u,
        lpstrAlgorithmCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwLength

    public operator fun component4(): UInt = this.dwNumber

    public operator fun component5(): UInt = this.dwItem

    public operator fun component6(): Pwstr = this.lpstrAlgorithm

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pwstr = this.lpstrReturn, dwLength: UInt = this.dwLength, dwNumber: UInt = this.dwNumber, dwItem: UInt = this.dwItem, lpstrAlgorithm: Pwstr = this.lpstrAlgorithm): MciDgvListParmsw = MciDgvListParmsw(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwLength = dwLength, dwNumber = dwNumber, dwItem = dwItem, lpstrAlgorithmCtorArg = lpstrAlgorithm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvListParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwNumber != other.dwNumber) return false
        if (this.dwItem != other.dwItem) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwLength.hashCode()
        result = 31 * result + this.dwNumber.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pwstr = MutPtr(0L),
            dwLength: UInt = 0u,
            dwNumber: UInt = 0u,
            dwItem: UInt = 0u,
            lpstrAlgorithm: Pwstr = MutPtr(0L),
        ): MciDgvListParmsw =
            MciDgvListParmsw(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwLength = dwLength,
                dwNumber = dwNumber,
                dwItem = dwItem,
                lpstrAlgorithmCtorArg = lpstrAlgorithm,
            )
    }
}

public data class MciDgvMonitorParms(
    public var dwCallback: Int = 0,
    public var dwSource: UInt = 0u,
    public var dwMethod: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvMonitorParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvMonitorParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MciDgvMonitorParms =
                    MciDgvMonitorParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MciDgvMonitorParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMethod)
                }
            }
    }
}

public class MciDgvOpenParmsa internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pstr,
    lpstrElementNameCtorArg: Pstr,
    lpstrAliasCtorArg: Pstr,
    public var dwStyle: UInt,
    hWndParentCtorArg: Hwnd,
) {
    public var lpstrDeviceType: Pstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pstr = lpstrAliasCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = MutPtr(0L),
        lpstrElementNameCtorArg = MutPtr(0L),
        lpstrAliasCtorArg = MutPtr(0L),
        dwStyle = 0u,
        hWndParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pstr = this.lpstrDeviceType

    public operator fun component4(): Pstr = this.lpstrElementName

    public operator fun component5(): Pstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwStyle

    public operator fun component7(): Hwnd = this.hWndParent

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pstr = this.lpstrDeviceType, lpstrElementName: Pstr = this.lpstrElementName, lpstrAlias: Pstr = this.lpstrAlias, dwStyle: UInt = this.dwStyle, hWndParent: Hwnd = this.hWndParent): MciDgvOpenParmsa = MciDgvOpenParmsa(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwStyle = dwStyle, hWndParentCtorArg = hWndParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvOpenParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.hWndParent != other.hWndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pstr = MutPtr(0L),
            lpstrElementName: Pstr = MutPtr(0L),
            lpstrAlias: Pstr = MutPtr(0L),
            dwStyle: UInt = 0u,
            hWndParent: Hwnd = MutPtr(0L),
        ): MciDgvOpenParmsa =
            MciDgvOpenParmsa(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwStyle = dwStyle,
                hWndParentCtorArg = hWndParent,
            )
    }
}

public class MciDgvOpenParmsw internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pwstr,
    lpstrElementNameCtorArg: Pwstr,
    lpstrAliasCtorArg: Pwstr,
    public var dwStyle: UInt,
    hWndParentCtorArg: Hwnd,
) {
    public var lpstrDeviceType: Pwstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pwstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pwstr = lpstrAliasCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = MutPtr(0L),
        lpstrElementNameCtorArg = MutPtr(0L),
        lpstrAliasCtorArg = MutPtr(0L),
        dwStyle = 0u,
        hWndParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pwstr = this.lpstrDeviceType

    public operator fun component4(): Pwstr = this.lpstrElementName

    public operator fun component5(): Pwstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwStyle

    public operator fun component7(): Hwnd = this.hWndParent

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pwstr = this.lpstrDeviceType, lpstrElementName: Pwstr = this.lpstrElementName, lpstrAlias: Pwstr = this.lpstrAlias, dwStyle: UInt = this.dwStyle, hWndParent: Hwnd = this.hWndParent): MciDgvOpenParmsw = MciDgvOpenParmsw(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwStyle = dwStyle, hWndParentCtorArg = hWndParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvOpenParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.hWndParent != other.hWndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pwstr = MutPtr(0L),
            lpstrElementName: Pwstr = MutPtr(0L),
            lpstrAlias: Pwstr = MutPtr(0L),
            dwStyle: UInt = 0u,
            hWndParent: Hwnd = MutPtr(0L),
        ): MciDgvOpenParmsw =
            MciDgvOpenParmsw(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwStyle = dwStyle,
                hWndParentCtorArg = hWndParent,
            )
    }
}

public data class MciDgvPasteParms(
    public var dwCallback: Int = 0,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public class MciDgvQualityParmsa internal constructor(
    public var dwCallback: Int,
    public var dwItem: UInt,
    lpstrNameCtorArg: Pstr,
    public var lpstrAlgorithm: UInt,
    public var dwHandle: UInt,
) {
    public var lpstrName: Pstr = lpstrNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwItem = 0u,
        lpstrNameCtorArg = MutPtr(0L),
        lpstrAlgorithm = 0u,
        dwHandle = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.dwItem

    public operator fun component3(): Pstr = this.lpstrName

    public operator fun component4(): UInt = this.lpstrAlgorithm

    public operator fun component5(): UInt = this.dwHandle

    public fun copy(dwCallback: Int = this.dwCallback, dwItem: UInt = this.dwItem, lpstrName: Pstr = this.lpstrName, lpstrAlgorithm: UInt = this.lpstrAlgorithm, dwHandle: UInt = this.dwHandle): MciDgvQualityParmsa = MciDgvQualityParmsa(dwCallback = dwCallback, dwItem = dwItem, lpstrNameCtorArg = lpstrName, lpstrAlgorithm = lpstrAlgorithm, dwHandle = dwHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvQualityParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwItem != other.dwItem) return false
        if (this.lpstrName != other.lpstrName) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        if (this.dwHandle != other.dwHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.lpstrName.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        result = 31 * result + this.dwHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwItem: UInt = 0u,
            lpstrName: Pstr = MutPtr(0L),
            lpstrAlgorithm: UInt = 0u,
            dwHandle: UInt = 0u,
        ): MciDgvQualityParmsa =
            MciDgvQualityParmsa(
                dwCallback = dwCallback,
                dwItem = dwItem,
                lpstrNameCtorArg = lpstrName,
                lpstrAlgorithm = lpstrAlgorithm,
                dwHandle = dwHandle,
            )
    }
}

public class MciDgvQualityParmsw internal constructor(
    public var dwCallback: Int,
    public var dwItem: UInt,
    lpstrNameCtorArg: Pwstr,
    public var lpstrAlgorithm: UInt,
    public var dwHandle: UInt,
) {
    public var lpstrName: Pwstr = lpstrNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwItem = 0u,
        lpstrNameCtorArg = MutPtr(0L),
        lpstrAlgorithm = 0u,
        dwHandle = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.dwItem

    public operator fun component3(): Pwstr = this.lpstrName

    public operator fun component4(): UInt = this.lpstrAlgorithm

    public operator fun component5(): UInt = this.dwHandle

    public fun copy(dwCallback: Int = this.dwCallback, dwItem: UInt = this.dwItem, lpstrName: Pwstr = this.lpstrName, lpstrAlgorithm: UInt = this.lpstrAlgorithm, dwHandle: UInt = this.dwHandle): MciDgvQualityParmsw = MciDgvQualityParmsw(dwCallback = dwCallback, dwItem = dwItem, lpstrNameCtorArg = lpstrName, lpstrAlgorithm = lpstrAlgorithm, dwHandle = dwHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvQualityParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwItem != other.dwItem) return false
        if (this.lpstrName != other.lpstrName) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        if (this.dwHandle != other.dwHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.lpstrName.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        result = 31 * result + this.dwHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwItem: UInt = 0u,
            lpstrName: Pwstr = MutPtr(0L),
            lpstrAlgorithm: UInt = 0u,
            dwHandle: UInt = 0u,
        ): MciDgvQualityParmsw =
            MciDgvQualityParmsw(
                dwCallback = dwCallback,
                dwItem = dwItem,
                lpstrNameCtorArg = lpstrName,
                lpstrAlgorithm = lpstrAlgorithm,
                dwHandle = dwHandle,
            )
    }
}

public data class MciDgvRecordParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var rc: Rect = Rect(),
    public var dwAudioStream: UInt = 0u,
    public var dwVideoStream: UInt = 0u,
)

public data class MciDgvRectParms(
    public var dwCallback: Int = 0,
    public var rc: Rect = Rect(),
)

public class MciDgvReserveParmsa internal constructor(
    public var dwCallback: Int,
    lpstrPathCtorArg: Pstr,
    public var dwSize: UInt,
) {
    public var lpstrPath: Pstr = lpstrPathCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrPathCtorArg = MutPtr(0L),
        dwSize = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrPath

    public operator fun component3(): UInt = this.dwSize

    public fun copy(dwCallback: Int = this.dwCallback, lpstrPath: Pstr = this.lpstrPath, dwSize: UInt = this.dwSize): MciDgvReserveParmsa = MciDgvReserveParmsa(dwCallback = dwCallback, lpstrPathCtorArg = lpstrPath, dwSize = dwSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvReserveParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrPath != other.lpstrPath) return false
        if (this.dwSize != other.dwSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrPath.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrPath: Pstr = MutPtr(0L),
            dwSize: UInt = 0u,
        ): MciDgvReserveParmsa =
            MciDgvReserveParmsa(
                dwCallback = dwCallback,
                lpstrPathCtorArg = lpstrPath,
                dwSize = dwSize,
            )
    }
}

public class MciDgvReserveParmsw internal constructor(
    public var dwCallback: Int,
    lpstrPathCtorArg: Pwstr,
    public var dwSize: UInt,
) {
    public var lpstrPath: Pwstr = lpstrPathCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrPathCtorArg = MutPtr(0L),
        dwSize = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrPath

    public operator fun component3(): UInt = this.dwSize

    public fun copy(dwCallback: Int = this.dwCallback, lpstrPath: Pwstr = this.lpstrPath, dwSize: UInt = this.dwSize): MciDgvReserveParmsw = MciDgvReserveParmsw(dwCallback = dwCallback, lpstrPathCtorArg = lpstrPath, dwSize = dwSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvReserveParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrPath != other.lpstrPath) return false
        if (this.dwSize != other.dwSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrPath.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrPath: Pwstr = MutPtr(0L),
            dwSize: UInt = 0u,
        ): MciDgvReserveParmsw =
            MciDgvReserveParmsw(
                dwCallback = dwCallback,
                lpstrPathCtorArg = lpstrPath,
                dwSize = dwSize,
            )
    }
}

public class MciDgvRestoreParmsa internal constructor(
    public var dwCallback: Int,
    lpstrFileNameCtorArg: Pstr,
    public var rc: Rect,
) {
    public var lpstrFileName: Pstr = lpstrFileNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrFileNameCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrFileName

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpstrFileName: Pstr = this.lpstrFileName, rc: Rect = this.rc): MciDgvRestoreParmsa = MciDgvRestoreParmsa(dwCallback = dwCallback, lpstrFileNameCtorArg = lpstrFileName, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvRestoreParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrFileName != other.lpstrFileName) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrFileName.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrFileName: Pstr = MutPtr(0L),
            rc: Rect = Rect(),
        ): MciDgvRestoreParmsa =
            MciDgvRestoreParmsa(
                dwCallback = dwCallback,
                lpstrFileNameCtorArg = lpstrFileName,
                rc = rc,
            )
    }
}

public class MciDgvRestoreParmsw internal constructor(
    public var dwCallback: Int,
    lpstrFileNameCtorArg: Pwstr,
    public var rc: Rect,
) {
    public var lpstrFileName: Pwstr = lpstrFileNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrFileNameCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrFileName

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpstrFileName: Pwstr = this.lpstrFileName, rc: Rect = this.rc): MciDgvRestoreParmsw = MciDgvRestoreParmsw(dwCallback = dwCallback, lpstrFileNameCtorArg = lpstrFileName, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvRestoreParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrFileName != other.lpstrFileName) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrFileName.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrFileName: Pwstr = MutPtr(0L),
            rc: Rect = Rect(),
        ): MciDgvRestoreParmsw =
            MciDgvRestoreParmsw(
                dwCallback = dwCallback,
                lpstrFileNameCtorArg = lpstrFileName,
                rc = rc,
            )
    }
}

public class MciDgvSaveParmsa internal constructor(
    public var dwCallback: Int,
    lpstrFileNameCtorArg: Pstr,
    public var rc: Rect,
) {
    public var lpstrFileName: Pstr = lpstrFileNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrFileNameCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrFileName

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpstrFileName: Pstr = this.lpstrFileName, rc: Rect = this.rc): MciDgvSaveParmsa = MciDgvSaveParmsa(dwCallback = dwCallback, lpstrFileNameCtorArg = lpstrFileName, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvSaveParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrFileName != other.lpstrFileName) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrFileName.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrFileName: Pstr = MutPtr(0L),
            rc: Rect = Rect(),
        ): MciDgvSaveParmsa =
            MciDgvSaveParmsa(
                dwCallback = dwCallback,
                lpstrFileNameCtorArg = lpstrFileName,
                rc = rc,
            )
    }
}

public class MciDgvSaveParmsw internal constructor(
    public var dwCallback: Int,
    lpstrFileNameCtorArg: Pwstr,
    public var rc: Rect,
) {
    public var lpstrFileName: Pwstr = lpstrFileNameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrFileNameCtorArg = MutPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrFileName

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpstrFileName: Pwstr = this.lpstrFileName, rc: Rect = this.rc): MciDgvSaveParmsw = MciDgvSaveParmsw(dwCallback = dwCallback, lpstrFileNameCtorArg = lpstrFileName, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvSaveParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrFileName != other.lpstrFileName) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrFileName.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrFileName: Pwstr = MutPtr(0L),
            rc: Rect = Rect(),
        ): MciDgvSaveParmsw =
            MciDgvSaveParmsw(
                dwCallback = dwCallback,
                lpstrFileNameCtorArg = lpstrFileName,
                rc = rc,
            )
    }
}

public class MciDgvSetaudioParmsa internal constructor(
    public var dwCallback: Int,
    public var dwItem: UInt,
    public var dwValue: UInt,
    public var dwOver: UInt,
    lpstrAlgorithmCtorArg: Pstr,
    lpstrQualityCtorArg: Pstr,
) {
    public var lpstrAlgorithm: Pstr = lpstrAlgorithmCtorArg
        internal set

    public var lpstrQuality: Pstr = lpstrQualityCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwItem = 0u,
        dwValue = 0u,
        dwOver = 0u,
        lpstrAlgorithmCtorArg = MutPtr(0L),
        lpstrQualityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.dwItem

    public operator fun component3(): UInt = this.dwValue

    public operator fun component4(): UInt = this.dwOver

    public operator fun component5(): Pstr = this.lpstrAlgorithm

    public operator fun component6(): Pstr = this.lpstrQuality

    public fun copy(dwCallback: Int = this.dwCallback, dwItem: UInt = this.dwItem, dwValue: UInt = this.dwValue, dwOver: UInt = this.dwOver, lpstrAlgorithm: Pstr = this.lpstrAlgorithm, lpstrQuality: Pstr = this.lpstrQuality): MciDgvSetaudioParmsa = MciDgvSetaudioParmsa(dwCallback = dwCallback, dwItem = dwItem, dwValue = dwValue, dwOver = dwOver, lpstrAlgorithmCtorArg = lpstrAlgorithm, lpstrQualityCtorArg = lpstrQuality)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvSetaudioParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwItem != other.dwItem) return false
        if (this.dwValue != other.dwValue) return false
        if (this.dwOver != other.dwOver) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        if (this.lpstrQuality != other.lpstrQuality) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.dwValue.hashCode()
        result = 31 * result + this.dwOver.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        result = 31 * result + this.lpstrQuality.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwItem: UInt = 0u,
            dwValue: UInt = 0u,
            dwOver: UInt = 0u,
            lpstrAlgorithm: Pstr = MutPtr(0L),
            lpstrQuality: Pstr = MutPtr(0L),
        ): MciDgvSetaudioParmsa =
            MciDgvSetaudioParmsa(
                dwCallback = dwCallback,
                dwItem = dwItem,
                dwValue = dwValue,
                dwOver = dwOver,
                lpstrAlgorithmCtorArg = lpstrAlgorithm,
                lpstrQualityCtorArg = lpstrQuality,
            )
    }
}

public class MciDgvSetaudioParmsw internal constructor(
    public var dwCallback: Int,
    public var dwItem: UInt,
    public var dwValue: UInt,
    public var dwOver: UInt,
    lpstrAlgorithmCtorArg: Pwstr,
    lpstrQualityCtorArg: Pwstr,
) {
    public var lpstrAlgorithm: Pwstr = lpstrAlgorithmCtorArg
        internal set

    public var lpstrQuality: Pwstr = lpstrQualityCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwItem = 0u,
        dwValue = 0u,
        dwOver = 0u,
        lpstrAlgorithmCtorArg = MutPtr(0L),
        lpstrQualityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.dwItem

    public operator fun component3(): UInt = this.dwValue

    public operator fun component4(): UInt = this.dwOver

    public operator fun component5(): Pwstr = this.lpstrAlgorithm

    public operator fun component6(): Pwstr = this.lpstrQuality

    public fun copy(dwCallback: Int = this.dwCallback, dwItem: UInt = this.dwItem, dwValue: UInt = this.dwValue, dwOver: UInt = this.dwOver, lpstrAlgorithm: Pwstr = this.lpstrAlgorithm, lpstrQuality: Pwstr = this.lpstrQuality): MciDgvSetaudioParmsw = MciDgvSetaudioParmsw(dwCallback = dwCallback, dwItem = dwItem, dwValue = dwValue, dwOver = dwOver, lpstrAlgorithmCtorArg = lpstrAlgorithm, lpstrQualityCtorArg = lpstrQuality)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvSetaudioParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwItem != other.dwItem) return false
        if (this.dwValue != other.dwValue) return false
        if (this.dwOver != other.dwOver) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        if (this.lpstrQuality != other.lpstrQuality) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.dwValue.hashCode()
        result = 31 * result + this.dwOver.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        result = 31 * result + this.lpstrQuality.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwItem: UInt = 0u,
            dwValue: UInt = 0u,
            dwOver: UInt = 0u,
            lpstrAlgorithm: Pwstr = MutPtr(0L),
            lpstrQuality: Pwstr = MutPtr(0L),
        ): MciDgvSetaudioParmsw =
            MciDgvSetaudioParmsw(
                dwCallback = dwCallback,
                dwItem = dwItem,
                dwValue = dwValue,
                dwOver = dwOver,
                lpstrAlgorithmCtorArg = lpstrAlgorithm,
                lpstrQualityCtorArg = lpstrQuality,
            )
    }
}

public class MciDgvSetvideoParmsa internal constructor(
    public var dwCallback: Int,
    public var dwItem: UInt,
    public var dwValue: UInt,
    public var dwOver: UInt,
    lpstrAlgorithmCtorArg: Pstr,
    lpstrQualityCtorArg: Pstr,
    public var dwSourceNumber: UInt,
) {
    public var lpstrAlgorithm: Pstr = lpstrAlgorithmCtorArg
        internal set

    public var lpstrQuality: Pstr = lpstrQualityCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwItem = 0u,
        dwValue = 0u,
        dwOver = 0u,
        lpstrAlgorithmCtorArg = MutPtr(0L),
        lpstrQualityCtorArg = MutPtr(0L),
        dwSourceNumber = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.dwItem

    public operator fun component3(): UInt = this.dwValue

    public operator fun component4(): UInt = this.dwOver

    public operator fun component5(): Pstr = this.lpstrAlgorithm

    public operator fun component6(): Pstr = this.lpstrQuality

    public operator fun component7(): UInt = this.dwSourceNumber

    public fun copy(dwCallback: Int = this.dwCallback, dwItem: UInt = this.dwItem, dwValue: UInt = this.dwValue, dwOver: UInt = this.dwOver, lpstrAlgorithm: Pstr = this.lpstrAlgorithm, lpstrQuality: Pstr = this.lpstrQuality, dwSourceNumber: UInt = this.dwSourceNumber): MciDgvSetvideoParmsa = MciDgvSetvideoParmsa(dwCallback = dwCallback, dwItem = dwItem, dwValue = dwValue, dwOver = dwOver, lpstrAlgorithmCtorArg = lpstrAlgorithm, lpstrQualityCtorArg = lpstrQuality, dwSourceNumber = dwSourceNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvSetvideoParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwItem != other.dwItem) return false
        if (this.dwValue != other.dwValue) return false
        if (this.dwOver != other.dwOver) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        if (this.lpstrQuality != other.lpstrQuality) return false
        if (this.dwSourceNumber != other.dwSourceNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.dwValue.hashCode()
        result = 31 * result + this.dwOver.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        result = 31 * result + this.lpstrQuality.hashCode()
        result = 31 * result + this.dwSourceNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwItem: UInt = 0u,
            dwValue: UInt = 0u,
            dwOver: UInt = 0u,
            lpstrAlgorithm: Pstr = MutPtr(0L),
            lpstrQuality: Pstr = MutPtr(0L),
            dwSourceNumber: UInt = 0u,
        ): MciDgvSetvideoParmsa =
            MciDgvSetvideoParmsa(
                dwCallback = dwCallback,
                dwItem = dwItem,
                dwValue = dwValue,
                dwOver = dwOver,
                lpstrAlgorithmCtorArg = lpstrAlgorithm,
                lpstrQualityCtorArg = lpstrQuality,
                dwSourceNumber = dwSourceNumber,
            )
    }
}

public class MciDgvSetvideoParmsw internal constructor(
    public var dwCallback: Int,
    public var dwItem: UInt,
    public var dwValue: UInt,
    public var dwOver: UInt,
    lpstrAlgorithmCtorArg: Pwstr,
    lpstrQualityCtorArg: Pwstr,
    public var dwSourceNumber: UInt,
) {
    public var lpstrAlgorithm: Pwstr = lpstrAlgorithmCtorArg
        internal set

    public var lpstrQuality: Pwstr = lpstrQualityCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwItem = 0u,
        dwValue = 0u,
        dwOver = 0u,
        lpstrAlgorithmCtorArg = MutPtr(0L),
        lpstrQualityCtorArg = MutPtr(0L),
        dwSourceNumber = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.dwItem

    public operator fun component3(): UInt = this.dwValue

    public operator fun component4(): UInt = this.dwOver

    public operator fun component5(): Pwstr = this.lpstrAlgorithm

    public operator fun component6(): Pwstr = this.lpstrQuality

    public operator fun component7(): UInt = this.dwSourceNumber

    public fun copy(dwCallback: Int = this.dwCallback, dwItem: UInt = this.dwItem, dwValue: UInt = this.dwValue, dwOver: UInt = this.dwOver, lpstrAlgorithm: Pwstr = this.lpstrAlgorithm, lpstrQuality: Pwstr = this.lpstrQuality, dwSourceNumber: UInt = this.dwSourceNumber): MciDgvSetvideoParmsw = MciDgvSetvideoParmsw(dwCallback = dwCallback, dwItem = dwItem, dwValue = dwValue, dwOver = dwOver, lpstrAlgorithmCtorArg = lpstrAlgorithm, lpstrQualityCtorArg = lpstrQuality, dwSourceNumber = dwSourceNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvSetvideoParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwItem != other.dwItem) return false
        if (this.dwValue != other.dwValue) return false
        if (this.dwOver != other.dwOver) return false
        if (this.lpstrAlgorithm != other.lpstrAlgorithm) return false
        if (this.lpstrQuality != other.lpstrQuality) return false
        if (this.dwSourceNumber != other.dwSourceNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.dwValue.hashCode()
        result = 31 * result + this.dwOver.hashCode()
        result = 31 * result + this.lpstrAlgorithm.hashCode()
        result = 31 * result + this.lpstrQuality.hashCode()
        result = 31 * result + this.dwSourceNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwItem: UInt = 0u,
            dwValue: UInt = 0u,
            dwOver: UInt = 0u,
            lpstrAlgorithm: Pwstr = MutPtr(0L),
            lpstrQuality: Pwstr = MutPtr(0L),
            dwSourceNumber: UInt = 0u,
        ): MciDgvSetvideoParmsw =
            MciDgvSetvideoParmsw(
                dwCallback = dwCallback,
                dwItem = dwItem,
                dwValue = dwValue,
                dwOver = dwOver,
                lpstrAlgorithmCtorArg = lpstrAlgorithm,
                lpstrQualityCtorArg = lpstrQuality,
                dwSourceNumber = dwSourceNumber,
            )
    }
}

public data class MciDgvSetParms(
    public var dwCallback: Int = 0,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var dwFileFormat: UInt = 0u,
    public var dwSpeed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvSetParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvSetParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MciDgvSetParms =
                    MciDgvSetParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MciDgvSetParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAudio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFileFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwSpeed)
                }
            }
    }
}

public data class MciDgvSignalParms(
    public var dwCallback: Int = 0,
    public var dwPosition: UInt = 0u,
    public var dwPeriod: UInt = 0u,
    public var dwUserParm: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvSignalParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvSignalParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MciDgvSignalParms =
                    MciDgvSignalParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MciDgvSignalParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwUserParm)
                }
            }
    }
}

public class MciDgvStatusParmsa internal constructor(
    public var dwCallback: Int,
    public var dwReturn: Int,
    public var dwItem: UInt,
    public var dwTrack: UInt,
    lpstrDriveCtorArg: Pstr,
    public var dwReference: UInt,
) {
    public var lpstrDrive: Pstr = lpstrDriveCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwReturn = 0,
        dwItem = 0u,
        dwTrack = 0u,
        lpstrDriveCtorArg = MutPtr(0L),
        dwReference = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Int = this.dwReturn

    public operator fun component3(): UInt = this.dwItem

    public operator fun component4(): UInt = this.dwTrack

    public operator fun component5(): Pstr = this.lpstrDrive

    public operator fun component6(): UInt = this.dwReference

    public fun copy(dwCallback: Int = this.dwCallback, dwReturn: Int = this.dwReturn, dwItem: UInt = this.dwItem, dwTrack: UInt = this.dwTrack, lpstrDrive: Pstr = this.lpstrDrive, dwReference: UInt = this.dwReference): MciDgvStatusParmsa = MciDgvStatusParmsa(dwCallback = dwCallback, dwReturn = dwReturn, dwItem = dwItem, dwTrack = dwTrack, lpstrDriveCtorArg = lpstrDrive, dwReference = dwReference)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvStatusParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwReturn != other.dwReturn) return false
        if (this.dwItem != other.dwItem) return false
        if (this.dwTrack != other.dwTrack) return false
        if (this.lpstrDrive != other.lpstrDrive) return false
        if (this.dwReference != other.dwReference) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwReturn.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.dwTrack.hashCode()
        result = 31 * result + this.lpstrDrive.hashCode()
        result = 31 * result + this.dwReference.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwReturn: Int = 0,
            dwItem: UInt = 0u,
            dwTrack: UInt = 0u,
            lpstrDrive: Pstr = MutPtr(0L),
            dwReference: UInt = 0u,
        ): MciDgvStatusParmsa =
            MciDgvStatusParmsa(
                dwCallback = dwCallback,
                dwReturn = dwReturn,
                dwItem = dwItem,
                dwTrack = dwTrack,
                lpstrDriveCtorArg = lpstrDrive,
                dwReference = dwReference,
            )
    }
}

public class MciDgvStatusParmsw internal constructor(
    public var dwCallback: Int,
    public var dwReturn: Int,
    public var dwItem: UInt,
    public var dwTrack: UInt,
    lpstrDriveCtorArg: Pwstr,
    public var dwReference: UInt,
) {
    public var lpstrDrive: Pwstr = lpstrDriveCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        dwReturn = 0,
        dwItem = 0u,
        dwTrack = 0u,
        lpstrDriveCtorArg = MutPtr(0L),
        dwReference = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Int = this.dwReturn

    public operator fun component3(): UInt = this.dwItem

    public operator fun component4(): UInt = this.dwTrack

    public operator fun component5(): Pwstr = this.lpstrDrive

    public operator fun component6(): UInt = this.dwReference

    public fun copy(dwCallback: Int = this.dwCallback, dwReturn: Int = this.dwReturn, dwItem: UInt = this.dwItem, dwTrack: UInt = this.dwTrack, lpstrDrive: Pwstr = this.lpstrDrive, dwReference: UInt = this.dwReference): MciDgvStatusParmsw = MciDgvStatusParmsw(dwCallback = dwCallback, dwReturn = dwReturn, dwItem = dwItem, dwTrack = dwTrack, lpstrDriveCtorArg = lpstrDrive, dwReference = dwReference)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvStatusParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwReturn != other.dwReturn) return false
        if (this.dwItem != other.dwItem) return false
        if (this.dwTrack != other.dwTrack) return false
        if (this.lpstrDrive != other.lpstrDrive) return false
        if (this.dwReference != other.dwReference) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.dwReturn.hashCode()
        result = 31 * result + this.dwItem.hashCode()
        result = 31 * result + this.dwTrack.hashCode()
        result = 31 * result + this.lpstrDrive.hashCode()
        result = 31 * result + this.dwReference.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            dwReturn: Int = 0,
            dwItem: UInt = 0u,
            dwTrack: UInt = 0u,
            lpstrDrive: Pwstr = MutPtr(0L),
            dwReference: UInt = 0u,
        ): MciDgvStatusParmsw =
            MciDgvStatusParmsw(
                dwCallback = dwCallback,
                dwReturn = dwReturn,
                dwItem = dwItem,
                dwTrack = dwTrack,
                lpstrDriveCtorArg = lpstrDrive,
                dwReference = dwReference,
            )
    }
}

public data class MciDgvStepParms(
    public var dwCallback: Int = 0,
    public var dwFrames: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvStepParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciDgvStepParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MciDgvStepParms =
                    MciDgvStepParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MciDgvStepParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrames)
                }
            }
    }
}

public class MciDgvUpdateParms internal constructor(
    public var dwCallback: Int,
    public var rc: Rect,
    hDCCtorArg: Hdc,
) {
    public var hDC: Hdc = hDCCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        rc = Rect(),
        hDCCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Rect = this.rc

    public operator fun component3(): Hdc = this.hDC

    public fun copy(dwCallback: Int = this.dwCallback, rc: Rect = this.rc, hDC: Hdc = this.hDC): MciDgvUpdateParms = MciDgvUpdateParms(dwCallback = dwCallback, rc = rc, hDCCtorArg = hDC)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvUpdateParms) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.rc != other.rc) return false
        if (this.hDC != other.hDC) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.rc.hashCode()
        result = 31 * result + this.hDC.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            rc: Rect = Rect(),
            hDC: Hdc = MutPtr(0L),
        ): MciDgvUpdateParms =
            MciDgvUpdateParms(
                dwCallback = dwCallback,
                rc = rc,
                hDCCtorArg = hDC,
            )
    }
}

public class MciDgvWindowParmsa internal constructor(
    public var dwCallback: Int,
    hWndCtorArg: Hwnd,
    public var nCmdShow: UInt,
    lpstrTextCtorArg: Pstr,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var lpstrText: Pstr = lpstrTextCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        hWndCtorArg = MutPtr(0L),
        nCmdShow = 0u,
        lpstrTextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.nCmdShow

    public operator fun component4(): Pstr = this.lpstrText

    public fun copy(dwCallback: Int = this.dwCallback, hWnd: Hwnd = this.hWnd, nCmdShow: UInt = this.nCmdShow, lpstrText: Pstr = this.lpstrText): MciDgvWindowParmsa = MciDgvWindowParmsa(dwCallback = dwCallback, hWndCtorArg = hWnd, nCmdShow = nCmdShow, lpstrTextCtorArg = lpstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvWindowParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.hWnd != other.hWnd) return false
        if (this.nCmdShow != other.nCmdShow) return false
        if (this.lpstrText != other.lpstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.nCmdShow.hashCode()
        result = 31 * result + this.lpstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            hWnd: Hwnd = MutPtr(0L),
            nCmdShow: UInt = 0u,
            lpstrText: Pstr = MutPtr(0L),
        ): MciDgvWindowParmsa =
            MciDgvWindowParmsa(
                dwCallback = dwCallback,
                hWndCtorArg = hWnd,
                nCmdShow = nCmdShow,
                lpstrTextCtorArg = lpstrText,
            )
    }
}

public class MciDgvWindowParmsw internal constructor(
    public var dwCallback: Int,
    hWndCtorArg: Hwnd,
    public var nCmdShow: UInt,
    lpstrTextCtorArg: Pwstr,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var lpstrText: Pwstr = lpstrTextCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        hWndCtorArg = MutPtr(0L),
        nCmdShow = 0u,
        lpstrTextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.nCmdShow

    public operator fun component4(): Pwstr = this.lpstrText

    public fun copy(dwCallback: Int = this.dwCallback, hWnd: Hwnd = this.hWnd, nCmdShow: UInt = this.nCmdShow, lpstrText: Pwstr = this.lpstrText): MciDgvWindowParmsw = MciDgvWindowParmsw(dwCallback = dwCallback, hWndCtorArg = hWnd, nCmdShow = nCmdShow, lpstrTextCtorArg = lpstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciDgvWindowParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.hWnd != other.hWnd) return false
        if (this.nCmdShow != other.nCmdShow) return false
        if (this.lpstrText != other.lpstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.nCmdShow.hashCode()
        result = 31 * result + this.lpstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            hWnd: Hwnd = MutPtr(0L),
            nCmdShow: UInt = 0u,
            lpstrText: Pwstr = MutPtr(0L),
        ): MciDgvWindowParmsw =
            MciDgvWindowParmsw(
                dwCallback = dwCallback,
                hWndCtorArg = hWnd,
                nCmdShow = nCmdShow,
                lpstrTextCtorArg = lpstrText,
            )
    }
}

public data class MciGenericParms(
    public var dwCallback: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciGenericParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciGenericParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MciGenericParms =
                    MciGenericParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MciGenericParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                }
            }
    }
}

public data class MciGetdevcapsParms(
    public var dwCallback: Int = 0,
    public var dwReturn: UInt = 0u,
    public var dwItem: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciGetdevcapsParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciGetdevcapsParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MciGetdevcapsParms =
                    MciGetdevcapsParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MciGetdevcapsParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwReturn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwItem)
                }
            }
    }
}

public class MciInfoParmsa internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pstr,
    public var dwRetSize: UInt,
) {
    public var lpstrReturn: Pstr = lpstrReturnCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwRetSize = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwRetSize

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pstr = this.lpstrReturn, dwRetSize: UInt = this.dwRetSize): MciInfoParmsa = MciInfoParmsa(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwRetSize = dwRetSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciInfoParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwRetSize != other.dwRetSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwRetSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pstr = MutPtr(0L),
            dwRetSize: UInt = 0u,
        ): MciInfoParmsa =
            MciInfoParmsa(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwRetSize = dwRetSize,
            )
    }
}

public class MciInfoParmsw internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pwstr,
    public var dwRetSize: UInt,
) {
    public var lpstrReturn: Pwstr = lpstrReturnCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwRetSize = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwRetSize

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pwstr = this.lpstrReturn, dwRetSize: UInt = this.dwRetSize): MciInfoParmsw = MciInfoParmsw(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwRetSize = dwRetSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciInfoParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwRetSize != other.dwRetSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwRetSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pwstr = MutPtr(0L),
            dwRetSize: UInt = 0u,
        ): MciInfoParmsw =
            MciInfoParmsw(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwRetSize = dwRetSize,
            )
    }
}

public class MciLoadParmsa internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcstr,
) {
    public var lpfilename: Pcstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcstr = this.lpfilename

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcstr = this.lpfilename): MciLoadParmsa = MciLoadParmsa(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciLoadParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcstr = ConstPtr(0L),
        ): MciLoadParmsa =
            MciLoadParmsa(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
            )
    }
}

public class MciLoadParmsw internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcwstr,
) {
    public var lpfilename: Pcwstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcwstr = this.lpfilename

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcwstr = this.lpfilename): MciLoadParmsw = MciLoadParmsw(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciLoadParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcwstr = ConstPtr(0L),
        ): MciLoadParmsw =
            MciLoadParmsw(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
            )
    }
}

public class MciOpenDriverParms internal constructor(
    public var wDeviceID: UInt,
    lpstrParamsCtorArg: Pcwstr,
    public var wCustomCommandTable: UInt,
    public var wType: UInt,
) {
    public var lpstrParams: Pcwstr = lpstrParamsCtorArg
        internal set

    public constructor() : this(
        wDeviceID = 0u,
        lpstrParamsCtorArg = ConstPtr(0L),
        wCustomCommandTable = 0u,
        wType = 0u,
    )

    public operator fun component1(): UInt = this.wDeviceID

    public operator fun component2(): Pcwstr = this.lpstrParams

    public operator fun component3(): UInt = this.wCustomCommandTable

    public operator fun component4(): UInt = this.wType

    public fun copy(wDeviceID: UInt = this.wDeviceID, lpstrParams: Pcwstr = this.lpstrParams, wCustomCommandTable: UInt = this.wCustomCommandTable, wType: UInt = this.wType): MciOpenDriverParms = MciOpenDriverParms(wDeviceID = wDeviceID, lpstrParamsCtorArg = lpstrParams, wCustomCommandTable = wCustomCommandTable, wType = wType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOpenDriverParms) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrParams != other.lpstrParams) return false
        if (this.wCustomCommandTable != other.wCustomCommandTable) return false
        if (this.wType != other.wType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrParams.hashCode()
        result = 31 * result + this.wCustomCommandTable.hashCode()
        result = 31 * result + this.wType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wDeviceID: UInt = 0u,
            lpstrParams: Pcwstr = ConstPtr(0L),
            wCustomCommandTable: UInt = 0u,
            wType: UInt = 0u,
        ): MciOpenDriverParms =
            MciOpenDriverParms(
                wDeviceID = wDeviceID,
                lpstrParamsCtorArg = lpstrParams,
                wCustomCommandTable = wCustomCommandTable,
                wType = wType,
            )
    }
}

public class MciOpenParmsa internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcstr,
    lpstrElementNameCtorArg: Pcstr,
    lpstrAliasCtorArg: Pcstr,
) {
    public var lpstrDeviceType: Pcstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcstr = lpstrAliasCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcstr = this.lpstrDeviceType

    public operator fun component4(): Pcstr = this.lpstrElementName

    public operator fun component5(): Pcstr = this.lpstrAlias

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcstr = this.lpstrDeviceType, lpstrElementName: Pcstr = this.lpstrElementName, lpstrAlias: Pcstr = this.lpstrAlias): MciOpenParmsa = MciOpenParmsa(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOpenParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcstr = ConstPtr(0L),
            lpstrElementName: Pcstr = ConstPtr(0L),
            lpstrAlias: Pcstr = ConstPtr(0L),
        ): MciOpenParmsa =
            MciOpenParmsa(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
            )
    }
}

public class MciOpenParmsw internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcwstr,
    lpstrElementNameCtorArg: Pcwstr,
    lpstrAliasCtorArg: Pcwstr,
) {
    public var lpstrDeviceType: Pcwstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcwstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcwstr = lpstrAliasCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcwstr = this.lpstrDeviceType

    public operator fun component4(): Pcwstr = this.lpstrElementName

    public operator fun component5(): Pcwstr = this.lpstrAlias

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcwstr = this.lpstrDeviceType, lpstrElementName: Pcwstr = this.lpstrElementName, lpstrAlias: Pcwstr = this.lpstrAlias): MciOpenParmsw = MciOpenParmsw(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOpenParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcwstr = ConstPtr(0L),
            lpstrElementName: Pcwstr = ConstPtr(0L),
            lpstrAlias: Pcwstr = ConstPtr(0L),
        ): MciOpenParmsw =
            MciOpenParmsw(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
            )
    }
}

public class MciOvlyLoadParmsa internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcstr,
    public var rc: Rect,
) {
    public var lpfilename: Pcstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcstr = this.lpfilename

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcstr = this.lpfilename, rc: Rect = this.rc): MciOvlyLoadParmsa = MciOvlyLoadParmsa(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlyLoadParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcstr = ConstPtr(0L),
            rc: Rect = Rect(),
        ): MciOvlyLoadParmsa =
            MciOvlyLoadParmsa(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
                rc = rc,
            )
    }
}

public class MciOvlyLoadParmsw internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcwstr,
    public var rc: Rect,
) {
    public var lpfilename: Pcwstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcwstr = this.lpfilename

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcwstr = this.lpfilename, rc: Rect = this.rc): MciOvlyLoadParmsw = MciOvlyLoadParmsw(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlyLoadParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcwstr = ConstPtr(0L),
            rc: Rect = Rect(),
        ): MciOvlyLoadParmsw =
            MciOvlyLoadParmsw(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
                rc = rc,
            )
    }
}

public class MciOvlyOpenParmsa internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcstr,
    lpstrElementNameCtorArg: Pcstr,
    lpstrAliasCtorArg: Pcstr,
    public var dwStyle: UInt,
    hWndParentCtorArg: Hwnd,
) {
    public var lpstrDeviceType: Pcstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcstr = lpstrAliasCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
        dwStyle = 0u,
        hWndParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcstr = this.lpstrDeviceType

    public operator fun component4(): Pcstr = this.lpstrElementName

    public operator fun component5(): Pcstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwStyle

    public operator fun component7(): Hwnd = this.hWndParent

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcstr = this.lpstrDeviceType, lpstrElementName: Pcstr = this.lpstrElementName, lpstrAlias: Pcstr = this.lpstrAlias, dwStyle: UInt = this.dwStyle, hWndParent: Hwnd = this.hWndParent): MciOvlyOpenParmsa = MciOvlyOpenParmsa(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwStyle = dwStyle, hWndParentCtorArg = hWndParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlyOpenParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.hWndParent != other.hWndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcstr = ConstPtr(0L),
            lpstrElementName: Pcstr = ConstPtr(0L),
            lpstrAlias: Pcstr = ConstPtr(0L),
            dwStyle: UInt = 0u,
            hWndParent: Hwnd = MutPtr(0L),
        ): MciOvlyOpenParmsa =
            MciOvlyOpenParmsa(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwStyle = dwStyle,
                hWndParentCtorArg = hWndParent,
            )
    }
}

public class MciOvlyOpenParmsw internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcwstr,
    lpstrElementNameCtorArg: Pcwstr,
    lpstrAliasCtorArg: Pcwstr,
    public var dwStyle: UInt,
    hWndParentCtorArg: Hwnd,
) {
    public var lpstrDeviceType: Pcwstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcwstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcwstr = lpstrAliasCtorArg
        internal set

    public var hWndParent: Hwnd = hWndParentCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
        dwStyle = 0u,
        hWndParentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcwstr = this.lpstrDeviceType

    public operator fun component4(): Pcwstr = this.lpstrElementName

    public operator fun component5(): Pcwstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwStyle

    public operator fun component7(): Hwnd = this.hWndParent

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcwstr = this.lpstrDeviceType, lpstrElementName: Pcwstr = this.lpstrElementName, lpstrAlias: Pcwstr = this.lpstrAlias, dwStyle: UInt = this.dwStyle, hWndParent: Hwnd = this.hWndParent): MciOvlyOpenParmsw = MciOvlyOpenParmsw(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwStyle = dwStyle, hWndParentCtorArg = hWndParent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlyOpenParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwStyle != other.dwStyle) return false
        if (this.hWndParent != other.hWndParent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwStyle.hashCode()
        result = 31 * result + this.hWndParent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcwstr = ConstPtr(0L),
            lpstrElementName: Pcwstr = ConstPtr(0L),
            lpstrAlias: Pcwstr = ConstPtr(0L),
            dwStyle: UInt = 0u,
            hWndParent: Hwnd = MutPtr(0L),
        ): MciOvlyOpenParmsw =
            MciOvlyOpenParmsw(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwStyle = dwStyle,
                hWndParentCtorArg = hWndParent,
            )
    }
}

public data class MciOvlyRectParms(
    public var dwCallback: Int = 0,
    public var rc: Rect = Rect(),
)

public class MciOvlySaveParmsa internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcstr,
    public var rc: Rect,
) {
    public var lpfilename: Pcstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcstr = this.lpfilename

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcstr = this.lpfilename, rc: Rect = this.rc): MciOvlySaveParmsa = MciOvlySaveParmsa(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlySaveParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcstr = ConstPtr(0L),
            rc: Rect = Rect(),
        ): MciOvlySaveParmsa =
            MciOvlySaveParmsa(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
                rc = rc,
            )
    }
}

public class MciOvlySaveParmsw internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcwstr,
    public var rc: Rect,
) {
    public var lpfilename: Pcwstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
        rc = Rect(),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcwstr = this.lpfilename

    public operator fun component3(): Rect = this.rc

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcwstr = this.lpfilename, rc: Rect = this.rc): MciOvlySaveParmsw = MciOvlySaveParmsw(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename, rc = rc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlySaveParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        if (this.rc != other.rc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        result = 31 * result + this.rc.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcwstr = ConstPtr(0L),
            rc: Rect = Rect(),
        ): MciOvlySaveParmsw =
            MciOvlySaveParmsw(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
                rc = rc,
            )
    }
}

public class MciOvlyWindowParmsa internal constructor(
    public var dwCallback: Int,
    hWndCtorArg: Hwnd,
    public var nCmdShow: UInt,
    lpstrTextCtorArg: Pcstr,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var lpstrText: Pcstr = lpstrTextCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        hWndCtorArg = MutPtr(0L),
        nCmdShow = 0u,
        lpstrTextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.nCmdShow

    public operator fun component4(): Pcstr = this.lpstrText

    public fun copy(dwCallback: Int = this.dwCallback, hWnd: Hwnd = this.hWnd, nCmdShow: UInt = this.nCmdShow, lpstrText: Pcstr = this.lpstrText): MciOvlyWindowParmsa = MciOvlyWindowParmsa(dwCallback = dwCallback, hWndCtorArg = hWnd, nCmdShow = nCmdShow, lpstrTextCtorArg = lpstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlyWindowParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.hWnd != other.hWnd) return false
        if (this.nCmdShow != other.nCmdShow) return false
        if (this.lpstrText != other.lpstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.nCmdShow.hashCode()
        result = 31 * result + this.lpstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            hWnd: Hwnd = MutPtr(0L),
            nCmdShow: UInt = 0u,
            lpstrText: Pcstr = ConstPtr(0L),
        ): MciOvlyWindowParmsa =
            MciOvlyWindowParmsa(
                dwCallback = dwCallback,
                hWndCtorArg = hWnd,
                nCmdShow = nCmdShow,
                lpstrTextCtorArg = lpstrText,
            )
    }
}

public class MciOvlyWindowParmsw internal constructor(
    public var dwCallback: Int,
    hWndCtorArg: Hwnd,
    public var nCmdShow: UInt,
    lpstrTextCtorArg: Pcwstr,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var lpstrText: Pcwstr = lpstrTextCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        hWndCtorArg = MutPtr(0L),
        nCmdShow = 0u,
        lpstrTextCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.nCmdShow

    public operator fun component4(): Pcwstr = this.lpstrText

    public fun copy(dwCallback: Int = this.dwCallback, hWnd: Hwnd = this.hWnd, nCmdShow: UInt = this.nCmdShow, lpstrText: Pcwstr = this.lpstrText): MciOvlyWindowParmsw = MciOvlyWindowParmsw(dwCallback = dwCallback, hWndCtorArg = hWnd, nCmdShow = nCmdShow, lpstrTextCtorArg = lpstrText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciOvlyWindowParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.hWnd != other.hWnd) return false
        if (this.nCmdShow != other.nCmdShow) return false
        if (this.lpstrText != other.lpstrText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.nCmdShow.hashCode()
        result = 31 * result + this.lpstrText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            hWnd: Hwnd = MutPtr(0L),
            nCmdShow: UInt = 0u,
            lpstrText: Pcwstr = ConstPtr(0L),
        ): MciOvlyWindowParmsw =
            MciOvlyWindowParmsw(
                dwCallback = dwCallback,
                hWndCtorArg = hWnd,
                nCmdShow = nCmdShow,
                lpstrTextCtorArg = lpstrText,
            )
    }
}

public data class MciPlayParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciPlayParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciPlayParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MciPlayParms =
                    MciPlayParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MciPlayParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTo)
                }
            }
    }
}

public data class MciRecordParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciRecordParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciRecordParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MciRecordParms =
                    MciRecordParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MciRecordParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTo)
                }
            }
    }
}

public class MciSaveParmsa internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcstr,
) {
    public var lpfilename: Pcstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcstr = this.lpfilename

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcstr = this.lpfilename): MciSaveParmsa = MciSaveParmsa(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciSaveParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcstr = ConstPtr(0L),
        ): MciSaveParmsa =
            MciSaveParmsa(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
            )
    }
}

public class MciSaveParmsw internal constructor(
    public var dwCallback: Int,
    lpfilenameCtorArg: Pcwstr,
) {
    public var lpfilename: Pcwstr = lpfilenameCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpfilenameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcwstr = this.lpfilename

    public fun copy(dwCallback: Int = this.dwCallback, lpfilename: Pcwstr = this.lpfilename): MciSaveParmsw = MciSaveParmsw(dwCallback = dwCallback, lpfilenameCtorArg = lpfilename)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciSaveParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpfilename != other.lpfilename) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpfilename.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpfilename: Pcwstr = ConstPtr(0L),
        ): MciSaveParmsw =
            MciSaveParmsw(
                dwCallback = dwCallback,
                lpfilenameCtorArg = lpfilename,
            )
    }
}

public data class MciSeekParms(
    public var dwCallback: Int = 0,
    public var dwTo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciSeekParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciSeekParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MciSeekParms =
                    MciSeekParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MciSeekParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTo)
                }
            }
    }
}

public data class MciSeqSetParms(
    public var dwCallback: Int = 0,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var dwTempo: UInt = 0u,
    public var dwPort: UInt = 0u,
    public var dwSlave: UInt = 0u,
    public var dwMaster: UInt = 0u,
    public var dwOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciSeqSetParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciSeqSetParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): MciSeqSetParms =
                    MciSeqSetParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: MciSeqSetParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAudio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwTempo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwSlave)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwMaster)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwOffset)
                }
            }
    }
}

public data class MciSetParms(
    public var dwCallback: Int = 0,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciSetParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciSetParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MciSetParms =
                    MciSetParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MciSetParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAudio)
                }
            }
    }
}

public data class MciStatusParms(
    public var dwCallback: Int = 0,
    public var dwReturn: Int = 0,
    public var dwItem: UInt = 0u,
    public var dwTrack: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MciStatusParms =
                    MciStatusParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MciStatusParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwReturn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwItem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwTrack)
                }
            }
    }
}

public class MciSysinfoParmsa internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pstr,
    public var dwRetSize: UInt,
    public var dwNumber: UInt,
    public var wDeviceType: UInt,
) {
    public var lpstrReturn: Pstr = lpstrReturnCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwRetSize = 0u,
        dwNumber = 0u,
        wDeviceType = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwRetSize

    public operator fun component4(): UInt = this.dwNumber

    public operator fun component5(): UInt = this.wDeviceType

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pstr = this.lpstrReturn, dwRetSize: UInt = this.dwRetSize, dwNumber: UInt = this.dwNumber, wDeviceType: UInt = this.wDeviceType): MciSysinfoParmsa = MciSysinfoParmsa(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwRetSize = dwRetSize, dwNumber = dwNumber, wDeviceType = wDeviceType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciSysinfoParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwRetSize != other.dwRetSize) return false
        if (this.dwNumber != other.dwNumber) return false
        if (this.wDeviceType != other.wDeviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwRetSize.hashCode()
        result = 31 * result + this.dwNumber.hashCode()
        result = 31 * result + this.wDeviceType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pstr = MutPtr(0L),
            dwRetSize: UInt = 0u,
            dwNumber: UInt = 0u,
            wDeviceType: UInt = 0u,
        ): MciSysinfoParmsa =
            MciSysinfoParmsa(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwRetSize = dwRetSize,
                dwNumber = dwNumber,
                wDeviceType = wDeviceType,
            )
    }
}

public class MciSysinfoParmsw internal constructor(
    public var dwCallback: Int,
    lpstrReturnCtorArg: Pwstr,
    public var dwRetSize: UInt,
    public var dwNumber: UInt,
    public var wDeviceType: UInt,
) {
    public var lpstrReturn: Pwstr = lpstrReturnCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrReturnCtorArg = MutPtr(0L),
        dwRetSize = 0u,
        dwNumber = 0u,
        wDeviceType = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pwstr = this.lpstrReturn

    public operator fun component3(): UInt = this.dwRetSize

    public operator fun component4(): UInt = this.dwNumber

    public operator fun component5(): UInt = this.wDeviceType

    public fun copy(dwCallback: Int = this.dwCallback, lpstrReturn: Pwstr = this.lpstrReturn, dwRetSize: UInt = this.dwRetSize, dwNumber: UInt = this.dwNumber, wDeviceType: UInt = this.wDeviceType): MciSysinfoParmsw = MciSysinfoParmsw(dwCallback = dwCallback, lpstrReturnCtorArg = lpstrReturn, dwRetSize = dwRetSize, dwNumber = dwNumber, wDeviceType = wDeviceType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciSysinfoParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrReturn != other.lpstrReturn) return false
        if (this.dwRetSize != other.dwRetSize) return false
        if (this.dwNumber != other.dwNumber) return false
        if (this.wDeviceType != other.wDeviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrReturn.hashCode()
        result = 31 * result + this.dwRetSize.hashCode()
        result = 31 * result + this.dwNumber.hashCode()
        result = 31 * result + this.wDeviceType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrReturn: Pwstr = MutPtr(0L),
            dwRetSize: UInt = 0u,
            dwNumber: UInt = 0u,
            wDeviceType: UInt = 0u,
        ): MciSysinfoParmsw =
            MciSysinfoParmsw(
                dwCallback = dwCallback,
                lpstrReturnCtorArg = lpstrReturn,
                dwRetSize = dwRetSize,
                dwNumber = dwNumber,
                wDeviceType = wDeviceType,
            )
    }
}

public class MciVdEscapeParmsa internal constructor(
    public var dwCallback: Int,
    lpstrCommandCtorArg: Pcstr,
) {
    public var lpstrCommand: Pcstr = lpstrCommandCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrCommandCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcstr = this.lpstrCommand

    public fun copy(dwCallback: Int = this.dwCallback, lpstrCommand: Pcstr = this.lpstrCommand): MciVdEscapeParmsa = MciVdEscapeParmsa(dwCallback = dwCallback, lpstrCommandCtorArg = lpstrCommand)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciVdEscapeParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrCommand != other.lpstrCommand) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrCommand.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrCommand: Pcstr = ConstPtr(0L),
        ): MciVdEscapeParmsa =
            MciVdEscapeParmsa(
                dwCallback = dwCallback,
                lpstrCommandCtorArg = lpstrCommand,
            )
    }
}

public class MciVdEscapeParmsw internal constructor(
    public var dwCallback: Int,
    lpstrCommandCtorArg: Pcwstr,
) {
    public var lpstrCommand: Pcwstr = lpstrCommandCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        lpstrCommandCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): Pcwstr = this.lpstrCommand

    public fun copy(dwCallback: Int = this.dwCallback, lpstrCommand: Pcwstr = this.lpstrCommand): MciVdEscapeParmsw = MciVdEscapeParmsw(dwCallback = dwCallback, lpstrCommandCtorArg = lpstrCommand)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciVdEscapeParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.lpstrCommand != other.lpstrCommand) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.lpstrCommand.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            lpstrCommand: Pcwstr = ConstPtr(0L),
        ): MciVdEscapeParmsw =
            MciVdEscapeParmsw(
                dwCallback = dwCallback,
                lpstrCommandCtorArg = lpstrCommand,
            )
    }
}

public data class MciVdPlayParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
    public var dwSpeed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciVdPlayParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciVdPlayParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MciVdPlayParms =
                    MciVdPlayParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MciVdPlayParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwSpeed)
                }
            }
    }
}

public data class MciVdStepParms(
    public var dwCallback: Int = 0,
    public var dwFrames: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciVdStepParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciVdStepParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MciVdStepParms =
                    MciVdStepParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MciVdStepParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrames)
                }
            }
    }
}

public data class MciWaveDeleteParms(
    public var dwCallback: Int = 0,
    public var dwFrom: UInt = 0u,
    public var dwTo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciWaveDeleteParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciWaveDeleteParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MciWaveDeleteParms =
                    MciWaveDeleteParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MciWaveDeleteParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFrom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTo)
                }
            }
    }
}

public class MciWaveOpenParmsa internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcstr,
    lpstrElementNameCtorArg: Pcstr,
    lpstrAliasCtorArg: Pcstr,
    public var dwBufferSeconds: UInt,
) {
    public var lpstrDeviceType: Pcstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcstr = lpstrAliasCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
        dwBufferSeconds = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcstr = this.lpstrDeviceType

    public operator fun component4(): Pcstr = this.lpstrElementName

    public operator fun component5(): Pcstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwBufferSeconds

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcstr = this.lpstrDeviceType, lpstrElementName: Pcstr = this.lpstrElementName, lpstrAlias: Pcstr = this.lpstrAlias, dwBufferSeconds: UInt = this.dwBufferSeconds): MciWaveOpenParmsa = MciWaveOpenParmsa(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwBufferSeconds = dwBufferSeconds)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciWaveOpenParmsa) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwBufferSeconds != other.dwBufferSeconds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwBufferSeconds.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcstr = ConstPtr(0L),
            lpstrElementName: Pcstr = ConstPtr(0L),
            lpstrAlias: Pcstr = ConstPtr(0L),
            dwBufferSeconds: UInt = 0u,
        ): MciWaveOpenParmsa =
            MciWaveOpenParmsa(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwBufferSeconds = dwBufferSeconds,
            )
    }
}

public class MciWaveOpenParmsw internal constructor(
    public var dwCallback: Int,
    public var wDeviceID: UInt,
    lpstrDeviceTypeCtorArg: Pcwstr,
    lpstrElementNameCtorArg: Pcwstr,
    lpstrAliasCtorArg: Pcwstr,
    public var dwBufferSeconds: UInt,
) {
    public var lpstrDeviceType: Pcwstr = lpstrDeviceTypeCtorArg
        internal set

    public var lpstrElementName: Pcwstr = lpstrElementNameCtorArg
        internal set

    public var lpstrAlias: Pcwstr = lpstrAliasCtorArg
        internal set

    public constructor() : this(
        dwCallback = 0,
        wDeviceID = 0u,
        lpstrDeviceTypeCtorArg = ConstPtr(0L),
        lpstrElementNameCtorArg = ConstPtr(0L),
        lpstrAliasCtorArg = ConstPtr(0L),
        dwBufferSeconds = 0u,
    )

    public operator fun component1(): Int = this.dwCallback

    public operator fun component2(): UInt = this.wDeviceID

    public operator fun component3(): Pcwstr = this.lpstrDeviceType

    public operator fun component4(): Pcwstr = this.lpstrElementName

    public operator fun component5(): Pcwstr = this.lpstrAlias

    public operator fun component6(): UInt = this.dwBufferSeconds

    public fun copy(dwCallback: Int = this.dwCallback, wDeviceID: UInt = this.wDeviceID, lpstrDeviceType: Pcwstr = this.lpstrDeviceType, lpstrElementName: Pcwstr = this.lpstrElementName, lpstrAlias: Pcwstr = this.lpstrAlias, dwBufferSeconds: UInt = this.dwBufferSeconds): MciWaveOpenParmsw = MciWaveOpenParmsw(dwCallback = dwCallback, wDeviceID = wDeviceID, lpstrDeviceTypeCtorArg = lpstrDeviceType, lpstrElementNameCtorArg = lpstrElementName, lpstrAliasCtorArg = lpstrAlias, dwBufferSeconds = dwBufferSeconds)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MciWaveOpenParmsw) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.wDeviceID != other.wDeviceID) return false
        if (this.lpstrDeviceType != other.lpstrDeviceType) return false
        if (this.lpstrElementName != other.lpstrElementName) return false
        if (this.lpstrAlias != other.lpstrAlias) return false
        if (this.dwBufferSeconds != other.dwBufferSeconds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCallback.hashCode()
        result = 31 * result + this.wDeviceID.hashCode()
        result = 31 * result + this.lpstrDeviceType.hashCode()
        result = 31 * result + this.lpstrElementName.hashCode()
        result = 31 * result + this.lpstrAlias.hashCode()
        result = 31 * result + this.dwBufferSeconds.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwCallback: Int = 0,
            wDeviceID: UInt = 0u,
            lpstrDeviceType: Pcwstr = ConstPtr(0L),
            lpstrElementName: Pcwstr = ConstPtr(0L),
            lpstrAlias: Pcwstr = ConstPtr(0L),
            dwBufferSeconds: UInt = 0u,
        ): MciWaveOpenParmsw =
            MciWaveOpenParmsw(
                dwCallback = dwCallback,
                wDeviceID = wDeviceID,
                lpstrDeviceTypeCtorArg = lpstrDeviceType,
                lpstrElementNameCtorArg = lpstrElementName,
                lpstrAliasCtorArg = lpstrAlias,
                dwBufferSeconds = dwBufferSeconds,
            )
    }
}

public data class MciWaveSetParms(
    public var dwCallback: Int = 0,
    public var dwTimeFormat: UInt = 0u,
    public var dwAudio: UInt = 0u,
    public var wInput: UInt = 0u,
    public var wOutput: UInt = 0u,
    public var wFormatTag: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var nChannels: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var nSamplesPerSec: UInt = 0u,
    public var nAvgBytesPerSec: UInt = 0u,
    public var nBlockAlign: UShort = 0u,
    public var wReserved4: UShort = 0u,
    public var wBitsPerSample: UShort = 0u,
    public var wReserved5: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciWaveSetParms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciWaveSetParms> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MciWaveSetParms =
                    MciWaveSetParms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                    )
                override fun writeNative(addr: Long, value: MciWaveSetParms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAudio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.wInput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.wOutput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.wFormatTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.wReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.nChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.wReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nSamplesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.nAvgBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.nBlockAlign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.wReserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.wBitsPerSample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.wReserved5)
                }
            }
    }
}

public data class Mediaspaceadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
)

public data class Midiopenstrmid(
    public var dwStreamID: UInt = 0u,
    public var uDeviceID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiopenstrmid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Midiopenstrmid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Midiopenstrmid =
                    Midiopenstrmid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Midiopenstrmid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStreamID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uDeviceID)
                }
            }
    }
}

public class Mixeropendesc internal constructor(
    hmxCtorArg: Hmixer,
    pReserved0CtorArg: MutPtr,
    public var dwCallback: Int,
    public var dwInstance: Int,
    public var dnDevNode: Int,
) {
    public var hmx: Hmixer = hmxCtorArg
        internal set

    public var pReserved0: MutPtr = pReserved0CtorArg
        internal set

    public constructor() : this(
        hmxCtorArg = MutPtr(0L),
        pReserved0CtorArg = MutPtr(0L),
        dwCallback = 0,
        dwInstance = 0,
        dnDevNode = 0,
    )

    public operator fun component1(): Hmixer = this.hmx

    public operator fun component2(): MutPtr = this.pReserved0

    public operator fun component3(): Int = this.dwCallback

    public operator fun component4(): Int = this.dwInstance

    public operator fun component5(): Int = this.dnDevNode

    public fun copy(hmx: Hmixer = this.hmx, pReserved0: MutPtr = this.pReserved0, dwCallback: Int = this.dwCallback, dwInstance: Int = this.dwInstance, dnDevNode: Int = this.dnDevNode): Mixeropendesc = Mixeropendesc(hmxCtorArg = hmx, pReserved0CtorArg = pReserved0, dwCallback = dwCallback, dwInstance = dwInstance, dnDevNode = dnDevNode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mixeropendesc) return false
        if (this.hmx != other.hmx) return false
        if (this.pReserved0 != other.pReserved0) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwInstance != other.dwInstance) return false
        if (this.dnDevNode != other.dnDevNode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hmx.hashCode()
        result = 31 * result + this.pReserved0.hashCode()
        result = 31 * result + this.dwCallback.hashCode()
        result = 31 * result + this.dwInstance.hashCode()
        result = 31 * result + this.dnDevNode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hmx: Hmixer = MutPtr(0L),
            pReserved0: MutPtr = MutPtr(0L),
            dwCallback: Int = 0,
            dwInstance: Int = 0,
            dnDevNode: Int = 0,
        ): Mixeropendesc =
            Mixeropendesc(
                hmxCtorArg = hmx,
                pReserved0CtorArg = pReserved0,
                dwCallback = dwCallback,
                dwInstance = dwInstance,
                dnDevNode = dnDevNode,
            )
    }
}

public data class Mmckinfo(
    public var ckid: UInt = 0u,
    public var cksize: UInt = 0u,
    public var fccType: UInt = 0u,
    public var dwDataOffset: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmckinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmckinfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Mmckinfo =
                    Mmckinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Mmckinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ckid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fccType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFlags)
                }
            }
    }
}

public class Mmioinfo internal constructor(
    public var dwFlags: UInt,
    public var fccIOProc: UInt,
    public var pIOProc: Lpmmioproc,
    public var wErrorRet: UInt,
    htaskCtorArg: Htask,
    public var cchBuffer: Int,
    pchBufferCtorArg: MutPtr,
    pchNextCtorArg: MutPtr,
    pchEndReadCtorArg: MutPtr,
    pchEndWriteCtorArg: MutPtr,
    public var lBufOffset: Int,
    public var lDiskOffset: Int,
    public var adwInfo: UIntArray,
    public var dwReserved1: UInt,
    public var dwReserved2: UInt,
    hmmioCtorArg: Hmmio,
) {
    public var htask: Htask = htaskCtorArg
        internal set

    public var pchBuffer: MutPtr = pchBufferCtorArg
        internal set

    public var pchNext: MutPtr = pchNextCtorArg
        internal set

    public var pchEndRead: MutPtr = pchEndReadCtorArg
        internal set

    public var pchEndWrite: MutPtr = pchEndWriteCtorArg
        internal set

    public var hmmio: Hmmio = hmmioCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        fccIOProc = 0u,
        pIOProc = null,
        wErrorRet = 0u,
        htaskCtorArg = MutPtr(0L),
        cchBuffer = 0,
        pchBufferCtorArg = MutPtr(0L),
        pchNextCtorArg = MutPtr(0L),
        pchEndReadCtorArg = MutPtr(0L),
        pchEndWriteCtorArg = MutPtr(0L),
        lBufOffset = 0,
        lDiskOffset = 0,
        adwInfo = UIntArray(3),
        dwReserved1 = 0u,
        dwReserved2 = 0u,
        hmmioCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): UInt = this.fccIOProc

    public operator fun component3(): Lpmmioproc = this.pIOProc

    public operator fun component4(): UInt = this.wErrorRet

    public operator fun component5(): Htask = this.htask

    public operator fun component6(): Int = this.cchBuffer

    public operator fun component7(): MutPtr = this.pchBuffer

    public operator fun component8(): MutPtr = this.pchNext

    public operator fun component9(): MutPtr = this.pchEndRead

    public operator fun component10(): MutPtr = this.pchEndWrite

    public operator fun component11(): Int = this.lBufOffset

    public operator fun component12(): Int = this.lDiskOffset

    public operator fun component13(): UIntArray = this.adwInfo

    public operator fun component14(): UInt = this.dwReserved1

    public operator fun component15(): UInt = this.dwReserved2

    public operator fun component16(): Hmmio = this.hmmio

    public fun copy(dwFlags: UInt = this.dwFlags, fccIOProc: UInt = this.fccIOProc, pIOProc: Lpmmioproc = this.pIOProc, wErrorRet: UInt = this.wErrorRet, htask: Htask = this.htask, cchBuffer: Int = this.cchBuffer, pchBuffer: MutPtr = this.pchBuffer, pchNext: MutPtr = this.pchNext, pchEndRead: MutPtr = this.pchEndRead, pchEndWrite: MutPtr = this.pchEndWrite, lBufOffset: Int = this.lBufOffset, lDiskOffset: Int = this.lDiskOffset, adwInfo: UIntArray = this.adwInfo, dwReserved1: UInt = this.dwReserved1, dwReserved2: UInt = this.dwReserved2, hmmio: Hmmio = this.hmmio): Mmioinfo = Mmioinfo(dwFlags = dwFlags, fccIOProc = fccIOProc, pIOProc = pIOProc, wErrorRet = wErrorRet, htaskCtorArg = htask, cchBuffer = cchBuffer, pchBufferCtorArg = pchBuffer, pchNextCtorArg = pchNext, pchEndReadCtorArg = pchEndRead, pchEndWriteCtorArg = pchEndWrite, lBufOffset = lBufOffset, lDiskOffset = lDiskOffset, adwInfo = adwInfo, dwReserved1 = dwReserved1, dwReserved2 = dwReserved2, hmmioCtorArg = hmmio)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mmioinfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.fccIOProc != other.fccIOProc) return false
        if (this.pIOProc != other.pIOProc) return false
        if (this.wErrorRet != other.wErrorRet) return false
        if (this.htask != other.htask) return false
        if (this.cchBuffer != other.cchBuffer) return false
        if (this.pchBuffer != other.pchBuffer) return false
        if (this.pchNext != other.pchNext) return false
        if (this.pchEndRead != other.pchEndRead) return false
        if (this.pchEndWrite != other.pchEndWrite) return false
        if (this.lBufOffset != other.lBufOffset) return false
        if (this.lDiskOffset != other.lDiskOffset) return false
        if (!this.adwInfo.contentEquals(other.adwInfo)) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        if (this.hmmio != other.hmmio) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.fccIOProc.hashCode()
        result = 31 * result + this.pIOProc.hashCode()
        result = 31 * result + this.wErrorRet.hashCode()
        result = 31 * result + this.htask.hashCode()
        result = 31 * result + this.cchBuffer.hashCode()
        result = 31 * result + this.pchBuffer.hashCode()
        result = 31 * result + this.pchNext.hashCode()
        result = 31 * result + this.pchEndRead.hashCode()
        result = 31 * result + this.pchEndWrite.hashCode()
        result = 31 * result + this.lBufOffset.hashCode()
        result = 31 * result + this.lDiskOffset.hashCode()
        result = 31 * result + this.adwInfo.contentHashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        result = 31 * result + this.hmmio.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            fccIOProc: UInt = 0u,
            pIOProc: Lpmmioproc = null,
            wErrorRet: UInt = 0u,
            htask: Htask = MutPtr(0L),
            cchBuffer: Int = 0,
            pchBuffer: MutPtr = MutPtr(0L),
            pchNext: MutPtr = MutPtr(0L),
            pchEndRead: MutPtr = MutPtr(0L),
            pchEndWrite: MutPtr = MutPtr(0L),
            lBufOffset: Int = 0,
            lDiskOffset: Int = 0,
            adwInfo: UIntArray = UIntArray(3),
            dwReserved1: UInt = 0u,
            dwReserved2: UInt = 0u,
            hmmio: Hmmio = MutPtr(0L),
        ): Mmioinfo =
            Mmioinfo(
                dwFlags = dwFlags,
                fccIOProc = fccIOProc,
                pIOProc = pIOProc,
                wErrorRet = wErrorRet,
                htaskCtorArg = htask,
                cchBuffer = cchBuffer,
                pchBufferCtorArg = pchBuffer,
                pchNextCtorArg = pchNext,
                pchEndReadCtorArg = pchEndRead,
                pchEndWriteCtorArg = pchEndWrite,
                lBufOffset = lBufOffset,
                lDiskOffset = lDiskOffset,
                adwInfo = adwInfo,
                dwReserved1 = dwReserved1,
                dwReserved2 = dwReserved2,
                hmmioCtorArg = hmmio,
            )
    }
}

public data class Msaudio1waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
    public var wEncodeOptions: UShort = 0u,
)

public data class NmsVbxadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wSamplesPerBlock: UShort = 0u,
)

public data class Oliadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Olicelpwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Oligsmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Olioprwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Olisbcwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class Sierraadpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
)

public data class Sonarcwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wCompType: UShort = 0u,
)

public data class Timerevent(
    public var wDelay: UShort = 0u,
    public var wResolution: UShort = 0u,
    public var lpFunction: Lptimecallback = null,
    public var dwUser: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var wReserved1: UShort = 0u,
)

public data class Truespeechwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wRevision: UShort = 0u,
    public var nSamplesPerBlock: UShort = 0u,
    public var abReserved: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Truespeechwaveformat) return false
        if (this.wfx != other.wfx) return false
        if (this.wRevision != other.wRevision) return false
        if (this.nSamplesPerBlock != other.nSamplesPerBlock) return false
        if (!this.abReserved.contentEquals(other.abReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wfx.hashCode()
        result = 31 * result + this.wRevision.hashCode()
        result = 31 * result + this.nSamplesPerBlock.hashCode()
        result = 31 * result + this.abReserved.contentHashCode()
        return result
    }
}

public class Videohdr internal constructor(
    lpDataCtorArg: MutPtr,
    public var dwBufferLength: UInt,
    public var dwBytesUsed: UInt,
    public var dwTimeCaptured: UInt,
    public var dwUser: Int,
    public var dwFlags: UInt,
    public var dwReserved: IntArray,
) {
    public var lpData: MutPtr = lpDataCtorArg
        internal set

    public constructor() : this(
        lpDataCtorArg = MutPtr(0L),
        dwBufferLength = 0u,
        dwBytesUsed = 0u,
        dwTimeCaptured = 0u,
        dwUser = 0,
        dwFlags = 0u,
        dwReserved = IntArray(4),
    )

    public operator fun component1(): MutPtr = this.lpData

    public operator fun component2(): UInt = this.dwBufferLength

    public operator fun component3(): UInt = this.dwBytesUsed

    public operator fun component4(): UInt = this.dwTimeCaptured

    public operator fun component5(): Int = this.dwUser

    public operator fun component6(): UInt = this.dwFlags

    public operator fun component7(): IntArray = this.dwReserved

    public fun copy(lpData: MutPtr = this.lpData, dwBufferLength: UInt = this.dwBufferLength, dwBytesUsed: UInt = this.dwBytesUsed, dwTimeCaptured: UInt = this.dwTimeCaptured, dwUser: Int = this.dwUser, dwFlags: UInt = this.dwFlags, dwReserved: IntArray = this.dwReserved): Videohdr = Videohdr(lpDataCtorArg = lpData, dwBufferLength = dwBufferLength, dwBytesUsed = dwBytesUsed, dwTimeCaptured = dwTimeCaptured, dwUser = dwUser, dwFlags = dwFlags, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Videohdr) return false
        if (this.lpData != other.lpData) return false
        if (this.dwBufferLength != other.dwBufferLength) return false
        if (this.dwBytesUsed != other.dwBytesUsed) return false
        if (this.dwTimeCaptured != other.dwTimeCaptured) return false
        if (this.dwUser != other.dwUser) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpData.hashCode()
        result = 31 * result + this.dwBufferLength.hashCode()
        result = 31 * result + this.dwBytesUsed.hashCode()
        result = 31 * result + this.dwTimeCaptured.hashCode()
        result = 31 * result + this.dwUser.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Videohdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Videohdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Videohdr =
                    Videohdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (4).toInt())
                        ).readNative(addr + 40L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Videohdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.lpData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBytesUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwTimeCaptured)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dwUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (4).toInt())
                    ).writeNative(addr + 40L, value.dwReserved.toList())
                }
            }

        public operator fun invoke(
            lpData: MutPtr = MutPtr(0L),
            dwBufferLength: UInt = 0u,
            dwBytesUsed: UInt = 0u,
            dwTimeCaptured: UInt = 0u,
            dwUser: Int = 0,
            dwFlags: UInt = 0u,
            dwReserved: IntArray = IntArray(4),
        ): Videohdr =
            Videohdr(
                lpDataCtorArg = lpData,
                dwBufferLength = dwBufferLength,
                dwBytesUsed = dwBytesUsed,
                dwTimeCaptured = dwTimeCaptured,
                dwUser = dwUser,
                dwFlags = dwFlags,
                dwReserved = dwReserved,
            )
    }
}

public class Waveopendesc internal constructor(
    hWaveCtorArg: Hwave,
    lpFormatCtorArg: MutPtr,
    public var dwCallback: Int,
    public var dwInstance: Int,
    public var uMappedDeviceID: UInt,
    public var dnDevNode: Int,
) {
    public var hWave: Hwave = hWaveCtorArg
        internal set

    public var lpFormat: MutPtr = lpFormatCtorArg
        internal set

    public constructor() : this(
        hWaveCtorArg = MutPtr(0L),
        lpFormatCtorArg = MutPtr(0L),
        dwCallback = 0,
        dwInstance = 0,
        uMappedDeviceID = 0u,
        dnDevNode = 0,
    )

    public operator fun component1(): Hwave = this.hWave

    public operator fun component2(): MutPtr = this.lpFormat

    public operator fun component3(): Int = this.dwCallback

    public operator fun component4(): Int = this.dwInstance

    public operator fun component5(): UInt = this.uMappedDeviceID

    public operator fun component6(): Int = this.dnDevNode

    public fun copy(hWave: Hwave = this.hWave, lpFormat: MutPtr = this.lpFormat, dwCallback: Int = this.dwCallback, dwInstance: Int = this.dwInstance, uMappedDeviceID: UInt = this.uMappedDeviceID, dnDevNode: Int = this.dnDevNode): Waveopendesc = Waveopendesc(hWaveCtorArg = hWave, lpFormatCtorArg = lpFormat, dwCallback = dwCallback, dwInstance = dwInstance, uMappedDeviceID = uMappedDeviceID, dnDevNode = dnDevNode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Waveopendesc) return false
        if (this.hWave != other.hWave) return false
        if (this.lpFormat != other.lpFormat) return false
        if (this.dwCallback != other.dwCallback) return false
        if (this.dwInstance != other.dwInstance) return false
        if (this.uMappedDeviceID != other.uMappedDeviceID) return false
        if (this.dnDevNode != other.dnDevNode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWave.hashCode()
        result = 31 * result + this.lpFormat.hashCode()
        result = 31 * result + this.dwCallback.hashCode()
        result = 31 * result + this.dwInstance.hashCode()
        result = 31 * result + this.uMappedDeviceID.hashCode()
        result = 31 * result + this.dnDevNode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWave: Hwave = MutPtr(0L),
            lpFormat: MutPtr = MutPtr(0L),
            dwCallback: Int = 0,
            dwInstance: Int = 0,
            uMappedDeviceID: UInt = 0u,
            dnDevNode: Int = 0,
        ): Waveopendesc =
            Waveopendesc(
                hWaveCtorArg = hWave,
                lpFormatCtorArg = lpFormat,
                dwCallback = dwCallback,
                dwInstance = dwInstance,
                uMappedDeviceID = uMappedDeviceID,
                dnDevNode = dnDevNode,
            )
    }
}

public data class Wmaudio2waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var dwSamplesPerBlock: UInt = 0u,
    public var wEncodeOptions: UShort = 0u,
    public var dwSuperBlockAlign: UInt = 0u,
)

public data class Wmaudio3waveformat(
    public var wfx: Waveformatex = Waveformatex(),
    public var wValidBitsPerSample: UShort = 0u,
    public var dwChannelMask: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var wEncodeOptions: UShort = 0u,
    public var wReserved3: UShort = 0u,
)

public data class YamahaAdpcmwaveformat(
    public var wfx: Waveformatex = Waveformatex(),
)

public data class SRiffwaveInst(
    public var bUnshiftedNote: UByte = 0u,
    public var chFineTune: Byte = 0,
    public var chGain: Byte = 0,
    public var bLowNote: UByte = 0u,
    public var bHighNote: UByte = 0u,
    public var bLowVelocity: UByte = 0u,
    public var bHighVelocity: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRiffwaveInst> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRiffwaveInst> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 7L
                override fun readNative(addr: Long): SRiffwaveInst =
                    SRiffwaveInst(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SRiffwaveInst) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bUnshiftedNote)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 1L, value.chFineTune)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 2L, value.chGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bLowNote)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bHighNote)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bLowVelocity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bHighVelocity)
                }
            }
    }
}
