package io.github.kotlinmania.windowssys.windows.win32.media.streaming

import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class CapturedMetadataExposureCompensation(
    public var flags: ULong = 0uL,
    public var value: Int = 0,
)

public data class CapturedMetadataISOGains(
    public var analogGain: Float = 0.0f,
    public var digitalGain: Float = 0.0f,
)

public data class CapturedMetadataWhiteBalanceGains(
    public var r: Float = 0.0f,
    public var g: Float = 0.0f,
    public var b: Float = 0.0f,
)

public data class FaceCharacterization(
    public var blinkScoreLeft: UInt = 0u,
    public var blinkScoreRight: UInt = 0u,
    public var facialExpression: UInt = 0u,
    public var facialExpressionScore: UInt = 0u,
)

public data class FaceCharacterizationBlobHeader(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
)

public data class FaceRectInfo(
    public var region: Rect = Rect(),
    public var confidenceLevel: Int = 0,
)

public data class FaceRectInfoBlobHeader(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
)

public data class HistogramBlobHeader(
    public var size: UInt = 0u,
    public var histograms: UInt = 0u,
)

public data class HistogramDataHeader(
    public var size: UInt = 0u,
    public var channelMask: UInt = 0u,
    public var linear: UInt = 0u,
)

public data class HistogramGrid(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var region: Rect = Rect(),
)

public data class HistogramHeader(
    public var size: UInt = 0u,
    public var bins: UInt = 0u,
    public var fourCC: UInt = 0u,
    public var channelMasks: UInt = 0u,
    public var grid: HistogramGrid = HistogramGrid(),
)

public data class MetadataTimeStamps(
    public var flags: UInt = 0u,
    public var device: Long = 0L,
    public var presentation: Long = 0L,
)
