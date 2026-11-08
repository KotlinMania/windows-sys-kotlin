@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CERT_CONTEXT

public data class CERT_CONTEXT_EX(
    public var CertContext: CERT_CONTEXT = CERT_CONTEXT(),
    public var cbAllocated: UInt = 0u,
    public var dwCertificateFlags: UInt = 0u,
)

public data class CONFIGURATION_ENTRY(public var bstrKey: BSTR = 0L, public var bstrValue: BSTR = 0L)

public class EXTENSION_CONTROL_BLOCK(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var ConnID: HCONN = 0L,
    public var dwHttpStatusCode: UInt = 0u,
    public var lpszLogData: ByteArray = ByteArray(80),
    public var lpszMethod: PSTR = 0L,
    public var lpszQueryString: PSTR = 0L,
    public var lpszPathInfo: PSTR = 0L,
    public var lpszPathTranslated: PSTR = 0L,
    public var cbTotalBytes: UInt = 0u,
    public var cbAvailable: UInt = 0u,
    public var lpbData: Long = 0L,
    public var lpszContentType: PSTR = 0L,
    public var GetServerVariable: PFN_IIS_GETSERVERVARIABLE = null,
    public var WriteClient: PFN_IIS_WRITECLIENT = null,
    public var ReadClient: PFN_IIS_READCLIENT = null,
    public var ServerSupportFunction: PFN_IIS_SERVERSUPPORTFUNCTION = null,
)

public data class HSE_CUSTOM_ERROR_INFO(
    public var pszStatus: PSTR = 0L,
    public var uHttpSubError: UShort = 0u,
    public var fAsync: BOOL = 0,
)

public data class HSE_EXEC_UNICODE_URL_INFO(
    public var pszUrl: PWSTR = 0L,
    public var pszMethod: PSTR = 0L,
    public var pszChildHeaders: PSTR = 0L,
    public var pUserInfo: Long = 0L,
    public var pEntity: Long = 0L,
    public var dwExecUrlFlags: UInt = 0u,
)

public data class HSE_EXEC_UNICODE_URL_USER_INFO(
    public var hImpersonationToken: HANDLE = 0L,
    public var pszCustomUserName: PWSTR = 0L,
    public var pszCustomAuthType: PSTR = 0L,
)

public data class HSE_EXEC_URL_ENTITY_INFO(public var cbAvailable: UInt = 0u, public var lpbData: Long = 0L)

public data class HSE_EXEC_URL_INFO(
    public var pszUrl: PSTR = 0L,
    public var pszMethod: PSTR = 0L,
    public var pszChildHeaders: PSTR = 0L,
    public var pUserInfo: Long = 0L,
    public var pEntity: Long = 0L,
    public var dwExecUrlFlags: UInt = 0u,
)

public data class HSE_EXEC_URL_STATUS(
    public var uHttpStatusCode: UShort = 0u,
    public var uHttpSubStatus: UShort = 0u,
    public var dwWin32Error: UInt = 0u,
)

public data class HSE_EXEC_URL_USER_INFO(
    public var hImpersonationToken: HANDLE = 0L,
    public var pszCustomUserName: PSTR = 0L,
    public var pszCustomAuthType: PSTR = 0L,
)

public data class HSE_RESPONSE_VECTOR(
    public var dwFlags: UInt = 0u,
    public var pszStatus: PSTR = 0L,
    public var pszHeaders: PSTR = 0L,
    public var nElementCount: UInt = 0u,
    public var lpElementArray: Long = 0L,
)

public data class HSE_SEND_HEADER_EX_INFO(
    public var pszStatus: PCSTR = 0L,
    public var pszHeader: PCSTR = 0L,
    public var cchStatus: UInt = 0u,
    public var cchHeader: UInt = 0u,
    public var fKeepConn: BOOL = 0,
)

public data class HSE_TF_INFO(
    public var pfnHseIO: PFN_HSE_IO_COMPLETION = null,
    public var pContext: Long = 0L,
    public var hFile: HANDLE = 0L,
    public var pszStatusCode: PCSTR = 0L,
    public var BytesToWrite: UInt = 0u,
    public var Offset: UInt = 0u,
    public var pHead: Long = 0L,
    public var HeadLength: UInt = 0u,
    public var pTail: Long = 0L,
    public var TailLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class HSE_TRACE_INFO(
    public var fTraceRequest: BOOL = 0,
    public var TraceContextId: UByteArray = UByteArray(16),
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HSE_TRACE_INFO) return false
        if (this.fTraceRequest != other.fTraceRequest) return false
        if (!this.TraceContextId.contentEquals(other.TraceContextId)) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fTraceRequest.hashCode()
        result = 31 * result + this.TraceContextId.contentHashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }
}

public data class HSE_UNICODE_URL_MAPEX_INFO(
    public var lpszPath: UShortArray = UShortArray(260),
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HSE_UNICODE_URL_MAPEX_INFO) return false
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

public data class HSE_URL_MAPEX_INFO(
    public var lpszPath: ByteArray = ByteArray(260),
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HSE_URL_MAPEX_INFO) return false
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

public data class HSE_VECTOR_ELEMENT(
    public var ElementType: UInt = 0u,
    public var pvContext: Long = 0L,
    public var cbOffset: ULong = 0uL,
    public var cbSize: ULong = 0uL,
)

public data class HSE_VERSION_INFO(public var dwExtensionVersion: UInt = 0u, public var lpszExtensionDesc: ByteArray = ByteArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HSE_VERSION_INFO) return false
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

public data class HTTP_FILTER_ACCESS_DENIED(
    public var pszURL: PCSTR = 0L,
    public var pszPhysicalPath: PCSTR = 0L,
    public var dwReason: UInt = 0u,
)

public data class HTTP_FILTER_AUTHENT(
    public var pszUser: PSTR = 0L,
    public var cbUserBuff: UInt = 0u,
    public var pszPassword: PSTR = 0L,
    public var cbPasswordBuff: UInt = 0u,
)

public data class HTTP_FILTER_AUTH_COMPLETE_INFO(
    public var GetHeader: Long = 0L,
    public var SetHeader: Long = 0L,
    public var AddHeader: Long = 0L,
    public var GetUserToken: Long = 0L,
    public var HttpStatus: UInt = 0u,
    public var fResetAuth: BOOL = 0,
    public var dwReserved: UInt = 0u,
)

public data class HTTP_FILTER_CONTEXT(
    public var cbSize: UInt = 0u,
    public var Revision: UInt = 0u,
    public var ServerContext: Long = 0L,
    public var ulReserved: UInt = 0u,
    public var fIsSecurePort: BOOL = 0,
    public var pFilterContext: Long = 0L,
    public var GetServerVariable: Long = 0L,
    public var AddResponseHeaders: Long = 0L,
    public var WriteClient: Long = 0L,
    public var AllocMem: Long = 0L,
    public var ServerSupportFunction: Long = 0L,
)

public data class HTTP_FILTER_LOG(
    public var pszClientHostName: PCSTR = 0L,
    public var pszClientUserName: PCSTR = 0L,
    public var pszServerName: PCSTR = 0L,
    public var pszOperation: PCSTR = 0L,
    public var pszTarget: PCSTR = 0L,
    public var pszParameters: PCSTR = 0L,
    public var dwHttpStatus: UInt = 0u,
    public var dwWin32Status: UInt = 0u,
    public var dwBytesSent: UInt = 0u,
    public var dwBytesRecvd: UInt = 0u,
    public var msTimeForProcessing: UInt = 0u,
)

public data class HTTP_FILTER_PREPROC_HEADERS(
    public var GetHeader: Long = 0L,
    public var SetHeader: Long = 0L,
    public var AddHeader: Long = 0L,
    public var HttpStatus: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class HTTP_FILTER_RAW_DATA(
    public var pvInData: Long = 0L,
    public var cbInData: UInt = 0u,
    public var cbInBuffer: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class HTTP_FILTER_URL_MAP(
    public var pszURL: PCSTR = 0L,
    public var pszPhysicalPath: PSTR = 0L,
    public var cbPathBuff: UInt = 0u,
)

public data class HTTP_FILTER_URL_MAP_EX(
    public var pszURL: PCSTR = 0L,
    public var pszPhysicalPath: PSTR = 0L,
    public var cbPathBuff: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cchMatchingPath: UInt = 0u,
    public var cchMatchingURL: UInt = 0u,
    public var pszScriptMapEntry: PCSTR = 0L,
)

public data class HTTP_FILTER_VERSION(
    public var dwServerFilterVersion: UInt = 0u,
    public var dwFilterVersion: UInt = 0u,
    public var lpszFilterDesc: ByteArray = ByteArray(257),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HTTP_FILTER_VERSION) return false
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

public data class HTTP_TRACE_CONFIGURATION(
    public var pProviderGuid: Long = 0L,
    public var dwAreas: UInt = 0u,
    public var dwVerbosity: UInt = 0u,
    public var fProviderEnabled: BOOL = 0,
)

public data class HTTP_TRACE_EVENT(
    public var pProviderGuid: Long = 0L,
    public var dwArea: UInt = 0u,
    public var pAreaGuid: Long = 0L,
    public var dwEvent: UInt = 0u,
    public var pszEventName: PCWSTR = 0L,
    public var dwEventVersion: UInt = 0u,
    public var dwVerbosity: UInt = 0u,
    public var pActivityGuid: Long = 0L,
    public var pRelatedActivityGuid: Long = 0L,
    public var dwTimeStamp: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cEventItems: UInt = 0u,
    public var pEventItems: Long = 0L,
)

public data class HTTP_TRACE_EVENT_ITEM(
    public var pszName: PCWSTR = 0L,
    public var dwDataType: HTTP_TRACE_TYPE = 0,
    public var pbData: Long = 0L,
    public var cbData: UInt = 0u,
    public var pszDataDescription: PCWSTR = 0L,
)

public class LOGGING_PARAMETERS(
    public var pszSessionId: PCWSTR = 0L,
    public var pszSiteName: PCWSTR = 0L,
    public var pszUserName: PCWSTR = 0L,
    public var pszHostName: PCWSTR = 0L,
    public var pszRemoteIpAddress: PCWSTR = 0L,
    public var dwRemoteIpPort: UInt = 0u,
    public var pszLocalIpAddress: PCWSTR = 0L,
    public var dwLocalIpPort: UInt = 0u,
    public var BytesSent: ULong = 0uL,
    public var BytesReceived: ULong = 0uL,
    public var pszCommand: PCWSTR = 0L,
    public var pszCommandParameters: PCWSTR = 0L,
    public var pszFullPath: PCWSTR = 0L,
    public var dwElapsedMilliseconds: UInt = 0u,
    public var FtpStatus: UInt = 0u,
    public var FtpSubStatus: UInt = 0u,
    public var hrStatus: HRESULT = 0,
    public var pszInformation: PCWSTR = 0L,
)

public data class MD_CHANGE_OBJECT_W(
    public var pszMDPath: PWSTR = 0L,
    public var dwMDChangeType: UInt = 0u,
    public var dwMDNumDataIDs: UInt = 0u,
    public var pdwMDDataIDs: Long = 0L,
)

public data class METADATA_GETALL_INTERNAL_RECORD(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var Anonymous: METADATA_GETALL_INTERNAL_RECORD_0 = METADATA_GETALL_INTERNAL_RECORD_0(),
    public var dwMDDataTag: UInt = 0u,
)

public data class METADATA_GETALL_INTERNAL_RECORD_0(public var dwMDDataOffset: ULong = 0uL, public var pbMDData: Long = 0L)

public data class METADATA_GETALL_RECORD(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var dwMDDataOffset: UInt = 0u,
    public var dwMDDataTag: UInt = 0u,
)

public data class METADATA_HANDLE_INFO(public var dwMDPermissions: UInt = 0u, public var dwMDSystemChangeNumber: UInt = 0u)

public data class METADATA_RECORD(
    public var dwMDIdentifier: UInt = 0u,
    public var dwMDAttributes: UInt = 0u,
    public var dwMDUserType: UInt = 0u,
    public var dwMDDataType: UInt = 0u,
    public var dwMDDataLen: UInt = 0u,
    public var pbMDData: Long = 0L,
    public var dwMDDataTag: UInt = 0u,
)

public class POST_PROCESS_PARAMETERS(
    public var pszSessionId: PCWSTR = 0L,
    public var pszSiteName: PCWSTR = 0L,
    public var pszUserName: PCWSTR = 0L,
    public var pszHostName: PCWSTR = 0L,
    public var pszRemoteIpAddress: PCWSTR = 0L,
    public var dwRemoteIpPort: UInt = 0u,
    public var pszLocalIpAddress: PCWSTR = 0L,
    public var dwLocalIpPort: UInt = 0u,
    public var BytesSent: ULong = 0uL,
    public var BytesReceived: ULong = 0uL,
    public var pszCommand: PCWSTR = 0L,
    public var pszCommandParameters: PCWSTR = 0L,
    public var pszFullPath: PCWSTR = 0L,
    public var pszPhysicalPath: PCWSTR = 0L,
    public var FtpStatus: UInt = 0u,
    public var FtpSubStatus: UInt = 0u,
    public var hrStatus: HRESULT = 0,
    public var SessionStartTime: FILETIME = FILETIME(),
    public var BytesSentPerSession: ULong = 0uL,
    public var BytesReceivedPerSession: ULong = 0uL,
)

public data class PRE_PROCESS_PARAMETERS(
    public var pszSessionId: PCWSTR = 0L,
    public var pszSiteName: PCWSTR = 0L,
    public var pszUserName: PCWSTR = 0L,
    public var pszHostName: PCWSTR = 0L,
    public var pszRemoteIpAddress: PCWSTR = 0L,
    public var dwRemoteIpPort: UInt = 0u,
    public var pszLocalIpAddress: PCWSTR = 0L,
    public var dwLocalIpPort: UInt = 0u,
    public var pszCommand: PCWSTR = 0L,
    public var pszCommandParameters: PCWSTR = 0L,
    public var SessionStartTime: FILETIME = FILETIME(),
    public var BytesSentPerSession: ULong = 0uL,
    public var BytesReceivedPerSession: ULong = 0uL,
)
