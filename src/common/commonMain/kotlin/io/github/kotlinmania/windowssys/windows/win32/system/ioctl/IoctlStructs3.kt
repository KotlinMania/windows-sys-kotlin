@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128

public data class UsnTrackModifiedRanges(
    public var flags: UInt = 0u,
    public var unused: UInt = 0u,
    public var chunkSize: ULong = 0uL,
    public var fileSizeThreshold: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnTrackModifiedRanges> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnTrackModifiedRanges> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UsnTrackModifiedRanges =
                    UsnTrackModifiedRanges(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsnTrackModifiedRanges) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.unused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.chunkSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.fileSizeThreshold)
                }
            }
    }
}

public data class VerifyInformation(
    public var startingOffset: Long = 0L,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VerifyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VerifyInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VerifyInformation =
                    VerifyInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VerifyInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class VirtualizationInstanceInfoInput(
    public var numberOfWorkerThreads: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualizationInstanceInfoInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualizationInstanceInfoInput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VirtualizationInstanceInfoInput =
                    VirtualizationInstanceInfoInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VirtualizationInstanceInfoInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfWorkerThreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class VirtualizationInstanceInfoInputEx(
    public var headerSize: UShort = 0u,
    public var flags: UInt = 0u,
    public var notificationInfoSize: UInt = 0u,
    public var notificationInfoOffset: UShort = 0u,
    public var providerMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualizationInstanceInfoInputEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualizationInstanceInfoInputEx> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VirtualizationInstanceInfoInputEx =
                    VirtualizationInstanceInfoInputEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: VirtualizationInstanceInfoInputEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.headerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.notificationInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.notificationInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.providerMajorVersion)
                }
            }
    }
}

public data class VirtualizationInstanceInfoOutput(
    public var virtualizationInstanceID: Guid = Guid(),
)

public data class VirtualStorageSetBehaviorInput(
    public var size: UInt = 0u,
    public var behaviorCode: VirtualStorageBehaviorCode = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualStorageSetBehaviorInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualStorageSetBehaviorInput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VirtualStorageSetBehaviorInput =
                    VirtualStorageSetBehaviorInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VirtualStorageSetBehaviorInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.behaviorCode)
                }
            }
    }
}

public data class VolumeBitmapBuffer(
    public var startingLcn: Long = 0L,
    public var bitmapSize: Long = 0L,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeBitmapBuffer) return false
        if (this.startingLcn != other.startingLcn) return false
        if (this.bitmapSize != other.bitmapSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startingLcn.hashCode()
        result = 31 * result + this.bitmapSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeBitmapBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeBitmapBuffer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeBitmapBuffer =
                    VolumeBitmapBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: VolumeBitmapBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingLcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.bitmapSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.buffer)
                }
            }
    }
}

public data class VolumeDiskExtents(
    public var numberOfDiskExtents: UInt = 0u,
    public var extents: List<DiskExtent> = List(1) { DiskExtent() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeDiskExtents> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeDiskExtents> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeDiskExtents =
                    VolumeDiskExtents(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DiskExtent.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VolumeDiskExtents) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfDiskExtents)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DiskExtent.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.extents)
                }
            }
    }
}

public data class VolumeGetGptAttributesInformation(
    public var gptAttributes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeGetGptAttributesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeGetGptAttributesInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeGetGptAttributesInformation =
                    VolumeGetGptAttributesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VolumeGetGptAttributesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.gptAttributes)
                }
            }
    }
}

public data class WimProviderAddOverlayInput(
    public var wimType: UInt = 0u,
    public var wimIndex: UInt = 0u,
    public var wimFileNameOffset: UInt = 0u,
    public var wimFileNameLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderAddOverlayInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderAddOverlayInput> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WimProviderAddOverlayInput =
                    WimProviderAddOverlayInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WimProviderAddOverlayInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wimType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.wimIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.wimFileNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wimFileNameLength)
                }
            }
    }
}

public data class WimProviderExternalInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataSourceId: Long = 0L,
    public var resourceHash: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WimProviderExternalInfo) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.dataSourceId != other.dataSourceId) return false
        if (!this.resourceHash.contentEquals(other.resourceHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dataSourceId.hashCode()
        result = 31 * result + this.resourceHash.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderExternalInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderExternalInfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WimProviderExternalInfo =
                    WimProviderExternalInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WimProviderExternalInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dataSourceId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 16L, value.resourceHash)
                }
            }
    }
}

public data class WimProviderOverlayEntry(
    public var nextEntryOffset: UInt = 0u,
    public var dataSourceId: Long = 0L,
    public var wimGuid: Guid = Guid(),
    public var wimFileNameOffset: UInt = 0u,
    public var wimType: UInt = 0u,
    public var wimIndex: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class WimProviderRemoveOverlayInput(
    public var dataSourceId: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderRemoveOverlayInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderRemoveOverlayInput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WimProviderRemoveOverlayInput =
                    WimProviderRemoveOverlayInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WimProviderRemoveOverlayInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.dataSourceId)
                }
            }
    }
}

public data class WimProviderSuspendOverlayInput(
    public var dataSourceId: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderSuspendOverlayInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderSuspendOverlayInput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WimProviderSuspendOverlayInput =
                    WimProviderSuspendOverlayInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WimProviderSuspendOverlayInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.dataSourceId)
                }
            }
    }
}

public data class WimProviderUpdateOverlayInput(
    public var dataSourceId: Long = 0L,
    public var wimFileNameOffset: UInt = 0u,
    public var wimFileNameLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderUpdateOverlayInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimProviderUpdateOverlayInput> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WimProviderUpdateOverlayInput =
                    WimProviderUpdateOverlayInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WimProviderUpdateOverlayInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.dataSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.wimFileNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wimFileNameLength)
                }
            }
    }
}

public data class WofExternalFileId(
    public var fileId: FileId128 = FileId128(),
)

public data class WofExternalInfo(
    public var version: UInt = 0u,
    public var provider: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofExternalInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofExternalInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WofExternalInfo =
                    WofExternalInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WofExternalInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.provider)
                }
            }
    }
}

public data class WofVersionInfo(
    public var wofVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofVersionInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WofVersionInfo =
                    WofVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WofVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.wofVersion)
                }
            }
    }
}

public data class WriteUsnReasonInput(
    public var flags: UInt = 0u,
    public var usnReasonToWrite: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WriteUsnReasonInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WriteUsnReasonInput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WriteUsnReasonInput =
                    WriteUsnReasonInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WriteUsnReasonInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.usnReasonToWrite)
                }
            }
    }
}
