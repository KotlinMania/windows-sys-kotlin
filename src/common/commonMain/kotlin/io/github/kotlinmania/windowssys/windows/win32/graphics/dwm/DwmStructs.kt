package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn

public data class DwmBlurbehind(
    public var dwFlags: UInt = 0u,
    public var fEnable: Bool = 0,
    public var hRgnBlur: Hrgn = null,
    public var fTransitionOnMaximized: Bool = 0,
)

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
)

public data class MilMatrix3x2D(
    public var s11: Double = 0.0,
    public var s12: Double = 0.0,
    public var s21: Double = 0.0,
    public var s22: Double = 0.0,
    public var dx: Double = 0.0,
    public var dy: Double = 0.0,
)

public data class UnsignedRatio(public var uiNumerator: UInt = 0u, public var uiDenominator: UInt = 0u)
