@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily

public class DosImageInfo internal constructor(
    pdbNameCtorArg: Pcstr,
    public var imageBaseAddress: ULong,
    public var imageSize: UInt,
    public var timestamp: UInt,
) {
    public var pdbName: Pcstr = pdbNameCtorArg
        internal set

    public constructor() : this(
        pdbNameCtorArg = ConstPtr(0L),
        imageBaseAddress = 0uL,
        imageSize = 0u,
        timestamp = 0u,
    )

    public operator fun component1(): Pcstr = this.pdbName

    public operator fun component2(): ULong = this.imageBaseAddress

    public operator fun component3(): UInt = this.imageSize

    public operator fun component4(): UInt = this.timestamp

    public fun copy(pdbName: Pcstr = this.pdbName, imageBaseAddress: ULong = this.imageBaseAddress, imageSize: UInt = this.imageSize, timestamp: UInt = this.timestamp): DosImageInfo = DosImageInfo(pdbNameCtorArg = pdbName, imageBaseAddress = imageBaseAddress, imageSize = imageSize, timestamp = timestamp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DosImageInfo) return false
        if (this.pdbName != other.pdbName) return false
        if (this.imageBaseAddress != other.imageBaseAddress) return false
        if (this.imageSize != other.imageSize) return false
        if (this.timestamp != other.timestamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pdbName.hashCode()
        result = 31 * result + this.imageBaseAddress.hashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.timestamp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pdbName: Pcstr = ConstPtr(0L),
            imageBaseAddress: ULong = 0uL,
            imageSize: UInt = 0u,
            timestamp: UInt = 0u,
        ): DosImageInfo =
            DosImageInfo(
                pdbNameCtorArg = pdbName,
                imageBaseAddress = imageBaseAddress,
                imageSize = imageSize,
                timestamp = timestamp,
            )
    }
}

public data class GpaMemoryChunk(
    public var guestPhysicalStartPageIndex: ULong = 0uL,
    public var pageCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpaMemoryChunk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpaMemoryChunk> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GpaMemoryChunk =
                    GpaMemoryChunk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GpaMemoryChunk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.guestPhysicalStartPageIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pageCount)
                }
            }
    }
}

public data class GuestOsInfo(
    public var asUINT64: ULong = 0uL,
    public var closedSource: GuestOsInfo0 = GuestOsInfo0(),
    public var openSource: GuestOsInfo1 = GuestOsInfo1(),
)

public data class GuestOsInfo0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuestOsInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuestOsInfo0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GuestOsInfo0 =
                    GuestOsInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GuestOsInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class GuestOsInfo1(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuestOsInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GuestOsInfo1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GuestOsInfo1 =
                    GuestOsInfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GuestOsInfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class HdvPciDeviceInterface(
    public var version: HdvPciInterfaceVersion = 0,
    public var initialize: HdvPciDeviceInitialize = null,
    public var teardown: HdvPciDeviceTeardown = null,
    public var setConfiguration: HdvPciDeviceSetConfiguration = null,
    public var getDetails: HdvPciDeviceGetDetails = null,
    public var start: HdvPciDeviceStart = null,
    public var stop: HdvPciDeviceStop = null,
    public var readConfigSpace: HdvPciReadConfigSpace = null,
    public var writeConfigSpace: HdvPciWriteConfigSpace = null,
    public var readInterceptedMemory: HdvPciReadInterceptedMemory = null,
    public var writeInterceptedMemory: HdvPciWriteInterceptedMemory = null,
)

public data class HdvPciPnpId(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var progIf: UByte = 0u,
    public var subClass: UByte = 0u,
    public var baseClass: UByte = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HdvPciPnpId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HdvPciPnpId> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): HdvPciPnpId =
                    HdvPciPnpId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: HdvPciPnpId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.vendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.deviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.revisionID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.progIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.subClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.baseClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.subVendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.subSystemID)
                }
            }
    }
}

public data class HvsocketAddressInfo(
    public var systemId: Guid = Guid(),
    public var virtualMachineId: Guid = Guid(),
    public var siloId: Guid = Guid(),
    public var flags: UInt = 0u,
)

public class ModuleInfo internal constructor(
    processImageNameCtorArg: Pcstr,
    public var image: DosImageInfo,
) {
    public var processImageName: Pcstr = processImageNameCtorArg
        internal set

    public constructor() : this(
        processImageNameCtorArg = ConstPtr(0L),
        image = DosImageInfo(),
    )

    public operator fun component1(): Pcstr = this.processImageName

    public operator fun component2(): DosImageInfo = this.image

    public fun copy(processImageName: Pcstr = this.processImageName, image: DosImageInfo = this.image): ModuleInfo = ModuleInfo(processImageNameCtorArg = processImageName, image = image)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModuleInfo) return false
        if (this.processImageName != other.processImageName) return false
        if (this.image != other.image) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processImageName.hashCode()
        result = 31 * result + this.image.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            processImageName: Pcstr = ConstPtr(0L),
            image: DosImageInfo = DosImageInfo(),
        ): ModuleInfo =
            ModuleInfo(
                processImageNameCtorArg = processImageName,
                image = image,
            )
    }
}

public data class SockaddrHv(
    public var family: AddressFamily = 0u,
    public var reserved: UShort = 0u,
    public var vmId: Guid = Guid(),
    public var serviceId: Guid = Guid(),
)

public data class VirtualProcessorRegister(
    public var reg64: ULong = 0uL,
    public var reg32: UInt = 0u,
    public var reg16: UShort = 0u,
    public var reg8: UByte = 0u,
    public var reg128: VirtualProcessorRegister0 = VirtualProcessorRegister0(),
    public var x64: VirtualProcessorRegister1 = VirtualProcessorRegister1(),
)

public data class VirtualProcessorRegister0(
    public var low64: ULong = 0uL,
    public var high64: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VirtualProcessorRegister0 =
                    VirtualProcessorRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VirtualProcessorRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.low64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.high64)
                }
            }
    }
}

public data class VirtualProcessorRegister1(
    public var segment: VirtualProcessorRegister10 = VirtualProcessorRegister10(),
    public var table: VirtualProcessorRegister11 = VirtualProcessorRegister11(),
    public var fpControlStatus: VirtualProcessorRegister12 = VirtualProcessorRegister12(),
    public var xmmControlStatus: VirtualProcessorRegister13 = VirtualProcessorRegister13(),
)

public data class VirtualProcessorRegister12(
    public var fpControl: UShort = 0u,
    public var fpStatus: UShort = 0u,
    public var fpTag: UByte = 0u,
    public var reserved: UByte = 0u,
    public var lastFpOp: UShort = 0u,
    public var anonymous: VirtualProcessorRegister120 = VirtualProcessorRegister120(),
)

public data class VirtualProcessorRegister120(
    public var lastFpRip: ULong = 0uL,
    public var anonymous: VirtualProcessorRegister1200 = VirtualProcessorRegister1200(),
)

public data class VirtualProcessorRegister1200(
    public var lastFpEip: UInt = 0u,
    public var lastFpCs: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister1200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister1200> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VirtualProcessorRegister1200 =
                    VirtualProcessorRegister1200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VirtualProcessorRegister1200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lastFpEip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.lastFpCs)
                }
            }
    }
}

public data class VirtualProcessorRegister10(
    public var base: ULong = 0uL,
    public var limit: UInt = 0u,
    public var selector: UShort = 0u,
    public var anonymous: VirtualProcessorRegister100 = VirtualProcessorRegister100(),
)

public data class VirtualProcessorRegister100(
    public var attributes: UShort = 0u,
    public var anonymous: VirtualProcessorRegister1000 = VirtualProcessorRegister1000(),
)

public data class VirtualProcessorRegister1000(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister1000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister1000> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): VirtualProcessorRegister1000 =
                    VirtualProcessorRegister1000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VirtualProcessorRegister1000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VirtualProcessorRegister11(
    public var limit: UShort = 0u,
    public var base: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister11> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VirtualProcessorRegister11 =
                    VirtualProcessorRegister11(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VirtualProcessorRegister11) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.limit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.base)
                }
            }
    }
}

public data class VirtualProcessorRegister13(
    public var anonymous: VirtualProcessorRegister130 = VirtualProcessorRegister130(),
    public var xmmStatusControl: UInt = 0u,
    public var xmmStatusControlMask: UInt = 0u,
)

public data class VirtualProcessorRegister130(
    public var lastFpRdp: ULong = 0uL,
    public var anonymous: VirtualProcessorRegister1300 = VirtualProcessorRegister1300(),
)

public data class VirtualProcessorRegister1300(
    public var lastFpDp: UInt = 0u,
    public var lastFpDs: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister1300> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualProcessorRegister1300> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VirtualProcessorRegister1300 =
                    VirtualProcessorRegister1300(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VirtualProcessorRegister1300) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lastFpDp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.lastFpDs)
                }
            }
    }
}

public data class VmGencounter(
    public var generationCount: ULong = 0uL,
    public var generationCountHigh: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmGencounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmGencounter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VmGencounter =
                    VmGencounter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VmGencounter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.generationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.generationCountHigh)
                }
            }
    }
}

public data class WhvAccessGpaControls(
    public var asUINT64: ULong = 0uL,
    public var anonymous: WhvAccessGpaControls0 = WhvAccessGpaControls0(),
)

public data class WhvAccessGpaControls0(
    public var cacheType: WhvCacheType = 0,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvAccessGpaControls0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvAccessGpaControls0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvAccessGpaControls0 =
                    WhvAccessGpaControls0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WhvAccessGpaControls0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cacheType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class WhvAdviseGpaRange(
    public var populate: WhvAdviseGpaRangePopulate = WhvAdviseGpaRangePopulate(),
)

public data class WhvAdviseGpaRangePopulate(
    public var flags: WhvAdviseGpaRangePopulateFlags = WhvAdviseGpaRangePopulateFlags(),
    public var accessType: WhvMemoryAccessType = 0,
)

public data class WhvAdviseGpaRangePopulateFlags(
    public var asUINT32: UInt = 0u,
    public var anonymous: WhvAdviseGpaRangePopulateFlags0 = WhvAdviseGpaRangePopulateFlags0(),
)

public data class WhvAdviseGpaRangePopulateFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvAdviseGpaRangePopulateFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvAdviseGpaRangePopulateFlags0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvAdviseGpaRangePopulateFlags0 =
                    WhvAdviseGpaRangePopulateFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvAdviseGpaRangePopulateFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class WhvCapability(
    public var hypervisorPresent: Bool = 0,
    public var features: WhvCapabilityFeatures = WhvCapabilityFeatures(),
    public var extendedVmExits: WhvExtendedVmExits = WhvExtendedVmExits(),
    public var processorVendor: WhvProcessorVendor = 0,
    public var processorFeatures: WhvProcessorFeatures = WhvProcessorFeatures(),
    public var syntheticProcessorFeaturesBanks: WhvSyntheticProcessorFeaturesBanks = WhvSyntheticProcessorFeaturesBanks(),
    public var processorXsaveFeatures: WhvProcessorXsaveFeatures = WhvProcessorXsaveFeatures(),
    public var processorClFlushSize: UByte = 0u,
    public var exceptionExitBitmap: ULong = 0uL,
    public var x64MsrExitBitmap: WhvX64MsrExitBitmap = WhvX64MsrExitBitmap(),
    public var processorClockFrequency: ULong = 0uL,
    public var interruptClockFrequency: ULong = 0uL,
    public var processorFeaturesBanks: WhvProcessorFeaturesBanks = WhvProcessorFeaturesBanks(),
    public var gpaRangePopulateFlags: WhvAdviseGpaRangePopulateFlags = WhvAdviseGpaRangePopulateFlags(),
    public var processorFrequencyCap: WhvCapabilityProcessorFrequencyCap = WhvCapabilityProcessorFrequencyCap(),
    public var processorPerfmonFeatures: WhvProcessorPerfmonFeatures = WhvProcessorPerfmonFeatures(),
    public var schedulerFeatures: WhvSchedulerFeatures = WhvSchedulerFeatures(),
)

public data class WhvCapabilityFeatures(
    public var anonymous: WhvCapabilityFeatures0 = WhvCapabilityFeatures0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvCapabilityFeatures0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvCapabilityFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvCapabilityFeatures0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvCapabilityFeatures0 =
                    WhvCapabilityFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvCapabilityFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvCapabilityProcessorFrequencyCap(
    public var bitfield: UInt = 0u,
    public var highestFrequencyMhz: UInt = 0u,
    public var nominalFrequencyMhz: UInt = 0u,
    public var lowestFrequencyMhz: UInt = 0u,
    public var frequencyStepMhz: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvCapabilityProcessorFrequencyCap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvCapabilityProcessorFrequencyCap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): WhvCapabilityProcessorFrequencyCap =
                    WhvCapabilityProcessorFrequencyCap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WhvCapabilityProcessorFrequencyCap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.highestFrequencyMhz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nominalFrequencyMhz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lowestFrequencyMhz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.frequencyStepMhz)
                }
            }
    }
}

public data class WhvCpuidOutput(
    public var eax: UInt = 0u,
    public var ebx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var edx: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvCpuidOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvCpuidOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvCpuidOutput =
                    WhvCpuidOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WhvCpuidOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ebx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ecx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.edx)
                }
            }
    }
}

public data class WhvDoorbellMatchData(
    public var guestAddress: ULong = 0uL,
    public var value: ULong = 0uL,
    public var length: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvDoorbellMatchData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvDoorbellMatchData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WhvDoorbellMatchData =
                    WhvDoorbellMatchData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WhvDoorbellMatchData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.guestAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bitfield)
                }
            }
    }
}

public data class WhvEmulatorCallbacks(
    public var size: UInt = 0u,
    public var reserved: UInt = 0u,
    public var wHvEmulatorIoPortCallback: WhvEmulatorIoPortCallback = null,
    public var wHvEmulatorMemoryCallback: WhvEmulatorMemoryCallback = null,
    public var wHvEmulatorGetVirtualProcessorRegisters: WhvEmulatorGetVirtualProcessorRegistersCallback = null,
    public var wHvEmulatorSetVirtualProcessorRegisters: WhvEmulatorSetVirtualProcessorRegistersCallback = null,
    public var wHvEmulatorTranslateGvaPage: WhvEmulatorTranslateGvaPageCallback = null,
)

public data class WhvEmulatorIoAccessInfo(
    public var direction: UByte = 0u,
    public var port: UShort = 0u,
    public var accessSize: UShort = 0u,
    public var data: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvEmulatorIoAccessInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvEmulatorIoAccessInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): WhvEmulatorIoAccessInfo =
                    WhvEmulatorIoAccessInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvEmulatorIoAccessInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.direction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.accessSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class WhvEmulatorMemoryAccessInfo(
    public var gpaAddress: ULong = 0uL,
    public var direction: UByte = 0u,
    public var accessSize: UByte = 0u,
    public var data: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvEmulatorMemoryAccessInfo) return false
        if (this.gpaAddress != other.gpaAddress) return false
        if (this.direction != other.direction) return false
        if (this.accessSize != other.accessSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpaAddress.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.accessSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvEmulatorMemoryAccessInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvEmulatorMemoryAccessInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WhvEmulatorMemoryAccessInfo =
                    WhvEmulatorMemoryAccessInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WhvEmulatorMemoryAccessInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.gpaAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.direction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.accessSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 10L, value.data.toList())
                }
            }
    }
}

public data class WhvEmulatorStatus(
    public var anonymous: WhvEmulatorStatus0 = WhvEmulatorStatus0(),
    public var asUINT32: UInt = 0u,
)

public data class WhvEmulatorStatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvEmulatorStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvEmulatorStatus0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvEmulatorStatus0 =
                    WhvEmulatorStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvEmulatorStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvExtendedVmExits(
    public var anonymous: WhvExtendedVmExits0 = WhvExtendedVmExits0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvExtendedVmExits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvExtendedVmExits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvExtendedVmExits0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvExtendedVmExits0 =
                    WhvExtendedVmExits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvExtendedVmExits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvHypercallContext(
    public var rax: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var reserved0: ULong = 0uL,
    public var xmmRegisters: List<WhvUint128> = List(6) { WhvUint128() },
    public var reserved1: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvHypercallContext) return false
        if (this.rax != other.rax) return false
        if (this.rbx != other.rbx) return false
        if (this.rcx != other.rcx) return false
        if (this.rdx != other.rdx) return false
        if (this.r8 != other.r8) return false
        if (this.rsi != other.rsi) return false
        if (this.rdi != other.rdi) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.xmmRegisters != other.xmmRegisters) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rax.hashCode()
        result = 31 * result + this.rbx.hashCode()
        result = 31 * result + this.rcx.hashCode()
        result = 31 * result + this.rdx.hashCode()
        result = 31 * result + this.r8.hashCode()
        result = 31 * result + this.rsi.hashCode()
        result = 31 * result + this.rdi.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.xmmRegisters.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class WhvInternalActivityRegister(
    public var anonymous: WhvInternalActivityRegister0 = WhvInternalActivityRegister0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvInternalActivityRegister0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvInternalActivityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvInternalActivityRegister0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvInternalActivityRegister0 =
                    WhvInternalActivityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvInternalActivityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvInterruptControl(
    public var bitfield: ULong = 0uL,
    public var destination: UInt = 0u,
    public var vector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvInterruptControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvInterruptControl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvInterruptControl =
                    WhvInterruptControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WhvInterruptControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.destination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.vector)
                }
            }
    }
}

public data class WhvMemoryAccessContext(
    public var instructionByteCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var instructionBytes: UByteArray = UByteArray(16),
    public var accessInfo: WhvMemoryAccessInfo = WhvMemoryAccessInfo(),
    public var gpa: ULong = 0uL,
    public var gva: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvMemoryAccessContext) return false
        if (this.instructionByteCount != other.instructionByteCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.instructionBytes.contentEquals(other.instructionBytes)) return false
        if (this.accessInfo != other.accessInfo) return false
        if (this.gpa != other.gpa) return false
        if (this.gva != other.gva) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionByteCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.instructionBytes.contentHashCode()
        result = 31 * result + this.accessInfo.hashCode()
        result = 31 * result + this.gpa.hashCode()
        result = 31 * result + this.gva.hashCode()
        return result
    }
}

public data class WhvMemoryAccessInfo(
    public var anonymous: WhvMemoryAccessInfo0 = WhvMemoryAccessInfo0(),
    public var asUINT32: UInt = 0u,
)

public data class WhvMemoryAccessInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvMemoryAccessInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvMemoryAccessInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvMemoryAccessInfo0 =
                    WhvMemoryAccessInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvMemoryAccessInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvMemoryRangeEntry(
    public var guestAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvMemoryRangeEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvMemoryRangeEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvMemoryRangeEntry =
                    WhvMemoryRangeEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvMemoryRangeEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.guestAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sizeInBytes)
                }
            }
    }
}

public data class WhvMsrActionEntry(
    public var index: UInt = 0u,
    public var readAction: UByte = 0u,
    public var writeAction: UByte = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvMsrActionEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvMsrActionEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvMsrActionEntry =
                    WhvMsrActionEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WhvMsrActionEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.readAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.writeAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public data class WhvNotificationPortParameters(
    public var notificationPortType: WhvNotificationPortType = 0,
    public var reserved: UInt = 0u,
    public var anonymous: WhvNotificationPortParameters0 = WhvNotificationPortParameters0(),
)

public data class WhvNotificationPortParameters0(
    public var doorbell: WhvDoorbellMatchData = WhvDoorbellMatchData(),
    public var event: WhvNotificationPortParameters00 = WhvNotificationPortParameters00(),
)

public data class WhvNotificationPortParameters00(
    public var connectionId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvNotificationPortParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvNotificationPortParameters00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvNotificationPortParameters00 =
                    WhvNotificationPortParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvNotificationPortParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionId)
                }
            }
    }
}

public data class WhvPartitionMemoryCounters(
    public var mapped4KPageCount: ULong = 0uL,
    public var mapped2MPageCount: ULong = 0uL,
    public var mapped1GPageCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvPartitionMemoryCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvPartitionMemoryCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WhvPartitionMemoryCounters =
                    WhvPartitionMemoryCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WhvPartitionMemoryCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mapped4KPageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mapped2MPageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mapped1GPageCount)
                }
            }
    }
}

public class WhvPartitionProperty(
    public var extendedVmExits: WhvExtendedVmExits = WhvExtendedVmExits(),
    public var processorFeatures: WhvProcessorFeatures = WhvProcessorFeatures(),
    public var syntheticProcessorFeaturesBanks: WhvSyntheticProcessorFeaturesBanks = WhvSyntheticProcessorFeaturesBanks(),
    public var processorXsaveFeatures: WhvProcessorXsaveFeatures = WhvProcessorXsaveFeatures(),
    public var processorClFlushSize: UByte = 0u,
    public var processorCount: UInt = 0u,
    public var cpuidExitList: UIntArray = UIntArray(1),
    public var cpuidResultList: List<WhvX64CpuidResult> = List(1) { WhvX64CpuidResult() },
    public var cpuidResultList2: List<WhvX64CpuidResult2> = List(1) { WhvX64CpuidResult2() },
    public var msrActionList: List<WhvMsrActionEntry> = List(1) { WhvMsrActionEntry() },
    public var unimplementedMsrAction: WhvMsrAction = 0,
    public var exceptionExitBitmap: ULong = 0uL,
    public var localApicEmulationMode: WhvX64LocalApicEmulationMode = 0,
    public var separateSecurityDomain: Bool = 0,
    public var nestedVirtualization: Bool = 0,
    public var x64MsrExitBitmap: WhvX64MsrExitBitmap = WhvX64MsrExitBitmap(),
    public var processorClockFrequency: ULong = 0uL,
    public var interruptClockFrequency: ULong = 0uL,
    public var apicRemoteRead: Bool = 0,
    public var processorFeaturesBanks: WhvProcessorFeaturesBanks = WhvProcessorFeaturesBanks(),
    public var referenceTime: ULong = 0uL,
    public var primaryNumaNode: UShort = 0u,
    public var cpuReserve: UInt = 0u,
    public var cpuCap: UInt = 0u,
    public var cpuWeight: UInt = 0u,
    public var cpuGroupId: ULong = 0uL,
    public var processorFrequencyCap: UInt = 0u,
    public var allowDeviceAssignment: Bool = 0,
    public var processorPerfmonFeatures: WhvProcessorPerfmonFeatures = WhvProcessorPerfmonFeatures(),
    public var disableSmt: Bool = 0,
)

public data class WhvProcessorApicCounters(
    public var mmioAccessCount: ULong = 0uL,
    public var eoiAccessCount: ULong = 0uL,
    public var tprAccessCount: ULong = 0uL,
    public var sentIpiCount: ULong = 0uL,
    public var selfIpiCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorApicCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorApicCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): WhvProcessorApicCounters =
                    WhvProcessorApicCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorApicCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mmioAccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.eoiAccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.tprAccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.sentIpiCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.selfIpiCount)
                }
            }
    }
}

public data class WhvProcessorEventCounters(
    public var pageFaultCount: ULong = 0uL,
    public var exceptionCount: ULong = 0uL,
    public var interruptCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorEventCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorEventCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WhvProcessorEventCounters =
                    WhvProcessorEventCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorEventCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.exceptionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.interruptCount)
                }
            }
    }
}

public data class WhvProcessorFeatures(
    public var anonymous: WhvProcessorFeatures0 = WhvProcessorFeatures0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvProcessorFeatures0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorFeatures0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvProcessorFeatures0 =
                    WhvProcessorFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvProcessorFeatures1(
    public var anonymous: WhvProcessorFeatures10 = WhvProcessorFeatures10(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvProcessorFeatures10(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorFeatures10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorFeatures10> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvProcessorFeatures10 =
                    WhvProcessorFeatures10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorFeatures10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvProcessorFeaturesBanks(
    public var banksCount: UInt = 0u,
    public var reserved0: UInt = 0u,
    public var anonymous: WhvProcessorFeaturesBanks0 = WhvProcessorFeaturesBanks0(),
)

public data class WhvProcessorFeaturesBanks0(
    public var anonymous: WhvProcessorFeaturesBanks00 = WhvProcessorFeaturesBanks00(),
    public var asUINT64: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvProcessorFeaturesBanks0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asUINT64.contentEquals(other.asUINT64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asUINT64.contentHashCode()
        return result
    }
}

public data class WhvProcessorFeaturesBanks00(
    public var bank0: WhvProcessorFeatures = WhvProcessorFeatures(),
    public var bank1: WhvProcessorFeatures1 = WhvProcessorFeatures1(),
)

public data class WhvProcessorInterceptCounter(
    public var count: ULong = 0uL,
    public var time100ns: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorInterceptCounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorInterceptCounter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvProcessorInterceptCounter =
                    WhvProcessorInterceptCounter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorInterceptCounter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.time100ns)
                }
            }
    }
}

public data class WhvProcessorInterceptCounters(
    public var pageInvalidations: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var controlRegisterAccesses: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var ioInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var haltInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var cpuidInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var msrAccesses: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var otherIntercepts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var pendingInterrupts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var emulatedInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var debugRegisterAccesses: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var pageFaultIntercepts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var nestedPageFaultIntercepts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var hypercalls: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var rdpmcInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorInterceptCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorInterceptCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): WhvProcessorInterceptCounters =
                    WhvProcessorInterceptCounters(
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 16L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 32L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 48L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 64L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 80L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 96L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 112L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 128L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 144L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 160L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 176L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 192L),
                        (WhvProcessorInterceptCounter.typeLayout()).readNative(addr + 208L),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorInterceptCounters) {
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr, value.pageInvalidations)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 16L, value.controlRegisterAccesses)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 32L, value.ioInstructions)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 48L, value.haltInstructions)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 64L, value.cpuidInstructions)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 80L, value.msrAccesses)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 96L, value.otherIntercepts)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 112L, value.pendingInterrupts)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 128L, value.emulatedInstructions)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 144L, value.debugRegisterAccesses)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 160L, value.pageFaultIntercepts)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 176L, value.nestedPageFaultIntercepts)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 192L, value.hypercalls)
                    (WhvProcessorInterceptCounter.typeLayout()).writeNative(addr + 208L, value.rdpmcInstructions)
                }
            }
    }
}

public data class WhvProcessorPerfmonFeatures(
    public var anonymous: WhvProcessorPerfmonFeatures0 = WhvProcessorPerfmonFeatures0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvProcessorPerfmonFeatures0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorPerfmonFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorPerfmonFeatures0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvProcessorPerfmonFeatures0 =
                    WhvProcessorPerfmonFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorPerfmonFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvProcessorRuntimeCounters(
    public var totalRuntime100ns: ULong = 0uL,
    public var hypervisorRuntime100ns: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorRuntimeCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorRuntimeCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvProcessorRuntimeCounters =
                    WhvProcessorRuntimeCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorRuntimeCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.totalRuntime100ns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hypervisorRuntime100ns)
                }
            }
    }
}

public data class WhvProcessorSyntheticFeaturesCounters(
    public var syntheticInterruptsCount: ULong = 0uL,
    public var longSpinWaitHypercallsCount: ULong = 0uL,
    public var otherHypercallsCount: ULong = 0uL,
    public var syntheticInterruptHypercallsCount: ULong = 0uL,
    public var virtualInterruptHypercallsCount: ULong = 0uL,
    public var virtualMmuHypercallsCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorSyntheticFeaturesCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorSyntheticFeaturesCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): WhvProcessorSyntheticFeaturesCounters =
                    WhvProcessorSyntheticFeaturesCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorSyntheticFeaturesCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.syntheticInterruptsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.longSpinWaitHypercallsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.otherHypercallsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.syntheticInterruptHypercallsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.virtualInterruptHypercallsCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.virtualMmuHypercallsCount)
                }
            }
    }
}

public data class WhvProcessorXsaveFeatures(
    public var anonymous: WhvProcessorXsaveFeatures0 = WhvProcessorXsaveFeatures0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvProcessorXsaveFeatures0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorXsaveFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvProcessorXsaveFeatures0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvProcessorXsaveFeatures0 =
                    WhvProcessorXsaveFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvProcessorXsaveFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class WhvRegisterValue(
    public var reg128: WhvUint128 = WhvUint128(),
    public var reg64: ULong = 0uL,
    public var reg32: UInt = 0u,
    public var reg16: UShort = 0u,
    public var reg8: UByte = 0u,
    public var fp: WhvX64FpRegister = WhvX64FpRegister(),
    public var fpControlStatus: WhvX64FpControlStatusRegister = WhvX64FpControlStatusRegister(),
    public var xmmControlStatus: WhvX64XmmControlStatusRegister = WhvX64XmmControlStatusRegister(),
    public var segment: WhvX64SegmentRegister = WhvX64SegmentRegister(),
    public var table: WhvX64TableRegister = WhvX64TableRegister(),
    public var interruptState: WhvX64InterruptStateRegister = WhvX64InterruptStateRegister(),
    public var pendingInterruption: WhvX64PendingInterruptionRegister = WhvX64PendingInterruptionRegister(),
    public var deliverabilityNotifications: WhvX64DeliverabilityNotificationsRegister = WhvX64DeliverabilityNotificationsRegister(),
    public var exceptionEvent: WhvX64PendingExceptionEvent = WhvX64PendingExceptionEvent(),
    public var extIntEvent: WhvX64PendingExtIntEvent = WhvX64PendingExtIntEvent(),
    public var internalActivity: WhvInternalActivityRegister = WhvInternalActivityRegister(),
    public var pendingDebugException: WhvX64PendingDebugException = WhvX64PendingDebugException(),
)

public data class WhvRunVpCanceledContext(
    public var cancelReason: WhvRunVpCancelReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvRunVpCanceledContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvRunVpCanceledContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvRunVpCanceledContext =
                    WhvRunVpCanceledContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvRunVpCanceledContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cancelReason)
                }
            }
    }
}

public data class WhvRunVpExitContext(
    public var exitReason: WhvRunVpExitReason = 0,
    public var reserved: UInt = 0u,
    public var vpContext: WhvVpExitContext = WhvVpExitContext(),
    public var anonymous: WhvRunVpExitContext0 = WhvRunVpExitContext0(),
)

public data class WhvRunVpExitContext0(
    public var memoryAccess: WhvMemoryAccessContext = WhvMemoryAccessContext(),
    public var ioPortAccess: WhvX64IoPortAccessContext = WhvX64IoPortAccessContext(),
    public var msrAccess: WhvX64MsrAccessContext = WhvX64MsrAccessContext(),
    public var cpuidAccess: WhvX64CpuidAccessContext = WhvX64CpuidAccessContext(),
    public var vpException: WhvVpExceptionContext = WhvVpExceptionContext(),
    public var interruptWindow: WhvX64InterruptionDeliverableContext = WhvX64InterruptionDeliverableContext(),
    public var unsupportedFeature: WhvX64UnsupportedFeatureContext = WhvX64UnsupportedFeatureContext(),
    public var cancelReason: WhvRunVpCanceledContext = WhvRunVpCanceledContext(),
    public var apicEoi: WhvX64ApicEoiContext = WhvX64ApicEoiContext(),
    public var readTsc: WhvX64RdtscContext = WhvX64RdtscContext(),
    public var apicSmi: WhvX64ApicSmiContext = WhvX64ApicSmiContext(),
    public var hypercall: WhvHypercallContext = WhvHypercallContext(),
    public var apicInitSipi: WhvX64ApicInitSipiContext = WhvX64ApicInitSipiContext(),
    public var apicWrite: WhvX64ApicWriteContext = WhvX64ApicWriteContext(),
    public var synicSintDeliverable: WhvSynicSintDeliverableContext = WhvSynicSintDeliverableContext(),
)

public data class WhvSchedulerFeatures(
    public var anonymous: WhvSchedulerFeatures0 = WhvSchedulerFeatures0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvSchedulerFeatures0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSchedulerFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSchedulerFeatures0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvSchedulerFeatures0 =
                    WhvSchedulerFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvSchedulerFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvSriovResourceDescriptor(
    public var pnpInstanceId: UShortArray = UShortArray(200),
    public var virtualFunctionId: Luid = Luid(),
    public var virtualFunctionIndex: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvSriovResourceDescriptor) return false
        if (!this.pnpInstanceId.contentEquals(other.pnpInstanceId)) return false
        if (this.virtualFunctionId != other.virtualFunctionId) return false
        if (this.virtualFunctionIndex != other.virtualFunctionIndex) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pnpInstanceId.contentHashCode()
        result = 31 * result + this.virtualFunctionId.hashCode()
        result = 31 * result + this.virtualFunctionIndex.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }
}

public data class WhvSynicEventParameters(
    public var vpIndex: UInt = 0u,
    public var targetSint: UByte = 0u,
    public var reserved: UByte = 0u,
    public var flagNumber: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSynicEventParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSynicEventParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvSynicEventParameters =
                    WhvSynicEventParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WhvSynicEventParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vpIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.targetSint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flagNumber)
                }
            }
    }
}

public data class WhvSynicSintDeliverableContext(
    public var deliverableSints: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSynicSintDeliverableContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSynicSintDeliverableContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvSynicSintDeliverableContext =
                    WhvSynicSintDeliverableContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WhvSynicSintDeliverableContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.deliverableSints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                }
            }
    }
}

public data class WhvSyntheticProcessorFeatures(
    public var anonymous: WhvSyntheticProcessorFeatures0 = WhvSyntheticProcessorFeatures0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvSyntheticProcessorFeatures0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSyntheticProcessorFeatures0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvSyntheticProcessorFeatures0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvSyntheticProcessorFeatures0 =
                    WhvSyntheticProcessorFeatures0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvSyntheticProcessorFeatures0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvSyntheticProcessorFeaturesBanks(
    public var banksCount: UInt = 0u,
    public var reserved0: UInt = 0u,
    public var anonymous: WhvSyntheticProcessorFeaturesBanks0 = WhvSyntheticProcessorFeaturesBanks0(),
)

public data class WhvSyntheticProcessorFeaturesBanks0(
    public var anonymous: WhvSyntheticProcessorFeaturesBanks00 = WhvSyntheticProcessorFeaturesBanks00(),
    public var asUINT64: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvSyntheticProcessorFeaturesBanks0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asUINT64.contentEquals(other.asUINT64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asUINT64.contentHashCode()
        return result
    }
}

public data class WhvSyntheticProcessorFeaturesBanks00(
    public var bank0: WhvSyntheticProcessorFeatures = WhvSyntheticProcessorFeatures(),
)

public data class WhvTranslateGvaResult(
    public var resultCode: WhvTranslateGvaResultCode = 0,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvTranslateGvaResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvTranslateGvaResult> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvTranslateGvaResult =
                    WhvTranslateGvaResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WhvTranslateGvaResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.resultCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class WhvTriggerParameters(
    public var triggerType: WhvTriggerType = 0,
    public var reserved: UInt = 0u,
    public var anonymous: WhvTriggerParameters0 = WhvTriggerParameters0(),
)

public data class WhvTriggerParameters0(
    public var interrupt: WhvInterruptControl = WhvInterruptControl(),
    public var synicEvent: WhvSynicEventParameters = WhvSynicEventParameters(),
    public var deviceInterrupt: WhvTriggerParameters00 = WhvTriggerParameters00(),
)

public data class WhvTriggerParameters00(
    public var logicalDeviceId: ULong = 0uL,
    public var msiAddress: ULong = 0uL,
    public var msiData: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvTriggerParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvTriggerParameters00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WhvTriggerParameters00 =
                    WhvTriggerParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WhvTriggerParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.logicalDeviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.msiAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.msiData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class WhvUint128(
    public var anonymous: WhvUint1280 = WhvUint1280(),
    public var dword: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvUint128) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.dword.contentEquals(other.dword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.dword.contentHashCode()
        return result
    }
}

public data class WhvUint1280(
    public var low64: ULong = 0uL,
    public var high64: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvUint1280> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvUint1280> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvUint1280 =
                    WhvUint1280(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvUint1280) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.low64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.high64)
                }
            }
    }
}

public data class WhvVirtualProcessorProperty(
    public var propertyCode: WhvVirtualProcessorPropertyCode = 0,
    public var reserved: UInt = 0u,
    public var anonymous: WhvVirtualProcessorProperty0 = WhvVirtualProcessorProperty0(),
)

public data class WhvVirtualProcessorProperty0(
    public var numaNode: UShort = 0u,
    public var padding: ULong = 0uL,
)

public data class WhvVpciDeviceNotification(
    public var notificationType: WhvVpciDeviceNotificationType = 0,
    public var reserved1: UInt = 0u,
    public var anonymous: WhvVpciDeviceNotification0 = WhvVpciDeviceNotification0(),
)

public data class WhvVpciDeviceNotification0(
    public var reserved2: ULong = 0uL,
)

public data class WhvVpciDeviceRegister(
    public var location: WhvVpciDeviceRegisterSpace = 0,
    public var sizeInBytes: UInt = 0u,
    public var offsetInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciDeviceRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciDeviceRegister> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvVpciDeviceRegister =
                    WhvVpciDeviceRegister(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvVpciDeviceRegister) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.location)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offsetInBytes)
                }
            }
    }
}

public data class WhvVpciHardwareIds(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var progIf: UByte = 0u,
    public var subClass: UByte = 0u,
    public var baseClass: UByte = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciHardwareIds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciHardwareIds> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): WhvVpciHardwareIds =
                    WhvVpciHardwareIds(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: WhvVpciHardwareIds) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.vendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.deviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.revisionID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.progIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.subClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.baseClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.subVendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.subSystemID)
                }
            }
    }
}

public data class WhvVpciInterruptTarget(
    public var vector: UInt = 0u,
    public var flags: WhvVpciInterruptTargetFlags = 0,
    public var processorCount: UInt = 0u,
    public var processors: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvVpciInterruptTarget) return false
        if (this.vector != other.vector) return false
        if (this.flags != other.flags) return false
        if (this.processorCount != other.processorCount) return false
        if (!this.processors.contentEquals(other.processors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vector.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.processorCount.hashCode()
        result = 31 * result + this.processors.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciInterruptTarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciInterruptTarget> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvVpciInterruptTarget =
                    WhvVpciInterruptTarget(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: WhvVpciInterruptTarget) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.processorCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.processors.toList())
                }
            }
    }
}

public class WhvVpciMmioMapping internal constructor(
    public var location: WhvVpciDeviceRegisterSpace,
    public var flags: WhvVpciMmioRangeFlags,
    public var sizeInBytes: ULong,
    public var offsetInBytes: ULong,
    virtualAddressCtorArg: MutPtr,
) {
    public var virtualAddress: MutPtr = virtualAddressCtorArg
        internal set

    public constructor() : this(
        location = 0,
        flags = 0,
        sizeInBytes = 0uL,
        offsetInBytes = 0uL,
        virtualAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WhvVpciDeviceRegisterSpace = this.location

    public operator fun component2(): WhvVpciMmioRangeFlags = this.flags

    public operator fun component3(): ULong = this.sizeInBytes

    public operator fun component4(): ULong = this.offsetInBytes

    public operator fun component5(): MutPtr = this.virtualAddress

    public fun copy(location: WhvVpciDeviceRegisterSpace = this.location, flags: WhvVpciMmioRangeFlags = this.flags, sizeInBytes: ULong = this.sizeInBytes, offsetInBytes: ULong = this.offsetInBytes, virtualAddress: MutPtr = this.virtualAddress): WhvVpciMmioMapping = WhvVpciMmioMapping(location = location, flags = flags, sizeInBytes = sizeInBytes, offsetInBytes = offsetInBytes, virtualAddressCtorArg = virtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvVpciMmioMapping) return false
        if (this.location != other.location) return false
        if (this.flags != other.flags) return false
        if (this.sizeInBytes != other.sizeInBytes) return false
        if (this.offsetInBytes != other.offsetInBytes) return false
        if (this.virtualAddress != other.virtualAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.location.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sizeInBytes.hashCode()
        result = 31 * result + this.offsetInBytes.hashCode()
        result = 31 * result + this.virtualAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciMmioMapping> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciMmioMapping> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): WhvVpciMmioMapping =
                    WhvVpciMmioMapping(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WhvVpciMmioMapping) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.location)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.offsetInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.virtualAddress)
                }
            }

        public operator fun invoke(
            location: WhvVpciDeviceRegisterSpace = 0,
            flags: WhvVpciMmioRangeFlags = 0,
            sizeInBytes: ULong = 0uL,
            offsetInBytes: ULong = 0uL,
            virtualAddress: MutPtr = MutPtr(0L),
        ): WhvVpciMmioMapping =
            WhvVpciMmioMapping(
                location = location,
                flags = flags,
                sizeInBytes = sizeInBytes,
                offsetInBytes = offsetInBytes,
                virtualAddressCtorArg = virtualAddress,
            )
    }
}

public data class WhvVpciProbedBars(
    public var value: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvVpciProbedBars) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciProbedBars> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpciProbedBars> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WhvVpciProbedBars =
                    WhvVpciProbedBars(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: WhvVpciProbedBars) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                    ).writeNative(addr, value.value.toList())
                }
            }
    }
}

public data class WhvVpExceptionContext(
    public var instructionByteCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var instructionBytes: UByteArray = UByteArray(16),
    public var exceptionInfo: WhvVpExceptionInfo = WhvVpExceptionInfo(),
    public var exceptionType: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
    public var errorCode: UInt = 0u,
    public var exceptionParameter: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvVpExceptionContext) return false
        if (this.instructionByteCount != other.instructionByteCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.instructionBytes.contentEquals(other.instructionBytes)) return false
        if (this.exceptionInfo != other.exceptionInfo) return false
        if (this.exceptionType != other.exceptionType) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.errorCode != other.errorCode) return false
        if (this.exceptionParameter != other.exceptionParameter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionByteCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.instructionBytes.contentHashCode()
        result = 31 * result + this.exceptionInfo.hashCode()
        result = 31 * result + this.exceptionType.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.exceptionParameter.hashCode()
        return result
    }
}

public data class WhvVpExceptionInfo(
    public var anonymous: WhvVpExceptionInfo0 = WhvVpExceptionInfo0(),
    public var asUINT32: UInt = 0u,
)

public data class WhvVpExceptionInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpExceptionInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvVpExceptionInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvVpExceptionInfo0 =
                    WhvVpExceptionInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvVpExceptionInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvVpExitContext(
    public var executionState: WhvX64VpExecutionState = WhvX64VpExecutionState(),
    public var bitfield: UByte = 0u,
    public var reserved: UByte = 0u,
    public var reserved2: UInt = 0u,
    public var cs: WhvX64SegmentRegister = WhvX64SegmentRegister(),
    public var rip: ULong = 0uL,
    public var rflags: ULong = 0uL,
)

public data class WhvX64ApicEoiContext(
    public var interruptVector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicEoiContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicEoiContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvX64ApicEoiContext =
                    WhvX64ApicEoiContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64ApicEoiContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.interruptVector)
                }
            }
    }
}

public data class WhvX64ApicInitSipiContext(
    public var apicIcr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicInitSipiContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicInitSipiContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64ApicInitSipiContext =
                    WhvX64ApicInitSipiContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64ApicInitSipiContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.apicIcr)
                }
            }
    }
}

public data class WhvX64ApicSmiContext(
    public var apicIcr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicSmiContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicSmiContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64ApicSmiContext =
                    WhvX64ApicSmiContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64ApicSmiContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.apicIcr)
                }
            }
    }
}

public data class WhvX64ApicWriteContext(
    public var type: WhvX64ApicWriteType = 0,
    public var reserved: UInt = 0u,
    public var writeValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicWriteContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64ApicWriteContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvX64ApicWriteContext =
                    WhvX64ApicWriteContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvX64ApicWriteContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.writeValue)
                }
            }
    }
}

public data class WhvX64CpuidAccessContext(
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var defaultResultRax: ULong = 0uL,
    public var defaultResultRcx: ULong = 0uL,
    public var defaultResultRdx: ULong = 0uL,
    public var defaultResultRbx: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64CpuidAccessContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64CpuidAccessContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): WhvX64CpuidAccessContext =
                    WhvX64CpuidAccessContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: WhvX64CpuidAccessContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.rbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.defaultResultRax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.defaultResultRcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.defaultResultRdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.defaultResultRbx)
                }
            }
    }
}

public data class WhvX64CpuidResult(
    public var function: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
    public var eax: UInt = 0u,
    public var ebx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var edx: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvX64CpuidResult) return false
        if (this.function != other.function) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.eax != other.eax) return false
        if (this.ebx != other.ebx) return false
        if (this.ecx != other.ecx) return false
        if (this.edx != other.edx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.function.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.eax.hashCode()
        result = 31 * result + this.ebx.hashCode()
        result = 31 * result + this.ecx.hashCode()
        result = 31 * result + this.edx.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64CpuidResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64CpuidResult> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): WhvX64CpuidResult =
                    WhvX64CpuidResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: WhvX64CpuidResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.function)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 4L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ebx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ecx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.edx)
                }
            }
    }
}

public data class WhvX64CpuidResult2(
    public var function: UInt = 0u,
    public var index: UInt = 0u,
    public var vpIndex: UInt = 0u,
    public var flags: WhvX64CpuidResult2Flags = 0,
    public var output: WhvCpuidOutput = WhvCpuidOutput(),
    public var mask: WhvCpuidOutput = WhvCpuidOutput(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64CpuidResult2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64CpuidResult2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): WhvX64CpuidResult2 =
                    WhvX64CpuidResult2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (WhvCpuidOutput.typeLayout()).readNative(addr + 16L),
                        (WhvCpuidOutput.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WhvX64CpuidResult2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.function)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vpIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.flags)
                    (WhvCpuidOutput.typeLayout()).writeNative(addr + 16L, value.output)
                    (WhvCpuidOutput.typeLayout()).writeNative(addr + 32L, value.mask)
                }
            }
    }
}

public data class WhvX64DeliverabilityNotificationsRegister(
    public var anonymous: WhvX64DeliverabilityNotificationsRegister0 = WhvX64DeliverabilityNotificationsRegister0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvX64DeliverabilityNotificationsRegister0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64DeliverabilityNotificationsRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64DeliverabilityNotificationsRegister0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64DeliverabilityNotificationsRegister0 =
                    WhvX64DeliverabilityNotificationsRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64DeliverabilityNotificationsRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64FpControlStatusRegister(
    public var anonymous: WhvX64FpControlStatusRegister0 = WhvX64FpControlStatusRegister0(),
    public var asUINT128: WhvUint128 = WhvUint128(),
)

public data class WhvX64FpControlStatusRegister0(
    public var fpControl: UShort = 0u,
    public var fpStatus: UShort = 0u,
    public var fpTag: UByte = 0u,
    public var reserved: UByte = 0u,
    public var lastFpOp: UShort = 0u,
    public var anonymous: WhvX64FpControlStatusRegister00 = WhvX64FpControlStatusRegister00(),
)

public data class WhvX64FpControlStatusRegister00(
    public var lastFpRip: ULong = 0uL,
    public var anonymous: WhvX64FpControlStatusRegister000 = WhvX64FpControlStatusRegister000(),
)

public data class WhvX64FpControlStatusRegister000(
    public var lastFpEip: UInt = 0u,
    public var lastFpCs: UShort = 0u,
    public var reserved2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64FpControlStatusRegister000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64FpControlStatusRegister000> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64FpControlStatusRegister000 =
                    WhvX64FpControlStatusRegister000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WhvX64FpControlStatusRegister000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lastFpEip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.lastFpCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved2)
                }
            }
    }
}

public data class WhvX64FpRegister(
    public var anonymous: WhvX64FpRegister0 = WhvX64FpRegister0(),
    public var asUINT128: WhvUint128 = WhvUint128(),
)

public data class WhvX64FpRegister0(
    public var mantissa: ULong = 0uL,
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64FpRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64FpRegister0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvX64FpRegister0 =
                    WhvX64FpRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvX64FpRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mantissa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bitfield)
                }
            }
    }
}

public data class WhvX64InterruptionDeliverableContext(
    public var deliverableType: WhvX64PendingInterruptionType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64InterruptionDeliverableContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64InterruptionDeliverableContext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvX64InterruptionDeliverableContext =
                    WhvX64InterruptionDeliverableContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64InterruptionDeliverableContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.deliverableType)
                }
            }
    }
}

public data class WhvX64InterruptStateRegister(
    public var anonymous: WhvX64InterruptStateRegister0 = WhvX64InterruptStateRegister0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvX64InterruptStateRegister0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64InterruptStateRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64InterruptStateRegister0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64InterruptStateRegister0 =
                    WhvX64InterruptStateRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64InterruptStateRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64IoPortAccessContext(
    public var instructionByteCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var instructionBytes: UByteArray = UByteArray(16),
    public var accessInfo: WhvX64IoPortAccessInfo = WhvX64IoPortAccessInfo(),
    public var portNumber: UShort = 0u,
    public var reserved2: UShortArray = UShortArray(3),
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var ds: WhvX64SegmentRegister = WhvX64SegmentRegister(),
    public var es: WhvX64SegmentRegister = WhvX64SegmentRegister(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvX64IoPortAccessContext) return false
        if (this.instructionByteCount != other.instructionByteCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.instructionBytes.contentEquals(other.instructionBytes)) return false
        if (this.accessInfo != other.accessInfo) return false
        if (this.portNumber != other.portNumber) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.rax != other.rax) return false
        if (this.rcx != other.rcx) return false
        if (this.rsi != other.rsi) return false
        if (this.rdi != other.rdi) return false
        if (this.ds != other.ds) return false
        if (this.es != other.es) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionByteCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.instructionBytes.contentHashCode()
        result = 31 * result + this.accessInfo.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.rax.hashCode()
        result = 31 * result + this.rcx.hashCode()
        result = 31 * result + this.rsi.hashCode()
        result = 31 * result + this.rdi.hashCode()
        result = 31 * result + this.ds.hashCode()
        result = 31 * result + this.es.hashCode()
        return result
    }
}

public data class WhvX64IoPortAccessInfo(
    public var anonymous: WhvX64IoPortAccessInfo0 = WhvX64IoPortAccessInfo0(),
    public var asUINT32: UInt = 0u,
)

public data class WhvX64IoPortAccessInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64IoPortAccessInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64IoPortAccessInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvX64IoPortAccessInfo0 =
                    WhvX64IoPortAccessInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64IoPortAccessInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64MsrAccessContext(
    public var accessInfo: WhvX64MsrAccessInfo = WhvX64MsrAccessInfo(),
    public var msrNumber: UInt = 0u,
    public var rax: ULong = 0uL,
    public var rdx: ULong = 0uL,
)

public data class WhvX64MsrAccessInfo(
    public var anonymous: WhvX64MsrAccessInfo0 = WhvX64MsrAccessInfo0(),
    public var asUINT32: UInt = 0u,
)

public data class WhvX64MsrAccessInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64MsrAccessInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64MsrAccessInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WhvX64MsrAccessInfo0 =
                    WhvX64MsrAccessInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64MsrAccessInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64MsrExitBitmap(
    public var asUINT64: ULong = 0uL,
    public var anonymous: WhvX64MsrExitBitmap0 = WhvX64MsrExitBitmap0(),
)

public data class WhvX64MsrExitBitmap0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64MsrExitBitmap0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64MsrExitBitmap0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64MsrExitBitmap0 =
                    WhvX64MsrExitBitmap0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64MsrExitBitmap0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64PendingDebugException(
    public var asUINT64: ULong = 0uL,
    public var anonymous: WhvX64PendingDebugException0 = WhvX64PendingDebugException0(),
)

public data class WhvX64PendingDebugException0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingDebugException0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingDebugException0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64PendingDebugException0 =
                    WhvX64PendingDebugException0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64PendingDebugException0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64PendingExceptionEvent(
    public var anonymous: WhvX64PendingExceptionEvent0 = WhvX64PendingExceptionEvent0(),
    public var asUINT128: WhvUint128 = WhvUint128(),
)

public data class WhvX64PendingExceptionEvent0(
    public var bitfield: UInt = 0u,
    public var errorCode: UInt = 0u,
    public var exceptionParameter: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingExceptionEvent0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingExceptionEvent0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvX64PendingExceptionEvent0 =
                    WhvX64PendingExceptionEvent0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvX64PendingExceptionEvent0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.errorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.exceptionParameter)
                }
            }
    }
}

public data class WhvX64PendingExtIntEvent(
    public var anonymous: WhvX64PendingExtIntEvent0 = WhvX64PendingExtIntEvent0(),
    public var asUINT128: WhvUint128 = WhvUint128(),
)

public data class WhvX64PendingExtIntEvent0(
    public var bitfield: ULong = 0uL,
    public var reserved2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingExtIntEvent0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingExtIntEvent0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvX64PendingExtIntEvent0 =
                    WhvX64PendingExtIntEvent0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvX64PendingExtIntEvent0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reserved2)
                }
            }
    }
}

public data class WhvX64PendingInterruptionRegister(
    public var anonymous: WhvX64PendingInterruptionRegister0 = WhvX64PendingInterruptionRegister0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvX64PendingInterruptionRegister0(
    public var bitfield: UInt = 0u,
    public var errorCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingInterruptionRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64PendingInterruptionRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64PendingInterruptionRegister0 =
                    WhvX64PendingInterruptionRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WhvX64PendingInterruptionRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.errorCode)
                }
            }
    }
}

public data class WhvX64RdtscContext(
    public var tscAux: ULong = 0uL,
    public var virtualOffset: ULong = 0uL,
    public var tsc: ULong = 0uL,
    public var referenceTime: ULong = 0uL,
    public var rdtscInfo: WhvX64RdtscInfo = WhvX64RdtscInfo(),
)

public data class WhvX64RdtscInfo(
    public var anonymous: WhvX64RdtscInfo0 = WhvX64RdtscInfo0(),
    public var asUINT64: ULong = 0uL,
)

public data class WhvX64RdtscInfo0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64RdtscInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64RdtscInfo0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64RdtscInfo0 =
                    WhvX64RdtscInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64RdtscInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64SegmentRegister(
    public var base: ULong = 0uL,
    public var limit: UInt = 0u,
    public var selector: UShort = 0u,
    public var anonymous: WhvX64SegmentRegister0 = WhvX64SegmentRegister0(),
)

public data class WhvX64SegmentRegister0(
    public var anonymous: WhvX64SegmentRegister00 = WhvX64SegmentRegister00(),
    public var attributes: UShort = 0u,
)

public data class WhvX64SegmentRegister00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64SegmentRegister00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64SegmentRegister00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): WhvX64SegmentRegister00 =
                    WhvX64SegmentRegister00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64SegmentRegister00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64TableRegister(
    public var pad: UShortArray = UShortArray(3),
    public var limit: UShort = 0u,
    public var base: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvX64TableRegister) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.limit != other.limit) return false
        if (this.base != other.base) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pad.contentHashCode()
        result = 31 * result + this.limit.hashCode()
        result = 31 * result + this.base.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64TableRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64TableRegister> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvX64TableRegister =
                    WhvX64TableRegister(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvX64TableRegister) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr, value.pad.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.limit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.base)
                }
            }
    }
}

public data class WhvX64UnsupportedFeatureContext(
    public var featureCode: WhvX64UnsupportedFeatureCode = 0,
    public var reserved: UInt = 0u,
    public var featureParameter: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64UnsupportedFeatureContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64UnsupportedFeatureContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WhvX64UnsupportedFeatureContext =
                    WhvX64UnsupportedFeatureContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WhvX64UnsupportedFeatureContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.featureCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.featureParameter)
                }
            }
    }
}

public data class WhvX64VpExecutionState(
    public var anonymous: WhvX64VpExecutionState0 = WhvX64VpExecutionState0(),
    public var asUINT16: UShort = 0u,
)

public data class WhvX64VpExecutionState0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64VpExecutionState0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64VpExecutionState0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): WhvX64VpExecutionState0 =
                    WhvX64VpExecutionState0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WhvX64VpExecutionState0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WhvX64XmmControlStatusRegister(
    public var anonymous: WhvX64XmmControlStatusRegister0 = WhvX64XmmControlStatusRegister0(),
    public var asUINT128: WhvUint128 = WhvUint128(),
)

public data class WhvX64XmmControlStatusRegister0(
    public var anonymous: WhvX64XmmControlStatusRegister00 = WhvX64XmmControlStatusRegister00(),
    public var xmmStatusControl: UInt = 0u,
    public var xmmStatusControlMask: UInt = 0u,
)

public data class WhvX64XmmControlStatusRegister00(
    public var lastFpRdp: ULong = 0uL,
    public var anonymous: WhvX64XmmControlStatusRegister000 = WhvX64XmmControlStatusRegister000(),
)

public data class WhvX64XmmControlStatusRegister000(
    public var lastFpDp: UInt = 0u,
    public var lastFpDs: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64XmmControlStatusRegister000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WhvX64XmmControlStatusRegister000> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WhvX64XmmControlStatusRegister000 =
                    WhvX64XmmControlStatusRegister000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WhvX64XmmControlStatusRegister000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lastFpDp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.lastFpDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}
