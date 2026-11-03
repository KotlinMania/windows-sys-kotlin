@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.nvme

import io.github.kotlinmania.windowssys.core.GUID

public data class NVME_ERROR_INJECTION_ENTRY_0_0(public var _bitfield: UByte = 0u)

public data class NVME_EXTENDED_REPORT_ZONE_INFO(
    public var ZoneCount: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(7),
    public var Desc: List<NVME_ZONE_EXTENDED_REPORT_ZONE_DESC> = List(1) { NVME_ZONE_EXTENDED_REPORT_ZONE_DESC() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_EXTENDED_REPORT_ZONE_INFO) return false
        if (this.ZoneCount != other.ZoneCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Desc != other.Desc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ZoneCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Desc.hashCode()
        return result
    }
}

public data class NVME_FEATURE_HOST_IDENTIFIER_DATA(public var HOSTID: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_FEATURE_HOST_IDENTIFIER_DATA) return false
        if (!this.HOSTID.contentEquals(other.HOSTID)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.HOSTID.contentHashCode()
    }
}

public data class NVME_FEATURE_HOST_METADATA_DATA(
    public var NumberOfMetadataElementDescriptors: UByte = 0u,
    public var Reserved0: UByte = 0u,
    public var MetadataElementDescriptors: UByteArray = UByteArray(4094),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_FEATURE_HOST_METADATA_DATA) return false
        if (this.NumberOfMetadataElementDescriptors != other.NumberOfMetadataElementDescriptors) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (!this.MetadataElementDescriptors.contentEquals(other.MetadataElementDescriptors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumberOfMetadataElementDescriptors.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.MetadataElementDescriptors.contentHashCode()
        return result
    }
}

public data class NVME_FIRMWARE_SLOT_INFO_LOG(
    public var AFI: NVME_FIRMWARE_SLOT_INFO_LOG_0 = NVME_FIRMWARE_SLOT_INFO_LOG_0(),
    public var Reserved0: UByteArray = UByteArray(7),
    public var FRS: ULongArray = ULongArray(7),
    public var Reserved1: UByteArray = UByteArray(448),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_FIRMWARE_SLOT_INFO_LOG) return false
        if (this.AFI != other.AFI) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.FRS.contentEquals(other.FRS)) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AFI.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.FRS.contentHashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_FIRMWARE_SLOT_INFO_LOG_0(public var _bitfield: UByte = 0u)

public class NVME_HEALTH_INFO_LOG(
    public var CriticalWarning: NVME_HEALTH_INFO_LOG_0 = NVME_HEALTH_INFO_LOG_0(),
    public var Temperature: UByteArray = UByteArray(2),
    public var AvailableSpare: UByte = 0u,
    public var AvailableSpareThreshold: UByte = 0u,
    public var PercentageUsed: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(26),
    public var DataUnitRead: UByteArray = UByteArray(16),
    public var DataUnitWritten: UByteArray = UByteArray(16),
    public var HostReadCommands: UByteArray = UByteArray(16),
    public var HostWrittenCommands: UByteArray = UByteArray(16),
    public var ControllerBusyTime: UByteArray = UByteArray(16),
    public var PowerCycle: UByteArray = UByteArray(16),
    public var PowerOnHours: UByteArray = UByteArray(16),
    public var UnsafeShutdowns: UByteArray = UByteArray(16),
    public var MediaErrors: UByteArray = UByteArray(16),
    public var ErrorInfoLogEntryCount: UByteArray = UByteArray(16),
    public var WarningCompositeTemperatureTime: UInt = 0u,
    public var CriticalCompositeTemperatureTime: UInt = 0u,
    public var TemperatureSensor1: UShort = 0u,
    public var TemperatureSensor2: UShort = 0u,
    public var TemperatureSensor3: UShort = 0u,
    public var TemperatureSensor4: UShort = 0u,
    public var TemperatureSensor5: UShort = 0u,
    public var TemperatureSensor6: UShort = 0u,
    public var TemperatureSensor7: UShort = 0u,
    public var TemperatureSensor8: UShort = 0u,
    public var Reserved1: UByteArray = UByteArray(296),
)

public data class NVME_HEALTH_INFO_LOG_0(public var Anonymous: NVME_HEALTH_INFO_LOG_0_0 = NVME_HEALTH_INFO_LOG_0_0(), public var AsUchar: UByte = 0u)

public data class NVME_HEALTH_INFO_LOG_0_0(public var _bitfield: UByte = 0u)

public data class NVME_HOST_MEMORY_BUFFER_DESCRIPTOR_ENTRY(
    public var BADD: ULong = 0uL,
    public var BSIZE: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class NVME_HOST_METADATA_ELEMENT_DESCRIPTOR(public var _bitfield: UInt = 0u, public var EVAL: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_HOST_METADATA_ELEMENT_DESCRIPTOR) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.EVAL.contentEquals(other.EVAL)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.EVAL.contentHashCode()
        return result
    }
}

public class NVME_IDENTIFY_CONTROLLER_DATA {
    public var VID: UShort = 0u

    public var SSVID: UShort = 0u

    public var SN: UByteArray = UByteArray(20)

    public var MN: UByteArray = UByteArray(40)

    public var FR: UByteArray = UByteArray(8)

    public var RAB: UByte = 0u

    public var IEEE: UByteArray = UByteArray(3)

    public var CMIC: NVME_IDENTIFY_CONTROLLER_DATA_0 = NVME_IDENTIFY_CONTROLLER_DATA_0()

    public var MDTS: UByte = 0u

    public var CNTLID: UShort = 0u

    public var VER: UInt = 0u

    public var RTD3R: UInt = 0u

    public var RTD3E: UInt = 0u

    public var OAES: NVME_IDENTIFY_CONTROLLER_DATA_1 = NVME_IDENTIFY_CONTROLLER_DATA_1()

    public var CTRATT: NVME_IDENTIFY_CONTROLLER_DATA_2 = NVME_IDENTIFY_CONTROLLER_DATA_2()

    public var RRLS: NVME_IDENTIFY_CONTROLLER_DATA_3 = NVME_IDENTIFY_CONTROLLER_DATA_3()

    public var Reserved0: UByteArray = UByteArray(9)

    public var CNTRLTYPE: UByte = 0u

    public var FGUID: UByteArray = UByteArray(16)

    public var CRDT1: UShort = 0u

    public var CRDT2: UShort = 0u

    public var CRDT3: UShort = 0u

    public var Reserved0_1: UByteArray = UByteArray(106)

    public var ReservedForManagement: UByteArray = UByteArray(16)

    public var OACS: NVME_IDENTIFY_CONTROLLER_DATA_4 = NVME_IDENTIFY_CONTROLLER_DATA_4()

    public var ACL: UByte = 0u

    public var AERL: UByte = 0u

    public var FRMW: NVME_IDENTIFY_CONTROLLER_DATA_5 = NVME_IDENTIFY_CONTROLLER_DATA_5()

    public var LPA: NVME_IDENTIFY_CONTROLLER_DATA_6 = NVME_IDENTIFY_CONTROLLER_DATA_6()

    public var ELPE: UByte = 0u

    public var NPSS: UByte = 0u

    public var AVSCC: NVME_IDENTIFY_CONTROLLER_DATA_7 = NVME_IDENTIFY_CONTROLLER_DATA_7()

    public var APSTA: NVME_IDENTIFY_CONTROLLER_DATA_8 = NVME_IDENTIFY_CONTROLLER_DATA_8()

    public var WCTEMP: UShort = 0u

    public var CCTEMP: UShort = 0u

    public var MTFA: UShort = 0u

    public var HMPRE: UInt = 0u

    public var HMMIN: UInt = 0u

    public var TNVMCAP: UByteArray = UByteArray(16)

    public var UNVMCAP: UByteArray = UByteArray(16)

    public var RPMBS: NVME_IDENTIFY_CONTROLLER_DATA_9 = NVME_IDENTIFY_CONTROLLER_DATA_9()

    public var EDSTT: UShort = 0u

    public var DSTO: UByte = 0u

    public var FWUG: UByte = 0u

    public var KAS: UShort = 0u

    public var HCTMA: NVME_IDENTIFY_CONTROLLER_DATA_10 = NVME_IDENTIFY_CONTROLLER_DATA_10()

    public var MNTMT: UShort = 0u

    public var MXTMT: UShort = 0u

    public var SANICAP: NVME_IDENTIFY_CONTROLLER_DATA_11 = NVME_IDENTIFY_CONTROLLER_DATA_11()

    public var HMMINDS: UInt = 0u

    public var HMMAXD: UShort = 0u

    public var NSETIDMAX: UShort = 0u

    public var ENDGIDMAX: UShort = 0u

    public var ANATT: UByte = 0u

    public var ANACAP: NVME_IDENTIFY_CONTROLLER_DATA_12 = NVME_IDENTIFY_CONTROLLER_DATA_12()

    public var ANAGRPMAX: UInt = 0u

    public var NANAGRPID: UInt = 0u

    public var PELS: UInt = 0u

    public var Reserved1: UByteArray = UByteArray(156)

    public var SQES: NVME_IDENTIFY_CONTROLLER_DATA_13 = NVME_IDENTIFY_CONTROLLER_DATA_13()

    public var CQES: NVME_IDENTIFY_CONTROLLER_DATA_14 = NVME_IDENTIFY_CONTROLLER_DATA_14()

    public var MAXCMD: UShort = 0u

    public var NN: UInt = 0u

    public var ONCS: NVME_IDENTIFY_CONTROLLER_DATA_15 = NVME_IDENTIFY_CONTROLLER_DATA_15()

    public var FUSES: NVME_IDENTIFY_CONTROLLER_DATA_16 = NVME_IDENTIFY_CONTROLLER_DATA_16()

    public var FNA: NVME_IDENTIFY_CONTROLLER_DATA_17 = NVME_IDENTIFY_CONTROLLER_DATA_17()

    public var VWC: NVME_IDENTIFY_CONTROLLER_DATA_18 = NVME_IDENTIFY_CONTROLLER_DATA_18()

    public var AWUN: UShort = 0u

    public var AWUPF: UShort = 0u

    public var NVSCC: NVME_IDENTIFY_CONTROLLER_DATA_19 = NVME_IDENTIFY_CONTROLLER_DATA_19()

    public var NWPC: NVME_IDENTIFY_CONTROLLER_DATA_20 = NVME_IDENTIFY_CONTROLLER_DATA_20()

    public var ACWU: UShort = 0u

    public var Reserved4: UByteArray = UByteArray(2)

    public var SGLS: NVME_IDENTIFY_CONTROLLER_DATA_21 = NVME_IDENTIFY_CONTROLLER_DATA_21()

    public var MNAN: UInt = 0u

    public var Reserved6: UByteArray = UByteArray(224)

    public var SUBNQN: UByteArray = UByteArray(256)

    public var Reserved7: UByteArray = UByteArray(768)

    public var Reserved8: UByteArray = UByteArray(256)

    public var PDS: List<NVME_POWER_STATE_DESC> = List(32) { NVME_POWER_STATE_DESC() }

    public var VS: UByteArray = UByteArray(1024)
}

public data class NVME_IDENTIFY_CONTROLLER_DATA_12(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_8(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_7(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_0(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_14(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_2(public var _bitfield: UInt = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_17(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_5(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_16(public var _bitfield: UShort = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_10(public var _bitfield: UShort = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_6(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_19(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_20(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_4(public var _bitfield: UShort = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_1(public var _bitfield: UInt = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_15(public var _bitfield: UShort = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_9(public var _bitfield: UInt = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_3(public var _bitfield: UShort = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_11(public var _bitfield: UInt = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_21(public var _bitfield: UInt = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_13(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_CONTROLLER_DATA_18(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_IO_COMMAND_SET(public var IOCommandSetVector: ULongArray = ULongArray(512)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_IDENTIFY_IO_COMMAND_SET) return false
        if (!this.IOCommandSetVector.contentEquals(other.IOCommandSetVector)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.IOCommandSetVector.contentHashCode()
    }
}

public class NVME_IDENTIFY_NAMESPACE_DATA(
    public var NSZE: ULong = 0uL,
    public var NCAP: ULong = 0uL,
    public var NUSE: ULong = 0uL,
    public var NSFEAT: NVME_IDENTIFY_NAMESPACE_DATA_0 = NVME_IDENTIFY_NAMESPACE_DATA_0(),
    public var NLBAF: UByte = 0u,
    public var FLBAS: NVME_IDENTIFY_NAMESPACE_DATA_1 = NVME_IDENTIFY_NAMESPACE_DATA_1(),
    public var MC: NVME_IDENTIFY_NAMESPACE_DATA_2 = NVME_IDENTIFY_NAMESPACE_DATA_2(),
    public var DPC: NVME_IDENTIFY_NAMESPACE_DATA_3 = NVME_IDENTIFY_NAMESPACE_DATA_3(),
    public var DPS: NVME_IDENTIFY_NAMESPACE_DATA_4 = NVME_IDENTIFY_NAMESPACE_DATA_4(),
    public var NMIC: NVME_IDENTIFY_NAMESPACE_DATA_5 = NVME_IDENTIFY_NAMESPACE_DATA_5(),
    public var RESCAP: NVM_RESERVATION_CAPABILITIES = NVM_RESERVATION_CAPABILITIES(),
    public var FPI: NVME_IDENTIFY_NAMESPACE_DATA_6 = NVME_IDENTIFY_NAMESPACE_DATA_6(),
    public var DLFEAT: NVME_IDENTIFY_NAMESPACE_DATA_7 = NVME_IDENTIFY_NAMESPACE_DATA_7(),
    public var NAWUN: UShort = 0u,
    public var NAWUPF: UShort = 0u,
    public var NACWU: UShort = 0u,
    public var NABSN: UShort = 0u,
    public var NABO: UShort = 0u,
    public var NABSPF: UShort = 0u,
    public var NOIOB: UShort = 0u,
    public var NVMCAP: UByteArray = UByteArray(16),
    public var NPWG: UShort = 0u,
    public var NPWA: UShort = 0u,
    public var NPDG: UShort = 0u,
    public var NPDA: UShort = 0u,
    public var NOWS: UShort = 0u,
    public var MSSRL: UShort = 0u,
    public var MCL: UInt = 0u,
    public var MSRC: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(11),
    public var ANAGRPID: UInt = 0u,
    public var Reserved3: UByteArray = UByteArray(3),
    public var NSATTR: NVME_IDENTIFY_NAMESPACE_DATA_8 = NVME_IDENTIFY_NAMESPACE_DATA_8(),
    public var NVMSETID: UShort = 0u,
    public var ENDGID: UShort = 0u,
    public var NGUID: UByteArray = UByteArray(16),
    public var EUI64: UByteArray = UByteArray(8),
    public var LBAF: List<NVME_LBA_FORMAT> = List(16) { NVME_LBA_FORMAT() },
    public var Reserved4: UByteArray = UByteArray(192),
    public var VS: UByteArray = UByteArray(3712),
)

public data class NVME_IDENTIFY_NAMESPACE_DATA_7(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_3(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_4(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_1(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_6(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_2(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_5(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_8(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DATA_0(public var _bitfield: UByte = 0u)

public data class NVME_IDENTIFY_NAMESPACE_DESCRIPTOR(
    public var NIDT: UByte = 0u,
    public var NIDL: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(2),
    public var NID: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_IDENTIFY_NAMESPACE_DESCRIPTOR) return false
        if (this.NIDT != other.NIDT) return false
        if (this.NIDL != other.NIDL) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.NID.contentEquals(other.NID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NIDT.hashCode()
        result = 31 * result + this.NIDL.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.NID.contentHashCode()
        return result
    }
}

public data class NVME_IDENTIFY_NVM_SPECIFIC_CONTROLLER_IO_COMMAND_SET(
    public var VSL: UByte = 0u,
    public var WZSL: UByte = 0u,
    public var WUSL: UByte = 0u,
    public var DMRL: UByte = 0u,
    public var DMRSL: UInt = 0u,
    public var DMSL: ULong = 0uL,
    public var Reserved: UByteArray = UByteArray(4080),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_IDENTIFY_NVM_SPECIFIC_CONTROLLER_IO_COMMAND_SET) return false
        if (this.VSL != other.VSL) return false
        if (this.WZSL != other.WZSL) return false
        if (this.WUSL != other.WUSL) return false
        if (this.DMRL != other.DMRL) return false
        if (this.DMRSL != other.DMRSL) return false
        if (this.DMSL != other.DMSL) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VSL.hashCode()
        result = 31 * result + this.WZSL.hashCode()
        result = 31 * result + this.WUSL.hashCode()
        result = 31 * result + this.DMRL.hashCode()
        result = 31 * result + this.DMRSL.hashCode()
        result = 31 * result + this.DMSL.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET(
    public var ZOC: NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_0 = NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_0(),
    public var OZCS: NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_1 = NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_1(),
    public var MAR: UInt = 0u,
    public var MOR: UInt = 0u,
    public var RRL: UInt = 0u,
    public var FRL: UInt = 0u,
    public var Reserved0: UByteArray = UByteArray(2796),
    public var LBAEF: List<NVME_LBA_ZONE_FORMAT> = List(16) { NVME_LBA_ZONE_FORMAT() },
    public var Reserved1: UByteArray = UByteArray(768),
    public var VS: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET) return false
        if (this.ZOC != other.ZOC) return false
        if (this.OZCS != other.OZCS) return false
        if (this.MAR != other.MAR) return false
        if (this.MOR != other.MOR) return false
        if (this.RRL != other.RRL) return false
        if (this.FRL != other.FRL) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.LBAEF != other.LBAEF) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.VS.contentEquals(other.VS)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ZOC.hashCode()
        result = 31 * result + this.OZCS.hashCode()
        result = 31 * result + this.MAR.hashCode()
        result = 31 * result + this.MOR.hashCode()
        result = 31 * result + this.RRL.hashCode()
        result = 31 * result + this.FRL.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.LBAEF.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.VS.contentHashCode()
        return result
    }
}

public data class NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_1(public var _bitfield: UShort = 0u)

public data class NVME_IDENTIFY_SPECIFIC_NAMESPACE_IO_COMMAND_SET_0(public var _bitfield: UShort = 0u)

public data class NVME_IDENTIFY_ZNS_SPECIFIC_CONTROLLER_IO_COMMAND_SET(public var ZASL: UByte = 0u, public var Reserved: UByteArray = UByteArray(4095)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_IDENTIFY_ZNS_SPECIFIC_CONTROLLER_IO_COMMAND_SET) return false
        if (this.ZASL != other.ZASL) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ZASL.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class NVME_LBA_FORMAT(public var Anonymous: NVME_LBA_FORMAT_0 = NVME_LBA_FORMAT_0(), public var AsUlong: UInt = 0u)

public data class NVME_LBA_FORMAT_0(
    public var MS: UShort = 0u,
    public var LBADS: UByte = 0u,
    public var _bitfield: UByte = 0u,
)

public data class NVME_LBA_RANGE(
    public var Attributes: NVME_CONTEXT_ATTRIBUTES = NVME_CONTEXT_ATTRIBUTES(),
    public var LogicalBlockCount: UInt = 0u,
    public var StartingLBA: ULong = 0uL,
)

public data class NVME_LBA_RANGET_TYPE_ENTRY(
    public var Type: UByte = 0u,
    public var Attributes: NVME_LBA_RANGET_TYPE_ENTRY_0 = NVME_LBA_RANGET_TYPE_ENTRY_0(),
    public var Reserved0: UByteArray = UByteArray(14),
    public var SLBA: ULong = 0uL,
    public var NLB: ULong = 0uL,
    public var GUID: UByteArray = UByteArray(16),
    public var Reserved1: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_LBA_RANGET_TYPE_ENTRY) return false
        if (this.Type != other.Type) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.SLBA != other.SLBA) return false
        if (this.NLB != other.NLB) return false
        if (!this.GUID.contentEquals(other.GUID)) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.SLBA.hashCode()
        result = 31 * result + this.NLB.hashCode()
        result = 31 * result + this.GUID.contentHashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_LBA_RANGET_TYPE_ENTRY_0(public var _bitfield: UByte = 0u)

public data class NVME_LBA_ZONE_FORMAT(
    public var ZoneSize: ULong = 0uL,
    public var ZDES: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_LBA_ZONE_FORMAT) return false
        if (this.ZoneSize != other.ZoneSize) return false
        if (this.ZDES != other.ZDES) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ZoneSize.hashCode()
        result = 31 * result + this.ZDES.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class NVME_NVM_SUBSYSTEM_RESET(public var NSSRC: UInt = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG(
    public var PciePorts: UShort = 0u,
    public var OobMgmtSupport: NVME_OCP_DEVICE_CAPABILITIES_LOG_0 = NVME_OCP_DEVICE_CAPABILITIES_LOG_0(),
    public var WriteZeroesCommand: NVME_OCP_DEVICE_CAPABILITIES_LOG_1 = NVME_OCP_DEVICE_CAPABILITIES_LOG_1(),
    public var SanitizeCommand: NVME_OCP_DEVICE_CAPABILITIES_LOG_2 = NVME_OCP_DEVICE_CAPABILITIES_LOG_2(),
    public var DatasetMgmtCommand: NVME_OCP_DEVICE_CAPABILITIES_LOG_3 = NVME_OCP_DEVICE_CAPABILITIES_LOG_3(),
    public var WriteUncorrectableCommand: NVME_OCP_DEVICE_CAPABILITIES_LOG_4 = NVME_OCP_DEVICE_CAPABILITIES_LOG_4(),
    public var FusedCommand: NVME_OCP_DEVICE_CAPABILITIES_LOG_5 = NVME_OCP_DEVICE_CAPABILITIES_LOG_5(),
    public var MinimumValidDSSDPowerState: UShort = 0u,
    public var Reserved0: UByte = 0u,
    public var DssdDescriptors: List<DSSD_POWER_STATE_DESCRIPTOR> = List(127) { DSSD_POWER_STATE_DESCRIPTOR() },
    public var Reserved1: UByteArray = UByteArray(3934),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_OCP_DEVICE_CAPABILITIES_LOG) return false
        if (this.PciePorts != other.PciePorts) return false
        if (this.OobMgmtSupport != other.OobMgmtSupport) return false
        if (this.WriteZeroesCommand != other.WriteZeroesCommand) return false
        if (this.SanitizeCommand != other.SanitizeCommand) return false
        if (this.DatasetMgmtCommand != other.DatasetMgmtCommand) return false
        if (this.WriteUncorrectableCommand != other.WriteUncorrectableCommand) return false
        if (this.FusedCommand != other.FusedCommand) return false
        if (this.MinimumValidDSSDPowerState != other.MinimumValidDSSDPowerState) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.DssdDescriptors != other.DssdDescriptors) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.LogPageVersionNumber != other.LogPageVersionNumber) return false
        if (this.LogPageGUID != other.LogPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PciePorts.hashCode()
        result = 31 * result + this.OobMgmtSupport.hashCode()
        result = 31 * result + this.WriteZeroesCommand.hashCode()
        result = 31 * result + this.SanitizeCommand.hashCode()
        result = 31 * result + this.DatasetMgmtCommand.hashCode()
        result = 31 * result + this.WriteUncorrectableCommand.hashCode()
        result = 31 * result + this.FusedCommand.hashCode()
        result = 31 * result + this.MinimumValidDSSDPowerState.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.DssdDescriptors.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.LogPageVersionNumber.hashCode()
        result = 31 * result + this.LogPageGUID.hashCode()
        return result
    }
}

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_3(public var Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_3_0 = NVME_OCP_DEVICE_CAPABILITIES_LOG_3_0(), public var AsUshort: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_3_0(public var _bitfield: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_5(public var Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_5_0 = NVME_OCP_DEVICE_CAPABILITIES_LOG_5_0(), public var AsUshort: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_5_0(public var _bitfield: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_0(public var Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_0_0 = NVME_OCP_DEVICE_CAPABILITIES_LOG_0_0(), public var AsUshort: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_0_0(public var _bitfield: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_2(public var Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_2_0 = NVME_OCP_DEVICE_CAPABILITIES_LOG_2_0(), public var AsUshort: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_2_0(public var _bitfield: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_4(public var Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_4_0 = NVME_OCP_DEVICE_CAPABILITIES_LOG_4_0(), public var AsUshort: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_4_0(public var _bitfield: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_1(public var Anonymous: NVME_OCP_DEVICE_CAPABILITIES_LOG_1_0 = NVME_OCP_DEVICE_CAPABILITIES_LOG_1_0(), public var AsUshort: UShort = 0u)

public data class NVME_OCP_DEVICE_CAPABILITIES_LOG_1_0(public var _bitfield: UShort = 0u)

public data class NVME_OCP_DEVICE_ERROR_RECOVERY_LOG_V2(
    public var PanicResetWaitTime: UShort = 0u,
    public var PanicResetAction: NVME_WCS_DEVICE_RESET_ACTION = NVME_WCS_DEVICE_RESET_ACTION(),
    public var DeviceRecoveryAction1: UByte = 0u,
    public var PanicId: ULong = 0uL,
    public var DeviceCapabilitiesA: NVME_WCS_DEVICE_CAPABILITIES = NVME_WCS_DEVICE_CAPABILITIES(),
    public var VendorSpecificRecoveryCode: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var VendorSpecificCommandCDW12: UInt = 0u,
    public var VendorSpecificCommandCDW13: UInt = 0u,
    public var VendorSpecificCommandTimeout: UByte = 0u,
    public var DeviceRecoveryAction2: UByte = 0u,
    public var DeviceRecoveryAction2Timeout: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(463),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_OCP_DEVICE_ERROR_RECOVERY_LOG_V2) return false
        if (this.PanicResetWaitTime != other.PanicResetWaitTime) return false
        if (this.PanicResetAction != other.PanicResetAction) return false
        if (this.DeviceRecoveryAction1 != other.DeviceRecoveryAction1) return false
        if (this.PanicId != other.PanicId) return false
        if (this.DeviceCapabilitiesA != other.DeviceCapabilitiesA) return false
        if (this.VendorSpecificRecoveryCode != other.VendorSpecificRecoveryCode) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.VendorSpecificCommandCDW12 != other.VendorSpecificCommandCDW12) return false
        if (this.VendorSpecificCommandCDW13 != other.VendorSpecificCommandCDW13) return false
        if (this.VendorSpecificCommandTimeout != other.VendorSpecificCommandTimeout) return false
        if (this.DeviceRecoveryAction2 != other.DeviceRecoveryAction2) return false
        if (this.DeviceRecoveryAction2Timeout != other.DeviceRecoveryAction2Timeout) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.LogPageVersionNumber != other.LogPageVersionNumber) return false
        if (this.LogPageGUID != other.LogPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PanicResetWaitTime.hashCode()
        result = 31 * result + this.PanicResetAction.hashCode()
        result = 31 * result + this.DeviceRecoveryAction1.hashCode()
        result = 31 * result + this.PanicId.hashCode()
        result = 31 * result + this.DeviceCapabilitiesA.hashCode()
        result = 31 * result + this.VendorSpecificRecoveryCode.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.VendorSpecificCommandCDW12.hashCode()
        result = 31 * result + this.VendorSpecificCommandCDW13.hashCode()
        result = 31 * result + this.VendorSpecificCommandTimeout.hashCode()
        result = 31 * result + this.DeviceRecoveryAction2.hashCode()
        result = 31 * result + this.DeviceRecoveryAction2Timeout.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.LogPageVersionNumber.hashCode()
        result = 31 * result + this.LogPageGUID.hashCode()
        return result
    }
}

public data class NVME_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY_LOG(
    public var LID: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var ValidNumberOfEntries: UInt = 0u,
    public var Entries: List<FIRMWARE_ACTIVATION_HISTORY_ENTRY> = List(20) { FIRMWARE_ACTIVATION_HISTORY_ENTRY() },
    public var Reserved1: UByteArray = UByteArray(2790),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_OCP_DEVICE_FIRMWARE_ACTIVATION_HISTORY_LOG) return false
        if (this.LID != other.LID) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.ValidNumberOfEntries != other.ValidNumberOfEntries) return false
        if (this.Entries != other.Entries) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.LogPageVersionNumber != other.LogPageVersionNumber) return false
        if (this.LogPageGUID != other.LogPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LID.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.ValidNumberOfEntries.hashCode()
        result = 31 * result + this.Entries.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.LogPageVersionNumber.hashCode()
        result = 31 * result + this.LogPageGUID.hashCode()
        return result
    }
}

public class NVME_OCP_DEVICE_LATENCY_MONITOR_LOG(
    public var FeatureStatus: LATENCY_MONITOR_FEATURE_STATUS = LATENCY_MONITOR_FEATURE_STATUS(),
    public var Reserved0: UByte = 0u,
    public var ActiveBucketTimer: UShort = 0u,
    public var ActiveBucketTimerThreshold: UShort = 0u,
    public var ActiveThresholdA: UByte = 0u,
    public var ActiveThresholdB: UByte = 0u,
    public var ActiveThresholdC: UByte = 0u,
    public var ActiveThresholdD: UByte = 0u,
    public var ActiveLatencyConfig: ACTIVE_LATENCY_CONFIGURATION = ACTIVE_LATENCY_CONFIGURATION(),
    public var ActiveLatencyMinimumWindow: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(19),
    public var ActiveBucketCounter0: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var ActiveBucketCounter1: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var ActiveBucketCounter2: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var ActiveBucketCounter3: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var ActiveLatencyStamp: LATENCY_STAMP = LATENCY_STAMP(),
    public var ActiveMeasuredLatency: MEASURED_LATENCY = MEASURED_LATENCY(),
    public var ActiveLatencyStampUnits: LATENCY_STAMP_UNITS = LATENCY_STAMP_UNITS(),
    public var Reserved2: UByteArray = UByteArray(22),
    public var StaticBucketCounter0: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var StaticBucketCounter1: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var StaticBucketCounter2: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var StaticBucketCounter3: BUCKET_COUNTER = BUCKET_COUNTER(),
    public var StaticLatencyStamp: LATENCY_STAMP = LATENCY_STAMP(),
    public var StaticMeasuredLatency: MEASURED_LATENCY = MEASURED_LATENCY(),
    public var StaticLatencyStampUnits: LATENCY_STAMP_UNITS = LATENCY_STAMP_UNITS(),
    public var Reserved3: UByteArray = UByteArray(22),
    public var DebugLogTriggerEnable: DEBUG_BIT_FIELD = DEBUG_BIT_FIELD(),
    public var DebugLogMeasuredLatency: UShort = 0u,
    public var DebugLogLatencyStamp: ULong = 0uL,
    public var DebugLogPointer: UShort = 0u,
    public var DebugCounterTriggerSource: DEBUG_BIT_FIELD = DEBUG_BIT_FIELD(),
    public var DebugLogStampUnits: NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0 = NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0(),
    public var Reserved4: UByteArray = UByteArray(29),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
)

public data class NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0(public var Anonymous: NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0_0 = NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0_0(), public var AsUchar: UByte = 0u)

public data class NVME_OCP_DEVICE_LATENCY_MONITOR_LOG_0_0(public var _bitfield: UByte = 0u)

public class NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3(
    public var MediaUnitsWritten: UByteArray = UByteArray(16),
    public var MediaUnitsRead: UByteArray = UByteArray(16),
    public var BadUserNANDBlockCount: NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_0 = NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_0(),
    public var BadSystemNANDBlockCount: NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_1 = NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_1(),
    public var XORRecoveryCount: ULong = 0uL,
    public var UnrecoverableReadErrorCount: ULong = 0uL,
    public var SoftECCErrorCount: ULong = 0uL,
    public var EndToEndCorrectionCounts: NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_2 = NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_2(),
    public var PercentageSystemDataUsed: UByte = 0u,
    public var RefreshCount: UByteArray = UByteArray(7),
    public var UserDataEraseCounts: NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_3 = NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_3(),
    public var ThermalThrottling: NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_4 = NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_4(),
    public var DSSDSpecVersion: UByteArray = UByteArray(6),
    public var PCIeCorrectableErrorCount: ULong = 0uL,
    public var IncompleteShutdownCount: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var PercentageFreeBlocks: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(7),
    public var CapacitorHealth: UShort = 0u,
    public var NvmeErrata: UByte = 0u,
    public var Reserved3: UByteArray = UByteArray(5),
    public var UnalignedIOCount: ULong = 0uL,
    public var SecurityVersionNumber: ULong = 0uL,
    public var NUSE: ULong = 0uL,
    public var PLPStartCount: UByteArray = UByteArray(16),
    public var EnduranceEstimate: UByteArray = UByteArray(16),
    public var PCIeLinkRetrainingCount: ULong = 0uL,
    public var PowerStateChangeCount: ULong = 0uL,
    public var Reserved4: UByteArray = UByteArray(286),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
)

public data class NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_1(public var RawCount: UByteArray = UByteArray(6), public var Normalized: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_1) return false
        if (!this.RawCount.contentEquals(other.RawCount)) return false
        if (!this.Normalized.contentEquals(other.Normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RawCount.contentHashCode()
        result = 31 * result + this.Normalized.contentHashCode()
        return result
    }
}

public data class NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_0(public var RawCount: UByteArray = UByteArray(6), public var Normalized: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_0) return false
        if (!this.RawCount.contentEquals(other.RawCount)) return false
        if (!this.Normalized.contentEquals(other.Normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RawCount.contentHashCode()
        result = 31 * result + this.Normalized.contentHashCode()
        return result
    }
}

public data class NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_2(public var DetectedCounts: UInt = 0u, public var CorrectedCounts: UInt = 0u)

public data class NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_4(public var EventCount: UByte = 0u, public var Status: UByte = 0u)

public data class NVME_OCP_DEVICE_SMART_INFORMATION_LOG_V3_3(public var MaximumCount: UInt = 0u, public var MinimumCount: UInt = 0u)

public class NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG(
    public var State: NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0 = NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0(),
    public var Reserved0: UByteArray = UByteArray(3),
    public var LSPActivationCount: UByte = 0u,
    public var TPRevertCount: UByte = 0u,
    public var LSPRevertCount: UByte = 0u,
    public var LOCount: UByte = 0u,
    public var SUMLOCount: UByte = 0u,
    public var RPLOCount: UByte = 0u,
    public var NPLOCount: UByte = 0u,
    public var RLLOCount: UByte = 0u,
    public var WLLOCount: UByte = 0u,
    public var RULOCount: UByte = 0u,
    public var WULOCount: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var SIDAuthTryCount: UInt = 0u,
    public var SIDAuthTryLimit: UInt = 0u,
    public var ResetCount: UInt = 0u,
    public var ResetLockCount: UInt = 0u,
    public var Reserved2: UByteArray = UByteArray(462),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
)

public data class NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0(public var Anonymous: NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0_0 = NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0_0(), public var AsUchar: UByte = 0u)

public data class NVME_OCP_DEVICE_TCG_CONFIGURATION_LOG_0_0(public var _bitfield: UByte = 0u)

public data class NVME_OCP_DEVICE_TCG_HISTORY_LOG(
    public var LID: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var HistoryEntryCount: UInt = 0u,
    public var HistoryEntries: List<TCG_HISTORY_ENTRY> = List(84) { TCG_HISTORY_ENTRY() },
    public var Reserved1: UByteArray = UByteArray(38),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_OCP_DEVICE_TCG_HISTORY_LOG) return false
        if (this.LID != other.LID) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.HistoryEntryCount != other.HistoryEntryCount) return false
        if (this.HistoryEntries != other.HistoryEntries) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.LogPageVersionNumber != other.LogPageVersionNumber) return false
        if (this.LogPageGUID != other.LogPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LID.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.HistoryEntryCount.hashCode()
        result = 31 * result + this.HistoryEntries.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.LogPageVersionNumber.hashCode()
        result = 31 * result + this.LogPageGUID.hashCode()
        return result
    }
}

public data class NVME_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS_LOG(
    public var UnsupportedCount: UShort = 0u,
    public var Reserved0: UByteArray = UByteArray(14),
    public var UnsupportedReqList: List<UNSUPPORTED_REQUIREMENT> = List(253) { UNSUPPORTED_REQUIREMENT() },
    public var Reserved1: UByteArray = UByteArray(14),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_OCP_DEVICE_UNSUPPORTED_REQUIREMENTS_LOG) return false
        if (this.UnsupportedCount != other.UnsupportedCount) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.UnsupportedReqList != other.UnsupportedReqList) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.LogPageVersionNumber != other.LogPageVersionNumber) return false
        if (this.LogPageGUID != other.LogPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.UnsupportedCount.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.UnsupportedReqList.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.LogPageVersionNumber.hashCode()
        result = 31 * result + this.LogPageGUID.hashCode()
        return result
    }
}

public data class NVME_PERSISTENT_EVENT_LOG_EVENT_HEADER(
    public var EventType: UByte = 0u,
    public var EventTypeRevision: UByte = 0u,
    public var EventHeaderLength: UByte = 0u,
    public var Reserved0: UByte = 0u,
    public var ControllerIdentifier: UShort = 0u,
    public var EventTimestamp: ULong = 0uL,
    public var Reserved1: UByteArray = UByteArray(6),
    public var VendorSpecificInformationLength: UShort = 0u,
    public var EventLength: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_PERSISTENT_EVENT_LOG_EVENT_HEADER) return false
        if (this.EventType != other.EventType) return false
        if (this.EventTypeRevision != other.EventTypeRevision) return false
        if (this.EventHeaderLength != other.EventHeaderLength) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.ControllerIdentifier != other.ControllerIdentifier) return false
        if (this.EventTimestamp != other.EventTimestamp) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.VendorSpecificInformationLength != other.VendorSpecificInformationLength) return false
        if (this.EventLength != other.EventLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EventType.hashCode()
        result = 31 * result + this.EventTypeRevision.hashCode()
        result = 31 * result + this.EventHeaderLength.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.ControllerIdentifier.hashCode()
        result = 31 * result + this.EventTimestamp.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.VendorSpecificInformationLength.hashCode()
        result = 31 * result + this.EventLength.hashCode()
        return result
    }
}

public class NVME_PERSISTENT_EVENT_LOG_HEADER(
    public var LogIdentifier: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var TotalNumberOfEvents: UInt = 0u,
    public var TotalLogLength: ULong = 0uL,
    public var LogRevision: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var LogHeaderLength: UShort = 0u,
    public var Timestamp: ULong = 0uL,
    public var PowerOnHours: UByteArray = UByteArray(16),
    public var PowerCycleCount: ULong = 0uL,
    public var PciVendorId: UShort = 0u,
    public var PciSubsystemVendorId: UShort = 0u,
    public var SerialNumber: UByteArray = UByteArray(20),
    public var ModelNumber: UByteArray = UByteArray(40),
    public var NVMSubsystemNVMeQualifiedName: UByteArray = UByteArray(256),
    public var Reserved: UByteArray = UByteArray(108),
    public var SupportedEventsBitmap: UByteArray = UByteArray(32),
)

public data class NVME_POWER_STATE_DESC(
    public var MP: UShort = 0u,
    public var Reserved0: UByte = 0u,
    public var _bitfield1: UByte = 0u,
    public var ENLAT: UInt = 0u,
    public var EXLAT: UInt = 0u,
    public var _bitfield2: UByte = 0u,
    public var _bitfield3: UByte = 0u,
    public var _bitfield4: UByte = 0u,
    public var _bitfield5: UByte = 0u,
    public var IDLP: UShort = 0u,
    public var _bitfield6: UByte = 0u,
    public var Reserved7: UByte = 0u,
    public var ACTP: UShort = 0u,
    public var _bitfield7: UByte = 0u,
    public var Reserved9: UByteArray = UByteArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_POWER_STATE_DESC) return false
        if (this.MP != other.MP) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this._bitfield1 != other._bitfield1) return false
        if (this.ENLAT != other.ENLAT) return false
        if (this.EXLAT != other.EXLAT) return false
        if (this._bitfield2 != other._bitfield2) return false
        if (this._bitfield3 != other._bitfield3) return false
        if (this._bitfield4 != other._bitfield4) return false
        if (this._bitfield5 != other._bitfield5) return false
        if (this.IDLP != other.IDLP) return false
        if (this._bitfield6 != other._bitfield6) return false
        if (this.Reserved7 != other.Reserved7) return false
        if (this.ACTP != other.ACTP) return false
        if (this._bitfield7 != other._bitfield7) return false
        if (!this.Reserved9.contentEquals(other.Reserved9)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MP.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this._bitfield1.hashCode()
        result = 31 * result + this.ENLAT.hashCode()
        result = 31 * result + this.EXLAT.hashCode()
        result = 31 * result + this._bitfield2.hashCode()
        result = 31 * result + this._bitfield3.hashCode()
        result = 31 * result + this._bitfield4.hashCode()
        result = 31 * result + this._bitfield5.hashCode()
        result = 31 * result + this.IDLP.hashCode()
        result = 31 * result + this._bitfield6.hashCode()
        result = 31 * result + this.Reserved7.hashCode()
        result = 31 * result + this.ACTP.hashCode()
        result = 31 * result + this._bitfield7.hashCode()
        result = 31 * result + this.Reserved9.contentHashCode()
        return result
    }
}

public data class NVME_PRP_ENTRY(public var Anonymous: NVME_PRP_ENTRY_0 = NVME_PRP_ENTRY_0(), public var AsUlonglong: ULong = 0uL)

public data class NVME_PRP_ENTRY_0(public var _bitfield: ULong = 0uL)

public data class NVME_REGISTERED_CONTROLLER_DATA(
    public var CNTLID: UShort = 0u,
    public var RCSTS: NVME_REGISTERED_CONTROLLER_DATA_0 = NVME_REGISTERED_CONTROLLER_DATA_0(),
    public var Reserved: UByteArray = UByteArray(5),
    public var HOSTID: UByteArray = UByteArray(8),
    public var RKEY: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_REGISTERED_CONTROLLER_DATA) return false
        if (this.CNTLID != other.CNTLID) return false
        if (this.RCSTS != other.RCSTS) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.HOSTID.contentEquals(other.HOSTID)) return false
        if (this.RKEY != other.RKEY) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CNTLID.hashCode()
        result = 31 * result + this.RCSTS.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.HOSTID.contentHashCode()
        result = 31 * result + this.RKEY.hashCode()
        return result
    }
}

public data class NVME_REGISTERED_CONTROLLER_DATA_0(public var _bitfield: UByte = 0u)

public data class NVME_REGISTERED_CONTROLLER_EXTENDED_DATA(
    public var CNTLID: UShort = 0u,
    public var RCSTS: NVME_REGISTERED_CONTROLLER_EXTENDED_DATA_0 = NVME_REGISTERED_CONTROLLER_EXTENDED_DATA_0(),
    public var Reserved: UByteArray = UByteArray(5),
    public var RKEY: ULong = 0uL,
    public var HOSTID: UByteArray = UByteArray(16),
    public var Reserved1: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_REGISTERED_CONTROLLER_EXTENDED_DATA) return false
        if (this.CNTLID != other.CNTLID) return false
        if (this.RCSTS != other.RCSTS) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.RKEY != other.RKEY) return false
        if (!this.HOSTID.contentEquals(other.HOSTID)) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CNTLID.hashCode()
        result = 31 * result + this.RCSTS.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.RKEY.hashCode()
        result = 31 * result + this.HOSTID.contentHashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_REGISTERED_CONTROLLER_EXTENDED_DATA_0(public var _bitfield: UByte = 0u)

public data class NVME_REPORT_ZONE_INFO(
    public var ZoneCount: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(7),
    public var ZoneDescriptor: List<NVME_ZONE_DESCRIPTOR> = List(1) { NVME_ZONE_DESCRIPTOR() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_REPORT_ZONE_INFO) return false
        if (this.ZoneCount != other.ZoneCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.ZoneDescriptor != other.ZoneDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ZoneCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ZoneDescriptor.hashCode()
        return result
    }
}

public data class NVME_RESERVATION_ACQUIRE_DATA_STRUCTURE(public var CRKEY: ULong = 0uL, public var PRKEY: ULong = 0uL)

public data class NVME_RESERVATION_NOTIFICATION_LOG(
    public var LogPageCount: ULong = 0uL,
    public var LogPageType: UByte = 0u,
    public var AvailableLogPageCount: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(2),
    public var NameSpaceId: UInt = 0u,
    public var Reserved1: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_RESERVATION_NOTIFICATION_LOG) return false
        if (this.LogPageCount != other.LogPageCount) return false
        if (this.LogPageType != other.LogPageType) return false
        if (this.AvailableLogPageCount != other.AvailableLogPageCount) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.NameSpaceId != other.NameSpaceId) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LogPageCount.hashCode()
        result = 31 * result + this.LogPageType.hashCode()
        result = 31 * result + this.AvailableLogPageCount.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.NameSpaceId.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_RESERVATION_REGISTER_DATA_STRUCTURE(public var CRKEY: ULong = 0uL, public var NRKEY: ULong = 0uL)

public data class NVME_RESERVATION_RELEASE_DATA_STRUCTURE(public var CRKEY: ULong = 0uL)

public data class NVME_RESERVATION_REPORT_STATUS_DATA_STRUCTURE(public var Header: NVME_RESERVATION_REPORT_STATUS_HEADER = NVME_RESERVATION_REPORT_STATUS_HEADER(), public var RegisteredControllersData: List<NVME_REGISTERED_CONTROLLER_DATA> = List(1) { NVME_REGISTERED_CONTROLLER_DATA() })

public data class NVME_RESERVATION_REPORT_STATUS_EXTENDED_DATA_STRUCTURE(
    public var Header: NVME_RESERVATION_REPORT_STATUS_HEADER = NVME_RESERVATION_REPORT_STATUS_HEADER(),
    public var Reserved1: UByteArray = UByteArray(40),
    public var RegisteredControllersExtendedData: List<NVME_REGISTERED_CONTROLLER_EXTENDED_DATA> = List(1) { NVME_REGISTERED_CONTROLLER_EXTENDED_DATA() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_RESERVATION_REPORT_STATUS_EXTENDED_DATA_STRUCTURE) return false
        if (this.Header != other.Header) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.RegisteredControllersExtendedData != other.RegisteredControllersExtendedData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.RegisteredControllersExtendedData.hashCode()
        return result
    }
}

public data class NVME_RESERVATION_REPORT_STATUS_HEADER(
    public var GEN: UInt = 0u,
    public var RTYPE: UByte = 0u,
    public var REGCTL: UShort = 0u,
    public var Reserved: UByteArray = UByteArray(2),
    public var PTPLS: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_RESERVATION_REPORT_STATUS_HEADER) return false
        if (this.GEN != other.GEN) return false
        if (this.RTYPE != other.RTYPE) return false
        if (this.REGCTL != other.REGCTL) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.PTPLS != other.PTPLS) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.GEN.hashCode()
        result = 31 * result + this.RTYPE.hashCode()
        result = 31 * result + this.REGCTL.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.PTPLS.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class NVME_SANITIZE_STATUS(public var _bitfield: UShort = 0u)

public data class NVME_SANITIZE_STATUS_LOG(
    public var SPROG: UShort = 0u,
    public var SSTAT: NVME_SANITIZE_STATUS = NVME_SANITIZE_STATUS(),
    public var SCDW10: UInt = 0u,
    public var EstimatedTimeForOverwrite: UInt = 0u,
    public var EstimatedTimeForBlockErase: UInt = 0u,
    public var EstimatedTimeForCryptoErase: UInt = 0u,
    public var EstimatedTimeForOverwriteWithNoDeallocateMediaModification: UInt = 0u,
    public var EstimatedTimeForBlockEraseWithNoDeallocateMediaModification: UInt = 0u,
    public var EstimatedTimeForCryptoEraseWithNoDeallocateMediaModification: UInt = 0u,
    public var Reserved: UByteArray = UByteArray(480),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_SANITIZE_STATUS_LOG) return false
        if (this.SPROG != other.SPROG) return false
        if (this.SSTAT != other.SSTAT) return false
        if (this.SCDW10 != other.SCDW10) return false
        if (this.EstimatedTimeForOverwrite != other.EstimatedTimeForOverwrite) return false
        if (this.EstimatedTimeForBlockErase != other.EstimatedTimeForBlockErase) return false
        if (this.EstimatedTimeForCryptoErase != other.EstimatedTimeForCryptoErase) return false
        if (this.EstimatedTimeForOverwriteWithNoDeallocateMediaModification != other.EstimatedTimeForOverwriteWithNoDeallocateMediaModification) return false
        if (this.EstimatedTimeForBlockEraseWithNoDeallocateMediaModification != other.EstimatedTimeForBlockEraseWithNoDeallocateMediaModification) return false
        if (this.EstimatedTimeForCryptoEraseWithNoDeallocateMediaModification != other.EstimatedTimeForCryptoEraseWithNoDeallocateMediaModification) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SPROG.hashCode()
        result = 31 * result + this.SSTAT.hashCode()
        result = 31 * result + this.SCDW10.hashCode()
        result = 31 * result + this.EstimatedTimeForOverwrite.hashCode()
        result = 31 * result + this.EstimatedTimeForBlockErase.hashCode()
        result = 31 * result + this.EstimatedTimeForCryptoErase.hashCode()
        result = 31 * result + this.EstimatedTimeForOverwriteWithNoDeallocateMediaModification.hashCode()
        result = 31 * result + this.EstimatedTimeForBlockEraseWithNoDeallocateMediaModification.hashCode()
        result = 31 * result + this.EstimatedTimeForCryptoEraseWithNoDeallocateMediaModification.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class NVME_SCSI_NAME_STRING(
    public var PCIVendorID: ByteArray = ByteArray(4),
    public var ModelNumber: ByteArray = ByteArray(40),
    public var NamespaceID: ByteArray = ByteArray(4),
    public var SerialNumber: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_SCSI_NAME_STRING) return false
        if (!this.PCIVendorID.contentEquals(other.PCIVendorID)) return false
        if (!this.ModelNumber.contentEquals(other.ModelNumber)) return false
        if (!this.NamespaceID.contentEquals(other.NamespaceID)) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PCIVendorID.contentHashCode()
        result = 31 * result + this.ModelNumber.contentHashCode()
        result = 31 * result + this.NamespaceID.contentHashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        return result
    }
}

public data class NVME_SET_ATTRIBUTES_ENTRY(
    public var Identifier: UShort = 0u,
    public var ENDGID: UShort = 0u,
    public var Reserved1: UInt = 0u,
    public var Random4KBReadTypical: UInt = 0u,
    public var OptimalWriteSize: UInt = 0u,
    public var TotalCapacity: UByteArray = UByteArray(16),
    public var UnallocatedCapacity: UByteArray = UByteArray(16),
    public var Reserved2: UByteArray = UByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_SET_ATTRIBUTES_ENTRY) return false
        if (this.Identifier != other.Identifier) return false
        if (this.ENDGID != other.ENDGID) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Random4KBReadTypical != other.Random4KBReadTypical) return false
        if (this.OptimalWriteSize != other.OptimalWriteSize) return false
        if (!this.TotalCapacity.contentEquals(other.TotalCapacity)) return false
        if (!this.UnallocatedCapacity.contentEquals(other.UnallocatedCapacity)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Identifier.hashCode()
        result = 31 * result + this.ENDGID.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Random4KBReadTypical.hashCode()
        result = 31 * result + this.OptimalWriteSize.hashCode()
        result = 31 * result + this.TotalCapacity.contentHashCode()
        result = 31 * result + this.UnallocatedCapacity.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class NVME_SUBMISSION_QUEUE_TAIL_DOORBELL(public var Anonymous: NVME_SUBMISSION_QUEUE_TAIL_DOORBELL_0 = NVME_SUBMISSION_QUEUE_TAIL_DOORBELL_0(), public var AsUlong: UInt = 0u)

public data class NVME_SUBMISSION_QUEUE_TAIL_DOORBELL_0(public var _bitfield: UInt = 0u)

public data class NVME_TELEMETRY_CONTROLLER_INITIATED_LOG(
    public var LogIdentifier: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(4),
    public var OrganizationID: UByteArray = UByteArray(3),
    public var Area1LastBlock: UShort = 0u,
    public var Area2LastBlock: UShort = 0u,
    public var Area3LastBlock: UShort = 0u,
    public var Reserved1: UByteArray = UByteArray(2),
    public var Area4LastBlock: UInt = 0u,
    public var Reserved2: UByteArray = UByteArray(362),
    public var ControllerInitiatedDataAvailable: UByte = 0u,
    public var ControllerInitiatedDataGenerationNumber: UByte = 0u,
    public var ReasonIdentifier: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_TELEMETRY_CONTROLLER_INITIATED_LOG) return false
        if (this.LogIdentifier != other.LogIdentifier) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.OrganizationID.contentEquals(other.OrganizationID)) return false
        if (this.Area1LastBlock != other.Area1LastBlock) return false
        if (this.Area2LastBlock != other.Area2LastBlock) return false
        if (this.Area3LastBlock != other.Area3LastBlock) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Area4LastBlock != other.Area4LastBlock) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.ControllerInitiatedDataAvailable != other.ControllerInitiatedDataAvailable) return false
        if (this.ControllerInitiatedDataGenerationNumber != other.ControllerInitiatedDataGenerationNumber) return false
        if (!this.ReasonIdentifier.contentEquals(other.ReasonIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LogIdentifier.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.OrganizationID.contentHashCode()
        result = 31 * result + this.Area1LastBlock.hashCode()
        result = 31 * result + this.Area2LastBlock.hashCode()
        result = 31 * result + this.Area3LastBlock.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Area4LastBlock.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.ControllerInitiatedDataAvailable.hashCode()
        result = 31 * result + this.ControllerInitiatedDataGenerationNumber.hashCode()
        result = 31 * result + this.ReasonIdentifier.contentHashCode()
        return result
    }
}

public data class NVME_TELEMETRY_HOST_INITIATED_LOG(
    public var LogIdentifier: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(4),
    public var OrganizationID: UByteArray = UByteArray(3),
    public var Area1LastBlock: UShort = 0u,
    public var Area2LastBlock: UShort = 0u,
    public var Area3LastBlock: UShort = 0u,
    public var Reserved1: UByteArray = UByteArray(2),
    public var Area4LastBlock: UInt = 0u,
    public var Reserved2: UByteArray = UByteArray(361),
    public var HostInitiatedDataGenerationNumber: UByte = 0u,
    public var ControllerInitiatedDataAvailable: UByte = 0u,
    public var ControllerInitiatedDataGenerationNumber: UByte = 0u,
    public var ReasonIdentifier: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_TELEMETRY_HOST_INITIATED_LOG) return false
        if (this.LogIdentifier != other.LogIdentifier) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.OrganizationID.contentEquals(other.OrganizationID)) return false
        if (this.Area1LastBlock != other.Area1LastBlock) return false
        if (this.Area2LastBlock != other.Area2LastBlock) return false
        if (this.Area3LastBlock != other.Area3LastBlock) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Area4LastBlock != other.Area4LastBlock) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.HostInitiatedDataGenerationNumber != other.HostInitiatedDataGenerationNumber) return false
        if (this.ControllerInitiatedDataAvailable != other.ControllerInitiatedDataAvailable) return false
        if (this.ControllerInitiatedDataGenerationNumber != other.ControllerInitiatedDataGenerationNumber) return false
        if (!this.ReasonIdentifier.contentEquals(other.ReasonIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LogIdentifier.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.OrganizationID.contentHashCode()
        result = 31 * result + this.Area1LastBlock.hashCode()
        result = 31 * result + this.Area2LastBlock.hashCode()
        result = 31 * result + this.Area3LastBlock.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Area4LastBlock.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.HostInitiatedDataGenerationNumber.hashCode()
        result = 31 * result + this.ControllerInitiatedDataAvailable.hashCode()
        result = 31 * result + this.ControllerInitiatedDataGenerationNumber.hashCode()
        result = 31 * result + this.ReasonIdentifier.contentHashCode()
        return result
    }
}

public data class NVME_VERSION(public var Anonymous: NVME_VERSION_0 = NVME_VERSION_0(), public var AsUlong: UInt = 0u)

public data class NVME_VERSION_0(public var _bitfield: UInt = 0u)

public data class NVME_WCS_DEVICE_CAPABILITIES(public var Anonymous: NVME_WCS_DEVICE_CAPABILITIES_0 = NVME_WCS_DEVICE_CAPABILITIES_0())

public data class NVME_WCS_DEVICE_CAPABILITIES_0(public var Anonymous: NVME_WCS_DEVICE_CAPABILITIES_0_0 = NVME_WCS_DEVICE_CAPABILITIES_0_0(), public var AsULONG: UInt = 0u)

public data class NVME_WCS_DEVICE_CAPABILITIES_0_0(public var _bitfield: UInt = 0u)

public data class NVME_WCS_DEVICE_ERROR_RECOVERY_LOG(
    public var PanicResetWaitTime: UShort = 0u,
    public var PanicResetAction: NVME_WCS_DEVICE_RESET_ACTION = NVME_WCS_DEVICE_RESET_ACTION(),
    public var DriveRecoveryAction: UByte = 0u,
    public var PanicId: ULong = 0uL,
    public var DeviceCapabilitiesA: NVME_WCS_DEVICE_CAPABILITIES = NVME_WCS_DEVICE_CAPABILITIES(),
    public var VendorSpecificRecoveryCode: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var VendorSpecificCommandCDW12: UInt = 0u,
    public var VendorSpecificCommandCDW13: UInt = 0u,
    public var Reserved1: UByteArray = UByteArray(466),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_WCS_DEVICE_ERROR_RECOVERY_LOG) return false
        if (this.PanicResetWaitTime != other.PanicResetWaitTime) return false
        if (this.PanicResetAction != other.PanicResetAction) return false
        if (this.DriveRecoveryAction != other.DriveRecoveryAction) return false
        if (this.PanicId != other.PanicId) return false
        if (this.DeviceCapabilitiesA != other.DeviceCapabilitiesA) return false
        if (this.VendorSpecificRecoveryCode != other.VendorSpecificRecoveryCode) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.VendorSpecificCommandCDW12 != other.VendorSpecificCommandCDW12) return false
        if (this.VendorSpecificCommandCDW13 != other.VendorSpecificCommandCDW13) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.LogPageVersionNumber != other.LogPageVersionNumber) return false
        if (this.LogPageGUID != other.LogPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PanicResetWaitTime.hashCode()
        result = 31 * result + this.PanicResetAction.hashCode()
        result = 31 * result + this.DriveRecoveryAction.hashCode()
        result = 31 * result + this.PanicId.hashCode()
        result = 31 * result + this.DeviceCapabilitiesA.hashCode()
        result = 31 * result + this.VendorSpecificRecoveryCode.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.VendorSpecificCommandCDW12.hashCode()
        result = 31 * result + this.VendorSpecificCommandCDW13.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.LogPageVersionNumber.hashCode()
        result = 31 * result + this.LogPageGUID.hashCode()
        return result
    }
}

public data class NVME_WCS_DEVICE_RESET_ACTION(public var Anonymous: NVME_WCS_DEVICE_RESET_ACTION_0 = NVME_WCS_DEVICE_RESET_ACTION_0())

public data class NVME_WCS_DEVICE_RESET_ACTION_0(public var Anonymous: NVME_WCS_DEVICE_RESET_ACTION_0_0 = NVME_WCS_DEVICE_RESET_ACTION_0_0(), public var AsUCHAR: UByte = 0u)

public data class NVME_WCS_DEVICE_RESET_ACTION_0_0(public var _bitfield: UByte = 0u)

public data class NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG(
    public var VersionSpecificData: UByteArray = UByteArray(494),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG) return false
        if (!this.VersionSpecificData.contentEquals(other.VersionSpecificData)) return false
        if (this.LogPageVersionNumber != other.LogPageVersionNumber) return false
        if (this.LogPageGUID != other.LogPageGUID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VersionSpecificData.contentHashCode()
        result = 31 * result + this.LogPageVersionNumber.hashCode()
        result = 31 * result + this.LogPageGUID.hashCode()
        return result
    }
}

public class NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2(
    public var MediaUnitsWritten: UByteArray = UByteArray(16),
    public var MediaUnitsRead: UByteArray = UByteArray(16),
    public var BadUserNANDBlockCount: NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_0 = NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_0(),
    public var BadSystemNANDBlockCount: NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_1 = NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_1(),
    public var XORRecoveryCount: ULong = 0uL,
    public var UnrecoverableReadErrorCount: ULong = 0uL,
    public var SoftECCErrorCount: ULong = 0uL,
    public var EndToEndCorrectionCounts: NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_2 = NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_2(),
    public var PercentageSystemDataUsed: UByte = 0u,
    public var RefreshCount: UByteArray = UByteArray(7),
    public var UserDataEraseCounts: NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_3 = NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_3(),
    public var ThermalThrottling: NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_4 = NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_4(),
    public var Reserved0: UByteArray = UByteArray(6),
    public var PCIeCorrectableErrorCount: ULong = 0uL,
    public var IncompleteShutdownCount: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var PercentageFreeBlocks: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(7),
    public var CapacitorHealth: UShort = 0u,
    public var Reserved3: UByteArray = UByteArray(6),
    public var UnalignedIOCount: ULong = 0uL,
    public var SecurityVersionNumber: ULong = 0uL,
    public var NUSE: ULong = 0uL,
    public var PLPStartCount: UByteArray = UByteArray(16),
    public var EnduranceEstimate: UByteArray = UByteArray(16),
    public var Reserved4: UByteArray = UByteArray(302),
    public var LogPageVersionNumber: UShort = 0u,
    public var LogPageGUID: GUID = GUID(),
)

public data class NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_1(public var RawCount: UByteArray = UByteArray(6), public var Normalized: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_1) return false
        if (!this.RawCount.contentEquals(other.RawCount)) return false
        if (!this.Normalized.contentEquals(other.Normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RawCount.contentHashCode()
        result = 31 * result + this.Normalized.contentHashCode()
        return result
    }
}

public data class NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_0(public var RawCount: UByteArray = UByteArray(6), public var Normalized: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_0) return false
        if (!this.RawCount.contentEquals(other.RawCount)) return false
        if (!this.Normalized.contentEquals(other.Normalized)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RawCount.contentHashCode()
        result = 31 * result + this.Normalized.contentHashCode()
        return result
    }
}

public data class NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_2(public var DetectedCounts: UInt = 0u, public var CorrectedCounts: UInt = 0u)

public data class NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_4(public var EventCount: UByte = 0u, public var Status: UByte = 0u)

public data class NVME_WCS_DEVICE_SMART_ATTRIBUTES_LOG_V2_3(public var MaximumCount: UInt = 0u, public var MinimumCount: UInt = 0u)

public data class NVME_ZONE_DESCRIPTOR(
    public var Anonymous1: NVME_ZONE_DESCRIPTOR_0 = NVME_ZONE_DESCRIPTOR_0(),
    public var Anonymous2: NVME_ZONE_DESCRIPTOR_1 = NVME_ZONE_DESCRIPTOR_1(),
    public var ZA: NVME_ZONE_DESCRIPTOR_2 = NVME_ZONE_DESCRIPTOR_2(),
    public var Reserved3: UByteArray = UByteArray(5),
    public var ZCAP: ULong = 0uL,
    public var ZSLBA: ULong = 0uL,
    public var WritePointer: ULong = 0uL,
    public var Reserved4: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_ZONE_DESCRIPTOR) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (this.ZA != other.ZA) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (this.ZCAP != other.ZCAP) return false
        if (this.ZSLBA != other.ZSLBA) return false
        if (this.WritePointer != other.WritePointer) return false
        if (!this.Reserved4.contentEquals(other.Reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous1.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.ZA.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.ZCAP.hashCode()
        result = 31 * result + this.ZSLBA.hashCode()
        result = 31 * result + this.WritePointer.hashCode()
        result = 31 * result + this.Reserved4.contentHashCode()
        return result
    }
}

public data class NVME_ZONE_DESCRIPTOR_0(public var _bitfield: UByte = 0u)

public data class NVME_ZONE_DESCRIPTOR_1(public var _bitfield: UByte = 0u)

public data class NVME_ZONE_DESCRIPTOR_2(public var _bitfield: UByte = 0u)

public data class NVME_ZONE_DESCRIPTOR_EXTENSION(public var ZoneDescriptorExtensionInfo: UByteArray = UByteArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVME_ZONE_DESCRIPTOR_EXTENSION) return false
        if (!this.ZoneDescriptorExtensionInfo.contentEquals(other.ZoneDescriptorExtensionInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ZoneDescriptorExtensionInfo.contentHashCode()
    }
}

public data class NVME_ZONE_EXTENDED_REPORT_ZONE_DESC(public var ZoneDescriptor: NVME_ZONE_DESCRIPTOR = NVME_ZONE_DESCRIPTOR(), public var ZoneDescriptorExtension: List<NVME_ZONE_DESCRIPTOR_EXTENSION> = List(1) { NVME_ZONE_DESCRIPTOR_EXTENSION() })

public data class NVM_RESERVATION_CAPABILITIES(public var Anonymous: NVM_RESERVATION_CAPABILITIES_0 = NVM_RESERVATION_CAPABILITIES_0(), public var AsUchar: UByte = 0u)

public data class NVM_RESERVATION_CAPABILITIES_0(public var _bitfield: UByte = 0u)

public data class NVM_SET_LIST(
    public var IdentifierCount: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(127),
    public var Entry: List<NVME_SET_ATTRIBUTES_ENTRY> = List(1) { NVME_SET_ATTRIBUTES_ENTRY() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVM_SET_LIST) return false
        if (this.IdentifierCount != other.IdentifierCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Entry != other.Entry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IdentifierCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Entry.hashCode()
        return result
    }
}

public data class TCG_ACTIVATE_METHOD_SPECIFIC(public var RangeStartLengthPolicy: UByte = 0u)

public data class TCG_ASSIGN_METHOD_SPECIFIC(public var NamespaceId: UInt = 0u)

public data class TCG_AUTH_METHOD_SPECIFIC(public var AuthorityId: ULong = 0uL, public var TriesCount: UByte = 0u)

public data class TCG_BLOCKSID_METHOD_SPECIFIC(public var ClearEvents: UByte = 0u)

public data class TCG_HISTORY_ENTRY(
    public var VersionNumber: UByte = 0u,
    public var EntryLength: UByte = 0u,
    public var PowerCycleCount: UShort = 0u,
    public var TcgCommandCount: UInt = 0u,
    public var TcgCommandCompletionTS: ULong = 0uL,
    public var InvokingId: ULong = 0uL,
    public var MethodId: ULong = 0uL,
    public var ComId: UShort = 0u,
    public var ProtocolId: UByte = 0u,
    public var TcgStatus: UByte = 0u,
    public var ProcessTime: UShort = 0u,
    public var CommandSpecific: UByteArray = UByteArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TCG_HISTORY_ENTRY) return false
        if (this.VersionNumber != other.VersionNumber) return false
        if (this.EntryLength != other.EntryLength) return false
        if (this.PowerCycleCount != other.PowerCycleCount) return false
        if (this.TcgCommandCount != other.TcgCommandCount) return false
        if (this.TcgCommandCompletionTS != other.TcgCommandCompletionTS) return false
        if (this.InvokingId != other.InvokingId) return false
        if (this.MethodId != other.MethodId) return false
        if (this.ComId != other.ComId) return false
        if (this.ProtocolId != other.ProtocolId) return false
        if (this.TcgStatus != other.TcgStatus) return false
        if (this.ProcessTime != other.ProcessTime) return false
        if (!this.CommandSpecific.contentEquals(other.CommandSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VersionNumber.hashCode()
        result = 31 * result + this.EntryLength.hashCode()
        result = 31 * result + this.PowerCycleCount.hashCode()
        result = 31 * result + this.TcgCommandCount.hashCode()
        result = 31 * result + this.TcgCommandCompletionTS.hashCode()
        result = 31 * result + this.InvokingId.hashCode()
        result = 31 * result + this.MethodId.hashCode()
        result = 31 * result + this.ComId.hashCode()
        result = 31 * result + this.ProtocolId.hashCode()
        result = 31 * result + this.TcgStatus.hashCode()
        result = 31 * result + this.ProcessTime.hashCode()
        result = 31 * result + this.CommandSpecific.contentHashCode()
        return result
    }
}

public data class TCG_REACTIVATE_METHOD_SPECIFIC(public var RangeStartLengthPolicy: UByte = 0u)

public data class UNSUPPORTED_REQUIREMENT(public var ReqId: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UNSUPPORTED_REQUIREMENT) return false
        if (!this.ReqId.contentEquals(other.ReqId)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ReqId.contentHashCode()
    }
}
