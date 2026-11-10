@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public data class Codebasehold(
    public var cbSize: UInt = 0u,
    public var szDistUnit: Pwstr = null,
    public var szCodeBase: Pwstr = null,
    public var dwVersionMS: UInt = 0u,
    public var dwVersionLS: UInt = 0u,
    public var dwStyle: UInt = 0u,
)

public data class Confirmsafety(
    public var clsid: Guid = Guid(),
    public var pUnk: COpaquePointer? = null,
    public var dwFlags: UInt = 0u,
)

public data class Datainfo(
    public var ulTotalSize: UInt = 0u,
    public var ulavrPacketSize: UInt = 0u,
    public var ulConnectSpeed: UInt = 0u,
    public var ulProcessorSpeed: UInt = 0u,
)

public data class HitLoggingInfo(
    public var dwStructSize: UInt = 0u,
    public var lpszLoggedUrlName: Pstr = null,
    public var startTime: Systemtime = Systemtime(),
    public var endTime: Systemtime = Systemtime(),
    public var lpszExtendedInfo: Pstr = null,
)

public data class Protocoldata(
    public var grfFlags: UInt = 0u,
    public var dwState: UInt = 0u,
    public var pData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
)

public data class Protocolfilterdata(
    public var cbSize: UInt = 0u,
    public var pProtocolSink: COpaquePointer? = null,
    public var pProtocol: COpaquePointer? = null,
    public var pUnk: COpaquePointer? = null,
    public var dwFilterFlags: UInt = 0u,
)

public data class ProtocolArgument(
    public var szMethod: Pcwstr = null,
    public var szTargetUrl: Pcwstr = null,
)

public data class RemsecurityAttributes(
    public var nLength: UInt = 0u,
    public var lpSecurityDescriptor: UInt = 0u,
    public var bInheritHandle: Bool = 0,
)

public data class RemBINDINFO(
    public var cbSize: UInt = 0u,
    public var szExtraInfo: Pwstr = null,
    public var grfBindInfoF: UInt = 0u,
    public var dwBindVerb: UInt = 0u,
    public var szCustomVerb: Pwstr = null,
    public var cbstgmedData: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwOptionsFlags: UInt = 0u,
    public var dwCodePage: UInt = 0u,
    public var securityAttributes: RemsecurityAttributes = RemsecurityAttributes(),
    public var iid: Guid = Guid(),
    public var pUnk: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
)

public data class RemFORMATETC(
    public var cfFormat: UInt = 0u,
    public var ptd: UInt = 0u,
    public var dwAspect: UInt = 0u,
    public var lindex: Int = 0,
    public var tymed: UInt = 0u,
)

public data class Softdistinfo(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwAdState: UInt = 0u,
    public var szTitle: Pwstr = null,
    public var szAbstract: Pwstr = null,
    public var szHREF: Pwstr = null,
    public var dwInstalledVersionMS: UInt = 0u,
    public var dwInstalledVersionLS: UInt = 0u,
    public var dwUpdateVersionMS: UInt = 0u,
    public var dwUpdateVersionLS: UInt = 0u,
    public var dwAdvertisedVersionMS: UInt = 0u,
    public var dwAdvertisedVersionLS: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class StartParam(
    public var iid: Guid = Guid(),
    public var pIBindCtx: COpaquePointer? = null,
    public var pItf: COpaquePointer? = null,
)

public data class Zoneattributes(
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
        if (other !is Zoneattributes) return false
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
