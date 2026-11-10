@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.VerPlatform
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ProcessorArchitecture
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist

public data class BusnumberDes(
    public var busdCount: UInt = 0u,
    public var busdType: UInt = 0u,
    public var busdFlags: UInt = 0u,
    public var busdAllocBase: UInt = 0u,
    public var busdAllocEnd: UInt = 0u,
)

public data class BusnumberRange(
    public var busrMin: UInt = 0u,
    public var busrMax: UInt = 0u,
    public var busrNBusNumbers: UInt = 0u,
    public var busrFlags: UInt = 0u,
)

public data class BusnumberResource(
    public var busNumberHeader: BusnumberDes = BusnumberDes(),
    public var busNumberData: List<BusnumberRange> = List(1) { BusnumberRange() },
)

public data class CabinetInfoA(
    public var cabinetPath: Pcstr = null,
    public var cabinetFile: Pcstr = null,
    public var diskName: Pcstr = null,
    public var setId: UShort = 0u,
    public var cabinetNumber: UShort = 0u,
)

public data class CabinetInfoW(
    public var cabinetPath: Pcwstr = null,
    public var cabinetFile: Pcwstr = null,
    public var diskName: Pcwstr = null,
    public var setId: UShort = 0u,
    public var cabinetNumber: UShort = 0u,
)

public data class CmNotifyEventData(
    public var filterType: CmNotifyFilterType = 0,
    public var reserved: UInt = 0u,
    public var u: CmNotifyEventData0 = CmNotifyEventData0(),
)

public data class CmNotifyEventData0(
    public var deviceInterface: CmNotifyEventData00 = CmNotifyEventData00(),
    public var deviceHandle: CmNotifyEventData01 = CmNotifyEventData01(),
    public var deviceInstance: CmNotifyEventData02 = CmNotifyEventData02(),
)

public data class CmNotifyEventData01(
    public var eventGuid: Guid = Guid(),
    public var nameOffset: Int = 0,
    public var dataSize: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyEventData01) return false
        if (this.eventGuid != other.eventGuid) return false
        if (this.nameOffset != other.nameOffset) return false
        if (this.dataSize != other.dataSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventGuid.hashCode()
        result = 31 * result + this.nameOffset.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class CmNotifyEventData02(
    public var instanceId: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyEventData02) return false
        if (!this.instanceId.contentEquals(other.instanceId)) return false
        return true
    }

    override fun hashCode(): Int = this.instanceId.contentHashCode()
}

public data class CmNotifyEventData00(
    public var classGuid: Guid = Guid(),
    public var symbolicLink: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyEventData00) return false
        if (this.classGuid != other.classGuid) return false
        if (!this.symbolicLink.contentEquals(other.symbolicLink)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classGuid.hashCode()
        result = 31 * result + this.symbolicLink.contentHashCode()
        return result
    }
}

public data class CmNotifyFilter(
    public var cbSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var filterType: CmNotifyFilterType = 0,
    public var reserved: UInt = 0u,
    public var u: CmNotifyFilter0 = CmNotifyFilter0(),
)

public data class CmNotifyFilter0(
    public var deviceInterface: CmNotifyFilter00 = CmNotifyFilter00(),
    public var deviceHandle: CmNotifyFilter01 = CmNotifyFilter01(),
    public var deviceInstance: CmNotifyFilter02 = CmNotifyFilter02(),
)

public data class CmNotifyFilter01(
    public var hTarget: Handle = null,
)

public data class CmNotifyFilter02(
    public var instanceId: UShortArray = UShortArray(200),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmNotifyFilter02) return false
        if (!this.instanceId.contentEquals(other.instanceId)) return false
        return true
    }

    override fun hashCode(): Int = this.instanceId.contentHashCode()
}

public data class CmNotifyFilter00(
    public var classGuid: Guid = Guid(),
)

public data class CoinstallerContextData(
    public var postProcessing: Bool = 0,
    public var installResult: UInt = 0u,
    public var privateData: COpaquePointer? = null,
)

public data class ConflictDetailsA(
    public var cdUlSize: UInt = 0u,
    public var cdUlMask: CmCdmask = 0u,
    public var cdDnDevInst: UInt = 0u,
    public var cdRdResDes: Int = 0,
    public var cdUlFlags: CmCdflags = 0u,
    public var cdSzDescription: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConflictDetailsA) return false
        if (this.cdUlSize != other.cdUlSize) return false
        if (this.cdUlMask != other.cdUlMask) return false
        if (this.cdDnDevInst != other.cdDnDevInst) return false
        if (this.cdRdResDes != other.cdRdResDes) return false
        if (this.cdUlFlags != other.cdUlFlags) return false
        if (!this.cdSzDescription.contentEquals(other.cdSzDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cdUlSize.hashCode()
        result = 31 * result + this.cdUlMask.hashCode()
        result = 31 * result + this.cdDnDevInst.hashCode()
        result = 31 * result + this.cdRdResDes.hashCode()
        result = 31 * result + this.cdUlFlags.hashCode()
        result = 31 * result + this.cdSzDescription.contentHashCode()
        return result
    }
}

public data class ConflictDetailsW(
    public var cdUlSize: UInt = 0u,
    public var cdUlMask: CmCdmask = 0u,
    public var cdDnDevInst: UInt = 0u,
    public var cdRdResDes: Int = 0,
    public var cdUlFlags: CmCdflags = 0u,
    public var cdSzDescription: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConflictDetailsW) return false
        if (this.cdUlSize != other.cdUlSize) return false
        if (this.cdUlMask != other.cdUlMask) return false
        if (this.cdDnDevInst != other.cdDnDevInst) return false
        if (this.cdRdResDes != other.cdRdResDes) return false
        if (this.cdUlFlags != other.cdUlFlags) return false
        if (!this.cdSzDescription.contentEquals(other.cdSzDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cdUlSize.hashCode()
        result = 31 * result + this.cdUlMask.hashCode()
        result = 31 * result + this.cdDnDevInst.hashCode()
        result = 31 * result + this.cdRdResDes.hashCode()
        result = 31 * result + this.cdUlFlags.hashCode()
        result = 31 * result + this.cdSzDescription.contentHashCode()
        return result
    }
}

public data class ConnectionDes(
    public var condType: UInt = 0u,
    public var condFlags: UInt = 0u,
    public var condClass: UByte = 0u,
    public var condClassType: UByte = 0u,
    public var condReserved1: UByte = 0u,
    public var condReserved2: UByte = 0u,
    public var condId: Long = 0L,
)

public data class ConnectionResource(
    public var connectionHeader: ConnectionDes = ConnectionDes(),
)

public data class CsDes(
    public var csdSignatureLength: UInt = 0u,
    public var csdLegacyDataOffset: UInt = 0u,
    public var csdLegacyDataSize: UInt = 0u,
    public var csdFlags: UInt = 0u,
    public var csdClassGuid: Guid = Guid(),
    public var csdSignature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsDes) return false
        if (this.csdSignatureLength != other.csdSignatureLength) return false
        if (this.csdLegacyDataOffset != other.csdLegacyDataOffset) return false
        if (this.csdLegacyDataSize != other.csdLegacyDataSize) return false
        if (this.csdFlags != other.csdFlags) return false
        if (this.csdClassGuid != other.csdClassGuid) return false
        if (!this.csdSignature.contentEquals(other.csdSignature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.csdSignatureLength.hashCode()
        result = 31 * result + this.csdLegacyDataOffset.hashCode()
        result = 31 * result + this.csdLegacyDataSize.hashCode()
        result = 31 * result + this.csdFlags.hashCode()
        result = 31 * result + this.csdClassGuid.hashCode()
        result = 31 * result + this.csdSignature.contentHashCode()
        return result
    }
}

public data class CsResource(
    public var csHeader: CsDes = CsDes(),
)

public data class DevprivateDes(
    public var pdCount: UInt = 0u,
    public var pdType: UInt = 0u,
    public var pdData1: UInt = 0u,
    public var pdData2: UInt = 0u,
    public var pdData3: UInt = 0u,
    public var pdFlags: UInt = 0u,
)

public data class DevprivateRange(
    public var prData1: UInt = 0u,
    public var prData2: UInt = 0u,
    public var prData3: UInt = 0u,
)

public data class DevprivateResource(
    public var prvHeader: DevprivateDes = DevprivateDes(),
    public var prvData: List<DevprivateRange> = List(1) { DevprivateRange() },
)

public data class DmaDes(
    public var ddCount: UInt = 0u,
    public var ddType: UInt = 0u,
    public var ddFlags: DdFlags = 0u,
    public var ddAllocChan: UInt = 0u,
)

public data class DmaRange(
    public var drMin: UInt = 0u,
    public var drMax: UInt = 0u,
    public var drFlags: DdFlags = 0u,
)

public data class DmaResource(
    public var dmaHeader: DmaDes = DmaDes(),
    public var dmaData: List<DmaRange> = List(1) { DmaRange() },
)

public data class FilepathsA(
    public var target: Pcstr = null,
    public var source: Pcstr = null,
    public var win32Error: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class FilepathsSignerinfoA(
    public var target: Pcstr = null,
    public var source: Pcstr = null,
    public var win32Error: UInt = 0u,
    public var flags: UInt = 0u,
    public var digitalSigner: Pcstr = null,
    public var version: Pcstr = null,
    public var catalogFile: Pcstr = null,
)

public data class FilepathsSignerinfoW(
    public var target: Pcwstr = null,
    public var source: Pcwstr = null,
    public var win32Error: UInt = 0u,
    public var flags: UInt = 0u,
    public var digitalSigner: Pcwstr = null,
    public var version: Pcwstr = null,
    public var catalogFile: Pcwstr = null,
)

public data class FilepathsW(
    public var target: Pcwstr = null,
    public var source: Pcwstr = null,
    public var win32Error: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class FileInCabinetInfoA(
    public var nameInCabinet: Pcstr = null,
    public var fileSize: UInt = 0u,
    public var win32Error: UInt = 0u,
    public var dosDate: UShort = 0u,
    public var dosTime: UShort = 0u,
    public var dosAttribs: UShort = 0u,
    public var fullTargetName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileInCabinetInfoA) return false
        if (this.nameInCabinet != other.nameInCabinet) return false
        if (this.fileSize != other.fileSize) return false
        if (this.win32Error != other.win32Error) return false
        if (this.dosDate != other.dosDate) return false
        if (this.dosTime != other.dosTime) return false
        if (this.dosAttribs != other.dosAttribs) return false
        if (!this.fullTargetName.contentEquals(other.fullTargetName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameInCabinet.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.dosDate.hashCode()
        result = 31 * result + this.dosTime.hashCode()
        result = 31 * result + this.dosAttribs.hashCode()
        result = 31 * result + this.fullTargetName.contentHashCode()
        return result
    }
}

public data class FileInCabinetInfoW(
    public var nameInCabinet: Pcwstr = null,
    public var fileSize: UInt = 0u,
    public var win32Error: UInt = 0u,
    public var dosDate: UShort = 0u,
    public var dosTime: UShort = 0u,
    public var dosAttribs: UShort = 0u,
    public var fullTargetName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileInCabinetInfoW) return false
        if (this.nameInCabinet != other.nameInCabinet) return false
        if (this.fileSize != other.fileSize) return false
        if (this.win32Error != other.win32Error) return false
        if (this.dosDate != other.dosDate) return false
        if (this.dosTime != other.dosTime) return false
        if (this.dosAttribs != other.dosAttribs) return false
        if (!this.fullTargetName.contentEquals(other.fullTargetName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameInCabinet.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.win32Error.hashCode()
        result = 31 * result + this.dosDate.hashCode()
        result = 31 * result + this.dosTime.hashCode()
        result = 31 * result + this.dosAttribs.hashCode()
        result = 31 * result + this.fullTargetName.contentHashCode()
        return result
    }
}

public data class HwprofileinfoA(
    public var hwpiUlHwprofile: UInt = 0u,
    public var hwpiSzFriendlyName: ByteArray = ByteArray(80),
    public var hwpiDwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwprofileinfoA) return false
        if (this.hwpiUlHwprofile != other.hwpiUlHwprofile) return false
        if (!this.hwpiSzFriendlyName.contentEquals(other.hwpiSzFriendlyName)) return false
        if (this.hwpiDwFlags != other.hwpiDwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwpiUlHwprofile.hashCode()
        result = 31 * result + this.hwpiSzFriendlyName.contentHashCode()
        result = 31 * result + this.hwpiDwFlags.hashCode()
        return result
    }
}

public data class HwprofileinfoW(
    public var hwpiUlHwprofile: UInt = 0u,
    public var hwpiSzFriendlyName: UShortArray = UShortArray(80),
    public var hwpiDwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HwprofileinfoW) return false
        if (this.hwpiUlHwprofile != other.hwpiUlHwprofile) return false
        if (!this.hwpiSzFriendlyName.contentEquals(other.hwpiSzFriendlyName)) return false
        if (this.hwpiDwFlags != other.hwpiDwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwpiUlHwprofile.hashCode()
        result = 31 * result + this.hwpiSzFriendlyName.contentHashCode()
        result = 31 * result + this.hwpiDwFlags.hashCode()
        return result
    }
}

public data class Infcontext(
    public var inf: COpaquePointer? = null,
    public var currentInf: COpaquePointer? = null,
    public var section: UInt = 0u,
    public var line: UInt = 0u,
)

public data class IoDes(
    public var iodCount: UInt = 0u,
    public var iodType: UInt = 0u,
    public var iodAllocBase: ULong = 0uL,
    public var iodAllocEnd: ULong = 0uL,
    public var iodDesFlags: IodDesflags = 0u,
)

public data class IoRange(
    public var iorAlign: ULong = 0uL,
    public var iorNPorts: UInt = 0u,
    public var iorMin: ULong = 0uL,
    public var iorMax: ULong = 0uL,
    public var iorRangeFlags: IodDesflags = 0u,
    public var iorAlias: ULong = 0uL,
)

public data class IoResource(
    public var ioHeader: IoDes = IoDes(),
    public var ioData: List<IoRange> = List(1) { IoRange() },
)

public data class IrqDes32(
    public var irqdCount: UInt = 0u,
    public var irqdType: UInt = 0u,
    public var irqdFlags: IrqdFlags = 0u,
    public var irqdAllocNum: UInt = 0u,
    public var irqdAffinity: UInt = 0u,
)

public data class IrqDes64(
    public var irqdCount: UInt = 0u,
    public var irqdType: UInt = 0u,
    public var irqdFlags: IrqdFlags = 0u,
    public var irqdAllocNum: UInt = 0u,
    public var irqdAffinity: ULong = 0uL,
)

public data class IrqRange(
    public var irqrMin: UInt = 0u,
    public var irqrMax: UInt = 0u,
    public var irqrFlags: IrqdFlags = 0u,
)

public data class IrqResource32(
    public var irqHeader: IrqDes32 = IrqDes32(),
    public var irqData: List<IrqRange> = List(1) { IrqRange() },
)

public data class IrqResource64(
    public var irqHeader: IrqDes64 = IrqDes64(),
    public var irqData: List<IrqRange> = List(1) { IrqRange() },
)

public data class MemDes(
    public var mdCount: UInt = 0u,
    public var mdType: UInt = 0u,
    public var mdAllocBase: ULong = 0uL,
    public var mdAllocEnd: ULong = 0uL,
    public var mdFlags: MdFlags = 0u,
    public var mdReserved: UInt = 0u,
)

public data class MemLargeDes(
    public var mldCount: UInt = 0u,
    public var mldType: UInt = 0u,
    public var mldAllocBase: ULong = 0uL,
    public var mldAllocEnd: ULong = 0uL,
    public var mldFlags: UInt = 0u,
    public var mldReserved: UInt = 0u,
)

public data class MemLargeRange(
    public var mlrAlign: ULong = 0uL,
    public var mlrNBytes: ULong = 0uL,
    public var mlrMin: ULong = 0uL,
    public var mlrMax: ULong = 0uL,
    public var mlrFlags: UInt = 0u,
    public var mlrReserved: UInt = 0u,
)

public data class MemLargeResource(
    public var memLargeHeader: MemLargeDes = MemLargeDes(),
    public var memLargeData: List<MemLargeRange> = List(1) { MemLargeRange() },
)

public data class MemRange(
    public var mrAlign: ULong = 0uL,
    public var mrNBytes: UInt = 0u,
    public var mrMin: ULong = 0uL,
    public var mrMax: ULong = 0uL,
    public var mrFlags: MdFlags = 0u,
    public var mrReserved: UInt = 0u,
)

public data class MemResource(
    public var memHeader: MemDes = MemDes(),
    public var memData: List<MemRange> = List(1) { MemRange() },
)

public data class MfcardDes(
    public var pmfCount: UInt = 0u,
    public var pmfType: UInt = 0u,
    public var pmfFlags: PmfFlags = 0u,
    public var pmfConfigOptions: UByte = 0u,
    public var pmfIoResourceIndex: UByte = 0u,
    public var pmfReserved: UByteArray = UByteArray(2),
    public var pmfConfigRegisterBase: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MfcardDes) return false
        if (this.pmfCount != other.pmfCount) return false
        if (this.pmfType != other.pmfType) return false
        if (this.pmfFlags != other.pmfFlags) return false
        if (this.pmfConfigOptions != other.pmfConfigOptions) return false
        if (this.pmfIoResourceIndex != other.pmfIoResourceIndex) return false
        if (!this.pmfReserved.contentEquals(other.pmfReserved)) return false
        if (this.pmfConfigRegisterBase != other.pmfConfigRegisterBase) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pmfCount.hashCode()
        result = 31 * result + this.pmfType.hashCode()
        result = 31 * result + this.pmfFlags.hashCode()
        result = 31 * result + this.pmfConfigOptions.hashCode()
        result = 31 * result + this.pmfIoResourceIndex.hashCode()
        result = 31 * result + this.pmfReserved.contentHashCode()
        result = 31 * result + this.pmfConfigRegisterBase.hashCode()
        return result
    }
}

public data class MfcardResource(
    public var mfCardHeader: MfcardDes = MfcardDes(),
)

public data class PccardDes(
    public var pcdCount: UInt = 0u,
    public var pcdType: UInt = 0u,
    public var pcdFlags: PcdFlags = 0u,
    public var pcdConfigIndex: UByte = 0u,
    public var pcdReserved: UByteArray = UByteArray(3),
    public var pcdMemoryCardBase1: UInt = 0u,
    public var pcdMemoryCardBase2: UInt = 0u,
    public var pcdMemoryCardBase: UIntArray = UIntArray(2),
    public var pcdMemoryFlags: UShortArray = UShortArray(2),
    public var pcdIoFlags: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PccardDes) return false
        if (this.pcdCount != other.pcdCount) return false
        if (this.pcdType != other.pcdType) return false
        if (this.pcdFlags != other.pcdFlags) return false
        if (this.pcdConfigIndex != other.pcdConfigIndex) return false
        if (!this.pcdReserved.contentEquals(other.pcdReserved)) return false
        if (this.pcdMemoryCardBase1 != other.pcdMemoryCardBase1) return false
        if (this.pcdMemoryCardBase2 != other.pcdMemoryCardBase2) return false
        if (!this.pcdMemoryCardBase.contentEquals(other.pcdMemoryCardBase)) return false
        if (!this.pcdMemoryFlags.contentEquals(other.pcdMemoryFlags)) return false
        if (!this.pcdIoFlags.contentEquals(other.pcdIoFlags)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pcdCount.hashCode()
        result = 31 * result + this.pcdType.hashCode()
        result = 31 * result + this.pcdFlags.hashCode()
        result = 31 * result + this.pcdConfigIndex.hashCode()
        result = 31 * result + this.pcdReserved.contentHashCode()
        result = 31 * result + this.pcdMemoryCardBase1.hashCode()
        result = 31 * result + this.pcdMemoryCardBase2.hashCode()
        result = 31 * result + this.pcdMemoryCardBase.contentHashCode()
        result = 31 * result + this.pcdMemoryFlags.contentHashCode()
        result = 31 * result + this.pcdIoFlags.contentHashCode()
        return result
    }
}

public data class PccardResource(
    public var pcCardHeader: PccardDes = PccardDes(),
)

public data class SourceMediaA(
    public var reserved: Pcstr = null,
    public var tagfile: Pcstr = null,
    public var description: Pcstr = null,
    public var sourcePath: Pcstr = null,
    public var sourceFile: Pcstr = null,
    public var flags: UInt = 0u,
)

public data class SourceMediaW(
    public var reserved: Pcwstr = null,
    public var tagfile: Pcwstr = null,
    public var description: Pcwstr = null,
    public var sourcePath: Pcwstr = null,
    public var sourceFile: Pcwstr = null,
    public var flags: UInt = 0u,
)

public data class SpAltplatformInfoV1(
    public var cbSize: UInt = 0u,
    public var platform: VerPlatform = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var processorArchitecture: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class SpAltplatformInfoV2(
    public var cbSize: UInt = 0u,
    public var platform: VerPlatform = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var processorArchitecture: ProcessorArchitecture = 0u,
    public var anonymous: SpAltplatformInfoV20 = SpAltplatformInfoV20(),
    public var firstValidatedMajorVersion: UInt = 0u,
    public var firstValidatedMinorVersion: UInt = 0u,
)

public data class SpAltplatformInfoV20(
    public var reserved: UShort = 0u,
    public var flags: UShort = 0u,
)

public data class SpAltplatformInfoV3(
    public var cbSize: UInt = 0u,
    public var platform: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var processorArchitecture: UShort = 0u,
    public var anonymous: SpAltplatformInfoV30 = SpAltplatformInfoV30(),
    public var firstValidatedMajorVersion: UInt = 0u,
    public var firstValidatedMinorVersion: UInt = 0u,
    public var productType: UByte = 0u,
    public var suiteMask: UShort = 0u,
    public var buildNumber: UInt = 0u,
)

public data class SpAltplatformInfoV30(
    public var reserved: UShort = 0u,
    public var flags: UShort = 0u,
)

public data class SpBackupQueueParamsV1A(
    public var cbSize: UInt = 0u,
    public var fullInfPath: ByteArray = ByteArray(260),
    public var filenameOffset: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV1A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        return result
    }
}

public data class SpBackupQueueParamsV1W(
    public var cbSize: UInt = 0u,
    public var fullInfPath: UShortArray = UShortArray(260),
    public var filenameOffset: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV1W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        return result
    }
}

public data class SpBackupQueueParamsV2A(
    public var cbSize: UInt = 0u,
    public var fullInfPath: ByteArray = ByteArray(260),
    public var filenameOffset: Int = 0,
    public var reinstallInstance: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV2A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        if (!this.reinstallInstance.contentEquals(other.reinstallInstance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        result = 31 * result + this.reinstallInstance.contentHashCode()
        return result
    }
}

public data class SpBackupQueueParamsV2W(
    public var cbSize: UInt = 0u,
    public var fullInfPath: UShortArray = UShortArray(260),
    public var filenameOffset: Int = 0,
    public var reinstallInstance: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpBackupQueueParamsV2W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.fullInfPath.contentEquals(other.fullInfPath)) return false
        if (this.filenameOffset != other.filenameOffset) return false
        if (!this.reinstallInstance.contentEquals(other.reinstallInstance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fullInfPath.contentHashCode()
        result = 31 * result + this.filenameOffset.hashCode()
        result = 31 * result + this.reinstallInstance.contentHashCode()
        return result
    }
}

public data class SpClassimagelistData(
    public var cbSize: UInt = 0u,
    public var imageList: Himagelist = 0L,
    public var reserved: Int = 0,
)

public data class SpClassinstallHeader(
    public var cbSize: UInt = 0u,
    public var installFunction: DiFunction = 0u,
)

public data class SpDetectdeviceParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var detectProgressNotify: PdetectProgressNotify = null,
    public var progressNotifyParam: COpaquePointer? = null,
)

public data class SpDeviceInterfaceData(
    public var cbSize: UInt = 0u,
    public var interfaceClassGuid: Guid = Guid(),
    public var flags: UInt = 0u,
    public var reserved: Int = 0,
)

public data class SpDeviceInterfaceDetailDataA(
    public var cbSize: UInt = 0u,
    public var devicePath: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDeviceInterfaceDetailDataA) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.devicePath.contentEquals(other.devicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.devicePath.contentHashCode()
        return result
    }
}

public data class SpDeviceInterfaceDetailDataW(
    public var cbSize: UInt = 0u,
    public var devicePath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDeviceInterfaceDetailDataW) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.devicePath.contentEquals(other.devicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.devicePath.contentHashCode()
        return result
    }
}

public data class SpDevinfoData(
    public var cbSize: UInt = 0u,
    public var classGuid: Guid = Guid(),
    public var devInst: UInt = 0u,
    public var reserved: Int = 0,
)

public data class SpDevinfoListDetailDataA(
    public var cbSize: UInt = 0u,
    public var classGuid: Guid = Guid(),
    public var remoteMachineHandle: Handle = null,
    public var remoteMachineName: ByteArray = ByteArray(263),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinfoListDetailDataA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.classGuid != other.classGuid) return false
        if (this.remoteMachineHandle != other.remoteMachineHandle) return false
        if (!this.remoteMachineName.contentEquals(other.remoteMachineName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.classGuid.hashCode()
        result = 31 * result + this.remoteMachineHandle.hashCode()
        result = 31 * result + this.remoteMachineName.contentHashCode()
        return result
    }
}

public data class SpDevinfoListDetailDataW(
    public var cbSize: UInt = 0u,
    public var classGuid: Guid = Guid(),
    public var remoteMachineHandle: Handle = null,
    public var remoteMachineName: UShortArray = UShortArray(263),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinfoListDetailDataW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.classGuid != other.classGuid) return false
        if (this.remoteMachineHandle != other.remoteMachineHandle) return false
        if (!this.remoteMachineName.contentEquals(other.remoteMachineName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.classGuid.hashCode()
        result = 31 * result + this.remoteMachineHandle.hashCode()
        result = 31 * result + this.remoteMachineName.contentHashCode()
        return result
    }
}

public data class SpDevinstallParamsA(
    public var cbSize: UInt = 0u,
    public var flags: SetupDiDeviceInstallFlags = 0u,
    public var flagsEx: SetupDiDeviceInstallFlagsEx = 0u,
    public var hwndParent: Hwnd = null,
    public var installMsgHandler: PspFileCallbackA = null,
    public var installMsgHandlerContext: COpaquePointer? = null,
    public var fileQueue: COpaquePointer? = null,
    public var classInstallReserved: Int = 0,
    public var reserved: UInt = 0u,
    public var driverPath: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinstallParamsA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.flagsEx != other.flagsEx) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.installMsgHandler != other.installMsgHandler) return false
        if (this.installMsgHandlerContext != other.installMsgHandlerContext) return false
        if (this.fileQueue != other.fileQueue) return false
        if (this.classInstallReserved != other.classInstallReserved) return false
        if (this.reserved != other.reserved) return false
        if (!this.driverPath.contentEquals(other.driverPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.flagsEx.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.installMsgHandler.hashCode()
        result = 31 * result + this.installMsgHandlerContext.hashCode()
        result = 31 * result + this.fileQueue.hashCode()
        result = 31 * result + this.classInstallReserved.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.driverPath.contentHashCode()
        return result
    }
}

public data class SpDevinstallParamsW(
    public var cbSize: UInt = 0u,
    public var flags: SetupDiDeviceInstallFlags = 0u,
    public var flagsEx: SetupDiDeviceInstallFlagsEx = 0u,
    public var hwndParent: Hwnd = null,
    public var installMsgHandler: PspFileCallbackW = null,
    public var installMsgHandlerContext: COpaquePointer? = null,
    public var fileQueue: COpaquePointer? = null,
    public var classInstallReserved: Int = 0,
    public var reserved: UInt = 0u,
    public var driverPath: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDevinstallParamsW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.flags != other.flags) return false
        if (this.flagsEx != other.flagsEx) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.installMsgHandler != other.installMsgHandler) return false
        if (this.installMsgHandlerContext != other.installMsgHandlerContext) return false
        if (this.fileQueue != other.fileQueue) return false
        if (this.classInstallReserved != other.classInstallReserved) return false
        if (this.reserved != other.reserved) return false
        if (!this.driverPath.contentEquals(other.driverPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.flagsEx.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.installMsgHandler.hashCode()
        result = 31 * result + this.installMsgHandlerContext.hashCode()
        result = 31 * result + this.fileQueue.hashCode()
        result = 31 * result + this.classInstallReserved.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.driverPath.contentHashCode()
        return result
    }
}

public data class SpDrvinfoDataV1A(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: ByteArray = ByteArray(256),
    public var mfgName: ByteArray = ByteArray(256),
    public var providerName: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV1A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        return result
    }
}

public data class SpDrvinfoDataV1W(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: UShortArray = UShortArray(256),
    public var mfgName: UShortArray = UShortArray(256),
    public var providerName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV1W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        return result
    }
}

public data class SpDrvinfoDataV2A(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: ByteArray = ByteArray(256),
    public var mfgName: ByteArray = ByteArray(256),
    public var providerName: ByteArray = ByteArray(256),
    public var driverDate: Filetime = Filetime(),
    public var driverVersion: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV2A) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        if (this.driverDate != other.driverDate) return false
        if (this.driverVersion != other.driverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        result = 31 * result + this.driverDate.hashCode()
        result = 31 * result + this.driverVersion.hashCode()
        return result
    }
}

public data class SpDrvinfoDataV2W(
    public var cbSize: UInt = 0u,
    public var driverType: UInt = 0u,
    public var reserved: Int = 0,
    public var description: UShortArray = UShortArray(256),
    public var mfgName: UShortArray = UShortArray(256),
    public var providerName: UShortArray = UShortArray(256),
    public var driverDate: Filetime = Filetime(),
    public var driverVersion: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDataV2W) return false
        if (this.cbSize != other.cbSize) return false
        if (this.driverType != other.driverType) return false
        if (this.reserved != other.reserved) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.mfgName.contentEquals(other.mfgName)) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        if (this.driverDate != other.driverDate) return false
        if (this.driverVersion != other.driverVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.driverType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.mfgName.contentHashCode()
        result = 31 * result + this.providerName.contentHashCode()
        result = 31 * result + this.driverDate.hashCode()
        result = 31 * result + this.driverVersion.hashCode()
        return result
    }
}

public data class SpDrvinfoDetailDataA(
    public var cbSize: UInt = 0u,
    public var infDate: Filetime = Filetime(),
    public var compatIDsOffset: UInt = 0u,
    public var compatIDsLength: UInt = 0u,
    public var reserved: Int = 0,
    public var sectionName: ByteArray = ByteArray(256),
    public var infFileName: ByteArray = ByteArray(260),
    public var drvDescription: ByteArray = ByteArray(256),
    public var hardwareID: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDetailDataA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.infDate != other.infDate) return false
        if (this.compatIDsOffset != other.compatIDsOffset) return false
        if (this.compatIDsLength != other.compatIDsLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.sectionName.contentEquals(other.sectionName)) return false
        if (!this.infFileName.contentEquals(other.infFileName)) return false
        if (!this.drvDescription.contentEquals(other.drvDescription)) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.infDate.hashCode()
        result = 31 * result + this.compatIDsOffset.hashCode()
        result = 31 * result + this.compatIDsLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.sectionName.contentHashCode()
        result = 31 * result + this.infFileName.contentHashCode()
        result = 31 * result + this.drvDescription.contentHashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        return result
    }
}

public data class SpDrvinfoDetailDataW(
    public var cbSize: UInt = 0u,
    public var infDate: Filetime = Filetime(),
    public var compatIDsOffset: UInt = 0u,
    public var compatIDsLength: UInt = 0u,
    public var reserved: Int = 0,
    public var sectionName: UShortArray = UShortArray(256),
    public var infFileName: UShortArray = UShortArray(260),
    public var drvDescription: UShortArray = UShortArray(256),
    public var hardwareID: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpDrvinfoDetailDataW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.infDate != other.infDate) return false
        if (this.compatIDsOffset != other.compatIDsOffset) return false
        if (this.compatIDsLength != other.compatIDsLength) return false
        if (this.reserved != other.reserved) return false
        if (!this.sectionName.contentEquals(other.sectionName)) return false
        if (!this.infFileName.contentEquals(other.infFileName)) return false
        if (!this.drvDescription.contentEquals(other.drvDescription)) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.infDate.hashCode()
        result = 31 * result + this.compatIDsOffset.hashCode()
        result = 31 * result + this.compatIDsLength.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.sectionName.contentHashCode()
        result = 31 * result + this.infFileName.contentHashCode()
        result = 31 * result + this.drvDescription.contentHashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        return result
    }
}

public data class SpDrvinstallParams(
    public var cbSize: UInt = 0u,
    public var rank: UInt = 0u,
    public var flags: SetupDiDriverInstallFlags = 0u,
    public var privateData: Int = 0,
    public var reserved: UInt = 0u,
)

public data class SpEnableclassParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var classGuid: Guid = Guid(),
    public var enableMessage: UInt = 0u,
)

public data class SpFileCopyParamsA(
    public var cbSize: UInt = 0u,
    public var queueHandle: COpaquePointer? = null,
    public var sourceRootPath: Pcstr = null,
    public var sourcePath: Pcstr = null,
    public var sourceFilename: Pcstr = null,
    public var sourceDescription: Pcstr = null,
    public var sourceTagfile: Pcstr = null,
    public var targetDirectory: Pcstr = null,
    public var targetFilename: Pcstr = null,
    public var copyStyle: UInt = 0u,
    public var layoutInf: COpaquePointer? = null,
    public var securityDescriptor: Pcstr = null,
)

public data class SpFileCopyParamsW(
    public var cbSize: UInt = 0u,
    public var queueHandle: COpaquePointer? = null,
    public var sourceRootPath: Pcwstr = null,
    public var sourcePath: Pcwstr = null,
    public var sourceFilename: Pcwstr = null,
    public var sourceDescription: Pcwstr = null,
    public var sourceTagfile: Pcwstr = null,
    public var targetDirectory: Pcwstr = null,
    public var targetFilename: Pcwstr = null,
    public var copyStyle: UInt = 0u,
    public var layoutInf: COpaquePointer? = null,
    public var securityDescriptor: Pcwstr = null,
)

public data class SpInfInformation(
    public var infStyle: InfStyle = 0u,
    public var infCount: UInt = 0u,
    public var versionData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfInformation) return false
        if (this.infStyle != other.infStyle) return false
        if (this.infCount != other.infCount) return false
        if (!this.versionData.contentEquals(other.versionData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.infStyle.hashCode()
        result = 31 * result + this.infCount.hashCode()
        result = 31 * result + this.versionData.contentHashCode()
        return result
    }
}

public data class SpInfSignerInfoV1A(
    public var cbSize: UInt = 0u,
    public var catalogFile: ByteArray = ByteArray(260),
    public var digitalSigner: ByteArray = ByteArray(260),
    public var digitalSignerVersion: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV1A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        return result
    }
}

public data class SpInfSignerInfoV1W(
    public var cbSize: UInt = 0u,
    public var catalogFile: UShortArray = UShortArray(260),
    public var digitalSigner: UShortArray = UShortArray(260),
    public var digitalSignerVersion: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV1W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        return result
    }
}

public data class SpInfSignerInfoV2A(
    public var cbSize: UInt = 0u,
    public var catalogFile: ByteArray = ByteArray(260),
    public var digitalSigner: ByteArray = ByteArray(260),
    public var digitalSignerVersion: ByteArray = ByteArray(260),
    public var signerScore: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV2A) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        if (this.signerScore != other.signerScore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        result = 31 * result + this.signerScore.hashCode()
        return result
    }
}

public data class SpInfSignerInfoV2W(
    public var cbSize: UInt = 0u,
    public var catalogFile: UShortArray = UShortArray(260),
    public var digitalSigner: UShortArray = UShortArray(260),
    public var digitalSignerVersion: UShortArray = UShortArray(260),
    public var signerScore: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpInfSignerInfoV2W) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.catalogFile.contentEquals(other.catalogFile)) return false
        if (!this.digitalSigner.contentEquals(other.digitalSigner)) return false
        if (!this.digitalSignerVersion.contentEquals(other.digitalSignerVersion)) return false
        if (this.signerScore != other.signerScore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.catalogFile.contentHashCode()
        result = 31 * result + this.digitalSigner.contentHashCode()
        result = 31 * result + this.digitalSignerVersion.contentHashCode()
        result = 31 * result + this.signerScore.hashCode()
        return result
    }
}

public data class SpInstallwizardData(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var flags: UInt = 0u,
    public var dynamicPages: List<COpaquePointer> = List(20) { COpaquePointer(0L) },
    public var numDynamicPages: UInt = 0u,
    public var dynamicPageFlags: UInt = 0u,
    public var privateFlags: UInt = 0u,
    public var privateData: Lparam = 0L,
    public var hwndWizardDlg: Hwnd = null,
)

public data class SpNewdevicewizardData(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var flags: UInt = 0u,
    public var dynamicPages: List<COpaquePointer> = List(20) { COpaquePointer(0L) },
    public var numDynamicPages: UInt = 0u,
    public var hwndWizardDlg: Hwnd = null,
)

public data class SpOriginalFileInfoA(
    public var cbSize: UInt = 0u,
    public var originalInfName: ByteArray = ByteArray(260),
    public var originalCatalogName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpOriginalFileInfoA) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.originalInfName.contentEquals(other.originalInfName)) return false
        if (!this.originalCatalogName.contentEquals(other.originalCatalogName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.originalInfName.contentHashCode()
        result = 31 * result + this.originalCatalogName.contentHashCode()
        return result
    }
}

public data class SpOriginalFileInfoW(
    public var cbSize: UInt = 0u,
    public var originalInfName: UShortArray = UShortArray(260),
    public var originalCatalogName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpOriginalFileInfoW) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.originalInfName.contentEquals(other.originalInfName)) return false
        if (!this.originalCatalogName.contentEquals(other.originalCatalogName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.originalInfName.contentHashCode()
        result = 31 * result + this.originalCatalogName.contentHashCode()
        return result
    }
}

public data class SpPowermessagewakeParamsA(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var powerMessageWake: ByteArray = ByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpPowermessagewakeParamsA) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.powerMessageWake.contentEquals(other.powerMessageWake)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.powerMessageWake.contentHashCode()
        return result
    }
}

public data class SpPowermessagewakeParamsW(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var powerMessageWake: UShortArray = UShortArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpPowermessagewakeParamsW) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.powerMessageWake.contentEquals(other.powerMessageWake)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.powerMessageWake.contentHashCode()
        return result
    }
}

public data class SpPropchangeParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var stateChange: SetupDiStateChange = 0u,
    public var scope: SetupDiPropertyChangeScope = 0u,
    public var hwProfile: UInt = 0u,
)

public data class SpPropsheetpageRequest(
    public var cbSize: UInt = 0u,
    public var pageRequested: UInt = 0u,
    public var deviceInfoSet: Hdevinfo = 0L,
    public var deviceInfoData: SpDevinfoData? = null,
)

public data class SpRegisterControlStatusa(
    public var cbSize: UInt = 0u,
    public var fileName: Pcstr = null,
    public var win32Error: UInt = 0u,
    public var failureCode: UInt = 0u,
)

public data class SpRegisterControlStatusw(
    public var cbSize: UInt = 0u,
    public var fileName: Pcwstr = null,
    public var win32Error: UInt = 0u,
    public var failureCode: UInt = 0u,
)

public data class SpRemovedeviceParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var scope: SetupDiRemoveDeviceScope = 0u,
    public var hwProfile: UInt = 0u,
)

public data class SpSelectdeviceParamsA(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var title: ByteArray = ByteArray(60),
    public var instructions: ByteArray = ByteArray(256),
    public var listLabel: ByteArray = ByteArray(30),
    public var subTitle: ByteArray = ByteArray(256),
    public var reserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpSelectdeviceParamsA) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.title.contentEquals(other.title)) return false
        if (!this.instructions.contentEquals(other.instructions)) return false
        if (!this.listLabel.contentEquals(other.listLabel)) return false
        if (!this.subTitle.contentEquals(other.subTitle)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.title.contentHashCode()
        result = 31 * result + this.instructions.contentHashCode()
        result = 31 * result + this.listLabel.contentHashCode()
        result = 31 * result + this.subTitle.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class SpSelectdeviceParamsW(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var title: UShortArray = UShortArray(60),
    public var instructions: UShortArray = UShortArray(256),
    public var listLabel: UShortArray = UShortArray(30),
    public var subTitle: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpSelectdeviceParamsW) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.title.contentEquals(other.title)) return false
        if (!this.instructions.contentEquals(other.instructions)) return false
        if (!this.listLabel.contentEquals(other.listLabel)) return false
        if (!this.subTitle.contentEquals(other.subTitle)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.title.contentHashCode()
        result = 31 * result + this.instructions.contentHashCode()
        result = 31 * result + this.listLabel.contentHashCode()
        result = 31 * result + this.subTitle.contentHashCode()
        return result
    }
}

public data class SpTroubleshooterParamsA(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var chmFile: ByteArray = ByteArray(260),
    public var htmlTroubleShooter: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpTroubleshooterParamsA) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.chmFile.contentEquals(other.chmFile)) return false
        if (!this.htmlTroubleShooter.contentEquals(other.htmlTroubleShooter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.chmFile.contentHashCode()
        result = 31 * result + this.htmlTroubleShooter.contentHashCode()
        return result
    }
}

public data class SpTroubleshooterParamsW(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var chmFile: UShortArray = UShortArray(260),
    public var htmlTroubleShooter: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SpTroubleshooterParamsW) return false
        if (this.classInstallHeader != other.classInstallHeader) return false
        if (!this.chmFile.contentEquals(other.chmFile)) return false
        if (!this.htmlTroubleShooter.contentEquals(other.htmlTroubleShooter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.classInstallHeader.hashCode()
        result = 31 * result + this.chmFile.contentHashCode()
        result = 31 * result + this.htmlTroubleShooter.contentHashCode()
        return result
    }
}

public data class SpUnremovedeviceParams(
    public var classInstallHeader: SpClassinstallHeader = SpClassinstallHeader(),
    public var scope: UInt = 0u,
    public var hwProfile: UInt = 0u,
)
