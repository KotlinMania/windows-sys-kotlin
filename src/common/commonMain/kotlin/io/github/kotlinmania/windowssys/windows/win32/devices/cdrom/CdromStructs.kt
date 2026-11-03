@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.cdrom

public data class CDROM_DISK_DATA(public var DiskData: UInt = 0u)

public data class CDROM_EXCEPTION_PERFORMANCE_DESCRIPTOR(public var Lba: UByteArray = UByteArray(4), public var Time: UByteArray = UByteArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_EXCEPTION_PERFORMANCE_DESCRIPTOR) return false
        if (!this.Lba.contentEquals(other.Lba)) return false
        if (!this.Time.contentEquals(other.Time)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Lba.contentHashCode()
        result = 31 * result + this.Time.contentHashCode()
        return result
    }
}

public data class CDROM_EXCLUSIVE_ACCESS(public var RequestType: EXCLUSIVE_ACCESS_REQUEST_TYPE = 0, public var Flags: UInt = 0u)

public data class CDROM_EXCLUSIVE_LOCK(public var Access: CDROM_EXCLUSIVE_ACCESS = CDROM_EXCLUSIVE_ACCESS(), public var CallerName: UByteArray = UByteArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_EXCLUSIVE_LOCK) return false
        if (this.Access != other.Access) return false
        if (!this.CallerName.contentEquals(other.CallerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Access.hashCode()
        result = 31 * result + this.CallerName.contentHashCode()
        return result
    }
}

public data class CDROM_EXCLUSIVE_LOCK_STATE(public var LockState: Boolean = false, public var CallerName: UByteArray = UByteArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_EXCLUSIVE_LOCK_STATE) return false
        if (this.LockState != other.LockState) return false
        if (!this.CallerName.contentEquals(other.CallerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LockState.hashCode()
        result = 31 * result + this.CallerName.contentHashCode()
        return result
    }
}

public data class CDROM_NOMINAL_PERFORMANCE_DESCRIPTOR(
    public var StartLba: UByteArray = UByteArray(4),
    public var StartPerformance: UByteArray = UByteArray(4),
    public var EndLba: UByteArray = UByteArray(4),
    public var EndPerformance: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_NOMINAL_PERFORMANCE_DESCRIPTOR) return false
        if (!this.StartLba.contentEquals(other.StartLba)) return false
        if (!this.StartPerformance.contentEquals(other.StartPerformance)) return false
        if (!this.EndLba.contentEquals(other.EndLba)) return false
        if (!this.EndPerformance.contentEquals(other.EndPerformance)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StartLba.contentHashCode()
        result = 31 * result + this.StartPerformance.contentHashCode()
        result = 31 * result + this.EndLba.contentHashCode()
        result = 31 * result + this.EndPerformance.contentHashCode()
        return result
    }
}

public data class CDROM_PERFORMANCE_HEADER(
    public var DataLength: UByteArray = UByteArray(4),
    public var _bitfield: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(3),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_PERFORMANCE_HEADER) return false
        if (!this.DataLength.contentEquals(other.DataLength)) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DataLength.contentHashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class CDROM_PERFORMANCE_REQUEST(
    public var RequestType: CDROM_PERFORMANCE_REQUEST_TYPE = 0,
    public var PerformanceType: CDROM_PERFORMANCE_TYPE = 0,
    public var Exceptions: CDROM_PERFORMANCE_EXCEPTION_TYPE = 0,
    public var Tolerance: CDROM_PERFORMANCE_TOLERANCE_TYPE = 0,
    public var StaringLba: UInt = 0u,
)

public data class CDROM_PLAY_AUDIO_MSF(
    public var StartingM: UByte = 0u,
    public var StartingS: UByte = 0u,
    public var StartingF: UByte = 0u,
    public var EndingM: UByte = 0u,
    public var EndingS: UByte = 0u,
    public var EndingF: UByte = 0u,
)

public data class CDROM_READ_TOC_EX(
    public var _bitfield: UByte = 0u,
    public var SessionTrack: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var Reserved3: UByte = 0u,
)

public data class CDROM_SEEK_AUDIO_MSF(
    public var M: UByte = 0u,
    public var S: UByte = 0u,
    public var F: UByte = 0u,
)

public data class CDROM_SET_SPEED(
    public var RequestType: CDROM_SPEED_REQUEST = 0,
    public var ReadSpeed: UShort = 0u,
    public var WriteSpeed: UShort = 0u,
    public var RotationControl: WRITE_ROTATION = 0,
)

public data class CDROM_SET_STREAMING(
    public var RequestType: CDROM_SPEED_REQUEST = 0,
    public var ReadSize: UInt = 0u,
    public var ReadTime: UInt = 0u,
    public var WriteSize: UInt = 0u,
    public var WriteTime: UInt = 0u,
    public var StartLba: UInt = 0u,
    public var EndLba: UInt = 0u,
    public var RotationControl: WRITE_ROTATION = 0,
    public var RestoreDefaults: Boolean = false,
    public var SetExact: Boolean = false,
    public var RandomAccess: Boolean = false,
    public var Persistent: Boolean = false,
)

public data class CDROM_SIMPLE_OPC_INFO(
    public var RequestType: CDROM_OPC_INFO_TYPE = 0,
    public var Exclude0: Boolean = false,
    public var Exclude1: Boolean = false,
)

public data class CDROM_STREAMING_CONTROL(public var RequestType: STREAMING_CONTROL_REQUEST_TYPE = 0)

public data class CDROM_SUB_Q_DATA_FORMAT(public var Format: UByte = 0u, public var Track: UByte = 0u)

public data class CDROM_TOC(
    public var Length: UByteArray = UByteArray(2),
    public var FirstTrack: UByte = 0u,
    public var LastTrack: UByte = 0u,
    public var TrackData: List<TRACK_DATA> = List(100) { TRACK_DATA() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (this.FirstTrack != other.FirstTrack) return false
        if (this.LastTrack != other.LastTrack) return false
        if (this.TrackData != other.TrackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.contentHashCode()
        result = 31 * result + this.FirstTrack.hashCode()
        result = 31 * result + this.LastTrack.hashCode()
        result = 31 * result + this.TrackData.hashCode()
        return result
    }
}

public data class CDROM_TOC_ATIP_DATA(
    public var Length: UByteArray = UByteArray(2),
    public var Reserved1: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var Descriptors: List<CDROM_TOC_ATIP_DATA_BLOCK> = List(1) { CDROM_TOC_ATIP_DATA_BLOCK() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_ATIP_DATA) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.Descriptors != other.Descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.contentHashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.Descriptors.hashCode()
        return result
    }
}

public data class CDROM_TOC_ATIP_DATA_BLOCK(
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var _bitfield3: UByte = 0u,
    public var Reserved7: UByte = 0u,
    public var LeadInMsf: UByteArray = UByteArray(3),
    public var Reserved8: UByte = 0u,
    public var LeadOutMsf: UByteArray = UByteArray(3),
    public var Reserved9: UByte = 0u,
    public var A1Values: UByteArray = UByteArray(3),
    public var Reserved10: UByte = 0u,
    public var A2Values: UByteArray = UByteArray(3),
    public var Reserved11: UByte = 0u,
    public var A3Values: UByteArray = UByteArray(3),
    public var Reserved12: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_ATIP_DATA_BLOCK) return false
        if (this._bitfield1 != other._bitfield1) return false
        if (this._bitfield2 != other._bitfield2) return false
        if (this._bitfield3 != other._bitfield3) return false
        if (this.Reserved7 != other.Reserved7) return false
        if (!this.LeadInMsf.contentEquals(other.LeadInMsf)) return false
        if (this.Reserved8 != other.Reserved8) return false
        if (!this.LeadOutMsf.contentEquals(other.LeadOutMsf)) return false
        if (this.Reserved9 != other.Reserved9) return false
        if (!this.A1Values.contentEquals(other.A1Values)) return false
        if (this.Reserved10 != other.Reserved10) return false
        if (!this.A2Values.contentEquals(other.A2Values)) return false
        if (this.Reserved11 != other.Reserved11) return false
        if (!this.A3Values.contentEquals(other.A3Values)) return false
        if (this.Reserved12 != other.Reserved12) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield1.hashCode()
        result = 31 * result + this._bitfield2.hashCode()
        result = 31 * result + this._bitfield3.hashCode()
        result = 31 * result + this.Reserved7.hashCode()
        result = 31 * result + this.LeadInMsf.contentHashCode()
        result = 31 * result + this.Reserved8.hashCode()
        result = 31 * result + this.LeadOutMsf.contentHashCode()
        result = 31 * result + this.Reserved9.hashCode()
        result = 31 * result + this.A1Values.contentHashCode()
        result = 31 * result + this.Reserved10.hashCode()
        result = 31 * result + this.A2Values.contentHashCode()
        result = 31 * result + this.Reserved11.hashCode()
        result = 31 * result + this.A3Values.contentHashCode()
        result = 31 * result + this.Reserved12.hashCode()
        return result
    }
}

public data class CDROM_TOC_CD_TEXT_DATA(
    public var Length: UByteArray = UByteArray(2),
    public var Reserved1: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var Descriptors: List<CDROM_TOC_CD_TEXT_DATA_BLOCK> = List(1) { CDROM_TOC_CD_TEXT_DATA_BLOCK() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_CD_TEXT_DATA) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.Descriptors != other.Descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.contentHashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.Descriptors.hashCode()
        return result
    }
}

public data class CDROM_TOC_CD_TEXT_DATA_BLOCK(
    public var PackType: UByte = 0u,
    public var _bitfield1: UByte = 0u,
    public var SequenceNumber: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var Anonymous: CDROM_TOC_CD_TEXT_DATA_BLOCK_0 = CDROM_TOC_CD_TEXT_DATA_BLOCK_0(),
    public var CRC: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_CD_TEXT_DATA_BLOCK) return false
        if (this.PackType != other.PackType) return false
        if (this._bitfield1 != other._bitfield1) return false
        if (this.SequenceNumber != other.SequenceNumber) return false
        if (this._bitfield2 != other._bitfield2) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.CRC.contentEquals(other.CRC)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PackType.hashCode()
        result = 31 * result + this._bitfield1.hashCode()
        result = 31 * result + this.SequenceNumber.hashCode()
        result = 31 * result + this._bitfield2.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.CRC.contentHashCode()
        return result
    }
}

public data class CDROM_TOC_CD_TEXT_DATA_BLOCK_0(public var Text: UByteArray = UByteArray(12), public var WText: UShortArray = UShortArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_CD_TEXT_DATA_BLOCK_0) return false
        if (!this.Text.contentEquals(other.Text)) return false
        if (!this.WText.contentEquals(other.WText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Text.contentHashCode()
        result = 31 * result + this.WText.contentHashCode()
        return result
    }
}

public data class CDROM_TOC_FULL_TOC_DATA(
    public var Length: UByteArray = UByteArray(2),
    public var FirstCompleteSession: UByte = 0u,
    public var LastCompleteSession: UByte = 0u,
    public var Descriptors: List<CDROM_TOC_FULL_TOC_DATA_BLOCK> = List(1) { CDROM_TOC_FULL_TOC_DATA_BLOCK() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_FULL_TOC_DATA) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (this.FirstCompleteSession != other.FirstCompleteSession) return false
        if (this.LastCompleteSession != other.LastCompleteSession) return false
        if (this.Descriptors != other.Descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.contentHashCode()
        result = 31 * result + this.FirstCompleteSession.hashCode()
        result = 31 * result + this.LastCompleteSession.hashCode()
        result = 31 * result + this.Descriptors.hashCode()
        return result
    }
}

public data class CDROM_TOC_FULL_TOC_DATA_BLOCK(
    public var SessionNumber: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var Point: UByte = 0u,
    public var MsfExtra: UByteArray = UByteArray(3),
    public var Zero: UByte = 0u,
    public var Msf: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_FULL_TOC_DATA_BLOCK) return false
        if (this.SessionNumber != other.SessionNumber) return false
        if (this._bitfield != other._bitfield) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Point != other.Point) return false
        if (!this.MsfExtra.contentEquals(other.MsfExtra)) return false
        if (this.Zero != other.Zero) return false
        if (!this.Msf.contentEquals(other.Msf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SessionNumber.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Point.hashCode()
        result = 31 * result + this.MsfExtra.contentHashCode()
        result = 31 * result + this.Zero.hashCode()
        result = 31 * result + this.Msf.contentHashCode()
        return result
    }
}

public data class CDROM_TOC_PMA_DATA(
    public var Length: UByteArray = UByteArray(2),
    public var Reserved1: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var Descriptors: List<CDROM_TOC_FULL_TOC_DATA_BLOCK> = List(1) { CDROM_TOC_FULL_TOC_DATA_BLOCK() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_PMA_DATA) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.Descriptors != other.Descriptors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.contentHashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.Descriptors.hashCode()
        return result
    }
}

public data class CDROM_TOC_SESSION_DATA(
    public var Length: UByteArray = UByteArray(2),
    public var FirstCompleteSession: UByte = 0u,
    public var LastCompleteSession: UByte = 0u,
    public var TrackData: List<TRACK_DATA> = List(1) { TRACK_DATA() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_TOC_SESSION_DATA) return false
        if (!this.Length.contentEquals(other.Length)) return false
        if (this.FirstCompleteSession != other.FirstCompleteSession) return false
        if (this.LastCompleteSession != other.LastCompleteSession) return false
        if (this.TrackData != other.TrackData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.contentHashCode()
        result = 31 * result + this.FirstCompleteSession.hashCode()
        result = 31 * result + this.LastCompleteSession.hashCode()
        result = 31 * result + this.TrackData.hashCode()
        return result
    }
}

public data class CDROM_WRITE_SPEED_DESCRIPTOR(
    public var _bitfield: UByte = 0u,
    public var Reserved3: UByteArray = UByteArray(3),
    public var EndLba: UByteArray = UByteArray(4),
    public var ReadSpeed: UByteArray = UByteArray(4),
    public var WriteSpeed: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CDROM_WRITE_SPEED_DESCRIPTOR) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (!this.EndLba.contentEquals(other.EndLba)) return false
        if (!this.ReadSpeed.contentEquals(other.ReadSpeed)) return false
        if (!this.WriteSpeed.contentEquals(other.WriteSpeed)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.EndLba.contentHashCode()
        result = 31 * result + this.ReadSpeed.contentHashCode()
        result = 31 * result + this.WriteSpeed.contentHashCode()
        return result
    }
}

public data class CDROM_WRITE_SPEED_REQUEST(public var RequestType: CDROM_PERFORMANCE_REQUEST_TYPE = 0)

public data class RAW_READ_INFO(
    public var DiskOffset: Long = 0L,
    public var SectorCount: UInt = 0u,
    public var TrackMode: TRACK_MODE_TYPE = 0,
)

public data class SUB_Q_CHANNEL_DATA(
    public var CurrentPosition: SUB_Q_CURRENT_POSITION = SUB_Q_CURRENT_POSITION(),
    public var MediaCatalog: SUB_Q_MEDIA_CATALOG_NUMBER = SUB_Q_MEDIA_CATALOG_NUMBER(),
    public var TrackIsrc: SUB_Q_TRACK_ISRC = SUB_Q_TRACK_ISRC(),
)

public data class SUB_Q_CURRENT_POSITION(
    public var Header: SUB_Q_HEADER = SUB_Q_HEADER(),
    public var FormatCode: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var TrackNumber: UByte = 0u,
    public var IndexNumber: UByte = 0u,
    public var AbsoluteAddress: UByteArray = UByteArray(4),
    public var TrackRelativeAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SUB_Q_CURRENT_POSITION) return false
        if (this.Header != other.Header) return false
        if (this.FormatCode != other.FormatCode) return false
        if (this._bitfield != other._bitfield) return false
        if (this.TrackNumber != other.TrackNumber) return false
        if (this.IndexNumber != other.IndexNumber) return false
        if (!this.AbsoluteAddress.contentEquals(other.AbsoluteAddress)) return false
        if (!this.TrackRelativeAddress.contentEquals(other.TrackRelativeAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.FormatCode.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.TrackNumber.hashCode()
        result = 31 * result + this.IndexNumber.hashCode()
        result = 31 * result + this.AbsoluteAddress.contentHashCode()
        result = 31 * result + this.TrackRelativeAddress.contentHashCode()
        return result
    }
}

public data class SUB_Q_HEADER(
    public var Reserved: UByte = 0u,
    public var AudioStatus: UByte = 0u,
    public var DataLength: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SUB_Q_HEADER) return false
        if (this.Reserved != other.Reserved) return false
        if (this.AudioStatus != other.AudioStatus) return false
        if (!this.DataLength.contentEquals(other.DataLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.hashCode()
        result = 31 * result + this.AudioStatus.hashCode()
        result = 31 * result + this.DataLength.contentHashCode()
        return result
    }
}

public data class SUB_Q_MEDIA_CATALOG_NUMBER(
    public var Header: SUB_Q_HEADER = SUB_Q_HEADER(),
    public var FormatCode: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var _bitfield: UByte = 0u,
    public var MediaCatalog: UByteArray = UByteArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SUB_Q_MEDIA_CATALOG_NUMBER) return false
        if (this.Header != other.Header) return false
        if (this.FormatCode != other.FormatCode) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.MediaCatalog.contentEquals(other.MediaCatalog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.FormatCode.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.MediaCatalog.contentHashCode()
        return result
    }
}

public data class SUB_Q_TRACK_ISRC(
    public var Header: SUB_Q_HEADER = SUB_Q_HEADER(),
    public var FormatCode: UByte = 0u,
    public var Reserved0: UByte = 0u,
    public var Track: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var TrackIsrc: UByteArray = UByteArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SUB_Q_TRACK_ISRC) return false
        if (this.Header != other.Header) return false
        if (this.FormatCode != other.FormatCode) return false
        if (this.Reserved0 != other.Reserved0) return false
        if (this.Track != other.Track) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this._bitfield != other._bitfield) return false
        if (!this.TrackIsrc.contentEquals(other.TrackIsrc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.FormatCode.hashCode()
        result = 31 * result + this.Reserved0.hashCode()
        result = 31 * result + this.Track.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.TrackIsrc.contentHashCode()
        return result
    }
}

public data class TRACK_DATA(
    public var Reserved: UByte = 0u,
    public var _bitfield: UByte = 0u,
    public var TrackNumber: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var Address: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TRACK_DATA) return false
        if (this.Reserved != other.Reserved) return false
        if (this._bitfield != other._bitfield) return false
        if (this.TrackNumber != other.TrackNumber) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Reserved.hashCode()
        result = 31 * result + this._bitfield.hashCode()
        result = 31 * result + this.TrackNumber.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class VOLUME_CONTROL(public var PortVolume: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VOLUME_CONTROL) return false
        if (!this.PortVolume.contentEquals(other.PortVolume)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.PortVolume.contentHashCode()
    }
}
