@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.cdrom

public data class CdromDiskData(public var diskData: UInt = 0u)

public data class CdromExceptionPerformanceDescriptor(public var lba: UByteArray = UByteArray(4), public var time: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromExceptionPerformanceDescriptor) return false
        if (!this.lba.contentEquals(other.lba)) return false
        if (!this.time.contentEquals(other.time)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lba.contentHashCode()
        result = 31 * result + this.time.contentHashCode()
        return result
    }
}

public data class CdromExclusiveAccess(public var requestType: ExclusiveAccessRequestType = 0, public var flags: UInt = 0u)

public data class CdromExclusiveLock(public var access: CdromExclusiveAccess = CdromExclusiveAccess(), public var callerName: UByteArray = UByteArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromExclusiveLock) return false
        if (this.access != other.access) return false
        if (!this.callerName.contentEquals(other.callerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.access.hashCode()
        result = 31 * result + this.callerName.contentHashCode()
        return result
    }
}

public data class CdromExclusiveLockState(public var lockState: Boolean = false, public var callerName: UByteArray = UByteArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromExclusiveLockState) return false
        if (this.lockState != other.lockState) return false
        if (!this.callerName.contentEquals(other.callerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lockState.hashCode()
        result = 31 * result + this.callerName.contentHashCode()
        return result
    }
}

public data class CdromNominalPerformanceDescriptor(
    public var startLba: UByteArray = UByteArray(4),
    public var startPerformance: UByteArray = UByteArray(4),
    public var endLba: UByteArray = UByteArray(4),
    public var endPerformance: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromNominalPerformanceDescriptor) return false
        if (!this.startLba.contentEquals(other.startLba)) return false
        if (!this.startPerformance.contentEquals(other.startPerformance)) return false
        if (!this.endLba.contentEquals(other.endLba)) return false
        if (!this.endPerformance.contentEquals(other.endPerformance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startLba.contentHashCode()
        result = 31 * result + this.startPerformance.contentHashCode()
        result = 31 * result + this.endLba.contentHashCode()
        result = 31 * result + this.endPerformance.contentHashCode()
        return result
    }
}

public data class CdromPerformanceHeader(
    public var dataLength: UByteArray = UByteArray(4),
    public var bitfield: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromPerformanceHeader) return false
        if (!this.dataLength.contentEquals(other.dataLength)) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataLength.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class CdromPerformanceRequest(
    public var requestType: CdromPerformanceRequestType = 0,
    public var performanceType: CdromPerformanceType = 0,
    public var exceptions: CdromPerformanceExceptionType = 0,
    public var tolerance: CdromPerformanceToleranceType = 0,
    public var staringLba: UInt = 0u,
)

public data class CdromPlayAudioMsf(
    public var startingM: UByte = 0u,
    public var startingS: UByte = 0u,
    public var startingF: UByte = 0u,
    public var endingM: UByte = 0u,
    public var endingS: UByte = 0u,
    public var endingF: UByte = 0u,
)

public data class CdromReadTocEx(
    public var bitfield: UByte = 0u,
    public var sessionTrack: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var reserved3: UByte = 0u,
)

public data class CdromSeekAudioMsf(
    public var m: UByte = 0u,
    public var s: UByte = 0u,
    public var f: UByte = 0u,
)

public data class CdromSetSpeed(
    public var requestType: CdromSpeedRequest = 0,
    public var readSpeed: UShort = 0u,
    public var writeSpeed: UShort = 0u,
    public var rotationControl: WriteRotation = 0,
)

public data class CdromSetStreaming(
    public var requestType: CdromSpeedRequest = 0,
    public var readSize: UInt = 0u,
    public var readTime: UInt = 0u,
    public var writeSize: UInt = 0u,
    public var writeTime: UInt = 0u,
    public var startLba: UInt = 0u,
    public var endLba: UInt = 0u,
    public var rotationControl: WriteRotation = 0,
    public var restoreDefaults: Boolean = false,
    public var setExact: Boolean = false,
    public var randomAccess: Boolean = false,
    public var persistent: Boolean = false,
)

public data class CdromSimpleOpcInfo(
    public var requestType: CdromOpcInfoType = 0,
    public var exclude0: Boolean = false,
    public var exclude1: Boolean = false,
)

public data class CdromStreamingControl(public var requestType: StreamingControlRequestType = 0)

public data class CdromSubQDataFormat(public var format: UByte = 0u, public var track: UByte = 0u)

public data class CdromToc(
    public var length: UByteArray = UByteArray(2),
    public var firstTrack: UByte = 0u,
    public var lastTrack: UByte = 0u,
    public var trackData: List<TrackData> = List(100) { TrackData() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromToc) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.firstTrack != other.firstTrack) return false
        if (this.lastTrack != other.lastTrack) return false
        if (this.trackData != other.trackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.firstTrack.hashCode()
        result = 31 * result + this.lastTrack.hashCode()
        result = 31 * result + this.trackData.hashCode()
        return result
    }
}

public data class CdromTocAtipData(
    public var length: UByteArray = UByteArray(2),
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var descriptors: List<CdromTocAtipDataBlock> = List(1) { CdromTocAtipDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocAtipData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }
}

public data class CdromTocAtipDataBlock(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var reserved7: UByte = 0u,
    public var leadInMsf: UByteArray = UByteArray(3),
    public var reserved8: UByte = 0u,
    public var leadOutMsf: UByteArray = UByteArray(3),
    public var reserved9: UByte = 0u,
    public var a1Values: UByteArray = UByteArray(3),
    public var reserved10: UByte = 0u,
    public var a2Values: UByteArray = UByteArray(3),
    public var reserved11: UByte = 0u,
    public var a3Values: UByteArray = UByteArray(3),
    public var reserved12: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocAtipDataBlock) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (this.bitfield3 != other.bitfield3) return false
        if (this.reserved7 != other.reserved7) return false
        if (!this.leadInMsf.contentEquals(other.leadInMsf)) return false
        if (this.reserved8 != other.reserved8) return false
        if (!this.leadOutMsf.contentEquals(other.leadOutMsf)) return false
        if (this.reserved9 != other.reserved9) return false
        if (!this.a1Values.contentEquals(other.a1Values)) return false
        if (this.reserved10 != other.reserved10) return false
        if (!this.a2Values.contentEquals(other.a2Values)) return false
        if (this.reserved11 != other.reserved11) return false
        if (!this.a3Values.contentEquals(other.a3Values)) return false
        if (this.reserved12 != other.reserved12) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield1.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.bitfield3.hashCode()
        result = 31 * result + this.reserved7.hashCode()
        result = 31 * result + this.leadInMsf.contentHashCode()
        result = 31 * result + this.reserved8.hashCode()
        result = 31 * result + this.leadOutMsf.contentHashCode()
        result = 31 * result + this.reserved9.hashCode()
        result = 31 * result + this.a1Values.contentHashCode()
        result = 31 * result + this.reserved10.hashCode()
        result = 31 * result + this.a2Values.contentHashCode()
        result = 31 * result + this.reserved11.hashCode()
        result = 31 * result + this.a3Values.contentHashCode()
        result = 31 * result + this.reserved12.hashCode()
        return result
    }
}

public data class CdromTocCdTextData(
    public var length: UByteArray = UByteArray(2),
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var descriptors: List<CdromTocCdTextDataBlock> = List(1) { CdromTocCdTextDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocCdTextData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }
}

public data class CdromTocCdTextDataBlock(
    public var packType: UByte = 0u,
    public var bitfield1: UByte = 0u,
    public var sequenceNumber: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var anonymous: CdromTocCdTextDataBlock0 = CdromTocCdTextDataBlock0(),
    public var crc: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocCdTextDataBlock) return false
        if (this.packType != other.packType) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.sequenceNumber != other.sequenceNumber) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.crc.contentEquals(other.crc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packType.hashCode()
        result = 31 * result + this.bitfield1.hashCode()
        result = 31 * result + this.sequenceNumber.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.crc.contentHashCode()
        return result
    }
}

public data class CdromTocCdTextDataBlock0(public var text: UByteArray = UByteArray(12), public var wText: UShortArray = UShortArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocCdTextDataBlock0) return false
        if (!this.text.contentEquals(other.text)) return false
        if (!this.wText.contentEquals(other.wText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.text.contentHashCode()
        result = 31 * result + this.wText.contentHashCode()
        return result
    }
}

public data class CdromTocFullTocData(
    public var length: UByteArray = UByteArray(2),
    public var firstCompleteSession: UByte = 0u,
    public var lastCompleteSession: UByte = 0u,
    public var descriptors: List<CdromTocFullTocDataBlock> = List(1) { CdromTocFullTocDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocFullTocData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.firstCompleteSession != other.firstCompleteSession) return false
        if (this.lastCompleteSession != other.lastCompleteSession) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.firstCompleteSession.hashCode()
        result = 31 * result + this.lastCompleteSession.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }
}

public data class CdromTocFullTocDataBlock(
    public var sessionNumber: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var point: UByte = 0u,
    public var msfExtra: UByteArray = UByteArray(3),
    public var zero: UByte = 0u,
    public var msf: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocFullTocDataBlock) return false
        if (this.sessionNumber != other.sessionNumber) return false
        if (this.bitfield != other.bitfield) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.point != other.point) return false
        if (!this.msfExtra.contentEquals(other.msfExtra)) return false
        if (this.zero != other.zero) return false
        if (!this.msf.contentEquals(other.msf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionNumber.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.point.hashCode()
        result = 31 * result + this.msfExtra.contentHashCode()
        result = 31 * result + this.zero.hashCode()
        result = 31 * result + this.msf.contentHashCode()
        return result
    }
}

public data class CdromTocPmaData(
    public var length: UByteArray = UByteArray(2),
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var descriptors: List<CdromTocFullTocDataBlock> = List(1) { CdromTocFullTocDataBlock() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocPmaData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.descriptors != other.descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.descriptors.hashCode()
        return result
    }
}

public data class CdromTocSessionData(
    public var length: UByteArray = UByteArray(2),
    public var firstCompleteSession: UByte = 0u,
    public var lastCompleteSession: UByte = 0u,
    public var trackData: List<TrackData> = List(1) { TrackData() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromTocSessionData) return false
        if (!this.length.contentEquals(other.length)) return false
        if (this.firstCompleteSession != other.firstCompleteSession) return false
        if (this.lastCompleteSession != other.lastCompleteSession) return false
        if (this.trackData != other.trackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.contentHashCode()
        result = 31 * result + this.firstCompleteSession.hashCode()
        result = 31 * result + this.lastCompleteSession.hashCode()
        result = 31 * result + this.trackData.hashCode()
        return result
    }
}

public data class CdromWriteSpeedDescriptor(
    public var bitfield: UByte = 0u,
    public var reserved3: UByteArray = UByteArray(3),
    public var endLba: UByteArray = UByteArray(4),
    public var readSpeed: UByteArray = UByteArray(4),
    public var writeSpeed: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdromWriteSpeedDescriptor) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (!this.endLba.contentEquals(other.endLba)) return false
        if (!this.readSpeed.contentEquals(other.readSpeed)) return false
        if (!this.writeSpeed.contentEquals(other.writeSpeed)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.endLba.contentHashCode()
        result = 31 * result + this.readSpeed.contentHashCode()
        result = 31 * result + this.writeSpeed.contentHashCode()
        return result
    }
}

public data class CdromWriteSpeedRequest(public var requestType: CdromPerformanceRequestType = 0)

public data class RawReadInfo(
    public var diskOffset: Long = 0L,
    public var sectorCount: UInt = 0u,
    public var trackMode: TrackModeType = 0,
)

public data class SubQChannelData(
    public var currentPosition: SubQCurrentPosition = SubQCurrentPosition(),
    public var mediaCatalog: SubQMediaCatalogNumber = SubQMediaCatalogNumber(),
    public var trackIsrc: SubQTrackIsrc = SubQTrackIsrc(),
)

public data class SubQCurrentPosition(
    public var header: SubQHeader = SubQHeader(),
    public var formatCode: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var trackNumber: UByte = 0u,
    public var indexNumber: UByte = 0u,
    public var absoluteAddress: UByteArray = UByteArray(4),
    public var trackRelativeAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQCurrentPosition) return false
        if (this.header != other.header) return false
        if (this.formatCode != other.formatCode) return false
        if (this.bitfield != other.bitfield) return false
        if (this.trackNumber != other.trackNumber) return false
        if (this.indexNumber != other.indexNumber) return false
        if (!this.absoluteAddress.contentEquals(other.absoluteAddress)) return false
        if (!this.trackRelativeAddress.contentEquals(other.trackRelativeAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.formatCode.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.trackNumber.hashCode()
        result = 31 * result + this.indexNumber.hashCode()
        result = 31 * result + this.absoluteAddress.contentHashCode()
        result = 31 * result + this.trackRelativeAddress.contentHashCode()
        return result
    }
}

public data class SubQHeader(
    public var reserved: UByte = 0u,
    public var audioStatus: UByte = 0u,
    public var dataLength: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQHeader) return false
        if (this.reserved != other.reserved) return false
        if (this.audioStatus != other.audioStatus) return false
        if (!this.dataLength.contentEquals(other.dataLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.audioStatus.hashCode()
        result = 31 * result + this.dataLength.contentHashCode()
        return result
    }
}

public data class SubQMediaCatalogNumber(
    public var header: SubQHeader = SubQHeader(),
    public var formatCode: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
    public var mediaCatalog: UByteArray = UByteArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQMediaCatalogNumber) return false
        if (this.header != other.header) return false
        if (this.formatCode != other.formatCode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.mediaCatalog.contentEquals(other.mediaCatalog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.formatCode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.mediaCatalog.contentHashCode()
        return result
    }
}

public data class SubQTrackIsrc(
    public var header: SubQHeader = SubQHeader(),
    public var formatCode: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var track: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var trackIsrc: UByteArray = UByteArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SubQTrackIsrc) return false
        if (this.header != other.header) return false
        if (this.formatCode != other.formatCode) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.track != other.track) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.trackIsrc.contentEquals(other.trackIsrc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.formatCode.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.track.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.trackIsrc.contentHashCode()
        return result
    }
}

public data class TrackData(
    public var reserved: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var trackNumber: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var address: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrackData) return false
        if (this.reserved != other.reserved) return false
        if (this.bitfield != other.bitfield) return false
        if (this.trackNumber != other.trackNumber) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.trackNumber.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class VolumeControl(public var portVolume: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolumeControl) return false
        if (!this.portVolume.contentEquals(other.portVolume)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.portVolume.contentHashCode()
    }
}
