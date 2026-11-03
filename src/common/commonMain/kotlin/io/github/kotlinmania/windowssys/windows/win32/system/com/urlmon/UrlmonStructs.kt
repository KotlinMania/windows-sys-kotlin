@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class CODEBASEHOLD(
    public var cbSize: UInt = 0u,
    public var szDistUnit: PWSTR = 0L,
    public var szCodeBase: PWSTR = 0L,
    public var dwVersionMS: UInt = 0u,
    public var dwVersionLS: UInt = 0u,
    public var dwStyle: UInt = 0u,
)

public data class CONFIRMSAFETY(
    public var clsid: GUID = GUID(),
    public var pUnk: Long = 0L,
    public var dwFlags: UInt = 0u,
)

public data class DATAINFO(
    public var ulTotalSize: UInt = 0u,
    public var ulavrPacketSize: UInt = 0u,
    public var ulConnectSpeed: UInt = 0u,
    public var ulProcessorSpeed: UInt = 0u,
)

public data class HIT_LOGGING_INFO(
    public var dwStructSize: UInt = 0u,
    public var lpszLoggedUrlName: PSTR = 0L,
    public var StartTime: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var EndTime: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var lpszExtendedInfo: PSTR = 0L,
)

public data class PROTOCOLDATA(
    public var grfFlags: UInt = 0u,
    public var dwState: UInt = 0u,
    public var pData: Long = 0L,
    public var cbData: UInt = 0u,
)

public data class PROTOCOLFILTERDATA(
    public var cbSize: UInt = 0u,
    public var pProtocolSink: Long = 0L,
    public var pProtocol: Long = 0L,
    public var pUnk: Long = 0L,
    public var dwFilterFlags: UInt = 0u,
)

public data class PROTOCOL_ARGUMENT(public var szMethod: PCWSTR = 0L, public var szTargetUrl: PCWSTR = 0L)

public data class REMSECURITY_ATTRIBUTES(
    public var nLength: UInt = 0u,
    public var lpSecurityDescriptor: UInt = 0u,
    public var bInheritHandle: BOOL = 0,
)

public data class RemBINDINFO(
    public var cbSize: UInt = 0u,
    public var szExtraInfo: PWSTR = 0L,
    public var grfBindInfoF: UInt = 0u,
    public var dwBindVerb: UInt = 0u,
    public var szCustomVerb: PWSTR = 0L,
    public var cbstgmedData: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwOptionsFlags: UInt = 0u,
    public var dwCodePage: UInt = 0u,
    public var securityAttributes: REMSECURITY_ATTRIBUTES = REMSECURITY_ATTRIBUTES(),
    public var iid: GUID = GUID(),
    public var pUnk: Long = 0L,
    public var dwReserved: UInt = 0u,
)

public data class RemFORMATETC(
    public var cfFormat: UInt = 0u,
    public var ptd: UInt = 0u,
    public var dwAspect: UInt = 0u,
    public var lindex: Int = 0,
    public var tymed: UInt = 0u,
)

public data class SOFTDISTINFO(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwAdState: UInt = 0u,
    public var szTitle: PWSTR = 0L,
    public var szAbstract: PWSTR = 0L,
    public var szHREF: PWSTR = 0L,
    public var dwInstalledVersionMS: UInt = 0u,
    public var dwInstalledVersionLS: UInt = 0u,
    public var dwUpdateVersionMS: UInt = 0u,
    public var dwUpdateVersionLS: UInt = 0u,
    public var dwAdvertisedVersionMS: UInt = 0u,
    public var dwAdvertisedVersionLS: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class StartParam(
    public var iid: GUID = GUID(),
    public var pIBindCtx: Long = 0L,
    public var pItf: Long = 0L,
)

public data class ZONEATTRIBUTES(
    public var cbSize: UInt = 0u,
    public var szDisplayName: UShortArray = UShortArray(260),
    public var szDescription: UShortArray = UShortArray(200),
    public var szIconPath: UShortArray = UShortArray(260),
    public var dwTemplateMinLevel: UInt = 0u,
    public var dwTemplateRecommended: UInt = 0u,
    public var dwTemplateCurrentLevel: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ZONEATTRIBUTES) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        if (!this.szIconPath.contentEquals(other.szIconPath)) return false
        if (this.dwTemplateMinLevel != other.dwTemplateMinLevel) return false
        if (this.dwTemplateRecommended != other.dwTemplateRecommended) return false
        if (this.dwTemplateCurrentLevel != other.dwTemplateCurrentLevel) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        result = 31 * result + this.szIconPath.contentHashCode()
        result = 31 * result + this.dwTemplateMinLevel.hashCode()
        result = 31 * result + this.dwTemplateRecommended.hashCode()
        result = 31 * result + this.dwTemplateCurrentLevel.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }
}
