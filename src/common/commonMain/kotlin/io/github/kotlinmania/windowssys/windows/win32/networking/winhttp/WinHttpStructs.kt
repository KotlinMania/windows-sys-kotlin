@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage

public data class HttpVersionInfo(
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
)

public data class UrlComponents(
    public var dwStructSize: UInt = 0u,
    public var lpszScheme: Pwstr = null,
    public var dwSchemeLength: UInt = 0u,
    public var nScheme: WinhttpInternetScheme = 0,
    public var lpszHostName: Pwstr = null,
    public var dwHostNameLength: UInt = 0u,
    public var nPort: UShort = 0u,
    public var lpszUserName: Pwstr = null,
    public var dwUserNameLength: UInt = 0u,
    public var lpszPassword: Pwstr = null,
    public var dwPasswordLength: UInt = 0u,
    public var lpszUrlPath: Pwstr = null,
    public var dwUrlPathLength: UInt = 0u,
    public var lpszExtraInfo: Pwstr = null,
    public var dwExtraInfoLength: UInt = 0u,
)

public data class WinhttpAsyncResult(
    public var dwResult: Int = 0,
    public var dwError: UInt = 0u,
)

public data class WinhttpAutoproxyOptions(
    public var dwFlags: UInt = 0u,
    public var dwAutoDetectFlags: UInt = 0u,
    public var lpszAutoConfigUrl: Pcwstr = null,
    public var lpvReserved: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
    public var fAutoLogonIfChallenged: Bool = 0,
)

public data class WinhttpCertificateInfo(
    public var ftExpiry: Filetime = Filetime(),
    public var ftStart: Filetime = Filetime(),
    public var lpszSubjectInfo: Pwstr = null,
    public var lpszIssuerInfo: Pwstr = null,
    public var lpszProtocolName: Pwstr = null,
    public var lpszSignatureAlgName: Pwstr = null,
    public var lpszEncryptionAlgName: Pwstr = null,
    public var dwKeySize: UInt = 0u,
)

public data class WinhttpConnectionGroup(
    public var cConnections: UInt = 0u,
    public var guidGroup: Guid = Guid(),
)

public data class WinhttpConnectionInfo(
    public var cbSize: UInt = 0u,
    public var localAddress: SockaddrStorage = SockaddrStorage(),
    public var remoteAddress: SockaddrStorage = SockaddrStorage(),
)

public data class WinhttpCreds(
    public var lpszUserName: Pstr = null,
    public var lpszPassword: Pstr = null,
    public var lpszRealm: Pstr = null,
    public var dwAuthScheme: WinhttpCredsAuthscheme = 0u,
    public var lpszHostName: Pstr = null,
    public var dwPort: UInt = 0u,
)

public data class WinhttpCredsEx(
    public var lpszUserName: Pstr = null,
    public var lpszPassword: Pstr = null,
    public var lpszRealm: Pstr = null,
    public var dwAuthScheme: WinhttpCredsAuthscheme = 0u,
    public var lpszHostName: Pstr = null,
    public var dwPort: UInt = 0u,
    public var lpszUrl: Pstr = null,
)

public data class WinhttpCurrentUserIeProxyConfig(
    public var fAutoDetect: Bool = 0,
    public var lpszAutoConfigUrl: Pwstr = null,
    public var lpszProxy: Pwstr = null,
    public var lpszProxyBypass: Pwstr = null,
)

public data class WinhttpExtendedHeader(
    public var anonymous1: WinhttpExtendedHeader0 = WinhttpExtendedHeader0(),
    public var anonymous2: WinhttpExtendedHeader1 = WinhttpExtendedHeader1(),
)

public data class WinhttpExtendedHeader0(
    public var pwszName: Pcwstr = null,
    public var pszName: Pcstr = null,
)

public data class WinhttpExtendedHeader1(
    public var pwszValue: Pcwstr = null,
    public var pszValue: Pcstr = null,
)

public data class WinhttpFailedConnectionRetries(
    public var dwMaxRetries: UInt = 0u,
    public var dwAllowedRetryConditions: UInt = 0u,
)

public data class WinhttpHeaderName(
    public var pwszName: Pcwstr = null,
    public var pszName: Pcstr = null,
)

public data class WinhttpHostConnectionGroup(
    public var pwszHost: Pcwstr = null,
    public var cConnectionGroups: UInt = 0u,
    public var pConnectionGroups: WinhttpConnectionGroup? = null,
)

public data class WinhttpHttp2ReceiveWindow(
    public var ulStreamWindow: UInt = 0u,
    public var ulStreamWindowUpdateDelta: UInt = 0u,
)

public data class WinhttpMatchConnectionGuid(
    public var connectionGuid: Guid = Guid(),
    public var ullFlags: ULong = 0uL,
)

public data class WinhttpProxyInfo(
    public var dwAccessType: WinhttpAccessType = 0u,
    public var lpszProxy: Pwstr = null,
    public var lpszProxyBypass: Pwstr = null,
)

public data class WinhttpProxyNetworkingKey(
    public var pbBuffer: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpProxyNetworkingKey) return false
        if (!this.pbBuffer.contentEquals(other.pbBuffer)) return false
        return true
    }

    override fun hashCode(): Int = this.pbBuffer.contentHashCode()
}

public data class WinhttpProxyResult(
    public var cEntries: UInt = 0u,
    public var pEntries: WinhttpProxyResultEntry? = null,
)

public data class WinhttpProxyResultEntry(
    public var fProxy: Bool = 0,
    public var fBypass: Bool = 0,
    public var proxyScheme: WinhttpInternetScheme = 0,
    public var pwszProxy: Pwstr = null,
    public var proxyPort: UShort = 0u,
)

public data class WinhttpProxyResultEx(
    public var cEntries: UInt = 0u,
    public var pEntries: WinhttpProxyResultEntry? = null,
    public var hProxyDetectionHandle: Handle = null,
    public var dwProxyInterfaceAffinity: UInt = 0u,
)

public data class WinhttpProxySettings(
    public var dwStructSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCurrentSettingsVersion: UInt = 0u,
    public var pwszConnectionName: Pwstr = null,
    public var pwszProxy: Pwstr = null,
    public var pwszProxyBypass: Pwstr = null,
    public var pwszAutoconfigUrl: Pwstr = null,
    public var pwszAutoconfigSecondaryUrl: Pwstr = null,
    public var dwAutoDiscoveryFlags: UInt = 0u,
    public var pwszLastKnownGoodAutoConfigUrl: Pwstr = null,
    public var dwAutoconfigReloadDelayMins: UInt = 0u,
    public var ftLastKnownDetectTime: Filetime = Filetime(),
    public var dwDetectedInterfaceIpCount: UInt = 0u,
    public var pdwDetectedInterfaceIp: UInt? = null,
    public var cNetworkKeys: UInt = 0u,
    public var pNetworkKeys: WinhttpProxyNetworkingKey? = null,
)

public data class WinhttpProxySettingsEx(
    public var ullGenerationId: ULong = 0uL,
    public var ullFlags: ULong = 0uL,
    public var pcwszAutoconfigUrl: Pcwstr = null,
    public var pcwszProxy: Pcwstr = null,
    public var pcwszSecureProxy: Pcwstr = null,
    public var cProxyBypasses: UInt = 0u,
    public var rgpcwszProxyBypasses: Pcwstr = null,
    public var dwInterfaceIndex: UInt = 0u,
    public var pcwszConnectionName: Pcwstr = null,
)

public data class WinhttpProxySettingsParam(
    public var ullFlags: ULong = 0uL,
    public var pcwszConnectionName: Pcwstr = null,
    public var pcwszProbeHost: Pcwstr = null,
)

public data class WinhttpQueryConnectionGroupResult(
    public var cHosts: UInt = 0u,
    public var pHostConnectionGroups: WinhttpHostConnectionGroup? = null,
)

public data class WinhttpRequestStats(
    public var ullFlags: ULong = 0uL,
    public var ulIndex: UInt = 0u,
    public var cStats: UInt = 0u,
    public var rgullStats: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpRequestStats) return false
        if (this.ullFlags != other.ullFlags) return false
        if (this.ulIndex != other.ulIndex) return false
        if (this.cStats != other.cStats) return false
        if (!this.rgullStats.contentEquals(other.rgullStats)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullFlags.hashCode()
        result = 31 * result + this.ulIndex.hashCode()
        result = 31 * result + this.cStats.hashCode()
        result = 31 * result + this.rgullStats.contentHashCode()
        return result
    }
}

public data class WinhttpRequestTimes(
    public var cTimes: UInt = 0u,
    public var rgullTimes: ULongArray = ULongArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinhttpRequestTimes) return false
        if (this.cTimes != other.cTimes) return false
        if (!this.rgullTimes.contentEquals(other.rgullTimes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTimes.hashCode()
        result = 31 * result + this.rgullTimes.contentHashCode()
        return result
    }
}

public data class WinhttpResolverCacheConfig(
    public var ulMaxResolverCacheEntries: UInt = 0u,
    public var ulMaxCacheEntryAge: UInt = 0u,
    public var ulMinCacheEntryTtl: UInt = 0u,
    public var secureDnsSetting: WinhttpSecureDnsSetting = 0,
    public var ullConnResolutionWaitTime: ULong = 0uL,
    public var ullFlags: ULong = 0uL,
)

public data class WinhttpWebSocketAsyncResult(
    public var asyncResult: WinhttpAsyncResult = WinhttpAsyncResult(),
    public var operation: WinhttpWebSocketOperation = 0,
)

public data class WinhttpWebSocketStatus(
    public var dwBytesTransferred: UInt = 0u,
    public var eBufferType: WinhttpWebSocketBufferType = 0,
)
