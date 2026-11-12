package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

public class DwmBlurbehind internal constructor(
    public var dwFlags: UInt,
    public var fEnable: Bool,
    hRgnBlurCtorArg: Hrgn,
    public var fTransitionOnMaximized: Bool,
) {
    public var hRgnBlur: Hrgn = hRgnBlurCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        fEnable = 0,
        hRgnBlurCtorArg = MutPtr(0L),
        fTransitionOnMaximized = 0,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Bool = this.fEnable

    public operator fun component3(): Hrgn = this.hRgnBlur

    public operator fun component4(): Bool = this.fTransitionOnMaximized

    public fun copy(dwFlags: UInt = this.dwFlags, fEnable: Bool = this.fEnable, hRgnBlur: Hrgn = this.hRgnBlur, fTransitionOnMaximized: Bool = this.fTransitionOnMaximized): DwmBlurbehind = DwmBlurbehind(dwFlags = dwFlags, fEnable = fEnable, hRgnBlurCtorArg = hRgnBlur, fTransitionOnMaximized = fTransitionOnMaximized)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DwmBlurbehind) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.fEnable != other.fEnable) return false
        if (this.hRgnBlur != other.hRgnBlur) return false
        if (this.fTransitionOnMaximized != other.fTransitionOnMaximized) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.fEnable.hashCode()
        result = 31 * result + this.hRgnBlur.hashCode()
        result = 31 * result + this.fTransitionOnMaximized.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            fEnable: Bool = 0,
            hRgnBlur: Hrgn = MutPtr(0L),
            fTransitionOnMaximized: Bool = 0,
        ): DwmBlurbehind =
            DwmBlurbehind(
                dwFlags = dwFlags,
                fEnable = fEnable,
                hRgnBlurCtorArg = hRgnBlur,
                fTransitionOnMaximized = fTransitionOnMaximized,
            )
    }
}

public data class DwmPresentParameters(
    public var cbSize: UInt = 0u,
    public var fQueue: Bool = 0,
    public var cRefreshStart: ULong = 0uL,
    public var cBuffer: UInt = 0u,
    public var fUseSourceRate: Bool = 0,
    public var rateSource: UnsignedRatio = UnsignedRatio(),
    public var cRefreshesPerFrame: UInt = 0u,
    public var eSampling: DwmSourceFrameSampling = 0,
)

public data class DwmThumbnailProperties(
    public var dwFlags: UInt = 0u,
    public var rcDestination: Rect = Rect(),
    public var rcSource: Rect = Rect(),
    public var opacity: UByte = 0u,
    public var fVisible: Bool = 0,
    public var fSourceClientAreaOnly: Bool = 0,
)

public class DwmTimingInfo(
    public var cbSize: UInt = 0u,
    public var rateRefresh: UnsignedRatio = UnsignedRatio(),
    public var qpcRefreshPeriod: ULong = 0uL,
    public var rateCompose: UnsignedRatio = UnsignedRatio(),
    public var qpcVBlank: ULong = 0uL,
    public var cRefresh: ULong = 0uL,
    public var cDXRefresh: UInt = 0u,
    public var qpcCompose: ULong = 0uL,
    public var cFrame: ULong = 0uL,
    public var cDXPresent: UInt = 0u,
    public var cRefreshFrame: ULong = 0uL,
    public var cFrameSubmitted: ULong = 0uL,
    public var cDXPresentSubmitted: UInt = 0u,
    public var cFrameConfirmed: ULong = 0uL,
    public var cDXPresentConfirmed: UInt = 0u,
    public var cRefreshConfirmed: ULong = 0uL,
    public var cDXRefreshConfirmed: UInt = 0u,
    public var cFramesLate: ULong = 0uL,
    public var cFramesOutstanding: UInt = 0u,
    public var cFrameDisplayed: ULong = 0uL,
    public var qpcFrameDisplayed: ULong = 0uL,
    public var cRefreshFrameDisplayed: ULong = 0uL,
    public var cFrameComplete: ULong = 0uL,
    public var qpcFrameComplete: ULong = 0uL,
    public var cFramePending: ULong = 0uL,
    public var qpcFramePending: ULong = 0uL,
    public var cFramesDisplayed: ULong = 0uL,
    public var cFramesComplete: ULong = 0uL,
    public var cFramesPending: ULong = 0uL,
    public var cFramesAvailable: ULong = 0uL,
    public var cFramesDropped: ULong = 0uL,
    public var cFramesMissed: ULong = 0uL,
    public var cRefreshNextDisplayed: ULong = 0uL,
    public var cRefreshNextPresented: ULong = 0uL,
    public var cRefreshesDisplayed: ULong = 0uL,
    public var cRefreshesPresented: ULong = 0uL,
    public var cRefreshStarted: ULong = 0uL,
    public var cPixelsReceived: ULong = 0uL,
    public var cPixelsDrawn: ULong = 0uL,
    public var cBuffersEmpty: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwmTimingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DwmTimingInfo> {
                override val sizeBytes: Long = 292L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DwmTimingInfo =
                    DwmTimingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (UnsignedRatio.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 12L),
                        (UnsignedRatio.typeLayout()).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 228L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 236L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 244L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 252L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 260L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 276L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 284L),
                    )
                override fun writeNative(addr: Long, value: DwmTimingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (UnsignedRatio.typeLayout()).writeNative(addr + 4L, value.rateRefresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 12L, value.qpcRefreshPeriod)
                    (UnsignedRatio.typeLayout()).writeNative(addr + 20L, value.rateCompose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 28L, value.qpcVBlank)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 36L, value.cRefresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.cDXRefresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.qpcCompose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.cFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.cDXPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 68L, value.cRefreshFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 76L, value.cFrameSubmitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.cDXPresentSubmitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.cFrameConfirmed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.cDXPresentConfirmed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 100L, value.cRefreshConfirmed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.cDXRefreshConfirmed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.cFramesLate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.cFramesOutstanding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 124L, value.cFrameDisplayed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 132L, value.qpcFrameDisplayed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 140L, value.cRefreshFrameDisplayed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 148L, value.cFrameComplete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 156L, value.qpcFrameComplete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 164L, value.cFramePending)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 172L, value.qpcFramePending)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 180L, value.cFramesDisplayed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 188L, value.cFramesComplete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 196L, value.cFramesPending)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 204L, value.cFramesAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 212L, value.cFramesDropped)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 220L, value.cFramesMissed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 228L, value.cRefreshNextDisplayed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 236L, value.cRefreshNextPresented)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 244L, value.cRefreshesDisplayed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 252L, value.cRefreshesPresented)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 260L, value.cRefreshStarted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 268L, value.cPixelsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 276L, value.cPixelsDrawn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 284L, value.cBuffersEmpty)
                }
            }
    }
}

public data class MilMatrix3x2D(
    public var s11: Double = 0.0,
    public var s12: Double = 0.0,
    public var s21: Double = 0.0,
    public var s22: Double = 0.0,
    public var dx: Double = 0.0,
    public var dy: Double = 0.0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MilMatrix3x2D> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MilMatrix3x2D> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): MilMatrix3x2D =
                    MilMatrix3x2D(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MilMatrix3x2D) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.s11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 8L, value.s12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 16L, value.s21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 24L, value.s22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 32L, value.dx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 40L, value.dy)
                }
            }
    }
}

public data class UnsignedRatio(
    public var uiNumerator: UInt = 0u,
    public var uiDenominator: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnsignedRatio> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnsignedRatio> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): UnsignedRatio =
                    UnsignedRatio(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UnsignedRatio) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uiNumerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uiDenominator)
                }
            }
    }
}
