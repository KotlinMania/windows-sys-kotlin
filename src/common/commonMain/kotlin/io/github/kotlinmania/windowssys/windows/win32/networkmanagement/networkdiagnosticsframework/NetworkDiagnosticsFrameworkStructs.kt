package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class DiagSockaddr(
    public var family: UShort = 0u,
    public var data: ByteArray = ByteArray(126),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagSockaddr) return false
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

public data class DiagnosticsInfo(
    public var cost: Int = 0,
    public var flags: UInt = 0u,
)

public data class HelperAttribute(
    public var pwszName: Pwstr = null,
    public var type: AttributeType = 0,
    public var anonymous: HelperAttribute0 = HelperAttribute0(),
)

public data class HelperAttribute0(
    public var boolean: Bool = 0,
    public var char: UByte = 0u,
    public var byte: UByte = 0u,
    public var short: Short = 0,
    public var word: UShort = 0u,
    public var int: Int = 0,
    public var dWord: UInt = 0u,
    public var int64: Long = 0L,
    public var uInt64: ULong = 0uL,
    public var pWStr: Pwstr = null,
    public var guid: Guid = Guid(),
    public var lifeTime: LifeTime = LifeTime(),
    public var address: DiagSockaddr = DiagSockaddr(),
    public var octetString: OctetString = OctetString(),
)

public data class Hypothesis(
    public var pwszClassName: Pwstr = null,
    public var pwszDescription: Pwstr = null,
    public var celt: UInt = 0u,
    public var rgAttributes: HelperAttribute? = null,
)

public data class HelperAttributeInfo(
    public var pwszName: Pwstr = null,
    public var type: AttributeType = 0,
)

public data class HypothesisResult(
    public var hypothesis: Hypothesis = Hypothesis(),
    public var pathStatus: DiagnosisStatus = 0,
)

public data class LifeTime(
    public var startTime: Filetime = Filetime(),
    public var endTime: Filetime = Filetime(),
)

public data class OctetString(
    public var dwLength: UInt = 0u,
    public var lpValue: COpaquePointer? = null,
)

public data class RepairInfo(
    public var guid: Guid = Guid(),
    public var pwszClassName: Pwstr = null,
    public var pwszDescription: Pwstr = null,
    public var sidType: UInt = 0u,
    public var cost: Int = 0,
    public var flags: UInt = 0u,
    public var scope: RepairScope = 0,
    public var risk: RepairRisk = 0,
    public var uiInfo: UiInfo = UiInfo(),
    public var rootCauseIndex: Int = 0,
)

public data class RepairInfoEx(
    public var repair: RepairInfo = RepairInfo(),
    public var repairRank: UShort = 0u,
)

public data class RootCauseInfo(
    public var pwszDescription: Pwstr = null,
    public var rootCauseID: Guid = Guid(),
    public var rootCauseFlags: UInt = 0u,
    public var networkInterfaceID: Guid = Guid(),
    public var pRepairs: RepairInfoEx? = null,
    public var repairCount: UShort = 0u,
)

public data class ShellCommandInfo(
    public var pwszOperation: Pwstr = null,
    public var pwszFile: Pwstr = null,
    public var pwszParameters: Pwstr = null,
    public var pwszDirectory: Pwstr = null,
    public var nShowCmd: UInt = 0u,
)

public data class UiInfo(
    public var type: UiInfoType = 0,
    public var anonymous: UiInfo0 = UiInfo0(),
)

public data class UiInfo0(
    public var pwzNull: Pwstr = null,
    public var shellInfo: ShellCommandInfo = ShellCommandInfo(),
    public var pwzHelpUrl: Pwstr = null,
    public var pwzDui: Pwstr = null,
)
