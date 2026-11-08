@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SOCKADDR_STORAGE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public data class HTTP2_SETTINGS_LIMITS_PARAM(public var Http2MaxSettingsPerFrame: UInt = 0u, public var Http2MaxSettingsPerMinute: UInt = 0u)

public data class HTTP2_WINDOW_SIZE_PARAM(public var Http2ReceiveWindowSize: UInt = 0u)

public data class HTTPAPI_VERSION(public var HttpApiMajorVersion: UShort = 0u, public var HttpApiMinorVersion: UShort = 0u)

public data class HTTP_BANDWIDTH_LIMIT_INFO(public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(), public var MaxBandwidth: UInt = 0u)

public data class HTTP_BINDING_INFO(public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(), public var RequestQueueHandle: HANDLE = 0L)

public data class HTTP_BYTE_RANGE(public var StartingOffset: ULong = 0uL, public var Length: ULong = 0uL)

public data class HTTP_CACHE_POLICY(public var Policy: HTTP_CACHE_POLICY_TYPE = 0, public var SecondsToLive: UInt = 0u)

public data class HTTP_CHANNEL_BIND_INFO(
    public var Hardening: HTTP_AUTHENTICATION_HARDENING_LEVELS = 0,
    public var Flags: UInt = 0u,
    public var ServiceNames: Long = 0L,
    public var NumberOfServiceNames: UInt = 0u,
)

public data class HTTP_CONNECTION_LIMIT_INFO(public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(), public var MaxConnections: UInt = 0u)

public data class HTTP_COOKED_URL(
    public var FullUrlLength: UShort = 0u,
    public var HostLength: UShort = 0u,
    public var AbsPathLength: UShort = 0u,
    public var QueryStringLength: UShort = 0u,
    public var pFullUrl: PCWSTR = 0L,
    public var pHost: PCWSTR = 0L,
    public var pAbsPath: PCWSTR = 0L,
    public var pQueryString: PCWSTR = 0L,
)

public data class HTTP_CREATE_REQUEST_QUEUE_PROPERTY_INFO(
    public var PropertyId: HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID = 0,
    public var PropertyInfoLength: UInt = 0u,
    public var PropertyInfo: Long = 0L,
)

public data class HTTP_DATA_CHUNK(public var DataChunkType: HTTP_DATA_CHUNK_TYPE = 0, public var Anonymous: HTTP_DATA_CHUNK_0 = HTTP_DATA_CHUNK_0())

public data class HTTP_DATA_CHUNK_0(
    public var FromMemory: HTTP_DATA_CHUNK_0_0 = HTTP_DATA_CHUNK_0_0(),
    public var FromFileHandle: HTTP_DATA_CHUNK_0_1 = HTTP_DATA_CHUNK_0_1(),
    public var FromFragmentCache: HTTP_DATA_CHUNK_0_2 = HTTP_DATA_CHUNK_0_2(),
    public var FromFragmentCacheEx: HTTP_DATA_CHUNK_0_3 = HTTP_DATA_CHUNK_0_3(),
    public var Trailers: HTTP_DATA_CHUNK_0_4 = HTTP_DATA_CHUNK_0_4(),
)

public data class HTTP_DATA_CHUNK_0_1(public var ByteRange: HTTP_BYTE_RANGE = HTTP_BYTE_RANGE(), public var FileHandle: HANDLE = 0L)

public data class HTTP_DATA_CHUNK_0_3(public var ByteRange: HTTP_BYTE_RANGE = HTTP_BYTE_RANGE(), public var pFragmentName: PCWSTR = 0L)

public data class HTTP_DATA_CHUNK_0_2(public var FragmentNameLength: UShort = 0u, public var pFragmentName: PCWSTR = 0L)

public data class HTTP_DATA_CHUNK_0_0(public var pBuffer: Long = 0L, public var BufferLength: UInt = 0u)

public data class HTTP_DATA_CHUNK_0_4(public var TrailerCount: UShort = 0u, public var pTrailers: Long = 0L)

public data class HTTP_DELEGATE_REQUEST_PROPERTY_INFO(
    public var PropertyId: HTTP_DELEGATE_REQUEST_PROPERTY_ID = 0,
    public var PropertyInfoLength: UInt = 0u,
    public var PropertyInfo: Long = 0L,
)

public data class HTTP_ERROR_HEADERS_PARAM(
    public var StatusCode: UShort = 0u,
    public var HeaderCount: UShort = 0u,
    public var Headers: Long = 0L,
)

public data class HTTP_FLOWRATE_INFO(
    public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(),
    public var MaxBandwidth: UInt = 0u,
    public var MaxPeakBandwidth: UInt = 0u,
    public var BurstSize: UInt = 0u,
)

public data class HTTP_KNOWN_HEADER(public var RawValueLength: UShort = 0u, public var pRawValue: PCSTR = 0L)

public data class HTTP_LISTEN_ENDPOINT_INFO(public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(), public var EnableSharing: Boolean = false)

public data class HTTP_LOGGING_INFO(
    public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(),
    public var LoggingFlags: UInt = 0u,
    public var SoftwareName: PCWSTR = 0L,
    public var SoftwareNameLength: UShort = 0u,
    public var DirectoryNameLength: UShort = 0u,
    public var DirectoryName: PCWSTR = 0L,
    public var Format: HTTP_LOGGING_TYPE = 0,
    public var Fields: UInt = 0u,
    public var pExtFields: Long = 0L,
    public var NumOfExtFields: UShort = 0u,
    public var MaxRecordSize: UShort = 0u,
    public var RolloverType: HTTP_LOGGING_ROLLOVER_TYPE = 0,
    public var RolloverSize: UInt = 0u,
    public var pSecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
)

public data class HTTP_LOG_DATA(public var Type: HTTP_LOG_DATA_TYPE = 0)

public class HTTP_LOG_FIELDS_DATA(
    public var Base: HTTP_LOG_DATA = HTTP_LOG_DATA(),
    public var UserNameLength: UShort = 0u,
    public var UriStemLength: UShort = 0u,
    public var ClientIpLength: UShort = 0u,
    public var ServerNameLength: UShort = 0u,
    public var ServiceNameLength: UShort = 0u,
    public var ServerIpLength: UShort = 0u,
    public var MethodLength: UShort = 0u,
    public var UriQueryLength: UShort = 0u,
    public var HostLength: UShort = 0u,
    public var UserAgentLength: UShort = 0u,
    public var CookieLength: UShort = 0u,
    public var ReferrerLength: UShort = 0u,
    public var UserName: PWSTR = 0L,
    public var UriStem: PWSTR = 0L,
    public var ClientIp: PSTR = 0L,
    public var ServerName: PSTR = 0L,
    public var ServiceName: PSTR = 0L,
    public var ServerIp: PSTR = 0L,
    public var Method: PSTR = 0L,
    public var UriQuery: PSTR = 0L,
    public var Host: PSTR = 0L,
    public var UserAgent: PSTR = 0L,
    public var Cookie: PSTR = 0L,
    public var Referrer: PSTR = 0L,
    public var ServerPort: UShort = 0u,
    public var ProtocolStatus: UShort = 0u,
    public var Win32Status: UInt = 0u,
    public var MethodNum: HTTP_VERB = 0,
    public var SubStatus: UShort = 0u,
)

public data class HTTP_MULTIPLE_KNOWN_HEADERS(
    public var HeaderId: HTTP_HEADER_ID = 0,
    public var Flags: UInt = 0u,
    public var KnownHeaderCount: UShort = 0u,
    public var KnownHeaders: Long = 0L,
)

public data class HTTP_PERFORMANCE_PARAM(
    public var Type: HTTP_PERFORMANCE_PARAM_TYPE = 0,
    public var BufferSize: UInt = 0u,
    public var Buffer: Long = 0L,
)

public data class HTTP_PROPERTY_FLAGS(public var _bitfield: UInt = 0u)

public data class HTTP_PROTECTION_LEVEL_INFO(public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(), public var Level: HTTP_PROTECTION_LEVEL_TYPE = 0)

public data class HTTP_QOS_SETTING_INFO(public var QosType: HTTP_QOS_SETTING_TYPE = 0, public var QosSetting: Long = 0L)

public data class HTTP_QUERY_REQUEST_QUALIFIER_QUIC(public var Freshness: ULong = 0uL)

public data class HTTP_QUERY_REQUEST_QUALIFIER_TCP(public var Freshness: ULong = 0uL)

public data class HTTP_QUIC_API_TIMINGS(public var ConnectionTimings: HTTP_QUIC_CONNECTION_API_TIMINGS = HTTP_QUIC_CONNECTION_API_TIMINGS(), public var StreamTimings: HTTP_QUIC_STREAM_API_TIMINGS = HTTP_QUIC_STREAM_API_TIMINGS())

public data class HTTP_QUIC_CONNECTION_API_TIMINGS(
    public var OpenTime: ULong = 0uL,
    public var CloseTime: ULong = 0uL,
    public var StartTime: ULong = 0uL,
    public var ShutdownTime: ULong = 0uL,
    public var SecConfigCreateTime: ULong = 0uL,
    public var SecConfigDeleteTime: ULong = 0uL,
    public var GetParamCount: ULong = 0uL,
    public var GetParamSum: ULong = 0uL,
    public var SetParamCount: ULong = 0uL,
    public var SetParamSum: ULong = 0uL,
    public var SetCallbackHandlerCount: ULong = 0uL,
    public var SetCallbackHandlerSum: ULong = 0uL,
    public var ControlStreamTimings: HTTP_QUIC_STREAM_API_TIMINGS = HTTP_QUIC_STREAM_API_TIMINGS(),
)

public class HTTP_QUIC_STREAM_API_TIMINGS(
    public var OpenCount: ULong = 0uL,
    public var OpenSum: ULong = 0uL,
    public var CloseCount: ULong = 0uL,
    public var CloseSum: ULong = 0uL,
    public var StartCount: ULong = 0uL,
    public var StartSum: ULong = 0uL,
    public var ShutdownCount: ULong = 0uL,
    public var ShutdownSum: ULong = 0uL,
    public var SendCount: ULong = 0uL,
    public var SendSum: ULong = 0uL,
    public var ReceiveSetEnabledCount: ULong = 0uL,
    public var ReceiveSetEnabledSum: ULong = 0uL,
    public var GetParamCount: ULong = 0uL,
    public var GetParamSum: ULong = 0uL,
    public var SetParamCount: ULong = 0uL,
    public var SetParamSum: ULong = 0uL,
    public var SetCallbackHandlerCount: ULong = 0uL,
    public var SetCallbackHandlerSum: ULong = 0uL,
)

public data class HTTP_QUIC_STREAM_REQUEST_STATS(
    public var StreamWaitStart: ULong = 0uL,
    public var StreamWaitEnd: ULong = 0uL,
    public var RequestHeadersCompressionStart: ULong = 0uL,
    public var RequestHeadersCompressionEnd: ULong = 0uL,
    public var ResponseHeadersDecompressionStart: ULong = 0uL,
    public var ResponseHeadersDecompressionEnd: ULong = 0uL,
    public var RequestHeadersCompressedSize: ULong = 0uL,
    public var ResponseHeadersCompressedSize: ULong = 0uL,
)

public data class HTTP_REQUEST_AUTH_INFO(
    public var AuthStatus: HTTP_AUTH_STATUS = 0,
    public var SecStatus: HRESULT = 0,
    public var Flags: UInt = 0u,
    public var AuthType: HTTP_REQUEST_AUTH_TYPE = 0,
    public var AccessToken: HANDLE = 0L,
    public var ContextAttributes: UInt = 0u,
    public var PackedContextLength: UInt = 0u,
    public var PackedContextType: UInt = 0u,
    public var PackedContext: Long = 0L,
    public var MutualAuthDataLength: UInt = 0u,
    public var pMutualAuthData: PSTR = 0L,
    public var PackageNameLength: UShort = 0u,
    public var pPackageName: PWSTR = 0L,
)

public data class HTTP_REQUEST_CHANNEL_BIND_STATUS(
    public var ServiceName: Long = 0L,
    public var ChannelToken: Long = 0L,
    public var ChannelTokenSize: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class HTTP_REQUEST_HEADERS(
    public var UnknownHeaderCount: UShort = 0u,
    public var pUnknownHeaders: Long = 0L,
    public var TrailerCount: UShort = 0u,
    public var pTrailers: Long = 0L,
    public var KnownHeaders: List<HTTP_KNOWN_HEADER> = List(41) { HTTP_KNOWN_HEADER() },
)

public data class HTTP_REQUEST_INFO(
    public var InfoType: HTTP_REQUEST_INFO_TYPE = 0,
    public var InfoLength: UInt = 0u,
    public var pInfo: Long = 0L,
)

public data class HTTP_REQUEST_PROPERTY_SNI(public var Hostname: UShortArray = UShortArray(256), public var Flags: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HTTP_REQUEST_PROPERTY_SNI) return false
        if (!this.Hostname.contentEquals(other.Hostname)) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Hostname.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class HTTP_REQUEST_PROPERTY_STREAM_ERROR(public var ErrorCode: UInt = 0u)

public data class HTTP_REQUEST_SIZING_INFO(
    public var Flags: ULong = 0uL,
    public var RequestIndex: UInt = 0u,
    public var RequestSizingCount: UInt = 0u,
    public var RequestSizing: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HTTP_REQUEST_SIZING_INFO) return false
        if (this.Flags != other.Flags) return false
        if (this.RequestIndex != other.RequestIndex) return false
        if (this.RequestSizingCount != other.RequestSizingCount) return false
        if (!this.RequestSizing.contentEquals(other.RequestSizing)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.RequestIndex.hashCode()
        result = 31 * result + this.RequestSizingCount.hashCode()
        result = 31 * result + this.RequestSizing.contentHashCode()
        return result
    }
}

public data class HTTP_REQUEST_TIMING_INFO(public var RequestTimingCount: UInt = 0u, public var RequestTiming: ULongArray = ULongArray(30)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HTTP_REQUEST_TIMING_INFO) return false
        if (this.RequestTimingCount != other.RequestTimingCount) return false
        if (!this.RequestTiming.contentEquals(other.RequestTiming)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RequestTimingCount.hashCode()
        result = 31 * result + this.RequestTiming.contentHashCode()
        return result
    }
}

public data class HTTP_REQUEST_TOKEN_BINDING_INFO(
    public var TokenBinding: Long = 0L,
    public var TokenBindingSize: UInt = 0u,
    public var EKM: Long = 0L,
    public var EKMSize: UInt = 0u,
    public var KeyType: UByte = 0u,
)

public class HTTP_REQUEST_V1(
    public var Flags: UInt = 0u,
    public var ConnectionId: ULong = 0uL,
    public var RequestId: ULong = 0uL,
    public var UrlContext: ULong = 0uL,
    public var Version: HTTP_VERSION = HTTP_VERSION(),
    public var Verb: HTTP_VERB = 0,
    public var UnknownVerbLength: UShort = 0u,
    public var RawUrlLength: UShort = 0u,
    public var pUnknownVerb: PCSTR = 0L,
    public var pRawUrl: PCSTR = 0L,
    public var CookedUrl: HTTP_COOKED_URL = HTTP_COOKED_URL(),
    public var Address: HTTP_TRANSPORT_ADDRESS = HTTP_TRANSPORT_ADDRESS(),
    public var Headers: HTTP_REQUEST_HEADERS = HTTP_REQUEST_HEADERS(),
    public var BytesReceived: ULong = 0uL,
    public var EntityChunkCount: UShort = 0u,
    public var pEntityChunks: Long = 0L,
    public var RawConnectionId: ULong = 0uL,
    public var pSslInfo: Long = 0L,
)

public data class HTTP_REQUEST_V2(
    public var Base: HTTP_REQUEST_V1 = HTTP_REQUEST_V1(),
    public var RequestInfoCount: UShort = 0u,
    public var pRequestInfo: Long = 0L,
)

public data class HTTP_RESPONSE_HEADERS(
    public var UnknownHeaderCount: UShort = 0u,
    public var pUnknownHeaders: Long = 0L,
    public var TrailerCount: UShort = 0u,
    public var pTrailers: Long = 0L,
    public var KnownHeaders: List<HTTP_KNOWN_HEADER> = List(30) { HTTP_KNOWN_HEADER() },
)

public data class HTTP_RESPONSE_INFO(
    public var Type: HTTP_RESPONSE_INFO_TYPE = 0,
    public var Length: UInt = 0u,
    public var pInfo: Long = 0L,
)

public data class HTTP_RESPONSE_V1(
    public var Flags: UInt = 0u,
    public var Version: HTTP_VERSION = HTTP_VERSION(),
    public var StatusCode: UShort = 0u,
    public var ReasonLength: UShort = 0u,
    public var pReason: PCSTR = 0L,
    public var Headers: HTTP_RESPONSE_HEADERS = HTTP_RESPONSE_HEADERS(),
    public var EntityChunkCount: UShort = 0u,
    public var pEntityChunks: Long = 0L,
)

public data class HTTP_RESPONSE_V2(
    public var Base: HTTP_RESPONSE_V1 = HTTP_RESPONSE_V1(),
    public var ResponseInfoCount: UShort = 0u,
    public var pResponseInfo: Long = 0L,
)

public data class HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS(public var RealmLength: UShort = 0u, public var Realm: PWSTR = 0L)

public data class HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS(
    public var DomainNameLength: UShort = 0u,
    public var DomainName: PWSTR = 0L,
    public var RealmLength: UShort = 0u,
    public var Realm: PWSTR = 0L,
)

public data class HTTP_SERVER_AUTHENTICATION_INFO(
    public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(),
    public var AuthSchemes: UInt = 0u,
    public var ReceiveMutualAuth: Boolean = false,
    public var ReceiveContextHandle: Boolean = false,
    public var DisableNTLMCredentialCaching: Boolean = false,
    public var ExFlags: UByte = 0u,
    public var DigestParams: HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS = HTTP_SERVER_AUTHENTICATION_DIGEST_PARAMS(),
    public var BasicParams: HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS = HTTP_SERVER_AUTHENTICATION_BASIC_PARAMS(),
)

public data class HTTP_SERVICE_BINDING_A(
    public var Base: HTTP_SERVICE_BINDING_BASE = HTTP_SERVICE_BINDING_BASE(),
    public var Buffer: PSTR = 0L,
    public var BufferSize: UInt = 0u,
)

public data class HTTP_SERVICE_BINDING_BASE(public var Type: HTTP_SERVICE_BINDING_TYPE = 0)

public data class HTTP_SERVICE_BINDING_W(
    public var Base: HTTP_SERVICE_BINDING_BASE = HTTP_SERVICE_BINDING_BASE(),
    public var Buffer: PWSTR = 0L,
    public var BufferSize: UInt = 0u,
)

public data class HTTP_SERVICE_CONFIG_CACHE_SET(public var KeyDesc: HTTP_SERVICE_CONFIG_CACHE_KEY = 0, public var ParamDesc: UInt = 0u)

public data class HTTP_SERVICE_CONFIG_IP_LISTEN_PARAM(public var AddrLength: UShort = 0u, public var pAddress: Long = 0L)

public data class HTTP_SERVICE_CONFIG_IP_LISTEN_QUERY(public var AddrCount: UInt = 0u, public var AddrList: List<SOCKADDR_STORAGE> = List(1) { SOCKADDR_STORAGE() })

public data class HTTP_SERVICE_CONFIG_SETTING_SET(public var KeyDesc: HTTP_SERVICE_CONFIG_SETTING_KEY = 0, public var ParamDesc: UInt = 0u)

public data class HTTP_SERVICE_CONFIG_SSL_CCS_KEY(public var LocalAddress: SOCKADDR_STORAGE = SOCKADDR_STORAGE())

public data class HTTP_SERVICE_CONFIG_SSL_CCS_QUERY(
    public var QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0,
    public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY = HTTP_SERVICE_CONFIG_SSL_CCS_KEY(),
    public var dwToken: UInt = 0u,
)

public data class HTTP_SERVICE_CONFIG_SSL_CCS_QUERY_EX(
    public var QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0,
    public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY = HTTP_SERVICE_CONFIG_SSL_CCS_KEY(),
    public var dwToken: UInt = 0u,
    public var ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 0,
)

public data class HTTP_SERVICE_CONFIG_SSL_CCS_SET(public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY = HTTP_SERVICE_CONFIG_SSL_CCS_KEY(), public var ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM = HTTP_SERVICE_CONFIG_SSL_PARAM())

public data class HTTP_SERVICE_CONFIG_SSL_CCS_SET_EX(public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_CCS_KEY = HTTP_SERVICE_CONFIG_SSL_CCS_KEY(), public var ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM_EX = HTTP_SERVICE_CONFIG_SSL_PARAM_EX())

public data class HTTP_SERVICE_CONFIG_SSL_KEY(public var pIpPort: Long = 0L)

public data class HTTP_SERVICE_CONFIG_SSL_KEY_EX(public var IpPort: SOCKADDR_STORAGE = SOCKADDR_STORAGE())

public data class HTTP_SERVICE_CONFIG_SSL_PARAM(
    public var SslHashLength: UInt = 0u,
    public var pSslHash: Long = 0L,
    public var AppId: GUID = GUID(),
    public var pSslCertStoreName: PWSTR = 0L,
    public var DefaultCertCheckMode: UInt = 0u,
    public var DefaultRevocationFreshnessTime: UInt = 0u,
    public var DefaultRevocationUrlRetrievalTimeout: UInt = 0u,
    public var pDefaultSslCtlIdentifier: PWSTR = 0L,
    public var pDefaultSslCtlStoreName: PWSTR = 0L,
    public var DefaultFlags: UInt = 0u,
)

public data class HTTP_SERVICE_CONFIG_SSL_PARAM_EX(
    public var ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 0,
    public var Flags: ULong = 0uL,
    public var Anonymous: HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0 = HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0(),
)

public data class HTTP_SERVICE_CONFIG_SSL_PARAM_EX_0(
    public var Http2WindowSizeParam: HTTP2_WINDOW_SIZE_PARAM = HTTP2_WINDOW_SIZE_PARAM(),
    public var Http2SettingsLimitsParam: HTTP2_SETTINGS_LIMITS_PARAM = HTTP2_SETTINGS_LIMITS_PARAM(),
    public var HttpPerformanceParam: HTTP_PERFORMANCE_PARAM = HTTP_PERFORMANCE_PARAM(),
    public var HttpTlsRestrictionsParam: HTTP_TLS_RESTRICTIONS_PARAM = HTTP_TLS_RESTRICTIONS_PARAM(),
    public var HttpErrorHeadersParam: HTTP_ERROR_HEADERS_PARAM = HTTP_ERROR_HEADERS_PARAM(),
    public var HttpTlsSessionTicketKeysParam: HTTP_TLS_SESSION_TICKET_KEYS_PARAM = HTTP_TLS_SESSION_TICKET_KEYS_PARAM(),
)

public data class HTTP_SERVICE_CONFIG_SSL_QUERY(
    public var QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0,
    public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY = HTTP_SERVICE_CONFIG_SSL_KEY(),
    public var dwToken: UInt = 0u,
)

public data class HTTP_SERVICE_CONFIG_SSL_QUERY_EX(
    public var QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0,
    public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY_EX = HTTP_SERVICE_CONFIG_SSL_KEY_EX(),
    public var dwToken: UInt = 0u,
    public var ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 0,
)

public data class HTTP_SERVICE_CONFIG_SSL_SET(public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY = HTTP_SERVICE_CONFIG_SSL_KEY(), public var ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM = HTTP_SERVICE_CONFIG_SSL_PARAM())

public data class HTTP_SERVICE_CONFIG_SSL_SET_EX(public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_KEY_EX = HTTP_SERVICE_CONFIG_SSL_KEY_EX(), public var ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM_EX = HTTP_SERVICE_CONFIG_SSL_PARAM_EX())

public data class HTTP_SERVICE_CONFIG_SSL_SNI_KEY(public var IpPort: SOCKADDR_STORAGE = SOCKADDR_STORAGE(), public var Host: PWSTR = 0L)

public data class HTTP_SERVICE_CONFIG_SSL_SNI_QUERY(
    public var QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0,
    public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY = HTTP_SERVICE_CONFIG_SSL_SNI_KEY(),
    public var dwToken: UInt = 0u,
)

public data class HTTP_SERVICE_CONFIG_SSL_SNI_QUERY_EX(
    public var QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0,
    public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY = HTTP_SERVICE_CONFIG_SSL_SNI_KEY(),
    public var dwToken: UInt = 0u,
    public var ParamType: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 0,
)

public data class HTTP_SERVICE_CONFIG_SSL_SNI_SET(public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY = HTTP_SERVICE_CONFIG_SSL_SNI_KEY(), public var ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM = HTTP_SERVICE_CONFIG_SSL_PARAM())

public data class HTTP_SERVICE_CONFIG_SSL_SNI_SET_EX(public var KeyDesc: HTTP_SERVICE_CONFIG_SSL_SNI_KEY = HTTP_SERVICE_CONFIG_SSL_SNI_KEY(), public var ParamDesc: HTTP_SERVICE_CONFIG_SSL_PARAM_EX = HTTP_SERVICE_CONFIG_SSL_PARAM_EX())

public data class HTTP_SERVICE_CONFIG_TIMEOUT_SET(public var KeyDesc: HTTP_SERVICE_CONFIG_TIMEOUT_KEY = 0, public var ParamDesc: UShort = 0u)

public data class HTTP_SERVICE_CONFIG_URLACL_KEY(public var pUrlPrefix: PWSTR = 0L)

public data class HTTP_SERVICE_CONFIG_URLACL_PARAM(public var pStringSecurityDescriptor: PWSTR = 0L)

public data class HTTP_SERVICE_CONFIG_URLACL_QUERY(
    public var QueryDesc: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0,
    public var KeyDesc: HTTP_SERVICE_CONFIG_URLACL_KEY = HTTP_SERVICE_CONFIG_URLACL_KEY(),
    public var dwToken: UInt = 0u,
)

public data class HTTP_SERVICE_CONFIG_URLACL_SET(public var KeyDesc: HTTP_SERVICE_CONFIG_URLACL_KEY = HTTP_SERVICE_CONFIG_URLACL_KEY(), public var ParamDesc: HTTP_SERVICE_CONFIG_URLACL_PARAM = HTTP_SERVICE_CONFIG_URLACL_PARAM())

public data class HTTP_SSL_CLIENT_CERT_INFO(
    public var CertFlags: UInt = 0u,
    public var CertEncodedSize: UInt = 0u,
    public var pCertEncoded: Long = 0L,
    public var Token: HANDLE = 0L,
    public var CertDeniedByMapper: Boolean = false,
)

public data class HTTP_SSL_INFO(
    public var ServerCertKeySize: UShort = 0u,
    public var ConnectionKeySize: UShort = 0u,
    public var ServerCertIssuerSize: UInt = 0u,
    public var ServerCertSubjectSize: UInt = 0u,
    public var pServerCertIssuer: PCSTR = 0L,
    public var pServerCertSubject: PCSTR = 0L,
    public var pClientCertInfo: Long = 0L,
    public var SslClientCertNegotiated: UInt = 0u,
)

public data class HTTP_SSL_PROTOCOL_INFO(
    public var Protocol: UInt = 0u,
    public var CipherType: UInt = 0u,
    public var CipherStrength: UInt = 0u,
    public var HashType: UInt = 0u,
    public var HashStrength: UInt = 0u,
    public var KeyExchangeType: UInt = 0u,
    public var KeyExchangeStrength: UInt = 0u,
)

public data class HTTP_STATE_INFO(public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(), public var State: HTTP_ENABLED_STATE = 0)

public data class HTTP_TIMEOUT_LIMIT_INFO(
    public var Flags: HTTP_PROPERTY_FLAGS = HTTP_PROPERTY_FLAGS(),
    public var EntityBody: UShort = 0u,
    public var DrainEntityBody: UShort = 0u,
    public var RequestQueue: UShort = 0u,
    public var IdleConnection: UShort = 0u,
    public var HeaderWait: UShort = 0u,
    public var MinSendRate: UInt = 0u,
)

public data class HTTP_TLS_RESTRICTIONS_PARAM(public var RestrictionCount: UInt = 0u, public var TlsRestrictions: Long = 0L)

public data class HTTP_TLS_SESSION_TICKET_KEYS_PARAM(public var SessionTicketKeyCount: UInt = 0u, public var SessionTicketKeys: Long = 0L)

public data class HTTP_TRANSPORT_ADDRESS(public var pRemoteAddress: Long = 0L, public var pLocalAddress: Long = 0L)

public data class HTTP_UNKNOWN_HEADER(
    public var NameLength: UShort = 0u,
    public var RawValueLength: UShort = 0u,
    public var pName: PCSTR = 0L,
    public var pRawValue: PCSTR = 0L,
)

public data class HTTP_VERSION(public var MajorVersion: UShort = 0u, public var MinorVersion: UShort = 0u)

public data class HTTP_WSK_API_TIMINGS(
    public var ConnectCount: ULong = 0uL,
    public var ConnectSum: ULong = 0uL,
    public var DisconnectCount: ULong = 0uL,
    public var DisconnectSum: ULong = 0uL,
    public var SendCount: ULong = 0uL,
    public var SendSum: ULong = 0uL,
    public var ReceiveCount: ULong = 0uL,
    public var ReceiveSum: ULong = 0uL,
    public var ReleaseCount: ULong = 0uL,
    public var ReleaseSum: ULong = 0uL,
    public var ControlSocketCount: ULong = 0uL,
    public var ControlSocketSum: ULong = 0uL,
)
