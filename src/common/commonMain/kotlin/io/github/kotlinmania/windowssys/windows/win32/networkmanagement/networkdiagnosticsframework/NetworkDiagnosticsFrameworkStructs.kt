package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME

public data class DIAG_SOCKADDR(public var family: UShort = 0u, public var data: ByteArray = ByteArray(126)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIAG_SOCKADDR) return false
        if (this.family != other.family) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.family.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class DiagnosticsInfo(public var cost: Int = 0, public var flags: UInt = 0u)

public data class HELPER_ATTRIBUTE(
    public var pwszName: PWSTR = 0L,
    public var type: ATTRIBUTE_TYPE = 0,
    public var Anonymous: HELPER_ATTRIBUTE_0 = HELPER_ATTRIBUTE_0(),
)

public data class HELPER_ATTRIBUTE_0(
    public var Boolean: BOOL = 0,
    public var Char: UByte = 0u,
    public var Byte: UByte = 0u,
    public var Short: Short = 0,
    public var Word: UShort = 0u,
    public var Int: Int = 0,
    public var DWord: UInt = 0u,
    public var Int64: Long = 0L,
    public var UInt64: ULong = 0uL,
    public var PWStr: PWSTR = 0L,
    public var Guid: GUID = GUID(),
    public var LifeTime: LIFE_TIME = LIFE_TIME(),
    public var Address: DIAG_SOCKADDR = DIAG_SOCKADDR(),
    public var OctetString: OCTET_STRING = OCTET_STRING(),
)

public data class HYPOTHESIS(
    public var pwszClassName: PWSTR = 0L,
    public var pwszDescription: PWSTR = 0L,
    public var celt: UInt = 0u,
    public var rgAttributes: Long = 0L,
)

public data class HelperAttributeInfo(public var pwszName: PWSTR = 0L, public var type: ATTRIBUTE_TYPE = 0)

public data class HypothesisResult(public var hypothesis: HYPOTHESIS = HYPOTHESIS(), public var pathStatus: DIAGNOSIS_STATUS = 0)

public data class LIFE_TIME(public var startTime: FILETIME = FILETIME(), public var endTime: FILETIME = FILETIME())

public data class OCTET_STRING(public var dwLength: UInt = 0u, public var lpValue: Long = 0L)

public data class RepairInfo(
    public var guid: GUID = GUID(),
    public var pwszClassName: PWSTR = 0L,
    public var pwszDescription: PWSTR = 0L,
    public var sidType: UInt = 0u,
    public var cost: Int = 0,
    public var flags: UInt = 0u,
    public var scope: REPAIR_SCOPE = 0,
    public var risk: REPAIR_RISK = 0,
    public var UiInfo: UiInfo = UiInfo(),
    public var rootCauseIndex: Int = 0,
)

public data class RepairInfoEx(public var repair: RepairInfo = RepairInfo(), public var repairRank: UShort = 0u)

public data class RootCauseInfo(
    public var pwszDescription: PWSTR = 0L,
    public var rootCauseID: GUID = GUID(),
    public var rootCauseFlags: UInt = 0u,
    public var networkInterfaceID: GUID = GUID(),
    public var pRepairs: Long = 0L,
    public var repairCount: UShort = 0u,
)

public data class ShellCommandInfo(
    public var pwszOperation: PWSTR = 0L,
    public var pwszFile: PWSTR = 0L,
    public var pwszParameters: PWSTR = 0L,
    public var pwszDirectory: PWSTR = 0L,
    public var nShowCmd: UInt = 0u,
)

public data class UiInfo(public var type: UI_INFO_TYPE = 0, public var Anonymous: UiInfo_0 = UiInfo_0())

public data class UiInfo_0(
    public var pwzNull: PWSTR = 0L,
    public var ShellInfo: ShellCommandInfo = ShellCommandInfo(),
    public var pwzHelpUrl: PWSTR = 0L,
    public var pwzDui: PWSTR = 0L,
)
