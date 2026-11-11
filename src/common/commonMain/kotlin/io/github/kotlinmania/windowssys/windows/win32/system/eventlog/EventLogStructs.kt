@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public data class Eventlogrecord(
    public var length: UInt = 0u,
    public var reserved: UInt = 0u,
    public var recordNumber: UInt = 0u,
    public var timeGenerated: UInt = 0u,
    public var timeWritten: UInt = 0u,
    public var eventID: UInt = 0u,
    public var eventType: ReportEventType = 0u,
    public var numStrings: UShort = 0u,
    public var eventCategory: UShort = 0u,
    public var reservedFlags: UShort = 0u,
    public var closingRecordNumber: UInt = 0u,
    public var stringOffset: UInt = 0u,
    public var userSidLength: UInt = 0u,
    public var userSidOffset: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var dataOffset: UInt = 0u,
)

public data class EventlogFullInformation(
    public var dwFull: UInt = 0u,
)

public data class Eventsforlogfile(
    public var ulSize: UInt = 0u,
    public var szLogicalLogFile: UShortArray = UShortArray(256),
    public var ulNumRecords: UInt = 0u,
    public var pEventLogRecords: List<Eventlogrecord> = List(1) { Eventlogrecord() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Eventsforlogfile) return false
        if (this.ulSize != other.ulSize) return false
        if (!this.szLogicalLogFile.contentEquals(other.szLogicalLogFile)) return false
        if (this.ulNumRecords != other.ulNumRecords) return false
        if (this.pEventLogRecords != other.pEventLogRecords) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulSize.hashCode()
        result = 31 * result + this.szLogicalLogFile.contentHashCode()
        result = 31 * result + this.ulNumRecords.hashCode()
        result = 31 * result + this.pEventLogRecords.hashCode()
        return result
    }
}

public data class EvtRpcLogin(
    public var server: Pwstr = null,
    public var user: Pwstr = null,
    public var domain: Pwstr = null,
    public var password: Pwstr = null,
    public var flags: UInt = 0u,
)

public data class EvtVariant(
    public var anonymous: EvtVariant0 = EvtVariant0(),
    public var count: UInt = 0u,
    public var type: UInt = 0u,
)

public class EvtVariant0(
    public var booleanVal: Bool = 0,
    public var sByteVal: Byte = 0,
    public var int16Val: Short = 0,
    public var int32Val: Int = 0,
    public var int64Val: Long = 0L,
    public var byteVal: UByte = 0u,
    public var uInt16Val: UShort = 0u,
    public var uInt32Val: UInt = 0u,
    public var uInt64Val: ULong = 0uL,
    public var singleVal: Float = 0.0f,
    public var doubleVal: Double = 0.0,
    public var fileTimeVal: ULong = 0uL,
    public var sysTimeVal: Systemtime? = null,
    public var guidVal: Guid? = null,
    public var stringVal: Pcwstr = null,
    public var ansiStringVal: Pcstr = null,
    public var binaryVal: COpaquePointer? = null,
    public var sidVal: Psid = null,
    public var sizeTVal: Int = 0,
    public var booleanArr: Bool? = null,
    public var sByteArr: COpaquePointer? = null,
    public var int16Arr: Short? = null,
    public var int32Arr: Int? = null,
    public var int64Arr: Long? = null,
    public var byteArr: COpaquePointer? = null,
    public var uInt16Arr: COpaquePointer? = null,
    public var uInt32Arr: UInt? = null,
    public var uInt64Arr: ULong? = null,
    public var singleArr: Float? = null,
    public var doubleArr: Double? = null,
    public var fileTimeArr: Filetime? = null,
    public var sysTimeArr: Systemtime? = null,
    public var guidArr: Guid? = null,
    public var stringArr: Pwstr = null,
    public var ansiStringArr: Pstr = null,
    public var sidArr: Psid = null,
    public var sizeTArr: Int? = null,
    public var evtHandleVal: EvtHandle = 0L,
    public var xmlVal: Pcwstr = null,
    public var xmlValArr: Pcwstr = null,
)
