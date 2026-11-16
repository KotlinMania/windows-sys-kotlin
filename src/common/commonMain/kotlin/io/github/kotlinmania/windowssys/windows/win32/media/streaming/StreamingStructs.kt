package io.github.kotlinmania.windowssys.windows.win32.media.streaming

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class CapturedMetadataExposureCompensation(
    public var flags: ULong = 0uL,
    public var value: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapturedMetadataExposureCompensation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapturedMetadataExposureCompensation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CapturedMetadataExposureCompensation =
                    CapturedMetadataExposureCompensation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CapturedMetadataExposureCompensation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public data class CapturedMetadataISOGains(
    public var analogGain: Float = 0.0f,
    public var digitalGain: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapturedMetadataISOGains> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapturedMetadataISOGains> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CapturedMetadataISOGains =
                    CapturedMetadataISOGains(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CapturedMetadataISOGains) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.analogGain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.digitalGain)
                }
            }
    }
}

public data class CapturedMetadataWhiteBalanceGains(
    public var r: Float = 0.0f,
    public var g: Float = 0.0f,
    public var b: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapturedMetadataWhiteBalanceGains> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapturedMetadataWhiteBalanceGains> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CapturedMetadataWhiteBalanceGains =
                    CapturedMetadataWhiteBalanceGains(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CapturedMetadataWhiteBalanceGains) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.r)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.g)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.b)
                }
            }
    }
}

public data class FaceCharacterization(
    public var blinkScoreLeft: UInt = 0u,
    public var blinkScoreRight: UInt = 0u,
    public var facialExpression: UInt = 0u,
    public var facialExpressionScore: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaceCharacterization> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaceCharacterization> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FaceCharacterization =
                    FaceCharacterization(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FaceCharacterization) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.blinkScoreLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.blinkScoreRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.facialExpression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.facialExpressionScore)
                }
            }
    }
}

public data class FaceCharacterizationBlobHeader(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaceCharacterizationBlobHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaceCharacterizationBlobHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FaceCharacterizationBlobHeader =
                    FaceCharacterizationBlobHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FaceCharacterizationBlobHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                }
            }
    }
}

public data class FaceRectInfo(
    public var region: Rect = Rect(),
    public var confidenceLevel: Int = 0,
)

public data class FaceRectInfoBlobHeader(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaceRectInfoBlobHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FaceRectInfoBlobHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FaceRectInfoBlobHeader =
                    FaceRectInfoBlobHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FaceRectInfoBlobHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                }
            }
    }
}

public data class HistogramBlobHeader(
    public var size: UInt = 0u,
    public var histograms: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HistogramBlobHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HistogramBlobHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HistogramBlobHeader =
                    HistogramBlobHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HistogramBlobHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.histograms)
                }
            }
    }
}

public data class HistogramDataHeader(
    public var size: UInt = 0u,
    public var channelMask: UInt = 0u,
    public var linear: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HistogramDataHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HistogramDataHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): HistogramDataHeader =
                    HistogramDataHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HistogramDataHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.channelMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.linear)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataTimeStamps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MetadataTimeStamps> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MetadataTimeStamps =
                    MetadataTimeStamps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MetadataTimeStamps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.device)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.presentation)
                }
            }
    }
}
