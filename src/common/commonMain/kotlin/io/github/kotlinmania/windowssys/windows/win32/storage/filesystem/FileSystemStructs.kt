@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId

public data class ByHandleFileInformation(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var dwVolumeSerialNumber: UInt = 0u,
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var nNumberOfLinks: UInt = 0u,
    public var nFileIndexHigh: UInt = 0u,
    public var nFileIndexLow: UInt = 0u,
)

public data class ClfsLogNameInformation(
    public var nameLengthInBytes: UShort = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClfsLogNameInformation) return false
        if (this.nameLengthInBytes != other.nameLengthInBytes) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameLengthInBytes.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsLogNameInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsLogNameInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ClfsLogNameInformation =
                    ClfsLogNameInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ClfsLogNameInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nameLengthInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.name)
                }
            }
    }
}

public data class ClfsMgmtNotification(
    public var notification: ClfsMgmtNotificationType = 0,
    public var lsn: ClsLsn = ClsLsn(),
    public var logIsPinned: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtNotification> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClfsMgmtNotification =
                    ClfsMgmtNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (ClsLsn.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.notification)
                    (ClsLsn.typeLayout()).writeNative(addr + 8L, value.lsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.logIsPinned)
                }
            }
    }
}

public data class ClfsMgmtPolicy(
    public var version: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
    public var policyFlags: UInt = 0u,
    public var policyType: ClfsMgmtPolicyType = 0,
    public var policyParameters: ClfsMgmtPolicy0 = ClfsMgmtPolicy0(),
)

public data class ClfsMgmtPolicy0(
    public var maximumSize: ClfsMgmtPolicy00 = ClfsMgmtPolicy00(),
    public var minimumSize: ClfsMgmtPolicy01 = ClfsMgmtPolicy01(),
    public var newContainerSize: ClfsMgmtPolicy02 = ClfsMgmtPolicy02(),
    public var growthRate: ClfsMgmtPolicy03 = ClfsMgmtPolicy03(),
    public var logTail: ClfsMgmtPolicy04 = ClfsMgmtPolicy04(),
    public var autoShrink: ClfsMgmtPolicy05 = ClfsMgmtPolicy05(),
    public var autoGrow: ClfsMgmtPolicy06 = ClfsMgmtPolicy06(),
    public var newContainerPrefix: ClfsMgmtPolicy07 = ClfsMgmtPolicy07(),
    public var newContainerSuffix: ClfsMgmtPolicy08 = ClfsMgmtPolicy08(),
    public var newContainerExtension: ClfsMgmtPolicy09 = ClfsMgmtPolicy09(),
)

public data class ClfsMgmtPolicy06(
    public var enabled: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy06> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsMgmtPolicy06 =
                    ClfsMgmtPolicy06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.enabled)
                }
            }
    }
}

public data class ClfsMgmtPolicy05(
    public var percentage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy05> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsMgmtPolicy05 =
                    ClfsMgmtPolicy05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.percentage)
                }
            }
    }
}

public data class ClfsMgmtPolicy03(
    public var absoluteGrowthInContainers: UInt = 0u,
    public var relativeGrowthPercentage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy03> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsMgmtPolicy03 =
                    ClfsMgmtPolicy03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.absoluteGrowthInContainers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.relativeGrowthPercentage)
                }
            }
    }
}

public data class ClfsMgmtPolicy04(
    public var minimumAvailablePercentage: UInt = 0u,
    public var minimumAvailableContainers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy04> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsMgmtPolicy04 =
                    ClfsMgmtPolicy04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minimumAvailablePercentage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumAvailableContainers)
                }
            }
    }
}

public data class ClfsMgmtPolicy00(
    public var containers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsMgmtPolicy00 =
                    ClfsMgmtPolicy00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.containers)
                }
            }
    }
}

public data class ClfsMgmtPolicy01(
    public var containers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsMgmtPolicy01 =
                    ClfsMgmtPolicy01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.containers)
                }
            }
    }
}

public data class ClfsMgmtPolicy09(
    public var extensionLengthInBytes: UShort = 0u,
    public var extensionString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClfsMgmtPolicy09) return false
        if (this.extensionLengthInBytes != other.extensionLengthInBytes) return false
        if (!this.extensionString.contentEquals(other.extensionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extensionLengthInBytes.hashCode()
        result = 31 * result + this.extensionString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy09> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy09> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ClfsMgmtPolicy09 =
                    ClfsMgmtPolicy09(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy09) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.extensionLengthInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.extensionString)
                }
            }
    }
}

public data class ClfsMgmtPolicy07(
    public var prefixLengthInBytes: UShort = 0u,
    public var prefixString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClfsMgmtPolicy07) return false
        if (this.prefixLengthInBytes != other.prefixLengthInBytes) return false
        if (!this.prefixString.contentEquals(other.prefixString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prefixLengthInBytes.hashCode()
        result = 31 * result + this.prefixString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy07> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ClfsMgmtPolicy07 =
                    ClfsMgmtPolicy07(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy07) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.prefixLengthInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.prefixString)
                }
            }
    }
}

public data class ClfsMgmtPolicy02(
    public var sizeInBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy02> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsMgmtPolicy02 =
                    ClfsMgmtPolicy02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeInBytes)
                }
            }
    }
}

public data class ClfsMgmtPolicy08(
    public var nextContainerSuffix: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy08> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsMgmtPolicy08> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClfsMgmtPolicy08 =
                    ClfsMgmtPolicy08(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClfsMgmtPolicy08) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.nextContainerSuffix)
                }
            }
    }
}

public data class ClfsNodeId(
    public var cType: UInt = 0u,
    public var cbNode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsNodeId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsNodeId> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClfsNodeId =
                    ClfsNodeId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClfsNodeId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbNode)
                }
            }
    }
}

public data class ClfsPhysicalLsnInformation(
    public var streamIdentifier: UByte = 0u,
    public var virtualLsn: ClsLsn = ClsLsn(),
    public var physicalLsn: ClsLsn = ClsLsn(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsPhysicalLsnInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsPhysicalLsnInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClfsPhysicalLsnInformation =
                    ClfsPhysicalLsnInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (ClsLsn.typeLayout()).readNative(addr + 8L),
                        (ClsLsn.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ClfsPhysicalLsnInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.streamIdentifier)
                    (ClsLsn.typeLayout()).writeNative(addr + 8L, value.virtualLsn)
                    (ClsLsn.typeLayout()).writeNative(addr + 16L, value.physicalLsn)
                }
            }
    }
}

public data class ClfsStreamIdInformation(
    public var streamIdentifier: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsStreamIdInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClfsStreamIdInformation> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): ClfsStreamIdInformation =
                    ClfsStreamIdInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClfsStreamIdInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.streamIdentifier)
                }
            }
    }
}

public data class ClsArchiveDescriptor(
    public var coffLow: ULong = 0uL,
    public var coffHigh: ULong = 0uL,
    public var infoContainer: ClsContainerInformation = ClsContainerInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsArchiveDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsArchiveDescriptor> {
                override val sizeBytes: Long = 592L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClsArchiveDescriptor =
                    ClsArchiveDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (ClsContainerInformation.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ClsArchiveDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.coffLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.coffHigh)
                    (ClsContainerInformation.typeLayout()).writeNative(addr + 16L, value.infoContainer)
                }
            }
    }
}

public data class ClsContainerInformation(
    public var fileAttributes: UInt = 0u,
    public var creationTime: ULong = 0uL,
    public var lastAccessTime: ULong = 0uL,
    public var lastWriteTime: ULong = 0uL,
    public var containerSize: Long = 0L,
    public var fileNameActualLength: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(256),
    public var state: UInt = 0u,
    public var physicalContainerId: UInt = 0u,
    public var logicalContainerId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClsContainerInformation) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.containerSize != other.containerSize) return false
        if (this.fileNameActualLength != other.fileNameActualLength) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.state != other.state) return false
        if (this.physicalContainerId != other.physicalContainerId) return false
        if (this.logicalContainerId != other.logicalContainerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileAttributes.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.containerSize.hashCode()
        result = 31 * result + this.fileNameActualLength.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.physicalContainerId.hashCode()
        result = 31 * result + this.logicalContainerId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsContainerInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsContainerInformation> {
                override val sizeBytes: Long = 576L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClsContainerInformation =
                    ClsContainerInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 560L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 564L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 568L),
                    )
                override fun writeNative(addr: Long, value: ClsContainerInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.containerSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fileNameActualLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 48L, value.fileName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 560L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 564L, value.physicalContainerId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 568L, value.logicalContainerId)
                }
            }
    }
}

public class ClsInformation(
    public var totalAvailable: Long = 0L,
    public var currentAvailable: Long = 0L,
    public var totalReservation: Long = 0L,
    public var baseFileSize: ULong = 0uL,
    public var containerSize: ULong = 0uL,
    public var totalContainers: UInt = 0u,
    public var freeContainers: UInt = 0u,
    public var totalClients: UInt = 0u,
    public var attributes: UInt = 0u,
    public var flushThreshold: UInt = 0u,
    public var sectorSize: UInt = 0u,
    public var minArchiveTailLsn: ClsLsn = ClsLsn(),
    public var baseLsn: ClsLsn = ClsLsn(),
    public var lastFlushedLsn: ClsLsn = ClsLsn(),
    public var lastLsn: ClsLsn = ClsLsn(),
    public var restartLsn: ClsLsn = ClsLsn(),
    public var identity: Guid = Guid(),
)

public data class ClsIoStatistics(
    public var hdrIoStats: ClsIoStatisticsHeader = ClsIoStatisticsHeader(),
    public var cFlush: ULong = 0uL,
    public var cbFlush: ULong = 0uL,
    public var cMetaFlush: ULong = 0uL,
    public var cbMetaFlush: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsIoStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsIoStatistics> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClsIoStatistics =
                    ClsIoStatistics(
                        (ClsIoStatisticsHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: ClsIoStatistics) {
                    (ClsIoStatisticsHeader.typeLayout()).writeNative(addr, value.hdrIoStats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.cFlush)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.cbFlush)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cMetaFlush)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.cbMetaFlush)
                }
            }
    }
}

public data class ClsIoStatisticsHeader(
    public var ubMajorVersion: UByte = 0u,
    public var ubMinorVersion: UByte = 0u,
    public var eStatsClass: ClfsIostatsClass = 0,
    public var cbLength: UShort = 0u,
    public var coffData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsIoStatisticsHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsIoStatisticsHeader> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ClsIoStatisticsHeader =
                    ClsIoStatisticsHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ClsIoStatisticsHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ubMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ubMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eStatsClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.cbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.coffData)
                }
            }
    }
}

public data class ClsLsn(
    public var internal: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsLsn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsLsn> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClsLsn =
                    ClsLsn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClsLsn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.internal)
                }
            }
    }
}

public class ClsScanContext internal constructor(
    public var cidNode: ClfsNodeId,
    hLogCtorArg: Handle,
    public var cIndex: UInt,
    public var cContainers: UInt,
    public var cContainersReturned: UInt,
    public var eScanMode: UByte,
    pinfoContainerCtorArg: MutPtr<ClsContainerInformation>,
) {
    public var hLog: Handle = hLogCtorArg
        internal set

    public var pinfoContainer: MutPtr<ClsContainerInformation> = pinfoContainerCtorArg
        internal set

    public constructor() : this(
        cidNode = ClfsNodeId(),
        hLogCtorArg = MutPtr(0L),
        cIndex = 0u,
        cContainers = 0u,
        cContainersReturned = 0u,
        eScanMode = 0u,
        pinfoContainerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ClfsNodeId = this.cidNode

    public operator fun component2(): Handle = this.hLog

    public operator fun component3(): UInt = this.cIndex

    public operator fun component4(): UInt = this.cContainers

    public operator fun component5(): UInt = this.cContainersReturned

    public operator fun component6(): UByte = this.eScanMode

    public operator fun component7(): MutPtr<ClsContainerInformation> = this.pinfoContainer

    public fun copy(cidNode: ClfsNodeId = this.cidNode, hLog: Handle = this.hLog, cIndex: UInt = this.cIndex, cContainers: UInt = this.cContainers, cContainersReturned: UInt = this.cContainersReturned, eScanMode: UByte = this.eScanMode, pinfoContainer: MutPtr<ClsContainerInformation> = this.pinfoContainer): ClsScanContext = ClsScanContext(cidNode = cidNode, hLogCtorArg = hLog, cIndex = cIndex, cContainers = cContainers, cContainersReturned = cContainersReturned, eScanMode = eScanMode, pinfoContainerCtorArg = pinfoContainer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClsScanContext) return false
        if (this.cidNode != other.cidNode) return false
        if (this.hLog != other.hLog) return false
        if (this.cIndex != other.cIndex) return false
        if (this.cContainers != other.cContainers) return false
        if (this.cContainersReturned != other.cContainersReturned) return false
        if (this.eScanMode != other.eScanMode) return false
        if (this.pinfoContainer != other.pinfoContainer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cidNode.hashCode()
        result = 31 * result + this.hLog.hashCode()
        result = 31 * result + this.cIndex.hashCode()
        result = 31 * result + this.cContainers.hashCode()
        result = 31 * result + this.cContainersReturned.hashCode()
        result = 31 * result + this.eScanMode.hashCode()
        result = 31 * result + this.pinfoContainer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cidNode: ClfsNodeId = ClfsNodeId(),
            hLog: Handle = MutPtr(0L),
            cIndex: UInt = 0u,
            cContainers: UInt = 0u,
            cContainersReturned: UInt = 0u,
            eScanMode: UByte = 0u,
            pinfoContainer: MutPtr<ClsContainerInformation> = MutPtr(0L),
        ): ClsScanContext =
            ClsScanContext(
                cidNode = cidNode,
                hLogCtorArg = hLog,
                cIndex = cIndex,
                cContainers = cContainers,
                cContainersReturned = cContainersReturned,
                eScanMode = eScanMode,
                pinfoContainerCtorArg = pinfoContainer,
            )
    }
}

public class ClsWriteEntry internal constructor(
    bufferCtorArg: MutPtr<CVoid>,
    public var byteLength: UInt,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        byteLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.buffer

    public operator fun component2(): UInt = this.byteLength

    public fun copy(buffer: MutPtr<CVoid> = this.buffer, byteLength: UInt = this.byteLength): ClsWriteEntry = ClsWriteEntry(bufferCtorArg = buffer, byteLength = byteLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClsWriteEntry) return false
        if (this.buffer != other.buffer) return false
        if (this.byteLength != other.byteLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.byteLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsWriteEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClsWriteEntry> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ClsWriteEntry =
                    ClsWriteEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClsWriteEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.byteLength)
                }
            }

        public operator fun invoke(
            buffer: MutPtr<CVoid> = MutPtr(0L),
            byteLength: UInt = 0u,
        ): ClsWriteEntry =
            ClsWriteEntry(
                bufferCtorArg = buffer,
                byteLength = byteLength,
            )
    }
}

public data class ConnectionInfo0(
    public var coni0Id: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectionInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ConnectionInfo0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ConnectionInfo0 =
                    ConnectionInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ConnectionInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.coni0Id)
                }
            }
    }
}

public class ConnectionInfo1 internal constructor(
    public var coni1Id: UInt,
    public var coni1Type: ShareType,
    public var coni1NumOpens: UInt,
    public var coni1NumUsers: UInt,
    public var coni1Time: UInt,
    coni1UsernameCtorArg: Pwstr,
    coni1NetnameCtorArg: Pwstr,
) {
    public var coni1Username: Pwstr = coni1UsernameCtorArg
        internal set

    public var coni1Netname: Pwstr = coni1NetnameCtorArg
        internal set

    public constructor() : this(
        coni1Id = 0u,
        coni1Type = 0u,
        coni1NumOpens = 0u,
        coni1NumUsers = 0u,
        coni1Time = 0u,
        coni1UsernameCtorArg = MutPtr(0L),
        coni1NetnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.coni1Id

    public operator fun component2(): ShareType = this.coni1Type

    public operator fun component3(): UInt = this.coni1NumOpens

    public operator fun component4(): UInt = this.coni1NumUsers

    public operator fun component5(): UInt = this.coni1Time

    public operator fun component6(): Pwstr = this.coni1Username

    public operator fun component7(): Pwstr = this.coni1Netname

    public fun copy(coni1Id: UInt = this.coni1Id, coni1Type: ShareType = this.coni1Type, coni1NumOpens: UInt = this.coni1NumOpens, coni1NumUsers: UInt = this.coni1NumUsers, coni1Time: UInt = this.coni1Time, coni1Username: Pwstr = this.coni1Username, coni1Netname: Pwstr = this.coni1Netname): ConnectionInfo1 = ConnectionInfo1(coni1Id = coni1Id, coni1Type = coni1Type, coni1NumOpens = coni1NumOpens, coni1NumUsers = coni1NumUsers, coni1Time = coni1Time, coni1UsernameCtorArg = coni1Username, coni1NetnameCtorArg = coni1Netname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConnectionInfo1) return false
        if (this.coni1Id != other.coni1Id) return false
        if (this.coni1Type != other.coni1Type) return false
        if (this.coni1NumOpens != other.coni1NumOpens) return false
        if (this.coni1NumUsers != other.coni1NumUsers) return false
        if (this.coni1Time != other.coni1Time) return false
        if (this.coni1Username != other.coni1Username) return false
        if (this.coni1Netname != other.coni1Netname) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.coni1Id.hashCode()
        result = 31 * result + this.coni1Type.hashCode()
        result = 31 * result + this.coni1NumOpens.hashCode()
        result = 31 * result + this.coni1NumUsers.hashCode()
        result = 31 * result + this.coni1Time.hashCode()
        result = 31 * result + this.coni1Username.hashCode()
        result = 31 * result + this.coni1Netname.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            coni1Id: UInt = 0u,
            coni1Type: ShareType = 0u,
            coni1NumOpens: UInt = 0u,
            coni1NumUsers: UInt = 0u,
            coni1Time: UInt = 0u,
            coni1Username: Pwstr = MutPtr(0L),
            coni1Netname: Pwstr = MutPtr(0L),
        ): ConnectionInfo1 =
            ConnectionInfo1(
                coni1Id = coni1Id,
                coni1Type = coni1Type,
                coni1NumOpens = coni1NumOpens,
                coni1NumUsers = coni1NumUsers,
                coni1Time = coni1Time,
                coni1UsernameCtorArg = coni1Username,
                coni1NetnameCtorArg = coni1Netname,
            )
    }
}

public class Copyfile2ExtendedParameters internal constructor(
    public var dwSize: UInt,
    public var dwCopyFlags: CopyfileFlags,
    pfCancelCtorArg: MutPtr<Bool>,
    public var pProgressRoutine: Pcopyfile2ProgressRoutine,
    pvCallbackContextCtorArg: MutPtr<CVoid>,
) {
    public var pfCancel: MutPtr<Bool> = pfCancelCtorArg
        internal set

    public var pvCallbackContext: MutPtr<CVoid> = pvCallbackContextCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwCopyFlags = 0u,
        pfCancelCtorArg = MutPtr(0L),
        pProgressRoutine = null,
        pvCallbackContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): CopyfileFlags = this.dwCopyFlags

    public operator fun component3(): MutPtr<Bool> = this.pfCancel

    public operator fun component4(): Pcopyfile2ProgressRoutine = this.pProgressRoutine

    public operator fun component5(): MutPtr<CVoid> = this.pvCallbackContext

    public fun copy(dwSize: UInt = this.dwSize, dwCopyFlags: CopyfileFlags = this.dwCopyFlags, pfCancel: MutPtr<Bool> = this.pfCancel, pProgressRoutine: Pcopyfile2ProgressRoutine = this.pProgressRoutine, pvCallbackContext: MutPtr<CVoid> = this.pvCallbackContext): Copyfile2ExtendedParameters = Copyfile2ExtendedParameters(dwSize = dwSize, dwCopyFlags = dwCopyFlags, pfCancelCtorArg = pfCancel, pProgressRoutine = pProgressRoutine, pvCallbackContextCtorArg = pvCallbackContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Copyfile2ExtendedParameters) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwCopyFlags != other.dwCopyFlags) return false
        if (this.pfCancel != other.pfCancel) return false
        if (this.pProgressRoutine != other.pProgressRoutine) return false
        if (this.pvCallbackContext != other.pvCallbackContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwCopyFlags.hashCode()
        result = 31 * result + this.pfCancel.hashCode()
        result = 31 * result + this.pProgressRoutine.hashCode()
        result = 31 * result + this.pvCallbackContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwCopyFlags: CopyfileFlags = 0u,
            pfCancel: MutPtr<Bool> = MutPtr(0L),
            pProgressRoutine: Pcopyfile2ProgressRoutine = null,
            pvCallbackContext: MutPtr<CVoid> = MutPtr(0L),
        ): Copyfile2ExtendedParameters =
            Copyfile2ExtendedParameters(
                dwSize = dwSize,
                dwCopyFlags = dwCopyFlags,
                pfCancelCtorArg = pfCancel,
                pProgressRoutine = pProgressRoutine,
                pvCallbackContextCtorArg = pvCallbackContext,
            )
    }
}

public class Copyfile2ExtendedParametersV2 internal constructor(
    public var dwSize: UInt,
    public var dwCopyFlags: CopyfileFlags,
    pfCancelCtorArg: MutPtr<Bool>,
    public var pProgressRoutine: Pcopyfile2ProgressRoutine,
    pvCallbackContextCtorArg: MutPtr<CVoid>,
    public var dwCopyFlagsV2: Copyfile2V2Flags,
    public var ioDesiredSize: UInt,
    public var ioDesiredRate: UInt,
    reservedCtorArg: List<MutPtr<CVoid>>,
) {
    public var pfCancel: MutPtr<Bool> = pfCancelCtorArg
        internal set

    public var pvCallbackContext: MutPtr<CVoid> = pvCallbackContextCtorArg
        internal set

    public var reserved: List<MutPtr<CVoid>> = reservedCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwCopyFlags = 0u,
        pfCancelCtorArg = MutPtr(0L),
        pProgressRoutine = null,
        pvCallbackContextCtorArg = MutPtr(0L),
        dwCopyFlagsV2 = 0u,
        ioDesiredSize = 0u,
        ioDesiredRate = 0u,
        reservedCtorArg = List(8) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): CopyfileFlags = this.dwCopyFlags

    public operator fun component3(): MutPtr<Bool> = this.pfCancel

    public operator fun component4(): Pcopyfile2ProgressRoutine = this.pProgressRoutine

    public operator fun component5(): MutPtr<CVoid> = this.pvCallbackContext

    public operator fun component6(): Copyfile2V2Flags = this.dwCopyFlagsV2

    public operator fun component7(): UInt = this.ioDesiredSize

    public operator fun component8(): UInt = this.ioDesiredRate

    public operator fun component9(): List<MutPtr<CVoid>> = this.reserved

    public fun copy(dwSize: UInt = this.dwSize, dwCopyFlags: CopyfileFlags = this.dwCopyFlags, pfCancel: MutPtr<Bool> = this.pfCancel, pProgressRoutine: Pcopyfile2ProgressRoutine = this.pProgressRoutine, pvCallbackContext: MutPtr<CVoid> = this.pvCallbackContext, dwCopyFlagsV2: Copyfile2V2Flags = this.dwCopyFlagsV2, ioDesiredSize: UInt = this.ioDesiredSize, ioDesiredRate: UInt = this.ioDesiredRate, reserved: List<MutPtr<CVoid>> = this.reserved): Copyfile2ExtendedParametersV2 = Copyfile2ExtendedParametersV2(dwSize = dwSize, dwCopyFlags = dwCopyFlags, pfCancelCtorArg = pfCancel, pProgressRoutine = pProgressRoutine, pvCallbackContextCtorArg = pvCallbackContext, dwCopyFlagsV2 = dwCopyFlagsV2, ioDesiredSize = ioDesiredSize, ioDesiredRate = ioDesiredRate, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Copyfile2ExtendedParametersV2) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwCopyFlags != other.dwCopyFlags) return false
        if (this.pfCancel != other.pfCancel) return false
        if (this.pProgressRoutine != other.pProgressRoutine) return false
        if (this.pvCallbackContext != other.pvCallbackContext) return false
        if (this.dwCopyFlagsV2 != other.dwCopyFlagsV2) return false
        if (this.ioDesiredSize != other.ioDesiredSize) return false
        if (this.ioDesiredRate != other.ioDesiredRate) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwCopyFlags.hashCode()
        result = 31 * result + this.pfCancel.hashCode()
        result = 31 * result + this.pProgressRoutine.hashCode()
        result = 31 * result + this.pvCallbackContext.hashCode()
        result = 31 * result + this.dwCopyFlagsV2.hashCode()
        result = 31 * result + this.ioDesiredSize.hashCode()
        result = 31 * result + this.ioDesiredRate.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwCopyFlags: CopyfileFlags = 0u,
            pfCancel: MutPtr<Bool> = MutPtr(0L),
            pProgressRoutine: Pcopyfile2ProgressRoutine = null,
            pvCallbackContext: MutPtr<CVoid> = MutPtr(0L),
            dwCopyFlagsV2: Copyfile2V2Flags = 0u,
            ioDesiredSize: UInt = 0u,
            ioDesiredRate: UInt = 0u,
            reserved: List<MutPtr<CVoid>> = List(8) { MutPtr(0L) },
        ): Copyfile2ExtendedParametersV2 =
            Copyfile2ExtendedParametersV2(
                dwSize = dwSize,
                dwCopyFlags = dwCopyFlags,
                pfCancelCtorArg = pfCancel,
                pProgressRoutine = pProgressRoutine,
                pvCallbackContextCtorArg = pvCallbackContext,
                dwCopyFlagsV2 = dwCopyFlagsV2,
                ioDesiredSize = ioDesiredSize,
                ioDesiredRate = ioDesiredRate,
                reservedCtorArg = reserved,
            )
    }
}

public data class Copyfile2Message(
    public var type: Copyfile2MessageType = 0,
    public var dwPadding: UInt = 0u,
    public var info: Copyfile2Message0 = Copyfile2Message0(),
)

public data class Copyfile2Message0(
    public var chunkStarted: Copyfile2Message00 = Copyfile2Message00(),
    public var chunkFinished: Copyfile2Message01 = Copyfile2Message01(),
    public var streamStarted: Copyfile2Message02 = Copyfile2Message02(),
    public var streamFinished: Copyfile2Message03 = Copyfile2Message03(),
    public var pollContinue: Copyfile2Message04 = Copyfile2Message04(),
    public var error: Copyfile2Message05 = Copyfile2Message05(),
)

public class Copyfile2Message01 internal constructor(
    public var dwStreamNumber: UInt,
    public var dwFlags: UInt,
    hSourceFileCtorArg: Handle,
    hDestinationFileCtorArg: Handle,
    public var uliChunkNumber: ULong,
    public var uliChunkSize: ULong,
    public var uliStreamSize: ULong,
    public var uliStreamBytesTransferred: ULong,
    public var uliTotalFileSize: ULong,
    public var uliTotalBytesTransferred: ULong,
) {
    public var hSourceFile: Handle = hSourceFileCtorArg
        internal set

    public var hDestinationFile: Handle = hDestinationFileCtorArg
        internal set

    public constructor() : this(
        dwStreamNumber = 0u,
        dwFlags = 0u,
        hSourceFileCtorArg = MutPtr(0L),
        hDestinationFileCtorArg = MutPtr(0L),
        uliChunkNumber = 0uL,
        uliChunkSize = 0uL,
        uliStreamSize = 0uL,
        uliStreamBytesTransferred = 0uL,
        uliTotalFileSize = 0uL,
        uliTotalBytesTransferred = 0uL,
    )

    public operator fun component1(): UInt = this.dwStreamNumber

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Handle = this.hSourceFile

    public operator fun component4(): Handle = this.hDestinationFile

    public operator fun component5(): ULong = this.uliChunkNumber

    public operator fun component6(): ULong = this.uliChunkSize

    public operator fun component7(): ULong = this.uliStreamSize

    public operator fun component8(): ULong = this.uliStreamBytesTransferred

    public operator fun component9(): ULong = this.uliTotalFileSize

    public operator fun component10(): ULong = this.uliTotalBytesTransferred

    public fun copy(dwStreamNumber: UInt = this.dwStreamNumber, dwFlags: UInt = this.dwFlags, hSourceFile: Handle = this.hSourceFile, hDestinationFile: Handle = this.hDestinationFile, uliChunkNumber: ULong = this.uliChunkNumber, uliChunkSize: ULong = this.uliChunkSize, uliStreamSize: ULong = this.uliStreamSize, uliStreamBytesTransferred: ULong = this.uliStreamBytesTransferred, uliTotalFileSize: ULong = this.uliTotalFileSize, uliTotalBytesTransferred: ULong = this.uliTotalBytesTransferred): Copyfile2Message01 = Copyfile2Message01(dwStreamNumber = dwStreamNumber, dwFlags = dwFlags, hSourceFileCtorArg = hSourceFile, hDestinationFileCtorArg = hDestinationFile, uliChunkNumber = uliChunkNumber, uliChunkSize = uliChunkSize, uliStreamSize = uliStreamSize, uliStreamBytesTransferred = uliStreamBytesTransferred, uliTotalFileSize = uliTotalFileSize, uliTotalBytesTransferred = uliTotalBytesTransferred)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Copyfile2Message01) return false
        if (this.dwStreamNumber != other.dwStreamNumber) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hSourceFile != other.hSourceFile) return false
        if (this.hDestinationFile != other.hDestinationFile) return false
        if (this.uliChunkNumber != other.uliChunkNumber) return false
        if (this.uliChunkSize != other.uliChunkSize) return false
        if (this.uliStreamSize != other.uliStreamSize) return false
        if (this.uliStreamBytesTransferred != other.uliStreamBytesTransferred) return false
        if (this.uliTotalFileSize != other.uliTotalFileSize) return false
        if (this.uliTotalBytesTransferred != other.uliTotalBytesTransferred) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStreamNumber.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hSourceFile.hashCode()
        result = 31 * result + this.hDestinationFile.hashCode()
        result = 31 * result + this.uliChunkNumber.hashCode()
        result = 31 * result + this.uliChunkSize.hashCode()
        result = 31 * result + this.uliStreamSize.hashCode()
        result = 31 * result + this.uliStreamBytesTransferred.hashCode()
        result = 31 * result + this.uliTotalFileSize.hashCode()
        result = 31 * result + this.uliTotalBytesTransferred.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStreamNumber: UInt = 0u,
            dwFlags: UInt = 0u,
            hSourceFile: Handle = MutPtr(0L),
            hDestinationFile: Handle = MutPtr(0L),
            uliChunkNumber: ULong = 0uL,
            uliChunkSize: ULong = 0uL,
            uliStreamSize: ULong = 0uL,
            uliStreamBytesTransferred: ULong = 0uL,
            uliTotalFileSize: ULong = 0uL,
            uliTotalBytesTransferred: ULong = 0uL,
        ): Copyfile2Message01 =
            Copyfile2Message01(
                dwStreamNumber = dwStreamNumber,
                dwFlags = dwFlags,
                hSourceFileCtorArg = hSourceFile,
                hDestinationFileCtorArg = hDestinationFile,
                uliChunkNumber = uliChunkNumber,
                uliChunkSize = uliChunkSize,
                uliStreamSize = uliStreamSize,
                uliStreamBytesTransferred = uliStreamBytesTransferred,
                uliTotalFileSize = uliTotalFileSize,
                uliTotalBytesTransferred = uliTotalBytesTransferred,
            )
    }
}

public class Copyfile2Message00 internal constructor(
    public var dwStreamNumber: UInt,
    public var dwReserved: UInt,
    hSourceFileCtorArg: Handle,
    hDestinationFileCtorArg: Handle,
    public var uliChunkNumber: ULong,
    public var uliChunkSize: ULong,
    public var uliStreamSize: ULong,
    public var uliTotalFileSize: ULong,
) {
    public var hSourceFile: Handle = hSourceFileCtorArg
        internal set

    public var hDestinationFile: Handle = hDestinationFileCtorArg
        internal set

    public constructor() : this(
        dwStreamNumber = 0u,
        dwReserved = 0u,
        hSourceFileCtorArg = MutPtr(0L),
        hDestinationFileCtorArg = MutPtr(0L),
        uliChunkNumber = 0uL,
        uliChunkSize = 0uL,
        uliStreamSize = 0uL,
        uliTotalFileSize = 0uL,
    )

    public operator fun component1(): UInt = this.dwStreamNumber

    public operator fun component2(): UInt = this.dwReserved

    public operator fun component3(): Handle = this.hSourceFile

    public operator fun component4(): Handle = this.hDestinationFile

    public operator fun component5(): ULong = this.uliChunkNumber

    public operator fun component6(): ULong = this.uliChunkSize

    public operator fun component7(): ULong = this.uliStreamSize

    public operator fun component8(): ULong = this.uliTotalFileSize

    public fun copy(dwStreamNumber: UInt = this.dwStreamNumber, dwReserved: UInt = this.dwReserved, hSourceFile: Handle = this.hSourceFile, hDestinationFile: Handle = this.hDestinationFile, uliChunkNumber: ULong = this.uliChunkNumber, uliChunkSize: ULong = this.uliChunkSize, uliStreamSize: ULong = this.uliStreamSize, uliTotalFileSize: ULong = this.uliTotalFileSize): Copyfile2Message00 = Copyfile2Message00(dwStreamNumber = dwStreamNumber, dwReserved = dwReserved, hSourceFileCtorArg = hSourceFile, hDestinationFileCtorArg = hDestinationFile, uliChunkNumber = uliChunkNumber, uliChunkSize = uliChunkSize, uliStreamSize = uliStreamSize, uliTotalFileSize = uliTotalFileSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Copyfile2Message00) return false
        if (this.dwStreamNumber != other.dwStreamNumber) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.hSourceFile != other.hSourceFile) return false
        if (this.hDestinationFile != other.hDestinationFile) return false
        if (this.uliChunkNumber != other.uliChunkNumber) return false
        if (this.uliChunkSize != other.uliChunkSize) return false
        if (this.uliStreamSize != other.uliStreamSize) return false
        if (this.uliTotalFileSize != other.uliTotalFileSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStreamNumber.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.hSourceFile.hashCode()
        result = 31 * result + this.hDestinationFile.hashCode()
        result = 31 * result + this.uliChunkNumber.hashCode()
        result = 31 * result + this.uliChunkSize.hashCode()
        result = 31 * result + this.uliStreamSize.hashCode()
        result = 31 * result + this.uliTotalFileSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStreamNumber: UInt = 0u,
            dwReserved: UInt = 0u,
            hSourceFile: Handle = MutPtr(0L),
            hDestinationFile: Handle = MutPtr(0L),
            uliChunkNumber: ULong = 0uL,
            uliChunkSize: ULong = 0uL,
            uliStreamSize: ULong = 0uL,
            uliTotalFileSize: ULong = 0uL,
        ): Copyfile2Message00 =
            Copyfile2Message00(
                dwStreamNumber = dwStreamNumber,
                dwReserved = dwReserved,
                hSourceFileCtorArg = hSourceFile,
                hDestinationFileCtorArg = hDestinationFile,
                uliChunkNumber = uliChunkNumber,
                uliChunkSize = uliChunkSize,
                uliStreamSize = uliStreamSize,
                uliTotalFileSize = uliTotalFileSize,
            )
    }
}

public data class Copyfile2Message05(
    public var copyPhase: Copyfile2CopyPhase = 0,
    public var dwStreamNumber: UInt = 0u,
    public var hrFailure: Hresult = 0,
    public var dwReserved: UInt = 0u,
    public var uliChunkNumber: ULong = 0uL,
    public var uliStreamSize: ULong = 0uL,
    public var uliStreamBytesTransferred: ULong = 0uL,
    public var uliTotalFileSize: ULong = 0uL,
    public var uliTotalBytesTransferred: ULong = 0uL,
)

public data class Copyfile2Message04(
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Copyfile2Message04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Copyfile2Message04> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Copyfile2Message04 =
                    Copyfile2Message04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Copyfile2Message04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwReserved)
                }
            }
    }
}

public class Copyfile2Message03 internal constructor(
    public var dwStreamNumber: UInt,
    public var dwReserved: UInt,
    hSourceFileCtorArg: Handle,
    hDestinationFileCtorArg: Handle,
    public var uliStreamSize: ULong,
    public var uliStreamBytesTransferred: ULong,
    public var uliTotalFileSize: ULong,
    public var uliTotalBytesTransferred: ULong,
) {
    public var hSourceFile: Handle = hSourceFileCtorArg
        internal set

    public var hDestinationFile: Handle = hDestinationFileCtorArg
        internal set

    public constructor() : this(
        dwStreamNumber = 0u,
        dwReserved = 0u,
        hSourceFileCtorArg = MutPtr(0L),
        hDestinationFileCtorArg = MutPtr(0L),
        uliStreamSize = 0uL,
        uliStreamBytesTransferred = 0uL,
        uliTotalFileSize = 0uL,
        uliTotalBytesTransferred = 0uL,
    )

    public operator fun component1(): UInt = this.dwStreamNumber

    public operator fun component2(): UInt = this.dwReserved

    public operator fun component3(): Handle = this.hSourceFile

    public operator fun component4(): Handle = this.hDestinationFile

    public operator fun component5(): ULong = this.uliStreamSize

    public operator fun component6(): ULong = this.uliStreamBytesTransferred

    public operator fun component7(): ULong = this.uliTotalFileSize

    public operator fun component8(): ULong = this.uliTotalBytesTransferred

    public fun copy(dwStreamNumber: UInt = this.dwStreamNumber, dwReserved: UInt = this.dwReserved, hSourceFile: Handle = this.hSourceFile, hDestinationFile: Handle = this.hDestinationFile, uliStreamSize: ULong = this.uliStreamSize, uliStreamBytesTransferred: ULong = this.uliStreamBytesTransferred, uliTotalFileSize: ULong = this.uliTotalFileSize, uliTotalBytesTransferred: ULong = this.uliTotalBytesTransferred): Copyfile2Message03 = Copyfile2Message03(dwStreamNumber = dwStreamNumber, dwReserved = dwReserved, hSourceFileCtorArg = hSourceFile, hDestinationFileCtorArg = hDestinationFile, uliStreamSize = uliStreamSize, uliStreamBytesTransferred = uliStreamBytesTransferred, uliTotalFileSize = uliTotalFileSize, uliTotalBytesTransferred = uliTotalBytesTransferred)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Copyfile2Message03) return false
        if (this.dwStreamNumber != other.dwStreamNumber) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.hSourceFile != other.hSourceFile) return false
        if (this.hDestinationFile != other.hDestinationFile) return false
        if (this.uliStreamSize != other.uliStreamSize) return false
        if (this.uliStreamBytesTransferred != other.uliStreamBytesTransferred) return false
        if (this.uliTotalFileSize != other.uliTotalFileSize) return false
        if (this.uliTotalBytesTransferred != other.uliTotalBytesTransferred) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStreamNumber.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.hSourceFile.hashCode()
        result = 31 * result + this.hDestinationFile.hashCode()
        result = 31 * result + this.uliStreamSize.hashCode()
        result = 31 * result + this.uliStreamBytesTransferred.hashCode()
        result = 31 * result + this.uliTotalFileSize.hashCode()
        result = 31 * result + this.uliTotalBytesTransferred.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStreamNumber: UInt = 0u,
            dwReserved: UInt = 0u,
            hSourceFile: Handle = MutPtr(0L),
            hDestinationFile: Handle = MutPtr(0L),
            uliStreamSize: ULong = 0uL,
            uliStreamBytesTransferred: ULong = 0uL,
            uliTotalFileSize: ULong = 0uL,
            uliTotalBytesTransferred: ULong = 0uL,
        ): Copyfile2Message03 =
            Copyfile2Message03(
                dwStreamNumber = dwStreamNumber,
                dwReserved = dwReserved,
                hSourceFileCtorArg = hSourceFile,
                hDestinationFileCtorArg = hDestinationFile,
                uliStreamSize = uliStreamSize,
                uliStreamBytesTransferred = uliStreamBytesTransferred,
                uliTotalFileSize = uliTotalFileSize,
                uliTotalBytesTransferred = uliTotalBytesTransferred,
            )
    }
}

public class Copyfile2Message02 internal constructor(
    public var dwStreamNumber: UInt,
    public var dwReserved: UInt,
    hSourceFileCtorArg: Handle,
    hDestinationFileCtorArg: Handle,
    public var uliStreamSize: ULong,
    public var uliTotalFileSize: ULong,
) {
    public var hSourceFile: Handle = hSourceFileCtorArg
        internal set

    public var hDestinationFile: Handle = hDestinationFileCtorArg
        internal set

    public constructor() : this(
        dwStreamNumber = 0u,
        dwReserved = 0u,
        hSourceFileCtorArg = MutPtr(0L),
        hDestinationFileCtorArg = MutPtr(0L),
        uliStreamSize = 0uL,
        uliTotalFileSize = 0uL,
    )

    public operator fun component1(): UInt = this.dwStreamNumber

    public operator fun component2(): UInt = this.dwReserved

    public operator fun component3(): Handle = this.hSourceFile

    public operator fun component4(): Handle = this.hDestinationFile

    public operator fun component5(): ULong = this.uliStreamSize

    public operator fun component6(): ULong = this.uliTotalFileSize

    public fun copy(dwStreamNumber: UInt = this.dwStreamNumber, dwReserved: UInt = this.dwReserved, hSourceFile: Handle = this.hSourceFile, hDestinationFile: Handle = this.hDestinationFile, uliStreamSize: ULong = this.uliStreamSize, uliTotalFileSize: ULong = this.uliTotalFileSize): Copyfile2Message02 = Copyfile2Message02(dwStreamNumber = dwStreamNumber, dwReserved = dwReserved, hSourceFileCtorArg = hSourceFile, hDestinationFileCtorArg = hDestinationFile, uliStreamSize = uliStreamSize, uliTotalFileSize = uliTotalFileSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Copyfile2Message02) return false
        if (this.dwStreamNumber != other.dwStreamNumber) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.hSourceFile != other.hSourceFile) return false
        if (this.hDestinationFile != other.hDestinationFile) return false
        if (this.uliStreamSize != other.uliStreamSize) return false
        if (this.uliTotalFileSize != other.uliTotalFileSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStreamNumber.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.hSourceFile.hashCode()
        result = 31 * result + this.hDestinationFile.hashCode()
        result = 31 * result + this.uliStreamSize.hashCode()
        result = 31 * result + this.uliTotalFileSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStreamNumber: UInt = 0u,
            dwReserved: UInt = 0u,
            hSourceFile: Handle = MutPtr(0L),
            hDestinationFile: Handle = MutPtr(0L),
            uliStreamSize: ULong = 0uL,
            uliTotalFileSize: ULong = 0uL,
        ): Copyfile2Message02 =
            Copyfile2Message02(
                dwStreamNumber = dwStreamNumber,
                dwReserved = dwReserved,
                hSourceFileCtorArg = hSourceFile,
                hDestinationFileCtorArg = hDestinationFile,
                uliStreamSize = uliStreamSize,
                uliTotalFileSize = uliTotalFileSize,
            )
    }
}

public class Createfile2ExtendedParameters internal constructor(
    public var dwSize: UInt,
    public var dwFileAttributes: UInt,
    public var dwFileFlags: UInt,
    public var dwSecurityQosFlags: UInt,
    lpSecurityAttributesCtorArg: MutPtr<SecurityAttributes>,
    hTemplateFileCtorArg: Handle,
) {
    public var lpSecurityAttributes: MutPtr<SecurityAttributes> = lpSecurityAttributesCtorArg
        internal set

    public var hTemplateFile: Handle = hTemplateFileCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFileAttributes = 0u,
        dwFileFlags = 0u,
        dwSecurityQosFlags = 0u,
        lpSecurityAttributesCtorArg = MutPtr(0L),
        hTemplateFileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFileAttributes

    public operator fun component3(): UInt = this.dwFileFlags

    public operator fun component4(): UInt = this.dwSecurityQosFlags

    public operator fun component5(): MutPtr<SecurityAttributes> = this.lpSecurityAttributes

    public operator fun component6(): Handle = this.hTemplateFile

    public fun copy(dwSize: UInt = this.dwSize, dwFileAttributes: UInt = this.dwFileAttributes, dwFileFlags: UInt = this.dwFileFlags, dwSecurityQosFlags: UInt = this.dwSecurityQosFlags, lpSecurityAttributes: MutPtr<SecurityAttributes> = this.lpSecurityAttributes, hTemplateFile: Handle = this.hTemplateFile): Createfile2ExtendedParameters = Createfile2ExtendedParameters(dwSize = dwSize, dwFileAttributes = dwFileAttributes, dwFileFlags = dwFileFlags, dwSecurityQosFlags = dwSecurityQosFlags, lpSecurityAttributesCtorArg = lpSecurityAttributes, hTemplateFileCtorArg = hTemplateFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Createfile2ExtendedParameters) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.dwFileFlags != other.dwFileFlags) return false
        if (this.dwSecurityQosFlags != other.dwSecurityQosFlags) return false
        if (this.lpSecurityAttributes != other.lpSecurityAttributes) return false
        if (this.hTemplateFile != other.hTemplateFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFileAttributes.hashCode()
        result = 31 * result + this.dwFileFlags.hashCode()
        result = 31 * result + this.dwSecurityQosFlags.hashCode()
        result = 31 * result + this.lpSecurityAttributes.hashCode()
        result = 31 * result + this.hTemplateFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFileAttributes: UInt = 0u,
            dwFileFlags: UInt = 0u,
            dwSecurityQosFlags: UInt = 0u,
            lpSecurityAttributes: MutPtr<SecurityAttributes> = MutPtr(0L),
            hTemplateFile: Handle = MutPtr(0L),
        ): Createfile2ExtendedParameters =
            Createfile2ExtendedParameters(
                dwSize = dwSize,
                dwFileAttributes = dwFileAttributes,
                dwFileFlags = dwFileFlags,
                dwSecurityQosFlags = dwSecurityQosFlags,
                lpSecurityAttributesCtorArg = lpSecurityAttributes,
                hTemplateFileCtorArg = hTemplateFile,
            )
    }
}

public data class DiskquotaUserInformation(
    public var quotaUsed: Long = 0L,
    public var quotaThreshold: Long = 0L,
    public var quotaLimit: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskquotaUserInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskquotaUserInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DiskquotaUserInformation =
                    DiskquotaUserInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DiskquotaUserInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.quotaUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.quotaThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.quotaLimit)
                }
            }
    }
}

public data class DiskSpaceInformation(
    public var actualTotalAllocationUnits: ULong = 0uL,
    public var actualAvailableAllocationUnits: ULong = 0uL,
    public var actualPoolUnavailableAllocationUnits: ULong = 0uL,
    public var callerTotalAllocationUnits: ULong = 0uL,
    public var callerAvailableAllocationUnits: ULong = 0uL,
    public var callerPoolUnavailableAllocationUnits: ULong = 0uL,
    public var usedAllocationUnits: ULong = 0uL,
    public var totalReservedAllocationUnits: ULong = 0uL,
    public var volumeStorageReserveAllocationUnits: ULong = 0uL,
    public var availableCommittedAllocationUnits: ULong = 0uL,
    public var poolAvailableAllocationUnits: ULong = 0uL,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskSpaceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiskSpaceInformation> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DiskSpaceInformation =
                    DiskSpaceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: DiskSpaceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.actualTotalAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.actualAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.actualPoolUnavailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.callerTotalAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.callerAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.callerPoolUnavailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.usedAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.totalReservedAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.volumeStorageReserveAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.availableCommittedAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.poolAvailableAllocationUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.sectorsPerAllocationUnit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.bytesPerSector)
                }
            }
    }
}

public class EfsCertificateBlob internal constructor(
    public var dwCertEncodingType: UInt,
    public var cbData: UInt,
    pbDataCtorArg: MutPtr<UByte>,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public constructor() : this(
        dwCertEncodingType = 0u,
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwCertEncodingType

    public operator fun component2(): UInt = this.cbData

    public operator fun component3(): MutPtr<UByte> = this.pbData

    public fun copy(dwCertEncodingType: UInt = this.dwCertEncodingType, cbData: UInt = this.cbData, pbData: MutPtr<UByte> = this.pbData): EfsCertificateBlob = EfsCertificateBlob(dwCertEncodingType = dwCertEncodingType, cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EfsCertificateBlob) return false
        if (this.dwCertEncodingType != other.dwCertEncodingType) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCertEncodingType.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsCertificateBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsCertificateBlob> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EfsCertificateBlob =
                    EfsCertificateBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EfsCertificateBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCertEncodingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            dwCertEncodingType: UInt = 0u,
            cbData: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
        ): EfsCertificateBlob =
            EfsCertificateBlob(
                dwCertEncodingType = dwCertEncodingType,
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public data class EfsCompatibilityInfo(
    public var efsVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsCompatibilityInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsCompatibilityInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EfsCompatibilityInfo =
                    EfsCompatibilityInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EfsCompatibilityInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.efsVersion)
                }
            }
    }
}

public data class EfsDecryptionStatusInfo(
    public var dwDecryptionError: UInt = 0u,
    public var dwHashOffset: UInt = 0u,
    public var cbHash: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsDecryptionStatusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsDecryptionStatusInfo> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EfsDecryptionStatusInfo =
                    EfsDecryptionStatusInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EfsDecryptionStatusInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDecryptionError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHashOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbHash)
                }
            }
    }
}

public data class EfsEncryptionStatusInfo(
    public var bHasCurrentKey: Bool = 0,
    public var dwEncryptionError: UInt = 0u,
)

public class EfsHashBlob internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr<UByte>,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr<UByte> = this.pbData

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr<UByte> = this.pbData): EfsHashBlob = EfsHashBlob(cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EfsHashBlob) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsHashBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsHashBlob> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EfsHashBlob =
                    EfsHashBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EfsHashBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
        ): EfsHashBlob =
            EfsHashBlob(
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public data class EfsKeyInfo(
    public var dwVersion: UInt = 0u,
    public var entropy: UInt = 0u,
    public var algorithm: AlgId = 0u,
    public var keyLength: UInt = 0u,
)

public class EfsPinBlob internal constructor(
    public var cbPadding: UInt,
    public var cbData: UInt,
    pbDataCtorArg: MutPtr<UByte>,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public constructor() : this(
        cbPadding = 0u,
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbPadding

    public operator fun component2(): UInt = this.cbData

    public operator fun component3(): MutPtr<UByte> = this.pbData

    public fun copy(cbPadding: UInt = this.cbPadding, cbData: UInt = this.cbData, pbData: MutPtr<UByte> = this.pbData): EfsPinBlob = EfsPinBlob(cbPadding = cbPadding, cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EfsPinBlob) return false
        if (this.cbPadding != other.cbPadding) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbPadding.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsPinBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsPinBlob> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EfsPinBlob =
                    EfsPinBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EfsPinBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbPadding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbPadding: UInt = 0u,
            cbData: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
        ): EfsPinBlob =
            EfsPinBlob(
                cbPadding = cbPadding,
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public class EfsRpcBlob internal constructor(
    public var cbData: UInt,
    pbDataCtorArg: MutPtr<UByte>,
) {
    public var pbData: MutPtr<UByte> = pbDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pbDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr<UByte> = this.pbData

    public fun copy(cbData: UInt = this.cbData, pbData: MutPtr<UByte> = this.pbData): EfsRpcBlob = EfsRpcBlob(cbData = cbData, pbDataCtorArg = pbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EfsRpcBlob) return false
        if (this.cbData != other.cbData) return false
        if (this.pbData != other.pbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pbData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsRpcBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsRpcBlob> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EfsRpcBlob =
                    EfsRpcBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EfsRpcBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pbData: MutPtr<UByte> = MutPtr(0L),
        ): EfsRpcBlob =
            EfsRpcBlob(
                cbData = cbData,
                pbDataCtorArg = pbData,
            )
    }
}

public data class EfsVersionInfo(
    public var efsVersion: UInt = 0u,
    public var subVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EfsVersionInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EfsVersionInfo =
                    EfsVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EfsVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.efsVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.subVersion)
                }
            }
    }
}

public class EncryptedFileMetadataSignature internal constructor(
    public var dwEfsAccessType: UInt,
    pCertificatesAddedCtorArg: MutPtr<EncryptionCertificateHashList>,
    pEncryptionCertificateCtorArg: MutPtr<EncryptionCertificate>,
    pEfsStreamSignatureCtorArg: MutPtr<EfsRpcBlob>,
) {
    public var pCertificatesAdded: MutPtr<EncryptionCertificateHashList> = pCertificatesAddedCtorArg
        internal set

    public var pEncryptionCertificate: MutPtr<EncryptionCertificate> = pEncryptionCertificateCtorArg
        internal set

    public var pEfsStreamSignature: MutPtr<EfsRpcBlob> = pEfsStreamSignatureCtorArg
        internal set

    public constructor() : this(
        dwEfsAccessType = 0u,
        pCertificatesAddedCtorArg = MutPtr(0L),
        pEncryptionCertificateCtorArg = MutPtr(0L),
        pEfsStreamSignatureCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwEfsAccessType

    public operator fun component2(): MutPtr<EncryptionCertificateHashList> = this.pCertificatesAdded

    public operator fun component3(): MutPtr<EncryptionCertificate> = this.pEncryptionCertificate

    public operator fun component4(): MutPtr<EfsRpcBlob> = this.pEfsStreamSignature

    public fun copy(dwEfsAccessType: UInt = this.dwEfsAccessType, pCertificatesAdded: MutPtr<EncryptionCertificateHashList> = this.pCertificatesAdded, pEncryptionCertificate: MutPtr<EncryptionCertificate> = this.pEncryptionCertificate, pEfsStreamSignature: MutPtr<EfsRpcBlob> = this.pEfsStreamSignature): EncryptedFileMetadataSignature = EncryptedFileMetadataSignature(dwEfsAccessType = dwEfsAccessType, pCertificatesAddedCtorArg = pCertificatesAdded, pEncryptionCertificateCtorArg = pEncryptionCertificate, pEfsStreamSignatureCtorArg = pEfsStreamSignature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptedFileMetadataSignature) return false
        if (this.dwEfsAccessType != other.dwEfsAccessType) return false
        if (this.pCertificatesAdded != other.pCertificatesAdded) return false
        if (this.pEncryptionCertificate != other.pEncryptionCertificate) return false
        if (this.pEfsStreamSignature != other.pEfsStreamSignature) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwEfsAccessType.hashCode()
        result = 31 * result + this.pCertificatesAdded.hashCode()
        result = 31 * result + this.pEncryptionCertificate.hashCode()
        result = 31 * result + this.pEfsStreamSignature.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptedFileMetadataSignature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptedFileMetadataSignature> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EncryptedFileMetadataSignature =
                    EncryptedFileMetadataSignature(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EncryptionCertificateHashList>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EncryptionCertificate>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EfsRpcBlob>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: EncryptedFileMetadataSignature) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEfsAccessType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EncryptionCertificateHashList>(64)
                    ).writeNative(addr + 8L, value.pCertificatesAdded)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EncryptionCertificate>(64)
                    ).writeNative(addr + 16L, value.pEncryptionCertificate)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EfsRpcBlob>(64)
                    ).writeNative(addr + 24L, value.pEfsStreamSignature)
                }
            }

        public operator fun invoke(
            dwEfsAccessType: UInt = 0u,
            pCertificatesAdded: MutPtr<EncryptionCertificateHashList> = MutPtr(0L),
            pEncryptionCertificate: MutPtr<EncryptionCertificate> = MutPtr(0L),
            pEfsStreamSignature: MutPtr<EfsRpcBlob> = MutPtr(0L),
        ): EncryptedFileMetadataSignature =
            EncryptedFileMetadataSignature(
                dwEfsAccessType = dwEfsAccessType,
                pCertificatesAddedCtorArg = pCertificatesAdded,
                pEncryptionCertificateCtorArg = pEncryptionCertificate,
                pEfsStreamSignatureCtorArg = pEfsStreamSignature,
            )
    }
}

public class EncryptionCertificate internal constructor(
    public var cbTotalLength: UInt,
    pUserSidCtorArg: MutPtr<Sid>,
    pCertBlobCtorArg: MutPtr<EfsCertificateBlob>,
) {
    public var pUserSid: MutPtr<Sid> = pUserSidCtorArg
        internal set

    public var pCertBlob: MutPtr<EfsCertificateBlob> = pCertBlobCtorArg
        internal set

    public constructor() : this(
        cbTotalLength = 0u,
        pUserSidCtorArg = MutPtr(0L),
        pCertBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbTotalLength

    public operator fun component2(): MutPtr<Sid> = this.pUserSid

    public operator fun component3(): MutPtr<EfsCertificateBlob> = this.pCertBlob

    public fun copy(cbTotalLength: UInt = this.cbTotalLength, pUserSid: MutPtr<Sid> = this.pUserSid, pCertBlob: MutPtr<EfsCertificateBlob> = this.pCertBlob): EncryptionCertificate = EncryptionCertificate(cbTotalLength = cbTotalLength, pUserSidCtorArg = pUserSid, pCertBlobCtorArg = pCertBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionCertificate) return false
        if (this.cbTotalLength != other.cbTotalLength) return false
        if (this.pUserSid != other.pUserSid) return false
        if (this.pCertBlob != other.pCertBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbTotalLength.hashCode()
        result = 31 * result + this.pUserSid.hashCode()
        result = 31 * result + this.pCertBlob.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionCertificate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionCertificate> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EncryptionCertificate =
                    EncryptionCertificate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EfsCertificateBlob>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: EncryptionCertificate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbTotalLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sid>(64)
                    ).writeNative(addr + 8L, value.pUserSid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EfsCertificateBlob>(64)
                    ).writeNative(addr + 16L, value.pCertBlob)
                }
            }

        public operator fun invoke(
            cbTotalLength: UInt = 0u,
            pUserSid: MutPtr<Sid> = MutPtr(0L),
            pCertBlob: MutPtr<EfsCertificateBlob> = MutPtr(0L),
        ): EncryptionCertificate =
            EncryptionCertificate(
                cbTotalLength = cbTotalLength,
                pUserSidCtorArg = pUserSid,
                pCertBlobCtorArg = pCertBlob,
            )
    }
}

public class EncryptionCertificateHash internal constructor(
    public var cbTotalLength: UInt,
    pUserSidCtorArg: MutPtr<Sid>,
    pHashCtorArg: MutPtr<EfsHashBlob>,
    lpDisplayInformationCtorArg: Pwstr,
) {
    public var pUserSid: MutPtr<Sid> = pUserSidCtorArg
        internal set

    public var pHash: MutPtr<EfsHashBlob> = pHashCtorArg
        internal set

    public var lpDisplayInformation: Pwstr = lpDisplayInformationCtorArg
        internal set

    public constructor() : this(
        cbTotalLength = 0u,
        pUserSidCtorArg = MutPtr(0L),
        pHashCtorArg = MutPtr(0L),
        lpDisplayInformationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbTotalLength

    public operator fun component2(): MutPtr<Sid> = this.pUserSid

    public operator fun component3(): MutPtr<EfsHashBlob> = this.pHash

    public operator fun component4(): Pwstr = this.lpDisplayInformation

    public fun copy(cbTotalLength: UInt = this.cbTotalLength, pUserSid: MutPtr<Sid> = this.pUserSid, pHash: MutPtr<EfsHashBlob> = this.pHash, lpDisplayInformation: Pwstr = this.lpDisplayInformation): EncryptionCertificateHash = EncryptionCertificateHash(cbTotalLength = cbTotalLength, pUserSidCtorArg = pUserSid, pHashCtorArg = pHash, lpDisplayInformationCtorArg = lpDisplayInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionCertificateHash) return false
        if (this.cbTotalLength != other.cbTotalLength) return false
        if (this.pUserSid != other.pUserSid) return false
        if (this.pHash != other.pHash) return false
        if (this.lpDisplayInformation != other.lpDisplayInformation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbTotalLength.hashCode()
        result = 31 * result + this.pUserSid.hashCode()
        result = 31 * result + this.pHash.hashCode()
        result = 31 * result + this.lpDisplayInformation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbTotalLength: UInt = 0u,
            pUserSid: MutPtr<Sid> = MutPtr(0L),
            pHash: MutPtr<EfsHashBlob> = MutPtr(0L),
            lpDisplayInformation: Pwstr = MutPtr(0L),
        ): EncryptionCertificateHash =
            EncryptionCertificateHash(
                cbTotalLength = cbTotalLength,
                pUserSidCtorArg = pUserSid,
                pHashCtorArg = pHash,
                lpDisplayInformationCtorArg = lpDisplayInformation,
            )
    }
}

public class EncryptionCertificateHashList internal constructor(
    public var nCertHash: UInt,
    pUsersCtorArg: MutPtr<MutPtr<EncryptionCertificateHash>>,
) {
    public var pUsers: MutPtr<MutPtr<EncryptionCertificateHash>> = pUsersCtorArg
        internal set

    public constructor() : this(
        nCertHash = 0u,
        pUsersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.nCertHash

    public operator fun component2(): MutPtr<MutPtr<EncryptionCertificateHash>> = this.pUsers

    public fun copy(nCertHash: UInt = this.nCertHash, pUsers: MutPtr<MutPtr<EncryptionCertificateHash>> = this.pUsers): EncryptionCertificateHashList = EncryptionCertificateHashList(nCertHash = nCertHash, pUsersCtorArg = pUsers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionCertificateHashList) return false
        if (this.nCertHash != other.nCertHash) return false
        if (this.pUsers != other.pUsers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nCertHash.hashCode()
        result = 31 * result + this.pUsers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionCertificateHashList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionCertificateHashList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EncryptionCertificateHashList =
                    EncryptionCertificateHashList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<EncryptionCertificateHash>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EncryptionCertificateHashList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nCertHash)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<EncryptionCertificateHash>>(64)
                    ).writeNative(addr + 8L, value.pUsers)
                }
            }

        public operator fun invoke(
            nCertHash: UInt = 0u,
            pUsers: MutPtr<MutPtr<EncryptionCertificateHash>> = MutPtr(0L),
        ): EncryptionCertificateHashList =
            EncryptionCertificateHashList(
                nCertHash = nCertHash,
                pUsersCtorArg = pUsers,
            )
    }
}

public class EncryptionCertificateList internal constructor(
    public var nUsers: UInt,
    pUsersCtorArg: MutPtr<MutPtr<EncryptionCertificate>>,
) {
    public var pUsers: MutPtr<MutPtr<EncryptionCertificate>> = pUsersCtorArg
        internal set

    public constructor() : this(
        nUsers = 0u,
        pUsersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.nUsers

    public operator fun component2(): MutPtr<MutPtr<EncryptionCertificate>> = this.pUsers

    public fun copy(nUsers: UInt = this.nUsers, pUsers: MutPtr<MutPtr<EncryptionCertificate>> = this.pUsers): EncryptionCertificateList = EncryptionCertificateList(nUsers = nUsers, pUsersCtorArg = pUsers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionCertificateList) return false
        if (this.nUsers != other.nUsers) return false
        if (this.pUsers != other.pUsers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nUsers.hashCode()
        result = 31 * result + this.pUsers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionCertificateList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionCertificateList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EncryptionCertificateList =
                    EncryptionCertificateList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<EncryptionCertificate>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EncryptionCertificateList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nUsers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<EncryptionCertificate>>(64)
                    ).writeNative(addr + 8L, value.pUsers)
                }
            }

        public operator fun invoke(
            nUsers: UInt = 0u,
            pUsers: MutPtr<MutPtr<EncryptionCertificate>> = MutPtr(0L),
        ): EncryptionCertificateList =
            EncryptionCertificateList(
                nUsers = nUsers,
                pUsersCtorArg = pUsers,
            )
    }
}

public class EncryptionProtector internal constructor(
    public var cbTotalLength: UInt,
    pUserSidCtorArg: MutPtr<Sid>,
    lpProtectorDescriptorCtorArg: Pwstr,
) {
    public var pUserSid: MutPtr<Sid> = pUserSidCtorArg
        internal set

    public var lpProtectorDescriptor: Pwstr = lpProtectorDescriptorCtorArg
        internal set

    public constructor() : this(
        cbTotalLength = 0u,
        pUserSidCtorArg = MutPtr(0L),
        lpProtectorDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbTotalLength

    public operator fun component2(): MutPtr<Sid> = this.pUserSid

    public operator fun component3(): Pwstr = this.lpProtectorDescriptor

    public fun copy(cbTotalLength: UInt = this.cbTotalLength, pUserSid: MutPtr<Sid> = this.pUserSid, lpProtectorDescriptor: Pwstr = this.lpProtectorDescriptor): EncryptionProtector = EncryptionProtector(cbTotalLength = cbTotalLength, pUserSidCtorArg = pUserSid, lpProtectorDescriptorCtorArg = lpProtectorDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionProtector) return false
        if (this.cbTotalLength != other.cbTotalLength) return false
        if (this.pUserSid != other.pUserSid) return false
        if (this.lpProtectorDescriptor != other.lpProtectorDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbTotalLength.hashCode()
        result = 31 * result + this.pUserSid.hashCode()
        result = 31 * result + this.lpProtectorDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbTotalLength: UInt = 0u,
            pUserSid: MutPtr<Sid> = MutPtr(0L),
            lpProtectorDescriptor: Pwstr = MutPtr(0L),
        ): EncryptionProtector =
            EncryptionProtector(
                cbTotalLength = cbTotalLength,
                pUserSidCtorArg = pUserSid,
                lpProtectorDescriptorCtorArg = lpProtectorDescriptor,
            )
    }
}

public class EncryptionProtectorList internal constructor(
    public var nProtectors: UInt,
    pProtectorsCtorArg: MutPtr<MutPtr<EncryptionProtector>>,
) {
    public var pProtectors: MutPtr<MutPtr<EncryptionProtector>> = pProtectorsCtorArg
        internal set

    public constructor() : this(
        nProtectors = 0u,
        pProtectorsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.nProtectors

    public operator fun component2(): MutPtr<MutPtr<EncryptionProtector>> = this.pProtectors

    public fun copy(nProtectors: UInt = this.nProtectors, pProtectors: MutPtr<MutPtr<EncryptionProtector>> = this.pProtectors): EncryptionProtectorList = EncryptionProtectorList(nProtectors = nProtectors, pProtectorsCtorArg = pProtectors)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncryptionProtectorList) return false
        if (this.nProtectors != other.nProtectors) return false
        if (this.pProtectors != other.pProtectors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nProtectors.hashCode()
        result = 31 * result + this.pProtectors.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionProtectorList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptionProtectorList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EncryptionProtectorList =
                    EncryptionProtectorList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<EncryptionProtector>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EncryptionProtectorList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nProtectors)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<EncryptionProtector>>(64)
                    ).writeNative(addr + 8L, value.pProtectors)
                }
            }

        public operator fun invoke(
            nProtectors: UInt = 0u,
            pProtectors: MutPtr<MutPtr<EncryptionProtector>> = MutPtr(0L),
        ): EncryptionProtectorList =
            EncryptionProtectorList(
                nProtectors = nProtectors,
                pProtectorsCtorArg = pProtectors,
            )
    }
}

public class FhOverlapped internal constructor(
    public var internal: Int,
    public var internalHigh: Int,
    public var offset: UInt,
    public var offsetHigh: UInt,
    hEventCtorArg: Handle,
    public var pfnCompletion: PfnIoCompletion,
    public var reserved1: Int,
    public var reserved2: Int,
    public var reserved3: Int,
    public var reserved4: Int,
) {
    public var hEvent: Handle = hEventCtorArg
        internal set

    public constructor() : this(
        internal = 0,
        internalHigh = 0,
        offset = 0u,
        offsetHigh = 0u,
        hEventCtorArg = MutPtr(0L),
        pfnCompletion = null,
        reserved1 = 0,
        reserved2 = 0,
        reserved3 = 0,
        reserved4 = 0,
    )

    public operator fun component1(): Int = this.internal

    public operator fun component2(): Int = this.internalHigh

    public operator fun component3(): UInt = this.offset

    public operator fun component4(): UInt = this.offsetHigh

    public operator fun component5(): Handle = this.hEvent

    public operator fun component6(): PfnIoCompletion = this.pfnCompletion

    public operator fun component7(): Int = this.reserved1

    public operator fun component8(): Int = this.reserved2

    public operator fun component9(): Int = this.reserved3

    public operator fun component10(): Int = this.reserved4

    public fun copy(internal: Int = this.internal, internalHigh: Int = this.internalHigh, offset: UInt = this.offset, offsetHigh: UInt = this.offsetHigh, hEvent: Handle = this.hEvent, pfnCompletion: PfnIoCompletion = this.pfnCompletion, reserved1: Int = this.reserved1, reserved2: Int = this.reserved2, reserved3: Int = this.reserved3, reserved4: Int = this.reserved4): FhOverlapped = FhOverlapped(internal = internal, internalHigh = internalHigh, offset = offset, offsetHigh = offsetHigh, hEventCtorArg = hEvent, pfnCompletion = pfnCompletion, reserved1 = reserved1, reserved2 = reserved2, reserved3 = reserved3, reserved4 = reserved4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FhOverlapped) return false
        if (this.internal != other.internal) return false
        if (this.internalHigh != other.internalHigh) return false
        if (this.offset != other.offset) return false
        if (this.offsetHigh != other.offsetHigh) return false
        if (this.hEvent != other.hEvent) return false
        if (this.pfnCompletion != other.pfnCompletion) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.reserved4 != other.reserved4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.internal.hashCode()
        result = 31 * result + this.internalHigh.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.offsetHigh.hashCode()
        result = 31 * result + this.hEvent.hashCode()
        result = 31 * result + this.pfnCompletion.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.reserved4.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            internal: Int = 0,
            internalHigh: Int = 0,
            offset: UInt = 0u,
            offsetHigh: UInt = 0u,
            hEvent: Handle = MutPtr(0L),
            pfnCompletion: PfnIoCompletion = null,
            reserved1: Int = 0,
            reserved2: Int = 0,
            reserved3: Int = 0,
            reserved4: Int = 0,
        ): FhOverlapped =
            FhOverlapped(
                internal = internal,
                internalHigh = internalHigh,
                offset = offset,
                offsetHigh = offsetHigh,
                hEventCtorArg = hEvent,
                pfnCompletion = pfnCompletion,
                reserved1 = reserved1,
                reserved2 = reserved2,
                reserved3 = reserved3,
                reserved4 = reserved4,
            )
    }
}

public data class FileAlignmentInfo(
    public var alignmentRequirement: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAlignmentInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAlignmentInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileAlignmentInfo =
                    FileAlignmentInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileAlignmentInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.alignmentRequirement)
                }
            }
    }
}

public data class FileAllocationInfo(
    public var allocationSize: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllocationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllocationInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileAllocationInfo =
                    FileAllocationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileAllocationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.allocationSize)
                }
            }
    }
}

public data class FileAttributeTagInfo(
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAttributeTagInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAttributeTagInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileAttributeTagInfo =
                    FileAttributeTagInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileAttributeTagInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reparseTag)
                }
            }
    }
}

public data class FileBasicInfo(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileBasicInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileBasicInfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileBasicInfo =
                    FileBasicInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FileBasicInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fileAttributes)
                }
            }
    }
}

public data class FileCaseSensitiveInfo(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCaseSensitiveInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCaseSensitiveInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileCaseSensitiveInfo =
                    FileCaseSensitiveInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileCaseSensitiveInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class FileCompressionInfo(
    public var compressedFileSize: Long = 0L,
    public var compressionFormat: CompressionFormat = 0u,
    public var compressionUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileCompressionInfo) return false
        if (this.compressedFileSize != other.compressedFileSize) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (this.compressionUnitShift != other.compressionUnitShift) return false
        if (this.chunkShift != other.chunkShift) return false
        if (this.clusterShift != other.clusterShift) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressedFileSize.hashCode()
        result = 31 * result + this.compressionFormat.hashCode()
        result = 31 * result + this.compressionUnitShift.hashCode()
        result = 31 * result + this.chunkShift.hashCode()
        result = 31 * result + this.clusterShift.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCompressionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCompressionInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileCompressionInfo =
                    FileCompressionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L),
                    )
                override fun writeNative(addr: Long, value: FileCompressionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.compressedFileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.compressionFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.compressionUnitShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.chunkShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.clusterShift)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved)
                }
            }
    }
}

public data class FileDispositionInfo(
    public var deleteFile: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInfo> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FileDispositionInfo =
                    FileDispositionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileDispositionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.deleteFile)
                }
            }
    }
}

public data class FileDispositionInfoEx(
    public var flags: FileDispositionInfoExFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInfoEx> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileDispositionInfoEx =
                    FileDispositionInfoEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileDispositionInfoEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class FileEndOfFileInfo(
    public var endOfFile: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEndOfFileInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEndOfFileInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileEndOfFileInfo =
                    FileEndOfFileInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileEndOfFileInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.endOfFile)
                }
            }
    }
}

public data class FileExtent(
    public var volumeOffset: ULong = 0uL,
    public var extentLength: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileExtent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileExtent> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileExtent =
                    FileExtent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileExtent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.volumeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.extentLength)
                }
            }
    }
}

public data class FileFullDirInfo(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFullDirInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFullDirInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFullDirInfo> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileFullDirInfo =
                    FileFullDirInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: FileFullDirInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eaSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 68L, value.fileName)
                }
            }
    }
}

public data class FileId128(
    public var identifier: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileId128) return false
        if (!this.identifier.contentEquals(other.identifier)) return false
        return true
    }

    override fun hashCode(): Int = this.identifier.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileId128> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileId128> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FileId128 =
                    FileId128(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileId128) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.identifier)
                }
            }
    }
}

public data class FileIdBothDirInfo(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var shortNameLength: Byte = 0,
    public var shortName: UShortArray = UShortArray(12),
    public var fileId: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdBothDirInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.shortNameLength != other.shortNameLength) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.shortNameLength.hashCode()
        result = 31 * result + this.shortName.contentHashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdBothDirInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdBothDirInfo> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileIdBothDirInfo =
                    FileIdBothDirInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 68L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                        ).readNative(addr + 70L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: FileIdBothDirInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 68L, value.shortNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                    ).writeNative(addr + 70L, value.shortName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.fileId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 104L, value.fileName)
                }
            }
    }
}

public data class FileIdDescriptor(
    public var dwSize: UInt = 0u,
    public var type: FileIdType = 0,
    public var anonymous: FileIdDescriptor0 = FileIdDescriptor0(),
)

public data class FileIdDescriptor0(
    public var fileId: Long = 0L,
    public var objectId: Guid = Guid(),
    public var extendedFileId: FileId128 = FileId128(),
)

public data class FileIdExtdDirInfo(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var reparsePointTag: UInt = 0u,
    public var fileId: FileId128 = FileId128(),
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdExtdDirInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.reparsePointTag != other.reparsePointTag) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.reparsePointTag.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdExtdDirInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdExtdDirInfo> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileIdExtdDirInfo =
                    FileIdExtdDirInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (FileId128.typeLayout()).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: FileIdExtdDirInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.reparsePointTag)
                    (FileId128.typeLayout()).writeNative(addr + 72L, value.fileId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 88L, value.fileName)
                }
            }
    }
}

public data class FileIdInfo(
    public var volumeSerialNumber: ULong = 0uL,
    public var fileId: FileId128 = FileId128(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileIdInfo =
                    FileIdInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (FileId128.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileIdInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.volumeSerialNumber)
                    (FileId128.typeLayout()).writeNative(addr + 8L, value.fileId)
                }
            }
    }
}

public data class FileInfo2(
    public var fi2Id: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInfo2> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileInfo2 =
                    FileInfo2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileInfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fi2Id)
                }
            }
    }
}

public class FileInfo3 internal constructor(
    public var fi3Id: UInt,
    public var fi3Permissions: FileInfoFlagsPermissions,
    public var fi3NumLocks: UInt,
    fi3PathnameCtorArg: Pwstr,
    fi3UsernameCtorArg: Pwstr,
) {
    public var fi3Pathname: Pwstr = fi3PathnameCtorArg
        internal set

    public var fi3Username: Pwstr = fi3UsernameCtorArg
        internal set

    public constructor() : this(
        fi3Id = 0u,
        fi3Permissions = 0u,
        fi3NumLocks = 0u,
        fi3PathnameCtorArg = MutPtr(0L),
        fi3UsernameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.fi3Id

    public operator fun component2(): FileInfoFlagsPermissions = this.fi3Permissions

    public operator fun component3(): UInt = this.fi3NumLocks

    public operator fun component4(): Pwstr = this.fi3Pathname

    public operator fun component5(): Pwstr = this.fi3Username

    public fun copy(fi3Id: UInt = this.fi3Id, fi3Permissions: FileInfoFlagsPermissions = this.fi3Permissions, fi3NumLocks: UInt = this.fi3NumLocks, fi3Pathname: Pwstr = this.fi3Pathname, fi3Username: Pwstr = this.fi3Username): FileInfo3 = FileInfo3(fi3Id = fi3Id, fi3Permissions = fi3Permissions, fi3NumLocks = fi3NumLocks, fi3PathnameCtorArg = fi3Pathname, fi3UsernameCtorArg = fi3Username)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileInfo3) return false
        if (this.fi3Id != other.fi3Id) return false
        if (this.fi3Permissions != other.fi3Permissions) return false
        if (this.fi3NumLocks != other.fi3NumLocks) return false
        if (this.fi3Pathname != other.fi3Pathname) return false
        if (this.fi3Username != other.fi3Username) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fi3Id.hashCode()
        result = 31 * result + this.fi3Permissions.hashCode()
        result = 31 * result + this.fi3NumLocks.hashCode()
        result = 31 * result + this.fi3Pathname.hashCode()
        result = 31 * result + this.fi3Username.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fi3Id: UInt = 0u,
            fi3Permissions: FileInfoFlagsPermissions = 0u,
            fi3NumLocks: UInt = 0u,
            fi3Pathname: Pwstr = MutPtr(0L),
            fi3Username: Pwstr = MutPtr(0L),
        ): FileInfo3 =
            FileInfo3(
                fi3Id = fi3Id,
                fi3Permissions = fi3Permissions,
                fi3NumLocks = fi3NumLocks,
                fi3PathnameCtorArg = fi3Pathname,
                fi3UsernameCtorArg = fi3Username,
            )
    }
}

public data class FileIoPriorityHintInfo(
    public var priorityHint: PriorityHint = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoPriorityHintInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIoPriorityHintInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileIoPriorityHintInfo =
                    FileIoPriorityHintInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileIoPriorityHintInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.priorityHint)
                }
            }
    }
}

public data class FileNameInfo(
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNameInfo) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNameInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNameInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileNameInfo =
                    FileNameInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileNameInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.fileName)
                }
            }
    }
}

public data class FileNotifyExtendedInformation(
    public var nextEntryOffset: UInt = 0u,
    public var action: FileAction = 0u,
    public var creationTime: Long = 0L,
    public var lastModificationTime: Long = 0L,
    public var lastChangeTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var allocatedLength: Long = 0L,
    public var fileSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var anonymous: FileNotifyExtendedInformation0 = FileNotifyExtendedInformation0(),
    public var fileId: Long = 0L,
    public var parentFileId: Long = 0L,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNotifyExtendedInformation) return false
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
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileNotifyExtendedInformation0(
    public var reparsePointTag: UInt = 0u,
    public var eaSize: UInt = 0u,
)

public data class FileNotifyInformation(
    public var nextEntryOffset: UInt = 0u,
    public var action: FileAction = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNotifyInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.action != other.action) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNotifyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNotifyInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileNotifyInformation =
                    FileNotifyInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileNotifyInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.fileName)
                }
            }
    }
}

public data class FileRemoteProtocolInfo(
    public var structureVersion: UShort = 0u,
    public var structureSize: UShort = 0u,
    public var protocol: UInt = 0u,
    public var protocolMajorVersion: UShort = 0u,
    public var protocolMinorVersion: UShort = 0u,
    public var protocolRevision: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var genericReserved: FileRemoteProtocolInfo0 = FileRemoteProtocolInfo0(),
    public var protocolSpecific: FileRemoteProtocolInfo1 = FileRemoteProtocolInfo1(),
)

public data class FileRemoteProtocolInfo0(
    public var reserved: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInfo0) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInfo0 =
                    FileRemoteProtocolInfo0(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInfo0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class FileRemoteProtocolInfo1(
    public var smb2: FileRemoteProtocolInfo10 = FileRemoteProtocolInfo10(),
    public var reserved: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInfo1) return false
        if (this.smb2 != other.smb2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.smb2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FileRemoteProtocolInfo10(
    public var server: FileRemoteProtocolInfo100 = FileRemoteProtocolInfo100(),
    public var share: FileRemoteProtocolInfo101 = FileRemoteProtocolInfo101(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo10> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInfo10 =
                    FileRemoteProtocolInfo10(
                        (FileRemoteProtocolInfo100.typeLayout()).readNative(addr),
                        (FileRemoteProtocolInfo101.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInfo10) {
                    (FileRemoteProtocolInfo100.typeLayout()).writeNative(addr, value.server)
                    (FileRemoteProtocolInfo101.typeLayout()).writeNative(addr + 4L, value.share)
                }
            }
    }
}

public data class FileRemoteProtocolInfo100(
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo100> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo100> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInfo100 =
                    FileRemoteProtocolInfo100(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInfo100) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                }
            }
    }
}

public data class FileRemoteProtocolInfo101(
    public var capabilities: UInt = 0u,
    public var shareFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo101> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInfo101> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInfo101 =
                    FileRemoteProtocolInfo101(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInfo101) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.shareFlags)
                }
            }
    }
}

public class FileRenameInfo internal constructor(
    public var anonymous: FileRenameInfo0,
    rootDirectoryCtorArg: Handle,
    public var fileNameLength: UInt,
    public var fileName: UShortArray,
) {
    public var rootDirectory: Handle = rootDirectoryCtorArg
        internal set

    public constructor() : this(
        anonymous = FileRenameInfo0(),
        rootDirectoryCtorArg = MutPtr(0L),
        fileNameLength = 0u,
        fileName = UShortArray(1),
    )

    public operator fun component1(): FileRenameInfo0 = this.anonymous

    public operator fun component2(): Handle = this.rootDirectory

    public operator fun component3(): UInt = this.fileNameLength

    public operator fun component4(): UShortArray = this.fileName

    public fun copy(anonymous: FileRenameInfo0 = this.anonymous, rootDirectory: Handle = this.rootDirectory, fileNameLength: UInt = this.fileNameLength, fileName: UShortArray = this.fileName): FileRenameInfo = FileRenameInfo(anonymous = anonymous, rootDirectoryCtorArg = rootDirectory, fileNameLength = fileNameLength, fileName = fileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRenameInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: FileRenameInfo0 = FileRenameInfo0(),
            rootDirectory: Handle = MutPtr(0L),
            fileNameLength: UInt = 0u,
            fileName: UShortArray = UShortArray(1),
        ): FileRenameInfo =
            FileRenameInfo(
                anonymous = anonymous,
                rootDirectoryCtorArg = rootDirectory,
                fileNameLength = fileNameLength,
                fileName = fileName,
            )
    }
}

public data class FileRenameInfo0(
    public var replaceIfExists: Boolean = false,
    public var flags: UInt = 0u,
)

public class FileSegmentElement internal constructor(
    bufferCtorArg: MutPtr<CVoid>,
    public var alignment: ULong,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        alignment = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.buffer

    public operator fun component2(): ULong = this.alignment

    public fun copy(buffer: MutPtr<CVoid> = this.buffer, alignment: ULong = this.alignment): FileSegmentElement = FileSegmentElement(bufferCtorArg = buffer, alignment = alignment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileSegmentElement) return false
        if (this.buffer != other.buffer) return false
        if (this.alignment != other.alignment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.alignment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            buffer: MutPtr<CVoid> = MutPtr(0L),
            alignment: ULong = 0uL,
        ): FileSegmentElement =
            FileSegmentElement(
                bufferCtorArg = buffer,
                alignment = alignment,
            )
    }
}

public data class FileStandardInfo(
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var numberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileStandardInfo =
                    FileStandardInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 21L),
                    )
                override fun writeNative(addr: Long, value: FileStandardInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfLinks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.deletePending)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 21L, value.directory)
                }
            }
    }
}

public data class FileStorageInfo(
    public var logicalBytesPerSector: UInt = 0u,
    public var physicalBytesPerSectorForAtomicity: UInt = 0u,
    public var physicalBytesPerSectorForPerformance: UInt = 0u,
    public var fileSystemEffectivePhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var flags: UInt = 0u,
    public var byteOffsetForSectorAlignment: UInt = 0u,
    public var byteOffsetForPartitionAlignment: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStorageInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStorageInfo> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileStorageInfo =
                    FileStorageInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FileStorageInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.logicalBytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.physicalBytesPerSectorForAtomicity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.physicalBytesPerSectorForPerformance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fileSystemEffectivePhysicalBytesPerSectorForAtomicity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.byteOffsetForSectorAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.byteOffsetForPartitionAlignment)
                }
            }
    }
}

public data class FileStreamInfo(
    public var nextEntryOffset: UInt = 0u,
    public var streamNameLength: UInt = 0u,
    public var streamSize: Long = 0L,
    public var streamAllocationSize: Long = 0L,
    public var streamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileStreamInfo) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.streamNameLength != other.streamNameLength) return false
        if (this.streamSize != other.streamSize) return false
        if (this.streamAllocationSize != other.streamAllocationSize) return false
        if (!this.streamName.contentEquals(other.streamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.streamNameLength.hashCode()
        result = 31 * result + this.streamSize.hashCode()
        result = 31 * result + this.streamAllocationSize.hashCode()
        result = 31 * result + this.streamName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStreamInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStreamInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileStreamInfo =
                    FileStreamInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FileStreamInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.streamNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.streamSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.streamAllocationSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.streamName)
                }
            }
    }
}

public class FioContext internal constructor(
    public var mDwTempHack: UInt,
    public var mDwSignature: UInt,
    mHFileCtorArg: Handle,
    public var mDwLinesOffset: UInt,
    public var mDwHeaderLength: UInt,
) {
    public var mHFile: Handle = mHFileCtorArg
        internal set

    public constructor() : this(
        mDwTempHack = 0u,
        mDwSignature = 0u,
        mHFileCtorArg = MutPtr(0L),
        mDwLinesOffset = 0u,
        mDwHeaderLength = 0u,
    )

    public operator fun component1(): UInt = this.mDwTempHack

    public operator fun component2(): UInt = this.mDwSignature

    public operator fun component3(): Handle = this.mHFile

    public operator fun component4(): UInt = this.mDwLinesOffset

    public operator fun component5(): UInt = this.mDwHeaderLength

    public fun copy(mDwTempHack: UInt = this.mDwTempHack, mDwSignature: UInt = this.mDwSignature, mHFile: Handle = this.mHFile, mDwLinesOffset: UInt = this.mDwLinesOffset, mDwHeaderLength: UInt = this.mDwHeaderLength): FioContext = FioContext(mDwTempHack = mDwTempHack, mDwSignature = mDwSignature, mHFileCtorArg = mHFile, mDwLinesOffset = mDwLinesOffset, mDwHeaderLength = mDwHeaderLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FioContext) return false
        if (this.mDwTempHack != other.mDwTempHack) return false
        if (this.mDwSignature != other.mDwSignature) return false
        if (this.mHFile != other.mHFile) return false
        if (this.mDwLinesOffset != other.mDwLinesOffset) return false
        if (this.mDwHeaderLength != other.mDwHeaderLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mDwTempHack.hashCode()
        result = 31 * result + this.mDwSignature.hashCode()
        result = 31 * result + this.mHFile.hashCode()
        result = 31 * result + this.mDwLinesOffset.hashCode()
        result = 31 * result + this.mDwHeaderLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mDwTempHack: UInt = 0u,
            mDwSignature: UInt = 0u,
            mHFile: Handle = MutPtr(0L),
            mDwLinesOffset: UInt = 0u,
            mDwHeaderLength: UInt = 0u,
        ): FioContext =
            FioContext(
                mDwTempHack = mDwTempHack,
                mDwSignature = mDwSignature,
                mHFileCtorArg = mHFile,
                mDwLinesOffset = mDwLinesOffset,
                mDwHeaderLength = mDwHeaderLength,
            )
    }
}

public class IoringBufferInfo internal constructor(
    addressCtorArg: MutPtr<CVoid>,
    public var length: UInt,
) {
    public var address: MutPtr<CVoid> = addressCtorArg
        internal set

    public constructor() : this(
        addressCtorArg = MutPtr(0L),
        length = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.address

    public operator fun component2(): UInt = this.length

    public fun copy(address: MutPtr<CVoid> = this.address, length: UInt = this.length): IoringBufferInfo = IoringBufferInfo(addressCtorArg = address, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoringBufferInfo) return false
        if (this.address != other.address) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringBufferInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringBufferInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoringBufferInfo =
                    IoringBufferInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoringBufferInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                }
            }

        public operator fun invoke(
            address: MutPtr<CVoid> = MutPtr(0L),
            length: UInt = 0u,
        ): IoringBufferInfo =
            IoringBufferInfo(
                addressCtorArg = address,
                length = length,
            )
    }
}

public data class IoringBufferRef(
    public var kind: IoringRefKind = 0,
    public var buffer: IoringBufferRef0 = IoringBufferRef0(),
)

public class IoringBufferRef0 internal constructor(
    addressCtorArg: MutPtr<CVoid>,
    public var indexAndOffset: IoringRegisteredBuffer,
) {
    public var address: MutPtr<CVoid> = addressCtorArg
        internal set

    public constructor() : this(
        addressCtorArg = MutPtr(0L),
        indexAndOffset = IoringRegisteredBuffer(),
    )

    public operator fun component1(): MutPtr<CVoid> = this.address

    public operator fun component2(): IoringRegisteredBuffer = this.indexAndOffset

    public fun copy(address: MutPtr<CVoid> = this.address, indexAndOffset: IoringRegisteredBuffer = this.indexAndOffset): IoringBufferRef0 = IoringBufferRef0(addressCtorArg = address, indexAndOffset = indexAndOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoringBufferRef0) return false
        if (this.address != other.address) return false
        if (this.indexAndOffset != other.indexAndOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.indexAndOffset.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            address: MutPtr<CVoid> = MutPtr(0L),
            indexAndOffset: IoringRegisteredBuffer = IoringRegisteredBuffer(),
        ): IoringBufferRef0 =
            IoringBufferRef0(
                addressCtorArg = address,
                indexAndOffset = indexAndOffset,
            )
    }
}

public data class IoringCapabilities(
    public var maxVersion: IoringVersion = 0,
    public var maxSubmissionQueueSize: UInt = 0u,
    public var maxCompletionQueueSize: UInt = 0u,
    public var featureFlags: IoringFeatureFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringCapabilities> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoringCapabilities =
                    IoringCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IoringCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.maxVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxSubmissionQueueSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxCompletionQueueSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.featureFlags)
                }
            }
    }
}

public data class IoringCqe(
    public var userData: Int = 0,
    public var resultCode: Hresult = 0,
    public var information: Int = 0,
)

public data class IoringCreateFlags(
    public var required: IoringCreateRequiredFlags = 0,
    public var advisory: IoringCreateAdvisoryFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringCreateFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringCreateFlags> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoringCreateFlags =
                    IoringCreateFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoringCreateFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.required)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.advisory)
                }
            }
    }
}

public data class IoringHandleRef(
    public var kind: IoringRefKind = 0,
    public var handle: IoringHandleRef0 = IoringHandleRef0(),
)

public class IoringHandleRef0 internal constructor(
    handleCtorArg: Handle,
    public var index: UInt,
) {
    public var handle: Handle = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        index = 0u,
    )

    public operator fun component1(): Handle = this.handle

    public operator fun component2(): UInt = this.index

    public fun copy(handle: Handle = this.handle, index: UInt = this.index): IoringHandleRef0 = IoringHandleRef0(handleCtorArg = handle, index = index)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoringHandleRef0) return false
        if (this.handle != other.handle) return false
        if (this.index != other.index) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.index.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handle: Handle = MutPtr(0L),
            index: UInt = 0u,
        ): IoringHandleRef0 =
            IoringHandleRef0(
                handleCtorArg = handle,
                index = index,
            )
    }
}

public data class IoringInfo(
    public var ioRingVersion: IoringVersion = 0,
    public var flags: IoringCreateFlags = IoringCreateFlags(),
    public var submissionQueueSize: UInt = 0u,
    public var completionQueueSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringInfo> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoringInfo =
                    IoringInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (IoringCreateFlags.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoringInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ioRingVersion)
                    (IoringCreateFlags.typeLayout()).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.submissionQueueSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.completionQueueSize)
                }
            }
    }
}

public data class IoringRegisteredBuffer(
    public var bufferIndex: UInt = 0u,
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringRegisteredBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoringRegisteredBuffer> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoringRegisteredBuffer =
                    IoringRegisteredBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoringRegisteredBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bufferIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offset)
                }
            }
    }
}

public data class KcrmMarshalHeader(
    public var versionMajor: UInt = 0u,
    public var versionMinor: UInt = 0u,
    public var numProtocols: UInt = 0u,
    public var unused: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KcrmMarshalHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KcrmMarshalHeader> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KcrmMarshalHeader =
                    KcrmMarshalHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KcrmMarshalHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.versionMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.versionMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numProtocols)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.unused)
                }
            }
    }
}

public data class KcrmProtocolBlob(
    public var protocolId: Guid = Guid(),
    public var staticInfoLength: UInt = 0u,
    public var transactionIdInfoLength: UInt = 0u,
    public var unused1: UInt = 0u,
    public var unused2: UInt = 0u,
)

public data class KcrmTransactionBlob(
    public var uow: Guid = Guid(),
    public var tmIdentity: Guid = Guid(),
    public var isolationLevel: UInt = 0u,
    public var isolationFlags: UInt = 0u,
    public var timeout: UInt = 0u,
    public var description: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KcrmTransactionBlob) return false
        if (this.uow != other.uow) return false
        if (this.tmIdentity != other.tmIdentity) return false
        if (this.isolationLevel != other.isolationLevel) return false
        if (this.isolationFlags != other.isolationFlags) return false
        if (this.timeout != other.timeout) return false
        if (!this.description.contentEquals(other.description)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uow.hashCode()
        result = 31 * result + this.tmIdentity.hashCode()
        result = 31 * result + this.isolationLevel.hashCode()
        result = 31 * result + this.isolationFlags.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.description.contentHashCode()
        return result
    }
}

public class LogManagementCallbacks internal constructor(
    callbackContextCtorArg: MutPtr<CVoid>,
    public var advanceTailCallback: PlogTailAdvanceCallback,
    public var logFullHandlerCallback: PlogFullHandlerCallback,
    public var logUnpinnedCallback: PlogUnpinnedCallback,
) {
    public var callbackContext: MutPtr<CVoid> = callbackContextCtorArg
        internal set

    public constructor() : this(
        callbackContextCtorArg = MutPtr(0L),
        advanceTailCallback = null,
        logFullHandlerCallback = null,
        logUnpinnedCallback = null,
    )

    public operator fun component1(): MutPtr<CVoid> = this.callbackContext

    public operator fun component2(): PlogTailAdvanceCallback = this.advanceTailCallback

    public operator fun component3(): PlogFullHandlerCallback = this.logFullHandlerCallback

    public operator fun component4(): PlogUnpinnedCallback = this.logUnpinnedCallback

    public fun copy(callbackContext: MutPtr<CVoid> = this.callbackContext, advanceTailCallback: PlogTailAdvanceCallback = this.advanceTailCallback, logFullHandlerCallback: PlogFullHandlerCallback = this.logFullHandlerCallback, logUnpinnedCallback: PlogUnpinnedCallback = this.logUnpinnedCallback): LogManagementCallbacks = LogManagementCallbacks(callbackContextCtorArg = callbackContext, advanceTailCallback = advanceTailCallback, logFullHandlerCallback = logFullHandlerCallback, logUnpinnedCallback = logUnpinnedCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LogManagementCallbacks) return false
        if (this.callbackContext != other.callbackContext) return false
        if (this.advanceTailCallback != other.advanceTailCallback) return false
        if (this.logFullHandlerCallback != other.logFullHandlerCallback) return false
        if (this.logUnpinnedCallback != other.logUnpinnedCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callbackContext.hashCode()
        result = 31 * result + this.advanceTailCallback.hashCode()
        result = 31 * result + this.logFullHandlerCallback.hashCode()
        result = 31 * result + this.logUnpinnedCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callbackContext: MutPtr<CVoid> = MutPtr(0L),
            advanceTailCallback: PlogTailAdvanceCallback = null,
            logFullHandlerCallback: PlogFullHandlerCallback = null,
            logUnpinnedCallback: PlogUnpinnedCallback = null,
        ): LogManagementCallbacks =
            LogManagementCallbacks(
                callbackContextCtorArg = callbackContext,
                advanceTailCallback = advanceTailCallback,
                logFullHandlerCallback = logFullHandlerCallback,
                logUnpinnedCallback = logUnpinnedCallback,
            )
    }
}

public data class MediaLabelInfo(
    public var labelType: UShortArray = UShortArray(64),
    public var labelIDSize: UInt = 0u,
    public var labelID: UByteArray = UByteArray(256),
    public var labelAppDescr: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MediaLabelInfo) return false
        if (!this.labelType.contentEquals(other.labelType)) return false
        if (this.labelIDSize != other.labelIDSize) return false
        if (!this.labelID.contentEquals(other.labelID)) return false
        if (!this.labelAppDescr.contentEquals(other.labelAppDescr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.labelType.contentHashCode()
        result = 31 * result + this.labelIDSize.hashCode()
        result = 31 * result + this.labelID.contentHashCode()
        result = 31 * result + this.labelAppDescr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MediaLabelInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MediaLabelInfo> {
                override val sizeBytes: Long = 900L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MediaLabelInfo =
                    MediaLabelInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 132L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 388L),
                    )
                override fun writeNative(addr: Long, value: MediaLabelInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr, value.labelType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.labelIDSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 132L, value.labelID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 388L, value.labelAppDescr)
                }
            }
    }
}

public data class NameCacheContext(
    public var mDwSignature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NameCacheContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NameCacheContext> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NameCacheContext =
                    NameCacheContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NameCacheContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mDwSignature)
                }
            }
    }
}

public class NtmsAllocationInformation internal constructor(
    public var dwSize: UInt,
    lpReservedCtorArg: MutPtr<CVoid>,
    public var allocatedFrom: Guid,
) {
    public var lpReserved: MutPtr<CVoid> = lpReservedCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpReservedCtorArg = MutPtr(0L),
        allocatedFrom = Guid(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MutPtr<CVoid> = this.lpReserved

    public operator fun component3(): Guid = this.allocatedFrom

    public fun copy(dwSize: UInt = this.dwSize, lpReserved: MutPtr<CVoid> = this.lpReserved, allocatedFrom: Guid = this.allocatedFrom): NtmsAllocationInformation = NtmsAllocationInformation(dwSize = dwSize, lpReservedCtorArg = lpReserved, allocatedFrom = allocatedFrom)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsAllocationInformation) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpReserved != other.lpReserved) return false
        if (this.allocatedFrom != other.allocatedFrom) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpReserved.hashCode()
        result = 31 * result + this.allocatedFrom.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            lpReserved: MutPtr<CVoid> = MutPtr(0L),
            allocatedFrom: Guid = Guid(),
        ): NtmsAllocationInformation =
            NtmsAllocationInformation(
                dwSize = dwSize,
                lpReservedCtorArg = lpReserved,
                allocatedFrom = allocatedFrom,
            )
    }
}

public class NtmsAsyncIo internal constructor(
    public var operationId: Guid,
    public var eventId: Guid,
    public var dwOperationType: UInt,
    public var dwResult: UInt,
    public var dwAsyncState: UInt,
    hEventCtorArg: Handle,
    public var bOnStateChange: Bool,
) {
    public var hEvent: Handle = hEventCtorArg
        internal set

    public constructor() : this(
        operationId = Guid(),
        eventId = Guid(),
        dwOperationType = 0u,
        dwResult = 0u,
        dwAsyncState = 0u,
        hEventCtorArg = MutPtr(0L),
        bOnStateChange = 0,
    )

    public operator fun component1(): Guid = this.operationId

    public operator fun component2(): Guid = this.eventId

    public operator fun component3(): UInt = this.dwOperationType

    public operator fun component4(): UInt = this.dwResult

    public operator fun component5(): UInt = this.dwAsyncState

    public operator fun component6(): Handle = this.hEvent

    public operator fun component7(): Bool = this.bOnStateChange

    public fun copy(operationId: Guid = this.operationId, eventId: Guid = this.eventId, dwOperationType: UInt = this.dwOperationType, dwResult: UInt = this.dwResult, dwAsyncState: UInt = this.dwAsyncState, hEvent: Handle = this.hEvent, bOnStateChange: Bool = this.bOnStateChange): NtmsAsyncIo = NtmsAsyncIo(operationId = operationId, eventId = eventId, dwOperationType = dwOperationType, dwResult = dwResult, dwAsyncState = dwAsyncState, hEventCtorArg = hEvent, bOnStateChange = bOnStateChange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsAsyncIo) return false
        if (this.operationId != other.operationId) return false
        if (this.eventId != other.eventId) return false
        if (this.dwOperationType != other.dwOperationType) return false
        if (this.dwResult != other.dwResult) return false
        if (this.dwAsyncState != other.dwAsyncState) return false
        if (this.hEvent != other.hEvent) return false
        if (this.bOnStateChange != other.bOnStateChange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationId.hashCode()
        result = 31 * result + this.eventId.hashCode()
        result = 31 * result + this.dwOperationType.hashCode()
        result = 31 * result + this.dwResult.hashCode()
        result = 31 * result + this.dwAsyncState.hashCode()
        result = 31 * result + this.hEvent.hashCode()
        result = 31 * result + this.bOnStateChange.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            operationId: Guid = Guid(),
            eventId: Guid = Guid(),
            dwOperationType: UInt = 0u,
            dwResult: UInt = 0u,
            dwAsyncState: UInt = 0u,
            hEvent: Handle = MutPtr(0L),
            bOnStateChange: Bool = 0,
        ): NtmsAsyncIo =
            NtmsAsyncIo(
                operationId = operationId,
                eventId = eventId,
                dwOperationType = dwOperationType,
                dwResult = dwResult,
                dwAsyncState = dwAsyncState,
                hEventCtorArg = hEvent,
                bOnStateChange = bOnStateChange,
            )
    }
}

public data class NtmsChangerinformationa(
    public var number: UInt = 0u,
    public var changerType: Guid = Guid(),
    public var szSerialNumber: ByteArray = ByteArray(32),
    public var szRevision: ByteArray = ByteArray(32),
    public var szDeviceName: ByteArray = ByteArray(64),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var library: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangerinformationa) return false
        if (this.number != other.number) return false
        if (this.changerType != other.changerType) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.library != other.library) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.changerType.hashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.library.hashCode()
        return result
    }
}

public data class NtmsChangerinformationw(
    public var number: UInt = 0u,
    public var changerType: Guid = Guid(),
    public var szSerialNumber: UShortArray = UShortArray(32),
    public var szRevision: UShortArray = UShortArray(32),
    public var szDeviceName: UShortArray = UShortArray(64),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var library: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangerinformationw) return false
        if (this.number != other.number) return false
        if (this.changerType != other.changerType) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.library != other.library) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.changerType.hashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.library.hashCode()
        return result
    }
}

public data class NtmsChangertypeinformationa(
    public var szVendor: ByteArray = ByteArray(128),
    public var szProduct: ByteArray = ByteArray(128),
    public var deviceType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangertypeinformationa) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsChangertypeinformationa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsChangertypeinformationa> {
                override val sizeBytes: Long = 260L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NtmsChangertypeinformationa =
                    NtmsChangertypeinformationa(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L),
                    )
                override fun writeNative(addr: Long, value: NtmsChangertypeinformationa) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr, value.szVendor)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 128L, value.szProduct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.deviceType)
                }
            }
    }
}

public data class NtmsChangertypeinformationw(
    public var szVendor: UShortArray = UShortArray(128),
    public var szProduct: UShortArray = UShortArray(128),
    public var deviceType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsChangertypeinformationw) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsChangertypeinformationw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsChangertypeinformationw> {
                override val sizeBytes: Long = 516L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NtmsChangertypeinformationw =
                    NtmsChangertypeinformationw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                    )
                override fun writeNative(addr: Long, value: NtmsChangertypeinformationw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr, value.szVendor)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 256L, value.szProduct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.deviceType)
                }
            }
    }
}

public data class NtmsComputerinformation(
    public var dwLibRequestPurgeTime: UInt = 0u,
    public var dwOpRequestPurgeTime: UInt = 0u,
    public var dwLibRequestFlags: UInt = 0u,
    public var dwOpRequestFlags: UInt = 0u,
    public var dwMediaPoolPolicy: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsComputerinformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsComputerinformation> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NtmsComputerinformation =
                    NtmsComputerinformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NtmsComputerinformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLibRequestPurgeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwOpRequestPurgeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLibRequestFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwOpRequestFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMediaPoolPolicy)
                }
            }
    }
}

public data class NtmsDriveinformationa(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var driveType: Guid = Guid(),
    public var szDeviceName: ByteArray = ByteArray(64),
    public var szSerialNumber: ByteArray = ByteArray(32),
    public var szRevision: ByteArray = ByteArray(32),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var dwMountCount: UInt = 0u,
    public var lastCleanedTs: Systemtime = Systemtime(),
    public var savedPartitionId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var reserved: Guid = Guid(),
    public var dwDeferDismountDelay: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDriveinformationa) return false
        if (this.number != other.number) return false
        if (this.state != other.state) return false
        if (this.driveType != other.driveType) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.lastCleanedTs != other.lastCleanedTs) return false
        if (this.savedPartitionId != other.savedPartitionId) return false
        if (this.library != other.library) return false
        if (this.reserved != other.reserved) return false
        if (this.dwDeferDismountDelay != other.dwDeferDismountDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.driveType.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.lastCleanedTs.hashCode()
        result = 31 * result + this.savedPartitionId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.dwDeferDismountDelay.hashCode()
        return result
    }
}

public data class NtmsDriveinformationw(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var driveType: Guid = Guid(),
    public var szDeviceName: UShortArray = UShortArray(64),
    public var szSerialNumber: UShortArray = UShortArray(32),
    public var szRevision: UShortArray = UShortArray(32),
    public var scsiPort: UShort = 0u,
    public var scsiBus: UShort = 0u,
    public var scsiTarget: UShort = 0u,
    public var scsiLun: UShort = 0u,
    public var dwMountCount: UInt = 0u,
    public var lastCleanedTs: Systemtime = Systemtime(),
    public var savedPartitionId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var reserved: Guid = Guid(),
    public var dwDeferDismountDelay: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDriveinformationw) return false
        if (this.number != other.number) return false
        if (this.state != other.state) return false
        if (this.driveType != other.driveType) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szSerialNumber.contentEquals(other.szSerialNumber)) return false
        if (!this.szRevision.contentEquals(other.szRevision)) return false
        if (this.scsiPort != other.scsiPort) return false
        if (this.scsiBus != other.scsiBus) return false
        if (this.scsiTarget != other.scsiTarget) return false
        if (this.scsiLun != other.scsiLun) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.lastCleanedTs != other.lastCleanedTs) return false
        if (this.savedPartitionId != other.savedPartitionId) return false
        if (this.library != other.library) return false
        if (this.reserved != other.reserved) return false
        if (this.dwDeferDismountDelay != other.dwDeferDismountDelay) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.number.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.driveType.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szSerialNumber.contentHashCode()
        result = 31 * result + this.szRevision.contentHashCode()
        result = 31 * result + this.scsiPort.hashCode()
        result = 31 * result + this.scsiBus.hashCode()
        result = 31 * result + this.scsiTarget.hashCode()
        result = 31 * result + this.scsiLun.hashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.lastCleanedTs.hashCode()
        result = 31 * result + this.savedPartitionId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.dwDeferDismountDelay.hashCode()
        return result
    }
}

public data class NtmsDrivetypeinformationa(
    public var szVendor: ByteArray = ByteArray(128),
    public var szProduct: ByteArray = ByteArray(128),
    public var numberOfHeads: UInt = 0u,
    public var deviceType: FileDeviceType = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDrivetypeinformationa) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.numberOfHeads != other.numberOfHeads) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.numberOfHeads.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsDrivetypeinformationa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsDrivetypeinformationa> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NtmsDrivetypeinformationa =
                    NtmsDrivetypeinformationa(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 260L),
                    )
                override fun writeNative(addr: Long, value: NtmsDrivetypeinformationa) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr, value.szVendor)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 128L, value.szProduct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.numberOfHeads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 260L, value.deviceType)
                }
            }
    }
}

public data class NtmsDrivetypeinformationw(
    public var szVendor: UShortArray = UShortArray(128),
    public var szProduct: UShortArray = UShortArray(128),
    public var numberOfHeads: UInt = 0u,
    public var deviceType: FileDeviceType = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsDrivetypeinformationw) return false
        if (!this.szVendor.contentEquals(other.szVendor)) return false
        if (!this.szProduct.contentEquals(other.szProduct)) return false
        if (this.numberOfHeads != other.numberOfHeads) return false
        if (this.deviceType != other.deviceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVendor.contentHashCode()
        result = 31 * result + this.szProduct.contentHashCode()
        result = 31 * result + this.numberOfHeads.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsDrivetypeinformationw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsDrivetypeinformationw> {
                override val sizeBytes: Long = 520L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NtmsDrivetypeinformationw =
                    NtmsDrivetypeinformationw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 516L),
                    )
                override fun writeNative(addr: Long, value: NtmsDrivetypeinformationw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr, value.szVendor)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 256L, value.szProduct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.numberOfHeads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 516L, value.deviceType)
                }
            }
    }
}

public data class NtmsFilesystemInfo(
    public var fileSystemType: UShortArray = UShortArray(64),
    public var volumeName: UShortArray = UShortArray(256),
    public var serialNumber: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsFilesystemInfo) return false
        if (!this.fileSystemType.contentEquals(other.fileSystemType)) return false
        if (!this.volumeName.contentEquals(other.volumeName)) return false
        if (this.serialNumber != other.serialNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileSystemType.contentHashCode()
        result = 31 * result + this.volumeName.contentHashCode()
        result = 31 * result + this.serialNumber.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsFilesystemInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsFilesystemInfo> {
                override val sizeBytes: Long = 644L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NtmsFilesystemInfo =
                    NtmsFilesystemInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 640L),
                    )
                override fun writeNative(addr: Long, value: NtmsFilesystemInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr, value.fileSystemType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 128L, value.volumeName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 640L, value.serialNumber)
                }
            }
    }
}

public class NtmsI1Libraryinformation(
    public var libraryType: UInt = 0u,
    public var cleanerSlot: Guid = Guid(),
    public var cleanerSlotDefault: Guid = Guid(),
    public var librarySupportsDriveCleaning: Bool = 0,
    public var barCodeReaderInstalled: Bool = 0,
    public var inventoryMethod: UInt = 0u,
    public var dwCleanerUsesRemaining: UInt = 0u,
    public var firstDriveNumber: UInt = 0u,
    public var dwNumberOfDrives: UInt = 0u,
    public var firstSlotNumber: UInt = 0u,
    public var dwNumberOfSlots: UInt = 0u,
    public var firstDoorNumber: UInt = 0u,
    public var dwNumberOfDoors: UInt = 0u,
    public var firstPortNumber: UInt = 0u,
    public var dwNumberOfPorts: UInt = 0u,
    public var firstChangerNumber: UInt = 0u,
    public var dwNumberOfChangers: UInt = 0u,
    public var dwNumberOfMedia: UInt = 0u,
    public var dwNumberOfMediaTypes: UInt = 0u,
    public var dwNumberOfLibRequests: UInt = 0u,
    public var reserved: Guid = Guid(),
)

public data class NtmsI1Librequestinformationa(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Librequestinformationa) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Librequestinformationw(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Librequestinformationw) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Objectinformationa(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
    public var szDescription: ByteArray = ByteArray(127),
    public var info: NtmsI1Objectinformationa0 = NtmsI1Objectinformationa0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Objectinformationa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsI1Objectinformationa0(
    public var drive: NtmsDriveinformationa = NtmsDriveinformationa(),
    public var driveType: NtmsDrivetypeinformationa = NtmsDrivetypeinformationa(),
    public var library: NtmsI1Libraryinformation = NtmsI1Libraryinformation(),
    public var changer: NtmsChangerinformationa = NtmsChangerinformationa(),
    public var changerType: NtmsChangertypeinformationa = NtmsChangertypeinformationa(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsI1Pmidinformationa = NtmsI1Pmidinformationa(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsI1Partitioninformationa = NtmsI1Partitioninformationa(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsI1Librequestinformationa = NtmsI1Librequestinformationa(),
    public var opRequest: NtmsI1Oprequestinformationa = NtmsI1Oprequestinformationa(),
)

public data class NtmsI1Objectinformationw(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
    public var szDescription: UShortArray = UShortArray(127),
    public var info: NtmsI1Objectinformationw0 = NtmsI1Objectinformationw0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Objectinformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsI1Objectinformationw0(
    public var drive: NtmsDriveinformationw = NtmsDriveinformationw(),
    public var driveType: NtmsDrivetypeinformationw = NtmsDrivetypeinformationw(),
    public var library: NtmsI1Libraryinformation = NtmsI1Libraryinformation(),
    public var changer: NtmsChangerinformationw = NtmsChangerinformationw(),
    public var changerType: NtmsChangertypeinformationw = NtmsChangertypeinformationw(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsI1Pmidinformationw = NtmsI1Pmidinformationw(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsI1Partitioninformationw = NtmsI1Partitioninformationw(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsI1Librequestinformationw = NtmsI1Librequestinformationw(),
    public var opRequest: NtmsI1Oprequestinformationw = NtmsI1Oprequestinformationw(),
)

public data class NtmsI1Oprequestinformationa(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: ByteArray = ByteArray(127),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Oprequestinformationa) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Oprequestinformationw(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: UShortArray = UShortArray(127),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Oprequestinformationw) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsI1Partitioninformationa(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: ByteArray = ByteArray(64),
    public var szOmidLabelInfo: ByteArray = ByteArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Partitioninformationa) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        return result
    }
}

public data class NtmsI1Partitioninformationw(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: UShortArray = UShortArray(64),
    public var szOmidLabelInfo: UShortArray = UShortArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Partitioninformationw) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        return result
    }
}

public data class NtmsI1Pmidinformationa(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: ByteArray = ByteArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: ByteArray = ByteArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Pmidinformationa) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        return result
    }
}

public data class NtmsI1Pmidinformationw(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: UShortArray = UShortArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: UShortArray = UShortArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsI1Pmidinformationw) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        return result
    }
}

public data class NtmsIedoorinformation(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var maxOpenSecs: UShort = 0u,
    public var library: Guid = Guid(),
)

public data class NtmsIeportinformation(
    public var number: UInt = 0u,
    public var content: UInt = 0u,
    public var position: UInt = 0u,
    public var maxExtendSecs: UShort = 0u,
    public var library: Guid = Guid(),
)

public class NtmsLibraryinformation(
    public var libraryType: UInt = 0u,
    public var cleanerSlot: Guid = Guid(),
    public var cleanerSlotDefault: Guid = Guid(),
    public var librarySupportsDriveCleaning: Bool = 0,
    public var barCodeReaderInstalled: Bool = 0,
    public var inventoryMethod: UInt = 0u,
    public var dwCleanerUsesRemaining: UInt = 0u,
    public var firstDriveNumber: UInt = 0u,
    public var dwNumberOfDrives: UInt = 0u,
    public var firstSlotNumber: UInt = 0u,
    public var dwNumberOfSlots: UInt = 0u,
    public var firstDoorNumber: UInt = 0u,
    public var dwNumberOfDoors: UInt = 0u,
    public var firstPortNumber: UInt = 0u,
    public var dwNumberOfPorts: UInt = 0u,
    public var firstChangerNumber: UInt = 0u,
    public var dwNumberOfChangers: UInt = 0u,
    public var dwNumberOfMedia: UInt = 0u,
    public var dwNumberOfMediaTypes: UInt = 0u,
    public var dwNumberOfLibRequests: UInt = 0u,
    public var reserved: Guid = Guid(),
    public var autoRecovery: Bool = 0,
    public var dwFlags: UInt = 0u,
)

public data class NtmsLibrequestinformationa(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
    public var dwErrorCode: UInt = 0u,
    public var workItemId: Guid = Guid(),
    public var dwPriority: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsLibrequestinformationa) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        if (this.dwErrorCode != other.dwErrorCode) return false
        if (this.workItemId != other.workItemId) return false
        if (this.dwPriority != other.dwPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        result = 31 * result + this.dwErrorCode.hashCode()
        result = 31 * result + this.workItemId.hashCode()
        result = 31 * result + this.dwPriority.hashCode()
        return result
    }
}

public data class NtmsLibrequestinformationw(
    public var operationCode: UInt = 0u,
    public var operationOption: UInt = 0u,
    public var state: UInt = 0u,
    public var partitionId: Guid = Guid(),
    public var driveId: Guid = Guid(),
    public var physMediaId: Guid = Guid(),
    public var library: Guid = Guid(),
    public var slotId: Guid = Guid(),
    public var timeQueued: Systemtime = Systemtime(),
    public var timeCompleted: Systemtime = Systemtime(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
    public var dwErrorCode: UInt = 0u,
    public var workItemId: Guid = Guid(),
    public var dwPriority: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsLibrequestinformationw) return false
        if (this.operationCode != other.operationCode) return false
        if (this.operationOption != other.operationOption) return false
        if (this.state != other.state) return false
        if (this.partitionId != other.partitionId) return false
        if (this.driveId != other.driveId) return false
        if (this.physMediaId != other.physMediaId) return false
        if (this.library != other.library) return false
        if (this.slotId != other.slotId) return false
        if (this.timeQueued != other.timeQueued) return false
        if (this.timeCompleted != other.timeCompleted) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        if (this.dwErrorCode != other.dwErrorCode) return false
        if (this.workItemId != other.workItemId) return false
        if (this.dwPriority != other.dwPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operationCode.hashCode()
        result = 31 * result + this.operationOption.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.driveId.hashCode()
        result = 31 * result + this.physMediaId.hashCode()
        result = 31 * result + this.library.hashCode()
        result = 31 * result + this.slotId.hashCode()
        result = 31 * result + this.timeQueued.hashCode()
        result = 31 * result + this.timeCompleted.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        result = 31 * result + this.dwErrorCode.hashCode()
        result = 31 * result + this.workItemId.hashCode()
        result = 31 * result + this.dwPriority.hashCode()
        return result
    }
}

public data class NtmsLmidinformation(
    public var mediaPool: Guid = Guid(),
    public var dwNumberOfPartitions: UInt = 0u,
)

public data class NtmsMediapoolinformation(
    public var poolType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var parent: Guid = Guid(),
    public var allocationPolicy: UInt = 0u,
    public var deallocationPolicy: UInt = 0u,
    public var dwMaxAllocates: UInt = 0u,
    public var dwNumberOfPhysicalMedia: UInt = 0u,
    public var dwNumberOfLogicalMedia: UInt = 0u,
    public var dwNumberOfMediaPools: UInt = 0u,
)

public data class NtmsMediatypeinformation(
    public var mediaType: UInt = 0u,
    public var numberOfSides: UInt = 0u,
    public var readWriteCharacteristics: UInt = 0u,
    public var deviceType: FileDeviceType = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsMediatypeinformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsMediatypeinformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NtmsMediatypeinformation =
                    NtmsMediatypeinformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NtmsMediatypeinformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mediaType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfSides)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.readWriteCharacteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.deviceType)
                }
            }
    }
}

public class NtmsMountInformation internal constructor(
    public var dwSize: UInt,
    lpReservedCtorArg: MutPtr<CVoid>,
) {
    public var lpReserved: MutPtr<CVoid> = lpReservedCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MutPtr<CVoid> = this.lpReserved

    public fun copy(dwSize: UInt = this.dwSize, lpReserved: MutPtr<CVoid> = this.lpReserved): NtmsMountInformation = NtmsMountInformation(dwSize = dwSize, lpReservedCtorArg = lpReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsMountInformation) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpReserved != other.lpReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpReserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsMountInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtmsMountInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NtmsMountInformation =
                    NtmsMountInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NtmsMountInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lpReserved)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            lpReserved: MutPtr<CVoid> = MutPtr(0L),
        ): NtmsMountInformation =
            NtmsMountInformation(
                dwSize = dwSize,
                lpReservedCtorArg = lpReserved,
            )
    }
}

public data class NtmsNotificationinformation(
    public var dwOperation: UInt = 0u,
    public var objectId: Guid = Guid(),
)

public data class NtmsObjectinformationa(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: ByteArray = ByteArray(64),
    public var szDescription: ByteArray = ByteArray(127),
    public var info: NtmsObjectinformationa0 = NtmsObjectinformationa0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsObjectinformationa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsObjectinformationa0(
    public var drive: NtmsDriveinformationa = NtmsDriveinformationa(),
    public var driveType: NtmsDrivetypeinformationa = NtmsDrivetypeinformationa(),
    public var library: NtmsLibraryinformation = NtmsLibraryinformation(),
    public var changer: NtmsChangerinformationa = NtmsChangerinformationa(),
    public var changerType: NtmsChangertypeinformationa = NtmsChangertypeinformationa(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsPmidinformationa = NtmsPmidinformationa(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsPartitioninformationa = NtmsPartitioninformationa(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsLibrequestinformationa = NtmsLibrequestinformationa(),
    public var opRequest: NtmsOprequestinformationa = NtmsOprequestinformationa(),
    public var computer: NtmsComputerinformation = NtmsComputerinformation(),
)

public data class NtmsObjectinformationw(
    public var dwSize: UInt = 0u,
    public var dwType: UInt = 0u,
    public var created: Systemtime = Systemtime(),
    public var modified: Systemtime = Systemtime(),
    public var objectGuid: Guid = Guid(),
    public var enabled: Bool = 0,
    public var dwOperationalState: UInt = 0u,
    public var szName: UShortArray = UShortArray(64),
    public var szDescription: UShortArray = UShortArray(127),
    public var info: NtmsObjectinformationw0 = NtmsObjectinformationw0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsObjectinformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwType != other.dwType) return false
        if (this.created != other.created) return false
        if (this.modified != other.modified) return false
        if (this.objectGuid != other.objectGuid) return false
        if (this.enabled != other.enabled) return false
        if (this.dwOperationalState != other.dwOperationalState) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (this.info != other.info) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.created.hashCode()
        result = 31 * result + this.modified.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.dwOperationalState.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.info.hashCode()
        return result
    }
}

public data class NtmsObjectinformationw0(
    public var drive: NtmsDriveinformationw = NtmsDriveinformationw(),
    public var driveType: NtmsDrivetypeinformationw = NtmsDrivetypeinformationw(),
    public var library: NtmsLibraryinformation = NtmsLibraryinformation(),
    public var changer: NtmsChangerinformationw = NtmsChangerinformationw(),
    public var changerType: NtmsChangertypeinformationw = NtmsChangertypeinformationw(),
    public var storageSlot: NtmsStorageslotinformation = NtmsStorageslotinformation(),
    public var iEDoor: NtmsIedoorinformation = NtmsIedoorinformation(),
    public var iEPort: NtmsIeportinformation = NtmsIeportinformation(),
    public var physicalMedia: NtmsPmidinformationw = NtmsPmidinformationw(),
    public var logicalMedia: NtmsLmidinformation = NtmsLmidinformation(),
    public var partition: NtmsPartitioninformationw = NtmsPartitioninformationw(),
    public var mediaPool: NtmsMediapoolinformation = NtmsMediapoolinformation(),
    public var mediaType: NtmsMediatypeinformation = NtmsMediatypeinformation(),
    public var libRequest: NtmsLibrequestinformationw = NtmsLibrequestinformationw(),
    public var opRequest: NtmsOprequestinformationw = NtmsOprequestinformationw(),
    public var computer: NtmsComputerinformation = NtmsComputerinformation(),
)

public data class NtmsOprequestinformationa(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: ByteArray = ByteArray(256),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: ByteArray = ByteArray(64),
    public var szUser: ByteArray = ByteArray(64),
    public var szComputer: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsOprequestinformationa) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsOprequestinformationw(
    public var request: UInt = 0u,
    public var submitted: Systemtime = Systemtime(),
    public var state: UInt = 0u,
    public var szMessage: UShortArray = UShortArray(256),
    public var arg1Type: UInt = 0u,
    public var arg1: Guid = Guid(),
    public var arg2Type: UInt = 0u,
    public var arg2: Guid = Guid(),
    public var szApplication: UShortArray = UShortArray(64),
    public var szUser: UShortArray = UShortArray(64),
    public var szComputer: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsOprequestinformationw) return false
        if (this.request != other.request) return false
        if (this.submitted != other.submitted) return false
        if (this.state != other.state) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (this.arg1Type != other.arg1Type) return false
        if (this.arg1 != other.arg1) return false
        if (this.arg2Type != other.arg2Type) return false
        if (this.arg2 != other.arg2) return false
        if (!this.szApplication.contentEquals(other.szApplication)) return false
        if (!this.szUser.contentEquals(other.szUser)) return false
        if (!this.szComputer.contentEquals(other.szComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.request.hashCode()
        result = 31 * result + this.submitted.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.arg1Type.hashCode()
        result = 31 * result + this.arg1.hashCode()
        result = 31 * result + this.arg2Type.hashCode()
        result = 31 * result + this.arg2.hashCode()
        result = 31 * result + this.szApplication.contentHashCode()
        result = 31 * result + this.szUser.contentHashCode()
        result = 31 * result + this.szComputer.contentHashCode()
        return result
    }
}

public data class NtmsPartitioninformationa(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: ByteArray = ByteArray(64),
    public var szOmidLabelInfo: ByteArray = ByteArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
    public var capacity: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPartitioninformationa) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        if (this.capacity != other.capacity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        result = 31 * result + this.capacity.hashCode()
        return result
    }
}

public data class NtmsPartitioninformationw(
    public var physicalMedia: Guid = Guid(),
    public var logicalMedia: Guid = Guid(),
    public var state: UInt = 0u,
    public var side: UShort = 0u,
    public var dwOmidLabelIdLength: UInt = 0u,
    public var omidLabelId: UByteArray = UByteArray(255),
    public var szOmidLabelType: UShortArray = UShortArray(64),
    public var szOmidLabelInfo: UShortArray = UShortArray(256),
    public var dwMountCount: UInt = 0u,
    public var dwAllocateCount: UInt = 0u,
    public var capacity: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPartitioninformationw) return false
        if (this.physicalMedia != other.physicalMedia) return false
        if (this.logicalMedia != other.logicalMedia) return false
        if (this.state != other.state) return false
        if (this.side != other.side) return false
        if (this.dwOmidLabelIdLength != other.dwOmidLabelIdLength) return false
        if (!this.omidLabelId.contentEquals(other.omidLabelId)) return false
        if (!this.szOmidLabelType.contentEquals(other.szOmidLabelType)) return false
        if (!this.szOmidLabelInfo.contentEquals(other.szOmidLabelInfo)) return false
        if (this.dwMountCount != other.dwMountCount) return false
        if (this.dwAllocateCount != other.dwAllocateCount) return false
        if (this.capacity != other.capacity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMedia.hashCode()
        result = 31 * result + this.logicalMedia.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.side.hashCode()
        result = 31 * result + this.dwOmidLabelIdLength.hashCode()
        result = 31 * result + this.omidLabelId.contentHashCode()
        result = 31 * result + this.szOmidLabelType.contentHashCode()
        result = 31 * result + this.szOmidLabelInfo.contentHashCode()
        result = 31 * result + this.dwMountCount.hashCode()
        result = 31 * result + this.dwAllocateCount.hashCode()
        result = 31 * result + this.capacity.hashCode()
        return result
    }
}

public data class NtmsPmidinformationa(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: ByteArray = ByteArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: ByteArray = ByteArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
    public var dwMediaTypeCode: UInt = 0u,
    public var dwDensityCode: UInt = 0u,
    public var mountedPartition: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPmidinformationa) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        if (this.dwMediaTypeCode != other.dwMediaTypeCode) return false
        if (this.dwDensityCode != other.dwDensityCode) return false
        if (this.mountedPartition != other.mountedPartition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        result = 31 * result + this.dwMediaTypeCode.hashCode()
        result = 31 * result + this.dwDensityCode.hashCode()
        result = 31 * result + this.mountedPartition.hashCode()
        return result
    }
}

public data class NtmsPmidinformationw(
    public var currentLibrary: Guid = Guid(),
    public var mediaPool: Guid = Guid(),
    public var location: Guid = Guid(),
    public var locationType: UInt = 0u,
    public var mediaType: Guid = Guid(),
    public var homeSlot: Guid = Guid(),
    public var szBarCode: UShortArray = UShortArray(64),
    public var barCodeState: UInt = 0u,
    public var szSequenceNumber: UShortArray = UShortArray(32),
    public var mediaState: UInt = 0u,
    public var dwNumberOfPartitions: UInt = 0u,
    public var dwMediaTypeCode: UInt = 0u,
    public var dwDensityCode: UInt = 0u,
    public var mountedPartition: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtmsPmidinformationw) return false
        if (this.currentLibrary != other.currentLibrary) return false
        if (this.mediaPool != other.mediaPool) return false
        if (this.location != other.location) return false
        if (this.locationType != other.locationType) return false
        if (this.mediaType != other.mediaType) return false
        if (this.homeSlot != other.homeSlot) return false
        if (!this.szBarCode.contentEquals(other.szBarCode)) return false
        if (this.barCodeState != other.barCodeState) return false
        if (!this.szSequenceNumber.contentEquals(other.szSequenceNumber)) return false
        if (this.mediaState != other.mediaState) return false
        if (this.dwNumberOfPartitions != other.dwNumberOfPartitions) return false
        if (this.dwMediaTypeCode != other.dwMediaTypeCode) return false
        if (this.dwDensityCode != other.dwDensityCode) return false
        if (this.mountedPartition != other.mountedPartition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentLibrary.hashCode()
        result = 31 * result + this.mediaPool.hashCode()
        result = 31 * result + this.location.hashCode()
        result = 31 * result + this.locationType.hashCode()
        result = 31 * result + this.mediaType.hashCode()
        result = 31 * result + this.homeSlot.hashCode()
        result = 31 * result + this.szBarCode.contentHashCode()
        result = 31 * result + this.barCodeState.hashCode()
        result = 31 * result + this.szSequenceNumber.contentHashCode()
        result = 31 * result + this.mediaState.hashCode()
        result = 31 * result + this.dwNumberOfPartitions.hashCode()
        result = 31 * result + this.dwMediaTypeCode.hashCode()
        result = 31 * result + this.dwDensityCode.hashCode()
        result = 31 * result + this.mountedPartition.hashCode()
        return result
    }
}

public data class NtmsStorageslotinformation(
    public var number: UInt = 0u,
    public var state: UInt = 0u,
    public var library: Guid = Guid(),
)

public data class Ofstruct(
    public var cBytes: UByte = 0u,
    public var fFixedDisk: UByte = 0u,
    public var nErrCode: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var szPathName: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ofstruct) return false
        if (this.cBytes != other.cBytes) return false
        if (this.fFixedDisk != other.fFixedDisk) return false
        if (this.nErrCode != other.nErrCode) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (!this.szPathName.contentEquals(other.szPathName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBytes.hashCode()
        result = 31 * result + this.fFixedDisk.hashCode()
        result = 31 * result + this.nErrCode.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.szPathName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ofstruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ofstruct> {
                override val sizeBytes: Long = 136L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ofstruct =
                    Ofstruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ofstruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.cBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.fFixedDisk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nErrCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 8L, value.szPathName)
                }
            }
    }
}

public data class ReparseGuidDataBuffer(
    public var reparseTag: UInt = 0u,
    public var reparseDataLength: UShort = 0u,
    public var reserved: UShort = 0u,
    public var reparseGuid: Guid = Guid(),
    public var genericReparseBuffer: ReparseGuidDataBuffer0 = ReparseGuidDataBuffer0(),
)

public data class ReparseGuidDataBuffer0(
    public var dataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseGuidDataBuffer0) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int = this.dataBuffer.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseGuidDataBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseGuidDataBuffer0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): ReparseGuidDataBuffer0 =
                    ReparseGuidDataBuffer0(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReparseGuidDataBuffer0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr, value.dataBuffer)
                }
            }
    }
}

public class ServerAliasInfo0 internal constructor(
    srvai0AliasCtorArg: Pwstr,
    srvai0TargetCtorArg: Pwstr,
    public var srvai0Default: Boolean,
    public var srvai0Reserved: UInt,
) {
    public var srvai0Alias: Pwstr = srvai0AliasCtorArg
        internal set

    public var srvai0Target: Pwstr = srvai0TargetCtorArg
        internal set

    public constructor() : this(
        srvai0AliasCtorArg = MutPtr(0L),
        srvai0TargetCtorArg = MutPtr(0L),
        srvai0Default = false,
        srvai0Reserved = 0u,
    )

    public operator fun component1(): Pwstr = this.srvai0Alias

    public operator fun component2(): Pwstr = this.srvai0Target

    public operator fun component3(): Boolean = this.srvai0Default

    public operator fun component4(): UInt = this.srvai0Reserved

    public fun copy(srvai0Alias: Pwstr = this.srvai0Alias, srvai0Target: Pwstr = this.srvai0Target, srvai0Default: Boolean = this.srvai0Default, srvai0Reserved: UInt = this.srvai0Reserved): ServerAliasInfo0 = ServerAliasInfo0(srvai0AliasCtorArg = srvai0Alias, srvai0TargetCtorArg = srvai0Target, srvai0Default = srvai0Default, srvai0Reserved = srvai0Reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerAliasInfo0) return false
        if (this.srvai0Alias != other.srvai0Alias) return false
        if (this.srvai0Target != other.srvai0Target) return false
        if (this.srvai0Default != other.srvai0Default) return false
        if (this.srvai0Reserved != other.srvai0Reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srvai0Alias.hashCode()
        result = 31 * result + this.srvai0Target.hashCode()
        result = 31 * result + this.srvai0Default.hashCode()
        result = 31 * result + this.srvai0Reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            srvai0Alias: Pwstr = MutPtr(0L),
            srvai0Target: Pwstr = MutPtr(0L),
            srvai0Default: Boolean = false,
            srvai0Reserved: UInt = 0u,
        ): ServerAliasInfo0 =
            ServerAliasInfo0(
                srvai0AliasCtorArg = srvai0Alias,
                srvai0TargetCtorArg = srvai0Target,
                srvai0Default = srvai0Default,
                srvai0Reserved = srvai0Reserved,
            )
    }
}

public class ServerCertificateInfo0 internal constructor(
    srvci0NameCtorArg: Pwstr,
    srvci0SubjectCtorArg: Pwstr,
    srvci0IssuerCtorArg: Pwstr,
    srvci0ThumbprintCtorArg: Pwstr,
    srvci0FriendlynameCtorArg: Pwstr,
    srvci0NotbeforeCtorArg: Pwstr,
    srvci0NotafterCtorArg: Pwstr,
    srvci0StorelocationCtorArg: Pwstr,
    srvci0StorenameCtorArg: Pwstr,
    srvci0RenewalchainCtorArg: Pwstr,
    public var srvci0Type: UInt,
    public var srvci0Flags: UInt,
    public var srvci0MappingStatus: UInt,
) {
    public var srvci0Name: Pwstr = srvci0NameCtorArg
        internal set

    public var srvci0Subject: Pwstr = srvci0SubjectCtorArg
        internal set

    public var srvci0Issuer: Pwstr = srvci0IssuerCtorArg
        internal set

    public var srvci0Thumbprint: Pwstr = srvci0ThumbprintCtorArg
        internal set

    public var srvci0Friendlyname: Pwstr = srvci0FriendlynameCtorArg
        internal set

    public var srvci0Notbefore: Pwstr = srvci0NotbeforeCtorArg
        internal set

    public var srvci0Notafter: Pwstr = srvci0NotafterCtorArg
        internal set

    public var srvci0Storelocation: Pwstr = srvci0StorelocationCtorArg
        internal set

    public var srvci0Storename: Pwstr = srvci0StorenameCtorArg
        internal set

    public var srvci0Renewalchain: Pwstr = srvci0RenewalchainCtorArg
        internal set

    public constructor() : this(
        srvci0NameCtorArg = MutPtr(0L),
        srvci0SubjectCtorArg = MutPtr(0L),
        srvci0IssuerCtorArg = MutPtr(0L),
        srvci0ThumbprintCtorArg = MutPtr(0L),
        srvci0FriendlynameCtorArg = MutPtr(0L),
        srvci0NotbeforeCtorArg = MutPtr(0L),
        srvci0NotafterCtorArg = MutPtr(0L),
        srvci0StorelocationCtorArg = MutPtr(0L),
        srvci0StorenameCtorArg = MutPtr(0L),
        srvci0RenewalchainCtorArg = MutPtr(0L),
        srvci0Type = 0u,
        srvci0Flags = 0u,
        srvci0MappingStatus = 0u,
    )

    public operator fun component1(): Pwstr = this.srvci0Name

    public operator fun component2(): Pwstr = this.srvci0Subject

    public operator fun component3(): Pwstr = this.srvci0Issuer

    public operator fun component4(): Pwstr = this.srvci0Thumbprint

    public operator fun component5(): Pwstr = this.srvci0Friendlyname

    public operator fun component6(): Pwstr = this.srvci0Notbefore

    public operator fun component7(): Pwstr = this.srvci0Notafter

    public operator fun component8(): Pwstr = this.srvci0Storelocation

    public operator fun component9(): Pwstr = this.srvci0Storename

    public operator fun component10(): Pwstr = this.srvci0Renewalchain

    public operator fun component11(): UInt = this.srvci0Type

    public operator fun component12(): UInt = this.srvci0Flags

    public operator fun component13(): UInt = this.srvci0MappingStatus

    public fun copy(srvci0Name: Pwstr = this.srvci0Name, srvci0Subject: Pwstr = this.srvci0Subject, srvci0Issuer: Pwstr = this.srvci0Issuer, srvci0Thumbprint: Pwstr = this.srvci0Thumbprint, srvci0Friendlyname: Pwstr = this.srvci0Friendlyname, srvci0Notbefore: Pwstr = this.srvci0Notbefore, srvci0Notafter: Pwstr = this.srvci0Notafter, srvci0Storelocation: Pwstr = this.srvci0Storelocation, srvci0Storename: Pwstr = this.srvci0Storename, srvci0Renewalchain: Pwstr = this.srvci0Renewalchain, srvci0Type: UInt = this.srvci0Type, srvci0Flags: UInt = this.srvci0Flags, srvci0MappingStatus: UInt = this.srvci0MappingStatus): ServerCertificateInfo0 = ServerCertificateInfo0(srvci0NameCtorArg = srvci0Name, srvci0SubjectCtorArg = srvci0Subject, srvci0IssuerCtorArg = srvci0Issuer, srvci0ThumbprintCtorArg = srvci0Thumbprint, srvci0FriendlynameCtorArg = srvci0Friendlyname, srvci0NotbeforeCtorArg = srvci0Notbefore, srvci0NotafterCtorArg = srvci0Notafter, srvci0StorelocationCtorArg = srvci0Storelocation, srvci0StorenameCtorArg = srvci0Storename, srvci0RenewalchainCtorArg = srvci0Renewalchain, srvci0Type = srvci0Type, srvci0Flags = srvci0Flags, srvci0MappingStatus = srvci0MappingStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerCertificateInfo0) return false
        if (this.srvci0Name != other.srvci0Name) return false
        if (this.srvci0Subject != other.srvci0Subject) return false
        if (this.srvci0Issuer != other.srvci0Issuer) return false
        if (this.srvci0Thumbprint != other.srvci0Thumbprint) return false
        if (this.srvci0Friendlyname != other.srvci0Friendlyname) return false
        if (this.srvci0Notbefore != other.srvci0Notbefore) return false
        if (this.srvci0Notafter != other.srvci0Notafter) return false
        if (this.srvci0Storelocation != other.srvci0Storelocation) return false
        if (this.srvci0Storename != other.srvci0Storename) return false
        if (this.srvci0Renewalchain != other.srvci0Renewalchain) return false
        if (this.srvci0Type != other.srvci0Type) return false
        if (this.srvci0Flags != other.srvci0Flags) return false
        if (this.srvci0MappingStatus != other.srvci0MappingStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srvci0Name.hashCode()
        result = 31 * result + this.srvci0Subject.hashCode()
        result = 31 * result + this.srvci0Issuer.hashCode()
        result = 31 * result + this.srvci0Thumbprint.hashCode()
        result = 31 * result + this.srvci0Friendlyname.hashCode()
        result = 31 * result + this.srvci0Notbefore.hashCode()
        result = 31 * result + this.srvci0Notafter.hashCode()
        result = 31 * result + this.srvci0Storelocation.hashCode()
        result = 31 * result + this.srvci0Storename.hashCode()
        result = 31 * result + this.srvci0Renewalchain.hashCode()
        result = 31 * result + this.srvci0Type.hashCode()
        result = 31 * result + this.srvci0Flags.hashCode()
        result = 31 * result + this.srvci0MappingStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            srvci0Name: Pwstr = MutPtr(0L),
            srvci0Subject: Pwstr = MutPtr(0L),
            srvci0Issuer: Pwstr = MutPtr(0L),
            srvci0Thumbprint: Pwstr = MutPtr(0L),
            srvci0Friendlyname: Pwstr = MutPtr(0L),
            srvci0Notbefore: Pwstr = MutPtr(0L),
            srvci0Notafter: Pwstr = MutPtr(0L),
            srvci0Storelocation: Pwstr = MutPtr(0L),
            srvci0Storename: Pwstr = MutPtr(0L),
            srvci0Renewalchain: Pwstr = MutPtr(0L),
            srvci0Type: UInt = 0u,
            srvci0Flags: UInt = 0u,
            srvci0MappingStatus: UInt = 0u,
        ): ServerCertificateInfo0 =
            ServerCertificateInfo0(
                srvci0NameCtorArg = srvci0Name,
                srvci0SubjectCtorArg = srvci0Subject,
                srvci0IssuerCtorArg = srvci0Issuer,
                srvci0ThumbprintCtorArg = srvci0Thumbprint,
                srvci0FriendlynameCtorArg = srvci0Friendlyname,
                srvci0NotbeforeCtorArg = srvci0Notbefore,
                srvci0NotafterCtorArg = srvci0Notafter,
                srvci0StorelocationCtorArg = srvci0Storelocation,
                srvci0StorenameCtorArg = srvci0Storename,
                srvci0RenewalchainCtorArg = srvci0Renewalchain,
                srvci0Type = srvci0Type,
                srvci0Flags = srvci0Flags,
                srvci0MappingStatus = srvci0MappingStatus,
            )
    }
}

public class SessionInfo0 internal constructor(
    sesi0CnameCtorArg: Pwstr,
) {
    public var sesi0Cname: Pwstr = sesi0CnameCtorArg
        internal set

    public constructor() : this(
        sesi0CnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.sesi0Cname

    public fun copy(sesi0Cname: Pwstr = this.sesi0Cname): SessionInfo0 = SessionInfo0(sesi0CnameCtorArg = sesi0Cname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SessionInfo0) return false
        if (this.sesi0Cname != other.sesi0Cname) return false
        return true
    }

    override fun hashCode(): Int = this.sesi0Cname.hashCode()

    public companion object {
        public operator fun invoke(
            sesi0Cname: Pwstr = MutPtr(0L),
        ): SessionInfo0 =
            SessionInfo0(
                sesi0CnameCtorArg = sesi0Cname,
            )
    }
}

public class SessionInfo1 internal constructor(
    sesi1CnameCtorArg: Pwstr,
    sesi1UsernameCtorArg: Pwstr,
    public var sesi1NumOpens: UInt,
    public var sesi1Time: UInt,
    public var sesi1IdleTime: UInt,
    public var sesi1UserFlags: SessionInfoUserFlags,
) {
    public var sesi1Cname: Pwstr = sesi1CnameCtorArg
        internal set

    public var sesi1Username: Pwstr = sesi1UsernameCtorArg
        internal set

    public constructor() : this(
        sesi1CnameCtorArg = MutPtr(0L),
        sesi1UsernameCtorArg = MutPtr(0L),
        sesi1NumOpens = 0u,
        sesi1Time = 0u,
        sesi1IdleTime = 0u,
        sesi1UserFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.sesi1Cname

    public operator fun component2(): Pwstr = this.sesi1Username

    public operator fun component3(): UInt = this.sesi1NumOpens

    public operator fun component4(): UInt = this.sesi1Time

    public operator fun component5(): UInt = this.sesi1IdleTime

    public operator fun component6(): SessionInfoUserFlags = this.sesi1UserFlags

    public fun copy(sesi1Cname: Pwstr = this.sesi1Cname, sesi1Username: Pwstr = this.sesi1Username, sesi1NumOpens: UInt = this.sesi1NumOpens, sesi1Time: UInt = this.sesi1Time, sesi1IdleTime: UInt = this.sesi1IdleTime, sesi1UserFlags: SessionInfoUserFlags = this.sesi1UserFlags): SessionInfo1 = SessionInfo1(sesi1CnameCtorArg = sesi1Cname, sesi1UsernameCtorArg = sesi1Username, sesi1NumOpens = sesi1NumOpens, sesi1Time = sesi1Time, sesi1IdleTime = sesi1IdleTime, sesi1UserFlags = sesi1UserFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SessionInfo1) return false
        if (this.sesi1Cname != other.sesi1Cname) return false
        if (this.sesi1Username != other.sesi1Username) return false
        if (this.sesi1NumOpens != other.sesi1NumOpens) return false
        if (this.sesi1Time != other.sesi1Time) return false
        if (this.sesi1IdleTime != other.sesi1IdleTime) return false
        if (this.sesi1UserFlags != other.sesi1UserFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sesi1Cname.hashCode()
        result = 31 * result + this.sesi1Username.hashCode()
        result = 31 * result + this.sesi1NumOpens.hashCode()
        result = 31 * result + this.sesi1Time.hashCode()
        result = 31 * result + this.sesi1IdleTime.hashCode()
        result = 31 * result + this.sesi1UserFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sesi1Cname: Pwstr = MutPtr(0L),
            sesi1Username: Pwstr = MutPtr(0L),
            sesi1NumOpens: UInt = 0u,
            sesi1Time: UInt = 0u,
            sesi1IdleTime: UInt = 0u,
            sesi1UserFlags: SessionInfoUserFlags = 0u,
        ): SessionInfo1 =
            SessionInfo1(
                sesi1CnameCtorArg = sesi1Cname,
                sesi1UsernameCtorArg = sesi1Username,
                sesi1NumOpens = sesi1NumOpens,
                sesi1Time = sesi1Time,
                sesi1IdleTime = sesi1IdleTime,
                sesi1UserFlags = sesi1UserFlags,
            )
    }
}

public class SessionInfo10 internal constructor(
    sesi10CnameCtorArg: Pwstr,
    sesi10UsernameCtorArg: Pwstr,
    public var sesi10Time: UInt,
    public var sesi10IdleTime: UInt,
) {
    public var sesi10Cname: Pwstr = sesi10CnameCtorArg
        internal set

    public var sesi10Username: Pwstr = sesi10UsernameCtorArg
        internal set

    public constructor() : this(
        sesi10CnameCtorArg = MutPtr(0L),
        sesi10UsernameCtorArg = MutPtr(0L),
        sesi10Time = 0u,
        sesi10IdleTime = 0u,
    )

    public operator fun component1(): Pwstr = this.sesi10Cname

    public operator fun component2(): Pwstr = this.sesi10Username

    public operator fun component3(): UInt = this.sesi10Time

    public operator fun component4(): UInt = this.sesi10IdleTime

    public fun copy(sesi10Cname: Pwstr = this.sesi10Cname, sesi10Username: Pwstr = this.sesi10Username, sesi10Time: UInt = this.sesi10Time, sesi10IdleTime: UInt = this.sesi10IdleTime): SessionInfo10 = SessionInfo10(sesi10CnameCtorArg = sesi10Cname, sesi10UsernameCtorArg = sesi10Username, sesi10Time = sesi10Time, sesi10IdleTime = sesi10IdleTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SessionInfo10) return false
        if (this.sesi10Cname != other.sesi10Cname) return false
        if (this.sesi10Username != other.sesi10Username) return false
        if (this.sesi10Time != other.sesi10Time) return false
        if (this.sesi10IdleTime != other.sesi10IdleTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sesi10Cname.hashCode()
        result = 31 * result + this.sesi10Username.hashCode()
        result = 31 * result + this.sesi10Time.hashCode()
        result = 31 * result + this.sesi10IdleTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sesi10Cname: Pwstr = MutPtr(0L),
            sesi10Username: Pwstr = MutPtr(0L),
            sesi10Time: UInt = 0u,
            sesi10IdleTime: UInt = 0u,
        ): SessionInfo10 =
            SessionInfo10(
                sesi10CnameCtorArg = sesi10Cname,
                sesi10UsernameCtorArg = sesi10Username,
                sesi10Time = sesi10Time,
                sesi10IdleTime = sesi10IdleTime,
            )
    }
}

public class SessionInfo2 internal constructor(
    sesi2CnameCtorArg: Pwstr,
    sesi2UsernameCtorArg: Pwstr,
    public var sesi2NumOpens: UInt,
    public var sesi2Time: UInt,
    public var sesi2IdleTime: UInt,
    public var sesi2UserFlags: SessionInfoUserFlags,
    sesi2CltypeNameCtorArg: Pwstr,
) {
    public var sesi2Cname: Pwstr = sesi2CnameCtorArg
        internal set

    public var sesi2Username: Pwstr = sesi2UsernameCtorArg
        internal set

    public var sesi2CltypeName: Pwstr = sesi2CltypeNameCtorArg
        internal set

    public constructor() : this(
        sesi2CnameCtorArg = MutPtr(0L),
        sesi2UsernameCtorArg = MutPtr(0L),
        sesi2NumOpens = 0u,
        sesi2Time = 0u,
        sesi2IdleTime = 0u,
        sesi2UserFlags = 0u,
        sesi2CltypeNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.sesi2Cname

    public operator fun component2(): Pwstr = this.sesi2Username

    public operator fun component3(): UInt = this.sesi2NumOpens

    public operator fun component4(): UInt = this.sesi2Time

    public operator fun component5(): UInt = this.sesi2IdleTime

    public operator fun component6(): SessionInfoUserFlags = this.sesi2UserFlags

    public operator fun component7(): Pwstr = this.sesi2CltypeName

    public fun copy(sesi2Cname: Pwstr = this.sesi2Cname, sesi2Username: Pwstr = this.sesi2Username, sesi2NumOpens: UInt = this.sesi2NumOpens, sesi2Time: UInt = this.sesi2Time, sesi2IdleTime: UInt = this.sesi2IdleTime, sesi2UserFlags: SessionInfoUserFlags = this.sesi2UserFlags, sesi2CltypeName: Pwstr = this.sesi2CltypeName): SessionInfo2 = SessionInfo2(sesi2CnameCtorArg = sesi2Cname, sesi2UsernameCtorArg = sesi2Username, sesi2NumOpens = sesi2NumOpens, sesi2Time = sesi2Time, sesi2IdleTime = sesi2IdleTime, sesi2UserFlags = sesi2UserFlags, sesi2CltypeNameCtorArg = sesi2CltypeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SessionInfo2) return false
        if (this.sesi2Cname != other.sesi2Cname) return false
        if (this.sesi2Username != other.sesi2Username) return false
        if (this.sesi2NumOpens != other.sesi2NumOpens) return false
        if (this.sesi2Time != other.sesi2Time) return false
        if (this.sesi2IdleTime != other.sesi2IdleTime) return false
        if (this.sesi2UserFlags != other.sesi2UserFlags) return false
        if (this.sesi2CltypeName != other.sesi2CltypeName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sesi2Cname.hashCode()
        result = 31 * result + this.sesi2Username.hashCode()
        result = 31 * result + this.sesi2NumOpens.hashCode()
        result = 31 * result + this.sesi2Time.hashCode()
        result = 31 * result + this.sesi2IdleTime.hashCode()
        result = 31 * result + this.sesi2UserFlags.hashCode()
        result = 31 * result + this.sesi2CltypeName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sesi2Cname: Pwstr = MutPtr(0L),
            sesi2Username: Pwstr = MutPtr(0L),
            sesi2NumOpens: UInt = 0u,
            sesi2Time: UInt = 0u,
            sesi2IdleTime: UInt = 0u,
            sesi2UserFlags: SessionInfoUserFlags = 0u,
            sesi2CltypeName: Pwstr = MutPtr(0L),
        ): SessionInfo2 =
            SessionInfo2(
                sesi2CnameCtorArg = sesi2Cname,
                sesi2UsernameCtorArg = sesi2Username,
                sesi2NumOpens = sesi2NumOpens,
                sesi2Time = sesi2Time,
                sesi2IdleTime = sesi2IdleTime,
                sesi2UserFlags = sesi2UserFlags,
                sesi2CltypeNameCtorArg = sesi2CltypeName,
            )
    }
}

public class SessionInfo502 internal constructor(
    sesi502CnameCtorArg: Pwstr,
    sesi502UsernameCtorArg: Pwstr,
    public var sesi502NumOpens: UInt,
    public var sesi502Time: UInt,
    public var sesi502IdleTime: UInt,
    public var sesi502UserFlags: SessionInfoUserFlags,
    sesi502CltypeNameCtorArg: Pwstr,
    sesi502TransportCtorArg: Pwstr,
) {
    public var sesi502Cname: Pwstr = sesi502CnameCtorArg
        internal set

    public var sesi502Username: Pwstr = sesi502UsernameCtorArg
        internal set

    public var sesi502CltypeName: Pwstr = sesi502CltypeNameCtorArg
        internal set

    public var sesi502Transport: Pwstr = sesi502TransportCtorArg
        internal set

    public constructor() : this(
        sesi502CnameCtorArg = MutPtr(0L),
        sesi502UsernameCtorArg = MutPtr(0L),
        sesi502NumOpens = 0u,
        sesi502Time = 0u,
        sesi502IdleTime = 0u,
        sesi502UserFlags = 0u,
        sesi502CltypeNameCtorArg = MutPtr(0L),
        sesi502TransportCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.sesi502Cname

    public operator fun component2(): Pwstr = this.sesi502Username

    public operator fun component3(): UInt = this.sesi502NumOpens

    public operator fun component4(): UInt = this.sesi502Time

    public operator fun component5(): UInt = this.sesi502IdleTime

    public operator fun component6(): SessionInfoUserFlags = this.sesi502UserFlags

    public operator fun component7(): Pwstr = this.sesi502CltypeName

    public operator fun component8(): Pwstr = this.sesi502Transport

    public fun copy(sesi502Cname: Pwstr = this.sesi502Cname, sesi502Username: Pwstr = this.sesi502Username, sesi502NumOpens: UInt = this.sesi502NumOpens, sesi502Time: UInt = this.sesi502Time, sesi502IdleTime: UInt = this.sesi502IdleTime, sesi502UserFlags: SessionInfoUserFlags = this.sesi502UserFlags, sesi502CltypeName: Pwstr = this.sesi502CltypeName, sesi502Transport: Pwstr = this.sesi502Transport): SessionInfo502 = SessionInfo502(sesi502CnameCtorArg = sesi502Cname, sesi502UsernameCtorArg = sesi502Username, sesi502NumOpens = sesi502NumOpens, sesi502Time = sesi502Time, sesi502IdleTime = sesi502IdleTime, sesi502UserFlags = sesi502UserFlags, sesi502CltypeNameCtorArg = sesi502CltypeName, sesi502TransportCtorArg = sesi502Transport)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SessionInfo502) return false
        if (this.sesi502Cname != other.sesi502Cname) return false
        if (this.sesi502Username != other.sesi502Username) return false
        if (this.sesi502NumOpens != other.sesi502NumOpens) return false
        if (this.sesi502Time != other.sesi502Time) return false
        if (this.sesi502IdleTime != other.sesi502IdleTime) return false
        if (this.sesi502UserFlags != other.sesi502UserFlags) return false
        if (this.sesi502CltypeName != other.sesi502CltypeName) return false
        if (this.sesi502Transport != other.sesi502Transport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sesi502Cname.hashCode()
        result = 31 * result + this.sesi502Username.hashCode()
        result = 31 * result + this.sesi502NumOpens.hashCode()
        result = 31 * result + this.sesi502Time.hashCode()
        result = 31 * result + this.sesi502IdleTime.hashCode()
        result = 31 * result + this.sesi502UserFlags.hashCode()
        result = 31 * result + this.sesi502CltypeName.hashCode()
        result = 31 * result + this.sesi502Transport.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sesi502Cname: Pwstr = MutPtr(0L),
            sesi502Username: Pwstr = MutPtr(0L),
            sesi502NumOpens: UInt = 0u,
            sesi502Time: UInt = 0u,
            sesi502IdleTime: UInt = 0u,
            sesi502UserFlags: SessionInfoUserFlags = 0u,
            sesi502CltypeName: Pwstr = MutPtr(0L),
            sesi502Transport: Pwstr = MutPtr(0L),
        ): SessionInfo502 =
            SessionInfo502(
                sesi502CnameCtorArg = sesi502Cname,
                sesi502UsernameCtorArg = sesi502Username,
                sesi502NumOpens = sesi502NumOpens,
                sesi502Time = sesi502Time,
                sesi502IdleTime = sesi502IdleTime,
                sesi502UserFlags = sesi502UserFlags,
                sesi502CltypeNameCtorArg = sesi502CltypeName,
                sesi502TransportCtorArg = sesi502Transport,
            )
    }
}

public class ShareInfo0 internal constructor(
    shi0NetnameCtorArg: Pwstr,
) {
    public var shi0Netname: Pwstr = shi0NetnameCtorArg
        internal set

    public constructor() : this(
        shi0NetnameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.shi0Netname

    public fun copy(shi0Netname: Pwstr = this.shi0Netname): ShareInfo0 = ShareInfo0(shi0NetnameCtorArg = shi0Netname)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo0) return false
        if (this.shi0Netname != other.shi0Netname) return false
        return true
    }

    override fun hashCode(): Int = this.shi0Netname.hashCode()

    public companion object {
        public operator fun invoke(
            shi0Netname: Pwstr = MutPtr(0L),
        ): ShareInfo0 =
            ShareInfo0(
                shi0NetnameCtorArg = shi0Netname,
            )
    }
}

public class ShareInfo1 internal constructor(
    shi1NetnameCtorArg: Pwstr,
    public var shi1Type: ShareType,
    shi1RemarkCtorArg: Pwstr,
) {
    public var shi1Netname: Pwstr = shi1NetnameCtorArg
        internal set

    public var shi1Remark: Pwstr = shi1RemarkCtorArg
        internal set

    public constructor() : this(
        shi1NetnameCtorArg = MutPtr(0L),
        shi1Type = 0u,
        shi1RemarkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.shi1Netname

    public operator fun component2(): ShareType = this.shi1Type

    public operator fun component3(): Pwstr = this.shi1Remark

    public fun copy(shi1Netname: Pwstr = this.shi1Netname, shi1Type: ShareType = this.shi1Type, shi1Remark: Pwstr = this.shi1Remark): ShareInfo1 = ShareInfo1(shi1NetnameCtorArg = shi1Netname, shi1Type = shi1Type, shi1RemarkCtorArg = shi1Remark)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo1) return false
        if (this.shi1Netname != other.shi1Netname) return false
        if (this.shi1Type != other.shi1Type) return false
        if (this.shi1Remark != other.shi1Remark) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shi1Netname.hashCode()
        result = 31 * result + this.shi1Type.hashCode()
        result = 31 * result + this.shi1Remark.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shi1Netname: Pwstr = MutPtr(0L),
            shi1Type: ShareType = 0u,
            shi1Remark: Pwstr = MutPtr(0L),
        ): ShareInfo1 =
            ShareInfo1(
                shi1NetnameCtorArg = shi1Netname,
                shi1Type = shi1Type,
                shi1RemarkCtorArg = shi1Remark,
            )
    }
}

public class ShareInfo1004 internal constructor(
    shi1004RemarkCtorArg: Pwstr,
) {
    public var shi1004Remark: Pwstr = shi1004RemarkCtorArg
        internal set

    public constructor() : this(
        shi1004RemarkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.shi1004Remark

    public fun copy(shi1004Remark: Pwstr = this.shi1004Remark): ShareInfo1004 = ShareInfo1004(shi1004RemarkCtorArg = shi1004Remark)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo1004) return false
        if (this.shi1004Remark != other.shi1004Remark) return false
        return true
    }

    override fun hashCode(): Int = this.shi1004Remark.hashCode()

    public companion object {
        public operator fun invoke(
            shi1004Remark: Pwstr = MutPtr(0L),
        ): ShareInfo1004 =
            ShareInfo1004(
                shi1004RemarkCtorArg = shi1004Remark,
            )
    }
}

public data class ShareInfo1005(
    public var shi1005Flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShareInfo1005> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShareInfo1005> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ShareInfo1005 =
                    ShareInfo1005(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ShareInfo1005) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.shi1005Flags)
                }
            }
    }
}

public data class ShareInfo1006(
    public var shi1006MaxUses: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShareInfo1006> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShareInfo1006> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ShareInfo1006 =
                    ShareInfo1006(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ShareInfo1006) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.shi1006MaxUses)
                }
            }
    }
}

public class ShareInfo1501 internal constructor(
    public var shi1501Reserved: UInt,
    shi1501SecurityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var shi1501SecurityDescriptor: PsecurityDescriptor = shi1501SecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        shi1501Reserved = 0u,
        shi1501SecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.shi1501Reserved

    public operator fun component2(): PsecurityDescriptor = this.shi1501SecurityDescriptor

    public fun copy(shi1501Reserved: UInt = this.shi1501Reserved, shi1501SecurityDescriptor: PsecurityDescriptor = this.shi1501SecurityDescriptor): ShareInfo1501 = ShareInfo1501(shi1501Reserved = shi1501Reserved, shi1501SecurityDescriptorCtorArg = shi1501SecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo1501) return false
        if (this.shi1501Reserved != other.shi1501Reserved) return false
        if (this.shi1501SecurityDescriptor != other.shi1501SecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shi1501Reserved.hashCode()
        result = 31 * result + this.shi1501SecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shi1501Reserved: UInt = 0u,
            shi1501SecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): ShareInfo1501 =
            ShareInfo1501(
                shi1501Reserved = shi1501Reserved,
                shi1501SecurityDescriptorCtorArg = shi1501SecurityDescriptor,
            )
    }
}

public data class ShareInfo1503(
    public var shi1503Sharefilter: Guid = Guid(),
)

public class ShareInfo2 internal constructor(
    shi2NetnameCtorArg: Pwstr,
    public var shi2Type: ShareType,
    shi2RemarkCtorArg: Pwstr,
    public var shi2Permissions: ShareInfoPermissions,
    public var shi2MaxUses: UInt,
    public var shi2CurrentUses: UInt,
    shi2PathCtorArg: Pwstr,
    shi2PasswdCtorArg: Pwstr,
) {
    public var shi2Netname: Pwstr = shi2NetnameCtorArg
        internal set

    public var shi2Remark: Pwstr = shi2RemarkCtorArg
        internal set

    public var shi2Path: Pwstr = shi2PathCtorArg
        internal set

    public var shi2Passwd: Pwstr = shi2PasswdCtorArg
        internal set

    public constructor() : this(
        shi2NetnameCtorArg = MutPtr(0L),
        shi2Type = 0u,
        shi2RemarkCtorArg = MutPtr(0L),
        shi2Permissions = 0u,
        shi2MaxUses = 0u,
        shi2CurrentUses = 0u,
        shi2PathCtorArg = MutPtr(0L),
        shi2PasswdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.shi2Netname

    public operator fun component2(): ShareType = this.shi2Type

    public operator fun component3(): Pwstr = this.shi2Remark

    public operator fun component4(): ShareInfoPermissions = this.shi2Permissions

    public operator fun component5(): UInt = this.shi2MaxUses

    public operator fun component6(): UInt = this.shi2CurrentUses

    public operator fun component7(): Pwstr = this.shi2Path

    public operator fun component8(): Pwstr = this.shi2Passwd

    public fun copy(shi2Netname: Pwstr = this.shi2Netname, shi2Type: ShareType = this.shi2Type, shi2Remark: Pwstr = this.shi2Remark, shi2Permissions: ShareInfoPermissions = this.shi2Permissions, shi2MaxUses: UInt = this.shi2MaxUses, shi2CurrentUses: UInt = this.shi2CurrentUses, shi2Path: Pwstr = this.shi2Path, shi2Passwd: Pwstr = this.shi2Passwd): ShareInfo2 = ShareInfo2(shi2NetnameCtorArg = shi2Netname, shi2Type = shi2Type, shi2RemarkCtorArg = shi2Remark, shi2Permissions = shi2Permissions, shi2MaxUses = shi2MaxUses, shi2CurrentUses = shi2CurrentUses, shi2PathCtorArg = shi2Path, shi2PasswdCtorArg = shi2Passwd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo2) return false
        if (this.shi2Netname != other.shi2Netname) return false
        if (this.shi2Type != other.shi2Type) return false
        if (this.shi2Remark != other.shi2Remark) return false
        if (this.shi2Permissions != other.shi2Permissions) return false
        if (this.shi2MaxUses != other.shi2MaxUses) return false
        if (this.shi2CurrentUses != other.shi2CurrentUses) return false
        if (this.shi2Path != other.shi2Path) return false
        if (this.shi2Passwd != other.shi2Passwd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shi2Netname.hashCode()
        result = 31 * result + this.shi2Type.hashCode()
        result = 31 * result + this.shi2Remark.hashCode()
        result = 31 * result + this.shi2Permissions.hashCode()
        result = 31 * result + this.shi2MaxUses.hashCode()
        result = 31 * result + this.shi2CurrentUses.hashCode()
        result = 31 * result + this.shi2Path.hashCode()
        result = 31 * result + this.shi2Passwd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shi2Netname: Pwstr = MutPtr(0L),
            shi2Type: ShareType = 0u,
            shi2Remark: Pwstr = MutPtr(0L),
            shi2Permissions: ShareInfoPermissions = 0u,
            shi2MaxUses: UInt = 0u,
            shi2CurrentUses: UInt = 0u,
            shi2Path: Pwstr = MutPtr(0L),
            shi2Passwd: Pwstr = MutPtr(0L),
        ): ShareInfo2 =
            ShareInfo2(
                shi2NetnameCtorArg = shi2Netname,
                shi2Type = shi2Type,
                shi2RemarkCtorArg = shi2Remark,
                shi2Permissions = shi2Permissions,
                shi2MaxUses = shi2MaxUses,
                shi2CurrentUses = shi2CurrentUses,
                shi2PathCtorArg = shi2Path,
                shi2PasswdCtorArg = shi2Passwd,
            )
    }
}

public class ShareInfo501 internal constructor(
    shi501NetnameCtorArg: Pwstr,
    public var shi501Type: ShareType,
    shi501RemarkCtorArg: Pwstr,
    public var shi501Flags: UInt,
) {
    public var shi501Netname: Pwstr = shi501NetnameCtorArg
        internal set

    public var shi501Remark: Pwstr = shi501RemarkCtorArg
        internal set

    public constructor() : this(
        shi501NetnameCtorArg = MutPtr(0L),
        shi501Type = 0u,
        shi501RemarkCtorArg = MutPtr(0L),
        shi501Flags = 0u,
    )

    public operator fun component1(): Pwstr = this.shi501Netname

    public operator fun component2(): ShareType = this.shi501Type

    public operator fun component3(): Pwstr = this.shi501Remark

    public operator fun component4(): UInt = this.shi501Flags

    public fun copy(shi501Netname: Pwstr = this.shi501Netname, shi501Type: ShareType = this.shi501Type, shi501Remark: Pwstr = this.shi501Remark, shi501Flags: UInt = this.shi501Flags): ShareInfo501 = ShareInfo501(shi501NetnameCtorArg = shi501Netname, shi501Type = shi501Type, shi501RemarkCtorArg = shi501Remark, shi501Flags = shi501Flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo501) return false
        if (this.shi501Netname != other.shi501Netname) return false
        if (this.shi501Type != other.shi501Type) return false
        if (this.shi501Remark != other.shi501Remark) return false
        if (this.shi501Flags != other.shi501Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shi501Netname.hashCode()
        result = 31 * result + this.shi501Type.hashCode()
        result = 31 * result + this.shi501Remark.hashCode()
        result = 31 * result + this.shi501Flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shi501Netname: Pwstr = MutPtr(0L),
            shi501Type: ShareType = 0u,
            shi501Remark: Pwstr = MutPtr(0L),
            shi501Flags: UInt = 0u,
        ): ShareInfo501 =
            ShareInfo501(
                shi501NetnameCtorArg = shi501Netname,
                shi501Type = shi501Type,
                shi501RemarkCtorArg = shi501Remark,
                shi501Flags = shi501Flags,
            )
    }
}

public class ShareInfo502 internal constructor(
    shi502NetnameCtorArg: Pwstr,
    public var shi502Type: ShareType,
    shi502RemarkCtorArg: Pwstr,
    public var shi502Permissions: ShareInfoPermissions,
    public var shi502MaxUses: UInt,
    public var shi502CurrentUses: UInt,
    shi502PathCtorArg: Pwstr,
    shi502PasswdCtorArg: Pwstr,
    public var shi502Reserved: UInt,
    shi502SecurityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var shi502Netname: Pwstr = shi502NetnameCtorArg
        internal set

    public var shi502Remark: Pwstr = shi502RemarkCtorArg
        internal set

    public var shi502Path: Pwstr = shi502PathCtorArg
        internal set

    public var shi502Passwd: Pwstr = shi502PasswdCtorArg
        internal set

    public var shi502SecurityDescriptor: PsecurityDescriptor = shi502SecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        shi502NetnameCtorArg = MutPtr(0L),
        shi502Type = 0u,
        shi502RemarkCtorArg = MutPtr(0L),
        shi502Permissions = 0u,
        shi502MaxUses = 0u,
        shi502CurrentUses = 0u,
        shi502PathCtorArg = MutPtr(0L),
        shi502PasswdCtorArg = MutPtr(0L),
        shi502Reserved = 0u,
        shi502SecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.shi502Netname

    public operator fun component2(): ShareType = this.shi502Type

    public operator fun component3(): Pwstr = this.shi502Remark

    public operator fun component4(): ShareInfoPermissions = this.shi502Permissions

    public operator fun component5(): UInt = this.shi502MaxUses

    public operator fun component6(): UInt = this.shi502CurrentUses

    public operator fun component7(): Pwstr = this.shi502Path

    public operator fun component8(): Pwstr = this.shi502Passwd

    public operator fun component9(): UInt = this.shi502Reserved

    public operator fun component10(): PsecurityDescriptor = this.shi502SecurityDescriptor

    public fun copy(shi502Netname: Pwstr = this.shi502Netname, shi502Type: ShareType = this.shi502Type, shi502Remark: Pwstr = this.shi502Remark, shi502Permissions: ShareInfoPermissions = this.shi502Permissions, shi502MaxUses: UInt = this.shi502MaxUses, shi502CurrentUses: UInt = this.shi502CurrentUses, shi502Path: Pwstr = this.shi502Path, shi502Passwd: Pwstr = this.shi502Passwd, shi502Reserved: UInt = this.shi502Reserved, shi502SecurityDescriptor: PsecurityDescriptor = this.shi502SecurityDescriptor): ShareInfo502 = ShareInfo502(shi502NetnameCtorArg = shi502Netname, shi502Type = shi502Type, shi502RemarkCtorArg = shi502Remark, shi502Permissions = shi502Permissions, shi502MaxUses = shi502MaxUses, shi502CurrentUses = shi502CurrentUses, shi502PathCtorArg = shi502Path, shi502PasswdCtorArg = shi502Passwd, shi502Reserved = shi502Reserved, shi502SecurityDescriptorCtorArg = shi502SecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo502) return false
        if (this.shi502Netname != other.shi502Netname) return false
        if (this.shi502Type != other.shi502Type) return false
        if (this.shi502Remark != other.shi502Remark) return false
        if (this.shi502Permissions != other.shi502Permissions) return false
        if (this.shi502MaxUses != other.shi502MaxUses) return false
        if (this.shi502CurrentUses != other.shi502CurrentUses) return false
        if (this.shi502Path != other.shi502Path) return false
        if (this.shi502Passwd != other.shi502Passwd) return false
        if (this.shi502Reserved != other.shi502Reserved) return false
        if (this.shi502SecurityDescriptor != other.shi502SecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shi502Netname.hashCode()
        result = 31 * result + this.shi502Type.hashCode()
        result = 31 * result + this.shi502Remark.hashCode()
        result = 31 * result + this.shi502Permissions.hashCode()
        result = 31 * result + this.shi502MaxUses.hashCode()
        result = 31 * result + this.shi502CurrentUses.hashCode()
        result = 31 * result + this.shi502Path.hashCode()
        result = 31 * result + this.shi502Passwd.hashCode()
        result = 31 * result + this.shi502Reserved.hashCode()
        result = 31 * result + this.shi502SecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shi502Netname: Pwstr = MutPtr(0L),
            shi502Type: ShareType = 0u,
            shi502Remark: Pwstr = MutPtr(0L),
            shi502Permissions: ShareInfoPermissions = 0u,
            shi502MaxUses: UInt = 0u,
            shi502CurrentUses: UInt = 0u,
            shi502Path: Pwstr = MutPtr(0L),
            shi502Passwd: Pwstr = MutPtr(0L),
            shi502Reserved: UInt = 0u,
            shi502SecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): ShareInfo502 =
            ShareInfo502(
                shi502NetnameCtorArg = shi502Netname,
                shi502Type = shi502Type,
                shi502RemarkCtorArg = shi502Remark,
                shi502Permissions = shi502Permissions,
                shi502MaxUses = shi502MaxUses,
                shi502CurrentUses = shi502CurrentUses,
                shi502PathCtorArg = shi502Path,
                shi502PasswdCtorArg = shi502Passwd,
                shi502Reserved = shi502Reserved,
                shi502SecurityDescriptorCtorArg = shi502SecurityDescriptor,
            )
    }
}

public class ShareInfo503 internal constructor(
    shi503NetnameCtorArg: Pwstr,
    public var shi503Type: ShareType,
    shi503RemarkCtorArg: Pwstr,
    public var shi503Permissions: ShareInfoPermissions,
    public var shi503MaxUses: UInt,
    public var shi503CurrentUses: UInt,
    shi503PathCtorArg: Pwstr,
    shi503PasswdCtorArg: Pwstr,
    shi503ServernameCtorArg: Pwstr,
    public var shi503Reserved: UInt,
    shi503SecurityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var shi503Netname: Pwstr = shi503NetnameCtorArg
        internal set

    public var shi503Remark: Pwstr = shi503RemarkCtorArg
        internal set

    public var shi503Path: Pwstr = shi503PathCtorArg
        internal set

    public var shi503Passwd: Pwstr = shi503PasswdCtorArg
        internal set

    public var shi503Servername: Pwstr = shi503ServernameCtorArg
        internal set

    public var shi503SecurityDescriptor: PsecurityDescriptor = shi503SecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        shi503NetnameCtorArg = MutPtr(0L),
        shi503Type = 0u,
        shi503RemarkCtorArg = MutPtr(0L),
        shi503Permissions = 0u,
        shi503MaxUses = 0u,
        shi503CurrentUses = 0u,
        shi503PathCtorArg = MutPtr(0L),
        shi503PasswdCtorArg = MutPtr(0L),
        shi503ServernameCtorArg = MutPtr(0L),
        shi503Reserved = 0u,
        shi503SecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.shi503Netname

    public operator fun component2(): ShareType = this.shi503Type

    public operator fun component3(): Pwstr = this.shi503Remark

    public operator fun component4(): ShareInfoPermissions = this.shi503Permissions

    public operator fun component5(): UInt = this.shi503MaxUses

    public operator fun component6(): UInt = this.shi503CurrentUses

    public operator fun component7(): Pwstr = this.shi503Path

    public operator fun component8(): Pwstr = this.shi503Passwd

    public operator fun component9(): Pwstr = this.shi503Servername

    public operator fun component10(): UInt = this.shi503Reserved

    public operator fun component11(): PsecurityDescriptor = this.shi503SecurityDescriptor

    public fun copy(shi503Netname: Pwstr = this.shi503Netname, shi503Type: ShareType = this.shi503Type, shi503Remark: Pwstr = this.shi503Remark, shi503Permissions: ShareInfoPermissions = this.shi503Permissions, shi503MaxUses: UInt = this.shi503MaxUses, shi503CurrentUses: UInt = this.shi503CurrentUses, shi503Path: Pwstr = this.shi503Path, shi503Passwd: Pwstr = this.shi503Passwd, shi503Servername: Pwstr = this.shi503Servername, shi503Reserved: UInt = this.shi503Reserved, shi503SecurityDescriptor: PsecurityDescriptor = this.shi503SecurityDescriptor): ShareInfo503 = ShareInfo503(shi503NetnameCtorArg = shi503Netname, shi503Type = shi503Type, shi503RemarkCtorArg = shi503Remark, shi503Permissions = shi503Permissions, shi503MaxUses = shi503MaxUses, shi503CurrentUses = shi503CurrentUses, shi503PathCtorArg = shi503Path, shi503PasswdCtorArg = shi503Passwd, shi503ServernameCtorArg = shi503Servername, shi503Reserved = shi503Reserved, shi503SecurityDescriptorCtorArg = shi503SecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShareInfo503) return false
        if (this.shi503Netname != other.shi503Netname) return false
        if (this.shi503Type != other.shi503Type) return false
        if (this.shi503Remark != other.shi503Remark) return false
        if (this.shi503Permissions != other.shi503Permissions) return false
        if (this.shi503MaxUses != other.shi503MaxUses) return false
        if (this.shi503CurrentUses != other.shi503CurrentUses) return false
        if (this.shi503Path != other.shi503Path) return false
        if (this.shi503Passwd != other.shi503Passwd) return false
        if (this.shi503Servername != other.shi503Servername) return false
        if (this.shi503Reserved != other.shi503Reserved) return false
        if (this.shi503SecurityDescriptor != other.shi503SecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shi503Netname.hashCode()
        result = 31 * result + this.shi503Type.hashCode()
        result = 31 * result + this.shi503Remark.hashCode()
        result = 31 * result + this.shi503Permissions.hashCode()
        result = 31 * result + this.shi503MaxUses.hashCode()
        result = 31 * result + this.shi503CurrentUses.hashCode()
        result = 31 * result + this.shi503Path.hashCode()
        result = 31 * result + this.shi503Passwd.hashCode()
        result = 31 * result + this.shi503Servername.hashCode()
        result = 31 * result + this.shi503Reserved.hashCode()
        result = 31 * result + this.shi503SecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shi503Netname: Pwstr = MutPtr(0L),
            shi503Type: ShareType = 0u,
            shi503Remark: Pwstr = MutPtr(0L),
            shi503Permissions: ShareInfoPermissions = 0u,
            shi503MaxUses: UInt = 0u,
            shi503CurrentUses: UInt = 0u,
            shi503Path: Pwstr = MutPtr(0L),
            shi503Passwd: Pwstr = MutPtr(0L),
            shi503Servername: Pwstr = MutPtr(0L),
            shi503Reserved: UInt = 0u,
            shi503SecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): ShareInfo503 =
            ShareInfo503(
                shi503NetnameCtorArg = shi503Netname,
                shi503Type = shi503Type,
                shi503RemarkCtorArg = shi503Remark,
                shi503Permissions = shi503Permissions,
                shi503MaxUses = shi503MaxUses,
                shi503CurrentUses = shi503CurrentUses,
                shi503PathCtorArg = shi503Path,
                shi503PasswdCtorArg = shi503Passwd,
                shi503ServernameCtorArg = shi503Servername,
                shi503Reserved = shi503Reserved,
                shi503SecurityDescriptorCtorArg = shi503SecurityDescriptor,
            )
    }
}

public class StatServer0(
    public var sts0Start: UInt = 0u,
    public var sts0Fopens: UInt = 0u,
    public var sts0Devopens: UInt = 0u,
    public var sts0Jobsqueued: UInt = 0u,
    public var sts0Sopens: UInt = 0u,
    public var sts0Stimedout: UInt = 0u,
    public var sts0Serrorout: UInt = 0u,
    public var sts0Pwerrors: UInt = 0u,
    public var sts0Permerrors: UInt = 0u,
    public var sts0Syserrors: UInt = 0u,
    public var sts0BytessentLow: UInt = 0u,
    public var sts0BytessentHigh: UInt = 0u,
    public var sts0BytesrcvdLow: UInt = 0u,
    public var sts0BytesrcvdHigh: UInt = 0u,
    public var sts0Avresponse: UInt = 0u,
    public var sts0Reqbufneed: UInt = 0u,
    public var sts0Bigbufneed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StatServer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StatServer0> {
                override val sizeBytes: Long = 68L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): StatServer0 =
                    StatServer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
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
                    )
                override fun writeNative(addr: Long, value: StatServer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sts0Start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sts0Fopens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sts0Devopens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sts0Jobsqueued)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sts0Sopens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sts0Stimedout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sts0Serrorout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.sts0Pwerrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.sts0Permerrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.sts0Syserrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.sts0BytessentLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.sts0BytessentHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.sts0BytesrcvdLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.sts0BytesrcvdHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.sts0Avresponse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.sts0Reqbufneed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.sts0Bigbufneed)
                }
            }
    }
}

public class StatWorkstation0(
    public var statisticsStartTime: Long = 0L,
    public var bytesReceived: Long = 0L,
    public var smbsReceived: Long = 0L,
    public var pagingReadBytesRequested: Long = 0L,
    public var nonPagingReadBytesRequested: Long = 0L,
    public var cacheReadBytesRequested: Long = 0L,
    public var networkReadBytesRequested: Long = 0L,
    public var bytesTransmitted: Long = 0L,
    public var smbsTransmitted: Long = 0L,
    public var pagingWriteBytesRequested: Long = 0L,
    public var nonPagingWriteBytesRequested: Long = 0L,
    public var cacheWriteBytesRequested: Long = 0L,
    public var networkWriteBytesRequested: Long = 0L,
    public var initiallyFailedOperations: UInt = 0u,
    public var failedCompletionOperations: UInt = 0u,
    public var readOperations: UInt = 0u,
    public var randomReadOperations: UInt = 0u,
    public var readSmbs: UInt = 0u,
    public var largeReadSmbs: UInt = 0u,
    public var smallReadSmbs: UInt = 0u,
    public var writeOperations: UInt = 0u,
    public var randomWriteOperations: UInt = 0u,
    public var writeSmbs: UInt = 0u,
    public var largeWriteSmbs: UInt = 0u,
    public var smallWriteSmbs: UInt = 0u,
    public var rawReadsDenied: UInt = 0u,
    public var rawWritesDenied: UInt = 0u,
    public var networkErrors: UInt = 0u,
    public var sessions: UInt = 0u,
    public var failedSessions: UInt = 0u,
    public var reconnects: UInt = 0u,
    public var coreConnects: UInt = 0u,
    public var lanman20Connects: UInt = 0u,
    public var lanman21Connects: UInt = 0u,
    public var lanmanNtConnects: UInt = 0u,
    public var serverDisconnects: UInt = 0u,
    public var hungSessions: UInt = 0u,
    public var useCount: UInt = 0u,
    public var failedUseCount: UInt = 0u,
    public var currentCommands: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StatWorkstation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StatWorkstation0> {
                override val sizeBytes: Long = 216L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): StatWorkstation0 =
                    StatWorkstation0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                    )
                override fun writeNative(addr: Long, value: StatWorkstation0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.statisticsStartTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.bytesReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.smbsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.pagingReadBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.nonPagingReadBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.cacheReadBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.networkReadBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.bytesTransmitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.smbsTransmitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.pagingWriteBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.nonPagingWriteBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.cacheWriteBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.networkWriteBytesRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.initiallyFailedOperations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.failedCompletionOperations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.readOperations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.randomReadOperations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.readSmbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.largeReadSmbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.smallReadSmbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.writeOperations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.randomWriteOperations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.writeSmbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.largeWriteSmbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.smallWriteSmbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.rawReadsDenied)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.rawWritesDenied)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.networkErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.sessions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.failedSessions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.reconnects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.coreConnects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.lanman20Connects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.lanman21Connects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.lanmanNtConnects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.serverDisconnects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.hungSessions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.useCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 204L, value.failedUseCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.currentCommands)
                }
            }
    }
}

public data class TapeErase(
    public var type: EraseTapeType = 0u,
    public var immediate: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeErase> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeErase> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TapeErase =
                    TapeErase(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TapeErase) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.immediate)
                }
            }
    }
}

public data class TapeGetPosition(
    public var type: TapePositionType = 0u,
    public var partition: UInt = 0u,
    public var offset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeGetPosition> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TapeGetPosition =
                    TapeGetPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TapeGetPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.partition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.offset)
                }
            }
    }
}

public data class TapePrepare(
    public var operation: PrepareTapeOperation = 0u,
    public var immediate: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapePrepare> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapePrepare> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TapePrepare =
                    TapePrepare(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TapePrepare) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.immediate)
                }
            }
    }
}

public data class TapeSetPosition(
    public var method: TapePositionMethod = 0u,
    public var partition: UInt = 0u,
    public var offset: Long = 0L,
    public var immediate: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeSetPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeSetPosition> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TapeSetPosition =
                    TapeSetPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TapeSetPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.method)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.partition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.immediate)
                }
            }
    }
}

public data class TapeWriteMarks(
    public var type: TapemarkType = 0u,
    public var count: UInt = 0u,
    public var immediate: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeWriteMarks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TapeWriteMarks> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TapeWriteMarks =
                    TapeWriteMarks(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TapeWriteMarks) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.immediate)
                }
            }
    }
}

public class TransactionNotification internal constructor(
    transactionKeyCtorArg: MutPtr<CVoid>,
    public var transactionNotification: UInt,
    public var tmVirtualClock: Long,
    public var argumentLength: UInt,
) {
    public var transactionKey: MutPtr<CVoid> = transactionKeyCtorArg
        internal set

    public constructor() : this(
        transactionKeyCtorArg = MutPtr(0L),
        transactionNotification = 0u,
        tmVirtualClock = 0L,
        argumentLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.transactionKey

    public operator fun component2(): UInt = this.transactionNotification

    public operator fun component3(): Long = this.tmVirtualClock

    public operator fun component4(): UInt = this.argumentLength

    public fun copy(transactionKey: MutPtr<CVoid> = this.transactionKey, transactionNotification: UInt = this.transactionNotification, tmVirtualClock: Long = this.tmVirtualClock, argumentLength: UInt = this.argumentLength): TransactionNotification = TransactionNotification(transactionKeyCtorArg = transactionKey, transactionNotification = transactionNotification, tmVirtualClock = tmVirtualClock, argumentLength = argumentLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TransactionNotification) return false
        if (this.transactionKey != other.transactionKey) return false
        if (this.transactionNotification != other.transactionNotification) return false
        if (this.tmVirtualClock != other.tmVirtualClock) return false
        if (this.argumentLength != other.argumentLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transactionKey.hashCode()
        result = 31 * result + this.transactionNotification.hashCode()
        result = 31 * result + this.tmVirtualClock.hashCode()
        result = 31 * result + this.argumentLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionNotification> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TransactionNotification =
                    TransactionNotification(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TransactionNotification) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.transactionKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.transactionNotification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.tmVirtualClock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.argumentLength)
                }
            }

        public operator fun invoke(
            transactionKey: MutPtr<CVoid> = MutPtr(0L),
            transactionNotification: UInt = 0u,
            tmVirtualClock: Long = 0L,
            argumentLength: UInt = 0u,
        ): TransactionNotification =
            TransactionNotification(
                transactionKeyCtorArg = transactionKey,
                transactionNotification = transactionNotification,
                tmVirtualClock = tmVirtualClock,
                argumentLength = argumentLength,
            )
    }
}

public data class TransactionNotificationMarshalArgument(
    public var marshalCookie: UInt = 0u,
    public var uow: Guid = Guid(),
)

public data class TransactionNotificationPropagateArgument(
    public var propagationCookie: UInt = 0u,
    public var uow: Guid = Guid(),
    public var tmIdentity: Guid = Guid(),
    public var bufferLength: UInt = 0u,
)

public data class TransactionNotificationRecoveryArgument(
    public var enlistmentId: Guid = Guid(),
    public var uow: Guid = Guid(),
)

public data class TransactionNotificationSavepointArgument(
    public var savepointId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionNotificationSavepointArgument> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransactionNotificationSavepointArgument> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TransactionNotificationSavepointArgument =
                    TransactionNotificationSavepointArgument(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TransactionNotificationSavepointArgument) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.savepointId)
                }
            }
    }
}

public data class TransactionNotificationTmOnlineArgument(
    public var tmIdentity: Guid = Guid(),
    public var flags: UInt = 0u,
)

public data class TxfId(
    public var anonymous: TxfId0 = TxfId0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfId> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TxfId =
                    TxfId(
                        (TxfId0.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TxfId) {
                    (TxfId0.typeLayout()).writeNative(addr, value.anonymous)
                }
            }
    }
}

public data class TxfId0(
    public var lowPart: Long = 0L,
    public var highPart: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfId0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TxfId0 =
                    TxfId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TxfId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.highPart)
                }
            }
    }
}

public data class TxfLogRecordAffectedFile(
    public var version: UShort = 0u,
    public var recordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var txfFileId: TxfId = TxfId(),
    public var ktmGuid: Guid = Guid(),
    public var fileNameLength: UInt = 0u,
    public var fileNameByteOffsetInStructure: UInt = 0u,
)

public data class TxfLogRecordBase(
    public var version: UShort = 0u,
    public var recordType: TxfLogRecordType = 0u,
    public var recordLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfLogRecordBase> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TxfLogRecordBase> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TxfLogRecordBase =
                    TxfLogRecordBase(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TxfLogRecordBase) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.recordType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.recordLength)
                }
            }
    }
}

public data class TxfLogRecordTruncate(
    public var version: UShort = 0u,
    public var recordType: UShort = 0u,
    public var recordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var txfFileId: TxfId = TxfId(),
    public var ktmGuid: Guid = Guid(),
    public var newFileSize: Long = 0L,
    public var fileNameLength: UInt = 0u,
    public var fileNameByteOffsetInStructure: UInt = 0u,
)

public data class TxfLogRecordWrite(
    public var version: UShort = 0u,
    public var recordType: UShort = 0u,
    public var recordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var txfFileId: TxfId = TxfId(),
    public var ktmGuid: Guid = Guid(),
    public var byteOffsetInFile: Long = 0L,
    public var numBytesWritten: UInt = 0u,
    public var byteOffsetInStructure: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileNameByteOffsetInStructure: UInt = 0u,
)

public data class VolumeAllocateBcStreamInput(
    public var version: UInt = 0u,
    public var requestsPerPeriod: UInt = 0u,
    public var period: UInt = 0u,
    public var retryFailures: Boolean = false,
    public var discardable: Boolean = false,
    public var reserved1: BooleanArray = BooleanArray(2),
    public var lowestByteOffset: ULong = 0uL,
    public var highestByteOffset: ULong = 0uL,
    public var accessType: UInt = 0u,
    public var accessMode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeAllocateBcStreamInput) return false
        if (this.version != other.version) return false
        if (this.requestsPerPeriod != other.requestsPerPeriod) return false
        if (this.period != other.period) return false
        if (this.retryFailures != other.retryFailures) return false
        if (this.discardable != other.discardable) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.lowestByteOffset != other.lowestByteOffset) return false
        if (this.highestByteOffset != other.highestByteOffset) return false
        if (this.accessType != other.accessType) return false
        if (this.accessMode != other.accessMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.requestsPerPeriod.hashCode()
        result = 31 * result + this.period.hashCode()
        result = 31 * result + this.retryFailures.hashCode()
        result = 31 * result + this.discardable.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.lowestByteOffset.hashCode()
        result = 31 * result + this.highestByteOffset.hashCode()
        result = 31 * result + this.accessType.hashCode()
        result = 31 * result + this.accessMode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocateBcStreamInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocateBcStreamInput> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeAllocateBcStreamInput =
                    VolumeAllocateBcStreamInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL, (2).toInt())
                        ).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: VolumeAllocateBcStreamInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.requestsPerPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.period)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.retryFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.discardable)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.lowestByteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.highestByteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.accessType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.accessMode)
                }
            }
    }
}

public data class VolumeAllocateBcStreamOutput(
    public var requestSize: ULong = 0uL,
    public var numOutStandingRequests: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocateBcStreamOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocateBcStreamOutput> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeAllocateBcStreamOutput =
                    VolumeAllocateBcStreamOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VolumeAllocateBcStreamOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.requestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numOutStandingRequests)
                }
            }
    }
}

public data class VolumeAllocationHintInput(
    public var clusterSize: UInt = 0u,
    public var numberOfClusters: UInt = 0u,
    public var startingClusterNumber: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocationHintInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocationHintInput> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeAllocationHintInput =
                    VolumeAllocationHintInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VolumeAllocationHintInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.clusterSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startingClusterNumber)
                }
            }
    }
}

public data class VolumeAllocationHintOutput(
    public var bitmap: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeAllocationHintOutput) return false
        if (!this.bitmap.contentEquals(other.bitmap)) return false
        return true
    }

    override fun hashCode(): Int = this.bitmap.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocationHintOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeAllocationHintOutput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VolumeAllocationHintOutput =
                    VolumeAllocationHintOutput(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VolumeAllocationHintOutput) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr, value.bitmap)
                }
            }
    }
}

public data class VolumeCriticalIo(
    public var accessType: UInt = 0u,
    public var extentsCount: UInt = 0u,
    public var extents: List<FileExtent> = List(1) { FileExtent() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeCriticalIo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeCriticalIo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeCriticalIo =
                    VolumeCriticalIo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(FileExtent.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VolumeCriticalIo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.accessType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.extentsCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(FileExtent.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.extents)
                }
            }
    }
}

public data class VolumeFailoverSet(
    public var numberOfDisks: UInt = 0u,
    public var diskNumbers: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeFailoverSet) return false
        if (this.numberOfDisks != other.numberOfDisks) return false
        if (!this.diskNumbers.contentEquals(other.diskNumbers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfDisks.hashCode()
        result = 31 * result + this.diskNumbers.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeFailoverSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeFailoverSet> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VolumeFailoverSet =
                    VolumeFailoverSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VolumeFailoverSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfDisks)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.diskNumbers)
                }
            }
    }
}

public data class VolumeGetBcPropertiesInput(
    public var version: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var lowestByteOffset: ULong = 0uL,
    public var highestByteOffset: ULong = 0uL,
    public var accessType: UInt = 0u,
    public var accessMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeGetBcPropertiesInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeGetBcPropertiesInput> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeGetBcPropertiesInput =
                    VolumeGetBcPropertiesInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: VolumeGetBcPropertiesInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lowestByteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.highestByteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.accessType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.accessMode)
                }
            }
    }
}

public data class VolumeGetBcPropertiesOutput(
    public var maximumRequestsPerPeriod: UInt = 0u,
    public var minimumPeriod: UInt = 0u,
    public var maximumRequestSize: ULong = 0uL,
    public var estimatedTimePerRequest: UInt = 0u,
    public var numOutStandingRequests: UInt = 0u,
    public var requestSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeGetBcPropertiesOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeGetBcPropertiesOutput> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeGetBcPropertiesOutput =
                    VolumeGetBcPropertiesOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: VolumeGetBcPropertiesOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumRequestsPerPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maximumRequestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.estimatedTimePerRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numOutStandingRequests)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.requestSize)
                }
            }
    }
}

public data class VolumeLogicalOffset(
    public var logicalOffset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeLogicalOffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeLogicalOffset> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeLogicalOffset =
                    VolumeLogicalOffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VolumeLogicalOffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.logicalOffset)
                }
            }
    }
}

public data class VolumeNumber(
    public var volumeNumber: UInt = 0u,
    public var volumeManagerName: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeNumber) return false
        if (this.volumeNumber != other.volumeNumber) return false
        if (!this.volumeManagerName.contentEquals(other.volumeManagerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeNumber.hashCode()
        result = 31 * result + this.volumeManagerName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeNumber> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VolumeNumber =
                    VolumeNumber(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VolumeNumber) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.volumeNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 4L, value.volumeManagerName)
                }
            }
    }
}

public data class VolumePhysicalOffset(
    public var diskNumber: UInt = 0u,
    public var offset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumePhysicalOffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumePhysicalOffset> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumePhysicalOffset =
                    VolumePhysicalOffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VolumePhysicalOffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.diskNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.offset)
                }
            }
    }
}

public data class VolumePhysicalOffsets(
    public var numberOfPhysicalOffsets: UInt = 0u,
    public var physicalOffset: List<VolumePhysicalOffset> = List(1) { VolumePhysicalOffset() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumePhysicalOffsets> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumePhysicalOffsets> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumePhysicalOffsets =
                    VolumePhysicalOffsets(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(VolumePhysicalOffset.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VolumePhysicalOffsets) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfPhysicalOffsets)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(VolumePhysicalOffset.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.physicalOffset)
                }
            }
    }
}

public data class VolumeReadPlexInput(
    public var byteOffset: Long = 0L,
    public var length: UInt = 0u,
    public var plexNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeReadPlexInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeReadPlexInput> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeReadPlexInput =
                    VolumeReadPlexInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: VolumeReadPlexInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.byteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.plexNumber)
                }
            }
    }
}

public data class VolumeSetGptAttributesInformation(
    public var gptAttributes: ULong = 0uL,
    public var revertOnClose: Boolean = false,
    public var applyToAllConnectedVolumes: Boolean = false,
    public var reserved1: UShort = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeSetGptAttributesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeSetGptAttributesInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeSetGptAttributesInformation =
                    VolumeSetGptAttributesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: VolumeSetGptAttributesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.gptAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.revertOnClose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.applyToAllConnectedVolumes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved2)
                }
            }
    }
}

public data class VolumeShrinkInfo(
    public var volumeSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeShrinkInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeShrinkInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeShrinkInfo =
                    VolumeShrinkInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VolumeShrinkInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.volumeSize)
                }
            }
    }
}

public data class VsFixedfileinfo(
    public var dwSignature: UInt = 0u,
    public var dwStrucVersion: UInt = 0u,
    public var dwFileVersionMS: UInt = 0u,
    public var dwFileVersionLS: UInt = 0u,
    public var dwProductVersionMS: UInt = 0u,
    public var dwProductVersionLS: UInt = 0u,
    public var dwFileFlagsMask: UInt = 0u,
    public var dwFileFlags: VsFixedfileinfoFileFlags = 0u,
    public var dwFileOS: VsFixedfileinfoFileOs = 0u,
    public var dwFileType: UInt = 0u,
    public var dwFileSubtype: UInt = 0u,
    public var dwFileDateMS: UInt = 0u,
    public var dwFileDateLS: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VsFixedfileinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VsFixedfileinfo> {
                override val sizeBytes: Long = 52L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VsFixedfileinfo =
                    VsFixedfileinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
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
                    )
                override fun writeNative(addr: Long, value: VsFixedfileinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStrucVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFileVersionMS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFileVersionLS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwProductVersionMS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwProductVersionLS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwFileFlagsMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwFileFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwFileOS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwFileType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwFileSubtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwFileDateMS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwFileDateLS)
                }
            }
    }
}

public class WimEntryInfo internal constructor(
    public var wimEntryInfoSize: UInt,
    public var wimType: UInt,
    public var dataSourceId: Long,
    public var wimGuid: Guid,
    wimPathCtorArg: Pcwstr,
    public var wimIndex: UInt,
    public var flags: UInt,
) {
    public var wimPath: Pcwstr = wimPathCtorArg
        internal set

    public constructor() : this(
        wimEntryInfoSize = 0u,
        wimType = 0u,
        dataSourceId = 0L,
        wimGuid = Guid(),
        wimPathCtorArg = ConstPtr(0L),
        wimIndex = 0u,
        flags = 0u,
    )

    public operator fun component1(): UInt = this.wimEntryInfoSize

    public operator fun component2(): UInt = this.wimType

    public operator fun component3(): Long = this.dataSourceId

    public operator fun component4(): Guid = this.wimGuid

    public operator fun component5(): Pcwstr = this.wimPath

    public operator fun component6(): UInt = this.wimIndex

    public operator fun component7(): UInt = this.flags

    public fun copy(wimEntryInfoSize: UInt = this.wimEntryInfoSize, wimType: UInt = this.wimType, dataSourceId: Long = this.dataSourceId, wimGuid: Guid = this.wimGuid, wimPath: Pcwstr = this.wimPath, wimIndex: UInt = this.wimIndex, flags: UInt = this.flags): WimEntryInfo = WimEntryInfo(wimEntryInfoSize = wimEntryInfoSize, wimType = wimType, dataSourceId = dataSourceId, wimGuid = wimGuid, wimPathCtorArg = wimPath, wimIndex = wimIndex, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WimEntryInfo) return false
        if (this.wimEntryInfoSize != other.wimEntryInfoSize) return false
        if (this.wimType != other.wimType) return false
        if (this.dataSourceId != other.dataSourceId) return false
        if (this.wimGuid != other.wimGuid) return false
        if (this.wimPath != other.wimPath) return false
        if (this.wimIndex != other.wimIndex) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wimEntryInfoSize.hashCode()
        result = 31 * result + this.wimType.hashCode()
        result = 31 * result + this.dataSourceId.hashCode()
        result = 31 * result + this.wimGuid.hashCode()
        result = 31 * result + this.wimPath.hashCode()
        result = 31 * result + this.wimIndex.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wimEntryInfoSize: UInt = 0u,
            wimType: UInt = 0u,
            dataSourceId: Long = 0L,
            wimGuid: Guid = Guid(),
            wimPath: Pcwstr = ConstPtr(0L),
            wimIndex: UInt = 0u,
            flags: UInt = 0u,
        ): WimEntryInfo =
            WimEntryInfo(
                wimEntryInfoSize = wimEntryInfoSize,
                wimType = wimType,
                dataSourceId = dataSourceId,
                wimGuid = wimGuid,
                wimPathCtorArg = wimPath,
                wimIndex = wimIndex,
                flags = flags,
            )
    }
}

public data class WimExternalFileInfo(
    public var dataSourceId: Long = 0L,
    public var resourceHash: UByteArray = UByteArray(20),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WimExternalFileInfo) return false
        if (this.dataSourceId != other.dataSourceId) return false
        if (!this.resourceHash.contentEquals(other.resourceHash)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataSourceId.hashCode()
        result = 31 * result + this.resourceHash.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimExternalFileInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WimExternalFileInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WimExternalFileInfo =
                    WimExternalFileInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: WimExternalFileInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.dataSourceId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 8L, value.resourceHash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.flags)
                }
            }
    }
}

public data class Win32FileAttributeData(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
)

public data class Win32FindDataa(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var cFileName: ByteArray = ByteArray(260),
    public var cAlternateFileName: ByteArray = ByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32FindDataa) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.ftCreationTime != other.ftCreationTime) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ftLastWriteTime != other.ftLastWriteTime) return false
        if (this.nFileSizeHigh != other.nFileSizeHigh) return false
        if (this.nFileSizeLow != other.nFileSizeLow) return false
        if (this.dwReserved0 != other.dwReserved0) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (!this.cFileName.contentEquals(other.cFileName)) return false
        if (!this.cAlternateFileName.contentEquals(other.cAlternateFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFileAttributes.hashCode()
        result = 31 * result + this.ftCreationTime.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ftLastWriteTime.hashCode()
        result = 31 * result + this.nFileSizeHigh.hashCode()
        result = 31 * result + this.nFileSizeLow.hashCode()
        result = 31 * result + this.dwReserved0.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.cFileName.contentHashCode()
        result = 31 * result + this.cAlternateFileName.contentHashCode()
        return result
    }
}

public data class Win32FindDataw(
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var dwReserved0: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var cFileName: UShortArray = UShortArray(260),
    public var cAlternateFileName: UShortArray = UShortArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32FindDataw) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.ftCreationTime != other.ftCreationTime) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ftLastWriteTime != other.ftLastWriteTime) return false
        if (this.nFileSizeHigh != other.nFileSizeHigh) return false
        if (this.nFileSizeLow != other.nFileSizeLow) return false
        if (this.dwReserved0 != other.dwReserved0) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (!this.cFileName.contentEquals(other.cFileName)) return false
        if (!this.cAlternateFileName.contentEquals(other.cAlternateFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFileAttributes.hashCode()
        result = 31 * result + this.ftCreationTime.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ftLastWriteTime.hashCode()
        result = 31 * result + this.nFileSizeHigh.hashCode()
        result = 31 * result + this.nFileSizeLow.hashCode()
        result = 31 * result + this.dwReserved0.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.cFileName.contentHashCode()
        result = 31 * result + this.cAlternateFileName.contentHashCode()
        return result
    }
}

public data class Win32FindStreamData(
    public var streamSize: Long = 0L,
    public var cStreamName: UShortArray = UShortArray(296),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32FindStreamData) return false
        if (this.streamSize != other.streamSize) return false
        if (!this.cStreamName.contentEquals(other.cStreamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.streamSize.hashCode()
        result = 31 * result + this.cStreamName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32FindStreamData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32FindStreamData> {
                override val sizeBytes: Long = 600L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Win32FindStreamData =
                    Win32FindStreamData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (296).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Win32FindStreamData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.streamSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (296).toInt())
                    ).writeNative(addr + 8L, value.cStreamName)
                }
            }
    }
}

public data class Win32StreamId(
    public var dwStreamId: WinStreamId = 0u,
    public var dwStreamAttributes: UInt = 0u,
    public var size: Long = 0L,
    public var dwStreamNameSize: UInt = 0u,
    public var cStreamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Win32StreamId) return false
        if (this.dwStreamId != other.dwStreamId) return false
        if (this.dwStreamAttributes != other.dwStreamAttributes) return false
        if (this.size != other.size) return false
        if (this.dwStreamNameSize != other.dwStreamNameSize) return false
        if (!this.cStreamName.contentEquals(other.cStreamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStreamId.hashCode()
        result = 31 * result + this.dwStreamAttributes.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.dwStreamNameSize.hashCode()
        result = 31 * result + this.cStreamName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32StreamId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Win32StreamId> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Win32StreamId =
                    Win32StreamId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Win32StreamId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStreamId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStreamAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwStreamNameSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 20L, value.cStreamName)
                }
            }
    }
}

public data class WofFileCompressionInfoV0(
    public var algorithm: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofFileCompressionInfoV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofFileCompressionInfoV0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WofFileCompressionInfoV0 =
                    WofFileCompressionInfoV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WofFileCompressionInfoV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.algorithm)
                }
            }
    }
}

public data class WofFileCompressionInfoV1(
    public var algorithm: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofFileCompressionInfoV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WofFileCompressionInfoV1> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WofFileCompressionInfoV1 =
                    WofFileCompressionInfoV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WofFileCompressionInfoV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.algorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}
