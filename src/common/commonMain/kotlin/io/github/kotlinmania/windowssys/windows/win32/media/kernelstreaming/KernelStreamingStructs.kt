@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.kernelstreaming

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.media.TimecodeSample

public class AllocatorPropertiesEx internal constructor(
    public var cBuffers: Int,
    public var cbBuffer: Int,
    public var cbAlign: Int,
    public var cbPrefix: Int,
    public var memoryType: Guid,
    public var busType: Guid,
    public var state: PipeState,
    public var input: PipeTermination,
    public var output: PipeTermination,
    public var strategy: UInt,
    public var flags: UInt,
    public var weight: UInt,
    public var logicalMemoryType: KsLogicalMemoryType,
    public var allocatorPlace: PipeAllocatorPlace,
    public var dimensions: PipeDimensions,
    public var physicalRange: KsFramingRange,
    prevSegmentCtorArg: MutPtr,
    public var countNextSegments: UInt,
    nextSegmentsCtorArg: MutPtr,
    public var insideFactors: UInt,
    public var numberPins: UInt,
) {
    public var prevSegment: MutPtr = prevSegmentCtorArg
        internal set

    public var nextSegments: MutPtr = nextSegmentsCtorArg
        internal set

    public constructor() : this(
        cBuffers = 0,
        cbBuffer = 0,
        cbAlign = 0,
        cbPrefix = 0,
        memoryType = Guid(),
        busType = Guid(),
        state = 0,
        input = PipeTermination(),
        output = PipeTermination(),
        strategy = 0u,
        flags = 0u,
        weight = 0u,
        logicalMemoryType = 0,
        allocatorPlace = 0,
        dimensions = PipeDimensions(),
        physicalRange = KsFramingRange(),
        prevSegmentCtorArg = MutPtr(0L),
        countNextSegments = 0u,
        nextSegmentsCtorArg = MutPtr(0L),
        insideFactors = 0u,
        numberPins = 0u,
    )

    public companion object {
        public operator fun invoke(
            cBuffers: Int = 0,
            cbBuffer: Int = 0,
            cbAlign: Int = 0,
            cbPrefix: Int = 0,
            memoryType: Guid = Guid(),
            busType: Guid = Guid(),
            state: PipeState = 0,
            input: PipeTermination = PipeTermination(),
            output: PipeTermination = PipeTermination(),
            strategy: UInt = 0u,
            flags: UInt = 0u,
            weight: UInt = 0u,
            logicalMemoryType: KsLogicalMemoryType = 0,
            allocatorPlace: PipeAllocatorPlace = 0,
            dimensions: PipeDimensions = PipeDimensions(),
            physicalRange: KsFramingRange = KsFramingRange(),
            prevSegment: MutPtr = MutPtr(0L),
            countNextSegments: UInt = 0u,
            nextSegments: MutPtr = MutPtr(0L),
            insideFactors: UInt = 0u,
            numberPins: UInt = 0u,
        ): AllocatorPropertiesEx =
            AllocatorPropertiesEx(
                cBuffers = cBuffers,
                cbBuffer = cbBuffer,
                cbAlign = cbAlign,
                cbPrefix = cbPrefix,
                memoryType = memoryType,
                busType = busType,
                state = state,
                input = input,
                output = output,
                strategy = strategy,
                flags = flags,
                weight = weight,
                logicalMemoryType = logicalMemoryType,
                allocatorPlace = allocatorPlace,
                dimensions = dimensions,
                physicalRange = physicalRange,
                prevSegmentCtorArg = prevSegment,
                countNextSegments = countNextSegments,
                nextSegmentsCtorArg = nextSegments,
                insideFactors = insideFactors,
                numberPins = numberPins,
            )
    }
}

public data class AudioresourcemanagementResourcegroup(
    public var resourceGroupAcquired: Bool = 0,
    public var resourceGroupName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AudioresourcemanagementResourcegroup) return false
        if (this.resourceGroupAcquired != other.resourceGroupAcquired) return false
        if (!this.resourceGroupName.contentEquals(other.resourceGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceGroupAcquired.hashCode()
        result = 31 * result + this.resourceGroupName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioresourcemanagementResourcegroup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioresourcemanagementResourcegroup> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): AudioresourcemanagementResourcegroup =
                    AudioresourcemanagementResourcegroup(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: AudioresourcemanagementResourcegroup) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.resourceGroupAcquired)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 4L, value.resourceGroupName.toList())
                }
            }
    }
}

public data class CcBytePair(
    public var decoded: UByteArray = UByteArray(2),
    public var reserved: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CcBytePair) return false
        if (!this.decoded.contentEquals(other.decoded)) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.decoded.contentHashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CcBytePair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CcBytePair> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CcBytePair =
                    CcBytePair(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: CcBytePair) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.decoded.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class CcHwField(
    public var scanlinesRequested: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
    public var fieldFlags: UInt = 0u,
    public var pictureNumber: Long = 0L,
    public var lines: List<CcBytePair> = List(12) { CcBytePair() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CcHwField> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CcHwField> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 192L
                override fun readNative(addr: Long): CcHwField =
                    CcHwField(
                        (VbicodecfilteringScanlines.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(CcBytePair.typeLayout(), (12).toInt())
                        ).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: CcHwField) {
                    (VbicodecfilteringScanlines.typeLayout()).writeNative(addr, value.scanlinesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.fieldFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.pictureNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(CcBytePair.typeLayout(), (12).toInt())
                    ).writeNative(addr + 144L, value.lines)
                }
            }
    }
}

public class Devcaps(
    public var canRecord: Int = 0,
    public var canRecordStrobe: Int = 0,
    public var hasAudio: Int = 0,
    public var hasVideo: Int = 0,
    public var usesFiles: Int = 0,
    public var canSave: Int = 0,
    public var deviceType: Int = 0,
    public var tCRead: Int = 0,
    public var tCWrite: Int = 0,
    public var cTLRead: Int = 0,
    public var indexRead: Int = 0,
    public var preroll: Int = 0,
    public var postroll: Int = 0,
    public var syncAcc: Int = 0,
    public var normRate: Int = 0,
    public var canPreview: Int = 0,
    public var canMonitorSrc: Int = 0,
    public var canTest: Int = 0,
    public var videoIn: Int = 0,
    public var audioIn: Int = 0,
    public var calibrate: Int = 0,
    public var seekType: Int = 0,
    public var simulatedHardware: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devcaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 92L
                override fun readNative(addr: Long): Devcaps =
                    Devcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: Devcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.canRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.canRecordStrobe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hasAudio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.hasVideo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.usesFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.canSave)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.deviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tCRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tCWrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.cTLRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.indexRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.preroll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.postroll)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.syncAcc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.normRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.canPreview)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.canMonitorSrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.canTest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.videoIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.audioIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.calibrate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.seekType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.simulatedHardware)
                }
            }
    }
}

public data class Ds3dvector(
    public var anonymous1: Ds3dvector0 = Ds3dvector0(),
    public var anonymous2: Ds3dvector1 = Ds3dvector1(),
    public var anonymous3: Ds3dvector2 = Ds3dvector2(),
)

public data class Ds3dvector0(
    public var x: Float = 0.0f,
    public var dvX: Float = 0.0f,
)

public data class Ds3dvector1(
    public var y: Float = 0.0f,
    public var dvY: Float = 0.0f,
)

public data class Ds3dvector2(
    public var z: Float = 0.0f,
    public var dvZ: Float = 0.0f,
)

public data class InterleavedAudioFormatInformation(
    public var size: UInt = 0u,
    public var primaryChannelCount: UInt = 0u,
    public var primaryChannelStartPosition: UInt = 0u,
    public var primaryChannelMask: UInt = 0u,
    public var interleavedChannelCount: UInt = 0u,
    public var interleavedChannelStartPosition: UInt = 0u,
    public var interleavedChannelMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterleavedAudioFormatInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterleavedAudioFormatInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): InterleavedAudioFormatInformation =
                    InterleavedAudioFormatInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: InterleavedAudioFormatInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.primaryChannelCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.primaryChannelStartPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.primaryChannelMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.interleavedChannelCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.interleavedChannelStartPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.interleavedChannelMask)
                }
            }
    }
}

public data class Ksac3AlternateAudio(
    public var fStereo: Bool = 0,
    public var dualMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3AlternateAudio> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3AlternateAudio> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ksac3AlternateAudio =
                    Ksac3AlternateAudio(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ksac3AlternateAudio) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fStereo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dualMode)
                }
            }
    }
}

public data class Ksac3BitStreamMode(
    public var bitStreamMode: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3BitStreamMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3BitStreamMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ksac3BitStreamMode =
                    Ksac3BitStreamMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ksac3BitStreamMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitStreamMode)
                }
            }
    }
}

public data class Ksac3DialogueLevel(
    public var dialogueLevel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3DialogueLevel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3DialogueLevel> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ksac3DialogueLevel =
                    Ksac3DialogueLevel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ksac3DialogueLevel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dialogueLevel)
                }
            }
    }
}

public data class Ksac3Downmix(
    public var fDownMix: Bool = 0,
    public var fDolbySurround: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3Downmix> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3Downmix> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ksac3Downmix =
                    Ksac3Downmix(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ksac3Downmix) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fDownMix)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fDolbySurround)
                }
            }
    }
}

public data class Ksac3ErrorConcealment(
    public var fRepeatPreviousBlock: Bool = 0,
    public var fErrorInCurrentBlock: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3ErrorConcealment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3ErrorConcealment> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ksac3ErrorConcealment =
                    Ksac3ErrorConcealment(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ksac3ErrorConcealment) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fRepeatPreviousBlock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fErrorInCurrentBlock)
                }
            }
    }
}

public data class Ksac3RoomType(
    public var fLargeRoom: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3RoomType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksac3RoomType> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ksac3RoomType =
                    Ksac3RoomType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ksac3RoomType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fLargeRoom)
                }
            }
    }
}

public data class KsallocatorFraming(
    public var anonymous1: KsallocatorFraming0 = KsallocatorFraming0(),
    public var poolType: UInt = 0u,
    public var frames: UInt = 0u,
    public var frameSize: UInt = 0u,
    public var anonymous2: KsallocatorFraming1 = KsallocatorFraming1(),
    public var reserved: UInt = 0u,
)

public data class KsallocatorFraming0(
    public var optionsFlags: UInt = 0u,
    public var requirementsFlags: UInt = 0u,
)

public data class KsallocatorFraming1(
    public var fileAlignment: UInt = 0u,
    public var framePitch: Int = 0,
)

public data class KsallocatorFramingEx(
    public var countItems: UInt = 0u,
    public var pinFlags: UInt = 0u,
    public var outputCompression: KsCompression = KsCompression(),
    public var pinWeight: UInt = 0u,
    public var framingItem: List<KsFramingItem> = List(1) { KsFramingItem() },
)

public data class Ksattribute(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var attribute: Guid = Guid(),
)

public data class KsattributeAudiosignalprocessingMode(
    public var attributeHeader: Ksattribute = Ksattribute(),
    public var signalProcessingMode: Guid = Guid(),
)

public data class KsaudioengineBufferSizeRange(
    public var minBufferBytes: UInt = 0u,
    public var maxBufferBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineBufferSizeRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineBufferSizeRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsaudioengineBufferSizeRange =
                    KsaudioengineBufferSizeRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsaudioengineBufferSizeRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minBufferBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxBufferBytes)
                }
            }
    }
}

public data class KsaudioengineDescriptor(
    public var nHostPinId: UInt = 0u,
    public var nOffloadPinId: UInt = 0u,
    public var nLoopbackPinId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsaudioengineDescriptor =
                    KsaudioengineDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsaudioengineDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nHostPinId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nOffloadPinId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nLoopbackPinId)
                }
            }
    }
}

public data class KsaudioengineDevicecontrols(
    public var volume: EDeviceControlUseType = 0,
    public var mute: EDeviceControlUseType = 0,
    public var peakMeter: EDeviceControlUseType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineDevicecontrols> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineDevicecontrols> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsaudioengineDevicecontrols =
                    KsaudioengineDevicecontrols(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsaudioengineDevicecontrols) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.volume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.mute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.peakMeter)
                }
            }
    }
}

public data class KsaudioengineVolumelevel(
    public var targetVolume: Int = 0,
    public var curveType: AudioCurveType = 0,
    public var curveDuration: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineVolumelevel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioengineVolumelevel> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsaudioengineVolumelevel =
                    KsaudioengineVolumelevel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsaudioengineVolumelevel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.targetVolume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.curveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.curveDuration)
                }
            }
    }
}

public data class KsaudiomoduleDescriptor(
    public var classId: Guid = Guid(),
    public var instanceId: UInt = 0u,
    public var versionMajor: UInt = 0u,
    public var versionMinor: UInt = 0u,
    public var name: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsaudiomoduleDescriptor) return false
        if (this.classId != other.classId) return false
        if (this.instanceId != other.instanceId) return false
        if (this.versionMajor != other.versionMajor) return false
        if (this.versionMinor != other.versionMinor) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classId.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        result = 31 * result + this.versionMajor.hashCode()
        result = 31 * result + this.versionMinor.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class KsaudiomoduleNotification(
    public var anonymous: KsaudiomoduleNotification0 = KsaudiomoduleNotification0(),
)

public data class KsaudiomoduleNotification0(
    public var providerId: KsaudiomoduleNotification00 = KsaudiomoduleNotification00(),
    public var alignment: Long = 0L,
)

public data class KsaudiomoduleNotification00(
    public var deviceId: Guid = Guid(),
    public var classId: Guid = Guid(),
    public var instanceId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsaudiomoduleProperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var classId: Guid = Guid(),
    public var instanceId: UInt = 0u,
)

public data class KsaudioChannelConfig(
    public var activeSpeakerPositions: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioChannelConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioChannelConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsaudioChannelConfig =
                    KsaudioChannelConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KsaudioChannelConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.activeSpeakerPositions)
                }
            }
    }
}

public data class KsaudioCopyProtection(
    public var fCopyrighted: Bool = 0,
    public var fOriginal: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioCopyProtection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioCopyProtection> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsaudioCopyProtection =
                    KsaudioCopyProtection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsaudioCopyProtection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fCopyrighted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fOriginal)
                }
            }
    }
}

public data class KsaudioDynamicRange(
    public var quietCompression: UInt = 0u,
    public var loudCompression: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioDynamicRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioDynamicRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsaudioDynamicRange =
                    KsaudioDynamicRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsaudioDynamicRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.quietCompression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.loudCompression)
                }
            }
    }
}

public data class KsaudioMicrophoneCoordinates(
    public var usType: UShort = 0u,
    public var wXCoord: Short = 0,
    public var wYCoord: Short = 0,
    public var wZCoord: Short = 0,
    public var wVerticalAngle: Short = 0,
    public var wHorizontalAngle: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioMicrophoneCoordinates> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioMicrophoneCoordinates> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsaudioMicrophoneCoordinates =
                    KsaudioMicrophoneCoordinates(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: KsaudioMicrophoneCoordinates) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.wXCoord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.wYCoord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.wZCoord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.wVerticalAngle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.wHorizontalAngle)
                }
            }
    }
}

public data class KsaudioMicArrayGeometry(
    public var usVersion: UShort = 0u,
    public var usMicArrayType: UShort = 0u,
    public var wVerticalAngleBegin: Short = 0,
    public var wVerticalAngleEnd: Short = 0,
    public var wHorizontalAngleBegin: Short = 0,
    public var wHorizontalAngleEnd: Short = 0,
    public var usFrequencyBandLo: UShort = 0u,
    public var usFrequencyBandHi: UShort = 0u,
    public var usNumberOfMicrophones: UShort = 0u,
    public var ksMicCoord: List<KsaudioMicrophoneCoordinates> = List(1) { KsaudioMicrophoneCoordinates() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioMicArrayGeometry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioMicArrayGeometry> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 30L
                override fun readNative(addr: Long): KsaudioMicArrayGeometry =
                    KsaudioMicArrayGeometry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(KsaudioMicrophoneCoordinates.typeLayout(), (1).toInt())
                        ).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: KsaudioMicArrayGeometry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usMicArrayType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.wVerticalAngleBegin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.wVerticalAngleEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.wHorizontalAngleBegin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.wHorizontalAngleEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.usFrequencyBandLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.usFrequencyBandHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.usNumberOfMicrophones)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(KsaudioMicrophoneCoordinates.typeLayout(), (1).toInt())
                    ).writeNative(addr + 18L, value.ksMicCoord)
                }
            }
    }
}

public data class KsaudioMixcapTable(
    public var inputChannels: UInt = 0u,
    public var outputChannels: UInt = 0u,
    public var capabilities: List<KsaudioMixCaps> = List(1) { KsaudioMixCaps() },
)

public data class KsaudioMixlevel(
    public var mute: Bool = 0,
    public var level: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioMixlevel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioMixlevel> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsaudioMixlevel =
                    KsaudioMixlevel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsaudioMixlevel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.level)
                }
            }
    }
}

public data class KsaudioMixCaps(
    public var mute: Bool = 0,
    public var minimum: Int = 0,
    public var maximum: Int = 0,
    public var anonymous: KsaudioMixCaps0 = KsaudioMixCaps0(),
)

public data class KsaudioMixCaps0(
    public var reset: Int = 0,
    public var resolution: Int = 0,
)

public data class KsaudioPacketsizeConstraints(
    public var minPacketPeriodInHns: UInt = 0u,
    public var packetSizeFileAlignment: UInt = 0u,
    public var reserved: UInt = 0u,
    public var numProcessingModeConstraints: UInt = 0u,
    public var processingModeConstraints: List<KsaudioPacketsizeProcessingmodeConstraint> = List(1) { KsaudioPacketsizeProcessingmodeConstraint() },
)

public data class KsaudioPacketsizeConstraints2(
    public var minPacketPeriodInHns: UInt = 0u,
    public var packetSizeFileAlignment: UInt = 0u,
    public var maxPacketSizeInBytes: UInt = 0u,
    public var numProcessingModeConstraints: UInt = 0u,
    public var processingModeConstraints: List<KsaudioPacketsizeProcessingmodeConstraint> = List(1) { KsaudioPacketsizeProcessingmodeConstraint() },
)

public data class KsaudioPacketsizeProcessingmodeConstraint(
    public var processingMode: Guid = Guid(),
    public var samplesPerProcessingPacket: UInt = 0u,
    public var processingPacketDurationInHns: UInt = 0u,
)

public data class KsaudioPosition(
    public var playOffset: ULong = 0uL,
    public var writeOffset: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioPosition> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsaudioPosition =
                    KsaudioPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsaudioPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.playOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.writeOffset)
                }
            }
    }
}

public data class KsaudioPositionex(
    public var timerFrequency: Long = 0L,
    public var timeStamp1: Long = 0L,
    public var position: KsaudioPosition = KsaudioPosition(),
    public var timeStamp2: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioPositionex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioPositionex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): KsaudioPositionex =
                    KsaudioPositionex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (KsaudioPosition.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: KsaudioPositionex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.timerFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.timeStamp1)
                    (KsaudioPosition.typeLayout()).writeNative(addr + 16L, value.position)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.timeStamp2)
                }
            }
    }
}

public data class KsaudioPresentationPosition(
    public var u64PositionInBlocks: ULong = 0uL,
    public var u64QPCPosition: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioPresentationPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsaudioPresentationPosition> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsaudioPresentationPosition =
                    KsaudioPresentationPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsaudioPresentationPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.u64PositionInBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.u64QPCPosition)
                }
            }
    }
}

public data class KscameraExtendedpropBackgroundsegmentationConfigcaps(
    public var resolution: Size = Size(),
    public var maxFrameRate: KscameraExtendedpropBackgroundsegmentationConfigcaps0 = KscameraExtendedpropBackgroundsegmentationConfigcaps0(),
    public var maskResolution: Size = Size(),
    public var subType: Guid = Guid(),
)

public data class KscameraExtendedpropBackgroundsegmentationConfigcaps0(
    public var numerator: Int = 0,
    public var denominator: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropBackgroundsegmentationConfigcaps0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropBackgroundsegmentationConfigcaps0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KscameraExtendedpropBackgroundsegmentationConfigcaps0 =
                    KscameraExtendedpropBackgroundsegmentationConfigcaps0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropBackgroundsegmentationConfigcaps0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.numerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.denominator)
                }
            }
    }
}

public data class KscameraExtendedpropCameraoffset(
    public var pitchAngle: Int = 0,
    public var yawAngle: Int = 0,
    public var flag: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropCameraoffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropCameraoffset> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropCameraoffset =
                    KscameraExtendedpropCameraoffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropCameraoffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pitchAngle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.yawAngle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropDigitalwindowConfigcaps(
    public var resolutionX: Int = 0,
    public var resolutionY: Int = 0,
    public var porchTop: Int = 0,
    public var porchLeft: Int = 0,
    public var porchBottom: Int = 0,
    public var porchRight: Int = 0,
    public var nonUpscalingWindowSize: Int = 0,
    public var minWindowSize: Int = 0,
    public var maxWindowSize: Int = 0,
    public var reserved: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropDigitalwindowConfigcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropDigitalwindowConfigcaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): KscameraExtendedpropDigitalwindowConfigcaps =
                    KscameraExtendedpropDigitalwindowConfigcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropDigitalwindowConfigcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.resolutionX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.resolutionY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.porchTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.porchLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.porchBottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.porchRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.nonUpscalingWindowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.minWindowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.maxWindowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropDigitalwindowConfigcapsheader(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropDigitalwindowConfigcapsheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropDigitalwindowConfigcapsheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KscameraExtendedpropDigitalwindowConfigcapsheader =
                    KscameraExtendedpropDigitalwindowConfigcapsheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropDigitalwindowConfigcapsheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                }
            }
    }
}

public data class KscameraExtendedpropDigitalwindowSetting(
    public var originX: Int = 0,
    public var originY: Int = 0,
    public var windowSize: Int = 0,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropDigitalwindowSetting> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropDigitalwindowSetting> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropDigitalwindowSetting =
                    KscameraExtendedpropDigitalwindowSetting(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropDigitalwindowSetting) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.originX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.originY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.windowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropEvcompensation(
    public var mode: UInt = 0u,
    public var min: Int = 0,
    public var max: Int = 0,
    public var value: Int = 0,
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropEvcompensation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropEvcompensation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KscameraExtendedpropEvcompensation =
                    KscameraExtendedpropEvcompensation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropEvcompensation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.min)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.max)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropFieldofview(
    public var normalizedFocalLengthX: UInt = 0u,
    public var normalizedFocalLengthY: UInt = 0u,
    public var flag: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropFieldofview> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropFieldofview> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropFieldofview =
                    KscameraExtendedpropFieldofview(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropFieldofview) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.normalizedFocalLengthX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.normalizedFocalLengthY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropHeader(
    public var version: UInt = 0u,
    public var pinId: UInt = 0u,
    public var size: UInt = 0u,
    public var result: UInt = 0u,
    public var flags: ULong = 0uL,
    public var capability: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropHeader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KscameraExtendedpropHeader =
                    KscameraExtendedpropHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pinId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.result)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.capability)
                }
            }
    }
}

public data class KscameraExtendedpropMetadatainfo(
    public var bufferAlignment: Int = 0,
    public var maxMetadataBufferSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropMetadatainfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropMetadatainfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KscameraExtendedpropMetadatainfo =
                    KscameraExtendedpropMetadatainfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropMetadatainfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bufferAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxMetadataBufferSize)
                }
            }
    }
}

public data class KscameraExtendedpropPhotomode(
    public var requestedHistoryFrames: UInt = 0u,
    public var maxHistoryFrames: UInt = 0u,
    public var subMode: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropPhotomode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropPhotomode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropPhotomode =
                    KscameraExtendedpropPhotomode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropPhotomode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestedHistoryFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxHistoryFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.subMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropProfile(
    public var profileId: Guid = Guid(),
    public var index: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraExtendedpropRoiConfigcaps(
    public var controlId: UInt = 0u,
    public var maxNumberOfROIs: UInt = 0u,
    public var capability: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiConfigcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiConfigcaps> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropRoiConfigcaps =
                    KscameraExtendedpropRoiConfigcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropRoiConfigcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxNumberOfROIs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.capability)
                }
            }
    }
}

public data class KscameraExtendedpropRoiConfigcapsheader(
    public var size: UInt = 0u,
    public var configCapCount: UInt = 0u,
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiConfigcapsheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiConfigcapsheader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropRoiConfigcapsheader =
                    KscameraExtendedpropRoiConfigcapsheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropRoiConfigcapsheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.configCapCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropRoiExposure(
    public var rOIInfo: KscameraExtendedpropRoiInfo = KscameraExtendedpropRoiInfo(),
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropRoiFocus(
    public var rOIInfo: KscameraExtendedpropRoiInfo = KscameraExtendedpropRoiInfo(),
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropRoiInfo(
    public var region: Rect = Rect(),
    public var flags: ULong = 0uL,
    public var weight: Int = 0,
    public var regionOfInterestType: Int = 0,
)

public data class KscameraExtendedpropRoiIspcontrol(
    public var controlId: UInt = 0u,
    public var rOICount: UInt = 0u,
    public var result: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiIspcontrol> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiIspcontrol> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropRoiIspcontrol =
                    KscameraExtendedpropRoiIspcontrol(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropRoiIspcontrol) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rOICount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.result)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropRoiIspcontrolheader(
    public var size: UInt = 0u,
    public var controlCount: UInt = 0u,
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiIspcontrolheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraExtendedpropRoiIspcontrolheader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraExtendedpropRoiIspcontrolheader =
                    KscameraExtendedpropRoiIspcontrolheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscameraExtendedpropRoiIspcontrolheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.controlCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reserved)
                }
            }
    }
}

public data class KscameraExtendedpropRoiWhitebalance(
    public var rOIInfo: KscameraExtendedpropRoiInfo = KscameraExtendedpropRoiInfo(),
    public var reserved: ULong = 0uL,
)

public data class KscameraExtendedpropValue(
    public var value: KscameraExtendedpropValue0 = KscameraExtendedpropValue0(),
)

public data class KscameraExtendedpropValue0(
    public var dbl: Double = 0.0,
    public var ull: ULong = 0uL,
    public var ul: UInt = 0u,
    public var ratio: ULong = 0uL,
    public var l: Int = 0,
    public var ll: Long = 0L,
)

public data class KscameraExtendedpropVideoprocsetting(
    public var mode: UInt = 0u,
    public var min: Int = 0,
    public var max: Int = 0,
    public var step: Int = 0,
    public var videoProc: KscameraExtendedpropValue = KscameraExtendedpropValue(),
    public var reserved: ULong = 0uL,
)

public data class KscameraMaxvideofpsForphotores(
    public var photoResWidth: UInt = 0u,
    public var photoResHeight: UInt = 0u,
    public var previewFPSNum: UInt = 0u,
    public var previewFPSDenom: UInt = 0u,
    public var captureFPSNum: UInt = 0u,
    public var captureFPSDenom: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMaxvideofpsForphotores> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMaxvideofpsForphotores> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KscameraMaxvideofpsForphotores =
                    KscameraMaxvideofpsForphotores(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: KscameraMaxvideofpsForphotores) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.photoResWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.photoResHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.previewFPSNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.previewFPSDenom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.captureFPSNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.captureFPSDenom)
                }
            }
    }
}

public data class KscameraMetadataBackgroundsegmentationmask(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var maskCoverageBoundingBox: Rect = Rect(),
    public var maskResolution: Size = Size(),
    public var foregroundBoundingBox: Rect = Rect(),
    public var maskData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KscameraMetadataBackgroundsegmentationmask) return false
        if (this.header != other.header) return false
        if (this.maskCoverageBoundingBox != other.maskCoverageBoundingBox) return false
        if (this.maskResolution != other.maskResolution) return false
        if (this.foregroundBoundingBox != other.foregroundBoundingBox) return false
        if (!this.maskData.contentEquals(other.maskData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.maskCoverageBoundingBox.hashCode()
        result = 31 * result + this.maskResolution.hashCode()
        result = 31 * result + this.foregroundBoundingBox.hashCode()
        result = 31 * result + this.maskData.contentHashCode()
        return result
    }
}

public data class KscameraMetadataCapturestats(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var exposureTime: ULong = 0uL,
    public var exposureCompensationFlags: ULong = 0uL,
    public var exposureCompensationValue: Int = 0,
    public var isoSpeed: UInt = 0u,
    public var focusState: UInt = 0u,
    public var lensPosition: UInt = 0u,
    public var whiteBalance: UInt = 0u,
    public var flash: UInt = 0u,
    public var flashPower: UInt = 0u,
    public var zoomFactor: UInt = 0u,
    public var sceneMode: ULong = 0uL,
    public var sensorFramerate: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataCapturestats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataCapturestats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): KscameraMetadataCapturestats =
                    KscameraMetadataCapturestats(
                        (KscameraMetadataItemheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: KscameraMetadataCapturestats) {
                    (KscameraMetadataItemheader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.exposureTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.exposureCompensationFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.exposureCompensationValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.isoSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.focusState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.lensPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.whiteBalance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.flash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.flashPower)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.zoomFactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.sceneMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.sensorFramerate)
                }
            }
    }
}

public data class KscameraMetadataDigitalwindow(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var window: KscameraExtendedpropDigitalwindowSetting = KscameraExtendedpropDigitalwindowSetting(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataDigitalwindow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataDigitalwindow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KscameraMetadataDigitalwindow =
                    KscameraMetadataDigitalwindow(
                        (KscameraMetadataItemheader.typeLayout()).readNative(addr),
                        (KscameraExtendedpropDigitalwindowSetting.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscameraMetadataDigitalwindow) {
                    (KscameraMetadataItemheader.typeLayout()).writeNative(addr, value.header)
                    (KscameraExtendedpropDigitalwindowSetting.typeLayout()).writeNative(addr + 8L, value.window)
                }
            }
    }
}

public data class KscameraMetadataFrameillumination(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataFrameillumination> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataFrameillumination> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraMetadataFrameillumination =
                    KscameraMetadataFrameillumination(
                        (KscameraMetadataItemheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraMetadataFrameillumination) {
                    (KscameraMetadataItemheader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraMetadataItemheader(
    public var metadataId: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataItemheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataItemheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KscameraMetadataItemheader =
                    KscameraMetadataItemheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KscameraMetadataItemheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.metadataId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class KscameraMetadataPhotoconfirmation(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var photoConfirmationIndex: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataPhotoconfirmation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraMetadataPhotoconfirmation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraMetadataPhotoconfirmation =
                    KscameraMetadataPhotoconfirmation(
                        (KscameraMetadataItemheader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraMetadataPhotoconfirmation) {
                    (KscameraMetadataItemheader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.photoConfirmationIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraPerframesettingCapHeader(
    public var size: UInt = 0u,
    public var itemCount: UInt = 0u,
    public var flags: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingCapHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingCapHeader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraPerframesettingCapHeader =
                    KscameraPerframesettingCapHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscameraPerframesettingCapHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.itemCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class KscameraPerframesettingCapItemHeader(
    public var size: UInt = 0u,
    public var type: UInt = 0u,
    public var flags: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingCapItemHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingCapItemHeader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraPerframesettingCapItemHeader =
                    KscameraPerframesettingCapItemHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscameraPerframesettingCapItemHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class KscameraPerframesettingCustomItem(
    public var size: UInt = 0u,
    public var reserved: UInt = 0u,
    public var id: Guid = Guid(),
)

public data class KscameraPerframesettingFrameHeader(
    public var size: UInt = 0u,
    public var id: UInt = 0u,
    public var itemCount: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingFrameHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingFrameHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraPerframesettingFrameHeader =
                    KscameraPerframesettingFrameHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KscameraPerframesettingFrameHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.itemCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KscameraPerframesettingHeader(
    public var size: UInt = 0u,
    public var frameCount: UInt = 0u,
    public var id: Guid = Guid(),
    public var flags: ULong = 0uL,
    public var loopCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KscameraPerframesettingItemHeader(
    public var size: UInt = 0u,
    public var type: UInt = 0u,
    public var flags: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingItemHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraPerframesettingItemHeader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscameraPerframesettingItemHeader =
                    KscameraPerframesettingItemHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscameraPerframesettingItemHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public class KscameraProfileConcurrencyinfo internal constructor(
    public var referenceGuid: Guid,
    public var reserved: UInt,
    public var profileCount: UInt,
    profilesCtorArg: MutPtr,
) {
    public var profiles: MutPtr = profilesCtorArg
        internal set

    public constructor() : this(
        referenceGuid = Guid(),
        reserved = 0u,
        profileCount = 0u,
        profilesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.referenceGuid

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): UInt = this.profileCount

    public operator fun component4(): MutPtr = this.profiles

    public fun copy(referenceGuid: Guid = this.referenceGuid, reserved: UInt = this.reserved, profileCount: UInt = this.profileCount, profiles: MutPtr = this.profiles): KscameraProfileConcurrencyinfo = KscameraProfileConcurrencyinfo(referenceGuid = referenceGuid, reserved = reserved, profileCount = profileCount, profilesCtorArg = profiles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KscameraProfileConcurrencyinfo) return false
        if (this.referenceGuid != other.referenceGuid) return false
        if (this.reserved != other.reserved) return false
        if (this.profileCount != other.profileCount) return false
        if (this.profiles != other.profiles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.referenceGuid.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.profileCount.hashCode()
        result = 31 * result + this.profiles.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            referenceGuid: Guid = Guid(),
            reserved: UInt = 0u,
            profileCount: UInt = 0u,
            profiles: MutPtr = MutPtr(0L),
        ): KscameraProfileConcurrencyinfo =
            KscameraProfileConcurrencyinfo(
                referenceGuid = referenceGuid,
                reserved = reserved,
                profileCount = profileCount,
                profilesCtorArg = profiles,
            )
    }
}

public class KscameraProfileInfo internal constructor(
    public var profileId: Guid,
    public var index: UInt,
    public var pinCount: UInt,
    pinsCtorArg: MutPtr,
) {
    public var pins: MutPtr = pinsCtorArg
        internal set

    public constructor() : this(
        profileId = Guid(),
        index = 0u,
        pinCount = 0u,
        pinsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.profileId

    public operator fun component2(): UInt = this.index

    public operator fun component3(): UInt = this.pinCount

    public operator fun component4(): MutPtr = this.pins

    public fun copy(profileId: Guid = this.profileId, index: UInt = this.index, pinCount: UInt = this.pinCount, pins: MutPtr = this.pins): KscameraProfileInfo = KscameraProfileInfo(profileId = profileId, index = index, pinCount = pinCount, pinsCtorArg = pins)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KscameraProfileInfo) return false
        if (this.profileId != other.profileId) return false
        if (this.index != other.index) return false
        if (this.pinCount != other.pinCount) return false
        if (this.pins != other.pins) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.profileId.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.pinCount.hashCode()
        result = 31 * result + this.pins.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            profileId: Guid = Guid(),
            index: UInt = 0u,
            pinCount: UInt = 0u,
            pins: MutPtr = MutPtr(0L),
        ): KscameraProfileInfo =
            KscameraProfileInfo(
                profileId = profileId,
                index = index,
                pinCount = pinCount,
                pinsCtorArg = pins,
            )
    }
}

public data class KscameraProfileMediainfo(
    public var resolution: KscameraProfileMediainfo0 = KscameraProfileMediainfo0(),
    public var maxFrameRate: KscameraProfileMediainfo1 = KscameraProfileMediainfo1(),
    public var flags: ULong = 0uL,
    public var data0: UInt = 0u,
    public var data1: UInt = 0u,
    public var data2: UInt = 0u,
    public var data3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfileMediainfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfileMediainfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): KscameraProfileMediainfo =
                    KscameraProfileMediainfo(
                        (KscameraProfileMediainfo0.typeLayout()).readNative(addr),
                        (KscameraProfileMediainfo1.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: KscameraProfileMediainfo) {
                    (KscameraProfileMediainfo0.typeLayout()).writeNative(addr, value.resolution)
                    (KscameraProfileMediainfo1.typeLayout()).writeNative(addr + 8L, value.maxFrameRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.data0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.data1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.data2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.data3)
                }
            }
    }
}

public data class KscameraProfileMediainfo1(
    public var numerator: UInt = 0u,
    public var denominator: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfileMediainfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfileMediainfo1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KscameraProfileMediainfo1 =
                    KscameraProfileMediainfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KscameraProfileMediainfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.denominator)
                }
            }
    }
}

public data class KscameraProfileMediainfo0(
    public var x: UInt = 0u,
    public var y: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfileMediainfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfileMediainfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KscameraProfileMediainfo0 =
                    KscameraProfileMediainfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KscameraProfileMediainfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public class KscameraProfilePininfo internal constructor(
    public var pinCategory: Guid,
    public var anonymous: KscameraProfilePininfo0,
    public var mediaInfoCount: UInt,
    mediaInfosCtorArg: MutPtr,
) {
    public var mediaInfos: MutPtr = mediaInfosCtorArg
        internal set

    public constructor() : this(
        pinCategory = Guid(),
        anonymous = KscameraProfilePininfo0(),
        mediaInfoCount = 0u,
        mediaInfosCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.pinCategory

    public operator fun component2(): KscameraProfilePininfo0 = this.anonymous

    public operator fun component3(): UInt = this.mediaInfoCount

    public operator fun component4(): MutPtr = this.mediaInfos

    public fun copy(pinCategory: Guid = this.pinCategory, anonymous: KscameraProfilePininfo0 = this.anonymous, mediaInfoCount: UInt = this.mediaInfoCount, mediaInfos: MutPtr = this.mediaInfos): KscameraProfilePininfo = KscameraProfilePininfo(pinCategory = pinCategory, anonymous = anonymous, mediaInfoCount = mediaInfoCount, mediaInfosCtorArg = mediaInfos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KscameraProfilePininfo) return false
        if (this.pinCategory != other.pinCategory) return false
        if (this.anonymous != other.anonymous) return false
        if (this.mediaInfoCount != other.mediaInfoCount) return false
        if (this.mediaInfos != other.mediaInfos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pinCategory.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.mediaInfoCount.hashCode()
        result = 31 * result + this.mediaInfos.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pinCategory: Guid = Guid(),
            anonymous: KscameraProfilePininfo0 = KscameraProfilePininfo0(),
            mediaInfoCount: UInt = 0u,
            mediaInfos: MutPtr = MutPtr(0L),
        ): KscameraProfilePininfo =
            KscameraProfilePininfo(
                pinCategory = pinCategory,
                anonymous = anonymous,
                mediaInfoCount = mediaInfoCount,
                mediaInfosCtorArg = mediaInfos,
            )
    }
}

public data class KscameraProfilePininfo0(
    public var anonymous: KscameraProfilePininfo00 = KscameraProfilePininfo00(),
    public var reserved: UInt = 0u,
)

public data class KscameraProfilePininfo00(
    public var pinIndex: UShort = 0u,
    public var profileSensorType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfilePininfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscameraProfilePininfo00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KscameraProfilePininfo00 =
                    KscameraProfilePininfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: KscameraProfilePininfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.pinIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.profileSensorType)
                }
            }
    }
}

public data class KsclockCreate(
    public var createFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsclockCreate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsclockCreate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsclockCreate =
                    KsclockCreate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KsclockCreate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.createFlags)
                }
            }
    }
}

public data class Kscomponentid(
    public var manufacturer: Guid = Guid(),
    public var product: Guid = Guid(),
    public var component: Guid = Guid(),
    public var name: Guid = Guid(),
    public var version: UInt = 0u,
    public var revision: UInt = 0u,
)

public data class KscorrelatedTime(
    public var time: Long = 0L,
    public var systemTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscorrelatedTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KscorrelatedTime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KscorrelatedTime =
                    KscorrelatedTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KscorrelatedTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.systemTime)
                }
            }
    }
}

public data class Ksdataformat(
    public var anonymous: Ksdataformat0 = Ksdataformat0(),
    public var alignment: Long = 0L,
)

public data class Ksdataformat0(
    public var formatSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var sampleSize: UInt = 0u,
    public var reserved: UInt = 0u,
    public var majorFormat: Guid = Guid(),
    public var subFormat: Guid = Guid(),
    public var specifier: Guid = Guid(),
)

public data class KsdatarangeAudio(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var maximumChannels: UInt = 0u,
    public var minimumBitsPerSample: UInt = 0u,
    public var maximumBitsPerSample: UInt = 0u,
    public var minimumSampleFrequency: UInt = 0u,
    public var maximumSampleFrequency: UInt = 0u,
)

public data class KsdatarangeMusic(
    public var dataRange: Ksdataformat = Ksdataformat(),
    public var technology: Guid = Guid(),
    public var channels: UInt = 0u,
    public var notes: UInt = 0u,
    public var channelMask: UInt = 0u,
)

public data class KsdeviceProfileInfo(
    public var type: UInt = 0u,
    public var size: UInt = 0u,
    public var anonymous: KsdeviceProfileInfo0 = KsdeviceProfileInfo0(),
)

public data class KsdeviceProfileInfo0(
    public var camera: KsdeviceProfileInfo00 = KsdeviceProfileInfo00(),
)

public class KsdeviceProfileInfo00 internal constructor(
    public var info: KscameraProfileInfo,
    public var reserved: UInt,
    public var concurrencyCount: UInt,
    concurrencyCtorArg: MutPtr,
) {
    public var concurrency: MutPtr = concurrencyCtorArg
        internal set

    public constructor() : this(
        info = KscameraProfileInfo(),
        reserved = 0u,
        concurrencyCount = 0u,
        concurrencyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KscameraProfileInfo = this.info

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): UInt = this.concurrencyCount

    public operator fun component4(): MutPtr = this.concurrency

    public fun copy(info: KscameraProfileInfo = this.info, reserved: UInt = this.reserved, concurrencyCount: UInt = this.concurrencyCount, concurrency: MutPtr = this.concurrency): KsdeviceProfileInfo00 = KsdeviceProfileInfo00(info = info, reserved = reserved, concurrencyCount = concurrencyCount, concurrencyCtorArg = concurrency)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsdeviceProfileInfo00) return false
        if (this.info != other.info) return false
        if (this.reserved != other.reserved) return false
        if (this.concurrencyCount != other.concurrencyCount) return false
        if (this.concurrency != other.concurrency) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.concurrencyCount.hashCode()
        result = 31 * result + this.concurrency.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            info: KscameraProfileInfo = KscameraProfileInfo(),
            reserved: UInt = 0u,
            concurrencyCount: UInt = 0u,
            concurrency: MutPtr = MutPtr(0L),
        ): KsdeviceProfileInfo00 =
            KsdeviceProfileInfo00(
                info = info,
                reserved = reserved,
                concurrencyCount = concurrencyCount,
                concurrencyCtorArg = concurrency,
            )
    }
}

public data class Ksdisplaychange(
    public var pelsWidth: UInt = 0u,
    public var pelsHeight: UInt = 0u,
    public var bitsPerPel: UInt = 0u,
    public var deviceID: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ksdisplaychange) return false
        if (this.pelsWidth != other.pelsWidth) return false
        if (this.pelsHeight != other.pelsHeight) return false
        if (this.bitsPerPel != other.bitsPerPel) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pelsWidth.hashCode()
        result = 31 * result + this.pelsHeight.hashCode()
        result = 31 * result + this.bitsPerPel.hashCode()
        result = 31 * result + this.deviceID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksdisplaychange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksdisplaychange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ksdisplaychange =
                    Ksdisplaychange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Ksdisplaychange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pelsWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pelsHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitsPerPel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.deviceID.toList())
                }
            }
    }
}

public data class Ksds3dBufferAll(
    public var position: Ds3dvector = Ds3dvector(),
    public var velocity: Ds3dvector = Ds3dvector(),
    public var insideConeAngle: UInt = 0u,
    public var outsideConeAngle: UInt = 0u,
    public var coneOrientation: Ds3dvector = Ds3dvector(),
    public var coneOutsideVolume: Int = 0,
    public var minDistance: Float = 0.0f,
    public var maxDistance: Float = 0.0f,
    public var mode: UInt = 0u,
)

public data class Ksds3dBufferConeAngles(
    public var insideConeAngle: UInt = 0u,
    public var outsideConeAngle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dBufferConeAngles> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dBufferConeAngles> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ksds3dBufferConeAngles =
                    Ksds3dBufferConeAngles(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ksds3dBufferConeAngles) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.insideConeAngle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.outsideConeAngle)
                }
            }
    }
}

public data class Ksds3dHrtfFilterFormatMsg(
    public var filterMethod: Ksds3dHrtfFilterMethod = 0,
    public var coeffFormat: Ksds3dHrtfCoeffFormat = 0,
    public var version: Ksds3dHrtfFilterVersion = 0,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dHrtfFilterFormatMsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dHrtfFilterFormatMsg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ksds3dHrtfFilterFormatMsg =
                    Ksds3dHrtfFilterFormatMsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ksds3dHrtfFilterFormatMsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.filterMethod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.coeffFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class Ksds3dHrtfInitMsg(
    public var size: UInt = 0u,
    public var quality: Ksds3dHrtfFilterQuality = 0,
    public var sampleRate: Float = 0.0f,
    public var maxFilterSize: UInt = 0u,
    public var filterTransientMuteLength: UInt = 0u,
    public var filterOverlapBufferLength: UInt = 0u,
    public var outputOverlapBufferLength: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dHrtfInitMsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dHrtfInitMsg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ksds3dHrtfInitMsg =
                    Ksds3dHrtfInitMsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Ksds3dHrtfInitMsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.quality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.sampleRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxFilterSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.filterTransientMuteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.filterOverlapBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.outputOverlapBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved)
                }
            }
    }
}

public data class Ksds3dHrtfParamsMsg(
    public var size: UInt = 0u,
    public var enabled: UInt = 0u,
    public var swapChannels: Bool = 0,
    public var zeroAzimuth: Bool = 0,
    public var crossFadeOutput: Bool = 0,
    public var filterSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dHrtfParamsMsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dHrtfParamsMsg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ksds3dHrtfParamsMsg =
                    Ksds3dHrtfParamsMsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Ksds3dHrtfParamsMsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.swapChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.zeroAzimuth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.crossFadeOutput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.filterSize)
                }
            }
    }
}

public data class Ksds3dItdParams(
    public var channel: Int = 0,
    public var volSmoothScale: Float = 0.0f,
    public var totalDryAttenuation: Float = 0.0f,
    public var totalWetAttenuation: Float = 0.0f,
    public var smoothFrequency: Int = 0,
    public var delay: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dItdParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dItdParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ksds3dItdParams =
                    Ksds3dItdParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Ksds3dItdParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.volSmoothScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.totalDryAttenuation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.totalWetAttenuation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.smoothFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.delay)
                }
            }
    }
}

public data class Ksds3dItdParamsMsg(
    public var enabled: UInt = 0u,
    public var leftParams: Ksds3dItdParams = Ksds3dItdParams(),
    public var rightParams: Ksds3dItdParams = Ksds3dItdParams(),
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dItdParamsMsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksds3dItdParamsMsg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Ksds3dItdParamsMsg =
                    Ksds3dItdParamsMsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Ksds3dItdParams.typeLayout()).readNative(addr + 4L),
                        (Ksds3dItdParams.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: Ksds3dItdParamsMsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.enabled)
                    (Ksds3dItdParams.typeLayout()).writeNative(addr + 4L, value.leftParams)
                    (Ksds3dItdParams.typeLayout()).writeNative(addr + 28L, value.rightParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.reserved)
                }
            }
    }
}

public data class Ksds3dListenerAll(
    public var position: Ds3dvector = Ds3dvector(),
    public var velocity: Ds3dvector = Ds3dvector(),
    public var orientFront: Ds3dvector = Ds3dvector(),
    public var orientTop: Ds3dvector = Ds3dvector(),
    public var distanceFactor: Float = 0.0f,
    public var rolloffFactor: Float = 0.0f,
    public var dopplerFactor: Float = 0.0f,
)

public data class Ksds3dListenerOrientation(
    public var front: Ds3dvector = Ds3dvector(),
    public var top: Ds3dvector = Ds3dvector(),
)

public class Kserror internal constructor(
    contextCtorArg: MutPtr,
    public var status: UInt,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        status = 0u,
    )

    public operator fun component1(): MutPtr = this.context

    public operator fun component2(): UInt = this.status

    public fun copy(context: MutPtr = this.context, status: UInt = this.status): Kserror = Kserror(contextCtorArg = context, status = status)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kserror) return false
        if (this.context != other.context) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kserror> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kserror> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Kserror =
                    Kserror(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Kserror) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.status)
                }
            }

        public operator fun invoke(
            context: MutPtr = MutPtr(0L),
            status: UInt = 0u,
        ): Kserror =
            Kserror(
                contextCtorArg = context,
                status = status,
            )
    }
}

public data class Kseventdata(
    public var notificationType: UInt = 0u,
    public var anonymous: Kseventdata0 = Kseventdata0(),
)

public data class Kseventdata0(
    public var eventHandle: Kseventdata00 = Kseventdata00(),
    public var semaphoreHandle: Kseventdata01 = Kseventdata01(),
    public var alignment: Kseventdata02 = Kseventdata02(),
)

public class Kseventdata02 internal constructor(
    unusedCtorArg: MutPtr,
    public var alignment: IntArray,
) {
    public var unused: MutPtr = unusedCtorArg
        internal set

    public constructor() : this(
        unusedCtorArg = MutPtr(0L),
        alignment = IntArray(2),
    )

    public operator fun component1(): MutPtr = this.unused

    public operator fun component2(): IntArray = this.alignment

    public fun copy(unused: MutPtr = this.unused, alignment: IntArray = this.alignment): Kseventdata02 = Kseventdata02(unusedCtorArg = unused, alignment = alignment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kseventdata02) return false
        if (this.unused != other.unused) return false
        if (!this.alignment.contentEquals(other.alignment)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unused.hashCode()
        result = 31 * result + this.alignment.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kseventdata02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kseventdata02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Kseventdata02 =
                    Kseventdata02(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (2).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Kseventdata02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.unused)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (2).toInt())
                    ).writeNative(addr + 8L, value.alignment.toList())
                }
            }

        public operator fun invoke(
            unused: MutPtr = MutPtr(0L),
            alignment: IntArray = IntArray(2),
        ): Kseventdata02 =
            Kseventdata02(
                unusedCtorArg = unused,
                alignment = alignment,
            )
    }
}

public class Kseventdata00 internal constructor(
    eventCtorArg: Handle,
    public var reserved: IntArray,
) {
    public var event: Handle = eventCtorArg
        internal set

    public constructor() : this(
        eventCtorArg = MutPtr(0L),
        reserved = IntArray(2),
    )

    public operator fun component1(): Handle = this.event

    public operator fun component2(): IntArray = this.reserved

    public fun copy(event: Handle = this.event, reserved: IntArray = this.reserved): Kseventdata00 = Kseventdata00(eventCtorArg = event, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kseventdata00) return false
        if (this.event != other.event) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            event: Handle = MutPtr(0L),
            reserved: IntArray = IntArray(2),
        ): Kseventdata00 =
            Kseventdata00(
                eventCtorArg = event,
                reserved = reserved,
            )
    }
}

public class Kseventdata01 internal constructor(
    semaphoreCtorArg: Handle,
    public var reserved: UInt,
    public var adjustment: Int,
) {
    public var semaphore: Handle = semaphoreCtorArg
        internal set

    public constructor() : this(
        semaphoreCtorArg = MutPtr(0L),
        reserved = 0u,
        adjustment = 0,
    )

    public operator fun component1(): Handle = this.semaphore

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): Int = this.adjustment

    public fun copy(semaphore: Handle = this.semaphore, reserved: UInt = this.reserved, adjustment: Int = this.adjustment): Kseventdata01 = Kseventdata01(semaphoreCtorArg = semaphore, reserved = reserved, adjustment = adjustment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kseventdata01) return false
        if (this.semaphore != other.semaphore) return false
        if (this.reserved != other.reserved) return false
        if (this.adjustment != other.adjustment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.semaphore.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.adjustment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            semaphore: Handle = MutPtr(0L),
            reserved: UInt = 0u,
            adjustment: Int = 0,
        ): Kseventdata01 =
            Kseventdata01(
                semaphoreCtorArg = semaphore,
                reserved = reserved,
                adjustment = adjustment,
            )
    }
}

public data class KseventTimeInterval(
    public var eventData: Kseventdata = Kseventdata(),
    public var timeBase: Long = 0L,
    public var interval: Long = 0L,
)

public data class KseventTimeMark(
    public var eventData: Kseventdata = Kseventdata(),
    public var markTime: Long = 0L,
)

public data class KseventTunerInitiateScanS(
    public var eventData: Kseventdata = Kseventdata(),
    public var startFrequency: UInt = 0u,
    public var endFrequency: UInt = 0u,
)

public data class KseNode(
    public var event: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KsePin(
    public var event: Ksidentifier = Ksidentifier(),
    public var pinId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ksframetime(
    public var duration: Long = 0L,
    public var frameFlags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksframetime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksframetime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ksframetime =
                    Ksframetime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ksframetime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.duration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.frameFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class KsgopUserdata(
    public var sc: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var cFields: UByte = 0u,
    public var l21Data: ByteArray = ByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsgopUserdata) return false
        if (this.sc != other.sc) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.cFields != other.cFields) return false
        if (!this.l21Data.contentEquals(other.l21Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sc.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.cFields.hashCode()
        result = 31 * result + this.l21Data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsgopUserdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsgopUserdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsgopUserdata =
                    KsgopUserdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (3).toInt())
                        ).readNative(addr + 9L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: KsgopUserdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.cFields)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (3).toInt())
                    ).writeNative(addr + 9L, value.l21Data.toList())
                }
            }
    }
}

public data class Ksidentifier(
    public var anonymous: Ksidentifier0 = Ksidentifier0(),
)

public data class Ksidentifier0(
    public var anonymous: Ksidentifier00 = Ksidentifier00(),
    public var alignment: Long = 0L,
)

public data class Ksidentifier00(
    public var set: Guid = Guid(),
    public var id: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class Ksinterval(
    public var timeBase: Long = 0L,
    public var interval: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksinterval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksinterval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ksinterval =
                    Ksinterval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ksinterval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.timeBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.interval)
                }
            }
    }
}

public data class KsjackDescription(
    public var channelMapping: UInt = 0u,
    public var color: UInt = 0u,
    public var connectionType: EPcxConnectionType = 0,
    public var geoLocation: EPcxGeoLocation = 0,
    public var genLocation: EPcxGenLocation = 0,
    public var portConnection: EPxcPortConnection = 0,
    public var isConnected: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsjackDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsjackDescription> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): KsjackDescription =
                    KsjackDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KsjackDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.channelMapping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.color)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.connectionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.geoLocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.genLocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.portConnection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.isConnected)
                }
            }
    }
}

public data class KsjackDescription2(
    public var deviceStateInfo: UInt = 0u,
    public var jackCapabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsjackDescription2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsjackDescription2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsjackDescription2 =
                    KsjackDescription2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsjackDescription2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceStateInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.jackCapabilities)
                }
            }
    }
}

public data class KsjackDescription3(
    public var configId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsjackDescription3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsjackDescription3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KsjackDescription3 =
                    KsjackDescription3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KsjackDescription3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.configId)
                }
            }
    }
}

public data class KsjackSinkInformation(
    public var connType: KsjackSinkConnectiontype = 0,
    public var manufacturerId: UShort = 0u,
    public var productId: UShort = 0u,
    public var audioLatency: UShort = 0u,
    public var hDCPCapable: Bool = 0,
    public var aICapable: Bool = 0,
    public var sinkDescriptionLength: UByte = 0u,
    public var sinkDescription: UShortArray = UShortArray(32),
    public var portId: Luid = Luid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsjackSinkInformation) return false
        if (this.connType != other.connType) return false
        if (this.manufacturerId != other.manufacturerId) return false
        if (this.productId != other.productId) return false
        if (this.audioLatency != other.audioLatency) return false
        if (this.hDCPCapable != other.hDCPCapable) return false
        if (this.aICapable != other.aICapable) return false
        if (this.sinkDescriptionLength != other.sinkDescriptionLength) return false
        if (!this.sinkDescription.contentEquals(other.sinkDescription)) return false
        if (this.portId != other.portId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connType.hashCode()
        result = 31 * result + this.manufacturerId.hashCode()
        result = 31 * result + this.productId.hashCode()
        result = 31 * result + this.audioLatency.hashCode()
        result = 31 * result + this.hDCPCapable.hashCode()
        result = 31 * result + this.aICapable.hashCode()
        result = 31 * result + this.sinkDescriptionLength.hashCode()
        result = 31 * result + this.sinkDescription.contentHashCode()
        result = 31 * result + this.portId.hashCode()
        return result
    }
}

public data class KsmpegvidRect(
    public var startX: UInt = 0u,
    public var startY: UInt = 0u,
    public var endX: UInt = 0u,
    public var endY: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsmpegvidRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsmpegvidRect> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KsmpegvidRect =
                    KsmpegvidRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KsmpegvidRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.startY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.endX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.endY)
                }
            }
    }
}

public data class KsmultipleDataProp(
    public var property: Ksidentifier = Ksidentifier(),
    public var multipleItem: KsmultipleItem = KsmultipleItem(),
)

public data class KsmultipleItem(
    public var size: UInt = 0u,
    public var count: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsmultipleItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsmultipleItem> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsmultipleItem =
                    KsmultipleItem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsmultipleItem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                }
            }
    }
}

public data class Ksmusicformat(
    public var timeDeltaMs: UInt = 0u,
    public var byteCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksmusicformat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksmusicformat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ksmusicformat =
                    Ksmusicformat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ksmusicformat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeDeltaMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.byteCount)
                }
            }
    }
}

public data class KsmNode(
    public var method: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Ksnodeproperty(
    public var property: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public class KsnodepropertyAudio3dListener internal constructor(
    public var nodeProperty: Ksnodeproperty,
    listenerIdCtorArg: MutPtr,
) {
    public var listenerId: MutPtr = listenerIdCtorArg
        internal set

    public constructor() : this(
        nodeProperty = Ksnodeproperty(),
        listenerIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ksnodeproperty = this.nodeProperty

    public operator fun component2(): MutPtr = this.listenerId

    public fun copy(nodeProperty: Ksnodeproperty = this.nodeProperty, listenerId: MutPtr = this.listenerId): KsnodepropertyAudio3dListener = KsnodepropertyAudio3dListener(nodeProperty = nodeProperty, listenerIdCtorArg = listenerId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsnodepropertyAudio3dListener) return false
        if (this.nodeProperty != other.nodeProperty) return false
        if (this.listenerId != other.listenerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeProperty.hashCode()
        result = 31 * result + this.listenerId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nodeProperty: Ksnodeproperty = Ksnodeproperty(),
            listenerId: MutPtr = MutPtr(0L),
        ): KsnodepropertyAudio3dListener =
            KsnodepropertyAudio3dListener(
                nodeProperty = nodeProperty,
                listenerIdCtorArg = listenerId,
            )
    }
}

public data class KsnodepropertyAudioChannel(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var channel: Int = 0,
    public var reserved: UInt = 0u,
)

public data class KsnodepropertyAudioDevSpecific(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var devSpecificId: UInt = 0u,
    public var deviceInfo: UInt = 0u,
    public var length: UInt = 0u,
)

public class KsnodepropertyAudioProperty internal constructor(
    public var nodeProperty: Ksnodeproperty,
    appContextCtorArg: MutPtr,
    public var length: UInt,
) {
    public var appContext: MutPtr = appContextCtorArg
        internal set

    public constructor() : this(
        nodeProperty = Ksnodeproperty(),
        appContextCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): Ksnodeproperty = this.nodeProperty

    public operator fun component2(): MutPtr = this.appContext

    public operator fun component3(): UInt = this.length

    public fun copy(nodeProperty: Ksnodeproperty = this.nodeProperty, appContext: MutPtr = this.appContext, length: UInt = this.length): KsnodepropertyAudioProperty = KsnodepropertyAudioProperty(nodeProperty = nodeProperty, appContextCtorArg = appContext, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsnodepropertyAudioProperty) return false
        if (this.nodeProperty != other.nodeProperty) return false
        if (this.appContext != other.appContext) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeProperty.hashCode()
        result = 31 * result + this.appContext.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nodeProperty: Ksnodeproperty = Ksnodeproperty(),
            appContext: MutPtr = MutPtr(0L),
            length: UInt = 0u,
        ): KsnodepropertyAudioProperty =
            KsnodepropertyAudioProperty(
                nodeProperty = nodeProperty,
                appContextCtorArg = appContext,
                length = length,
            )
    }
}

public data class KsnodeCreate(
    public var createFlags: UInt = 0u,
    public var node: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsnodeCreate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsnodeCreate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KsnodeCreate =
                    KsnodeCreate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KsnodeCreate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.createFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.node)
                }
            }
    }
}

public data class KspinCinstances(
    public var possibleCount: UInt = 0u,
    public var currentCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinCinstances> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinCinstances> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspinCinstances =
                    KspinCinstances(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspinCinstances) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.possibleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.currentCount)
                }
            }
    }
}

public class KspinConnect internal constructor(
    public var iface: Ksidentifier,
    public var medium: Ksidentifier,
    public var pinId: UInt,
    pinToHandleCtorArg: Handle,
    public var priority: Kspriority,
) {
    public var pinToHandle: Handle = pinToHandleCtorArg
        internal set

    public constructor() : this(
        iface = Ksidentifier(),
        medium = Ksidentifier(),
        pinId = 0u,
        pinToHandleCtorArg = MutPtr(0L),
        priority = Kspriority(),
    )

    public operator fun component1(): Ksidentifier = this.iface

    public operator fun component2(): Ksidentifier = this.medium

    public operator fun component3(): UInt = this.pinId

    public operator fun component4(): Handle = this.pinToHandle

    public operator fun component5(): Kspriority = this.priority

    public fun copy(iface: Ksidentifier = this.iface, medium: Ksidentifier = this.medium, pinId: UInt = this.pinId, pinToHandle: Handle = this.pinToHandle, priority: Kspriority = this.priority): KspinConnect = KspinConnect(iface = iface, medium = medium, pinId = pinId, pinToHandleCtorArg = pinToHandle, priority = priority)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspinConnect) return false
        if (this.iface != other.iface) return false
        if (this.medium != other.medium) return false
        if (this.pinId != other.pinId) return false
        if (this.pinToHandle != other.pinToHandle) return false
        if (this.priority != other.priority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iface.hashCode()
        result = 31 * result + this.medium.hashCode()
        result = 31 * result + this.pinId.hashCode()
        result = 31 * result + this.pinToHandle.hashCode()
        result = 31 * result + this.priority.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            iface: Ksidentifier = Ksidentifier(),
            medium: Ksidentifier = Ksidentifier(),
            pinId: UInt = 0u,
            pinToHandle: Handle = MutPtr(0L),
            priority: Kspriority = Kspriority(),
        ): KspinConnect =
            KspinConnect(
                iface = iface,
                medium = medium,
                pinId = pinId,
                pinToHandleCtorArg = pinToHandle,
                priority = priority,
            )
    }
}

public class KspinMdlCachingNotification internal constructor(
    public var event: KspinMdlCachingEvent,
    bufferCtorArg: MutPtr,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        event = 0,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KspinMdlCachingEvent = this.event

    public operator fun component2(): MutPtr = this.buffer

    public fun copy(event: KspinMdlCachingEvent = this.event, buffer: MutPtr = this.buffer): KspinMdlCachingNotification = KspinMdlCachingNotification(event = event, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspinMdlCachingNotification) return false
        if (this.event != other.event) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinMdlCachingNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinMdlCachingNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KspinMdlCachingNotification =
                    KspinMdlCachingNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KspinMdlCachingNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.event)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            event: KspinMdlCachingEvent = 0,
            buffer: MutPtr = MutPtr(0L),
        ): KspinMdlCachingNotification =
            KspinMdlCachingNotification(
                event = event,
                bufferCtorArg = buffer,
            )
    }
}

public data class KspinMdlCachingNotification32(
    public var event: KspinMdlCachingEvent = 0,
    public var buffer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinMdlCachingNotification32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinMdlCachingNotification32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspinMdlCachingNotification32 =
                    KspinMdlCachingNotification32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspinMdlCachingNotification32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.event)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.buffer)
                }
            }
    }
}

public data class KspinPhysicalconnection(
    public var size: UInt = 0u,
    public var pin: UInt = 0u,
    public var symbolicLinkName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspinPhysicalconnection) return false
        if (this.size != other.size) return false
        if (this.pin != other.pin) return false
        if (!this.symbolicLinkName.contentEquals(other.symbolicLinkName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.pin.hashCode()
        result = 31 * result + this.symbolicLinkName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinPhysicalconnection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinPhysicalconnection> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KspinPhysicalconnection =
                    KspinPhysicalconnection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KspinPhysicalconnection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pin)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.symbolicLinkName.toList())
                }
            }
    }
}

public data class Kspriority(
    public var priorityClass: UInt = 0u,
    public var prioritySubClass: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kspriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kspriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Kspriority =
                    Kspriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Kspriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.priorityClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.prioritySubClass)
                }
            }
    }
}

public data class KspropertyAllocatorControlCaptureCapsS(
    public var interleavedCapSupported: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyAllocatorControlCaptureCapsS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyAllocatorControlCaptureCapsS> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KspropertyAllocatorControlCaptureCapsS =
                    KspropertyAllocatorControlCaptureCapsS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KspropertyAllocatorControlCaptureCapsS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.interleavedCapSupported)
                }
            }
    }
}

public data class KspropertyAllocatorControlCaptureInterleaveS(
    public var interleavedCapPossible: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyAllocatorControlCaptureInterleaveS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyAllocatorControlCaptureInterleaveS> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KspropertyAllocatorControlCaptureInterleaveS =
                    KspropertyAllocatorControlCaptureInterleaveS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KspropertyAllocatorControlCaptureInterleaveS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.interleavedCapPossible)
                }
            }
    }
}

public data class KspropertyAllocatorControlSurfaceSizeS(
    public var cx: UInt = 0u,
    public var cy: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyAllocatorControlSurfaceSizeS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyAllocatorControlSurfaceSizeS> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspropertyAllocatorControlSurfaceSizeS =
                    KspropertyAllocatorControlSurfaceSizeS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspropertyAllocatorControlSurfaceSizeS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cy)
                }
            }
    }
}

public data class KspropertyBoundsLong(
    public var anonymous1: KspropertyBoundsLong0 = KspropertyBoundsLong0(),
    public var anonymous2: KspropertyBoundsLong1 = KspropertyBoundsLong1(),
)

public data class KspropertyBoundsLong0(
    public var signedMinimum: Int = 0,
    public var signedMaximum: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLong0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLong0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspropertyBoundsLong0 =
                    KspropertyBoundsLong0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspropertyBoundsLong0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.signedMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.signedMaximum)
                }
            }
    }
}

public data class KspropertyBoundsLong1(
    public var unsignedMinimum: UInt = 0u,
    public var unsignedMaximum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLong1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLong1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspropertyBoundsLong1 =
                    KspropertyBoundsLong1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspropertyBoundsLong1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.unsignedMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.unsignedMaximum)
                }
            }
    }
}

public data class KspropertyBoundsLonglong(
    public var anonymous1: KspropertyBoundsLonglong0 = KspropertyBoundsLonglong0(),
    public var anonymous2: KspropertyBoundsLonglong1 = KspropertyBoundsLonglong1(),
)

public data class KspropertyBoundsLonglong0(
    public var signedMinimum: Long = 0L,
    public var signedMaximum: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLonglong0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLonglong0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KspropertyBoundsLonglong0 =
                    KspropertyBoundsLonglong0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KspropertyBoundsLonglong0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.signedMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.signedMaximum)
                }
            }
    }
}

public data class KspropertyBoundsLonglong1(
    public var unsignedMinimum: ULong = 0uL,
    public var unsignedMaximum: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLonglong1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyBoundsLonglong1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KspropertyBoundsLonglong1 =
                    KspropertyBoundsLonglong1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KspropertyBoundsLonglong1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.unsignedMinimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.unsignedMaximum)
                }
            }
    }
}

public data class KspropertyCameracontrolFlashS(
    public var flash: UInt = 0u,
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyCameracontrolFlashS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyCameracontrolFlashS> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspropertyCameracontrolFlashS =
                    KspropertyCameracontrolFlashS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspropertyCameracontrolFlashS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.capabilities)
                }
            }
    }
}

public data class KspropertyCameracontrolFocalLengthS(
    public var property: Ksidentifier = Ksidentifier(),
    public var lOcularFocalLength: Int = 0,
    public var lObjectiveFocalLengthMin: Int = 0,
    public var lObjectiveFocalLengthMax: Int = 0,
)

public data class KspropertyCameracontrolImagePinCapabilityS(
    public var capabilities: UInt = 0u,
    public var reserved0: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyCameracontrolImagePinCapabilityS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyCameracontrolImagePinCapabilityS> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspropertyCameracontrolImagePinCapabilityS =
                    KspropertyCameracontrolImagePinCapabilityS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspropertyCameracontrolImagePinCapabilityS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved0)
                }
            }
    }
}

public data class KspropertyCameracontrolNodeFocalLengthS(
    public var nodeProperty: Ksnodeproperty = Ksnodeproperty(),
    public var lOcularFocalLength: Int = 0,
    public var lObjectiveFocalLengthMin: Int = 0,
    public var lObjectiveFocalLengthMax: Int = 0,
)

public data class KspropertyCameracontrolNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyCameracontrolNodeS2(
    public var nodeProperty: KspNode = KspNode(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspropertyCameracontrolRegionOfInterestS(
    public var focusRect: Rect = Rect(),
    public var autoFocusLock: Bool = 0,
    public var autoExposureLock: Bool = 0,
    public var autoWhitebalanceLock: Bool = 0,
    public var anonymous: KspropertyCameracontrolRegionOfInterestS0 = KspropertyCameracontrolRegionOfInterestS0(),
)

public data class KspropertyCameracontrolRegionOfInterestS0(
    public var capabilities: UInt = 0u,
    public var configuration: UInt = 0u,
)

public data class KspropertyCameracontrolS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyCameracontrolS2(
    public var property: Ksidentifier = Ksidentifier(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspropertyCameracontrolSEx(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var focusRect: Rect = Rect(),
)

public data class KspropertyCameracontrolVideostabilizationModeS(
    public var videoStabilizationMode: UInt = 0u,
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyCameracontrolVideostabilizationModeS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyCameracontrolVideostabilizationModeS> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspropertyCameracontrolVideostabilizationModeS =
                    KspropertyCameracontrolVideostabilizationModeS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspropertyCameracontrolVideostabilizationModeS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.videoStabilizationMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.capabilities)
                }
            }
    }
}

public data class KspropertyCrossbarActiveS(
    public var property: Ksidentifier = Ksidentifier(),
    public var indexInputPin: UInt = 0u,
    public var active: UInt = 0u,
)

public data class KspropertyCrossbarCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var numberOfInputs: UInt = 0u,
    public var numberOfOutputs: UInt = 0u,
)

public data class KspropertyCrossbarPininfoS(
    public var property: Ksidentifier = Ksidentifier(),
    public var direction: KspinDataflow = 0,
    public var index: UInt = 0u,
    public var pinType: UInt = 0u,
    public var relatedPinIndex: UInt = 0u,
    public var medium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyCrossbarRouteS(
    public var property: Ksidentifier = Ksidentifier(),
    public var indexInputPin: UInt = 0u,
    public var indexOutputPin: UInt = 0u,
    public var canRoute: UInt = 0u,
)

public data class KspropertyDescription(
    public var accessFlags: UInt = 0u,
    public var descriptionSize: UInt = 0u,
    public var propTypeSet: Ksidentifier = Ksidentifier(),
    public var membersListCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KspropertyDroppedframesCurrentS(
    public var property: Ksidentifier = Ksidentifier(),
    public var pictureNumber: Long = 0L,
    public var dropCount: Long = 0L,
    public var averageFrameSize: UInt = 0u,
)

public data class KspropertyExtdeviceS(
    public var property: Ksidentifier = Ksidentifier(),
    public var u: KspropertyExtdeviceS0 = KspropertyExtdeviceS0(),
)

public data class KspropertyExtdeviceS0(
    public var capabilities: Devcaps = Devcaps(),
    public var devPort: UInt = 0u,
    public var powerState: UInt = 0u,
    public var pawchString: UShortArray = UShortArray(260),
    public var nodeUniqueID: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyExtdeviceS0) return false
        if (this.capabilities != other.capabilities) return false
        if (this.devPort != other.devPort) return false
        if (this.powerState != other.powerState) return false
        if (!this.pawchString.contentEquals(other.pawchString)) return false
        if (!this.nodeUniqueID.contentEquals(other.nodeUniqueID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.devPort.hashCode()
        result = 31 * result + this.powerState.hashCode()
        result = 31 * result + this.pawchString.contentHashCode()
        result = 31 * result + this.nodeUniqueID.contentHashCode()
        return result
    }
}

public data class KspropertyExtxportNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var u: KspropertyExtxportNodeS0 = KspropertyExtxportNodeS0(),
)

public data class KspropertyExtxportNodeS0(
    public var capabilities: UInt = 0u,
    public var signalMode: UInt = 0u,
    public var loadMedium: UInt = 0u,
    public var mediumInfo: MediumInfo = MediumInfo(),
    public var xPrtState: TransportState = TransportState(),
    public var timecode: KspropertyExtxportNodeS00 = KspropertyExtxportNodeS00(),
    public var dwTimecode: UInt = 0u,
    public var dwAbsTrackNumber: UInt = 0u,
    public var rawAVC: KspropertyExtxportNodeS01 = KspropertyExtxportNodeS01(),
)

public data class KspropertyExtxportNodeS01(
    public var payloadSize: UInt = 0u,
    public var payload: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyExtxportNodeS01) return false
        if (this.payloadSize != other.payloadSize) return false
        if (!this.payload.contentEquals(other.payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.payloadSize.hashCode()
        result = 31 * result + this.payload.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportNodeS01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportNodeS01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): KspropertyExtxportNodeS01 =
                    KspropertyExtxportNodeS01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KspropertyExtxportNodeS01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.payloadSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 4L, value.payload.toList())
                }
            }
    }
}

public data class KspropertyExtxportNodeS00(
    public var frame: UByte = 0u,
    public var second: UByte = 0u,
    public var minute: UByte = 0u,
    public var hour: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportNodeS00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportNodeS00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KspropertyExtxportNodeS00 =
                    KspropertyExtxportNodeS00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: KspropertyExtxportNodeS00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.frame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.hour)
                }
            }
    }
}

public data class KspropertyExtxportS(
    public var property: Ksidentifier = Ksidentifier(),
    public var u: KspropertyExtxportS0 = KspropertyExtxportS0(),
)

public data class KspropertyExtxportS0(
    public var capabilities: UInt = 0u,
    public var signalMode: UInt = 0u,
    public var loadMedium: UInt = 0u,
    public var mediumInfo: MediumInfo = MediumInfo(),
    public var xPrtState: TransportState = TransportState(),
    public var timecode: KspropertyExtxportS00 = KspropertyExtxportS00(),
    public var dwTimecode: UInt = 0u,
    public var dwAbsTrackNumber: UInt = 0u,
    public var rawAVC: KspropertyExtxportS01 = KspropertyExtxportS01(),
)

public data class KspropertyExtxportS01(
    public var payloadSize: UInt = 0u,
    public var payload: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyExtxportS01) return false
        if (this.payloadSize != other.payloadSize) return false
        if (!this.payload.contentEquals(other.payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.payloadSize.hashCode()
        result = 31 * result + this.payload.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportS01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportS01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): KspropertyExtxportS01 =
                    KspropertyExtxportS01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KspropertyExtxportS01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.payloadSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 4L, value.payload.toList())
                }
            }
    }
}

public data class KspropertyExtxportS00(
    public var frame: UByte = 0u,
    public var second: UByte = 0u,
    public var minute: UByte = 0u,
    public var hour: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportS00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyExtxportS00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KspropertyExtxportS00 =
                    KspropertyExtxportS00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: KspropertyExtxportS00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.frame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.hour)
                }
            }
    }
}

public data class KspropertyMediaavailable(
    public var earliest: Long = 0L,
    public var latest: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyMediaavailable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyMediaavailable> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KspropertyMediaavailable =
                    KspropertyMediaavailable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KspropertyMediaavailable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.earliest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.latest)
                }
            }
    }
}

public data class KspropertyMembersheader(
    public var membersFlags: UInt = 0u,
    public var membersSize: UInt = 0u,
    public var membersCount: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyMembersheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyMembersheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KspropertyMembersheader =
                    KspropertyMembersheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KspropertyMembersheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.membersFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.membersSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.membersCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                }
            }
    }
}

public data class KspropertyNetworkcameracontrolEventInfo(
    public var header: KscameraMetadataItemheader = KscameraMetadataItemheader(),
    public var eventFilter: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyNetworkcameracontrolEventInfo) return false
        if (this.header != other.header) return false
        if (!this.eventFilter.contentEquals(other.eventFilter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.eventFilter.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyNetworkcameracontrolEventInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyNetworkcameracontrolEventInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KspropertyNetworkcameracontrolEventInfo =
                    KspropertyNetworkcameracontrolEventInfo(
                        (KscameraMetadataItemheader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KspropertyNetworkcameracontrolEventInfo) {
                    (KscameraMetadataItemheader.typeLayout()).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.eventFilter.toList())
                }
            }
    }
}

public data class KspropertyNetworkcameracontrolMetadataInfo(
    public var metadataItems: UInt = 0u,
    public var size: UInt = 0u,
    public var pTZStatus: Bool = 0,
    public var events: Bool = 0,
    public var analytics: Bool = 0,
    public var reserved: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyNetworkcameracontrolMetadataInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyNetworkcameracontrolMetadataInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KspropertyNetworkcameracontrolMetadataInfo =
                    KspropertyNetworkcameracontrolMetadataInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: KspropertyNetworkcameracontrolMetadataInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.metadataItems)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.pTZStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.events)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.analytics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class KspropertyNetworkcameracontrolNtpinfoHeader(
    public var size: UInt = 0u,
    public var type: KspropertyNetworkcameracontrolNtpinfoType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyNetworkcameracontrolNtpinfoHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyNetworkcameracontrolNtpinfoHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KspropertyNetworkcameracontrolNtpinfoHeader =
                    KspropertyNetworkcameracontrolNtpinfoHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KspropertyNetworkcameracontrolNtpinfoHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                }
            }
    }
}

public data class KspropertyPositions(
    public var current: Long = 0L,
    public var stop: Long = 0L,
    public var currentFlags: KsSeekingFlags = 0,
    public var stopFlags: KsSeekingFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyPositions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertyPositions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KspropertyPositions =
                    KspropertyPositions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: KspropertyPositions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.current)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.stop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.currentFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.stopFlags)
                }
            }
    }
}

public data class KspropertySelectorNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertySelectorS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertySerial(
    public var propTypeSet: Ksidentifier = Ksidentifier(),
    public var id: UInt = 0u,
    public var propertyLength: UInt = 0u,
)

public data class KspropertySerialhdr(
    public var propertySet: Guid = Guid(),
    public var count: UInt = 0u,
)

public data class KspropertySphli(
    public var hliss: UShort = 0u,
    public var reserved: UShort = 0u,
    public var startPTM: UInt = 0u,
    public var endPTM: UInt = 0u,
    public var startX: UShort = 0u,
    public var startY: UShort = 0u,
    public var stopX: UShort = 0u,
    public var stopY: UShort = 0u,
    public var colCon: KsColcon = KsColcon(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertySphli> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertySphli> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KspropertySphli =
                    KspropertySphli(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (KsColcon.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: KspropertySphli) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.hliss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.startPTM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.endPTM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.startX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.startY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.stopX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.stopY)
                    (KsColcon.typeLayout()).writeNative(addr + 20L, value.colCon)
                }
            }
    }
}

public data class KspropertySppal(
    public var sppal: List<KsDvdYuv> = List(16) { KsDvdYuv() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertySppal> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspropertySppal> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): KspropertySppal =
                    KspropertySppal(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(KsDvdYuv.typeLayout(), (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KspropertySppal) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(KsDvdYuv.typeLayout(), (16).toInt())
                    ).writeNative(addr, value.sppal)
                }
            }
    }
}

public data class KspropertySteppingLong(
    public var steppingDelta: UInt = 0u,
    public var reserved: UInt = 0u,
    public var bounds: KspropertyBoundsLong = KspropertyBoundsLong(),
)

public data class KspropertySteppingLonglong(
    public var steppingDelta: ULong = 0uL,
    public var bounds: KspropertyBoundsLonglong = KspropertyBoundsLonglong(),
)

public data class KspropertyTimecodeNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var timecodeSamp: TimecodeSample = TimecodeSample(),
)

public data class KspropertyTimecodeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var timecodeSamp: TimecodeSample = TimecodeSample(),
)

public data class KspropertyTunerCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var modesSupported: UInt = 0u,
    public var videoMedium: Ksidentifier = Ksidentifier(),
    public var tVAudioMedium: Ksidentifier = Ksidentifier(),
    public var radioAudioMedium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyTunerFrequencyS(
    public var property: Ksidentifier = Ksidentifier(),
    public var frequency: UInt = 0u,
    public var lastFrequency: UInt = 0u,
    public var tuningFlags: UInt = 0u,
    public var videoSubChannel: UInt = 0u,
    public var audioSubChannel: UInt = 0u,
    public var channel: UInt = 0u,
    public var country: UInt = 0u,
)

public data class KspropertyTunerIfMediumS(
    public var property: Ksidentifier = Ksidentifier(),
    public var iFMedium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyTunerInputS(
    public var property: Ksidentifier = Ksidentifier(),
    public var inputIndex: UInt = 0u,
)

public data class KspropertyTunerModeCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var mode: UInt = 0u,
    public var standardsSupported: UInt = 0u,
    public var minFrequency: UInt = 0u,
    public var maxFrequency: UInt = 0u,
    public var tuningGranularity: UInt = 0u,
    public var numberOfInputs: UInt = 0u,
    public var settlingTime: UInt = 0u,
    public var strategy: UInt = 0u,
)

public data class KspropertyTunerModeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var mode: UInt = 0u,
)

public class KspropertyTunerNetworktypeScanCapsS internal constructor(
    public var property: Ksidentifier,
    public var networkType: Guid,
    public var bufferSize: UInt,
    networkTunerCapabilitiesCtorArg: MutPtr,
) {
    public var networkTunerCapabilities: MutPtr = networkTunerCapabilitiesCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        networkType = Guid(),
        bufferSize = 0u,
        networkTunerCapabilitiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): Guid = this.networkType

    public operator fun component3(): UInt = this.bufferSize

    public operator fun component4(): MutPtr = this.networkTunerCapabilities

    public fun copy(property: Ksidentifier = this.property, networkType: Guid = this.networkType, bufferSize: UInt = this.bufferSize, networkTunerCapabilities: MutPtr = this.networkTunerCapabilities): KspropertyTunerNetworktypeScanCapsS = KspropertyTunerNetworktypeScanCapsS(property = property, networkType = networkType, bufferSize = bufferSize, networkTunerCapabilitiesCtorArg = networkTunerCapabilities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyTunerNetworktypeScanCapsS) return false
        if (this.property != other.property) return false
        if (this.networkType != other.networkType) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.networkTunerCapabilities != other.networkTunerCapabilities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.networkType.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.networkTunerCapabilities.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            networkType: Guid = Guid(),
            bufferSize: UInt = 0u,
            networkTunerCapabilities: MutPtr = MutPtr(0L),
        ): KspropertyTunerNetworktypeScanCapsS =
            KspropertyTunerNetworktypeScanCapsS(
                property = property,
                networkType = networkType,
                bufferSize = bufferSize,
                networkTunerCapabilitiesCtorArg = networkTunerCapabilities,
            )
    }
}

public class KspropertyTunerScanCapsS internal constructor(
    public var property: Ksidentifier,
    public var fSupportsHardwareAssistedScanning: Bool,
    public var supportedBroadcastStandards: UInt,
    gUIDBucketCtorArg: MutPtr,
    public var lengthofBucket: UInt,
) {
    public var gUIDBucket: MutPtr = gUIDBucketCtorArg
        internal set

    public constructor() : this(
        property = Ksidentifier(),
        fSupportsHardwareAssistedScanning = 0,
        supportedBroadcastStandards = 0u,
        gUIDBucketCtorArg = MutPtr(0L),
        lengthofBucket = 0u,
    )

    public operator fun component1(): Ksidentifier = this.property

    public operator fun component2(): Bool = this.fSupportsHardwareAssistedScanning

    public operator fun component3(): UInt = this.supportedBroadcastStandards

    public operator fun component4(): MutPtr = this.gUIDBucket

    public operator fun component5(): UInt = this.lengthofBucket

    public fun copy(property: Ksidentifier = this.property, fSupportsHardwareAssistedScanning: Bool = this.fSupportsHardwareAssistedScanning, supportedBroadcastStandards: UInt = this.supportedBroadcastStandards, gUIDBucket: MutPtr = this.gUIDBucket, lengthofBucket: UInt = this.lengthofBucket): KspropertyTunerScanCapsS = KspropertyTunerScanCapsS(property = property, fSupportsHardwareAssistedScanning = fSupportsHardwareAssistedScanning, supportedBroadcastStandards = supportedBroadcastStandards, gUIDBucketCtorArg = gUIDBucket, lengthofBucket = lengthofBucket)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspropertyTunerScanCapsS) return false
        if (this.property != other.property) return false
        if (this.fSupportsHardwareAssistedScanning != other.fSupportsHardwareAssistedScanning) return false
        if (this.supportedBroadcastStandards != other.supportedBroadcastStandards) return false
        if (this.gUIDBucket != other.gUIDBucket) return false
        if (this.lengthofBucket != other.lengthofBucket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.property.hashCode()
        result = 31 * result + this.fSupportsHardwareAssistedScanning.hashCode()
        result = 31 * result + this.supportedBroadcastStandards.hashCode()
        result = 31 * result + this.gUIDBucket.hashCode()
        result = 31 * result + this.lengthofBucket.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            property: Ksidentifier = Ksidentifier(),
            fSupportsHardwareAssistedScanning: Bool = 0,
            supportedBroadcastStandards: UInt = 0u,
            gUIDBucket: MutPtr = MutPtr(0L),
            lengthofBucket: UInt = 0u,
        ): KspropertyTunerScanCapsS =
            KspropertyTunerScanCapsS(
                property = property,
                fSupportsHardwareAssistedScanning = fSupportsHardwareAssistedScanning,
                supportedBroadcastStandards = supportedBroadcastStandards,
                gUIDBucketCtorArg = gUIDBucket,
                lengthofBucket = lengthofBucket,
            )
    }
}

public data class KspropertyTunerScanStatusS(
    public var property: Ksidentifier = Ksidentifier(),
    public var lockStatus: TunerLockType = 0,
    public var currentFrequency: UInt = 0u,
)

public data class KspropertyTunerStandardModeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var autoDetect: Bool = 0,
)

public data class KspropertyTunerStandardS(
    public var property: Ksidentifier = Ksidentifier(),
    public var standard: UInt = 0u,
)

public data class KspropertyTunerStatusS(
    public var property: Ksidentifier = Ksidentifier(),
    public var currentFrequency: UInt = 0u,
    public var pLLOffset: UInt = 0u,
    public var signalStrength: UInt = 0u,
    public var busy: UInt = 0u,
)

public data class KspropertyTvaudioCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var capabilities: UInt = 0u,
    public var inputMedium: Ksidentifier = Ksidentifier(),
    public var outputMedium: Ksidentifier = Ksidentifier(),
)

public data class KspropertyTvaudioS(
    public var property: Ksidentifier = Ksidentifier(),
    public var mode: UInt = 0u,
)

public data class KspropertyVbicodecfilteringCcSubstreamsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var substreams: VbicodecfilteringCcSubstreams = VbicodecfilteringCcSubstreams(),
)

public data class KspropertyVbicodecfilteringNabtsSubstreamsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var substreams: VbicodecfilteringNabtsSubstreams = VbicodecfilteringNabtsSubstreams(),
)

public data class KspropertyVbicodecfilteringScanlinesS(
    public var property: Ksidentifier = Ksidentifier(),
    public var scanlines: VbicodecfilteringScanlines = VbicodecfilteringScanlines(),
)

public data class KspropertyVbicodecfilteringStatisticsCcPinS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCcPin = VbicodecfilteringStatisticsCcPin(),
)

public data class KspropertyVbicodecfilteringStatisticsCcS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCc = VbicodecfilteringStatisticsCc(),
)

public data class KspropertyVbicodecfilteringStatisticsCommonPinS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCommonPin = VbicodecfilteringStatisticsCommonPin(),
)

public data class KspropertyVbicodecfilteringStatisticsCommonS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsCommon = VbicodecfilteringStatisticsCommon(),
)

public data class KspropertyVbicodecfilteringStatisticsNabtsPinS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsNabtsPin = VbicodecfilteringStatisticsNabtsPin(),
)

public data class KspropertyVbicodecfilteringStatisticsNabtsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var statistics: VbicodecfilteringStatisticsNabts = VbicodecfilteringStatisticsNabts(),
)

public data class KspropertyVideocompressionGetinfoS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var defaultKeyFrameRate: Int = 0,
    public var defaultPFrameRate: Int = 0,
    public var defaultQuality: Int = 0,
    public var numberOfQualitySettings: Int = 0,
    public var capabilities: Int = 0,
)

public data class KspropertyVideocompressionS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var value: Int = 0,
)

public data class KspropertyVideocompressionS1(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var value: Int = 0,
    public var flags: UInt = 0u,
)

public data class KspropertyVideocontrolActualFrameRateS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var rangeIndex: UInt = 0u,
    public var dimensions: Size = Size(),
    public var currentActualFrameRate: Long = 0L,
    public var currentMaxAvailableFrameRate: Long = 0L,
)

public data class KspropertyVideocontrolCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var videoControlCaps: UInt = 0u,
)

public data class KspropertyVideocontrolFrameRatesS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var rangeIndex: UInt = 0u,
    public var dimensions: Size = Size(),
)

public data class KspropertyVideocontrolModeS(
    public var property: Ksidentifier = Ksidentifier(),
    public var streamIndex: UInt = 0u,
    public var mode: Int = 0,
)

public data class KspropertyVideodecoderCapsS(
    public var property: Ksidentifier = Ksidentifier(),
    public var standardsSupported: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var settlingTime: UInt = 0u,
    public var hSyncPerVSync: UInt = 0u,
)

public data class KspropertyVideodecoderS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: UInt = 0u,
)

public data class KspropertyVideodecoderStatus2S(
    public var property: Ksidentifier = Ksidentifier(),
    public var numberOfLines: UInt = 0u,
    public var signalLocked: UInt = 0u,
    public var chromaLock: UInt = 0u,
)

public data class KspropertyVideodecoderStatusS(
    public var property: Ksidentifier = Ksidentifier(),
    public var numberOfLines: UInt = 0u,
    public var signalLocked: UInt = 0u,
)

public data class KspropertyVideoencoderS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyVideoprocampNodeS(
    public var nodeProperty: KspNode = KspNode(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyVideoprocampNodeS2(
    public var nodeProperty: KspNode = KspNode(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspropertyVideoprocampS(
    public var property: Ksidentifier = Ksidentifier(),
    public var value: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
)

public data class KspropertyVideoprocampS2(
    public var property: Ksidentifier = Ksidentifier(),
    public var value1: Int = 0,
    public var flags: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var value2: Int = 0,
)

public data class KspNode(
    public var property: Ksidentifier = Ksidentifier(),
    public var nodeId: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KspPin(
    public var property: Ksidentifier = Ksidentifier(),
    public var pinId: UInt = 0u,
    public var anonymous: KspPin0 = KspPin0(),
)

public data class KspPin0(
    public var reserved: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class KspTimeformat(
    public var property: Ksidentifier = Ksidentifier(),
    public var sourceFormat: Guid = Guid(),
    public var targetFormat: Guid = Guid(),
    public var time: Long = 0L,
)

public class Ksquality internal constructor(
    contextCtorArg: MutPtr,
    public var proportion: UInt,
    public var deltaTime: Long,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        proportion = 0u,
        deltaTime = 0L,
    )

    public operator fun component1(): MutPtr = this.context

    public operator fun component2(): UInt = this.proportion

    public operator fun component3(): Long = this.deltaTime

    public fun copy(context: MutPtr = this.context, proportion: UInt = this.proportion, deltaTime: Long = this.deltaTime): Ksquality = Ksquality(contextCtorArg = context, proportion = proportion, deltaTime = deltaTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ksquality) return false
        if (this.context != other.context) return false
        if (this.proportion != other.proportion) return false
        if (this.deltaTime != other.deltaTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.proportion.hashCode()
        result = 31 * result + this.deltaTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksquality> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ksquality> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ksquality =
                    Ksquality(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ksquality) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.proportion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.deltaTime)
                }
            }

        public operator fun invoke(
            context: MutPtr = MutPtr(0L),
            proportion: UInt = 0u,
            deltaTime: Long = 0L,
        ): Ksquality =
            Ksquality(
                contextCtorArg = context,
                proportion = proportion,
                deltaTime = deltaTime,
            )
    }
}

public class KsqualityManager internal constructor(
    qualityManagerCtorArg: Handle,
    contextCtorArg: MutPtr,
) {
    public var qualityManager: Handle = qualityManagerCtorArg
        internal set

    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        qualityManagerCtorArg = MutPtr(0L),
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.qualityManager

    public operator fun component2(): MutPtr = this.context

    public fun copy(qualityManager: Handle = this.qualityManager, context: MutPtr = this.context): KsqualityManager = KsqualityManager(qualityManagerCtorArg = qualityManager, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsqualityManager) return false
        if (this.qualityManager != other.qualityManager) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.qualityManager.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            qualityManager: Handle = MutPtr(0L),
            context: MutPtr = MutPtr(0L),
        ): KsqualityManager =
            KsqualityManager(
                qualityManagerCtorArg = qualityManager,
                contextCtorArg = context,
            )
    }
}

public class Ksquerybuffer internal constructor(
    public var event: Ksidentifier,
    eventDataCtorArg: MutPtr,
    reservedCtorArg: MutPtr,
) {
    public var eventData: MutPtr = eventDataCtorArg
        internal set

    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        event = Ksidentifier(),
        eventDataCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ksidentifier = this.event

    public operator fun component2(): MutPtr = this.eventData

    public operator fun component3(): MutPtr = this.reserved

    public fun copy(event: Ksidentifier = this.event, eventData: MutPtr = this.eventData, reserved: MutPtr = this.reserved): Ksquerybuffer = Ksquerybuffer(event = event, eventDataCtorArg = eventData, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ksquerybuffer) return false
        if (this.event != other.event) return false
        if (this.eventData != other.eventData) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.eventData.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            event: Ksidentifier = Ksidentifier(),
            eventData: MutPtr = MutPtr(0L),
            reserved: MutPtr = MutPtr(0L),
        ): Ksquerybuffer =
            Ksquerybuffer(
                event = event,
                eventDataCtorArg = eventData,
                reservedCtorArg = reserved,
            )
    }
}

public data class Ksrate(
    public var presentationStart: Long = 0L,
    public var duration: Long = 0L,
    public var iface: Ksidentifier = Ksidentifier(),
    public var rate: Int = 0,
    public var flags: UInt = 0u,
)

public data class KsrateCapability(
    public var property: Ksidentifier = Ksidentifier(),
    public var rate: Ksrate = Ksrate(),
)

public class Ksrelativeevent internal constructor(
    public var size: UInt,
    public var flags: UInt,
    public var anonymous: Ksrelativeevent0,
    reservedCtorArg: MutPtr,
    public var event: Ksidentifier,
    public var eventData: Kseventdata,
) {
    public var reserved: MutPtr = reservedCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flags = 0u,
        anonymous = Ksrelativeevent0(),
        reservedCtorArg = MutPtr(0L),
        event = Ksidentifier(),
        eventData = Kseventdata(),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Ksrelativeevent0 = this.anonymous

    public operator fun component4(): MutPtr = this.reserved

    public operator fun component5(): Ksidentifier = this.event

    public operator fun component6(): Kseventdata = this.eventData

    public fun copy(size: UInt = this.size, flags: UInt = this.flags, anonymous: Ksrelativeevent0 = this.anonymous, reserved: MutPtr = this.reserved, event: Ksidentifier = this.event, eventData: Kseventdata = this.eventData): Ksrelativeevent = Ksrelativeevent(size = size, flags = flags, anonymous = anonymous, reservedCtorArg = reserved, event = event, eventData = eventData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ksrelativeevent) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.anonymous != other.anonymous) return false
        if (this.reserved != other.reserved) return false
        if (this.event != other.event) return false
        if (this.eventData != other.eventData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.eventData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            flags: UInt = 0u,
            anonymous: Ksrelativeevent0 = Ksrelativeevent0(),
            reserved: MutPtr = MutPtr(0L),
            event: Ksidentifier = Ksidentifier(),
            eventData: Kseventdata = Kseventdata(),
        ): Ksrelativeevent =
            Ksrelativeevent(
                size = size,
                flags = flags,
                anonymous = anonymous,
                reservedCtorArg = reserved,
                event = event,
                eventData = eventData,
            )
    }
}
