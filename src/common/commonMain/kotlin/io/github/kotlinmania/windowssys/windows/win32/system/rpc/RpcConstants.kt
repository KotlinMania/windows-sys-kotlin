package io.github.kotlinmania.windowssys.windows.win32.system.rpc

public val DCE_C_ERROR_STRING_LEN: UInt = 256u

public val EEInfoGCCOM: UInt = 11u

public val EEInfoGCFRS: UInt = 12u

public val EEInfoNextRecordsMissing: UInt = 2u

public val EEInfoPreviousRecordsMissing: UInt = 1u

public val EEInfoUseFileTime: UInt = 4u

public val EPT_S_CANT_CREATE: RPC_STATUS = 1899

public val EPT_S_CANT_PERFORM_OP: RPC_STATUS = 1752

public val EPT_S_INVALID_ENTRY: RPC_STATUS = 1751

public val EPT_S_NOT_REGISTERED: RPC_STATUS = 1753

public val FC_EXPR_CONST32: EXPR_TOKEN = 1

public val FC_EXPR_CONST64: EXPR_TOKEN = 2

public val FC_EXPR_END: EXPR_TOKEN = 6

public val FC_EXPR_ILLEGAL: EXPR_TOKEN = 0

public val FC_EXPR_NOOP: EXPR_TOKEN = 5

public val FC_EXPR_OPER: EXPR_TOKEN = 4

public val FC_EXPR_START: EXPR_TOKEN = 0

public val FC_EXPR_VAR: EXPR_TOKEN = 3

public val IDL_CS_IN_PLACE_CONVERT: IDL_CS_CONVERT = 1

public val IDL_CS_NEW_BUFFER_CONVERT: IDL_CS_CONVERT = 2

public val IDL_CS_NO_CONVERT: IDL_CS_CONVERT = 0

public val INVALID_FRAGMENT_ID: UInt = 0u

public val MES_DECODE: MIDL_ES_CODE = 1

public val MES_DYNAMIC_BUFFER_HANDLE: MIDL_ES_HANDLE_STYLE = 2

public val MES_ENCODE: MIDL_ES_CODE = 0

public val MES_ENCODE_NDR64: MIDL_ES_CODE = 2

public val MES_FIXED_BUFFER_HANDLE: MIDL_ES_HANDLE_STYLE = 1

public val MES_INCREMENTAL_HANDLE: MIDL_ES_HANDLE_STYLE = 0

public val MIDL_WINRT_TYPE_SERIALIZATION_INFO_CURRENT_VERSION: Int = 1

public val MarshalDirectionMarshal: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION = 0

public val MarshalDirectionUnmarshal: LRPC_SYSTEM_HANDLE_MARSHAL_DIRECTION = 1

public val MaxNumberOfEEInfoParams: UInt = 4u

public val MidlInterceptionInfoVersionOne: Int = 1

public val MidlWinrtTypeSerializationInfoVersionOne: Int = 1

public val NDR64_FC_AUTO_HANDLE: UInt = 3u

public val NDR64_FC_BIND_GENERIC: UInt = 1u

public val NDR64_FC_BIND_PRIMITIVE: UInt = 2u

public val NDR64_FC_CALLBACK_HANDLE: UInt = 4u

public val NDR64_FC_EXPLICIT_HANDLE: UInt = 0u

public val NDR64_FC_NO_HANDLE: UInt = 5u

public val NDR_CUSTOM_OR_DEFAULT_ALLOCATOR: UInt = 268435456u

public val NDR_DEFAULT_ALLOCATOR: UInt = 536870912u

public val NT351_INTERFACE_SIZE: UInt = 64u

public val PROTOCOL_ADDRESS_CHANGE: RPC_ADDRESS_CHANGE_TYPE = 3

public val PROTOCOL_LOADED: RPC_ADDRESS_CHANGE_TYPE = 2

public val PROTOCOL_NOT_LOADED: RPC_ADDRESS_CHANGE_TYPE = 1

public val PROXY_CALCSIZE: PROXY_PHASE = 0

public val PROXY_GETBUFFER: PROXY_PHASE = 1

public val PROXY_MARSHAL: PROXY_PHASE = 2

public val PROXY_SENDRECEIVE: PROXY_PHASE = 3

public val PROXY_UNMARSHAL: PROXY_PHASE = 4

public val RPCFLG_ACCESSIBILITY_BIT1: UInt = 1048576u

public val RPCFLG_ACCESSIBILITY_BIT2: UInt = 2097152u

public val RPCFLG_ACCESS_LOCAL: UInt = 4194304u

public val RPCFLG_ASYNCHRONOUS: UInt = 1073741824u

public val RPCFLG_AUTO_COMPLETE: UInt = 134217728u

public val RPCFLG_HAS_CALLBACK: UInt = 67108864u

public val RPCFLG_HAS_GUARANTEE: UInt = 16u

public val RPCFLG_HAS_MULTI_SYNTAXES: UInt = 33554432u

public val RPCFLG_INPUT_SYNCHRONOUS: UInt = 536870912u

public val RPCFLG_LOCAL_CALL: UInt = 268435456u

public val RPCFLG_MESSAGE: UInt = 16777216u

public val RPCFLG_NDR64_CONTAINS_ARM_LAYOUT: UInt = 67108864u

public val RPCFLG_NON_NDR: UInt = 2147483648u

public val RPCFLG_SENDER_WAITING_FOR_REPLY: UInt = 8388608u

public val RPCFLG_WINRT_REMOTE_ASYNC: UInt = 32u

public val RPCHTTP_RS_ACCESS_1: RPC_HTTP_REDIRECTOR_STAGE = 2

public val RPCHTTP_RS_ACCESS_2: RPC_HTTP_REDIRECTOR_STAGE = 4

public val RPCHTTP_RS_INTERFACE: RPC_HTTP_REDIRECTOR_STAGE = 5

public val RPCHTTP_RS_REDIRECT: RPC_HTTP_REDIRECTOR_STAGE = 1

public val RPCHTTP_RS_SESSION: RPC_HTTP_REDIRECTOR_STAGE = 3

public val RPC_BHO_DONTLINGER: RPC_BINDING_HANDLE_OPTIONS_FLAGS = 2u

public val RPC_BHO_EXCLUSIVE_AND_GUARANTEED: UInt = 4u

public val RPC_BHO_NONCAUSAL: RPC_BINDING_HANDLE_OPTIONS_FLAGS = 1u

public val RPC_BHT_OBJECT_UUID_VALID: UInt = 1u

public val RPC_BUFFER_ASYNC: UInt = 32768u

public val RPC_BUFFER_COMPLETE: UInt = 4096u

public val RPC_BUFFER_EXTRA: UInt = 16384u

public val RPC_BUFFER_NONOTIFY: UInt = 65536u

public val RPC_BUFFER_PARTIAL: UInt = 8192u

public val RPC_CALL_ATTRIBUTES_VERSION: UInt = 2u

public val RPC_CALL_STATUS_CANCELLED: UInt = 1u

public val RPC_CALL_STATUS_DISCONNECTED: UInt = 2u

public val RPC_CONTEXT_HANDLE_DEFAULT_FLAGS: UInt = 0u

public val RPC_CONTEXT_HANDLE_DONT_SERIALIZE: UInt = 536870912u

public val RPC_CONTEXT_HANDLE_FLAGS: UInt = 805306368u

public val RPC_CONTEXT_HANDLE_SERIALIZE: UInt = 268435456u

public val RPC_C_AUTHN_CLOUD_AP: UInt = 36u

public val RPC_C_AUTHN_DCE_PRIVATE: UInt = 1u

public val RPC_C_AUTHN_DCE_PUBLIC: UInt = 2u

public val RPC_C_AUTHN_DEC_PUBLIC: UInt = 4u

public val RPC_C_AUTHN_DEFAULT: Int = -1

public val RPC_C_AUTHN_DIGEST: UInt = 21u

public val RPC_C_AUTHN_DPA: UInt = 17u

public val RPC_C_AUTHN_GSS_KERBEROS: UInt = 16u

public val RPC_C_AUTHN_GSS_NEGOTIATE: UInt = 9u

public val RPC_C_AUTHN_GSS_SCHANNEL: UInt = 14u

public val RPC_C_AUTHN_INFO_NONE: RPC_C_AUTHN_INFO_TYPE = 0u

public val RPC_C_AUTHN_INFO_TYPE_HTTP: RPC_C_AUTHN_INFO_TYPE = 1u

public val RPC_C_AUTHN_KERNEL: UInt = 20u

public val RPC_C_AUTHN_LIVEXP_SSP: UInt = 35u

public val RPC_C_AUTHN_LIVE_SSP: UInt = 32u

public val RPC_C_AUTHN_MQ: UInt = 100u

public val RPC_C_AUTHN_MSN: UInt = 18u

public val RPC_C_AUTHN_MSONLINE: UInt = 82u

public val RPC_C_AUTHN_NEGO_EXTENDER: UInt = 30u

public val RPC_C_AUTHN_NONE: UInt = 0u

public val RPC_C_AUTHN_PKU2U: UInt = 31u

public val RPC_C_AUTHN_WINNT: UInt = 10u

public val RPC_C_AUTHZ_DCE: UInt = 2u

public val RPC_C_AUTHZ_DEFAULT: UInt = 4294967295u

public val RPC_C_AUTHZ_NAME: UInt = 1u

public val RPC_C_AUTHZ_NONE: UInt = 0u

public val RPC_C_BINDING_DEFAULT_TIMEOUT: UInt = 5u

public val RPC_C_BINDING_INFINITE_TIMEOUT: UInt = 10u

public val RPC_C_BINDING_MAX_TIMEOUT: UInt = 9u

public val RPC_C_BINDING_MIN_TIMEOUT: UInt = 0u

public val RPC_C_BIND_TO_ALL_NICS: UInt = 1u

public val RPC_C_CANCEL_INFINITE_TIMEOUT: Int = -1

public val RPC_C_DONT_FAIL: UInt = 4u

public val RPC_C_EP_ALL_ELTS: UInt = 0u

public val RPC_C_EP_MATCH_BY_BOTH: UInt = 3u

public val RPC_C_EP_MATCH_BY_IF: UInt = 1u

public val RPC_C_EP_MATCH_BY_OBJ: UInt = 2u

public val RPC_C_FULL_CERT_CHAIN: UInt = 1u

public val RPC_C_HTTP_AUTHN_SCHEME_BASIC: UInt = 1u

public val RPC_C_HTTP_AUTHN_SCHEME_CERT: UInt = 65536u

public val RPC_C_HTTP_AUTHN_SCHEME_DIGEST: UInt = 8u

public val RPC_C_HTTP_AUTHN_SCHEME_NEGOTIATE: UInt = 16u

public val RPC_C_HTTP_AUTHN_SCHEME_NTLM: UInt = 2u

public val RPC_C_HTTP_AUTHN_SCHEME_PASSPORT: UInt = 4u

public val RPC_C_HTTP_AUTHN_TARGET_PROXY: RPC_C_HTTP_AUTHN_TARGET = 2u

public val RPC_C_HTTP_AUTHN_TARGET_SERVER: RPC_C_HTTP_AUTHN_TARGET = 1u

public val RPC_C_HTTP_FLAG_ENABLE_CERT_REVOCATION_CHECK: RPC_C_HTTP_FLAGS = 16u

public val RPC_C_HTTP_FLAG_IGNORE_CERT_CN_INVALID: RPC_C_HTTP_FLAGS = 8u

public val RPC_C_HTTP_FLAG_USE_FIRST_AUTH_SCHEME: RPC_C_HTTP_FLAGS = 2u

public val RPC_C_HTTP_FLAG_USE_SSL: RPC_C_HTTP_FLAGS = 1u

public val RPC_C_LISTEN_MAX_CALLS_DEFAULT: UInt = 1234u

public val RPC_C_MGMT_INQ_IF_IDS: UInt = 0u

public val RPC_C_MGMT_INQ_PRINC_NAME: UInt = 1u

public val RPC_C_MGMT_INQ_STATS: UInt = 2u

public val RPC_C_MGMT_IS_SERVER_LISTEN: UInt = 3u

public val RPC_C_MGMT_STOP_SERVER_LISTEN: UInt = 4u

public val RPC_C_MQ_AUTHN_LEVEL_NONE: UInt = 0u

public val RPC_C_MQ_AUTHN_LEVEL_PKT_INTEGRITY: UInt = 8u

public val RPC_C_MQ_AUTHN_LEVEL_PKT_PRIVACY: UInt = 16u

public val RPC_C_MQ_CLEAR_ON_OPEN: UInt = 2u

public val RPC_C_MQ_EXPRESS: UInt = 0u

public val RPC_C_MQ_JOURNAL_ALWAYS: UInt = 2u

public val RPC_C_MQ_JOURNAL_DEADLETTER: UInt = 1u

public val RPC_C_MQ_JOURNAL_NONE: UInt = 0u

public val RPC_C_MQ_PERMANENT: UInt = 1u

public val RPC_C_MQ_RECOVERABLE: UInt = 1u

public val RPC_C_MQ_TEMPORARY: UInt = 0u

public val RPC_C_MQ_USE_EXISTING_SECURITY: UInt = 4u

public val RPC_C_NOTIFY_ON_SEND_COMPLETE: UInt = 1u

public val RPC_C_NS_DEFAULT_EXP_AGE: Int = -1

public val RPC_C_NS_SYNTAX_DCE: GROUP_NAME_SYNTAX = 3u

public val RPC_C_NS_SYNTAX_DEFAULT: GROUP_NAME_SYNTAX = 0u

public val RPC_C_OPT_ASYNC_BLOCK: UInt = 15u

public val RPC_C_OPT_BINDING_NONCAUSAL: UInt = 9u

public val RPC_C_OPT_CALL_TIMEOUT: UInt = 12u

public val RPC_C_OPT_COOKIE_AUTH: UInt = 7u

public val RPC_C_OPT_DONT_LINGER: UInt = 13u

public val RPC_C_OPT_MAX_OPTIONS: UInt = 12u

public val RPC_C_OPT_MQ_ACKNOWLEDGE: UInt = 4u

public val RPC_C_OPT_MQ_AUTHN_LEVEL: UInt = 6u

public val RPC_C_OPT_MQ_AUTHN_SERVICE: UInt = 5u

public val RPC_C_OPT_MQ_DELIVERY: UInt = 1u

public val RPC_C_OPT_MQ_JOURNAL: UInt = 3u

public val RPC_C_OPT_MQ_PRIORITY: UInt = 2u

public val RPC_C_OPT_MQ_TIME_TO_BE_RECEIVED: UInt = 8u

public val RPC_C_OPT_MQ_TIME_TO_REACH_QUEUE: UInt = 7u

public val RPC_C_OPT_OPTIMIZE_TIME: UInt = 16u

public val RPC_C_OPT_PRIVATE_BREAK_ON_SUSPEND: UInt = 3u

public val RPC_C_OPT_PRIVATE_DO_NOT_DISTURB: UInt = 2u

public val RPC_C_OPT_PRIVATE_SUPPRESS_WAKE: UInt = 1u

public val RPC_C_OPT_RESOURCE_TYPE_UUID: UInt = 8u

public val RPC_C_OPT_SECURITY_CALLBACK: UInt = 10u

public val RPC_C_OPT_SESSION_ID: UInt = 6u

public val RPC_C_OPT_TRANS_SEND_BUFFER_SIZE: UInt = 5u

public val RPC_C_OPT_TRUST_PEER: UInt = 14u

public val RPC_C_OPT_UNIQUE_BINDING: UInt = 11u

public val RPC_C_PARM_BUFFER_LENGTH: UInt = 2u

public val RPC_C_PARM_MAX_PACKET_LENGTH: UInt = 1u

public val RPC_C_PROFILE_ALL_ELT: UInt = 1u

public val RPC_C_PROFILE_ALL_ELTS: UInt = 1u

public val RPC_C_PROFILE_DEFAULT_ELT: UInt = 0u

public val RPC_C_PROFILE_MATCH_BY_BOTH: UInt = 4u

public val RPC_C_PROFILE_MATCH_BY_IF: UInt = 2u

public val RPC_C_PROFILE_MATCH_BY_MBR: UInt = 3u

public val RPC_C_PROTSEQ_MAX_REQS_DEFAULT: UInt = 10u

public val RPC_C_QOS_CAPABILITIES_ANY_AUTHORITY: RPC_C_QOS_CAPABILITIES = 4u

public val RPC_C_QOS_CAPABILITIES_DEFAULT: RPC_C_QOS_CAPABILITIES = 0u

public val RPC_C_QOS_CAPABILITIES_IGNORE_DELEGATE_FAILURE: RPC_C_QOS_CAPABILITIES = 8u

public val RPC_C_QOS_CAPABILITIES_LOCAL_MA_HINT: RPC_C_QOS_CAPABILITIES = 16u

public val RPC_C_QOS_CAPABILITIES_MAKE_FULLSIC: RPC_C_QOS_CAPABILITIES = 2u

public val RPC_C_QOS_CAPABILITIES_MUTUAL_AUTH: RPC_C_QOS_CAPABILITIES = 1u

public val RPC_C_QOS_CAPABILITIES_SCHANNEL_FULL_AUTH_IDENTITY: RPC_C_QOS_CAPABILITIES = 32u

public val RPC_C_QOS_IDENTITY_DYNAMIC: RPC_C_QOS_IDENTITY = 1u

public val RPC_C_QOS_IDENTITY_STATIC: RPC_C_QOS_IDENTITY = 0u

public val RPC_C_RPCHTTP_USE_LOAD_BALANCE: UInt = 8u

public val RPC_C_SECURITY_QOS_VERSION: Int = 1

public val RPC_C_SECURITY_QOS_VERSION_1: Int = 1

public val RPC_C_SECURITY_QOS_VERSION_2: Int = 2

public val RPC_C_SECURITY_QOS_VERSION_3: Int = 3

public val RPC_C_SECURITY_QOS_VERSION_4: Int = 4

public val RPC_C_SECURITY_QOS_VERSION_5: Int = 5

public val RPC_C_STATS_CALLS_IN: UInt = 0u

public val RPC_C_STATS_CALLS_OUT: UInt = 1u

public val RPC_C_STATS_PKTS_IN: UInt = 2u

public val RPC_C_STATS_PKTS_OUT: UInt = 3u

public val RPC_C_TRY_ENFORCE_MAX_CALLS: UInt = 16u

public val RPC_C_USE_INTERNET_PORT: UInt = 1u

public val RPC_C_USE_INTRANET_PORT: UInt = 2u

public val RPC_C_VERS_ALL: UInt = 1u

public val RPC_C_VERS_COMPATIBLE: UInt = 2u

public val RPC_C_VERS_EXACT: UInt = 3u

public val RPC_C_VERS_MAJOR_ONLY: UInt = 4u

public val RPC_C_VERS_UPTO: UInt = 5u

public val RPC_EEINFO_VERSION: UInt = 1u

public val RPC_FLAGS_VALID_BIT: UInt = 32768u

public val RPC_FW_IF_FLAG_DCOM: UInt = 1u

public val RPC_IF_ALLOW_CALLBACKS_WITH_NO_AUTH: UInt = 16u

public val RPC_IF_ALLOW_LOCAL_ONLY: UInt = 32u

public val RPC_IF_ALLOW_SECURE_ONLY: UInt = 8u

public val RPC_IF_ALLOW_UNKNOWN_AUTHORITY: UInt = 4u

public val RPC_IF_ASYNC_CALLBACK: UInt = 256u

public val RPC_IF_AUTOLISTEN: UInt = 1u

public val RPC_IF_OLE: UInt = 2u

public val RPC_IF_SEC_CACHE_PER_PROC: UInt = 128u

public val RPC_IF_SEC_NO_CACHE: UInt = 64u

public val RPC_INTERFACE_HAS_PIPES: UInt = 1u

public val RPC_NCA_FLAGS_BROADCAST: UInt = 2u

public val RPC_NCA_FLAGS_DEFAULT: UInt = 0u

public val RPC_NCA_FLAGS_IDEMPOTENT: UInt = 1u

public val RPC_NCA_FLAGS_MAYBE: UInt = 4u

public val RPC_PROTSEQ_HTTP: UInt = 4u

public val RPC_PROTSEQ_LRPC: UInt = 3u

public val RPC_PROTSEQ_NMP: UInt = 2u

public val RPC_PROTSEQ_TCP: UInt = 1u

public val RPC_PROXY_CONNECTION_TYPE_IN_PROXY: UInt = 0u

public val RPC_PROXY_CONNECTION_TYPE_OUT_PROXY: UInt = 1u

public val RPC_P_ADDR_FORMAT_TCP_IPV4: UInt = 1u

public val RPC_P_ADDR_FORMAT_TCP_IPV6: UInt = 2u

public val RPC_QUERY_CALL_LOCAL_ADDRESS: UInt = 8u

public val RPC_QUERY_CLIENT_ID: UInt = 128u

public val RPC_QUERY_CLIENT_PID: UInt = 16u

public val RPC_QUERY_CLIENT_PRINCIPAL_NAME: UInt = 4u

public val RPC_QUERY_IS_CLIENT_LOCAL: UInt = 32u

public val RPC_QUERY_NO_AUTH_REQUIRED: UInt = 64u

public val RPC_QUERY_SERVER_PRINCIPAL_NAME: UInt = 2u

public val RPC_SYSTEM_HANDLE_FREE_ALL: UInt = 3u

public val RPC_SYSTEM_HANDLE_FREE_ERROR_ON_CLOSE: UInt = 4u

public val RPC_SYSTEM_HANDLE_FREE_RETRIEVED: UInt = 2u

public val RPC_SYSTEM_HANDLE_FREE_UNRETRIEVED: UInt = 1u

public val RPC_S_ACCESS_DENIED: RPC_STATUS = 5

public val RPC_S_ADDRESS_ERROR: RPC_STATUS = 1768

public val RPC_S_ALREADY_LISTENING: RPC_STATUS = 1713

public val RPC_S_ALREADY_REGISTERED: RPC_STATUS = 1711

public val RPC_S_ASYNC_CALL_PENDING: RPC_STATUS = 997

public val RPC_S_BINDING_HAS_NO_AUTH: RPC_STATUS = 1746

public val RPC_S_BINDING_INCOMPLETE: RPC_STATUS = 1819

public val RPC_S_BUFFER_TOO_SMALL: RPC_STATUS = 122

public val RPC_S_CALL_CANCELLED: RPC_STATUS = 1818

public val RPC_S_CALL_FAILED: RPC_STATUS = 1726

public val RPC_S_CALL_FAILED_DNE: RPC_STATUS = 1727

public val RPC_S_CALL_IN_PROGRESS: RPC_STATUS = 1791

public val RPC_S_CANNOT_SUPPORT: RPC_STATUS = 1764

public val RPC_S_CANT_CREATE_ENDPOINT: RPC_STATUS = 1720

public val RPC_S_COMM_FAILURE: RPC_STATUS = 1820

public val RPC_S_COOKIE_AUTH_FAILED: RPC_STATUS = 1833

public val RPC_S_DO_NOT_DISTURB: RPC_STATUS = 1834

public val RPC_S_DUPLICATE_ENDPOINT: RPC_STATUS = 1740

public val RPC_S_ENTRY_ALREADY_EXISTS: RPC_STATUS = 1760

public val RPC_S_ENTRY_NOT_FOUND: RPC_STATUS = 1761

public val RPC_S_ENTRY_TYPE_MISMATCH: RPC_STATUS = 1922

public val RPC_S_FP_DIV_ZERO: RPC_STATUS = 1769

public val RPC_S_FP_OVERFLOW: RPC_STATUS = 1771

public val RPC_S_FP_UNDERFLOW: RPC_STATUS = 1770

public val RPC_S_GROUP_MEMBER_NOT_FOUND: RPC_STATUS = 1898

public val RPC_S_GRP_ELT_NOT_ADDED: RPC_STATUS = 1928

public val RPC_S_GRP_ELT_NOT_REMOVED: RPC_STATUS = 1929

public val RPC_S_INCOMPLETE_NAME: RPC_STATUS = 1755

public val RPC_S_INTERFACE_NOT_EXPORTED: RPC_STATUS = 1924

public val RPC_S_INTERFACE_NOT_FOUND: RPC_STATUS = 1759

public val RPC_S_INTERNAL_ERROR: RPC_STATUS = 1766

public val RPC_S_INVALID_ARG: RPC_STATUS = 87

public val RPC_S_INVALID_ASYNC_CALL: RPC_STATUS = 1915

public val RPC_S_INVALID_ASYNC_HANDLE: RPC_STATUS = 1914

public val RPC_S_INVALID_AUTH_IDENTITY: RPC_STATUS = 1749

public val RPC_S_INVALID_BINDING: RPC_STATUS = 1702

public val RPC_S_INVALID_BOUND: RPC_STATUS = 1734

public val RPC_S_INVALID_ENDPOINT_FORMAT: RPC_STATUS = 1706

public val RPC_S_INVALID_LEVEL: RPC_STATUS = 87

public val RPC_S_INVALID_NAF_ID: RPC_STATUS = 1763

public val RPC_S_INVALID_NAME_SYNTAX: RPC_STATUS = 1736

public val RPC_S_INVALID_NETWORK_OPTIONS: RPC_STATUS = 1724

public val RPC_S_INVALID_NET_ADDR: RPC_STATUS = 1707

public val RPC_S_INVALID_OBJECT: RPC_STATUS = 1900

public val RPC_S_INVALID_RPC_PROTSEQ: RPC_STATUS = 1704

public val RPC_S_INVALID_SECURITY_DESC: RPC_STATUS = 1338

public val RPC_S_INVALID_STRING_BINDING: RPC_STATUS = 1700

public val RPC_S_INVALID_STRING_UUID: RPC_STATUS = 1705

public val RPC_S_INVALID_TAG: RPC_STATUS = 1733

public val RPC_S_INVALID_TIMEOUT: RPC_STATUS = 1709

public val RPC_S_INVALID_VERS_OPTION: RPC_STATUS = 1756

public val RPC_S_MAX_CALLS_TOO_SMALL: RPC_STATUS = 1742

public val RPC_S_NAME_SERVICE_UNAVAILABLE: RPC_STATUS = 1762

public val RPC_S_NOTHING_TO_EXPORT: RPC_STATUS = 1754

public val RPC_S_NOT_ALL_OBJS_EXPORTED: RPC_STATUS = 1923

public val RPC_S_NOT_ALL_OBJS_UNEXPORTED: RPC_STATUS = 1758

public val RPC_S_NOT_CANCELLED: RPC_STATUS = 1826

public val RPC_S_NOT_ENOUGH_QUOTA: RPC_STATUS = 1816

public val RPC_S_NOT_LISTENING: RPC_STATUS = 1715

public val RPC_S_NOT_RPC_ERROR: RPC_STATUS = 1823

public val RPC_S_NO_BINDINGS: RPC_STATUS = 1718

public val RPC_S_NO_CALL_ACTIVE: RPC_STATUS = 1725

public val RPC_S_NO_CONTEXT_AVAILABLE: RPC_STATUS = 1765

public val RPC_S_NO_ENDPOINT_FOUND: RPC_STATUS = 1708

public val RPC_S_NO_ENTRY_NAME: RPC_STATUS = 1735

public val RPC_S_NO_INTERFACES: RPC_STATUS = 1817

public val RPC_S_NO_MORE_BINDINGS: RPC_STATUS = 1806

public val RPC_S_NO_MORE_MEMBERS: RPC_STATUS = 1757

public val RPC_S_NO_PRINC_NAME: RPC_STATUS = 1822

public val RPC_S_NO_PROTSEQS: RPC_STATUS = 1719

public val RPC_S_NO_PROTSEQS_REGISTERED: RPC_STATUS = 1714

public val RPC_S_OBJECT_NOT_FOUND: RPC_STATUS = 1710

public val RPC_S_OK: RPC_STATUS = 0

public val RPC_S_OUT_OF_MEMORY: RPC_STATUS = 14

public val RPC_S_OUT_OF_RESOURCES: RPC_STATUS = 1721

public val RPC_S_OUT_OF_THREADS: RPC_STATUS = 164

public val RPC_S_PRF_ELT_NOT_ADDED: RPC_STATUS = 1926

public val RPC_S_PRF_ELT_NOT_REMOVED: RPC_STATUS = 1927

public val RPC_S_PROCNUM_OUT_OF_RANGE: RPC_STATUS = 1745

public val RPC_S_PROFILE_NOT_ADDED: RPC_STATUS = 1925

public val RPC_S_PROTOCOL_ERROR: RPC_STATUS = 1728

public val RPC_S_PROTSEQ_NOT_FOUND: RPC_STATUS = 1744

public val RPC_S_PROTSEQ_NOT_SUPPORTED: RPC_STATUS = 1703

public val RPC_S_PROXY_ACCESS_DENIED: RPC_STATUS = 1729

public val RPC_S_RUNTIME_UNINITIALIZED: RPC_STATUS = 1

public val RPC_S_SEC_PKG_ERROR: RPC_STATUS = 1825

public val RPC_S_SEND_INCOMPLETE: RPC_STATUS = 1913

public val RPC_S_SERVER_OUT_OF_MEMORY: RPC_STATUS = 1130

public val RPC_S_SERVER_TOO_BUSY: RPC_STATUS = 1723

public val RPC_S_SERVER_UNAVAILABLE: RPC_STATUS = 1722

public val RPC_S_STRING_TOO_LONG: RPC_STATUS = 1743

public val RPC_S_SYSTEM_HANDLE_COUNT_EXCEEDED: RPC_STATUS = 1835

public val RPC_S_SYSTEM_HANDLE_TYPE_MISMATCH: RPC_STATUS = 1836

public val RPC_S_TIMEOUT: RPC_STATUS = 1460

public val RPC_S_TYPE_ALREADY_REGISTERED: RPC_STATUS = 1712

public val RPC_S_UNKNOWN_AUTHN_LEVEL: RPC_STATUS = 1748

public val RPC_S_UNKNOWN_AUTHN_SERVICE: RPC_STATUS = 1747

public val RPC_S_UNKNOWN_AUTHN_TYPE: RPC_STATUS = 1741

public val RPC_S_UNKNOWN_AUTHZ_SERVICE: RPC_STATUS = 1750

public val RPC_S_UNKNOWN_IF: RPC_STATUS = 1717

public val RPC_S_UNKNOWN_MGR_TYPE: RPC_STATUS = 1716

public val RPC_S_UNKNOWN_PRINCIPAL: RPC_STATUS = 1332

public val RPC_S_UNSUPPORTED_AUTHN_LEVEL: RPC_STATUS = 1821

public val RPC_S_UNSUPPORTED_NAME_SYNTAX: RPC_STATUS = 1737

public val RPC_S_UNSUPPORTED_TRANS_SYN: RPC_STATUS = 1730

public val RPC_S_UNSUPPORTED_TYPE: RPC_STATUS = 1732

public val RPC_S_UUID_LOCAL_ONLY: RPC_STATUS = 1824

public val RPC_S_UUID_NO_ADDRESS: RPC_STATUS = 1739

public val RPC_S_WRONG_KIND_OF_BINDING: RPC_STATUS = 1701

public val RPC_S_ZERO_DIVIDE: RPC_STATUS = 1767

public val RPC_TYPE_DISCONNECT_EVENT_CONTEXT_HANDLE: UInt = 2147483648u

public val RPC_TYPE_STRICT_CONTEXT_HANDLE: UInt = 1073741824u

public val RpcAttemptedLbsDecisions: RpcPerfCounters = 8

public val RpcAttemptedLbsMessages: RpcPerfCounters = 10

public val RpcBackEndConnectionAttempts: RpcPerfCounters = 2

public val RpcBackEndConnectionFailed: RpcPerfCounters = 3

public val RpcCallComplete: RPC_ASYNC_EVENT = 0

public val RpcClientCancel: RPC_ASYNC_EVENT = 4

public val RpcClientDisconnect: RPC_ASYNC_EVENT = 3

public val RpcCurrentUniqueUser: RpcPerfCounters = 1

public val RpcFailedLbsDecisions: RpcPerfCounters = 9

public val RpcFailedLbsMessages: RpcPerfCounters = 11

public val RpcIncomingBandwidth: RpcPerfCounters = 6

public val RpcIncomingConnections: RpcPerfCounters = 5

public val RpcLastCounter: RpcPerfCounters = 12

public val RpcNotificationCallCancel: RPC_NOTIFICATIONS = 2

public val RpcNotificationCallNone: RPC_NOTIFICATIONS = 0

public val RpcNotificationClientDisconnect: RPC_NOTIFICATIONS = 1

public val RpcNotificationTypeApc: RPC_NOTIFICATION_TYPES = 2

public val RpcNotificationTypeCallback: RPC_NOTIFICATION_TYPES = 5

public val RpcNotificationTypeEvent: RPC_NOTIFICATION_TYPES = 1

public val RpcNotificationTypeHwnd: RPC_NOTIFICATION_TYPES = 4

public val RpcNotificationTypeIoc: RPC_NOTIFICATION_TYPES = 3

public val RpcNotificationTypeNone: RPC_NOTIFICATION_TYPES = 0

public val RpcOutgoingBandwidth: RpcPerfCounters = 7

public val RpcReceiveComplete: RPC_ASYNC_EVENT = 2

public val RpcRequestsPerSecond: RpcPerfCounters = 4

public val RpcSendComplete: RPC_ASYNC_EVENT = 1

public val SEC_WINNT_AUTH_IDENTITY_ANSI: SEC_WINNT_AUTH_IDENTITY = 1u

public val SEC_WINNT_AUTH_IDENTITY_UNICODE: SEC_WINNT_AUTH_IDENTITY = 2u

public val STUB_CALL_SERVER: STUB_PHASE = 1

public val STUB_CALL_SERVER_NO_HRESULT: STUB_PHASE = 3

public val STUB_MARSHAL: STUB_PHASE = 2

public val STUB_UNMARSHAL: STUB_PHASE = 0

public val SYSTEM_HANDLE_COMPOSITION_OBJECT: system_handle_t = 9

public val SYSTEM_HANDLE_EVENT: system_handle_t = 2

public val SYSTEM_HANDLE_FILE: system_handle_t = 0

public val SYSTEM_HANDLE_INVALID: system_handle_t = 255

public val SYSTEM_HANDLE_JOB: system_handle_t = 11

public val SYSTEM_HANDLE_MAX: system_handle_t = 12

public val SYSTEM_HANDLE_MUTEX: system_handle_t = 3

public val SYSTEM_HANDLE_PIPE: system_handle_t = 12

public val SYSTEM_HANDLE_PROCESS: system_handle_t = 4

public val SYSTEM_HANDLE_REG_KEY: system_handle_t = 7

public val SYSTEM_HANDLE_SECTION: system_handle_t = 6

public val SYSTEM_HANDLE_SEMAPHORE: system_handle_t = 1

public val SYSTEM_HANDLE_SOCKET: system_handle_t = 10

public val SYSTEM_HANDLE_THREAD: system_handle_t = 8

public val SYSTEM_HANDLE_TOKEN: system_handle_t = 5

public val TARGET_IS_NT100_OR_LATER: UInt = 1u

public val TARGET_IS_NT1012_OR_LATER: UInt = 1u

public val TARGET_IS_NT102_OR_LATER: UInt = 1u

public val TARGET_IS_NT351_OR_WIN95_OR_LATER: UInt = 1u

public val TARGET_IS_NT40_OR_LATER: UInt = 1u

public val TARGET_IS_NT50_OR_LATER: UInt = 1u

public val TARGET_IS_NT51_OR_LATER: UInt = 1u

public val TARGET_IS_NT60_OR_LATER: UInt = 1u

public val TARGET_IS_NT61_OR_LATER: UInt = 1u

public val TARGET_IS_NT62_OR_LATER: UInt = 1u

public val TARGET_IS_NT63_OR_LATER: UInt = 1u

public val TRANSPORT_TYPE_CN: UInt = 1u

public val TRANSPORT_TYPE_DG: UInt = 2u

public val TRANSPORT_TYPE_LPC: UInt = 4u

public val TRANSPORT_TYPE_WMSG: UInt = 8u

public val USER_CALL_IS_ASYNC: UInt = 256u

public val USER_CALL_NEW_CORRELATION_DESC: UInt = 512u

public val USER_MARSHAL_CB_BUFFER_SIZE: USER_MARSHAL_CB_TYPE = 0

public val USER_MARSHAL_CB_FREE: USER_MARSHAL_CB_TYPE = 3

public val USER_MARSHAL_CB_MARSHALL: USER_MARSHAL_CB_TYPE = 1

public val USER_MARSHAL_CB_UNMARSHALL: USER_MARSHAL_CB_TYPE = 2

public val USER_MARSHAL_FC_BYTE: UInt = 1u

public val USER_MARSHAL_FC_CHAR: UInt = 2u

public val USER_MARSHAL_FC_DOUBLE: UInt = 12u

public val USER_MARSHAL_FC_FLOAT: UInt = 10u

public val USER_MARSHAL_FC_HYPER: UInt = 11u

public val USER_MARSHAL_FC_LONG: UInt = 8u

public val USER_MARSHAL_FC_SHORT: UInt = 6u

public val USER_MARSHAL_FC_SMALL: UInt = 3u

public val USER_MARSHAL_FC_ULONG: UInt = 9u

public val USER_MARSHAL_FC_USHORT: UInt = 7u

public val USER_MARSHAL_FC_USMALL: UInt = 4u

public val USER_MARSHAL_FC_WCHAR: UInt = 5u

public val XLAT_CLIENT: XLAT_SIDE = 2

public val XLAT_SERVER: XLAT_SIDE = 1

public val __RPCPROXY_H_VERSION__: UInt = 477u

public val cbNDRContext: UInt = 20u

public val eeptAnsiString: ExtendedErrorParamTypes = 1

public val eeptBinary: ExtendedErrorParamTypes = 7

public val eeptLongVal: ExtendedErrorParamTypes = 3

public val eeptNone: ExtendedErrorParamTypes = 6

public val eeptPointerVal: ExtendedErrorParamTypes = 5

public val eeptShortVal: ExtendedErrorParamTypes = 4

public val eeptUnicodeString: ExtendedErrorParamTypes = 2

public val rcclClientUnknownLocality: RpcCallClientLocality = 3

public val rcclInvalid: RpcCallClientLocality = 0

public val rcclLocal: RpcCallClientLocality = 1

public val rcclRemote: RpcCallClientLocality = 2

public val rctGuaranteed: RpcCallType = 3

public val rctInvalid: RpcCallType = 0

public val rctNormal: RpcCallType = 1

public val rctTraining: RpcCallType = 2

public val rlafIPv4: RpcLocalAddressFormat = 1

public val rlafIPv6: RpcLocalAddressFormat = 2

public val rlafInvalid: RpcLocalAddressFormat = 0
