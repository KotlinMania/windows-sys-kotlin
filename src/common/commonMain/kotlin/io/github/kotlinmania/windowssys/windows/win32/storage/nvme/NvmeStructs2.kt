@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.nvme

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.core.Guid

public data class NvmeErrorInjectionEntry00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeErrorInjectionEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeErrorInjectionEntry00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeErrorInjectionEntry00 =
                    NvmeErrorInjectionEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeErrorInjectionEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeExtendedReportZoneInfo(
    public var zoneCount: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(7),
    public var desc: List<NvmeZoneExtendedReportZoneDesc> = List(1) { NvmeZoneExtendedReportZoneDesc() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeExtendedReportZoneInfo) return false
        if (this.zoneCount != other.zoneCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.desc != other.desc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.zoneCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.desc.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeExtendedReportZoneInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeExtendedReportZoneInfo> {
                override val sizeBytes: Long = 192L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeExtendedReportZoneInfo =
                    NvmeExtendedReportZoneInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeZoneExtendedReportZoneDesc.typeLayout(), (1).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: NvmeExtendedReportZoneInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.zoneCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                    ).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeZoneExtendedReportZoneDesc.typeLayout(), (1).toInt())
                    ).writeNative(addr + 64L, value.desc)
                }
            }
    }
}

public data class NvmeFeatureHostIdentifierData(
    public var hostid: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeFeatureHostIdentifierData) return false
        if (!this.hostid.contentEquals(other.hostid)) return false
        return true
    }

    override fun hashCode(): Int = this.hostid.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFeatureHostIdentifierData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFeatureHostIdentifierData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeFeatureHostIdentifierData =
                    NvmeFeatureHostIdentifierData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeFeatureHostIdentifierData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.hostid)
                }
            }
    }
}

public data class NvmeFeatureHostMetadataData(
    public var numberOfMetadataElementDescriptors: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var metadataElementDescriptors: UByteArray = UByteArray(4094),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeFeatureHostMetadataData) return false
        if (this.numberOfMetadataElementDescriptors != other.numberOfMetadataElementDescriptors) return false
        if (this.reserved0 != other.reserved0) return false
        if (!this.metadataElementDescriptors.contentEquals(other.metadataElementDescriptors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfMetadataElementDescriptors.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.metadataElementDescriptors.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFeatureHostMetadataData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFeatureHostMetadataData> {
                override val sizeBytes: Long = 4096L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeFeatureHostMetadataData =
                    NvmeFeatureHostMetadataData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4094).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NvmeFeatureHostMetadataData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.numberOfMetadataElementDescriptors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4094).toInt())
                    ).writeNative(addr + 2L, value.metadataElementDescriptors)
                }
            }
    }
}

public data class NvmeFirmwareSlotInfoLog(
    public var afi: NvmeFirmwareSlotInfoLog0 = NvmeFirmwareSlotInfoLog0(),
    public var reserved0: UByteArray = UByteArray(7),
    public var frs: ULongArray = ULongArray(7),
    public var reserved1: UByteArray = UByteArray(448),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeFirmwareSlotInfoLog) return false
        if (this.afi != other.afi) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.frs.contentEquals(other.frs)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.afi.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.frs.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFirmwareSlotInfoLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFirmwareSlotInfoLog> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeFirmwareSlotInfoLog =
                    NvmeFirmwareSlotInfoLog(
                        (NvmeFirmwareSlotInfoLog0.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                        ).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (448).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: NvmeFirmwareSlotInfoLog) {
                    (NvmeFirmwareSlotInfoLog0.typeLayout()).writeNative(addr, value.afi)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                    ).writeNative(addr + 1L, value.reserved0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                    ).writeNative(addr + 8L, value.frs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (448).toInt())
                    ).writeNative(addr + 64L, value.reserved1)
                }
            }
    }
}

public data class NvmeFirmwareSlotInfoLog0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFirmwareSlotInfoLog0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeFirmwareSlotInfoLog0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeFirmwareSlotInfoLog0 =
                    NvmeFirmwareSlotInfoLog0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeFirmwareSlotInfoLog0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class NvmeHealthInfoLog(
    public var criticalWarning: NvmeHealthInfoLog0 = NvmeHealthInfoLog0(),
    public var temperature: UByteArray = UByteArray(2),
    public var availableSpare: UByte = 0u,
    public var availableSpareThreshold: UByte = 0u,
    public var percentageUsed: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(26),
    public var dataUnitRead: UByteArray = UByteArray(16),
    public var dataUnitWritten: UByteArray = UByteArray(16),
    public var hostReadCommands: UByteArray = UByteArray(16),
    public var hostWrittenCommands: UByteArray = UByteArray(16),
    public var controllerBusyTime: UByteArray = UByteArray(16),
    public var powerCycle: UByteArray = UByteArray(16),
    public var powerOnHours: UByteArray = UByteArray(16),
    public var unsafeShutdowns: UByteArray = UByteArray(16),
    public var mediaErrors: UByteArray = UByteArray(16),
    public var errorInfoLogEntryCount: UByteArray = UByteArray(16),
    public var warningCompositeTemperatureTime: UInt = 0u,
    public var criticalCompositeTemperatureTime: UInt = 0u,
    public var temperatureSensor1: UShort = 0u,
    public var temperatureSensor2: UShort = 0u,
    public var temperatureSensor3: UShort = 0u,
    public var temperatureSensor4: UShort = 0u,
    public var temperatureSensor5: UShort = 0u,
    public var temperatureSensor6: UShort = 0u,
    public var temperatureSensor7: UShort = 0u,
    public var temperatureSensor8: UShort = 0u,
    public var reserved1: UByteArray = UByteArray(296),
)

public data class NvmeHealthInfoLog0(
    public var anonymous: NvmeHealthInfoLog00 = NvmeHealthInfoLog00(),
    public var asUchar: UByte = 0u,
)

public data class NvmeHealthInfoLog00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeHealthInfoLog00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeHealthInfoLog00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeHealthInfoLog00 =
                    NvmeHealthInfoLog00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeHealthInfoLog00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeHostMemoryBufferDescriptorEntry(
    public var badd: ULong = 0uL,
    public var bsize: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeHostMemoryBufferDescriptorEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeHostMemoryBufferDescriptorEntry> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeHostMemoryBufferDescriptorEntry =
                    NvmeHostMemoryBufferDescriptorEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NvmeHostMemoryBufferDescriptorEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.badd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class NvmeHostMetadataElementDescriptor(
    public var bitfield: UInt = 0u,
    public var eval: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeHostMetadataElementDescriptor) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.eval.contentEquals(other.eval)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.eval.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeHostMetadataElementDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeHostMetadataElementDescriptor> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeHostMetadataElementDescriptor =
                    NvmeHostMetadataElementDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeHostMetadataElementDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.eval)
                }
            }
    }
}

public class NvmeIdentifyControllerData {
    public var vid: UShort = 0u

    public var ssvid: UShort = 0u

    public var sn: UByteArray = UByteArray(20)

    public var mn: UByteArray = UByteArray(40)

    public var fr: UByteArray = UByteArray(8)

    public var rab: UByte = 0u

    public var ieee: UByteArray = UByteArray(3)

    public var cmic: NvmeIdentifyControllerData0 = NvmeIdentifyControllerData0()

    public var mdts: UByte = 0u

    public var cntlid: UShort = 0u

    public var ver: UInt = 0u

    public var rtd3r: UInt = 0u

    public var rtd3e: UInt = 0u

    public var oaes: NvmeIdentifyControllerData1 = NvmeIdentifyControllerData1()

    public var ctratt: NvmeIdentifyControllerData2 = NvmeIdentifyControllerData2()

    public var rrls: NvmeIdentifyControllerData3 = NvmeIdentifyControllerData3()

    public var reserved0: UByteArray = UByteArray(9)

    public var cntrltype: UByte = 0u

    public var fguid: UByteArray = UByteArray(16)

    public var crdt1: UShort = 0u

    public var crdt2: UShort = 0u

    public var crdt3: UShort = 0u

    public var reserved01: UByteArray = UByteArray(106)

    public var reservedForManagement: UByteArray = UByteArray(16)

    public var oacs: NvmeIdentifyControllerData4 = NvmeIdentifyControllerData4()

    public var acl: UByte = 0u

    public var aerl: UByte = 0u

    public var frmw: NvmeIdentifyControllerData5 = NvmeIdentifyControllerData5()

    public var lpa: NvmeIdentifyControllerData6 = NvmeIdentifyControllerData6()

    public var elpe: UByte = 0u

    public var npss: UByte = 0u

    public var avscc: NvmeIdentifyControllerData7 = NvmeIdentifyControllerData7()

    public var apsta: NvmeIdentifyControllerData8 = NvmeIdentifyControllerData8()

    public var wctemp: UShort = 0u

    public var cctemp: UShort = 0u

    public var mtfa: UShort = 0u

    public var hmpre: UInt = 0u

    public var hmmin: UInt = 0u

    public var tnvmcap: UByteArray = UByteArray(16)

    public var unvmcap: UByteArray = UByteArray(16)

    public var rpmbs: NvmeIdentifyControllerData9 = NvmeIdentifyControllerData9()

    public var edstt: UShort = 0u

    public var dsto: UByte = 0u

    public var fwug: UByte = 0u

    public var kas: UShort = 0u

    public var hctma: NvmeIdentifyControllerData10 = NvmeIdentifyControllerData10()

    public var mntmt: UShort = 0u

    public var mxtmt: UShort = 0u

    public var sanicap: NvmeIdentifyControllerData11 = NvmeIdentifyControllerData11()

    public var hmminds: UInt = 0u

    public var hmmaxd: UShort = 0u

    public var nsetidmax: UShort = 0u

    public var endgidmax: UShort = 0u

    public var anatt: UByte = 0u

    public var anacap: NvmeIdentifyControllerData12 = NvmeIdentifyControllerData12()

    public var anagrpmax: UInt = 0u

    public var nanagrpid: UInt = 0u

    public var pels: UInt = 0u

    public var reserved1: UByteArray = UByteArray(156)

    public var sqes: NvmeIdentifyControllerData13 = NvmeIdentifyControllerData13()

    public var cqes: NvmeIdentifyControllerData14 = NvmeIdentifyControllerData14()

    public var maxcmd: UShort = 0u

    public var nn: UInt = 0u

    public var oncs: NvmeIdentifyControllerData15 = NvmeIdentifyControllerData15()

    public var fuses: NvmeIdentifyControllerData16 = NvmeIdentifyControllerData16()

    public var fna: NvmeIdentifyControllerData17 = NvmeIdentifyControllerData17()

    public var vwc: NvmeIdentifyControllerData18 = NvmeIdentifyControllerData18()

    public var awun: UShort = 0u

    public var awupf: UShort = 0u

    public var nvscc: NvmeIdentifyControllerData19 = NvmeIdentifyControllerData19()

    public var nwpc: NvmeIdentifyControllerData20 = NvmeIdentifyControllerData20()

    public var acwu: UShort = 0u

    public var reserved4: UByteArray = UByteArray(2)

    public var sgls: NvmeIdentifyControllerData21 = NvmeIdentifyControllerData21()

    public var mnan: UInt = 0u

    public var reserved6: UByteArray = UByteArray(224)

    public var subnqn: UByteArray = UByteArray(256)

    public var reserved7: UByteArray = UByteArray(768)

    public var reserved8: UByteArray = UByteArray(256)

    public var pds: List<NvmePowerStateDesc> = List(32) { NvmePowerStateDesc() }

    public var vs: UByteArray = UByteArray(1024)

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData> {
                override val sizeBytes: Long = 4096L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeIdentifyControllerData =
                    NvmeIdentifyControllerData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 73L),
                        (NvmeIdentifyControllerData0.typeLayout()).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 77L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 78L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (NvmeIdentifyControllerData1.typeLayout()).readNative(addr + 92L),
                        (NvmeIdentifyControllerData2.typeLayout()).readNative(addr + 96L),
                        (NvmeIdentifyControllerData3.typeLayout()).readNative(addr + 100L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (9).toInt())
                        ).readNative(addr + 102L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 111L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 130L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (106).toInt())
                        ).readNative(addr + 134L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 240L),
                        (NvmeIdentifyControllerData4.typeLayout()).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 258L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 259L),
                        (NvmeIdentifyControllerData5.typeLayout()).readNative(addr + 260L),
                        (NvmeIdentifyControllerData6.typeLayout()).readNative(addr + 261L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 262L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 263L),
                        (NvmeIdentifyControllerData7.typeLayout()).readNative(addr + 264L),
                        (NvmeIdentifyControllerData8.typeLayout()).readNative(addr + 265L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 266L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 270L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 280L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 296L),
                        (NvmeIdentifyControllerData9.typeLayout()).readNative(addr + 312L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 316L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 318L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 319L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 320L),
                        (NvmeIdentifyControllerData10.typeLayout()).readNative(addr + 322L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 324L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 326L),
                        (NvmeIdentifyControllerData11.typeLayout()).readNative(addr + 328L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 332L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 336L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 338L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 340L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 342L),
                        (NvmeIdentifyControllerData12.typeLayout()).readNative(addr + 343L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 344L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 348L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 352L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (156).toInt())
                        ).readNative(addr + 356L),
                        (NvmeIdentifyControllerData13.typeLayout()).readNative(addr + 512L),
                        (NvmeIdentifyControllerData14.typeLayout()).readNative(addr + 513L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 514L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 516L),
                        (NvmeIdentifyControllerData15.typeLayout()).readNative(addr + 520L),
                        (NvmeIdentifyControllerData16.typeLayout()).readNative(addr + 522L),
                        (NvmeIdentifyControllerData17.typeLayout()).readNative(addr + 524L),
                        (NvmeIdentifyControllerData18.typeLayout()).readNative(addr + 525L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 526L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 528L),
                        (NvmeIdentifyControllerData19.typeLayout()).readNative(addr + 530L),
                        (NvmeIdentifyControllerData20.typeLayout()).readNative(addr + 531L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 532L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 534L),
                        (NvmeIdentifyControllerData21.typeLayout()).readNative(addr + 536L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 540L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                        ).readNative(addr + 544L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 768L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (768).toInt())
                        ).readNative(addr + 1024L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 1792L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmePowerStateDesc.typeLayout(), (32).toInt())
                        ).readNative(addr + 2048L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                        ).readNative(addr + 3072L),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.vid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ssvid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 4L, value.sn)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                    ).writeNative(addr + 24L, value.mn)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 64L, value.fr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 72L, value.rab)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 73L, value.ieee)
                    (NvmeIdentifyControllerData0.typeLayout()).writeNative(addr + 76L, value.cmic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 77L, value.mdts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 78L, value.cntlid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.ver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.rtd3r)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.rtd3e)
                    (NvmeIdentifyControllerData1.typeLayout()).writeNative(addr + 92L, value.oaes)
                    (NvmeIdentifyControllerData2.typeLayout()).writeNative(addr + 96L, value.ctratt)
                    (NvmeIdentifyControllerData3.typeLayout()).writeNative(addr + 100L, value.rrls)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (9).toInt())
                    ).writeNative(addr + 102L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 111L, value.cntrltype)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 112L, value.fguid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 128L, value.crdt1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 130L, value.crdt2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.crdt3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (106).toInt())
                    ).writeNative(addr + 134L, value.reserved01)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 240L, value.reservedForManagement)
                    (NvmeIdentifyControllerData4.typeLayout()).writeNative(addr + 256L, value.oacs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 258L, value.acl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 259L, value.aerl)
                    (NvmeIdentifyControllerData5.typeLayout()).writeNative(addr + 260L, value.frmw)
                    (NvmeIdentifyControllerData6.typeLayout()).writeNative(addr + 261L, value.lpa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 262L, value.elpe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 263L, value.npss)
                    (NvmeIdentifyControllerData7.typeLayout()).writeNative(addr + 264L, value.avscc)
                    (NvmeIdentifyControllerData8.typeLayout()).writeNative(addr + 265L, value.apsta)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 266L, value.wctemp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 268L, value.cctemp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 270L, value.mtfa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.hmpre)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.hmmin)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 280L, value.tnvmcap)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 296L, value.unvmcap)
                    (NvmeIdentifyControllerData9.typeLayout()).writeNative(addr + 312L, value.rpmbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 316L, value.edstt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 318L, value.dsto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 319L, value.fwug)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 320L, value.kas)
                    (NvmeIdentifyControllerData10.typeLayout()).writeNative(addr + 322L, value.hctma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 324L, value.mntmt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 326L, value.mxtmt)
                    (NvmeIdentifyControllerData11.typeLayout()).writeNative(addr + 328L, value.sanicap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 332L, value.hmminds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 336L, value.hmmaxd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 338L, value.nsetidmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 340L, value.endgidmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 342L, value.anatt)
                    (NvmeIdentifyControllerData12.typeLayout()).writeNative(addr + 343L, value.anacap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 344L, value.anagrpmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 348L, value.nanagrpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 352L, value.pels)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (156).toInt())
                    ).writeNative(addr + 356L, value.reserved1)
                    (NvmeIdentifyControllerData13.typeLayout()).writeNative(addr + 512L, value.sqes)
                    (NvmeIdentifyControllerData14.typeLayout()).writeNative(addr + 513L, value.cqes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 514L, value.maxcmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 516L, value.nn)
                    (NvmeIdentifyControllerData15.typeLayout()).writeNative(addr + 520L, value.oncs)
                    (NvmeIdentifyControllerData16.typeLayout()).writeNative(addr + 522L, value.fuses)
                    (NvmeIdentifyControllerData17.typeLayout()).writeNative(addr + 524L, value.fna)
                    (NvmeIdentifyControllerData18.typeLayout()).writeNative(addr + 525L, value.vwc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 526L, value.awun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 528L, value.awupf)
                    (NvmeIdentifyControllerData19.typeLayout()).writeNative(addr + 530L, value.nvscc)
                    (NvmeIdentifyControllerData20.typeLayout()).writeNative(addr + 531L, value.nwpc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 532L, value.acwu)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 534L, value.reserved4)
                    (NvmeIdentifyControllerData21.typeLayout()).writeNative(addr + 536L, value.sgls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 540L, value.mnan)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (224).toInt())
                    ).writeNative(addr + 544L, value.reserved6)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 768L, value.subnqn)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (768).toInt())
                    ).writeNative(addr + 1024L, value.reserved7)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 1792L, value.reserved8)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmePowerStateDesc.typeLayout(), (32).toInt())
                    ).writeNative(addr + 2048L, value.pds)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                    ).writeNative(addr + 3072L, value.vs)
                }
            }
    }
}

public data class NvmeIdentifyControllerData12(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData12> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData12> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData12 =
                    NvmeIdentifyControllerData12(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData12) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData8(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData8> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData8> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData8 =
                    NvmeIdentifyControllerData8(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData8) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData7(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData7> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData7> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData7 =
                    NvmeIdentifyControllerData7(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData7) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData0 =
                    NvmeIdentifyControllerData0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData14(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData14> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData14> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData14 =
                    NvmeIdentifyControllerData14(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData14) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData2(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData2> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeIdentifyControllerData2 =
                    NvmeIdentifyControllerData2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData17(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData17> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData17> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData17 =
                    NvmeIdentifyControllerData17(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData17) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData5(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData5> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData5 =
                    NvmeIdentifyControllerData5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData16(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData16> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeIdentifyControllerData16 =
                    NvmeIdentifyControllerData16(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData16) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData10(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData10> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeIdentifyControllerData10 =
                    NvmeIdentifyControllerData10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData6(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData6> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData6 =
                    NvmeIdentifyControllerData6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData19(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData19> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData19> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData19 =
                    NvmeIdentifyControllerData19(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData19) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData20(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData20> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData20 =
                    NvmeIdentifyControllerData20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData4(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData4> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeIdentifyControllerData4 =
                    NvmeIdentifyControllerData4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData1(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData1> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeIdentifyControllerData1 =
                    NvmeIdentifyControllerData1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData15(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData15> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData15> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeIdentifyControllerData15 =
                    NvmeIdentifyControllerData15(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData15) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData9(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData9> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData9> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeIdentifyControllerData9 =
                    NvmeIdentifyControllerData9(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData9) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData3(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData3> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeIdentifyControllerData3 =
                    NvmeIdentifyControllerData3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData11(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData11> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeIdentifyControllerData11 =
                    NvmeIdentifyControllerData11(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData11) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData21(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData21> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeIdentifyControllerData21 =
                    NvmeIdentifyControllerData21(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData21) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData13(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData13> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData13> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData13 =
                    NvmeIdentifyControllerData13(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData13) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyControllerData18(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData18> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyControllerData18> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyControllerData18 =
                    NvmeIdentifyControllerData18(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyControllerData18) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyIoCommandSet(
    public var iOCommandSetVector: ULongArray = ULongArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeIdentifyIoCommandSet) return false
        if (!this.iOCommandSetVector.contentEquals(other.iOCommandSetVector)) return false
        return true
    }

    override fun hashCode(): Int = this.iOCommandSetVector.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyIoCommandSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyIoCommandSet> {
                override val sizeBytes: Long = 4096L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeIdentifyIoCommandSet =
                    NvmeIdentifyIoCommandSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (512).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyIoCommandSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (512).toInt())
                    ).writeNative(addr, value.iOCommandSetVector)
                }
            }
    }
}

public class NvmeIdentifyNamespaceData(
    public var nsze: ULong = 0uL,
    public var ncap: ULong = 0uL,
    public var nuse: ULong = 0uL,
    public var nsfeat: NvmeIdentifyNamespaceData0 = NvmeIdentifyNamespaceData0(),
    public var nlbaf: UByte = 0u,
    public var flbas: NvmeIdentifyNamespaceData1 = NvmeIdentifyNamespaceData1(),
    public var mc: NvmeIdentifyNamespaceData2 = NvmeIdentifyNamespaceData2(),
    public var dpc: NvmeIdentifyNamespaceData3 = NvmeIdentifyNamespaceData3(),
    public var dps: NvmeIdentifyNamespaceData4 = NvmeIdentifyNamespaceData4(),
    public var nmic: NvmeIdentifyNamespaceData5 = NvmeIdentifyNamespaceData5(),
    public var rescap: NvmReservationCapabilities = NvmReservationCapabilities(),
    public var fpi: NvmeIdentifyNamespaceData6 = NvmeIdentifyNamespaceData6(),
    public var dlfeat: NvmeIdentifyNamespaceData7 = NvmeIdentifyNamespaceData7(),
    public var nawun: UShort = 0u,
    public var nawupf: UShort = 0u,
    public var nacwu: UShort = 0u,
    public var nabsn: UShort = 0u,
    public var nabo: UShort = 0u,
    public var nabspf: UShort = 0u,
    public var noiob: UShort = 0u,
    public var nvmcap: UByteArray = UByteArray(16),
    public var npwg: UShort = 0u,
    public var npwa: UShort = 0u,
    public var npdg: UShort = 0u,
    public var npda: UShort = 0u,
    public var nows: UShort = 0u,
    public var mssrl: UShort = 0u,
    public var mcl: UInt = 0u,
    public var msrc: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(11),
    public var anagrpid: UInt = 0u,
    public var reserved3: UByteArray = UByteArray(3),
    public var nsattr: NvmeIdentifyNamespaceData8 = NvmeIdentifyNamespaceData8(),
    public var nvmsetid: UShort = 0u,
    public var endgid: UShort = 0u,
    public var nguid: UByteArray = UByteArray(16),
    public var eui64: UByteArray = UByteArray(8),
    public var lbaf: List<NvmeLbaFormat> = List(16) { NvmeLbaFormat() },
    public var reserved4: UByteArray = UByteArray(192),
    public var vs: UByteArray = UByteArray(3712),
)

public data class NvmeIdentifyNamespaceData7(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData7> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData7> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData7 =
                    NvmeIdentifyNamespaceData7(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData7) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData3(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData3> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData3 =
                    NvmeIdentifyNamespaceData3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData4(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData4> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData4 =
                    NvmeIdentifyNamespaceData4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData1(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData1> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData1 =
                    NvmeIdentifyNamespaceData1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData6(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData6> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData6 =
                    NvmeIdentifyNamespaceData6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData2(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData2> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData2 =
                    NvmeIdentifyNamespaceData2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData5(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData5> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData5 =
                    NvmeIdentifyNamespaceData5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData8(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData8> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData8> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData8 =
                    NvmeIdentifyNamespaceData8(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData8) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceData0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceData0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceData0 =
                    NvmeIdentifyNamespaceData0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceData0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyNamespaceDescriptor(
    public var nidt: UByte = 0u,
    public var nidl: UByte = 0u,
    public var reserved: UByteArray = UByteArray(2),
    public var nid: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeIdentifyNamespaceDescriptor) return false
        if (this.nidt != other.nidt) return false
        if (this.nidl != other.nidl) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.nid.contentEquals(other.nid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nidt.hashCode()
        result = 31 * result + this.nidl.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.nid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNamespaceDescriptor> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyNamespaceDescriptor =
                    NvmeIdentifyNamespaceDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNamespaceDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.nidt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.nidl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.nid)
                }
            }
    }
}

public data class NvmeIdentifyNvmSpecificControllerIoCommandSet(
    public var vsl: UByte = 0u,
    public var wzsl: UByte = 0u,
    public var wusl: UByte = 0u,
    public var dmrl: UByte = 0u,
    public var dmrsl: UInt = 0u,
    public var dmsl: ULong = 0uL,
    public var reserved: UByteArray = UByteArray(4080),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeIdentifyNvmSpecificControllerIoCommandSet) return false
        if (this.vsl != other.vsl) return false
        if (this.wzsl != other.wzsl) return false
        if (this.wusl != other.wusl) return false
        if (this.dmrl != other.dmrl) return false
        if (this.dmrsl != other.dmrsl) return false
        if (this.dmsl != other.dmsl) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vsl.hashCode()
        result = 31 * result + this.wzsl.hashCode()
        result = 31 * result + this.wusl.hashCode()
        result = 31 * result + this.dmrl.hashCode()
        result = 31 * result + this.dmrsl.hashCode()
        result = 31 * result + this.dmsl.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNvmSpecificControllerIoCommandSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyNvmSpecificControllerIoCommandSet> {
                override val sizeBytes: Long = 4096L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeIdentifyNvmSpecificControllerIoCommandSet =
                    NvmeIdentifyNvmSpecificControllerIoCommandSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4080).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyNvmSpecificControllerIoCommandSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.vsl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.wzsl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.wusl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.dmrl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dmrsl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dmsl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4080).toInt())
                    ).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class NvmeIdentifySpecificNamespaceIoCommandSet(
    public var zoc: NvmeIdentifySpecificNamespaceIoCommandSet0 = NvmeIdentifySpecificNamespaceIoCommandSet0(),
    public var ozcs: NvmeIdentifySpecificNamespaceIoCommandSet1 = NvmeIdentifySpecificNamespaceIoCommandSet1(),
    public var mar: UInt = 0u,
    public var mor: UInt = 0u,
    public var rrl: UInt = 0u,
    public var frl: UInt = 0u,
    public var reserved0: UByteArray = UByteArray(2796),
    public var lbaef: List<NvmeLbaZoneFormat> = List(16) { NvmeLbaZoneFormat() },
    public var reserved1: UByteArray = UByteArray(768),
    public var vs: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeIdentifySpecificNamespaceIoCommandSet) return false
        if (this.zoc != other.zoc) return false
        if (this.ozcs != other.ozcs) return false
        if (this.mar != other.mar) return false
        if (this.mor != other.mor) return false
        if (this.rrl != other.rrl) return false
        if (this.frl != other.frl) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.lbaef != other.lbaef) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.vs.contentEquals(other.vs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.zoc.hashCode()
        result = 31 * result + this.ozcs.hashCode()
        result = 31 * result + this.mar.hashCode()
        result = 31 * result + this.mor.hashCode()
        result = 31 * result + this.rrl.hashCode()
        result = 31 * result + this.frl.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.lbaef.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.vs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifySpecificNamespaceIoCommandSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifySpecificNamespaceIoCommandSet> {
                override val sizeBytes: Long = 4096L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeIdentifySpecificNamespaceIoCommandSet =
                    NvmeIdentifySpecificNamespaceIoCommandSet(
                        (NvmeIdentifySpecificNamespaceIoCommandSet0.typeLayout()).readNative(addr),
                        (NvmeIdentifySpecificNamespaceIoCommandSet1.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2796).toInt())
                        ).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeLbaZoneFormat.typeLayout(), (16).toInt())
                        ).readNative(addr + 2816L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (768).toInt())
                        ).readNative(addr + 3072L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 3840L),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifySpecificNamespaceIoCommandSet) {
                    (NvmeIdentifySpecificNamespaceIoCommandSet0.typeLayout()).writeNative(addr, value.zoc)
                    (NvmeIdentifySpecificNamespaceIoCommandSet1.typeLayout()).writeNative(addr + 2L, value.ozcs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.rrl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.frl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2796).toInt())
                    ).writeNative(addr + 20L, value.reserved0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeLbaZoneFormat.typeLayout(), (16).toInt())
                    ).writeNative(addr + 2816L, value.lbaef)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (768).toInt())
                    ).writeNative(addr + 3072L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 3840L, value.vs)
                }
            }
    }
}

public data class NvmeIdentifySpecificNamespaceIoCommandSet1(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifySpecificNamespaceIoCommandSet1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifySpecificNamespaceIoCommandSet1> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeIdentifySpecificNamespaceIoCommandSet1 =
                    NvmeIdentifySpecificNamespaceIoCommandSet1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifySpecificNamespaceIoCommandSet1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifySpecificNamespaceIoCommandSet0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifySpecificNamespaceIoCommandSet0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifySpecificNamespaceIoCommandSet0> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeIdentifySpecificNamespaceIoCommandSet0 =
                    NvmeIdentifySpecificNamespaceIoCommandSet0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifySpecificNamespaceIoCommandSet0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeIdentifyZnsSpecificControllerIoCommandSet(
    public var zasl: UByte = 0u,
    public var reserved: UByteArray = UByteArray(4095),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeIdentifyZnsSpecificControllerIoCommandSet) return false
        if (this.zasl != other.zasl) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.zasl.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyZnsSpecificControllerIoCommandSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeIdentifyZnsSpecificControllerIoCommandSet> {
                override val sizeBytes: Long = 4096L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeIdentifyZnsSpecificControllerIoCommandSet =
                    NvmeIdentifyZnsSpecificControllerIoCommandSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4095).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: NvmeIdentifyZnsSpecificControllerIoCommandSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.zasl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4095).toInt())
                    ).writeNative(addr + 1L, value.reserved)
                }
            }
    }
}

public data class NvmeLbaFormat(
    public var anonymous: NvmeLbaFormat0 = NvmeLbaFormat0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeLbaFormat0(
    public var ms: UShort = 0u,
    public var lbads: UByte = 0u,
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaFormat0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaFormat0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeLbaFormat0 =
                    NvmeLbaFormat0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: NvmeLbaFormat0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.lbads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield)
                }
            }
    }
}

public data class NvmeLbaRange(
    public var attributes: NvmeContextAttributes = NvmeContextAttributes(),
    public var logicalBlockCount: UInt = 0u,
    public var startingLBA: ULong = 0uL,
)

public data class NvmeLbaRangetTypeEntry(
    public var type: UByte = 0u,
    public var attributes: NvmeLbaRangetTypeEntry0 = NvmeLbaRangetTypeEntry0(),
    public var reserved0: UByteArray = UByteArray(14),
    public var slba: ULong = 0uL,
    public var nlb: ULong = 0uL,
    public var guid: UByteArray = UByteArray(16),
    public var reserved1: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeLbaRangetTypeEntry) return false
        if (this.type != other.type) return false
        if (this.attributes != other.attributes) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.slba != other.slba) return false
        if (this.nlb != other.nlb) return false
        if (!this.guid.contentEquals(other.guid)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.slba.hashCode()
        result = 31 * result + this.nlb.hashCode()
        result = 31 * result + this.guid.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaRangetTypeEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaRangetTypeEntry> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeLbaRangetTypeEntry =
                    NvmeLbaRangetTypeEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (NvmeLbaRangetTypeEntry0.typeLayout()).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: NvmeLbaRangetTypeEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (NvmeLbaRangetTypeEntry0.typeLayout()).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.slba)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.nlb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.guid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 48L, value.reserved1)
                }
            }
    }
}

public data class NvmeLbaRangetTypeEntry0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaRangetTypeEntry0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaRangetTypeEntry0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeLbaRangetTypeEntry0 =
                    NvmeLbaRangetTypeEntry0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeLbaRangetTypeEntry0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeLbaZoneFormat(
    public var zoneSize: ULong = 0uL,
    public var zdes: UByte = 0u,
    public var reserved: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeLbaZoneFormat) return false
        if (this.zoneSize != other.zoneSize) return false
        if (this.zdes != other.zdes) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.zoneSize.hashCode()
        result = 31 * result + this.zdes.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaZoneFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeLbaZoneFormat> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeLbaZoneFormat =
                    NvmeLbaZoneFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                        ).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: NvmeLbaZoneFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.zoneSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.zdes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                    ).writeNative(addr + 9L, value.reserved)
                }
            }
    }
}

public data class NvmeNvmSubsystemReset(
    public var nssrc: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeNvmSubsystemReset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeNvmSubsystemReset> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeNvmSubsystemReset =
                    NvmeNvmSubsystemReset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeNvmSubsystemReset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nssrc)
                }
            }
    }
}

public data class NvmeOcpDeviceCapabilitiesLog(
    public var pciePorts: UShort = 0u,
    public var oobMgmtSupport: NvmeOcpDeviceCapabilitiesLog0 = NvmeOcpDeviceCapabilitiesLog0(),
    public var writeZeroesCommand: NvmeOcpDeviceCapabilitiesLog1 = NvmeOcpDeviceCapabilitiesLog1(),
    public var sanitizeCommand: NvmeOcpDeviceCapabilitiesLog2 = NvmeOcpDeviceCapabilitiesLog2(),
    public var datasetMgmtCommand: NvmeOcpDeviceCapabilitiesLog3 = NvmeOcpDeviceCapabilitiesLog3(),
    public var writeUncorrectableCommand: NvmeOcpDeviceCapabilitiesLog4 = NvmeOcpDeviceCapabilitiesLog4(),
    public var fusedCommand: NvmeOcpDeviceCapabilitiesLog5 = NvmeOcpDeviceCapabilitiesLog5(),
    public var minimumValidDSSDPowerState: UShort = 0u,
    public var reserved0: UByte = 0u,
    public var dssdDescriptors: List<DssdPowerStateDescriptor> = List(127) { DssdPowerStateDescriptor() },
    public var reserved1: UByteArray = UByteArray(3934),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeOcpDeviceCapabilitiesLog) return false
        if (this.pciePorts != other.pciePorts) return false
        if (this.oobMgmtSupport != other.oobMgmtSupport) return false
        if (this.writeZeroesCommand != other.writeZeroesCommand) return false
        if (this.sanitizeCommand != other.sanitizeCommand) return false
        if (this.datasetMgmtCommand != other.datasetMgmtCommand) return false
        if (this.writeUncorrectableCommand != other.writeUncorrectableCommand) return false
        if (this.fusedCommand != other.fusedCommand) return false
        if (this.minimumValidDSSDPowerState != other.minimumValidDSSDPowerState) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.dssdDescriptors != other.dssdDescriptors) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.logPageVersionNumber != other.logPageVersionNumber) return false
        if (this.logPageGUID != other.logPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pciePorts.hashCode()
        result = 31 * result + this.oobMgmtSupport.hashCode()
        result = 31 * result + this.writeZeroesCommand.hashCode()
        result = 31 * result + this.sanitizeCommand.hashCode()
        result = 31 * result + this.datasetMgmtCommand.hashCode()
        result = 31 * result + this.writeUncorrectableCommand.hashCode()
        result = 31 * result + this.fusedCommand.hashCode()
        result = 31 * result + this.minimumValidDSSDPowerState.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.dssdDescriptors.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.logPageVersionNumber.hashCode()
        result = 31 * result + this.logPageGUID.hashCode()
        return result
    }
}

public data class NvmeOcpDeviceCapabilitiesLog3(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog30 = NvmeOcpDeviceCapabilitiesLog30(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog30(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog30> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog30> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceCapabilitiesLog30 =
                    NvmeOcpDeviceCapabilitiesLog30(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceCapabilitiesLog30) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeOcpDeviceCapabilitiesLog5(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog50 = NvmeOcpDeviceCapabilitiesLog50(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog50(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog50> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog50> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceCapabilitiesLog50 =
                    NvmeOcpDeviceCapabilitiesLog50(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceCapabilitiesLog50) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeOcpDeviceCapabilitiesLog0(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog00 = NvmeOcpDeviceCapabilitiesLog00(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceCapabilitiesLog00 =
                    NvmeOcpDeviceCapabilitiesLog00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceCapabilitiesLog00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeOcpDeviceCapabilitiesLog2(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog20 = NvmeOcpDeviceCapabilitiesLog20(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog20(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog20> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceCapabilitiesLog20 =
                    NvmeOcpDeviceCapabilitiesLog20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceCapabilitiesLog20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeOcpDeviceCapabilitiesLog4(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog40 = NvmeOcpDeviceCapabilitiesLog40(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog40(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog40> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog40> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceCapabilitiesLog40 =
                    NvmeOcpDeviceCapabilitiesLog40(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceCapabilitiesLog40) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeOcpDeviceCapabilitiesLog1(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog10 = NvmeOcpDeviceCapabilitiesLog10(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog10(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceCapabilitiesLog10> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceCapabilitiesLog10 =
                    NvmeOcpDeviceCapabilitiesLog10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceCapabilitiesLog10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeOcpDeviceErrorRecoveryLogV2(
    public var panicResetWaitTime: UShort = 0u,
    public var panicResetAction: NvmeWcsDeviceResetAction = NvmeWcsDeviceResetAction(),
    public var deviceRecoveryAction1: UByte = 0u,
    public var panicId: ULong = 0uL,
    public var deviceCapabilitiesA: NvmeWcsDeviceCapabilities = NvmeWcsDeviceCapabilities(),
    public var vendorSpecificRecoveryCode: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var vendorSpecificCommandCDW12: UInt = 0u,
    public var vendorSpecificCommandCDW13: UInt = 0u,
    public var vendorSpecificCommandTimeout: UByte = 0u,
    public var deviceRecoveryAction2: UByte = 0u,
    public var deviceRecoveryAction2Timeout: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(463),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeOcpDeviceErrorRecoveryLogV2) return false
        if (this.panicResetWaitTime != other.panicResetWaitTime) return false
        if (this.panicResetAction != other.panicResetAction) return false
        if (this.deviceRecoveryAction1 != other.deviceRecoveryAction1) return false
        if (this.panicId != other.panicId) return false
        if (this.deviceCapabilitiesA != other.deviceCapabilitiesA) return false
        if (this.vendorSpecificRecoveryCode != other.vendorSpecificRecoveryCode) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.vendorSpecificCommandCDW12 != other.vendorSpecificCommandCDW12) return false
        if (this.vendorSpecificCommandCDW13 != other.vendorSpecificCommandCDW13) return false
        if (this.vendorSpecificCommandTimeout != other.vendorSpecificCommandTimeout) return false
        if (this.deviceRecoveryAction2 != other.deviceRecoveryAction2) return false
        if (this.deviceRecoveryAction2Timeout != other.deviceRecoveryAction2Timeout) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.logPageVersionNumber != other.logPageVersionNumber) return false
        if (this.logPageGUID != other.logPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.panicResetWaitTime.hashCode()
        result = 31 * result + this.panicResetAction.hashCode()
        result = 31 * result + this.deviceRecoveryAction1.hashCode()
        result = 31 * result + this.panicId.hashCode()
        result = 31 * result + this.deviceCapabilitiesA.hashCode()
        result = 31 * result + this.vendorSpecificRecoveryCode.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.vendorSpecificCommandCDW12.hashCode()
        result = 31 * result + this.vendorSpecificCommandCDW13.hashCode()
        result = 31 * result + this.vendorSpecificCommandTimeout.hashCode()
        result = 31 * result + this.deviceRecoveryAction2.hashCode()
        result = 31 * result + this.deviceRecoveryAction2Timeout.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.logPageVersionNumber.hashCode()
        result = 31 * result + this.logPageGUID.hashCode()
        return result
    }
}

public data class NvmeOcpDeviceFirmwareActivationHistoryLog(
    public var lid: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var validNumberOfEntries: UInt = 0u,
    public var entries: List<FirmwareActivationHistoryEntry> = List(20) { FirmwareActivationHistoryEntry() },
    public var reserved1: UByteArray = UByteArray(2790),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeOcpDeviceFirmwareActivationHistoryLog) return false
        if (this.lid != other.lid) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.validNumberOfEntries != other.validNumberOfEntries) return false
        if (this.entries != other.entries) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.logPageVersionNumber != other.logPageVersionNumber) return false
        if (this.logPageGUID != other.logPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lid.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.validNumberOfEntries.hashCode()
        result = 31 * result + this.entries.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.logPageVersionNumber.hashCode()
        result = 31 * result + this.logPageGUID.hashCode()
        return result
    }
}

public class NvmeOcpDeviceLatencyMonitorLog(
    public var featureStatus: LatencyMonitorFeatureStatus = LatencyMonitorFeatureStatus(),
    public var reserved0: UByte = 0u,
    public var activeBucketTimer: UShort = 0u,
    public var activeBucketTimerThreshold: UShort = 0u,
    public var activeThresholdA: UByte = 0u,
    public var activeThresholdB: UByte = 0u,
    public var activeThresholdC: UByte = 0u,
    public var activeThresholdD: UByte = 0u,
    public var activeLatencyConfig: ActiveLatencyConfiguration = ActiveLatencyConfiguration(),
    public var activeLatencyMinimumWindow: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(19),
    public var activeBucketCounter0: BucketCounter = BucketCounter(),
    public var activeBucketCounter1: BucketCounter = BucketCounter(),
    public var activeBucketCounter2: BucketCounter = BucketCounter(),
    public var activeBucketCounter3: BucketCounter = BucketCounter(),
    public var activeLatencyStamp: LatencyStamp = LatencyStamp(),
    public var activeMeasuredLatency: MeasuredLatency = MeasuredLatency(),
    public var activeLatencyStampUnits: LatencyStampUnits = LatencyStampUnits(),
    public var reserved2: UByteArray = UByteArray(22),
    public var staticBucketCounter0: BucketCounter = BucketCounter(),
    public var staticBucketCounter1: BucketCounter = BucketCounter(),
    public var staticBucketCounter2: BucketCounter = BucketCounter(),
    public var staticBucketCounter3: BucketCounter = BucketCounter(),
    public var staticLatencyStamp: LatencyStamp = LatencyStamp(),
    public var staticMeasuredLatency: MeasuredLatency = MeasuredLatency(),
    public var staticLatencyStampUnits: LatencyStampUnits = LatencyStampUnits(),
    public var reserved3: UByteArray = UByteArray(22),
    public var debugLogTriggerEnable: DebugBitField = DebugBitField(),
    public var debugLogMeasuredLatency: UShort = 0u,
    public var debugLogLatencyStamp: ULong = 0uL,
    public var debugLogPointer: UShort = 0u,
    public var debugCounterTriggerSource: DebugBitField = DebugBitField(),
    public var debugLogStampUnits: NvmeOcpDeviceLatencyMonitorLog0 = NvmeOcpDeviceLatencyMonitorLog0(),
    public var reserved4: UByteArray = UByteArray(29),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
)

public data class NvmeOcpDeviceLatencyMonitorLog0(
    public var anonymous: NvmeOcpDeviceLatencyMonitorLog00 = NvmeOcpDeviceLatencyMonitorLog00(),
    public var asUchar: UByte = 0u,
)

public data class NvmeOcpDeviceLatencyMonitorLog00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceLatencyMonitorLog00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceLatencyMonitorLog00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceLatencyMonitorLog00 =
                    NvmeOcpDeviceLatencyMonitorLog00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceLatencyMonitorLog00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class NvmeOcpDeviceSmartInformationLogV3(
    public var mediaUnitsWritten: UByteArray = UByteArray(16),
    public var mediaUnitsRead: UByteArray = UByteArray(16),
    public var badUserNANDBlockCount: NvmeOcpDeviceSmartInformationLogV30 = NvmeOcpDeviceSmartInformationLogV30(),
    public var badSystemNANDBlockCount: NvmeOcpDeviceSmartInformationLogV31 = NvmeOcpDeviceSmartInformationLogV31(),
    public var xORRecoveryCount: ULong = 0uL,
    public var unrecoverableReadErrorCount: ULong = 0uL,
    public var softECCErrorCount: ULong = 0uL,
    public var endToEndCorrectionCounts: NvmeOcpDeviceSmartInformationLogV32 = NvmeOcpDeviceSmartInformationLogV32(),
    public var percentageSystemDataUsed: UByte = 0u,
    public var refreshCount: UByteArray = UByteArray(7),
    public var userDataEraseCounts: NvmeOcpDeviceSmartInformationLogV33 = NvmeOcpDeviceSmartInformationLogV33(),
    public var thermalThrottling: NvmeOcpDeviceSmartInformationLogV34 = NvmeOcpDeviceSmartInformationLogV34(),
    public var dSSDSpecVersion: UByteArray = UByteArray(6),
    public var pCIeCorrectableErrorCount: ULong = 0uL,
    public var incompleteShutdownCount: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var percentageFreeBlocks: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
    public var capacitorHealth: UShort = 0u,
    public var nvmeErrata: UByte = 0u,
    public var reserved3: UByteArray = UByteArray(5),
    public var unalignedIOCount: ULong = 0uL,
    public var securityVersionNumber: ULong = 0uL,
    public var nuse: ULong = 0uL,
    public var pLPStartCount: UByteArray = UByteArray(16),
    public var enduranceEstimate: UByteArray = UByteArray(16),
    public var pCIeLinkRetrainingCount: ULong = 0uL,
    public var powerStateChangeCount: ULong = 0uL,
    public var reserved4: UByteArray = UByteArray(286),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
)

public data class NvmeOcpDeviceSmartInformationLogV31(
    public var rawCount: UByteArray = UByteArray(6),
    public var normalized: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeOcpDeviceSmartInformationLogV31) return false
        if (!this.rawCount.contentEquals(other.rawCount)) return false
        if (!this.normalized.contentEquals(other.normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawCount.contentHashCode()
        result = 31 * result + this.normalized.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV31> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV31> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceSmartInformationLogV31 =
                    NvmeOcpDeviceSmartInformationLogV31(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceSmartInformationLogV31) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.rawCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.normalized)
                }
            }
    }
}

public data class NvmeOcpDeviceSmartInformationLogV30(
    public var rawCount: UByteArray = UByteArray(6),
    public var normalized: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeOcpDeviceSmartInformationLogV30) return false
        if (!this.rawCount.contentEquals(other.rawCount)) return false
        if (!this.normalized.contentEquals(other.normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawCount.contentHashCode()
        result = 31 * result + this.normalized.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV30> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV30> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceSmartInformationLogV30 =
                    NvmeOcpDeviceSmartInformationLogV30(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceSmartInformationLogV30) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.rawCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.normalized)
                }
            }
    }
}

public data class NvmeOcpDeviceSmartInformationLogV32(
    public var detectedCounts: UInt = 0u,
    public var correctedCounts: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV32> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceSmartInformationLogV32 =
                    NvmeOcpDeviceSmartInformationLogV32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceSmartInformationLogV32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.detectedCounts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.correctedCounts)
                }
            }
    }
}

public data class NvmeOcpDeviceSmartInformationLogV34(
    public var eventCount: UByte = 0u,
    public var status: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV34> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV34> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceSmartInformationLogV34 =
                    NvmeOcpDeviceSmartInformationLogV34(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceSmartInformationLogV34) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.eventCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.status)
                }
            }
    }
}

public data class NvmeOcpDeviceSmartInformationLogV33(
    public var maximumCount: UInt = 0u,
    public var minimumCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV33> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceSmartInformationLogV33> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceSmartInformationLogV33 =
                    NvmeOcpDeviceSmartInformationLogV33(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceSmartInformationLogV33) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumCount)
                }
            }
    }
}

public class NvmeOcpDeviceTcgConfigurationLog(
    public var state: NvmeOcpDeviceTcgConfigurationLog0 = NvmeOcpDeviceTcgConfigurationLog0(),
    public var reserved0: UByteArray = UByteArray(3),
    public var lSPActivationCount: UByte = 0u,
    public var tPRevertCount: UByte = 0u,
    public var lSPRevertCount: UByte = 0u,
    public var lOCount: UByte = 0u,
    public var sUMLOCount: UByte = 0u,
    public var rPLOCount: UByte = 0u,
    public var nPLOCount: UByte = 0u,
    public var rLLOCount: UByte = 0u,
    public var wLLOCount: UByte = 0u,
    public var rULOCount: UByte = 0u,
    public var wULOCount: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var sIDAuthTryCount: UInt = 0u,
    public var sIDAuthTryLimit: UInt = 0u,
    public var resetCount: UInt = 0u,
    public var resetLockCount: UInt = 0u,
    public var reserved2: UByteArray = UByteArray(462),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
)

public data class NvmeOcpDeviceTcgConfigurationLog0(
    public var anonymous: NvmeOcpDeviceTcgConfigurationLog00 = NvmeOcpDeviceTcgConfigurationLog00(),
    public var asUchar: UByte = 0u,
)

public data class NvmeOcpDeviceTcgConfigurationLog00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceTcgConfigurationLog00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeOcpDeviceTcgConfigurationLog00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeOcpDeviceTcgConfigurationLog00 =
                    NvmeOcpDeviceTcgConfigurationLog00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeOcpDeviceTcgConfigurationLog00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeOcpDeviceTcgHistoryLog(
    public var lid: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var historyEntryCount: UInt = 0u,
    public var historyEntries: List<TcgHistoryEntry> = List(84) { TcgHistoryEntry() },
    public var reserved1: UByteArray = UByteArray(38),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeOcpDeviceTcgHistoryLog) return false
        if (this.lid != other.lid) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.historyEntryCount != other.historyEntryCount) return false
        if (this.historyEntries != other.historyEntries) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.logPageVersionNumber != other.logPageVersionNumber) return false
        if (this.logPageGUID != other.logPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lid.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.historyEntryCount.hashCode()
        result = 31 * result + this.historyEntries.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.logPageVersionNumber.hashCode()
        result = 31 * result + this.logPageGUID.hashCode()
        return result
    }
}

public data class NvmeOcpDeviceUnsupportedRequirementsLog(
    public var unsupportedCount: UShort = 0u,
    public var reserved0: UByteArray = UByteArray(14),
    public var unsupportedReqList: List<UnsupportedRequirement> = List(253) { UnsupportedRequirement() },
    public var reserved1: UByteArray = UByteArray(14),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeOcpDeviceUnsupportedRequirementsLog) return false
        if (this.unsupportedCount != other.unsupportedCount) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.unsupportedReqList != other.unsupportedReqList) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.logPageVersionNumber != other.logPageVersionNumber) return false
        if (this.logPageGUID != other.logPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unsupportedCount.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.unsupportedReqList.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.logPageVersionNumber.hashCode()
        result = 31 * result + this.logPageGUID.hashCode()
        return result
    }
}

public data class NvmePersistentEventLogEventHeader(
    public var eventType: UByte = 0u,
    public var eventTypeRevision: UByte = 0u,
    public var eventHeaderLength: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var controllerIdentifier: UShort = 0u,
    public var eventTimestamp: ULong = 0uL,
    public var reserved1: UByteArray = UByteArray(6),
    public var vendorSpecificInformationLength: UShort = 0u,
    public var eventLength: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmePersistentEventLogEventHeader) return false
        if (this.eventType != other.eventType) return false
        if (this.eventTypeRevision != other.eventTypeRevision) return false
        if (this.eventHeaderLength != other.eventHeaderLength) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.controllerIdentifier != other.controllerIdentifier) return false
        if (this.eventTimestamp != other.eventTimestamp) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.vendorSpecificInformationLength != other.vendorSpecificInformationLength) return false
        if (this.eventLength != other.eventLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventType.hashCode()
        result = 31 * result + this.eventTypeRevision.hashCode()
        result = 31 * result + this.eventHeaderLength.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.controllerIdentifier.hashCode()
        result = 31 * result + this.eventTimestamp.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.vendorSpecificInformationLength.hashCode()
        result = 31 * result + this.eventLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePersistentEventLogEventHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePersistentEventLogEventHeader> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmePersistentEventLogEventHeader =
                    NvmePersistentEventLogEventHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: NvmePersistentEventLogEventHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.eventType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.eventTypeRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.eventHeaderLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.controllerIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 6L, value.eventTimestamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 14L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.vendorSpecificInformationLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.eventLength)
                }
            }
    }
}

public class NvmePersistentEventLogHeader(
    public var logIdentifier: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var totalNumberOfEvents: UInt = 0u,
    public var totalLogLength: ULong = 0uL,
    public var logRevision: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var logHeaderLength: UShort = 0u,
    public var timestamp: ULong = 0uL,
    public var powerOnHours: UByteArray = UByteArray(16),
    public var powerCycleCount: ULong = 0uL,
    public var pciVendorId: UShort = 0u,
    public var pciSubsystemVendorId: UShort = 0u,
    public var serialNumber: UByteArray = UByteArray(20),
    public var modelNumber: UByteArray = UByteArray(40),
    public var nVMSubsystemNVMeQualifiedName: UByteArray = UByteArray(256),
    public var reserved: UByteArray = UByteArray(108),
    public var supportedEventsBitmap: UByteArray = UByteArray(32),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePersistentEventLogHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePersistentEventLogHeader> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmePersistentEventLogHeader =
                    NvmePersistentEventLogHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 54L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                        ).readNative(addr + 76L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 116L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (108).toInt())
                        ).readNative(addr + 372L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 480L),
                    )
                override fun writeNative(addr: Long, value: NvmePersistentEventLogHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.logIdentifier)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalNumberOfEvents)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.totalLogLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.logRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.logHeaderLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 20L, value.timestamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 28L, value.powerOnHours)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 44L, value.powerCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.pciVendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 54L, value.pciSubsystemVendorId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 56L, value.serialNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                    ).writeNative(addr + 76L, value.modelNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 116L, value.nVMSubsystemNVMeQualifiedName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (108).toInt())
                    ).writeNative(addr + 372L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 480L, value.supportedEventsBitmap)
                }
            }
    }
}

public data class NvmePowerStateDesc(
    public var mp: UShort = 0u,
    public var reserved0: UByte = 0u,
    public var bitfield1: UByte = 0u,
    public var enlat: UInt = 0u,
    public var exlat: UInt = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var bitfield4: UByte = 0u,
    public var bitfield5: UByte = 0u,
    public var idlp: UShort = 0u,
    public var bitfield6: UByte = 0u,
    public var reserved7: UByte = 0u,
    public var actp: UShort = 0u,
    public var bitfield7: UByte = 0u,
    public var reserved9: UByteArray = UByteArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmePowerStateDesc) return false
        if (this.mp != other.mp) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.enlat != other.enlat) return false
        if (this.exlat != other.exlat) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (this.bitfield3 != other.bitfield3) return false
        if (this.bitfield4 != other.bitfield4) return false
        if (this.bitfield5 != other.bitfield5) return false
        if (this.idlp != other.idlp) return false
        if (this.bitfield6 != other.bitfield6) return false
        if (this.reserved7 != other.reserved7) return false
        if (this.actp != other.actp) return false
        if (this.bitfield7 != other.bitfield7) return false
        if (!this.reserved9.contentEquals(other.reserved9)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mp.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.bitfield1.hashCode()
        result = 31 * result + this.enlat.hashCode()
        result = 31 * result + this.exlat.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.bitfield3.hashCode()
        result = 31 * result + this.bitfield4.hashCode()
        result = 31 * result + this.bitfield5.hashCode()
        result = 31 * result + this.idlp.hashCode()
        result = 31 * result + this.bitfield6.hashCode()
        result = 31 * result + this.reserved7.hashCode()
        result = 31 * result + this.actp.hashCode()
        result = 31 * result + this.bitfield7.hashCode()
        result = 31 * result + this.reserved9.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePowerStateDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePowerStateDesc> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmePowerStateDesc =
                    NvmePowerStateDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (9).toInt())
                        ).readNative(addr + 23L),
                    )
                override fun writeNative(addr: Long, value: NvmePowerStateDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.mp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.enlat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.exlat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.bitfield3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.bitfield4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.bitfield5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.idlp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.bitfield6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.reserved7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.actp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.bitfield7)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (9).toInt())
                    ).writeNative(addr + 23L, value.reserved9)
                }
            }
    }
}

public data class NvmePrpEntry(
    public var anonymous: NvmePrpEntry0 = NvmePrpEntry0(),
    public var asUlonglong: ULong = 0uL,
)

public data class NvmePrpEntry0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePrpEntry0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmePrpEntry0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmePrpEntry0 =
                    NvmePrpEntry0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmePrpEntry0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeRegisteredControllerData(
    public var cntlid: UShort = 0u,
    public var rcsts: NvmeRegisteredControllerData0 = NvmeRegisteredControllerData0(),
    public var reserved: UByteArray = UByteArray(5),
    public var hostid: UByteArray = UByteArray(8),
    public var rkey: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeRegisteredControllerData) return false
        if (this.cntlid != other.cntlid) return false
        if (this.rcsts != other.rcsts) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.hostid.contentEquals(other.hostid)) return false
        if (this.rkey != other.rkey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cntlid.hashCode()
        result = 31 * result + this.rcsts.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.hostid.contentHashCode()
        result = 31 * result + this.rkey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerData> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeRegisteredControllerData =
                    NvmeRegisteredControllerData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (NvmeRegisteredControllerData0.typeLayout()).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NvmeRegisteredControllerData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cntlid)
                    (NvmeRegisteredControllerData0.typeLayout()).writeNative(addr + 2L, value.rcsts)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 3L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.hostid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rkey)
                }
            }
    }
}

public data class NvmeRegisteredControllerData0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerData0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerData0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeRegisteredControllerData0 =
                    NvmeRegisteredControllerData0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeRegisteredControllerData0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeRegisteredControllerExtendedData(
    public var cntlid: UShort = 0u,
    public var rcsts: NvmeRegisteredControllerExtendedData0 = NvmeRegisteredControllerExtendedData0(),
    public var reserved: UByteArray = UByteArray(5),
    public var rkey: ULong = 0uL,
    public var hostid: UByteArray = UByteArray(16),
    public var reserved1: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeRegisteredControllerExtendedData) return false
        if (this.cntlid != other.cntlid) return false
        if (this.rcsts != other.rcsts) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.rkey != other.rkey) return false
        if (!this.hostid.contentEquals(other.hostid)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cntlid.hashCode()
        result = 31 * result + this.rcsts.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.rkey.hashCode()
        result = 31 * result + this.hostid.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerExtendedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerExtendedData> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeRegisteredControllerExtendedData =
                    NvmeRegisteredControllerExtendedData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (NvmeRegisteredControllerExtendedData0.typeLayout()).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NvmeRegisteredControllerExtendedData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cntlid)
                    (NvmeRegisteredControllerExtendedData0.typeLayout()).writeNative(addr + 2L, value.rcsts)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rkey)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.hostid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 32L, value.reserved1)
                }
            }
    }
}

public data class NvmeRegisteredControllerExtendedData0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerExtendedData0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeRegisteredControllerExtendedData0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeRegisteredControllerExtendedData0 =
                    NvmeRegisteredControllerExtendedData0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeRegisteredControllerExtendedData0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeReportZoneInfo(
    public var zoneCount: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(7),
    public var zoneDescriptor: List<NvmeZoneDescriptor> = List(1) { NvmeZoneDescriptor() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeReportZoneInfo) return false
        if (this.zoneCount != other.zoneCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.zoneDescriptor != other.zoneDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.zoneCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.zoneDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReportZoneInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReportZoneInfo> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeReportZoneInfo =
                    NvmeReportZoneInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeZoneDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: NvmeReportZoneInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.zoneCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                    ).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeZoneDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 64L, value.zoneDescriptor)
                }
            }
    }
}

public data class NvmeReservationAcquireDataStructure(
    public var crkey: ULong = 0uL,
    public var prkey: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationAcquireDataStructure> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationAcquireDataStructure> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeReservationAcquireDataStructure =
                    NvmeReservationAcquireDataStructure(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NvmeReservationAcquireDataStructure) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.crkey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.prkey)
                }
            }
    }
}

public data class NvmeReservationNotificationLog(
    public var logPageCount: ULong = 0uL,
    public var logPageType: UByte = 0u,
    public var availableLogPageCount: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(2),
    public var nameSpaceId: UInt = 0u,
    public var reserved1: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeReservationNotificationLog) return false
        if (this.logPageCount != other.logPageCount) return false
        if (this.logPageType != other.logPageType) return false
        if (this.availableLogPageCount != other.availableLogPageCount) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.nameSpaceId != other.nameSpaceId) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logPageCount.hashCode()
        result = 31 * result + this.logPageType.hashCode()
        result = 31 * result + this.availableLogPageCount.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.nameSpaceId.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationNotificationLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationNotificationLog> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeReservationNotificationLog =
                    NvmeReservationNotificationLog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NvmeReservationNotificationLog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.logPageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.logPageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.availableLogPageCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 10L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nameSpaceId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                    ).writeNative(addr + 16L, value.reserved1)
                }
            }
    }
}

public data class NvmeReservationRegisterDataStructure(
    public var crkey: ULong = 0uL,
    public var nrkey: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationRegisterDataStructure> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationRegisterDataStructure> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeReservationRegisterDataStructure =
                    NvmeReservationRegisterDataStructure(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NvmeReservationRegisterDataStructure) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.crkey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.nrkey)
                }
            }
    }
}

public data class NvmeReservationReleaseDataStructure(
    public var crkey: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReleaseDataStructure> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReleaseDataStructure> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeReservationReleaseDataStructure =
                    NvmeReservationReleaseDataStructure(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeReservationReleaseDataStructure) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.crkey)
                }
            }
    }
}

public data class NvmeReservationReportStatusDataStructure(
    public var header: NvmeReservationReportStatusHeader = NvmeReservationReportStatusHeader(),
    public var registeredControllersData: List<NvmeRegisteredControllerData> = List(1) { NvmeRegisteredControllerData() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReportStatusDataStructure> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReportStatusDataStructure> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeReservationReportStatusDataStructure =
                    NvmeReservationReportStatusDataStructure(
                        (NvmeReservationReportStatusHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeRegisteredControllerData.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: NvmeReservationReportStatusDataStructure) {
                    (NvmeReservationReportStatusHeader.typeLayout()).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeRegisteredControllerData.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.registeredControllersData)
                }
            }
    }
}

public data class NvmeReservationReportStatusExtendedDataStructure(
    public var header: NvmeReservationReportStatusHeader = NvmeReservationReportStatusHeader(),
    public var reserved1: UByteArray = UByteArray(40),
    public var registeredControllersExtendedData: List<NvmeRegisteredControllerExtendedData> = List(1) { NvmeRegisteredControllerExtendedData() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeReservationReportStatusExtendedDataStructure) return false
        if (this.header != other.header) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.registeredControllersExtendedData != other.registeredControllersExtendedData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.registeredControllersExtendedData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReportStatusExtendedDataStructure> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReportStatusExtendedDataStructure> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeReservationReportStatusExtendedDataStructure =
                    NvmeReservationReportStatusExtendedDataStructure(
                        (NvmeReservationReportStatusHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeRegisteredControllerExtendedData.typeLayout(), (1).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: NvmeReservationReportStatusExtendedDataStructure) {
                    (NvmeReservationReportStatusHeader.typeLayout()).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                    ).writeNative(addr + 24L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeRegisteredControllerExtendedData.typeLayout(), (1).toInt())
                    ).writeNative(addr + 64L, value.registeredControllersExtendedData)
                }
            }
    }
}

public data class NvmeReservationReportStatusHeader(
    public var gen: UInt = 0u,
    public var rtype: UByte = 0u,
    public var regctl: UShort = 0u,
    public var reserved: UByteArray = UByteArray(2),
    public var ptpls: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeReservationReportStatusHeader) return false
        if (this.gen != other.gen) return false
        if (this.rtype != other.rtype) return false
        if (this.regctl != other.regctl) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ptpls != other.ptpls) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gen.hashCode()
        result = 31 * result + this.rtype.hashCode()
        result = 31 * result + this.regctl.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ptpls.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReportStatusHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeReservationReportStatusHeader> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeReservationReportStatusHeader =
                    NvmeReservationReportStatusHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 5L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NvmeReservationReportStatusHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.gen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.rtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 5L, value.regctl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 7L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.ptpls)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 10L, value.reserved1)
                }
            }
    }
}

public data class NvmeSanitizeStatus(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSanitizeStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSanitizeStatus> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): NvmeSanitizeStatus =
                    NvmeSanitizeStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeSanitizeStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeSanitizeStatusLog(
    public var sprog: UShort = 0u,
    public var sstat: NvmeSanitizeStatus = NvmeSanitizeStatus(),
    public var scdw10: UInt = 0u,
    public var estimatedTimeForOverwrite: UInt = 0u,
    public var estimatedTimeForBlockErase: UInt = 0u,
    public var estimatedTimeForCryptoErase: UInt = 0u,
    public var estimatedTimeForOverwriteWithNoDeallocateMediaModification: UInt = 0u,
    public var estimatedTimeForBlockEraseWithNoDeallocateMediaModification: UInt = 0u,
    public var estimatedTimeForCryptoEraseWithNoDeallocateMediaModification: UInt = 0u,
    public var reserved: UByteArray = UByteArray(480),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeSanitizeStatusLog) return false
        if (this.sprog != other.sprog) return false
        if (this.sstat != other.sstat) return false
        if (this.scdw10 != other.scdw10) return false
        if (this.estimatedTimeForOverwrite != other.estimatedTimeForOverwrite) return false
        if (this.estimatedTimeForBlockErase != other.estimatedTimeForBlockErase) return false
        if (this.estimatedTimeForCryptoErase != other.estimatedTimeForCryptoErase) return false
        if (this.estimatedTimeForOverwriteWithNoDeallocateMediaModification != other.estimatedTimeForOverwriteWithNoDeallocateMediaModification) return false
        if (this.estimatedTimeForBlockEraseWithNoDeallocateMediaModification != other.estimatedTimeForBlockEraseWithNoDeallocateMediaModification) return false
        if (this.estimatedTimeForCryptoEraseWithNoDeallocateMediaModification != other.estimatedTimeForCryptoEraseWithNoDeallocateMediaModification) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sprog.hashCode()
        result = 31 * result + this.sstat.hashCode()
        result = 31 * result + this.scdw10.hashCode()
        result = 31 * result + this.estimatedTimeForOverwrite.hashCode()
        result = 31 * result + this.estimatedTimeForBlockErase.hashCode()
        result = 31 * result + this.estimatedTimeForCryptoErase.hashCode()
        result = 31 * result + this.estimatedTimeForOverwriteWithNoDeallocateMediaModification.hashCode()
        result = 31 * result + this.estimatedTimeForBlockEraseWithNoDeallocateMediaModification.hashCode()
        result = 31 * result + this.estimatedTimeForCryptoEraseWithNoDeallocateMediaModification.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSanitizeStatusLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSanitizeStatusLog> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeSanitizeStatusLog =
                    NvmeSanitizeStatusLog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (NvmeSanitizeStatus.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (480).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NvmeSanitizeStatusLog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sprog)
                    (NvmeSanitizeStatus.typeLayout()).writeNative(addr + 2L, value.sstat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.scdw10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.estimatedTimeForOverwrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.estimatedTimeForBlockErase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.estimatedTimeForCryptoErase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.estimatedTimeForOverwriteWithNoDeallocateMediaModification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.estimatedTimeForBlockEraseWithNoDeallocateMediaModification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.estimatedTimeForCryptoEraseWithNoDeallocateMediaModification)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (480).toInt())
                    ).writeNative(addr + 32L, value.reserved)
                }
            }
    }
}

public data class NvmeScsiNameString(
    public var pCIVendorID: ByteArray = ByteArray(4),
    public var modelNumber: ByteArray = ByteArray(40),
    public var namespaceID: ByteArray = ByteArray(4),
    public var serialNumber: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeScsiNameString) return false
        if (!this.pCIVendorID.contentEquals(other.pCIVendorID)) return false
        if (!this.modelNumber.contentEquals(other.modelNumber)) return false
        if (!this.namespaceID.contentEquals(other.namespaceID)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pCIVendorID.contentHashCode()
        result = 31 * result + this.modelNumber.contentHashCode()
        result = 31 * result + this.namespaceID.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeScsiNameString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeScsiNameString> {
                override val sizeBytes: Long = 68L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeScsiNameString =
                    NvmeScsiNameString(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                        ).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (20).toInt())
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: NvmeScsiNameString) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                    ).writeNative(addr, value.pCIVendorID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (40).toInt())
                    ).writeNative(addr + 4L, value.modelNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                    ).writeNative(addr + 44L, value.namespaceID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (20).toInt())
                    ).writeNative(addr + 48L, value.serialNumber)
                }
            }
    }
}

public data class NvmeSetAttributesEntry(
    public var identifier: UShort = 0u,
    public var endgid: UShort = 0u,
    public var reserved1: UInt = 0u,
    public var random4KBReadTypical: UInt = 0u,
    public var optimalWriteSize: UInt = 0u,
    public var totalCapacity: UByteArray = UByteArray(16),
    public var unallocatedCapacity: UByteArray = UByteArray(16),
    public var reserved2: UByteArray = UByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeSetAttributesEntry) return false
        if (this.identifier != other.identifier) return false
        if (this.endgid != other.endgid) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.random4KBReadTypical != other.random4KBReadTypical) return false
        if (this.optimalWriteSize != other.optimalWriteSize) return false
        if (!this.totalCapacity.contentEquals(other.totalCapacity)) return false
        if (!this.unallocatedCapacity.contentEquals(other.unallocatedCapacity)) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.identifier.hashCode()
        result = 31 * result + this.endgid.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.random4KBReadTypical.hashCode()
        result = 31 * result + this.optimalWriteSize.hashCode()
        result = 31 * result + this.totalCapacity.contentHashCode()
        result = 31 * result + this.unallocatedCapacity.contentHashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSetAttributesEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSetAttributesEntry> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeSetAttributesEntry =
                    NvmeSetAttributesEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: NvmeSetAttributesEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.identifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.endgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.random4KBReadTypical)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.optimalWriteSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.totalCapacity)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.unallocatedCapacity)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 48L, value.reserved2)
                }
            }
    }
}

public data class NvmeSubmissionQueueTailDoorbell(
    public var anonymous: NvmeSubmissionQueueTailDoorbell0 = NvmeSubmissionQueueTailDoorbell0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeSubmissionQueueTailDoorbell0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSubmissionQueueTailDoorbell0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeSubmissionQueueTailDoorbell0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeSubmissionQueueTailDoorbell0 =
                    NvmeSubmissionQueueTailDoorbell0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeSubmissionQueueTailDoorbell0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeTelemetryControllerInitiatedLog(
    public var logIdentifier: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(4),
    public var organizationID: UByteArray = UByteArray(3),
    public var area1LastBlock: UShort = 0u,
    public var area2LastBlock: UShort = 0u,
    public var area3LastBlock: UShort = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var area4LastBlock: UInt = 0u,
    public var reserved2: UByteArray = UByteArray(362),
    public var controllerInitiatedDataAvailable: UByte = 0u,
    public var controllerInitiatedDataGenerationNumber: UByte = 0u,
    public var reasonIdentifier: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeTelemetryControllerInitiatedLog) return false
        if (this.logIdentifier != other.logIdentifier) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.organizationID.contentEquals(other.organizationID)) return false
        if (this.area1LastBlock != other.area1LastBlock) return false
        if (this.area2LastBlock != other.area2LastBlock) return false
        if (this.area3LastBlock != other.area3LastBlock) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.area4LastBlock != other.area4LastBlock) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.controllerInitiatedDataAvailable != other.controllerInitiatedDataAvailable) return false
        if (this.controllerInitiatedDataGenerationNumber != other.controllerInitiatedDataGenerationNumber) return false
        if (!this.reasonIdentifier.contentEquals(other.reasonIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logIdentifier.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.organizationID.contentHashCode()
        result = 31 * result + this.area1LastBlock.hashCode()
        result = 31 * result + this.area2LastBlock.hashCode()
        result = 31 * result + this.area3LastBlock.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.area4LastBlock.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.controllerInitiatedDataAvailable.hashCode()
        result = 31 * result + this.controllerInitiatedDataGenerationNumber.hashCode()
        result = 31 * result + this.reasonIdentifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeTelemetryControllerInitiatedLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeTelemetryControllerInitiatedLog> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeTelemetryControllerInitiatedLog =
                    NvmeTelemetryControllerInitiatedLog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (362).toInt())
                        ).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 382L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 383L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 384L),
                    )
                override fun writeNative(addr: Long, value: NvmeTelemetryControllerInitiatedLog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.logIdentifier)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 1L, value.reserved0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.organizationID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.area1LastBlock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.area2LastBlock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.area3LastBlock)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.area4LastBlock)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (362).toInt())
                    ).writeNative(addr + 20L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 382L, value.controllerInitiatedDataAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 383L, value.controllerInitiatedDataGenerationNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 384L, value.reasonIdentifier)
                }
            }
    }
}

public data class NvmeTelemetryHostInitiatedLog(
    public var logIdentifier: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(4),
    public var organizationID: UByteArray = UByteArray(3),
    public var area1LastBlock: UShort = 0u,
    public var area2LastBlock: UShort = 0u,
    public var area3LastBlock: UShort = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var area4LastBlock: UInt = 0u,
    public var reserved2: UByteArray = UByteArray(361),
    public var hostInitiatedDataGenerationNumber: UByte = 0u,
    public var controllerInitiatedDataAvailable: UByte = 0u,
    public var controllerInitiatedDataGenerationNumber: UByte = 0u,
    public var reasonIdentifier: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeTelemetryHostInitiatedLog) return false
        if (this.logIdentifier != other.logIdentifier) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.organizationID.contentEquals(other.organizationID)) return false
        if (this.area1LastBlock != other.area1LastBlock) return false
        if (this.area2LastBlock != other.area2LastBlock) return false
        if (this.area3LastBlock != other.area3LastBlock) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.area4LastBlock != other.area4LastBlock) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.hostInitiatedDataGenerationNumber != other.hostInitiatedDataGenerationNumber) return false
        if (this.controllerInitiatedDataAvailable != other.controllerInitiatedDataAvailable) return false
        if (this.controllerInitiatedDataGenerationNumber != other.controllerInitiatedDataGenerationNumber) return false
        if (!this.reasonIdentifier.contentEquals(other.reasonIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logIdentifier.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.organizationID.contentHashCode()
        result = 31 * result + this.area1LastBlock.hashCode()
        result = 31 * result + this.area2LastBlock.hashCode()
        result = 31 * result + this.area3LastBlock.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.area4LastBlock.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.hostInitiatedDataGenerationNumber.hashCode()
        result = 31 * result + this.controllerInitiatedDataAvailable.hashCode()
        result = 31 * result + this.controllerInitiatedDataGenerationNumber.hashCode()
        result = 31 * result + this.reasonIdentifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeTelemetryHostInitiatedLog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeTelemetryHostInitiatedLog> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeTelemetryHostInitiatedLog =
                    NvmeTelemetryHostInitiatedLog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (361).toInt())
                        ).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 381L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 382L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 383L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 384L),
                    )
                override fun writeNative(addr: Long, value: NvmeTelemetryHostInitiatedLog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.logIdentifier)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 1L, value.reserved0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.organizationID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.area1LastBlock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.area2LastBlock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.area3LastBlock)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.area4LastBlock)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (361).toInt())
                    ).writeNative(addr + 20L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 381L, value.hostInitiatedDataGenerationNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 382L, value.controllerInitiatedDataAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 383L, value.controllerInitiatedDataGenerationNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 384L, value.reasonIdentifier)
                }
            }
    }
}

public data class NvmeVersion(
    public var anonymous: NvmeVersion0 = NvmeVersion0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeVersion0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeVersion0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeVersion0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeVersion0 =
                    NvmeVersion0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeVersion0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeWcsDeviceCapabilities(
    public var anonymous: NvmeWcsDeviceCapabilities0 = NvmeWcsDeviceCapabilities0(),
)

public data class NvmeWcsDeviceCapabilities0(
    public var anonymous: NvmeWcsDeviceCapabilities00 = NvmeWcsDeviceCapabilities00(),
    public var asULONG: UInt = 0u,
)

public data class NvmeWcsDeviceCapabilities00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceCapabilities00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceCapabilities00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmeWcsDeviceCapabilities00 =
                    NvmeWcsDeviceCapabilities00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeWcsDeviceCapabilities00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeWcsDeviceErrorRecoveryLog(
    public var panicResetWaitTime: UShort = 0u,
    public var panicResetAction: NvmeWcsDeviceResetAction = NvmeWcsDeviceResetAction(),
    public var driveRecoveryAction: UByte = 0u,
    public var panicId: ULong = 0uL,
    public var deviceCapabilitiesA: NvmeWcsDeviceCapabilities = NvmeWcsDeviceCapabilities(),
    public var vendorSpecificRecoveryCode: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var vendorSpecificCommandCDW12: UInt = 0u,
    public var vendorSpecificCommandCDW13: UInt = 0u,
    public var reserved1: UByteArray = UByteArray(466),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeWcsDeviceErrorRecoveryLog) return false
        if (this.panicResetWaitTime != other.panicResetWaitTime) return false
        if (this.panicResetAction != other.panicResetAction) return false
        if (this.driveRecoveryAction != other.driveRecoveryAction) return false
        if (this.panicId != other.panicId) return false
        if (this.deviceCapabilitiesA != other.deviceCapabilitiesA) return false
        if (this.vendorSpecificRecoveryCode != other.vendorSpecificRecoveryCode) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.vendorSpecificCommandCDW12 != other.vendorSpecificCommandCDW12) return false
        if (this.vendorSpecificCommandCDW13 != other.vendorSpecificCommandCDW13) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.logPageVersionNumber != other.logPageVersionNumber) return false
        if (this.logPageGUID != other.logPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.panicResetWaitTime.hashCode()
        result = 31 * result + this.panicResetAction.hashCode()
        result = 31 * result + this.driveRecoveryAction.hashCode()
        result = 31 * result + this.panicId.hashCode()
        result = 31 * result + this.deviceCapabilitiesA.hashCode()
        result = 31 * result + this.vendorSpecificRecoveryCode.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.vendorSpecificCommandCDW12.hashCode()
        result = 31 * result + this.vendorSpecificCommandCDW13.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.logPageVersionNumber.hashCode()
        result = 31 * result + this.logPageGUID.hashCode()
        return result
    }
}

public data class NvmeWcsDeviceResetAction(
    public var anonymous: NvmeWcsDeviceResetAction0 = NvmeWcsDeviceResetAction0(),
)

public data class NvmeWcsDeviceResetAction0(
    public var anonymous: NvmeWcsDeviceResetAction00 = NvmeWcsDeviceResetAction00(),
    public var asUCHAR: UByte = 0u,
)

public data class NvmeWcsDeviceResetAction00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceResetAction00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceResetAction00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeWcsDeviceResetAction00 =
                    NvmeWcsDeviceResetAction00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeWcsDeviceResetAction00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeWcsDeviceSmartAttributesLog(
    public var versionSpecificData: UByteArray = UByteArray(494),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeWcsDeviceSmartAttributesLog) return false
        if (!this.versionSpecificData.contentEquals(other.versionSpecificData)) return false
        if (this.logPageVersionNumber != other.logPageVersionNumber) return false
        if (this.logPageGUID != other.logPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.versionSpecificData.contentHashCode()
        result = 31 * result + this.logPageVersionNumber.hashCode()
        result = 31 * result + this.logPageGUID.hashCode()
        return result
    }
}

public class NvmeWcsDeviceSmartAttributesLogV2(
    public var mediaUnitsWritten: UByteArray = UByteArray(16),
    public var mediaUnitsRead: UByteArray = UByteArray(16),
    public var badUserNANDBlockCount: NvmeWcsDeviceSmartAttributesLogV20 = NvmeWcsDeviceSmartAttributesLogV20(),
    public var badSystemNANDBlockCount: NvmeWcsDeviceSmartAttributesLogV21 = NvmeWcsDeviceSmartAttributesLogV21(),
    public var xORRecoveryCount: ULong = 0uL,
    public var unrecoverableReadErrorCount: ULong = 0uL,
    public var softECCErrorCount: ULong = 0uL,
    public var endToEndCorrectionCounts: NvmeWcsDeviceSmartAttributesLogV22 = NvmeWcsDeviceSmartAttributesLogV22(),
    public var percentageSystemDataUsed: UByte = 0u,
    public var refreshCount: UByteArray = UByteArray(7),
    public var userDataEraseCounts: NvmeWcsDeviceSmartAttributesLogV23 = NvmeWcsDeviceSmartAttributesLogV23(),
    public var thermalThrottling: NvmeWcsDeviceSmartAttributesLogV24 = NvmeWcsDeviceSmartAttributesLogV24(),
    public var reserved0: UByteArray = UByteArray(6),
    public var pCIeCorrectableErrorCount: ULong = 0uL,
    public var incompleteShutdownCount: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var percentageFreeBlocks: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
    public var capacitorHealth: UShort = 0u,
    public var reserved3: UByteArray = UByteArray(6),
    public var unalignedIOCount: ULong = 0uL,
    public var securityVersionNumber: ULong = 0uL,
    public var nuse: ULong = 0uL,
    public var pLPStartCount: UByteArray = UByteArray(16),
    public var enduranceEstimate: UByteArray = UByteArray(16),
    public var reserved4: UByteArray = UByteArray(302),
    public var logPageVersionNumber: UShort = 0u,
    public var logPageGUID: Guid = Guid(),
)

public data class NvmeWcsDeviceSmartAttributesLogV21(
    public var rawCount: UByteArray = UByteArray(6),
    public var normalized: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeWcsDeviceSmartAttributesLogV21) return false
        if (!this.rawCount.contentEquals(other.rawCount)) return false
        if (!this.normalized.contentEquals(other.normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawCount.contentHashCode()
        result = 31 * result + this.normalized.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV21> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV21> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeWcsDeviceSmartAttributesLogV21 =
                    NvmeWcsDeviceSmartAttributesLogV21(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NvmeWcsDeviceSmartAttributesLogV21) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.rawCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.normalized)
                }
            }
    }
}

public data class NvmeWcsDeviceSmartAttributesLogV20(
    public var rawCount: UByteArray = UByteArray(6),
    public var normalized: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeWcsDeviceSmartAttributesLogV20) return false
        if (!this.rawCount.contentEquals(other.rawCount)) return false
        if (!this.normalized.contentEquals(other.normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawCount.contentHashCode()
        result = 31 * result + this.normalized.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV20> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeWcsDeviceSmartAttributesLogV20 =
                    NvmeWcsDeviceSmartAttributesLogV20(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: NvmeWcsDeviceSmartAttributesLogV20) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.rawCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.normalized)
                }
            }
    }
}

public data class NvmeWcsDeviceSmartAttributesLogV22(
    public var detectedCounts: UInt = 0u,
    public var correctedCounts: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV22> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV22> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeWcsDeviceSmartAttributesLogV22 =
                    NvmeWcsDeviceSmartAttributesLogV22(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeWcsDeviceSmartAttributesLogV22) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.detectedCounts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.correctedCounts)
                }
            }
    }
}

public data class NvmeWcsDeviceSmartAttributesLogV24(
    public var eventCount: UByte = 0u,
    public var status: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV24> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV24> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeWcsDeviceSmartAttributesLogV24 =
                    NvmeWcsDeviceSmartAttributesLogV24(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: NvmeWcsDeviceSmartAttributesLogV24) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.eventCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.status)
                }
            }
    }
}

public data class NvmeWcsDeviceSmartAttributesLogV23(
    public var maximumCount: UInt = 0u,
    public var minimumCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV23> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeWcsDeviceSmartAttributesLogV23> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeWcsDeviceSmartAttributesLogV23 =
                    NvmeWcsDeviceSmartAttributesLogV23(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NvmeWcsDeviceSmartAttributesLogV23) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumCount)
                }
            }
    }
}

public data class NvmeZoneDescriptor(
    public var anonymous1: NvmeZoneDescriptor0 = NvmeZoneDescriptor0(),
    public var anonymous2: NvmeZoneDescriptor1 = NvmeZoneDescriptor1(),
    public var za: NvmeZoneDescriptor2 = NvmeZoneDescriptor2(),
    public var reserved3: UByteArray = UByteArray(5),
    public var zcap: ULong = 0uL,
    public var zslba: ULong = 0uL,
    public var writePointer: ULong = 0uL,
    public var reserved4: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeZoneDescriptor) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.za != other.za) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (this.zcap != other.zcap) return false
        if (this.zslba != other.zslba) return false
        if (this.writePointer != other.writePointer) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.za.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.zcap.hashCode()
        result = 31 * result + this.zslba.hashCode()
        result = 31 * result + this.writePointer.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeZoneDescriptor =
                    NvmeZoneDescriptor(
                        (NvmeZoneDescriptor0.typeLayout()).readNative(addr),
                        (NvmeZoneDescriptor1.typeLayout()).readNative(addr + 1L),
                        (NvmeZoneDescriptor2.typeLayout()).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NvmeZoneDescriptor) {
                    (NvmeZoneDescriptor0.typeLayout()).writeNative(addr, value.anonymous1)
                    (NvmeZoneDescriptor1.typeLayout()).writeNative(addr + 1L, value.anonymous2)
                    (NvmeZoneDescriptor2.typeLayout()).writeNative(addr + 2L, value.za)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 3L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.zcap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.zslba)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.writePointer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 32L, value.reserved4)
                }
            }
    }
}

public data class NvmeZoneDescriptor0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeZoneDescriptor0 =
                    NvmeZoneDescriptor0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeZoneDescriptor0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeZoneDescriptor1(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor1> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeZoneDescriptor1 =
                    NvmeZoneDescriptor1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeZoneDescriptor1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeZoneDescriptor2(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptor2> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeZoneDescriptor2 =
                    NvmeZoneDescriptor2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeZoneDescriptor2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmeZoneDescriptorExtension(
    public var zoneDescriptorExtensionInfo: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmeZoneDescriptorExtension) return false
        if (!this.zoneDescriptorExtensionInfo.contentEquals(other.zoneDescriptorExtensionInfo)) return false
        return true
    }

    override fun hashCode(): Int = this.zoneDescriptorExtensionInfo.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptorExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneDescriptorExtension> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmeZoneDescriptorExtension =
                    NvmeZoneDescriptorExtension(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmeZoneDescriptorExtension) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr, value.zoneDescriptorExtensionInfo)
                }
            }
    }
}

public data class NvmeZoneExtendedReportZoneDesc(
    public var zoneDescriptor: NvmeZoneDescriptor = NvmeZoneDescriptor(),
    public var zoneDescriptorExtension: List<NvmeZoneDescriptorExtension> = List(1) { NvmeZoneDescriptorExtension() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneExtendedReportZoneDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmeZoneExtendedReportZoneDesc> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NvmeZoneExtendedReportZoneDesc =
                    NvmeZoneExtendedReportZoneDesc(
                        (NvmeZoneDescriptor.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeZoneDescriptorExtension.typeLayout(), (1).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: NvmeZoneExtendedReportZoneDesc) {
                    (NvmeZoneDescriptor.typeLayout()).writeNative(addr, value.zoneDescriptor)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeZoneDescriptorExtension.typeLayout(), (1).toInt())
                    ).writeNative(addr + 64L, value.zoneDescriptorExtension)
                }
            }
    }
}

public data class NvmReservationCapabilities(
    public var anonymous: NvmReservationCapabilities0 = NvmReservationCapabilities0(),
    public var asUchar: UByte = 0u,
)

public data class NvmReservationCapabilities0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmReservationCapabilities0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmReservationCapabilities0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NvmReservationCapabilities0 =
                    NvmReservationCapabilities0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvmReservationCapabilities0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NvmSetList(
    public var identifierCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(127),
    public var entry: List<NvmeSetAttributesEntry> = List(1) { NvmeSetAttributesEntry() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvmSetList) return false
        if (this.identifierCount != other.identifierCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.entry != other.entry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.identifierCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.entry.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmSetList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvmSetList> {
                override val sizeBytes: Long = 256L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NvmSetList =
                    NvmSetList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (127).toInt())
                        ).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvmeSetAttributesEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: NvmSetList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.identifierCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (127).toInt())
                    ).writeNative(addr + 1L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvmeSetAttributesEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 128L, value.entry)
                }
            }
    }
}

public data class TcgActivateMethodSpecific(
    public var rangeStartLengthPolicy: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgActivateMethodSpecific> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgActivateMethodSpecific> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgActivateMethodSpecific =
                    TcgActivateMethodSpecific(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcgActivateMethodSpecific) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.rangeStartLengthPolicy)
                }
            }
    }
}

public data class TcgAssignMethodSpecific(
    public var namespaceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgAssignMethodSpecific> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgAssignMethodSpecific> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgAssignMethodSpecific =
                    TcgAssignMethodSpecific(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcgAssignMethodSpecific) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.namespaceId)
                }
            }
    }
}

public data class TcgAuthMethodSpecific(
    public var authorityId: ULong = 0uL,
    public var triesCount: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgAuthMethodSpecific> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgAuthMethodSpecific> {
                override val sizeBytes: Long = 9L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgAuthMethodSpecific =
                    TcgAuthMethodSpecific(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TcgAuthMethodSpecific) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.authorityId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.triesCount)
                }
            }
    }
}

public data class TcgBlocksidMethodSpecific(
    public var clearEvents: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgBlocksidMethodSpecific> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgBlocksidMethodSpecific> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgBlocksidMethodSpecific =
                    TcgBlocksidMethodSpecific(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcgBlocksidMethodSpecific) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.clearEvents)
                }
            }
    }
}

public data class TcgHistoryEntry(
    public var versionNumber: UByte = 0u,
    public var entryLength: UByte = 0u,
    public var powerCycleCount: UShort = 0u,
    public var tcgCommandCount: UInt = 0u,
    public var tcgCommandCompletionTS: ULong = 0uL,
    public var invokingId: ULong = 0uL,
    public var methodId: ULong = 0uL,
    public var comId: UShort = 0u,
    public var protocolId: UByte = 0u,
    public var tcgStatus: UByte = 0u,
    public var processTime: UShort = 0u,
    public var commandSpecific: UByteArray = UByteArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcgHistoryEntry) return false
        if (this.versionNumber != other.versionNumber) return false
        if (this.entryLength != other.entryLength) return false
        if (this.powerCycleCount != other.powerCycleCount) return false
        if (this.tcgCommandCount != other.tcgCommandCount) return false
        if (this.tcgCommandCompletionTS != other.tcgCommandCompletionTS) return false
        if (this.invokingId != other.invokingId) return false
        if (this.methodId != other.methodId) return false
        if (this.comId != other.comId) return false
        if (this.protocolId != other.protocolId) return false
        if (this.tcgStatus != other.tcgStatus) return false
        if (this.processTime != other.processTime) return false
        if (!this.commandSpecific.contentEquals(other.commandSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.versionNumber.hashCode()
        result = 31 * result + this.entryLength.hashCode()
        result = 31 * result + this.powerCycleCount.hashCode()
        result = 31 * result + this.tcgCommandCount.hashCode()
        result = 31 * result + this.tcgCommandCompletionTS.hashCode()
        result = 31 * result + this.invokingId.hashCode()
        result = 31 * result + this.methodId.hashCode()
        result = 31 * result + this.comId.hashCode()
        result = 31 * result + this.protocolId.hashCode()
        result = 31 * result + this.tcgStatus.hashCode()
        result = 31 * result + this.processTime.hashCode()
        result = 31 * result + this.commandSpecific.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgHistoryEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgHistoryEntry> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgHistoryEntry =
                    TcgHistoryEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 35L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                        ).readNative(addr + 38L),
                    )
                override fun writeNative(addr: Long, value: TcgHistoryEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.versionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.entryLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.powerCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tcgCommandCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tcgCommandCompletionTS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.invokingId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.methodId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.comId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 34L, value.protocolId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 35L, value.tcgStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.processTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (10).toInt())
                    ).writeNative(addr + 38L, value.commandSpecific)
                }
            }
    }
}

public data class TcgReactivateMethodSpecific(
    public var rangeStartLengthPolicy: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgReactivateMethodSpecific> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcgReactivateMethodSpecific> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): TcgReactivateMethodSpecific =
                    TcgReactivateMethodSpecific(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcgReactivateMethodSpecific) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.rangeStartLengthPolicy)
                }
            }
    }
}

public data class UnsupportedRequirement(
    public var reqId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnsupportedRequirement) return false
        if (!this.reqId.contentEquals(other.reqId)) return false
        return true
    }

    override fun hashCode(): Int = this.reqId.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnsupportedRequirement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnsupportedRequirement> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): UnsupportedRequirement =
                    UnsupportedRequirement(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UnsupportedRequirement) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.reqId)
                }
            }
    }
}
