package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val CacheRangeChunkSize: HTTP_SERVICE_CONFIG_CACHE_KEY = 1

public val CreateRequestQueueExternalIdProperty: HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID = 1

public val CreateRequestQueueMax: HTTP_CREATE_REQUEST_QUEUE_PROPERTY_ID = 2

public val DelegateRequestDelegateUrlProperty: HTTP_DELEGATE_REQUEST_PROPERTY_ID = 1

public val DelegateRequestReservedProperty: HTTP_DELEGATE_REQUEST_PROPERTY_ID = 0

public val ExParamTypeErrorHeaders: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 4

public val ExParamTypeHttp2SettingsLimits: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 1

public val ExParamTypeHttp2Window: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 0

public val ExParamTypeHttpPerformance: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 2

public val ExParamTypeMax: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 6

public val ExParamTypeTlsRestrictions: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 3

public val ExParamTypeTlsSessionTicketKeys: HTTP_SSL_SERVICE_CONFIG_EX_PARAM_TYPE = 5

public val HTTP_AUTH_ENABLE_BASIC: UInt = 1u

public val HTTP_AUTH_ENABLE_DIGEST: UInt = 2u

public val HTTP_AUTH_ENABLE_KERBEROS: UInt = 16u

public val HTTP_AUTH_ENABLE_NEGOTIATE: UInt = 8u

public val HTTP_AUTH_ENABLE_NTLM: UInt = 4u

public val HTTP_AUTH_EX_FLAG_CAPTURE_CREDENTIAL: UInt = 2u

public val HTTP_AUTH_EX_FLAG_ENABLE_KERBEROS_CREDENTIAL_CACHING: UInt = 1u

public val HTTP_CHANNEL_BIND_CLIENT_SERVICE: UInt = 16u

public val HTTP_CHANNEL_BIND_DOTLESS_SERVICE: UInt = 4u

public val HTTP_CHANNEL_BIND_NO_SERVICE_NAME_CHECK: UInt = 2u

public val HTTP_CHANNEL_BIND_PROXY: UInt = 1u

public val HTTP_CHANNEL_BIND_PROXY_COHOSTING: UInt = 32u

public val HTTP_CHANNEL_BIND_SECURE_CHANNEL_TOKEN: UInt = 8u

public val HTTP_CREATE_REQUEST_QUEUE_FLAG_CONTROLLER: UInt = 2u

public val HTTP_CREATE_REQUEST_QUEUE_FLAG_DELEGATION: UInt = 8u

public val HTTP_CREATE_REQUEST_QUEUE_FLAG_OPEN_EXISTING: UInt = 1u

public val HTTP_DEMAND_CBT: UInt = 4u

public val HTTP_FLUSH_RESPONSE_FLAG_RECURSIVE: UInt = 1u

public val HTTP_INITIALIZE_CONFIG: HTTP_INITIALIZE = 2u

public val HTTP_INITIALIZE_SERVER: HTTP_INITIALIZE = 1u

public val HTTP_LOGGING_FLAG_LOCAL_TIME_ROLLOVER: UInt = 1u

public val HTTP_LOGGING_FLAG_LOG_ERRORS_ONLY: UInt = 4u

public val HTTP_LOGGING_FLAG_LOG_SUCCESS_ONLY: UInt = 8u

public val HTTP_LOGGING_FLAG_USE_UTF8_CONVERSION: UInt = 2u

public val HTTP_LOG_FIELD_BYTES_RECV: UInt = 8192u

public val HTTP_LOG_FIELD_BYTES_SENT: UInt = 4096u

public val HTTP_LOG_FIELD_CLIENT_IP: UInt = 4u

public val HTTP_LOG_FIELD_CLIENT_PORT: UInt = 4194304u

public val HTTP_LOG_FIELD_COMPUTER_NAME: UInt = 32u

public val HTTP_LOG_FIELD_COOKIE: UInt = 131072u

public val HTTP_LOG_FIELD_CORRELATION_ID: UInt = 1073741824u

public val HTTP_LOG_FIELD_DATE: UInt = 1u

public val HTTP_LOG_FIELD_FAULT_CODE: UInt = 2147483648u

public val HTTP_LOG_FIELD_HOST: UInt = 1048576u

public val HTTP_LOG_FIELD_METHOD: UInt = 128u

public val HTTP_LOG_FIELD_QUEUE_NAME: UInt = 67108864u

public val HTTP_LOG_FIELD_REASON: UInt = 33554432u

public val HTTP_LOG_FIELD_REFERER: UInt = 262144u

public val HTTP_LOG_FIELD_SERVER_IP: UInt = 64u

public val HTTP_LOG_FIELD_SERVER_PORT: UInt = 32768u

public val HTTP_LOG_FIELD_SITE_ID: UInt = 16777216u

public val HTTP_LOG_FIELD_SITE_NAME: UInt = 16u

public val HTTP_LOG_FIELD_STATUS: UInt = 1024u

public val HTTP_LOG_FIELD_STREAM_ID: UInt = 134217728u

public val HTTP_LOG_FIELD_STREAM_ID_EX: UInt = 268435456u

public val HTTP_LOG_FIELD_SUB_STATUS: UInt = 2097152u

public val HTTP_LOG_FIELD_TIME: UInt = 2u

public val HTTP_LOG_FIELD_TIME_TAKEN: UInt = 16384u

public val HTTP_LOG_FIELD_TRANSPORT_TYPE: UInt = 536870912u

public val HTTP_LOG_FIELD_URI: UInt = 8388608u

public val HTTP_LOG_FIELD_URI_QUERY: UInt = 512u

public val HTTP_LOG_FIELD_URI_STEM: UInt = 256u

public val HTTP_LOG_FIELD_USER_AGENT: UInt = 65536u

public val HTTP_LOG_FIELD_USER_NAME: UInt = 8u

public val HTTP_LOG_FIELD_VERSION: UInt = 524288u

public val HTTP_LOG_FIELD_WIN32_STATUS: UInt = 2048u

public val HTTP_MAX_SERVER_QUEUE_LENGTH: UInt = 2147483647u

public val HTTP_MIN_SERVER_QUEUE_LENGTH: UInt = 1u

public val HTTP_RECEIVE_FULL_CHAIN: UInt = 2u

public val HTTP_RECEIVE_REQUEST_ENTITY_BODY_FLAG_FILL_BUFFER: UInt = 1u

public val HTTP_RECEIVE_REQUEST_FLAG_COPY_BODY: HTTP_RECEIVE_HTTP_REQUEST_FLAGS = 1u

public val HTTP_RECEIVE_REQUEST_FLAG_FLUSH_BODY: HTTP_RECEIVE_HTTP_REQUEST_FLAGS = 2u

public val HTTP_RECEIVE_SECURE_CHANNEL_TOKEN: UInt = 1u

public val HTTP_REQUEST_AUTH_FLAG_TOKEN_FOR_CACHED_CRED: UInt = 1u

public val HTTP_REQUEST_FLAG_HTTP2: UInt = 4u

public val HTTP_REQUEST_FLAG_HTTP3: UInt = 8u

public val HTTP_REQUEST_FLAG_IP_ROUTED: UInt = 2u

public val HTTP_REQUEST_FLAG_MORE_ENTITY_BODY_EXISTS: UInt = 1u

public val HTTP_REQUEST_PROPERTY_SNI_FLAG_NO_SNI: UInt = 2u

public val HTTP_REQUEST_PROPERTY_SNI_FLAG_SNI_USED: UInt = 1u

public val HTTP_REQUEST_PROPERTY_SNI_HOST_MAX_LENGTH: UInt = 255u

public val HTTP_REQUEST_SIZING_INFO_FLAG_FIRST_REQUEST: UInt = 8u

public val HTTP_REQUEST_SIZING_INFO_FLAG_TCP_FAST_OPEN: UInt = 1u

public val HTTP_REQUEST_SIZING_INFO_FLAG_TLS_FALSE_START: UInt = 4u

public val HTTP_REQUEST_SIZING_INFO_FLAG_TLS_SESSION_RESUMPTION: UInt = 2u

public val HTTP_RESPONSE_FLAG_MORE_ENTITY_BODY_EXISTS: UInt = 2u

public val HTTP_RESPONSE_FLAG_MULTIPLE_ENCODINGS_AVAILABLE: UInt = 1u

public val HTTP_RESPONSE_INFO_FLAGS_PRESERVE_ORDER: UInt = 1u

public val HTTP_SEND_RESPONSE_FLAG_BUFFER_DATA: UInt = 4u

public val HTTP_SEND_RESPONSE_FLAG_DISCONNECT: UInt = 1u

public val HTTP_SEND_RESPONSE_FLAG_ENABLE_NAGLING: UInt = 8u

public val HTTP_SEND_RESPONSE_FLAG_GOAWAY: UInt = 256u

public val HTTP_SEND_RESPONSE_FLAG_MORE_DATA: UInt = 2u

public val HTTP_SEND_RESPONSE_FLAG_OPAQUE: UInt = 64u

public val HTTP_SEND_RESPONSE_FLAG_PROCESS_RANGES: UInt = 32u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_HTTP2: UInt = 16u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_LEGACY_TLS: UInt = 1024u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_OCSP_STAPLING: UInt = 128u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_QUIC: UInt = 32u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_SESSION_ID: UInt = 16384u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_TLS12: UInt = 4096u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_DISABLE_TLS13: UInt = 64u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_CLIENT_CORRELATION: UInt = 8192u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_SESSION_TICKET: UInt = 2048u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_ENABLE_TOKEN_BINDING: UInt = 256u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_LOG_EXTENDED_EVENTS: UInt = 512u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_NEGOTIATE_CLIENT_CERT: UInt = 2u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_NO_RAW_FILTER: UInt = 4u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_REJECT: UInt = 8u

public val HTTP_SERVICE_CONFIG_SSL_FLAG_USE_DS_MAPPER: UInt = 1u

public val HTTP_URL_FLAG_REMOVE_ALL: UInt = 1u

public val HTTP_VERSION_CONST: PCWSTR = w("HTTP/1.0")

public val HeaderWaitTimeout: HTTP_SERVICE_CONFIG_TIMEOUT_KEY = 1

public val Http503ResponseVerbosityBasic: HTTP_503_RESPONSE_VERBOSITY = 0

public val Http503ResponseVerbosityFull: HTTP_503_RESPONSE_VERBOSITY = 2

public val Http503ResponseVerbosityLimited: HTTP_503_RESPONSE_VERBOSITY = 1

public val HttpAuthStatusFailure: HTTP_AUTH_STATUS = 2

public val HttpAuthStatusNotAuthenticated: HTTP_AUTH_STATUS = 1

public val HttpAuthStatusSuccess: HTTP_AUTH_STATUS = 0

public val HttpAuthenticationHardeningLegacy: HTTP_AUTHENTICATION_HARDENING_LEVELS = 0

public val HttpAuthenticationHardeningMedium: HTTP_AUTHENTICATION_HARDENING_LEVELS = 1

public val HttpAuthenticationHardeningStrict: HTTP_AUTHENTICATION_HARDENING_LEVELS = 2

public val HttpCachePolicyMaximum: HTTP_CACHE_POLICY_TYPE = 3

public val HttpCachePolicyNocache: HTTP_CACHE_POLICY_TYPE = 0

public val HttpCachePolicyTimeToLive: HTTP_CACHE_POLICY_TYPE = 2

public val HttpCachePolicyUserInvalidates: HTTP_CACHE_POLICY_TYPE = 1

public val HttpDataChunkFromFileHandle: HTTP_DATA_CHUNK_TYPE = 1

public val HttpDataChunkFromFragmentCache: HTTP_DATA_CHUNK_TYPE = 2

public val HttpDataChunkFromFragmentCacheEx: HTTP_DATA_CHUNK_TYPE = 3

public val HttpDataChunkFromMemory: HTTP_DATA_CHUNK_TYPE = 0

public val HttpDataChunkMaximum: HTTP_DATA_CHUNK_TYPE = 5

public val HttpDataChunkTrailers: HTTP_DATA_CHUNK_TYPE = 4

public val HttpEnabledStateActive: HTTP_ENABLED_STATE = 0

public val HttpEnabledStateInactive: HTTP_ENABLED_STATE = 1

public val HttpFeatureApiTimings: HTTP_FEATURE_ID = 2

public val HttpFeatureDelegateEx: HTTP_FEATURE_ID = 3

public val HttpFeatureHttp3: HTTP_FEATURE_ID = 4

public val HttpFeatureLast: HTTP_FEATURE_ID = 5

public val HttpFeatureResponseTrailers: HTTP_FEATURE_ID = 1

public val HttpFeatureUnknown: HTTP_FEATURE_ID = 0

public val HttpFeaturemax: HTTP_FEATURE_ID = -1

public val HttpHeaderAccept: HTTP_HEADER_ID = 20

public val HttpHeaderAcceptCharset: HTTP_HEADER_ID = 21

public val HttpHeaderAcceptEncoding: HTTP_HEADER_ID = 22

public val HttpHeaderAcceptLanguage: HTTP_HEADER_ID = 23

public val HttpHeaderAcceptRanges: HTTP_HEADER_ID = 20

public val HttpHeaderAge: HTTP_HEADER_ID = 21

public val HttpHeaderAllow: HTTP_HEADER_ID = 10

public val HttpHeaderAuthorization: HTTP_HEADER_ID = 24

public val HttpHeaderCacheControl: HTTP_HEADER_ID = 0

public val HttpHeaderConnection: HTTP_HEADER_ID = 1

public val HttpHeaderContentEncoding: HTTP_HEADER_ID = 13

public val HttpHeaderContentLanguage: HTTP_HEADER_ID = 14

public val HttpHeaderContentLength: HTTP_HEADER_ID = 11

public val HttpHeaderContentLocation: HTTP_HEADER_ID = 15

public val HttpHeaderContentMd5: HTTP_HEADER_ID = 16

public val HttpHeaderContentRange: HTTP_HEADER_ID = 17

public val HttpHeaderContentType: HTTP_HEADER_ID = 12

public val HttpHeaderCookie: HTTP_HEADER_ID = 25

public val HttpHeaderDate: HTTP_HEADER_ID = 2

public val HttpHeaderEtag: HTTP_HEADER_ID = 22

public val HttpHeaderExpect: HTTP_HEADER_ID = 26

public val HttpHeaderExpires: HTTP_HEADER_ID = 18

public val HttpHeaderFrom: HTTP_HEADER_ID = 27

public val HttpHeaderHost: HTTP_HEADER_ID = 28

public val HttpHeaderIfMatch: HTTP_HEADER_ID = 29

public val HttpHeaderIfModifiedSince: HTTP_HEADER_ID = 30

public val HttpHeaderIfNoneMatch: HTTP_HEADER_ID = 31

public val HttpHeaderIfRange: HTTP_HEADER_ID = 32

public val HttpHeaderIfUnmodifiedSince: HTTP_HEADER_ID = 33

public val HttpHeaderKeepAlive: HTTP_HEADER_ID = 3

public val HttpHeaderLastModified: HTTP_HEADER_ID = 19

public val HttpHeaderLocation: HTTP_HEADER_ID = 23

public val HttpHeaderMaxForwards: HTTP_HEADER_ID = 34

public val HttpHeaderMaximum: HTTP_HEADER_ID = 41

public val HttpHeaderPragma: HTTP_HEADER_ID = 4

public val HttpHeaderProxyAuthenticate: HTTP_HEADER_ID = 24

public val HttpHeaderProxyAuthorization: HTTP_HEADER_ID = 35

public val HttpHeaderRange: HTTP_HEADER_ID = 37

public val HttpHeaderReferer: HTTP_HEADER_ID = 36

public val HttpHeaderRequestMaximum: HTTP_HEADER_ID = 41

public val HttpHeaderResponseMaximum: HTTP_HEADER_ID = 30

public val HttpHeaderRetryAfter: HTTP_HEADER_ID = 25

public val HttpHeaderServer: HTTP_HEADER_ID = 26

public val HttpHeaderSetCookie: HTTP_HEADER_ID = 27

public val HttpHeaderTe: HTTP_HEADER_ID = 38

public val HttpHeaderTrailer: HTTP_HEADER_ID = 5

public val HttpHeaderTransferEncoding: HTTP_HEADER_ID = 6

public val HttpHeaderTranslate: HTTP_HEADER_ID = 39

public val HttpHeaderUpgrade: HTTP_HEADER_ID = 7

public val HttpHeaderUserAgent: HTTP_HEADER_ID = 40

public val HttpHeaderVary: HTTP_HEADER_ID = 28

public val HttpHeaderVia: HTTP_HEADER_ID = 8

public val HttpHeaderWarning: HTTP_HEADER_ID = 9

public val HttpHeaderWwwAuthenticate: HTTP_HEADER_ID = 29

public val HttpLogDataTypeFields: HTTP_LOG_DATA_TYPE = 0

public val HttpLoggingRolloverDaily: HTTP_LOGGING_ROLLOVER_TYPE = 1

public val HttpLoggingRolloverHourly: HTTP_LOGGING_ROLLOVER_TYPE = 4

public val HttpLoggingRolloverMonthly: HTTP_LOGGING_ROLLOVER_TYPE = 3

public val HttpLoggingRolloverSize: HTTP_LOGGING_ROLLOVER_TYPE = 0

public val HttpLoggingRolloverWeekly: HTTP_LOGGING_ROLLOVER_TYPE = 2

public val HttpLoggingTypeIIS: HTTP_LOGGING_TYPE = 1

public val HttpLoggingTypeNCSA: HTTP_LOGGING_TYPE = 2

public val HttpLoggingTypeRaw: HTTP_LOGGING_TYPE = 3

public val HttpLoggingTypeW3C: HTTP_LOGGING_TYPE = 0

public val HttpNone: HTTP_SERVICE_CONFIG_SETTING_KEY = 0

public val HttpProtectionLevelEdgeRestricted: HTTP_PROTECTION_LEVEL_TYPE = 1

public val HttpProtectionLevelRestricted: HTTP_PROTECTION_LEVEL_TYPE = 2

public val HttpProtectionLevelUnrestricted: HTTP_PROTECTION_LEVEL_TYPE = 0

public val HttpQosSettingTypeBandwidth: HTTP_QOS_SETTING_TYPE = 0

public val HttpQosSettingTypeConnectionLimit: HTTP_QOS_SETTING_TYPE = 1

public val HttpQosSettingTypeFlowRate: HTTP_QOS_SETTING_TYPE = 2

public val HttpRequestAuthTypeBasic: HTTP_REQUEST_AUTH_TYPE = 1

public val HttpRequestAuthTypeDigest: HTTP_REQUEST_AUTH_TYPE = 2

public val HttpRequestAuthTypeKerberos: HTTP_REQUEST_AUTH_TYPE = 5

public val HttpRequestAuthTypeNTLM: HTTP_REQUEST_AUTH_TYPE = 3

public val HttpRequestAuthTypeNegotiate: HTTP_REQUEST_AUTH_TYPE = 4

public val HttpRequestAuthTypeNone: HTTP_REQUEST_AUTH_TYPE = 0

public val HttpRequestInfoTypeAuth: HTTP_REQUEST_INFO_TYPE = 0

public val HttpRequestInfoTypeChannelBind: HTTP_REQUEST_INFO_TYPE = 1

public val HttpRequestInfoTypeQuicStats: HTTP_REQUEST_INFO_TYPE = 8

public val HttpRequestInfoTypeRequestSizing: HTTP_REQUEST_INFO_TYPE = 7

public val HttpRequestInfoTypeRequestTiming: HTTP_REQUEST_INFO_TYPE = 5

public val HttpRequestInfoTypeSslProtocol: HTTP_REQUEST_INFO_TYPE = 2

public val HttpRequestInfoTypeSslTokenBinding: HTTP_REQUEST_INFO_TYPE = 4

public val HttpRequestInfoTypeSslTokenBindingDraft: HTTP_REQUEST_INFO_TYPE = 3

public val HttpRequestInfoTypeTcpInfoV0: HTTP_REQUEST_INFO_TYPE = 6

public val HttpRequestInfoTypeTcpInfoV1: HTTP_REQUEST_INFO_TYPE = 9

public val HttpRequestPropertyIsb: HTTP_REQUEST_PROPERTY = 0

public val HttpRequestPropertyQuicApiTimings: HTTP_REQUEST_PROPERTY = 7

public val HttpRequestPropertyQuicStats: HTTP_REQUEST_PROPERTY = 2

public val HttpRequestPropertySni: HTTP_REQUEST_PROPERTY = 4

public val HttpRequestPropertyStreamError: HTTP_REQUEST_PROPERTY = 5

public val HttpRequestPropertyTcpInfoV0: HTTP_REQUEST_PROPERTY = 1

public val HttpRequestPropertyTcpInfoV1: HTTP_REQUEST_PROPERTY = 3

public val HttpRequestPropertyWskApiTimings: HTTP_REQUEST_PROPERTY = 6

public val HttpRequestSizingTypeHeaders: HTTP_REQUEST_SIZING_TYPE = 4

public val HttpRequestSizingTypeMax: HTTP_REQUEST_SIZING_TYPE = 5

public val HttpRequestSizingTypeTlsHandshakeLeg1ClientData: HTTP_REQUEST_SIZING_TYPE = 0

public val HttpRequestSizingTypeTlsHandshakeLeg1ServerData: HTTP_REQUEST_SIZING_TYPE = 1

public val HttpRequestSizingTypeTlsHandshakeLeg2ClientData: HTTP_REQUEST_SIZING_TYPE = 2

public val HttpRequestSizingTypeTlsHandshakeLeg2ServerData: HTTP_REQUEST_SIZING_TYPE = 3

public val HttpRequestTimingTypeConnectionStart: HTTP_REQUEST_TIMING_TYPE = 0

public val HttpRequestTimingTypeDataStart: HTTP_REQUEST_TIMING_TYPE = 1

public val HttpRequestTimingTypeHttp2HeaderDecodeEnd: HTTP_REQUEST_TIMING_TYPE = 14

public val HttpRequestTimingTypeHttp2HeaderDecodeStart: HTTP_REQUEST_TIMING_TYPE = 13

public val HttpRequestTimingTypeHttp2StreamStart: HTTP_REQUEST_TIMING_TYPE = 12

public val HttpRequestTimingTypeHttp3HeaderDecodeEnd: HTTP_REQUEST_TIMING_TYPE = 29

public val HttpRequestTimingTypeHttp3HeaderDecodeStart: HTTP_REQUEST_TIMING_TYPE = 28

public val HttpRequestTimingTypeHttp3StreamStart: HTTP_REQUEST_TIMING_TYPE = 27

public val HttpRequestTimingTypeMax: HTTP_REQUEST_TIMING_TYPE = 30

public val HttpRequestTimingTypeRequestDeliveredForDelegation: HTTP_REQUEST_TIMING_TYPE = 23

public val HttpRequestTimingTypeRequestDeliveredForIO: HTTP_REQUEST_TIMING_TYPE = 26

public val HttpRequestTimingTypeRequestDeliveredForInspection: HTTP_REQUEST_TIMING_TYPE = 20

public val HttpRequestTimingTypeRequestHeaderParseEnd: HTTP_REQUEST_TIMING_TYPE = 16

public val HttpRequestTimingTypeRequestHeaderParseStart: HTTP_REQUEST_TIMING_TYPE = 15

public val HttpRequestTimingTypeRequestQueuedForDelegation: HTTP_REQUEST_TIMING_TYPE = 22

public val HttpRequestTimingTypeRequestQueuedForIO: HTTP_REQUEST_TIMING_TYPE = 25

public val HttpRequestTimingTypeRequestQueuedForInspection: HTTP_REQUEST_TIMING_TYPE = 19

public val HttpRequestTimingTypeRequestReturnedAfterDelegation: HTTP_REQUEST_TIMING_TYPE = 24

public val HttpRequestTimingTypeRequestReturnedAfterInspection: HTTP_REQUEST_TIMING_TYPE = 21

public val HttpRequestTimingTypeRequestRoutingEnd: HTTP_REQUEST_TIMING_TYPE = 18

public val HttpRequestTimingTypeRequestRoutingStart: HTTP_REQUEST_TIMING_TYPE = 17

public val HttpRequestTimingTypeTlsAttributesQueryEnd: HTTP_REQUEST_TIMING_TYPE = 9

public val HttpRequestTimingTypeTlsAttributesQueryStart: HTTP_REQUEST_TIMING_TYPE = 8

public val HttpRequestTimingTypeTlsCertificateLoadEnd: HTTP_REQUEST_TIMING_TYPE = 3

public val HttpRequestTimingTypeTlsCertificateLoadStart: HTTP_REQUEST_TIMING_TYPE = 2

public val HttpRequestTimingTypeTlsClientCertQueryEnd: HTTP_REQUEST_TIMING_TYPE = 11

public val HttpRequestTimingTypeTlsClientCertQueryStart: HTTP_REQUEST_TIMING_TYPE = 10

public val HttpRequestTimingTypeTlsHandshakeLeg1End: HTTP_REQUEST_TIMING_TYPE = 5

public val HttpRequestTimingTypeTlsHandshakeLeg1Start: HTTP_REQUEST_TIMING_TYPE = 4

public val HttpRequestTimingTypeTlsHandshakeLeg2End: HTTP_REQUEST_TIMING_TYPE = 7

public val HttpRequestTimingTypeTlsHandshakeLeg2Start: HTTP_REQUEST_TIMING_TYPE = 6

public val HttpResponseInfoTypeAuthenticationProperty: HTTP_RESPONSE_INFO_TYPE = 1

public val HttpResponseInfoTypeChannelBind: HTTP_RESPONSE_INFO_TYPE = 3

public val HttpResponseInfoTypeMultipleKnownHeaders: HTTP_RESPONSE_INFO_TYPE = 0

public val HttpResponseInfoTypeQoSProperty: HTTP_RESPONSE_INFO_TYPE = 2

public val HttpSchemeHttp: HTTP_SCHEME = 0

public val HttpSchemeHttps: HTTP_SCHEME = 1

public val HttpSchemeMaximum: HTTP_SCHEME = 2

public val HttpServer503VerbosityProperty: HTTP_SERVER_PROPERTY = 6

public val HttpServerAuthenticationProperty: HTTP_SERVER_PROPERTY = 0

public val HttpServerBindingProperty: HTTP_SERVER_PROPERTY = 7

public val HttpServerChannelBindProperty: HTTP_SERVER_PROPERTY = 10

public val HttpServerDelegationProperty: HTTP_SERVER_PROPERTY = 16

public val HttpServerExtendedAuthenticationProperty: HTTP_SERVER_PROPERTY = 8

public val HttpServerListenEndpointProperty: HTTP_SERVER_PROPERTY = 9

public val HttpServerLoggingProperty: HTTP_SERVER_PROPERTY = 1

public val HttpServerProtectionLevelProperty: HTTP_SERVER_PROPERTY = 11

public val HttpServerQosProperty: HTTP_SERVER_PROPERTY = 2

public val HttpServerQueueLengthProperty: HTTP_SERVER_PROPERTY = 4

public val HttpServerStateProperty: HTTP_SERVER_PROPERTY = 5

public val HttpServerTimeoutsProperty: HTTP_SERVER_PROPERTY = 3

public val HttpServiceBindingTypeA: HTTP_SERVICE_BINDING_TYPE = 2

public val HttpServiceBindingTypeNone: HTTP_SERVICE_BINDING_TYPE = 0

public val HttpServiceBindingTypeW: HTTP_SERVICE_BINDING_TYPE = 1

public val HttpServiceConfigCache: HTTP_SERVICE_CONFIG_ID = 4

public val HttpServiceConfigIPListenList: HTTP_SERVICE_CONFIG_ID = 0

public val HttpServiceConfigMax: HTTP_SERVICE_CONFIG_ID = 13

public val HttpServiceConfigQueryExact: HTTP_SERVICE_CONFIG_QUERY_TYPE = 0

public val HttpServiceConfigQueryMax: HTTP_SERVICE_CONFIG_QUERY_TYPE = 2

public val HttpServiceConfigQueryNext: HTTP_SERVICE_CONFIG_QUERY_TYPE = 1

public val HttpServiceConfigSSLCertInfo: HTTP_SERVICE_CONFIG_ID = 1

public val HttpServiceConfigSetting: HTTP_SERVICE_CONFIG_ID = 7

public val HttpServiceConfigSslCcsCertInfo: HTTP_SERVICE_CONFIG_ID = 6

public val HttpServiceConfigSslCcsCertInfoEx: HTTP_SERVICE_CONFIG_ID = 10

public val HttpServiceConfigSslCertInfoEx: HTTP_SERVICE_CONFIG_ID = 8

public val HttpServiceConfigSslScopedCcsCertInfo: HTTP_SERVICE_CONFIG_ID = 11

public val HttpServiceConfigSslScopedCcsCertInfoEx: HTTP_SERVICE_CONFIG_ID = 12

public val HttpServiceConfigSslSniCertInfo: HTTP_SERVICE_CONFIG_ID = 5

public val HttpServiceConfigSslSniCertInfoEx: HTTP_SERVICE_CONFIG_ID = 9

public val HttpServiceConfigTimeout: HTTP_SERVICE_CONFIG_ID = 3

public val HttpServiceConfigUrlAclInfo: HTTP_SERVICE_CONFIG_ID = 2

public val HttpTlsThrottle: HTTP_SERVICE_CONFIG_SETTING_KEY = 1

public val HttpVerbCONNECT: HTTP_VERB = 10

public val HttpVerbCOPY: HTTP_VERB = 13

public val HttpVerbDELETE: HTTP_VERB = 8

public val HttpVerbGET: HTTP_VERB = 4

public val HttpVerbHEAD: HTTP_VERB = 5

public val HttpVerbInvalid: HTTP_VERB = 2

public val HttpVerbLOCK: HTTP_VERB = 17

public val HttpVerbMKCOL: HTTP_VERB = 16

public val HttpVerbMOVE: HTTP_VERB = 12

public val HttpVerbMaximum: HTTP_VERB = 20

public val HttpVerbOPTIONS: HTTP_VERB = 3

public val HttpVerbPOST: HTTP_VERB = 6

public val HttpVerbPROPFIND: HTTP_VERB = 14

public val HttpVerbPROPPATCH: HTTP_VERB = 15

public val HttpVerbPUT: HTTP_VERB = 7

public val HttpVerbSEARCH: HTTP_VERB = 19

public val HttpVerbTRACE: HTTP_VERB = 9

public val HttpVerbTRACK: HTTP_VERB = 11

public val HttpVerbUNLOCK: HTTP_VERB = 18

public val HttpVerbUnknown: HTTP_VERB = 1

public val HttpVerbUnparsed: HTTP_VERB = 0

public val IdleConnectionTimeout: HTTP_SERVICE_CONFIG_TIMEOUT_KEY = 0

public val MaxCacheResponseSize: HTTP_SERVICE_CONFIG_CACHE_KEY = 0

public val PerformanceParamAggressiveICW: HTTP_PERFORMANCE_PARAM_TYPE = 1

public val PerformanceParamDecryptOnSspiThread: HTTP_PERFORMANCE_PARAM_TYPE = 5

public val PerformanceParamMax: HTTP_PERFORMANCE_PARAM_TYPE = 6

public val PerformanceParamMaxConcurrentClientStreams: HTTP_PERFORMANCE_PARAM_TYPE = 3

public val PerformanceParamMaxReceiveBufferSize: HTTP_PERFORMANCE_PARAM_TYPE = 4

public val PerformanceParamMaxSendBufferSize: HTTP_PERFORMANCE_PARAM_TYPE = 2

public val PerformanceParamSendBufferingFlags: HTTP_PERFORMANCE_PARAM_TYPE = 0
