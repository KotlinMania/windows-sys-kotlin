@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.dvd

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class AACS_BINDING_NONCE(public var BindingNonce: UByteArray = UByteArray(16), public var MAC: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AACS_BINDING_NONCE) return false
        if (!this.BindingNonce.contentEquals(other.BindingNonce)) return false
        if (!this.MAC.contentEquals(other.MAC)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BindingNonce.contentHashCode()
        result = 31 * result + this.MAC.contentHashCode()
        return result
    }
}

public data class AACS_CERTIFICATE(public var Nonce: UByteArray = UByteArray(20), public var Certificate: UByteArray = UByteArray(92)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AACS_CERTIFICATE) return false
        if (!this.Nonce.contentEquals(other.Nonce)) return false
        if (!this.Certificate.contentEquals(other.Certificate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Nonce.contentHashCode()
        result = 31 * result + this.Certificate.contentHashCode()
        return result
    }
}

public data class AACS_CHALLENGE_KEY(public var EllipticCurvePoint: UByteArray = UByteArray(40), public var Signature: UByteArray = UByteArray(40)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AACS_CHALLENGE_KEY) return false
        if (!this.EllipticCurvePoint.contentEquals(other.EllipticCurvePoint)) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EllipticCurvePoint.contentHashCode()
        result = 31 * result + this.Signature.contentHashCode()
        return result
    }
}

public data class AACS_MEDIA_ID(public var MediaID: UByteArray = UByteArray(16), public var MAC: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AACS_MEDIA_ID) return false
        if (!this.MediaID.contentEquals(other.MediaID)) return false
        if (!this.MAC.contentEquals(other.MAC)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MediaID.contentHashCode()
        result = 31 * result + this.MAC.contentHashCode()
        return result
    }
}

public data class AACS_READ_BINDING_NONCE(
    public var SessionId: UInt = 0u,
    public var NumberOfSectors: UInt = 0u,
    public var StartLba: ULong = 0uL,
    public var Anonymous: AACS_READ_BINDING_NONCE_0 = AACS_READ_BINDING_NONCE_0(),
)

public data class AACS_READ_BINDING_NONCE_0(public var Handle: HANDLE = 0L, public var ForceStructureLengthToMatch64bit: ULong = 0uL)

public data class AACS_SEND_CERTIFICATE(public var SessionId: UInt = 0u, public var Certificate: AACS_CERTIFICATE = AACS_CERTIFICATE())

public data class AACS_SEND_CHALLENGE_KEY(public var SessionId: UInt = 0u, public var ChallengeKey: AACS_CHALLENGE_KEY = AACS_CHALLENGE_KEY())

public data class AACS_SERIAL_NUMBER(public var PrerecordedSerialNumber: UByteArray = UByteArray(16), public var MAC: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AACS_SERIAL_NUMBER) return false
        if (!this.PrerecordedSerialNumber.contentEquals(other.PrerecordedSerialNumber)) return false
        if (!this.MAC.contentEquals(other.MAC)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PrerecordedSerialNumber.contentHashCode()
        result = 31 * result + this.MAC.contentHashCode()
        return result
    }
}

public data class AACS_VOLUME_ID(public var VolumeID: UByteArray = UByteArray(16), public var MAC: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AACS_VOLUME_ID) return false
        if (!this.VolumeID.contentEquals(other.VolumeID)) return false
        if (!this.MAC.contentEquals(other.MAC)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VolumeID.contentHashCode()
        result = 31 * result + this.MAC.contentHashCode()
        return result
    }
}

public data class BD_DISC_WRITE_PROTECT_PAC(
    public var Header: BD_PAC_HEADER = BD_PAC_HEADER(),
    public var KnownPACEntireDiscFlags: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(3),
    public var WriteProtectControlByte: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(7),
    public var WriteProtectPassword: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BD_DISC_WRITE_PROTECT_PAC) return false
        if (this.Header != other.Header) return false
        if (this.KnownPACEntireDiscFlags != other.KnownPACEntireDiscFlags) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.WriteProtectControlByte != other.WriteProtectControlByte) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (!this.WriteProtectPassword.contentEquals(other.WriteProtectPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.KnownPACEntireDiscFlags.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.WriteProtectControlByte.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.WriteProtectPassword.contentHashCode()
        return result
    }
}

public data class BD_PAC_HEADER(
    public var PACId: UByteArray = UByteArray(3),
    public var PACFormatNumber: UByte = 0u,
    public var PACUpdateCount: UByteArray = UByteArray(4),
    public var UnknownPACRules: UByteArray = UByteArray(4),
    public var UnkownPACEntireDiscFlag: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(2),
    public var NumberOfSegments: UByte = 0u,
    public var Segments: UByteArray = UByteArray(256),
    public var Reserved2: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BD_PAC_HEADER) return false
        if (!this.PACId.contentEquals(other.PACId)) return false
        if (this.PACFormatNumber != other.PACFormatNumber) return false
        if (!this.PACUpdateCount.contentEquals(other.PACUpdateCount)) return false
        if (!this.UnknownPACRules.contentEquals(other.UnknownPACRules)) return false
        if (this.UnkownPACEntireDiscFlag != other.UnkownPACEntireDiscFlag) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.NumberOfSegments != other.NumberOfSegments) return false
        if (!this.Segments.contentEquals(other.Segments)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PACId.contentHashCode()
        result = 31 * result + this.PACFormatNumber.hashCode()
        result = 31 * result + this.PACUpdateCount.contentHashCode()
        result = 31 * result + this.UnknownPACRules.contentHashCode()
        result = 31 * result + this.UnkownPACEntireDiscFlag.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.NumberOfSegments.hashCode()
        result = 31 * result + this.Segments.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class DVD_ASF(public var Reserved0: UByteArray = UByteArray(3), public var _bitfield: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_ASF) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this._bitfield != other._bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved0.contentHashCode()
        result = 31 * result + this._bitfield.hashCode()
        return result
    }
}

public data class DVD_BCA_DESCRIPTOR(public var BCAInformation: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_BCA_DESCRIPTOR) return false
        if (!this.BCAInformation.contentEquals(other.BCAInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.BCAInformation.contentHashCode()
    }
}

public data class DVD_BD_SPARE_AREA_INFORMATION(
    public var Reserved1: UByteArray = UByteArray(4),
    public var NumberOfFreeSpareBlocks: UByteArray = UByteArray(4),
    public var NumberOfAllocatedSpareBlocks: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_BD_SPARE_AREA_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.NumberOfFreeSpareBlocks.contentEquals(other.NumberOfFreeSpareBlocks)) return false
        if (!this.NumberOfAllocatedSpareBlocks.contentEquals(other.NumberOfAllocatedSpareBlocks)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.NumberOfFreeSpareBlocks.contentHashCode()
        result = 31 * result + this.NumberOfAllocatedSpareBlocks.contentHashCode()
        return result
    }
}

public data class DVD_COPYRIGHT_DESCRIPTOR(
    public var CopyrightProtectionType: UByte = 0u,
    public var RegionManagementInformation: UByte = 0u,
    public var Reserved: UShort = 0u,
)

public data class DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR(public var Anonymous: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0 = DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0(), public var Reserved0: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        return result
    }
}

public data class DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0(
    public var Dvdrom: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_0 = DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_0(),
    public var DvdRecordable_Version1: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_1 = DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_1(),
    public var Dvdram: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_2 = DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_2(),
    public var DvdRecordable: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_3 = DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_3(),
    public var CPR_MAI: UByte = 0u,
)

public data class DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_1(public var _bitfield: UByte = 0u)

public data class DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_3(public var _bitfield: UByte = 0u)

public data class DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_2(public var Reserved0003: UByte = 0u)

public data class DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_0(public var _bitfield: UByte = 0u)

public data class DVD_COPY_PROTECT_KEY(
    public var KeyLength: UInt = 0u,
    public var SessionId: UInt = 0u,
    public var KeyType: DVD_KEY_TYPE = 0,
    public var KeyFlags: UInt = 0u,
    public var Parameters: DVD_COPY_PROTECT_KEY_0 = DVD_COPY_PROTECT_KEY_0(),
    public var KeyData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_COPY_PROTECT_KEY) return false
        if (this.KeyLength != other.KeyLength) return false
        if (this.SessionId != other.SessionId) return false
        if (this.KeyType != other.KeyType) return false
        if (this.KeyFlags != other.KeyFlags) return false
        if (this.Parameters != other.Parameters) return false
        if (!this.KeyData.contentEquals(other.KeyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.KeyLength.hashCode()
        result = 31 * result + this.SessionId.hashCode()
        result = 31 * result + this.KeyType.hashCode()
        result = 31 * result + this.KeyFlags.hashCode()
        result = 31 * result + this.Parameters.hashCode()
        result = 31 * result + this.KeyData.contentHashCode()
        return result
    }
}

public data class DVD_COPY_PROTECT_KEY_0(public var FileHandle: HANDLE = 0L, public var TitleOffset: Long = 0L)

public data class DVD_DESCRIPTOR_HEADER(
    public var Length: UShort = 0u,
    public var Reserved: UByteArray = UByteArray(2),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DESCRIPTOR_HEADER) return false
        if (this.Length != other.Length) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class DVD_DISC_CONTROL_BLOCK_HEADER(
    public var ContentDescriptor: UByteArray = UByteArray(4),
    public var ProhibitedActions: DVD_DISC_CONTROL_BLOCK_HEADER_0 = DVD_DISC_CONTROL_BLOCK_HEADER_0(),
    public var VendorId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_HEADER) return false
        if (!this.ContentDescriptor.contentEquals(other.ContentDescriptor)) return false
        if (this.ProhibitedActions != other.ProhibitedActions) return false
        if (!this.VendorId.contentEquals(other.VendorId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ContentDescriptor.contentHashCode()
        result = 31 * result + this.ProhibitedActions.hashCode()
        result = 31 * result + this.VendorId.contentHashCode()
        return result
    }
}

public data class DVD_DISC_CONTROL_BLOCK_HEADER_0(public var Anonymous: DVD_DISC_CONTROL_BLOCK_HEADER_0_0 = DVD_DISC_CONTROL_BLOCK_HEADER_0_0(), public var AsByte: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_HEADER_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.AsByte.contentEquals(other.AsByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.AsByte.contentHashCode()
        return result
    }
}

public data class DVD_DISC_CONTROL_BLOCK_HEADER_0_0(public var ReservedDoNotUse_UseAsByteInstead_0: UByteArray = UByteArray(3), public var _bitfield: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_HEADER_0_0) return false
        if (!this.ReservedDoNotUse_UseAsByteInstead_0.contentEquals(other.ReservedDoNotUse_UseAsByteInstead_0)) return false
        if (this._bitfield != other._bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ReservedDoNotUse_UseAsByteInstead_0.contentHashCode()
        result = 31 * result + this._bitfield.hashCode()
        return result
    }
}

public data class DVD_DISC_CONTROL_BLOCK_LIST(
    public var header: DVD_DISC_CONTROL_BLOCK_HEADER = DVD_DISC_CONTROL_BLOCK_HEADER(),
    public var Reserved0: UByte = 0u,
    public var ReadabldDCBs: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var WritableDCBs: UByte = 0u,
    public var Dcbs: List<DVD_DISC_CONTROL_BLOCK_LIST_DCB> = List(1) { DVD_DISC_CONTROL_BLOCK_LIST_DCB() },
)

public data class DVD_DISC_CONTROL_BLOCK_LIST_DCB(public var DcbIdentifier: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_LIST_DCB) return false
        if (!this.DcbIdentifier.contentEquals(other.DcbIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DcbIdentifier.contentHashCode()
    }
}

public data class DVD_DISC_CONTROL_BLOCK_SESSION(
    public var header: DVD_DISC_CONTROL_BLOCK_HEADER = DVD_DISC_CONTROL_BLOCK_HEADER(),
    public var SessionNumber: UByteArray = UByteArray(2),
    public var Reserved0: UByteArray = UByteArray(22),
    public var DiscID: UByteArray = UByteArray(32),
    public var Reserved1: UByteArray = UByteArray(32),
    public var SessionItem: List<DVD_DISC_CONTROL_BLOCK_SESSION_ITEM> = List(504) { DVD_DISC_CONTROL_BLOCK_SESSION_ITEM() },
    public var Reserved2: UByteArray = UByteArray(24576),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_SESSION) return false
        if (this.header != other.header) return false
        if (!this.SessionNumber.contentEquals(other.SessionNumber)) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.DiscID.contentEquals(other.DiscID)) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.SessionItem != other.SessionItem) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.SessionNumber.contentHashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.DiscID.contentHashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.SessionItem.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class DVD_DISC_CONTROL_BLOCK_SESSION_ITEM(public var AsByte: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_SESSION_ITEM) return false
        if (!this.AsByte.contentEquals(other.AsByte)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.AsByte.contentHashCode()
    }
}

public data class DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT(
    public var header: DVD_DISC_CONTROL_BLOCK_HEADER = DVD_DISC_CONTROL_BLOCK_HEADER(),
    public var UpdateCount: UByteArray = UByteArray(4),
    public var WriteProtectActions: DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0 = DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0(),
    public var Reserved0: UByteArray = UByteArray(16),
    public var UpdatePassword: UByteArray = UByteArray(32),
    public var Reserved1: UByteArray = UByteArray(32672),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT) return false
        if (this.header != other.header) return false
        if (!this.UpdateCount.contentEquals(other.UpdateCount)) return false
        if (this.WriteProtectActions != other.WriteProtectActions) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.UpdatePassword.contentEquals(other.UpdatePassword)) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.UpdateCount.contentHashCode()
        result = 31 * result + this.WriteProtectActions.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.UpdatePassword.contentHashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0(public var Anonymous: DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0 = DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0(), public var AsByte: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.AsByte.contentEquals(other.AsByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.AsByte.contentHashCode()
        return result
    }
}

public data class DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0(public var ReservedDoNotUse_UseAsByteInstead_0: UByteArray = UByteArray(3), public var _bitfield: UByte = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0) return false
        if (!this.ReservedDoNotUse_UseAsByteInstead_0.contentEquals(other.ReservedDoNotUse_UseAsByteInstead_0)) return false
        if (this._bitfield != other._bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ReservedDoNotUse_UseAsByteInstead_0.contentHashCode()
        result = 31 * result + this._bitfield.hashCode()
        return result
    }
}

public data class DVD_DISK_KEY_DESCRIPTOR(public var DiskKeyData: UByteArray = UByteArray(2048)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DISK_KEY_DESCRIPTOR) return false
        if (!this.DiskKeyData.contentEquals(other.DiskKeyData)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DiskKeyData.contentHashCode()
    }
}

public data class DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE(public var Reserved1: UByteArray = UByteArray(4), public var JumpIntervalSize: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.JumpIntervalSize.contentEquals(other.JumpIntervalSize)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.JumpIntervalSize.contentHashCode()
        return result
    }
}

public data class DVD_DUAL_LAYER_MANUAL_LAYER_JUMP(public var Reserved1: UByteArray = UByteArray(4), public var ManualJumpLayerAddress: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DUAL_LAYER_MANUAL_LAYER_JUMP) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.ManualJumpLayerAddress.contentEquals(other.ManualJumpLayerAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.ManualJumpLayerAddress.contentHashCode()
        return result
    }
}

public data class DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS(
    public var _bitfield: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(3),
    public var ShiftedMiddleAreaStartAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.ShiftedMiddleAreaStartAddress.contentEquals(other.ShiftedMiddleAreaStartAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.ShiftedMiddleAreaStartAddress.contentHashCode()
        return result
    }
}

public data class DVD_DUAL_LAYER_RECORDING_INFORMATION(
    public var _bitfield: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(3),
    public var Layer0Sectors: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DUAL_LAYER_RECORDING_INFORMATION) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.Layer0Sectors.contentEquals(other.Layer0Sectors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Layer0Sectors.contentHashCode()
        return result
    }
}

public data class DVD_DUAL_LAYER_REMAPPING_INFORMATION(public var Reserved1: UByteArray = UByteArray(4), public var RemappingAddress: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_DUAL_LAYER_REMAPPING_INFORMATION) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (!this.RemappingAddress.contentEquals(other.RemappingAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved1.contentHashCode()
        result = 31 * result + this.RemappingAddress.contentHashCode()
        return result
    }
}

public data class DVD_FULL_LAYER_DESCRIPTOR(public var commonHeader: DVD_LAYER_DESCRIPTOR = DVD_LAYER_DESCRIPTOR(), public var MediaSpecific: UByteArray = UByteArray(2031)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_FULL_LAYER_DESCRIPTOR) return false
        if (this.commonHeader != other.commonHeader) return false
        if (!this.MediaSpecific.contentEquals(other.MediaSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.commonHeader.hashCode()
        result = 31 * result + this.MediaSpecific.contentHashCode()
        return result
    }
}

public data class DVD_LAYER_DESCRIPTOR(
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var _bitfield3: UByte = 0u,
    public var _bitfield4: UByte = 0u,
    public var StartingDataSector: UInt = 0u,
    public var EndDataSector: UInt = 0u,
    public var EndLayerZeroSector: UInt = 0u,
    public var _bitfield5: UByte = 0u,
)

public data class DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS(public var TypeCodeOfFormatLayer: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS) return false
        if (!this.TypeCodeOfFormatLayer.contentEquals(other.TypeCodeOfFormatLayer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.TypeCodeOfFormatLayer.contentHashCode()
    }
}

public data class DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS_TYPE_CODE(public var NumberOfRecognizedFormatLayers: UByte = 0u, public var _bitfield: UByte = 0u)

public data class DVD_MANUFACTURER_DESCRIPTOR(public var ManufacturingInformation: UByteArray = UByteArray(2048)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_MANUFACTURER_DESCRIPTOR) return false
        if (!this.ManufacturingInformation.contentEquals(other.ManufacturingInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ManufacturingInformation.contentHashCode()
    }
}

public class DVD_PRERECORDED_INFORMATION(
    public var FieldID_1: UByte = 0u,
    public var DiscApplicationCode: UByte = 0u,
    public var DiscPhysicalCode: UByte = 0u,
    public var LastAddressOfDataRecordableArea: UByteArray = UByteArray(3),
    public var _bitfield: UByte = 0u,
    public var Reserved0: UByte = 0u,
    public var FieldID_2: UByte = 0u,
    public var OpcSuggestedCode: UByte = 0u,
    public var WavelengthCode: UByte = 0u,
    public var WriteStrategyCode: UByteArray = UByteArray(4),
    public var Reserved2: UByte = 0u,
    public var FieldID_3: UByte = 0u,
    public var ManufacturerId_3: UByteArray = UByteArray(6),
    public var Reserved3: UByte = 0u,
    public var FieldID_4: UByte = 0u,
    public var ManufacturerId_4: UByteArray = UByteArray(6),
    public var Reserved4: UByte = 0u,
    public var FieldID_5: UByte = 0u,
    public var ManufacturerId_5: UByteArray = UByteArray(6),
    public var Reserved5: UByte = 0u,
    public var Reserved99: UByteArray = UByteArray(24),
)

public data class DVD_RAM_MEDIUM_STATUS(
    public var _bitfield: UByte = 0u,
    public var DiscTypeIdentification: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var MediaSpecificWriteInhibitInformation: UByte = 0u,
)

public data class DVD_RAM_RECORDING_TYPE(public var _bitfield: UByte = 0u, public var Reserved2: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_RAM_RECORDING_TYPE) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class DVD_RAM_SPARE_AREA_INFORMATION(
    public var FreePrimarySpareSectors: UByteArray = UByteArray(4),
    public var FreeSupplementalSpareSectors: UByteArray = UByteArray(4),
    public var AllocatedSupplementalSpareSectors: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_RAM_SPARE_AREA_INFORMATION) return false
        if (!this.FreePrimarySpareSectors.contentEquals(other.FreePrimarySpareSectors)) return false
        if (!this.FreeSupplementalSpareSectors.contentEquals(other.FreeSupplementalSpareSectors)) return false
        if (!this.AllocatedSupplementalSpareSectors.contentEquals(other.AllocatedSupplementalSpareSectors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FreePrimarySpareSectors.contentHashCode()
        result = 31 * result + this.FreeSupplementalSpareSectors.contentHashCode()
        result = 31 * result + this.AllocatedSupplementalSpareSectors.contentHashCode()
        return result
    }
}

public data class DVD_READ_STRUCTURE(
    public var BlockByteOffset: Long = 0L,
    public var Format: DVD_STRUCTURE_FORMAT = 0,
    public var SessionId: UInt = 0u,
    public var LayerNumber: UByte = 0u,
)

public data class DVD_RECORDING_MANAGEMENT_AREA_DATA(public var LastRecordedRMASectorNumber: UByteArray = UByteArray(4), public var RMDBytes: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_RECORDING_MANAGEMENT_AREA_DATA) return false
        if (!this.LastRecordedRMASectorNumber.contentEquals(other.LastRecordedRMASectorNumber)) return false
        if (!this.RMDBytes.contentEquals(other.RMDBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LastRecordedRMASectorNumber.contentHashCode()
        result = 31 * result + this.RMDBytes.contentHashCode()
        return result
    }
}

public data class DVD_REGION(
    public var CopySystem: UByte = 0u,
    public var RegionData: UByte = 0u,
    public var SystemRegion: UByte = 0u,
    public var ResetCount: UByte = 0u,
)

public data class DVD_RPC_KEY(
    public var _bitfield: UByte = 0u,
    public var RegionMask: UByte = 0u,
    public var RpcScheme: UByte = 0u,
    public var Reserved02: UByte = 0u,
)

public data class DVD_SET_RPC_KEY(public var PreferredDriveRegionCode: UByte = 0u, public var Reserved: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_SET_RPC_KEY) return false
        if (this.PreferredDriveRegionCode != other.PreferredDriveRegionCode) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PreferredDriveRegionCode.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class DVD_STRUCTURE_LIST_ENTRY(
    public var FormatCode: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var FormatLength: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_STRUCTURE_LIST_ENTRY) return false
        if (this.FormatCode != other.FormatCode) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.FormatLength.contentEquals(other.FormatLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FormatCode.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.FormatLength.contentHashCode()
        return result
    }
}

public data class DVD_UNIQUE_DISC_IDENTIFIER(
    public var Reserved0: UByteArray = UByteArray(2),
    public var RandomNumber: UByteArray = UByteArray(2),
    public var Year: UByteArray = UByteArray(4),
    public var Month: UByteArray = UByteArray(2),
    public var Day: UByteArray = UByteArray(2),
    public var Hour: UByteArray = UByteArray(2),
    public var Minute: UByteArray = UByteArray(2),
    public var Second: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_UNIQUE_DISC_IDENTIFIER) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (!this.RandomNumber.contentEquals(other.RandomNumber)) return false
        if (!this.Year.contentEquals(other.Year)) return false
        if (!this.Month.contentEquals(other.Month)) return false
        if (!this.Day.contentEquals(other.Day)) return false
        if (!this.Hour.contentEquals(other.Hour)) return false
        if (!this.Minute.contentEquals(other.Minute)) return false
        if (!this.Second.contentEquals(other.Second)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved0.contentHashCode()
        result = 31 * result + this.RandomNumber.contentHashCode()
        result = 31 * result + this.Year.contentHashCode()
        result = 31 * result + this.Month.contentHashCode()
        result = 31 * result + this.Day.contentHashCode()
        result = 31 * result + this.Hour.contentHashCode()
        result = 31 * result + this.Minute.contentHashCode()
        result = 31 * result + this.Second.contentHashCode()
        return result
    }
}

public data class DVD_WRITE_PROTECTION_STATUS(public var _bitfield: UByte = 0u, public var Reserved1: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVD_WRITE_PROTECTION_STATUS) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        return result
    }
}

public data class HD_DVD_R_MEDIUM_STATUS(
    public var _bitfield: UByte = 0u,
    public var NumberOfRemainingRMDsInRDZ: UByte = 0u,
    public var NumberOfRemainingRMDsInCurrentRMZ: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HD_DVD_R_MEDIUM_STATUS) return false
        if (this._bitfield != other._bitfield) return false
        if (this.NumberOfRemainingRMDsInRDZ != other.NumberOfRemainingRMDsInRDZ) return false
        if (!this.NumberOfRemainingRMDsInCurrentRMZ.contentEquals(other.NumberOfRemainingRMDsInCurrentRMZ)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.NumberOfRemainingRMDsInRDZ.hashCode()
        result = 31 * result + this.NumberOfRemainingRMDsInCurrentRMZ.contentHashCode()
        return result
    }
}

public data class STORAGE_SET_READ_AHEAD(public var TriggerAddress: Long = 0L, public var TargetAddress: Long = 0L)
