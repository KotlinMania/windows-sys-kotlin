@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public data class CertContextEx(
    public var certContext: CertContext = CertContext(),
    public var cbAllocated: UInt = 0u,
    public var dwCertificateFlags: UInt = 0u,
)

public data class ConfigurationEntry(
    public var bstrKey: Bstr = null,
    public var bstrValue: Bstr = null,
)

public class ExtensionControlBlock(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var connID: Hconn = null,
    public var dwHttpStatusCode: UInt = 0u,
    public var lpszLogData: ByteArray = ByteArray(80),
    public var lpszMethod: Pstr = null,
    public var lpszQueryString: Pstr = null,
    public var lpszPathInfo: Pstr = null,
    public var lpszPathTranslated: Pstr = null,
    public var cbTotalBytes: UInt = 0u,
    public var cbAvailable: UInt = 0u,
    public var lpbData: COpaquePointer? = null,
    public var lpszContentType: Pstr = null,
    public var getServerVariable: PfnIisGetservervariable = null,
    public var writeClient: PfnIisWriteclient = null,
    public var readClient: PfnIisReadclient = null,
    public var serverSupportFunction: PfnIisServersupportfunction = null,
)

public data class HseCustomErrorInfo(
    public var pszStatus: Pstr = null,
    public var uHttpSubError: UShort = 0u,
    public var fAsync: Bool = 0,
)

public data class HseExecUnicodeUrlInfo(
    public var pszUrl: Pwstr = null,
    public var pszMethod: Pstr = null,
    public var pszChildHeaders: Pstr = null,
    public var pUserInfo: HseExecUnicodeUrlUserInfo? = null,
    public var pEntity: HseExecUrlEntityInfo? = null,
    public var dwExecUrlFlags: UInt = 0u,
)

public data class HseExecUnicodeUrlUserInfo(
    public var hImpersonationToken: Handle = null,
    public var pszCustomUserName: Pwstr = null,
    public var pszCustomAuthType: Pstr = null,
)

public data class HseExecUrlEntityInfo(
    public var cbAvailable: UInt = 0u,
    public var lpbData: COpaquePointer? = null,
)

public data class HseExecUrlInfo(
    public var pszUrl: Pstr = null,
    public var pszMethod: Pstr = null,
    public var pszChildHeaders: Pstr = null,
    public var pUserInfo: HseExecUrlUserInfo? = null,
    public var pEntity: HseExecUrlEntityInfo? = null,
    public var dwExecUrlFlags: UInt = 0u,
)

public data class HseExecUrlStatus(
    public var uHttpStatusCode: UShort = 0u,
    public var uHttpSubStatus: UShort = 0u,
    public var dwWin32Error: UInt = 0u,
)

public data class HseExecUrlUserInfo(
    public var hImpersonationToken: Handle = null,
    public var pszCustomUserName: Pstr = null,
    public var pszCustomAuthType: Pstr = null,
)

public data class HseResponseVector(
    public var dwFlags: UInt = 0u,
    public var pszStatus: Pstr = null,
    public var pszHeaders: Pstr = null,
    public var nElementCount: UInt = 0u,
    public var lpElementArray: HseVectorElement? = null,
)

public data class HseSendHeaderExInfo(
    public var pszStatus: Pcstr = null,
    public var pszHeader: Pcstr = null,
    public var cchStatus: UInt = 0u,
    public var cchHeader: UInt = 0u,
    public var fKeepConn: Bool = 0,
)

public data class HseTfInfo(
    public var pfnHseIO: PfnHseIoCompletion = null,
    public var pContext: COpaquePointer? = null,
    public var hFile: Handle = null,
    public var pszStatusCode: Pcstr = null,
    public var bytesToWrite: UInt = 0u,
    public var offset: UInt = 0u,
    public var pHead: COpaquePointer? = null,
    public var headLength: UInt = 0u,
    public var pTail: COpaquePointer? = null,
    public var tailLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class HseTraceInfo(
    public var fTraceRequest: Bool = 0,
    public var traceContextId: UByteArray = UByteArray(16),
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseTraceInfo) return false
        if (this.fTraceRequest != other.fTraceRequest) return false
        if (!this.traceContextId.contentEquals(other.traceContextId)) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fTraceRequest.hashCode()
        result = 31 * result + this.traceContextId.contentHashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }
}

public data class HseUnicodeUrlMapexInfo(
    public var lpszPath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseUnicodeUrlMapexInfo) return false
        if (!this.lpszPath.contentEquals(other.lpszPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cchMatchingPath != other.cchMatchingPath) return false
        if (this.cchMatchingURL != other.cchMatchingURL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cchMatchingPath.hashCode()
        result = 31 * result + this.cchMatchingURL.hashCode()
        return result
    }
}

public data class HseUrlMapexInfo(
    public var lpszPath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseUrlMapexInfo) return false
        if (!this.lpszPath.contentEquals(other.lpszPath)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cchMatchingPath != other.cchMatchingPath) return false
        if (this.cchMatchingURL != other.cchMatchingURL) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszPath.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cchMatchingPath.hashCode()
        result = 31 * result + this.cchMatchingURL.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }
}

public data class HseVectorElement(
    public var elementType: UInt = 0u,
    public var pvContext: COpaquePointer? = null,
    public var cbOffset: ULong = 0uL,
    public var cbSize: ULong = 0uL,
)

public data class HseVersionInfo(
    public var dwExtensionVersion: UInt = 0u,
    public var lpszExtensionDesc: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HseVersionInfo) return false
        if (this.dwExtensionVersion != other.dwExtensionVersion) return false
        if (!this.lpszExtensionDesc.contentEquals(other.lpszExtensionDesc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwExtensionVersion.hashCode()
        result = 31 * result + this.lpszExtensionDesc.contentHashCode()
        return result
    }
}

public data class HttpFilterAccessDenied(
    public var pszURL: Pcstr = null,
    public var pszPhysicalPath: Pcstr = null,
    public var dwReason: UInt = 0u,
)

public data class HttpFilterAuthent(
    public var pszUser: Pstr = null,
    public var cbUserBuff: UInt = 0u,
    public var pszPassword: Pstr = null,
    public var cbPasswordBuff: UInt = 0u,
)

public data class HttpFilterAuthCompleteInfo(
    public var getHeader: Int = 0,
    public var setHeader: Int = 0,
    public var addHeader: Int = 0,
    public var getUserToken: Int = 0,
    public var httpStatus: UInt = 0u,
    public var fResetAuth: Bool = 0,
    public var dwReserved: UInt = 0u,
)

public data class HttpFilterContext(
    public var cbSize: UInt = 0u,
    public var revision: UInt = 0u,
    public var serverContext: COpaquePointer? = null,
    public var ulReserved: UInt = 0u,
    public var fIsSecurePort: Bool = 0,
    public var pFilterContext: COpaquePointer? = null,
    public var getServerVariable: Int = 0,
    public var addResponseHeaders: Int = 0,
    public var writeClient: Int = 0,
    public var allocMem: Int = 0,
    public var serverSupportFunction: Int = 0,
)

public data class HttpFilterLog(
    public var pszClientHostName: Pcstr = null,
    public var pszClientUserName: Pcstr = null,
    public var pszServerName: Pcstr = null,
    public var pszOperation: Pcstr = null,
    public var pszTarget: Pcstr = null,
    public var pszParameters: Pcstr = null,
    public var dwHttpStatus: UInt = 0u,
    public var dwWin32Status: UInt = 0u,
    public var dwBytesSent: UInt = 0u,
    public var dwBytesRecvd: UInt = 0u,
    public var msTimeForProcessing: UInt = 0u,
)

public data class HttpFilterPreprocHeaders(
    public var getHeader: Int = 0,
    public var setHeader: Int = 0,
    public var addHeader: Int = 0,
    public var httpStatus: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class HttpFilterRawData(
    public var pvInData: COpaquePointer? = null,
    public var cbInData: UInt = 0u,
    public var cbInBuffer: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class HttpFilterUrlMap(
    public var pszURL: Pcstr = null,
    public var pszPhysicalPath: Pstr = null,
    public var cbPathBuff: UInt = 0u,
)

public data class HttpFilterUrlMapEx(
    public var pszURL: Pcstr = null,
    public var pszPhysicalPath: Pstr = null,
    public var cbPathBuff: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
    public var pszScriptMapEntry: Pcstr = null,
)

public data class HttpFilterVersion(
    public var dwServerFilterVersion: UInt = 0u,
    public var dwFilterVersion: UInt = 0u,
    public var lpszFilterDesc: ByteArray = ByteArray(257),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpFilterVersion) return false
        if (this.dwServerFilterVersion != other.dwServerFilterVersion) return false
        if (this.dwFilterVersion != other.dwFilterVersion) return false
        if (!this.lpszFilterDesc.contentEquals(other.lpszFilterDesc)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwServerFilterVersion.hashCode()
        result = 31 * result + this.dwFilterVersion.hashCode()
        result = 31 * result + this.lpszFilterDesc.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }
}

public data class HttpTraceConfiguration(
    public var pProviderGuid: Guid? = null,
    public var dwAreas: UInt = 0u,
    public var dwVerbosity: UInt = 0u,
    public var fProviderEnabled: Bool = 0,
)

public data class HttpTraceEvent(
    public var pProviderGuid: Guid? = null,
    public var dwArea: UInt = 0u,
    public var pAreaGuid: Guid? = null,
    public var dwEvent: UInt = 0u,
    public var pszEventName: Pcwstr = null,
    public var dwEventVersion: UInt = 0u,
    public var dwVerbosity: UInt = 0u,
    public var pActivityGuid: Guid? = null,
    public var pRelatedActivityGuid: Guid? = null,
    public var dwTimeStamp: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cEventItems: UInt = 0u,
    public var pEventItems: HttpTraceEventItem? = null,
)

public data class HttpTraceEventItem(
    public var pszName: Pcwstr = null,
    public var dwDataType: HttpTraceType = 0,
    public var pbData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var pszDataDescription: Pcwstr = null,
)

public class LoggingParameters(
    public var pszSessionId: Pcwstr = null,
    public var pszSiteName: Pcwstr = null,
    public var pszUserName: Pcwstr = null,
    public var pszHostName: Pcwstr = null,
    public var pszRemoteIpAddress: Pcwstr = null,
    public var dwRemoteIpPort: UInt = 0u,
    public var pszLocalIpAddress: Pcwstr = null,
    public var dwLocalIpPort: UInt = 0u,
    public var bytesSent: ULong = 0uL,
    public var bytesReceived: ULong = 0uL,
    public var pszCommand: Pcwstr = null,
    public var pszCommandParameters: Pcwstr = null,
    public var pszFullPath: Pcwstr = null,
    public var dwElapsedMilliseconds: UInt = 0u,
    public var ftpStatus: UInt = 0u,
    public var ftpSubStatus: UInt = 0u,
    public var hrStatus: Hresult = 0,
    public var pszInformation: Pcwstr = null,
)

public data class MdChangeObjectW(
    public var pszMDPath: Pwstr = null,
    public var dwMDChangeType: UInt = 0u,
    public var dwMDNumDataIDs: UInt = 0u,
    public var pdwMDDataIDs: UInt? = null,
)

public data class MetadataGetallInternalRecord(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var anonymous: MetadataGetallInternalRecord0 = MetadataGetallInternalRecord0(),
    public var dwMDDataTag: UInt = 0u,
)

public data class MetadataGetallInternalRecord0(
    public var dwMDDataOffset: Int = 0,
    public var pbMDData: COpaquePointer? = null,
)

public data class MetadataGetallRecord(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var dwMDDataOffset: UInt = 0u,
    public var dwMDDataTag: UInt = 0u,
)

public data class MetadataHandleInfo(
    public var dwMDPermissions: UInt = 0u,
    public var dwMDSystemChangeNumber: UInt = 0u,
)

public data class MetadataRecord(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var pbMDData: COpaquePointer? = null,
    public var dwMDDataTag: UInt = 0u,
)

public class PostProcessParameters(
    public var pszSessionId: Pcwstr = null,
    public var pszSiteName: Pcwstr = null,
    public var pszUserName: Pcwstr = null,
    public var pszHostName: Pcwstr = null,
    public var pszRemoteIpAddress: Pcwstr = null,
    public var dwRemoteIpPort: UInt = 0u,
    public var pszLocalIpAddress: Pcwstr = null,
    public var dwLocalIpPort: UInt = 0u,
    public var bytesSent: ULong = 0uL,
    public var bytesReceived: ULong = 0uL,
    public var pszCommand: Pcwstr = null,
    public var pszCommandParameters: Pcwstr = null,
    public var pszFullPath: Pcwstr = null,
    public var pszPhysicalPath: Pcwstr = null,
    public var ftpStatus: UInt = 0u,
    public var ftpSubStatus: UInt = 0u,
    public var hrStatus: Hresult = 0,
    public var sessionStartTime: Filetime = Filetime(),
    public var bytesSentPerSession: ULong = 0uL,
    public var bytesReceivedPerSession: ULong = 0uL,
)

public data class PreProcessParameters(
    public var pszSessionId: Pcwstr = null,
    public var pszSiteName: Pcwstr = null,
    public var pszUserName: Pcwstr = null,
    public var pszHostName: Pcwstr = null,
    public var pszRemoteIpAddress: Pcwstr = null,
    public var dwRemoteIpPort: UInt = 0u,
    public var pszLocalIpAddress: Pcwstr = null,
    public var dwLocalIpPort: UInt = 0u,
    public var pszCommand: Pcwstr = null,
    public var pszCommandParameters: Pcwstr = null,
    public var sessionStartTime: Filetime = Filetime(),
    public var bytesSentPerSession: ULong = 0uL,
    public var bytesReceivedPerSession: ULong = 0uL,
)
