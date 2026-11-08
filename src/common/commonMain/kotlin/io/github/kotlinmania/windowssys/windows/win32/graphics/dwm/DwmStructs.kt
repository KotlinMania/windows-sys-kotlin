package io.github.kotlinmania.windowssys.windows.win32.graphics.dwm

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HRGN

public data class DWM_BLURBEHIND(
    public var dwFlags: UInt = 0u,
    public var fEnable: BOOL = 0,
    public var hRgnBlur: HRGN = 0L,
    public var fTransitionOnMaximized: BOOL = 0,
)

public data class DWM_PRESENT_PARAMETERS(
    public var cbSize: UInt = 0u,
    public var fQueue: BOOL = 0,
    public var cRefreshStart: ULong = 0uL,
    public var cBuffer: UInt = 0u,
    public var fUseSourceRate: BOOL = 0,
    public var rateSource: UNSIGNED_RATIO = UNSIGNED_RATIO(),
    public var cRefreshesPerFrame: UInt = 0u,
    public var eSampling: DWM_SOURCE_FRAME_SAMPLING = 0,
)

public data class DWM_THUMBNAIL_PROPERTIES(
    public var dwFlags: UInt = 0u,
    public var rcDestination: RECT = RECT(),
    public var rcSource: RECT = RECT(),
    public var opacity: UByte = 0u,
    public var fVisible: BOOL = 0,
    public var fSourceClientAreaOnly: BOOL = 0,
)

public class DWM_TIMING_INFO(
    public var cbSize: UInt = 0u,
    public var rateRefresh: UNSIGNED_RATIO = UNSIGNED_RATIO(),
    public var qpcRefreshPeriod: ULong = 0uL,
    public var rateCompose: UNSIGNED_RATIO = UNSIGNED_RATIO(),
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
    public var S_11: Double = 0.0,
    public var S_12: Double = 0.0,
    public var S_21: Double = 0.0,
    public var S_22: Double = 0.0,
    public var DX: Double = 0.0,
    public var DY: Double = 0.0,
)

public data class UNSIGNED_RATIO(public var uiNumerator: UInt = 0u, public var uiDenominator: UInt = 0u)
