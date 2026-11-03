package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val AppearPropPage: GUID = GUID.from_u128(0xe49741e993a84ab1uL, 0x8e96bf4482282e9cuL)

public val BootTraceSession: GUID = GUID.from_u128(0x3837538098b11d8uL, 0x9414505054503030uL)

public val BootTraceSessionCollection: GUID = GUID.from_u128(0x3837539098b11d8uL, 0x9414505054503030uL)

public val CounterItem: GUID = GUID.from_u128(0xc4d2d8e0d1dd11ceuL, 0x940f008029004348uL)

public val CounterItem2: GUID = GUID.from_u128(0x43196c62c31f4ce3uL, 0xa02e79efe0f6a525uL)

public val CounterPropPage: GUID = GUID.from_u128(0xcf948561ede811ceuL, 0x941e008029004347uL)

public val Counters: GUID = GUID.from_u128(0xb2b066d22aac11cfuL, 0x942f008029004347uL)

public val DATA_SOURCE_REGISTRY: REAL_TIME_DATA_SOURCE_ID_FLAGS = 1u

public val DATA_SOURCE_WBEM: REAL_TIME_DATA_SOURCE_ID_FLAGS = 4u

public val DIID_DICounterItem: GUID = GUID.from_u128(0xc08c4ff20e2e11cfuL, 0x942c008029004347uL)

public val DIID_DILogFileItem: GUID = GUID.from_u128(0x8d093ffcf7774917uL, 0x82d1833fbc54c58fuL)

public val DIID_DISystemMonitor: GUID = GUID.from_u128(0x13d73d81c32e11cfuL, 0x939800aa00a3ddeauL)

public val DIID_DISystemMonitorEvents: GUID = GUID.from_u128(0x849799304ab311cfuL, 0x943a008029004347uL)

public val DIID_DISystemMonitorInternal: GUID = GUID.from_u128(0x194eb242c32c11cfuL, 0x939800aa00a3ddeauL)

public val DataCollectorSet: GUID = GUID.from_u128(0x3837521098b11d8uL, 0x9414505054503030uL)

public val DataCollectorSetCollection: GUID = GUID.from_u128(0x3837525098b11d8uL, 0x9414505054503030uL)

public val GeneralPropPage: GUID = GUID.from_u128(0xc3e5d3d21a0311cfuL, 0x942d008029004347uL)

public val GraphPropPage: GUID = GUID.from_u128(0xc3e5d3d31a0311cfuL, 0x942d008029004347uL)

public val H_WBEM_DATASOURCE: Int = -1

public val LIBID_SystemMonitor: GUID = GUID.from_u128(0x1b773e42250911cfuL, 0x942f008029004347uL)

public val LegacyDataCollectorSet: GUID = GUID.from_u128(0x3837526098b11d8uL, 0x9414505054503030uL)

public val LegacyDataCollectorSetCollection: GUID = GUID.from_u128(0x3837527098b11d8uL, 0x9414505054503030uL)

public val LegacyTraceSession: GUID = GUID.from_u128(0x3837528098b11d8uL, 0x9414505054503030uL)

public val LegacyTraceSessionCollection: GUID = GUID.from_u128(0x3837529098b11d8uL, 0x9414505054503030uL)

public val LogFileItem: GUID = GUID.from_u128(0x16ec5be8df934237uL, 0x94e49ee918111d71uL)

public val LogFiles: GUID = GUID.from_u128(0x2735d9fdf6b94f19uL, 0xa5d9e2d068584bc5uL)

public val MAX_COUNTER_PATH: UInt = 256u

public val MAX_PERF_OBJECTS_IN_QUERY_FUNCTION: Int = 64

public val PDH_ACCESS_DENIED: UInt = 3221228507u

public val PDH_ASYNC_QUERY_TIMEOUT: UInt = 2147485659u

public val PDH_BINARY_LOG_CORRUPT: UInt = 3221228535u

public val PDH_CALC_NEGATIVE_DENOMINATOR: UInt = 2147485654u

public val PDH_CALC_NEGATIVE_TIMEBASE: UInt = 2147485655u

public val PDH_CALC_NEGATIVE_VALUE: UInt = 2147485656u

public val PDH_CANNOT_CONNECT_MACHINE: UInt = 3221228483u

public val PDH_CANNOT_CONNECT_WMI_SERVER: UInt = 3221228520u

public val PDH_CANNOT_READ_NAME_STRINGS: UInt = 3221228488u

public val PDH_CANNOT_SET_DEFAULT_REALTIME_DATASOURCE: UInt = 2147485660u

public val PDH_COUNTER_ALREADY_IN_QUERY: UInt = 3221228534u

public val PDH_CSTATUS_BAD_COUNTERNAME: UInt = 3221228480u

public val PDH_CSTATUS_INVALID_DATA: UInt = 3221228474u

public val PDH_CSTATUS_ITEM_NOT_VALIDATED: UInt = 2147485651u

public val PDH_CSTATUS_NEW_DATA: UInt = 1u

public val PDH_CSTATUS_NO_COUNTER: UInt = 3221228473u

public val PDH_CSTATUS_NO_COUNTERNAME: UInt = 3221228479u

public val PDH_CSTATUS_NO_INSTANCE: UInt = 2147485649u

public val PDH_CSTATUS_NO_MACHINE: UInt = 2147485648u

public val PDH_CSTATUS_NO_OBJECT: UInt = 3221228472u

public val PDH_CSTATUS_VALID_DATA: UInt = 0u

public val PDH_CVERSION_WIN50: PDH_DLL_VERSION = 1280u

public val PDH_DATA_SOURCE_IS_LOG_FILE: UInt = 3221228494u

public val PDH_DATA_SOURCE_IS_REAL_TIME: UInt = 3221228495u

public val PDH_DIALOG_CANCELLED: UInt = 2147485657u

public val PDH_END_OF_LOG_FILE: UInt = 2147485658u

public val PDH_ENTRY_NOT_IN_LOG_FILE: UInt = 3221228493u

public val PDH_FILE_ALREADY_EXISTS: UInt = 3221228498u

public val PDH_FILE_NOT_FOUND: UInt = 3221228497u

public val PDH_FLAGS_FILE_BROWSER_ONLY: PDH_SELECT_DATA_SOURCE_FLAGS = 1u

public val PDH_FLAGS_NONE: PDH_SELECT_DATA_SOURCE_FLAGS = 0u

public val PDH_FMT_DOUBLE: PDH_FMT = 512u

public val PDH_FMT_LARGE: PDH_FMT = 1024u

public val PDH_FMT_LONG: PDH_FMT = 256u

public val PDH_FUNCTION_NOT_FOUND: UInt = 3221228478u

public val PDH_INCORRECT_APPEND_TIME: UInt = 3221228539u

public val PDH_INSUFFICIENT_BUFFER: UInt = 3221228482u

public val PDH_INVALID_ARGUMENT: UInt = 3221228477u

public val PDH_INVALID_BUFFER: UInt = 3221228481u

public val PDH_INVALID_DATA: UInt = 3221228486u

public val PDH_INVALID_DATASOURCE: UInt = 3221228509u

public val PDH_INVALID_HANDLE: UInt = 3221228476u

public val PDH_INVALID_INSTANCE: UInt = 3221228485u

public val PDH_INVALID_PATH: UInt = 3221228484u

public val PDH_INVALID_SQLDB: UInt = 3221228510u

public val PDH_INVALID_SQL_LOG_FORMAT: UInt = 3221228533u

public val PDH_LOGSVC_NOT_OPENED: UInt = 3221228505u

public val PDH_LOGSVC_QUERY_NOT_FOUND: UInt = 3221228504u

public val PDH_LOG_FILE_CREATE_ERROR: UInt = 3221228489u

public val PDH_LOG_FILE_OPEN_ERROR: UInt = 3221228490u

public val PDH_LOG_FILE_TOO_SMALL: UInt = 3221228508u

public val PDH_LOG_READ_ACCESS: PDH_LOG = 65536u

public val PDH_LOG_SAMPLE_TOO_SMALL: UInt = 3221228536u

public val PDH_LOG_TYPE_BINARY: PDH_LOG_TYPE = 8u

public val PDH_LOG_TYPE_CSV: PDH_LOG_TYPE = 1u

public val PDH_LOG_TYPE_NOT_FOUND: UInt = 3221228491u

public val PDH_LOG_TYPE_PERFMON: PDH_LOG_TYPE = 6u

public val PDH_LOG_TYPE_RETIRED_BIN: UInt = 3u

public val PDH_LOG_TYPE_SQL: PDH_LOG_TYPE = 7u

public val PDH_LOG_TYPE_TRACE_GENERIC: UInt = 5u

public val PDH_LOG_TYPE_TRACE_KERNEL: UInt = 4u

public val PDH_LOG_TYPE_TSV: PDH_LOG_TYPE = 2u

public val PDH_LOG_TYPE_UNDEFINED: PDH_LOG_TYPE = 0u

public val PDH_LOG_UPDATE_ACCESS: PDH_LOG = 262144u

public val PDH_LOG_WRITE_ACCESS: PDH_LOG = 131072u

public val PDH_MAX_COUNTER_NAME: UInt = 1024u

public val PDH_MAX_COUNTER_PATH: UInt = 2048u

public val PDH_MAX_DATASOURCE_PATH: UInt = 1024u

public val PDH_MAX_INSTANCE_NAME: UInt = 1024u

public val PDH_MAX_SCALE: Int = 7

public val PDH_MEMORY_ALLOCATION_FAILURE: UInt = 3221228475u

public val PDH_MIN_SCALE: Int = -7

public val PDH_MORE_DATA: UInt = 2147485650u

public val PDH_NOEXPANDCOUNTERS: UInt = 1u

public val PDH_NOEXPANDINSTANCES: UInt = 2u

public val PDH_NOT_IMPLEMENTED: UInt = 3221228499u

public val PDH_NO_COUNTERS: UInt = 3221228511u

public val PDH_NO_DATA: UInt = 2147485653u

public val PDH_NO_DIALOG_DATA: UInt = 3221228487u

public val PDH_NO_MORE_DATA: UInt = 3221228492u

public val PDH_OS_EARLIER_VERSION: UInt = 3221228538u

public val PDH_OS_LATER_VERSION: UInt = 3221228537u

public val PDH_PATH_WBEM_INPUT: PDH_PATH_FLAGS = 2u

public val PDH_PATH_WBEM_NONE: PDH_PATH_FLAGS = 0u

public val PDH_PATH_WBEM_RESULT: PDH_PATH_FLAGS = 1u

public val PDH_PLA_COLLECTION_ALREADY_RUNNING: UInt = 3221228521u

public val PDH_PLA_COLLECTION_NOT_FOUND: UInt = 3221228523u

public val PDH_PLA_ERROR_ALREADY_EXISTS: UInt = 3221228526u

public val PDH_PLA_ERROR_FILEPATH: UInt = 3221228528u

public val PDH_PLA_ERROR_NAME_TOO_LONG: UInt = 3221228532u

public val PDH_PLA_ERROR_NOSTART: UInt = 3221228525u

public val PDH_PLA_ERROR_SCHEDULE_ELAPSED: UInt = 3221228524u

public val PDH_PLA_ERROR_SCHEDULE_OVERLAP: UInt = 3221228522u

public val PDH_PLA_ERROR_TYPE_MISMATCH: UInt = 3221228527u

public val PDH_PLA_SERVICE_ERROR: UInt = 3221228529u

public val PDH_PLA_VALIDATION_ERROR: UInt = 3221228530u

public val PDH_PLA_VALIDATION_WARNING: UInt = 2147486707u

public val PDH_QUERY_PERF_DATA_TIMEOUT: UInt = 3221228542u

public val PDH_REFRESHCOUNTERS: UInt = 4u

public val PDH_RETRY: UInt = 2147485652u

public val PDH_SQL_ALLOCCON_FAILED: UInt = 3221228513u

public val PDH_SQL_ALLOC_FAILED: UInt = 3221228512u

public val PDH_SQL_ALTER_DETAIL_FAILED: UInt = 3221228541u

public val PDH_SQL_BIND_FAILED: UInt = 3221228519u

public val PDH_SQL_CONNECT_FAILED: UInt = 3221228518u

public val PDH_SQL_EXEC_DIRECT_FAILED: UInt = 3221228514u

public val PDH_SQL_FETCH_FAILED: UInt = 3221228515u

public val PDH_SQL_MORE_RESULTS_FAILED: UInt = 3221228517u

public val PDH_SQL_ROWCOUNT_FAILED: UInt = 3221228516u

public val PDH_STRING_NOT_FOUND: UInt = 3221228500u

public val PDH_UNABLE_MAP_NAME_FILES: UInt = 2147486677u

public val PDH_UNABLE_READ_LOG_HEADER: UInt = 3221228496u

public val PDH_UNKNOWN_LOGSVC_COMMAND: UInt = 3221228503u

public val PDH_UNKNOWN_LOG_FORMAT: UInt = 3221228502u

public val PDH_UNMATCHED_APPEND_COUNTER: UInt = 3221228540u

public val PDH_VERSION: PDH_DLL_VERSION = 1283u

public val PDH_WBEM_ERROR: UInt = 3221228506u

public val PERF_ADD_COUNTER: UInt = 1u

public val PERF_AGGREGATE_AVG: PERF_COUNTER_AGGREGATE_FUNC = 2u

public val PERF_AGGREGATE_INSTANCE: PCWSTR = w("_Total")

public val PERF_AGGREGATE_MAX: PERF_COUNTER_AGGREGATE_FUNC = 4u

public val PERF_AGGREGATE_MIN: PERF_COUNTER_AGGREGATE_FUNC = 3u

public val PERF_AGGREGATE_TOTAL: PERF_COUNTER_AGGREGATE_FUNC = 1u

public val PERF_AGGREGATE_UNDEFINED: PERF_COUNTER_AGGREGATE_FUNC = 0u

public val PERF_ATTRIB_BY_REFERENCE: ULong = 1uL

public val PERF_ATTRIB_DISPLAY_AS_HEX: ULong = 16uL

public val PERF_ATTRIB_DISPLAY_AS_REAL: ULong = 8uL

public val PERF_ATTRIB_NO_DISPLAYABLE: ULong = 2uL

public val PERF_ATTRIB_NO_GROUP_SEPARATOR: ULong = 4uL

public val PERF_COLLECT_END: UInt = 6u

public val PERF_COLLECT_START: UInt = 5u

public val PERF_COUNTERSET: PerfCounterDataType = 6

public val PERF_COUNTERSET_FLAG_AGGREGATE: UInt = 4u

public val PERF_COUNTERSET_FLAG_HISTORY: UInt = 8u

public val PERF_COUNTERSET_FLAG_INSTANCE: UInt = 16u

public val PERF_COUNTERSET_FLAG_MULTIPLE: UInt = 2u

public val PERF_COUNTERSET_MULTI_INSTANCES: UInt = 2u

public val PERF_COUNTERSET_SINGLE_AGGREGATE: UInt = 4u

public val PERF_COUNTERSET_SINGLE_INSTANCE: UInt = 0u

public val PERF_COUNTER_BASE: UInt = 196608u

public val PERF_COUNTER_ELAPSED: UInt = 262144u

public val PERF_COUNTER_FRACTION: UInt = 131072u

public val PERF_COUNTER_HISTOGRAM: UInt = 393216u

public val PERF_COUNTER_HISTOGRAM_TYPE: UInt = 2147483648u

public val PERF_COUNTER_PRECISION: UInt = 458752u

public val PERF_COUNTER_QUEUELEN: UInt = 327680u

public val PERF_COUNTER_RATE: UInt = 65536u

public val PERF_COUNTER_VALUE: UInt = 0u

public val PERF_DATA_REVISION: UInt = 1u

public val PERF_DATA_VERSION: UInt = 1u

public val PERF_DELTA_BASE: UInt = 8388608u

public val PERF_DELTA_COUNTER: UInt = 4194304u

public val PERF_DETAIL_ADVANCED: PERF_DETAIL = 200u

public val PERF_DETAIL_EXPERT: PERF_DETAIL = 300u

public val PERF_DETAIL_NOVICE: PERF_DETAIL = 100u

public val PERF_DETAIL_WIZARD: PERF_DETAIL = 400u

public val PERF_DISPLAY_NOSHOW: UInt = 1073741824u

public val PERF_DISPLAY_NO_SUFFIX: UInt = 0u

public val PERF_DISPLAY_PERCENT: UInt = 536870912u

public val PERF_DISPLAY_PER_SEC: UInt = 268435456u

public val PERF_DISPLAY_SECONDS: UInt = 805306368u

public val PERF_ENUM_INSTANCES: UInt = 3u

public val PERF_ERROR_RETURN: PerfCounterDataType = 0

public val PERF_FILTER: UInt = 9u

public val PERF_INVERSE_COUNTER: UInt = 16777216u

public val PERF_MAX_INSTANCE_NAME: UInt = 1024u

public val PERF_METADATA_MULTIPLE_INSTANCES: Int = -2

public val PERF_METADATA_NO_INSTANCES: Int = -3

public val PERF_MULTIPLE_COUNTERS: PerfCounterDataType = 2

public val PERF_MULTIPLE_INSTANCES: PerfCounterDataType = 4

public val PERF_MULTI_COUNTER: UInt = 33554432u

public val PERF_NO_INSTANCES: Int = -1

public val PERF_NO_UNIQUE_ID: Int = -1

public val PERF_NUMBER_DECIMAL: UInt = 65536u

public val PERF_NUMBER_DEC_1000: UInt = 131072u

public val PERF_NUMBER_HEX: UInt = 0u

public val PERF_OBJECT_TIMER: UInt = 2097152u

public val PERF_PROVIDER_DRIVER: UInt = 2u

public val PERF_PROVIDER_KERNEL_MODE: UInt = 1u

public val PERF_PROVIDER_USER_MODE: UInt = 0u

public val PERF_REG_COUNTERSET_ENGLISH_NAME: PerfRegInfoType = 9

public val PERF_REG_COUNTERSET_HELP_STRING: PerfRegInfoType = 4

public val PERF_REG_COUNTERSET_NAME_STRING: PerfRegInfoType = 3

public val PERF_REG_COUNTERSET_STRUCT: PerfRegInfoType = 1

public val PERF_REG_COUNTER_ENGLISH_NAMES: PerfRegInfoType = 10

public val PERF_REG_COUNTER_HELP_STRINGS: PerfRegInfoType = 6

public val PERF_REG_COUNTER_NAME_STRINGS: PerfRegInfoType = 5

public val PERF_REG_COUNTER_STRUCT: PerfRegInfoType = 2

public val PERF_REG_PROVIDER_GUID: PerfRegInfoType = 8

public val PERF_REG_PROVIDER_NAME: PerfRegInfoType = 7

public val PERF_REMOVE_COUNTER: UInt = 2u

public val PERF_SINGLE_COUNTER: PerfCounterDataType = 1

public val PERF_SIZE_DWORD: UInt = 0u

public val PERF_SIZE_LARGE: UInt = 256u

public val PERF_SIZE_VARIABLE_LEN: UInt = 768u

public val PERF_SIZE_ZERO: UInt = 512u

public val PERF_TEXT_ASCII: UInt = 65536u

public val PERF_TEXT_UNICODE: UInt = 0u

public val PERF_TIMER_100NS: UInt = 1048576u

public val PERF_TIMER_TICK: UInt = 0u

public val PERF_TYPE_COUNTER: UInt = 1024u

public val PERF_TYPE_NUMBER: UInt = 0u

public val PERF_TYPE_TEXT: UInt = 2048u

public val PERF_TYPE_ZERO: UInt = 3072u

public val PERF_WILDCARD_COUNTER: UInt = 4294967295u

public val PERF_WILDCARD_INSTANCE: PCWSTR = w("*")

public val PLAL_ALERT_CMD_LINE_A_NAME: UInt = 512u

public val PLAL_ALERT_CMD_LINE_C_NAME: UInt = 1024u

public val PLAL_ALERT_CMD_LINE_D_TIME: UInt = 2048u

public val PLAL_ALERT_CMD_LINE_L_VAL: UInt = 4096u

public val PLAL_ALERT_CMD_LINE_MASK: UInt = 32512u

public val PLAL_ALERT_CMD_LINE_M_VAL: UInt = 8192u

public val PLAL_ALERT_CMD_LINE_SINGLE: UInt = 256u

public val PLAL_ALERT_CMD_LINE_U_TEXT: UInt = 16384u

public val PLA_CAPABILITY_AUTOLOGGER: UInt = 32u

public val PLA_CAPABILITY_LEGACY_SESSION: UInt = 8u

public val PLA_CAPABILITY_LEGACY_SVC: UInt = 16u

public val PLA_CAPABILITY_LOCAL: UInt = 268435456u

public val PLA_CAPABILITY_V1_SESSION: UInt = 2u

public val PLA_CAPABILITY_V1_SVC: UInt = 1u

public val PLA_CAPABILITY_V1_SYSTEM: UInt = 4u

public val S_PDH: GUID = GUID.from_u128(0x4d66358c4a1419buL, 0x802323b73902de2cuL)

public val ServerDataCollectorSet: GUID = GUID.from_u128(0x3837531098b11d8uL, 0x9414505054503030uL)

public val ServerDataCollectorSetCollection: GUID = GUID.from_u128(0x3837532098b11d8uL, 0x9414505054503030uL)

public val SourcePropPage: GUID = GUID.from_u128(0xcf32aa1757111d0uL, 0x93c400aa00a3ddeauL)

public val SystemDataCollectorSet: GUID = GUID.from_u128(0x3837546098b11d8uL, 0x9414505054503030uL)

public val SystemDataCollectorSetCollection: GUID = GUID.from_u128(0x3837547098b11d8uL, 0x9414505054503030uL)

public val SystemMonitor: GUID = GUID.from_u128(0xc4d2d8e0d1dd11ceuL, 0x940f008029004347uL)

public val SystemMonitor2: GUID = GUID.from_u128(0x7f30578c5f384612uL, 0xacfe6ed04c7b7af8uL)

public val TraceDataProvider: GUID = GUID.from_u128(0x3837513098b11d8uL, 0x9414505054503030uL)

public val TraceDataProviderCollection: GUID = GUID.from_u128(0x3837511098b11d8uL, 0x9414505054503030uL)

public val TraceSession: GUID = GUID.from_u128(0x383751c098b11d8uL, 0x9414505054503030uL)

public val TraceSessionCollection: GUID = GUID.from_u128(0x3837530098b11d8uL, 0x9414505054503030uL)

public val WINPERF_LOG_DEBUG: UInt = 2u

public val WINPERF_LOG_NONE: UInt = 0u

public val WINPERF_LOG_USER: UInt = 1u

public val WINPERF_LOG_VERBOSE: UInt = 3u

public val plaAlert: DataCollectorType = 3

public val plaApiTrace: DataCollectorType = 4

public val plaBinary: FileFormat = 3

public val plaBoth: StreamMode = 3

public val plaBuffering: StreamMode = 4

public val plaCommaSeparated: FileFormat = 0

public val plaCompiling: DataCollectorSetStatus = 2

public val plaComputer: AutoPathFormat = 2

public val plaConfiguration: DataCollectorType = 2

public val plaCreateCab: FolderActionSteps = 1

public val plaCreateHtml: DataManagerSteps = 4

public val plaCreateNew: CommitMode = 1

public val plaCreateOrModify: CommitMode = 3

public val plaCreateReport: DataManagerSteps = 1

public val plaCycle: ClockType = 3

public val plaDeleteCab: FolderActionSteps = 8

public val plaDeleteData: FolderActionSteps = 2

public val plaDeleteLargest: ResourcePolicy = 0

public val plaDeleteOldest: ResourcePolicy = 1

public val plaDeleteReport: FolderActionSteps = 16

public val plaEveryday: WeekDays = 127

public val plaFile: StreamMode = 1

public val plaFlag: ValueMapType = 2

public val plaFlagArray: ValueMapType = 3

public val plaFlushTrace: CommitMode = 32

public val plaFolderActions: DataManagerSteps = 8

public val plaFriday: WeekDays = 32

public val plaIndex: ValueMapType = 1

public val plaModify: CommitMode = 2

public val plaMonday: WeekDays = 2

public val plaMonthDayHour: AutoPathFormat = 256

public val plaMonthDayHourMinute: AutoPathFormat = 16384

public val plaNone: AutoPathFormat = 0

public val plaPattern: AutoPathFormat = 1

public val plaPending: DataCollectorSetStatus = 3

public val plaPerformance: ClockType = 1

public val plaPerformanceCounter: DataCollectorType = 0

public val plaRealTime: StreamMode = 2

public val plaResourceFreeing: DataManagerSteps = 16

public val plaRunOnce: WeekDays = 0

public val plaRunRules: DataManagerSteps = 2

public val plaRunning: DataCollectorSetStatus = 1

public val plaSaturday: WeekDays = 64

public val plaSendCab: FolderActionSteps = 4

public val plaSerialNumber: AutoPathFormat = 512

public val plaSql: FileFormat = 2

public val plaStopped: DataCollectorSetStatus = 0

public val plaSunday: WeekDays = 1

public val plaSystem: ClockType = 2

public val plaTabSeparated: FileFormat = 1

public val plaThursday: WeekDays = 16

public val plaTimeStamp: ClockType = 0

public val plaTrace: DataCollectorType = 1

public val plaTuesday: WeekDays = 4

public val plaUndefined: DataCollectorSetStatus = 4

public val plaUpdateRunningInstance: CommitMode = 16

public val plaValidateOnly: CommitMode = 4096

public val plaValidation: ValueMapType = 4

public val plaWednesday: WeekDays = 8

public val plaYearDayOfYear: AutoPathFormat = 1024

public val plaYearMonth: AutoPathFormat = 2048

public val plaYearMonthDay: AutoPathFormat = 4096

public val plaYearMonthDayHour: AutoPathFormat = 8192

public val sysmonAverage: ReportValueTypeConstants = 2

public val sysmonBatchAddCounters: SysmonBatchReason = 2

public val sysmonBatchAddFiles: SysmonBatchReason = 1

public val sysmonBatchAddFilesAutoCounters: SysmonBatchReason = 3

public val sysmonBatchNone: SysmonBatchReason = 0

public val sysmonChartArea: DisplayTypeConstants = 4

public val sysmonChartStackedArea: DisplayTypeConstants = 5

public val sysmonCurrentActivity: DataSourceTypeConstants = 1

public val sysmonCurrentValue: ReportValueTypeConstants = 1

public val sysmonDataAvg: SysmonDataType = 1

public val sysmonDataCount: SysmonDataType = 5

public val sysmonDataMax: SysmonDataType = 3

public val sysmonDataMin: SysmonDataType = 2

public val sysmonDataTime: SysmonDataType = 4

public val sysmonDefaultValue: ReportValueTypeConstants = 0

public val sysmonFileBlg: SysmonFileType = 5

public val sysmonFileCsv: SysmonFileType = 3

public val sysmonFileGif: SysmonFileType = 7

public val sysmonFileHtml: SysmonFileType = 1

public val sysmonFileReport: SysmonFileType = 2

public val sysmonFileRetiredBlg: SysmonFileType = 6

public val sysmonFileTsv: SysmonFileType = 4

public val sysmonHistogram: DisplayTypeConstants = 2

public val sysmonLineGraph: DisplayTypeConstants = 1

public val sysmonLogFiles: DataSourceTypeConstants = 2

public val sysmonMaximum: ReportValueTypeConstants = 4

public val sysmonMinimum: ReportValueTypeConstants = 3

public val sysmonNullDataSource: DataSourceTypeConstants = -1

public val sysmonReport: DisplayTypeConstants = 3

public val sysmonSqlLog: DataSourceTypeConstants = 3
