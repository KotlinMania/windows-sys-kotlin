@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.nvme

import io.github.kotlinmania.windowssys.core.Guid

public data class NvmeErrorInjectionEntry00(
    public var bitfield: UByte = 0u,
)

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
}

public data class NvmeFirmwareSlotInfoLog0(
    public var bitfield: UByte = 0u,
)

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
)

public data class NvmeHostMemoryBufferDescriptorEntry(
    public var badd: ULong = 0uL,
    public var bsize: UInt = 0u,
    public var reserved: UInt = 0u,
)

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
}

public data class NvmeIdentifyControllerData12(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData8(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData7(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData0(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData14(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData2(
    public var bitfield: UInt = 0u,
)

public data class NvmeIdentifyControllerData17(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData5(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData16(
    public var bitfield: UShort = 0u,
)

public data class NvmeIdentifyControllerData10(
    public var bitfield: UShort = 0u,
)

public data class NvmeIdentifyControllerData6(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData19(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData20(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData4(
    public var bitfield: UShort = 0u,
)

public data class NvmeIdentifyControllerData1(
    public var bitfield: UInt = 0u,
)

public data class NvmeIdentifyControllerData15(
    public var bitfield: UShort = 0u,
)

public data class NvmeIdentifyControllerData9(
    public var bitfield: UInt = 0u,
)

public data class NvmeIdentifyControllerData3(
    public var bitfield: UShort = 0u,
)

public data class NvmeIdentifyControllerData11(
    public var bitfield: UInt = 0u,
)

public data class NvmeIdentifyControllerData21(
    public var bitfield: UInt = 0u,
)

public data class NvmeIdentifyControllerData13(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyControllerData18(
    public var bitfield: UByte = 0u,
)

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
)

public data class NvmeIdentifyNamespaceData3(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyNamespaceData4(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyNamespaceData1(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyNamespaceData6(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyNamespaceData2(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyNamespaceData5(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyNamespaceData8(
    public var bitfield: UByte = 0u,
)

public data class NvmeIdentifyNamespaceData0(
    public var bitfield: UByte = 0u,
)

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
}

public data class NvmeIdentifySpecificNamespaceIoCommandSet1(
    public var bitfield: UShort = 0u,
)

public data class NvmeIdentifySpecificNamespaceIoCommandSet0(
    public var bitfield: UShort = 0u,
)

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
}

public data class NvmeLbaFormat(
    public var anonymous: NvmeLbaFormat0 = NvmeLbaFormat0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeLbaFormat0(
    public var ms: UShort = 0u,
    public var lbads: UByte = 0u,
    public var bitfield: UByte = 0u,
)

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
}

public data class NvmeLbaRangetTypeEntry0(
    public var bitfield: UByte = 0u,
)

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
}

public data class NvmeNvmSubsystemReset(
    public var nssrc: UInt = 0u,
)

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
)

public data class NvmeOcpDeviceCapabilitiesLog5(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog50 = NvmeOcpDeviceCapabilitiesLog50(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog50(
    public var bitfield: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog0(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog00 = NvmeOcpDeviceCapabilitiesLog00(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog00(
    public var bitfield: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog2(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog20 = NvmeOcpDeviceCapabilitiesLog20(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog20(
    public var bitfield: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog4(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog40 = NvmeOcpDeviceCapabilitiesLog40(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog40(
    public var bitfield: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog1(
    public var anonymous: NvmeOcpDeviceCapabilitiesLog10 = NvmeOcpDeviceCapabilitiesLog10(),
    public var asUshort: UShort = 0u,
)

public data class NvmeOcpDeviceCapabilitiesLog10(
    public var bitfield: UShort = 0u,
)

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
)

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
}

public data class NvmeOcpDeviceSmartInformationLogV32(
    public var detectedCounts: UInt = 0u,
    public var correctedCounts: UInt = 0u,
)

public data class NvmeOcpDeviceSmartInformationLogV34(
    public var eventCount: UByte = 0u,
    public var status: UByte = 0u,
)

public data class NvmeOcpDeviceSmartInformationLogV33(
    public var maximumCount: UInt = 0u,
    public var minimumCount: UInt = 0u,
)

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
)

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
)

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
}

public data class NvmePrpEntry(
    public var anonymous: NvmePrpEntry0 = NvmePrpEntry0(),
    public var asUlonglong: ULong = 0uL,
)

public data class NvmePrpEntry0(
    public var bitfield: ULong = 0uL,
)

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
}

public data class NvmeRegisteredControllerData0(
    public var bitfield: UByte = 0u,
)

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
}

public data class NvmeRegisteredControllerExtendedData0(
    public var bitfield: UByte = 0u,
)

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
}

public data class NvmeReservationAcquireDataStructure(
    public var crkey: ULong = 0uL,
    public var prkey: ULong = 0uL,
)

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
}

public data class NvmeReservationRegisterDataStructure(
    public var crkey: ULong = 0uL,
    public var nrkey: ULong = 0uL,
)

public data class NvmeReservationReleaseDataStructure(
    public var crkey: ULong = 0uL,
)

public data class NvmeReservationReportStatusDataStructure(
    public var header: NvmeReservationReportStatusHeader = NvmeReservationReportStatusHeader(),
    public var registeredControllersData: List<NvmeRegisteredControllerData> = List(1) { NvmeRegisteredControllerData() },
)

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
}

public data class NvmeSanitizeStatus(
    public var bitfield: UShort = 0u,
)

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
}

public data class NvmeSubmissionQueueTailDoorbell(
    public var anonymous: NvmeSubmissionQueueTailDoorbell0 = NvmeSubmissionQueueTailDoorbell0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeSubmissionQueueTailDoorbell0(
    public var bitfield: UInt = 0u,
)

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
}

public data class NvmeVersion(
    public var anonymous: NvmeVersion0 = NvmeVersion0(),
    public var asUlong: UInt = 0u,
)

public data class NvmeVersion0(
    public var bitfield: UInt = 0u,
)

public data class NvmeWcsDeviceCapabilities(
    public var anonymous: NvmeWcsDeviceCapabilities0 = NvmeWcsDeviceCapabilities0(),
)

public data class NvmeWcsDeviceCapabilities0(
    public var anonymous: NvmeWcsDeviceCapabilities00 = NvmeWcsDeviceCapabilities00(),
    public var asULONG: UInt = 0u,
)

public data class NvmeWcsDeviceCapabilities00(
    public var bitfield: UInt = 0u,
)

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
)

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
}

public data class NvmeWcsDeviceSmartAttributesLogV22(
    public var detectedCounts: UInt = 0u,
    public var correctedCounts: UInt = 0u,
)

public data class NvmeWcsDeviceSmartAttributesLogV24(
    public var eventCount: UByte = 0u,
    public var status: UByte = 0u,
)

public data class NvmeWcsDeviceSmartAttributesLogV23(
    public var maximumCount: UInt = 0u,
    public var minimumCount: UInt = 0u,
)

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
}

public data class NvmeZoneDescriptor0(
    public var bitfield: UByte = 0u,
)

public data class NvmeZoneDescriptor1(
    public var bitfield: UByte = 0u,
)

public data class NvmeZoneDescriptor2(
    public var bitfield: UByte = 0u,
)

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
}

public data class NvmeZoneExtendedReportZoneDesc(
    public var zoneDescriptor: NvmeZoneDescriptor = NvmeZoneDescriptor(),
    public var zoneDescriptorExtension: List<NvmeZoneDescriptorExtension> = List(1) { NvmeZoneDescriptorExtension() },
)

public data class NvmReservationCapabilities(
    public var anonymous: NvmReservationCapabilities0 = NvmReservationCapabilities0(),
    public var asUchar: UByte = 0u,
)

public data class NvmReservationCapabilities0(
    public var bitfield: UByte = 0u,
)

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
}

public data class TcgActivateMethodSpecific(
    public var rangeStartLengthPolicy: UByte = 0u,
)

public data class TcgAssignMethodSpecific(
    public var namespaceId: UInt = 0u,
)

public data class TcgAuthMethodSpecific(
    public var authorityId: ULong = 0uL,
    public var triesCount: UByte = 0u,
)

public data class TcgBlocksidMethodSpecific(
    public var clearEvents: UByte = 0u,
)

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
}

public data class TcgReactivateMethodSpecific(
    public var rangeStartLengthPolicy: UByte = 0u,
)

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
}
