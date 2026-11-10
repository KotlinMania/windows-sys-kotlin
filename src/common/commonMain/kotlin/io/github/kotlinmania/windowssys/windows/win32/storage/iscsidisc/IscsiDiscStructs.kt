@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.StorageDeviceNumber

public data class AtaPassThroughDirect(
    public var length: UShort = 0u,
    public var ataFlags: UShort = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reservedAsUchar: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var reservedAsUlong: UInt = 0u,
    public var dataBuffer: COpaquePointer? = null,
    public var previousTaskFile: UByteArray = UByteArray(8),
    public var currentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughDirect) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }
}

public data class AtaPassThroughDirect32(
    public var length: UShort = 0u,
    public var ataFlags: UShort = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reservedAsUchar: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var reservedAsUlong: UInt = 0u,
    public var dataBuffer: COpaquePointer? = null,
    public var previousTaskFile: UByteArray = UByteArray(8),
    public var currentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughDirect32) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }
}

public data class AtaPassThroughEx(
    public var length: UShort = 0u,
    public var ataFlags: UShort = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reservedAsUchar: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var reservedAsUlong: UInt = 0u,
    public var dataBufferOffset: Int = 0,
    public var previousTaskFile: UByteArray = UByteArray(8),
    public var currentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughEx) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }
}

public data class AtaPassThroughEx32(
    public var length: UShort = 0u,
    public var ataFlags: UShort = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reservedAsUchar: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var reservedAsUlong: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var previousTaskFile: UByteArray = UByteArray(8),
    public var currentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughEx32) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }
}

public data class DsmNotificationRequestBlock(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var notifyFlags: UInt = 0u,
    public var dataSetProfile: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
    public var dataSetRangesCount: UInt = 0u,
    public var dataSetRanges: List<MpDeviceDataSetRange> = List(1) { MpDeviceDataSetRange() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsmNotificationRequestBlock) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.notifyFlags != other.notifyFlags) return false
        if (this.dataSetProfile != other.dataSetProfile) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dataSetRangesCount != other.dataSetRangesCount) return false
        if (this.dataSetRanges != other.dataSetRanges) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.notifyFlags.hashCode()
        result = 31 * result + this.dataSetProfile.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dataSetRangesCount.hashCode()
        result = 31 * result + this.dataSetRanges.hashCode()
        return result
    }
}

public data class DumpDriver(
    public var dumpDriverList: COpaquePointer? = null,
    public var driverName: UShortArray = UShortArray(15),
    public var baseName: UShortArray = UShortArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpDriver) return false
        if (this.dumpDriverList != other.dumpDriverList) return false
        if (!this.driverName.contentEquals(other.driverName)) return false
        if (!this.baseName.contentEquals(other.baseName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dumpDriverList.hashCode()
        result = 31 * result + this.driverName.contentHashCode()
        result = 31 * result + this.baseName.contentHashCode()
        return result
    }
}

public data class DumpDriverEx(
    public var dumpDriverList: COpaquePointer? = null,
    public var driverName: UShortArray = UShortArray(15),
    public var baseName: UShortArray = UShortArray(15),
    public var driverFullPath: NtscsiUnicodeString = NtscsiUnicodeString(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpDriverEx) return false
        if (this.dumpDriverList != other.dumpDriverList) return false
        if (!this.driverName.contentEquals(other.driverName)) return false
        if (!this.baseName.contentEquals(other.baseName)) return false
        if (this.driverFullPath != other.driverFullPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dumpDriverList.hashCode()
        result = 31 * result + this.driverName.contentHashCode()
        result = 31 * result + this.baseName.contentHashCode()
        result = 31 * result + this.driverFullPath.hashCode()
        return result
    }
}

public data class DumpPointers(
    public var adapterObject: Int? = null,
    public var mappedRegisterBase: COpaquePointer? = null,
    public var dumpData: COpaquePointer? = null,
    public var commonBufferVa: COpaquePointer? = null,
    public var commonBufferPa: Long = 0L,
    public var commonBufferSize: UInt = 0u,
    public var allocateCommonBuffers: Boolean = false,
    public var useDiskDump: Boolean = false,
    public var spare1: UByteArray = UByteArray(2),
    public var deviceObject: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpPointers) return false
        if (this.adapterObject != other.adapterObject) return false
        if (this.mappedRegisterBase != other.mappedRegisterBase) return false
        if (this.dumpData != other.dumpData) return false
        if (this.commonBufferVa != other.commonBufferVa) return false
        if (this.commonBufferPa != other.commonBufferPa) return false
        if (this.commonBufferSize != other.commonBufferSize) return false
        if (this.allocateCommonBuffers != other.allocateCommonBuffers) return false
        if (this.useDiskDump != other.useDiskDump) return false
        if (!this.spare1.contentEquals(other.spare1)) return false
        if (this.deviceObject != other.deviceObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterObject.hashCode()
        result = 31 * result + this.mappedRegisterBase.hashCode()
        result = 31 * result + this.dumpData.hashCode()
        result = 31 * result + this.commonBufferVa.hashCode()
        result = 31 * result + this.commonBufferPa.hashCode()
        result = 31 * result + this.commonBufferSize.hashCode()
        result = 31 * result + this.allocateCommonBuffers.hashCode()
        result = 31 * result + this.useDiskDump.hashCode()
        result = 31 * result + this.spare1.contentHashCode()
        result = 31 * result + this.deviceObject.hashCode()
        return result
    }
}

public data class DumpPointersEx(
    public var header: DumpPointersVersion = DumpPointersVersion(),
    public var dumpData: COpaquePointer? = null,
    public var commonBufferVa: COpaquePointer? = null,
    public var commonBufferSize: UInt = 0u,
    public var allocateCommonBuffers: Boolean = false,
    public var deviceObject: COpaquePointer? = null,
    public var driverList: COpaquePointer? = null,
    public var dwPortFlags: UInt = 0u,
    public var maxDeviceDumpSectionSize: UInt = 0u,
    public var maxDeviceDumpLevel: UInt = 0u,
    public var maxTransferSize: UInt = 0u,
    public var adapterObject: COpaquePointer? = null,
    public var mappedRegisterBase: COpaquePointer? = null,
    public var deviceReady: Boolean? = null,
    public var dumpDevicePowerOn: PdumpDevicePoweronRoutine = null,
    public var dumpDevicePowerOnContext: COpaquePointer? = null,
)

public data class DumpPointersVersion(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
)

public data class FirmwareRequestBlock(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var function: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var dataBufferLength: UInt = 0u,
)

public data class HybridDemoteBySize(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var sourcePriority: UByte = 0u,
    public var targetPriority: UByte = 0u,
    public var reserved0: UShort = 0u,
    public var reserved1: UInt = 0u,
    public var lbaCount: ULong = 0uL,
)

public data class HybridDirtyThresholds(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var dirtyLowThreshold: UInt = 0u,
    public var dirtyHighThreshold: UInt = 0u,
)

public data class HybridInformation(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var hybridSupported: Boolean = false,
    public var status: NvcacheStatus = 0,
    public var cacheTypeEffective: NvcacheType = 0,
    public var cacheTypeDefault: NvcacheType = 0,
    public var fractionBase: UInt = 0u,
    public var cacheSize: ULong = 0uL,
    public var attributes: HybridInformation0 = HybridInformation0(),
    public var priorities: HybridInformation1 = HybridInformation1(),
)

public data class HybridInformation0(
    public var bitfield: UInt = 0u,
)

public data class HybridInformation1(
    public var priorityLevelCount: UByte = 0u,
    public var maxPriorityBehavior: Boolean = false,
    public var optimalWriteGranularity: UByte = 0u,
    public var reserved: UByte = 0u,
    public var dirtyThresholdLow: UInt = 0u,
    public var dirtyThresholdHigh: UInt = 0u,
    public var supportedCommands: HybridInformation10 = HybridInformation10(),
    public var priority: List<NvcachePriorityLevelDescriptor> = List(1) { NvcachePriorityLevelDescriptor() },
)

public data class HybridInformation10(
    public var bitfield: UInt = 0u,
    public var maxEvictCommands: UInt = 0u,
    public var maxLbaRangeCountForEvict: UInt = 0u,
    public var maxLbaRangeCountForChangeLba: UInt = 0u,
)

public data class HybridRequestBlock(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var function: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var dataBufferLength: UInt = 0u,
)

public data class IdeIoControl(
    public var headerLength: UInt = 0u,
    public var signature: UByteArray = UByteArray(8),
    public var timeout: UInt = 0u,
    public var controlCode: UInt = 0u,
    public var returnStatus: UInt = 0u,
    public var dataLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IdeIoControl) return false
        if (this.headerLength != other.headerLength) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.timeout != other.timeout) return false
        if (this.controlCode != other.controlCode) return false
        if (this.returnStatus != other.returnStatus) return false
        if (this.dataLength != other.dataLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.headerLength.hashCode()
        result = 31 * result + this.signature.contentHashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.controlCode.hashCode()
        result = 31 * result + this.returnStatus.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        return result
    }
}

public data class IkeAuthenticationInformation(
    public var authMethod: IkeAuthenticationMethod = 0,
    public var anonymous: IkeAuthenticationInformation0 = IkeAuthenticationInformation0(),
)

public data class IkeAuthenticationInformation0(
    public var psKey: IkeAuthenticationPresharedKey = IkeAuthenticationPresharedKey(),
)

public data class IkeAuthenticationPresharedKey(
    public var securityFlags: ULong = 0uL,
    public var idType: UByte = 0u,
    public var idLengthInBytes: UInt = 0u,
    public var id: COpaquePointer? = null,
    public var keyLengthInBytes: UInt = 0u,
    public var key: COpaquePointer? = null,
)

public data class IoScsiCapabilities(
    public var length: UInt = 0u,
    public var maximumTransferLength: UInt = 0u,
    public var maximumPhysicalPages: UInt = 0u,
    public var supportedAsynchronousEvents: UInt = 0u,
    public var alignmentMask: UInt = 0u,
    public var taggedQueuing: Boolean = false,
    public var adapterScansDown: Boolean = false,
    public var adapterUsesPio: Boolean = false,
)

public data class IscsiConnectionInfoa(
    public var connectionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var initiatorAddress: Pstr = null,
    public var targetAddress: Pstr = null,
    public var initiatorSocket: UShort = 0u,
    public var targetSocket: UShort = 0u,
    public var cid: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiConnectionInfoa) return false
        if (this.connectionId != other.connectionId) return false
        if (this.initiatorAddress != other.initiatorAddress) return false
        if (this.targetAddress != other.targetAddress) return false
        if (this.initiatorSocket != other.initiatorSocket) return false
        if (this.targetSocket != other.targetSocket) return false
        if (!this.cid.contentEquals(other.cid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionId.hashCode()
        result = 31 * result + this.initiatorAddress.hashCode()
        result = 31 * result + this.targetAddress.hashCode()
        result = 31 * result + this.initiatorSocket.hashCode()
        result = 31 * result + this.targetSocket.hashCode()
        result = 31 * result + this.cid.contentHashCode()
        return result
    }
}

public data class IscsiConnectionInfow(
    public var connectionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var initiatorAddress: Pwstr = null,
    public var targetAddress: Pwstr = null,
    public var initiatorSocket: UShort = 0u,
    public var targetSocket: UShort = 0u,
    public var cid: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiConnectionInfow) return false
        if (this.connectionId != other.connectionId) return false
        if (this.initiatorAddress != other.initiatorAddress) return false
        if (this.targetAddress != other.targetAddress) return false
        if (this.initiatorSocket != other.initiatorSocket) return false
        if (this.targetSocket != other.targetSocket) return false
        if (!this.cid.contentEquals(other.cid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionId.hashCode()
        result = 31 * result + this.initiatorAddress.hashCode()
        result = 31 * result + this.targetAddress.hashCode()
        result = 31 * result + this.initiatorSocket.hashCode()
        result = 31 * result + this.targetSocket.hashCode()
        result = 31 * result + this.cid.contentHashCode()
        return result
    }
}

public data class IscsiConnectionInfoEx(
    public var connectionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var state: UByte = 0u,
    public var protocol: UByte = 0u,
    public var headerDigest: UByte = 0u,
    public var dataDigest: UByte = 0u,
    public var maxRecvDataSegmentLength: UInt = 0u,
    public var authType: IscsiAuthTypes = 0,
    public var estimatedThroughput: ULong = 0uL,
    public var maxDatagramSize: UInt = 0u,
)

public data class IscsiDeviceOnSessiona(
    public var initiatorName: ByteArray = ByteArray(256),
    public var targetName: ByteArray = ByteArray(224),
    public var scsiAddress: ScsiAddress = ScsiAddress(),
    public var deviceInterfaceType: Guid = Guid(),
    public var deviceInterfaceName: ByteArray = ByteArray(260),
    public var legacyName: ByteArray = ByteArray(260),
    public var storageDeviceNumber: StorageDeviceNumber = StorageDeviceNumber(),
    public var deviceInstance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiDeviceOnSessiona) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.scsiAddress != other.scsiAddress) return false
        if (this.deviceInterfaceType != other.deviceInterfaceType) return false
        if (!this.deviceInterfaceName.contentEquals(other.deviceInterfaceName)) return false
        if (!this.legacyName.contentEquals(other.legacyName)) return false
        if (this.storageDeviceNumber != other.storageDeviceNumber) return false
        if (this.deviceInstance != other.deviceInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.scsiAddress.hashCode()
        result = 31 * result + this.deviceInterfaceType.hashCode()
        result = 31 * result + this.deviceInterfaceName.contentHashCode()
        result = 31 * result + this.legacyName.contentHashCode()
        result = 31 * result + this.storageDeviceNumber.hashCode()
        result = 31 * result + this.deviceInstance.hashCode()
        return result
    }
}

public data class IscsiDeviceOnSessionw(
    public var initiatorName: UShortArray = UShortArray(256),
    public var targetName: UShortArray = UShortArray(224),
    public var scsiAddress: ScsiAddress = ScsiAddress(),
    public var deviceInterfaceType: Guid = Guid(),
    public var deviceInterfaceName: UShortArray = UShortArray(260),
    public var legacyName: UShortArray = UShortArray(260),
    public var storageDeviceNumber: StorageDeviceNumber = StorageDeviceNumber(),
    public var deviceInstance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiDeviceOnSessionw) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.scsiAddress != other.scsiAddress) return false
        if (this.deviceInterfaceType != other.deviceInterfaceType) return false
        if (!this.deviceInterfaceName.contentEquals(other.deviceInterfaceName)) return false
        if (!this.legacyName.contentEquals(other.legacyName)) return false
        if (this.storageDeviceNumber != other.storageDeviceNumber) return false
        if (this.deviceInstance != other.deviceInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.scsiAddress.hashCode()
        result = 31 * result + this.deviceInterfaceType.hashCode()
        result = 31 * result + this.deviceInterfaceName.contentHashCode()
        result = 31 * result + this.legacyName.contentHashCode()
        result = 31 * result + this.storageDeviceNumber.hashCode()
        result = 31 * result + this.deviceInstance.hashCode()
        return result
    }
}

public data class IscsiLoginOptions(
    public var version: UInt = 0u,
    public var informationSpecified: UInt = 0u,
    public var loginFlags: UInt = 0u,
    public var authType: IscsiAuthTypes = 0,
    public var headerDigest: IscsiDigestTypes = 0,
    public var dataDigest: IscsiDigestTypes = 0,
    public var maximumConnections: UInt = 0u,
    public var defaultTime2Wait: UInt = 0u,
    public var defaultTime2Retain: UInt = 0u,
    public var usernameLength: UInt = 0u,
    public var passwordLength: UInt = 0u,
    public var username: COpaquePointer? = null,
    public var password: COpaquePointer? = null,
)

public data class IscsiSessionInfoa(
    public var sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var initiatorName: Pstr = null,
    public var targetNodeName: Pstr = null,
    public var targetName: Pstr = null,
    public var isid: UByteArray = UByteArray(6),
    public var tsid: UByteArray = UByteArray(2),
    public var connectionCount: UInt = 0u,
    public var connections: IscsiConnectionInfoa? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiSessionInfoa) return false
        if (this.sessionId != other.sessionId) return false
        if (this.initiatorName != other.initiatorName) return false
        if (this.targetNodeName != other.targetNodeName) return false
        if (this.targetName != other.targetName) return false
        if (!this.isid.contentEquals(other.isid)) return false
        if (!this.tsid.contentEquals(other.tsid)) return false
        if (this.connectionCount != other.connectionCount) return false
        if (this.connections != other.connections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.initiatorName.hashCode()
        result = 31 * result + this.targetNodeName.hashCode()
        result = 31 * result + this.targetName.hashCode()
        result = 31 * result + this.isid.contentHashCode()
        result = 31 * result + this.tsid.contentHashCode()
        result = 31 * result + this.connectionCount.hashCode()
        result = 31 * result + this.connections.hashCode()
        return result
    }
}

public data class IscsiSessionInfow(
    public var sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var initiatorName: Pwstr = null,
    public var targetNodeName: Pwstr = null,
    public var targetName: Pwstr = null,
    public var isid: UByteArray = UByteArray(6),
    public var tsid: UByteArray = UByteArray(2),
    public var connectionCount: UInt = 0u,
    public var connections: IscsiConnectionInfow? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiSessionInfow) return false
        if (this.sessionId != other.sessionId) return false
        if (this.initiatorName != other.initiatorName) return false
        if (this.targetNodeName != other.targetNodeName) return false
        if (this.targetName != other.targetName) return false
        if (!this.isid.contentEquals(other.isid)) return false
        if (!this.tsid.contentEquals(other.tsid)) return false
        if (this.connectionCount != other.connectionCount) return false
        if (this.connections != other.connections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.initiatorName.hashCode()
        result = 31 * result + this.targetNodeName.hashCode()
        result = 31 * result + this.targetName.hashCode()
        result = 31 * result + this.isid.contentHashCode()
        result = 31 * result + this.tsid.contentHashCode()
        result = 31 * result + this.connectionCount.hashCode()
        result = 31 * result + this.connections.hashCode()
        return result
    }
}

public data class IscsiSessionInfoEx(
    public var sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var initialR2t: Boolean = false,
    public var immediateData: Boolean = false,
    public var type: UByte = 0u,
    public var dataSequenceInOrder: Boolean = false,
    public var dataPduInOrder: Boolean = false,
    public var errorRecoveryLevel: UByte = 0u,
    public var maxOutstandingR2t: UInt = 0u,
    public var firstBurstLength: UInt = 0u,
    public var maxBurstLength: UInt = 0u,
    public var maximumConnections: UInt = 0u,
    public var connectionCount: UInt = 0u,
    public var connections: IscsiConnectionInfoEx? = null,
)

public data class IscsiTargetMappinga(
    public var initiatorName: ByteArray = ByteArray(256),
    public var targetName: ByteArray = ByteArray(224),
    public var oSDeviceName: ByteArray = ByteArray(260),
    public var sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var oSBusNumber: UInt = 0u,
    public var oSTargetNumber: UInt = 0u,
    public var lUNCount: UInt = 0u,
    public var lUNList: ScsiLunList? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetMappinga) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (!this.oSDeviceName.contentEquals(other.oSDeviceName)) return false
        if (this.sessionId != other.sessionId) return false
        if (this.oSBusNumber != other.oSBusNumber) return false
        if (this.oSTargetNumber != other.oSTargetNumber) return false
        if (this.lUNCount != other.lUNCount) return false
        if (this.lUNList != other.lUNList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.oSDeviceName.contentHashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.oSBusNumber.hashCode()
        result = 31 * result + this.oSTargetNumber.hashCode()
        result = 31 * result + this.lUNCount.hashCode()
        result = 31 * result + this.lUNList.hashCode()
        return result
    }
}

public data class IscsiTargetMappingw(
    public var initiatorName: UShortArray = UShortArray(256),
    public var targetName: UShortArray = UShortArray(224),
    public var oSDeviceName: UShortArray = UShortArray(260),
    public var sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var oSBusNumber: UInt = 0u,
    public var oSTargetNumber: UInt = 0u,
    public var lUNCount: UInt = 0u,
    public var lUNList: ScsiLunList? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetMappingw) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (!this.oSDeviceName.contentEquals(other.oSDeviceName)) return false
        if (this.sessionId != other.sessionId) return false
        if (this.oSBusNumber != other.oSBusNumber) return false
        if (this.oSTargetNumber != other.oSTargetNumber) return false
        if (this.lUNCount != other.lUNCount) return false
        if (this.lUNList != other.lUNList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.oSDeviceName.contentHashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.oSBusNumber.hashCode()
        result = 31 * result + this.oSTargetNumber.hashCode()
        result = 31 * result + this.lUNCount.hashCode()
        result = 31 * result + this.lUNList.hashCode()
        return result
    }
}

public data class IscsiTargetPortala(
    public var symbolicName: ByteArray = ByteArray(256),
    public var address: ByteArray = ByteArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortala) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }
}

public data class IscsiTargetPortalw(
    public var symbolicName: UShortArray = UShortArray(256),
    public var address: UShortArray = UShortArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalw) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }
}

public data class IscsiTargetPortalGroupa(
    public var count: UInt = 0u,
    public var portals: List<IscsiTargetPortala> = List(1) { IscsiTargetPortala() },
)

public data class IscsiTargetPortalGroupw(
    public var count: UInt = 0u,
    public var portals: List<IscsiTargetPortalw> = List(1) { IscsiTargetPortalw() },
)

public data class IscsiTargetPortalInfoa(
    public var initiatorName: ByteArray = ByteArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: ByteArray = ByteArray(256),
    public var address: ByteArray = ByteArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfoa) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }
}

public data class IscsiTargetPortalInfow(
    public var initiatorName: UShortArray = UShortArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: UShortArray = UShortArray(256),
    public var address: UShortArray = UShortArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfow) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }
}

public data class IscsiTargetPortalInfoExa(
    public var initiatorName: ByteArray = ByteArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: ByteArray = ByteArray(256),
    public var address: ByteArray = ByteArray(256),
    public var socket: UShort = 0u,
    public var securityFlags: ULong = 0uL,
    public var loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfoExa) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }
}

public data class IscsiTargetPortalInfoExw(
    public var initiatorName: UShortArray = UShortArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: UShortArray = UShortArray(256),
    public var address: UShortArray = UShortArray(256),
    public var socket: UShort = 0u,
    public var securityFlags: ULong = 0uL,
    public var loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfoExw) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }
}

public data class IscsiUniqueSessionId(
    public var adapterUnique: ULong = 0uL,
    public var adapterSpecific: ULong = 0uL,
)

public data class IscsiVersionInfo(
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var buildNumber: UInt = 0u,
)

public data class MpioPassThroughPath(
    public var passThrough: ScsiPassThrough = ScsiPassThrough(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpioPassThroughPath32(
    public var passThrough: ScsiPassThrough32 = ScsiPassThrough32(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpioPassThroughPath32Ex(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpioPassThroughPathDirect(
    public var passThrough: ScsiPassThroughDirect = ScsiPassThroughDirect(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpioPassThroughPathDirect32(
    public var passThrough: ScsiPassThroughDirect32 = ScsiPassThroughDirect32(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpioPassThroughPathDirect32Ex(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpioPassThroughPathDirectEx(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpioPassThroughPathEx(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
)

public data class MpDeviceDataSetRange(
    public var startingOffset: Long = 0L,
    public var lengthInBytes: ULong = 0uL,
)

public data class NtscsiUnicodeString(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: Pwstr = null,
)

public data class NvcacheHintPayload(
    public var command: UByte = 0u,
    public var feature70: UByte = 0u,
    public var feature158: UByte = 0u,
    public var count158: UByte = 0u,
    public var lba70: UByte = 0u,
    public var lba158: UByte = 0u,
    public var lba2316: UByte = 0u,
    public var lba3124: UByte = 0u,
    public var lba3932: UByte = 0u,
    public var lba4740: UByte = 0u,
    public var auxiliary70: UByte = 0u,
    public var auxiliary2316: UByte = 0u,
    public var reserved: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvcacheHintPayload) return false
        if (this.command != other.command) return false
        if (this.feature70 != other.feature70) return false
        if (this.feature158 != other.feature158) return false
        if (this.count158 != other.count158) return false
        if (this.lba70 != other.lba70) return false
        if (this.lba158 != other.lba158) return false
        if (this.lba2316 != other.lba2316) return false
        if (this.lba3124 != other.lba3124) return false
        if (this.lba3932 != other.lba3932) return false
        if (this.lba4740 != other.lba4740) return false
        if (this.auxiliary70 != other.auxiliary70) return false
        if (this.auxiliary2316 != other.auxiliary2316) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.command.hashCode()
        result = 31 * result + this.feature70.hashCode()
        result = 31 * result + this.feature158.hashCode()
        result = 31 * result + this.count158.hashCode()
        result = 31 * result + this.lba70.hashCode()
        result = 31 * result + this.lba158.hashCode()
        result = 31 * result + this.lba2316.hashCode()
        result = 31 * result + this.lba3124.hashCode()
        result = 31 * result + this.lba3932.hashCode()
        result = 31 * result + this.lba4740.hashCode()
        result = 31 * result + this.auxiliary70.hashCode()
        result = 31 * result + this.auxiliary2316.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class NvcachePriorityLevelDescriptor(
    public var priorityLevel: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var consumedNVMSizeFraction: UInt = 0u,
    public var consumedMappingResourcesFraction: UInt = 0u,
    public var consumedNVMSizeForDirtyDataFraction: UInt = 0u,
    public var consumedMappingResourcesForDirtyDataFraction: UInt = 0u,
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvcachePriorityLevelDescriptor) return false
        if (this.priorityLevel != other.priorityLevel) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.consumedNVMSizeFraction != other.consumedNVMSizeFraction) return false
        if (this.consumedMappingResourcesFraction != other.consumedMappingResourcesFraction) return false
        if (this.consumedNVMSizeForDirtyDataFraction != other.consumedNVMSizeForDirtyDataFraction) return false
        if (this.consumedMappingResourcesForDirtyDataFraction != other.consumedMappingResourcesForDirtyDataFraction) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priorityLevel.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.consumedNVMSizeFraction.hashCode()
        result = 31 * result + this.consumedMappingResourcesFraction.hashCode()
        result = 31 * result + this.consumedNVMSizeForDirtyDataFraction.hashCode()
        result = 31 * result + this.consumedMappingResourcesForDirtyDataFraction.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }
}

public data class NvcacheRequestBlock(
    public var nRBSize: UInt = 0u,
    public var function: UShort = 0u,
    public var nRBFlags: UInt = 0u,
    public var nRBStatus: UInt = 0u,
    public var count: UInt = 0u,
    public var lba: ULong = 0uL,
    public var dataBufSize: UInt = 0u,
    public var nVCacheStatus: UInt = 0u,
    public var nVCacheSubStatus: UInt = 0u,
)

public data class NvFeatureParameter(
    public var nVPowerModeEnabled: UShort = 0u,
    public var nVParameterReserv1: UShort = 0u,
    public var nVCmdEnabled: UShort = 0u,
    public var nVParameterReserv2: UShort = 0u,
    public var nVPowerModeVer: UShort = 0u,
    public var nVCmdVer: UShort = 0u,
    public var nVSize: UInt = 0u,
    public var nVReadSpeed: UShort = 0u,
    public var nVWrtSpeed: UShort = 0u,
    public var deviceSpinUpTime: UInt = 0u,
)

public data class NvSepCacheParameter(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: NvSepCacheParameter0 = NvSepCacheParameter0(),
    public var writeCacheType: UByte = 0u,
    public var writeCacheTypeEffective: UByte = 0u,
    public var parameterReserve1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvSepCacheParameter) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.writeCacheType != other.writeCacheType) return false
        if (this.writeCacheTypeEffective != other.writeCacheTypeEffective) return false
        if (!this.parameterReserve1.contentEquals(other.parameterReserve1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.writeCacheType.hashCode()
        result = 31 * result + this.writeCacheTypeEffective.hashCode()
        result = 31 * result + this.parameterReserve1.contentHashCode()
        return result
    }
}

public data class NvSepCacheParameter0(
    public var cacheFlags: NvSepCacheParameter00 = NvSepCacheParameter00(),
    public var cacheFlagsSet: UByte = 0u,
)

public data class NvSepCacheParameter00(
    public var bitfield: UByte = 0u,
)

public data class PersistentIscsiLoginInfoa(
    public var targetName: ByteArray = ByteArray(224),
    public var isInformationalSession: Boolean = false,
    public var initiatorInstance: ByteArray = ByteArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var targetPortal: IscsiTargetPortala = IscsiTargetPortala(),
    public var securityFlags: ULong = 0uL,
    public var mappings: IscsiTargetMappinga? = null,
    public var loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersistentIscsiLoginInfoa) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.isInformationalSession != other.isInformationalSession) return false
        if (!this.initiatorInstance.contentEquals(other.initiatorInstance)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (this.targetPortal != other.targetPortal) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.mappings != other.mappings) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetName.contentHashCode()
        result = 31 * result + this.isInformationalSession.hashCode()
        result = 31 * result + this.initiatorInstance.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.targetPortal.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.mappings.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }
}

public data class PersistentIscsiLoginInfow(
    public var targetName: UShortArray = UShortArray(224),
    public var isInformationalSession: Boolean = false,
    public var initiatorInstance: UShortArray = UShortArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var targetPortal: IscsiTargetPortalw = IscsiTargetPortalw(),
    public var securityFlags: ULong = 0uL,
    public var mappings: IscsiTargetMappingw? = null,
    public var loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersistentIscsiLoginInfow) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.isInformationalSession != other.isInformationalSession) return false
        if (!this.initiatorInstance.contentEquals(other.initiatorInstance)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (this.targetPortal != other.targetPortal) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.mappings != other.mappings) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetName.contentHashCode()
        result = 31 * result + this.isInformationalSession.hashCode()
        result = 31 * result + this.initiatorInstance.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.targetPortal.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.mappings.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }
}

public data class ScsiAdapterBusInfo(
    public var numberOfBuses: UByte = 0u,
    public var busData: List<ScsiBusData> = List(1) { ScsiBusData() },
)

public data class ScsiAddress(
    public var length: UInt = 0u,
    public var portNumber: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
)

public data class ScsiBusData(
    public var numberOfLogicalUnits: UByte = 0u,
    public var initiatorBusId: UByte = 0u,
    public var inquiryDataOffset: UInt = 0u,
)

public data class ScsiInquiryData(
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var deviceClaimed: Boolean = false,
    public var inquiryDataLength: UInt = 0u,
    public var nextInquiryDataOffset: UInt = 0u,
    public var inquiryData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiInquiryData) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.deviceClaimed != other.deviceClaimed) return false
        if (this.inquiryDataLength != other.inquiryDataLength) return false
        if (this.nextInquiryDataOffset != other.nextInquiryDataOffset) return false
        if (!this.inquiryData.contentEquals(other.inquiryData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.deviceClaimed.hashCode()
        result = 31 * result + this.inquiryDataLength.hashCode()
        result = 31 * result + this.nextInquiryDataOffset.hashCode()
        result = 31 * result + this.inquiryData.contentHashCode()
        return result
    }
}

public data class ScsiLunList(
    public var oslun: UInt = 0u,
    public var targetLUN: ULong = 0uL,
)

public data class ScsiPassThrough(
    public var length: UShort = 0u,
    public var scsiStatus: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var cdbLength: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataIn: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var dataBufferOffset: Int = 0,
    public var senseInfoOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThrough) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class ScsiPassThrough32(
    public var length: UShort = 0u,
    public var scsiStatus: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var cdbLength: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataIn: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThrough32) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class ScsiPassThrough32Ex(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var cdbLength: UInt = 0u,
    public var storAddressLength: UInt = 0u,
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataDirection: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timeOutValue: UInt = 0u,
    public var storAddressOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var dataOutTransferLength: UInt = 0u,
    public var dataInTransferLength: UInt = 0u,
    public var dataOutBufferOffset: UInt = 0u,
    public var dataInBufferOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThrough32Ex) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBufferOffset != other.dataOutBufferOffset) return false
        if (this.dataInBufferOffset != other.dataInBufferOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBufferOffset.hashCode()
        result = 31 * result + this.dataInBufferOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class ScsiPassThroughDirect(
    public var length: UShort = 0u,
    public var scsiStatus: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var cdbLength: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataIn: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var dataBuffer: COpaquePointer? = null,
    public var senseInfoOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirect) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class ScsiPassThroughDirect32(
    public var length: UShort = 0u,
    public var scsiStatus: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var cdbLength: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataIn: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var dataBuffer: COpaquePointer? = null,
    public var senseInfoOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirect32) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class ScsiPassThroughDirect32Ex(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var cdbLength: UInt = 0u,
    public var storAddressLength: UInt = 0u,
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataDirection: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timeOutValue: UInt = 0u,
    public var storAddressOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var dataOutTransferLength: UInt = 0u,
    public var dataInTransferLength: UInt = 0u,
    public var dataOutBuffer: COpaquePointer? = null,
    public var dataInBuffer: COpaquePointer? = null,
    public var cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirect32Ex) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBuffer != other.dataOutBuffer) return false
        if (this.dataInBuffer != other.dataInBuffer) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBuffer.hashCode()
        result = 31 * result + this.dataInBuffer.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class ScsiPassThroughDirectEx(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var cdbLength: UInt = 0u,
    public var storAddressLength: UInt = 0u,
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataDirection: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timeOutValue: UInt = 0u,
    public var storAddressOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var dataOutTransferLength: UInt = 0u,
    public var dataInTransferLength: UInt = 0u,
    public var dataOutBuffer: COpaquePointer? = null,
    public var dataInBuffer: COpaquePointer? = null,
    public var cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirectEx) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBuffer != other.dataOutBuffer) return false
        if (this.dataInBuffer != other.dataInBuffer) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBuffer.hashCode()
        result = 31 * result + this.dataInBuffer.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class ScsiPassThroughEx(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var cdbLength: UInt = 0u,
    public var storAddressLength: UInt = 0u,
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataDirection: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timeOutValue: UInt = 0u,
    public var storAddressOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var dataOutTransferLength: UInt = 0u,
    public var dataInTransferLength: UInt = 0u,
    public var dataOutBufferOffset: Int = 0,
    public var dataInBufferOffset: Int = 0,
    public var cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughEx) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBufferOffset != other.dataOutBufferOffset) return false
        if (this.dataInBufferOffset != other.dataInBufferOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBufferOffset.hashCode()
        result = 31 * result + this.dataInBufferOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }
}

public data class SrbIoControl(
    public var headerLength: UInt = 0u,
    public var signature: UByteArray = UByteArray(8),
    public var timeout: UInt = 0u,
    public var controlCode: UInt = 0u,
    public var returnCode: UInt = 0u,
    public var length: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SrbIoControl) return false
        if (this.headerLength != other.headerLength) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.timeout != other.timeout) return false
        if (this.controlCode != other.controlCode) return false
        if (this.returnCode != other.returnCode) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.headerLength.hashCode()
        result = 31 * result + this.signature.contentHashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.controlCode.hashCode()
        result = 31 * result + this.returnCode.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }
}

public data class StorageDiagnosticMpRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var targetType: MpStorageDiagnosticTargetType = 0,
    public var level: MpStorageDiagnosticLevel = 0,
    public var providerId: Guid = Guid(),
    public var bufferSize: UInt = 0u,
    public var reserved: UInt = 0u,
    public var dataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDiagnosticMpRequest) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.targetType != other.targetType) return false
        if (this.level != other.level) return false
        if (this.providerId != other.providerId) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.reserved != other.reserved) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.targetType.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.providerId.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }
}

public data class StorageEnduranceDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var enduranceInfo: StorageEnduranceInfo = StorageEnduranceInfo(),
)

public data class StorageEnduranceInfo(
    public var validFields: UInt = 0u,
    public var groupId: UInt = 0u,
    public var flags: StorageEnduranceInfo0 = StorageEnduranceInfo0(),
    public var lifePercentage: UInt = 0u,
    public var bytesReadCount: UByteArray = UByteArray(16),
    public var byteWriteCount: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageEnduranceInfo) return false
        if (this.validFields != other.validFields) return false
        if (this.groupId != other.groupId) return false
        if (this.flags != other.flags) return false
        if (this.lifePercentage != other.lifePercentage) return false
        if (!this.bytesReadCount.contentEquals(other.bytesReadCount)) return false
        if (!this.byteWriteCount.contentEquals(other.byteWriteCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validFields.hashCode()
        result = 31 * result + this.groupId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lifePercentage.hashCode()
        result = 31 * result + this.bytesReadCount.contentHashCode()
        result = 31 * result + this.byteWriteCount.contentHashCode()
        return result
    }
}

public data class StorageEnduranceInfo0(
    public var bitfield: UInt = 0u,
)

public data class StorageFirmwareActivate(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var slotToActivate: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareActivate) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.slotToActivate != other.slotToActivate) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.slotToActivate.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }
}

public data class StorageFirmwareDownload(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareDownload) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }
}

public data class StorageFirmwareDownloadV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var imageSize: UInt = 0u,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareDownloadV2) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.imageSize != other.imageSize) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }
}

public data class StorageFirmwareInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var upgradeSupport: Boolean = false,
    public var slotCount: UByte = 0u,
    public var activeSlot: UByte = 0u,
    public var pendingActivateSlot: UByte = 0u,
    public var reserved: UInt = 0u,
    public var slot: List<StorageFirmwareSlotInfo> = List(1) { StorageFirmwareSlotInfo() },
)

public data class StorageFirmwareInfoV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var upgradeSupport: Boolean = false,
    public var slotCount: UByte = 0u,
    public var activeSlot: UByte = 0u,
    public var pendingActivateSlot: UByte = 0u,
    public var firmwareShared: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
    public var imagePayloadAlignment: UInt = 0u,
    public var imagePayloadMaxSize: UInt = 0u,
    public var slot: List<StorageFirmwareSlotInfoV2> = List(1) { StorageFirmwareSlotInfoV2() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareInfoV2) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.upgradeSupport != other.upgradeSupport) return false
        if (this.slotCount != other.slotCount) return false
        if (this.activeSlot != other.activeSlot) return false
        if (this.pendingActivateSlot != other.pendingActivateSlot) return false
        if (this.firmwareShared != other.firmwareShared) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.imagePayloadAlignment != other.imagePayloadAlignment) return false
        if (this.imagePayloadMaxSize != other.imagePayloadMaxSize) return false
        if (this.slot != other.slot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.upgradeSupport.hashCode()
        result = 31 * result + this.slotCount.hashCode()
        result = 31 * result + this.activeSlot.hashCode()
        result = 31 * result + this.pendingActivateSlot.hashCode()
        result = 31 * result + this.firmwareShared.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.imagePayloadAlignment.hashCode()
        result = 31 * result + this.imagePayloadMaxSize.hashCode()
        result = 31 * result + this.slot.hashCode()
        return result
    }
}

public data class StorageFirmwareSlotInfo(
    public var slotNumber: UByte = 0u,
    public var readOnly: Boolean = false,
    public var reserved: UByteArray = UByteArray(6),
    public var revision: StorageFirmwareSlotInfo0 = StorageFirmwareSlotInfo0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareSlotInfo) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.readOnly != other.readOnly) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.revision != other.revision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.slotNumber.hashCode()
        result = 31 * result + this.readOnly.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.revision.hashCode()
        return result
    }
}

public data class StorageFirmwareSlotInfo0(
    public var info: UByteArray = UByteArray(8),
    public var asUlonglong: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareSlotInfo0) return false
        if (!this.info.contentEquals(other.info)) return false
        if (this.asUlonglong != other.asUlonglong) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.contentHashCode()
        result = 31 * result + this.asUlonglong.hashCode()
        return result
    }
}

public data class StorageFirmwareSlotInfoV2(
    public var slotNumber: UByte = 0u,
    public var readOnly: Boolean = false,
    public var reserved: UByteArray = UByteArray(6),
    public var revision: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareSlotInfoV2) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.readOnly != other.readOnly) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.slotNumber.hashCode()
        result = 31 * result + this.readOnly.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        return result
    }
}
