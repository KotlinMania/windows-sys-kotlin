@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class APP_CACHE_DOWNLOAD_ENTRY(public var pwszUrl: PWSTR = 0L, public var dwEntryType: UInt = 0u)

public data class APP_CACHE_DOWNLOAD_LIST(public var dwEntryCount: UInt = 0u, public var pEntries: Long = 0L)

public data class APP_CACHE_GROUP_INFO(
    public var pwszManifestUrl: PWSTR = 0L,
    public var ftLastAccessTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ullSize: ULong = 0uL,
)

public data class APP_CACHE_GROUP_LIST(public var dwAppCacheGroupCount: UInt = 0u, public var pAppCacheGroups: Long = 0L)

public data class AUTO_PROXY_SCRIPT_BUFFER(
    public var dwStructSize: UInt = 0u,
    public var lpszScriptBuffer: PSTR = 0L,
    public var dwScriptBufferSize: UInt = 0u,
)

public data class AutoProxyHelperFunctions(public var lpVtbl: Long = 0L)

public data class AutoProxyHelperVtbl(
    public var IsResolvable: Long = 0L,
    public var GetIPAddress: Long = 0L,
    public var ResolveHostName: Long = 0L,
    public var IsInNet: Long = 0L,
    public var IsResolvableEx: Long = 0L,
    public var GetIPAddressEx: Long = 0L,
    public var ResolveHostNameEx: Long = 0L,
    public var IsInNetEx: Long = 0L,
    public var SortIpList: Long = 0L,
)

public data class COOKIE_DLG_INFO(
    public var pszServer: PWSTR = 0L,
    public var pic: Long = 0L,
    public var dwStopWarning: UInt = 0u,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var pszHeader: PWSTR = 0L,
    public var dwOperation: UInt = 0u,
)

public data class CookieDecision(public var dwCookieState: UInt = 0u, public var fAllowSession: BOOL = 0)

public data class GOPHER_ABSTRACT_ATTRIBUTE_TYPE(public var ShortAbstract: Long = 0L, public var AbstractFile: Long = 0L)

public data class GOPHER_ADMIN_ATTRIBUTE_TYPE(public var Comment: Long = 0L, public var EmailAddress: Long = 0L)

public data class GOPHER_ASK_ATTRIBUTE_TYPE(public var QuestionType: Long = 0L, public var QuestionText: Long = 0L)

public data class GOPHER_ATTRIBUTE_TYPE(
    public var CategoryId: UInt = 0u,
    public var AttributeId: UInt = 0u,
    public var AttributeType: GOPHER_ATTRIBUTE_TYPE_0 = GOPHER_ATTRIBUTE_TYPE_0(),
)

public class GOPHER_ATTRIBUTE_TYPE_0(
    public var Admin: GOPHER_ADMIN_ATTRIBUTE_TYPE = GOPHER_ADMIN_ATTRIBUTE_TYPE(),
    public var ModDate: GOPHER_MOD_DATE_ATTRIBUTE_TYPE = GOPHER_MOD_DATE_ATTRIBUTE_TYPE(),
    public var Ttl: GOPHER_TTL_ATTRIBUTE_TYPE = GOPHER_TTL_ATTRIBUTE_TYPE(),
    public var Score: GOPHER_SCORE_ATTRIBUTE_TYPE = GOPHER_SCORE_ATTRIBUTE_TYPE(),
    public var ScoreRange: GOPHER_SCORE_RANGE_ATTRIBUTE_TYPE = GOPHER_SCORE_RANGE_ATTRIBUTE_TYPE(),
    public var Site: GOPHER_SITE_ATTRIBUTE_TYPE = GOPHER_SITE_ATTRIBUTE_TYPE(),
    public var Organization: GOPHER_ORGANIZATION_ATTRIBUTE_TYPE = GOPHER_ORGANIZATION_ATTRIBUTE_TYPE(),
    public var Location: GOPHER_LOCATION_ATTRIBUTE_TYPE = GOPHER_LOCATION_ATTRIBUTE_TYPE(),
    public var GeographicalLocation: GOPHER_GEOGRAPHICAL_LOCATION_ATTRIBUTE_TYPE = GOPHER_GEOGRAPHICAL_LOCATION_ATTRIBUTE_TYPE(),
    public var TimeZone: GOPHER_TIMEZONE_ATTRIBUTE_TYPE = GOPHER_TIMEZONE_ATTRIBUTE_TYPE(),
    public var Provider: GOPHER_PROVIDER_ATTRIBUTE_TYPE = GOPHER_PROVIDER_ATTRIBUTE_TYPE(),
    public var Version: GOPHER_VERSION_ATTRIBUTE_TYPE = GOPHER_VERSION_ATTRIBUTE_TYPE(),
    public var Abstract: GOPHER_ABSTRACT_ATTRIBUTE_TYPE = GOPHER_ABSTRACT_ATTRIBUTE_TYPE(),
    public var View: GOPHER_VIEW_ATTRIBUTE_TYPE = GOPHER_VIEW_ATTRIBUTE_TYPE(),
    public var Veronica: GOPHER_VERONICA_ATTRIBUTE_TYPE = GOPHER_VERONICA_ATTRIBUTE_TYPE(),
    public var Ask: GOPHER_ASK_ATTRIBUTE_TYPE = GOPHER_ASK_ATTRIBUTE_TYPE(),
    public var Unknown: GOPHER_UNKNOWN_ATTRIBUTE_TYPE = GOPHER_UNKNOWN_ATTRIBUTE_TYPE(),
)

public data class GOPHER_FIND_DATAA(
    public var DisplayString: ByteArray = ByteArray(129),
    public var GopherType: GOPHER_TYPE = 0u,
    public var SizeLow: UInt = 0u,
    public var SizeHigh: UInt = 0u,
    public var LastModificationTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var Locator: ByteArray = ByteArray(654),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GOPHER_FIND_DATAA) return false
        if (!this.DisplayString.contentEquals(other.DisplayString)) return false
        if (this.GopherType != other.GopherType) return false
        if (this.SizeLow != other.SizeLow) return false
        if (this.SizeHigh != other.SizeHigh) return false
        if (this.LastModificationTime != other.LastModificationTime) return false
        if (!this.Locator.contentEquals(other.Locator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DisplayString.contentHashCode()
        result = 31 * result + this.GopherType.hashCode()
        result = 31 * result + this.SizeLow.hashCode()
        result = 31 * result + this.SizeHigh.hashCode()
        result = 31 * result + this.LastModificationTime.hashCode()
        result = 31 * result + this.Locator.contentHashCode()
        return result
    }
}

public data class GOPHER_FIND_DATAW(
    public var DisplayString: UShortArray = UShortArray(129),
    public var GopherType: GOPHER_TYPE = 0u,
    public var SizeLow: UInt = 0u,
    public var SizeHigh: UInt = 0u,
    public var LastModificationTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var Locator: UShortArray = UShortArray(654),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GOPHER_FIND_DATAW) return false
        if (!this.DisplayString.contentEquals(other.DisplayString)) return false
        if (this.GopherType != other.GopherType) return false
        if (this.SizeLow != other.SizeLow) return false
        if (this.SizeHigh != other.SizeHigh) return false
        if (this.LastModificationTime != other.LastModificationTime) return false
        if (!this.Locator.contentEquals(other.Locator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DisplayString.contentHashCode()
        result = 31 * result + this.GopherType.hashCode()
        result = 31 * result + this.SizeLow.hashCode()
        result = 31 * result + this.SizeHigh.hashCode()
        result = 31 * result + this.LastModificationTime.hashCode()
        result = 31 * result + this.Locator.contentHashCode()
        return result
    }
}

public data class GOPHER_GEOGRAPHICAL_LOCATION_ATTRIBUTE_TYPE(
    public var DegreesNorth: Int = 0,
    public var MinutesNorth: Int = 0,
    public var SecondsNorth: Int = 0,
    public var DegreesEast: Int = 0,
    public var MinutesEast: Int = 0,
    public var SecondsEast: Int = 0,
)

public data class GOPHER_LOCATION_ATTRIBUTE_TYPE(public var Location: Long = 0L)

public data class GOPHER_MOD_DATE_ATTRIBUTE_TYPE(public var DateAndTime: Foundation.FILETIME = Foundation.FILETIME())

public data class GOPHER_ORGANIZATION_ATTRIBUTE_TYPE(public var Organization: Long = 0L)

public data class GOPHER_PROVIDER_ATTRIBUTE_TYPE(public var Provider: Long = 0L)

public data class GOPHER_SCORE_ATTRIBUTE_TYPE(public var Score: Int = 0)

public data class GOPHER_SCORE_RANGE_ATTRIBUTE_TYPE(public var LowerBound: Int = 0, public var UpperBound: Int = 0)

public data class GOPHER_SITE_ATTRIBUTE_TYPE(public var Site: Long = 0L)

public data class GOPHER_TIMEZONE_ATTRIBUTE_TYPE(public var Zone: Int = 0)

public data class GOPHER_TTL_ATTRIBUTE_TYPE(public var Ttl: UInt = 0u)

public data class GOPHER_UNKNOWN_ATTRIBUTE_TYPE(public var Text: Long = 0L)

public data class GOPHER_VERONICA_ATTRIBUTE_TYPE(public var TreeWalk: BOOL = 0)

public data class GOPHER_VERSION_ATTRIBUTE_TYPE(public var Version: Long = 0L)

public data class GOPHER_VIEW_ATTRIBUTE_TYPE(
    public var ContentType: Long = 0L,
    public var Language: Long = 0L,
    public var Size: UInt = 0u,
)

public data class HTTP_PUSH_NOTIFICATION_STATUS(public var ChannelStatusValid: BOOL = 0, public var ChannelStatus: UInt = 0u)

public data class HTTP_PUSH_TRANSPORT_SETTING(public var TransportSettingId: GUID = GUID(), public var BrokerEventId: GUID = GUID())

public data class HTTP_REQUEST_TIMES(public var cTimes: UInt = 0u, public var rgTimes: ULongArray = ULongArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HTTP_REQUEST_TIMES) return false
        if (this.cTimes != other.cTimes) return false
        if (!this.rgTimes.contentEquals(other.rgTimes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTimes.hashCode()
        result = 31 * result + this.rgTimes.contentHashCode()
        return result
    }
}

public data class HTTP_WEB_SOCKET_ASYNC_RESULT(
    public var AsyncResult: INTERNET_ASYNC_RESULT = INTERNET_ASYNC_RESULT(),
    public var Operation: HTTP_WEB_SOCKET_OPERATION = 0,
    public var BufferType: HTTP_WEB_SOCKET_BUFFER_TYPE = 0,
    public var dwBytesTransferred: UInt = 0u,
)

public data class INTERNET_ASYNC_RESULT(public var dwResult: ULong = 0uL, public var dwError: UInt = 0u)

public data class INTERNET_AUTH_NOTIFY_DATA(
    public var cbStruct: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var pfnNotify: PFN_AUTH_NOTIFY = null,
    public var dwContext: ULong = 0uL,
)

public data class INTERNET_BUFFERSA(
    public var dwStructSize: UInt = 0u,
    public var Next: Long = 0L,
    public var lpcszHeader: PCSTR = 0L,
    public var dwHeadersLength: UInt = 0u,
    public var dwHeadersTotal: UInt = 0u,
    public var lpvBuffer: Long = 0L,
    public var dwBufferLength: UInt = 0u,
    public var dwBufferTotal: UInt = 0u,
    public var dwOffsetLow: UInt = 0u,
    public var dwOffsetHigh: UInt = 0u,
)

public data class INTERNET_BUFFERSW(
    public var dwStructSize: UInt = 0u,
    public var Next: Long = 0L,
    public var lpcszHeader: PCWSTR = 0L,
    public var dwHeadersLength: UInt = 0u,
    public var dwHeadersTotal: UInt = 0u,
    public var lpvBuffer: Long = 0L,
    public var dwBufferLength: UInt = 0u,
    public var dwBufferTotal: UInt = 0u,
    public var dwOffsetLow: UInt = 0u,
    public var dwOffsetHigh: UInt = 0u,
)

public data class INTERNET_CACHE_CONFIG_INFOA(
    public var dwStructSize: UInt = 0u,
    public var dwContainer: UInt = 0u,
    public var dwQuota: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var fPerUser: BOOL = 0,
    public var dwSyncMode: UInt = 0u,
    public var dwNumCachePaths: UInt = 0u,
    public var Anonymous: INTERNET_CACHE_CONFIG_INFOA_0 = INTERNET_CACHE_CONFIG_INFOA_0(),
    public var dwNormalUsage: UInt = 0u,
    public var dwExemptUsage: UInt = 0u,
)

public data class INTERNET_CACHE_CONFIG_INFOA_0(public var Anonymous: INTERNET_CACHE_CONFIG_INFOA_0_0 = INTERNET_CACHE_CONFIG_INFOA_0_0(), public var CachePaths: List<INTERNET_CACHE_CONFIG_PATH_ENTRYA> = List(1) { INTERNET_CACHE_CONFIG_PATH_ENTRYA() })

public data class INTERNET_CACHE_CONFIG_INFOA_0_0(public var CachePath: ByteArray = ByteArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INTERNET_CACHE_CONFIG_INFOA_0_0) return false
        if (!this.CachePath.contentEquals(other.CachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class INTERNET_CACHE_CONFIG_INFOW(
    public var dwStructSize: UInt = 0u,
    public var dwContainer: UInt = 0u,
    public var dwQuota: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var fPerUser: BOOL = 0,
    public var dwSyncMode: UInt = 0u,
    public var dwNumCachePaths: UInt = 0u,
    public var Anonymous: INTERNET_CACHE_CONFIG_INFOW_0 = INTERNET_CACHE_CONFIG_INFOW_0(),
    public var dwNormalUsage: UInt = 0u,
    public var dwExemptUsage: UInt = 0u,
)

public data class INTERNET_CACHE_CONFIG_INFOW_0(public var Anonymous: INTERNET_CACHE_CONFIG_INFOW_0_0 = INTERNET_CACHE_CONFIG_INFOW_0_0(), public var CachePaths: List<INTERNET_CACHE_CONFIG_PATH_ENTRYW> = List(1) { INTERNET_CACHE_CONFIG_PATH_ENTRYW() })

public data class INTERNET_CACHE_CONFIG_INFOW_0_0(public var CachePath: UShortArray = UShortArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INTERNET_CACHE_CONFIG_INFOW_0_0) return false
        if (!this.CachePath.contentEquals(other.CachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class INTERNET_CACHE_CONFIG_PATH_ENTRYA(public var CachePath: ByteArray = ByteArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INTERNET_CACHE_CONFIG_PATH_ENTRYA) return false
        if (!this.CachePath.contentEquals(other.CachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class INTERNET_CACHE_CONFIG_PATH_ENTRYW(public var CachePath: UShortArray = UShortArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INTERNET_CACHE_CONFIG_PATH_ENTRYW) return false
        if (!this.CachePath.contentEquals(other.CachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class INTERNET_CACHE_CONTAINER_INFOA(
    public var dwCacheVersion: UInt = 0u,
    public var lpszName: PSTR = 0L,
    public var lpszCachePrefix: PSTR = 0L,
    public var lpszVolumeLabel: PSTR = 0L,
    public var lpszVolumeTitle: PSTR = 0L,
)

public data class INTERNET_CACHE_CONTAINER_INFOW(
    public var dwCacheVersion: UInt = 0u,
    public var lpszName: PWSTR = 0L,
    public var lpszCachePrefix: PWSTR = 0L,
    public var lpszVolumeLabel: PWSTR = 0L,
    public var lpszVolumeTitle: PWSTR = 0L,
)

public data class INTERNET_CACHE_ENTRY_INFOA(
    public var dwStructSize: UInt = 0u,
    public var lpszSourceUrlName: PSTR = 0L,
    public var lpszLocalFileName: PSTR = 0L,
    public var CacheEntryType: UInt = 0u,
    public var dwUseCount: UInt = 0u,
    public var dwHitRate: UInt = 0u,
    public var dwSizeLow: UInt = 0u,
    public var dwSizeHigh: UInt = 0u,
    public var LastModifiedTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ExpireTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var LastAccessTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var LastSyncTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var lpHeaderInfo: PSTR = 0L,
    public var dwHeaderInfoSize: UInt = 0u,
    public var lpszFileExtension: PSTR = 0L,
    public var Anonymous: INTERNET_CACHE_ENTRY_INFOA_0 = INTERNET_CACHE_ENTRY_INFOA_0(),
)

public data class INTERNET_CACHE_ENTRY_INFOA_0(public var dwReserved: UInt = 0u, public var dwExemptDelta: UInt = 0u)

public data class INTERNET_CACHE_ENTRY_INFOW(
    public var dwStructSize: UInt = 0u,
    public var lpszSourceUrlName: PWSTR = 0L,
    public var lpszLocalFileName: PWSTR = 0L,
    public var CacheEntryType: UInt = 0u,
    public var dwUseCount: UInt = 0u,
    public var dwHitRate: UInt = 0u,
    public var dwSizeLow: UInt = 0u,
    public var dwSizeHigh: UInt = 0u,
    public var LastModifiedTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ExpireTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var LastAccessTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var LastSyncTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var lpHeaderInfo: PWSTR = 0L,
    public var dwHeaderInfoSize: UInt = 0u,
    public var lpszFileExtension: PWSTR = 0L,
    public var Anonymous: INTERNET_CACHE_ENTRY_INFOW_0 = INTERNET_CACHE_ENTRY_INFOW_0(),
)

public data class INTERNET_CACHE_ENTRY_INFOW_0(public var dwReserved: UInt = 0u, public var dwExemptDelta: UInt = 0u)

public data class INTERNET_CACHE_GROUP_INFOA(
    public var dwGroupSize: UInt = 0u,
    public var dwGroupFlags: UInt = 0u,
    public var dwGroupType: UInt = 0u,
    public var dwDiskUsage: UInt = 0u,
    public var dwDiskQuota: UInt = 0u,
    public var dwOwnerStorage: UIntArray = UIntArray(4),
    public var szGroupName: ByteArray = ByteArray(120),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INTERNET_CACHE_GROUP_INFOA) return false
        if (this.dwGroupSize != other.dwGroupSize) return false
        if (this.dwGroupFlags != other.dwGroupFlags) return false
        if (this.dwGroupType != other.dwGroupType) return false
        if (this.dwDiskUsage != other.dwDiskUsage) return false
        if (this.dwDiskQuota != other.dwDiskQuota) return false
        if (!this.dwOwnerStorage.contentEquals(other.dwOwnerStorage)) return false
        if (!this.szGroupName.contentEquals(other.szGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwGroupSize.hashCode()
        result = 31 * result + this.dwGroupFlags.hashCode()
        result = 31 * result + this.dwGroupType.hashCode()
        result = 31 * result + this.dwDiskUsage.hashCode()
        result = 31 * result + this.dwDiskQuota.hashCode()
        result = 31 * result + this.dwOwnerStorage.contentHashCode()
        result = 31 * result + this.szGroupName.contentHashCode()
        return result
    }
}

public data class INTERNET_CACHE_GROUP_INFOW(
    public var dwGroupSize: UInt = 0u,
    public var dwGroupFlags: UInt = 0u,
    public var dwGroupType: UInt = 0u,
    public var dwDiskUsage: UInt = 0u,
    public var dwDiskQuota: UInt = 0u,
    public var dwOwnerStorage: UIntArray = UIntArray(4),
    public var szGroupName: UShortArray = UShortArray(120),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INTERNET_CACHE_GROUP_INFOW) return false
        if (this.dwGroupSize != other.dwGroupSize) return false
        if (this.dwGroupFlags != other.dwGroupFlags) return false
        if (this.dwGroupType != other.dwGroupType) return false
        if (this.dwDiskUsage != other.dwDiskUsage) return false
        if (this.dwDiskQuota != other.dwDiskQuota) return false
        if (!this.dwOwnerStorage.contentEquals(other.dwOwnerStorage)) return false
        if (!this.szGroupName.contentEquals(other.szGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwGroupSize.hashCode()
        result = 31 * result + this.dwGroupFlags.hashCode()
        result = 31 * result + this.dwGroupType.hashCode()
        result = 31 * result + this.dwDiskUsage.hashCode()
        result = 31 * result + this.dwDiskQuota.hashCode()
        result = 31 * result + this.dwOwnerStorage.contentHashCode()
        result = 31 * result + this.szGroupName.contentHashCode()
        return result
    }
}

public data class INTERNET_CACHE_TIMESTAMPS(public var ftExpires: Foundation.FILETIME = Foundation.FILETIME(), public var ftLastModified: Foundation.FILETIME = Foundation.FILETIME())

public data class INTERNET_CALLBACK_COOKIE(
    public var pcwszName: PCWSTR = 0L,
    public var pcwszValue: PCWSTR = 0L,
    public var pcwszDomain: PCWSTR = 0L,
    public var pcwszPath: PCWSTR = 0L,
    public var ftExpires: Foundation.FILETIME = Foundation.FILETIME(),
    public var dwFlags: UInt = 0u,
)

public data class INTERNET_CERTIFICATE_INFO(
    public var ftExpiry: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftStart: Foundation.FILETIME = Foundation.FILETIME(),
    public var lpszSubjectInfo: Long = 0L,
    public var lpszIssuerInfo: Long = 0L,
    public var lpszProtocolName: Long = 0L,
    public var lpszSignatureAlgName: Long = 0L,
    public var lpszEncryptionAlgName: Long = 0L,
    public var dwKeySize: UInt = 0u,
)

public data class INTERNET_CONNECTED_INFO(public var dwConnectedState: INTERNET_STATE = 0u, public var dwFlags: UInt = 0u)

public data class INTERNET_COOKIE(
    public var cbSize: UInt = 0u,
    public var pszName: PSTR = 0L,
    public var pszData: PSTR = 0L,
    public var pszDomain: PSTR = 0L,
    public var pszPath: PSTR = 0L,
    public var pftExpires: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var pszUrl: PSTR = 0L,
    public var pszP3PPolicy: PSTR = 0L,
)

public data class INTERNET_COOKIE2(
    public var pwszName: PWSTR = 0L,
    public var pwszValue: PWSTR = 0L,
    public var pwszDomain: PWSTR = 0L,
    public var pwszPath: PWSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var ftExpires: Foundation.FILETIME = Foundation.FILETIME(),
    public var fExpiresSet: BOOL = 0,
)

public data class INTERNET_CREDENTIALS(
    public var lpcwszHostName: PCWSTR = 0L,
    public var dwPort: UInt = 0u,
    public var dwScheme: UInt = 0u,
    public var lpcwszUrl: PCWSTR = 0L,
    public var lpcwszRealm: PCWSTR = 0L,
    public var fAuthIdentity: BOOL = 0,
    public var Anonymous: INTERNET_CREDENTIALS_0 = INTERNET_CREDENTIALS_0(),
)

public data class INTERNET_CREDENTIALS_0(public var Anonymous: INTERNET_CREDENTIALS_0_0 = INTERNET_CREDENTIALS_0_0(), public var pAuthIdentityOpaque: Long = 0L)

public data class INTERNET_CREDENTIALS_0_0(public var lpcwszUserName: PCWSTR = 0L, public var lpcwszPassword: PCWSTR = 0L)

public data class INTERNET_DIAGNOSTIC_SOCKET_INFO(
    public var Socket: ULong = 0uL,
    public var SourcePort: UInt = 0u,
    public var DestPort: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class INTERNET_DOWNLOAD_MODE_HANDLE(public var pcwszFileName: PCWSTR = 0L, public var phFile: Long = 0L)

public data class INTERNET_END_BROWSER_SESSION_DATA(public var lpBuffer: Long = 0L, public var dwBufferLength: UInt = 0u)

public data class INTERNET_PER_CONN_OPTIONA(public var dwOption: INTERNET_PER_CONN = 0u, public var Value: INTERNET_PER_CONN_OPTIONA_0 = INTERNET_PER_CONN_OPTIONA_0())

public data class INTERNET_PER_CONN_OPTIONA_0(
    public var dwValue: UInt = 0u,
    public var pszValue: PSTR = 0L,
    public var ftValue: Foundation.FILETIME = Foundation.FILETIME(),
)

public data class INTERNET_PER_CONN_OPTIONW(public var dwOption: INTERNET_PER_CONN = 0u, public var Value: INTERNET_PER_CONN_OPTIONW_0 = INTERNET_PER_CONN_OPTIONW_0())

public data class INTERNET_PER_CONN_OPTIONW_0(
    public var dwValue: UInt = 0u,
    public var pszValue: PWSTR = 0L,
    public var ftValue: Foundation.FILETIME = Foundation.FILETIME(),
)

public data class INTERNET_PER_CONN_OPTION_LISTA(
    public var dwSize: UInt = 0u,
    public var pszConnection: PSTR = 0L,
    public var dwOptionCount: UInt = 0u,
    public var dwOptionError: UInt = 0u,
    public var pOptions: Long = 0L,
)

public data class INTERNET_PER_CONN_OPTION_LISTW(
    public var dwSize: UInt = 0u,
    public var pszConnection: PWSTR = 0L,
    public var dwOptionCount: UInt = 0u,
    public var dwOptionError: UInt = 0u,
    public var pOptions: Long = 0L,
)

public data class INTERNET_PREFETCH_STATUS(public var dwStatus: UInt = 0u, public var dwSize: UInt = 0u)

public data class INTERNET_PROXY_INFO(
    public var dwAccessType: INTERNET_ACCESS_TYPE = 0u,
    public var lpszProxy: Long = 0L,
    public var lpszProxyBypass: Long = 0L,
)

public data class INTERNET_SECURITY_CONNECTION_INFO(
    public var dwSize: UInt = 0u,
    public var fSecure: BOOL = 0,
    public var connectionInfo: Security.Authentication.Identity.SecPkgContext_ConnectionInfo = Security.Authentication.Identity.SecPkgContext_ConnectionInfo(),
    public var cipherInfo: Security.Authentication.Identity.SecPkgContext_CipherInfo = Security.Authentication.Identity.SecPkgContext_CipherInfo(),
)

public data class INTERNET_SECURITY_INFO(
    public var dwSize: UInt = 0u,
    public var pCertificate: Long = 0L,
    public var pcCertChain: Long = 0L,
    public var connectionInfo: Security.Authentication.Identity.SecPkgContext_ConnectionInfo = Security.Authentication.Identity.SecPkgContext_ConnectionInfo(),
    public var cipherInfo: Security.Authentication.Identity.SecPkgContext_CipherInfo = Security.Authentication.Identity.SecPkgContext_CipherInfo(),
    public var pcUnverifiedCertChain: Long = 0L,
    public var channelBindingToken: Security.Authentication.Identity.SecPkgContext_Bindings = Security.Authentication.Identity.SecPkgContext_Bindings(),
)

public data class INTERNET_SERVER_CONNECTION_STATE(
    public var lpcwszHostName: PCWSTR = 0L,
    public var fProxy: BOOL = 0,
    public var dwCounter: UInt = 0u,
    public var dwConnectionLimit: UInt = 0u,
    public var dwAvailableCreates: UInt = 0u,
    public var dwAvailableKeepAlives: UInt = 0u,
    public var dwActiveConnections: UInt = 0u,
    public var dwWaiters: UInt = 0u,
)

public data class INTERNET_VERSION_INFO(public var dwMajorVersion: UInt = 0u, public var dwMinorVersion: UInt = 0u)

public data class IncomingCookieState(
    public var cSession: Int = 0,
    public var cPersistent: Int = 0,
    public var cAccepted: Int = 0,
    public var cLeashed: Int = 0,
    public var cDowngraded: Int = 0,
    public var cBlocked: Int = 0,
    public var pszLocation: PCSTR = 0L,
)

public data class InternetCookieHistory(
    public var fAccepted: BOOL = 0,
    public var fLeashed: BOOL = 0,
    public var fDowngraded: BOOL = 0,
    public var fRejected: BOOL = 0,
)

public data class OutgoingCookieState(
    public var cSent: Int = 0,
    public var cSuppressed: Int = 0,
    public var pszLocation: PCSTR = 0L,
)

public data class ProofOfPossessionCookieInfo(
    public var name: PWSTR = 0L,
    public var data: PWSTR = 0L,
    public var flags: UInt = 0u,
    public var p3pHeader: PWSTR = 0L,
)

public data class URLCACHE_ENTRY_INFO(
    public var pwszSourceUrlName: PWSTR = 0L,
    public var pwszLocalFileName: PWSTR = 0L,
    public var dwCacheEntryType: UInt = 0u,
    public var dwUseCount: UInt = 0u,
    public var dwHitRate: UInt = 0u,
    public var dwSizeLow: UInt = 0u,
    public var dwSizeHigh: UInt = 0u,
    public var ftLastModifiedTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftExpireTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastAccessTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastSyncTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var pbHeaderInfo: Long = 0L,
    public var cbHeaderInfoSize: UInt = 0u,
    public var pbExtraData: Long = 0L,
    public var cbExtraDataSize: UInt = 0u,
)

public data class URL_COMPONENTSA(
    public var dwStructSize: UInt = 0u,
    public var lpszScheme: PSTR = 0L,
    public var dwSchemeLength: UInt = 0u,
    public var nScheme: INTERNET_SCHEME = 0,
    public var lpszHostName: PSTR = 0L,
    public var dwHostNameLength: UInt = 0u,
    public var nPort: UShort = 0u,
    public var lpszUserName: PSTR = 0L,
    public var dwUserNameLength: UInt = 0u,
    public var lpszPassword: PSTR = 0L,
    public var dwPasswordLength: UInt = 0u,
    public var lpszUrlPath: PSTR = 0L,
    public var dwUrlPathLength: UInt = 0u,
    public var lpszExtraInfo: PSTR = 0L,
    public var dwExtraInfoLength: UInt = 0u,
)

public data class URL_COMPONENTSW(
    public var dwStructSize: UInt = 0u,
    public var lpszScheme: PWSTR = 0L,
    public var dwSchemeLength: UInt = 0u,
    public var nScheme: INTERNET_SCHEME = 0,
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

public data class WININET_PROXY_INFO(
    public var fProxy: BOOL = 0,
    public var fBypass: BOOL = 0,
    public var ProxyScheme: INTERNET_SCHEME = 0,
    public var pwszProxy: PWSTR = 0L,
    public var ProxyPort: UShort = 0u,
)

public data class WININET_PROXY_INFO_LIST(public var dwProxyInfoCount: UInt = 0u, public var pProxyInfo: Long = 0L)
