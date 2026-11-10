@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.dvd

import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class AacsBindingNonce(
    public var bindingNonce: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsBindingNonce) return false
        if (!this.bindingNonce.contentEquals(other.bindingNonce)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bindingNonce.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }
}

public data class AacsCertificate(
    public var nonce: UByteArray = UByteArray(20),
    public var certificate: UByteArray = UByteArray(92),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsCertificate) return false
        if (!this.nonce.contentEquals(other.nonce)) return false
        if (!this.certificate.contentEquals(other.certificate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nonce.contentHashCode()
        result = 31 * result + this.certificate.contentHashCode()
        return result
    }
}

public data class AacsChallengeKey(
    public var ellipticCurvePoint: UByteArray = UByteArray(40),
    public var signature: UByteArray = UByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsChallengeKey) return false
        if (!this.ellipticCurvePoint.contentEquals(other.ellipticCurvePoint)) return false
        if (!this.signature.contentEquals(other.signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ellipticCurvePoint.contentHashCode()
        result = 31 * result + this.signature.contentHashCode()
        return result
    }
}

public data class AacsMediaId(
    public var mediaID: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsMediaId) return false
        if (!this.mediaID.contentEquals(other.mediaID)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mediaID.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }
}

public data class AacsReadBindingNonce(
    public var sessionId: UInt = 0u,
    public var numberOfSectors: UInt = 0u,
    public var startLba: ULong = 0uL,
    public var anonymous: AacsReadBindingNonce0 = AacsReadBindingNonce0(),
)

public data class AacsReadBindingNonce0(
    public var handle: Handle = null,
    public var forceStructureLengthToMatch64bit: ULong = 0uL,
)

public data class AacsSendCertificate(
    public var sessionId: UInt = 0u,
    public var certificate: AacsCertificate = AacsCertificate(),
)

public data class AacsSendChallengeKey(
    public var sessionId: UInt = 0u,
    public var challengeKey: AacsChallengeKey = AacsChallengeKey(),
)

public data class AacsSerialNumber(
    public var prerecordedSerialNumber: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsSerialNumber) return false
        if (!this.prerecordedSerialNumber.contentEquals(other.prerecordedSerialNumber)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prerecordedSerialNumber.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }
}

public data class AacsVolumeId(
    public var volumeID: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsVolumeId) return false
        if (!this.volumeID.contentEquals(other.volumeID)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeID.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }
}

public data class BdDiscWriteProtectPac(
    public var header: BdPacHeader = BdPacHeader(),
    public var knownPACEntireDiscFlags: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var writeProtectControlByte: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
    public var writeProtectPassword: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BdDiscWriteProtectPac) return false
        if (this.header != other.header) return false
        if (this.knownPACEntireDiscFlags != other.knownPACEntireDiscFlags) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.writeProtectControlByte != other.writeProtectControlByte) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.writeProtectPassword.contentEquals(other.writeProtectPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.knownPACEntireDiscFlags.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.writeProtectControlByte.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.writeProtectPassword.contentHashCode()
        return result
    }
}

public data class BdPacHeader(
    public var pACId: UByteArray = UByteArray(3),
    public var pACFormatNumber: UByte = 0u,
    public var pACUpdateCount: UByteArray = UByteArray(4),
    public var unknownPACRules: UByteArray = UByteArray(4),
    public var unkownPACEntireDiscFlag: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var numberOfSegments: UByte = 0u,
    public var segments: UByteArray = UByteArray(256),
    public var reserved2: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BdPacHeader) return false
        if (!this.pACId.contentEquals(other.pACId)) return false
        if (this.pACFormatNumber != other.pACFormatNumber) return false
        if (!this.pACUpdateCount.contentEquals(other.pACUpdateCount)) return false
        if (!this.unknownPACRules.contentEquals(other.unknownPACRules)) return false
        if (this.unkownPACEntireDiscFlag != other.unkownPACEntireDiscFlag) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.numberOfSegments != other.numberOfSegments) return false
        if (!this.segments.contentEquals(other.segments)) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pACId.contentHashCode()
        result = 31 * result + this.pACFormatNumber.hashCode()
        result = 31 * result + this.pACUpdateCount.contentHashCode()
        result = 31 * result + this.unknownPACRules.contentHashCode()
        result = 31 * result + this.unkownPACEntireDiscFlag.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.numberOfSegments.hashCode()
        result = 31 * result + this.segments.contentHashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class DvdAsf(
    public var reserved0: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdAsf) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved0.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }
}

public data class DvdBcaDescriptor(
    public var bCAInformation: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdBcaDescriptor) return false
        if (!this.bCAInformation.contentEquals(other.bCAInformation)) return false
        return true
    }

    override fun hashCode(): Int = this.bCAInformation.contentHashCode()
}

public data class DvdBdSpareAreaInformation(
    public var reserved1: UByteArray = UByteArray(4),
    public var numberOfFreeSpareBlocks: UByteArray = UByteArray(4),
    public var numberOfAllocatedSpareBlocks: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdBdSpareAreaInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.numberOfFreeSpareBlocks.contentEquals(other.numberOfFreeSpareBlocks)) return false
        if (!this.numberOfAllocatedSpareBlocks.contentEquals(other.numberOfAllocatedSpareBlocks)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.numberOfFreeSpareBlocks.contentHashCode()
        result = 31 * result + this.numberOfAllocatedSpareBlocks.contentHashCode()
        return result
    }
}

public data class DvdCopyrightDescriptor(
    public var copyrightProtectionType: UByte = 0u,
    public var regionManagementInformation: UByte = 0u,
    public var reserved: UShort = 0u,
)

public data class DvdCopyrightManagementDescriptor(
    public var anonymous: DvdCopyrightManagementDescriptor0 = DvdCopyrightManagementDescriptor0(),
    public var reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdCopyrightManagementDescriptor) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }
}

public data class DvdCopyrightManagementDescriptor0(
    public var dvdrom: DvdCopyrightManagementDescriptor00 = DvdCopyrightManagementDescriptor00(),
    public var dvdRecordableVersion1: DvdCopyrightManagementDescriptor01 = DvdCopyrightManagementDescriptor01(),
    public var dvdram: DvdCopyrightManagementDescriptor02 = DvdCopyrightManagementDescriptor02(),
    public var dvdRecordable: DvdCopyrightManagementDescriptor03 = DvdCopyrightManagementDescriptor03(),
    public var cprMai: UByte = 0u,
)

public data class DvdCopyrightManagementDescriptor01(
    public var bitfield: UByte = 0u,
)

public data class DvdCopyrightManagementDescriptor03(
    public var bitfield: UByte = 0u,
)

public data class DvdCopyrightManagementDescriptor02(
    public var reserved0003: UByte = 0u,
)

public data class DvdCopyrightManagementDescriptor00(
    public var bitfield: UByte = 0u,
)

public data class DvdCopyProtectKey(
    public var keyLength: UInt = 0u,
    public var sessionId: UInt = 0u,
    public var keyType: DvdKeyType = 0,
    public var keyFlags: UInt = 0u,
    public var parameters: DvdCopyProtectKey0 = DvdCopyProtectKey0(),
    public var keyData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdCopyProtectKey) return false
        if (this.keyLength != other.keyLength) return false
        if (this.sessionId != other.sessionId) return false
        if (this.keyType != other.keyType) return false
        if (this.keyFlags != other.keyFlags) return false
        if (this.parameters != other.parameters) return false
        if (!this.keyData.contentEquals(other.keyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyLength.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.keyType.hashCode()
        result = 31 * result + this.keyFlags.hashCode()
        result = 31 * result + this.parameters.hashCode()
        result = 31 * result + this.keyData.contentHashCode()
        return result
    }
}

public data class DvdCopyProtectKey0(
    public var fileHandle: Handle = null,
    public var titleOffset: Long = 0L,
)

public data class DvdDescriptorHeader(
    public var length: UShort = 0u,
    public var reserved: UByteArray = UByteArray(2),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDescriptorHeader) return false
        if (this.length != other.length) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockHeader(
    public var contentDescriptor: UByteArray = UByteArray(4),
    public var prohibitedActions: DvdDiscControlBlockHeader0 = DvdDiscControlBlockHeader0(),
    public var vendorId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockHeader) return false
        if (!this.contentDescriptor.contentEquals(other.contentDescriptor)) return false
        if (this.prohibitedActions != other.prohibitedActions) return false
        if (!this.vendorId.contentEquals(other.vendorId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contentDescriptor.contentHashCode()
        result = 31 * result + this.prohibitedActions.hashCode()
        result = 31 * result + this.vendorId.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockHeader0(
    public var anonymous: DvdDiscControlBlockHeader00 = DvdDiscControlBlockHeader00(),
    public var asByte: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockHeader0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asByte.contentEquals(other.asByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asByte.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockHeader00(
    public var reservedDoNotUseUseAsByteInstead0: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockHeader00) return false
        if (!this.reservedDoNotUseUseAsByteInstead0.contentEquals(other.reservedDoNotUseUseAsByteInstead0)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedDoNotUseUseAsByteInstead0.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }
}

public data class DvdDiscControlBlockList(
    public var header: DvdDiscControlBlockHeader = DvdDiscControlBlockHeader(),
    public var reserved0: UByte = 0u,
    public var readabldDCBs: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var writableDCBs: UByte = 0u,
    public var dcbs: List<DvdDiscControlBlockListDcb> = List(1) { DvdDiscControlBlockListDcb() },
)

public data class DvdDiscControlBlockListDcb(
    public var dcbIdentifier: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockListDcb) return false
        if (!this.dcbIdentifier.contentEquals(other.dcbIdentifier)) return false
        return true
    }

    override fun hashCode(): Int = this.dcbIdentifier.contentHashCode()
}

public data class DvdDiscControlBlockSession(
    public var header: DvdDiscControlBlockHeader = DvdDiscControlBlockHeader(),
    public var sessionNumber: UByteArray = UByteArray(2),
    public var reserved0: UByteArray = UByteArray(22),
    public var discID: UByteArray = UByteArray(32),
    public var reserved1: UByteArray = UByteArray(32),
    public var sessionItem: List<DvdDiscControlBlockSessionItem> = List(504) { DvdDiscControlBlockSessionItem() },
    public var reserved2: UByteArray = UByteArray(24576),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockSession) return false
        if (this.header != other.header) return false
        if (!this.sessionNumber.contentEquals(other.sessionNumber)) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.discID.contentEquals(other.discID)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.sessionItem != other.sessionItem) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.sessionNumber.contentHashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.discID.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.sessionItem.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockSessionItem(
    public var asByte: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockSessionItem) return false
        if (!this.asByte.contentEquals(other.asByte)) return false
        return true
    }

    override fun hashCode(): Int = this.asByte.contentHashCode()
}

public data class DvdDiscControlBlockWriteInhibit(
    public var header: DvdDiscControlBlockHeader = DvdDiscControlBlockHeader(),
    public var updateCount: UByteArray = UByteArray(4),
    public var writeProtectActions: DvdDiscControlBlockWriteInhibit0 = DvdDiscControlBlockWriteInhibit0(),
    public var reserved0: UByteArray = UByteArray(16),
    public var updatePassword: UByteArray = UByteArray(32),
    public var reserved1: UByteArray = UByteArray(32672),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockWriteInhibit) return false
        if (this.header != other.header) return false
        if (!this.updateCount.contentEquals(other.updateCount)) return false
        if (this.writeProtectActions != other.writeProtectActions) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.updatePassword.contentEquals(other.updatePassword)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.updateCount.contentHashCode()
        result = 31 * result + this.writeProtectActions.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.updatePassword.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockWriteInhibit0(
    public var anonymous: DvdDiscControlBlockWriteInhibit00 = DvdDiscControlBlockWriteInhibit00(),
    public var asByte: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockWriteInhibit0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asByte.contentEquals(other.asByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asByte.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockWriteInhibit00(
    public var reservedDoNotUseUseAsByteInstead0: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockWriteInhibit00) return false
        if (!this.reservedDoNotUseUseAsByteInstead0.contentEquals(other.reservedDoNotUseUseAsByteInstead0)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedDoNotUseUseAsByteInstead0.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }
}

public data class DvdDiskKeyDescriptor(
    public var diskKeyData: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiskKeyDescriptor) return false
        if (!this.diskKeyData.contentEquals(other.diskKeyData)) return false
        return true
    }

    override fun hashCode(): Int = this.diskKeyData.contentHashCode()
}

public data class DvdDualLayerJumpIntervalSize(
    public var reserved1: UByteArray = UByteArray(4),
    public var jumpIntervalSize: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerJumpIntervalSize) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.jumpIntervalSize.contentEquals(other.jumpIntervalSize)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.jumpIntervalSize.contentHashCode()
        return result
    }
}

public data class DvdDualLayerManualLayerJump(
    public var reserved1: UByteArray = UByteArray(4),
    public var manualJumpLayerAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerManualLayerJump) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.manualJumpLayerAddress.contentEquals(other.manualJumpLayerAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.manualJumpLayerAddress.contentHashCode()
        return result
    }
}

public data class DvdDualLayerMiddleZoneStartAddress(
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var shiftedMiddleAreaStartAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerMiddleZoneStartAddress) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.shiftedMiddleAreaStartAddress.contentEquals(other.shiftedMiddleAreaStartAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.shiftedMiddleAreaStartAddress.contentHashCode()
        return result
    }
}

public data class DvdDualLayerRecordingInformation(
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var layer0Sectors: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerRecordingInformation) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.layer0Sectors.contentEquals(other.layer0Sectors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.layer0Sectors.contentHashCode()
        return result
    }
}

public data class DvdDualLayerRemappingInformation(
    public var reserved1: UByteArray = UByteArray(4),
    public var remappingAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerRemappingInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.remappingAddress.contentEquals(other.remappingAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.remappingAddress.contentHashCode()
        return result
    }
}

public data class DvdFullLayerDescriptor(
    public var commonHeader: DvdLayerDescriptor = DvdLayerDescriptor(),
    public var mediaSpecific: UByteArray = UByteArray(2031),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdFullLayerDescriptor) return false
        if (this.commonHeader != other.commonHeader) return false
        if (!this.mediaSpecific.contentEquals(other.mediaSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.commonHeader.hashCode()
        result = 31 * result + this.mediaSpecific.contentHashCode()
        return result
    }
}

public data class DvdLayerDescriptor(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var bitfield4: UByte = 0u,
    public var startingDataSector: UInt = 0u,
    public var endDataSector: UInt = 0u,
    public var endLayerZeroSector: UInt = 0u,
    public var bitfield5: UByte = 0u,
)

public data class DvdListOfRecognizedFormatLayers(
    public var typeCodeOfFormatLayer: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdListOfRecognizedFormatLayers) return false
        if (!this.typeCodeOfFormatLayer.contentEquals(other.typeCodeOfFormatLayer)) return false
        return true
    }

    override fun hashCode(): Int = this.typeCodeOfFormatLayer.contentHashCode()
}

public data class DvdListOfRecognizedFormatLayersTypeCode(
    public var numberOfRecognizedFormatLayers: UByte = 0u,
    public var bitfield: UByte = 0u,
)

public data class DvdManufacturerDescriptor(
    public var manufacturingInformation: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdManufacturerDescriptor) return false
        if (!this.manufacturingInformation.contentEquals(other.manufacturingInformation)) return false
        return true
    }

    override fun hashCode(): Int = this.manufacturingInformation.contentHashCode()
}

public class DvdPrerecordedInformation(
    public var fieldId1: UByte = 0u,
    public var discApplicationCode: UByte = 0u,
    public var discPhysicalCode: UByte = 0u,
    public var lastAddressOfDataRecordableArea: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var fieldId2: UByte = 0u,
    public var opcSuggestedCode: UByte = 0u,
    public var wavelengthCode: UByte = 0u,
    public var writeStrategyCode: UByteArray = UByteArray(4),
    public var reserved2: UByte = 0u,
    public var fieldId3: UByte = 0u,
    public var manufacturerId3: UByteArray = UByteArray(6),
    public var reserved3: UByte = 0u,
    public var fieldId4: UByte = 0u,
    public var manufacturerId4: UByteArray = UByteArray(6),
    public var reserved4: UByte = 0u,
    public var fieldId5: UByte = 0u,
    public var manufacturerId5: UByteArray = UByteArray(6),
    public var reserved5: UByte = 0u,
    public var reserved99: UByteArray = UByteArray(24),
)

public data class DvdRamMediumStatus(
    public var bitfield: UByte = 0u,
    public var discTypeIdentification: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var mediaSpecificWriteInhibitInformation: UByte = 0u,
)

public data class DvdRamRecordingType(
    public var bitfield: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdRamRecordingType) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class DvdRamSpareAreaInformation(
    public var freePrimarySpareSectors: UByteArray = UByteArray(4),
    public var freeSupplementalSpareSectors: UByteArray = UByteArray(4),
    public var allocatedSupplementalSpareSectors: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdRamSpareAreaInformation) return false
        if (!this.freePrimarySpareSectors.contentEquals(other.freePrimarySpareSectors)) return false
        if (!this.freeSupplementalSpareSectors.contentEquals(other.freeSupplementalSpareSectors)) return false
        if (!this.allocatedSupplementalSpareSectors.contentEquals(other.allocatedSupplementalSpareSectors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.freePrimarySpareSectors.contentHashCode()
        result = 31 * result + this.freeSupplementalSpareSectors.contentHashCode()
        result = 31 * result + this.allocatedSupplementalSpareSectors.contentHashCode()
        return result
    }
}

public data class DvdReadStructure(
    public var blockByteOffset: Long = 0L,
    public var format: DvdStructureFormat = 0,
    public var sessionId: UInt = 0u,
    public var layerNumber: UByte = 0u,
)

public data class DvdRecordingManagementAreaData(
    public var lastRecordedRMASectorNumber: UByteArray = UByteArray(4),
    public var rMDBytes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdRecordingManagementAreaData) return false
        if (!this.lastRecordedRMASectorNumber.contentEquals(other.lastRecordedRMASectorNumber)) return false
        if (!this.rMDBytes.contentEquals(other.rMDBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastRecordedRMASectorNumber.contentHashCode()
        result = 31 * result + this.rMDBytes.contentHashCode()
        return result
    }
}

public data class DvdRegion(
    public var copySystem: UByte = 0u,
    public var regionData: UByte = 0u,
    public var systemRegion: UByte = 0u,
    public var resetCount: UByte = 0u,
)

public data class DvdRpcKey(
    public var bitfield: UByte = 0u,
    public var regionMask: UByte = 0u,
    public var rpcScheme: UByte = 0u,
    public var reserved02: UByte = 0u,
)

public data class DvdSetRpcKey(
    public var preferredDriveRegionCode: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdSetRpcKey) return false
        if (this.preferredDriveRegionCode != other.preferredDriveRegionCode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.preferredDriveRegionCode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DvdStructureListEntry(
    public var formatCode: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var formatLength: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdStructureListEntry) return false
        if (this.formatCode != other.formatCode) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.formatLength.contentEquals(other.formatLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.formatLength.contentHashCode()
        return result
    }
}

public data class DvdUniqueDiscIdentifier(
    public var reserved0: UByteArray = UByteArray(2),
    public var randomNumber: UByteArray = UByteArray(2),
    public var year: UByteArray = UByteArray(4),
    public var month: UByteArray = UByteArray(2),
    public var day: UByteArray = UByteArray(2),
    public var hour: UByteArray = UByteArray(2),
    public var minute: UByteArray = UByteArray(2),
    public var second: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdUniqueDiscIdentifier) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.randomNumber.contentEquals(other.randomNumber)) return false
        if (!this.year.contentEquals(other.year)) return false
        if (!this.month.contentEquals(other.month)) return false
        if (!this.day.contentEquals(other.day)) return false
        if (!this.hour.contentEquals(other.hour)) return false
        if (!this.minute.contentEquals(other.minute)) return false
        if (!this.second.contentEquals(other.second)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved0.contentHashCode()
        result = 31 * result + this.randomNumber.contentHashCode()
        result = 31 * result + this.year.contentHashCode()
        result = 31 * result + this.month.contentHashCode()
        result = 31 * result + this.day.contentHashCode()
        result = 31 * result + this.hour.contentHashCode()
        result = 31 * result + this.minute.contentHashCode()
        result = 31 * result + this.second.contentHashCode()
        return result
    }
}

public data class DvdWriteProtectionStatus(
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdWriteProtectionStatus) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class HdDvdRMediumStatus(
    public var bitfield: UByte = 0u,
    public var numberOfRemainingRMDsInRDZ: UByte = 0u,
    public var numberOfRemainingRMDsInCurrentRMZ: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HdDvdRMediumStatus) return false
        if (this.bitfield != other.bitfield) return false
        if (this.numberOfRemainingRMDsInRDZ != other.numberOfRemainingRMDsInRDZ) return false
        if (!this.numberOfRemainingRMDsInCurrentRMZ.contentEquals(other.numberOfRemainingRMDsInCurrentRMZ)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.numberOfRemainingRMDsInRDZ.hashCode()
        result = 31 * result + this.numberOfRemainingRMDsInCurrentRMZ.contentHashCode()
        return result
    }
}

public data class StorageSetReadAhead(
    public var triggerAddress: Long = 0L,
    public var targetAddress: Long = 0L,
)
