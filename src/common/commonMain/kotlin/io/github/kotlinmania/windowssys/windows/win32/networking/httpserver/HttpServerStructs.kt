@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public data class Http2SettingsLimitsParam(
    public var http2MaxSettingsPerFrame: UInt = 0u,
    public var http2MaxSettingsPerMinute: UInt = 0u,
)

public data class Http2WindowSizeParam(
    public var http2ReceiveWindowSize: UInt = 0u,
)

public data class HttpapiVersion(
    public var httpApiMajorVersion: UShort = 0u,
    public var httpApiMinorVersion: UShort = 0u,
)

public data class HttpBandwidthLimitInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var maxBandwidth: UInt = 0u,
)

public data class HttpBindingInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var requestQueueHandle: Handle = null,
)

public data class HttpByteRange(
    public var startingOffset: ULong = 0uL,
    public var length: ULong = 0uL,
)

public data class HttpCachePolicy(
    public var policy: HttpCachePolicyType = 0,
    public var secondsToLive: UInt = 0u,
)

public data class HttpChannelBindInfo(
    public var hardening: HttpAuthenticationHardeningLevels = 0,
    public var flags: UInt = 0u,
    public var serviceNames: COpaquePointer? = null,
    public var numberOfServiceNames: UInt = 0u,
)

public data class HttpConnectionLimitInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var maxConnections: UInt = 0u,
)

public data class HttpCookedUrl(
    public var fullUrlLength: UShort = 0u,
    public var hostLength: UShort = 0u,
    public var absPathLength: UShort = 0u,
    public var queryStringLength: UShort = 0u,
    public var pFullUrl: Pcwstr = null,
    public var pHost: Pcwstr = null,
    public var pAbsPath: Pcwstr = null,
    public var pQueryString: Pcwstr = null,
)

public data class HttpCreateRequestQueuePropertyInfo(
    public var propertyId: HttpCreateRequestQueuePropertyId = 0,
    public var propertyInfoLength: UInt = 0u,
    public var propertyInfo: COpaquePointer? = null,
)

public data class HttpDataChunk(
    public var dataChunkType: HttpDataChunkType = 0,
    public var anonymous: HttpDataChunk0 = HttpDataChunk0(),
)

public data class HttpDataChunk0(
    public var fromMemory: HttpDataChunk00 = HttpDataChunk00(),
    public var fromFileHandle: HttpDataChunk01 = HttpDataChunk01(),
    public var fromFragmentCache: HttpDataChunk02 = HttpDataChunk02(),
    public var fromFragmentCacheEx: HttpDataChunk03 = HttpDataChunk03(),
    public var trailers: HttpDataChunk04 = HttpDataChunk04(),
)

public data class HttpDataChunk01(
    public var byteRange: HttpByteRange = HttpByteRange(),
    public var fileHandle: Handle = null,
)

public data class HttpDataChunk03(
    public var byteRange: HttpByteRange = HttpByteRange(),
    public var pFragmentName: Pcwstr = null,
)

public data class HttpDataChunk02(
    public var fragmentNameLength: UShort = 0u,
    public var pFragmentName: Pcwstr = null,
)

public data class HttpDataChunk00(
    public var pBuffer: COpaquePointer? = null,
    public var bufferLength: UInt = 0u,
)

public data class HttpDataChunk04(
    public var trailerCount: UShort = 0u,
    public var pTrailers: HttpUnknownHeader? = null,
)

public data class HttpDelegateRequestPropertyInfo(
    public var propertyId: HttpDelegateRequestPropertyId = 0,
    public var propertyInfoLength: UInt = 0u,
    public var propertyInfo: COpaquePointer? = null,
)

public data class HttpErrorHeadersParam(
    public var statusCode: UShort = 0u,
    public var headerCount: UShort = 0u,
    public var headers: HttpUnknownHeader? = null,
)

public data class HttpFlowrateInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var maxBandwidth: UInt = 0u,
    public var maxPeakBandwidth: UInt = 0u,
    public var burstSize: UInt = 0u,
)

public data class HttpKnownHeader(
    public var rawValueLength: UShort = 0u,
    public var pRawValue: Pcstr = null,
)

public data class HttpListenEndpointInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var enableSharing: Boolean = false,
)

public data class HttpLoggingInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var loggingFlags: UInt = 0u,
    public var softwareName: Pcwstr = null,
    public var softwareNameLength: UShort = 0u,
    public var directoryNameLength: UShort = 0u,
    public var directoryName: Pcwstr = null,
    public var format: HttpLoggingType = 0,
    public var fields: UInt = 0u,
    public var pExtFields: COpaquePointer? = null,
    public var numOfExtFields: UShort = 0u,
    public var maxRecordSize: UShort = 0u,
    public var rolloverType: HttpLoggingRolloverType = 0,
    public var rolloverSize: UInt = 0u,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
)

public data class HttpLogData(
    public var type: HttpLogDataType = 0,
)

public class HttpLogFieldsData(
    public var base: HttpLogData = HttpLogData(),
    public var userNameLength: UShort = 0u,
    public var uriStemLength: UShort = 0u,
    public var clientIpLength: UShort = 0u,
    public var serverNameLength: UShort = 0u,
    public var serviceNameLength: UShort = 0u,
    public var serverIpLength: UShort = 0u,
    public var methodLength: UShort = 0u,
    public var uriQueryLength: UShort = 0u,
    public var hostLength: UShort = 0u,
    public var userAgentLength: UShort = 0u,
    public var cookieLength: UShort = 0u,
    public var referrerLength: UShort = 0u,
    public var userName: Pwstr = null,
    public var uriStem: Pwstr = null,
    public var clientIp: Pstr = null,
    public var serverName: Pstr = null,
    public var serviceName: Pstr = null,
    public var serverIp: Pstr = null,
    public var method: Pstr = null,
    public var uriQuery: Pstr = null,
    public var host: Pstr = null,
    public var userAgent: Pstr = null,
    public var cookie: Pstr = null,
    public var referrer: Pstr = null,
    public var serverPort: UShort = 0u,
    public var protocolStatus: UShort = 0u,
    public var win32Status: UInt = 0u,
    public var methodNum: HttpVerb = 0,
    public var subStatus: UShort = 0u,
)

public data class HttpMultipleKnownHeaders(
    public var headerId: HttpHeaderId = 0,
    public var flags: UInt = 0u,
    public var knownHeaderCount: UShort = 0u,
    public var knownHeaders: HttpKnownHeader? = null,
)

public data class HttpPerformanceParam(
    public var type: HttpPerformanceParamType = 0,
    public var bufferSize: UInt = 0u,
    public var buffer: COpaquePointer? = null,
)

public data class HttpPropertyFlags(
    public var bitfield: UInt = 0u,
)

public data class HttpProtectionLevelInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var level: HttpProtectionLevelType = 0,
)

public data class HttpQosSettingInfo(
    public var qosType: HttpQosSettingType = 0,
    public var qosSetting: COpaquePointer? = null,
)

public data class HttpQueryRequestQualifierQuic(
    public var freshness: ULong = 0uL,
)

public data class HttpQueryRequestQualifierTcp(
    public var freshness: ULong = 0uL,
)

public data class HttpQuicApiTimings(
    public var connectionTimings: HttpQuicConnectionApiTimings = HttpQuicConnectionApiTimings(),
    public var streamTimings: HttpQuicStreamApiTimings = HttpQuicStreamApiTimings(),
)

public data class HttpQuicConnectionApiTimings(
    public var openTime: ULong = 0uL,
    public var closeTime: ULong = 0uL,
    public var startTime: ULong = 0uL,
    public var shutdownTime: ULong = 0uL,
    public var secConfigCreateTime: ULong = 0uL,
    public var secConfigDeleteTime: ULong = 0uL,
    public var getParamCount: ULong = 0uL,
    public var getParamSum: ULong = 0uL,
    public var setParamCount: ULong = 0uL,
    public var setParamSum: ULong = 0uL,
    public var setCallbackHandlerCount: ULong = 0uL,
    public var setCallbackHandlerSum: ULong = 0uL,
    public var controlStreamTimings: HttpQuicStreamApiTimings = HttpQuicStreamApiTimings(),
)

public class HttpQuicStreamApiTimings(
    public var openCount: ULong = 0uL,
    public var openSum: ULong = 0uL,
    public var closeCount: ULong = 0uL,
    public var closeSum: ULong = 0uL,
    public var startCount: ULong = 0uL,
    public var startSum: ULong = 0uL,
    public var shutdownCount: ULong = 0uL,
    public var shutdownSum: ULong = 0uL,
    public var sendCount: ULong = 0uL,
    public var sendSum: ULong = 0uL,
    public var receiveSetEnabledCount: ULong = 0uL,
    public var receiveSetEnabledSum: ULong = 0uL,
    public var getParamCount: ULong = 0uL,
    public var getParamSum: ULong = 0uL,
    public var setParamCount: ULong = 0uL,
    public var setParamSum: ULong = 0uL,
    public var setCallbackHandlerCount: ULong = 0uL,
    public var setCallbackHandlerSum: ULong = 0uL,
)

public data class HttpQuicStreamRequestStats(
    public var streamWaitStart: ULong = 0uL,
    public var streamWaitEnd: ULong = 0uL,
    public var requestHeadersCompressionStart: ULong = 0uL,
    public var requestHeadersCompressionEnd: ULong = 0uL,
    public var responseHeadersDecompressionStart: ULong = 0uL,
    public var responseHeadersDecompressionEnd: ULong = 0uL,
    public var requestHeadersCompressedSize: ULong = 0uL,
    public var responseHeadersCompressedSize: ULong = 0uL,
)

public data class HttpRequestAuthInfo(
    public var authStatus: HttpAuthStatus = 0,
    public var secStatus: Hresult = 0,
    public var flags: UInt = 0u,
    public var authType: HttpRequestAuthType = 0,
    public var accessToken: Handle = null,
    public var contextAttributes: UInt = 0u,
    public var packedContextLength: UInt = 0u,
    public var packedContextType: UInt = 0u,
    public var packedContext: COpaquePointer? = null,
    public var mutualAuthDataLength: UInt = 0u,
    public var pMutualAuthData: Pstr = null,
    public var packageNameLength: UShort = 0u,
    public var pPackageName: Pwstr = null,
)

public data class HttpRequestChannelBindStatus(
    public var serviceName: HttpServiceBindingBase? = null,
    public var channelToken: COpaquePointer? = null,
    public var channelTokenSize: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class HttpRequestHeaders(
    public var unknownHeaderCount: UShort = 0u,
    public var pUnknownHeaders: HttpUnknownHeader? = null,
    public var trailerCount: UShort = 0u,
    public var pTrailers: HttpUnknownHeader? = null,
    public var knownHeaders: List<HttpKnownHeader> = List(41) { HttpKnownHeader() },
)

public data class HttpRequestInfo(
    public var infoType: HttpRequestInfoType = 0,
    public var infoLength: UInt = 0u,
    public var pInfo: COpaquePointer? = null,
)

public data class HttpRequestPropertySni(
    public var hostname: UShortArray = UShortArray(256),
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestPropertySni) return false
        if (!this.hostname.contentEquals(other.hostname)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hostname.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class HttpRequestPropertyStreamError(
    public var errorCode: UInt = 0u,
)

public data class HttpRequestSizingInfo(
    public var flags: ULong = 0uL,
    public var requestIndex: UInt = 0u,
    public var requestSizingCount: UInt = 0u,
    public var requestSizing: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestSizingInfo) return false
        if (this.flags != other.flags) return false
        if (this.requestIndex != other.requestIndex) return false
        if (this.requestSizingCount != other.requestSizingCount) return false
        if (!this.requestSizing.contentEquals(other.requestSizing)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.requestIndex.hashCode()
        result = 31 * result + this.requestSizingCount.hashCode()
        result = 31 * result + this.requestSizing.contentHashCode()
        return result
    }
}

public data class HttpRequestTimingInfo(
    public var requestTimingCount: UInt = 0u,
    public var requestTiming: ULongArray = ULongArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HttpRequestTimingInfo) return false
        if (this.requestTimingCount != other.requestTimingCount) return false
        if (!this.requestTiming.contentEquals(other.requestTiming)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.requestTimingCount.hashCode()
        result = 31 * result + this.requestTiming.contentHashCode()
        return result
    }
}

public data class HttpRequestTokenBindingInfo(
    public var tokenBinding: COpaquePointer? = null,
    public var tokenBindingSize: UInt = 0u,
    public var ekm: COpaquePointer? = null,
    public var eKMSize: UInt = 0u,
    public var keyType: UByte = 0u,
)

public class HttpRequestV1(
    public var flags: UInt = 0u,
    public var connectionId: ULong = 0uL,
    public var requestId: ULong = 0uL,
    public var urlContext: ULong = 0uL,
    public var version: HttpVersion = HttpVersion(),
    public var verb: HttpVerb = 0,
    public var unknownVerbLength: UShort = 0u,
    public var rawUrlLength: UShort = 0u,
    public var pUnknownVerb: Pcstr = null,
    public var pRawUrl: Pcstr = null,
    public var cookedUrl: HttpCookedUrl = HttpCookedUrl(),
    public var address: HttpTransportAddress = HttpTransportAddress(),
    public var headers: HttpRequestHeaders = HttpRequestHeaders(),
    public var bytesReceived: ULong = 0uL,
    public var entityChunkCount: UShort = 0u,
    public var pEntityChunks: HttpDataChunk? = null,
    public var rawConnectionId: ULong = 0uL,
    public var pSslInfo: HttpSslInfo? = null,
)

public data class HttpRequestV2(
    public var base: HttpRequestV1 = HttpRequestV1(),
    public var requestInfoCount: UShort = 0u,
    public var pRequestInfo: HttpRequestInfo? = null,
)

public data class HttpResponseHeaders(
    public var unknownHeaderCount: UShort = 0u,
    public var pUnknownHeaders: HttpUnknownHeader? = null,
    public var trailerCount: UShort = 0u,
    public var pTrailers: HttpUnknownHeader? = null,
    public var knownHeaders: List<HttpKnownHeader> = List(30) { HttpKnownHeader() },
)

public data class HttpResponseInfo(
    public var type: HttpResponseInfoType = 0,
    public var length: UInt = 0u,
    public var pInfo: COpaquePointer? = null,
)

public data class HttpResponseV1(
    public var flags: UInt = 0u,
    public var version: HttpVersion = HttpVersion(),
    public var statusCode: UShort = 0u,
    public var reasonLength: UShort = 0u,
    public var pReason: Pcstr = null,
    public var headers: HttpResponseHeaders = HttpResponseHeaders(),
    public var entityChunkCount: UShort = 0u,
    public var pEntityChunks: HttpDataChunk? = null,
)

public data class HttpResponseV2(
    public var base: HttpResponseV1 = HttpResponseV1(),
    public var responseInfoCount: UShort = 0u,
    public var pResponseInfo: HttpResponseInfo? = null,
)

public data class HttpServerAuthenticationBasicParams(
    public var realmLength: UShort = 0u,
    public var realm: Pwstr = null,
)

public data class HttpServerAuthenticationDigestParams(
    public var domainNameLength: UShort = 0u,
    public var domainName: Pwstr = null,
    public var realmLength: UShort = 0u,
    public var realm: Pwstr = null,
)

public data class HttpServerAuthenticationInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var authSchemes: UInt = 0u,
    public var receiveMutualAuth: Boolean = false,
    public var receiveContextHandle: Boolean = false,
    public var disableNTLMCredentialCaching: Boolean = false,
    public var exFlags: UByte = 0u,
    public var digestParams: HttpServerAuthenticationDigestParams = HttpServerAuthenticationDigestParams(),
    public var basicParams: HttpServerAuthenticationBasicParams = HttpServerAuthenticationBasicParams(),
)

public data class HttpServiceBindingA(
    public var base: HttpServiceBindingBase = HttpServiceBindingBase(),
    public var buffer: Pstr = null,
    public var bufferSize: UInt = 0u,
)

public data class HttpServiceBindingBase(
    public var type: HttpServiceBindingType = 0,
)

public data class HttpServiceBindingW(
    public var base: HttpServiceBindingBase = HttpServiceBindingBase(),
    public var buffer: Pwstr = null,
    public var bufferSize: UInt = 0u,
)

public data class HttpServiceConfigCacheSet(
    public var keyDesc: HttpServiceConfigCacheKey = 0,
    public var paramDesc: UInt = 0u,
)

public data class HttpServiceConfigIpListenParam(
    public var addrLength: UShort = 0u,
    public var pAddress: Sockaddr? = null,
)

public data class HttpServiceConfigIpListenQuery(
    public var addrCount: UInt = 0u,
    public var addrList: List<SockaddrStorage> = List(1) { SockaddrStorage() },
)

public data class HttpServiceConfigSettingSet(
    public var keyDesc: HttpServiceConfigSettingKey = 0,
    public var paramDesc: UInt = 0u,
)

public data class HttpServiceConfigSslCcsKey(
    public var localAddress: SockaddrStorage = SockaddrStorage(),
)

public data class HttpServiceConfigSslCcsQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var dwToken: UInt = 0u,
)

public data class HttpServiceConfigSslCcsQueryEx(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var dwToken: UInt = 0u,
    public var paramType: HttpSslServiceConfigExParamType = 0,
)

public data class HttpServiceConfigSslCcsSet(
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var paramDesc: HttpServiceConfigSslParam = HttpServiceConfigSslParam(),
)

public data class HttpServiceConfigSslCcsSetEx(
    public var keyDesc: HttpServiceConfigSslCcsKey = HttpServiceConfigSslCcsKey(),
    public var paramDesc: HttpServiceConfigSslParamEx = HttpServiceConfigSslParamEx(),
)

public data class HttpServiceConfigSslKey(
    public var pIpPort: Sockaddr? = null,
)

public data class HttpServiceConfigSslKeyEx(
    public var ipPort: SockaddrStorage = SockaddrStorage(),
)

public data class HttpServiceConfigSslParam(
    public var sslHashLength: UInt = 0u,
    public var pSslHash: COpaquePointer? = null,
    public var appId: Guid = Guid(),
    public var pSslCertStoreName: Pwstr = null,
    public var defaultCertCheckMode: UInt = 0u,
    public var defaultRevocationFreshnessTime: UInt = 0u,
    public var defaultRevocationUrlRetrievalTimeout: UInt = 0u,
    public var pDefaultSslCtlIdentifier: Pwstr = null,
    public var pDefaultSslCtlStoreName: Pwstr = null,
    public var defaultFlags: UInt = 0u,
)

public data class HttpServiceConfigSslParamEx(
    public var paramType: HttpSslServiceConfigExParamType = 0,
    public var flags: ULong = 0uL,
    public var anonymous: HttpServiceConfigSslParamEx0 = HttpServiceConfigSslParamEx0(),
)

public data class HttpServiceConfigSslParamEx0(
    public var http2WindowSizeParam: Http2WindowSizeParam = Http2WindowSizeParam(),
    public var http2SettingsLimitsParam: Http2SettingsLimitsParam = Http2SettingsLimitsParam(),
    public var httpPerformanceParam: HttpPerformanceParam = HttpPerformanceParam(),
    public var httpTlsRestrictionsParam: HttpTlsRestrictionsParam = HttpTlsRestrictionsParam(),
    public var httpErrorHeadersParam: HttpErrorHeadersParam = HttpErrorHeadersParam(),
    public var httpTlsSessionTicketKeysParam: HttpTlsSessionTicketKeysParam = HttpTlsSessionTicketKeysParam(),
)

public data class HttpServiceConfigSslQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslKey = HttpServiceConfigSslKey(),
    public var dwToken: UInt = 0u,
)

public data class HttpServiceConfigSslQueryEx(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslKeyEx = HttpServiceConfigSslKeyEx(),
    public var dwToken: UInt = 0u,
    public var paramType: HttpSslServiceConfigExParamType = 0,
)

public data class HttpServiceConfigSslSet(
    public var keyDesc: HttpServiceConfigSslKey = HttpServiceConfigSslKey(),
    public var paramDesc: HttpServiceConfigSslParam = HttpServiceConfigSslParam(),
)

public data class HttpServiceConfigSslSetEx(
    public var keyDesc: HttpServiceConfigSslKeyEx = HttpServiceConfigSslKeyEx(),
    public var paramDesc: HttpServiceConfigSslParamEx = HttpServiceConfigSslParamEx(),
)

public data class HttpServiceConfigSslSniKey(
    public var ipPort: SockaddrStorage = SockaddrStorage(),
    public var host: Pwstr = null,
)

public data class HttpServiceConfigSslSniQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var dwToken: UInt = 0u,
)

public data class HttpServiceConfigSslSniQueryEx(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var dwToken: UInt = 0u,
    public var paramType: HttpSslServiceConfigExParamType = 0,
)

public data class HttpServiceConfigSslSniSet(
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var paramDesc: HttpServiceConfigSslParam = HttpServiceConfigSslParam(),
)

public data class HttpServiceConfigSslSniSetEx(
    public var keyDesc: HttpServiceConfigSslSniKey = HttpServiceConfigSslSniKey(),
    public var paramDesc: HttpServiceConfigSslParamEx = HttpServiceConfigSslParamEx(),
)

public data class HttpServiceConfigTimeoutSet(
    public var keyDesc: HttpServiceConfigTimeoutKey = 0,
    public var paramDesc: UShort = 0u,
)

public data class HttpServiceConfigUrlaclKey(
    public var pUrlPrefix: Pwstr = null,
)

public data class HttpServiceConfigUrlaclParam(
    public var pStringSecurityDescriptor: Pwstr = null,
)

public data class HttpServiceConfigUrlaclQuery(
    public var queryDesc: HttpServiceConfigQueryType = 0,
    public var keyDesc: HttpServiceConfigUrlaclKey = HttpServiceConfigUrlaclKey(),
    public var dwToken: UInt = 0u,
)

public data class HttpServiceConfigUrlaclSet(
    public var keyDesc: HttpServiceConfigUrlaclKey = HttpServiceConfigUrlaclKey(),
    public var paramDesc: HttpServiceConfigUrlaclParam = HttpServiceConfigUrlaclParam(),
)

public data class HttpSslClientCertInfo(
    public var certFlags: UInt = 0u,
    public var certEncodedSize: UInt = 0u,
    public var pCertEncoded: COpaquePointer? = null,
    public var token: Handle = null,
    public var certDeniedByMapper: Boolean = false,
)

public data class HttpSslInfo(
    public var serverCertKeySize: UShort = 0u,
    public var connectionKeySize: UShort = 0u,
    public var serverCertIssuerSize: UInt = 0u,
    public var serverCertSubjectSize: UInt = 0u,
    public var pServerCertIssuer: Pcstr = null,
    public var pServerCertSubject: Pcstr = null,
    public var pClientCertInfo: HttpSslClientCertInfo? = null,
    public var sslClientCertNegotiated: UInt = 0u,
)

public data class HttpSslProtocolInfo(
    public var protocol: UInt = 0u,
    public var cipherType: UInt = 0u,
    public var cipherStrength: UInt = 0u,
    public var hashType: UInt = 0u,
    public var hashStrength: UInt = 0u,
    public var keyExchangeType: UInt = 0u,
    public var keyExchangeStrength: UInt = 0u,
)

public data class HttpStateInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var state: HttpEnabledState = 0,
)

public data class HttpTimeoutLimitInfo(
    public var flags: HttpPropertyFlags = HttpPropertyFlags(),
    public var entityBody: UShort = 0u,
    public var drainEntityBody: UShort = 0u,
    public var requestQueue: UShort = 0u,
    public var idleConnection: UShort = 0u,
    public var headerWait: UShort = 0u,
    public var minSendRate: UInt = 0u,
)

public data class HttpTlsRestrictionsParam(
    public var restrictionCount: UInt = 0u,
    public var tlsRestrictions: COpaquePointer? = null,
)

public data class HttpTlsSessionTicketKeysParam(
    public var sessionTicketKeyCount: UInt = 0u,
    public var sessionTicketKeys: COpaquePointer? = null,
)

public data class HttpTransportAddress(
    public var pRemoteAddress: Sockaddr? = null,
    public var pLocalAddress: Sockaddr? = null,
)

public data class HttpUnknownHeader(
    public var nameLength: UShort = 0u,
    public var rawValueLength: UShort = 0u,
    public var pName: Pcstr = null,
    public var pRawValue: Pcstr = null,
)

public data class HttpVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
)

public data class HttpWskApiTimings(
    public var connectCount: ULong = 0uL,
    public var connectSum: ULong = 0uL,
    public var disconnectCount: ULong = 0uL,
    public var disconnectSum: ULong = 0uL,
    public var sendCount: ULong = 0uL,
    public var sendSum: ULong = 0uL,
    public var receiveCount: ULong = 0uL,
    public var receiveSum: ULong = 0uL,
    public var releaseCount: ULong = 0uL,
    public var releaseSum: ULong = 0uL,
    public var controlSocketCount: ULong = 0uL,
    public var controlSocketSum: ULong = 0uL,
)
