@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextBindings
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextCipherInfo
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecPkgContextConnectionInfo
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public data class AppCacheDownloadEntry(public var pwszUrl: Pwstr = null, public var dwEntryType: UInt = 0u)

public data class AppCacheDownloadList(public var dwEntryCount: UInt = 0u, public var pEntries: AppCacheDownloadEntry? = null)

public data class AppCacheGroupInfo(
    public var pwszManifestUrl: Pwstr = null,
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ullSize: ULong = 0uL,
)

public data class AppCacheGroupList(public var dwAppCacheGroupCount: UInt = 0u, public var pAppCacheGroups: AppCacheGroupInfo? = null)

public data class AutoProxyScriptBuffer(
    public var dwStructSize: UInt = 0u,
    public var lpszScriptBuffer: Pstr = null,
    public var dwScriptBufferSize: UInt = 0u,
)

public data class AutoProxyHelperFunctions(public var lpVtbl: AutoProxyHelperVtbl? = null)

public data class AutoProxyHelperVtbl(
    public var isResolvable: Int = 0,
    public var getIPAddress: Int = 0,
    public var resolveHostName: Int = 0,
    public var isInNet: Int = 0,
    public var isResolvableEx: Int = 0,
    public var getIPAddressEx: Int = 0,
    public var resolveHostNameEx: Int = 0,
    public var isInNetEx: Int = 0,
    public var sortIpList: Int = 0,
)

public data class CookieDlgInfo(
    public var pszServer: Pwstr = null,
    public var pic: InternetCookie? = null,
    public var dwStopWarning: UInt = 0u,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var pszHeader: Pwstr = null,
    public var dwOperation: UInt = 0u,
)

public data class CookieDecision(public var dwCookieState: UInt = 0u, public var fAllowSession: Bool = 0)

public data class GopherAbstractAttributeType(public var shortAbstract: COpaquePointer? = null, public var abstractFile: COpaquePointer? = null)

public data class GopherAdminAttributeType(public var comment: COpaquePointer? = null, public var emailAddress: COpaquePointer? = null)

public data class GopherAskAttributeType(public var questionType: COpaquePointer? = null, public var questionText: COpaquePointer? = null)

public data class GopherAttributeType(
    public var categoryId: UInt = 0u,
    public var attributeId: UInt = 0u,
    public var attributeType: GopherAttributeType0 = GopherAttributeType0(),
)

public class GopherAttributeType0(
    public var admin: GopherAdminAttributeType = GopherAdminAttributeType(),
    public var modDate: GopherModDateAttributeType = GopherModDateAttributeType(),
    public var ttl: GopherTtlAttributeType = GopherTtlAttributeType(),
    public var score: GopherScoreAttributeType = GopherScoreAttributeType(),
    public var scoreRange: GopherScoreRangeAttributeType = GopherScoreRangeAttributeType(),
    public var site: GopherSiteAttributeType = GopherSiteAttributeType(),
    public var organization: GopherOrganizationAttributeType = GopherOrganizationAttributeType(),
    public var location: GopherLocationAttributeType = GopherLocationAttributeType(),
    public var geographicalLocation: GopherGeographicalLocationAttributeType = GopherGeographicalLocationAttributeType(),
    public var timeZone: GopherTimezoneAttributeType = GopherTimezoneAttributeType(),
    public var provider: GopherProviderAttributeType = GopherProviderAttributeType(),
    public var version: GopherVersionAttributeType = GopherVersionAttributeType(),
    public var abstract: GopherAbstractAttributeType = GopherAbstractAttributeType(),
    public var view: GopherViewAttributeType = GopherViewAttributeType(),
    public var veronica: GopherVeronicaAttributeType = GopherVeronicaAttributeType(),
    public var ask: GopherAskAttributeType = GopherAskAttributeType(),
    public var unknown: GopherUnknownAttributeType = GopherUnknownAttributeType(),
)

public data class GopherFindDataa(
    public var displayString: ByteArray = ByteArray(129),
    public var gopherType: GopherType = 0u,
    public var sizeLow: UInt = 0u,
    public var sizeHigh: UInt = 0u,
    public var lastModificationTime: Filetime = Filetime(),
    public var locator: ByteArray = ByteArray(654),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherFindDataa) return false
        if (!this.displayString.contentEquals(other.displayString)) return false
        if (this.gopherType != other.gopherType) return false
        if (this.sizeLow != other.sizeLow) return false
        if (this.sizeHigh != other.sizeHigh) return false
        if (this.lastModificationTime != other.lastModificationTime) return false
        if (!this.locator.contentEquals(other.locator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.displayString.contentHashCode()
        result = 31 * result + this.gopherType.hashCode()
        result = 31 * result + this.sizeLow.hashCode()
        result = 31 * result + this.sizeHigh.hashCode()
        result = 31 * result + this.lastModificationTime.hashCode()
        result = 31 * result + this.locator.contentHashCode()
        return result
    }
}

public data class GopherFindDataw(
    public var displayString: UShortArray = UShortArray(129),
    public var gopherType: GopherType = 0u,
    public var sizeLow: UInt = 0u,
    public var sizeHigh: UInt = 0u,
    public var lastModificationTime: Filetime = Filetime(),
    public var locator: UShortArray = UShortArray(654),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GopherFindDataw) return false
        if (!this.displayString.contentEquals(other.displayString)) return false
        if (this.gopherType != other.gopherType) return false
        if (this.sizeLow != other.sizeLow) return false
        if (this.sizeHigh != other.sizeHigh) return false
        if (this.lastModificationTime != other.lastModificationTime) return false
        if (!this.locator.contentEquals(other.locator)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.displayString.contentHashCode()
        result = 31 * result + this.gopherType.hashCode()
        result = 31 * result + this.sizeLow.hashCode()
        result = 31 * result + this.sizeHigh.hashCode()
        result = 31 * result + this.lastModificationTime.hashCode()
        result = 31 * result + this.locator.contentHashCode()
        return result
    }
}

public data class GopherGeographicalLocationAttributeType(
    public var degreesNorth: Int = 0,
    public var minutesNorth: Int = 0,
    public var secondsNorth: Int = 0,
    public var degreesEast: Int = 0,
    public var minutesEast: Int = 0,
    public var secondsEast: Int = 0,
)

public data class GopherLocationAttributeType(public var location: COpaquePointer? = null)

public data class GopherModDateAttributeType(public var dateAndTime: Filetime = Filetime())

public data class GopherOrganizationAttributeType(public var organization: COpaquePointer? = null)

public data class GopherProviderAttributeType(public var provider: COpaquePointer? = null)

public data class GopherScoreAttributeType(public var score: Int = 0)

public data class GopherScoreRangeAttributeType(public var lowerBound: Int = 0, public var upperBound: Int = 0)

public data class GopherSiteAttributeType(public var site: COpaquePointer? = null)

public data class GopherTimezoneAttributeType(public var zone: Int = 0)

public data class GopherTtlAttributeType(public var ttl: UInt = 0u)

public data class GopherUnknownAttributeType(public var text: COpaquePointer? = null)

public data class GopherVeronicaAttributeType(public var treeWalk: Bool = 0)

public data class GopherVersionAttributeType(public var version: COpaquePointer? = null)

public data class GopherViewAttributeType(
    public var contentType: COpaquePointer? = null,
    public var language: COpaquePointer? = null,
    public var size: UInt = 0u,
)

public data class HttpPushNotificationStatus(public var channelStatusValid: Bool = 0, public var channelStatus: UInt = 0u)

public data class HttpPushTransportSetting(public var transportSettingId: Guid = Guid(), public var brokerEventId: Guid = Guid())

public data class HttpRequestTimes(public var cTimes: UInt = 0u, public var rgTimes: ULongArray = ULongArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestTimes) return false
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

public data class HttpWebSocketAsyncResult(
    public var asyncResult: InternetAsyncResult = InternetAsyncResult(),
    public var operation: HttpWebSocketOperation = 0,
    public var bufferType: HttpWebSocketBufferType = 0,
    public var dwBytesTransferred: UInt = 0u,
)

public data class InternetAsyncResult(public var dwResult: Int = 0, public var dwError: UInt = 0u)

public data class InternetAuthNotifyData(
    public var cbStruct: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var pfnNotify: PfnAuthNotify = null,
    public var dwContext: Int = 0,
)

public data class InternetBuffersa(
    public var dwStructSize: UInt = 0u,
    public var next: InternetBuffersa? = null,
    public var lpcszHeader: Pcstr = null,
    public var dwHeadersLength: UInt = 0u,
    public var dwHeadersTotal: UInt = 0u,
    public var lpvBuffer: COpaquePointer? = null,
    public var dwBufferLength: UInt = 0u,
    public var dwBufferTotal: UInt = 0u,
    public var dwOffsetLow: UInt = 0u,
    public var dwOffsetHigh: UInt = 0u,
)

public data class InternetBuffersw(
    public var dwStructSize: UInt = 0u,
    public var next: InternetBuffersw? = null,
    public var lpcszHeader: Pcwstr = null,
    public var dwHeadersLength: UInt = 0u,
    public var dwHeadersTotal: UInt = 0u,
    public var lpvBuffer: COpaquePointer? = null,
    public var dwBufferLength: UInt = 0u,
    public var dwBufferTotal: UInt = 0u,
    public var dwOffsetLow: UInt = 0u,
    public var dwOffsetHigh: UInt = 0u,
)

public data class InternetCacheConfigInfoa(
    public var dwStructSize: UInt = 0u,
    public var dwContainer: UInt = 0u,
    public var dwQuota: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var fPerUser: Bool = 0,
    public var dwSyncMode: UInt = 0u,
    public var dwNumCachePaths: UInt = 0u,
    public var anonymous: InternetCacheConfigInfoa0 = InternetCacheConfigInfoa0(),
    public var dwNormalUsage: UInt = 0u,
    public var dwExemptUsage: UInt = 0u,
)

public data class InternetCacheConfigInfoa0(public var anonymous: InternetCacheConfigInfoa00 = InternetCacheConfigInfoa00(), public var cachePaths: List<InternetCacheConfigPathEntrya> = List(1) { InternetCacheConfigPathEntrya() })

public data class InternetCacheConfigInfoa00(public var cachePath: ByteArray = ByteArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigInfoa00) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class InternetCacheConfigInfow(
    public var dwStructSize: UInt = 0u,
    public var dwContainer: UInt = 0u,
    public var dwQuota: UInt = 0u,
    public var dwReserved4: UInt = 0u,
    public var fPerUser: Bool = 0,
    public var dwSyncMode: UInt = 0u,
    public var dwNumCachePaths: UInt = 0u,
    public var anonymous: InternetCacheConfigInfow0 = InternetCacheConfigInfow0(),
    public var dwNormalUsage: UInt = 0u,
    public var dwExemptUsage: UInt = 0u,
)

public data class InternetCacheConfigInfow0(public var anonymous: InternetCacheConfigInfow00 = InternetCacheConfigInfow00(), public var cachePaths: List<InternetCacheConfigPathEntryw> = List(1) { InternetCacheConfigPathEntryw() })

public data class InternetCacheConfigInfow00(public var cachePath: UShortArray = UShortArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigInfow00) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class InternetCacheConfigPathEntrya(public var cachePath: ByteArray = ByteArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigPathEntrya) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class InternetCacheConfigPathEntryw(public var cachePath: UShortArray = UShortArray(260), public var dwCacheSize: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InternetCacheConfigPathEntryw) return false
        if (!this.cachePath.contentEquals(other.cachePath)) return false
        if (this.dwCacheSize != other.dwCacheSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cachePath.contentHashCode()
        result = 31 * result + this.dwCacheSize.hashCode()
        return result
    }
}

public data class InternetCacheContainerInfoa(
    public var dwCacheVersion: UInt = 0u,
    public var lpszName: Pstr = null,
    public var lpszCachePrefix: Pstr = null,
    public var lpszVolumeLabel: Pstr = null,
    public var lpszVolumeTitle: Pstr = null,
)

public data class InternetCacheContainerInfow(
    public var dwCacheVersion: UInt = 0u,
    public var lpszName: Pwstr = null,
    public var lpszCachePrefix: Pwstr = null,
    public var lpszVolumeLabel: Pwstr = null,
    public var lpszVolumeTitle: Pwstr = null,
)

public data class InternetCacheEntryInfoa(
    public var dwStructSize: UInt = 0u,
    public var lpszSourceUrlName: Pstr = null,
    public var lpszLocalFileName: Pstr = null,
    public var cacheEntryType: UInt = 0u,
    public var dwUseCount: UInt = 0u,
    public var dwHitRate: UInt = 0u,
    public var dwSizeLow: UInt = 0u,
    public var dwSizeHigh: UInt = 0u,
    public var lastModifiedTime: Filetime = Filetime(),
    public var expireTime: Filetime = Filetime(),
    public var lastAccessTime: Filetime = Filetime(),
    public var lastSyncTime: Filetime = Filetime(),
    public var lpHeaderInfo: Pstr = null,
    public var dwHeaderInfoSize: UInt = 0u,
    public var lpszFileExtension: Pstr = null,
    public var anonymous: InternetCacheEntryInfoa0 = InternetCacheEntryInfoa0(),
)

public data class InternetCacheEntryInfoa0(public var dwReserved: UInt = 0u, public var dwExemptDelta: UInt = 0u)

public data class InternetCacheEntryInfow(
    public var dwStructSize: UInt = 0u,
    public var lpszSourceUrlName: Pwstr = null,
    public var lpszLocalFileName: Pwstr = null,
    public var cacheEntryType: UInt = 0u,
    public var dwUseCount: UInt = 0u,
    public var dwHitRate: UInt = 0u,
    public var dwSizeLow: UInt = 0u,
    public var dwSizeHigh: UInt = 0u,
    public var lastModifiedTime: Filetime = Filetime(),
    public var expireTime: Filetime = Filetime(),
    public var lastAccessTime: Filetime = Filetime(),
    public var lastSyncTime: Filetime = Filetime(),
    public var lpHeaderInfo: Pwstr = null,
    public var dwHeaderInfoSize: UInt = 0u,
    public var lpszFileExtension: Pwstr = null,
    public var anonymous: InternetCacheEntryInfow0 = InternetCacheEntryInfow0(),
)

public data class InternetCacheEntryInfow0(public var dwReserved: UInt = 0u, public var dwExemptDelta: UInt = 0u)

public data class InternetCacheGroupInfoa(
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
        if (other !is InternetCacheGroupInfoa) return false
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

public data class InternetCacheGroupInfow(
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
        if (other !is InternetCacheGroupInfow) return false
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

public data class InternetCacheTimestamps(public var ftExpires: Filetime = Filetime(), public var ftLastModified: Filetime = Filetime())

public data class InternetCallbackCookie(
    public var pcwszName: Pcwstr = null,
    public var pcwszValue: Pcwstr = null,
    public var pcwszDomain: Pcwstr = null,
    public var pcwszPath: Pcwstr = null,
    public var ftExpires: Filetime = Filetime(),
    public var dwFlags: UInt = 0u,
)

public data class InternetCertificateInfo(
    public var ftExpiry: Filetime = Filetime(),
    public var ftStart: Filetime = Filetime(),
    public var lpszSubjectInfo: COpaquePointer? = null,
    public var lpszIssuerInfo: COpaquePointer? = null,
    public var lpszProtocolName: COpaquePointer? = null,
    public var lpszSignatureAlgName: COpaquePointer? = null,
    public var lpszEncryptionAlgName: COpaquePointer? = null,
    public var dwKeySize: UInt = 0u,
)

public data class InternetConnectedInfo(public var dwConnectedState: InternetState = 0u, public var dwFlags: UInt = 0u)

public data class InternetCookie(
    public var cbSize: UInt = 0u,
    public var pszName: Pstr = null,
    public var pszData: Pstr = null,
    public var pszDomain: Pstr = null,
    public var pszPath: Pstr = null,
    public var pftExpires: Filetime? = null,
    public var dwFlags: UInt = 0u,
    public var pszUrl: Pstr = null,
    public var pszP3PPolicy: Pstr = null,
)

public data class InternetCookie2(
    public var pwszName: Pwstr = null,
    public var pwszValue: Pwstr = null,
    public var pwszDomain: Pwstr = null,
    public var pwszPath: Pwstr = null,
    public var dwFlags: UInt = 0u,
    public var ftExpires: Filetime = Filetime(),
    public var fExpiresSet: Bool = 0,
)

public data class InternetCredentials(
    public var lpcwszHostName: Pcwstr = null,
    public var dwPort: UInt = 0u,
    public var dwScheme: UInt = 0u,
    public var lpcwszUrl: Pcwstr = null,
    public var lpcwszRealm: Pcwstr = null,
    public var fAuthIdentity: Bool = 0,
    public var anonymous: InternetCredentials0 = InternetCredentials0(),
)

public data class InternetCredentials0(public var anonymous: InternetCredentials00 = InternetCredentials00(), public var pAuthIdentityOpaque: COpaquePointer? = null)

public data class InternetCredentials00(public var lpcwszUserName: Pcwstr = null, public var lpcwszPassword: Pcwstr = null)

public data class InternetDiagnosticSocketInfo(
    public var socket: Int = 0,
    public var sourcePort: UInt = 0u,
    public var destPort: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class InternetDownloadModeHandle(public var pcwszFileName: Pcwstr = null, public var phFile: Handle? = null)

public data class InternetEndBrowserSessionData(public var lpBuffer: COpaquePointer? = null, public var dwBufferLength: UInt = 0u)

public data class InternetPerConnOptiona(public var dwOption: InternetPerConn = 0u, public var value: InternetPerConnOptiona0 = InternetPerConnOptiona0())

public data class InternetPerConnOptiona0(
    public var dwValue: UInt = 0u,
    public var pszValue: Pstr = null,
    public var ftValue: Filetime = Filetime(),
)

public data class InternetPerConnOptionw(public var dwOption: InternetPerConn = 0u, public var value: InternetPerConnOptionw0 = InternetPerConnOptionw0())

public data class InternetPerConnOptionw0(
    public var dwValue: UInt = 0u,
    public var pszValue: Pwstr = null,
    public var ftValue: Filetime = Filetime(),
)

public data class InternetPerConnOptionLista(
    public var dwSize: UInt = 0u,
    public var pszConnection: Pstr = null,
    public var dwOptionCount: UInt = 0u,
    public var dwOptionError: UInt = 0u,
    public var pOptions: InternetPerConnOptiona? = null,
)

public data class InternetPerConnOptionListw(
    public var dwSize: UInt = 0u,
    public var pszConnection: Pwstr = null,
    public var dwOptionCount: UInt = 0u,
    public var dwOptionError: UInt = 0u,
    public var pOptions: InternetPerConnOptionw? = null,
)

public data class InternetPrefetchStatus(public var dwStatus: UInt = 0u, public var dwSize: UInt = 0u)

public data class InternetProxyInfo(
    public var dwAccessType: InternetAccessType = 0u,
    public var lpszProxy: COpaquePointer? = null,
    public var lpszProxyBypass: COpaquePointer? = null,
)

public data class InternetSecurityConnectionInfo(
    public var dwSize: UInt = 0u,
    public var fSecure: Bool = 0,
    public var connectionInfo: SecPkgContextConnectionInfo = SecPkgContextConnectionInfo(),
    public var cipherInfo: SecPkgContextCipherInfo = SecPkgContextCipherInfo(),
)

public data class InternetSecurityInfo(
    public var dwSize: UInt = 0u,
    public var pCertificate: CertContext? = null,
    public var pcCertChain: CertChainContext? = null,
    public var connectionInfo: SecPkgContextConnectionInfo = SecPkgContextConnectionInfo(),
    public var cipherInfo: SecPkgContextCipherInfo = SecPkgContextCipherInfo(),
    public var pcUnverifiedCertChain: CertChainContext? = null,
    public var channelBindingToken: SecPkgContextBindings = SecPkgContextBindings(),
)

public data class InternetServerConnectionState(
    public var lpcwszHostName: Pcwstr = null,
    public var fProxy: Bool = 0,
    public var dwCounter: UInt = 0u,
    public var dwConnectionLimit: UInt = 0u,
    public var dwAvailableCreates: UInt = 0u,
    public var dwAvailableKeepAlives: UInt = 0u,
    public var dwActiveConnections: UInt = 0u,
    public var dwWaiters: UInt = 0u,
)

public data class InternetVersionInfo(public var dwMajorVersion: UInt = 0u, public var dwMinorVersion: UInt = 0u)

public data class IncomingCookieState(
    public var cSession: Int = 0,
    public var cPersistent: Int = 0,
    public var cAccepted: Int = 0,
    public var cLeashed: Int = 0,
    public var cDowngraded: Int = 0,
    public var cBlocked: Int = 0,
    public var pszLocation: Pcstr = null,
)

public data class InternetCookieHistory(
    public var fAccepted: Bool = 0,
    public var fLeashed: Bool = 0,
    public var fDowngraded: Bool = 0,
    public var fRejected: Bool = 0,
)

public data class OutgoingCookieState(
    public var cSent: Int = 0,
    public var cSuppressed: Int = 0,
    public var pszLocation: Pcstr = null,
)

public data class ProofOfPossessionCookieInfo(
    public var name: Pwstr = null,
    public var data: Pwstr = null,
    public var flags: UInt = 0u,
    public var p3pHeader: Pwstr = null,
)

public data class UrlcacheEntryInfo(
    public var pwszSourceUrlName: Pwstr = null,
    public var pwszLocalFileName: Pwstr = null,
    public var dwCacheEntryType: UInt = 0u,
    public var dwUseCount: UInt = 0u,
    public var dwHitRate: UInt = 0u,
    public var dwSizeLow: UInt = 0u,
    public var dwSizeHigh: UInt = 0u,
    public var ftLastModifiedTime: Filetime = Filetime(),
    public var ftExpireTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastSyncTime: Filetime = Filetime(),
    public var pbHeaderInfo: COpaquePointer? = null,
    public var cbHeaderInfoSize: UInt = 0u,
    public var pbExtraData: COpaquePointer? = null,
    public var cbExtraDataSize: UInt = 0u,
)

public data class UrlComponentsa(
    public var dwStructSize: UInt = 0u,
    public var lpszScheme: Pstr = null,
    public var dwSchemeLength: UInt = 0u,
    public var nScheme: InternetScheme = 0,
    public var lpszHostName: Pstr = null,
    public var dwHostNameLength: UInt = 0u,
    public var nPort: UShort = 0u,
    public var lpszUserName: Pstr = null,
    public var dwUserNameLength: UInt = 0u,
    public var lpszPassword: Pstr = null,
    public var dwPasswordLength: UInt = 0u,
    public var lpszUrlPath: Pstr = null,
    public var dwUrlPathLength: UInt = 0u,
    public var lpszExtraInfo: Pstr = null,
    public var dwExtraInfoLength: UInt = 0u,
)

public data class UrlComponentsw(
    public var dwStructSize: UInt = 0u,
    public var lpszScheme: Pwstr = null,
    public var dwSchemeLength: UInt = 0u,
    public var nScheme: InternetScheme = 0,
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

public data class WininetProxyInfo(
    public var fProxy: Bool = 0,
    public var fBypass: Bool = 0,
    public var proxyScheme: InternetScheme = 0,
    public var pwszProxy: Pwstr = null,
    public var proxyPort: UShort = 0u,
)

public data class WininetProxyInfoList(public var dwProxyInfoCount: UInt = 0u, public var pProxyInfo: WininetProxyInfo? = null)
