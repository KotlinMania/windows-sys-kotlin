@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class EVENTLOGRECORD(
    public var Length: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var RecordNumber: UInt = 0u,
    public var TimeGenerated: UInt = 0u,
    public var TimeWritten: UInt = 0u,
    public var EventID: UInt = 0u,
    public var EventType: REPORT_EVENT_TYPE = 0u,
    public var NumStrings: UShort = 0u,
    public var EventCategory: UShort = 0u,
    public var ReservedFlags: UShort = 0u,
    public var ClosingRecordNumber: UInt = 0u,
    public var StringOffset: UInt = 0u,
    public var UserSidLength: UInt = 0u,
    public var UserSidOffset: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var DataOffset: UInt = 0u,
)

public data class EVENTLOG_FULL_INFORMATION(public var dwFull: UInt = 0u)

public data class EVENTSFORLOGFILE(
    public var ulSize: UInt = 0u,
    public var szLogicalLogFile: UShortArray = UShortArray(256),
    public var ulNumRecords: UInt = 0u,
    public var pEventLogRecords: List<EVENTLOGRECORD> = List(1) { EVENTLOGRECORD() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EVENTSFORLOGFILE) return false
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

public data class EVT_RPC_LOGIN(
    public var Server: PWSTR = 0L,
    public var User: PWSTR = 0L,
    public var Domain: PWSTR = 0L,
    public var Password: PWSTR = 0L,
    public var Flags: UInt = 0u,
)

public data class EVT_VARIANT(
    public var Anonymous: EVT_VARIANT_0 = EVT_VARIANT_0(),
    public var Count: UInt = 0u,
    public var Type: UInt = 0u,
)

public class EVT_VARIANT_0(
    public var BooleanVal: BOOL = 0,
    public var SByteVal: Byte = 0,
    public var Int16Val: Short = 0,
    public var Int32Val: Int = 0,
    public var Int64Val: Long = 0L,
    public var ByteVal: UByte = 0u,
    public var UInt16Val: UShort = 0u,
    public var UInt32Val: UInt = 0u,
    public var UInt64Val: ULong = 0uL,
    public var SingleVal: Float = 0.0f,
    public var DoubleVal: Double = 0.0,
    public var FileTimeVal: ULong = 0uL,
    public var SysTimeVal: Long = 0L,
    public var GuidVal: Long = 0L,
    public var StringVal: PCWSTR = 0L,
    public var AnsiStringVal: PCSTR = 0L,
    public var BinaryVal: Long = 0L,
    public var SidVal: Security.PSID = Security.PSID(),
    public var SizeTVal: ULong = 0uL,
    public var BooleanArr: Long = 0L,
    public var SByteArr: Long = 0L,
    public var Int16Arr: Long = 0L,
    public var Int32Arr: Long = 0L,
    public var Int64Arr: Long = 0L,
    public var ByteArr: Long = 0L,
    public var UInt16Arr: Long = 0L,
    public var UInt32Arr: Long = 0L,
    public var UInt64Arr: Long = 0L,
    public var SingleArr: Long = 0L,
    public var DoubleArr: Long = 0L,
    public var FileTimeArr: Long = 0L,
    public var SysTimeArr: Long = 0L,
    public var GuidArr: Long = 0L,
    public var StringArr: Long = 0L,
    public var AnsiStringArr: Long = 0L,
    public var SidArr: Long = 0L,
    public var SizeTArr: Long = 0L,
    public var EvtHandleVal: EVT_HANDLE = 0L,
    public var XmlVal: PCWSTR = 0L,
    public var XmlValArr: Long = 0L,
)
