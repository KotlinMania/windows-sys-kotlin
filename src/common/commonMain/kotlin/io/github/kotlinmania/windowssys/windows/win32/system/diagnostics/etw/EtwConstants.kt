package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ALPC_GUID: Guid = Guid.fromU128(U128(0x45d8cccd539f4b72uL, 0xa8b75c683142609auL))

public val CLSID_TRACE_RELOGGER: Guid = Guid.fromU128(U128(0x7b40792d05ff44c4uL, 0x9058f440c71f17d4uL))

public val C_TRACE_RELOGGER: Guid = Guid.fromU128(U128(0x7b40792d05ff44c4uL, 0x9058f440c71f17d4uL))

public val DIAG_LOGGER_NAMEA: Pcstr = s("DiagLog")

public val DIAG_LOGGER_NAMEW: Pcwstr = w("DiagLog")

public val DECODING_SOURCE_MAX: DecodingSource = 4

public val DECODING_SOURCE_TLG: DecodingSource = 3

public val DECODING_SOURCE_WPP: DecodingSource = 2

public val DECODING_SOURCE_WBEM: DecodingSource = 1

public val DECODING_SOURCE_XML_FILE: DecodingSource = 0

public val DEFAULT_TRACE_SECURITY_GUID: Guid = Guid.fromU128(U128(0x811c1af7a074a06uL, 0x82ed869455cdf713uL))

public val DISK_IO_GUID: Guid = Guid.fromU128(U128(0x3d6fa8d4fe0511d0uL, 0x9dda00c04fd7ba7cuL))

public val ENABLE_TRACE_PARAMETERS_VERSION: UInt = 1u

public val ENABLE_TRACE_PARAMETERS_VERSION_2: UInt = 2u

public val ETW_ASCIICHAR_TYPE_VALUE: UInt = 102u

public val ETW_ASCIISTRING_TYPE_VALUE: UInt = 103u

public val ETW_BOOLEAN_TYPE_VALUE: UInt = 14u

public val ETW_BOOL_TYPE_VALUE: UInt = 108u

public val ETW_BYTE_TYPE_VALUE: UInt = 4u

public val ETW_CHAR_TYPE_VALUE: UInt = 11u

public val ETW_COUNTED_ANSISTRING_TYPE_VALUE: UInt = 109u

public val ETW_COUNTED_STRING_TYPE_VALUE: UInt = 104u

public val ETW_DATETIME_TYPE_VALUE: UInt = 119u

public val ETW_DECIMAL_TYPE_VALUE: UInt = 15u

public val ETW_DOUBLE_TYPE_VALUE: UInt = 13u

public val ETW_GUID_TYPE_VALUE: UInt = 101u

public val ETW_HIDDEN_TYPE_VALUE: UInt = 107u

public val ETW_INT16_TYPE_VALUE: UInt = 5u

public val ETW_INT32_TYPE_VALUE: UInt = 7u

public val ETW_INT64_TYPE_VALUE: UInt = 9u

public val ETW_NON_NULL_TERMINATED_STRING_TYPE_VALUE: UInt = 112u

public val ETW_NULL_TYPE_VALUE: UInt = 0u

public val ETW_OBJECT_TYPE_VALUE: UInt = 1u

public val ETW_POINTER_TYPE_VALUE: UInt = 105u

public val ETW_PROCESS_TRACE_MODE_NONE: EtwProcessTraceModes = 0

public val ETW_PROCESS_TRACE_MODE_RAW_TIMESTAMP: EtwProcessTraceModes = 1

public val ETW_PTVECTOR_TYPE_VALUE: UInt = 117u

public val ETW_REDUCED_ANSISTRING_TYPE_VALUE: UInt = 113u

public val ETW_REDUCED_STRING_TYPE_VALUE: UInt = 114u

public val ETW_REFRENCE_TYPE_VALUE: UInt = 120u

public val ETW_REVERSED_COUNTED_ANSISTRING_TYPE_VALUE: UInt = 111u

public val ETW_REVERSED_COUNTED_STRING_TYPE_VALUE: UInt = 110u

public val ETW_SBYTE_TYPE_VALUE: UInt = 3u

public val ETW_SID_TYPE_VALUE: UInt = 115u

public val ETW_SINGLE_TYPE_VALUE: UInt = 12u

public val ETW_SIZET_TYPE_VALUE: UInt = 106u

public val ETW_STRING_TYPE_VALUE: UInt = 2u

public val ETW_UINT16_TYPE_VALUE: UInt = 6u

public val ETW_UINT32_TYPE_VALUE: UInt = 8u

public val ETW_UINT64_TYPE_VALUE: UInt = 10u

public val ETW_VARIANT_TYPE_VALUE: UInt = 116u

public val ETW_WMITIME_TYPE_VALUE: UInt = 118u

public val EVENTMAP_ENTRY_VALUETYPE_STRING: MapValuetype = 1

public val EVENTMAP_ENTRY_VALUETYPE_ULONG: MapValuetype = 0

public val EVENTMAP_INFO_FLAG_MANIFEST_BITMAP: MapFlags = 2

public val EVENTMAP_INFO_FLAG_MANIFEST_PATTERNMAP: MapFlags = 4

public val EVENTMAP_INFO_FLAG_MANIFEST_VALUEMAP: MapFlags = 1

public val EVENTMAP_INFO_FLAG_WBEM_BITMAP: MapFlags = 16

public val EVENTMAP_INFO_FLAG_WBEM_FLAG: MapFlags = 32

public val EVENTMAP_INFO_FLAG_WBEM_NO_MAP: MapFlags = 64

public val EVENTMAP_INFO_FLAG_WBEM_VALUEMAP: MapFlags = 8

public val EVENT_ACTIVITY_CTRL_CREATE_ID: UInt = 3u

public val EVENT_ACTIVITY_CTRL_CREATE_SET_ID: UInt = 5u

public val EVENT_ACTIVITY_CTRL_GET_ID: UInt = 1u

public val EVENT_ACTIVITY_CTRL_GET_SET_ID: UInt = 4u

public val EVENT_ACTIVITY_CTRL_SET_ID: UInt = 2u

public val EVENT_CONTROL_CODE_CAPTURE_STATE: EnablecallbackEnabledState = 2u

public val EVENT_CONTROL_CODE_DISABLE_PROVIDER: EnablecallbackEnabledState = 0u

public val EVENT_CONTROL_CODE_ENABLE_PROVIDER: EnablecallbackEnabledState = 1u

public val EVENT_DATA_DESCRIPTOR_TYPE_EVENT_METADATA: UInt = 1u

public val EVENT_DATA_DESCRIPTOR_TYPE_NONE: UInt = 0u

public val EVENT_DATA_DESCRIPTOR_TYPE_PROVIDER_METADATA: UInt = 2u

public val EVENT_DATA_DESCRIPTOR_TYPE_TIMESTAMP_OVERRIDE: UInt = 3u

public val EVENT_ENABLE_PROPERTY_ENABLE_KEYWORD_0: UInt = 64u

public val EVENT_ENABLE_PROPERTY_ENABLE_SILOS: UInt = 1024u

public val EVENT_ENABLE_PROPERTY_EVENT_KEY: UInt = 256u

public val EVENT_ENABLE_PROPERTY_EXCLUDE_INPRIVATE: UInt = 512u

public val EVENT_ENABLE_PROPERTY_IGNORE_KEYWORD_0: UInt = 16u

public val EVENT_ENABLE_PROPERTY_PROCESS_START_KEY: UInt = 128u

public val EVENT_ENABLE_PROPERTY_PROVIDER_GROUP: UInt = 32u

public val EVENT_ENABLE_PROPERTY_PSM_KEY: UInt = 8u

public val EVENT_ENABLE_PROPERTY_SID: UInt = 1u

public val EVENT_ENABLE_PROPERTY_SOURCE_CONTAINER_TRACKING: UInt = 2048u

public val EVENT_ENABLE_PROPERTY_STACK_TRACE: UInt = 4u

public val EVENT_ENABLE_PROPERTY_TS_ID: UInt = 2u

public val EVENT_FILTER_TYPE_CONTAINER: UInt = 2147516416u

public val EVENT_FILTER_TYPE_EVENT_ID: UInt = 2147484160u

public val EVENT_FILTER_TYPE_EVENT_NAME: UInt = 2147484672u

public val EVENT_FILTER_TYPE_EXECUTABLE_NAME: UInt = 2147483656u

public val EVENT_FILTER_TYPE_NONE: UInt = 0u

public val EVENT_FILTER_TYPE_PACKAGE_APP_ID: UInt = 2147483680u

public val EVENT_FILTER_TYPE_PACKAGE_ID: UInt = 2147483664u

public val EVENT_FILTER_TYPE_PAYLOAD: UInt = 2147483904u

public val EVENT_FILTER_TYPE_PID: UInt = 2147483652u

public val EVENT_FILTER_TYPE_SCHEMATIZED: UInt = 2147483648u

public val EVENT_FILTER_TYPE_STACKWALK: UInt = 2147487744u

public val EVENT_FILTER_TYPE_STACKWALK_LEVEL_KW: UInt = 2147500032u

public val EVENT_FILTER_TYPE_STACKWALK_NAME: UInt = 2147491840u

public val EVENT_FILTER_TYPE_SYSTEM_FLAGS: UInt = 2147483649u

public val EVENT_FILTER_TYPE_TRACEHANDLE: UInt = 2147483650u

public val EVENT_HEADER_EXT_TYPE_CONTAINER_ID: UInt = 16u

public val EVENT_HEADER_EXT_TYPE_CONTROL_GUID: UInt = 14u

public val EVENT_HEADER_EXT_TYPE_EVENT_KEY: UInt = 10u

public val EVENT_HEADER_EXT_TYPE_EVENT_SCHEMA_TL: UInt = 11u

public val EVENT_HEADER_EXT_TYPE_INSTANCE_INFO: UInt = 4u

public val EVENT_HEADER_EXT_TYPE_MAX: UInt = 19u

public val EVENT_HEADER_EXT_TYPE_PEBS_INDEX: UInt = 7u

public val EVENT_HEADER_EXT_TYPE_PMC_COUNTERS: UInt = 8u

public val EVENT_HEADER_EXT_TYPE_PROCESS_START_KEY: UInt = 13u

public val EVENT_HEADER_EXT_TYPE_PROV_TRAITS: UInt = 12u

public val EVENT_HEADER_EXT_TYPE_PSM_KEY: UInt = 9u

public val EVENT_HEADER_EXT_TYPE_QPC_DELTA: UInt = 15u

public val EVENT_HEADER_EXT_TYPE_RELATED_ACTIVITYID: UInt = 1u

public val EVENT_HEADER_EXT_TYPE_SID: UInt = 2u

public val EVENT_HEADER_EXT_TYPE_STACK_KEY32: UInt = 17u

public val EVENT_HEADER_EXT_TYPE_STACK_KEY64: UInt = 18u

public val EVENT_HEADER_EXT_TYPE_STACK_TRACE32: UInt = 5u

public val EVENT_HEADER_EXT_TYPE_STACK_TRACE64: UInt = 6u

public val EVENT_HEADER_EXT_TYPE_TS_ID: UInt = 3u

public val EVENT_HEADER_FLAG_32_BIT_HEADER: UInt = 32u

public val EVENT_HEADER_FLAG_64_BIT_HEADER: UInt = 64u

public val EVENT_HEADER_FLAG_CLASSIC_HEADER: UInt = 256u

public val EVENT_HEADER_FLAG_DECODE_GUID: UInt = 128u

public val EVENT_HEADER_FLAG_EXTENDED_INFO: UInt = 1u

public val EVENT_HEADER_FLAG_NO_CPUTIME: UInt = 16u

public val EVENT_HEADER_FLAG_PRIVATE_SESSION: UInt = 2u

public val EVENT_HEADER_FLAG_PROCESSOR_INDEX: UInt = 512u

public val EVENT_HEADER_FLAG_STRING_ONLY: UInt = 4u

public val EVENT_HEADER_FLAG_TRACE_MESSAGE: UInt = 8u

public val EVENT_HEADER_PROPERTY_FORWARDED_XML: UInt = 2u

public val EVENT_HEADER_PROPERTY_LEGACY_EVENTLOG: UInt = 4u

public val EVENT_HEADER_PROPERTY_RELOGGABLE: UInt = 8u

public val EVENT_HEADER_PROPERTY_XML: UInt = 1u

public val EVENT_LOGGER_NAME: Pcwstr = w("EventLog")

public val EVENT_LOGGER_NAMEA: Pcstr = s("EventLog")

public val EVENT_LOGGER_NAMEW: Pcwstr = w("EventLog")

public val EVENT_MAX_LEVEL: UInt = 255u

public val EVENT_MIN_LEVEL: UInt = 0u

public val EVENT_TRACE_ADDTO_TRIAGE_DUMP: UInt = 2147483648u

public val EVENT_TRACE_ADD_HEADER_MODE: UInt = 4096u

public val EVENT_TRACE_BUFFERING_MODE: UInt = 1024u

public val EVENT_TRACE_COMPRESSED_MODE: UInt = 67108864u

public val EVENT_TRACE_CONTROL_CONVERT_TO_REALTIME: UInt = 5u

public val EVENT_TRACE_CONTROL_FLUSH: EventTraceControl = 3u

public val EVENT_TRACE_CONTROL_INCREMENT_FILE: UInt = 4u

public val EVENT_TRACE_CONTROL_QUERY: EventTraceControl = 0u

public val EVENT_TRACE_CONTROL_STOP: EventTraceControl = 1u

public val EVENT_TRACE_CONTROL_UPDATE: EventTraceControl = 2u

public val EVENT_TRACE_DELAY_OPEN_FILE_MODE: UInt = 512u

public val EVENT_TRACE_FILE_MODE_APPEND: UInt = 4u

public val EVENT_TRACE_FILE_MODE_CIRCULAR: UInt = 2u

public val EVENT_TRACE_FILE_MODE_NEWFILE: UInt = 8u

public val EVENT_TRACE_FILE_MODE_NONE: UInt = 0u

public val EVENT_TRACE_FILE_MODE_PREALLOCATE: UInt = 32u

public val EVENT_TRACE_FILE_MODE_SEQUENTIAL: UInt = 1u

public val EVENT_TRACE_FLAG_ALPC: EventTraceFlag = 1048576u

public val EVENT_TRACE_FLAG_CSWITCH: EventTraceFlag = 16u

public val EVENT_TRACE_FLAG_DBGPRINT: EventTraceFlag = 262144u

public val EVENT_TRACE_FLAG_DEBUG_EVENTS: UInt = 4194304u

public val EVENT_TRACE_FLAG_DISK_FILE_IO: EventTraceFlag = 512u

public val EVENT_TRACE_FLAG_DISK_IO: EventTraceFlag = 256u

public val EVENT_TRACE_FLAG_DISK_IO_INIT: EventTraceFlag = 1024u

public val EVENT_TRACE_FLAG_DISPATCHER: EventTraceFlag = 2048u

public val EVENT_TRACE_FLAG_DPC: EventTraceFlag = 32u

public val EVENT_TRACE_FLAG_DRIVER: EventTraceFlag = 8388608u

public val EVENT_TRACE_FLAG_ENABLE_RESERVE: UInt = 536870912u

public val EVENT_TRACE_FLAG_EXTENSION: UInt = 2147483648u

public val EVENT_TRACE_FLAG_FILE_IO: EventTraceFlag = 33554432u

public val EVENT_TRACE_FLAG_FILE_IO_INIT: EventTraceFlag = 67108864u

public val EVENT_TRACE_FLAG_FORWARD_WMI: UInt = 1073741824u

public val EVENT_TRACE_FLAG_IMAGE_LOAD: EventTraceFlag = 4u

public val EVENT_TRACE_FLAG_INTERRUPT: EventTraceFlag = 64u

public val EVENT_TRACE_FLAG_JOB: EventTraceFlag = 524288u

public val EVENT_TRACE_FLAG_MEMORY_HARD_FAULTS: EventTraceFlag = 8192u

public val EVENT_TRACE_FLAG_MEMORY_PAGE_FAULTS: EventTraceFlag = 4096u

public val EVENT_TRACE_FLAG_NETWORK_TCPIP: EventTraceFlag = 65536u

public val EVENT_TRACE_FLAG_NO_SYSCONFIG: EventTraceFlag = 268435456u

public val EVENT_TRACE_FLAG_PROCESS: EventTraceFlag = 1u

public val EVENT_TRACE_FLAG_PROCESS_COUNTERS: EventTraceFlag = 8u

public val EVENT_TRACE_FLAG_PROFILE: EventTraceFlag = 16777216u

public val EVENT_TRACE_FLAG_REGISTRY: EventTraceFlag = 131072u

public val EVENT_TRACE_FLAG_SPLIT_IO: EventTraceFlag = 2097152u

public val EVENT_TRACE_FLAG_SYSTEMCALL: EventTraceFlag = 128u

public val EVENT_TRACE_FLAG_THREAD: EventTraceFlag = 2u

public val EVENT_TRACE_FLAG_VAMAP: EventTraceFlag = 32768u

public val EVENT_TRACE_FLAG_VIRTUAL_ALLOC: EventTraceFlag = 16384u

public val EVENT_TRACE_INDEPENDENT_SESSION_MODE: UInt = 134217728u

public val EVENT_TRACE_MODE_RESERVED: UInt = 1048576u

public val EVENT_TRACE_NONSTOPPABLE_MODE: UInt = 64u

public val EVENT_TRACE_NO_PER_PROCESSOR_BUFFERING: UInt = 268435456u

public val EVENT_TRACE_PERSIST_ON_HYBRID_SHUTDOWN: UInt = 8388608u

public val EVENT_TRACE_PRIVATE_IN_PROC: UInt = 131072u

public val EVENT_TRACE_PRIVATE_LOGGER_MODE: UInt = 2048u

public val EVENT_TRACE_REAL_TIME_MODE: UInt = 256u

public val EVENT_TRACE_RELOG_MODE: UInt = 65536u

public val EVENT_TRACE_SECURE_MODE: UInt = 128u

public val EVENT_TRACE_STOP_ON_HYBRID_SHUTDOWN: UInt = 4194304u

public val EVENT_TRACE_SYSTEM_LOGGER_MODE: UInt = 33554432u

public val EVENT_TRACE_TYPE_ACCEPT: UInt = 15u

public val EVENT_TRACE_TYPE_ACKDUP: UInt = 22u

public val EVENT_TRACE_TYPE_ACKFULL: UInt = 20u

public val EVENT_TRACE_TYPE_ACKPART: UInt = 21u

public val EVENT_TRACE_TYPE_CHECKPOINT: UInt = 8u

public val EVENT_TRACE_TYPE_CONFIG: UInt = 11u

public val EVENT_TRACE_TYPE_CONFIG_BOOT: UInt = 37u

public val EVENT_TRACE_TYPE_CONFIG_CI_INFO: UInt = 29u

public val EVENT_TRACE_TYPE_CONFIG_CPU: UInt = 10u

public val EVENT_TRACE_TYPE_CONFIG_DEFRAG: UInt = 31u

public val EVENT_TRACE_TYPE_CONFIG_DEVICEFAMILY: UInt = 33u

public val EVENT_TRACE_TYPE_CONFIG_DPI: UInt = 28u

public val EVENT_TRACE_TYPE_CONFIG_FLIGHTID: UInt = 34u

public val EVENT_TRACE_TYPE_CONFIG_IDECHANNEL: UInt = 23u

public val EVENT_TRACE_TYPE_CONFIG_IRQ: UInt = 21u

public val EVENT_TRACE_TYPE_CONFIG_LOGICALDISK: UInt = 12u

public val EVENT_TRACE_TYPE_CONFIG_MACHINEID: UInt = 30u

public val EVENT_TRACE_TYPE_CONFIG_MOBILEPLATFORM: UInt = 32u

public val EVENT_TRACE_TYPE_CONFIG_NETINFO: UInt = 17u

public val EVENT_TRACE_TYPE_CONFIG_NIC: UInt = 13u

public val EVENT_TRACE_TYPE_CONFIG_NUMANODE: UInt = 24u

public val EVENT_TRACE_TYPE_CONFIG_OPTICALMEDIA: UInt = 18u

public val EVENT_TRACE_TYPE_CONFIG_PHYSICALDISK: UInt = 11u

public val EVENT_TRACE_TYPE_CONFIG_PHYSICALDISK_EX: UInt = 19u

public val EVENT_TRACE_TYPE_CONFIG_PLATFORM: UInt = 25u

public val EVENT_TRACE_TYPE_CONFIG_PNP: UInt = 22u

public val EVENT_TRACE_TYPE_CONFIG_POWER: UInt = 16u

public val EVENT_TRACE_TYPE_CONFIG_PROCESSOR: UInt = 35u

public val EVENT_TRACE_TYPE_CONFIG_PROCESSORGROUP: UInt = 26u

public val EVENT_TRACE_TYPE_CONFIG_PROCESSORNUMBER: UInt = 27u

public val EVENT_TRACE_TYPE_CONFIG_SERVICES: UInt = 15u

public val EVENT_TRACE_TYPE_CONFIG_VIDEO: UInt = 14u

public val EVENT_TRACE_TYPE_CONFIG_VIRTUALIZATION: UInt = 36u

public val EVENT_TRACE_TYPE_CONNECT: UInt = 12u

public val EVENT_TRACE_TYPE_CONNFAIL: UInt = 17u

public val EVENT_TRACE_TYPE_COPY_ARP: UInt = 19u

public val EVENT_TRACE_TYPE_COPY_TCP: UInt = 18u

public val EVENT_TRACE_TYPE_DBGID_RSDS: UInt = 64u

public val EVENT_TRACE_TYPE_DC_END: UInt = 4u

public val EVENT_TRACE_TYPE_DC_START: UInt = 3u

public val EVENT_TRACE_TYPE_DEQUEUE: UInt = 7u

public val EVENT_TRACE_TYPE_DISCONNECT: UInt = 13u

public val EVENT_TRACE_TYPE_END: UInt = 2u

public val EVENT_TRACE_TYPE_EXTENSION: UInt = 5u

public val EVENT_TRACE_TYPE_FLT_POSTOP_COMPLETION: UInt = 99u

public val EVENT_TRACE_TYPE_FLT_POSTOP_FAILURE: UInt = 101u

public val EVENT_TRACE_TYPE_FLT_POSTOP_INIT: UInt = 97u

public val EVENT_TRACE_TYPE_FLT_PREOP_COMPLETION: UInt = 98u

public val EVENT_TRACE_TYPE_FLT_PREOP_FAILURE: UInt = 100u

public val EVENT_TRACE_TYPE_FLT_PREOP_INIT: UInt = 96u

public val EVENT_TRACE_TYPE_GUIDMAP: UInt = 10u

public val EVENT_TRACE_TYPE_INFO: UInt = 0u

public val EVENT_TRACE_TYPE_IO_FLUSH: UInt = 14u

public val EVENT_TRACE_TYPE_IO_FLUSH_INIT: UInt = 15u

public val EVENT_TRACE_TYPE_IO_READ: UInt = 10u

public val EVENT_TRACE_TYPE_IO_READ_INIT: UInt = 12u

public val EVENT_TRACE_TYPE_IO_REDIRECTED_INIT: UInt = 16u

public val EVENT_TRACE_TYPE_IO_WRITE: UInt = 11u

public val EVENT_TRACE_TYPE_IO_WRITE_INIT: UInt = 13u

public val EVENT_TRACE_TYPE_LOAD: UInt = 10u

public val EVENT_TRACE_TYPE_MM_AV: UInt = 15u

public val EVENT_TRACE_TYPE_MM_COW: UInt = 12u

public val EVENT_TRACE_TYPE_MM_DZF: UInt = 11u

public val EVENT_TRACE_TYPE_MM_GPF: UInt = 13u

public val EVENT_TRACE_TYPE_MM_HPF: UInt = 14u

public val EVENT_TRACE_TYPE_MM_TF: UInt = 10u

public val EVENT_TRACE_TYPE_OPTICAL_IO_FLUSH: UInt = 57u

public val EVENT_TRACE_TYPE_OPTICAL_IO_FLUSH_INIT: UInt = 60u

public val EVENT_TRACE_TYPE_OPTICAL_IO_READ: UInt = 55u

public val EVENT_TRACE_TYPE_OPTICAL_IO_READ_INIT: UInt = 58u

public val EVENT_TRACE_TYPE_OPTICAL_IO_WRITE: UInt = 56u

public val EVENT_TRACE_TYPE_OPTICAL_IO_WRITE_INIT: UInt = 59u

public val EVENT_TRACE_TYPE_RECEIVE: UInt = 11u

public val EVENT_TRACE_TYPE_RECONNECT: UInt = 16u

public val EVENT_TRACE_TYPE_REGCLOSE: UInt = 27u

public val EVENT_TRACE_TYPE_REGCOMMIT: UInt = 30u

public val EVENT_TRACE_TYPE_REGCREATE: UInt = 10u

public val EVENT_TRACE_TYPE_REGDELETE: UInt = 12u

public val EVENT_TRACE_TYPE_REGDELETEVALUE: UInt = 15u

public val EVENT_TRACE_TYPE_REGENUMERATEKEY: UInt = 17u

public val EVENT_TRACE_TYPE_REGENUMERATEVALUEKEY: UInt = 18u

public val EVENT_TRACE_TYPE_REGFLUSH: UInt = 21u

public val EVENT_TRACE_TYPE_REGKCBCREATE: UInt = 22u

public val EVENT_TRACE_TYPE_REGKCBDELETE: UInt = 23u

public val EVENT_TRACE_TYPE_REGKCBRUNDOWNBEGIN: UInt = 24u

public val EVENT_TRACE_TYPE_REGKCBRUNDOWNEND: UInt = 25u

public val EVENT_TRACE_TYPE_REGMOUNTHIVE: UInt = 33u

public val EVENT_TRACE_TYPE_REGOPEN: UInt = 11u

public val EVENT_TRACE_TYPE_REGPREPARE: UInt = 31u

public val EVENT_TRACE_TYPE_REGQUERY: UInt = 13u

public val EVENT_TRACE_TYPE_REGQUERYMULTIPLEVALUE: UInt = 19u

public val EVENT_TRACE_TYPE_REGQUERYSECURITY: UInt = 29u

public val EVENT_TRACE_TYPE_REGQUERYVALUE: UInt = 16u

public val EVENT_TRACE_TYPE_REGROLLBACK: UInt = 32u

public val EVENT_TRACE_TYPE_REGSETINFORMATION: UInt = 20u

public val EVENT_TRACE_TYPE_REGSETSECURITY: UInt = 28u

public val EVENT_TRACE_TYPE_REGSETVALUE: UInt = 14u

public val EVENT_TRACE_TYPE_REGVIRTUALIZE: UInt = 26u

public val EVENT_TRACE_TYPE_REPLY: UInt = 6u

public val EVENT_TRACE_TYPE_RESUME: UInt = 7u

public val EVENT_TRACE_TYPE_RETRANSMIT: UInt = 14u

public val EVENT_TRACE_TYPE_SECURITY: UInt = 13u

public val EVENT_TRACE_TYPE_SEND: UInt = 10u

public val EVENT_TRACE_TYPE_SIDINFO: UInt = 12u

public val EVENT_TRACE_TYPE_START: UInt = 1u

public val EVENT_TRACE_TYPE_STOP: UInt = 2u

public val EVENT_TRACE_TYPE_SUSPEND: UInt = 8u

public val EVENT_TRACE_TYPE_TERMINATE: UInt = 11u

public val EVENT_TRACE_TYPE_WINEVT_RECEIVE: UInt = 240u

public val EVENT_TRACE_TYPE_WINEVT_SEND: UInt = 9u

public val EVENT_TRACE_USE_GLOBAL_SEQUENCE: UInt = 16384u

public val EVENT_TRACE_USE_KBYTES_FOR_SIZE: UInt = 8192u

public val EVENT_TRACE_USE_LOCAL_SEQUENCE: UInt = 32768u

public val EVENT_TRACE_USE_NOCPUTIME: UInt = 2u

public val EVENT_TRACE_USE_PAGED_MEMORY: UInt = 16777216u

public val EVENT_TRACE_USE_PROCTIME: UInt = 1u

public val EVENT_WRITE_FLAG_INPRIVATE: UInt = 2u

public val EVENT_WRITE_FLAG_NO_FAULTING: UInt = 1u

public val ETW_COMPRESSION_MODE_NO_DISABLE: EtwCompressionResumptionMode = 1

public val ETW_COMPRESSION_MODE_NO_RESTART: EtwCompressionResumptionMode = 2

public val ETW_COMPRESSION_MODE_RESTART: EtwCompressionResumptionMode = 0

public val ETW_PMC_OWNER_FREE: EtwPmcCounterOwnerType = 0

public val ETW_PMC_OWNER_TAGGED: EtwPmcCounterOwnerType = 2

public val ETW_PMC_OWNER_TAGGED_WITH_SOURCE: EtwPmcCounterOwnerType = 3

public val ETW_PMC_OWNER_UNTAGGED: EtwPmcCounterOwnerType = 1

public val ETW_PROVIDER_TRAIT_DECODE_GUID: EtwProviderTraitType = 2

public val ETW_PROVIDER_TRAIT_TYPE_GROUP: EtwProviderTraitType = 1

public val ETW_PROVIDER_TRAIT_TYPE_MAX: EtwProviderTraitType = 3

public val ETW_QUERY_LAST_DROPPED_TIMES: EtwProcessHandleInfoType = 3

public val ETW_QUERY_LOG_FILE_HEADER: EtwProcessHandleInfoType = 4

public val ETW_QUERY_PARTITION_INFORMATION: EtwProcessHandleInfoType = 1

public val ETW_QUERY_PARTITION_INFORMATION_V2: EtwProcessHandleInfoType = 2

public val ETW_QUERY_PROCESS_HANDLE_INFO_MAX: EtwProcessHandleInfoType = 5

public val EVENT_CHANNEL_INFORMATION: EventFieldType = 2

public val EVENT_INFORMATION_MAX: EventFieldType = 5

public val EVENT_KEYWORD_INFORMATION: EventFieldType = 0

public val EVENT_LEVEL_INFORMATION: EventFieldType = 1

public val EVENT_OPCODE_INFORMATION: EventFieldType = 4

public val EVENT_PROVIDER_BINARY_TRACK_INFO: EventInfoClass = 0

public val EVENT_PROVIDER_SET_RESERVED1: EventInfoClass = 1

public val EVENT_PROVIDER_SET_TRAITS: EventInfoClass = 2

public val EVENT_PROVIDER_USE_DESCRIPTOR_TYPE: EventInfoClass = 3

public val EVENT_SECURITY_ADD_DACL: Eventsecurityoperation = 2

public val EVENT_SECURITY_ADD_SACL: Eventsecurityoperation = 3

public val EVENT_SECURITY_MAX: Eventsecurityoperation = 4

public val EVENT_SECURITY_SET_DACL: Eventsecurityoperation = 0

public val EVENT_SECURITY_SET_SACL: Eventsecurityoperation = 1

public val EVENT_TASK_INFORMATION: EventFieldType = 3

public val EVENT_TRACE_CONFIG_GUID: Guid = Guid.fromU128(U128(0x1853a65418f4f36uL, 0xaefcdc0f1d2fd235uL))

public val EVENT_TRACE_GUID: Guid = Guid.fromU128(U128(0x68fdd9004a3e11d1uL, 0x84f40000f80464e3uL))

public val FILE_IO_GUID: Guid = Guid.fromU128(U128(0x90cbdc394a3e11d1uL, 0x84f40000f80464e3uL))

public val GLOBAL_LOGGER_NAME: Pcwstr = w("GlobalLogger")

public val GLOBAL_LOGGER_NAMEA: Pcstr = s("GlobalLogger")

public val GLOBAL_LOGGER_NAMEW: Pcwstr = w("GlobalLogger")

public val IMAGE_LOAD_GUID: Guid = Guid.fromU128(U128(0x2cb15d1d5fc111d2uL, 0xabe100a0c911f518uL))

public val KERNEL_LOGGER_NAME: Pcwstr = w("NT Kernel Logger")

public val KERNEL_LOGGER_NAMEA: Pcstr = s("NT Kernel Logger")

public val KERNEL_LOGGER_NAMEW: Pcwstr = w("NT Kernel Logger")

public val MAX_EVENT_DATA_DESCRIPTORS: UInt = 128u

public val MAX_EVENT_FILTERS_COUNT: UInt = 13u

public val MAX_EVENT_FILTER_DATA_SIZE: UInt = 1024u

public val MAX_EVENT_FILTER_EVENT_ID_COUNT: UInt = 64u

public val MAX_EVENT_FILTER_EVENT_NAME_SIZE: UInt = 4096u

public val MAX_EVENT_FILTER_PAYLOAD_SIZE: UInt = 4096u

public val MAX_EVENT_FILTER_PID_COUNT: UInt = 8u

public val MAX_MOF_FIELDS: UInt = 16u

public val MAX_PAYLOAD_PREDICATES: UInt = 8u

public val MAX_EVENT_INFO: EventInfoClass = 4

public val MAX_TRACE_SET_INFO_CLASS: TraceQueryInfoClass = 28

public val PAYLOADFIELD_BETWEEN: PayloadOperator = 6

public val PAYLOADFIELD_CONTAINS: PayloadOperator = 20

public val PAYLOADFIELD_DOESNTCONTAIN: PayloadOperator = 21

public val PAYLOADFIELD_EQ: PayloadOperator = 0

public val PAYLOADFIELD_GE: PayloadOperator = 5

public val PAYLOADFIELD_GT: PayloadOperator = 3

public val PAYLOADFIELD_INVALID: PayloadOperator = 32

public val PAYLOADFIELD_IS: PayloadOperator = 30

public val PAYLOADFIELD_ISNOT: PayloadOperator = 31

public val PAYLOADFIELD_LE: PayloadOperator = 2

public val PAYLOADFIELD_LT: PayloadOperator = 4

public val PAYLOADFIELD_MODULO: PayloadOperator = 8

public val PAYLOADFIELD_NE: PayloadOperator = 1

public val PAYLOADFIELD_NOTBETWEEN: PayloadOperator = 7

public val PROCESS_TRACE_MODE_EVENT_RECORD: UInt = 268435456u

public val PROCESS_TRACE_MODE_RAW_TIMESTAMP: UInt = 4096u

public val PROCESS_TRACE_MODE_REAL_TIME: UInt = 256u

public val PAGE_FAULT_GUID: Guid = Guid.fromU128(U128(0x3d6fa8d3fe0511d0uL, 0x9dda00c04fd7ba7cuL))

public val PERF_INFO_GUID: Guid = Guid.fromU128(U128(0xce1dbfb4137e4da6uL, 0x87b03f59aa102cbcuL))

public val PRIVATE_LOGGER_NOTIFICATION_GUID: Guid = Guid.fromU128(U128(0x3595ab5c042a4c8euL, 0xb9422d059bfeb1b1uL))

public val PROCESS_GUID: Guid = Guid.fromU128(U128(0x3d6fa8d0fe0511d0uL, 0x9dda00c04fd7ba7cuL))

public val PROPERTY_HAS_CUSTOM_SCHEMA: PropertyFlags = 128

public val PROPERTY_HAS_TAGS: PropertyFlags = 64

public val PROPERTY_PARAM_COUNT: PropertyFlags = 4

public val PROPERTY_PARAM_FIXED_COUNT: PropertyFlags = 32

public val PROPERTY_PARAM_FIXED_LENGTH: PropertyFlags = 16

public val PROPERTY_PARAM_LENGTH: PropertyFlags = 2

public val PROPERTY_STRUCT: PropertyFlags = 1

public val PROPERTY_WBEM_XML_FRAGMENT: PropertyFlags = 8

public val REGISTRY_GUID: Guid = Guid.fromU128(U128(0xae53722ec86311d2uL, 0x865900c04fa321a1uL))

public val SYSTEM_ALPC_KW_GENERAL: ULong = 1uL

public val SYSTEM_CONFIG_KW_GRAPHICS: ULong = 2uL

public val SYSTEM_CONFIG_KW_NETWORK: ULong = 8uL

public val SYSTEM_CONFIG_KW_OPTICAL: ULong = 64uL

public val SYSTEM_CONFIG_KW_PNP: ULong = 32uL

public val SYSTEM_CONFIG_KW_SERVICES: ULong = 16uL

public val SYSTEM_CONFIG_KW_STORAGE: ULong = 4uL

public val SYSTEM_CONFIG_KW_SYSTEM: ULong = 1uL

public val SYSTEM_CPU_KW_CACHE_FLUSH: ULong = 2uL

public val SYSTEM_CPU_KW_CONFIG: ULong = 1uL

public val SYSTEM_CPU_KW_SPEC_CONTROL: ULong = 4uL

public val SYSTEM_EVENT_TYPE: UInt = 1u

public val SYSTEM_HYPERVISOR_KW_CALLOUTS: ULong = 2uL

public val SYSTEM_HYPERVISOR_KW_PROFILE: ULong = 1uL

public val SYSTEM_HYPERVISOR_KW_VTL_CHANGE: ULong = 4uL

public val SYSTEM_INTERRUPT_KW_CLOCK_INTERRUPT: ULong = 2uL

public val SYSTEM_INTERRUPT_KW_DPC: ULong = 4uL

public val SYSTEM_INTERRUPT_KW_DPC_QUEUE: ULong = 8uL

public val SYSTEM_INTERRUPT_KW_GENERAL: ULong = 1uL

public val SYSTEM_INTERRUPT_KW_IPI: ULong = 64uL

public val SYSTEM_INTERRUPT_KW_WDF_DPC: ULong = 16uL

public val SYSTEM_INTERRUPT_KW_WDF_INTERRUPT: ULong = 32uL

public val SYSTEM_IOFILTER_KW_FAILURE: ULong = 8uL

public val SYSTEM_IOFILTER_KW_FASTIO: ULong = 4uL

public val SYSTEM_IOFILTER_KW_GENERAL: ULong = 1uL

public val SYSTEM_IOFILTER_KW_INIT: ULong = 2uL

public val SYSTEM_IO_KW_CC: ULong = 256uL

public val SYSTEM_IO_KW_DISK: ULong = 1uL

public val SYSTEM_IO_KW_DISK_INIT: ULong = 2uL

public val SYSTEM_IO_KW_DRIVERS: ULong = 128uL

public val SYSTEM_IO_KW_FILE: ULong = 16uL

public val SYSTEM_IO_KW_FILENAME: ULong = 4uL

public val SYSTEM_IO_KW_NETWORK: ULong = 512uL

public val SYSTEM_IO_KW_OPTICAL: ULong = 32uL

public val SYSTEM_IO_KW_OPTICAL_INIT: ULong = 64uL

public val SYSTEM_IO_KW_SPLIT: ULong = 8uL

public val SYSTEM_LOCK_KW_SPINLOCK: ULong = 1uL

public val SYSTEM_LOCK_KW_SPINLOCK_COUNTERS: ULong = 2uL

public val SYSTEM_LOCK_KW_SYNC_OBJECTS: ULong = 4uL

public val SYSTEM_MEMORY_KW_ALL_FAULTS: ULong = 4uL

public val SYSTEM_MEMORY_KW_CONTMEM_GEN: ULong = 512uL

public val SYSTEM_MEMORY_KW_FOOTPRINT: ULong = 2048uL

public val SYSTEM_MEMORY_KW_GENERAL: ULong = 1uL

public val SYSTEM_MEMORY_KW_HARD_FAULTS: ULong = 2uL

public val SYSTEM_MEMORY_KW_HEAP: ULong = 128uL

public val SYSTEM_MEMORY_KW_MEMINFO: ULong = 16uL

public val SYSTEM_MEMORY_KW_MEMINFO_WS: ULong = 64uL

public val SYSTEM_MEMORY_KW_NONTRADEABLE: ULong = 32768uL

public val SYSTEM_MEMORY_KW_PFSECTION: ULong = 32uL

public val SYSTEM_MEMORY_KW_POOL: ULong = 8uL

public val SYSTEM_MEMORY_KW_REFSET: ULong = 8192uL

public val SYSTEM_MEMORY_KW_SESSION: ULong = 4096uL

public val SYSTEM_MEMORY_KW_VAMAP: ULong = 16384uL

public val SYSTEM_MEMORY_KW_VIRTUAL_ALLOC: ULong = 1024uL

public val SYSTEM_MEMORY_KW_WS: ULong = 256uL

public val SYSTEM_MEMORY_POOL_FILTER_ID: UInt = 1u

public val SYSTEM_OBJECT_KW_GENERAL: ULong = 1uL

public val SYSTEM_OBJECT_KW_HANDLE: ULong = 2uL

public val SYSTEM_POWER_KW_GENERAL: ULong = 1uL

public val SYSTEM_POWER_KW_HIBER_RUNDOWN: ULong = 2uL

public val SYSTEM_POWER_KW_IDLE_SELECTION: ULong = 8uL

public val SYSTEM_POWER_KW_PPM_EXIT_LATENCY: ULong = 16uL

public val SYSTEM_POWER_KW_PROCESSOR_IDLE: ULong = 4uL

public val SYSTEM_PROCESS_KW_DBGPRINT: ULong = 256uL

public val SYSTEM_PROCESS_KW_DEBUG_EVENTS: ULong = 128uL

public val SYSTEM_PROCESS_KW_FREEZE: ULong = 4uL

public val SYSTEM_PROCESS_KW_GENERAL: ULong = 1uL

public val SYSTEM_PROCESS_KW_INSWAP: ULong = 2uL

public val SYSTEM_PROCESS_KW_JOB: ULong = 512uL

public val SYSTEM_PROCESS_KW_LOADER: ULong = 4096uL

public val SYSTEM_PROCESS_KW_PERF_COUNTER: ULong = 8uL

public val SYSTEM_PROCESS_KW_THREAD: ULong = 2048uL

public val SYSTEM_PROCESS_KW_WAKE_COUNTER: ULong = 16uL

public val SYSTEM_PROCESS_KW_WAKE_DROP: ULong = 32uL

public val SYSTEM_PROCESS_KW_WAKE_EVENT: ULong = 64uL

public val SYSTEM_PROCESS_KW_WORKER_THREAD: ULong = 1024uL

public val SYSTEM_PROFILE_KW_GENERAL: ULong = 1uL

public val SYSTEM_PROFILE_KW_PMC_PROFILE: ULong = 2uL

public val SYSTEM_REGISTRY_KW_GENERAL: ULong = 1uL

public val SYSTEM_REGISTRY_KW_HIVE: ULong = 2uL

public val SYSTEM_REGISTRY_KW_NOTIFICATION: ULong = 4uL

public val SYSTEM_SCHEDULER_KW_AFFINITY: ULong = 64uL

public val SYSTEM_SCHEDULER_KW_ANTI_STARVATION: ULong = 16uL

public val SYSTEM_SCHEDULER_KW_COMPACT_CSWITCH: ULong = 1024uL

public val SYSTEM_SCHEDULER_KW_CONTEXT_SWITCH: ULong = 512uL

public val SYSTEM_SCHEDULER_KW_DISPATCHER: ULong = 2uL

public val SYSTEM_SCHEDULER_KW_IDEAL_PROCESSOR: ULong = 256uL

public val SYSTEM_SCHEDULER_KW_KERNEL_QUEUE: ULong = 4uL

public val SYSTEM_SCHEDULER_KW_LOAD_BALANCER: ULong = 32uL

public val SYSTEM_SCHEDULER_KW_PRIORITY: ULong = 128uL

public val SYSTEM_SCHEDULER_KW_SHOULD_YIELD: ULong = 8uL

public val SYSTEM_SCHEDULER_KW_XSCHEDULER: ULong = 1uL

public val SYSTEM_SYSCALL_KW_GENERAL: ULong = 1uL

public val SYSTEM_TIMER_KW_CLOCK_TIMER: ULong = 2uL

public val SYSTEM_TIMER_KW_GENERAL: ULong = 1uL

public val SPLIT_IO_GUID: Guid = Guid.fromU128(U128(0xd837ca9212b944a5uL, 0xad6a3a65b3578aa8uL))

public val SYSTEM_ALPC_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xfcb9baafe5294980uL, 0x92e9ced1a6aadfdfuL))

public val SYSTEM_CONFIG_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xfef3a8b6318d4b67uL, 0xa96a3b0f6b8f18feuL))

public val SYSTEM_CPU_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xc6c5265feae84650uL, 0xaae49d48603d8510uL))

public val SYSTEM_HYPERVISOR_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xbafa072a918a4beduL, 0xb622bc152097098fuL))

public val SYSTEM_INTERRUPT_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xd4bbee17b5454888uL, 0x858b744169015b25uL))

public val SYSTEM_IO_FILTER_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xfbd093639e224661uL, 0xb8bfe7a34b535b8cuL))

public val SYSTEM_IO_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x3d5c43e30f1c4202uL, 0xb817174c0070dc79uL))

public val SYSTEM_LOCK_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x721ddfd3dacc4e1euL, 0xb26aa2cb31d4705auL))

public val SYSTEM_MEMORY_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x82958ca9b6cd47f8uL, 0xa3a803ae85a4bc24uL))

public val SYSTEM_OBJECT_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xfebd74603d1d47ebuL, 0xaf49c9eeb1e146f2uL))

public val SYSTEM_POWER_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xc134884a32d54488uL, 0x80e514ed7abb8269uL))

public val SYSTEM_PROCESS_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x151f55dc467d471fuL, 0x83b55f889d46ff66uL))

public val SYSTEM_PROFILE_PROVIDER_GUID: Guid = Guid.fromU128(U128(0xbfeb03241cee496fuL, 0xa4092ac2b48a6322uL))

public val SYSTEM_REGISTRY_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x16156bd9fab44cfauL, 0xa23289d1099058e3uL))

public val SYSTEM_SCHEDULER_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x599a2a764d914910uL, 0x9ac77d33f2e97a6cuL))

public val SYSTEM_SYSCALL_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x434286f76f1b45bbuL, 0xb37e95f623046c7cuL))

public val SYSTEM_TIMER_PROVIDER_GUID: Guid = Guid.fromU128(U128(0x4f061568e215499fuL, 0xab2eeda0ae890a5buL))

public val SYSTEM_TRACE_CONTROL_GUID: Guid = Guid.fromU128(U128(0x9e814aad320411d2uL, 0x9a82006008a86939uL))

public val TDH_CONTEXT_MAXIMUM: TdhContextType = 5

public val TDH_CONTEXT_PDB_PATH: TdhContextType = 4

public val TDH_CONTEXT_POINTERSIZE: TdhContextType = 3

public val TDH_CONTEXT_WPP_GMT: TdhContextType = 2

public val TDH_CONTEXT_WPP_TMFFILE: TdhContextType = 0

public val TDH_CONTEXT_WPP_TMFSEARCHPATH: TdhContextType = 1

public val TDH_INTYPE_ANSICHAR: TdhInType = 307

public val TDH_INTYPE_ANSISTRING: TdhInType = 2

public val TDH_INTYPE_BINARY: TdhInType = 14

public val TDH_INTYPE_BOOLEAN: TdhInType = 13

public val TDH_INTYPE_COUNTEDANSISTRING: TdhInType = 301

public val TDH_INTYPE_COUNTEDSTRING: TdhInType = 300

public val TDH_INTYPE_DOUBLE: TdhInType = 12

public val TDH_INTYPE_FILETIME: TdhInType = 17

public val TDH_INTYPE_FLOAT: TdhInType = 11

public val TDH_INTYPE_GUID: TdhInType = 15

public val TDH_INTYPE_HEXDUMP: TdhInType = 309

public val TDH_INTYPE_HEXINT32: TdhInType = 20

public val TDH_INTYPE_HEXINT64: TdhInType = 21

public val TDH_INTYPE_INT16: TdhInType = 5

public val TDH_INTYPE_INT32: TdhInType = 7

public val TDH_INTYPE_INT64: TdhInType = 9

public val TDH_INTYPE_INT8: TdhInType = 3

public val TDH_INTYPE_MANIFEST_COUNTEDANSISTRING: TdhInType = 23

public val TDH_INTYPE_MANIFEST_COUNTEDBINARY: TdhInType = 25

public val TDH_INTYPE_MANIFEST_COUNTEDSTRING: TdhInType = 22

public val TDH_INTYPE_NONNULLTERMINATEDANSISTRING: TdhInType = 305

public val TDH_INTYPE_NONNULLTERMINATEDSTRING: TdhInType = 304

public val TDH_INTYPE_NULL: TdhInType = 0

public val TDH_INTYPE_POINTER: TdhInType = 16

public val TDH_INTYPE_RESERVED24: TdhInType = 24

public val TDH_INTYPE_REVERSEDCOUNTEDANSISTRING: TdhInType = 303

public val TDH_INTYPE_REVERSEDCOUNTEDSTRING: TdhInType = 302

public val TDH_INTYPE_SID: TdhInType = 19

public val TDH_INTYPE_SIZET: TdhInType = 308

public val TDH_INTYPE_SYSTEMTIME: TdhInType = 18

public val TDH_INTYPE_UINT16: TdhInType = 6

public val TDH_INTYPE_UINT32: TdhInType = 8

public val TDH_INTYPE_UINT64: TdhInType = 10

public val TDH_INTYPE_UINT8: TdhInType = 4

public val TDH_INTYPE_UNICODECHAR: TdhInType = 306

public val TDH_INTYPE_UNICODESTRING: TdhInType = 1

public val TDH_INTYPE_WBEMSID: TdhInType = 310

public val TDH_OUTTYPE_BOOLEAN: TdhOutType = 13

public val TDH_OUTTYPE_BYTE: TdhOutType = 3

public val TDH_OUTTYPE_CIMDATETIME: TdhOutType = 26

public val TDH_OUTTYPE_CODE_POINTER: TdhOutType = 37

public val TDH_OUTTYPE_CULTURE_INSENSITIVE_DATETIME: TdhOutType = 33

public val TDH_OUTTYPE_DATETIME: TdhOutType = 2

public val TDH_OUTTYPE_DATETIME_UTC: TdhOutType = 38

public val TDH_OUTTYPE_DOUBLE: TdhOutType = 12

public val TDH_OUTTYPE_ERRORCODE: TdhOutType = 29

public val TDH_OUTTYPE_ETWTIME: TdhOutType = 27

public val TDH_OUTTYPE_FLOAT: TdhOutType = 11

public val TDH_OUTTYPE_GUID: TdhOutType = 14

public val TDH_OUTTYPE_HEXBINARY: TdhOutType = 15

public val TDH_OUTTYPE_HEXINT16: TdhOutType = 17

public val TDH_OUTTYPE_HEXINT32: TdhOutType = 18

public val TDH_OUTTYPE_HEXINT64: TdhOutType = 19

public val TDH_OUTTYPE_HEXINT8: TdhOutType = 16

public val TDH_OUTTYPE_HRESULT: TdhOutType = 32

public val TDH_OUTTYPE_INT: TdhOutType = 7

public val TDH_OUTTYPE_IPV4: TdhOutType = 23

public val TDH_OUTTYPE_IPV6: TdhOutType = 24

public val TDH_OUTTYPE_JSON: TdhOutType = 34

public val TDH_OUTTYPE_LONG: TdhOutType = 9

public val TDH_OUTTYPE_NOPRINT: TdhOutType = 301

public val TDH_OUTTYPE_NTSTATUS: TdhOutType = 31

public val TDH_OUTTYPE_NULL: TdhOutType = 0

public val TDH_OUTTYPE_PID: TdhOutType = 20

public val TDH_OUTTYPE_PKCS7_WITH_TYPE_INFO: TdhOutType = 36

public val TDH_OUTTYPE_PORT: TdhOutType = 22

public val TDH_OUTTYPE_REDUCEDSTRING: TdhOutType = 300

public val TDH_OUTTYPE_SHORT: TdhOutType = 5

public val TDH_OUTTYPE_SOCKETADDRESS: TdhOutType = 25

public val TDH_OUTTYPE_STRING: TdhOutType = 1

public val TDH_OUTTYPE_TID: TdhOutType = 21

public val TDH_OUTTYPE_UNSIGNEDBYTE: TdhOutType = 4

public val TDH_OUTTYPE_UNSIGNEDINT: TdhOutType = 8

public val TDH_OUTTYPE_UNSIGNEDLONG: TdhOutType = 10

public val TDH_OUTTYPE_UNSIGNEDSHORT: TdhOutType = 6

public val TDH_OUTTYPE_UTF8: TdhOutType = 35

public val TDH_OUTTYPE_WIN32ERROR: TdhOutType = 30

public val TDH_OUTTYPE_XML: TdhOutType = 28

public val TEMPLATE_CONTROL_GUID: TemplateFlags = 4

public val TEMPLATE_EVENT_DATA: TemplateFlags = 1

public val TEMPLATE_USER_DATA: TemplateFlags = 2

public val TRACELOG_ACCESS_KERNEL_LOGGER: UInt = 256u

public val TRACELOG_ACCESS_REALTIME: UInt = 1024u

public val TRACELOG_CREATE_INPROC: UInt = 512u

public val TRACELOG_CREATE_ONDISK: UInt = 64u

public val TRACELOG_CREATE_REALTIME: UInt = 32u

public val TRACELOG_GUID_ENABLE: UInt = 128u

public val TRACELOG_JOIN_GROUP: UInt = 4096u

public val TRACELOG_LOG_EVENT: UInt = 512u

public val TRACELOG_REGISTER_GUIDS: UInt = 2048u

public val TRACE_HEADER_FLAG_LOG_WNODE: UInt = 262144u

public val TRACE_HEADER_FLAG_TRACED_GUID: UInt = 131072u

public val TRACE_HEADER_FLAG_USE_GUID_PTR: UInt = 524288u

public val TRACE_HEADER_FLAG_USE_MOF_PTR: UInt = 1048576u

public val TRACE_HEADER_FLAG_USE_TIMESTAMP: UInt = 512u

public val TRACE_LEVEL_CRITICAL: UInt = 1u

public val TRACE_LEVEL_ERROR: UInt = 2u

public val TRACE_LEVEL_FATAL: UInt = 1u

public val TRACE_LEVEL_INFORMATION: UInt = 4u

public val TRACE_LEVEL_NONE: UInt = 0u

public val TRACE_LEVEL_RESERVED6: UInt = 6u

public val TRACE_LEVEL_RESERVED7: UInt = 7u

public val TRACE_LEVEL_RESERVED8: UInt = 8u

public val TRACE_LEVEL_RESERVED9: UInt = 9u

public val TRACE_LEVEL_VERBOSE: UInt = 5u

public val TRACE_LEVEL_WARNING: UInt = 3u

public val TRACE_MESSAGE_COMPONENTID: TraceMessageFlags = 4u

public val TRACE_MESSAGE_FLAG_MASK: UInt = 65535u

public val TRACE_MESSAGE_GUID: TraceMessageFlags = 2u

public val TRACE_MESSAGE_PERFORMANCE_TIMESTAMP: UInt = 16u

public val TRACE_MESSAGE_POINTER32: UInt = 64u

public val TRACE_MESSAGE_POINTER64: UInt = 128u

public val TRACE_MESSAGE_SEQUENCE: TraceMessageFlags = 1u

public val TRACE_MESSAGE_SYSTEMINFO: TraceMessageFlags = 32u

public val TRACE_MESSAGE_TIMESTAMP: TraceMessageFlags = 8u

public val TRACE_PROVIDER_FLAG_LEGACY: UInt = 1u

public val TRACE_PROVIDER_FLAG_PRE_ENABLE: UInt = 2u

public val TCP_IP_GUID: Guid = Guid.fromU128(U128(0x9a280ac0c8e011d1uL, 0x84e200c04fb998a2uL))

public val THREAD_GUID: Guid = Guid.fromU128(U128(0x3d6fa8d1fe0511d0uL, 0x9dda00c04fd7ba7cuL))

public val TRACE_DISALLOW_LIST_QUERY: TraceQueryInfoClass = 14

public val TRACE_GROUP_QUERY_INFO: TraceQueryInfoClass = 13

public val TRACE_GROUP_QUERY_LIST: TraceQueryInfoClass = 12

public val TRACE_GUID_QUERY_INFO: TraceQueryInfoClass = 1

public val TRACE_GUID_QUERY_LIST: TraceQueryInfoClass = 0

public val TRACE_GUID_QUERY_PROCESS: TraceQueryInfoClass = 2

public val TRACE_INFO_RESERVED15: TraceQueryInfoClass = 15

public val TRACE_LBR_CONFIGURATION_INFO: TraceQueryInfoClass = 20

public val TRACE_LBR_EVENT_LIST_INFO: TraceQueryInfoClass = 21

public val TRACE_MAX_LOGGERS_QUERY: TraceQueryInfoClass = 19

public val TRACE_MAX_PMC_COUNTER_QUERY: TraceQueryInfoClass = 22

public val TRACE_PERIODIC_CAPTURE_STATE_INFO: TraceQueryInfoClass = 17

public val TRACE_PERIODIC_CAPTURE_STATE_LIST_INFO: TraceQueryInfoClass = 16

public val TRACE_PMC_COUNTER_LIST_INFO: TraceQueryInfoClass = 9

public val TRACE_PMC_COUNTER_OWNERS: TraceQueryInfoClass = 25

public val TRACE_PMC_EVENT_LIST_INFO: TraceQueryInfoClass = 8

public val TRACE_PMC_SESSION_INFORMATION: TraceQueryInfoClass = 27

public val TRACE_PROFILE_SOURCE_CONFIG_INFO: TraceQueryInfoClass = 6

public val TRACE_PROFILE_SOURCE_LIST_INFO: TraceQueryInfoClass = 7

public val TRACE_PROVIDER_BINARY_TRACKING: TraceQueryInfoClass = 18

public val TRACE_SAMPLED_PROFILE_INTERVAL_INFO: TraceQueryInfoClass = 5

public val TRACE_SET_DISALLOW_LIST: TraceQueryInfoClass = 10

public val TRACE_STACK_CACHING_INFO: TraceQueryInfoClass = 24

public val TRACE_STACK_TRACING_INFO: TraceQueryInfoClass = 3

public val TRACE_STREAM_COUNT: TraceQueryInfoClass = 23

public val TRACE_SYSTEM_TRACE_ENABLE_FLAGS_INFO: TraceQueryInfoClass = 4

public val TRACE_UNIFIED_STACK_CACHING_INFO: TraceQueryInfoClass = 26

public val TRACE_VERSION_INFO: TraceQueryInfoClass = 11

public val UDP_IP_GUID: Guid = Guid.fromU128(U128(0xbf3a50c5a9c94988uL, 0xa0052df0b7c80f80uL))

public val WMIGUID_EXECUTE: UInt = 16u

public val WMIGUID_NOTIFICATION: UInt = 4u

public val WMIGUID_QUERY: UInt = 1u

public val WMIGUID_READ_DESCRIPTION: UInt = 8u

public val WMIGUID_SET: UInt = 2u

public val WMIREG_FLAG_EVENT_ONLY_GUID: UInt = 64u

public val WMIREG_FLAG_EXPENSIVE: UInt = 1u

public val WMIREG_FLAG_INSTANCE_BASENAME: UInt = 8u

public val WMIREG_FLAG_INSTANCE_LIST: UInt = 4u

public val WMIREG_FLAG_INSTANCE_PDO: UInt = 32u

public val WMIREG_FLAG_REMOVE_GUID: UInt = 65536u

public val WMIREG_FLAG_RESERVED1: UInt = 131072u

public val WMIREG_FLAG_RESERVED2: UInt = 262144u

public val WMIREG_FLAG_TRACED_GUID: UInt = 524288u

public val WMIREG_FLAG_TRACE_CONTROL_GUID: UInt = 4096u

public val WMI_CAPTURE_STATE: Wmidprequestcode = 10

public val WMI_DISABLE_COLLECTION: Wmidprequestcode = 7

public val WMI_DISABLE_EVENTS: Wmidprequestcode = 5

public val WMI_ENABLE_COLLECTION: Wmidprequestcode = 6

public val WMI_ENABLE_EVENTS: Wmidprequestcode = 4

public val WMI_EXECUTE_METHOD: Wmidprequestcode = 9

public val WMI_GET_ALL_DATA: Wmidprequestcode = 0

public val WMI_GET_SINGLE_INSTANCE: Wmidprequestcode = 1

public val WMI_GLOBAL_LOGGER_ID: UInt = 1u

public val WMI_GUIDTYPE_DATA: UInt = 2u

public val WMI_GUIDTYPE_EVENT: UInt = 3u

public val WMI_GUIDTYPE_TRACE: UInt = 1u

public val WMI_GUIDTYPE_TRACECONTROL: UInt = 0u

public val WMI_REGINFO: Wmidprequestcode = 8

public val WMI_SET_SINGLE_INSTANCE: Wmidprequestcode = 2

public val WMI_SET_SINGLE_ITEM: Wmidprequestcode = 3

public val WNODE_FLAG_ALL_DATA: UInt = 1u

public val WNODE_FLAG_ANSI_INSTANCENAMES: UInt = 16384u

public val WNODE_FLAG_EVENT_ITEM: UInt = 8u

public val WNODE_FLAG_EVENT_REFERENCE: UInt = 8192u

public val WNODE_FLAG_FIXED_INSTANCE_SIZE: UInt = 16u

public val WNODE_FLAG_INSTANCES_SAME: UInt = 64u

public val WNODE_FLAG_INTERNAL: UInt = 256u

public val WNODE_FLAG_LOG_WNODE: UInt = 262144u

public val WNODE_FLAG_METHOD_ITEM: UInt = 32768u

public val WNODE_FLAG_NO_HEADER: UInt = 2097152u

public val WNODE_FLAG_PDO_INSTANCE_NAMES: UInt = 65536u

public val WNODE_FLAG_PERSIST_EVENT: UInt = 1024u

public val WNODE_FLAG_SEND_DATA_BLOCK: UInt = 4194304u

public val WNODE_FLAG_SEVERITY_MASK: UInt = 4278190080u

public val WNODE_FLAG_SINGLE_INSTANCE: UInt = 2u

public val WNODE_FLAG_SINGLE_ITEM: UInt = 4u

public val WNODE_FLAG_STATIC_INSTANCE_NAMES: UInt = 128u

public val WNODE_FLAG_TOO_SMALL: UInt = 32u

public val WNODE_FLAG_TRACED_GUID: UInt = 131072u

public val WNODE_FLAG_USE_GUID_PTR: UInt = 524288u

public val WNODE_FLAG_USE_MOF_PTR: UInt = 1048576u

public val WNODE_FLAG_USE_TIMESTAMP: UInt = 512u

public val WNODE_FLAG_VERSIONED_PROPERTIES: UInt = 8388608u
