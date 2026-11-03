package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val SQL_COPT_SS_ATTACHDBFILENAME: UInt = 1221u

public val SQL_COPT_SS_BASE: UInt = 1200u

public val SQL_COPT_SS_BASE_EX: UInt = 1240u

public val SQL_COPT_SS_BCP: UInt = 1219u

public val SQL_COPT_SS_BROWSE_CACHE_DATA: UInt = 1245u

public val SQL_COPT_SS_BROWSE_CONNECT: UInt = 1241u

public val SQL_COPT_SS_BROWSE_SERVER: UInt = 1242u

public val SQL_COPT_SS_CONCAT_NULL: UInt = 1222u

public val SQL_COPT_SS_CONNECTION_DEAD: UInt = 1244u

public val SQL_COPT_SS_ENCRYPT: UInt = 1223u

public val SQL_COPT_SS_EX_MAX_USED: UInt = 1246u

public val SQL_COPT_SS_FALLBACK_CONNECT: UInt = 1210u

public val SQL_COPT_SS_INTEGRATED_SECURITY: UInt = 1203u

public val SQL_COPT_SS_MAX_USED: UInt = 1223u

public val SQL_COPT_SS_PERF_DATA: UInt = 1211u

public val SQL_COPT_SS_PERF_DATA_LOG: UInt = 1212u

public val SQL_COPT_SS_PERF_DATA_LOG_NOW: UInt = 1216u

public val SQL_COPT_SS_PERF_QUERY: UInt = 1215u

public val SQL_COPT_SS_PERF_QUERY_INTERVAL: UInt = 1213u

public val SQL_COPT_SS_PERF_QUERY_LOG: UInt = 1214u

public val SQL_COPT_SS_PRESERVE_CURSORS: UInt = 1204u

public val SQL_COPT_SS_QUOTED_IDENT: UInt = 1217u

public val SQL_COPT_SS_REMOTE_PWD: UInt = 1201u

public val SQL_COPT_SS_RESET_CONNECTION: UInt = 1246u

public val SQL_COPT_SS_TRANSLATE: UInt = 1220u

public val SQL_COPT_SS_USER_DATA: UInt = 1205u

public val SQL_COPT_SS_USE_PROC_FOR_PREP: UInt = 1202u

public val SQL_COPT_SS_WARN_ON_CP_ERROR: UInt = 1243u

public val SQL_CORRELATION_NAME: UInt = 74u

public val SQL_CO_AF: Int = 2

public val SQL_CO_DEFAULT: Int = 0

public val SQL_CO_FFO: Int = 1

public val SQL_CO_FIREHOSE_AF: Int = 4

public val SQL_CO_OFF: Int = 0

public val SQL_CP_DEFAULT: UInt = 0u

public val SQL_CP_DRIVER_AWARE: UInt = 3u

public val SQL_CP_MATCH_DEFAULT: UInt = 0u

public val SQL_CP_OFF: UInt = 0u

public val SQL_CP_ONE_PER_DRIVER: UInt = 1u

public val SQL_CP_ONE_PER_HENV: UInt = 2u

public val SQL_CP_RELAXED_MATCH: UInt = 1u

public val SQL_CP_STRICT_MATCH: UInt = 0u

public val SQL_CREATE_ASSERTION: UInt = 127u

public val SQL_CREATE_CHARACTER_SET: UInt = 128u

public val SQL_CREATE_COLLATION: UInt = 129u

public val SQL_CREATE_DOMAIN: UInt = 130u

public val SQL_CREATE_SCHEMA: UInt = 131u

public val SQL_CREATE_TABLE: UInt = 132u

public val SQL_CREATE_TRANSLATION: UInt = 133u

public val SQL_CREATE_VIEW: UInt = 134u

public val SQL_CR_CLOSE: UInt = 1u

public val SQL_CR_DELETE: UInt = 0u

public val SQL_CR_PRESERVE: UInt = 2u

public val SQL_CS_AUTHORIZATION: Int = 2

public val SQL_CS_CREATE_SCHEMA: Int = 1

public val SQL_CS_DEFAULT_CHARACTER_SET: Int = 4

public val SQL_CTR_CREATE_TRANSLATION: Int = 1

public val SQL_CT_COLUMN_COLLATION: Int = 2048

public val SQL_CT_COLUMN_CONSTRAINT: Int = 512

public val SQL_CT_COLUMN_DEFAULT: Int = 1024

public val SQL_CT_COMMIT_DELETE: Int = 4

public val SQL_CT_COMMIT_PRESERVE: Int = 2

public val SQL_CT_CONSTRAINT_DEFERRABLE: Int = 128

public val SQL_CT_CONSTRAINT_INITIALLY_DEFERRED: Int = 32

public val SQL_CT_CONSTRAINT_INITIALLY_IMMEDIATE: Int = 64

public val SQL_CT_CONSTRAINT_NAME_DEFINITION: Int = 8192

public val SQL_CT_CONSTRAINT_NON_DEFERRABLE: Int = 256

public val SQL_CT_CREATE_TABLE: Int = 1

public val SQL_CT_GLOBAL_TEMPORARY: Int = 8

public val SQL_CT_LOCAL_TEMPORARY: Int = 16

public val SQL_CT_TABLE_CONSTRAINT: Int = 4096

public val SQL_CURRENT_QUALIFIER: UInt = 109u

public val SQL_CURSOR_COMMIT_BEHAVIOR: UInt = 23u

public val SQL_CURSOR_DYNAMIC: UInt = 2u

public val SQL_CURSOR_FAST_FORWARD_ONLY: UInt = 8u

public val SQL_CURSOR_FORWARD_ONLY: UInt = 0u

public val SQL_CURSOR_KEYSET_DRIVEN: UInt = 1u

public val SQL_CURSOR_ROLLBACK_BEHAVIOR: UInt = 24u

public val SQL_CURSOR_SENSITIVITY: UInt = 10001u

public val SQL_CURSOR_STATIC: UInt = 3u

public val SQL_CURSOR_TYPE: UInt = 6u

public val SQL_CURSOR_TYPE_DEFAULT: UInt = 0u

public val SQL_CUR_DEFAULT: UInt = 2u

public val SQL_CUR_USE_DRIVER: UInt = 2u

public val SQL_CUR_USE_IF_NEEDED: UInt = 0u

public val SQL_CUR_USE_ODBC: UInt = 1u

public val SQL_CU_DML_STATEMENTS: Int = 1

public val SQL_CU_INDEX_DEFINITION: Int = 8

public val SQL_CU_PRIVILEGE_DEFINITION: Int = 16

public val SQL_CU_PROCEDURE_INVOCATION: Int = 2

public val SQL_CU_TABLE_DEFINITION: Int = 4

public val SQL_CVT_BIGINT: Int = 16384

public val SQL_CVT_BINARY: Int = 1024

public val SQL_CVT_BIT: Int = 4096

public val SQL_CVT_CHAR: Int = 1

public val SQL_CVT_DATE: Int = 32768

public val SQL_CVT_DECIMAL: Int = 4

public val SQL_CVT_DOUBLE: Int = 128

public val SQL_CVT_FLOAT: Int = 32

public val SQL_CVT_GUID: Int = 16777216

public val SQL_CVT_INTEGER: Int = 8

public val SQL_CVT_INTERVAL_DAY_TIME: Int = 1048576

public val SQL_CVT_INTERVAL_YEAR_MONTH: Int = 524288

public val SQL_CVT_LONGVARBINARY: Int = 262144

public val SQL_CVT_LONGVARCHAR: Int = 512

public val SQL_CVT_NUMERIC: Int = 2

public val SQL_CVT_REAL: Int = 64

public val SQL_CVT_SMALLINT: Int = 16

public val SQL_CVT_TIME: Int = 65536

public val SQL_CVT_TIMESTAMP: Int = 131072

public val SQL_CVT_TINYINT: Int = 8192

public val SQL_CVT_VARBINARY: Int = 2048

public val SQL_CVT_VARCHAR: Int = 256

public val SQL_CVT_WCHAR: Int = 2097152

public val SQL_CVT_WLONGVARCHAR: Int = 4194304

public val SQL_CVT_WVARCHAR: Int = 8388608

public val SQL_CV_CASCADED: Int = 4

public val SQL_CV_CHECK_OPTION: Int = 2

public val SQL_CV_CREATE_VIEW: Int = 1

public val SQL_CV_LOCAL: Int = 8

public val SQL_C_BINARY: Int = -2

public val SQL_C_BIT: Int = -7

public val SQL_C_CHAR: UInt = 1u

public val SQL_C_DATE: UInt = 9u

public val SQL_C_DEFAULT: UInt = 99u

public val SQL_C_DOUBLE: UInt = 8u

public val SQL_C_FLOAT: UInt = 7u

public val SQL_C_GUID: Int = -11

public val SQL_C_INTERVAL_DAY: Int = -83

public val SQL_C_INTERVAL_DAY_TO_HOUR: Int = -87

public val SQL_C_INTERVAL_DAY_TO_MINUTE: Int = -88

public val SQL_C_INTERVAL_DAY_TO_SECOND: Int = -89

public val SQL_C_INTERVAL_HOUR: Int = -84

public val SQL_C_INTERVAL_HOUR_TO_MINUTE: Int = -90

public val SQL_C_INTERVAL_HOUR_TO_SECOND: Int = -91

public val SQL_C_INTERVAL_MINUTE: Int = -85

public val SQL_C_INTERVAL_MINUTE_TO_SECOND: Int = -92

public val SQL_C_INTERVAL_MONTH: Int = -81

public val SQL_C_INTERVAL_SECOND: Int = -86

public val SQL_C_INTERVAL_YEAR: Int = -80

public val SQL_C_INTERVAL_YEAR_TO_MONTH: Int = -82

public val SQL_C_LONG: UInt = 4u

public val SQL_C_NUMERIC: UInt = 2u

public val SQL_C_SHORT: UInt = 5u

public val SQL_C_TCHAR: Int = -8

public val SQL_C_TIME: UInt = 10u

public val SQL_C_TIMESTAMP: UInt = 11u

public val SQL_C_TINYINT: Int = -6

public val SQL_C_TYPE_DATE: UInt = 91u

public val SQL_C_TYPE_TIME: UInt = 92u

public val SQL_C_TYPE_TIMESTAMP: UInt = 93u

public val SQL_C_VARBOOKMARK: Int = -2

public val SQL_C_WCHAR: Int = -8

public val SQL_DATABASE_NAME: UInt = 16u

public val SQL_DATA_AT_EXEC: Int = -2

public val SQL_DATA_SOURCE_NAME: UInt = 2u

public val SQL_DATA_SOURCE_READ_ONLY: UInt = 25u

public val SQL_DATE: UInt = 9u

public val SQL_DATETIME: UInt = 9u

public val SQL_DATETIME_LITERALS: UInt = 119u

public val SQL_DATE_LEN: UInt = 10u

public val SQL_DAY: UInt = 3u

public val SQL_DAY_TO_HOUR: UInt = 8u

public val SQL_DAY_TO_MINUTE: UInt = 9u

public val SQL_DAY_TO_SECOND: UInt = 10u

public val SQL_DA_DROP_ASSERTION: Int = 1

public val SQL_DBMS_NAME: UInt = 17u

public val SQL_DBMS_VER: UInt = 18u

public val SQL_DB_DEFAULT: UInt = 0u

public val SQL_DB_DISCONNECT: UInt = 1u

public val SQL_DB_RETURN_TO_POOL: UInt = 0u

public val SQL_DCS_DROP_CHARACTER_SET: Int = 1

public val SQL_DC_DROP_COLLATION: Int = 1

public val SQL_DDL_INDEX: UInt = 170u

public val SQL_DD_CASCADE: Int = 4

public val SQL_DD_DROP_DOMAIN: Int = 1

public val SQL_DD_RESTRICT: Int = 2

public val SQL_DECIMAL: UInt = 3u

public val SQL_DEFAULT: UInt = 99u

public val SQL_DEFAULT_PARAM: Int = -5

public val SQL_DEFAULT_TXN_ISOLATION: UInt = 26u

public val SQL_DELETE: UInt = 3u

public val SQL_DELETE_BY_BOOKMARK: UInt = 6u

public val SQL_DESCRIBE_PARAMETER: UInt = 10002u

public val SQL_DESC_ALLOC_AUTO: UInt = 1u

public val SQL_DESC_ALLOC_TYPE: UInt = 1099u

public val SQL_DESC_ALLOC_USER: UInt = 2u

public val SQL_DESC_ARRAY_SIZE: UInt = 20u

public val SQL_DESC_ARRAY_STATUS_PTR: UInt = 21u

public val SQL_DESC_BASE_COLUMN_NAME: UInt = 22u

public val SQL_DESC_BASE_TABLE_NAME: UInt = 23u

public val SQL_DESC_BIND_OFFSET_PTR: UInt = 24u

public val SQL_DESC_BIND_TYPE: UInt = 25u

public val SQL_DESC_COUNT: UInt = 1001u

public val SQL_DESC_DATA_PTR: UInt = 1010u

public val SQL_DESC_DATETIME_INTERVAL_CODE: UInt = 1007u

public val SQL_DESC_DATETIME_INTERVAL_PRECISION: UInt = 26u

public val SQL_DESC_INDICATOR_PTR: UInt = 1009u

public val SQL_DESC_LENGTH: UInt = 1003u

public val SQL_DESC_LITERAL_PREFIX: UInt = 27u

public val SQL_DESC_LITERAL_SUFFIX: UInt = 28u

public val SQL_DESC_LOCAL_TYPE_NAME: UInt = 29u

public val SQL_DESC_MAXIMUM_SCALE: UInt = 30u

public val SQL_DESC_MINIMUM_SCALE: UInt = 31u

public val SQL_DESC_NAME: UInt = 1011u

public val SQL_DESC_NULLABLE: UInt = 1008u

public val SQL_DESC_NUM_PREC_RADIX: UInt = 32u

public val SQL_DESC_OCTET_LENGTH: UInt = 1013u

public val SQL_DESC_OCTET_LENGTH_PTR: UInt = 1004u

public val SQL_DESC_PARAMETER_TYPE: UInt = 33u

public val SQL_DESC_PRECISION: UInt = 1005u

public val SQL_DESC_ROWS_PROCESSED_PTR: UInt = 34u

public val SQL_DESC_ROWVER: UInt = 35u

public val SQL_DESC_SCALE: UInt = 1006u

public val SQL_DESC_TYPE: UInt = 1002u

public val SQL_DESC_UNNAMED: UInt = 1012u

public val SQL_DIAG_ALTER_DOMAIN: UInt = 3u

public val SQL_DIAG_ALTER_TABLE: UInt = 4u

public val SQL_DIAG_CALL: UInt = 7u

public val SQL_DIAG_CLASS_ORIGIN: UInt = 8u

public val SQL_DIAG_COLUMN_NUMBER: Int = -1247

public val SQL_DIAG_CONNECTION_NAME: UInt = 10u

public val SQL_DIAG_CREATE_ASSERTION: UInt = 6u

public val SQL_DIAG_CREATE_CHARACTER_SET: UInt = 8u

public val SQL_DIAG_CREATE_COLLATION: UInt = 10u

public val SQL_DIAG_CREATE_DOMAIN: UInt = 23u

public val SQL_DIAG_CREATE_INDEX: Int = -1

public val SQL_DIAG_CREATE_SCHEMA: UInt = 64u

public val SQL_DIAG_CREATE_TABLE: UInt = 77u

public val SQL_DIAG_CREATE_TRANSLATION: UInt = 79u

public val SQL_DIAG_CREATE_VIEW: UInt = 84u

public val SQL_DIAG_CURSOR_ROW_COUNT: Int = -1249

public val SQL_DIAG_DELETE_WHERE: UInt = 19u

public val SQL_DIAG_DFC_SS_ALTER_DATABASE: Int = -200

public val SQL_DIAG_DFC_SS_BASE: Int = -200

public val SQL_DIAG_DFC_SS_CHECKPOINT: Int = -201

public val SQL_DIAG_DFC_SS_CONDITION: Int = -202

public val SQL_DIAG_DFC_SS_CREATE_DATABASE: Int = -203

public val SQL_DIAG_DFC_SS_CREATE_DEFAULT: Int = -204

public val SQL_DIAG_DFC_SS_CREATE_PROCEDURE: Int = -205

public val SQL_DIAG_DFC_SS_CREATE_RULE: Int = -206

public val SQL_DIAG_DFC_SS_CREATE_TRIGGER: Int = -207

public val SQL_DIAG_DFC_SS_CURSOR_CLOSE: Int = -211

public val SQL_DIAG_DFC_SS_CURSOR_DECLARE: Int = -208

public val SQL_DIAG_DFC_SS_CURSOR_FETCH: Int = -210

public val SQL_DIAG_DFC_SS_CURSOR_OPEN: Int = -209

public val SQL_DIAG_DFC_SS_DBCC: Int = -213

public val SQL_DIAG_DFC_SS_DEALLOCATE_CURSOR: Int = -212

public val SQL_DIAG_DFC_SS_DENY: Int = -254

public val SQL_DIAG_DFC_SS_DISK: Int = -214

public val SQL_DIAG_DFC_SS_DROP_DATABASE: Int = -215

public val SQL_DIAG_DFC_SS_DROP_DEFAULT: Int = -216

public val SQL_DIAG_DFC_SS_DROP_PROCEDURE: Int = -217

public val SQL_DIAG_DFC_SS_DROP_RULE: Int = -218

public val SQL_DIAG_DFC_SS_DROP_TRIGGER: Int = -219

public val SQL_DIAG_DFC_SS_DUMP_DATABASE: Int = -220

public val SQL_DIAG_DFC_SS_DUMP_TABLE: Int = -221

public val SQL_DIAG_DFC_SS_DUMP_TRANSACTION: Int = -222

public val SQL_DIAG_DFC_SS_GOTO: Int = -223

public val SQL_DIAG_DFC_SS_INSERT_BULK: Int = -224

public val SQL_DIAG_DFC_SS_KILL: Int = -225

public val SQL_DIAG_DFC_SS_LOAD_DATABASE: Int = -226

public val SQL_DIAG_DFC_SS_LOAD_HEADERONLY: Int = -227

public val SQL_DIAG_DFC_SS_LOAD_TABLE: Int = -228

public val SQL_DIAG_DFC_SS_LOAD_TRANSACTION: Int = -229

public val SQL_DIAG_DFC_SS_PRINT: Int = -230

public val SQL_DIAG_DFC_SS_RAISERROR: Int = -231

public val SQL_DIAG_DFC_SS_READTEXT: Int = -232

public val SQL_DIAG_DFC_SS_RECONFIGURE: Int = -233

public val SQL_DIAG_DFC_SS_RETURN: Int = -234

public val SQL_DIAG_DFC_SS_SELECT_INTO: Int = -235

public val SQL_DIAG_DFC_SS_SET: Int = -236

public val SQL_DIAG_DFC_SS_SETUSER: Int = -241

public val SQL_DIAG_DFC_SS_SET_IDENTITY_INSERT: Int = -237

public val SQL_DIAG_DFC_SS_SET_ROW_COUNT: Int = -238

public val SQL_DIAG_DFC_SS_SET_STATISTICS: Int = -239

public val SQL_DIAG_DFC_SS_SET_TEXTSIZE: Int = -240

public val SQL_DIAG_DFC_SS_SET_XCTLVL: Int = -255

public val SQL_DIAG_DFC_SS_SHUTDOWN: Int = -242

public val SQL_DIAG_DFC_SS_TRANS_BEGIN: Int = -243

public val SQL_DIAG_DFC_SS_TRANS_COMMIT: Int = -244

public val SQL_DIAG_DFC_SS_TRANS_PREPARE: Int = -245

public val SQL_DIAG_DFC_SS_TRANS_ROLLBACK: Int = -246

public val SQL_DIAG_DFC_SS_TRANS_SAVE: Int = -247

public val SQL_DIAG_DFC_SS_TRUNCATE_TABLE: Int = -248

public val SQL_DIAG_DFC_SS_UPDATETEXT: Int = -250

public val SQL_DIAG_DFC_SS_UPDATE_STATISTICS: Int = -249

public val SQL_DIAG_DFC_SS_USE: Int = -251

public val SQL_DIAG_DFC_SS_WAITFOR: Int = -252

public val SQL_DIAG_DFC_SS_WRITETEXT: Int = -253

public val SQL_DIAG_DROP_ASSERTION: UInt = 24u

public val SQL_DIAG_DROP_CHARACTER_SET: UInt = 25u

public val SQL_DIAG_DROP_COLLATION: UInt = 26u

public val SQL_DIAG_DROP_DOMAIN: UInt = 27u

public val SQL_DIAG_DROP_INDEX: Int = -2

public val SQL_DIAG_DROP_SCHEMA: UInt = 31u

public val SQL_DIAG_DROP_TABLE: UInt = 32u

public val SQL_DIAG_DROP_TRANSLATION: UInt = 33u

public val SQL_DIAG_DROP_VIEW: UInt = 36u

public val SQL_DIAG_DYNAMIC_DELETE_CURSOR: UInt = 38u

public val SQL_DIAG_DYNAMIC_FUNCTION: UInt = 7u

public val SQL_DIAG_DYNAMIC_FUNCTION_CODE: UInt = 12u

public val SQL_DIAG_DYNAMIC_UPDATE_CURSOR: UInt = 81u

public val SQL_DIAG_GRANT: UInt = 48u

public val SQL_DIAG_INSERT: UInt = 50u

public val SQL_DIAG_MESSAGE_TEXT: UInt = 6u

public val SQL_DIAG_NATIVE: UInt = 5u

public val SQL_DIAG_NUMBER: UInt = 2u

public val SQL_DIAG_RETURNCODE: UInt = 1u

public val SQL_DIAG_REVOKE: UInt = 59u

public val SQL_DIAG_ROW_COUNT: UInt = 3u

public val SQL_DIAG_ROW_NUMBER: Int = -1248

public val SQL_DIAG_SELECT_CURSOR: UInt = 85u

public val SQL_DIAG_SERVER_NAME: UInt = 11u

public val SQL_DIAG_SQLSTATE: UInt = 4u

public val SQL_DIAG_SS_BASE: Int = -1150

public val SQL_DIAG_SS_LINE: Int = -1154

public val SQL_DIAG_SS_MSGSTATE: Int = -1150

public val SQL_DIAG_SS_PROCNAME: Int = -1153

public val SQL_DIAG_SS_SEVERITY: Int = -1151

public val SQL_DIAG_SS_SRVNAME: Int = -1152

public val SQL_DIAG_SUBCLASS_ORIGIN: UInt = 9u

public val SQL_DIAG_UNKNOWN_STATEMENT: UInt = 0u

public val SQL_DIAG_UPDATE_WHERE: UInt = 82u

public val SQL_DI_CREATE_INDEX: Int = 1

public val SQL_DI_DROP_INDEX: Int = 2

public val SQL_DL_SQL92_DATE: Int = 1

public val SQL_DL_SQL92_INTERVAL_DAY: Int = 32

public val SQL_DL_SQL92_INTERVAL_DAY_TO_HOUR: Int = 1024

public val SQL_DL_SQL92_INTERVAL_DAY_TO_MINUTE: Int = 2048

public val SQL_DL_SQL92_INTERVAL_DAY_TO_SECOND: Int = 4096

public val SQL_DL_SQL92_INTERVAL_HOUR: Int = 64

public val SQL_DL_SQL92_INTERVAL_HOUR_TO_MINUTE: Int = 8192

public val SQL_DL_SQL92_INTERVAL_HOUR_TO_SECOND: Int = 16384

public val SQL_DL_SQL92_INTERVAL_MINUTE: Int = 128

public val SQL_DL_SQL92_INTERVAL_MINUTE_TO_SECOND: Int = 32768

public val SQL_DL_SQL92_INTERVAL_MONTH: Int = 16

public val SQL_DL_SQL92_INTERVAL_SECOND: Int = 256

public val SQL_DL_SQL92_INTERVAL_YEAR: Int = 8

public val SQL_DL_SQL92_INTERVAL_YEAR_TO_MONTH: Int = 512

public val SQL_DL_SQL92_TIME: Int = 2

public val SQL_DL_SQL92_TIMESTAMP: Int = 4

public val SQL_DM_VER: UInt = 171u

public val SQL_DOUBLE: UInt = 8u

public val SQL_DP_OFF: Int = 0

public val SQL_DP_ON: Int = 1

public val SQL_DRIVER_AWARE_POOLING_CAPABLE: Int = 1

public val SQL_DRIVER_AWARE_POOLING_NOT_CAPABLE: Int = 0

public val SQL_DRIVER_AWARE_POOLING_SUPPORTED: UInt = 10024u

public val SQL_DRIVER_COMPLETE: UInt = 1u

public val SQL_DRIVER_COMPLETE_REQUIRED: UInt = 3u

public val SQL_DRIVER_CONN_ATTR_BASE: UInt = 16384u

public val SQL_DRIVER_C_TYPE_BASE: UInt = 16384u

public val SQL_DRIVER_DESC_FIELD_BASE: UInt = 16384u

public val SQL_DRIVER_DIAG_FIELD_BASE: UInt = 16384u

public val SQL_DRIVER_HDBC: UInt = 3u

public val SQL_DRIVER_HDESC: UInt = 135u

public val SQL_DRIVER_HENV: UInt = 4u

public val SQL_DRIVER_HLIB: UInt = 76u

public val SQL_DRIVER_HSTMT: UInt = 5u

public val SQL_DRIVER_INFO_TYPE_BASE: UInt = 16384u

public val SQL_DRIVER_NAME: UInt = 6u

public val SQL_DRIVER_NOPROMPT: UInt = 0u

public val SQL_DRIVER_ODBC_VER: UInt = 77u

public val SQL_DRIVER_PROMPT: UInt = 2u

public val SQL_DRIVER_SQL_TYPE_BASE: UInt = 16384u

public val SQL_DRIVER_STMT_ATTR_BASE: UInt = 16384u

public val SQL_DRIVER_VER: UInt = 7u

public val SQL_DROP: UInt = 1u

public val SQL_DROP_ASSERTION: UInt = 136u

public val SQL_DROP_CHARACTER_SET: UInt = 137u

public val SQL_DROP_COLLATION: UInt = 138u

public val SQL_DROP_DOMAIN: UInt = 139u

public val SQL_DROP_SCHEMA: UInt = 140u

public val SQL_DROP_TABLE: UInt = 141u

public val SQL_DROP_TRANSLATION: UInt = 142u

public val SQL_DROP_VIEW: UInt = 143u

public val SQL_DS_CASCADE: Int = 4

public val SQL_DS_DROP_SCHEMA: Int = 1

public val SQL_DS_RESTRICT: Int = 2

public val SQL_DTC_DONE: Int = 0

public val SQL_DTC_ENLIST_EXPENSIVE: Int = 1

public val SQL_DTC_TRANSITION_COST: UInt = 1750u

public val SQL_DTC_UNENLIST_EXPENSIVE: Int = 2

public val SQL_DTR_DROP_TRANSLATION: Int = 1

public val SQL_DT_CASCADE: Int = 4

public val SQL_DT_DROP_TABLE: Int = 1

public val SQL_DT_RESTRICT: Int = 2

public val SQL_DV_CASCADE: Int = 4

public val SQL_DV_DROP_VIEW: Int = 1

public val SQL_DV_RESTRICT: Int = 2

public val SQL_DYNAMIC_CURSOR_ATTRIBUTES1: UInt = 144u

public val SQL_DYNAMIC_CURSOR_ATTRIBUTES2: UInt = 145u

public val SQL_ENSURE: UInt = 1u

public val SQL_ENTIRE_ROWSET: UInt = 0u

public val SQL_EN_OFF: Int = 0

public val SQL_EN_ON: Int = 1

public val SQL_ERROR: Int = -1

public val SQL_EXPRESSIONS_IN_ORDERBY: UInt = 27u

public val SQL_EXT_API_LAST: UInt = 72u

public val SQL_EXT_API_START: UInt = 40u

public val SQL_FALSE: UInt = 0u

public val SQL_FAST_CONNECT: UInt = 1200u

public val SQL_FB_DEFAULT: Int = 0

public val SQL_FB_OFF: Int = 0

public val SQL_FB_ON: Int = 1

public val SQL_FC_DEFAULT: Int = 0

public val SQL_FC_OFF: Int = 0

public val SQL_FC_ON: Int = 1

public val SQL_FD_FETCH_ABSOLUTE: Int = 16

public val SQL_FD_FETCH_BOOKMARK: Int = 128

public val SQL_FD_FETCH_FIRST: Int = 2

public val SQL_FD_FETCH_LAST: Int = 4

public val SQL_FD_FETCH_NEXT: Int = 1

public val SQL_FD_FETCH_PREV: Int = 8

public val SQL_FD_FETCH_PRIOR: Int = 8

public val SQL_FD_FETCH_RELATIVE: Int = 32

public val SQL_FD_FETCH_RESUME: Int = 64

public val SQL_FETCH_ABSOLUTE: UInt = 5u

public val SQL_FETCH_BOOKMARK: UInt = 8u

public val SQL_FETCH_BY_BOOKMARK: UInt = 7u

public val SQL_FETCH_DIRECTION: UInt = 8u

public val SQL_FETCH_FIRST: UInt = 2u

public val SQL_FETCH_FIRST_SYSTEM: UInt = 32u

public val SQL_FETCH_FIRST_USER: UInt = 31u

public val SQL_FETCH_LAST: UInt = 3u

public val SQL_FETCH_NEXT: UInt = 1u

public val SQL_FETCH_PREV: UInt = 4u

public val SQL_FETCH_PRIOR: UInt = 4u

public val SQL_FETCH_RELATIVE: UInt = 6u

public val SQL_FETCH_RESUME: UInt = 7u

public val SQL_FILE_CATALOG: UInt = 2u

public val SQL_FILE_NOT_SUPPORTED: UInt = 0u

public val SQL_FILE_QUALIFIER: UInt = 2u

public val SQL_FILE_TABLE: UInt = 1u

public val SQL_FILE_USAGE: UInt = 84u

public val SQL_FLOAT: UInt = 6u

public val SQL_FN_CVT_CAST: Int = 2

public val SQL_FN_CVT_CONVERT: Int = 1

public val SQL_FN_NUM_ABS: Int = 1

public val SQL_FN_NUM_ACOS: Int = 2

public val SQL_FN_NUM_ASIN: Int = 4

public val SQL_FN_NUM_ATAN: Int = 8

public val SQL_FN_NUM_ATAN2: Int = 16

public val SQL_FN_NUM_CEILING: Int = 32

public val SQL_FN_NUM_COS: Int = 64

public val SQL_FN_NUM_COT: Int = 128

public val SQL_FN_NUM_DEGREES: Int = 262144

public val SQL_FN_NUM_EXP: Int = 256

public val SQL_FN_NUM_FLOOR: Int = 512

public val SQL_FN_NUM_LOG: Int = 1024

public val SQL_FN_NUM_LOG10: Int = 524288

public val SQL_FN_NUM_MOD: Int = 2048

public val SQL_FN_NUM_PI: Int = 65536

public val SQL_FN_NUM_POWER: Int = 1048576

public val SQL_FN_NUM_RADIANS: Int = 2097152

public val SQL_FN_NUM_RAND: Int = 131072

public val SQL_FN_NUM_ROUND: Int = 4194304

public val SQL_FN_NUM_SIGN: Int = 4096

public val SQL_FN_NUM_SIN: Int = 8192

public val SQL_FN_NUM_SQRT: Int = 16384

public val SQL_FN_NUM_TAN: Int = 32768

public val SQL_FN_NUM_TRUNCATE: Int = 8388608

public val SQL_FN_STR_ASCII: Int = 8192

public val SQL_FN_STR_BIT_LENGTH: Int = 524288

public val SQL_FN_STR_CHAR: Int = 16384

public val SQL_FN_STR_CHARACTER_LENGTH: Int = 2097152

public val SQL_FN_STR_CHAR_LENGTH: Int = 1048576

public val SQL_FN_STR_CONCAT: Int = 1

public val SQL_FN_STR_DIFFERENCE: Int = 32768

public val SQL_FN_STR_INSERT: Int = 2

public val SQL_FN_STR_LCASE: Int = 64

public val SQL_FN_STR_LEFT: Int = 4

public val SQL_FN_STR_LENGTH: Int = 16

public val SQL_FN_STR_LOCATE: Int = 32

public val SQL_FN_STR_LOCATE_2: Int = 65536

public val SQL_FN_STR_LTRIM: Int = 8

public val SQL_FN_STR_OCTET_LENGTH: Int = 4194304

public val SQL_FN_STR_POSITION: Int = 8388608

public val SQL_FN_STR_REPEAT: Int = 128

public val SQL_FN_STR_REPLACE: Int = 256

public val SQL_FN_STR_RIGHT: Int = 512

public val SQL_FN_STR_RTRIM: Int = 1024

public val SQL_FN_STR_SOUNDEX: Int = 131072

public val SQL_FN_STR_SPACE: Int = 262144

public val SQL_FN_STR_SUBSTRING: Int = 2048

public val SQL_FN_STR_UCASE: Int = 4096

public val SQL_FN_SYS_DBNAME: Int = 2

public val SQL_FN_SYS_IFNULL: Int = 4

public val SQL_FN_SYS_USERNAME: Int = 1

public val SQL_FN_TD_CURDATE: Int = 2

public val SQL_FN_TD_CURRENT_DATE: Int = 131072

public val SQL_FN_TD_CURRENT_TIME: Int = 262144

public val SQL_FN_TD_CURRENT_TIMESTAMP: Int = 524288

public val SQL_FN_TD_CURTIME: Int = 512

public val SQL_FN_TD_DAYNAME: Int = 32768

public val SQL_FN_TD_DAYOFMONTH: Int = 4

public val SQL_FN_TD_DAYOFWEEK: Int = 8

public val SQL_FN_TD_DAYOFYEAR: Int = 16

public val SQL_FN_TD_EXTRACT: Int = 1048576

public val SQL_FN_TD_HOUR: Int = 1024

public val SQL_FN_TD_MINUTE: Int = 2048

public val SQL_FN_TD_MONTH: Int = 32

public val SQL_FN_TD_MONTHNAME: Int = 65536

public val SQL_FN_TD_NOW: Int = 1

public val SQL_FN_TD_QUARTER: Int = 64

public val SQL_FN_TD_SECOND: Int = 4096

public val SQL_FN_TD_TIMESTAMPADD: Int = 8192

public val SQL_FN_TD_TIMESTAMPDIFF: Int = 16384

public val SQL_FN_TD_WEEK: Int = 128

public val SQL_FN_TD_YEAR: Int = 256

public val SQL_FN_TSI_DAY: Int = 16

public val SQL_FN_TSI_FRAC_SECOND: Int = 1

public val SQL_FN_TSI_HOUR: Int = 8

public val SQL_FN_TSI_MINUTE: Int = 4

public val SQL_FN_TSI_MONTH: Int = 64

public val SQL_FN_TSI_QUARTER: Int = 128

public val SQL_FN_TSI_SECOND: Int = 2

public val SQL_FN_TSI_WEEK: Int = 32

public val SQL_FN_TSI_YEAR: Int = 256

public val SQL_FORWARD_ONLY_CURSOR_ATTRIBUTES1: UInt = 146u

public val SQL_FORWARD_ONLY_CURSOR_ATTRIBUTES2: UInt = 147u

public val SQL_GB_COLLATE: UInt = 4u

public val SQL_GB_GROUP_BY_CONTAINS_SELECT: UInt = 2u

public val SQL_GB_GROUP_BY_EQUALS_SELECT: UInt = 1u

public val SQL_GB_NOT_SUPPORTED: UInt = 0u

public val SQL_GB_NO_RELATION: UInt = 3u

public val SQL_GD_ANY_COLUMN: Int = 1

public val SQL_GD_ANY_ORDER: Int = 2

public val SQL_GD_BLOCK: Int = 4

public val SQL_GD_BOUND: Int = 8

public val SQL_GD_OUTPUT_PARAMS: Int = 16

public val SQL_GETDATA_EXTENSIONS: UInt = 81u

public val SQL_GET_BOOKMARK: UInt = 13u

public val SQL_GROUP_BY: UInt = 88u

public val SQL_GUID: Int = -11

public val SQL_HANDLE_DBC: UInt = 2u

public val SQL_HANDLE_DBC_INFO_TOKEN: UInt = 6u

public val SQL_HANDLE_DESC: UInt = 4u

public val SQL_HANDLE_ENV: UInt = 1u

public val SQL_HANDLE_SENV: UInt = 5u

public val SQL_HANDLE_STMT: UInt = 3u

public val SQL_HC_DEFAULT: Int = 0

public val SQL_HC_OFF: Int = 0

public val SQL_HC_ON: Int = 1

public val SQL_HOUR: UInt = 4u

public val SQL_HOUR_TO_MINUTE: UInt = 11u

public val SQL_HOUR_TO_SECOND: UInt = 12u

public val SQL_IC_LOWER: UInt = 2u

public val SQL_IC_MIXED: UInt = 4u

public val SQL_IC_SENSITIVE: UInt = 3u

public val SQL_IC_UPPER: UInt = 1u

public val SQL_IDENTIFIER_CASE: UInt = 28u

public val SQL_IDENTIFIER_QUOTE_CHAR: UInt = 29u

public val SQL_IGNORE: Int = -6

public val SQL_IK_ASC: Int = 1

public val SQL_IK_DESC: Int = 2

public val SQL_IK_NONE: Int = 0

public val SQL_INDEX_ALL: UInt = 1u

public val SQL_INDEX_CLUSTERED: UInt = 1u

public val SQL_INDEX_HASHED: UInt = 2u

public val SQL_INDEX_KEYWORDS: UInt = 148u

public val SQL_INDEX_OTHER: UInt = 3u

public val SQL_INDEX_UNIQUE: UInt = 0u

public val SQL_INFO_DRIVER_START: UInt = 1000u

public val SQL_INFO_FIRST: UInt = 0u

public val SQL_INFO_LAST: UInt = 114u

public val SQL_INFO_SCHEMA_VIEWS: UInt = 149u

public val SQL_INFO_SS_FIRST: UInt = 1199u

public val SQL_INFO_SS_MAX_USED: UInt = 1200u

public val SQL_INFO_SS_NETLIB_NAME: UInt = 1199u

public val SQL_INFO_SS_NETLIB_NAMEA: UInt = 1200u

public val SQL_INFO_SS_NETLIB_NAMEW: UInt = 1199u

public val SQL_INITIALLY_DEFERRED: UInt = 5u

public val SQL_INITIALLY_IMMEDIATE: UInt = 6u

public val SQL_INSENSITIVE: UInt = 1u

public val SQL_INSERT_STATEMENT: UInt = 172u

public val SQL_INTEGER: UInt = 4u

public val SQL_INTEGRATED_SECURITY: UInt = 1203u

public val SQL_INTEGRITY: UInt = 73u

public val SQL_INTERVAL: UInt = 10u

public val SQL_INTERVAL_DAY: Int = -83

public val SQL_INTERVAL_DAY_TO_HOUR: Int = -87

public val SQL_INTERVAL_DAY_TO_MINUTE: Int = -88

public val SQL_INTERVAL_DAY_TO_SECOND: Int = -89

public val SQL_INTERVAL_HOUR: Int = -84

public val SQL_INTERVAL_HOUR_TO_MINUTE: Int = -90

public val SQL_INTERVAL_HOUR_TO_SECOND: Int = -91

public val SQL_INTERVAL_MINUTE: Int = -85

public val SQL_INTERVAL_MINUTE_TO_SECOND: Int = -92

public val SQL_INTERVAL_MONTH: Int = -81

public val SQL_INTERVAL_SECOND: Int = -86

public val SQL_INTERVAL_YEAR: Int = -80

public val SQL_INTERVAL_YEAR_TO_MONTH: Int = -82

public val SQL_INVALID_HANDLE: Int = -2

public val SQL_ISV_ASSERTIONS: Int = 1

public val SQL_ISV_CHARACTER_SETS: Int = 2

public val SQL_ISV_CHECK_CONSTRAINTS: Int = 4

public val SQL_ISV_COLLATIONS: Int = 8

public val SQL_ISV_COLUMNS: Int = 64

public val SQL_ISV_COLUMN_DOMAIN_USAGE: Int = 16

public val SQL_ISV_COLUMN_PRIVILEGES: Int = 32

public val SQL_ISV_CONSTRAINT_COLUMN_USAGE: Int = 128

public val SQL_ISV_CONSTRAINT_TABLE_USAGE: Int = 256

public val SQL_ISV_DOMAINS: Int = 1024

public val SQL_ISV_DOMAIN_CONSTRAINTS: Int = 512

public val SQL_ISV_KEY_COLUMN_USAGE: Int = 2048

public val SQL_ISV_REFERENTIAL_CONSTRAINTS: Int = 4096

public val SQL_ISV_SCHEMATA: Int = 8192

public val SQL_ISV_SQL_LANGUAGES: Int = 16384

public val SQL_ISV_TABLES: Int = 131072

public val SQL_ISV_TABLE_CONSTRAINTS: Int = 32768

public val SQL_ISV_TABLE_PRIVILEGES: Int = 65536

public val SQL_ISV_TRANSLATIONS: Int = 262144

public val SQL_ISV_USAGE_PRIVILEGES: Int = 524288

public val SQL_ISV_VIEWS: Int = 4194304

public val SQL_ISV_VIEW_COLUMN_USAGE: Int = 1048576

public val SQL_ISV_VIEW_TABLE_USAGE: Int = 2097152

public val SQL_IS_DAY: SQLINTERVAL = 3

public val SQL_IS_DAY_TO_HOUR: SQLINTERVAL = 8

public val SQL_IS_DAY_TO_MINUTE: SQLINTERVAL = 9

public val SQL_IS_DAY_TO_SECOND: SQLINTERVAL = 10

public val SQL_IS_DEFAULT: Int = 0

public val SQL_IS_HOUR: SQLINTERVAL = 4

public val SQL_IS_HOUR_TO_MINUTE: SQLINTERVAL = 11

public val SQL_IS_HOUR_TO_SECOND: SQLINTERVAL = 12

public val SQL_IS_INSERT_LITERALS: Int = 1

public val SQL_IS_INSERT_SEARCHED: Int = 2

public val SQL_IS_INTEGER: Int = -6

public val SQL_IS_MINUTE: SQLINTERVAL = 5

public val SQL_IS_MINUTE_TO_SECOND: SQLINTERVAL = 13

public val SQL_IS_MONTH: SQLINTERVAL = 2

public val SQL_IS_OFF: Int = 0

public val SQL_IS_ON: Int = 1

public val SQL_IS_POINTER: Int = -4

public val SQL_IS_SECOND: SQLINTERVAL = 6

public val SQL_IS_SELECT_INTO: Int = 4

public val SQL_IS_SMALLINT: Int = -8

public val SQL_IS_UINTEGER: Int = -5

public val SQL_IS_USMALLINT: Int = -7

public val SQL_IS_YEAR: SQLINTERVAL = 1

public val SQL_IS_YEAR_TO_MONTH: SQLINTERVAL = 7

public val SQL_KEYSET_CURSOR_ATTRIBUTES1: UInt = 150u

public val SQL_KEYSET_CURSOR_ATTRIBUTES2: UInt = 151u

public val SQL_KEYSET_SIZE: UInt = 8u

public val SQL_KEYSET_SIZE_DEFAULT: UInt = 0u

public val SQL_KEYWORDS: UInt = 89u

public val SQL_LCK_EXCLUSIVE: Int = 2

public val SQL_LCK_NO_CHANGE: Int = 1

public val SQL_LCK_UNLOCK: Int = 4

public val SQL_LEN_BINARY_ATTR_OFFSET: Int = -100

public val SQL_LEN_DATA_AT_EXEC_OFFSET: Int = -100

public val SQL_LIKE_ESCAPE_CLAUSE: UInt = 113u

public val SQL_LIKE_ONLY: UInt = 1u

public val SQL_LOCK_EXCLUSIVE: UInt = 1u

public val SQL_LOCK_NO_CHANGE: UInt = 0u

public val SQL_LOCK_TYPES: UInt = 78u

public val SQL_LOCK_UNLOCK: UInt = 2u

public val SQL_LOGIN_TIMEOUT: UInt = 103u

public val SQL_LOGIN_TIMEOUT_DEFAULT: UInt = 15u

public val SQL_LONGVARBINARY: Int = -4

public val SQL_LONGVARCHAR: Int = -1

public val SQL_MAXIMUM_CATALOG_NAME_LENGTH: UInt = 34u

public val SQL_MAXIMUM_COLUMNS_IN_GROUP_BY: UInt = 97u

public val SQL_MAXIMUM_COLUMNS_IN_INDEX: UInt = 98u

public val SQL_MAXIMUM_COLUMNS_IN_ORDER_BY: UInt = 99u

public val SQL_MAXIMUM_COLUMNS_IN_SELECT: UInt = 100u

public val SQL_MAXIMUM_COLUMN_NAME_LENGTH: UInt = 30u

public val SQL_MAXIMUM_CONCURRENT_ACTIVITIES: UInt = 1u

public val SQL_MAXIMUM_CURSOR_NAME_LENGTH: UInt = 31u

public val SQL_MAXIMUM_DRIVER_CONNECTIONS: UInt = 0u

public val SQL_MAXIMUM_IDENTIFIER_LENGTH: UInt = 10005u

public val SQL_MAXIMUM_INDEX_SIZE: UInt = 102u

public val SQL_MAXIMUM_ROW_SIZE: UInt = 104u

public val SQL_MAXIMUM_SCHEMA_NAME_LENGTH: UInt = 32u

public val SQL_MAXIMUM_STATEMENT_LENGTH: UInt = 105u

public val SQL_MAXIMUM_TABLES_IN_SELECT: UInt = 106u

public val SQL_MAXIMUM_USER_NAME_LENGTH: UInt = 107u

public val SQL_MAX_ASYNC_CONCURRENT_STATEMENTS: UInt = 10022u

public val SQL_MAX_BINARY_LITERAL_LEN: UInt = 112u

public val SQL_MAX_CATALOG_NAME_LEN: UInt = 34u

public val SQL_MAX_CHAR_LITERAL_LEN: UInt = 108u

public val SQL_MAX_COLUMNS_IN_GROUP_BY: UInt = 97u

public val SQL_MAX_COLUMNS_IN_INDEX: UInt = 98u

public val SQL_MAX_COLUMNS_IN_ORDER_BY: UInt = 99u

public val SQL_MAX_COLUMNS_IN_SELECT: UInt = 100u

public val SQL_MAX_COLUMNS_IN_TABLE: UInt = 101u

public val SQL_MAX_COLUMN_NAME_LEN: UInt = 30u

public val SQL_MAX_CONCURRENT_ACTIVITIES: UInt = 1u

public val SQL_MAX_CURSOR_NAME_LEN: UInt = 31u

public val SQL_MAX_DRIVER_CONNECTIONS: UInt = 0u

public val SQL_MAX_DSN_LENGTH: UInt = 32u

public val SQL_MAX_IDENTIFIER_LEN: UInt = 10005u

public val SQL_MAX_INDEX_SIZE: UInt = 102u

public val SQL_MAX_LENGTH: UInt = 3u

public val SQL_MAX_LENGTH_DEFAULT: UInt = 0u

public val SQL_MAX_MESSAGE_LENGTH: UInt = 512u

public val SQL_MAX_NUMERIC_LEN: UInt = 16u

public val SQL_MAX_OPTION_STRING_LENGTH: UInt = 256u

public val SQL_MAX_OWNER_NAME_LEN: UInt = 32u

public val SQL_MAX_PROCEDURE_NAME_LEN: UInt = 33u

public val SQL_MAX_QUALIFIER_NAME_LEN: UInt = 34u

public val SQL_MAX_ROWS: UInt = 1u

public val SQL_MAX_ROWS_DEFAULT: UInt = 0u

public val SQL_MAX_ROW_SIZE: UInt = 104u

public val SQL_MAX_ROW_SIZE_INCLUDES_LONG: UInt = 103u

public val SQL_MAX_SCHEMA_NAME_LEN: UInt = 32u

public val SQL_MAX_SQLSERVERNAME: UInt = 128u

public val SQL_MAX_STATEMENT_LEN: UInt = 105u

public val SQL_MAX_TABLES_IN_SELECT: UInt = 106u

public val SQL_MAX_TABLE_NAME_LEN: UInt = 35u

public val SQL_MAX_USER_NAME_LEN: UInt = 107u

public val SQL_MINUTE: UInt = 5u

public val SQL_MINUTE_TO_SECOND: UInt = 13u

public val SQL_MODE_DEFAULT: UInt = 0u

public val SQL_MODE_READ_ONLY: UInt = 1u

public val SQL_MODE_READ_WRITE: UInt = 0u

public val SQL_MONTH: UInt = 2u

public val SQL_MORE_INFO_NO: Int = 0

public val SQL_MORE_INFO_YES: Int = 1

public val SQL_MULTIPLE_ACTIVE_TXN: UInt = 37u

public val SQL_MULT_RESULT_SETS: UInt = 36u

public val SQL_NAMED: UInt = 0u

public val SQL_NB_DEFAULT: Int = 0

public val SQL_NB_OFF: Int = 0

public val SQL_NB_ON: Int = 1

public val SQL_NC_END: UInt = 4u

public val SQL_NC_HIGH: UInt = 0u

public val SQL_NC_LOW: UInt = 1u

public val SQL_NC_OFF: Int = 0

public val SQL_NC_ON: Int = 1

public val SQL_NC_START: UInt = 2u

public val SQL_NEED_DATA: UInt = 99u

public val SQL_NEED_LONG_DATA_LEN: UInt = 111u

public val SQL_NNC_NON_NULL: UInt = 1u

public val SQL_NNC_NULL: UInt = 0u

public val SQL_NONSCROLLABLE: UInt = 0u

public val SQL_NON_NULLABLE_COLUMNS: UInt = 75u

public val SQL_NOSCAN: UInt = 2u

public val SQL_NOSCAN_DEFAULT: UInt = 0u

public val SQL_NOSCAN_OFF: UInt = 0u

public val SQL_NOSCAN_ON: UInt = 1u

public val SQL_NOT_DEFERRABLE: UInt = 7u

public val SQL_NO_ACTION: UInt = 3u

public val SQL_NO_COLUMN_NUMBER: Int = -1

public val SQL_NO_DATA: UInt = 100u

public val SQL_NO_DATA_FOUND: UInt = 100u

public val SQL_NO_NULLS: UInt = 0u

public val SQL_NO_ROW_NUMBER: Int = -1

public val SQL_NO_TOTAL: Int = -4

public val SQL_NTS: Int = -3

public val SQL_NTSL: Int = -3

public val SQL_NULLABLE: UInt = 1u

public val SQL_NULLABLE_UNKNOWN: UInt = 2u

public val SQL_NULL_COLLATION: UInt = 85u

public val SQL_NULL_DATA: Int = -1

public val SQL_NULL_HANDLE: Int = 0

public val SQL_NULL_HDBC: UInt = 0u

public val SQL_NULL_HDESC: UInt = 0u

public val SQL_NULL_HENV: UInt = 0u

public val SQL_NULL_HSTMT: UInt = 0u

public val SQL_NUMERIC: UInt = 2u

public val SQL_NUMERIC_FUNCTIONS: UInt = 49u

public val SQL_NUM_FUNCTIONS: UInt = 23u

public val SQL_OAC_LEVEL1: UInt = 1u

public val SQL_OAC_LEVEL2: UInt = 2u

public val SQL_OAC_NONE: UInt = 0u

public val SQL_ODBC_API_CONFORMANCE: UInt = 9u

public val SQL_ODBC_CURSORS: UInt = 110u

public val SQL_ODBC_INTERFACE_CONFORMANCE: UInt = 152u

public val SQL_ODBC_KEYWORDS: PCSTR = s("ABSOLUTE,ACTION,ADA,ADD,ALL,ALLOCATE,ALTER,AND,ANY,ARE,AS,ASC,ASSERTION,AT,AUTHORIZATION,AVG,BEGIN,BETWEEN,BIT,BIT_LENGTH,BOTH,BY,CASCADE,CASCADED,CASE,CAST,CATALOG,CHAR,CHAR_LENGTH,CHARACTER,CHARACTER_LENGTH,CHECK,CLOSE,COALESCE,COLLATE,COLLATION,COLUMN,COMMIT,CONNECT,CONNECTION,CONSTRAINT,CONSTRAINTS,CONTINUE,CONVERT,CORRESPONDING,COUNT,CREATE,CROSS,CURRENT,CURRENT_DATE,CURRENT_TIME,CURRENT_TIMESTAMP,CURRENT_USER,CURSOR,DATE,DAY,DEALLOCATE,DEC,DECIMAL,DECLARE,DEFAULT,DEFERRABLE,DEFERRED,DELETE,DESC,DESCRIBE,DESCRIPTOR,DIAGNOSTICS,DISCONNECT,DISTINCT,DOMAIN,DOUBLE,DROP,ELSE,END,END-EXEC,ESCAPE,EXCEPT,EXCEPTION,EXEC,EXECUTE,EXISTS,EXTERNAL,EXTRACT,FALSE,FETCH,FIRST,FLOAT,FOR,FOREIGN,FORTRAN,FOUND,FROM,FULL,GET,GLOBAL,GO,GOTO,GRANT,GROUP,HAVING,HOUR,IDENTITY,IMMEDIATE,IN,INCLUDE,INDEX,INDICATOR,INITIALLY,INNER,INPUT,INSENSITIVE,INSERT,INT,INTEGER,INTERSECT,INTERVAL,INTO,IS,ISOLATION,JOIN,KEY,LANGUAGE,LAST,LEADING,LEFT,LEVEL,LIKE,LOCAL,LOWER,MATCH,MAX,MIN,MINUTE,MODULE,MONTH,NAMES,NATIONAL,NATURAL,NCHAR,NEXT,NO,NONE,NOT,NULL,NULLIF,NUMERIC,OCTET_LENGTH,OF,ON,ONLY,OPEN,OPTION,OR,ORDER,OUTER,OUTPUT,OVERLAPS,PAD,PARTIAL,PASCAL,PLI,POSITION,PRECISION,PREPARE,PRESERVE,PRIMARY,PRIOR,PRIVILEGES,PROCEDURE,PUBLIC,READ,REAL,REFERENCES,RELATIVE,RESTRICT,REVOKE,RIGHT,ROLLBACK,ROWSSCHEMA,SCROLL,SECOND,SECTION,SELECT,SESSION,SESSION_USER,SET,SIZE,SMALLINT,SOME,SPACE,SQL,SQLCA,SQLCODE,SQLERROR,SQLSTATE,SQLWARNING,SUBSTRING,SUM,SYSTEM_USER,TABLE,TEMPORARY,THEN,TIME,TIMESTAMP,TIMEZONE_HOUR,TIMEZONE_MINUTE,TO,TRAILING,TRANSACTION,TRANSLATE,TRANSLATION,TRIM,TRUE,UNION,UNIQUE,UNKNOWN,UPDATE,UPPER,USAGE,USER,USING,VALUE,VALUES,VARCHAR,VARYING,VIEW,WHEN,WHENEVER,WHERE,WITH,WORK,WRITE,YEAR,ZONE")

public val SQL_ODBC_SAG_CLI_CONFORMANCE: UInt = 12u

public val SQL_ODBC_SQL_CONFORMANCE: UInt = 15u

public val SQL_ODBC_SQL_OPT_IEF: UInt = 73u

public val SQL_ODBC_VER: UInt = 10u

public val SQL_OIC_CORE: UInt = 1u

public val SQL_OIC_LEVEL1: UInt = 2u

public val SQL_OIC_LEVEL2: UInt = 3u

public val SQL_OJ_ALL_COMPARISON_OPS: Int = 64

public val SQL_OJ_CAPABILITIES: UInt = 115u

public val SQL_OJ_FULL: Int = 4

public val SQL_OJ_INNER: Int = 32

public val SQL_OJ_LEFT: Int = 1

public val SQL_OJ_NESTED: Int = 8

public val SQL_OJ_NOT_ORDERED: Int = 16

public val SQL_OJ_RIGHT: Int = 2

public val SQL_OPT_TRACE: UInt = 104u

public val SQL_OPT_TRACEFILE: UInt = 105u

public val SQL_OPT_TRACE_DEFAULT: UInt = 0u

public val SQL_OPT_TRACE_FILE_DEFAULT: PCSTR = s("\\SQL.LOG")

public val SQL_OPT_TRACE_OFF: UInt = 0u

public val SQL_OPT_TRACE_ON: UInt = 1u

public val SQL_ORDER_BY_COLUMNS_IN_SELECT: UInt = 90u

public val SQL_OSCC_COMPLIANT: UInt = 1u

public val SQL_OSCC_NOT_COMPLIANT: UInt = 0u

public val SQL_OSC_CORE: UInt = 1u

public val SQL_OSC_EXTENDED: UInt = 2u

public val SQL_OSC_MINIMUM: UInt = 0u

public val SQL_OUTER_JOINS: UInt = 38u

public val SQL_OUTER_JOIN_CAPABILITIES: UInt = 115u

public val SQL_OU_DML_STATEMENTS: Int = 1

public val SQL_OU_INDEX_DEFINITION: Int = 8

public val SQL_OU_PRIVILEGE_DEFINITION: Int = 16

public val SQL_OU_PROCEDURE_INVOCATION: Int = 2

public val SQL_OU_TABLE_DEFINITION: Int = 4

public val SQL_OV_ODBC2: UInt = 2u

public val SQL_OV_ODBC3: UInt = 3u

public val SQL_OV_ODBC3_80: UInt = 380u

public val SQL_OWNER_TERM: UInt = 39u

public val SQL_OWNER_USAGE: UInt = 91u

public val SQL_PACKET_SIZE: UInt = 112u

public val SQL_PARAM_ARRAY_ROW_COUNTS: UInt = 153u

public val SQL_PARAM_ARRAY_SELECTS: UInt = 154u

public val SQL_PARAM_BIND_BY_COLUMN: UInt = 0u

public val SQL_PARAM_BIND_TYPE_DEFAULT: UInt = 0u

public val SQL_PARAM_DATA_AVAILABLE: UInt = 101u

public val SQL_PARAM_DIAG_UNAVAILABLE: UInt = 1u

public val SQL_PARAM_ERROR: UInt = 5u

public val SQL_PARAM_IGNORE: UInt = 1u

public val SQL_PARAM_INPUT: UInt = 1u

public val SQL_PARAM_INPUT_OUTPUT: UInt = 2u

public val SQL_PARAM_INPUT_OUTPUT_STREAM: UInt = 8u

public val SQL_PARAM_OUTPUT: UInt = 4u

public val SQL_PARAM_OUTPUT_STREAM: UInt = 16u

public val SQL_PARAM_PROCEED: UInt = 0u

public val SQL_PARAM_SUCCESS: UInt = 0u

public val SQL_PARAM_SUCCESS_WITH_INFO: UInt = 6u

public val SQL_PARAM_TYPE_UNKNOWN: UInt = 0u

public val SQL_PARAM_UNUSED: UInt = 7u

public val SQL_PARC_BATCH: UInt = 1u

public val SQL_PARC_NO_BATCH: UInt = 2u

public val SQL_PAS_BATCH: UInt = 1u

public val SQL_PAS_NO_BATCH: UInt = 2u

public val SQL_PAS_NO_SELECT: UInt = 3u

public val SQL_PC_DEFAULT: Int = 0

public val SQL_PC_NON_PSEUDO: UInt = 1u

public val SQL_PC_NOT_PSEUDO: UInt = 1u

public val SQL_PC_OFF: Int = 0

public val SQL_PC_ON: Int = 1

public val SQL_PC_PSEUDO: UInt = 2u

public val SQL_PC_UNKNOWN: UInt = 0u

public val SQL_PERF_START: UInt = 1u

public val SQL_PERF_STOP: UInt = 2u

public val SQL_POSITION: UInt = 0u

public val SQL_POSITIONED_STATEMENTS: UInt = 80u

public val SQL_POS_ADD: Int = 16

public val SQL_POS_DELETE: Int = 8

public val SQL_POS_OPERATIONS: UInt = 79u

public val SQL_POS_POSITION: Int = 1

public val SQL_POS_REFRESH: Int = 2

public val SQL_POS_UPDATE: Int = 4

public val SQL_PRED_BASIC: UInt = 2u

public val SQL_PRED_CHAR: UInt = 1u

public val SQL_PRED_NONE: UInt = 0u

public val SQL_PRED_SEARCHABLE: UInt = 3u

public val SQL_PRESERVE_CURSORS: UInt = 1204u

public val SQL_PROCEDURES: UInt = 21u

public val SQL_PROCEDURE_TERM: UInt = 40u

public val SQL_PS_POSITIONED_DELETE: Int = 1

public val SQL_PS_POSITIONED_UPDATE: Int = 2

public val SQL_PS_SELECT_FOR_UPDATE: Int = 4

public val SQL_PT_FUNCTION: UInt = 2u

public val SQL_PT_PROCEDURE: UInt = 1u

public val SQL_PT_UNKNOWN: UInt = 0u

public val SQL_QI_DEFAULT: Int = 1

public val SQL_QI_OFF: Int = 0

public val SQL_QI_ON: Int = 1

public val SQL_QL_END: UInt = 2u

public val SQL_QL_START: UInt = 1u

public val SQL_QUALIFIER_LOCATION: UInt = 114u

public val SQL_QUALIFIER_NAME_SEPARATOR: UInt = 41u

public val SQL_QUALIFIER_TERM: UInt = 42u

public val SQL_QUALIFIER_USAGE: UInt = 92u

public val SQL_QUERY_TIMEOUT: UInt = 0u

public val SQL_QUERY_TIMEOUT_DEFAULT: UInt = 0u

public val SQL_QUICK: UInt = 0u

public val SQL_QUIET_MODE: UInt = 111u

public val SQL_QUOTED_IDENTIFIER_CASE: UInt = 93u

public val SQL_QU_DML_STATEMENTS: Int = 1

public val SQL_QU_INDEX_DEFINITION: Int = 8

public val SQL_QU_PRIVILEGE_DEFINITION: Int = 16

public val SQL_QU_PROCEDURE_INVOCATION: Int = 2

public val SQL_QU_TABLE_DEFINITION: Int = 4

public val SQL_RD_DEFAULT: UInt = 1u

public val SQL_RD_OFF: UInt = 0u

public val SQL_RD_ON: UInt = 1u

public val SQL_REAL: UInt = 7u

public val SQL_REFRESH: UInt = 1u

public val SQL_REMOTE_PWD: UInt = 1201u

public val SQL_RESET_CONNECTION_YES: UInt = 1u

public val SQL_RESET_PARAMS: UInt = 3u

public val SQL_RESET_YES: Int = 1

public val SQL_RESTRICT: UInt = 1u

public val SQL_RESULT_COL: UInt = 3u

public val SQL_RETRIEVE_DATA: UInt = 11u

public val SQL_RETURN_VALUE: UInt = 5u

public val SQL_RE_DEFAULT: Int = 0

public val SQL_RE_OFF: Int = 0

public val SQL_RE_ON: Int = 1

public val SQL_ROLLBACK: UInt = 1u

public val SQL_ROWSET_SIZE: UInt = 9u

public val SQL_ROWSET_SIZE_DEFAULT: UInt = 1u

public val SQL_ROWVER: UInt = 2u

public val SQL_ROW_ADDED: UInt = 4u

public val SQL_ROW_DELETED: UInt = 1u

public val SQL_ROW_ERROR: UInt = 5u

public val SQL_ROW_IDENTIFIER: UInt = 1u

public val SQL_ROW_IGNORE: UInt = 1u

public val SQL_ROW_NOROW: UInt = 3u

public val SQL_ROW_NUMBER: UInt = 14u

public val SQL_ROW_NUMBER_UNKNOWN: Int = -2

public val SQL_ROW_PROCEED: UInt = 0u

public val SQL_ROW_SUCCESS: UInt = 0u

public val SQL_ROW_SUCCESS_WITH_INFO: UInt = 6u

public val SQL_ROW_UPDATED: UInt = 2u

public val SQL_ROW_UPDATES: UInt = 11u

public val SQL_SCCO_LOCK: Int = 2

public val SQL_SCCO_OPT_ROWVER: Int = 4

public val SQL_SCCO_OPT_TIMESTAMP: Int = 4

public val SQL_SCCO_OPT_VALUES: Int = 8

public val SQL_SCCO_READ_ONLY: Int = 1

public val SQL_SCC_ISO92_CLI: Int = 2

public val SQL_SCC_XOPEN_CLI_VERSION1: Int = 1

public val SQL_SCHEMA_TERM: UInt = 39u

public val SQL_SCHEMA_USAGE: UInt = 91u

public val SQL_SCOPE_CURROW: UInt = 0u

public val SQL_SCOPE_SESSION: UInt = 2u

public val SQL_SCOPE_TRANSACTION: UInt = 1u

public val SQL_SCROLLABLE: UInt = 1u

public val SQL_SCROLL_CONCURRENCY: UInt = 43u

public val SQL_SCROLL_DYNAMIC: Int = -2

public val SQL_SCROLL_FORWARD_ONLY: Int = 0

public val SQL_SCROLL_KEYSET_DRIVEN: Int = -1

public val SQL_SCROLL_OPTIONS: UInt = 44u

public val SQL_SCROLL_STATIC: Int = -3

public val SQL_SC_FIPS127_2_TRANSITIONAL: Int = 2

public val SQL_SC_NON_UNIQUE: UInt = 0u

public val SQL_SC_SQL92_ENTRY: Int = 1

public val SQL_SC_SQL92_FULL: Int = 8

public val SQL_SC_SQL92_INTERMEDIATE: Int = 4

public val SQL_SC_TRY_UNIQUE: UInt = 1u

public val SQL_SC_UNIQUE: UInt = 2u

public val SQL_SDF_CURRENT_DATE: Int = 1

public val SQL_SDF_CURRENT_TIME: Int = 2

public val SQL_SDF_CURRENT_TIMESTAMP: Int = 4

public val SQL_SEARCHABLE: UInt = 3u

public val SQL_SEARCH_PATTERN_ESCAPE: UInt = 14u

public val SQL_SECOND: UInt = 6u

public val SQL_SENSITIVE: UInt = 2u

public val SQL_SERVER_NAME: UInt = 13u

public val SQL_SETPARAM_VALUE_MAX: Int = -1

public val SQL_SETPOS_MAX_LOCK_VALUE: UInt = 2u

public val SQL_SETPOS_MAX_OPTION_VALUE: UInt = 4u

public val SQL_SET_DEFAULT: UInt = 4u

public val SQL_SET_NULL: UInt = 2u

public val SQL_SFKD_CASCADE: Int = 1

public val SQL_SFKD_NO_ACTION: Int = 2

public val SQL_SFKD_SET_DEFAULT: Int = 4

public val SQL_SFKD_SET_NULL: Int = 8

public val SQL_SFKU_CASCADE: Int = 1

public val SQL_SFKU_NO_ACTION: Int = 2

public val SQL_SFKU_SET_DEFAULT: Int = 4

public val SQL_SFKU_SET_NULL: Int = 8

public val SQL_SG_DELETE_TABLE: Int = 32

public val SQL_SG_INSERT_COLUMN: Int = 128

public val SQL_SG_INSERT_TABLE: Int = 64

public val SQL_SG_REFERENCES_COLUMN: Int = 512

public val SQL_SG_REFERENCES_TABLE: Int = 256

public val SQL_SG_SELECT_TABLE: Int = 1024

public val SQL_SG_UPDATE_COLUMN: Int = 4096

public val SQL_SG_UPDATE_TABLE: Int = 2048

public val SQL_SG_USAGE_ON_CHARACTER_SET: Int = 2

public val SQL_SG_USAGE_ON_COLLATION: Int = 4

public val SQL_SG_USAGE_ON_DOMAIN: Int = 1

public val SQL_SG_USAGE_ON_TRANSLATION: Int = 8

public val SQL_SG_WITH_GRANT_OPTION: Int = 16

public val SQL_SIGNED_OFFSET: Int = -20

public val SQL_SIMULATE_CURSOR: UInt = 10u

public val SQL_SMALLINT: UInt = 5u

public val SQL_SNVF_BIT_LENGTH: Int = 1

public val SQL_SNVF_CHARACTER_LENGTH: Int = 4

public val SQL_SNVF_CHAR_LENGTH: Int = 2

public val SQL_SNVF_EXTRACT: Int = 8

public val SQL_SNVF_OCTET_LENGTH: Int = 16

public val SQL_SNVF_POSITION: Int = 32

public val SQL_SOPT_SS_BASE: UInt = 1225u

public val SQL_SOPT_SS_CURRENT_COMMAND: UInt = 1226u

public val SQL_SOPT_SS_CURSOR_OPTIONS: UInt = 1230u

public val SQL_SOPT_SS_DEFER_PREPARE: UInt = 1232u

public val SQL_SOPT_SS_HIDDEN_COLUMNS: UInt = 1227u

public val SQL_SOPT_SS_MAX_USED: UInt = 1232u

public val SQL_SOPT_SS_NOBROWSETABLE: UInt = 1228u

public val SQL_SOPT_SS_NOCOUNT_STATUS: UInt = 1231u

public val SQL_SOPT_SS_REGIONALIZE: UInt = 1229u

public val SQL_SOPT_SS_TEXTPTR_LOGGING: UInt = 1225u

public val SQL_SO_DYNAMIC: Int = 4

public val SQL_SO_FORWARD_ONLY: Int = 1

public val SQL_SO_KEYSET_DRIVEN: Int = 2

public val SQL_SO_MIXED: Int = 8

public val SQL_SO_STATIC: Int = 16

public val SQL_SPECIAL_CHARACTERS: UInt = 94u

public val SQL_SPEC_MAJOR: UInt = 3u

public val SQL_SPEC_MINOR: UInt = 80u

public val SQL_SPEC_STRING: PCSTR = s("03.80")

public val SQL_SP_BETWEEN: Int = 2048

public val SQL_SP_COMPARISON: Int = 4096

public val SQL_SP_EXISTS: Int = 1

public val SQL_SP_IN: Int = 1024

public val SQL_SP_ISNOTNULL: Int = 2

public val SQL_SP_ISNULL: Int = 4

public val SQL_SP_LIKE: Int = 512

public val SQL_SP_MATCH_FULL: Int = 8

public val SQL_SP_MATCH_PARTIAL: Int = 16

public val SQL_SP_MATCH_UNIQUE_FULL: Int = 32

public val SQL_SP_MATCH_UNIQUE_PARTIAL: Int = 64

public val SQL_SP_OVERLAPS: Int = 128

public val SQL_SP_QUANTIFIED_COMPARISON: Int = 8192

public val SQL_SP_UNIQUE: Int = 256

public val SQL_SQL92_DATETIME_FUNCTIONS: UInt = 155u

public val SQL_SQL92_FOREIGN_KEY_DELETE_RULE: UInt = 156u

public val SQL_SQL92_FOREIGN_KEY_UPDATE_RULE: UInt = 157u

public val SQL_SQL92_GRANT: UInt = 158u

public val SQL_SQL92_NUMERIC_VALUE_FUNCTIONS: UInt = 159u

public val SQL_SQL92_PREDICATES: UInt = 160u

public val SQL_SQL92_RELATIONAL_JOIN_OPERATORS: UInt = 161u

public val SQL_SQL92_REVOKE: UInt = 162u

public val SQL_SQL92_ROW_VALUE_CONSTRUCTOR: UInt = 163u

public val SQL_SQL92_STRING_FUNCTIONS: UInt = 164u

public val SQL_SQL92_VALUE_EXPRESSIONS: UInt = 165u

public val SQL_SQLSTATE_SIZE: UInt = 5u

public val SQL_SQLSTATE_SIZEW: UInt = 10u

public val SQL_SQL_CONFORMANCE: UInt = 118u

public val SQL_SQ_COMPARISON: Int = 1

public val SQL_SQ_CORRELATED_SUBQUERIES: Int = 16

public val SQL_SQ_EXISTS: Int = 2

public val SQL_SQ_IN: Int = 4

public val SQL_SQ_QUANTIFIED: Int = 8

public val SQL_SRJO_CORRESPONDING_CLAUSE: Int = 1

public val SQL_SRJO_CROSS_JOIN: Int = 2

public val SQL_SRJO_EXCEPT_JOIN: Int = 4

public val SQL_SRJO_FULL_OUTER_JOIN: Int = 8

public val SQL_SRJO_INNER_JOIN: Int = 16

public val SQL_SRJO_INTERSECT_JOIN: Int = 32

public val SQL_SRJO_LEFT_OUTER_JOIN: Int = 64

public val SQL_SRJO_NATURAL_JOIN: Int = 128

public val SQL_SRJO_RIGHT_OUTER_JOIN: Int = 256

public val SQL_SRJO_UNION_JOIN: Int = 512

public val SQL_SRVC_DEFAULT: Int = 4

public val SQL_SRVC_NULL: Int = 2

public val SQL_SRVC_ROW_SUBQUERY: Int = 8

public val SQL_SRVC_VALUE_EXPRESSION: Int = 1

public val SQL_SR_CASCADE: Int = 32

public val SQL_SR_DELETE_TABLE: Int = 128

public val SQL_SR_GRANT_OPTION_FOR: Int = 16

public val SQL_SR_INSERT_COLUMN: Int = 512

public val SQL_SR_INSERT_TABLE: Int = 256

public val SQL_SR_REFERENCES_COLUMN: Int = 2048

public val SQL_SR_REFERENCES_TABLE: Int = 1024

public val SQL_SR_RESTRICT: Int = 64

public val SQL_SR_SELECT_TABLE: Int = 4096

public val SQL_SR_UPDATE_COLUMN: Int = 16384

public val SQL_SR_UPDATE_TABLE: Int = 8192

public val SQL_SR_USAGE_ON_CHARACTER_SET: Int = 2

public val SQL_SR_USAGE_ON_COLLATION: Int = 4

public val SQL_SR_USAGE_ON_DOMAIN: Int = 1

public val SQL_SR_USAGE_ON_TRANSLATION: Int = 8

public val SQL_SSF_CONVERT: Int = 1

public val SQL_SSF_LOWER: Int = 2

public val SQL_SSF_SUBSTRING: Int = 8

public val SQL_SSF_TRANSLATE: Int = 16

public val SQL_SSF_TRIM_BOTH: Int = 32

public val SQL_SSF_TRIM_LEADING: Int = 64

public val SQL_SSF_TRIM_TRAILING: Int = 128

public val SQL_SSF_UPPER: Int = 4

public val SQL_SS_ADDITIONS: Int = 1

public val SQL_SS_DELETIONS: Int = 2

public val SQL_SS_DL_DEFAULT: PCWSTR = w("STATS.LOG")

public val SQL_SS_QI_DEFAULT: UInt = 30000u

public val SQL_SS_QL_DEFAULT: PCWSTR = w("QUERY.LOG")

public val SQL_SS_UPDATES: Int = 4

public val SQL_SS_VARIANT: Int = -150

public val SQL_STANDARD_CLI_CONFORMANCE: UInt = 166u

public val SQL_STATIC_CURSOR_ATTRIBUTES1: UInt = 167u

public val SQL_STATIC_CURSOR_ATTRIBUTES2: UInt = 168u

public val SQL_STATIC_SENSITIVITY: UInt = 83u

public val SQL_STILL_EXECUTING: UInt = 2u

public val SQL_STMT_OPT_MAX: UInt = 14u

public val SQL_STMT_OPT_MIN: UInt = 0u

public val SQL_STRING_FUNCTIONS: UInt = 50u

public val SQL_SUBQUERIES: UInt = 95u

public val SQL_SUCCESS: UInt = 0u

public val SQL_SUCCESS_WITH_INFO: UInt = 1u

public val SQL_SU_DML_STATEMENTS: Int = 1

public val SQL_SU_INDEX_DEFINITION: Int = 8

public val SQL_SU_PRIVILEGE_DEFINITION: Int = 16

public val SQL_SU_PROCEDURE_INVOCATION: Int = 2

public val SQL_SU_TABLE_DEFINITION: Int = 4

public val SQL_SVE_CASE: Int = 1

public val SQL_SVE_CAST: Int = 2

public val SQL_SVE_COALESCE: Int = 4

public val SQL_SVE_NULLIF: Int = 8

public val SQL_SYSTEM_FUNCTIONS: UInt = 51u

public val SQL_TABLE_STAT: UInt = 0u

public val SQL_TABLE_TERM: UInt = 45u

public val SQL_TC_ALL: UInt = 2u

public val SQL_TC_DDL_COMMIT: UInt = 3u

public val SQL_TC_DDL_IGNORE: UInt = 4u

public val SQL_TC_DML: UInt = 1u

public val SQL_TC_NONE: UInt = 0u

public val SQL_TEXTPTR_LOGGING: UInt = 1225u

public val SQL_TIME: UInt = 10u

public val SQL_TIMEDATE_ADD_INTERVALS: UInt = 109u

public val SQL_TIMEDATE_DIFF_INTERVALS: UInt = 110u

public val SQL_TIMEDATE_FUNCTIONS: UInt = 52u

public val SQL_TIMESTAMP: UInt = 11u

public val SQL_TIMESTAMP_LEN: UInt = 19u

public val SQL_TIME_LEN: UInt = 8u

public val SQL_TINYINT: Int = -6

public val SQL_TL_DEFAULT: Int = 1

public val SQL_TL_OFF: Int = 0

public val SQL_TL_ON: Int = 1

public val SQL_TRANSACTION_CAPABLE: UInt = 46u

public val SQL_TRANSACTION_ISOLATION_OPTION: UInt = 72u

public val SQL_TRANSACTION_READ_COMMITTED: Int = 2

public val SQL_TRANSACTION_READ_UNCOMMITTED: Int = 1

public val SQL_TRANSACTION_REPEATABLE_READ: Int = 4

public val SQL_TRANSACTION_SERIALIZABLE: Int = 8

public val SQL_TRANSLATE_DLL: UInt = 106u

public val SQL_TRANSLATE_OPTION: UInt = 107u

public val SQL_TRUE: UInt = 1u

public val SQL_TXN_CAPABLE: UInt = 46u

public val SQL_TXN_ISOLATION: UInt = 108u

public val SQL_TXN_ISOLATION_OPTION: UInt = 72u

public val SQL_TXN_READ_COMMITTED: Int = 2

public val SQL_TXN_READ_UNCOMMITTED: Int = 1

public val SQL_TXN_REPEATABLE_READ: Int = 4

public val SQL_TXN_SERIALIZABLE: Int = 8

public val SQL_TXN_VERSIONING: Int = 16

public val SQL_TYPE_DATE: UInt = 91u

public val SQL_TYPE_DRIVER_END: Int = -97

public val SQL_TYPE_DRIVER_START: Int = -80

public val SQL_TYPE_MAX: UInt = 12u

public val SQL_TYPE_MIN: Int = -7

public val SQL_TYPE_NULL: UInt = 0u

public val SQL_TYPE_TIME: UInt = 92u

public val SQL_TYPE_TIMESTAMP: UInt = 93u

public val SQL_UB_DEFAULT: UInt = 0u

public val SQL_UB_FIXED: UInt = 1u

public val SQL_UB_OFF: UInt = 0u

public val SQL_UB_ON: UInt = 1u

public val SQL_UB_VARIABLE: UInt = 2u

public val SQL_UNBIND: UInt = 2u

public val SQL_UNICODE: Int = -95

public val SQL_UNICODE_CHAR: Int = -95

public val SQL_UNICODE_LONGVARCHAR: Int = -97

public val SQL_UNICODE_VARCHAR: Int = -96

public val SQL_UNION: UInt = 96u

public val SQL_UNION_STATEMENT: UInt = 96u

public val SQL_UNKNOWN_TYPE: UInt = 0u

public val SQL_UNNAMED: UInt = 1u

public val SQL_UNSEARCHABLE: UInt = 0u

public val SQL_UNSIGNED_OFFSET: Int = -22

public val SQL_UNSPECIFIED: UInt = 0u

public val SQL_UPDATE: UInt = 2u

public val SQL_UPDATE_BY_BOOKMARK: UInt = 5u

public val SQL_UP_DEFAULT: Int = 1

public val SQL_UP_OFF: Int = 0

public val SQL_UP_ON: Int = 1

public val SQL_UP_ON_DROP: Int = 2

public val SQL_USER_NAME: UInt = 47u

public val SQL_USE_BOOKMARKS: UInt = 12u

public val SQL_USE_PROCEDURE_FOR_PREPARE: UInt = 1202u

public val SQL_US_UNION: Int = 1

public val SQL_US_UNION_ALL: Int = 2

public val SQL_U_UNION: Int = 1

public val SQL_U_UNION_ALL: Int = 2

public val SQL_VARBINARY: Int = -3

public val SQL_VARCHAR: UInt = 12u

public val SQL_VARLEN_DATA: Int = -10

public val SQL_WARN_NO: Int = 0

public val SQL_WARN_YES: Int = 1

public val SQL_WCHAR: Int = -8

public val SQL_WLONGVARCHAR: Int = -10

public val SQL_WVARCHAR: Int = -9

public val SQL_XL_DEFAULT: Int = 1

public val SQL_XL_OFF: Int = 0

public val SQL_XL_ON: Int = 1

public val SQL_XOPEN_CLI_YEAR: UInt = 10000u

public val SQL_YEAR: UInt = 1u

public val SQL_YEAR_TO_MONTH: UInt = 7u

public val SQLudtBINARY: UInt = 3u

public val SQLudtBIT: UInt = 16u

public val SQLudtBITN: UInt = 0u

public val SQLudtCHAR: UInt = 1u

public val SQLudtDATETIM4: UInt = 22u

public val SQLudtDATETIME: UInt = 12u

public val SQLudtDATETIMN: UInt = 15u

public val SQLudtDECML: UInt = 24u

public val SQLudtDECMLN: UInt = 26u

public val SQLudtFLT4: UInt = 23u

public val SQLudtFLT8: UInt = 8u

public val SQLudtFLTN: UInt = 14u

public val SQLudtIMAGE: UInt = 20u

public val SQLudtINT1: UInt = 5u

public val SQLudtINT2: UInt = 6u

public val SQLudtINT4: UInt = 7u

public val SQLudtINTN: UInt = 13u

public val SQLudtMONEY: UInt = 11u

public val SQLudtMONEY4: UInt = 21u

public val SQLudtMONEYN: UInt = 17u

public val SQLudtNUM: UInt = 10u

public val SQLudtNUMN: UInt = 25u

public val SQLudtSYSNAME: UInt = 18u

public val SQLudtTEXT: UInt = 19u

public val SQLudtTIMESTAMP: UInt = 80u

public val SQLudtUNIQUEIDENTIFIER: UInt = 0u

public val SQLudtVARBINARY: UInt = 4u

public val SQLudtVARCHAR: UInt = 2u

public val SQMO_DEFAULT_PROPERTY: STRUCTURED_QUERY_MULTIOPTION = 1

public val SQMO_GENERATOR_FOR_TYPE: STRUCTURED_QUERY_MULTIOPTION = 2

public val SQMO_MAP_PROPERTY: STRUCTURED_QUERY_MULTIOPTION = 3

public val SQMO_VIRTUAL_PROPERTY: STRUCTURED_QUERY_MULTIOPTION = 0

public val SQPE_EXTRA_CLOSING_PARENTHESIS: STRUCTURED_QUERY_PARSE_ERROR = 2

public val SQPE_EXTRA_OPENING_PARENTHESIS: STRUCTURED_QUERY_PARSE_ERROR = 1

public val SQPE_IGNORED_CONNECTOR: STRUCTURED_QUERY_PARSE_ERROR = 4

public val SQPE_IGNORED_KEYWORD: STRUCTURED_QUERY_PARSE_ERROR = 5

public val SQPE_IGNORED_MODIFIER: STRUCTURED_QUERY_PARSE_ERROR = 3

public val SQPE_NONE: STRUCTURED_QUERY_PARSE_ERROR = 0

public val SQPE_UNHANDLED: STRUCTURED_QUERY_PARSE_ERROR = 6

public val SQRO_ADD_ROBUST_ITEM_NAME: STRUCTURED_QUERY_RESOLVE_OPTION = 512

public val SQRO_ADD_VALUE_TYPE_FOR_PLAIN_VALUES: STRUCTURED_QUERY_RESOLVE_OPTION = 256

public val SQRO_ALWAYS_ONE_INTERVAL: STRUCTURED_QUERY_RESOLVE_OPTION = 2

public val SQRO_DEFAULT: STRUCTURED_QUERY_RESOLVE_OPTION = 0

public val SQRO_DONT_MAP_RELATIONS: STRUCTURED_QUERY_RESOLVE_OPTION = 8

public val SQRO_DONT_REMOVE_UNRESTRICTED_KEYWORDS: STRUCTURED_QUERY_RESOLVE_OPTION = 32

public val SQRO_DONT_RESOLVE_DATETIME: STRUCTURED_QUERY_RESOLVE_OPTION = 1

public val SQRO_DONT_RESOLVE_RANGES: STRUCTURED_QUERY_RESOLVE_OPTION = 16

public val SQRO_DONT_SIMPLIFY_CONDITION_TREES: STRUCTURED_QUERY_RESOLVE_OPTION = 4

public val SQRO_DONT_SPLIT_WORDS: STRUCTURED_QUERY_RESOLVE_OPTION = 64

public val SQRO_IGNORE_PHRASE_ORDER: STRUCTURED_QUERY_RESOLVE_OPTION = 128

public val SQSO_AUTOMATIC_WILDCARD: STRUCTURED_QUERY_SINGLE_OPTION = 4

public val SQSO_CONNECTOR_CASE: STRUCTURED_QUERY_SINGLE_OPTION = 10

public val SQSO_IMPLICIT_CONNECTOR: STRUCTURED_QUERY_SINGLE_OPTION = 9

public val SQSO_LANGUAGE_KEYWORDS: STRUCTURED_QUERY_SINGLE_OPTION = 6

public val SQSO_LOCALE_WORD_BREAKING: STRUCTURED_QUERY_SINGLE_OPTION = 1

public val SQSO_NATURAL_SYNTAX: STRUCTURED_QUERY_SINGLE_OPTION = 3

public val SQSO_SCHEMA: STRUCTURED_QUERY_SINGLE_OPTION = 0

public val SQSO_SYNTAX: STRUCTURED_QUERY_SINGLE_OPTION = 7

public val SQSO_TIME_ZONE: STRUCTURED_QUERY_SINGLE_OPTION = 8

public val SQSO_TRACE_LEVEL: STRUCTURED_QUERY_SINGLE_OPTION = 5

public val SQSO_WORD_BREAKER: STRUCTURED_QUERY_SINGLE_OPTION = 2

public val SQS_ADVANCED_QUERY_SYNTAX: STRUCTURED_QUERY_SYNTAX = 1

public val SQS_NATURAL_QUERY_SYNTAX: STRUCTURED_QUERY_SYNTAX = 2

public val SQS_NO_SYNTAX: STRUCTURED_QUERY_SYNTAX = 0

public val SRCH_SCHEMA_CACHE_E_UNEXPECTED: Int = -2147208447

public val SSPROPVAL_COMMANDTYPE_BULKLOAD: UInt = 22u

public val SSPROPVAL_COMMANDTYPE_REGULAR: UInt = 21u

public val SSPROPVAL_USEPROCFORPREP_OFF: UInt = 0u

public val SSPROPVAL_USEPROCFORPREP_ON: UInt = 1u

public val SSPROPVAL_USEPROCFORPREP_ON_DROP: UInt = 2u

public val SSPROP_ALLOWNATIVEVARIANT: UInt = 3u

public val SSPROP_AUTH_REPL_SERVER_NAME: UInt = 14u

public val SSPROP_CHARACTERSET: UInt = 5u

public val SSPROP_COLUMNLEVELCOLLATION: UInt = 4u

public val SSPROP_COL_COLLATIONNAME: UInt = 14u

public val SSPROP_CURRENTCOLLATION: UInt = 7u

public val SSPROP_CURSORAUTOFETCH: UInt = 12u

public val SSPROP_DEFERPREPARE: UInt = 13u

public val SSPROP_ENABLEFASTLOAD: UInt = 2u

public val SSPROP_FASTLOADKEEPIDENTITY: UInt = 11u

public val SSPROP_FASTLOADKEEPNULLS: UInt = 10u

public val SSPROP_FASTLOADOPTIONS: UInt = 9u

public val SSPROP_INIT_APPNAME: UInt = 10u

public val SSPROP_INIT_AUTOTRANSLATE: UInt = 8u

public val SSPROP_INIT_CURRENTLANGUAGE: UInt = 4u

public val SSPROP_INIT_ENCRYPT: UInt = 13u

public val SSPROP_INIT_FILENAME: UInt = 12u

public val SSPROP_INIT_NETWORKADDRESS: UInt = 5u

public val SSPROP_INIT_NETWORKLIBRARY: UInt = 6u

public val SSPROP_INIT_PACKETSIZE: UInt = 9u

public val SSPROP_INIT_TAGCOLUMNCOLLATION: UInt = 15u

public val SSPROP_INIT_USEPROCFORPREP: UInt = 7u

public val SSPROP_INIT_WSID: UInt = 11u

public val SSPROP_IRowsetFastLoad: UInt = 14u

public val SSPROP_MAXBLOBLENGTH: UInt = 8u

public val SSPROP_QUOTEDCATALOGNAMES: UInt = 2u

public val SSPROP_SORTORDER: UInt = 6u

public val SSPROP_SQLXMLXPROGID: UInt = 4u

public val SSPROP_STREAM_BASEPATH: UInt = 17u

public val SSPROP_STREAM_COMMANDTYPE: UInt = 18u

public val SSPROP_STREAM_CONTENTTYPE: UInt = 23u

public val SSPROP_STREAM_FLAGS: UInt = 20u

public val SSPROP_STREAM_MAPPINGSCHEMA: UInt = 15u

public val SSPROP_STREAM_XMLROOT: UInt = 19u

public val SSPROP_STREAM_XSL: UInt = 16u

public val SSPROP_UNICODECOMPARISONSTYLE: UInt = 3u

public val SSPROP_UNICODELCID: UInt = 2u

public val STD_BOOKMARKLENGTH: UInt = 1u

public val STGM_COLLECTION: Int = 8192

public val STGM_OPEN: Int = -2147483648

public val STGM_OUTPUT: Int = 32768

public val STGM_RECURSIVE: Int = 16777216

public val STGM_STRICTOPEN: Int = 1073741824

public val STREAM_FLAGS_DISALLOW_ABSOLUTE_PATH: UInt = 2u

public val STREAM_FLAGS_DISALLOW_QUERY: UInt = 4u

public val STREAM_FLAGS_DISALLOW_UPDATEGRAMS: UInt = 64u

public val STREAM_FLAGS_DISALLOW_URL: UInt = 1u

public val STREAM_FLAGS_DONTCACHEMAPPINGSCHEMA: UInt = 8u

public val STREAM_FLAGS_DONTCACHETEMPLATE: UInt = 16u

public val STREAM_FLAGS_DONTCACHEXSL: UInt = 32u

public val STREAM_FLAGS_RESERVED: UInt = 4294901760u

public val STS_ABORTXMLPARSE: Int = -2147211756

public val STS_WS_ERROR: Int = -2147211754

public val SUBSINFO_ALLFLAGS: UInt = 61311u

public val SUBSINFO_CHANGESONLY: SUBSCRIPTIONINFOFLAGS = 1024

public val SUBSINFO_CHANNELFLAGS: SUBSCRIPTIONINFOFLAGS = 2048

public val SUBSINFO_FRIENDLYNAME: SUBSCRIPTIONINFOFLAGS = 8192

public val SUBSINFO_GLEAM: SUBSCRIPTIONINFOFLAGS = 512

public val SUBSINFO_MAILNOT: SUBSCRIPTIONINFOFLAGS = 8

public val SUBSINFO_MAXSIZEKB: SUBSCRIPTIONINFOFLAGS = 16

public val SUBSINFO_NEEDPASSWORD: SUBSCRIPTIONINFOFLAGS = 16384

public val SUBSINFO_PASSWORD: SUBSCRIPTIONINFOFLAGS = 64

public val SUBSINFO_RECURSE: SUBSCRIPTIONINFOFLAGS = 2

public val SUBSINFO_SCHEDULE: SUBSCRIPTIONINFOFLAGS = 1

public val SUBSINFO_TASKFLAGS: SUBSCRIPTIONINFOFLAGS = 256

public val SUBSINFO_TYPE: SUBSCRIPTIONINFOFLAGS = 32768

public val SUBSINFO_USER: SUBSCRIPTIONINFOFLAGS = 32

public val SUBSINFO_WEBCRAWL: SUBSCRIPTIONINFOFLAGS = 4

public val SUBSMGRENUM_MASK: UInt = 1u

public val SUBSMGRENUM_TEMP: UInt = 1u

public val SUBSMGRUPDATE_MASK: UInt = 1u

public val SUBSMGRUPDATE_MINIMIZE: UInt = 1u

public val SUBSSCHED_AUTO: SUBSCRIPTIONSCHEDULE = 0

public val SUBSSCHED_CUSTOM: SUBSCRIPTIONSCHEDULE = 3

public val SUBSSCHED_DAILY: SUBSCRIPTIONSCHEDULE = 1

public val SUBSSCHED_MANUAL: SUBSCRIPTIONSCHEDULE = 4

public val SUBSSCHED_WEEKLY: SUBSCRIPTIONSCHEDULE = 2

public val SUBSTYPE_CHANNEL: SUBSCRIPTIONTYPE = 1

public val SUBSTYPE_DESKTOPCHANNEL: SUBSCRIPTIONTYPE = 4

public val SUBSTYPE_DESKTOPURL: SUBSCRIPTIONTYPE = 2

public val SUBSTYPE_EXTERNAL: SUBSCRIPTIONTYPE = 3

public val SUBSTYPE_URL: SUBSCRIPTIONTYPE = 0

public val SUCCEED: UInt = 1u

public val SUCCEED_ABORT: UInt = 2u

public val SUCCEED_ASYNC: UInt = 3u

public val SubscriptionMgr: GUID = GUID.from_u128(0xabbe31d06dae11d0uL, 0xbeca00c04fd940beuL)

public val TRACE_ON: Int = 1

public val TRACE_VERSION: UInt = 1000u

public val TRACE_VS_EVENT_ON: Int = 2

public val VT_SS_BINARY: SQLVARENUM = 207

public val VT_SS_BIT: SQLVARENUM = 11

public val VT_SS_DATETIME: SQLVARENUM = 135

public val VT_SS_DECIMAL: SQLVARENUM = 205

public val VT_SS_EMPTY: SQLVARENUM = 0

public val VT_SS_GUID: SQLVARENUM = 72

public val VT_SS_I2: SQLVARENUM = 2

public val VT_SS_I4: SQLVARENUM = 3

public val VT_SS_I8: SQLVARENUM = 20

public val VT_SS_MONEY: SQLVARENUM = 6

public val VT_SS_NULL: SQLVARENUM = 1

public val VT_SS_NUMERIC: SQLVARENUM = 131

public val VT_SS_R4: SQLVARENUM = 4

public val VT_SS_R8: SQLVARENUM = 5

public val VT_SS_SMALLDATETIME: SQLVARENUM = 206

public val VT_SS_SMALLMONEY: SQLVARENUM = 200

public val VT_SS_STRING: SQLVARENUM = 203

public val VT_SS_UI1: SQLVARENUM = 17

public val VT_SS_UNKNOWN: SQLVARENUM = 209

public val VT_SS_VARBINARY: SQLVARENUM = 208

public val VT_SS_VARSTRING: SQLVARENUM = 204

public val VT_SS_WSTRING: SQLVARENUM = 201

public val VT_SS_WVARSTRING: SQLVARENUM = 202

public val WEBCRAWL_DONT_MAKE_STICKY: WEBCRAWL_RECURSEFLAGS = 1

public val WEBCRAWL_GET_BGSOUNDS: WEBCRAWL_RECURSEFLAGS = 8

public val WEBCRAWL_GET_CONTROLS: WEBCRAWL_RECURSEFLAGS = 16

public val WEBCRAWL_GET_IMAGES: WEBCRAWL_RECURSEFLAGS = 2

public val WEBCRAWL_GET_VIDEOS: WEBCRAWL_RECURSEFLAGS = 4

public val WEBCRAWL_IGNORE_ROBOTSTXT: WEBCRAWL_RECURSEFLAGS = 128

public val WEBCRAWL_LINKS_ELSEWHERE: WEBCRAWL_RECURSEFLAGS = 32

public val WEBCRAWL_ONLY_LINKS_TO_HTML: WEBCRAWL_RECURSEFLAGS = 256

public val XML_E_BADSXQL: Int = -2147212799

public val XML_E_NODEFAULTNS: Int = -2147212800

public val _MAPI_E_ACCOUNT_DISABLED: Int = -2147221212

public val _MAPI_E_BAD_CHARWIDTH: Int = -2147221245

public val _MAPI_E_BAD_COLUMN: Int = -2147221224

public val _MAPI_E_BUSY: Int = -2147221237

public val _MAPI_E_COMPUTED: Int = -2147221222

public val _MAPI_E_CORRUPT_DATA: Int = -2147221221

public val _MAPI_E_DISK_ERROR: Int = -2147221226

public val _MAPI_E_END_OF_SESSION: Int = -2147220992

public val _MAPI_E_EXTENDED_ERROR: Int = -2147221223

public val _MAPI_E_FAILONEPROVIDER: Int = -2147221219

public val _MAPI_E_INVALID_ACCESS_TIME: Int = -2147221213

public val _MAPI_E_INVALID_ENTRYID: Int = -2147221241

public val _MAPI_E_INVALID_OBJECT: Int = -2147221240

public val _MAPI_E_INVALID_WORKSTATION_ACCOUNT: Int = -2147221214

public val _MAPI_E_LOGON_FAILED: Int = -2147221231

public val _MAPI_E_MISSING_REQUIRED_COLUMN: Int = -2147220990

public val _MAPI_E_NETWORK_ERROR: Int = -2147221227

public val _MAPI_E_NOT_ENOUGH_DISK: Int = -2147221235

public val _MAPI_E_NOT_ENOUGH_RESOURCES: Int = -2147221234

public val _MAPI_E_NOT_FOUND: Int = -2147221233

public val _MAPI_E_NO_SUPPORT: Int = -2147221246

public val _MAPI_E_OBJECT_CHANGED: Int = -2147221239

public val _MAPI_E_OBJECT_DELETED: Int = -2147221238

public val _MAPI_E_PASSWORD_CHANGE_REQUIRED: Int = -2147221216

public val _MAPI_E_PASSWORD_EXPIRED: Int = -2147221215

public val _MAPI_E_SESSION_LIMIT: Int = -2147221230

public val _MAPI_E_STRING_TOO_LONG: Int = -2147221243

public val _MAPI_E_TOO_COMPLEX: Int = -2147221225

public val _MAPI_E_UNABLE_TO_ABORT: Int = -2147221228

public val _MAPI_E_UNCONFIGURED: Int = -2147221220

public val _MAPI_E_UNKNOWN_CPID: Int = -2147221218

public val _MAPI_E_UNKNOWN_ENTRYID: Int = -2147220991

public val _MAPI_E_UNKNOWN_FLAGS: Int = -2147221242

public val _MAPI_E_UNKNOWN_LCID: Int = -2147221217

public val _MAPI_E_USER_CANCEL: Int = -2147221229

public val _MAPI_E_VERSION: Int = -2147221232

public val _MAPI_W_NO_SERVICE: Int = 262659

public val eAUTH_TYPE_ANONYMOUS: AUTH_TYPE = 0

public val eAUTH_TYPE_BASIC: AUTH_TYPE = 2

public val eAUTH_TYPE_NTLM: AUTH_TYPE = 1
