package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ADMINDATA_MAX_NAME_LEN: UInt = 256u

public val ALL_METADATA: Metadatatypes = 0

public val APPCTR_MD_ID_BEGIN_RESERVED: UInt = 57344u

public val APPCTR_MD_ID_END_RESERVED: UInt = 61439u

public val APPSTATUS_NOTDEFINED: UInt = 2u

public val APPSTATUS_RUNNING: UInt = 1u

public val APPSTATUS_STOPPED: UInt = 0u

public val ASP_MD_ID_BEGIN_RESERVED: UInt = 28672u

public val ASP_MD_ID_END_RESERVED: UInt = 29951u

public val ASP_MD_SERVER_BASE: UInt = 7000u

public val ASP_MD_UT_APP: UInt = 101u

public val BINARY_METADATA: Metadatatypes = 3

public val DISPID_HTTPREQUEST_ABORT: UInt = 12u

public val DISPID_HTTPREQUEST_BASE: UInt = 1u

public val DISPID_HTTPREQUEST_GETALLRESPONSEHEADERS: UInt = 4u

public val DISPID_HTTPREQUEST_GETRESPONSEHEADER: UInt = 3u

public val DISPID_HTTPREQUEST_OPEN: UInt = 1u

public val DISPID_HTTPREQUEST_OPTION: UInt = 6u

public val DISPID_HTTPREQUEST_RESPONSEBODY: UInt = 10u

public val DISPID_HTTPREQUEST_RESPONSESTREAM: UInt = 11u

public val DISPID_HTTPREQUEST_RESPONSETEXT: UInt = 9u

public val DISPID_HTTPREQUEST_SEND: UInt = 5u

public val DISPID_HTTPREQUEST_SETAUTOLOGONPOLICY: UInt = 18u

public val DISPID_HTTPREQUEST_SETCLIENTCERTIFICATE: UInt = 17u

public val DISPID_HTTPREQUEST_SETCREDENTIALS: UInt = 14u

public val DISPID_HTTPREQUEST_SETPROXY: UInt = 13u

public val DISPID_HTTPREQUEST_SETREQUESTHEADER: UInt = 2u

public val DISPID_HTTPREQUEST_SETTIMEOUTS: UInt = 16u

public val DISPID_HTTPREQUEST_STATUS: UInt = 7u

public val DISPID_HTTPREQUEST_STATUSTEXT: UInt = 8u

public val DISPID_HTTPREQUEST_WAITFORRESPONSE: UInt = 15u

public val DWN_COLORMODE: UInt = 63u

public val DWN_DOWNLOADONLY: UInt = 64u

public val DWN_FORCEDITHER: UInt = 128u

public val DWN_MIRRORIMAGE: UInt = 512u

public val DWN_RAWIMAGE: UInt = 256u

public val DWORD_METADATA: Metadatatypes = 1

public val EXPANDSZ_METADATA: Metadatatypes = 4

public val FP_MD_ID_BEGIN_RESERVED: UInt = 32768u

public val FP_MD_ID_END_RESERVED: UInt = 36863u

public val FTP_ACCESS_NONE: FtpAccess = 0

public val FTP_ACCESS_READ: FtpAccess = 1

public val FTP_ACCESS_READ_WRITE: FtpAccess = 3

public val FTP_ACCESS_WRITE: FtpAccess = 2

public val FTP_PROCESS_CLOSE_SESSION: FtpProcessStatus = 1

public val FTP_PROCESS_CONTINUE: FtpProcessStatus = 0

public val FTP_PROCESS_REJECT_COMMAND: FtpProcessStatus = 3

public val FTP_PROCESS_TERMINATE_SESSION: FtpProcessStatus = 2

public val HSE_APPEND_LOG_PARAMETER: UInt = 1003u

public val HSE_APP_FLAG_IN_PROCESS: UInt = 0u

public val HSE_APP_FLAG_ISOLATED_OOP: UInt = 1u

public val HSE_APP_FLAG_POOLED_OOP: UInt = 2u

public val HSE_EXEC_URL_DISABLE_CUSTOM_ERROR: UInt = 32u

public val HSE_EXEC_URL_HTTP_CACHE_ELIGIBLE: UInt = 128u

public val HSE_EXEC_URL_IGNORE_CURRENT_INTERCEPTOR: UInt = 4u

public val HSE_EXEC_URL_IGNORE_VALIDATION_AND_RANGE: UInt = 16u

public val HSE_EXEC_URL_NO_HEADERS: UInt = 2u

public val HSE_EXEC_URL_SSI_CMD: UInt = 64u

public val HSE_IO_ASYNC: UInt = 2u

public val HSE_IO_CACHE_RESPONSE: UInt = 32u

public val HSE_IO_DISCONNECT_AFTER_SEND: UInt = 4u

public val HSE_IO_FINAL_SEND: UInt = 16u

public val HSE_IO_NODELAY: UInt = 4096u

public val HSE_IO_SEND_HEADERS: UInt = 8u

public val HSE_IO_SYNC: UInt = 1u

public val HSE_IO_TRY_SKIP_CUSTOM_ERRORS: UInt = 64u

public val HSE_LOG_BUFFER_LEN: UInt = 80u

public val HSE_MAX_EXT_DLL_NAME_LEN: UInt = 256u

public val HSE_REQ_ABORTIVE_CLOSE: UInt = 1014u

public val HSE_REQ_ASYNC_READ_CLIENT: UInt = 1010u

public val HSE_REQ_BASE: UInt = 0u

public val HSE_REQ_CANCEL_IO: UInt = 1049u

public val HSE_REQ_CLOSE_CONNECTION: UInt = 1017u

public val HSE_REQ_DONE_WITH_SESSION: UInt = 4u

public val HSE_REQ_END_RESERVED: UInt = 1000u

public val HSE_REQ_EXEC_UNICODE_URL: UInt = 1025u

public val HSE_REQ_EXEC_URL: UInt = 1026u

public val HSE_REQ_GET_ANONYMOUS_TOKEN: UInt = 1038u

public val HSE_REQ_GET_CACHE_INVALIDATION_CALLBACK: UInt = 1040u

public val HSE_REQ_GET_CERT_INFO_EX: UInt = 1015u

public val HSE_REQ_GET_CHANNEL_BINDING_TOKEN: UInt = 1050u

public val HSE_REQ_GET_CONFIG_OBJECT: UInt = 1046u

public val HSE_REQ_GET_EXEC_URL_STATUS: UInt = 1027u

public val HSE_REQ_GET_IMPERSONATION_TOKEN: UInt = 1011u

public val HSE_REQ_GET_PROTOCOL_MANAGER_CUSTOM_INTERFACE_CALLBACK: UInt = 1048u

public val HSE_REQ_GET_SSPI_INFO: UInt = 1002u

public val HSE_REQ_GET_TRACE_INFO: UInt = 1042u

public val HSE_REQ_GET_TRACE_INFO_EX: UInt = 1044u

public val HSE_REQ_GET_UNICODE_ANONYMOUS_TOKEN: UInt = 1041u

public val HSE_REQ_GET_WORKER_PROCESS_SETTINGS: UInt = 1047u

public val HSE_REQ_IO_COMPLETION: UInt = 1005u

public val HSE_REQ_IS_CONNECTED: UInt = 1018u

public val HSE_REQ_IS_IN_PROCESS: UInt = 1030u

public val HSE_REQ_IS_KEEP_CONN: UInt = 1008u

public val HSE_REQ_MAP_UNICODE_URL_TO_PATH: UInt = 1023u

public val HSE_REQ_MAP_UNICODE_URL_TO_PATH_EX: UInt = 1024u

public val HSE_REQ_MAP_URL_TO_PATH: UInt = 1001u

public val HSE_REQ_MAP_URL_TO_PATH_EX: UInt = 1012u

public val HSE_REQ_NORMALIZE_URL: UInt = 1033u

public val HSE_REQ_RAISE_TRACE_EVENT: UInt = 1045u

public val HSE_REQ_REFRESH_ISAPI_ACL: UInt = 1007u

public val HSE_REQ_REPORT_UNHEALTHY: UInt = 1032u

public val HSE_REQ_SEND_CUSTOM_ERROR: UInt = 1028u

public val HSE_REQ_SEND_RESPONSE_HEADER: UInt = 3u

public val HSE_REQ_SEND_RESPONSE_HEADER_EX: UInt = 1016u

public val HSE_REQ_SEND_URL: UInt = 2u

public val HSE_REQ_SEND_URL_REDIRECT_RESP: UInt = 1u

public val HSE_REQ_SET_FLUSH_FLAG: UInt = 1043u

public val HSE_REQ_TRANSMIT_FILE: UInt = 1006u

public val HSE_REQ_VECTOR_SEND: UInt = 1037u

public val HSE_STATUS_ERROR: UInt = 4u

public val HSE_STATUS_PENDING: UInt = 3u

public val HSE_STATUS_SUCCESS: UInt = 1u

public val HSE_STATUS_SUCCESS_AND_KEEP_CONN: UInt = 2u

public val HSE_TERM_ADVISORY_UNLOAD: UInt = 1u

public val HSE_TERM_MUST_UNLOAD: UInt = 2u

public val HSE_URL_FLAGS_DONT_CACHE: UInt = 16u

public val HSE_URL_FLAGS_EXECUTE: UInt = 4u

public val HSE_URL_FLAGS_MAP_CERT: UInt = 128u

public val HSE_URL_FLAGS_MASK: UInt = 1023u

public val HSE_URL_FLAGS_NEGO_CERT: UInt = 32u

public val HSE_URL_FLAGS_READ: UInt = 1u

public val HSE_URL_FLAGS_REQUIRE_CERT: UInt = 64u

public val HSE_URL_FLAGS_SCRIPT: UInt = 512u

public val HSE_URL_FLAGS_SSL: UInt = 8u

public val HSE_URL_FLAGS_SSL128: UInt = 256u

public val HSE_URL_FLAGS_WRITE: UInt = 2u

public val HSE_VECTOR_ELEMENT_TYPE_FILE_HANDLE: UInt = 1u

public val HSE_VECTOR_ELEMENT_TYPE_MEMORY_BUFFER: UInt = 0u

public val HSE_VERSION_MAJOR: UInt = 8u

public val HSE_VERSION_MINOR: UInt = 0u

public val HTTP_TRACE_EVENT_FLAG_STATIC_DESCRIPTIVE_FIELDS: UInt = 1u

public val HTTP_TRACE_LEVEL_END: UInt = 7u

public val HTTP_TRACE_LEVEL_START: UInt = 6u

public val HTTP_TRACE_TYPE_BOOL: HttpTraceType = 11

public val HTTP_TRACE_TYPE_BYTE: HttpTraceType = 17

public val HTTP_TRACE_TYPE_CHAR: HttpTraceType = 16

public val HTTP_TRACE_TYPE_LONG: HttpTraceType = 3

public val HTTP_TRACE_TYPE_LONGLONG: HttpTraceType = 20

public val HTTP_TRACE_TYPE_LPCGUID: HttpTraceType = 72

public val HTTP_TRACE_TYPE_LPCSTR: HttpTraceType = 30

public val HTTP_TRACE_TYPE_LPCWSTR: HttpTraceType = 31

public val HTTP_TRACE_TYPE_SHORT: HttpTraceType = 2

public val HTTP_TRACE_TYPE_ULONG: HttpTraceType = 19

public val HTTP_TRACE_TYPE_ULONGLONG: HttpTraceType = 21

public val HTTP_TRACE_TYPE_USHORT: HttpTraceType = 18

public val IISADMIN_EXTENSIONS_CLSID_MD_KEY: Pcwstr = w("LM/IISADMIN/EXTENSIONS/DCOMCLSIDS")

public val IISADMIN_EXTENSIONS_CLSID_MD_KEYA: Pcstr = s("LM/IISADMIN/EXTENSIONS/DCOMCLSIDS")

public val IISADMIN_EXTENSIONS_CLSID_MD_KEYW: Pcwstr = w("LM/IISADMIN/EXTENSIONS/DCOMCLSIDS")

public val IISADMIN_EXTENSIONS_REG_KEY: Pcwstr = w("SOFTWARE\\Microsoft\\InetStp\\Extensions")

public val IISADMIN_EXTENSIONS_REG_KEYA: Pcstr = s("SOFTWARE\\Microsoft\\InetStp\\Extensions")

public val IISADMIN_EXTENSIONS_REG_KEYW: Pcwstr = w("SOFTWARE\\Microsoft\\InetStp\\Extensions")

public val IIS_CLASS_CERTMAPPER: Pcstr = s("IIsCertMapper")

public val IIS_CLASS_CERTMAPPER_W: Pcwstr = w("IIsCertMapper")

public val IIS_CLASS_COMPRESS_SCHEME: Pcstr = s("IIsCompressionScheme")

public val IIS_CLASS_COMPRESS_SCHEMES: Pcstr = s("IIsCompressionSchemes")

public val IIS_CLASS_COMPRESS_SCHEMES_W: Pcwstr = w("IIsCompressionSchemes")

public val IIS_CLASS_COMPRESS_SCHEME_W: Pcwstr = w("IIsCompressionScheme")

public val IIS_CLASS_COMPUTER: Pcstr = s("IIsComputer")

public val IIS_CLASS_COMPUTER_W: Pcwstr = w("IIsComputer")

public val IIS_CLASS_FILTER: Pcstr = s("IIsFilter")

public val IIS_CLASS_FILTERS: Pcstr = s("IIsFilters")

public val IIS_CLASS_FILTERS_W: Pcwstr = w("IIsFilters")

public val IIS_CLASS_FILTER_W: Pcwstr = w("IIsFilter")

public val IIS_CLASS_FTP_INFO: Pcstr = s("IIsFtpInfo")

public val IIS_CLASS_FTP_INFO_W: Pcwstr = w("IIsFtpInfo")

public val IIS_CLASS_FTP_SERVER: Pcstr = s("IIsFtpServer")

public val IIS_CLASS_FTP_SERVER_W: Pcwstr = w("IIsFtpServer")

public val IIS_CLASS_FTP_SERVICE: Pcstr = s("IIsFtpService")

public val IIS_CLASS_FTP_SERVICE_W: Pcwstr = w("IIsFtpService")

public val IIS_CLASS_FTP_VDIR: Pcstr = s("IIsFtpVirtualDir")

public val IIS_CLASS_FTP_VDIR_W: Pcwstr = w("IIsFtpVirtualDir")

public val IIS_CLASS_LOG_MODULE: Pcstr = s("IIsLogModule")

public val IIS_CLASS_LOG_MODULES: Pcstr = s("IIsLogModules")

public val IIS_CLASS_LOG_MODULES_W: Pcwstr = w("IIsLogModules")

public val IIS_CLASS_LOG_MODULE_W: Pcwstr = w("IIsLogModule")

public val IIS_CLASS_MIMEMAP: Pcstr = s("IIsMimeMap")

public val IIS_CLASS_MIMEMAP_W: Pcwstr = w("IIsMimeMap")

public val IIS_CLASS_WEB_DIR: Pcstr = s("IIsWebDirectory")

public val IIS_CLASS_WEB_DIR_W: Pcwstr = w("IIsWebDirectory")

public val IIS_CLASS_WEB_FILE: Pcstr = s("IIsWebFile")

public val IIS_CLASS_WEB_FILE_W: Pcwstr = w("IIsWebFile")

public val IIS_CLASS_WEB_INFO: Pcstr = s("IIsWebInfo")

public val IIS_CLASS_WEB_INFO_W: Pcwstr = w("IIsWebInfo")

public val IIS_CLASS_WEB_SERVER: Pcstr = s("IIsWebServer")

public val IIS_CLASS_WEB_SERVER_W: Pcwstr = w("IIsWebServer")

public val IIS_CLASS_WEB_SERVICE: Pcstr = s("IIsWebService")

public val IIS_CLASS_WEB_SERVICE_W: Pcwstr = w("IIsWebService")

public val IIS_CLASS_WEB_VDIR: Pcstr = s("IIsWebVirtualDir")

public val IIS_CLASS_WEB_VDIR_W: Pcwstr = w("IIsWebVirtualDir")

public val IIS_MD_ADSI_METAID_BEGIN: UInt = 130000u

public val IIS_MD_ADSI_SCHEMA_PATH_A: Pcstr = s("/Schema")

public val IIS_MD_ADSI_SCHEMA_PATH_W: Pcwstr = w("/Schema")

public val IIS_MD_APPPOOL_BASE: UInt = 9000u

public val IIS_MD_APP_BASE: UInt = 9100u

public val IIS_MD_FILE_PROP_BASE: UInt = 6000u

public val IIS_MD_FTP_BASE: UInt = 5000u

public val IIS_MD_GLOBAL_BASE: UInt = 9200u

public val IIS_MD_HTTP_BASE: UInt = 2000u

public val IIS_MD_ID_BEGIN_RESERVED: UInt = 1u

public val IIS_MD_ID_END_RESERVED: UInt = 32767u

public val IIS_MD_INSTANCE_ROOT: Pcstr = s("Root")

public val IIS_MD_ISAPI_FILTERS: Pcstr = s("/Filters")

public val IIS_MD_LOCAL_MACHINE_PATH: Pcstr = s("LM")

public val IIS_MD_LOGCUSTOM_BASE: UInt = 4500u

public val IIS_MD_LOGCUSTOM_LAST: UInt = 4508u

public val IIS_MD_LOG_BASE: UInt = 4000u

public val IIS_MD_LOG_LAST: UInt = 4015u

public val IIS_MD_SERVER_BASE: UInt = 1000u

public val IIS_MD_SSL_BASE: UInt = 5500u

public val IIS_MD_SVC_INFO_PATH: Pcstr = s("Info")

public val IIS_MD_UT_END_RESERVED: UInt = 2000u

public val IIS_MD_UT_FILE: UInt = 2u

public val IIS_MD_UT_SERVER: UInt = 1u

public val IIS_MD_UT_WAM: UInt = 100u

public val IIS_MD_VR_BASE: UInt = 3000u

public val IIS_WEBSOCKET: Pcwstr = w("websockets")

public val IIS_WEBSOCKET_SERVER_VARIABLE: Pcstr = s("IIS_WEBSOCK")

public val IMAP_MD_ID_BEGIN_RESERVED: UInt = 49152u

public val IMAP_MD_ID_END_RESERVED: UInt = 53247u

public val IMGANIM_ANIMATED: UInt = 268435456u

public val IMGANIM_MASK: UInt = 268435456u

public val IMGBITS_MASK: UInt = 234881024u

public val IMGBITS_NONE: UInt = 33554432u

public val IMGBITS_PARTIAL: UInt = 67108864u

public val IMGBITS_TOTAL: UInt = 134217728u

public val IMGCHG_ANIMATE: UInt = 8u

public val IMGCHG_COMPLETE: UInt = 4u

public val IMGCHG_MASK: UInt = 15u

public val IMGCHG_SIZE: UInt = 1u

public val IMGCHG_VIEW: UInt = 2u

public val IMGLOAD_COMPLETE: UInt = 16777216u

public val IMGLOAD_ERROR: UInt = 8388608u

public val IMGLOAD_LOADING: UInt = 2097152u

public val IMGLOAD_MASK: UInt = 32505856u

public val IMGLOAD_NOTLOADED: UInt = 1048576u

public val IMGLOAD_STOPPED: UInt = 4194304u

public val IMGTRANS_MASK: UInt = 536870912u

public val IMGTRANS_OPAQUE: UInt = 536870912u

public val INVALID_END_METADATA: Metadatatypes = 6

public val MB_DONT_IMPERSONATE: UInt = 9033u

public val MD_ACCESS_EXECUTE: UInt = 4u

public val MD_ACCESS_MAP_CERT: UInt = 128u

public val MD_ACCESS_MASK: UInt = 65535u

public val MD_ACCESS_NEGO_CERT: UInt = 32u

public val MD_ACCESS_NO_PHYSICAL_DIR: UInt = 32768u

public val MD_ACCESS_NO_REMOTE_EXECUTE: UInt = 8192u

public val MD_ACCESS_NO_REMOTE_READ: UInt = 4096u

public val MD_ACCESS_NO_REMOTE_SCRIPT: UInt = 16384u

public val MD_ACCESS_NO_REMOTE_WRITE: UInt = 1024u

public val MD_ACCESS_PERM: UInt = 6016u

public val MD_ACCESS_READ: UInt = 1u

public val MD_ACCESS_REQUIRE_CERT: UInt = 64u

public val MD_ACCESS_SCRIPT: UInt = 512u

public val MD_ACCESS_SOURCE: UInt = 16u

public val MD_ACCESS_SSL: UInt = 8u

public val MD_ACCESS_SSL128: UInt = 256u

public val MD_ACCESS_WRITE: UInt = 2u

public val MD_ACR_ENUM_KEYS: UInt = 8u

public val MD_ACR_READ: UInt = 1u

public val MD_ACR_RESTRICTED_WRITE: UInt = 32u

public val MD_ACR_UNSECURE_PROPS_READ: UInt = 128u

public val MD_ACR_WRITE: UInt = 2u

public val MD_ACR_WRITE_DAC: UInt = 262144u

public val MD_ADMIN_ACL: UInt = 6027u

public val MD_ADMIN_INSTANCE: UInt = 2115u

public val MD_ADV_CACHE_TTL: UInt = 2064u

public val MD_ADV_NOTIFY_PWD_EXP_IN_DAYS: UInt = 2063u

public val MD_AD_CONNECTIONS_PASSWORD: UInt = 5015u

public val MD_AD_CONNECTIONS_USERNAME: UInt = 5014u

public val MD_ALLOW_ANONYMOUS: UInt = 5005u

public val MD_ALLOW_KEEPALIVES: UInt = 6038u

public val MD_ALLOW_PATH_INFO_FOR_SCRIPT_MAPPINGS: UInt = 2095u

public val MD_ALLOW_REPLACE_ON_RENAME: UInt = 5009u

public val MD_ANONYMOUS_ONLY: UInt = 5006u

public val MD_ANONYMOUS_PWD: UInt = 6021u

public val MD_ANONYMOUS_USER_NAME: UInt = 6020u

public val MD_ANONYMOUS_USE_SUBAUTH: UInt = 6022u

public val MD_APPPOOL_32_BIT_APP_ON_WIN64: UInt = 9040u

public val MD_APPPOOL_ALLOW_TRANSIENT_REGISTRATION: UInt = 9202u

public val MD_APPPOOL_APPPOOL_ID: UInt = 9201u

public val MD_APPPOOL_AUTO_SHUTDOWN_EXE: UInt = 9035u

public val MD_APPPOOL_AUTO_SHUTDOWN_PARAMS: UInt = 9036u

public val MD_APPPOOL_AUTO_START: UInt = 9028u

public val MD_APPPOOL_COMMAND: UInt = 9026u

public val MD_APPPOOL_COMMAND_START: UInt = 1u

public val MD_APPPOOL_COMMAND_STOP: UInt = 2u

public val MD_APPPOOL_DISALLOW_OVERLAPPING_ROTATION: UInt = 9015u

public val MD_APPPOOL_DISALLOW_ROTATION_ON_CONFIG_CHANGE: UInt = 9018u

public val MD_APPPOOL_EMULATION_ON_WINARM64: UInt = 9043u

public val MD_APPPOOL_IDENTITY_TYPE: UInt = 9021u

public val MD_APPPOOL_IDENTITY_TYPE_LOCALSERVICE: UInt = 1u

public val MD_APPPOOL_IDENTITY_TYPE_LOCALSYSTEM: UInt = 0u

public val MD_APPPOOL_IDENTITY_TYPE_NETWORKSERVICE: UInt = 2u

public val MD_APPPOOL_IDENTITY_TYPE_SPECIFICUSER: UInt = 3u

public val MD_APPPOOL_IDLE_TIMEOUT: UInt = 9005u

public val MD_APPPOOL_MANAGED_PIPELINE_MODE: UInt = 9041u

public val MD_APPPOOL_MANAGED_RUNTIME_VERSION: UInt = 9039u

public val MD_APPPOOL_MAX_PROCESS_COUNT: UInt = 9003u

public val MD_APPPOOL_ORPHAN_ACTION_EXE: UInt = 9031u

public val MD_APPPOOL_ORPHAN_ACTION_PARAMS: UInt = 9032u

public val MD_APPPOOL_ORPHAN_PROCESSES_FOR_DEBUGGING: UInt = 9009u

public val MD_APPPOOL_PERIODIC_RESTART_CONNECTIONS: UInt = 9104u

public val MD_APPPOOL_PERIODIC_RESTART_MEMORY: UInt = 9024u

public val MD_APPPOOL_PERIODIC_RESTART_PRIVATE_MEMORY: UInt = 9038u

public val MD_APPPOOL_PERIODIC_RESTART_REQUEST_COUNT: UInt = 9002u

public val MD_APPPOOL_PERIODIC_RESTART_SCHEDULE: UInt = 9020u

public val MD_APPPOOL_PERIODIC_RESTART_TIME: UInt = 9001u

public val MD_APPPOOL_PINGING_ENABLED: UInt = 9004u

public val MD_APPPOOL_PING_INTERVAL: UInt = 9013u

public val MD_APPPOOL_PING_RESPONSE_TIMELIMIT: UInt = 9014u

public val MD_APPPOOL_RAPID_FAIL_PROTECTION_ENABLED: UInt = 9006u

public val MD_APPPOOL_SHUTDOWN_TIMELIMIT: UInt = 9012u

public val MD_APPPOOL_SMP_AFFINITIZED: UInt = 9007u

public val MD_APPPOOL_SMP_AFFINITIZED_PROCESSOR_MASK: UInt = 9008u

public val MD_APPPOOL_STARTUP_TIMELIMIT: UInt = 9011u

public val MD_APPPOOL_STATE: UInt = 9027u

public val MD_APPPOOL_STATE_STARTED: UInt = 2u

public val MD_APPPOOL_STATE_STARTING: UInt = 1u

public val MD_APPPOOL_STATE_STOPPED: UInt = 4u

public val MD_APPPOOL_STATE_STOPPING: UInt = 3u

public val MD_APPPOOL_UL_APPPOOL_QUEUE_LENGTH: UInt = 9017u

public val MD_APP_ALLOW_TRANSIENT_REGISTRATION: UInt = 9102u

public val MD_APP_APPPOOL_ID: UInt = 9101u

public val MD_APP_AUTO_START: UInt = 9103u

public val MD_APP_DEPENDENCIES: UInt = 2167u

public val MD_APP_FRIENDLY_NAME: UInt = 2102u

public val MD_APP_ISOLATED: UInt = 2104u

public val MD_APP_OOP_RECOVER_LIMIT: UInt = 2110u

public val MD_APP_PACKAGE_ID: UInt = 2106u

public val MD_APP_PACKAGE_NAME: UInt = 2107u

public val MD_APP_PERIODIC_RESTART_REQUESTS: UInt = 2112u

public val MD_APP_PERIODIC_RESTART_SCHEDULE: UInt = 2113u

public val MD_APP_PERIODIC_RESTART_TIME: UInt = 2111u

public val MD_APP_POOL_LOG_EVENT_ON_PROCESSMODEL: UInt = 9042u

public val MD_APP_POOL_LOG_EVENT_ON_RECYCLE: UInt = 9037u

public val MD_APP_POOL_PROCESSMODEL_IDLE_TIMEOUT: UInt = 1u

public val MD_APP_POOL_RECYCLE_CONFIG_CHANGE: UInt = 64u

public val MD_APP_POOL_RECYCLE_ISAPI_UNHEALTHY: UInt = 16u

public val MD_APP_POOL_RECYCLE_MEMORY: UInt = 8u

public val MD_APP_POOL_RECYCLE_ON_DEMAND: UInt = 32u

public val MD_APP_POOL_RECYCLE_PRIVATE_MEMORY: UInt = 128u

public val MD_APP_POOL_RECYCLE_REQUESTS: UInt = 2u

public val MD_APP_POOL_RECYCLE_SCHEDULE: UInt = 4u

public val MD_APP_POOL_RECYCLE_TIME: UInt = 1u

public val MD_APP_ROOT: UInt = 2103u

public val MD_APP_SHUTDOWN_TIME_LIMIT: UInt = 2114u

public val MD_APP_TRACE_URL_LIST: UInt = 2118u

public val MD_APP_WAM_CLSID: UInt = 2105u

public val MD_ASP_ALLOWOUTOFPROCCMPNTS: UInt = 7014u

public val MD_ASP_ALLOWOUTOFPROCCOMPONENTS: UInt = 7014u

public val MD_ASP_ALLOWSESSIONSTATE: UInt = 7011u

public val MD_ASP_BUFFERINGON: UInt = 7000u

public val MD_ASP_BUFFER_LIMIT: UInt = 7052u

public val MD_ASP_CALCLINENUMBER: UInt = 7050u

public val MD_ASP_CODEPAGE: UInt = 7016u

public val MD_ASP_DISKTEMPLATECACHEDIRECTORY: UInt = 7036u

public val MD_ASP_ENABLEAPPLICATIONRESTART: UInt = 7027u

public val MD_ASP_ENABLEASPHTMLFALLBACK: UInt = 7021u

public val MD_ASP_ENABLECHUNKEDENCODING: UInt = 7022u

public val MD_ASP_ENABLECLIENTDEBUG: UInt = 7019u

public val MD_ASP_ENABLEPARENTPATHS: UInt = 7008u

public val MD_ASP_ENABLESERVERDEBUG: UInt = 7018u

public val MD_ASP_ENABLETYPELIBCACHE: UInt = 7023u

public val MD_ASP_ERRORSTONTLOG: UInt = 7024u

public val MD_ASP_EXCEPTIONCATCHENABLE: UInt = 7015u

public val MD_ASP_EXECUTEINMTA: UInt = 7041u

public val MD_ASP_ID_LAST: UInt = 7053u

public val MD_ASP_KEEPSESSIONIDSECURE: UInt = 7043u

public val MD_ASP_LCID: UInt = 7042u

public val MD_ASP_LOGERRORREQUESTS: UInt = 7001u

public val MD_ASP_MAXDISKTEMPLATECACHEFILES: UInt = 7040u

public val MD_ASP_MAXREQUESTENTITY: UInt = 7053u

public val MD_ASP_MAX_REQUEST_ENTITY_ALLOWED: UInt = 7053u

public val MD_ASP_MEMFREEFACTOR: UInt = 7009u

public val MD_ASP_MINUSEDBLOCKS: UInt = 7010u

public val MD_ASP_PROCESSORTHREADMAX: UInt = 7025u

public val MD_ASP_QUEUECONNECTIONTESTTIME: UInt = 7028u

public val MD_ASP_QUEUETIMEOUT: UInt = 7013u

public val MD_ASP_REQEUSTQUEUEMAX: UInt = 7026u

public val MD_ASP_RUN_ONEND_ANON: UInt = 7051u

public val MD_ASP_SCRIPTENGINECACHEMAX: UInt = 7005u

public val MD_ASP_SCRIPTERRORMESSAGE: UInt = 7003u

public val MD_ASP_SCRIPTERRORSSENTTOBROWSER: UInt = 7002u

public val MD_ASP_SCRIPTFILECACHESIZE: UInt = 7004u

public val MD_ASP_SCRIPTLANGUAGE: UInt = 7012u

public val MD_ASP_SCRIPTLANGUAGELIST: UInt = 7017u

public val MD_ASP_SCRIPTTIMEOUT: UInt = 7006u

public val MD_ASP_SERVICE_ENABLE_SXS: UInt = 2u

public val MD_ASP_SERVICE_ENABLE_TRACKER: UInt = 1u

public val MD_ASP_SERVICE_FLAGS: UInt = 7044u

public val MD_ASP_SERVICE_FLAG_FUSION: UInt = 7046u

public val MD_ASP_SERVICE_FLAG_PARTITIONS: UInt = 7047u

public val MD_ASP_SERVICE_FLAG_TRACKER: UInt = 7045u

public val MD_ASP_SERVICE_PARTITION_ID: UInt = 7048u

public val MD_ASP_SERVICE_SXS_NAME: UInt = 7049u

public val MD_ASP_SERVICE_USE_PARTITION: UInt = 4u

public val MD_ASP_SESSIONMAX: UInt = 7029u

public val MD_ASP_SESSIONTIMEOUT: UInt = 7007u

public val MD_ASP_THREADGATEENABLED: UInt = 7030u

public val MD_ASP_THREADGATELOADHIGH: UInt = 7035u

public val MD_ASP_THREADGATELOADLOW: UInt = 7034u

public val MD_ASP_THREADGATESLEEPDELAY: UInt = 7032u

public val MD_ASP_THREADGATESLEEPMAX: UInt = 7033u

public val MD_ASP_THREADGATETIMESLICE: UInt = 7031u

public val MD_ASP_TRACKTHREADINGMODEL: UInt = 7020u

public val MD_AUTHORIZATION: UInt = 6000u

public val MD_AUTHORIZATION_PERSISTENCE: UInt = 6031u

public val MD_AUTH_ADVNOTIFY_DISABLE: UInt = 4u

public val MD_AUTH_ANONYMOUS: UInt = 1u

public val MD_AUTH_BASIC: UInt = 2u

public val MD_AUTH_CHANGE_DISABLE: UInt = 2u

public val MD_AUTH_CHANGE_FLAGS: UInt = 2068u

public val MD_AUTH_CHANGE_UNSECURE: UInt = 1u

public val MD_AUTH_CHANGE_URL: UInt = 2060u

public val MD_AUTH_EXPIRED_UNSECUREURL: UInt = 2067u

public val MD_AUTH_EXPIRED_URL: UInt = 2061u

public val MD_AUTH_MD5: UInt = 16u

public val MD_AUTH_NT: UInt = 4u

public val MD_AUTH_PASSPORT: UInt = 64u

public val MD_AUTH_SINGLEREQUEST: UInt = 64u

public val MD_AUTH_SINGLEREQUESTALWAYSIFPROXY: UInt = 256u

public val MD_AUTH_SINGLEREQUESTIFPROXY: UInt = 128u

public val MD_BACKUP_FORCE_BACKUP: UInt = 4u

public val MD_BACKUP_HIGHEST_VERSION: UInt = 4294967294u

public val MD_BACKUP_MAX_LEN: UInt = 100u

public val MD_BACKUP_MAX_VERSION: UInt = 9999u

public val MD_BACKUP_NEXT_VERSION: UInt = 4294967295u

public val MD_BACKUP_OVERWRITE: UInt = 1u

public val MD_BACKUP_SAVE_FIRST: UInt = 2u

public val MD_BANNER_MESSAGE: UInt = 5011u

public val MD_BINDINGS: UInt = 2022u

public val MD_CACHE_EXTENSIONS: UInt = 6034u

public val MD_CAL_AUTH_RESERVE_TIMEOUT: UInt = 2131u

public val MD_CAL_SSL_RESERVE_TIMEOUT: UInt = 2132u

public val MD_CAL_VC_PER_CONNECT: UInt = 2130u

public val MD_CAL_W3_ERROR: UInt = 2133u

public val MD_CC_MAX_AGE: UInt = 6042u

public val MD_CC_NO_CACHE: UInt = 6041u

public val MD_CC_OTHER: UInt = 6043u

public val MD_CENTRAL_W3C_LOGGING_ENABLED: UInt = 2119u

public val MD_CERT_CACHE_RETRIEVAL_ONLY: UInt = 2u

public val MD_CERT_CHECK_REVOCATION_FRESHNESS_TIME: UInt = 4u

public val MD_CERT_NO_REVOC_CHECK: UInt = 1u

public val MD_CERT_NO_USAGE_CHECK: UInt = 65536u

public val MD_CGI_RESTRICTION_LIST: UInt = 2164u

public val MD_CHANGE_TYPE_ADD_OBJECT: UInt = 2u

public val MD_CHANGE_TYPE_DELETE_DATA: UInt = 8u

public val MD_CHANGE_TYPE_DELETE_OBJECT: UInt = 1u

public val MD_CHANGE_TYPE_RENAME_OBJECT: UInt = 16u

public val MD_CHANGE_TYPE_RESTORE: UInt = 32u

public val MD_CHANGE_TYPE_SET_DATA: UInt = 4u

public val MD_COMMENTS: UInt = 9990u

public val MD_CONNECTION_TIMEOUT: UInt = 1013u

public val MD_CPU_ACTION: UInt = 9022u

public val MD_CPU_APP_ENABLED: UInt = 2141u

public val MD_CPU_CGI_ENABLED: UInt = 2140u

public val MD_CPU_CGI_LIMIT: UInt = 2148u

public val MD_CPU_DISABLE_ALL_LOGGING: UInt = 0u

public val MD_CPU_ENABLE_ACTIVE_PROCS: UInt = 64u

public val MD_CPU_ENABLE_ALL_PROC_LOGGING: UInt = 1u

public val MD_CPU_ENABLE_APP_LOGGING: UInt = 4u

public val MD_CPU_ENABLE_CGI_LOGGING: UInt = 2u

public val MD_CPU_ENABLE_EVENT: UInt = 1u

public val MD_CPU_ENABLE_KERNEL_TIME: UInt = 8u

public val MD_CPU_ENABLE_LOGGING: UInt = 2147483648u

public val MD_CPU_ENABLE_PAGE_FAULTS: UInt = 16u

public val MD_CPU_ENABLE_PROC_TYPE: UInt = 2u

public val MD_CPU_ENABLE_TERMINATED_PROCS: UInt = 128u

public val MD_CPU_ENABLE_TOTAL_PROCS: UInt = 32u

public val MD_CPU_ENABLE_USER_TIME: UInt = 4u

public val MD_CPU_KILL_W3WP: UInt = 1u

public val MD_CPU_LIMIT: UInt = 9023u

public val MD_CPU_LIMITS_ENABLED: UInt = 2143u

public val MD_CPU_LIMIT_LOGEVENT: UInt = 2149u

public val MD_CPU_LIMIT_PAUSE: UInt = 2152u

public val MD_CPU_LIMIT_PRIORITY: UInt = 2150u

public val MD_CPU_LIMIT_PROCSTOP: UInt = 2151u

public val MD_CPU_LOGGING_INTERVAL: UInt = 2145u

public val MD_CPU_LOGGING_MASK: UInt = 4507u

public val MD_CPU_LOGGING_OPTIONS: UInt = 2146u

public val MD_CPU_NO_ACTION: UInt = 0u

public val MD_CPU_RESET_INTERVAL: UInt = 2144u

public val MD_CPU_THROTTLE: UInt = 3u

public val MD_CPU_TRACE: UInt = 2u

public val MD_CREATE_PROCESS_AS_USER: UInt = 6035u

public val MD_CREATE_PROC_NEW_CONSOLE: UInt = 6036u

public val MD_CUSTOM_DEPLOYMENT_DATA: UInt = 6055u

public val MD_CUSTOM_ERROR: UInt = 6008u

public val MD_CUSTOM_ERROR_DESC: UInt = 2120u

public val MD_DEFAULT_BACKUP_LOCATION: Pcwstr = w("MDBackUp")

public val MD_DEFAULT_LOAD_FILE: UInt = 6006u

public val MD_DEFAULT_LOGON_DOMAIN: UInt = 6012u

public val MD_DEMAND_START_THRESHOLD: UInt = 9207u

public val MD_DIRBROW_ENABLED: UInt = 2147483648u

public val MD_DIRBROW_LOADDEFAULT: UInt = 1073741824u

public val MD_DIRBROW_LONG_DATE: UInt = 32u

public val MD_DIRBROW_SHOW_DATE: UInt = 2u

public val MD_DIRBROW_SHOW_EXTENSION: UInt = 16u

public val MD_DIRBROW_SHOW_SIZE: UInt = 8u

public val MD_DIRBROW_SHOW_TIME: UInt = 4u

public val MD_DIRECTORY_BROWSING: UInt = 6005u

public val MD_DISABLE_SOCKET_POOLING: UInt = 1029u

public val MD_DONT_LOG: UInt = 6023u

public val MD_DOWNLEVEL_ADMIN_INSTANCE: UInt = 1021u

public val MD_DO_REVERSE_DNS: UInt = 6029u

public val MD_ENABLEDPROTOCOLS: UInt = 2023u

public val MD_ENABLE_URL_AUTHORIZATION: UInt = 6048u

public val MD_ERROR_CANNOT_REMOVE_SECURE_ATTRIBUTE: Int = -2146646008

public val MD_ERROR_DATA_NOT_FOUND: Int = -2146646015

public val MD_ERROR_IISAO_INVALID_SCHEMA: Int = -2146646000

public val MD_ERROR_INVALID_VERSION: Int = -2146646014

public val MD_ERROR_NOT_INITIALIZED: Int = -2146646016

public val MD_ERROR_NO_SESSION_KEY: Int = -2146645987

public val MD_ERROR_READ_METABASE_FILE: Int = -2146645991

public val MD_ERROR_SECURE_CHANNEL_FAILURE: Int = -2146646010

public val MD_ERROR_SUB400_INVALID_CONTENT_LENGTH: UInt = 7u

public val MD_ERROR_SUB400_INVALID_DEPTH: UInt = 2u

public val MD_ERROR_SUB400_INVALID_DESTINATION: UInt = 1u

public val MD_ERROR_SUB400_INVALID_IF: UInt = 3u

public val MD_ERROR_SUB400_INVALID_LOCK_TOKEN: UInt = 9u

public val MD_ERROR_SUB400_INVALID_OVERWRITE: UInt = 4u

public val MD_ERROR_SUB400_INVALID_REQUEST_BODY: UInt = 6u

public val MD_ERROR_SUB400_INVALID_TIMEOUT: UInt = 8u

public val MD_ERROR_SUB400_INVALID_TRANSLATE: UInt = 5u

public val MD_ERROR_SUB400_INVALID_WEBSOCKET_REQUEST: UInt = 11u

public val MD_ERROR_SUB400_INVALID_XFF_HEADER: UInt = 10u

public val MD_ERROR_SUB401_APPLICATION: UInt = 5u

public val MD_ERROR_SUB401_FILTER: UInt = 4u

public val MD_ERROR_SUB401_LOGON: UInt = 1u

public val MD_ERROR_SUB401_LOGON_ACL: UInt = 3u

public val MD_ERROR_SUB401_LOGON_CONFIG: UInt = 2u

public val MD_ERROR_SUB401_URLAUTH_POLICY: UInt = 7u

public val MD_ERROR_SUB403_ADDR_REJECT: UInt = 6u

public val MD_ERROR_SUB403_APPPOOL_DENIED: UInt = 18u

public val MD_ERROR_SUB403_CAL_EXCEEDED: UInt = 15u

public val MD_ERROR_SUB403_CERT_BAD: UInt = 16u

public val MD_ERROR_SUB403_CERT_REQUIRED: UInt = 7u

public val MD_ERROR_SUB403_CERT_REVOKED: UInt = 13u

public val MD_ERROR_SUB403_CERT_TIME_INVALID: UInt = 17u

public val MD_ERROR_SUB403_DIR_LIST_DENIED: UInt = 14u

public val MD_ERROR_SUB403_EXECUTE_ACCESS_DENIED: UInt = 1u

public val MD_ERROR_SUB403_INFINITE_DEPTH_DENIED: UInt = 22u

public val MD_ERROR_SUB403_INSUFFICIENT_PRIVILEGE_FOR_CGI: UInt = 19u

public val MD_ERROR_SUB403_INVALID_CNFG: UInt = 10u

public val MD_ERROR_SUB403_LOCK_TOKEN_REQUIRED: UInt = 23u

public val MD_ERROR_SUB403_MAPPER_DENY_ACCESS: UInt = 12u

public val MD_ERROR_SUB403_PASSPORT_LOGIN_FAILURE: UInt = 20u

public val MD_ERROR_SUB403_PWD_CHANGE: UInt = 11u

public val MD_ERROR_SUB403_READ_ACCESS_DENIED: UInt = 2u

public val MD_ERROR_SUB403_SITE_ACCESS_DENIED: UInt = 8u

public val MD_ERROR_SUB403_SOURCE_ACCESS_DENIED: UInt = 21u

public val MD_ERROR_SUB403_SSL128_REQUIRED: UInt = 5u

public val MD_ERROR_SUB403_SSL_REQUIRED: UInt = 4u

public val MD_ERROR_SUB403_TOO_MANY_USERS: UInt = 9u

public val MD_ERROR_SUB403_VALIDATION_FAILURE: UInt = 24u

public val MD_ERROR_SUB403_WRITE_ACCESS_DENIED: UInt = 3u

public val MD_ERROR_SUB404_DENIED_BY_FILTERING_RULE: UInt = 19u

public val MD_ERROR_SUB404_DENIED_BY_MIMEMAP: UInt = 3u

public val MD_ERROR_SUB404_DENIED_BY_POLICY: UInt = 2u

public val MD_ERROR_SUB404_FILE_ATTRIBUTE_HIDDEN: UInt = 9u

public val MD_ERROR_SUB404_FILE_EXTENSION_DENIED: UInt = 7u

public val MD_ERROR_SUB404_HIDDEN_SEGMENT: UInt = 8u

public val MD_ERROR_SUB404_NO_HANDLER: UInt = 4u

public val MD_ERROR_SUB404_PRECONDITIONED_HANDLER: UInt = 17u

public val MD_ERROR_SUB404_QUERY_STRING_SEQUENCE_DENIED: UInt = 18u

public val MD_ERROR_SUB404_QUERY_STRING_TOO_LONG: UInt = 15u

public val MD_ERROR_SUB404_SITE_NOT_FOUND: UInt = 1u

public val MD_ERROR_SUB404_STATICFILE_DAV: UInt = 16u

public val MD_ERROR_SUB404_TOO_MANY_URL_SEGMENTS: UInt = 20u

public val MD_ERROR_SUB404_URL_DOUBLE_ESCAPED: UInt = 11u

public val MD_ERROR_SUB404_URL_HAS_HIGH_BIT_CHARS: UInt = 12u

public val MD_ERROR_SUB404_URL_SEQUENCE_DENIED: UInt = 5u

public val MD_ERROR_SUB404_URL_TOO_LONG: UInt = 14u

public val MD_ERROR_SUB404_VERB_DENIED: UInt = 6u

public val MD_ERROR_SUB413_CONTENT_LENGTH_TOO_LARGE: UInt = 1u

public val MD_ERROR_SUB423_LOCK_TOKEN_SUBMITTED: UInt = 1u

public val MD_ERROR_SUB423_NO_CONFLICTING_LOCK: UInt = 2u

public val MD_ERROR_SUB500_ASPNET_HANDLERS: UInt = 23u

public val MD_ERROR_SUB500_ASPNET_IMPERSONATION: UInt = 24u

public val MD_ERROR_SUB500_ASPNET_MODULES: UInt = 22u

public val MD_ERROR_SUB500_BAD_METADATA: UInt = 19u

public val MD_ERROR_SUB500_HANDLERS_MODULE: UInt = 21u

public val MD_ERROR_SUB500_UNC_ACCESS: UInt = 16u

public val MD_ERROR_SUB500_URLAUTH_NO_SCOPE: UInt = 20u

public val MD_ERROR_SUB500_URLAUTH_NO_STORE: UInt = 17u

public val MD_ERROR_SUB500_URLAUTH_STORE_ERROR: UInt = 18u

public val MD_ERROR_SUB502_ARR_CONNECTION_ERROR: UInt = 3u

public val MD_ERROR_SUB502_ARR_NO_SERVER: UInt = 4u

public val MD_ERROR_SUB502_PREMATURE_EXIT: UInt = 2u

public val MD_ERROR_SUB502_TIMEOUT: UInt = 1u

public val MD_ERROR_SUB503_APP_CONCURRENT: UInt = 2u

public val MD_ERROR_SUB503_ASPNET_QUEUE_FULL: UInt = 3u

public val MD_ERROR_SUB503_CONNECTION_LIMIT: UInt = 5u

public val MD_ERROR_SUB503_CPU_LIMIT: UInt = 1u

public val MD_ERROR_SUB503_FASTCGI_QUEUE_FULL: UInt = 4u

public val MD_EXIT_MESSAGE: UInt = 5001u

public val MD_EXPORT_INHERITED: UInt = 1u

public val MD_EXPORT_NODE_ONLY: UInt = 2u

public val MD_EXTLOG_BYTES_RECV: UInt = 8192u

public val MD_EXTLOG_BYTES_SENT: UInt = 4096u

public val MD_EXTLOG_CLIENT_IP: UInt = 4u

public val MD_EXTLOG_COMPUTER_NAME: UInt = 32u

public val MD_EXTLOG_COOKIE: UInt = 131072u

public val MD_EXTLOG_DATE: UInt = 1u

public val MD_EXTLOG_HOST: UInt = 1048576u

public val MD_EXTLOG_HTTP_STATUS: UInt = 1024u

public val MD_EXTLOG_HTTP_SUB_STATUS: UInt = 2097152u

public val MD_EXTLOG_METHOD: UInt = 128u

public val MD_EXTLOG_PROTOCOL_VERSION: UInt = 524288u

public val MD_EXTLOG_REFERER: UInt = 262144u

public val MD_EXTLOG_SERVER_IP: UInt = 64u

public val MD_EXTLOG_SERVER_PORT: UInt = 32768u

public val MD_EXTLOG_SITE_NAME: UInt = 16u

public val MD_EXTLOG_TIME: UInt = 2u

public val MD_EXTLOG_TIME_TAKEN: UInt = 16384u

public val MD_EXTLOG_URI_QUERY: UInt = 512u

public val MD_EXTLOG_URI_STEM: UInt = 256u

public val MD_EXTLOG_USERNAME: UInt = 8u

public val MD_EXTLOG_USER_AGENT: UInt = 65536u

public val MD_EXTLOG_WIN32_STATUS: UInt = 2048u

public val MD_FILTER_DESCRIPTION: UInt = 2045u

public val MD_FILTER_ENABLED: UInt = 2043u

public val MD_FILTER_ENABLE_CACHE: UInt = 2046u

public val MD_FILTER_FLAGS: UInt = 2044u

public val MD_FILTER_IMAGE_PATH: UInt = 2041u

public val MD_FILTER_LOAD_ORDER: UInt = 2040u

public val MD_FILTER_STATE: UInt = 2042u

public val MD_FILTER_STATE_LOADED: UInt = 1u

public val MD_FILTER_STATE_UNLOADED: UInt = 4u

public val MD_FOOTER_DOCUMENT: UInt = 6009u

public val MD_FOOTER_ENABLED: UInt = 6010u

public val MD_FRONTPAGE_WEB: UInt = 2072u

public val MD_FTPS_128_BITS: UInt = 5053u

public val MD_FTPS_ALLOW_CCC: UInt = 5054u

public val MD_FTPS_SECURE_ANONYMOUS: UInt = 5052u

public val MD_FTPS_SECURE_CONTROL_CHANNEL: UInt = 5050u

public val MD_FTPS_SECURE_DATA_CHANNEL: UInt = 5051u

public val MD_FTP_KEEP_PARTIAL_UPLOADS: UInt = 5019u

public val MD_FTP_LOG_IN_UTF_8: UInt = 5013u

public val MD_FTP_PASV_RESPONSE_IP: UInt = 5018u

public val MD_FTP_UTF8_FILE_NAMES: UInt = 5020u

public val MD_GLOBAL_BINARY_LOGGING_ENABLED: UInt = 4016u

public val MD_GLOBAL_BINSCHEMATIMESTAMP: UInt = 9991u

public val MD_GLOBAL_CHANGE_NUMBER: UInt = 9997u

public val MD_GLOBAL_EDIT_WHILE_RUNNING_MAJOR_VERSION_NUMBER: UInt = 9994u

public val MD_GLOBAL_EDIT_WHILE_RUNNING_MINOR_VERSION_NUMBER: UInt = 9993u

public val MD_GLOBAL_LOG_IN_UTF_8: UInt = 9206u

public val MD_GLOBAL_SESSIONKEY: UInt = 9999u

public val MD_GLOBAL_STANDARD_APP_MODE_ENABLED: UInt = 9203u

public val MD_GLOBAL_XMLSCHEMATIMESTAMP: UInt = 9992u

public val MD_GREETING_MESSAGE: UInt = 5002u

public val MD_HC_CACHE_CONTROL_HEADER: UInt = 2211u

public val MD_HC_COMPRESSION_BUFFER_SIZE: UInt = 2223u

public val MD_HC_COMPRESSION_DIRECTORY: UInt = 2210u

public val MD_HC_COMPRESSION_DLL: UInt = 2237u

public val MD_HC_CREATE_FLAGS: UInt = 2243u

public val MD_HC_DO_DISK_SPACE_LIMITING: UInt = 2216u

public val MD_HC_DO_DYNAMIC_COMPRESSION: UInt = 2213u

public val MD_HC_DO_NAMESPACE_DYNAMIC_COMPRESSION: UInt = 2255u

public val MD_HC_DO_NAMESPACE_STATIC_COMPRESSION: UInt = 2256u

public val MD_HC_DO_ON_DEMAND_COMPRESSION: UInt = 2215u

public val MD_HC_DO_STATIC_COMPRESSION: UInt = 2214u

public val MD_HC_DYNAMIC_COMPRESSION_LEVEL: UInt = 2241u

public val MD_HC_EXPIRES_HEADER: UInt = 2212u

public val MD_HC_FILES_DELETED_PER_DISK_FREE: UInt = 2225u

public val MD_HC_FILE_EXTENSIONS: UInt = 2238u

public val MD_HC_IO_BUFFER_SIZE: UInt = 2222u

public val MD_HC_MAX_DISK_SPACE_USAGE: UInt = 2221u

public val MD_HC_MAX_QUEUE_LENGTH: UInt = 2224u

public val MD_HC_MIME_TYPE: UInt = 2239u

public val MD_HC_MIN_FILE_SIZE_FOR_COMP: UInt = 2226u

public val MD_HC_NO_COMPRESSION_FOR_HTTP_10: UInt = 2217u

public val MD_HC_NO_COMPRESSION_FOR_PROXIES: UInt = 2218u

public val MD_HC_NO_COMPRESSION_FOR_RANGE: UInt = 2219u

public val MD_HC_ON_DEMAND_COMP_LEVEL: UInt = 2242u

public val MD_HC_PRIORITY: UInt = 2240u

public val MD_HC_SCRIPT_FILE_EXTENSIONS: UInt = 2244u

public val MD_HC_SEND_CACHE_HEADERS: UInt = 2220u

public val MD_HEADER_WAIT_TIMEOUT: UInt = 9204u

public val MD_HISTORY_LATEST: UInt = 1u

public val MD_HTTPERRORS_EXISTING_RESPONSE: UInt = 6056u

public val MD_HTTP_CUSTOM: UInt = 6004u

public val MD_HTTP_EXPIRES: UInt = 6002u

public val MD_HTTP_FORWARDER_CUSTOM: UInt = 6054u

public val MD_HTTP_PICS: UInt = 6003u

public val MD_HTTP_REDIRECT: UInt = 6011u

public val MD_IISADMIN_EXTENSIONS: UInt = 1028u

public val MD_IMPORT_INHERITED: UInt = 1u

public val MD_IMPORT_MERGE: UInt = 4u

public val MD_IMPORT_NODE_ONLY: UInt = 2u

public val MD_INSERT_PATH_STRING: Pcwstr = w("<%INSERT_PATH%>")

public val MD_INSERT_PATH_STRINGA: Pcstr = s("<%INSERT_PATH%>")

public val MD_IN_PROCESS_ISAPI_APPS: UInt = 2073u

public val MD_IP_SEC: UInt = 6019u

public val MD_ISAPI_RESTRICTION_LIST: UInt = 2163u

public val MD_IS_CONTENT_INDEXED: UInt = 6039u

public val MD_KEY_TYPE: UInt = 1002u

public val MD_LEVELS_TO_SCAN: UInt = 1022u

public val MD_LOAD_BALANCER_CAPABILITIES: UInt = 9034u

public val MD_LOAD_BALANCER_CAPABILITIES_BASIC: UInt = 1u

public val MD_LOAD_BALANCER_CAPABILITIES_SOPHISTICATED: UInt = 2u

public val MD_LOCATION: UInt = 9989u

public val MD_LOGCUSTOM_DATATYPE_DOUBLE: UInt = 5u

public val MD_LOGCUSTOM_DATATYPE_FLOAT: UInt = 4u

public val MD_LOGCUSTOM_DATATYPE_INT: UInt = 0u

public val MD_LOGCUSTOM_DATATYPE_LONG: UInt = 2u

public val MD_LOGCUSTOM_DATATYPE_LPSTR: UInt = 6u

public val MD_LOGCUSTOM_DATATYPE_LPWSTR: UInt = 7u

public val MD_LOGCUSTOM_DATATYPE_UINT: UInt = 1u

public val MD_LOGCUSTOM_DATATYPE_ULONG: UInt = 3u

public val MD_LOGCUSTOM_PROPERTY_DATATYPE: UInt = 4505u

public val MD_LOGCUSTOM_PROPERTY_HEADER: UInt = 4502u

public val MD_LOGCUSTOM_PROPERTY_ID: UInt = 4503u

public val MD_LOGCUSTOM_PROPERTY_MASK: UInt = 4504u

public val MD_LOGCUSTOM_PROPERTY_NAME: UInt = 4501u

public val MD_LOGCUSTOM_PROPERTY_NODE_ID: UInt = 4508u

public val MD_LOGCUSTOM_SERVICES_STRING: UInt = 4506u

public val MD_LOGEXT_FIELD_MASK: UInt = 4013u

public val MD_LOGEXT_FIELD_MASK2: UInt = 4014u

public val MD_LOGFILE_DIRECTORY: UInt = 4001u

public val MD_LOGFILE_LOCALTIME_ROLLOVER: UInt = 4015u

public val MD_LOGFILE_PERIOD: UInt = 4003u

public val MD_LOGFILE_PERIOD_DAILY: UInt = 1u

public val MD_LOGFILE_PERIOD_HOURLY: UInt = 4u

public val MD_LOGFILE_PERIOD_MAXSIZE: UInt = 0u

public val MD_LOGFILE_PERIOD_MONTHLY: UInt = 3u

public val MD_LOGFILE_PERIOD_NONE: UInt = 0u

public val MD_LOGFILE_PERIOD_WEEKLY: UInt = 2u

public val MD_LOGFILE_TRUNCATE_SIZE: UInt = 4004u

public val MD_LOGON_BATCH: UInt = 1u

public val MD_LOGON_INTERACTIVE: UInt = 0u

public val MD_LOGON_METHOD: UInt = 6013u

public val MD_LOGON_NETWORK: UInt = 2u

public val MD_LOGON_NETWORK_CLEARTEXT: UInt = 3u

public val MD_LOGSQL_DATA_SOURCES: UInt = 4007u

public val MD_LOGSQL_PASSWORD: UInt = 4010u

public val MD_LOGSQL_TABLE_NAME: UInt = 4008u

public val MD_LOGSQL_USER_NAME: UInt = 4009u

public val MD_LOG_ANONYMOUS: UInt = 5007u

public val MD_LOG_NONANONYMOUS: UInt = 5008u

public val MD_LOG_PLUGINS_AVAILABLE: UInt = 4012u

public val MD_LOG_PLUGIN_MOD_ID: UInt = 4005u

public val MD_LOG_PLUGIN_ORDER: UInt = 4011u

public val MD_LOG_PLUGIN_UI_ID: UInt = 4006u

public val MD_LOG_TYPE: UInt = 4000u

public val MD_LOG_TYPE_DISABLED: UInt = 0u

public val MD_LOG_TYPE_ENABLED: UInt = 1u

public val MD_LOG_UNUSED1: UInt = 4002u

public val MD_MAX_BANDWIDTH: UInt = 1000u

public val MD_MAX_BANDWIDTH_BLOCKED: UInt = 1003u

public val MD_MAX_CHANGE_ENTRIES: UInt = 100u

public val MD_MAX_CLIENTS_MESSAGE: UInt = 5003u

public val MD_MAX_CONNECTIONS: UInt = 1014u

public val MD_MAX_ENDPOINT_CONNECTIONS: UInt = 1024u

public val MD_MAX_ERROR_FILES: UInt = 9988u

public val MD_MAX_GLOBAL_BANDWIDTH: UInt = 9201u

public val MD_MAX_GLOBAL_CONNECTIONS: UInt = 9202u

public val MD_MAX_REQUEST_ENTITY_ALLOWED: UInt = 6051u

public val MD_MD_SERVER_SS_AUTH_MAPPING: UInt = 2200u

public val MD_METADATA_ID_REGISTRATION: UInt = 1030u

public val MD_MIME_MAP: UInt = 6015u

public val MD_MIN_FILE_BYTES_PER_SEC: UInt = 9205u

public val MD_MSDOS_DIR_OUTPUT: UInt = 5004u

public val MD_NETLOGON_WKS_DNS: UInt = 2u

public val MD_NETLOGON_WKS_IP: UInt = 1u

public val MD_NETLOGON_WKS_NONE: UInt = 0u

public val MD_NET_LOGON_WKS: UInt = 2065u

public val MD_NOTIFEXAUTH_NTLMSSL: UInt = 1u

public val MD_NOTIFY_ACCESS_DENIED: UInt = 2048u

public val MD_NOTIFY_AUTHENTICATION: UInt = 8192u

public val MD_NOTIFY_AUTH_COMPLETE: UInt = 67108864u

public val MD_NOTIFY_END_OF_NET_SESSION: UInt = 256u

public val MD_NOTIFY_END_OF_REQUEST: UInt = 128u

public val MD_NOTIFY_LOG: UInt = 512u

public val MD_NOTIFY_NONSECURE_PORT: UInt = 2u

public val MD_NOTIFY_ORDER_DEFAULT: UInt = 131072u

public val MD_NOTIFY_ORDER_HIGH: UInt = 524288u

public val MD_NOTIFY_ORDER_LOW: UInt = 131072u

public val MD_NOTIFY_ORDER_MEDIUM: UInt = 262144u

public val MD_NOTIFY_PREPROC_HEADERS: UInt = 16384u

public val MD_NOTIFY_READ_RAW_DATA: UInt = 32768u

public val MD_NOTIFY_SECURE_PORT: UInt = 1u

public val MD_NOTIFY_SEND_RAW_DATA: UInt = 1024u

public val MD_NOTIFY_SEND_RESPONSE: UInt = 64u

public val MD_NOTIFY_URL_MAP: UInt = 4096u

public val MD_NOT_DELETABLE: UInt = 2116u

public val MD_NTAUTHENTICATION_PROVIDERS: UInt = 6032u

public val MD_PASSIVE_PORT_RANGE: UInt = 5016u

public val MD_PASSPORT_NEED_MAPPING: UInt = 2u

public val MD_PASSPORT_NO_MAPPING: UInt = 0u

public val MD_PASSPORT_REQUIRE_AD_MAPPING: UInt = 6052u

public val MD_PASSPORT_TRY_MAPPING: UInt = 1u

public val MD_POOL_IDC_TIMEOUT: UInt = 6037u

public val MD_PROCESS_NTCR_IF_LOGGED_ON: UInt = 2070u

public val MD_PUT_READ_SIZE: UInt = 6046u

public val MD_RAPID_FAIL_PROTECTION_INTERVAL: UInt = 9029u

public val MD_RAPID_FAIL_PROTECTION_MAX_CRASHES: UInt = 9030u

public val MD_REALM: UInt = 6001u

public val MD_REDIRECT_HEADERS: UInt = 6044u

public val MD_RESTRICTION_LIST_CUSTOM_DESC: UInt = 2165u

public val MD_ROOT_ENABLE_EDIT_WHILE_RUNNING: UInt = 9998u

public val MD_ROOT_ENABLE_HISTORY: UInt = 9996u

public val MD_ROOT_MAX_HISTORY_FILES: UInt = 9995u

public val MD_SCHEMA_METAID: UInt = 1004u

public val MD_SCRIPTMAPFLAG_ALLOWED_ON_READ_DIR: UInt = 1u

public val MD_SCRIPTMAPFLAG_CHECK_PATH_INFO: UInt = 4u

public val MD_SCRIPTMAPFLAG_SCRIPT: UInt = 1u

public val MD_SCRIPT_MAPS: UInt = 6014u

public val MD_SCRIPT_TIMEOUT: UInt = 6033u

public val MD_SECURE_BINDINGS: UInt = 2021u

public val MD_SECURITY_SETUP_REQUIRED: UInt = 2166u

public val MD_SERVER_AUTOSTART: UInt = 1017u

public val MD_SERVER_BINDINGS: UInt = 1023u

public val MD_SERVER_COMMAND: UInt = 1012u

public val MD_SERVER_COMMAND_CONTINUE: UInt = 4u

public val MD_SERVER_COMMAND_PAUSE: UInt = 3u

public val MD_SERVER_COMMAND_START: UInt = 1u

public val MD_SERVER_COMMAND_STOP: UInt = 2u

public val MD_SERVER_COMMENT: UInt = 1015u

public val MD_SERVER_CONFIGURATION_INFO: UInt = 1027u

public val MD_SERVER_CONFIG_ALLOW_ENCRYPT: UInt = 4u

public val MD_SERVER_CONFIG_AUTO_PW_SYNC: UInt = 8u

public val MD_SERVER_CONFIG_SSL_128: UInt = 2u

public val MD_SERVER_CONFIG_SSL_40: UInt = 1u

public val MD_SERVER_LISTEN_BACKLOG: UInt = 1019u

public val MD_SERVER_LISTEN_TIMEOUT: UInt = 1020u

public val MD_SERVER_SIZE: UInt = 1018u

public val MD_SERVER_SIZE_LARGE: UInt = 2u

public val MD_SERVER_SIZE_MEDIUM: UInt = 1u

public val MD_SERVER_SIZE_SMALL: UInt = 0u

public val MD_SERVER_STATE: UInt = 1016u

public val MD_SERVER_STATE_CONTINUING: UInt = 7u

public val MD_SERVER_STATE_PAUSED: UInt = 6u

public val MD_SERVER_STATE_PAUSING: UInt = 5u

public val MD_SERVER_STATE_STARTED: UInt = 2u

public val MD_SERVER_STATE_STARTING: UInt = 1u

public val MD_SERVER_STATE_STOPPED: UInt = 4u

public val MD_SERVER_STATE_STOPPING: UInt = 3u

public val MD_SET_HOST_NAME: UInt = 2154u

public val MD_SHOW_4_DIGIT_YEAR: UInt = 5010u

public val MD_SSI_EXEC_DISABLED: UInt = 6028u

public val MD_SSL_ACCESS_PERM: UInt = 6030u

public val MD_SSL_ALWAYS_NEGO_CLIENT_CERT: UInt = 5521u

public val MD_SSL_KEY_PASSWORD: UInt = 5502u

public val MD_SSL_KEY_REQUEST: UInt = 5503u

public val MD_SSL_PRIVATE_KEY: UInt = 5501u

public val MD_SSL_PUBLIC_KEY: UInt = 5500u

public val MD_SSL_USE_DS_MAPPER: UInt = 5519u

public val MD_STOP_LISTENING: UInt = 9987u

public val MD_SUPPRESS_DEFAULT_BANNER: UInt = 5017u

public val MD_UPLOAD_READAHEAD_SIZE: UInt = 6045u

public val MD_URL_AUTHORIZATION_IMPERSONATION_LEVEL: UInt = 6053u

public val MD_URL_AUTHORIZATION_SCOPE_NAME: UInt = 6050u

public val MD_URL_AUTHORIZATION_STORE_NAME: UInt = 6049u

public val MD_USER_ISOLATION: UInt = 5012u

public val MD_USER_ISOLATION_AD: UInt = 2u

public val MD_USER_ISOLATION_BASIC: UInt = 1u

public val MD_USER_ISOLATION_LAST: UInt = 2u

public val MD_USER_ISOLATION_NONE: UInt = 0u

public val MD_USE_DIGEST_SSP: UInt = 6047u

public val MD_USE_HOST_NAME: UInt = 2066u

public val MD_VR_IGNORE_TRANSLATE: UInt = 3008u

public val MD_VR_NO_CACHE: UInt = 3007u

public val MD_VR_PASSTHROUGH: UInt = 3006u

public val MD_VR_PASSWORD: UInt = 3003u

public val MD_VR_PATH: UInt = 3001u

public val MD_VR_USERNAME: UInt = 3002u

public val MD_WAM_PWD: UInt = 7502u

public val MD_WAM_USER_NAME: UInt = 7501u

public val MD_WARNING_DUP_NAME: Int = 837636

public val MD_WARNING_INVALID_DATA: Int = 837637

public val MD_WARNING_PATH_NOT_FOUND: Int = 837635

public val MD_WARNING_PATH_NOT_INSERTED: Int = 837639

public val MD_WARNING_SAVE_FAILED: Int = 837641

public val MD_WEBDAV_MAX_ATTRIBUTES_PER_ELEMENT: UInt = 8501u

public val MD_WEB_SVC_EXT_RESTRICTION_LIST: UInt = 2168u

public val MD_WIN32_ERROR: UInt = 1099u

public val METADATA_DONT_EXPAND: UInt = 512u

public val METADATA_INHERIT: UInt = 1u

public val METADATA_INSERT_PATH: UInt = 64u

public val METADATA_ISINHERITED: UInt = 32u

public val METADATA_LOCAL_MACHINE_ONLY: UInt = 128u

public val METADATA_MASTER_ROOT_HANDLE: UInt = 0u

public val METADATA_MAX_NAME_LEN: UInt = 256u

public val METADATA_NON_SECURE_ONLY: UInt = 256u

public val METADATA_NO_ATTRIBUTES: UInt = 0u

public val METADATA_PARTIAL_PATH: UInt = 2u

public val METADATA_PERMISSION_READ: UInt = 1u

public val METADATA_PERMISSION_WRITE: UInt = 2u

public val METADATA_REFERENCE: UInt = 8u

public val METADATA_SECURE: UInt = 4u

public val METADATA_VOLATILE: UInt = 16u

public val MSCS_MD_ID_BEGIN_RESERVED: UInt = 53248u

public val MSCS_MD_ID_END_RESERVED: UInt = 57343u

public val MULTISZ_METADATA: Metadatatypes = 5

public val NNTP_MD_ID_BEGIN_RESERVED: UInt = 45056u

public val NNTP_MD_ID_END_RESERVED: UInt = 49151u

public val POP3_MD_ID_BEGIN_RESERVED: UInt = 40960u

public val POP3_MD_ID_END_RESERVED: UInt = 45055u

public val SF_DENIED_APPLICATION: UInt = 8u

public val SF_DENIED_BY_CONFIG: UInt = 65536u

public val SF_DENIED_FILTER: UInt = 4u

public val SF_DENIED_LOGON: UInt = 1u

public val SF_DENIED_RESOURCE: UInt = 2u

public val SF_MAX_AUTH_TYPE: UInt = 33u

public val SF_MAX_FILTER_DESC_LEN: UInt = 257u

public val SF_MAX_PASSWORD: UInt = 257u

public val SF_MAX_USERNAME: UInt = 257u

public val SF_NOTIFY_ACCESS_DENIED: UInt = 2048u

public val SF_NOTIFY_AUTHENTICATION: UInt = 8192u

public val SF_NOTIFY_AUTH_COMPLETE: UInt = 67108864u

public val SF_NOTIFY_END_OF_NET_SESSION: UInt = 256u

public val SF_NOTIFY_END_OF_REQUEST: UInt = 128u

public val SF_NOTIFY_LOG: UInt = 512u

public val SF_NOTIFY_NONSECURE_PORT: UInt = 2u

public val SF_NOTIFY_ORDER_DEFAULT: UInt = 131072u

public val SF_NOTIFY_ORDER_HIGH: UInt = 524288u

public val SF_NOTIFY_ORDER_LOW: UInt = 131072u

public val SF_NOTIFY_ORDER_MEDIUM: UInt = 262144u

public val SF_NOTIFY_PREPROC_HEADERS: UInt = 16384u

public val SF_NOTIFY_READ_RAW_DATA: UInt = 32768u

public val SF_NOTIFY_SECURE_PORT: UInt = 1u

public val SF_NOTIFY_SEND_RAW_DATA: UInt = 1024u

public val SF_NOTIFY_SEND_RESPONSE: UInt = 64u

public val SF_NOTIFY_URL_MAP: UInt = 4096u

public val SF_PROPERTY_INSTANCE_NUM_ID: SfPropertyIis = 1

public val SF_PROPERTY_SSL_CTXT: SfPropertyIis = 0

public val SF_REQ_ADD_HEADERS_ON_DENIAL: SfReqType = 1

public val SF_REQ_DISABLE_NOTIFICATIONS: SfReqType = 8

public val SF_REQ_GET_CONNID: SfReqType = 4

public val SF_REQ_GET_PROPERTY: SfReqType = 6

public val SF_REQ_NORMALIZE_URL: SfReqType = 7

public val SF_REQ_SEND_RESPONSE_HEADER: SfReqType = 0

public val SF_REQ_SET_CERTIFICATE_INFO: SfReqType = 5

public val SF_REQ_SET_NEXT_READ_SIZE: SfReqType = 2

public val SF_REQ_SET_PROXY_INFO: SfReqType = 3

public val SF_STATUS_REQ_ERROR: SfStatusType = 134217732

public val SF_STATUS_REQ_FINISHED: SfStatusType = 134217728

public val SF_STATUS_REQ_FINISHED_KEEP_CONN: SfStatusType = 134217729

public val SF_STATUS_REQ_HANDLED_NOTIFICATION: SfStatusType = 134217731

public val SF_STATUS_REQ_NEXT_NOTIFICATION: SfStatusType = 134217730

public val SF_STATUS_REQ_READ_NEXT: SfStatusType = 134217733

public val SMTP_MD_ID_BEGIN_RESERVED: UInt = 36864u

public val SMTP_MD_ID_END_RESERVED: UInt = 40959u

public val STRING_METADATA: Metadatatypes = 2

public val USER_MD_ID_BASE_RESERVED: UInt = 65535u

public val WAM_MD_ID_BEGIN_RESERVED: UInt = 29952u

public val WAM_MD_ID_END_RESERVED: UInt = 32767u

public val WAM_MD_SERVER_BASE: UInt = 7500u

public val WEBDAV_MD_SERVER_BASE: UInt = 8500u

public val WEB_CORE_ACTIVATE_DLL_ENTRY: Pcstr = s("WebCoreActivate")

public val WEB_CORE_DLL_NAME: Pcwstr = w("hwebcore.dll")

public val WEB_CORE_SET_METADATA_DLL_ENTRY: Pcstr = s("WebCoreSetMetadata")

public val WEB_CORE_SHUTDOWN_DLL_ENTRY: Pcstr = s("WebCoreShutdown")

public val CLSID_I_IMG_CTX: Guid = Guid.fromU128(U128(0x3050f3d698b511cfuL, 0xbb8200aa00bdce0buL))

public val CLSID_IIS_SERVICE_CONTROL: Guid = Guid.fromU128(U128(0xe8fb8621588f11d2uL, 0x9d6100c04f79c5feuL))

public val CLSID_MS_ADMIN_BASE_W: Guid = Guid.fromU128(U128(0xa9e69610b80d11d0uL, 0xb9b900a0c922e750uL))

public val CLSID_REQUEST: Guid = Guid.fromU128(U128(0x920c25d025d911d0uL, 0xa55f00a0c90c2091uL))

public val CLSID_RESPONSE: Guid = Guid.fromU128(U128(0x46e19ba025dd11d0uL, 0xa55f00a0c90c2091uL))

public val CLSID_SCRIPTING_CONTEXT: Guid = Guid.fromU128(U128(0xd97a6da0a86811cfuL, 0x83ae11b0c90c2bd8uL))

public val CLSID_SERVER: Guid = Guid.fromU128(U128(0xa506d16025e011d0uL, 0xa55f00a0c90c2091uL))

public val CLSID_SESSION: Guid = Guid.fromU128(U128(0x509f8f2025de11d0uL, 0xa55f00a0c90c2091uL))

public val CLSID_WAM_ADMIN: Guid = Guid.fromU128(U128(0x61738644f19611d0uL, 0x995300c04fd919c1uL))

public val FTP_PROVIDER: Guid = Guid.fromU128(U128(0x70bdc66733b245f0uL, 0xac52c3ca46f7a656uL))

public val GUID_IIS_ALL_TRACE_PROVIDERS: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))

public val GUID_IIS_ASPNET_TRACE_PROVIDER: Guid = Guid.fromU128(U128(0xaff081fe02474275uL, 0x9c4e021f3dc1da35uL))

public val GUID_IIS_ASP_TRACE_TRACE_PROVIDER: Guid = Guid.fromU128(U128(0x6b94d9ab15e456euL, 0xa4ef37c984a2cb4buL))

public val GUID_IIS_ISAPI_TRACE_PROVIDER: Guid = Guid.fromU128(U128(0xa1c2040e88404c31uL, 0xba119871031a19eauL))

public val GUID_IIS_WWW_GLOBAL_TRACE_PROVIDER: Guid = Guid.fromU128(U128(0xd55d3bc9cba944dfuL, 0x827e132d3a4596c2uL))

public val GUID_IIS_WWW_SERVER_TRACE_PROVIDER: Guid = Guid.fromU128(U128(0x3a2a4e844c214981uL, 0xae103fda0d9b0f83uL))

public val GUID_IIS_WWW_SERVER_V2_TRACE_PROVIDER: Guid = Guid.fromU128(U128(0xde4649c915e84feauL, 0x9d851cdda520c334uL))

public val LIBID_ASP_TYPE_LIBRARY: Guid = Guid.fromU128(U128(0xd97a6da0a85c11cfuL, 0x83ae00a0c90c2bd8uL))

public val LIBID_IISRSTA_LIB: Guid = Guid.fromU128(U128(0xe8fb8614588f11d2uL, 0x9d6100c04f79c5feuL))

public val LIBID_WAMREG_LIB: Guid = Guid.fromU128(U128(0x29822aa8f30211d0uL, 0x995300c04fd919c1uL))
