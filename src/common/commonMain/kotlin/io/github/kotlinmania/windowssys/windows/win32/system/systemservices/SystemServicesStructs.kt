@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.TokenUser
import io.github.kotlinmania.windowssys.windows.win32.system.com.ByteBlob
import io.github.kotlinmania.windowssys.windows.win32.system.com.DwordBlob
import io.github.kotlinmania.windowssys.windows.win32.system.com.FlaggedByteBlob

public data class AnonObjectHeader(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var classID: Guid = Guid(),
    public var sizeOfData: UInt = 0u,
)

public data class AnonObjectHeaderBigobj(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var classID: Guid = Guid(),
    public var sizeOfData: UInt = 0u,
    public var flags: UInt = 0u,
    public var metaDataSize: UInt = 0u,
    public var metaDataOffset: UInt = 0u,
    public var numberOfSections: UInt = 0u,
    public var pointerToSymbolTable: UInt = 0u,
    public var numberOfSymbols: UInt = 0u,
)

public data class AnonObjectHeaderV2(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var classID: Guid = Guid(),
    public var sizeOfData: UInt = 0u,
    public var flags: UInt = 0u,
    public var metaDataSize: UInt = 0u,
    public var metaDataOffset: UInt = 0u,
)

public data class ApplicationlaunchSettingValue(
    public var activationTime: Long = 0L,
    public var flags: UInt = 0u,
    public var buttonInstanceID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApplicationlaunchSettingValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApplicationlaunchSettingValue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ApplicationlaunchSettingValue =
                    ApplicationlaunchSettingValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ApplicationlaunchSettingValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.activationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.buttonInstanceID)
                }
            }
    }
}

public data class ComponentFilter(
    public var componentFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComponentFilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ComponentFilter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ComponentFilter =
                    ComponentFilter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ComponentFilter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.componentFlags)
                }
            }
    }
}

public data class DispatcherContextNonvolregArm64(
    public var buffer: UByteArray = UByteArray(152),
    public var anonymous: DispatcherContextNonvolregArm640 = DispatcherContextNonvolregArm640(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DispatcherContextNonvolregArm64) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DispatcherContextNonvolregArm640(
    public var gpNvRegs: ULongArray = ULongArray(11),
    public var fpNvRegs: DoubleArray = DoubleArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DispatcherContextNonvolregArm640) return false
        if (!this.gpNvRegs.contentEquals(other.gpNvRegs)) return false
        if (!this.fpNvRegs.contentEquals(other.fpNvRegs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpNvRegs.contentHashCode()
        result = 31 * result + this.fpNvRegs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherContextNonvolregArm640> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DispatcherContextNonvolregArm640> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): DispatcherContextNonvolregArm640 =
                    DispatcherContextNonvolregArm640(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (11).toInt())
                        ).readNative(addr).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (8).toInt())
                        ).readNative(addr + 88L).toDoubleArray(),
                    )
                override fun writeNative(addr: Long, value: DispatcherContextNonvolregArm640) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (11).toInt())
                    ).writeNative(addr, value.gpNvRegs.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (8).toInt())
                    ).writeNative(addr + 88L, value.fpNvRegs.toList())
                }
            }
    }
}

public data class EnlistmentBasicInformation(
    public var enlistmentId: Guid = Guid(),
    public var transactionId: Guid = Guid(),
    public var resourceManagerId: Guid = Guid(),
)

public data class EnlistmentCrmInformation(
    public var crmTransactionManagerId: Guid = Guid(),
    public var crmResourceManagerId: Guid = Guid(),
    public var crmEnlistmentId: Guid = Guid(),
)

public data class FileNotifyFullInformation(
    public var nextEntryOffset: UInt = 0u,
    public var action: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastModificationTime: Long = 0L,
    public var lastChangeTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var allocatedLength: Long = 0L,
    public var fileSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var anonymous: FileNotifyFullInformation0 = FileNotifyFullInformation0(),
    public var fileId: Long = 0L,
    public var parentFileId: Long = 0L,
    public var fileNameLength: UShort = 0u,
    public var fileNameFlags: UByte = 0u,
    public var reserved: UByte = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNotifyFullInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.action != other.action) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastModificationTime != other.lastModificationTime) return false
        if (this.lastChangeTime != other.lastChangeTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.allocatedLength != other.allocatedLength) return false
        if (this.fileSize != other.fileSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.anonymous != other.anonymous) return false
        if (this.fileId != other.fileId) return false
        if (this.parentFileId != other.parentFileId) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameFlags != other.fileNameFlags) return false
        if (this.reserved != other.reserved) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastModificationTime.hashCode()
        result = 31 * result + this.lastChangeTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.allocatedLength.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.parentFileId.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameFlags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileNotifyFullInformation0(
    public var reparsePointTag: UInt = 0u,
    public var eaSize: UInt = 0u,
)

public data class GdiNonremote(
    public var fContext: Int = 0,
    public var u: GdiNonremote0 = GdiNonremote0(),
)

public class GdiNonremote0 internal constructor(
    public var hInproc: Int,
    hRemoteCtorArg: MutPtr<DwordBlob>,
) {
    public var hRemote: MutPtr<DwordBlob> = hRemoteCtorArg
        internal set

    public constructor() : this(
        hInproc = 0,
        hRemoteCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.hInproc

    public operator fun component2(): MutPtr<DwordBlob> = this.hRemote

    public fun copy(hInproc: Int = this.hInproc, hRemote: MutPtr<DwordBlob> = this.hRemote): GdiNonremote0 = GdiNonremote0(hInproc = hInproc, hRemoteCtorArg = hRemote)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GdiNonremote0) return false
        if (this.hInproc != other.hInproc) return false
        if (this.hRemote != other.hRemote) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInproc.hashCode()
        result = 31 * result + this.hRemote.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInproc: Int = 0,
            hRemote: MutPtr<DwordBlob> = MutPtr(0L),
        ): GdiNonremote0 =
            GdiNonremote0(
                hInproc = hInproc,
                hRemoteCtorArg = hRemote,
            )
    }
}

public data class HeapOptimizeResourcesInformation(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HeapOptimizeResourcesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HeapOptimizeResourcesInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HeapOptimizeResourcesInformation =
                    HeapOptimizeResourcesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: HeapOptimizeResourcesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class HiberfileBucket(
    public var maxPhysicalMemory: ULong = 0uL,
    public var physicalMemoryPercent: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HiberfileBucket) return false
        if (this.maxPhysicalMemory != other.maxPhysicalMemory) return false
        if (!this.physicalMemoryPercent.contentEquals(other.physicalMemoryPercent)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxPhysicalMemory.hashCode()
        result = 31 * result + this.physicalMemoryPercent.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiberfileBucket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiberfileBucket> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HiberfileBucket =
                    HiberfileBucket(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: HiberfileBucket) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.maxPhysicalMemory)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 8L, value.physicalMemoryPercent.toList())
                }
            }
    }
}

public data class ImageAlpha64RuntimeFunctionEntry(
    public var beginAddress: ULong = 0uL,
    public var endAddress: ULong = 0uL,
    public var exceptionHandler: ULong = 0uL,
    public var handlerData: ULong = 0uL,
    public var prologEndAddress: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAlpha64RuntimeFunctionEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAlpha64RuntimeFunctionEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ImageAlpha64RuntimeFunctionEntry =
                    ImageAlpha64RuntimeFunctionEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ImageAlpha64RuntimeFunctionEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.beginAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.endAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.exceptionHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.handlerData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.prologEndAddress)
                }
            }
    }
}

public data class ImageAlphaRuntimeFunctionEntry(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var exceptionHandler: UInt = 0u,
    public var handlerData: UInt = 0u,
    public var prologEndAddress: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAlphaRuntimeFunctionEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAlphaRuntimeFunctionEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageAlphaRuntimeFunctionEntry =
                    ImageAlphaRuntimeFunctionEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ImageAlphaRuntimeFunctionEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.beginAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.exceptionHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.handlerData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.prologEndAddress)
                }
            }
    }
}

public data class ImageArchitectureEntry(
    public var fixupInstRVA: UInt = 0u,
    public var newInst: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArchitectureEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArchitectureEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageArchitectureEntry =
                    ImageArchitectureEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageArchitectureEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fixupInstRVA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.newInst)
                }
            }
    }
}

public data class ImageArchitectureHeader(
    public var bitfield: UInt = 0u,
    public var firstEntryRVA: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArchitectureHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArchitectureHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageArchitectureHeader =
                    ImageArchitectureHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageArchitectureHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.firstEntryRVA)
                }
            }
    }
}

public data class ImageArchiveMemberHeader(
    public var name: UByteArray = UByteArray(16),
    public var date: UByteArray = UByteArray(12),
    public var userID: UByteArray = UByteArray(6),
    public var groupID: UByteArray = UByteArray(6),
    public var mode: UByteArray = UByteArray(8),
    public var size: UByteArray = UByteArray(10),
    public var endHeader: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageArchiveMemberHeader) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.date.contentEquals(other.date)) return false
        if (!this.userID.contentEquals(other.userID)) return false
        if (!this.groupID.contentEquals(other.groupID)) return false
        if (!this.mode.contentEquals(other.mode)) return false
        if (!this.size.contentEquals(other.size)) return false
        if (!this.endHeader.contentEquals(other.endHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.date.contentHashCode()
        result = 31 * result + this.userID.contentHashCode()
        result = 31 * result + this.groupID.contentHashCode()
        result = 31 * result + this.mode.contentHashCode()
        result = 31 * result + this.size.contentHashCode()
        result = 31 * result + this.endHeader.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArchiveMemberHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArchiveMemberHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): ImageArchiveMemberHeader =
                    ImageArchiveMemberHeader(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 34L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                        ).readNative(addr + 48L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 58L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageArchiveMemberHeader) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.name.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 16L, value.date.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 28L, value.userID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 34L, value.groupID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 40L, value.mode.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                    ).writeNative(addr + 48L, value.size.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 58L, value.endHeader.toList())
                }
            }
    }
}

public data class ImageArm64RuntimeFunctionEntryXdata(
    public var headerData: UInt = 0u,
    public var anonymous: ImageArm64RuntimeFunctionEntryXdata0 = ImageArm64RuntimeFunctionEntryXdata0(),
)

public data class ImageArm64RuntimeFunctionEntryXdata0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArm64RuntimeFunctionEntryXdata0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArm64RuntimeFunctionEntryXdata0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageArm64RuntimeFunctionEntryXdata0 =
                    ImageArm64RuntimeFunctionEntryXdata0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageArm64RuntimeFunctionEntryXdata0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageArmRuntimeFunctionEntry(
    public var beginAddress: UInt = 0u,
    public var anonymous: ImageArmRuntimeFunctionEntry0 = ImageArmRuntimeFunctionEntry0(),
)

public data class ImageArmRuntimeFunctionEntry0(
    public var unwindData: UInt = 0u,
    public var anonymous: ImageArmRuntimeFunctionEntry00 = ImageArmRuntimeFunctionEntry00(),
)

public data class ImageArmRuntimeFunctionEntry00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArmRuntimeFunctionEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArmRuntimeFunctionEntry00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageArmRuntimeFunctionEntry00 =
                    ImageArmRuntimeFunctionEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageArmRuntimeFunctionEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageAuxSymbol(
    public var sym: ImageAuxSymbol0 = ImageAuxSymbol0(),
    public var file: ImageAuxSymbol1 = ImageAuxSymbol1(),
    public var section: ImageAuxSymbol2 = ImageAuxSymbol2(),
    public var tokenDef: ImageAuxSymbolTokenDef = ImageAuxSymbolTokenDef(),
    public var crc: ImageAuxSymbol3 = ImageAuxSymbol3(),
)

public data class ImageAuxSymbol3(
    public var crc: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbol3) return false
        if (this.crc != other.crc) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crc.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol3> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): ImageAuxSymbol3 =
                    ImageAuxSymbol3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbol3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.crc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 4L, value.rgbReserved.toList())
                }
            }
    }
}

public data class ImageAuxSymbol1(
    public var name: UByteArray = UByteArray(18),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbol1) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int = this.name.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): ImageAuxSymbol1 =
                    ImageAuxSymbol1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (18).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbol1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (18).toInt())
                    ).writeNative(addr, value.name.toList())
                }
            }
    }
}

public data class ImageAuxSymbol2(
    public var length: UInt = 0u,
    public var numberOfRelocations: UShort = 0u,
    public var numberOfLinenumbers: UShort = 0u,
    public var checkSum: UInt = 0u,
    public var number: Short = 0,
    public var selection: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var highNumber: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): ImageAuxSymbol2 =
                    ImageAuxSymbol2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbol2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.numberOfRelocations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.numberOfLinenumbers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.checkSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.number)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.selection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.highNumber)
                }
            }
    }
}

public data class ImageAuxSymbol0(
    public var tagIndex: UInt = 0u,
    public var misc: ImageAuxSymbol00 = ImageAuxSymbol00(),
    public var fcnAry: ImageAuxSymbol01 = ImageAuxSymbol01(),
    public var tvIndex: UShort = 0u,
)

public data class ImageAuxSymbol01(
    public var function: ImageAuxSymbol010 = ImageAuxSymbol010(),
    public var array: ImageAuxSymbol011 = ImageAuxSymbol011(),
)

public data class ImageAuxSymbol011(
    public var dimension: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbol011) return false
        if (!this.dimension.contentEquals(other.dimension)) return false
        return true
    }

    override fun hashCode(): Int = this.dimension.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol011> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageAuxSymbol011 =
                    ImageAuxSymbol011(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbol011) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr, value.dimension.toList())
                }
            }
    }
}

public data class ImageAuxSymbol010(
    public var pointerToLinenumber: UInt = 0u,
    public var pointerToNextFunction: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol010> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageAuxSymbol010 =
                    ImageAuxSymbol010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbol010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pointerToLinenumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pointerToNextFunction)
                }
            }
    }
}

public data class ImageAuxSymbol00(
    public var lnSz: ImageAuxSymbol000 = ImageAuxSymbol000(),
    public var totalSize: UInt = 0u,
)

public data class ImageAuxSymbol000(
    public var linenumber: UShort = 0u,
    public var size: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbol000> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageAuxSymbol000 =
                    ImageAuxSymbol000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbol000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.linenumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                }
            }
    }
}

public data class ImageAuxSymbolEx(
    public var sym: ImageAuxSymbolEx0 = ImageAuxSymbolEx0(),
    public var file: ImageAuxSymbolEx1 = ImageAuxSymbolEx1(),
    public var section: ImageAuxSymbolEx2 = ImageAuxSymbolEx2(),
    public var anonymous: ImageAuxSymbolEx3 = ImageAuxSymbolEx3(),
    public var crc: ImageAuxSymbolEx4 = ImageAuxSymbolEx4(),
)

public data class ImageAuxSymbolEx3(
    public var tokenDef: ImageAuxSymbolTokenDef = ImageAuxSymbolTokenDef(),
    public var rgbReserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx3) return false
        if (this.tokenDef != other.tokenDef) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tokenDef.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx3> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageAuxSymbolEx3 =
                    ImageAuxSymbolEx3(
                        (ImageAuxSymbolTokenDef.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 18L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbolEx3) {
                    (ImageAuxSymbolTokenDef.typeLayout()).writeNative(addr, value.tokenDef)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 18L, value.rgbReserved.toList())
                }
            }
    }
}

public data class ImageAuxSymbolEx4(
    public var crc: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx4) return false
        if (this.crc != other.crc) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crc.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx4> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageAuxSymbolEx4 =
                    ImageAuxSymbolEx4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbolEx4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.crc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.rgbReserved.toList())
                }
            }
    }
}

public data class ImageAuxSymbolEx1(
    public var name: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx1) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int = this.name.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageAuxSymbolEx1 =
                    ImageAuxSymbolEx1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbolEx1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr, value.name.toList())
                }
            }
    }
}

public data class ImageAuxSymbolEx2(
    public var length: UInt = 0u,
    public var numberOfRelocations: UShort = 0u,
    public var numberOfLinenumbers: UShort = 0u,
    public var checkSum: UInt = 0u,
    public var number: Short = 0,
    public var selection: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var highNumber: Short = 0,
    public var rgbReserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx2) return false
        if (this.length != other.length) return false
        if (this.numberOfRelocations != other.numberOfRelocations) return false
        if (this.numberOfLinenumbers != other.numberOfLinenumbers) return false
        if (this.checkSum != other.checkSum) return false
        if (this.number != other.number) return false
        if (this.selection != other.selection) return false
        if (this.bReserved != other.bReserved) return false
        if (this.highNumber != other.highNumber) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.numberOfRelocations.hashCode()
        result = 31 * result + this.numberOfLinenumbers.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.number.hashCode()
        result = 31 * result + this.selection.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.highNumber.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageAuxSymbolEx2 =
                    ImageAuxSymbolEx2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 18L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbolEx2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.numberOfRelocations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.numberOfLinenumbers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.checkSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.number)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.selection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.highNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 18L, value.rgbReserved.toList())
                }
            }
    }
}

public data class ImageAuxSymbolEx0(
    public var weakDefaultSymIndex: UInt = 0u,
    public var weakSearchType: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolEx0) return false
        if (this.weakDefaultSymIndex != other.weakDefaultSymIndex) return false
        if (this.weakSearchType != other.weakSearchType) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.weakDefaultSymIndex.hashCode()
        result = 31 * result + this.weakSearchType.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolEx0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageAuxSymbolEx0 =
                    ImageAuxSymbolEx0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbolEx0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.weakDefaultSymIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.weakSearchType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 8L, value.rgbReserved.toList())
                }
            }
    }
}

public data class ImageAuxSymbolTokenDef(
    public var bAuxType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var symbolTableIndex: UInt = 0u,
    public var rgbReserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageAuxSymbolTokenDef) return false
        if (this.bAuxType != other.bAuxType) return false
        if (this.bReserved != other.bReserved) return false
        if (this.symbolTableIndex != other.symbolTableIndex) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bAuxType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.symbolTableIndex.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolTokenDef> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageAuxSymbolTokenDef> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): ImageAuxSymbolTokenDef =
                    ImageAuxSymbolTokenDef(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageAuxSymbolTokenDef) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bAuxType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.symbolTableIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 6L, value.rgbReserved.toList())
                }
            }
    }
}

public data class ImageBaseRelocation(
    public var virtualAddress: UInt = 0u,
    public var sizeOfBlock: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBaseRelocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBaseRelocation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageBaseRelocation =
                    ImageBaseRelocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageBaseRelocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.virtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfBlock)
                }
            }
    }
}

public data class ImageBddDynamicRelocation(
    public var left: UShort = 0u,
    public var right: UShort = 0u,
    public var value: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBddDynamicRelocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBddDynamicRelocation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageBddDynamicRelocation =
                    ImageBddDynamicRelocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageBddDynamicRelocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.value)
                }
            }
    }
}

public data class ImageBddInfo(
    public var version: UInt = 0u,
    public var bDDSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBddInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBddInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageBddInfo =
                    ImageBddInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageBddInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bDDSize)
                }
            }
    }
}

public data class ImageBoundForwarderRef(
    public var timeDateStamp: UInt = 0u,
    public var offsetModuleName: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBoundForwarderRef> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBoundForwarderRef> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageBoundForwarderRef =
                    ImageBoundForwarderRef(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ImageBoundForwarderRef) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.offsetModuleName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public data class ImageBoundImportDescriptor(
    public var timeDateStamp: UInt = 0u,
    public var offsetModuleName: UShort = 0u,
    public var numberOfModuleForwarderRefs: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBoundImportDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageBoundImportDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageBoundImportDescriptor =
                    ImageBoundImportDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ImageBoundImportDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.offsetModuleName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.numberOfModuleForwarderRefs)
                }
            }
    }
}

public data class ImageCeRuntimeFunctionEntry(
    public var funcStart: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageCeRuntimeFunctionEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageCeRuntimeFunctionEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageCeRuntimeFunctionEntry =
                    ImageCeRuntimeFunctionEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageCeRuntimeFunctionEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.funcStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class ImageDebugMisc(
    public var dataType: UInt = 0u,
    public var length: UInt = 0u,
    public var unicode: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageDebugMisc) return false
        if (this.dataType != other.dataType) return false
        if (this.length != other.length) return false
        if (this.unicode != other.unicode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataType.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.unicode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDebugMisc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDebugMisc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ImageDebugMisc =
                    ImageDebugMisc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageDebugMisc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.unicode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 9L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public class ImageDosHeader(
    public var eMagic: UShort = 0u,
    public var eCblp: UShort = 0u,
    public var eCp: UShort = 0u,
    public var eCrlc: UShort = 0u,
    public var eCparhdr: UShort = 0u,
    public var eMinalloc: UShort = 0u,
    public var eMaxalloc: UShort = 0u,
    public var eSs: UShort = 0u,
    public var eSp: UShort = 0u,
    public var eCsum: UShort = 0u,
    public var eIp: UShort = 0u,
    public var eCs: UShort = 0u,
    public var eLfarlc: UShort = 0u,
    public var eOvno: UShort = 0u,
    public var eRes: UShortArray = UShortArray(4),
    public var eOemid: UShort = 0u,
    public var eOeminfo: UShort = 0u,
    public var eRes2: UShortArray = UShortArray(10),
    public var eLfanew: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDosHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDosHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): ImageDosHeader =
                    ImageDosHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (10).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: ImageDosHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.eMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.eCblp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.eCp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.eCrlc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.eCparhdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.eMinalloc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.eMaxalloc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.eSs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.eSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.eCsum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.eIp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.eCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.eLfarlc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.eOvno)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 28L, value.eRes.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.eOemid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.eOeminfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (10).toInt())
                    ).writeNative(addr + 40L, value.eRes2.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.eLfanew)
                }
            }
    }
}

public data class ImageDynamicRelocation32(
    public var symbol: UInt = 0u,
    public var baseRelocSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation32> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageDynamicRelocation32 =
                    ImageDynamicRelocation32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageDynamicRelocation32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.symbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.baseRelocSize)
                }
            }
    }
}

public data class ImageDynamicRelocation32V2(
    public var headerSize: UInt = 0u,
    public var fixupInfoSize: UInt = 0u,
    public var symbol: UInt = 0u,
    public var symbolGroup: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation32V2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation32V2> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageDynamicRelocation32V2 =
                    ImageDynamicRelocation32V2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ImageDynamicRelocation32V2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.headerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fixupInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.symbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.symbolGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class ImageDynamicRelocation64(
    public var symbol: ULong = 0uL,
    public var baseRelocSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation64> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ImageDynamicRelocation64 =
                    ImageDynamicRelocation64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ImageDynamicRelocation64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.symbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.baseRelocSize)
                }
            }
    }
}

public data class ImageDynamicRelocation64V2(
    public var headerSize: UInt = 0u,
    public var fixupInfoSize: UInt = 0u,
    public var symbol: ULong = 0uL,
    public var symbolGroup: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation64V2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocation64V2> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ImageDynamicRelocation64V2 =
                    ImageDynamicRelocation64V2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: ImageDynamicRelocation64V2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.headerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fixupInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.symbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.symbolGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                }
            }
    }
}

public data class ImageDynamicRelocationTable(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocationTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDynamicRelocationTable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageDynamicRelocationTable =
                    ImageDynamicRelocationTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageDynamicRelocationTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class ImageEpilogueDynamicRelocationHeader(
    public var epilogueCount: UInt = 0u,
    public var epilogueByteCount: UByte = 0u,
    public var branchDescriptorElementSize: UByte = 0u,
    public var branchDescriptorCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageEpilogueDynamicRelocationHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageEpilogueDynamicRelocationHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageEpilogueDynamicRelocationHeader =
                    ImageEpilogueDynamicRelocationHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ImageEpilogueDynamicRelocationHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.epilogueCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.epilogueByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.branchDescriptorElementSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.branchDescriptorCount)
                }
            }
    }
}

public data class ImageExportDirectory(
    public var characteristics: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var name: UInt = 0u,
    public var base: UInt = 0u,
    public var numberOfFunctions: UInt = 0u,
    public var numberOfNames: UInt = 0u,
    public var addressOfFunctions: UInt = 0u,
    public var addressOfNames: UInt = 0u,
    public var addressOfNameOrdinals: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageExportDirectory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageExportDirectory> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ImageExportDirectory =
                    ImageExportDirectory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: ImageExportDirectory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.characteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numberOfFunctions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberOfNames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.addressOfFunctions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.addressOfNames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.addressOfNameOrdinals)
                }
            }
    }
}

public data class ImageFunctionOverrideDynamicRelocation(
    public var originalRva: UInt = 0u,
    public var bDDOffset: UInt = 0u,
    public var rvaSize: UInt = 0u,
    public var baseRelocSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFunctionOverrideDynamicRelocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFunctionOverrideDynamicRelocation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ImageFunctionOverrideDynamicRelocation =
                    ImageFunctionOverrideDynamicRelocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ImageFunctionOverrideDynamicRelocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.originalRva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bDDOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rvaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.baseRelocSize)
                }
            }
    }
}

public data class ImageFunctionOverrideHeader(
    public var funcOverrideSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFunctionOverrideHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFunctionOverrideHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageFunctionOverrideHeader =
                    ImageFunctionOverrideHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageFunctionOverrideHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.funcOverrideSize)
                }
            }
    }
}

public data class ImageHotPatchBase(
    public var sequenceNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var originalTimeDateStamp: UInt = 0u,
    public var originalCheckSum: UInt = 0u,
    public var codeIntegrityInfo: UInt = 0u,
    public var codeIntegritySize: UInt = 0u,
    public var patchTable: UInt = 0u,
    public var bufferOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageHotPatchBase> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageHotPatchBase> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ImageHotPatchBase =
                    ImageHotPatchBase(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: ImageHotPatchBase) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sequenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.originalTimeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.originalCheckSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.codeIntegrityInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.codeIntegritySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.patchTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.bufferOffset)
                }
            }
    }
}

public data class ImageHotPatchHashes(
    public var sha256: UByteArray = UByteArray(32),
    public var sha1: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageHotPatchHashes) return false
        if (!this.sha256.contentEquals(other.sha256)) return false
        if (!this.sha1.contentEquals(other.sha1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sha256.contentHashCode()
        result = 31 * result + this.sha1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageHotPatchHashes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageHotPatchHashes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): ImageHotPatchHashes =
                    ImageHotPatchHashes(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageHotPatchHashes) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr, value.sha256.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 32L, value.sha1.toList())
                }
            }
    }
}

public data class ImageHotPatchInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var sequenceNumber: UInt = 0u,
    public var baseImageList: UInt = 0u,
    public var baseImageCount: UInt = 0u,
    public var bufferOffset: UInt = 0u,
    public var extraPatchSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageHotPatchInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageHotPatchInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): ImageHotPatchInfo =
                    ImageHotPatchInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ImageHotPatchInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sequenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.baseImageList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.baseImageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.extraPatchSize)
                }
            }
    }
}

public data class ImageImportByName(
    public var hint: UShort = 0u,
    public var name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageImportByName) return false
        if (this.hint != other.hint) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hint.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageImportByName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageImportByName> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageImportByName =
                    ImageImportByName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 2L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageImportByName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.hint)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 2L, value.name.toList())
                }
            }
    }
}

public data class ImageImportControlTransferDynamicRelocation(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageImportControlTransferDynamicRelocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageImportControlTransferDynamicRelocation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageImportControlTransferDynamicRelocation =
                    ImageImportControlTransferDynamicRelocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageImportControlTransferDynamicRelocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageImportDescriptor(
    public var anonymous: ImageImportDescriptor0 = ImageImportDescriptor0(),
    public var timeDateStamp: UInt = 0u,
    public var forwarderChain: UInt = 0u,
    public var name: UInt = 0u,
    public var firstThunk: UInt = 0u,
)

public data class ImageImportDescriptor0(
    public var characteristics: UInt = 0u,
    public var originalFirstThunk: UInt = 0u,
)

public data class ImageIndirControlTransferDynamicRelocation(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageIndirControlTransferDynamicRelocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageIndirControlTransferDynamicRelocation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ImageIndirControlTransferDynamicRelocation =
                    ImageIndirControlTransferDynamicRelocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageIndirControlTransferDynamicRelocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageLinenumber(
    public var type: ImageLinenumber0 = ImageLinenumber0(),
    public var linenumber: UShort = 0u,
)

public data class ImageLinenumber0(
    public var symbolTableIndex: UInt = 0u,
    public var virtualAddress: UInt = 0u,
)

public class ImageOs2Header(
    public var neMagic: UShort = 0u,
    public var neVer: Byte = 0,
    public var neRev: Byte = 0,
    public var neEnttab: UShort = 0u,
    public var neCbenttab: UShort = 0u,
    public var neCrc: Int = 0,
    public var neFlags: UShort = 0u,
    public var neAutodata: UShort = 0u,
    public var neHeap: UShort = 0u,
    public var neStack: UShort = 0u,
    public var neCsip: Int = 0,
    public var neSssp: Int = 0,
    public var neCseg: UShort = 0u,
    public var neCmod: UShort = 0u,
    public var neCbnrestab: UShort = 0u,
    public var neSegtab: UShort = 0u,
    public var neRsrctab: UShort = 0u,
    public var neRestab: UShort = 0u,
    public var neModtab: UShort = 0u,
    public var neImptab: UShort = 0u,
    public var neNrestab: Int = 0,
    public var neCmovent: UShort = 0u,
    public var neAlign: UShort = 0u,
    public var neCres: UShort = 0u,
    public var neExetyp: UByte = 0u,
    public var neFlagsothers: UByte = 0u,
    public var nePretthunks: UShort = 0u,
    public var nePsegrefbytes: UShort = 0u,
    public var neSwaparea: UShort = 0u,
    public var neExpver: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOs2Header> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOs2Header> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): ImageOs2Header =
                    ImageOs2Header(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 55L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 62L),
                    )
                override fun writeNative(addr: Long, value: ImageOs2Header) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.neMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 2L, value.neVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 3L, value.neRev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.neEnttab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.neCbenttab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.neCrc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.neFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.neAutodata)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.neHeap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.neStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.neCsip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.neSssp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.neCseg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.neCmod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.neCbnrestab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.neSegtab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.neRsrctab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.neRestab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.neModtab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.neImptab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.neNrestab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.neCmovent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.neAlign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.neCres)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 54L, value.neExetyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 55L, value.neFlagsothers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.nePretthunks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.nePsegrefbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.neSwaparea)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 62L, value.neExpver)
                }
            }
    }
}

public data class ImagePolicyEntry(
    public var type: ImagePolicyEntryType = 0,
    public var policyId: ImagePolicyId = 0,
    public var u: ImagePolicyEntry0 = ImagePolicyEntry0(),
)

public class ImagePolicyEntry0 internal constructor(
    noneCtorArg: ConstPtr<CVoid>,
    public var boolValue: Boolean,
    public var int8Value: Byte,
    public var uInt8Value: UByte,
    public var int16Value: Short,
    public var uInt16Value: UShort,
    public var int32Value: Int,
    public var uInt32Value: UInt,
    public var int64Value: Long,
    public var uInt64Value: ULong,
    ansiStringValueCtorArg: Pcstr,
    unicodeStringValueCtorArg: Pcwstr,
) {
    public var none: ConstPtr<CVoid> = noneCtorArg
        internal set

    public var ansiStringValue: Pcstr = ansiStringValueCtorArg
        internal set

    public var unicodeStringValue: Pcwstr = unicodeStringValueCtorArg
        internal set

    public constructor() : this(
        noneCtorArg = ConstPtr(0L),
        boolValue = false,
        int8Value = 0,
        uInt8Value = 0u,
        int16Value = 0,
        uInt16Value = 0u,
        int32Value = 0,
        uInt32Value = 0u,
        int64Value = 0L,
        uInt64Value = 0uL,
        ansiStringValueCtorArg = ConstPtr(0L),
        unicodeStringValueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<CVoid> = this.none

    public operator fun component2(): Boolean = this.boolValue

    public operator fun component3(): Byte = this.int8Value

    public operator fun component4(): UByte = this.uInt8Value

    public operator fun component5(): Short = this.int16Value

    public operator fun component6(): UShort = this.uInt16Value

    public operator fun component7(): Int = this.int32Value

    public operator fun component8(): UInt = this.uInt32Value

    public operator fun component9(): Long = this.int64Value

    public operator fun component10(): ULong = this.uInt64Value

    public operator fun component11(): Pcstr = this.ansiStringValue

    public operator fun component12(): Pcwstr = this.unicodeStringValue

    public fun copy(none: ConstPtr<CVoid> = this.none, boolValue: Boolean = this.boolValue, int8Value: Byte = this.int8Value, uInt8Value: UByte = this.uInt8Value, int16Value: Short = this.int16Value, uInt16Value: UShort = this.uInt16Value, int32Value: Int = this.int32Value, uInt32Value: UInt = this.uInt32Value, int64Value: Long = this.int64Value, uInt64Value: ULong = this.uInt64Value, ansiStringValue: Pcstr = this.ansiStringValue, unicodeStringValue: Pcwstr = this.unicodeStringValue): ImagePolicyEntry0 = ImagePolicyEntry0(noneCtorArg = none, boolValue = boolValue, int8Value = int8Value, uInt8Value = uInt8Value, int16Value = int16Value, uInt16Value = uInt16Value, int32Value = int32Value, uInt32Value = uInt32Value, int64Value = int64Value, uInt64Value = uInt64Value, ansiStringValueCtorArg = ansiStringValue, unicodeStringValueCtorArg = unicodeStringValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagePolicyEntry0) return false
        if (this.none != other.none) return false
        if (this.boolValue != other.boolValue) return false
        if (this.int8Value != other.int8Value) return false
        if (this.uInt8Value != other.uInt8Value) return false
        if (this.int16Value != other.int16Value) return false
        if (this.uInt16Value != other.uInt16Value) return false
        if (this.int32Value != other.int32Value) return false
        if (this.uInt32Value != other.uInt32Value) return false
        if (this.int64Value != other.int64Value) return false
        if (this.uInt64Value != other.uInt64Value) return false
        if (this.ansiStringValue != other.ansiStringValue) return false
        if (this.unicodeStringValue != other.unicodeStringValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.none.hashCode()
        result = 31 * result + this.boolValue.hashCode()
        result = 31 * result + this.int8Value.hashCode()
        result = 31 * result + this.uInt8Value.hashCode()
        result = 31 * result + this.int16Value.hashCode()
        result = 31 * result + this.uInt16Value.hashCode()
        result = 31 * result + this.int32Value.hashCode()
        result = 31 * result + this.uInt32Value.hashCode()
        result = 31 * result + this.int64Value.hashCode()
        result = 31 * result + this.uInt64Value.hashCode()
        result = 31 * result + this.ansiStringValue.hashCode()
        result = 31 * result + this.unicodeStringValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            none: ConstPtr<CVoid> = ConstPtr(0L),
            boolValue: Boolean = false,
            int8Value: Byte = 0,
            uInt8Value: UByte = 0u,
            int16Value: Short = 0,
            uInt16Value: UShort = 0u,
            int32Value: Int = 0,
            uInt32Value: UInt = 0u,
            int64Value: Long = 0L,
            uInt64Value: ULong = 0uL,
            ansiStringValue: Pcstr = ConstPtr(0L),
            unicodeStringValue: Pcwstr = ConstPtr(0L),
        ): ImagePolicyEntry0 =
            ImagePolicyEntry0(
                noneCtorArg = none,
                boolValue = boolValue,
                int8Value = int8Value,
                uInt8Value = uInt8Value,
                int16Value = int16Value,
                uInt16Value = uInt16Value,
                int32Value = int32Value,
                uInt32Value = uInt32Value,
                int64Value = int64Value,
                uInt64Value = uInt64Value,
                ansiStringValueCtorArg = ansiStringValue,
                unicodeStringValueCtorArg = unicodeStringValue,
            )
    }
}

public data class ImagePolicyMetadata(
    public var version: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(7),
    public var applicationId: ULong = 0uL,
    public var policies: List<ImagePolicyEntry> = List(1) { ImagePolicyEntry() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagePolicyMetadata) return false
        if (this.version != other.version) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.applicationId != other.applicationId) return false
        if (this.policies != other.policies) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.applicationId.hashCode()
        result = 31 * result + this.policies.hashCode()
        return result
    }
}

public data class ImagePrologueDynamicRelocationHeader(
    public var prologueByteCount: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagePrologueDynamicRelocationHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagePrologueDynamicRelocationHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ImagePrologueDynamicRelocationHeader =
                    ImagePrologueDynamicRelocationHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImagePrologueDynamicRelocationHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.prologueByteCount)
                }
            }
    }
}

public data class ImageRelocation(
    public var anonymous: ImageRelocation0 = ImageRelocation0(),
    public var symbolTableIndex: UInt = 0u,
    public var type: UShort = 0u,
)

public data class ImageRelocation0(
    public var virtualAddress: UInt = 0u,
    public var relocCount: UInt = 0u,
)

public data class ImageResourceDataEntry(
    public var offsetToData: UInt = 0u,
    public var size: UInt = 0u,
    public var codePage: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDataEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDataEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ImageResourceDataEntry =
                    ImageResourceDataEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ImageResourceDataEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offsetToData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.codePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class ImageResourceDirectory(
    public var characteristics: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var numberOfNamedEntries: UShort = 0u,
    public var numberOfIdEntries: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectory> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ImageResourceDirectory =
                    ImageResourceDirectory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: ImageResourceDirectory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.characteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.numberOfNamedEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.numberOfIdEntries)
                }
            }
    }
}

public data class ImageResourceDirectoryEntry(
    public var anonymous1: ImageResourceDirectoryEntry0 = ImageResourceDirectoryEntry0(),
    public var anonymous2: ImageResourceDirectoryEntry1 = ImageResourceDirectoryEntry1(),
)

public data class ImageResourceDirectoryEntry0(
    public var anonymous: ImageResourceDirectoryEntry00 = ImageResourceDirectoryEntry00(),
    public var name: UInt = 0u,
    public var id: UShort = 0u,
)

public data class ImageResourceDirectoryEntry00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectoryEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectoryEntry00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageResourceDirectoryEntry00 =
                    ImageResourceDirectoryEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageResourceDirectoryEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageResourceDirectoryEntry1(
    public var offsetToData: UInt = 0u,
    public var anonymous: ImageResourceDirectoryEntry10 = ImageResourceDirectoryEntry10(),
)

public data class ImageResourceDirectoryEntry10(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectoryEntry10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectoryEntry10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageResourceDirectoryEntry10 =
                    ImageResourceDirectoryEntry10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageResourceDirectoryEntry10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageResourceDirectoryString(
    public var length: UShort = 0u,
    public var nameString: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageResourceDirectoryString) return false
        if (this.length != other.length) return false
        if (!this.nameString.contentEquals(other.nameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.nameString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectoryString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirectoryString> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageResourceDirectoryString =
                    ImageResourceDirectoryString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 2L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImageResourceDirectoryString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 2L, value.nameString.toList())
                }
            }
    }
}

public data class ImageResourceDirStringU(
    public var length: UShort = 0u,
    public var nameString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageResourceDirStringU) return false
        if (this.length != other.length) return false
        if (!this.nameString.contentEquals(other.nameString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.nameString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirStringU> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageResourceDirStringU> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageResourceDirStringU =
                    ImageResourceDirStringU(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ImageResourceDirStringU) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.nameString.toList())
                }
            }
    }
}

public data class ImageSeparateDebugHeader(
    public var signature: UShort = 0u,
    public var flags: UShort = 0u,
    public var machine: UShort = 0u,
    public var characteristics: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var imageBase: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var numberOfSections: UInt = 0u,
    public var exportedNamesSize: UInt = 0u,
    public var debugDirectorySize: UInt = 0u,
    public var sectionAlignment: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSeparateDebugHeader) return false
        if (this.signature != other.signature) return false
        if (this.flags != other.flags) return false
        if (this.machine != other.machine) return false
        if (this.characteristics != other.characteristics) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (this.checkSum != other.checkSum) return false
        if (this.imageBase != other.imageBase) return false
        if (this.sizeOfImage != other.sizeOfImage) return false
        if (this.numberOfSections != other.numberOfSections) return false
        if (this.exportedNamesSize != other.exportedNamesSize) return false
        if (this.debugDirectorySize != other.debugDirectorySize) return false
        if (this.sectionAlignment != other.sectionAlignment) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.machine.hashCode()
        result = 31 * result + this.characteristics.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.imageBase.hashCode()
        result = 31 * result + this.sizeOfImage.hashCode()
        result = 31 * result + this.numberOfSections.hashCode()
        result = 31 * result + this.exportedNamesSize.hashCode()
        result = 31 * result + this.debugDirectorySize.hashCode()
        result = 31 * result + this.sectionAlignment.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSeparateDebugHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSeparateDebugHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): ImageSeparateDebugHeader =
                    ImageSeparateDebugHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 40L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: ImageSeparateDebugHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.machine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.characteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.checkSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.imageBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sizeOfImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberOfSections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.exportedNamesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.debugDirectorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.sectionAlignment)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 40L, value.reserved.toList())
                }
            }
    }
}

public data class ImageSwitchtableBranchDynamicRelocation(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSwitchtableBranchDynamicRelocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSwitchtableBranchDynamicRelocation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ImageSwitchtableBranchDynamicRelocation =
                    ImageSwitchtableBranchDynamicRelocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageSwitchtableBranchDynamicRelocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageSymbol(
    public var n: ImageSymbol0 = ImageSymbol0(),
    public var value: UInt = 0u,
    public var sectionNumber: Short = 0,
    public var type: UShort = 0u,
    public var storageClass: UByte = 0u,
    public var numberOfAuxSymbols: UByte = 0u,
)

public data class ImageSymbol0(
    public var shortName: UByteArray = UByteArray(8),
    public var name: ImageSymbol00 = ImageSymbol00(),
    public var longName: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSymbol0) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (this.name != other.name) return false
        if (!this.longName.contentEquals(other.longName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shortName.contentHashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.longName.contentHashCode()
        return result
    }
}

public data class ImageSymbol00(
    public var short: UInt = 0u,
    public var long: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSymbol00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSymbol00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageSymbol00 =
                    ImageSymbol00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageSymbol00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.short)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.long)
                }
            }
    }
}

public data class ImageSymbolEx(
    public var n: ImageSymbolEx0 = ImageSymbolEx0(),
    public var value: UInt = 0u,
    public var sectionNumber: Int = 0,
    public var type: UShort = 0u,
    public var storageClass: UByte = 0u,
    public var numberOfAuxSymbols: UByte = 0u,
)

public data class ImageSymbolEx0(
    public var shortName: UByteArray = UByteArray(8),
    public var name: ImageSymbolEx00 = ImageSymbolEx00(),
    public var longName: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSymbolEx0) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (this.name != other.name) return false
        if (!this.longName.contentEquals(other.longName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shortName.contentHashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.longName.contentHashCode()
        return result
    }
}

public data class ImageSymbolEx00(
    public var short: UInt = 0u,
    public var long: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSymbolEx00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageSymbolEx00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageSymbolEx00 =
                    ImageSymbolEx00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageSymbolEx00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.short)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.long)
                }
            }
    }
}

public data class ImageTlsDirectory32(
    public var startAddressOfRawData: UInt = 0u,
    public var endAddressOfRawData: UInt = 0u,
    public var addressOfIndex: UInt = 0u,
    public var addressOfCallBacks: UInt = 0u,
    public var sizeOfZeroFill: UInt = 0u,
    public var anonymous: ImageTlsDirectory320 = ImageTlsDirectory320(),
)

public data class ImageTlsDirectory320(
    public var characteristics: UInt = 0u,
    public var anonymous: ImageTlsDirectory3200 = ImageTlsDirectory3200(),
)

public data class ImageTlsDirectory3200(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageTlsDirectory3200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageTlsDirectory3200> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageTlsDirectory3200 =
                    ImageTlsDirectory3200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageTlsDirectory3200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageTlsDirectory64(
    public var startAddressOfRawData: ULong = 0uL,
    public var endAddressOfRawData: ULong = 0uL,
    public var addressOfIndex: ULong = 0uL,
    public var addressOfCallBacks: ULong = 0uL,
    public var sizeOfZeroFill: UInt = 0u,
    public var anonymous: ImageTlsDirectory640 = ImageTlsDirectory640(),
)

public data class ImageTlsDirectory640(
    public var characteristics: UInt = 0u,
    public var anonymous: ImageTlsDirectory6400 = ImageTlsDirectory6400(),
)

public data class ImageTlsDirectory6400(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageTlsDirectory6400> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageTlsDirectory6400> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageTlsDirectory6400 =
                    ImageTlsDirectory6400(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageTlsDirectory6400) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class ImageVxdHeader(
    public var e32Magic: UShort = 0u,
    public var e32Border: UByte = 0u,
    public var e32Worder: UByte = 0u,
    public var e32Level: UInt = 0u,
    public var e32Cpu: UShort = 0u,
    public var e32Os: UShort = 0u,
    public var e32Ver: UInt = 0u,
    public var e32Mflags: UInt = 0u,
    public var e32Mpages: UInt = 0u,
    public var e32Startobj: UInt = 0u,
    public var e32Eip: UInt = 0u,
    public var e32Stackobj: UInt = 0u,
    public var e32Esp: UInt = 0u,
    public var e32Pagesize: UInt = 0u,
    public var e32Lastpagesize: UInt = 0u,
    public var e32Fixupsize: UInt = 0u,
    public var e32Fixupsum: UInt = 0u,
    public var e32Ldrsize: UInt = 0u,
    public var e32Ldrsum: UInt = 0u,
    public var e32Objtab: UInt = 0u,
    public var e32Objcnt: UInt = 0u,
    public var e32Objmap: UInt = 0u,
    public var e32Itermap: UInt = 0u,
    public var e32Rsrctab: UInt = 0u,
    public var e32Rsrccnt: UInt = 0u,
    public var e32Restab: UInt = 0u,
    public var e32Enttab: UInt = 0u,
    public var e32Dirtab: UInt = 0u,
    public var e32Dircnt: UInt = 0u,
    public var e32Fpagetab: UInt = 0u,
    public var e32Frectab: UInt = 0u,
    public var e32Impmod: UInt = 0u,
    public var e32Impmodcnt: UInt = 0u,
    public var e32Impproc: UInt = 0u,
    public var e32Pagesum: UInt = 0u,
    public var e32Datapage: UInt = 0u,
    public var e32Preload: UInt = 0u,
    public var e32Nrestab: UInt = 0u,
    public var e32Cbnrestab: UInt = 0u,
    public var e32Nressum: UInt = 0u,
    public var e32Autodata: UInt = 0u,
    public var e32Debuginfo: UInt = 0u,
    public var e32Debuglen: UInt = 0u,
    public var e32Instpreload: UInt = 0u,
    public var e32Instdemand: UInt = 0u,
    public var e32Heapsize: UInt = 0u,
    public var e32Res3: UByteArray = UByteArray(12),
    public var e32Winresoff: UInt = 0u,
    public var e32Winreslen: UInt = 0u,
    public var e32Devid: UShort = 0u,
    public var e32Ddkver: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageVxdHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageVxdHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 196L
                override fun readNative(addr: Long): ImageVxdHeader =
                    ImageVxdHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 172L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 194L),
                    )
                override fun writeNative(addr: Long, value: ImageVxdHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.e32Magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.e32Border)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.e32Worder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.e32Level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.e32Cpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.e32Os)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.e32Ver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.e32Mflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.e32Mpages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.e32Startobj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.e32Eip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.e32Stackobj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.e32Esp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.e32Pagesize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.e32Lastpagesize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.e32Fixupsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.e32Fixupsum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.e32Ldrsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.e32Ldrsum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.e32Objtab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.e32Objcnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.e32Objmap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.e32Itermap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.e32Rsrctab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.e32Rsrccnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.e32Restab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.e32Enttab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.e32Dirtab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.e32Dircnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.e32Fpagetab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.e32Frectab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.e32Impmod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.e32Impmodcnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.e32Impproc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.e32Pagesum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.e32Datapage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.e32Preload)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.e32Nrestab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.e32Cbnrestab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.e32Nressum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.e32Autodata)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.e32Debuginfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.e32Debuglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.e32Instpreload)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.e32Instdemand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.e32Heapsize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 172L, value.e32Res3.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.e32Winresoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.e32Winreslen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 192L, value.e32Devid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 194L, value.e32Ddkver)
                }
            }
    }
}

public data class ImportObjectHeader(
    public var sig1: UShort = 0u,
    public var sig2: UShort = 0u,
    public var version: UShort = 0u,
    public var machine: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var sizeOfData: UInt = 0u,
    public var anonymous: ImportObjectHeader0 = ImportObjectHeader0(),
    public var bitfield: UShort = 0u,
)

public data class ImportObjectHeader0(
    public var ordinal: UShort = 0u,
    public var hint: UShort = 0u,
)

public data class KernelCetContext(
    public var ssp: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var segCs: UShort = 0u,
    public var anonymous: KernelCetContext0 = KernelCetContext0(),
    public var fill: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KernelCetContext) return false
        if (this.ssp != other.ssp) return false
        if (this.rip != other.rip) return false
        if (this.segCs != other.segCs) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.fill.contentEquals(other.fill)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssp.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.segCs.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.fill.contentHashCode()
        return result
    }
}

public data class KernelCetContext0(
    public var allFlags: UShort = 0u,
    public var anonymous: KernelCetContext00 = KernelCetContext00(),
)

public data class KernelCetContext00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KernelCetContext00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KernelCetContext00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): KernelCetContext00 =
                    KernelCetContext00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KernelCetContext00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KtmobjectCursor(
    public var lastQuery: Guid = Guid(),
    public var objectIdCount: UInt = 0u,
    public var objectIds: List<Guid> = List(1) { Guid() },
)

public data class MaxversiontestedInfo(
    public var maxVersionTested: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxversiontestedInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxversiontestedInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MaxversiontestedInfo =
                    MaxversiontestedInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MaxversiontestedInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.maxVersionTested)
                }
            }
    }
}

public data class NetworkAppInstanceEa(
    public var appInstanceID: Guid = Guid(),
    public var csvFlags: UInt = 0u,
)

public data class NonPagedDebugInfo(
    public var signature: UShort = 0u,
    public var flags: UShort = 0u,
    public var size: UInt = 0u,
    public var machine: UShort = 0u,
    public var characteristics: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var imageBase: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NonPagedDebugInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NonPagedDebugInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): NonPagedDebugInfo =
                    NonPagedDebugInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NonPagedDebugInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.machine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.characteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.checkSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sizeOfImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.imageBase)
                }
            }
    }
}

public data class NotifyUserPowerSetting(
    public var guid: Guid = Guid(),
)

public data class NtTib32(
    public var exceptionList: UInt = 0u,
    public var stackBase: UInt = 0u,
    public var stackLimit: UInt = 0u,
    public var subSystemTib: UInt = 0u,
    public var anonymous: NtTib320 = NtTib320(),
    public var arbitraryUserPointer: UInt = 0u,
    public var selfRef: UInt = 0u,
)

public data class NtTib320(
    public var fiberData: UInt = 0u,
    public var version: UInt = 0u,
)

public data class NtTib64(
    public var exceptionList: ULong = 0uL,
    public var stackBase: ULong = 0uL,
    public var stackLimit: ULong = 0uL,
    public var subSystemTib: ULong = 0uL,
    public var anonymous: NtTib640 = NtTib640(),
    public var arbitraryUserPointer: ULong = 0uL,
    public var selfRef: ULong = 0uL,
)

public data class NtTib640(
    public var fiberData: ULong = 0uL,
    public var version: UInt = 0u,
)

public data class Packedeventinfo(
    public var ulSize: UInt = 0u,
    public var ulNumEventsForLogFile: UInt = 0u,
    public var ulOffsets: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Packedeventinfo) return false
        if (this.ulSize != other.ulSize) return false
        if (this.ulNumEventsForLogFile != other.ulNumEventsForLogFile) return false
        if (!this.ulOffsets.contentEquals(other.ulOffsets)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulSize.hashCode()
        result = 31 * result + this.ulNumEventsForLogFile.hashCode()
        result = 31 * result + this.ulOffsets.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Packedeventinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Packedeventinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Packedeventinfo =
                    Packedeventinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Packedeventinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulNumEventsForLogFile)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.ulOffsets.toList())
                }
            }
    }
}

public data class ProcessorIdlestateInfo(
    public var timeCheck: UInt = 0u,
    public var demotePercent: UByte = 0u,
    public var promotePercent: UByte = 0u,
    public var spare: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorIdlestateInfo) return false
        if (this.timeCheck != other.timeCheck) return false
        if (this.demotePercent != other.demotePercent) return false
        if (this.promotePercent != other.promotePercent) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeCheck.hashCode()
        result = 31 * result + this.demotePercent.hashCode()
        result = 31 * result + this.promotePercent.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorIdlestateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorIdlestateInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ProcessorIdlestateInfo =
                    ProcessorIdlestateInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ProcessorIdlestateInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeCheck)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.demotePercent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.promotePercent)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.spare.toList())
                }
            }
    }
}

public data class ProcessorIdlestatePolicy(
    public var revision: UShort = 0u,
    public var flags: ProcessorIdlestatePolicy0 = ProcessorIdlestatePolicy0(),
    public var policyCount: UInt = 0u,
    public var policy: List<ProcessorIdlestateInfo> = List(3) { ProcessorIdlestateInfo() },
)

public data class ProcessorIdlestatePolicy0(
    public var asWORD: UShort = 0u,
    public var anonymous: ProcessorIdlestatePolicy00 = ProcessorIdlestatePolicy00(),
)

public data class ProcessorIdlestatePolicy00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorIdlestatePolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorIdlestatePolicy00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ProcessorIdlestatePolicy00 =
                    ProcessorIdlestatePolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessorIdlestatePolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessorPerfstatePolicy(
    public var revision: UInt = 0u,
    public var maxThrottle: UByte = 0u,
    public var minThrottle: UByte = 0u,
    public var busyAdjThreshold: UByte = 0u,
    public var anonymous: ProcessorPerfstatePolicy0 = ProcessorPerfstatePolicy0(),
    public var timeCheck: UInt = 0u,
    public var increaseTime: UInt = 0u,
    public var decreaseTime: UInt = 0u,
    public var increasePercent: UInt = 0u,
    public var decreasePercent: UInt = 0u,
)

public data class ProcessorPerfstatePolicy0(
    public var spare: UByte = 0u,
    public var flags: ProcessorPerfstatePolicy00 = ProcessorPerfstatePolicy00(),
)

public data class ProcessorPerfstatePolicy00(
    public var asBYTE: UByte = 0u,
    public var anonymous: ProcessorPerfstatePolicy000 = ProcessorPerfstatePolicy000(),
)

public data class ProcessorPerfstatePolicy000(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPerfstatePolicy000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPerfstatePolicy000> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ProcessorPerfstatePolicy000 =
                    ProcessorPerfstatePolicy000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessorPerfstatePolicy000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationActivationContextTrustPolicy(
    public var anonymous: ProcessMitigationActivationContextTrustPolicy0 = ProcessMitigationActivationContextTrustPolicy0(),
)

public data class ProcessMitigationActivationContextTrustPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationActivationContextTrustPolicy00 = ProcessMitigationActivationContextTrustPolicy00(),
)

public data class ProcessMitigationActivationContextTrustPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationActivationContextTrustPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationActivationContextTrustPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationActivationContextTrustPolicy00 =
                    ProcessMitigationActivationContextTrustPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationActivationContextTrustPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationAslrPolicy(
    public var anonymous: ProcessMitigationAslrPolicy0 = ProcessMitigationAslrPolicy0(),
)

public data class ProcessMitigationAslrPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationAslrPolicy00 = ProcessMitigationAslrPolicy00(),
)

public data class ProcessMitigationAslrPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationAslrPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationAslrPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationAslrPolicy00 =
                    ProcessMitigationAslrPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationAslrPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationBinarySignaturePolicy(
    public var anonymous: ProcessMitigationBinarySignaturePolicy0 = ProcessMitigationBinarySignaturePolicy0(),
)

public data class ProcessMitigationBinarySignaturePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationBinarySignaturePolicy00 = ProcessMitigationBinarySignaturePolicy00(),
)

public data class ProcessMitigationBinarySignaturePolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationBinarySignaturePolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationBinarySignaturePolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationBinarySignaturePolicy00 =
                    ProcessMitigationBinarySignaturePolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationBinarySignaturePolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationChildProcessPolicy(
    public var anonymous: ProcessMitigationChildProcessPolicy0 = ProcessMitigationChildProcessPolicy0(),
)

public data class ProcessMitigationChildProcessPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationChildProcessPolicy00 = ProcessMitigationChildProcessPolicy00(),
)

public data class ProcessMitigationChildProcessPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationChildProcessPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationChildProcessPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationChildProcessPolicy00 =
                    ProcessMitigationChildProcessPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationChildProcessPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationControlFlowGuardPolicy(
    public var anonymous: ProcessMitigationControlFlowGuardPolicy0 = ProcessMitigationControlFlowGuardPolicy0(),
)

public data class ProcessMitigationControlFlowGuardPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationControlFlowGuardPolicy00 = ProcessMitigationControlFlowGuardPolicy00(),
)

public data class ProcessMitigationControlFlowGuardPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationControlFlowGuardPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationControlFlowGuardPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationControlFlowGuardPolicy00 =
                    ProcessMitigationControlFlowGuardPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationControlFlowGuardPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationDepPolicy(
    public var anonymous: ProcessMitigationDepPolicy0 = ProcessMitigationDepPolicy0(),
    public var permanent: Boolean = false,
)

public data class ProcessMitigationDepPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationDepPolicy00 = ProcessMitigationDepPolicy00(),
)

public data class ProcessMitigationDepPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationDepPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationDepPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationDepPolicy00 =
                    ProcessMitigationDepPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationDepPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationDynamicCodePolicy(
    public var anonymous: ProcessMitigationDynamicCodePolicy0 = ProcessMitigationDynamicCodePolicy0(),
)

public data class ProcessMitigationDynamicCodePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationDynamicCodePolicy00 = ProcessMitigationDynamicCodePolicy00(),
)

public data class ProcessMitigationDynamicCodePolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationDynamicCodePolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationDynamicCodePolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationDynamicCodePolicy00 =
                    ProcessMitigationDynamicCodePolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationDynamicCodePolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationExtensionPointDisablePolicy(
    public var anonymous: ProcessMitigationExtensionPointDisablePolicy0 = ProcessMitigationExtensionPointDisablePolicy0(),
)

public data class ProcessMitigationExtensionPointDisablePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationExtensionPointDisablePolicy00 = ProcessMitigationExtensionPointDisablePolicy00(),
)

public data class ProcessMitigationExtensionPointDisablePolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationExtensionPointDisablePolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationExtensionPointDisablePolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationExtensionPointDisablePolicy00 =
                    ProcessMitigationExtensionPointDisablePolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationExtensionPointDisablePolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationFontDisablePolicy(
    public var anonymous: ProcessMitigationFontDisablePolicy0 = ProcessMitigationFontDisablePolicy0(),
)

public data class ProcessMitigationFontDisablePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationFontDisablePolicy00 = ProcessMitigationFontDisablePolicy00(),
)

public data class ProcessMitigationFontDisablePolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationFontDisablePolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationFontDisablePolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationFontDisablePolicy00 =
                    ProcessMitigationFontDisablePolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationFontDisablePolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationImageLoadPolicy(
    public var anonymous: ProcessMitigationImageLoadPolicy0 = ProcessMitigationImageLoadPolicy0(),
)

public data class ProcessMitigationImageLoadPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationImageLoadPolicy00 = ProcessMitigationImageLoadPolicy00(),
)

public data class ProcessMitigationImageLoadPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationImageLoadPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationImageLoadPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationImageLoadPolicy00 =
                    ProcessMitigationImageLoadPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationImageLoadPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationPayloadRestrictionPolicy(
    public var anonymous: ProcessMitigationPayloadRestrictionPolicy0 = ProcessMitigationPayloadRestrictionPolicy0(),
)

public data class ProcessMitigationPayloadRestrictionPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationPayloadRestrictionPolicy00 = ProcessMitigationPayloadRestrictionPolicy00(),
)

public data class ProcessMitigationPayloadRestrictionPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationPayloadRestrictionPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationPayloadRestrictionPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationPayloadRestrictionPolicy00 =
                    ProcessMitigationPayloadRestrictionPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationPayloadRestrictionPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationRedirectionTrustPolicy(
    public var anonymous: ProcessMitigationRedirectionTrustPolicy0 = ProcessMitigationRedirectionTrustPolicy0(),
)

public data class ProcessMitigationRedirectionTrustPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationRedirectionTrustPolicy00 = ProcessMitigationRedirectionTrustPolicy00(),
)

public data class ProcessMitigationRedirectionTrustPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationRedirectionTrustPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationRedirectionTrustPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationRedirectionTrustPolicy00 =
                    ProcessMitigationRedirectionTrustPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationRedirectionTrustPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationSehopPolicy(
    public var anonymous: ProcessMitigationSehopPolicy0 = ProcessMitigationSehopPolicy0(),
)

public data class ProcessMitigationSehopPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSehopPolicy00 = ProcessMitigationSehopPolicy00(),
)

public data class ProcessMitigationSehopPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSehopPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSehopPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationSehopPolicy00 =
                    ProcessMitigationSehopPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationSehopPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationSideChannelIsolationPolicy(
    public var anonymous: ProcessMitigationSideChannelIsolationPolicy0 = ProcessMitigationSideChannelIsolationPolicy0(),
)

public data class ProcessMitigationSideChannelIsolationPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSideChannelIsolationPolicy00 = ProcessMitigationSideChannelIsolationPolicy00(),
)

public data class ProcessMitigationSideChannelIsolationPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSideChannelIsolationPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSideChannelIsolationPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationSideChannelIsolationPolicy00 =
                    ProcessMitigationSideChannelIsolationPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationSideChannelIsolationPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationStrictHandleCheckPolicy(
    public var anonymous: ProcessMitigationStrictHandleCheckPolicy0 = ProcessMitigationStrictHandleCheckPolicy0(),
)

public data class ProcessMitigationStrictHandleCheckPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationStrictHandleCheckPolicy00 = ProcessMitigationStrictHandleCheckPolicy00(),
)

public data class ProcessMitigationStrictHandleCheckPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationStrictHandleCheckPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationStrictHandleCheckPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationStrictHandleCheckPolicy00 =
                    ProcessMitigationStrictHandleCheckPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationStrictHandleCheckPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationSystemCallDisablePolicy(
    public var anonymous: ProcessMitigationSystemCallDisablePolicy0 = ProcessMitigationSystemCallDisablePolicy0(),
)

public data class ProcessMitigationSystemCallDisablePolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSystemCallDisablePolicy00 = ProcessMitigationSystemCallDisablePolicy00(),
)

public data class ProcessMitigationSystemCallDisablePolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSystemCallDisablePolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSystemCallDisablePolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationSystemCallDisablePolicy00 =
                    ProcessMitigationSystemCallDisablePolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationSystemCallDisablePolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationSystemCallFilterPolicy(
    public var anonymous: ProcessMitigationSystemCallFilterPolicy0 = ProcessMitigationSystemCallFilterPolicy0(),
)

public data class ProcessMitigationSystemCallFilterPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationSystemCallFilterPolicy00 = ProcessMitigationSystemCallFilterPolicy00(),
)

public data class ProcessMitigationSystemCallFilterPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSystemCallFilterPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationSystemCallFilterPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationSystemCallFilterPolicy00 =
                    ProcessMitigationSystemCallFilterPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationSystemCallFilterPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationUserPointerAuthPolicy(
    public var anonymous: ProcessMitigationUserPointerAuthPolicy0 = ProcessMitigationUserPointerAuthPolicy0(),
)

public data class ProcessMitigationUserPointerAuthPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationUserPointerAuthPolicy00 = ProcessMitigationUserPointerAuthPolicy00(),
)

public data class ProcessMitigationUserPointerAuthPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationUserPointerAuthPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationUserPointerAuthPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationUserPointerAuthPolicy00 =
                    ProcessMitigationUserPointerAuthPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationUserPointerAuthPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ProcessMitigationUserShadowStackPolicy(
    public var anonymous: ProcessMitigationUserShadowStackPolicy0 = ProcessMitigationUserShadowStackPolicy0(),
)

public data class ProcessMitigationUserShadowStackPolicy0(
    public var flags: UInt = 0u,
    public var anonymous: ProcessMitigationUserShadowStackPolicy00 = ProcessMitigationUserShadowStackPolicy00(),
)

public data class ProcessMitigationUserShadowStackPolicy00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationUserShadowStackPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessMitigationUserShadowStackPolicy00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessMitigationUserShadowStackPolicy00 =
                    ProcessMitigationUserShadowStackPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessMitigationUserShadowStackPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class QuotaLimitsEx(
    public var pagedPoolLimit: Int = 0,
    public var nonPagedPoolLimit: Int = 0,
    public var minimumWorkingSetSize: Int = 0,
    public var maximumWorkingSetSize: Int = 0,
    public var pagefileLimit: Int = 0,
    public var timeLimit: Long = 0L,
    public var workingSetLimit: Int = 0,
    public var reserved2: Int = 0,
    public var reserved3: Int = 0,
    public var reserved4: Int = 0,
    public var flags: UInt = 0u,
    public var cpuRateLimit: RateQuotaLimit = RateQuotaLimit(),
)

public data class RateQuotaLimit(
    public var rateData: UInt = 0u,
    public var anonymous: RateQuotaLimit0 = RateQuotaLimit0(),
)

public data class RateQuotaLimit0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RateQuotaLimit0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RateQuotaLimit0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RateQuotaLimit0 =
                    RateQuotaLimit0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RateQuotaLimit0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class RearrangeFileData internal constructor(
    public var sourceStartingOffset: ULong,
    public var targetOffset: ULong,
    sourceFileHandleCtorArg: Handle,
    public var length: UInt,
    public var flags: UInt,
) {
    public var sourceFileHandle: Handle = sourceFileHandleCtorArg
        internal set

    public constructor() : this(
        sourceStartingOffset = 0uL,
        targetOffset = 0uL,
        sourceFileHandleCtorArg = MutPtr(0L),
        length = 0u,
        flags = 0u,
    )

    public operator fun component1(): ULong = this.sourceStartingOffset

    public operator fun component2(): ULong = this.targetOffset

    public operator fun component3(): Handle = this.sourceFileHandle

    public operator fun component4(): UInt = this.length

    public operator fun component5(): UInt = this.flags

    public fun copy(sourceStartingOffset: ULong = this.sourceStartingOffset, targetOffset: ULong = this.targetOffset, sourceFileHandle: Handle = this.sourceFileHandle, length: UInt = this.length, flags: UInt = this.flags): RearrangeFileData = RearrangeFileData(sourceStartingOffset = sourceStartingOffset, targetOffset = targetOffset, sourceFileHandleCtorArg = sourceFileHandle, length = length, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RearrangeFileData) return false
        if (this.sourceStartingOffset != other.sourceStartingOffset) return false
        if (this.targetOffset != other.targetOffset) return false
        if (this.sourceFileHandle != other.sourceFileHandle) return false
        if (this.length != other.length) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceStartingOffset.hashCode()
        result = 31 * result + this.targetOffset.hashCode()
        result = 31 * result + this.sourceFileHandle.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sourceStartingOffset: ULong = 0uL,
            targetOffset: ULong = 0uL,
            sourceFileHandle: Handle = MutPtr(0L),
            length: UInt = 0u,
            flags: UInt = 0u,
        ): RearrangeFileData =
            RearrangeFileData(
                sourceStartingOffset = sourceStartingOffset,
                targetOffset = targetOffset,
                sourceFileHandleCtorArg = sourceFileHandle,
                length = length,
                flags = flags,
            )
    }
}

public data class RearrangeFileData32(
    public var sourceStartingOffset: ULong = 0uL,
    public var targetOffset: ULong = 0uL,
    public var sourceFileHandle: UInt = 0u,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RearrangeFileData32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RearrangeFileData32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RearrangeFileData32 =
                    RearrangeFileData32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RearrangeFileData32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.sourceStartingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.targetOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sourceFileHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                }
            }
    }
}

public data class RedbookDigitalAudioExtractionInfo(
    public var version: UInt = 0u,
    public var accurate: UInt = 0u,
    public var supported: UInt = 0u,
    public var accurateMask0: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedbookDigitalAudioExtractionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedbookDigitalAudioExtractionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RedbookDigitalAudioExtractionInfo =
                    RedbookDigitalAudioExtractionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RedbookDigitalAudioExtractionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.accurate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.supported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.accurateMask0)
                }
            }
    }
}

public data class ResourcemanagerBasicInformation(
    public var resourceManagerId: Guid = Guid(),
    public var descriptionLength: UInt = 0u,
    public var description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResourcemanagerBasicInformation) return false
        if (this.resourceManagerId != other.resourceManagerId) return false
        if (this.descriptionLength != other.descriptionLength) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceManagerId.hashCode()
        result = 31 * result + this.descriptionLength.hashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }
}

public class ResourcemanagerCompletionInformation internal constructor(
    ioCompletionPortHandleCtorArg: Handle,
    public var completionKey: Int,
) {
    public var ioCompletionPortHandle: Handle = ioCompletionPortHandleCtorArg
        internal set

    public constructor() : this(
        ioCompletionPortHandleCtorArg = MutPtr(0L),
        completionKey = 0,
    )

    public operator fun component1(): Handle = this.ioCompletionPortHandle

    public operator fun component2(): Int = this.completionKey

    public fun copy(ioCompletionPortHandle: Handle = this.ioCompletionPortHandle, completionKey: Int = this.completionKey): ResourcemanagerCompletionInformation = ResourcemanagerCompletionInformation(ioCompletionPortHandleCtorArg = ioCompletionPortHandle, completionKey = completionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResourcemanagerCompletionInformation) return false
        if (this.ioCompletionPortHandle != other.ioCompletionPortHandle) return false
        if (this.completionKey != other.completionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ioCompletionPortHandle.hashCode()
        result = 31 * result + this.completionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ioCompletionPortHandle: Handle = MutPtr(0L),
            completionKey: Int = 0,
        ): ResourcemanagerCompletionInformation =
            ResourcemanagerCompletionInformation(
                ioCompletionPortHandleCtorArg = ioCompletionPortHandle,
                completionKey = completionKey,
            )
    }
}

public data class RemHBITMAP(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHBITMAP) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHBITMAP> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHBITMAP> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RemHBITMAP =
                    RemHBITMAP(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RemHBITMAP) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class RemHBRUSH(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHBRUSH) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHBRUSH> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHBRUSH> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RemHBRUSH =
                    RemHBRUSH(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RemHBRUSH) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class RemHENHMETAFILE(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHENHMETAFILE) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHENHMETAFILE> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHENHMETAFILE> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RemHENHMETAFILE =
                    RemHENHMETAFILE(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RemHENHMETAFILE) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class RemHGLOBAL(
    public var fNullHGlobal: Int = 0,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHGLOBAL) return false
        if (this.fNullHGlobal != other.fNullHGlobal) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fNullHGlobal.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHGLOBAL> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHGLOBAL> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RemHGLOBAL =
                    RemHGLOBAL(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RemHGLOBAL) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fNullHGlobal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.data.toList())
                }
            }
    }
}

public data class RemHMETAFILEPICT(
    public var mm: Int = 0,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHMETAFILEPICT) return false
        if (this.mm != other.mm) return false
        if (this.xExt != other.xExt) return false
        if (this.yExt != other.yExt) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mm.hashCode()
        result = 31 * result + this.xExt.hashCode()
        result = 31 * result + this.yExt.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHMETAFILEPICT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHMETAFILEPICT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): RemHMETAFILEPICT =
                    RemHMETAFILEPICT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RemHMETAFILEPICT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.xExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.yExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.data.toList())
                }
            }
    }
}

public data class RemHPALETTE(
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemHPALETTE) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHPALETTE> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemHPALETTE> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RemHPALETTE =
                    RemHPALETTE(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RemHPALETTE) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class RemotableHandle(
    public var fContext: Int = 0,
    public var u: RemotableHandle0 = RemotableHandle0(),
)

public data class RemotableHandle0(
    public var hInproc: Int = 0,
    public var hRemote: Int = 0,
)

public data class ScopeTableAmd64(
    public var count: UInt = 0u,
    public var scopeRecord: List<ScopeTableAmd640> = List(1) { ScopeTableAmd640() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableAmd64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableAmd64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ScopeTableAmd64 =
                    ScopeTableAmd64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScopeTableAmd640.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScopeTableAmd64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScopeTableAmd640.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.scopeRecord)
                }
            }
    }
}

public data class ScopeTableAmd640(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var handlerAddress: UInt = 0u,
    public var jumpTarget: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableAmd640> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableAmd640> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScopeTableAmd640 =
                    ScopeTableAmd640(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScopeTableAmd640) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.beginAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.handlerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.jumpTarget)
                }
            }
    }
}

public data class ScopeTableArm(
    public var count: UInt = 0u,
    public var scopeRecord: List<ScopeTableArm0> = List(1) { ScopeTableArm0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ScopeTableArm =
                    ScopeTableArm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScopeTableArm0.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScopeTableArm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScopeTableArm0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.scopeRecord)
                }
            }
    }
}

public data class ScopeTableArm0(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var handlerAddress: UInt = 0u,
    public var jumpTarget: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScopeTableArm0 =
                    ScopeTableArm0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScopeTableArm0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.beginAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.handlerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.jumpTarget)
                }
            }
    }
}

public data class ScopeTableArm64(
    public var count: UInt = 0u,
    public var scopeRecord: List<ScopeTableArm640> = List(1) { ScopeTableArm640() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ScopeTableArm64 =
                    ScopeTableArm64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScopeTableArm640.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScopeTableArm64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScopeTableArm640.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.scopeRecord)
                }
            }
    }
}

public data class ScopeTableArm640(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var handlerAddress: UInt = 0u,
    public var jumpTarget: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm640> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeTableArm640> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScopeTableArm640 =
                    ScopeTableArm640(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScopeTableArm640) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.beginAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.handlerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.jumpTarget)
                }
            }
    }
}

public data class ScrubDataInput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var maximumIos: UInt = 0u,
    public var objectId: UIntArray = UIntArray(4),
    public var reserved: UIntArray = UIntArray(41),
    public var resumeContext: UByteArray = UByteArray(1040),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScrubDataInput) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.maximumIos != other.maximumIos) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.resumeContext.contentEquals(other.resumeContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maximumIos.hashCode()
        result = 31 * result + this.objectId.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.resumeContext.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubDataInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubDataInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1232L
                override fun readNative(addr: Long): ScrubDataInput =
                    ScrubDataInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (41).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1040).toInt())
                        ).readNative(addr + 192L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScrubDataInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumIos)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 12L, value.objectId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (41).toInt())
                    ).writeNative(addr + 28L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1040).toInt())
                    ).writeNative(addr + 192L, value.resumeContext.toList())
                }
            }
    }
}

public class ScrubDataOutput(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var status: UInt = 0u,
    public var errorFileOffset: ULong = 0uL,
    public var errorLength: ULong = 0uL,
    public var numberOfBytesRepaired: ULong = 0uL,
    public var numberOfBytesFailed: ULong = 0uL,
    public var internalFileReference: ULong = 0uL,
    public var resumeContextLength: UShort = 0u,
    public var parityExtentDataOffset: UShort = 0u,
    public var reserved: UIntArray = UIntArray(9),
    public var numberOfMetadataBytesProcessed: ULong = 0uL,
    public var numberOfDataBytesProcessed: ULong = 0uL,
    public var totalNumberOfMetadataBytesInUse: ULong = 0uL,
    public var totalNumberOfDataBytesInUse: ULong = 0uL,
    public var dataBytesSkippedDueToNoAllocation: ULong = 0uL,
    public var dataBytesSkippedDueToInvalidRun: ULong = 0uL,
    public var dataBytesSkippedDueToIntegrityStream: ULong = 0uL,
    public var dataBytesSkippedDueToRegionBeingClean: ULong = 0uL,
    public var dataBytesSkippedDueToLockConflict: ULong = 0uL,
    public var dataBytesSkippedDueToNoScrubDataFlag: ULong = 0uL,
    public var dataBytesSkippedDueToNoScrubNonIntegrityStreamFlag: ULong = 0uL,
    public var dataBytesScrubbed: ULong = 0uL,
    public var resumeContext: UByteArray = UByteArray(1040),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubDataOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubDataOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1232L
                override fun readNative(addr: Long): ScrubDataOutput =
                    ScrubDataOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (9).toInt())
                        ).readNative(addr + 60L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1040).toInt())
                        ).readNative(addr + 192L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScrubDataOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.errorFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.errorLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.numberOfBytesRepaired)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.numberOfBytesFailed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.internalFileReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.resumeContextLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.parityExtentDataOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (9).toInt())
                    ).writeNative(addr + 60L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.numberOfMetadataBytesProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.numberOfDataBytesProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.totalNumberOfMetadataBytesInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.totalNumberOfDataBytesInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.dataBytesSkippedDueToNoAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.dataBytesSkippedDueToInvalidRun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.dataBytesSkippedDueToIntegrityStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.dataBytesSkippedDueToRegionBeingClean)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.dataBytesSkippedDueToLockConflict)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.dataBytesSkippedDueToNoScrubDataFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.dataBytesSkippedDueToNoScrubNonIntegrityStreamFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.dataBytesScrubbed)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1040).toInt())
                    ).writeNative(addr + 192L, value.resumeContext.toList())
                }
            }
    }
}

public data class ScrubParityExtent(
    public var offset: Long = 0L,
    public var length: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubParityExtent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubParityExtent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScrubParityExtent =
                    ScrubParityExtent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScrubParityExtent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class ScrubParityExtentData(
    public var size: UShort = 0u,
    public var flags: UShort = 0u,
    public var numberOfParityExtents: UShort = 0u,
    public var maximumNumberOfParityExtents: UShort = 0u,
    public var parityExtents: List<ScrubParityExtent> = List(1) { ScrubParityExtent() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubParityExtentData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScrubParityExtentData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ScrubParityExtentData =
                    ScrubParityExtentData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScrubParityExtent.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScrubParityExtentData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.numberOfParityExtents)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.maximumNumberOfParityExtents)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScrubParityExtent.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.parityExtents)
                }
            }
    }
}

public data class SecurityObjectAiParams(
    public var size: UInt = 0u,
    public var constraintMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityObjectAiParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityObjectAiParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SecurityObjectAiParams =
                    SecurityObjectAiParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecurityObjectAiParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.constraintMask)
                }
            }
    }
}

public class ServersiloBasicInformation internal constructor(
    public var serviceSessionId: UInt,
    public var state: ServersiloState,
    public var exitStatus: UInt,
    public var isDownlevelContainer: Boolean,
    apiSetSchemaCtorArg: MutPtr<CVoid>,
    hostApiSetSchemaCtorArg: MutPtr<CVoid>,
) {
    public var apiSetSchema: MutPtr<CVoid> = apiSetSchemaCtorArg
        internal set

    public var hostApiSetSchema: MutPtr<CVoid> = hostApiSetSchemaCtorArg
        internal set

    public constructor() : this(
        serviceSessionId = 0u,
        state = 0,
        exitStatus = 0u,
        isDownlevelContainer = false,
        apiSetSchemaCtorArg = MutPtr(0L),
        hostApiSetSchemaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.serviceSessionId

    public operator fun component2(): ServersiloState = this.state

    public operator fun component3(): UInt = this.exitStatus

    public operator fun component4(): Boolean = this.isDownlevelContainer

    public operator fun component5(): MutPtr<CVoid> = this.apiSetSchema

    public operator fun component6(): MutPtr<CVoid> = this.hostApiSetSchema

    public fun copy(serviceSessionId: UInt = this.serviceSessionId, state: ServersiloState = this.state, exitStatus: UInt = this.exitStatus, isDownlevelContainer: Boolean = this.isDownlevelContainer, apiSetSchema: MutPtr<CVoid> = this.apiSetSchema, hostApiSetSchema: MutPtr<CVoid> = this.hostApiSetSchema): ServersiloBasicInformation = ServersiloBasicInformation(serviceSessionId = serviceSessionId, state = state, exitStatus = exitStatus, isDownlevelContainer = isDownlevelContainer, apiSetSchemaCtorArg = apiSetSchema, hostApiSetSchemaCtorArg = hostApiSetSchema)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServersiloBasicInformation) return false
        if (this.serviceSessionId != other.serviceSessionId) return false
        if (this.state != other.state) return false
        if (this.exitStatus != other.exitStatus) return false
        if (this.isDownlevelContainer != other.isDownlevelContainer) return false
        if (this.apiSetSchema != other.apiSetSchema) return false
        if (this.hostApiSetSchema != other.hostApiSetSchema) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceSessionId.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.exitStatus.hashCode()
        result = 31 * result + this.isDownlevelContainer.hashCode()
        result = 31 * result + this.apiSetSchema.hashCode()
        result = 31 * result + this.hostApiSetSchema.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServersiloBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServersiloBasicInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ServersiloBasicInformation =
                    ServersiloBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ServersiloBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.serviceSessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.exitStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.isDownlevelContainer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.apiSetSchema)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.hostApiSetSchema)
                }
            }

        public operator fun invoke(
            serviceSessionId: UInt = 0u,
            state: ServersiloState = 0,
            exitStatus: UInt = 0u,
            isDownlevelContainer: Boolean = false,
            apiSetSchema: MutPtr<CVoid> = MutPtr(0L),
            hostApiSetSchema: MutPtr<CVoid> = MutPtr(0L),
        ): ServersiloBasicInformation =
            ServersiloBasicInformation(
                serviceSessionId = serviceSessionId,
                state = state,
                exitStatus = exitStatus,
                isDownlevelContainer = isDownlevelContainer,
                apiSetSchemaCtorArg = apiSetSchema,
                hostApiSetSchemaCtorArg = hostApiSetSchema,
            )
    }
}

public data class SeTokenUser(
    public var anonymous1: SeTokenUser0 = SeTokenUser0(),
    public var anonymous2: SeTokenUser1 = SeTokenUser1(),
)

public data class SeTokenUser0(
    public var tokenUser: TokenUser = TokenUser(),
    public var user: SidAndAttributes = SidAndAttributes(),
)

public data class SeTokenUser1(
    public var sid: Sid = Sid(),
    public var buffer: UByteArray = UByteArray(68),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeTokenUser1) return false
        if (this.sid != other.sid) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sid.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class SharedVirtualDiskSupport(
    public var sharedVirtualDiskSupport: SharedVirtualDiskSupportType = 0,
    public var handleState: SharedVirtualDiskHandleState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SharedVirtualDiskSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SharedVirtualDiskSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SharedVirtualDiskSupport =
                    SharedVirtualDiskSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SharedVirtualDiskSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sharedVirtualDiskSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.handleState)
                }
            }
    }
}

public data class ShuffleFileData(
    public var startingOffset: Long = 0L,
    public var length: Long = 0L,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShuffleFileData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShuffleFileData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ShuffleFileData =
                    ShuffleFileData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ShuffleFileData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class SiloobjectBasicInformation(
    public var siloId: UInt = 0u,
    public var siloParentId: UInt = 0u,
    public var numberOfProcesses: UInt = 0u,
    public var isInServerSilo: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiloobjectBasicInformation) return false
        if (this.siloId != other.siloId) return false
        if (this.siloParentId != other.siloParentId) return false
        if (this.numberOfProcesses != other.numberOfProcesses) return false
        if (this.isInServerSilo != other.isInServerSilo) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siloId.hashCode()
        result = 31 * result + this.siloParentId.hashCode()
        result = 31 * result + this.numberOfProcesses.hashCode()
        result = 31 * result + this.isInServerSilo.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiloobjectBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiloobjectBasicInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SiloobjectBasicInformation =
                    SiloobjectBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SiloobjectBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.siloId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.siloParentId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfProcesses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.isInServerSilo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved.toList())
                }
            }
    }
}

public data class SupportedOsInfo(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SupportedOsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SupportedOsInfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SupportedOsInfo =
                    SupportedOsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SupportedOsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                }
            }
    }
}

public data class TapeCreatePartition(
    public var method: UInt = 0u,
    public var count: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeCreatePartition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeCreatePartition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TapeCreatePartition =
                    TapeCreatePartition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TapeCreatePartition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.method)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.size)
                }
            }
    }
}

public data class TapeGetDriveParameters(
    public var ecc: Boolean = false,
    public var compression: Boolean = false,
    public var dataPadding: Boolean = false,
    public var reportSetmarks: Boolean = false,
    public var defaultBlockSize: UInt = 0u,
    public var maximumBlockSize: UInt = 0u,
    public var minimumBlockSize: UInt = 0u,
    public var maximumPartitionCount: UInt = 0u,
    public var featuresLow: UInt = 0u,
    public var featuresHigh: TapeGetDriveParametersFeaturesHigh = 0u,
    public var eOTWarningZoneSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetDriveParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetDriveParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TapeGetDriveParameters =
                    TapeGetDriveParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: TapeGetDriveParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.ecc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.compression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.dataPadding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.reportSetmarks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.defaultBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.minimumBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maximumPartitionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.featuresLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.featuresHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.eOTWarningZoneSize)
                }
            }
    }
}

public data class TapeGetMediaParameters(
    public var capacity: Long = 0L,
    public var remaining: Long = 0L,
    public var blockSize: UInt = 0u,
    public var partitionCount: UInt = 0u,
    public var writeProtected: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetMediaParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetMediaParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TapeGetMediaParameters =
                    TapeGetMediaParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TapeGetMediaParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.capacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.remaining)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.blockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.partitionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 24L, value.writeProtected)
                }
            }
    }
}

public data class TapeSetDriveParameters(
    public var ecc: Boolean = false,
    public var compression: Boolean = false,
    public var dataPadding: Boolean = false,
    public var reportSetmarks: Boolean = false,
    public var eOTWarningZoneSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeSetDriveParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeSetDriveParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TapeSetDriveParameters =
                    TapeSetDriveParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TapeSetDriveParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.ecc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.compression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.dataPadding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.reportSetmarks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eOTWarningZoneSize)
                }
            }
    }
}

public data class TapeSetMediaParameters(
    public var blockSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeSetMediaParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeSetMediaParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TapeSetMediaParameters =
                    TapeSetMediaParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TapeSetMediaParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.blockSize)
                }
            }
    }
}

public class TapeWmiOperations internal constructor(
    public var method: UInt,
    public var dataBufferSize: UInt,
    dataBufferCtorArg: MutPtr<CVoid>,
) {
    public var dataBuffer: MutPtr<CVoid> = dataBufferCtorArg
        internal set

    public constructor() : this(
        method = 0u,
        dataBufferSize = 0u,
        dataBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.method

    public operator fun component2(): UInt = this.dataBufferSize

    public operator fun component3(): MutPtr<CVoid> = this.dataBuffer

    public fun copy(method: UInt = this.method, dataBufferSize: UInt = this.dataBufferSize, dataBuffer: MutPtr<CVoid> = this.dataBuffer): TapeWmiOperations = TapeWmiOperations(method = method, dataBufferSize = dataBufferSize, dataBufferCtorArg = dataBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TapeWmiOperations) return false
        if (this.method != other.method) return false
        if (this.dataBufferSize != other.dataBufferSize) return false
        if (this.dataBuffer != other.dataBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.method.hashCode()
        result = 31 * result + this.dataBufferSize.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeWmiOperations> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeWmiOperations> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TapeWmiOperations =
                    TapeWmiOperations(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TapeWmiOperations) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.method)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataBufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dataBuffer)
                }
            }

        public operator fun invoke(
            method: UInt = 0u,
            dataBufferSize: UInt = 0u,
            dataBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): TapeWmiOperations =
            TapeWmiOperations(
                method = method,
                dataBufferSize = dataBufferSize,
                dataBufferCtorArg = dataBuffer,
            )
    }
}

public class TokenBnoIsolationInformation internal constructor(
    isolationPrefixCtorArg: Pwstr,
    public var isolationEnabled: Boolean,
) {
    public var isolationPrefix: Pwstr = isolationPrefixCtorArg
        internal set

    public constructor() : this(
        isolationPrefixCtorArg = MutPtr(0L),
        isolationEnabled = false,
    )

    public operator fun component1(): Pwstr = this.isolationPrefix

    public operator fun component2(): Boolean = this.isolationEnabled

    public fun copy(isolationPrefix: Pwstr = this.isolationPrefix, isolationEnabled: Boolean = this.isolationEnabled): TokenBnoIsolationInformation = TokenBnoIsolationInformation(isolationPrefixCtorArg = isolationPrefix, isolationEnabled = isolationEnabled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenBnoIsolationInformation) return false
        if (this.isolationPrefix != other.isolationPrefix) return false
        if (this.isolationEnabled != other.isolationEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.isolationPrefix.hashCode()
        result = 31 * result + this.isolationEnabled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            isolationPrefix: Pwstr = MutPtr(0L),
            isolationEnabled: Boolean = false,
        ): TokenBnoIsolationInformation =
            TokenBnoIsolationInformation(
                isolationPrefixCtorArg = isolationPrefix,
                isolationEnabled = isolationEnabled,
            )
    }
}

public class TokenSidInformation internal constructor(
    sidCtorArg: Psid,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.sid

    public fun copy(sid: Psid = this.sid): TokenSidInformation = TokenSidInformation(sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenSidInformation) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int = this.sid.hashCode()

    public companion object {
        public operator fun invoke(
            sid: Psid = MutPtr(0L),
        ): TokenSidInformation =
            TokenSidInformation(
                sidCtorArg = sid,
            )
    }
}

public data class TransactionmanagerBasicInformation(
    public var tmIdentity: Guid = Guid(),
    public var virtualClock: Long = 0L,
)

public data class TransactionmanagerLogpathInformation(
    public var logPathLength: UInt = 0u,
    public var logPath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransactionmanagerLogpathInformation) return false
        if (this.logPathLength != other.logPathLength) return false
        if (!this.logPath.contentEquals(other.logPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logPathLength.hashCode()
        result = 31 * result + this.logPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionmanagerLogpathInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionmanagerLogpathInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TransactionmanagerLogpathInformation =
                    TransactionmanagerLogpathInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: TransactionmanagerLogpathInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.logPathLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.logPath.toList())
                }
            }
    }
}

public data class TransactionmanagerLogInformation(
    public var logIdentity: Guid = Guid(),
)

public data class TransactionmanagerOldestInformation(
    public var oldestTransactionGuid: Guid = Guid(),
)

public data class TransactionmanagerRecoveryInformation(
    public var lastRecoveredLsn: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionmanagerRecoveryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionmanagerRecoveryInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TransactionmanagerRecoveryInformation =
                    TransactionmanagerRecoveryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TransactionmanagerRecoveryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.lastRecoveredLsn)
                }
            }
    }
}

public data class TransactionBasicInformation(
    public var transactionId: Guid = Guid(),
    public var state: UInt = 0u,
    public var outcome: UInt = 0u,
)

public class TransactionBindInformation internal constructor(
    tmHandleCtorArg: Handle,
) {
    public var tmHandle: Handle = tmHandleCtorArg
        internal set

    public constructor() : this(
        tmHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.tmHandle

    public fun copy(tmHandle: Handle = this.tmHandle): TransactionBindInformation = TransactionBindInformation(tmHandleCtorArg = tmHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransactionBindInformation) return false
        if (this.tmHandle != other.tmHandle) return false
        return true
    }

    override fun hashCode(): Int = this.tmHandle.hashCode()

    public companion object {
        public operator fun invoke(
            tmHandle: Handle = MutPtr(0L),
        ): TransactionBindInformation =
            TransactionBindInformation(
                tmHandleCtorArg = tmHandle,
            )
    }
}

public data class TransactionEnlistmentsInformation(
    public var numberOfEnlistments: UInt = 0u,
    public var enlistmentPair: List<TransactionEnlistmentPair> = List(1) { TransactionEnlistmentPair() },
)

public data class TransactionEnlistmentPair(
    public var enlistmentId: Guid = Guid(),
    public var resourceManagerId: Guid = Guid(),
)

public data class TransactionListEntry(
    public var uow: Guid = Guid(),
)

public data class TransactionListInformation(
    public var numberOfTransactions: UInt = 0u,
    public var transactionInformation: List<TransactionListEntry> = List(1) { TransactionListEntry() },
)

public data class TransactionPropertiesInformation(
    public var isolationLevel: UInt = 0u,
    public var isolationFlags: UInt = 0u,
    public var timeout: Long = 0L,
    public var outcome: UInt = 0u,
    public var descriptionLength: UInt = 0u,
    public var description: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransactionPropertiesInformation) return false
        if (this.isolationLevel != other.isolationLevel) return false
        if (this.isolationFlags != other.isolationFlags) return false
        if (this.timeout != other.timeout) return false
        if (this.outcome != other.outcome) return false
        if (this.descriptionLength != other.descriptionLength) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.isolationLevel.hashCode()
        result = 31 * result + this.isolationFlags.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.outcome.hashCode()
        result = 31 * result + this.descriptionLength.hashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionPropertiesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionPropertiesInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TransactionPropertiesInformation =
                    TransactionPropertiesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: TransactionPropertiesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.isolationLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.isolationFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.outcome)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.descriptionLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.description.toList())
                }
            }
    }
}

public data class TransactionSuperiorEnlistmentInformation(
    public var superiorEnlistmentPair: TransactionEnlistmentPair = TransactionEnlistmentPair(),
)

public class UmsCreateThreadAttributes internal constructor(
    public var umsVersion: UInt,
    umsContextCtorArg: MutPtr<CVoid>,
    umsCompletionListCtorArg: MutPtr<CVoid>,
) {
    public var umsContext: MutPtr<CVoid> = umsContextCtorArg
        internal set

    public var umsCompletionList: MutPtr<CVoid> = umsCompletionListCtorArg
        internal set

    public constructor() : this(
        umsVersion = 0u,
        umsContextCtorArg = MutPtr(0L),
        umsCompletionListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.umsVersion

    public operator fun component2(): MutPtr<CVoid> = this.umsContext

    public operator fun component3(): MutPtr<CVoid> = this.umsCompletionList

    public fun copy(umsVersion: UInt = this.umsVersion, umsContext: MutPtr<CVoid> = this.umsContext, umsCompletionList: MutPtr<CVoid> = this.umsCompletionList): UmsCreateThreadAttributes = UmsCreateThreadAttributes(umsVersion = umsVersion, umsContextCtorArg = umsContext, umsCompletionListCtorArg = umsCompletionList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UmsCreateThreadAttributes) return false
        if (this.umsVersion != other.umsVersion) return false
        if (this.umsContext != other.umsContext) return false
        if (this.umsCompletionList != other.umsCompletionList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.umsVersion.hashCode()
        result = 31 * result + this.umsContext.hashCode()
        result = 31 * result + this.umsCompletionList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UmsCreateThreadAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UmsCreateThreadAttributes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UmsCreateThreadAttributes =
                    UmsCreateThreadAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UmsCreateThreadAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.umsVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.umsContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.umsCompletionList)
                }
            }

        public operator fun invoke(
            umsVersion: UInt = 0u,
            umsContext: MutPtr<CVoid> = MutPtr(0L),
            umsCompletionList: MutPtr<CVoid> = MutPtr(0L),
        ): UmsCreateThreadAttributes =
            UmsCreateThreadAttributes(
                umsVersion = umsVersion,
                umsContextCtorArg = umsContext,
                umsCompletionListCtorArg = umsCompletionList,
            )
    }
}

public data class XsaveCetUFormat(
    public var ia32CetUMsr: ULong = 0uL,
    public var ia32Pl3SspMsr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveCetUFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveCetUFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): XsaveCetUFormat =
                    XsaveCetUFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: XsaveCetUFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ia32CetUMsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ia32Pl3SspMsr)
                }
            }
    }
}

public class RemoteMetafilepict internal constructor(
    public var mm: Int,
    public var xExt: Int,
    public var yExt: Int,
    hMFCtorArg: MutPtr<UserHmetafile>,
) {
    public var hMF: MutPtr<UserHmetafile> = hMFCtorArg
        internal set

    public constructor() : this(
        mm = 0,
        xExt = 0,
        yExt = 0,
        hMFCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.mm

    public operator fun component2(): Int = this.xExt

    public operator fun component3(): Int = this.yExt

    public operator fun component4(): MutPtr<UserHmetafile> = this.hMF

    public fun copy(mm: Int = this.mm, xExt: Int = this.xExt, yExt: Int = this.yExt, hMF: MutPtr<UserHmetafile> = this.hMF): RemoteMetafilepict = RemoteMetafilepict(mm = mm, xExt = xExt, yExt = yExt, hMFCtorArg = hMF)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemoteMetafilepict) return false
        if (this.mm != other.mm) return false
        if (this.xExt != other.xExt) return false
        if (this.yExt != other.yExt) return false
        if (this.hMF != other.hMF) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mm.hashCode()
        result = 31 * result + this.xExt.hashCode()
        result = 31 * result + this.yExt.hashCode()
        result = 31 * result + this.hMF.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemoteMetafilepict> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemoteMetafilepict> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RemoteMetafilepict =
                    RemoteMetafilepict(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UserHmetafile>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RemoteMetafilepict) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.xExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.yExt)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UserHmetafile>(64)
                    ).writeNative(addr + 16L, value.hMF)
                }
            }

        public operator fun invoke(
            mm: Int = 0,
            xExt: Int = 0,
            yExt: Int = 0,
            hMF: MutPtr<UserHmetafile> = MutPtr(0L),
        ): RemoteMetafilepict =
            RemoteMetafilepict(
                mm = mm,
                xExt = xExt,
                yExt = yExt,
                hMFCtorArg = hMF,
            )
    }
}

public data class UserBitmap(
    public var bmType: Int = 0,
    public var bmWidth: Int = 0,
    public var bmHeight: Int = 0,
    public var bmWidthBytes: Int = 0,
    public var bmPlanes: UShort = 0u,
    public var bmBitsPixel: UShort = 0u,
    public var cbSize: UInt = 0u,
    public var pBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserBitmap) return false
        if (this.bmType != other.bmType) return false
        if (this.bmWidth != other.bmWidth) return false
        if (this.bmHeight != other.bmHeight) return false
        if (this.bmWidthBytes != other.bmWidthBytes) return false
        if (this.bmPlanes != other.bmPlanes) return false
        if (this.bmBitsPixel != other.bmBitsPixel) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.pBuffer.contentEquals(other.pBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bmType.hashCode()
        result = 31 * result + this.bmWidth.hashCode()
        result = 31 * result + this.bmHeight.hashCode()
        result = 31 * result + this.bmWidthBytes.hashCode()
        result = 31 * result + this.bmPlanes.hashCode()
        result = 31 * result + this.bmBitsPixel.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        result = 31 * result + this.pBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserBitmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserBitmap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): UserBitmap =
                    UserBitmap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UserBitmap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bmType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bmWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bmHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bmWidthBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.bmPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.bmBitsPixel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 24L, value.pBuffer.toList())
                }
            }
    }
}

public data class UserClipformat(
    public var fContext: Int = 0,
    public var u: UserClipformat0 = UserClipformat0(),
)

public class UserClipformat0 internal constructor(
    public var dwValue: UInt,
    pwszNameCtorArg: Pwstr,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public constructor() : this(
        dwValue = 0u,
        pwszNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwValue

    public operator fun component2(): Pwstr = this.pwszName

    public fun copy(dwValue: UInt = this.dwValue, pwszName: Pwstr = this.pwszName): UserClipformat0 = UserClipformat0(dwValue = dwValue, pwszNameCtorArg = pwszName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserClipformat0) return false
        if (this.dwValue != other.dwValue) return false
        if (this.pwszName != other.pwszName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwValue.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwValue: UInt = 0u,
            pwszName: Pwstr = MutPtr(0L),
        ): UserClipformat0 =
            UserClipformat0(
                dwValue = dwValue,
                pwszNameCtorArg = pwszName,
            )
    }
}

public data class UserHbitmap(
    public var fContext: Int = 0,
    public var u: UserHbitmap0 = UserHbitmap0(),
)

public class UserHbitmap0 internal constructor(
    public var hInproc: Int,
    hRemoteCtorArg: MutPtr<UserBitmap>,
    public var hInproc64: Long,
) {
    public var hRemote: MutPtr<UserBitmap> = hRemoteCtorArg
        internal set

    public constructor() : this(
        hInproc = 0,
        hRemoteCtorArg = MutPtr(0L),
        hInproc64 = 0L,
    )

    public operator fun component1(): Int = this.hInproc

    public operator fun component2(): MutPtr<UserBitmap> = this.hRemote

    public operator fun component3(): Long = this.hInproc64

    public fun copy(hInproc: Int = this.hInproc, hRemote: MutPtr<UserBitmap> = this.hRemote, hInproc64: Long = this.hInproc64): UserHbitmap0 = UserHbitmap0(hInproc = hInproc, hRemoteCtorArg = hRemote, hInproc64 = hInproc64)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserHbitmap0) return false
        if (this.hInproc != other.hInproc) return false
        if (this.hRemote != other.hRemote) return false
        if (this.hInproc64 != other.hInproc64) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInproc.hashCode()
        result = 31 * result + this.hRemote.hashCode()
        result = 31 * result + this.hInproc64.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInproc: Int = 0,
            hRemote: MutPtr<UserBitmap> = MutPtr(0L),
            hInproc64: Long = 0L,
        ): UserHbitmap0 =
            UserHbitmap0(
                hInproc = hInproc,
                hRemoteCtorArg = hRemote,
                hInproc64 = hInproc64,
            )
    }
}

public data class UserHenhmetafile(
    public var fContext: Int = 0,
    public var u: UserHenhmetafile0 = UserHenhmetafile0(),
)

public class UserHenhmetafile0 internal constructor(
    public var hInproc: Int,
    hRemoteCtorArg: MutPtr<ByteBlob>,
    public var hInproc64: Long,
) {
    public var hRemote: MutPtr<ByteBlob> = hRemoteCtorArg
        internal set

    public constructor() : this(
        hInproc = 0,
        hRemoteCtorArg = MutPtr(0L),
        hInproc64 = 0L,
    )

    public operator fun component1(): Int = this.hInproc

    public operator fun component2(): MutPtr<ByteBlob> = this.hRemote

    public operator fun component3(): Long = this.hInproc64

    public fun copy(hInproc: Int = this.hInproc, hRemote: MutPtr<ByteBlob> = this.hRemote, hInproc64: Long = this.hInproc64): UserHenhmetafile0 = UserHenhmetafile0(hInproc = hInproc, hRemoteCtorArg = hRemote, hInproc64 = hInproc64)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserHenhmetafile0) return false
        if (this.hInproc != other.hInproc) return false
        if (this.hRemote != other.hRemote) return false
        if (this.hInproc64 != other.hInproc64) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInproc.hashCode()
        result = 31 * result + this.hRemote.hashCode()
        result = 31 * result + this.hInproc64.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInproc: Int = 0,
            hRemote: MutPtr<ByteBlob> = MutPtr(0L),
            hInproc64: Long = 0L,
        ): UserHenhmetafile0 =
            UserHenhmetafile0(
                hInproc = hInproc,
                hRemoteCtorArg = hRemote,
                hInproc64 = hInproc64,
            )
    }
}

public data class UserHglobal(
    public var fContext: Int = 0,
    public var u: UserHglobal0 = UserHglobal0(),
)

public class UserHglobal0 internal constructor(
    public var hInproc: Int,
    hRemoteCtorArg: MutPtr<FlaggedByteBlob>,
    public var hInproc64: Long,
) {
    public var hRemote: MutPtr<FlaggedByteBlob> = hRemoteCtorArg
        internal set

    public constructor() : this(
        hInproc = 0,
        hRemoteCtorArg = MutPtr(0L),
        hInproc64 = 0L,
    )

    public operator fun component1(): Int = this.hInproc

    public operator fun component2(): MutPtr<FlaggedByteBlob> = this.hRemote

    public operator fun component3(): Long = this.hInproc64

    public fun copy(hInproc: Int = this.hInproc, hRemote: MutPtr<FlaggedByteBlob> = this.hRemote, hInproc64: Long = this.hInproc64): UserHglobal0 = UserHglobal0(hInproc = hInproc, hRemoteCtorArg = hRemote, hInproc64 = hInproc64)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserHglobal0) return false
        if (this.hInproc != other.hInproc) return false
        if (this.hRemote != other.hRemote) return false
        if (this.hInproc64 != other.hInproc64) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInproc.hashCode()
        result = 31 * result + this.hRemote.hashCode()
        result = 31 * result + this.hInproc64.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInproc: Int = 0,
            hRemote: MutPtr<FlaggedByteBlob> = MutPtr(0L),
            hInproc64: Long = 0L,
        ): UserHglobal0 =
            UserHglobal0(
                hInproc = hInproc,
                hRemoteCtorArg = hRemote,
                hInproc64 = hInproc64,
            )
    }
}

public data class UserHmetafile(
    public var fContext: Int = 0,
    public var u: UserHmetafile0 = UserHmetafile0(),
)

public class UserHmetafile0 internal constructor(
    public var hInproc: Int,
    hRemoteCtorArg: MutPtr<ByteBlob>,
    public var hInproc64: Long,
) {
    public var hRemote: MutPtr<ByteBlob> = hRemoteCtorArg
        internal set

    public constructor() : this(
        hInproc = 0,
        hRemoteCtorArg = MutPtr(0L),
        hInproc64 = 0L,
    )

    public operator fun component1(): Int = this.hInproc

    public operator fun component2(): MutPtr<ByteBlob> = this.hRemote

    public operator fun component3(): Long = this.hInproc64

    public fun copy(hInproc: Int = this.hInproc, hRemote: MutPtr<ByteBlob> = this.hRemote, hInproc64: Long = this.hInproc64): UserHmetafile0 = UserHmetafile0(hInproc = hInproc, hRemoteCtorArg = hRemote, hInproc64 = hInproc64)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserHmetafile0) return false
        if (this.hInproc != other.hInproc) return false
        if (this.hRemote != other.hRemote) return false
        if (this.hInproc64 != other.hInproc64) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInproc.hashCode()
        result = 31 * result + this.hRemote.hashCode()
        result = 31 * result + this.hInproc64.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInproc: Int = 0,
            hRemote: MutPtr<ByteBlob> = MutPtr(0L),
            hInproc64: Long = 0L,
        ): UserHmetafile0 =
            UserHmetafile0(
                hInproc = hInproc,
                hRemoteCtorArg = hRemote,
                hInproc64 = hInproc64,
            )
    }
}
