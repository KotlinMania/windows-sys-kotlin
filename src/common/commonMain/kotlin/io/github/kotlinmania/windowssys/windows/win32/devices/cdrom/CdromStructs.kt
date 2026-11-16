@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.cdrom

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class CdromDiskData(
    public var diskData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromDiskData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromDiskData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CdromDiskData =
                    CdromDiskData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CdromDiskData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.diskData)
                }
            }
    }
}

public data class CdromExceptionPerformanceDescriptor(
    public var lba: UByteArray = UByteArray(4),
    public var time: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromExceptionPerformanceDescriptor) return false
        if (!this.lba.contentEquals(other.lba)) return false
        if (!this.time.contentEquals(other.time)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lba.contentHashCode()
        result = 31 * result + this.time.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExceptionPerformanceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExceptionPerformanceDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): CdromExceptionPerformanceDescriptor =
                    CdromExceptionPerformanceDescriptor(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CdromExceptionPerformanceDescriptor) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.lba.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 4L, value.time.toList())
                }
            }
    }
}

public data class CdromExclusiveAccess(
    public var requestType: ExclusiveAccessRequestType = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExclusiveAccess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExclusiveAccess> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CdromExclusiveAccess =
                    CdromExclusiveAccess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CdromExclusiveAccess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.requestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class CdromExclusiveLock(
    public var access: CdromExclusiveAccess = CdromExclusiveAccess(),
    public var callerName: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromExclusiveLock) return false
        if (this.access != other.access) return false
        if (!this.callerName.contentEquals(other.callerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.access.hashCode()
        result = 31 * result + this.callerName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExclusiveLock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExclusiveLock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): CdromExclusiveLock =
                    CdromExclusiveLock(
                        (CdromExclusiveAccess.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CdromExclusiveLock) {
                    (CdromExclusiveAccess.typeLayout()).writeNative(addr, value.access)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 8L, value.callerName.toList())
                }
            }
    }
}

public data class CdromExclusiveLockState(
    public var lockState: Boolean = false,
    public var callerName: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromExclusiveLockState) return false
        if (this.lockState != other.lockState) return false
        if (!this.callerName.contentEquals(other.callerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lockState.hashCode()
        result = 31 * result + this.callerName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExclusiveLockState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromExclusiveLockState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 65L
                override fun readNative(addr: Long): CdromExclusiveLockState =
                    CdromExclusiveLockState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CdromExclusiveLockState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.lockState)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 1L, value.callerName.toList())
                }
            }
    }
}

public data class CdromNominalPerformanceDescriptor(
    public var startLba: UByteArray = UByteArray(4),
    public var startPerformance: UByteArray = UByteArray(4),
    public var endLba: UByteArray = UByteArray(4),
    public var endPerformance: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromNominalPerformanceDescriptor) return false
        if (!this.startLba.contentEquals(other.startLba)) return false
        if (!this.startPerformance.contentEquals(other.startPerformance)) return false
        if (!this.endLba.contentEquals(other.endLba)) return false
        if (!this.endPerformance.contentEquals(other.endPerformance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startLba.contentHashCode()
        result = 31 * result + this.startPerformance.contentHashCode()
        result = 31 * result + this.endLba.contentHashCode()
        result = 31 * result + this.endPerformance.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromNominalPerformanceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromNominalPerformanceDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CdromNominalPerformanceDescriptor =
                    CdromNominalPerformanceDescriptor(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CdromNominalPerformanceDescriptor) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.startLba.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.startPerformance.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.endLba.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.endPerformance.toList())
                }
            }
    }
}

public data class CdromPerformanceHeader(
    public var dataLength: UByteArray = UByteArray(4),
    public var bitfield: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromPerformanceHeader) return false
        if (!this.dataLength.contentEquals(other.dataLength)) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataLength.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromPerformanceHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromPerformanceHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 9L
                override fun readNative(addr: Long): CdromPerformanceHeader =
                    CdromPerformanceHeader(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CdromPerformanceHeader) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.dataLength.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.reserved2.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.data.toList())
                }
            }
    }
}

public data class CdromPerformanceRequest(
    public var requestType: CdromPerformanceRequestType = 0,
    public var performanceType: CdromPerformanceType = 0,
    public var exceptions: CdromPerformanceExceptionType = 0,
    public var tolerance: CdromPerformanceToleranceType = 0,
    public var staringLba: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromPerformanceRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromPerformanceRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): CdromPerformanceRequest =
                    CdromPerformanceRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CdromPerformanceRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.requestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.performanceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.exceptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tolerance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.staringLba)
                }
            }
    }
}

public data class CdromPlayAudioMsf(
    public var startingM: UByte = 0u,
    public var startingS: UByte = 0u,
    public var startingF: UByte = 0u,
    public var endingM: UByte = 0u,
    public var endingS: UByte = 0u,
    public var endingF: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromPlayAudioMsf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromPlayAudioMsf> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): CdromPlayAudioMsf =
                    CdromPlayAudioMsf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: CdromPlayAudioMsf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.startingM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.startingS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.startingF)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.endingM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.endingS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.endingF)
                }
            }
    }
}

public data class CdromReadTocEx(
    public var bitfield: UByte = 0u,
    public var sessionTrack: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var reserved3: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromReadTocEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromReadTocEx> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CdromReadTocEx =
                    CdromReadTocEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: CdromReadTocEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sessionTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved3)
                }
            }
    }
}

public data class CdromSeekAudioMsf(
    public var m: UByte = 0u,
    public var s: UByte = 0u,
    public var f: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSeekAudioMsf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSeekAudioMsf> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): CdromSeekAudioMsf =
                    CdromSeekAudioMsf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: CdromSeekAudioMsf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.m)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.s)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.f)
                }
            }
    }
}

public data class CdromSetSpeed(
    public var requestType: CdromSpeedRequest = 0,
    public var readSpeed: UShort = 0u,
    public var writeSpeed: UShort = 0u,
    public var rotationControl: WriteRotation = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSetSpeed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSetSpeed> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CdromSetSpeed =
                    CdromSetSpeed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CdromSetSpeed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.requestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.readSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.writeSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rotationControl)
                }
            }
    }
}

public data class CdromSetStreaming(
    public var requestType: CdromSpeedRequest = 0,
    public var readSize: UInt = 0u,
    public var readTime: UInt = 0u,
    public var writeSize: UInt = 0u,
    public var writeTime: UInt = 0u,
    public var startLba: UInt = 0u,
    public var endLba: UInt = 0u,
    public var rotationControl: WriteRotation = 0,
    public var restoreDefaults: Boolean = false,
    public var setExact: Boolean = false,
    public var randomAccess: Boolean = false,
    public var persistent: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSetStreaming> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSetStreaming> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): CdromSetStreaming =
                    CdromSetStreaming(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 33L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 35L),
                    )
                override fun writeNative(addr: Long, value: CdromSetStreaming) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.requestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.readSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.readTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.writeSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.writeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.startLba)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.endLba)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.rotationControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 32L, value.restoreDefaults)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 33L, value.setExact)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 34L, value.randomAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 35L, value.persistent)
                }
            }
    }
}

public data class CdromSimpleOpcInfo(
    public var requestType: CdromOpcInfoType = 0,
    public var exclude0: Boolean = false,
    public var exclude1: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSimpleOpcInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSimpleOpcInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CdromSimpleOpcInfo =
                    CdromSimpleOpcInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: CdromSimpleOpcInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.requestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.exclude0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.exclude1)
                }
            }
    }
}

public data class CdromStreamingControl(
    public var requestType: StreamingControlRequestType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromStreamingControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromStreamingControl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CdromStreamingControl =
                    CdromStreamingControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CdromStreamingControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.requestType)
                }
            }
    }
}

public data class CdromSubQDataFormat(
    public var format: UByte = 0u,
    public var track: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSubQDataFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromSubQDataFormat> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): CdromSubQDataFormat =
                    CdromSubQDataFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: CdromSubQDataFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.format)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.track)
                }
            }
    }
}

public data class CdromToc(
    public var length: UByteArray = UByteArray(2),
    public var firstTrack: UByte = 0u,
    public var lastTrack: UByte = 0u,
    public var trackData: List<TrackData> = List(100) { TrackData() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromToc) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.firstTrack != other.firstTrack) return false
        if (this.lastTrack != other.lastTrack) return false
        if (this.trackData != other.trackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.firstTrack.hashCode()
        result = 31 * result + this.lastTrack.hashCode()
        result = 31 * result + this.trackData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromToc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromToc> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 804L
                override fun readNative(addr: Long): CdromToc =
                    CdromToc(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(TrackData.typeLayout(), (100).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CdromToc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.length.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.firstTrack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.lastTrack)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(TrackData.typeLayout(), (100).toInt())
                    ).writeNative(addr + 4L, value.trackData)
                }
            }
    }
}

public data class CdromTocAtipData(
    public var length: UByteArray = UByteArray(2),
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var descriptors: List<CdromTocAtipDataBlock> = List(1) { CdromTocAtipDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocAtipData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocAtipData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocAtipData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): CdromTocAtipData =
                    CdromTocAtipData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(CdromTocAtipDataBlock.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CdromTocAtipData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.length.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(CdromTocAtipDataBlock.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.descriptors)
                }
            }
    }
}

public data class CdromTocAtipDataBlock(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var reserved7: UByte = 0u,
    public var leadInMsf: UByteArray = UByteArray(3),
    public var reserved8: UByte = 0u,
    public var leadOutMsf: UByteArray = UByteArray(3),
    public var reserved9: UByte = 0u,
    public var a1Values: UByteArray = UByteArray(3),
    public var reserved10: UByte = 0u,
    public var a2Values: UByteArray = UByteArray(3),
    public var reserved11: UByte = 0u,
    public var a3Values: UByteArray = UByteArray(3),
    public var reserved12: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocAtipDataBlock) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (this.bitfield3 != other.bitfield3) return false
        if (this.reserved7 != other.reserved7) return false
        if (!this.leadInMsf.contentEquals(other.leadInMsf)) return false
        if (this.reserved8 != other.reserved8) return false
        if (!this.leadOutMsf.contentEquals(other.leadOutMsf)) return false
        if (this.reserved9 != other.reserved9) return false
        if (!this.a1Values.contentEquals(other.a1Values)) return false
        if (this.reserved10 != other.reserved10) return false
        if (!this.a2Values.contentEquals(other.a2Values)) return false
        if (this.reserved11 != other.reserved11) return false
        if (!this.a3Values.contentEquals(other.a3Values)) return false
        if (this.reserved12 != other.reserved12) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield1.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.bitfield3.hashCode()
        result = 31 * result + this.reserved7.hashCode()
        result = 31 * result + this.leadInMsf.contentHashCode()
        result = 31 * result + this.reserved8.hashCode()
        result = 31 * result + this.leadOutMsf.contentHashCode()
        result = 31 * result + this.reserved9.hashCode()
        result = 31 * result + this.a1Values.contentHashCode()
        result = 31 * result + this.reserved10.hashCode()
        result = 31 * result + this.a2Values.contentHashCode()
        result = 31 * result + this.reserved11.hashCode()
        result = 31 * result + this.a3Values.contentHashCode()
        result = 31 * result + this.reserved12.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocAtipDataBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocAtipDataBlock> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CdromTocAtipDataBlock =
                    CdromTocAtipDataBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                    )
                override fun writeNative(addr: Long, value: CdromTocAtipDataBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bitfield3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved7)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 4L, value.leadInMsf.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reserved8)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 8L, value.leadOutMsf.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.reserved9)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 12L, value.a1Values.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.reserved10)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 16L, value.a2Values.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.reserved11)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 20L, value.a3Values.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.reserved12)
                }
            }
    }
}

public data class CdromTocCdTextData(
    public var length: UByteArray = UByteArray(2),
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var descriptors: List<CdromTocCdTextDataBlock> = List(1) { CdromTocCdTextDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocCdTextData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }
}

public data class CdromTocCdTextDataBlock(
    public var packType: UByte = 0u,
    public var bitfield1: UByte = 0u,
    public var sequenceNumber: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var anonymous: CdromTocCdTextDataBlock0 = CdromTocCdTextDataBlock0(),
    public var crc: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocCdTextDataBlock) return false
        if (this.packType != other.packType) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.sequenceNumber != other.sequenceNumber) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.crc.contentEquals(other.crc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packType.hashCode()
        result = 31 * result + this.bitfield1.hashCode()
        result = 31 * result + this.sequenceNumber.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.crc.contentHashCode()
        return result
    }
}

public data class CdromTocCdTextDataBlock0(
    public var text: UByteArray = UByteArray(12),
    public var wText: UShortArray = UShortArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocCdTextDataBlock0) return false
        if (!this.text.contentEquals(other.text)) return false
        if (!this.wText.contentEquals(other.wText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.text.contentHashCode()
        result = 31 * result + this.wText.contentHashCode()
        return result
    }
}

public data class CdromTocFullTocData(
    public var length: UByteArray = UByteArray(2),
    public var firstCompleteSession: UByte = 0u,
    public var lastCompleteSession: UByte = 0u,
    public var descriptors: List<CdromTocFullTocDataBlock> = List(1) { CdromTocFullTocDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocFullTocData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.firstCompleteSession != other.firstCompleteSession) return false
        if (this.lastCompleteSession != other.lastCompleteSession) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.firstCompleteSession.hashCode()
        result = 31 * result + this.lastCompleteSession.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocFullTocData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocFullTocData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 15L
                override fun readNative(addr: Long): CdromTocFullTocData =
                    CdromTocFullTocData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(CdromTocFullTocDataBlock.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CdromTocFullTocData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.length.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.firstCompleteSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.lastCompleteSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(CdromTocFullTocDataBlock.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.descriptors)
                }
            }
    }
}

public data class CdromTocFullTocDataBlock(
    public var sessionNumber: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var point: UByte = 0u,
    public var msfExtra: UByteArray = UByteArray(3),
    public var zero: UByte = 0u,
    public var msf: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocFullTocDataBlock) return false
        if (this.sessionNumber != other.sessionNumber) return false
        if (this.bitfield != other.bitfield) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.point != other.point) return false
        if (!this.msfExtra.contentEquals(other.msfExtra)) return false
        if (this.zero != other.zero) return false
        if (!this.msf.contentEquals(other.msf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionNumber.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.point.hashCode()
        result = 31 * result + this.msfExtra.contentHashCode()
        result = 31 * result + this.zero.hashCode()
        result = 31 * result + this.msf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocFullTocDataBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocFullTocDataBlock> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 11L
                override fun readNative(addr: Long): CdromTocFullTocDataBlock =
                    CdromTocFullTocDataBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CdromTocFullTocDataBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sessionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.point)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 4L, value.msfExtra.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.zero)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 8L, value.msf.toList())
                }
            }
    }
}

public data class CdromTocPmaData(
    public var length: UByteArray = UByteArray(2),
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var descriptors: List<CdromTocFullTocDataBlock> = List(1) { CdromTocFullTocDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocPmaData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocPmaData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocPmaData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 15L
                override fun readNative(addr: Long): CdromTocPmaData =
                    CdromTocPmaData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(CdromTocFullTocDataBlock.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CdromTocPmaData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.length.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(CdromTocFullTocDataBlock.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.descriptors)
                }
            }
    }
}

public data class CdromTocSessionData(
    public var length: UByteArray = UByteArray(2),
    public var firstCompleteSession: UByte = 0u,
    public var lastCompleteSession: UByte = 0u,
    public var trackData: List<TrackData> = List(1) { TrackData() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocSessionData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.firstCompleteSession != other.firstCompleteSession) return false
        if (this.lastCompleteSession != other.lastCompleteSession) return false
        if (this.trackData != other.trackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.firstCompleteSession.hashCode()
        result = 31 * result + this.lastCompleteSession.hashCode()
        result = 31 * result + this.trackData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocSessionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromTocSessionData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CdromTocSessionData =
                    CdromTocSessionData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(TrackData.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CdromTocSessionData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.length.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.firstCompleteSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.lastCompleteSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(TrackData.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.trackData)
                }
            }
    }
}

public data class CdromWriteSpeedDescriptor(
    public var bitfield: UByte = 0u,
    public var reserved3: UByteArray = UByteArray(3),
    public var endLba: UByteArray = UByteArray(4),
    public var readSpeed: UByteArray = UByteArray(4),
    public var writeSpeed: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromWriteSpeedDescriptor) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (!this.endLba.contentEquals(other.endLba)) return false
        if (!this.readSpeed.contentEquals(other.readSpeed)) return false
        if (!this.writeSpeed.contentEquals(other.writeSpeed)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.endLba.contentHashCode()
        result = 31 * result + this.readSpeed.contentHashCode()
        result = 31 * result + this.writeSpeed.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromWriteSpeedDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromWriteSpeedDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CdromWriteSpeedDescriptor =
                    CdromWriteSpeedDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CdromWriteSpeedDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved3.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.endLba.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.readSpeed.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.writeSpeed.toList())
                }
            }
    }
}

public data class CdromWriteSpeedRequest(
    public var requestType: CdromPerformanceRequestType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromWriteSpeedRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CdromWriteSpeedRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CdromWriteSpeedRequest =
                    CdromWriteSpeedRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CdromWriteSpeedRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.requestType)
                }
            }
    }
}

public data class RawReadInfo(
    public var diskOffset: Long = 0L,
    public var sectorCount: UInt = 0u,
    public var trackMode: TrackModeType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawReadInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawReadInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RawReadInfo =
                    RawReadInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RawReadInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.diskOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sectorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.trackMode)
                }
            }
    }
}

public data class SubQChannelData(
    public var currentPosition: SubQCurrentPosition = SubQCurrentPosition(),
    public var mediaCatalog: SubQMediaCatalogNumber = SubQMediaCatalogNumber(),
    public var trackIsrc: SubQTrackIsrc = SubQTrackIsrc(),
)

public data class SubQCurrentPosition(
    public var header: SubQHeader = SubQHeader(),
    public var formatCode: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var trackNumber: UByte = 0u,
    public var indexNumber: UByte = 0u,
    public var absoluteAddress: UByteArray = UByteArray(4),
    public var trackRelativeAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQCurrentPosition) return false
        if (this.header != other.header) return false
        if (this.formatCode != other.formatCode) return false
        if (this.bitfield != other.bitfield) return false
        if (this.trackNumber != other.trackNumber) return false
        if (this.indexNumber != other.indexNumber) return false
        if (!this.absoluteAddress.contentEquals(other.absoluteAddress)) return false
        if (!this.trackRelativeAddress.contentEquals(other.trackRelativeAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.formatCode.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.trackNumber.hashCode()
        result = 31 * result + this.indexNumber.hashCode()
        result = 31 * result + this.absoluteAddress.contentHashCode()
        result = 31 * result + this.trackRelativeAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQCurrentPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQCurrentPosition> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SubQCurrentPosition =
                    SubQCurrentPosition(
                        (SubQHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SubQCurrentPosition) {
                    (SubQHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.trackNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.indexNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.absoluteAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.trackRelativeAddress.toList())
                }
            }
    }
}

public data class SubQHeader(
    public var reserved: UByte = 0u,
    public var audioStatus: UByte = 0u,
    public var dataLength: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQHeader) return false
        if (this.reserved != other.reserved) return false
        if (this.audioStatus != other.audioStatus) return false
        if (!this.dataLength.contentEquals(other.dataLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.audioStatus.hashCode()
        result = 31 * result + this.dataLength.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SubQHeader =
                    SubQHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SubQHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.audioStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.dataLength.toList())
                }
            }
    }
}

public data class SubQMediaCatalogNumber(
    public var header: SubQHeader = SubQHeader(),
    public var formatCode: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
    public var mediaCatalog: UByteArray = UByteArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQMediaCatalogNumber) return false
        if (this.header != other.header) return false
        if (this.formatCode != other.formatCode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.mediaCatalog.contentEquals(other.mediaCatalog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.formatCode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.mediaCatalog.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQMediaCatalogNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQMediaCatalogNumber> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SubQMediaCatalogNumber =
                    SubQMediaCatalogNumber(
                        (SubQHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (15).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SubQMediaCatalogNumber) {
                    (SubQHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.formatCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (15).toInt())
                    ).writeNative(addr + 9L, value.mediaCatalog.toList())
                }
            }
    }
}

public data class SubQTrackIsrc(
    public var header: SubQHeader = SubQHeader(),
    public var formatCode: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var track: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var trackIsrc: UByteArray = UByteArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQTrackIsrc) return false
        if (this.header != other.header) return false
        if (this.formatCode != other.formatCode) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.track != other.track) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.trackIsrc.contentEquals(other.trackIsrc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.formatCode.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.track.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.trackIsrc.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQTrackIsrc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SubQTrackIsrc> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SubQTrackIsrc =
                    SubQTrackIsrc(
                        (SubQHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (15).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SubQTrackIsrc) {
                    (SubQHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.track)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (15).toInt())
                    ).writeNative(addr + 9L, value.trackIsrc.toList())
                }
            }
    }
}

public data class TrackData(
    public var reserved: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var trackNumber: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var address: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrackData) return false
        if (this.reserved != other.reserved) return false
        if (this.bitfield != other.bitfield) return false
        if (this.trackNumber != other.trackNumber) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.trackNumber.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrackData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TrackData> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TrackData =
                    TrackData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: TrackData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.trackNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.address.toList())
                }
            }
    }
}

public data class VolumeControl(
    public var portVolume: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeControl) return false
        if (!this.portVolume.contentEquals(other.portVolume)) return false
        return true
    }

    override fun hashCode(): Int = this.portVolume.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeControl> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VolumeControl =
                    VolumeControl(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: VolumeControl) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.portVolume.toList())
                }
            }
    }
}
