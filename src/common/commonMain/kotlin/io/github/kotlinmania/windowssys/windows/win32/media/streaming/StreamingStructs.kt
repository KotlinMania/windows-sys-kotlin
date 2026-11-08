package io.github.kotlinmania.windowssys.windows.win32.media.streaming

import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

public data class CapturedMetadataExposureCompensation(public var Flags: ULong = 0uL, public var Value: Int = 0)

public data class CapturedMetadataISOGains(public var AnalogGain: Float = 0.0f, public var DigitalGain: Float = 0.0f)

public data class CapturedMetadataWhiteBalanceGains(
    public var R: Float = 0.0f,
    public var G: Float = 0.0f,
    public var B: Float = 0.0f,
)

public data class FaceCharacterization(
    public var BlinkScoreLeft: UInt = 0u,
    public var BlinkScoreRight: UInt = 0u,
    public var FacialExpression: UInt = 0u,
    public var FacialExpressionScore: UInt = 0u,
)

public data class FaceCharacterizationBlobHeader(public var Size: UInt = 0u, public var Count: UInt = 0u)

public data class FaceRectInfo(public var Region: RECT = RECT(), public var confidenceLevel: Int = 0)

public data class FaceRectInfoBlobHeader(public var Size: UInt = 0u, public var Count: UInt = 0u)

public data class HistogramBlobHeader(public var Size: UInt = 0u, public var Histograms: UInt = 0u)

public data class HistogramDataHeader(
    public var Size: UInt = 0u,
    public var ChannelMask: UInt = 0u,
    public var Linear: UInt = 0u,
)

public data class HistogramGrid(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Region: RECT = RECT(),
)

public data class HistogramHeader(
    public var Size: UInt = 0u,
    public var Bins: UInt = 0u,
    public var FourCC: UInt = 0u,
    public var ChannelMasks: UInt = 0u,
    public var Grid: HistogramGrid = HistogramGrid(),
)

public data class MetadataTimeStamps(
    public var Flags: UInt = 0u,
    public var Device: Long = 0L,
    public var Presentation: Long = 0L,
)
