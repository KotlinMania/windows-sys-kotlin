@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class HTTP_VERSION_INFO(public var dwMajorVersion: UInt = 0u, public var dwMinorVersion: UInt = 0u)

public data class URL_COMPONENTS(
    public var dwStructSize: UInt = 0u,
    public var lpszScheme: PWSTR = 0L,
    public var dwSchemeLength: UInt = 0u,
    public var nScheme: WINHTTP_INTERNET_SCHEME = 0,
    public var lpszHostName: PWSTR = 0L,
    public var dwHostNameLength: UInt = 0u,
    public var nPort: UShort = 0u,
    public var lpszUserName: PWSTR = 0L,
    public var dwUserNameLength: UInt = 0u,
    public var lpszPassword: PWSTR = 0L,
    public var dwPasswordLength: UInt = 0u,
    public var lpszUrlPath: PWSTR = 0L,
    public var dwUrlPathLength: UInt = 0u,
    public var lpszExtraInfo: PWSTR = 0L,
    public var dwExtraInfoLength: UInt = 0u,
)

public data class WINHTTP_ASYNC_RESULT(public var dwResult: ULong = 0uL, public var dwError: UInt = 0u)

public data class WINHTTP_AUTOPROXY_OPTIONS(
    public var dwFlags: UInt = 0u,
    public var dwAutoDetectFlags: UInt = 0u,
    public var lpszAutoConfigUrl: PCWSTR = 0L,
    public var lpvReserved: Long = 0L,
    public var dwReserved: UInt = 0u,
    public var fAutoLogonIfChallenged: BOOL = 0,
)

public data class WINHTTP_CERTIFICATE_INFO(
    public var ftExpiry: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftStart: Foundation.FILETIME = Foundation.FILETIME(),
    public var lpszSubjectInfo: PWSTR = 0L,
    public var lpszIssuerInfo: PWSTR = 0L,
    public var lpszProtocolName: PWSTR = 0L,
    public var lpszSignatureAlgName: PWSTR = 0L,
    public var lpszEncryptionAlgName: PWSTR = 0L,
    public var dwKeySize: UInt = 0u,
)

public data class WINHTTP_CONNECTION_GROUP(public var cConnections: UInt = 0u, public var guidGroup: GUID = GUID())

public data class WINHTTP_CONNECTION_INFO(
    public var cbSize: UInt = 0u,
    public var LocalAddress: WinSock.SOCKADDR_STORAGE = WinSock.SOCKADDR_STORAGE(),
    public var RemoteAddress: WinSock.SOCKADDR_STORAGE = WinSock.SOCKADDR_STORAGE(),
)

public data class WINHTTP_CREDS(
    public var lpszUserName: PSTR = 0L,
    public var lpszPassword: PSTR = 0L,
    public var lpszRealm: PSTR = 0L,
    public var dwAuthScheme: WINHTTP_CREDS_AUTHSCHEME = 0u,
    public var lpszHostName: PSTR = 0L,
    public var dwPort: UInt = 0u,
)

public data class WINHTTP_CREDS_EX(
    public var lpszUserName: PSTR = 0L,
    public var lpszPassword: PSTR = 0L,
    public var lpszRealm: PSTR = 0L,
    public var dwAuthScheme: WINHTTP_CREDS_AUTHSCHEME = 0u,
    public var lpszHostName: PSTR = 0L,
    public var dwPort: UInt = 0u,
    public var lpszUrl: PSTR = 0L,
)

public data class WINHTTP_CURRENT_USER_IE_PROXY_CONFIG(
    public var fAutoDetect: BOOL = 0,
    public var lpszAutoConfigUrl: PWSTR = 0L,
    public var lpszProxy: PWSTR = 0L,
    public var lpszProxyBypass: PWSTR = 0L,
)

public data class WINHTTP_EXTENDED_HEADER(public var Anonymous1: WINHTTP_EXTENDED_HEADER_0 = WINHTTP_EXTENDED_HEADER_0(), public var Anonymous2: WINHTTP_EXTENDED_HEADER_1 = WINHTTP_EXTENDED_HEADER_1())

public data class WINHTTP_EXTENDED_HEADER_0(public var pwszName: PCWSTR = 0L, public var pszName: PCSTR = 0L)

public data class WINHTTP_EXTENDED_HEADER_1(public var pwszValue: PCWSTR = 0L, public var pszValue: PCSTR = 0L)

public data class WINHTTP_FAILED_CONNECTION_RETRIES(public var dwMaxRetries: UInt = 0u, public var dwAllowedRetryConditions: UInt = 0u)

public data class WINHTTP_HEADER_NAME(public var pwszName: PCWSTR = 0L, public var pszName: PCSTR = 0L)

public data class WINHTTP_HOST_CONNECTION_GROUP(
    public var pwszHost: PCWSTR = 0L,
    public var cConnectionGroups: UInt = 0u,
    public var pConnectionGroups: Long = 0L,
)

public data class WINHTTP_HTTP2_RECEIVE_WINDOW(public var ulStreamWindow: UInt = 0u, public var ulStreamWindowUpdateDelta: UInt = 0u)

public data class WINHTTP_MATCH_CONNECTION_GUID(public var ConnectionGuid: GUID = GUID(), public var ullFlags: ULong = 0uL)

public data class WINHTTP_PROXY_INFO(
    public var dwAccessType: WINHTTP_ACCESS_TYPE = 0u,
    public var lpszProxy: PWSTR = 0L,
    public var lpszProxyBypass: PWSTR = 0L,
)

public data class WINHTTP_PROXY_NETWORKING_KEY(public var pbBuffer: UByteArray = UByteArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINHTTP_PROXY_NETWORKING_KEY) return false
        if (!this.pbBuffer.contentEquals(other.pbBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.pbBuffer.contentHashCode()
    }
}

public data class WINHTTP_PROXY_RESULT(public var cEntries: UInt = 0u, public var pEntries: Long = 0L)

public data class WINHTTP_PROXY_RESULT_ENTRY(
    public var fProxy: BOOL = 0,
    public var fBypass: BOOL = 0,
    public var ProxyScheme: WINHTTP_INTERNET_SCHEME = 0,
    public var pwszProxy: PWSTR = 0L,
    public var ProxyPort: UShort = 0u,
)

public data class WINHTTP_PROXY_RESULT_EX(
    public var cEntries: UInt = 0u,
    public var pEntries: Long = 0L,
    public var hProxyDetectionHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var dwProxyInterfaceAffinity: UInt = 0u,
)

public data class WINHTTP_PROXY_SETTINGS(
    public var dwStructSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwCurrentSettingsVersion: UInt = 0u,
    public var pwszConnectionName: PWSTR = 0L,
    public var pwszProxy: PWSTR = 0L,
    public var pwszProxyBypass: PWSTR = 0L,
    public var pwszAutoconfigUrl: PWSTR = 0L,
    public var pwszAutoconfigSecondaryUrl: PWSTR = 0L,
    public var dwAutoDiscoveryFlags: UInt = 0u,
    public var pwszLastKnownGoodAutoConfigUrl: PWSTR = 0L,
    public var dwAutoconfigReloadDelayMins: UInt = 0u,
    public var ftLastKnownDetectTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var dwDetectedInterfaceIpCount: UInt = 0u,
    public var pdwDetectedInterfaceIp: Long = 0L,
    public var cNetworkKeys: UInt = 0u,
    public var pNetworkKeys: Long = 0L,
)

public data class WINHTTP_PROXY_SETTINGS_EX(
    public var ullGenerationId: ULong = 0uL,
    public var ullFlags: ULong = 0uL,
    public var pcwszAutoconfigUrl: PCWSTR = 0L,
    public var pcwszProxy: PCWSTR = 0L,
    public var pcwszSecureProxy: PCWSTR = 0L,
    public var cProxyBypasses: UInt = 0u,
    public var rgpcwszProxyBypasses: Long = 0L,
    public var dwInterfaceIndex: UInt = 0u,
    public var pcwszConnectionName: PCWSTR = 0L,
)

public data class WINHTTP_PROXY_SETTINGS_PARAM(
    public var ullFlags: ULong = 0uL,
    public var pcwszConnectionName: PCWSTR = 0L,
    public var pcwszProbeHost: PCWSTR = 0L,
)

public data class WINHTTP_QUERY_CONNECTION_GROUP_RESULT(public var cHosts: UInt = 0u, public var pHostConnectionGroups: Long = 0L)

public data class WINHTTP_REQUEST_STATS(
    public var ullFlags: ULong = 0uL,
    public var ulIndex: UInt = 0u,
    public var cStats: UInt = 0u,
    public var rgullStats: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINHTTP_REQUEST_STATS) return false
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

public data class WINHTTP_REQUEST_TIMES(public var cTimes: UInt = 0u, public var rgullTimes: ULongArray = ULongArray(64)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINHTTP_REQUEST_TIMES) return false
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

public data class WINHTTP_RESOLVER_CACHE_CONFIG(
    public var ulMaxResolverCacheEntries: UInt = 0u,
    public var ulMaxCacheEntryAge: UInt = 0u,
    public var ulMinCacheEntryTtl: UInt = 0u,
    public var SecureDnsSetting: WINHTTP_SECURE_DNS_SETTING = 0,
    public var ullConnResolutionWaitTime: ULong = 0uL,
    public var ullFlags: ULong = 0uL,
)

public data class WINHTTP_WEB_SOCKET_ASYNC_RESULT(public var AsyncResult: WINHTTP_ASYNC_RESULT = WINHTTP_ASYNC_RESULT(), public var Operation: WINHTTP_WEB_SOCKET_OPERATION = 0)

public data class WINHTTP_WEB_SOCKET_STATUS(public var dwBytesTransferred: UInt = 0u, public var eBufferType: WINHTTP_WEB_SOCKET_BUFFER_TYPE = 0)
