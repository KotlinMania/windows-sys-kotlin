package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult

public val BCP6X_FILEFMT: UInt = 9u

public val BCPABORT: UInt = 6u

public val BCPBATCH: UInt = 4u

public val BCPFILECP: UInt = 12u

public val BCPFILECP_ACP: UInt = 0u

public val BCPFILECP_OEMCP: UInt = 1u

public val BCPFILECP_RAW: Int = -1

public val BCPFILEFMT: UInt = 15u

public val BCPFIRST: UInt = 2u

public val BCPHINTS: UInt = 11u

public val BCPHINTSA: UInt = 10u

public val BCPHINTSW: UInt = 11u

public val BCPKEEPIDENTITY: UInt = 8u

public val BCPKEEPNULLS: UInt = 5u

public val BCPLAST: UInt = 3u

public val BCPMAXERRS: UInt = 1u

public val BCPODBC: UInt = 7u

public val BCPTEXTFILE: UInt = 14u

public val BCPUNICODEFILE: UInt = 13u

public val BCP_FMT_COLLATION: UInt = 6u

public val BCP_FMT_COLLATION_ID: UInt = 7u

public val BCP_FMT_DATA_LEN: UInt = 3u

public val BCP_FMT_INDICATOR_LEN: UInt = 2u

public val BCP_FMT_SERVER_COL: UInt = 5u

public val BCP_FMT_TERMINATOR: UInt = 4u

public val BCP_FMT_TYPE: UInt = 1u

public val BIO_BINDER: EBindInfoOptions = 1

public val BMK_DURABILITY_INTRANSACTION: Int = 1

public val BMK_DURABILITY_REORGANIZATION: Int = 3

public val BMK_DURABILITY_ROWSET: Int = 0

public val BMK_DURABILITY_XTRANSACTION: Int = 2

public val BUCKET_EXPONENTIAL: UInt = 1u

public val BUCKET_LINEAR: UInt = 0u

public val CASE_REQUIREMENT_ANY: CaseRequirement = 0

public val CASE_REQUIREMENT_UPPER_IF_AQS: CaseRequirement = 1

public val CATALOG_PAUSED_REASON_DELAYED_RECOVERY: CatalogPausedReason = 7

public val CATALOG_PAUSED_REASON_EXTERNAL: CatalogPausedReason = 9

public val CATALOG_PAUSED_REASON_HIGH_CPU: CatalogPausedReason = 2

public val CATALOG_PAUSED_REASON_HIGH_IO: CatalogPausedReason = 1

public val CATALOG_PAUSED_REASON_HIGH_NTF_RATE: CatalogPausedReason = 3

public val CATALOG_PAUSED_REASON_LOW_BATTERY: CatalogPausedReason = 4

public val CATALOG_PAUSED_REASON_LOW_DISK: CatalogPausedReason = 6

public val CATALOG_PAUSED_REASON_LOW_MEMORY: CatalogPausedReason = 5

public val CATALOG_PAUSED_REASON_NONE: CatalogPausedReason = 0

public val CATALOG_PAUSED_REASON_UPGRADING: CatalogPausedReason = 10

public val CATALOG_PAUSED_REASON_USER_ACTIVE: CatalogPausedReason = 8

public val CATALOG_STATUS_FULL_CRAWL: CatalogStatus = 3

public val CATALOG_STATUS_IDLE: CatalogStatus = 0

public val CATALOG_STATUS_INCREMENTAL_CRAWL: CatalogStatus = 4

public val CATALOG_STATUS_PAUSED: CatalogStatus = 1

public val CATALOG_STATUS_PROCESSING_NOTIFICATIONS: CatalogStatus = 5

public val CATALOG_STATUS_RECOVERING: CatalogStatus = 2

public val CATALOG_STATUS_SHUTTING_DOWN: CatalogStatus = 6

public val CATEGORIZE_BUCKETS: UInt = 2u

public val CATEGORIZE_CLUSTER: UInt = 1u

public val CATEGORIZE_RANGE: UInt = 3u

public val CATEGORIZE_UNIQUE: UInt = 0u

public val CATEGORY_COLLATOR: Int = 2

public val CATEGORY_GATHERER: Int = 3

public val CATEGORY_INDEXER: Int = 4

public val CATEGORY_SEARCH: Int = 1

public val CDBBMKDISPIDS: UInt = 8u

public val CDBCOLDISPIDS: UInt = 28u

public val CDBSELFDISPIDS: UInt = 8u

public val CERT_E_NOT_FOUND_OR_NO_PERMISSSION: Int = -2147211263

public val CHANNEL_AGENT_DYNAMIC_SCHEDULE: ChannelAgentFlags = 1

public val CHANNEL_AGENT_PRECACHE_ALL: ChannelAgentFlags = 4

public val CHANNEL_AGENT_PRECACHE_SCRNSAVER: ChannelAgentFlags = 8

public val CHANNEL_AGENT_PRECACHE_SOME: ChannelAgentFlags = 2

public val CI_E_CORRUPT_FWIDX: Hresult = 0xC004182Du.toInt()

public val CI_E_DIACRITIC_SETTINGS_DIFFER: Hresult = 0xC004182Eu.toInt()

public val CI_E_INCONSISTENT_TRANSACTION: Hresult = 0xC0041832u.toInt()

public val CI_E_INVALID_CATALOG_LIST_VERSION: Hresult = 0x8004182Fu.toInt()

public val CI_E_MULTIPLE_PROTECTED_USERS_UNSUPPORTED: Hresult = 0xC0041835u.toInt()

public val CI_E_NO_AUXMETADATA: Hresult = 0x8004182Au.toInt()

public val CI_E_NO_CATALOG_MANAGER: Hresult = 0xC0041831u.toInt()

public val CI_E_NO_PROTECTED_USER: Hresult = 0xC0041834u.toInt()

public val CI_E_PROTECTED_CATALOG_NON_INTERACTIVE_USER: Hresult = 0xC0041837u.toInt()

public val CI_E_PROTECTED_CATALOG_NOT_AVAILABLE: Hresult = 0xC0041833u.toInt()

public val CI_E_PROTECTED_CATALOG_SID_MISMATCH: Hresult = 0xC0041836u.toInt()

public val CI_S_CATALOG_RESET: Hresult = 0x41830u.toInt()

public val CI_S_CLIENT_REQUESTED_ABORT: Hresult = 0x4182Bu.toInt()

public val CI_S_NEW_AUXMETADATA: Hresult = 0x41829u.toInt()

public val CI_S_RETRY_DOCUMENT: Hresult = 0x4182Cu.toInt()

public val CLSID_CI_SIMPLE_COMMAND_CREATOR: Guid = Guid.fromU128(U128(0xc7b6c04acbb511d0uL, 0xbb4c00c04fc2f410uL))

public val CLSID_DATA_SHAPE_PROVIDER: Guid = Guid.fromU128(U128(0x3449a1c8c56c11d0uL, 0xad7200c04fc29863uL))

public val CLSID_MSDASQL: Guid = Guid.fromU128(U128(0xc8b522cb5cf311ceuL, 0xade500aa0044773duL))

public val CLSID_MSDASQL_ENUMERATOR: Guid = Guid.fromU128(U128(0xc8b522cd5cf311ceuL, 0xade500aa0044773duL))

public val CLSID_MS_PERSIST: Guid = Guid.fromU128(U128(0x7c07e0d0441811d2uL, 0x921200c04fbbbfb3uL))

public val CLSID_SQLOLEDB: Guid = Guid.fromU128(U128(0xc7ff16c38e311d0uL, 0x97ab00c04fc2ad98uL))

public val CLSID_SQLOLEDB_ENUMERATOR: Guid = Guid.fromU128(U128(0xdfa22b8ee68d11d0uL, 0x97e400c04fc2ad98uL))

public val CLSID_SQLOLEDB_ERROR: Guid = Guid.fromU128(U128(0xc0932c6238e511d0uL, 0x97ab00c04fc2ad98uL))

public val CLUSIONREASON_DEFAULT: ClusionReason = 1

public val CLUSIONREASON_GROUPPOLICY: ClusionReason = 3

public val CLUSIONREASON_UNKNOWNSCOPE: ClusionReason = 0

public val CLUSIONREASON_USER: ClusionReason = 2

public val CMDLINE_E_ALREADY_INIT: Int = -2147216123

public val CMDLINE_E_NOT_INIT: Int = -2147216124

public val CMDLINE_E_NUM_PARAMS: Int = -2147216122

public val CMDLINE_E_PARAM_SIZE: Int = -2147216125

public val CMDLINE_E_PAREN: Int = -2147216126

public val CMDLINE_E_UNEXPECTED: Int = -2147216127

public val CM_E_CONNECTIONTIMEOUT: Int = -2147219963

public val CM_E_DATASOURCENOTAVAILABLE: Int = -2147219964

public val CM_E_INSUFFICIENTBUFFER: Int = -2147219957

public val CM_E_INVALIDDATASOURCE: Int = -2147219959

public val CM_E_NOQUERYCONNECTIONS: Int = -2147219965

public val CM_E_REGISTRY: Int = -2147219960

public val CM_E_SERVERNOTFOUND: Int = -2147219962

public val CM_E_TIMEOUT: Int = -2147219958

public val CM_E_TOOMANYDATASERVERS: Int = -2147219967

public val CM_E_TOOMANYDATASOURCES: Int = -2147219966

public val CM_S_NODATASERVERS: Int = 263687

public val COLL_E_BADRESULT: Int = -2147220218

public val COLL_E_BADSEQUENCE: Int = -2147220223

public val COLL_E_BUFFERTOOSMALL: Int = -2147220220

public val COLL_E_DUPLICATEDBID: Int = -2147220216

public val COLL_E_INCOMPATIBLECOLUMNS: Int = -2147220221

public val COLL_E_MAXCONNEXCEEDED: Int = -2147220213

public val COLL_E_NODEFAULTCATALOG: Int = -2147220214

public val COLL_E_NOMOREDATA: Int = -2147220222

public val COLL_E_NOSORTCOLUMN: Int = -2147220217

public val COLL_E_TOOMANYMERGECOLUMNS: Int = -2147220215

public val CONDITION_CREATION_DEFAULT: ConditionCreationOptions = 0

public val CONDITION_CREATION_NONE: ConditionCreationOptions = 0

public val CONDITION_CREATION_SIMPLIFY: ConditionCreationOptions = 1

public val CONDITION_CREATION_USE_CONTENT_LOCALE: ConditionCreationOptions = 16

public val CONDITION_CREATION_VECTOR_AND: ConditionCreationOptions = 2

public val CONDITION_CREATION_VECTOR_LEAF: ConditionCreationOptions = 8

public val CONDITION_CREATION_VECTOR_OR: ConditionCreationOptions = 4

public val CONTENT_SOURCE_E_CONTENT_CLASS_READ: Int = -2147208188

public val CONTENT_SOURCE_E_CONTENT_SOURCE_COLUMN_TYPE: Int = -2147208185

public val CONTENT_SOURCE_E_NULL_CONTENT_CLASS_BSTR: Int = -2147208186

public val CONTENT_SOURCE_E_NULL_URI: Int = -2147208183

public val CONTENT_SOURCE_E_OUT_OF_RANGE: Int = -2147208184

public val CONTENT_SOURCE_E_PROPERTY_MAPPING_BAD_VECTOR_SIZE: Int = -2147208189

public val CONTENT_SOURCE_E_PROPERTY_MAPPING_READ: Int = -2147208191

public val CONTENT_SOURCE_E_UNEXPECTED_EXCEPTION: Int = -2147208187

public val CONTENT_SOURCE_E_UNEXPECTED_NULL_POINTER: Int = -2147208190

public val CQUERYDISPIDS: UInt = 11u

public val CQUERYMETADISPIDS: UInt = 10u

public val CQUERYPROPERTY: UInt = 64u

public val CREATESUBS_ADDTOFAVORITES: Createsubscriptionflags = 1

public val CREATESUBS_FROMFAVORITES: Createsubscriptionflags = 2

public val CREATESUBS_NOSAVE: Createsubscriptionflags = 8

public val CREATESUBS_NOUI: Createsubscriptionflags = 4

public val CREATESUBS_SOFTWAREUPDATE: Createsubscriptionflags = 16

public val CRESTRICTIONS_DBSCHEMA_ASSERTIONS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_CATALOGS: UInt = 1u

public val CRESTRICTIONS_DBSCHEMA_CHARACTER_SETS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_CHECK_CONSTRAINTS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_CHECK_CONSTRAINTS_BY_TABLE: UInt = 6u

public val CRESTRICTIONS_DBSCHEMA_COLLATIONS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_COLUMNS: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_COLUMN_DOMAIN_USAGE: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_COLUMN_PRIVILEGES: UInt = 6u

public val CRESTRICTIONS_DBSCHEMA_CONSTRAINT_COLUMN_USAGE: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_CONSTRAINT_TABLE_USAGE: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_FOREIGN_KEYS: UInt = 6u

public val CRESTRICTIONS_DBSCHEMA_INDEXES: UInt = 5u

public val CRESTRICTIONS_DBSCHEMA_KEY_COLUMN_USAGE: UInt = 7u

public val CRESTRICTIONS_DBSCHEMA_LINKEDSERVERS: UInt = 1u

public val CRESTRICTIONS_DBSCHEMA_OBJECTS: UInt = 1u

public val CRESTRICTIONS_DBSCHEMA_OBJECT_ACTIONS: UInt = 1u

public val CRESTRICTIONS_DBSCHEMA_PRIMARY_KEYS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_PROCEDURES: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_PROCEDURE_COLUMNS: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_PROCEDURE_PARAMETERS: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_PROVIDER_TYPES: UInt = 2u

public val CRESTRICTIONS_DBSCHEMA_REFERENTIAL_CONSTRAINTS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_SCHEMATA: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_SQL_LANGUAGES: UInt = 0u

public val CRESTRICTIONS_DBSCHEMA_STATISTICS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_TABLES: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_TABLES_INFO: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_TABLE_CONSTRAINTS: UInt = 7u

public val CRESTRICTIONS_DBSCHEMA_TABLE_PRIVILEGES: UInt = 5u

public val CRESTRICTIONS_DBSCHEMA_TABLE_STATISTICS: UInt = 7u

public val CRESTRICTIONS_DBSCHEMA_TRANSLATIONS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_TRUSTEE: UInt = 4u

public val CRESTRICTIONS_DBSCHEMA_USAGE_PRIVILEGES: UInt = 6u

public val CRESTRICTIONS_DBSCHEMA_VIEWS: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_VIEW_COLUMN_USAGE: UInt = 3u

public val CRESTRICTIONS_DBSCHEMA_VIEW_TABLE_USAGE: UInt = 3u

public val CRESTRICTIONS_MDSCHEMA_ACTIONS: UInt = 8u

public val CRESTRICTIONS_MDSCHEMA_COMMANDS: UInt = 5u

public val CRESTRICTIONS_MDSCHEMA_CUBES: UInt = 3u

public val CRESTRICTIONS_MDSCHEMA_DIMENSIONS: UInt = 5u

public val CRESTRICTIONS_MDSCHEMA_FUNCTIONS: UInt = 4u

public val CRESTRICTIONS_MDSCHEMA_HIERARCHIES: UInt = 6u

public val CRESTRICTIONS_MDSCHEMA_LEVELS: UInt = 7u

public val CRESTRICTIONS_MDSCHEMA_MEASURES: UInt = 5u

public val CRESTRICTIONS_MDSCHEMA_MEMBERS: UInt = 12u

public val CRESTRICTIONS_MDSCHEMA_PROPERTIES: UInt = 9u

public val CRESTRICTIONS_MDSCHEMA_SETS: UInt = 5u

public val CSTORAGEPROPERTY: UInt = 23u

public val C_SEARCH_LANGUAGE_SUPPORT: Guid = Guid.fromU128(U128(0x6a68cc8043374dbcuL, 0xbd27fbfb1053820buL))

public val C_SEARCH_MANAGER: Guid = Guid.fromU128(U128(0x7d096c5fac084f1fuL, 0xbeb75c22c517ce39uL))

public val C_SEARCH_ROOT: Guid = Guid.fromU128(U128(0x30766bd2ea1c4f28uL, 0xbf270b44e2f68db7uL))

public val C_SEARCH_SCOPE_RULE: Guid = Guid.fromU128(U128(0xe63de7503bd74be5uL, 0x9c846b4281988c44uL))

public val COMPOUND_CONDITION: Guid = Guid.fromU128(U128(0x116f8d13101e4fa5uL, 0x84d4ff8279381935uL))

public val CONDITION_FACTORY: Guid = Guid.fromU128(U128(0xe03e85b07be34000uL, 0xba986c13de9fa486uL))

public val DBACCESSOR_INHERITED: Dbaccessorflagsenum = 16

public val DBACCESSOR_INVALID: Dbaccessorflagsenum = 0

public val DBACCESSOR_OPTIMIZED: Dbaccessorflagsenum = 8

public val DBACCESSOR_PARAMETERDATA: Dbaccessorflagsenum = 4

public val DBACCESSOR_PASSBYREF: Dbaccessorflagsenum = 1

public val DBACCESSOR_ROWDATA: Dbaccessorflagsenum = 2

public val DBASYNCHOP_OPEN: Dbasynchopenum = 0

public val DBASYNCHPHASE_CANCELED: Dbasynchphaseenum = 3

public val DBASYNCHPHASE_COMPLETE: Dbasynchphaseenum = 2

public val DBASYNCHPHASE_INITIALIZATION: Dbasynchphaseenum = 0

public val DBASYNCHPHASE_POPULATION: Dbasynchphaseenum = 1

public val DBBINDFLAG_HTML: Dbbindflagenum = 1

public val DBBINDSTATUS_BADBINDINFO: Dbbindstatusenum = 3

public val DBBINDSTATUS_BADORDINAL: Dbbindstatusenum = 1

public val DBBINDSTATUS_BADSTORAGEFLAGS: Dbbindstatusenum = 4

public val DBBINDSTATUS_MULTIPLESTORAGE: Dbbindstatusenum = 6

public val DBBINDSTATUS_NOINTERFACE: Dbbindstatusenum = 5

public val DBBINDSTATUS_OK: Dbbindstatusenum = 0

public val DBBINDSTATUS_UNSUPPORTEDCONVERSION: Dbbindstatusenum = 2

public val DBBINDURLFLAG_ASYNCHRONOUS: Dbbindurlflagenum = 4096

public val DBBINDURLFLAG_COLLECTION: Dbbindurlflagenum = 8192

public val DBBINDURLFLAG_DELAYFETCHCOLUMNS: Dbbindurlflagenum = 32768

public val DBBINDURLFLAG_DELAYFETCHSTREAM: Dbbindurlflagenum = 16384

public val DBBINDURLFLAG_ISSTRUCTUREDDOCUMENT: Dbbindurlflagenum = 134217728

public val DBBINDURLFLAG_OPENIFEXISTS: Dbbindurlflagenum = 33554432

public val DBBINDURLFLAG_OUTPUT: Dbbindurlflagenum = 8388608

public val DBBINDURLFLAG_OVERWRITE: Dbbindurlflagenum = 67108864

public val DBBINDURLFLAG_READ: Dbbindurlflagenum = 1

public val DBBINDURLFLAG_READWRITE: Dbbindurlflagenum = 3

public val DBBINDURLFLAG_RECURSIVE: Dbbindurlflagenum = 4194304

public val DBBINDURLFLAG_SHARE_DENY_NONE: Dbbindurlflagenum = 16

public val DBBINDURLFLAG_SHARE_DENY_READ: Dbbindurlflagenum = 4

public val DBBINDURLFLAG_SHARE_DENY_WRITE: Dbbindurlflagenum = 8

public val DBBINDURLFLAG_SHARE_EXCLUSIVE: Dbbindurlflagenum = 12

public val DBBINDURLFLAG_WAITFORINIT: Dbbindurlflagenum = 16777216

public val DBBINDURLFLAG_WRITE: Dbbindurlflagenum = 2

public val DBBINDURLSTATUS_S_DENYNOTSUPPORTED: Dbbindurlstatusenum = 1

public val DBBINDURLSTATUS_S_DENYTYPENOTSUPPORTED: Dbbindurlstatusenum = 4

public val DBBINDURLSTATUS_S_OK: Dbbindurlstatusenum = 0

public val DBBINDURLSTATUS_S_REDIRECTED: Dbbindurlstatusenum = 8

public val DBBMKGUID: Guid = Guid.fromU128(U128(0xc8b522325cf311ceuL, 0xade500aa0044773duL))

public val DBBMK_FIRST: Dbbookmark = 1

public val DBBMK_INVALID: Dbbookmark = 0

public val DBBMK_LAST: Dbbookmark = 2

public val DBCIDGUID: Guid = Guid.fromU128(U128(0xc733a812a1c11ceuL, 0xade500aa0044773duL))

public val DBCOLUMNDESCFLAGS_CLSID: Dbcolumndescflagsenum = 8

public val DBCOLUMNDESCFLAGS_COLSIZE: Dbcolumndescflagsenum = 16

public val DBCOLUMNDESCFLAGS_DBCID: Dbcolumndescflagsenum = 32

public val DBCOLUMNDESCFLAGS_ITYPEINFO: Dbcolumndescflagsenum = 2

public val DBCOLUMNDESCFLAGS_PRECISION: Dbcolumndescflagsenum = 128

public val DBCOLUMNDESCFLAGS_PROPERTIES: Dbcolumndescflagsenum = 4

public val DBCOLUMNDESCFLAGS_SCALE: Dbcolumndescflagsenum = 256

public val DBCOLUMNDESCFLAGS_TYPENAME: Dbcolumndescflagsenum = 1

public val DBCOLUMNDESCFLAGS_WTYPE: Dbcolumndescflagsenum = 64

public val DBCOLUMNFLAGS_CACHEDEFERRED: Dbcolumnflagsenum = 4096

public val DBCOLUMNFLAGS_ISBOOKMARK: Dbcolumnflagsenum = 1

public val DBCOLUMNFLAGS_ISCHAPTER: Dbcolumnflags15enum = 8192

public val DBCOLUMNFLAGS_ISCOLLECTION: Dbcolumnflagsenum21 = 262144

public val DBCOLUMNFLAGS_ISDEFAULTSTREAM: Dbcolumnflagsenum21 = 131072

public val DBCOLUMNFLAGS_ISFIXEDLENGTH: Dbcolumnflagsenum = 16

public val DBCOLUMNFLAGS_ISLONG: Dbcolumnflagsenum = 128

public val DBCOLUMNFLAGS_ISNULLABLE: Dbcolumnflagsenum = 32

public val DBCOLUMNFLAGS_ISROW: Dbcolumnflagsenum26 = 2097152

public val DBCOLUMNFLAGS_ISROWID: Dbcolumnflagsenum = 256

public val DBCOLUMNFLAGS_ISROWSET: Dbcolumnflagsenum26 = 1048576

public val DBCOLUMNFLAGS_ISROWURL: Dbcolumnflagsenum21 = 65536

public val DBCOLUMNFLAGS_ISROWVER: Dbcolumnflagsenum = 512

public val DBCOLUMNFLAGS_ISSTREAM: Dbcolumnflagsenum26 = 524288

public val DBCOLUMNFLAGS_KEYCOLUMN: Dbcolumnflagsdeprecated = 32768

public val DBCOLUMNFLAGS_MAYBENULL: Dbcolumnflagsenum = 64

public val DBCOLUMNFLAGS_MAYDEFER: Dbcolumnflagsenum = 2

public val DBCOLUMNFLAGS_RESERVED: Dbcolumnflagsenum20 = 32768

public val DBCOLUMNFLAGS_ROWSPECIFICCOLUMN: Dbcolumnflagsenum26 = 4194304

public val DBCOLUMNFLAGS_SCALEISNEGATIVE: Dbcolumnflagsenum20 = 16384

public val DBCOLUMNFLAGS_WRITE: Dbcolumnflagsenum = 4

public val DBCOLUMNFLAGS_WRITEUNKNOWN: Dbcolumnflagsenum = 8

public val DBCOMMANDPERSISTFLAG_DEFAULT: Dbcommandpersistflagenum21 = 0

public val DBCOMMANDPERSISTFLAG_NOSAVE: Dbcommandpersistflagenum = 1

public val DBCOMMANDPERSISTFLAG_PERSISTPROCEDURE: Dbcommandpersistflagenum21 = 4

public val DBCOMMANDPERSISTFLAG_PERSISTVIEW: Dbcommandpersistflagenum21 = 2

public val DBCOMPAREOPS_BEGINSWITH: Dbcompareopsenum = 5

public val DBCOMPAREOPS_CASEINSENSITIVE: Dbcompareopsenum = 8192

public val DBCOMPAREOPS_CASESENSITIVE: Dbcompareopsenum = 4096

public val DBCOMPAREOPS_CONTAINS: Dbcompareopsenum = 6

public val DBCOMPAREOPS_EQ: Dbcompareopsenum = 2

public val DBCOMPAREOPS_GE: Dbcompareopsenum = 3

public val DBCOMPAREOPS_GT: Dbcompareopsenum = 4

public val DBCOMPAREOPS_IGNORE: Dbcompareopsenum = 8

public val DBCOMPAREOPS_LE: Dbcompareopsenum = 1

public val DBCOMPAREOPS_LT: Dbcompareopsenum = 0

public val DBCOMPAREOPS_NE: Dbcompareopsenum = 7

public val DBCOMPAREOPS_NOTBEGINSWITH: Dbcompareopsenum20 = 9

public val DBCOMPAREOPS_NOTCONTAINS: Dbcompareopsenum20 = 10

public val DBCOMPARE_EQ: Dbcompareenum = 1

public val DBCOMPARE_GT: Dbcompareenum = 2

public val DBCOMPARE_LT: Dbcompareenum = 0

public val DBCOMPARE_NE: Dbcompareenum = 3

public val DBCOMPARE_NOTCOMPARABLE: Dbcompareenum = 4

public val DBCOMPUTEMODE_COMPUTED: UInt = 1u

public val DBCOMPUTEMODE_DYNAMIC: UInt = 2u

public val DBCOMPUTEMODE_NOTCOMPUTED: UInt = 3u

public val DBCONSTRAINTTYPE_CHECK: Dbconstrainttypeenum = 3

public val DBCONSTRAINTTYPE_FOREIGNKEY: Dbconstrainttypeenum = 1

public val DBCONSTRAINTTYPE_PRIMARYKEY: Dbconstrainttypeenum = 2

public val DBCONSTRAINTTYPE_UNIQUE: Dbconstrainttypeenum = 0

public val DBCONVERTFLAGS_COLUMN: Dbconvertflagsenum = 0

public val DBCONVERTFLAGS_FROMVARIANT: Dbconvertflagsenum20 = 8

public val DBCONVERTFLAGS_ISFIXEDLENGTH: Dbconvertflagsenum20 = 4

public val DBCONVERTFLAGS_ISLONG: Dbconvertflagsenum20 = 2

public val DBCONVERTFLAGS_PARAMETER: Dbconvertflagsenum = 1

public val DBCOPY_ALLOW_EMULATION: Dbcopyflagsenum = 1024

public val DBCOPY_ASYNC: Dbcopyflagsenum = 256

public val DBCOPY_ATOMIC: Dbcopyflagsenum = 4096

public val DBCOPY_NON_RECURSIVE: Dbcopyflagsenum = 2048

public val DBCOPY_REPLACE_EXISTING: Dbcopyflagsenum = 512

public val DBDATACONVERT_DECIMALSCALE: Dbdataconvertenum = 8

public val DBDATACONVERT_DEFAULT: Dbdataconvertenum = 0

public val DBDATACONVERT_DSTISFIXEDLENGTH: Dbdataconvertenum = 4

public val DBDATACONVERT_LENGTHFROMNTS: Dbdataconvertenum = 2

public val DBDATACONVERT_SETDATABEHAVIOR: Dbdataconvertenum = 1

public val DBDEFERRABILITY_DEFERRABLE: Dbdeferrabilityenum = 2

public val DBDEFERRABILITY_DEFERRED: Dbdeferrabilityenum = 1

public val DBDELETE_ASYNC: Dbdeleteflagsenum = 256

public val DBDELETE_ATOMIC: Dbdeleteflagsenum = 4096

public val DBEVENTPHASE_ABOUTTODO: Dbeventphaseenum = 1

public val DBEVENTPHASE_DIDEVENT: Dbeventphaseenum = 4

public val DBEVENTPHASE_FAILEDTODO: Dbeventphaseenum = 3

public val DBEVENTPHASE_OKTODO: Dbeventphaseenum = 0

public val DBEVENTPHASE_SYNCHAFTER: Dbeventphaseenum = 2

public val DBEXECLIMITS_ABORT: Dbexeclimitsenum = 1

public val DBEXECLIMITS_STOP: Dbexeclimitsenum = 2

public val DBEXECLIMITS_SUSPEND: Dbexeclimitsenum = 3

public val DBGUID_MSSQLXML: Guid = Guid.fromU128(U128(0x5d531cb2e6ed11d2uL, 0xb25200c04f681b71uL))

public val DBGUID_ROWDEFAULTSTREAM: Guid = Guid.fromU128(U128(0xc733ab72a1c11ceuL, 0xade500aa0044773duL))

public val DBGUID_ROWURL: Guid = Guid.fromU128(U128(0xc733ab62a1c11ceuL, 0xade500aa0044773duL))

public val DBGUID_XPATH: Guid = Guid.fromU128(U128(0xec2a4293e89811d2uL, 0xb1b700c04f680c56uL))

public val DBINDEX_COL_ORDER_ASC: DbindexColOrderenum = 0

public val DBINDEX_COL_ORDER_DESC: DbindexColOrderenum = 1

public val DBLITERAL_BINARY_LITERAL: Dbliteralenum = 1

public val DBLITERAL_CATALOG_NAME: Dbliteralenum = 2

public val DBLITERAL_CATALOG_SEPARATOR: Dbliteralenum = 3

public val DBLITERAL_CHAR_LITERAL: Dbliteralenum = 4

public val DBLITERAL_COLUMN_ALIAS: Dbliteralenum = 5

public val DBLITERAL_COLUMN_NAME: Dbliteralenum = 6

public val DBLITERAL_CORRELATION_NAME: Dbliteralenum = 7

public val DBLITERAL_CUBE_NAME: Dbliteralenum20 = 21

public val DBLITERAL_CURSOR_NAME: Dbliteralenum = 8

public val DBLITERAL_DIMENSION_NAME: Dbliteralenum20 = 22

public val DBLITERAL_ESCAPE_PERCENT: Dbliteralenum = 9

public val DBLITERAL_ESCAPE_PERCENT_SUFFIX: Dbliteralenum21 = 29

public val DBLITERAL_ESCAPE_UNDERSCORE: Dbliteralenum = 10

public val DBLITERAL_ESCAPE_UNDERSCORE_SUFFIX: Dbliteralenum21 = 30

public val DBLITERAL_HIERARCHY_NAME: Dbliteralenum20 = 23

public val DBLITERAL_INDEX_NAME: Dbliteralenum = 11

public val DBLITERAL_INVALID: Dbliteralenum = 0

public val DBLITERAL_LEVEL_NAME: Dbliteralenum20 = 24

public val DBLITERAL_LIKE_PERCENT: Dbliteralenum = 12

public val DBLITERAL_LIKE_UNDERSCORE: Dbliteralenum = 13

public val DBLITERAL_MEMBER_NAME: Dbliteralenum20 = 25

public val DBLITERAL_PROCEDURE_NAME: Dbliteralenum = 14

public val DBLITERAL_PROPERTY_NAME: Dbliteralenum20 = 26

public val DBLITERAL_QUOTE: Dbliteralenum = 15

public val DBLITERAL_QUOTE_SUFFIX: Dbliteralenum20 = 28

public val DBLITERAL_SCHEMA_NAME: Dbliteralenum = 16

public val DBLITERAL_SCHEMA_SEPARATOR: Dbliteralenum20 = 27

public val DBLITERAL_TABLE_NAME: Dbliteralenum = 17

public val DBLITERAL_TEXT_COMMAND: Dbliteralenum = 18

public val DBLITERAL_USER_NAME: Dbliteralenum = 19

public val DBLITERAL_VIEW_NAME: Dbliteralenum = 20

public val DBMATCHTYPE_FULL: Dbmatchtypeenum = 0

public val DBMATCHTYPE_NONE: Dbmatchtypeenum = 1

public val DBMATCHTYPE_PARTIAL: Dbmatchtypeenum = 2

public val DBMAXCHAR: UInt = 8001u

public val DBMEMOWNER_CLIENTOWNED: Dbmemownerenum = 0

public val DBMEMOWNER_PROVIDEROWNED: Dbmemownerenum = 1

public val DBMOVE_ALLOW_EMULATION: Dbmoveflagsenum = 1024

public val DBMOVE_ASYNC: Dbmoveflagsenum = 256

public val DBMOVE_ATOMIC: Dbmoveflagsenum = 4096

public val DBMOVE_DONT_UPDATE_LINKS: Dbmoveflagsenum = 512

public val DBMOVE_REPLACE_EXISTING: Dbmoveflagsenum = 1

public val DBPARAMFLAGS_ISINPUT: Dbparamflagsenum = 1

public val DBPARAMFLAGS_ISLONG: Dbparamflagsenum = 128

public val DBPARAMFLAGS_ISNULLABLE: Dbparamflagsenum = 64

public val DBPARAMFLAGS_ISOUTPUT: Dbparamflagsenum = 2

public val DBPARAMFLAGS_ISSIGNED: Dbparamflagsenum = 16

public val DBPARAMFLAGS_SCALEISNEGATIVE: Dbparamflagsenum20 = 256

public val DBPARAMIO_INPUT: Dbparamioenum = 1

public val DBPARAMIO_NOTPARAM: Dbparamioenum = 0

public val DBPARAMIO_OUTPUT: Dbparamioenum = 2

public val DBPARAMTYPE_INPUT: UInt = 1u

public val DBPARAMTYPE_INPUTOUTPUT: UInt = 2u

public val DBPARAMTYPE_OUTPUT: UInt = 3u

public val DBPARAMTYPE_RETURNVALUE: UInt = 4u

public val DBPART_INVALID: Dbpartenum = 0

public val DBPART_LENGTH: Dbpartenum = 2

public val DBPART_STATUS: Dbpartenum = 4

public val DBPART_VALUE: Dbpartenum = 1

public val DBPENDINGSTATUS_CHANGED: Dbpendingstatusenum = 2

public val DBPENDINGSTATUS_DELETED: Dbpendingstatusenum = 4

public val DBPENDINGSTATUS_INVALIDROW: Dbpendingstatusenum = 16

public val DBPENDINGSTATUS_NEW: Dbpendingstatusenum = 1

public val DBPENDINGSTATUS_UNCHANGED: Dbpendingstatusenum = 8

public val DBPOSITION_BOF: Dbpositionflagsenum = 2

public val DBPOSITION_EOF: Dbpositionflagsenum = 3

public val DBPOSITION_NOROW: Dbpositionflagsenum = 1

public val DBPOSITION_OK: Dbpositionflagsenum = 0

public val DBPROMPTOPTIONS_BROWSEONLY: Dbpromptoptionsenum = 8

public val DBPROMPTOPTIONS_DISABLESAVEPASSWORD: Dbpromptoptionsenum = 32

public val DBPROMPTOPTIONS_DISABLE_PROVIDER_SELECTION: Dbpromptoptionsenum = 16

public val DBPROMPTOPTIONS_NONE: Dbpromptoptionsenum = 0

public val DBPROMPTOPTIONS_PROPERTYSHEET: Dbpromptoptionsenum = 2

public val DBPROMPTOPTIONS_WIZARDSHEET: Dbpromptoptionsenum = 1

public val DBPROMPT_COMPLETE: UInt = 2u

public val DBPROMPT_COMPLETEREQUIRED: UInt = 3u

public val DBPROMPT_NOPROMPT: UInt = 4u

public val DBPROMPT_PROMPT: UInt = 1u

public val DBPROPFLAGS_COLUMN: Dbpropflagsenum = 1

public val DBPROPFLAGS_COLUMNOK: Dbpropflagsenum = 256

public val DBPROPFLAGS_DATASOURCE: Dbpropflagsenum = 2

public val DBPROPFLAGS_DATASOURCECREATE: Dbpropflagsenum = 4

public val DBPROPFLAGS_DATASOURCEINFO: Dbpropflagsenum = 8

public val DBPROPFLAGS_DBINIT: Dbpropflagsenum = 16

public val DBPROPFLAGS_INDEX: Dbpropflagsenum = 32

public val DBPROPFLAGS_NOTSUPPORTED: Dbpropflagsenum = 0

public val DBPROPFLAGS_PERSIST: UInt = 8192u

public val DBPROPFLAGS_READ: Dbpropflagsenum = 512

public val DBPROPFLAGS_REQUIRED: Dbpropflagsenum = 2048

public val DBPROPFLAGS_ROWSET: Dbpropflagsenum = 64

public val DBPROPFLAGS_SESSION: Dbpropflagsenum = 4096

public val DBPROPFLAGS_STREAM: Dbpropflagsenum26 = 32768

public val DBPROPFLAGS_TABLE: Dbpropflagsenum = 128

public val DBPROPFLAGS_TRUSTEE: Dbpropflagsenum21 = 8192

public val DBPROPFLAGS_VIEW: Dbpropflagsenum25 = 16384

public val DBPROPFLAGS_WRITE: Dbpropflagsenum = 1024

public val DBPROPOPTIONS_OPTIONAL: Dbpropoptionsenum = 1

public val DBPROPOPTIONS_REQUIRED: Dbpropoptionsenum = 0

public val DBPROPOPTIONS_SETIFCHEAP: Dbpropoptionsenum = 1

public val DBPROPSET_MSDAORA8_ROWSET: Guid = Guid.fromU128(U128(0x7f06a375dd6a43dbuL, 0xb4e01fc121e5e62buL))

public val DBPROPSET_MSDAORA_ROWSET: Guid = Guid.fromU128(U128(0xe8cc4cbdfdff11d0uL, 0xb86500a0c9081c1duL))

public val DBPROPSET_MSDSDBINIT: Guid = Guid.fromU128(U128(0x55cb91a85c7a11d1uL, 0xadad00c04fc29863uL))

public val DBPROPSET_MSDSSESSION: Guid = Guid.fromU128(U128(0xedf17536afbf11d1uL, 0x88470000f879f98cuL))

public val DBPROPSET_PERSIST: Guid = Guid.fromU128(U128(0x4d7839a05b8e11d1uL, 0xa6b300a0c9138c66uL))

public val DBPROPSET_PROVIDERCONNATTR: Guid = Guid.fromU128(U128(0x497c60e4712311cfuL, 0xb17100aa0057599euL))

public val DBPROPSET_PROVIDERDATASOURCEINFO: Guid = Guid.fromU128(U128(0x497c60e0712311cfuL, 0xb17100aa0057599euL))

public val DBPROPSET_PROVIDERDBINIT: Guid = Guid.fromU128(U128(0x497c60e2712311cfuL, 0xb17100aa0057599euL))

public val DBPROPSET_PROVIDERROWSET: Guid = Guid.fromU128(U128(0x497c60e1712311cfuL, 0xb17100aa0057599euL))

public val DBPROPSET_PROVIDERSTMTATTR: Guid = Guid.fromU128(U128(0x497c60e3712311cfuL, 0xb17100aa0057599euL))

public val DBPROPSET_SQLSERVERCOLUMN: Guid = Guid.fromU128(U128(0x3b63fb5e3fbb11d3uL, 0x9f2900c04f8ee9dcuL))

public val DBPROPSET_SQLSERVERDATASOURCE: Guid = Guid.fromU128(U128(0x28efaee42d2c11d1uL, 0x980700c04fc2ad98uL))

public val DBPROPSET_SQLSERVERDATASOURCEINFO: Guid = Guid.fromU128(U128(0xdf10cb9435f611d2uL, 0x9c5400c04f7971d3uL))

public val DBPROPSET_SQLSERVERDBINIT: Guid = Guid.fromU128(U128(0x5cf4ca10ef2111d0uL, 0x97e700c04fc2ad98uL))

public val DBPROPSET_SQLSERVERROWSET: Guid = Guid.fromU128(U128(0x5cf4ca11ef2111d0uL, 0x97e700c04fc2ad98uL))

public val DBPROPSET_SQLSERVERSESSION: Guid = Guid.fromU128(U128(0x28efaee52d2c11d1uL, 0x980700c04fc2ad98uL))

public val DBPROPSET_SQLSERVERSTREAM: Guid = Guid.fromU128(U128(0x9f79c0738a6d4bcauL, 0xa8a8c9b79a9b962duL))

public val DBPROPSTATUS_BADCOLUMN: Dbpropstatusenum = 4

public val DBPROPSTATUS_BADOPTION: Dbpropstatusenum = 3

public val DBPROPSTATUS_BADVALUE: Dbpropstatusenum = 2

public val DBPROPSTATUS_CONFLICTING: Dbpropstatusenum = 8

public val DBPROPSTATUS_NOTALLSETTABLE: Dbpropstatusenum = 5

public val DBPROPSTATUS_NOTAVAILABLE: Dbpropstatusenum21 = 9

public val DBPROPSTATUS_NOTSET: Dbpropstatusenum = 7

public val DBPROPSTATUS_NOTSETTABLE: Dbpropstatusenum = 6

public val DBPROPSTATUS_NOTSUPPORTED: Dbpropstatusenum = 1

public val DBPROPSTATUS_OK: Dbpropstatusenum = 0

public val DBPROPVAL_AO_RANDOM: Int = 2

public val DBPROPVAL_AO_SEQUENTIAL: Int = 0

public val DBPROPVAL_AO_SEQUENTIALSTORAGEOBJECTS: Int = 1

public val DBPROPVAL_ASYNCH_BACKGROUNDPOPULATION: Int = 8

public val DBPROPVAL_ASYNCH_INITIALIZE: Int = 1

public val DBPROPVAL_ASYNCH_POPULATEONDEMAND: Int = 32

public val DBPROPVAL_ASYNCH_PREPOPULATE: Int = 16

public val DBPROPVAL_ASYNCH_RANDOMPOPULATION: Int = 4

public val DBPROPVAL_ASYNCH_SEQUENTIALPOPULATION: Int = 2

public val DBPROPVAL_BD_INTRANSACTION: Int = 1

public val DBPROPVAL_BD_REORGANIZATION: Int = 3

public val DBPROPVAL_BD_ROWSET: Int = 0

public val DBPROPVAL_BD_XTRANSACTION: Int = 2

public val DBPROPVAL_BI_CROSSROWSET: Int = 1

public val DBPROPVAL_BMK_KEY: Int = 2

public val DBPROPVAL_BMK_NUMERIC: Int = 1

public val DBPROPVAL_BO_NOINDEXUPDATE: Int = 1

public val DBPROPVAL_BO_NOLOG: Int = 0

public val DBPROPVAL_BO_REFINTEGRITY: Int = 2

public val DBPROPVAL_CB_DELETE: Int = 1

public val DBPROPVAL_CB_NON_NULL: Int = 2

public val DBPROPVAL_CB_NULL: Int = 1

public val DBPROPVAL_CB_PRESERVE: Int = 2

public val DBPROPVAL_CD_NOTNULL: Int = 1

public val DBPROPVAL_CL_END: Int = 2

public val DBPROPVAL_CL_START: Int = 1

public val DBPROPVAL_CM_TRANSACTIONS: Int = 1

public val DBPROPVAL_CO_BEGINSWITH: Int = 32

public val DBPROPVAL_CO_CASEINSENSITIVE: Int = 8

public val DBPROPVAL_CO_CASESENSITIVE: Int = 4

public val DBPROPVAL_CO_CONTAINS: Int = 16

public val DBPROPVAL_CO_EQUALITY: Int = 1

public val DBPROPVAL_CO_STRING: Int = 2

public val DBPROPVAL_CS_COMMUNICATIONFAILURE: Int = 2

public val DBPROPVAL_CS_INITIALIZED: Int = 1

public val DBPROPVAL_CS_UNINITIALIZED: Int = 0

public val DBPROPVAL_CU_DML_STATEMENTS: Int = 1

public val DBPROPVAL_CU_INDEX_DEFINITION: Int = 4

public val DBPROPVAL_CU_PRIVILEGE_DEFINITION: Int = 8

public val DBPROPVAL_CU_TABLE_DEFINITION: Int = 2

public val DBPROPVAL_DF_INITIALLY_DEFERRED: UInt = 1u

public val DBPROPVAL_DF_INITIALLY_IMMEDIATE: UInt = 2u

public val DBPROPVAL_DF_NOT_DEFERRABLE: UInt = 3u

public val DBPROPVAL_DST_DOCSOURCE: Int = 4

public val DBPROPVAL_DST_MDP: Int = 2

public val DBPROPVAL_DST_TDP: Int = 1

public val DBPROPVAL_DST_TDPANDMDP: Int = 3

public val DBPROPVAL_FU_CATALOG: Int = 8

public val DBPROPVAL_FU_COLUMN: Int = 2

public val DBPROPVAL_FU_NOT_SUPPORTED: Int = 1

public val DBPROPVAL_FU_TABLE: Int = 4

public val DBPROPVAL_GB_COLLATE: Int = 16

public val DBPROPVAL_GB_CONTAINS_SELECT: Int = 4

public val DBPROPVAL_GB_EQUALS_SELECT: Int = 2

public val DBPROPVAL_GB_NOT_SUPPORTED: Int = 1

public val DBPROPVAL_GB_NO_RELATION: Int = 8

public val DBPROPVAL_GU_NOTSUPPORTED: Int = 1

public val DBPROPVAL_GU_SUFFIX: Int = 2

public val DBPROPVAL_HT_DIFFERENT_CATALOGS: Int = 1

public val DBPROPVAL_HT_DIFFERENT_PROVIDERS: Int = 2

public val DBPROPVAL_IC_LOWER: Int = 2

public val DBPROPVAL_IC_MIXED: Int = 8

public val DBPROPVAL_IC_SENSITIVE: Int = 4

public val DBPROPVAL_IC_UPPER: Int = 1

public val DBPROPVAL_IN_ALLOWNULL: Int = 0

public val DBPROPVAL_IN_DISALLOWNULL: Int = 1

public val DBPROPVAL_IN_IGNOREANYNULL: Int = 4

public val DBPROPVAL_IN_IGNORENULL: Int = 2

public val DBPROPVAL_IT_BTREE: Int = 1

public val DBPROPVAL_IT_CONTENT: Int = 3

public val DBPROPVAL_IT_HASH: Int = 2

public val DBPROPVAL_IT_OTHER: Int = 4

public val DBPROPVAL_LM_INTENT: Int = 4

public val DBPROPVAL_LM_NONE: Int = 1

public val DBPROPVAL_LM_READ: Int = 2

public val DBPROPVAL_LM_RITE: Int = 8

public val DBPROPVAL_LM_SINGLEROW: Int = 2

public val DBPROPVAL_MR_CONCURRENT: Int = 2

public val DBPROPVAL_MR_NOTSUPPORTED: Int = 0

public val DBPROPVAL_MR_SUPPORTED: Int = 1

public val DBPROPVAL_NC_END: Int = 1

public val DBPROPVAL_NC_HIGH: Int = 2

public val DBPROPVAL_NC_LOW: Int = 4

public val DBPROPVAL_NC_START: Int = 8

public val DBPROPVAL_NP_ABOUTTODO: Int = 2

public val DBPROPVAL_NP_DIDEVENT: Int = 16

public val DBPROPVAL_NP_FAILEDTODO: Int = 8

public val DBPROPVAL_NP_OKTODO: Int = 1

public val DBPROPVAL_NP_SYNCHAFTER: Int = 4

public val DBPROPVAL_NT_MULTIPLEROWS: Int = 2

public val DBPROPVAL_NT_SINGLEROW: Int = 1

public val DBPROPVAL_OA_ATEXECUTE: Int = 2

public val DBPROPVAL_OA_ATROWRELEASE: Int = 4

public val DBPROPVAL_OA_NOTSUPPORTED: Int = 1

public val DBPROPVAL_OO_BLOB: Int = 1

public val DBPROPVAL_OO_DIRECTBIND: Int = 16

public val DBPROPVAL_OO_IPERSIST: Int = 2

public val DBPROPVAL_OO_ROWOBJECT: Int = 4

public val DBPROPVAL_OO_SCOPED: Int = 8

public val DBPROPVAL_OO_SINGLETON: Int = 32

public val DBPROPVAL_OP_EQUAL: Int = 1

public val DBPROPVAL_OP_RELATIVE: Int = 2

public val DBPROPVAL_OP_STRING: Int = 4

public val DBPROPVAL_ORS_HISTOGRAM: Int = 8

public val DBPROPVAL_ORS_INDEX: Int = 1

public val DBPROPVAL_ORS_INTEGRATEDINDEX: Int = 2

public val DBPROPVAL_ORS_STOREDPROC: Int = 4

public val DBPROPVAL_ORS_TABLE: Int = 0

public val DBPROPVAL_OS_AGR_AFTERSESSION: Int = 8

public val DBPROPVAL_OS_CLIENTCURSOR: Int = 4

public val DBPROPVAL_OS_DISABLEALL: Int = 0

public val DBPROPVAL_OS_ENABLEALL: Int = -1

public val DBPROPVAL_OS_RESOURCEPOOLING: Int = 1

public val DBPROPVAL_OS_TXNENLISTMENT: Int = 2

public val DBPROPVAL_PERSIST_ADTG: UInt = 0u

public val DBPROPVAL_PERSIST_XML: UInt = 1u

public val DBPROPVAL_PT_GUID: Int = 8

public val DBPROPVAL_PT_GUID_NAME: Int = 1

public val DBPROPVAL_PT_GUID_PROPID: Int = 2

public val DBPROPVAL_PT_NAME: Int = 4

public val DBPROPVAL_PT_PGUID_NAME: Int = 32

public val DBPROPVAL_PT_PGUID_PROPID: Int = 64

public val DBPROPVAL_PT_PROPID: Int = 16

public val DBPROPVAL_RD_RESETALL: Int = -1

public val DBPROPVAL_RT_APTMTTHREAD: Int = 2

public val DBPROPVAL_RT_FREETHREAD: Int = 1

public val DBPROPVAL_RT_SINGLETHREAD: Int = 4

public val DBPROPVAL_SQL_ANSI89_IEF: Int = 8

public val DBPROPVAL_SQL_ANSI92_ENTRY: Int = 16

public val DBPROPVAL_SQL_ANSI92_FULL: Int = 128

public val DBPROPVAL_SQL_ANSI92_INTERMEDIATE: Int = 64

public val DBPROPVAL_SQL_ESCAPECLAUSES: Int = 256

public val DBPROPVAL_SQL_FIPS_TRANSITIONAL: Int = 32

public val DBPROPVAL_SQL_NONE: Int = 0

public val DBPROPVAL_SQL_ODBC_CORE: Int = 2

public val DBPROPVAL_SQL_ODBC_EXTENDED: Int = 4

public val DBPROPVAL_SQL_ODBC_MINIMUM: Int = 1

public val DBPROPVAL_SQL_SUBMINIMUM: Int = 512

public val DBPROPVAL_SQ_COMPARISON: Int = 2

public val DBPROPVAL_SQ_CORRELATEDSUBQUERIES: Int = 1

public val DBPROPVAL_SQ_EXISTS: Int = 4

public val DBPROPVAL_SQ_IN: Int = 8

public val DBPROPVAL_SQ_QUANTIFIED: Int = 16

public val DBPROPVAL_SQ_TABLE: Int = 32

public val DBPROPVAL_SS_ILOCKBYTES: Int = 8

public val DBPROPVAL_SS_ISEQUENTIALSTREAM: Int = 1

public val DBPROPVAL_SS_ISTORAGE: Int = 4

public val DBPROPVAL_SS_ISTREAM: Int = 2

public val DBPROPVAL_STGM_CONVERT: UInt = 262144u

public val DBPROPVAL_STGM_DELETEONRELEASE: UInt = 2097152u

public val DBPROPVAL_STGM_DIRECT: UInt = 65536u

public val DBPROPVAL_STGM_FAILIFTHERE: UInt = 524288u

public val DBPROPVAL_STGM_PRIORITY: UInt = 1048576u

public val DBPROPVAL_STGM_TRANSACTED: UInt = 131072u

public val DBPROPVAL_SU_DML_STATEMENTS: Int = 1

public val DBPROPVAL_SU_INDEX_DEFINITION: Int = 4

public val DBPROPVAL_SU_PRIVILEGE_DEFINITION: Int = 8

public val DBPROPVAL_SU_TABLE_DEFINITION: Int = 2

public val DBPROPVAL_TC_ALL: Int = 8

public val DBPROPVAL_TC_DDL_COMMIT: Int = 2

public val DBPROPVAL_TC_DDL_IGNORE: Int = 4

public val DBPROPVAL_TC_DDL_LOCK: Int = 16

public val DBPROPVAL_TC_DML: Int = 1

public val DBPROPVAL_TC_NONE: Int = 0

public val DBPROPVAL_TI_BROWSE: Int = 256

public val DBPROPVAL_TI_CHAOS: Int = 16

public val DBPROPVAL_TI_CURSORSTABILITY: Int = 4096

public val DBPROPVAL_TI_ISOLATED: Int = 1048576

public val DBPROPVAL_TI_READCOMMITTED: Int = 4096

public val DBPROPVAL_TI_READUNCOMMITTED: Int = 256

public val DBPROPVAL_TI_REPEATABLEREAD: Int = 65536

public val DBPROPVAL_TI_SERIALIZABLE: Int = 1048576

public val DBPROPVAL_TR_ABORT: Int = 16

public val DBPROPVAL_TR_ABORT_DC: Int = 8

public val DBPROPVAL_TR_ABORT_NO: Int = 32

public val DBPROPVAL_TR_BOTH: Int = 128

public val DBPROPVAL_TR_COMMIT: Int = 2

public val DBPROPVAL_TR_COMMIT_DC: Int = 1

public val DBPROPVAL_TR_COMMIT_NO: Int = 4

public val DBPROPVAL_TR_DONTCARE: Int = 64

public val DBPROPVAL_TR_NONE: Int = 256

public val DBPROPVAL_TR_OPTIMISTIC: Int = 512

public val DBPROPVAL_TS_CARDINALITY: Int = 1

public val DBPROPVAL_TS_HISTOGRAM: Int = 2

public val DBPROPVAL_UP_CHANGE: Int = 1

public val DBPROPVAL_UP_DELETE: Int = 2

public val DBPROPVAL_UP_INSERT: Int = 4

public val DBPROP_ABORTPRESERVE: Dbpropenum = 2

public val DBPROP_ACCESSORDER: Dbpropenum20 = 231

public val DBPROP_ACTIVESESSIONS: Dbpropenum = 3

public val DBPROP_ALTERCOLUMN: Dbpropenum20 = 245

public val DBPROP_APPENDONLY: Dbpropenum = 187

public val DBPROP_ASYNCTXNABORT: Dbpropenum = 168

public val DBPROP_ASYNCTXNCOMMIT: Dbpropenum = 4

public val DBPROP_AUTH_CACHE_AUTHINFO: Dbpropenum = 5

public val DBPROP_AUTH_ENCRYPT_PASSWORD: Dbpropenum = 6

public val DBPROP_AUTH_INTEGRATED: Dbpropenum = 7

public val DBPROP_AUTH_MASK_PASSWORD: Dbpropenum = 8

public val DBPROP_AUTH_PASSWORD: Dbpropenum = 9

public val DBPROP_AUTH_PERSIST_ENCRYPTED: Dbpropenum = 10

public val DBPROP_AUTH_PERSIST_SENSITIVE_AUTHINFO: Dbpropenum = 11

public val DBPROP_AUTH_USERID: Dbpropenum = 12

public val DBPROP_BLOCKINGSTORAGEOBJECTS: Dbpropenum = 13

public val DBPROP_BOOKMARKINFO: Dbpropenum20 = 232

public val DBPROP_BOOKMARKS: Dbpropenum = 14

public val DBPROP_BOOKMARKSKIPPED: Dbpropenum = 15

public val DBPROP_BOOKMARKTYPE: Dbpropenum = 16

public val DBPROP_BYREFACCESSORS: Dbpropenum = 120

public val DBPROP_CACHEDEFERRED: Dbpropenum = 17

public val DBPROP_CANFETCHBACKWARDS: Dbpropenum = 18

public val DBPROP_CANHOLDROWS: Dbpropenum = 19

public val DBPROP_CANSCROLLBACKWARDS: Dbpropenum = 21

public val DBPROP_CATALOGLOCATION: Dbpropenum = 22

public val DBPROP_CATALOGTERM: Dbpropenum = 23

public val DBPROP_CATALOGUSAGE: Dbpropenum = 24

public val DBPROP_CHANGEINSERTEDROWS: Dbpropenum = 188

public val DBPROP_CLIENTCURSOR: Dbpropenum20 = 260

public val DBPROP_COLUMNDEFINITION: Dbpropenum = 32

public val DBPROP_COLUMNLCID: Dbpropenum20 = 246

public val DBPROP_COLUMNRESTRICT: Dbpropenum = 33

public val DBPROP_COL_AUTOINCREMENT: Dbpropenum = 26

public val DBPROP_COL_DEFAULT: Dbpropenum = 27

public val DBPROP_COL_DESCRIPTION: Dbpropenum = 28

public val DBPROP_COL_FIXEDLENGTH: Dbpropenum = 167

public val DBPROP_COL_INCREMENT: Dbpropenum25 = 283

public val DBPROP_COL_ISLONG: Dbpropenum21 = 281

public val DBPROP_COL_NULLABLE: Dbpropenum = 29

public val DBPROP_COL_PRIMARYKEY: Dbpropenum = 30

public val DBPROP_COL_SEED: Dbpropenum25 = 282

public val DBPROP_COL_UNIQUE: Dbpropenum = 31

public val DBPROP_COMMANDTIMEOUT: Dbpropenum = 34

public val DBPROP_COMMITPRESERVE: Dbpropenum = 35

public val DBPROP_COMSERVICES: Dbpropenum25 = 285

public val DBPROP_CONCATNULLBEHAVIOR: Dbpropenum = 36

public val DBPROP_CONNECTIONSTATUS: Dbpropenum20 = 244

public val DBPROP_CURRENTCATALOG: Dbpropenum = 37

public val DBPROP_DATASOURCENAME: Dbpropenum = 38

public val DBPROP_DATASOURCEREADONLY: Dbpropenum = 39

public val DBPROP_DATASOURCE_TYPE: Dbpropenum20 = 251

public val DBPROP_DBMSNAME: Dbpropenum = 40

public val DBPROP_DBMSVER: Dbpropenum = 41

public val DBPROP_DEFERRED: Dbpropenum = 42

public val DBPROP_DELAYSTORAGEOBJECTS: Dbpropenum = 43

public val DBPROP_DSOTHREADMODEL: Dbpropenum = 169

public val DBPROP_FILTERCOMPAREOPS: Dbpropenum15 = 209

public val DBPROP_FILTEROPS: Dbpropenumdeprecated = 208

public val DBPROP_FINDCOMPAREOPS: Dbpropenum15 = 210

public val DBPROP_GENERATEURL: Dbpropenum21 = 273

public val DBPROP_GROUPBY: Dbpropenum = 44

public val DBPROP_HCHAPTER: UInt = 4u

public val DBPROP_HETEROGENEOUSTABLES: Dbpropenum = 45

public val DBPROP_HIDDENCOLUMNS: Dbpropenum20 = 258

public val DBPROP_I_ACCESSOR: Dbpropenum = 121

public val DBPROP_I_BIND_RESOURCE: Dbpropenum21 = 268

public val DBPROP_I_CHAPTERED_ROWSET: Dbpropenum15 = 202

public val DBPROP_I_COLUMNS_INFO: Dbpropenum = 122

public val DBPROP_I_COLUMNS_INFO2: Dbpropenum21 = 275

public val DBPROP_I_COLUMNS_ROWSET: Dbpropenum = 123

public val DBPROP_I_COMMAND_COST: Dbpropenum25Deprecated = 141

public val DBPROP_I_COMMAND_TREE: Dbpropenum25Deprecated = 142

public val DBPROP_I_COMMAND_VALIDATE: Dbpropenum25Deprecated = 143

public val DBPROP_I_CONNECTION_POINT_CONTAINER: Dbpropenum = 124

public val DBPROP_I_CONVERT_TYPE: Dbpropenum = 194

public val DBPROP_I_CREATE_ROW: Dbpropenum21 = 269

public val DBPROP_IDB_ASYNCH_STATUS: Dbpropenum15 = 203

public val DBPROP_IDB_BINDER_PROPERTIES: Dbpropenum21 = 274

public val DBPROP_IDB_SCHEMA_COMMAND: Dbpropenum25Deprecated = 144

public val DBPROP_IDENTIFIERCASE: Dbpropenum = 46

public val DBPROP_I_GET_ROW: Dbpropenum21 = 266

public val DBPROP_I_GET_SESSION: Dbpropenum21 = 277

public val DBPROP_I_GET_SOURCE_ROW: Dbpropenum21 = 278

public val DBPROP_I_LOCK_BYTES: Dbpropenum = 136

public val DBPROP_IMMOBILEROWS: Dbpropenum = 47

public val DBPROP_I_MULTIPLE_RESULTS: Dbpropenum20 = 217

public val DBPROP_INDEX_AUTOUPDATE: Dbpropenum = 48

public val DBPROP_INDEX_CLUSTERED: Dbpropenum = 49

public val DBPROP_INDEX_FILLFACTOR: Dbpropenum = 50

public val DBPROP_INDEX_INITIALSIZE: Dbpropenum = 51

public val DBPROP_INDEX_NULLCOLLATION: Dbpropenum = 52

public val DBPROP_INDEX_NULLS: Dbpropenum = 53

public val DBPROP_INDEX_PRIMARYKEY: Dbpropenum = 54

public val DBPROP_INDEX_SORTBOOKMARKS: Dbpropenum = 55

public val DBPROP_INDEX_TEMPINDEX: Dbpropenum = 163

public val DBPROP_INDEX_TYPE: Dbpropenum = 56

public val DBPROP_INDEX_UNIQUE: Dbpropenum = 57

public val DBPROP_INIT_ASYNCH: Dbpropenum15 = 200

public val DBPROP_INIT_BINDFLAGS: Dbpropenum21 = 270

public val DBPROP_INIT_CATALOG: Dbpropenum20 = 233

public val DBPROP_INIT_DATASOURCE: Dbpropenum = 59

public val DBPROP_INIT_GENERALTIMEOUT: Dbpropenum25 = 284

public val DBPROP_INIT_HWND: Dbpropenum = 60

public val DBPROP_INIT_IMPERSONATION_LEVEL: Dbpropenum = 61

public val DBPROP_INIT_LCID: Dbpropenum = 186

public val DBPROP_INIT_LOCATION: Dbpropenum = 62

public val DBPROP_INIT_LOCKOWNER: Dbpropenum21 = 271

public val DBPROP_INIT_MODE: Dbpropenum = 63

public val DBPROP_INIT_OLEDBSERVICES: Dbpropenum20 = 248

public val DBPROP_INIT_PROMPT: Dbpropenum = 64

public val DBPROP_INIT_PROTECTION_LEVEL: Dbpropenum = 65

public val DBPROP_INIT_PROVIDERSTRING: Dbpropenum = 160

public val DBPROP_INIT_TIMEOUT: Dbpropenum = 66

public val DBPROP_INTERLEAVEDROWS: UInt = 8u

public val DBPROP_I_PARENT_ROWSET: Dbpropenum20 = 257

public val DBPROP_I_PROVIDE_MONIKER: Dbpropenum25Deprecated = 125

public val DBPROP_I_QUERY: Dbpropenum25Deprecated = 146

public val DBPROP_I_READ_DATA: Dbpropenum25Deprecated = 147

public val DBPROP_I_REGISTER_PROVIDER: Dbpropenum21 = 276

public val DBPROP_I_ROW: Dbpropenum21 = 263

public val DBPROP_I_ROW_CHANGE: Dbpropenum21 = 264

public val DBPROP_I_ROW_SCHEMA_CHANGE: Dbpropenum21 = 265

public val DBPROP_I_ROWSET: Dbpropenum = 126

public val DBPROP_I_ROWSET_ASYNCH: Dbpropenum25Deprecated = 148

public val DBPROP_I_ROWSET_BOOKMARK: Dbpropenum26 = 292

public val DBPROP_I_ROWSET_CHANGE: Dbpropenum = 127

public val DBPROP_I_ROWSET_COPY_ROWS: Dbpropenum25Deprecated = 149

public val DBPROP_I_ROWSET_CURRENT_INDEX: Dbpropenum21 = 279

public val DBPROP_I_ROWSET_EXACT_SCROLL: Dbpropenumdeprecated = 154

public val DBPROP_I_ROWSET_FIND: Dbpropenum15 = 204

public val DBPROP_I_ROWSET_IDENTITY: Dbpropenum = 128

public val DBPROP_I_ROWSET_INDEX: Dbpropenum = 159

public val DBPROP_I_ROWSET_INFO: Dbpropenum = 129

public val DBPROP_I_ROWSET_KEYS: Dbpropenum25Deprecated = 151

public val DBPROP_I_ROWSET_LOCATE: Dbpropenum = 130

public val DBPROP_I_ROWSET_NEW_ROW_AFTER: Dbpropenum25Deprecated = 152

public val DBPROP_I_ROWSET_NEXT_ROWSET: Dbpropenum25Deprecated = 153

public val DBPROP_I_ROWSET_REFRESH: Dbpropenum20 = 249

public val DBPROP_I_ROWSET_RESYNCH: Dbpropenum = 132

public val DBPROP_I_ROWSET_SCROLL: Dbpropenum = 133

public val DBPROP_I_ROWSET_UPDATE: Dbpropenum = 134

public val DBPROP_I_ROWSET_VIEW: Dbpropenum15 = 212

public val DBPROP_I_ROWSET_WATCH_ALL: Dbpropenum25Deprecated = 155

public val DBPROP_I_ROWSET_WATCH_NOTIFY: Dbpropenum25Deprecated = 156

public val DBPROP_I_ROWSET_WATCH_REGION: Dbpropenum25Deprecated = 157

public val DBPROP_I_ROWSET_WITH_PARAMETERS: Dbpropenum25Deprecated = 158

public val DBPROP_I_SCOPED_OPERATIONS: Dbpropenum21 = 267

public val DBPROP_I_SEQUENTIAL_STREAM: Dbpropenum = 137

public val DBPROP_I_STORAGE: Dbpropenum = 138

public val DBPROP_I_STREAM: Dbpropenum = 139

public val DBPROP_I_SUPPORT_ERROR_INFO: Dbpropenum = 135

public val DBPROP_I_VIEW_CHAPTER: Dbpropenum15 = 213

public val DBPROP_I_VIEW_FILTER: Dbpropenum15 = 214

public val DBPROP_I_VIEW_ROWSET: Dbpropenum15 = 215

public val DBPROP_I_VIEW_SORT: Dbpropenum15 = 216

public val DBPROP_LITERALBOOKMARKS: Dbpropenum = 67

public val DBPROP_LITERALIDENTITY: Dbpropenum = 68

public val DBPROP_LOCKMODE: Dbpropenum20 = 236

public val DBPROP_MAINTAINPROPS: UInt = 5u

public val DBPROP_MARSHALLABLE: Dbpropenumdeprecated = 197

public val DBPROP_MAXINDEXSIZE: Dbpropenum = 70

public val DBPROP_MAXOPENCHAPTERS: Dbpropenum15 = 199

public val DBPROP_MAXOPENROWS: Dbpropenum = 71

public val DBPROP_MAXORSINFILTER: Dbpropenum15 = 205

public val DBPROP_MAXPENDINGROWS: Dbpropenum = 72

public val DBPROP_MAXROWS: Dbpropenum = 73

public val DBPROP_MAXROWSIZE: Dbpropenum = 74

public val DBPROP_MAXROWSIZEINCLUDESBLOB: Dbpropenum = 75

public val DBPROP_MAXSORTCOLUMNS: Dbpropenum15 = 206

public val DBPROP_MAXTABLESINSELECT: Dbpropenum = 76

public val DBPROP_MAYWRITECOLUMN: Dbpropenum = 77

public val DBPROP_MEMORYUSAGE: Dbpropenum = 78

public val DBPROP_MSDAORA8_DETERMINEKEYCOLUMNS: UInt = 2u

public val DBPROP_MSDAORA_DETERMINEKEYCOLUMNS: UInt = 1u

public val DBPROP_MSDS_DBINIT_DATAPROVIDER: Msdsdbinitpropenum = 2

public val DBPROP_MSDS_SESS_UNIQUENAMES: Msdssessionpropenum = 2

public val DBPROP_MULTIPLECONNECTIONS: Dbpropenum20 = 237

public val DBPROP_MULTIPLEPARAMSETS: Dbpropenum = 191

public val DBPROP_MULTIPLERESULTS: Dbpropenum = 196

public val DBPROP_MULTIPLESTORAGEOBJECTS: Dbpropenum = 80

public val DBPROP_MULTITABLEUPDATE: Dbpropenum = 81

public val DBPROP_NOTIFICATIONGRANULARITY: Dbpropenum = 198

public val DBPROP_NOTIFICATIONPHASES: Dbpropenum = 82

public val DBPROP_NOTIFYCOLUMNSET: Dbpropenum = 171

public val DBPROP_NOTIFYROWDELETE: Dbpropenum = 173

public val DBPROP_NOTIFYROWFIRSTCHANGE: Dbpropenum = 174

public val DBPROP_NOTIFYROWINSERT: Dbpropenum = 175

public val DBPROP_NOTIFYROWRESYNCH: Dbpropenum = 177

public val DBPROP_NOTIFYROWSETCHANGED: Dbpropenum = 211

public val DBPROP_NOTIFYROWSETFETCHPOSITIONCHANGE: Dbpropenum = 179

public val DBPROP_NOTIFYROWSETRELEASE: Dbpropenum = 178

public val DBPROP_NOTIFYROWUNDOCHANGE: Dbpropenum = 180

public val DBPROP_NOTIFYROWUNDODELETE: Dbpropenum = 181

public val DBPROP_NOTIFYROWUNDOINSERT: Dbpropenum = 182

public val DBPROP_NOTIFYROWUPDATE: Dbpropenum = 183

public val DBPROP_NULLCOLLATION: Dbpropenum = 83

public val DBPROP_OLEOBJECTS: Dbpropenum = 84

public val DBPROP_OPENROWSETSUPPORT: Dbpropenum21 = 280

public val DBPROP_ORDERBYCOLUMNSINSELECT: Dbpropenum = 85

public val DBPROP_ORDEREDBOOKMARKS: Dbpropenum = 86

public val DBPROP_OTHERINSERT: Dbpropenum = 87

public val DBPROP_OTHERUPDATEDELETE: Dbpropenum = 88

public val DBPROP_OUTPUTENCODING: Dbpropenum26 = 287

public val DBPROP_OUTPUTPARAMETERAVAILABILITY: Dbpropenum = 184

public val DBPROP_OUTPUTSTREAM: Dbpropenum26 = 286

public val DBPROP_OWNINSERT: Dbpropenum = 89

public val DBPROP_OWNUPDATEDELETE: Dbpropenum = 90

public val DBPROP_PERSISTENTIDTYPE: Dbpropenum = 185

public val DBPROP_PREPAREABORTBEHAVIOR: Dbpropenum = 91

public val DBPROP_PREPARECOMMITBEHAVIOR: Dbpropenum = 92

public val DBPROP_PROCEDURETERM: Dbpropenum = 93

public val DBPROP_PROVIDERFRIENDLYNAME: Dbpropenum20 = 235

public val DBPROP_PROVIDERMEMORY: Dbpropenum20 = 259

public val DBPROP_PROVIDERNAME: Dbpropenum = 96

public val DBPROP_PROVIDEROLEDBVER: Dbpropenum = 97

public val DBPROP_PROVIDERVER: Dbpropenum = 98

public val DBPROP_PERSIST_FORMAT: UInt = 2u

public val DBPROP_PERSIST_SCHEMA: UInt = 3u

public val DBPROP_QUICKRESTART: Dbpropenum = 99

public val DBPROP_QUOTEDIDENTIFIERCASE: Dbpropenum = 100

public val DBPROP_REENTRANTEVENTS: Dbpropenum = 101

public val DBPROP_REMOVEDELETED: Dbpropenum = 102

public val DBPROP_REPORTMULTIPLECHANGES: Dbpropenum = 103

public val DBPROP_RESETDATASOURCE: Dbpropenum20 = 247

public val DBPROP_RETURNPENDINGINSERTS: Dbpropenum = 189

public val DBPROP_ROWRESTRICT: Dbpropenum = 104

public val DBPROP_ROWSETCONVERSIONSONCOMMAND: Dbpropenum = 192

public val DBPROP_ROWSET_ASYNCH: Dbpropenum15 = 201

public val DBPROP_ROWTHREADMODEL: Dbpropenum = 105

public val DBPROP_ROW_BULKOPS: Dbpropenum20 = 234

public val DBPROP_SCHEMATERM: Dbpropenum = 106

public val DBPROP_SCHEMAUSAGE: Dbpropenum = 107

public val DBPROP_SERVERCURSOR: Dbpropenum = 108

public val DBPROP_SERVERDATAONINSERT: Dbpropenum20 = 239

public val DBPROP_SERVERNAME: Dbpropenum20 = 250

public val DBPROP_SESS_AUTOCOMMITISOLEVELS: Dbpropenum = 190

public val DBPROP_SKIPROWCOUNTRESULTS: Dbpropenum26 = 291

public val DBPROP_SORTONINDEX: Dbpropenum15 = 207

public val DBPROP_SQLSUPPORT: Dbpropenum = 109

public val DBPROP_STORAGEFLAGS: Dbpropenum20 = 240

public val DBPROP_STRONGIDENTITY: Dbpropenum = 119

public val DBPROP_STRUCTUREDSTORAGE: Dbpropenum = 111

public val DBPROP_SUBQUERIES: Dbpropenum = 112

public val DBPROP_SUPPORTEDTXNDDL: Dbpropenum = 161

public val DBPROP_SUPPORTEDTXNISOLEVELS: Dbpropenum = 113

public val DBPROP_SUPPORTEDTXNISORETAIN: Dbpropenum = 114

public val DBPROP_TABLESTATISTICS: Dbpropenum26 = 288

public val DBPROP_TABLETERM: Dbpropenum = 115

public val DBPROP_TBL_TEMPTABLE: Dbpropenum = 140

public val DBPROP_TRANSACTEDOBJECT: Dbpropenum = 116

public val DBPROP_TRUSTEE_AUTHENTICATION: Dbpropenum21 = 242

public val DBPROP_TRUSTEE_NEWAUTHENTICATION: Dbpropenum21 = 243

public val DBPROP_TRUSTEE_USERNAME: Dbpropenum21 = 241

public val DBPROP_UNIQUEROWS: Dbpropenum20 = 238

public val DBPROP_UPDATABILITY: Dbpropenum = 117

public val DBPROP_USERNAME: Dbpropenum = 118

public val DBPROP_UNICODE: UInt = 6u

public val DBQUERYGUID: Guid = Guid.fromU128(U128(0x49691c907e17101auL, 0xa91c08002b2ecda9uL))

public val DBRANGE_EXCLUDENULLS: Dbrangeenum = 4

public val DBRANGE_EXCLUSIVEEND: Dbrangeenum = 2

public val DBRANGE_EXCLUSIVESTART: Dbrangeenum = 1

public val DBRANGE_INCLUSIVEEND: Dbrangeenum = 0

public val DBRANGE_INCLUSIVESTART: Dbrangeenum = 0

public val DBRANGE_MATCH: Dbrangeenum = 16

public val DBRANGE_MATCH_N_MASK: Dbrangeenum20 = 255

public val DBRANGE_MATCH_N_SHIFT: Dbrangeenum20 = 24

public val DBRANGE_PREFIX: Dbrangeenum = 8

public val DBREASON_COLUMN_RECALCULATED: Dbreasonenum = 3

public val DBREASON_COLUMN_SET: Dbreasonenum = 2

public val DBREASON_ROWPOSITION_CHANGED: Dbreasonenum15 = 15

public val DBREASON_ROWPOSITION_CHAPTERCHANGED: Dbreasonenum15 = 16

public val DBREASON_ROWPOSITION_CLEARED: Dbreasonenum15 = 17

public val DBREASON_ROWSET_CHANGED: Dbreasonenum = 14

public val DBREASON_ROWSET_FETCHPOSITIONCHANGE: Dbreasonenum = 0

public val DBREASON_ROWSET_POPULATIONCOMPLETE: Dbreasonenum25 = 20

public val DBREASON_ROWSET_POPULATIONSTOPPED: Dbreasonenum25 = 21

public val DBREASON_ROWSET_RELEASE: Dbreasonenum = 1

public val DBREASON_ROWSET_ROWSADDED: Dbreasonenum25 = 19

public val DBREASON_ROW_ACTIVATE: Dbreasonenum = 4

public val DBREASON_ROW_ASYNCHINSERT: Dbreasonenum15 = 18

public val DBREASON_ROW_DELETE: Dbreasonenum = 6

public val DBREASON_ROW_FIRSTCHANGE: Dbreasonenum = 7

public val DBREASON_ROW_INSERT: Dbreasonenum = 8

public val DBREASON_ROW_RELEASE: Dbreasonenum = 5

public val DBREASON_ROW_RESYNCH: Dbreasonenum = 9

public val DBREASON_ROW_UNDOCHANGE: Dbreasonenum = 10

public val DBREASON_ROW_UNDODELETE: Dbreasonenum = 12

public val DBREASON_ROW_UNDOINSERT: Dbreasonenum = 11

public val DBREASON_ROW_UPDATE: Dbreasonenum = 13

public val DBRESOURCE_CPU: Dbresourcekindenum = 2

public val DBRESOURCE_DISK: Dbresourcekindenum = 4

public val DBRESOURCE_INVALID: Dbresourcekindenum = 0

public val DBRESOURCE_MEMORY: Dbresourcekindenum = 3

public val DBRESOURCE_NETWORK: Dbresourcekindenum = 5

public val DBRESOURCE_OTHER: Dbresourcekindenum = 8

public val DBRESOURCE_RESPONSE: Dbresourcekindenum = 6

public val DBRESOURCE_ROWS: Dbresourcekindenum = 7

public val DBRESOURCE_TOTAL: Dbresourcekindenum = 1

public val DBRESULTFLAG_DEFAULT: Dbresultflagenum = 0

public val DBRESULTFLAG_ROW: Dbresultflagenum = 2

public val DBRESULTFLAG_ROWSET: Dbresultflagenum = 1

public val DBROWCHANGEKIND_COUNT: Dbrowchangekindenum = 3

public val DBROWCHANGEKIND_DELETE: Dbrowchangekindenum = 1

public val DBROWCHANGEKIND_INSERT: Dbrowchangekindenum = 0

public val DBROWCHANGEKIND_UPDATE: Dbrowchangekindenum = 2

public val DBROWSTATUS_E_CANCELED: Dbrowstatusenum = 4

public val DBROWSTATUS_E_CANTRELEASE: Dbrowstatusenum = 6

public val DBROWSTATUS_E_CONCURRENCYVIOLATION: Dbrowstatusenum = 7

public val DBROWSTATUS_E_DELETED: Dbrowstatusenum = 8

public val DBROWSTATUS_E_FAIL: Dbrowstatusenum = 19

public val DBROWSTATUS_E_INTEGRITYVIOLATION: Dbrowstatusenum = 11

public val DBROWSTATUS_E_INVALID: Dbrowstatusenum = 12

public val DBROWSTATUS_E_LIMITREACHED: Dbrowstatusenum = 17

public val DBROWSTATUS_E_MAXPENDCHANGESEXCEEDED: Dbrowstatusenum = 13

public val DBROWSTATUS_E_NEWLYINSERTED: Dbrowstatusenum = 10

public val DBROWSTATUS_E_OBJECTOPEN: Dbrowstatusenum = 14

public val DBROWSTATUS_E_OUTOFMEMORY: Dbrowstatusenum = 15

public val DBROWSTATUS_E_PENDINGINSERT: Dbrowstatusenum = 9

public val DBROWSTATUS_E_PERMISSIONDENIED: Dbrowstatusenum = 16

public val DBROWSTATUS_E_SCHEMAVIOLATION: Dbrowstatusenum = 18

public val DBROWSTATUS_S_MULTIPLECHANGES: Dbrowstatusenum = 2

public val DBROWSTATUS_S_NOCHANGE: Dbrowstatusenum20 = 20

public val DBROWSTATUS_S_OK: Dbrowstatusenum = 0

public val DBROWSTATUS_S_PENDINGCHANGES: Dbrowstatusenum = 3

public val DBSCHEMA_LINKEDSERVERS: Guid = Guid.fromU128(U128(0x9093caf42eac11d1uL, 0x980900c04fc2ad98uL))

public val DBSEEK_AFTER: Dbseekenum = 8

public val DBSEEK_AFTEREQ: Dbseekenum = 4

public val DBSEEK_BEFORE: Dbseekenum = 32

public val DBSEEK_BEFOREEQ: Dbseekenum = 16

public val DBSEEK_FIRSTEQ: Dbseekenum = 1

public val DBSEEK_INVALID: Dbseekenum = 0

public val DBSEEK_LASTEQ: Dbseekenum = 2

public val DBSELFGUID: Guid = Guid.fromU128(U128(0xc8b522315cf311ceuL, 0xade500aa0044773duL))

public val DBSORT_ASCENDING: Dbsortenum = 0

public val DBSORT_DESCENDING: Dbsortenum = 1

public val DBSOURCETYPE_BINDER: Dbsourcetypeenum25 = 4

public val DBSOURCETYPE_DATASOURCE: Dbsourcetypeenum = 1

public val DBSOURCETYPE_DATASOURCE_MDP: Dbsourcetypeenum20 = 3

public val DBSOURCETYPE_DATASOURCE_TDP: Dbsourcetypeenum20 = 1

public val DBSOURCETYPE_ENUMERATOR: Dbsourcetypeenum = 2

public val DBSTATUS_E_BADACCESSOR: Dbstatusenum = 1

public val DBSTATUS_E_BADSTATUS: Dbstatusenum = 12

public val DBSTATUS_E_CANCELED: Dbstatusenum25 = 27

public val DBSTATUS_E_CANNOTCOMPLETE: Dbstatusenum21 = 20

public val DBSTATUS_E_CANTCONVERTVALUE: Dbstatusenum = 2

public val DBSTATUS_E_CANTCREATE: Dbstatusenum = 7

public val DBSTATUS_E_DATAOVERFLOW: Dbstatusenum = 6

public val DBSTATUS_E_DOESNOTEXIST: Dbstatusenum21 = 16

public val DBSTATUS_E_INTEGRITYVIOLATION: Dbstatusenum = 10

public val DBSTATUS_E_INVALIDURL: Dbstatusenum21 = 17

public val DBSTATUS_E_NOTCOLLECTION: Dbstatusenum25 = 28

public val DBSTATUS_E_OUTOFSPACE: Dbstatusenum21 = 22

public val DBSTATUS_E_PERMISSIONDENIED: Dbstatusenum = 9

public val DBSTATUS_E_READONLY: Dbstatusenum21 = 24

public val DBSTATUS_E_RESOURCEEXISTS: Dbstatusenum21 = 19

public val DBSTATUS_E_RESOURCELOCKED: Dbstatusenum21 = 18

public val DBSTATUS_E_RESOURCEOUTOFSCOPE: Dbstatusenum21 = 25

public val DBSTATUS_E_SCHEMAVIOLATION: Dbstatusenum = 11

public val DBSTATUS_E_SIGNMISMATCH: Dbstatusenum = 5

public val DBSTATUS_E_UNAVAILABLE: Dbstatusenum = 8

public val DBSTATUS_E_VOLUMENOTFOUND: Dbstatusenum21 = 21

public val DBSTATUS_S_ALREADYEXISTS: Dbstatusenum21 = 26

public val DBSTATUS_S_CANNOTDELETESOURCE: Dbstatusenum21 = 23

public val DBSTATUS_S_DEFAULT: Dbstatusenum = 13

public val DBSTATUS_S_IGNORE: Dbstatusenum20 = 15

public val DBSTATUS_S_ISNULL: Dbstatusenum = 3

public val DBSTATUS_S_OK: Dbstatusenum = 0

public val DBSTATUS_S_ROWSETCOLUMN: Dbstatusenum26 = 29

public val DBSTATUS_S_TRUNCATED: Dbstatusenum = 4

public val DBSTAT_COLUMN_CARDINALITY: Dbtablestatisticstype26 = 2

public val DBSTAT_HISTOGRAM: Dbtablestatisticstype26 = 1

public val DBSTAT_TUPLE_CARDINALITY: Dbtablestatisticstype26 = 4

public val DBTYPE_ARRAY: Dbtypeenum = 8192

public val DBTYPE_BOOL: Dbtypeenum = 11

public val DBTYPE_BSTR: Dbtypeenum = 8

public val DBTYPE_BYREF: Dbtypeenum = 16384

public val DBTYPE_BYTES: Dbtypeenum = 128

public val DBTYPE_CY: Dbtypeenum = 6

public val DBTYPE_DATE: Dbtypeenum = 7

public val DBTYPE_DBDATE: Dbtypeenum = 133

public val DBTYPE_DBTIME: Dbtypeenum = 134

public val DBTYPE_DBTIMESTAMP: Dbtypeenum = 135

public val DBTYPE_DECIMAL: Dbtypeenum = 14

public val DBTYPE_EMPTY: Dbtypeenum = 0

public val DBTYPE_ERROR: Dbtypeenum = 10

public val DBTYPE_FILETIME: Dbtypeenum20 = 64

public val DBTYPE_GUID: Dbtypeenum = 72

public val DBTYPE_HCHAPTER: Dbtypeenum15 = 136

public val DBTYPE_I1: Dbtypeenum = 16

public val DBTYPE_I2: Dbtypeenum = 2

public val DBTYPE_I4: Dbtypeenum = 3

public val DBTYPE_I8: Dbtypeenum = 20

public val DBTYPE_IDISPATCH: Dbtypeenum = 9

public val DBTYPE_IUNKNOWN: Dbtypeenum = 13

public val DBTYPE_NULL: Dbtypeenum = 1

public val DBTYPE_NUMERIC: Dbtypeenum = 131

public val DBTYPE_PROPVARIANT: Dbtypeenum20 = 138

public val DBTYPE_R4: Dbtypeenum = 4

public val DBTYPE_R8: Dbtypeenum = 5

public val DBTYPE_RESERVED: Dbtypeenum = 32768

public val DBTYPE_SQLVARIANT: UInt = 144u

public val DBTYPE_STR: Dbtypeenum = 129

public val DBTYPE_UDT: Dbtypeenum = 132

public val DBTYPE_UI1: Dbtypeenum = 17

public val DBTYPE_UI2: Dbtypeenum = 18

public val DBTYPE_UI4: Dbtypeenum = 19

public val DBTYPE_UI8: Dbtypeenum = 21

public val DBTYPE_VARIANT: Dbtypeenum = 12

public val DBTYPE_VARNUMERIC: Dbtypeenum20 = 139

public val DBTYPE_VECTOR: Dbtypeenum = 4096

public val DBTYPE_WSTR: Dbtypeenum = 130

public val DBUNIT_BYTE: Dbcostunitenum = 512

public val DBUNIT_GIGA_BYTE: Dbcostunitenum = 4096

public val DBUNIT_HOUR: Dbcostunitenum = 256

public val DBUNIT_INVALID: Dbcostunitenum = 0

public val DBUNIT_KILO_BYTE: Dbcostunitenum = 1024

public val DBUNIT_MAXIMUM: Dbcostunitenum = 4

public val DBUNIT_MEGA_BYTE: Dbcostunitenum = 2048

public val DBUNIT_MICRO_SECOND: Dbcostunitenum = 16

public val DBUNIT_MILLI_SECOND: Dbcostunitenum = 32

public val DBUNIT_MINIMUM: Dbcostunitenum = 8

public val DBUNIT_MINUTE: Dbcostunitenum = 128

public val DBUNIT_NUM_LOCKS: Dbcostunitenum = 16384

public val DBUNIT_NUM_MSGS: Dbcostunitenum = 8192

public val DBUNIT_NUM_ROWS: Dbcostunitenum = 32768

public val DBUNIT_OTHER: Dbcostunitenum = 65536

public val DBUNIT_PERCENT: Dbcostunitenum = 2

public val DBUNIT_SECOND: Dbcostunitenum = 64

public val DBUNIT_WEIGHT: Dbcostunitenum = 1

public val DBUPDELRULE_CASCADE: Dbupdelruleenum = 1

public val DBUPDELRULE_NOACTION: Dbupdelruleenum = 0

public val DBUPDELRULE_SETDEFAULT: Dbupdelruleenum = 3

public val DBUPDELRULE_SETNULL: Dbupdelruleenum = 2

public val DBWATCHMODE_ALL: Dbwatchmodeenum = 1

public val DBWATCHMODE_COUNT: Dbwatchmodeenum = 8

public val DBWATCHMODE_EXTEND: Dbwatchmodeenum = 2

public val DBWATCHMODE_MOVE: Dbwatchmodeenum = 4

public val DBWATCHNOTIFY_QUERYDONE: Dbwatchnotifyenum = 2

public val DBWATCHNOTIFY_QUERYREEXECUTED: Dbwatchnotifyenum = 3

public val DBWATCHNOTIFY_ROWSCHANGED: Dbwatchnotifyenum = 1

public val DB_ALL_EXCEPT_LIKE: UInt = 3u

public val DB_BINDFLAGS_COLLECTION: Int = 16

public val DB_BINDFLAGS_DELAYFETCHCOLUMNS: Int = 1

public val DB_BINDFLAGS_DELAYFETCHSTREAM: Int = 2

public val DB_BINDFLAGS_ISSTRUCTUREDDOCUMENT: Int = 128

public val DB_BINDFLAGS_OPENIFEXISTS: Int = 32

public val DB_BINDFLAGS_OUTPUT: Int = 8

public val DB_BINDFLAGS_OVERWRITE: Int = 64

public val DB_BINDFLAGS_RECURSIVE: Int = 4

public val DB_COLLATION_ASC: UInt = 1u

public val DB_COLLATION_DESC: UInt = 2u

public val DB_COUNTUNAVAILABLE: Int = -1

public val DB_E_ABORTLIMITREACHED: Hresult = 0x80040E31u.toInt()

public val DB_E_ALREADYINITIALIZED: Hresult = 0x80040E52u.toInt()

public val DB_E_ALTERRESTRICTED: Hresult = 0x80040E9Du.toInt()

public val DB_E_ASYNCNOTSUPPORTED: Hresult = 0x80040E95u.toInt()

public val DB_E_BADACCESSORFLAGS: Hresult = 0x80040E46u.toInt()

public val DB_E_BADACCESSORHANDLE: Hresult = 0x80040E00u.toInt()

public val DB_E_BADACCESSORTYPE: Hresult = 0x80040E4Bu.toInt()

public val DB_E_BADBINDINFO: Hresult = 0x80040E08u.toInt()

public val DB_E_BADBOOKMARK: Hresult = 0x80040E0Eu.toInt()

public val DB_E_BADCHAPTER: Hresult = 0x80040E06u.toInt()

public val DB_E_BADCOLUMNID: Hresult = 0x80040E11u.toInt()

public val DB_E_BADCOMMANDFLAGS: Hresult = 0x80040E8Cu.toInt()

public val DB_E_BADCOMMANDID: Hresult = 0x80040E76u.toInt()

public val DB_E_BADCOMPAREOP: Hresult = 0x80040E27u.toInt()

public val DB_E_BADCONSTRAINTFORM: Hresult = 0x80040E78u.toInt()

public val DB_E_BADCONSTRAINTID: Hresult = 0x80040E8Bu.toInt()

public val DB_E_BADCONSTRAINTTYPE: Hresult = 0x80040E77u.toInt()

public val DB_E_BADCONVERTFLAG: Hresult = 0x80040E5Cu.toInt()

public val DB_E_BADCOPY: Hresult = 0x80040E39u.toInt()

public val DB_E_BADDEFERRABILITY: Hresult = 0x80040E79u.toInt()

public val DB_E_BADDYNAMICERRORID: Hresult = 0x80040E5Au.toInt()

public val DB_E_BADHRESULT: Hresult = 0x80040E58u.toInt()

public val DB_E_BADID: Int = -2147217860

public val DB_E_BADINDEXID: Hresult = 0x80040E72u.toInt()

public val DB_E_BADINITSTRING: Hresult = 0x80040E73u.toInt()

public val DB_E_BADLOCKMODE: Hresult = 0x80040E0Fu.toInt()

public val DB_E_BADLOOKUPID: Hresult = 0x80040E59u.toInt()

public val DB_E_BADMATCHTYPE: Hresult = 0x80040E80u.toInt()

public val DB_E_BADORDINAL: Hresult = 0x80040E55u.toInt()

public val DB_E_BADPARAMETERNAME: Hresult = 0x80040E5Du.toInt()

public val DB_E_BADPRECISION: Hresult = 0x80040E3Au.toInt()

public val DB_E_BADPROPERTYVALUE: Hresult = 0x80040E44u.toInt()

public val DB_E_BADRATIO: Hresult = 0x80040E12u.toInt()

public val DB_E_BADRECORDNUM: Hresult = 0x80040E42u.toInt()

public val DB_E_BADREGIONHANDLE: Hresult = 0x80040E2Au.toInt()

public val DB_E_BADROWHANDLE: Hresult = 0x80040E04u.toInt()

public val DB_E_BADSCALE: Hresult = 0x80040E3Bu.toInt()

public val DB_E_BADSOURCEHANDLE: Hresult = 0x80040E50u.toInt()

public val DB_E_BADSTARTPOSITION: Hresult = 0x80040E1Eu.toInt()

public val DB_E_BADSTATUSVALUE: Hresult = 0x80040E28u.toInt()

public val DB_E_BADSTORAGEFLAG: Hresult = 0x80040E26u.toInt()

public val DB_E_BADSTORAGEFLAGS: Hresult = 0x80040E47u.toInt()

public val DB_E_BADTABLEID: Hresult = 0x80040E3Cu.toInt()

public val DB_E_BADTYPE: Hresult = 0x80040E3Du.toInt()

public val DB_E_BADTYPENAME: Hresult = 0x80040E30u.toInt()

public val DB_E_BADUPDATEDELETERULE: Hresult = 0x80040E8Au.toInt()

public val DB_E_BADVALUES: Hresult = 0x80040E13u.toInt()

public val DB_E_BOGUS: Hresult = 0x80040EFFu.toInt()

public val DB_E_BOOKMARKSKIPPED: Hresult = 0x80040E43u.toInt()

public val DB_E_BYREFACCESSORNOTSUPPORTED: Hresult = 0x80040E48u.toInt()

public val DB_E_CANCELED: Hresult = 0x80040E4Eu.toInt()

public val DB_E_CANNOTCONNECT: Hresult = 0x80040E96u.toInt()

public val DB_E_CANNOTFREE: Hresult = 0x80040E1Au.toInt()

public val DB_E_CANNOTRESTART: Hresult = 0x80040E18u.toInt()

public val DB_E_CANTCANCEL: Hresult = 0x80040E15u.toInt()

public val DB_E_CANTCONVERTVALUE: Hresult = 0x80040E07u.toInt()

public val DB_E_CANTFETCHBACKWARDS: Hresult = 0x80040E24u.toInt()

public val DB_E_CANTFILTER: Hresult = 0x80040E5Fu.toInt()

public val DB_E_CANTORDER: Hresult = 0x80040E60u.toInt()

public val DB_E_CANTSCROLLBACKWARDS: Hresult = 0x80040E29u.toInt()

public val DB_E_CANTTRANSLATE: Hresult = 0x80040E33u.toInt()

public val DB_E_CHAPTERNOTRELEASED: Hresult = 0x80040E4Fu.toInt()

public val DB_E_COLUMNUNAVAILABLE: Hresult = 0x80040EA0u.toInt()

public val DB_E_COMMANDNOTPERSISTED: Hresult = 0x80040E67u.toInt()

public val DB_E_CONCURRENCYVIOLATION: Hresult = 0x80040E38u.toInt()

public val DB_E_COSTLIMIT: Hresult = 0x80040E0Du.toInt()

public val DB_E_DATAOVERFLOW: Hresult = 0x80040E57u.toInt()

public val DB_E_DELETEDROW: Hresult = 0x80040E23u.toInt()

public val DB_E_DIALECTNOTSUPPORTED: Hresult = 0x80040E16u.toInt()

public val DB_E_DROPRESTRICTED: Hresult = 0x80040E90u.toInt()

public val DB_E_DUPLICATECOLUMNID: Hresult = 0x80040E3Eu.toInt()

public val DB_E_DUPLICATECONSTRAINTID: Hresult = 0x80040E99u.toInt()

public val DB_E_DUPLICATEDATASOURCE: Hresult = 0x80040E17u.toInt()

public val DB_E_DUPLICATEID: Hresult = 0x80040E68u.toInt()

public val DB_E_DUPLICATEINDEXID: Hresult = 0x80040E34u.toInt()

public val DB_E_DUPLICATETABLEID: Hresult = 0x80040E3Fu.toInt()

public val DB_E_ERRORSINCOMMAND: Hresult = 0x80040E14u.toInt()

public val DB_E_ERRORSOCCURRED: Hresult = 0x80040E21u.toInt()

public val DB_E_GOALREJECTED: Hresult = 0x80040E1Cu.toInt()

public val DB_E_INDEXINUSE: Hresult = 0x80040E36u.toInt()

public val DB_E_INTEGRITYVIOLATION: Hresult = 0x80040E2Fu.toInt()

public val DB_E_INVALID: Hresult = 0x80040E45u.toInt()

public val DB_E_INVALIDTRANSITION: Hresult = 0x80040E2Cu.toInt()

public val DB_E_LIMITREJECTED: Hresult = 0x80040E0Bu.toInt()

public val DB_E_MAXPENDCHANGESEXCEEDED: Hresult = 0x80040E54u.toInt()

public val DB_E_MISMATCHEDPROVIDER: Hresult = 0x80040E75u.toInt()

public val DB_E_MULTIPLESTATEMENTS: Hresult = 0x80040E2Eu.toInt()

public val DB_E_MULTIPLESTORAGE: Hresult = 0x80040E5Eu.toInt()

public val DB_E_NEWLYINSERTED: Hresult = 0x80040E1Bu.toInt()

public val DB_E_NOAGGREGATION: Hresult = 0x80040E22u.toInt()

public val DB_E_NOCOLUMN: Hresult = 0x80040E65u.toInt()

public val DB_E_NOCOMMAND: Hresult = 0x80040E0Cu.toInt()

public val DB_E_NOCONSTRAINT: Hresult = 0x80040E9Fu.toInt()

public val DB_E_NOINDEX: Hresult = 0x80040E35u.toInt()

public val DB_E_NOLOCALE: Hresult = 0x80040E41u.toInt()

public val DB_E_NONCONTIGUOUSRANGE: Hresult = 0x80040E2Bu.toInt()

public val DB_E_NOPROVIDERSREGISTERED: Hresult = 0x80040E74u.toInt()

public val DB_E_NOQUERY: Hresult = 0x80040E1Fu.toInt()

public val DB_E_NOSOURCEOBJECT: Hresult = 0x80040E91u.toInt()

public val DB_E_NOSTATISTIC: Hresult = 0x80040E9Cu.toInt()

public val DB_E_NOTABLE: Hresult = 0x80040E37u.toInt()

public val DB_E_NOTAREFERENCECOLUMN: Hresult = 0x80040E0Au.toInt()

public val DB_E_NOTASUBREGION: Hresult = 0x80040E2Du.toInt()

public val DB_E_NOTCOLLECTION: Hresult = 0x80040E93u.toInt()

public val DB_E_NOTFOUND: Hresult = 0x80040E19u.toInt()

public val DB_E_NOTPREPARED: Hresult = 0x80040E4Au.toInt()

public val DB_E_NOTREENTRANT: Hresult = 0x80040E20u.toInt()

public val DB_E_NOTSUPPORTED: Hresult = 0x80040E53u.toInt()

public val DB_E_NULLACCESSORNOTSUPPORTED: Hresult = 0x80040E49u.toInt()

public val DB_E_OBJECTCREATIONLIMITREACHED: Hresult = 0x80040E69u.toInt()

public val DB_E_OBJECTMISMATCH: Hresult = 0x80040E8Du.toInt()

public val DB_E_OBJECTOPEN: Hresult = 0x80040E05u.toInt()

public val DB_E_OUTOFSPACE: Hresult = 0x80040E9Au.toInt()

public val DB_E_PARAMNOTOPTIONAL: Hresult = 0x80040E10u.toInt()

public val DB_E_PARAMUNAVAILABLE: Hresult = 0x80040E51u.toInt()

public val DB_E_PENDINGCHANGES: Hresult = 0x80040E56u.toInt()

public val DB_E_PENDINGINSERT: Hresult = 0x80040E5Bu.toInt()

public val DB_E_READONLY: Hresult = 0x80040E94u.toInt()

public val DB_E_READONLYACCESSOR: Hresult = 0x80040E02u.toInt()

public val DB_E_RESOURCEEXISTS: Hresult = 0x80040E98u.toInt()

public val DB_E_RESOURCELOCKED: Hresult = 0x80040E92u.toInt()

public val DB_E_RESOURCENOTSUPPORTED: Hresult = 0x80040E9Eu.toInt()

public val DB_E_RESOURCEOUTOFSCOPE: Hresult = 0x80040E8Eu.toInt()

public val DB_E_ROWLIMITEXCEEDED: Hresult = 0x80040E01u.toInt()

public val DB_E_ROWSETINCOMMAND: Hresult = 0x80040E32u.toInt()

public val DB_E_ROWSNOTRELEASED: Hresult = 0x80040E25u.toInt()

public val DB_E_SCHEMAVIOLATION: Hresult = 0x80040E03u.toInt()

public val DB_E_TABLEINUSE: Hresult = 0x80040E40u.toInt()

public val DB_E_TIMEOUT: Hresult = 0x80040E97u.toInt()

public val DB_E_UNSUPPORTEDCONVERSION: Hresult = 0x80040E1Du.toInt()

public val DB_E_WRITEONLYACCESSOR: Hresult = 0x80040E4Cu.toInt()

public val DB_IMP_LEVEL_ANONYMOUS: UInt = 0u

public val DB_IMP_LEVEL_DELEGATE: UInt = 3u

public val DB_IMP_LEVEL_IDENTIFY: UInt = 1u

public val DB_IMP_LEVEL_IMPERSONATE: UInt = 2u

public val DB_IN: UInt = 1u

public val DB_INVALID_HACCESSOR: UInt = 0u

public val DB_INVALID_HCHAPTER: UInt = 0u

public val DB_LIKE_ONLY: UInt = 2u

public val DB_LOCAL_EXCLUSIVE: UInt = 3u

public val DB_LOCAL_SHARED: UInt = 2u

public val DB_MODE_READ: UInt = 1u

public val DB_MODE_READWRITE: UInt = 3u

public val DB_MODE_SHARE_DENY_NONE: UInt = 16u

public val DB_MODE_SHARE_DENY_READ: UInt = 4u

public val DB_MODE_SHARE_DENY_WRITE: UInt = 8u

public val DB_MODE_SHARE_EXCLUSIVE: UInt = 12u

public val DB_MODE_WRITE: UInt = 2u

public val DB_NULLGUID: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))

public val DB_NULL_HACCESSOR: UInt = 0u

public val DB_NULL_HCHAPTER: UInt = 0u

public val DB_NULL_HROW: UInt = 0u

public val DB_OUT: UInt = 2u

public val DB_PROT_LEVEL_CALL: UInt = 2u

public val DB_PROT_LEVEL_CONNECT: UInt = 1u

public val DB_PROT_LEVEL_NONE: UInt = 0u

public val DB_PROT_LEVEL_PKT: UInt = 3u

public val DB_PROT_LEVEL_PKT_INTEGRITY: UInt = 4u

public val DB_PROT_LEVEL_PKT_PRIVACY: UInt = 5u

public val DB_PT_FUNCTION: UInt = 3u

public val DB_PT_PROCEDURE: UInt = 2u

public val DB_PT_UNKNOWN: UInt = 1u

public val DB_REMOTE: UInt = 1u

public val DB_SEARCHABLE: UInt = 4u

public val DB_SEC_E_AUTH_FAILED: Hresult = 0x80040E4Du.toInt()

public val DB_SEC_E_PERMISSIONDENIED: Hresult = 0x80040E09u.toInt()

public val DB_SEC_E_SAFEMODE_DENIED: Hresult = 0x80040E9Bu.toInt()

public val DB_S_ASYNCHRONOUS: Hresult = 0x40ED0u.toInt()

public val DB_S_BADROWHANDLE: Hresult = 0x40ED3u.toInt()

public val DB_S_BOOKMARKSKIPPED: Hresult = 0x40EC3u.toInt()

public val DB_S_BUFFERFULL: Hresult = 0x40EC8u.toInt()

public val DB_S_CANTRELEASE: Hresult = 0x40ECAu.toInt()

public val DB_S_COLUMNSCHANGED: Hresult = 0x40ED1u.toInt()

public val DB_S_COLUMNTYPEMISMATCH: Hresult = 0x40EC1u.toInt()

public val DB_S_COMMANDREEXECUTED: Hresult = 0x40EC7u.toInt()

public val DB_S_DELETEDROW: Hresult = 0x40ED4u.toInt()

public val DB_S_DIALECTIGNORED: Hresult = 0x40ECDu.toInt()

public val DB_S_ENDOFROWSET: Hresult = 0x40EC6u.toInt()

public val DB_S_ERRORSOCCURRED: Hresult = 0x40EDAu.toInt()

public val DB_S_ERRORSRETURNED: Hresult = 0x40ED2u.toInt()

public val DB_S_GOALCHANGED: Hresult = 0x40ECBu.toInt()

public val DB_S_LOCKUPGRADED: Hresult = 0x40ED8u.toInt()

public val DB_S_MULTIPLECHANGES: Hresult = 0x40EDCu.toInt()

public val DB_S_NONEXTROWSET: Hresult = 0x40EC5u.toInt()

public val DB_S_NORESULT: Hresult = 0x40EC9u.toInt()

public val DB_S_NOROWSPECIFICCOLUMNS: Hresult = 0x40EDDu.toInt()

public val DB_S_NOTSINGLETON: Hresult = 0x40ED7u.toInt()

public val DB_S_PARAMUNAVAILABLE: Hresult = 0x40EDBu.toInt()

public val DB_S_PROPERTIESCHANGED: Hresult = 0x40ED9u.toInt()

public val DB_S_ROWLIMITEXCEEDED: Hresult = 0x40EC0u.toInt()

public val DB_S_STOPLIMITREACHED: Hresult = 0x40ED6u.toInt()

public val DB_S_TOOMANYCHANGES: Hresult = 0x40ED5u.toInt()

public val DB_S_TYPEINFOOVERRIDDEN: Hresult = 0x40EC2u.toInt()

public val DB_S_UNWANTEDOPERATION: Hresult = 0x40ECCu.toInt()

public val DB_S_UNWANTEDPHASE: Hresult = 0x40ECEu.toInt()

public val DB_S_UNWANTEDREASON: Hresult = 0x40ECFu.toInt()

public val DB_UNSEARCHABLE: UInt = 1u

public val DCINFOTYPE_VERSION: Dcinfotypeenum = 1

public val DELIVERY_AGENT_FLAG_NO_BROADCAST: DeliveryAgentFlags = 4

public val DELIVERY_AGENT_FLAG_NO_RESTRICTIONS: DeliveryAgentFlags = 8

public val DELIVERY_AGENT_FLAG_SILENT_DIAL: DeliveryAgentFlags = 16

public val DISPID_QUERY_ALL: UInt = 6u

public val DISPID_QUERY_HITCOUNT: UInt = 4u

public val DISPID_QUERY_LASTSEENTIME: UInt = 10u

public val DISPID_QUERY_METADATA_PROPDISPID: UInt = 6u

public val DISPID_QUERY_METADATA_PROPGUID: UInt = 5u

public val DISPID_QUERY_METADATA_PROPMODIFIABLE: UInt = 9u

public val DISPID_QUERY_METADATA_PROPNAME: UInt = 7u

public val DISPID_QUERY_METADATA_STORELEVEL: UInt = 8u

public val DISPID_QUERY_METADATA_VROOTAUTOMATIC: UInt = 3u

public val DISPID_QUERY_METADATA_VROOTMANUAL: UInt = 4u

public val DISPID_QUERY_METADATA_VROOTUSED: UInt = 2u

public val DISPID_QUERY_RANK: UInt = 3u

public val DISPID_QUERY_RANKVECTOR: UInt = 2u

public val DISPID_QUERY_REVNAME: UInt = 8u

public val DISPID_QUERY_UNFILTERED: UInt = 7u

public val DISPID_QUERY_VIRTUALPATH: UInt = 9u

public val DISPID_QUERY_WORKID: UInt = 5u

public val DS_E_ALREADYDISABLED: Int = -2147220447

public val DS_E_ALREADYENABLED: Int = -2147220454

public val DS_E_BADREQUEST: Int = -2147220475

public val DS_E_BADRESULT: Int = -2147220445

public val DS_E_BADSEQUENCE: Int = -2147220473

public val DS_E_BUFFERTOOSMALL: Int = -2147220449

public val DS_E_CANNOTREMOVECONCURRENT: Int = -2147220443

public val DS_E_CANNOTWRITEREGISTRY: Int = -2147220444

public val DS_E_CONFIGBAD: Int = -2147220470

public val DS_E_CONFIGNOTRIGHTTYPE: Int = -2147220456

public val DS_E_DATANOTPRESENT: Int = -2147220464

public val DS_E_DATASOURCENOTAVAILABLE: Int = -2147220478

public val DS_E_DATASOURCENOTDISABLED: Int = -2147220459

public val DS_E_DUPLICATEID: Int = -2147220462

public val DS_E_INDEXDIRECTORY: Int = -2147220452

public val DS_E_INVALIDCATALOGNAME: Int = -2147220457

public val DS_E_INVALIDDATASOURCE: Int = -2147220479

public val DS_E_INVALIDTAGDB: Int = -2147220458

public val DS_E_MESSAGETOOLONG: Int = -2147220472

public val DS_E_MISSINGCATALOG: Int = -2147220440

public val DS_E_NOMOREDATA: Int = -2147220480

public val DS_E_PARAMOUTOFRANGE: Int = -2147220448

public val DS_E_PROPVERSIONMISMATCH: Int = -2147220441

public val DS_E_PROTOCOLVERSION: Int = -2147220455

public val DS_E_QUERYCANCELED: Int = -2147220477

public val DS_E_QUERYHUNG: Int = -2147220446

public val DS_E_REGISTRY: Int = -2147220460

public val DS_E_SEARCHCATNAMECOLLISION: Int = -2147220442

public val DS_E_SERVERCAPACITY: Int = -2147220474

public val DS_E_SERVERERROR: Int = -2147220471

public val DS_E_SETSTATUSINPROGRESS: Int = -2147220463

public val DS_E_TOOMANYDATASOURCES: Int = -2147220461

public val DS_E_UNKNOWNPARAM: Int = -2147220450

public val DS_E_UNKNOWNREQUEST: Int = -2147220476

public val DS_E_VALUETOOLARGE: Int = -2147220451

public val DATA_LINKS: Guid = Guid.fromU128(U128(0x2206cdb219c111d1uL, 0x89e000c04fd7a829uL))

public val ERROR_FTE: UInt = 13824u

public val ERROR_FTE_CB: UInt = 51968u

public val ERROR_FTE_FD: UInt = 64768u

public val ERROR_SOURCE_CMDLINE: UInt = 5376u

public val ERROR_SOURCE_COLLATOR: UInt = 1280u

public val ERROR_SOURCE_CONNMGR: UInt = 1536u

public val ERROR_SOURCE_CONTENT_SOURCE: UInt = 13312u

public val ERROR_SOURCE_DATASOURCE: UInt = 1024u

public val ERROR_SOURCE_DAV: UInt = 8960u

public val ERROR_SOURCE_EXSTOREPH: UInt = 9984u

public val ERROR_SOURCE_FLTRDMN: UInt = 9216u

public val ERROR_SOURCE_GATHERER: UInt = 3328u

public val ERROR_SOURCE_INDEXER: UInt = 4352u

public val ERROR_SOURCE_MSS: UInt = 8448u

public val ERROR_SOURCE_NETWORKING: UInt = 768u

public val ERROR_SOURCE_NLADMIN: UInt = 6400u

public val ERROR_SOURCE_NOTESPH: UInt = 9728u

public val ERROR_SOURCE_OLEDB_BINDER: UInt = 9472u

public val ERROR_SOURCE_PEOPLE_IMPORT: UInt = 16384u

public val ERROR_SOURCE_PROTHNDLR: UInt = 4608u

public val ERROR_SOURCE_QUERY: UInt = 1792u

public val ERROR_SOURCE_REMOTE_EXSTOREPH: UInt = 13568u

public val ERROR_SOURCE_SCHEMA: UInt = 3072u

public val ERROR_SOURCE_SCRIPTPI: UInt = 8192u

public val ERROR_SOURCE_SECURITY: UInt = 5120u

public val ERROR_SOURCE_SETUP: UInt = 4864u

public val ERROR_SOURCE_SRCH_SCHEMA_CACHE: UInt = 13056u

public val ERROR_SOURCE_XML: UInt = 8704u

public val EVENT_AUDIENCECOMPUTATION_CANNOTSTART: Int = -1073738223

public val EVENT_AUTOCAT_CANT_CREATE_FILE_SHARE: Int = -1073738726

public val EVENT_AUTOCAT_PERFMON: Int = -1073738753

public val EVENT_CONFIG_ERROR: Int = -1073738821

public val EVENT_CONFIG_SYNTAX: Int = -2147482604

public val EVENT_CRAWL_SCHEDULED: Int = 1073744884

public val EVENT_DETAILED_FILTERPOOL_ADD_FAILED: Int = -1073738719

public val EVENT_DSS_NOT_ENABLED: Int = -2147476572

public val EVENT_ENUMERATE_SESSIONS_FAILED: Int = -1073738720

public val EVENT_EXCEPTION: Int = -1073740815

public val EVENT_FAILED_CREATE_GATHERER_LOG: Int = -2147480587

public val EVENT_FAILED_INITIALIZE_CRAWL: Int = -1073738765

public val EVENT_FILTERPOOL_ADD_FAILED: Int = -1073738722

public val EVENT_FILTERPOOL_DELETE_FAILED: Int = -1073738721

public val EVENT_FILTER_HOST_FORCE_TERMINATE: Int = -2147473624

public val EVENT_FILTER_HOST_NOT_INITIALIZED: Int = -1073738724

public val EVENT_FILTER_HOST_NOT_TERMINATED: Int = -1073738723

public val EVENT_GATHERER_DATASOURCE: Int = -1073738727

public val EVENT_GATHERER_PERFMON: Int = -1073738817

public val EVENT_GATHERSVC_PERFMON: Int = -1073738818

public val EVENT_GATHER_ADVISE_FAILED: Int = -1073738798

public val EVENT_GATHER_APP_INIT_FAILED: Int = -1073738766

public val EVENT_GATHER_AUTODESCENCODE_INVALID: Int = -2147480592

public val EVENT_GATHER_AUTODESCLEN_ADJUSTED: Int = -2147480603

public val EVENT_GATHER_BACKUPAPP_COMPLETE: Int = 3077

public val EVENT_GATHER_BACKUPAPP_ERROR: Int = -1073738748

public val EVENT_GATHER_CANT_CREATE_DOCID: Int = -1073738793

public val EVENT_GATHER_CANT_DELETE_DOCID: Int = -1073738792

public val EVENT_GATHER_CHECKPOINT_CORRUPT: Int = -1073738732

public val EVENT_GATHER_CHECKPOINT_FAILED: Int = -1073738736

public val EVENT_GATHER_CHECKPOINT_FILE_MISSING: Int = -1073738731

public val EVENT_GATHER_CRAWL_IN_PROGRESS: Int = -2147480609

public val EVENT_GATHER_CRAWL_NOT_STARTED: Int = -2147480625

public val EVENT_GATHER_CRAWL_SEED_ERROR: Int = -2147480624

public val EVENT_GATHER_CRAWL_SEED_FAILED: Int = -2147480612

public val EVENT_GATHER_CRAWL_SEED_FAILED_INIT: Int = -2147480611

public val EVENT_GATHER_CRITICAL_ERROR: Int = -1073738799

public val EVENT_GATHER_DAEMON_TERMINATED: Int = -2147480570

public val EVENT_GATHER_DELETING_HISTORY_ITEMS: Int = -1073738774

public val EVENT_GATHER_DIRTY_STARTUP: Int = -2147480576

public val EVENT_GATHER_DISK_FULL: Int = -2147480594

public val EVENT_GATHER_END_ADAPTIVE: Int = 1073744891

public val EVENT_GATHER_END_CRAWL: Int = 1073744842

public val EVENT_GATHER_END_INCREMENTAL: Int = 1073744871

public val EVENT_GATHER_EXCEPTION: Int = -1073738810

public val EVENT_GATHER_FLUSH_FAILED: Int = -1073738737

public val EVENT_GATHER_FROM_NOT_SET: Int = -1073738776

public val EVENT_GATHER_HISTORY_CORRUPTION_DETECTED: Int = -2147480575

public val EVENT_GATHER_INPLACE_INDEX_REBUILD: Int = 1073745427

public val EVENT_GATHER_INTERNAL: Int = -1073738804

public val EVENT_GATHER_INVALID_NETWORK_ACCESS_ACCOUNT: Int = -1073738739

public val EVENT_GATHER_LOCK_FAILED: Int = -1073738784

public val EVENT_GATHER_NO_CRAWL_SEEDS: Int = -2147480602

public val EVENT_GATHER_NO_SCHEMA: Int = -2147480593

public val EVENT_GATHER_OBJ_INIT_FAILED: Int = -1073738796

public val EVENT_GATHER_PLUGINMGR_INIT_FAILED: Int = -1073738767

public val EVENT_GATHER_PLUGIN_INIT_FAILED: Int = -1073738795

public val EVENT_GATHER_PROTOCOLHANDLER_INIT_FAILED: Int = -1073738740

public val EVENT_GATHER_PROTOCOLHANDLER_LOAD_FAILED: Int = -1073738741

public val EVENT_GATHER_READ_CHECKPOINT_FAILED: Int = -1073738733

public val EVENT_GATHER_RECOVERY_FAILURE: Int = -1073738222

public val EVENT_GATHER_REG_MISSING: Int = -2147480610

public val EVENT_GATHER_RESET_START: Int = 1073744865

public val EVENT_GATHER_RESTOREAPP_COMPLETE: Int = 3075

public val EVENT_GATHER_RESTOREAPP_ERROR: Int = -1073738750

public val EVENT_GATHER_RESTORE_CHECKPOINT_FAILED: Int = -1073738734

public val EVENT_GATHER_RESTORE_COMPLETE: Int = 3069

public val EVENT_GATHER_RESTORE_ERROR: Int = -1073738754

public val EVENT_GATHER_RESUME: Int = 1073744868

public val EVENT_GATHER_SAVE_FAILED: Int = -1073738735

public val EVENT_GATHER_SERVICE_INIT: Int = -1073738794

public val EVENT_GATHER_START_CRAWL: Int = 1073744843

public val EVENT_GATHER_START_CRAWL_IF_RESET: Int = -2147480595

public val EVENT_GATHER_START_PAUSE: Int = -2147480606

public val EVENT_GATHER_STOP_START: Int = 1073744876

public val EVENT_GATHER_SYSTEM_LCID_CHANGED: Int = -2147480562

public val EVENT_GATHER_THROTTLE: Int = 1073744867

public val EVENT_GATHER_TRANSACTION_FAIL: Int = -1073738797

public val EVENT_HASHMAP_INSERT: Int = -1073738816

public val EVENT_HASHMAP_UPDATE: Int = -1073738811

public val EVENT_INDEXER_ADD_DSS_DISCONNECT: Int = -2147476585

public val EVENT_INDEXER_ADD_DSS_FAILED: Int = -2147476627

public val EVENT_INDEXER_ADD_DSS_SUCCEEDED: Int = 7019

public val EVENT_INDEXER_BUILD_ENDED: Int = 1073748873

public val EVENT_INDEXER_BUILD_FAILED: Int = -1073734797

public val EVENT_INDEXER_BUILD_START: Int = 1073748872

public val EVENT_INDEXER_CI_LOAD_ERROR: Int = -1073734785

public val EVENT_INDEXER_DSS_ALREADY_ADDED: Int = 1073748870

public val EVENT_INDEXER_DSS_CONTACT_FAILED: Int = -1073734800

public val EVENT_INDEXER_DSS_UNABLE_TO_REMOVE: Int = -1073734755

public val EVENT_INDEXER_FAIL_TO_CREATE_PER_USER_CATALOG: Int = -1073731797

public val EVENT_INDEXER_FAIL_TO_SET_MAX_JETINSTANCE: Int = -1073731798

public val EVENT_INDEXER_FAIL_TO_UNLOAD_PER_USER_CATALOG: Int = -1073731796

public val EVENT_INDEXER_INIT_ERROR: Int = -1073734814

public val EVENT_INDEXER_INVALID_DIRECTORY: Int = -1073734813

public val EVENT_INDEXER_LOAD_FAIL: Int = -1073734781

public val EVENT_INDEXER_MISSING_APP_DIRECTORY: Int = -1073734758

public val EVENT_INDEXER_NEW_PROJECT: Int = -1073734754

public val EVENT_INDEXER_NO_SEARCH_SERVERS: Int = -2147476630

public val EVENT_INDEXER_OUT_OF_DATABASE_INSTANCE: Int = -1073731799

public val EVENT_INDEXER_PAUSED_FOR_DISKFULL: Int = -1073734811

public val EVENT_INDEXER_PERFMON: Int = -1073734760

public val EVENT_INDEXER_PROPSTORE_INIT_FAILED: Int = -1073734787

public val EVENT_INDEXER_PROP_ABORTED: Int = 1073748899

public val EVENT_INDEXER_PROP_COMMITTED: Int = 1073748898

public val EVENT_INDEXER_PROP_COMMIT_FAILED: Int = -1073734747

public val EVENT_INDEXER_PROP_ERROR: Int = -1073734812

public val EVENT_INDEXER_PROP_STARTED: Int = 1073748841

public val EVENT_INDEXER_PROP_STATE_CORRUPT: Int = -1073734780

public val EVENT_INDEXER_PROP_STOPPED: Int = -2147476633

public val EVENT_INDEXER_PROP_SUCCEEDED: Int = 7016

public val EVENT_INDEXER_REG_ERROR: Int = -1073734756
