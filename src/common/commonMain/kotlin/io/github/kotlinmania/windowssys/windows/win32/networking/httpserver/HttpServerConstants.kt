package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val CACHE_RANGE_CHUNK_SIZE: HttpServiceConfigCacheKey = 1

public val CREATE_REQUEST_QUEUE_EXTERNAL_ID_PROPERTY: HttpCreateRequestQueuePropertyId = 1

public val CREATE_REQUEST_QUEUE_MAX: HttpCreateRequestQueuePropertyId = 2

public val DELEGATE_REQUEST_DELEGATE_URL_PROPERTY: HttpDelegateRequestPropertyId = 1

public val DELEGATE_REQUEST_RESERVED_PROPERTY: HttpDelegateRequestPropertyId = 0

public val EX_PARAM_TYPE_ERROR_HEADERS: HttpSslServiceConfigExParamType = 4

public val EX_PARAM_TYPE_HTTP2SETTINGS_LIMITS: HttpSslServiceConfigExParamType = 1

public val EX_PARAM_TYPE_HTTP2WINDOW: HttpSslServiceConfigExParamType = 0

public val EX_PARAM_TYPE_HTTP_PERFORMANCE: HttpSslServiceConfigExParamType = 2

public val EX_PARAM_TYPE_MAX: HttpSslServiceConfigExParamType = 6

public val EX_PARAM_TYPE_TLS_RESTRICTIONS: HttpSslServiceConfigExParamType = 3

public val EX_PARAM_TYPE_TLS_SESSION_TICKET_KEYS: HttpSslServiceConfigExParamType = 5

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

public val HTTP_INITIALIZE_CONFIG: HttpInitialize = 2u

public val HTTP_INITIALIZE_SERVER: HttpInitialize = 1u

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

public val HTTP_RECEIVE_REQUEST_FLAG_COPY_BODY: HttpReceiveHttpRequestFlags = 1u

public val HTTP_RECEIVE_REQUEST_FLAG_FLUSH_BODY: HttpReceiveHttpRequestFlags = 2u

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

public val HTTP_VERSION: Pcwstr = w("HTTP/1.0")

public val HEADER_WAIT_TIMEOUT: HttpServiceConfigTimeoutKey = 1

public val HTTP503RESPONSE_VERBOSITY_BASIC: Http503ResponseVerbosity = 0

public val HTTP503RESPONSE_VERBOSITY_FULL: Http503ResponseVerbosity = 2

public val HTTP503RESPONSE_VERBOSITY_LIMITED: Http503ResponseVerbosity = 1

public val HTTP_AUTH_STATUS_FAILURE: HttpAuthStatus = 2

public val HTTP_AUTH_STATUS_NOT_AUTHENTICATED: HttpAuthStatus = 1

public val HTTP_AUTH_STATUS_SUCCESS: HttpAuthStatus = 0

public val HTTP_AUTHENTICATION_HARDENING_LEGACY: HttpAuthenticationHardeningLevels = 0

public val HTTP_AUTHENTICATION_HARDENING_MEDIUM: HttpAuthenticationHardeningLevels = 1

public val HTTP_AUTHENTICATION_HARDENING_STRICT: HttpAuthenticationHardeningLevels = 2

public val HTTP_CACHE_POLICY_MAXIMUM: HttpCachePolicyType = 3

public val HTTP_CACHE_POLICY_NOCACHE: HttpCachePolicyType = 0

public val HTTP_CACHE_POLICY_TIME_TO_LIVE: HttpCachePolicyType = 2

public val HTTP_CACHE_POLICY_USER_INVALIDATES: HttpCachePolicyType = 1

public val HTTP_DATA_CHUNK_FROM_FILE_HANDLE: HttpDataChunkType = 1

public val HTTP_DATA_CHUNK_FROM_FRAGMENT_CACHE: HttpDataChunkType = 2

public val HTTP_DATA_CHUNK_FROM_FRAGMENT_CACHE_EX: HttpDataChunkType = 3

public val HTTP_DATA_CHUNK_FROM_MEMORY: HttpDataChunkType = 0

public val HTTP_DATA_CHUNK_MAXIMUM: HttpDataChunkType = 5

public val HTTP_DATA_CHUNK_TRAILERS: HttpDataChunkType = 4

public val HTTP_ENABLED_STATE_ACTIVE: HttpEnabledState = 0

public val HTTP_ENABLED_STATE_INACTIVE: HttpEnabledState = 1

public val HTTP_FEATURE_API_TIMINGS: HttpFeatureId = 2

public val HTTP_FEATURE_DELEGATE_EX: HttpFeatureId = 3

public val HTTP_FEATURE_HTTP3: HttpFeatureId = 4

public val HTTP_FEATURE_LAST: HttpFeatureId = 5

public val HTTP_FEATURE_RESPONSE_TRAILERS: HttpFeatureId = 1

public val HTTP_FEATURE_UNKNOWN: HttpFeatureId = 0

public val HTTP_FEATUREMAX: HttpFeatureId = -1

public val HTTP_HEADER_ACCEPT: HttpHeaderId = 20

public val HTTP_HEADER_ACCEPT_CHARSET: HttpHeaderId = 21

public val HTTP_HEADER_ACCEPT_ENCODING: HttpHeaderId = 22

public val HTTP_HEADER_ACCEPT_LANGUAGE: HttpHeaderId = 23

public val HTTP_HEADER_ACCEPT_RANGES: HttpHeaderId = 20

public val HTTP_HEADER_AGE: HttpHeaderId = 21

public val HTTP_HEADER_ALLOW: HttpHeaderId = 10

public val HTTP_HEADER_AUTHORIZATION: HttpHeaderId = 24

public val HTTP_HEADER_CACHE_CONTROL: HttpHeaderId = 0

public val HTTP_HEADER_CONNECTION: HttpHeaderId = 1

public val HTTP_HEADER_CONTENT_ENCODING: HttpHeaderId = 13

public val HTTP_HEADER_CONTENT_LANGUAGE: HttpHeaderId = 14

public val HTTP_HEADER_CONTENT_LENGTH: HttpHeaderId = 11

public val HTTP_HEADER_CONTENT_LOCATION: HttpHeaderId = 15

public val HTTP_HEADER_CONTENT_MD5: HttpHeaderId = 16

public val HTTP_HEADER_CONTENT_RANGE: HttpHeaderId = 17

public val HTTP_HEADER_CONTENT_TYPE: HttpHeaderId = 12

public val HTTP_HEADER_COOKIE: HttpHeaderId = 25

public val HTTP_HEADER_DATE: HttpHeaderId = 2

public val HTTP_HEADER_ETAG: HttpHeaderId = 22

public val HTTP_HEADER_EXPECT: HttpHeaderId = 26

public val HTTP_HEADER_EXPIRES: HttpHeaderId = 18

public val HTTP_HEADER_FROM: HttpHeaderId = 27

public val HTTP_HEADER_HOST: HttpHeaderId = 28

public val HTTP_HEADER_IF_MATCH: HttpHeaderId = 29

public val HTTP_HEADER_IF_MODIFIED_SINCE: HttpHeaderId = 30

public val HTTP_HEADER_IF_NONE_MATCH: HttpHeaderId = 31

public val HTTP_HEADER_IF_RANGE: HttpHeaderId = 32

public val HTTP_HEADER_IF_UNMODIFIED_SINCE: HttpHeaderId = 33

public val HTTP_HEADER_KEEP_ALIVE: HttpHeaderId = 3

public val HTTP_HEADER_LAST_MODIFIED: HttpHeaderId = 19

public val HTTP_HEADER_LOCATION: HttpHeaderId = 23

public val HTTP_HEADER_MAX_FORWARDS: HttpHeaderId = 34

public val HTTP_HEADER_MAXIMUM: HttpHeaderId = 41

public val HTTP_HEADER_PRAGMA: HttpHeaderId = 4

public val HTTP_HEADER_PROXY_AUTHENTICATE: HttpHeaderId = 24

public val HTTP_HEADER_PROXY_AUTHORIZATION: HttpHeaderId = 35

public val HTTP_HEADER_RANGE: HttpHeaderId = 37

public val HTTP_HEADER_REFERER: HttpHeaderId = 36

public val HTTP_HEADER_REQUEST_MAXIMUM: HttpHeaderId = 41

public val HTTP_HEADER_RESPONSE_MAXIMUM: HttpHeaderId = 30

public val HTTP_HEADER_RETRY_AFTER: HttpHeaderId = 25

public val HTTP_HEADER_SERVER: HttpHeaderId = 26

public val HTTP_HEADER_SET_COOKIE: HttpHeaderId = 27

public val HTTP_HEADER_TE: HttpHeaderId = 38

public val HTTP_HEADER_TRAILER: HttpHeaderId = 5

public val HTTP_HEADER_TRANSFER_ENCODING: HttpHeaderId = 6

public val HTTP_HEADER_TRANSLATE: HttpHeaderId = 39

public val HTTP_HEADER_UPGRADE: HttpHeaderId = 7

public val HTTP_HEADER_USER_AGENT: HttpHeaderId = 40

public val HTTP_HEADER_VARY: HttpHeaderId = 28

public val HTTP_HEADER_VIA: HttpHeaderId = 8

public val HTTP_HEADER_WARNING: HttpHeaderId = 9

public val HTTP_HEADER_WWW_AUTHENTICATE: HttpHeaderId = 29

public val HTTP_LOG_DATA_TYPE_FIELDS: HttpLogDataType = 0

public val HTTP_LOGGING_ROLLOVER_DAILY: HttpLoggingRolloverType = 1

public val HTTP_LOGGING_ROLLOVER_HOURLY: HttpLoggingRolloverType = 4

public val HTTP_LOGGING_ROLLOVER_MONTHLY: HttpLoggingRolloverType = 3

public val HTTP_LOGGING_ROLLOVER_SIZE: HttpLoggingRolloverType = 0

public val HTTP_LOGGING_ROLLOVER_WEEKLY: HttpLoggingRolloverType = 2

public val HTTP_LOGGING_TYPE_IIS: HttpLoggingType = 1

public val HTTP_LOGGING_TYPE_NCSA: HttpLoggingType = 2

public val HTTP_LOGGING_TYPE_RAW: HttpLoggingType = 3

public val HTTP_LOGGING_TYPE_W3C: HttpLoggingType = 0

public val HTTP_NONE: HttpServiceConfigSettingKey = 0

public val HTTP_PROTECTION_LEVEL_EDGE_RESTRICTED: HttpProtectionLevelType = 1

public val HTTP_PROTECTION_LEVEL_RESTRICTED: HttpProtectionLevelType = 2

public val HTTP_PROTECTION_LEVEL_UNRESTRICTED: HttpProtectionLevelType = 0

public val HTTP_QOS_SETTING_TYPE_BANDWIDTH: HttpQosSettingType = 0

public val HTTP_QOS_SETTING_TYPE_CONNECTION_LIMIT: HttpQosSettingType = 1

public val HTTP_QOS_SETTING_TYPE_FLOW_RATE: HttpQosSettingType = 2

public val HTTP_REQUEST_AUTH_TYPE_BASIC: HttpRequestAuthType = 1

public val HTTP_REQUEST_AUTH_TYPE_DIGEST: HttpRequestAuthType = 2

public val HTTP_REQUEST_AUTH_TYPE_KERBEROS: HttpRequestAuthType = 5

public val HTTP_REQUEST_AUTH_TYPE_NTLM: HttpRequestAuthType = 3

public val HTTP_REQUEST_AUTH_TYPE_NEGOTIATE: HttpRequestAuthType = 4

public val HTTP_REQUEST_AUTH_TYPE_NONE: HttpRequestAuthType = 0

public val HTTP_REQUEST_INFO_TYPE_AUTH: HttpRequestInfoType = 0

public val HTTP_REQUEST_INFO_TYPE_CHANNEL_BIND: HttpRequestInfoType = 1

public val HTTP_REQUEST_INFO_TYPE_QUIC_STATS: HttpRequestInfoType = 8

public val HTTP_REQUEST_INFO_TYPE_REQUEST_SIZING: HttpRequestInfoType = 7

public val HTTP_REQUEST_INFO_TYPE_REQUEST_TIMING: HttpRequestInfoType = 5

public val HTTP_REQUEST_INFO_TYPE_SSL_PROTOCOL: HttpRequestInfoType = 2

public val HTTP_REQUEST_INFO_TYPE_SSL_TOKEN_BINDING: HttpRequestInfoType = 4

public val HTTP_REQUEST_INFO_TYPE_SSL_TOKEN_BINDING_DRAFT: HttpRequestInfoType = 3

public val HTTP_REQUEST_INFO_TYPE_TCP_INFO_V0: HttpRequestInfoType = 6

public val HTTP_REQUEST_INFO_TYPE_TCP_INFO_V1: HttpRequestInfoType = 9

public val HTTP_REQUEST_PROPERTY_ISB: HttpRequestProperty = 0

public val HTTP_REQUEST_PROPERTY_QUIC_API_TIMINGS: HttpRequestProperty = 7

public val HTTP_REQUEST_PROPERTY_QUIC_STATS: HttpRequestProperty = 2

public val HTTP_REQUEST_PROPERTY_SNI: HttpRequestProperty = 4

public val HTTP_REQUEST_PROPERTY_STREAM_ERROR: HttpRequestProperty = 5

public val HTTP_REQUEST_PROPERTY_TCP_INFO_V0: HttpRequestProperty = 1

public val HTTP_REQUEST_PROPERTY_TCP_INFO_V1: HttpRequestProperty = 3

public val HTTP_REQUEST_PROPERTY_WSK_API_TIMINGS: HttpRequestProperty = 6

public val HTTP_REQUEST_SIZING_TYPE_HEADERS: HttpRequestSizingType = 4

public val HTTP_REQUEST_SIZING_TYPE_MAX: HttpRequestSizingType = 5

public val HTTP_REQUEST_SIZING_TYPE_TLS_HANDSHAKE_LEG1CLIENT_DATA: HttpRequestSizingType = 0

public val HTTP_REQUEST_SIZING_TYPE_TLS_HANDSHAKE_LEG1SERVER_DATA: HttpRequestSizingType = 1

public val HTTP_REQUEST_SIZING_TYPE_TLS_HANDSHAKE_LEG2CLIENT_DATA: HttpRequestSizingType = 2

public val HTTP_REQUEST_SIZING_TYPE_TLS_HANDSHAKE_LEG2SERVER_DATA: HttpRequestSizingType = 3

public val HTTP_REQUEST_TIMING_TYPE_CONNECTION_START: HttpRequestTimingType = 0

public val HTTP_REQUEST_TIMING_TYPE_DATA_START: HttpRequestTimingType = 1

public val HTTP_REQUEST_TIMING_TYPE_HTTP2HEADER_DECODE_END: HttpRequestTimingType = 14

public val HTTP_REQUEST_TIMING_TYPE_HTTP2HEADER_DECODE_START: HttpRequestTimingType = 13

public val HTTP_REQUEST_TIMING_TYPE_HTTP2STREAM_START: HttpRequestTimingType = 12

public val HTTP_REQUEST_TIMING_TYPE_HTTP3HEADER_DECODE_END: HttpRequestTimingType = 29

public val HTTP_REQUEST_TIMING_TYPE_HTTP3HEADER_DECODE_START: HttpRequestTimingType = 28

public val HTTP_REQUEST_TIMING_TYPE_HTTP3STREAM_START: HttpRequestTimingType = 27

public val HTTP_REQUEST_TIMING_TYPE_MAX: HttpRequestTimingType = 30

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_DELIVERED_FOR_DELEGATION: HttpRequestTimingType = 23

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_DELIVERED_FOR_IO: HttpRequestTimingType = 26

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_DELIVERED_FOR_INSPECTION: HttpRequestTimingType = 20

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_HEADER_PARSE_END: HttpRequestTimingType = 16

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_HEADER_PARSE_START: HttpRequestTimingType = 15

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_QUEUED_FOR_DELEGATION: HttpRequestTimingType = 22

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_QUEUED_FOR_IO: HttpRequestTimingType = 25

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_QUEUED_FOR_INSPECTION: HttpRequestTimingType = 19

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_RETURNED_AFTER_DELEGATION: HttpRequestTimingType = 24

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_RETURNED_AFTER_INSPECTION: HttpRequestTimingType = 21

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_ROUTING_END: HttpRequestTimingType = 18

public val HTTP_REQUEST_TIMING_TYPE_REQUEST_ROUTING_START: HttpRequestTimingType = 17

public val HTTP_REQUEST_TIMING_TYPE_TLS_ATTRIBUTES_QUERY_END: HttpRequestTimingType = 9

public val HTTP_REQUEST_TIMING_TYPE_TLS_ATTRIBUTES_QUERY_START: HttpRequestTimingType = 8

public val HTTP_REQUEST_TIMING_TYPE_TLS_CERTIFICATE_LOAD_END: HttpRequestTimingType = 3

public val HTTP_REQUEST_TIMING_TYPE_TLS_CERTIFICATE_LOAD_START: HttpRequestTimingType = 2

public val HTTP_REQUEST_TIMING_TYPE_TLS_CLIENT_CERT_QUERY_END: HttpRequestTimingType = 11

public val HTTP_REQUEST_TIMING_TYPE_TLS_CLIENT_CERT_QUERY_START: HttpRequestTimingType = 10

public val HTTP_REQUEST_TIMING_TYPE_TLS_HANDSHAKE_LEG1END: HttpRequestTimingType = 5

public val HTTP_REQUEST_TIMING_TYPE_TLS_HANDSHAKE_LEG1START: HttpRequestTimingType = 4

public val HTTP_REQUEST_TIMING_TYPE_TLS_HANDSHAKE_LEG2END: HttpRequestTimingType = 7

public val HTTP_REQUEST_TIMING_TYPE_TLS_HANDSHAKE_LEG2START: HttpRequestTimingType = 6

public val HTTP_RESPONSE_INFO_TYPE_AUTHENTICATION_PROPERTY: HttpResponseInfoType = 1

public val HTTP_RESPONSE_INFO_TYPE_CHANNEL_BIND: HttpResponseInfoType = 3

public val HTTP_RESPONSE_INFO_TYPE_MULTIPLE_KNOWN_HEADERS: HttpResponseInfoType = 0

public val HTTP_RESPONSE_INFO_TYPE_QO_S_PROPERTY: HttpResponseInfoType = 2

public val HTTP_SCHEME_HTTP: HttpScheme = 0

public val HTTP_SCHEME_HTTPS: HttpScheme = 1

public val HTTP_SCHEME_MAXIMUM: HttpScheme = 2

public val HTTP_SERVER503VERBOSITY_PROPERTY: HttpServerProperty = 6

public val HTTP_SERVER_AUTHENTICATION_PROPERTY: HttpServerProperty = 0

public val HTTP_SERVER_BINDING_PROPERTY: HttpServerProperty = 7

public val HTTP_SERVER_CHANNEL_BIND_PROPERTY: HttpServerProperty = 10

public val HTTP_SERVER_DELEGATION_PROPERTY: HttpServerProperty = 16

public val HTTP_SERVER_EXTENDED_AUTHENTICATION_PROPERTY: HttpServerProperty = 8

public val HTTP_SERVER_LISTEN_ENDPOINT_PROPERTY: HttpServerProperty = 9

public val HTTP_SERVER_LOGGING_PROPERTY: HttpServerProperty = 1

public val HTTP_SERVER_PROTECTION_LEVEL_PROPERTY: HttpServerProperty = 11

public val HTTP_SERVER_QOS_PROPERTY: HttpServerProperty = 2

public val HTTP_SERVER_QUEUE_LENGTH_PROPERTY: HttpServerProperty = 4

public val HTTP_SERVER_STATE_PROPERTY: HttpServerProperty = 5

public val HTTP_SERVER_TIMEOUTS_PROPERTY: HttpServerProperty = 3

public val HTTP_SERVICE_BINDING_TYPE_A: HttpServiceBindingType = 2

public val HTTP_SERVICE_BINDING_TYPE_NONE: HttpServiceBindingType = 0

public val HTTP_SERVICE_BINDING_TYPE_W: HttpServiceBindingType = 1

public val HTTP_SERVICE_CONFIG_CACHE: HttpServiceConfigId = 4

public val HTTP_SERVICE_CONFIG_IP_LISTEN_LIST: HttpServiceConfigId = 0

public val HTTP_SERVICE_CONFIG_MAX: HttpServiceConfigId = 13

public val HTTP_SERVICE_CONFIG_QUERY_EXACT: HttpServiceConfigQueryType = 0

public val HTTP_SERVICE_CONFIG_QUERY_MAX: HttpServiceConfigQueryType = 2

public val HTTP_SERVICE_CONFIG_QUERY_NEXT: HttpServiceConfigQueryType = 1

public val HTTP_SERVICE_CONFIG_SSL_CERT_INFO: HttpServiceConfigId = 1

public val HTTP_SERVICE_CONFIG_SETTING: HttpServiceConfigId = 7

public val HTTP_SERVICE_CONFIG_SSL_CCS_CERT_INFO: HttpServiceConfigId = 6

public val HTTP_SERVICE_CONFIG_SSL_CCS_CERT_INFO_EX: HttpServiceConfigId = 10

public val HTTP_SERVICE_CONFIG_SSL_CERT_INFO_EX: HttpServiceConfigId = 8

public val HTTP_SERVICE_CONFIG_SSL_SCOPED_CCS_CERT_INFO: HttpServiceConfigId = 11

public val HTTP_SERVICE_CONFIG_SSL_SCOPED_CCS_CERT_INFO_EX: HttpServiceConfigId = 12

public val HTTP_SERVICE_CONFIG_SSL_SNI_CERT_INFO: HttpServiceConfigId = 5

public val HTTP_SERVICE_CONFIG_SSL_SNI_CERT_INFO_EX: HttpServiceConfigId = 9

public val HTTP_SERVICE_CONFIG_TIMEOUT: HttpServiceConfigId = 3

public val HTTP_SERVICE_CONFIG_URL_ACL_INFO: HttpServiceConfigId = 2

public val HTTP_TLS_THROTTLE: HttpServiceConfigSettingKey = 1

public val HTTP_VERB_CONNECT: HttpVerb = 10

public val HTTP_VERB_COPY: HttpVerb = 13

public val HTTP_VERB_DELETE: HttpVerb = 8

public val HTTP_VERB_GET: HttpVerb = 4

public val HTTP_VERB_HEAD: HttpVerb = 5

public val HTTP_VERB_INVALID: HttpVerb = 2

public val HTTP_VERB_LOCK: HttpVerb = 17

public val HTTP_VERB_MKCOL: HttpVerb = 16

public val HTTP_VERB_MOVE: HttpVerb = 12

public val HTTP_VERB_MAXIMUM: HttpVerb = 20

public val HTTP_VERB_OPTIONS: HttpVerb = 3

public val HTTP_VERB_POST: HttpVerb = 6

public val HTTP_VERB_PROPFIND: HttpVerb = 14

public val HTTP_VERB_PROPPATCH: HttpVerb = 15

public val HTTP_VERB_PUT: HttpVerb = 7

public val HTTP_VERB_SEARCH: HttpVerb = 19

public val HTTP_VERB_TRACE: HttpVerb = 9

public val HTTP_VERB_TRACK: HttpVerb = 11

public val HTTP_VERB_UNLOCK: HttpVerb = 18

public val HTTP_VERB_UNKNOWN: HttpVerb = 1

public val HTTP_VERB_UNPARSED: HttpVerb = 0

public val IDLE_CONNECTION_TIMEOUT: HttpServiceConfigTimeoutKey = 0

public val MAX_CACHE_RESPONSE_SIZE: HttpServiceConfigCacheKey = 0

public val PERFORMANCE_PARAM_AGGRESSIVE_ICW: HttpPerformanceParamType = 1

public val PERFORMANCE_PARAM_DECRYPT_ON_SSPI_THREAD: HttpPerformanceParamType = 5

public val PERFORMANCE_PARAM_MAX: HttpPerformanceParamType = 6

public val PERFORMANCE_PARAM_MAX_CONCURRENT_CLIENT_STREAMS: HttpPerformanceParamType = 3

public val PERFORMANCE_PARAM_MAX_RECEIVE_BUFFER_SIZE: HttpPerformanceParamType = 4

public val PERFORMANCE_PARAM_MAX_SEND_BUFFER_SIZE: HttpPerformanceParamType = 2

public val PERFORMANCE_PARAM_SEND_BUFFERING_FLAGS: HttpPerformanceParamType = 0
