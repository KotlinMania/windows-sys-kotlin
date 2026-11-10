package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val CHUNK_EOC: ChunkBreaktype = 4

public val CHUNK_EOP: ChunkBreaktype = 3

public val CHUNK_EOS: ChunkBreaktype = 2

public val CHUNK_EOW: ChunkBreaktype = 1

public val CHUNK_FILTER_OWNED_VALUE: Chunkstate = 4

public val CHUNK_NO_BREAK: ChunkBreaktype = 0

public val CHUNK_TEXT: Chunkstate = 1

public val CHUNK_VALUE: Chunkstate = 2

public val CIADMIN: Pcwstr = w("::_nodocstore_::")

public val CICAT_ALL_OPENED: UInt = 32u

public val CICAT_GET_STATE: UInt = 16u

public val CICAT_NO_QUERY: UInt = 8u

public val CICAT_READONLY: UInt = 2u

public val CICAT_STOPPED: UInt = 1u

public val CICAT_WRITABLE: UInt = 4u

public val CINULLCATALOG: Pcwstr = w("::_noindex_::")

public val CI_PROVIDER_ALL: UInt = 4294967295u

public val CI_PROVIDER_INDEXING_SERVICE: UInt = 2u

public val CI_PROVIDER_MSSEARCH: UInt = 1u

public val CI_STATE_ANNEALING_MERGE: UInt = 8u

public val CI_STATE_BATTERY_POLICY: UInt = 262144u

public val CI_STATE_BATTERY_POWER: UInt = 2048u

public val CI_STATE_CONTENT_SCAN_REQUIRED: UInt = 4u

public val CI_STATE_DELETION_MERGE: UInt = 32768u

public val CI_STATE_HIGH_CPU: UInt = 131072u

public val CI_STATE_HIGH_IO: UInt = 256u

public val CI_STATE_INDEX_MIGRATION_MERGE: UInt = 64u

public val CI_STATE_LOW_DISK: UInt = 65536u

public val CI_STATE_LOW_MEMORY: UInt = 128u

public val CI_STATE_MASTER_MERGE: UInt = 2u

public val CI_STATE_MASTER_MERGE_PAUSED: UInt = 512u

public val CI_STATE_READING_USNS: UInt = 16384u

public val CI_STATE_READ_ONLY: UInt = 1024u

public val CI_STATE_RECOVERING: UInt = 32u

public val CI_STATE_SCANNING: UInt = 16u

public val CI_STATE_SHADOW_MERGE: UInt = 1u

public val CI_STATE_STARTING: UInt = 8192u

public val CI_STATE_USER_ACTIVE: UInt = 4096u

public val CI_VERSION_WDS30: UInt = 258u

public val CI_VERSION_WDS40: UInt = 265u

public val CI_VERSION_WIN70: UInt = 1792u

public val CLSID_INDEX_SERVER_DSO: Guid = Guid.fromU128(U128(0xf9ae89807e5211d0uL, 0x896400c04fd611d7uL))

public val DBKIND_GUID: Dbkindenum = 6

public val DBKIND_GUID_NAME: Dbkindenum = 0

public val DBKIND_GUID_PROPID: Dbkindenum = 1

public val DBKIND_NAME: Dbkindenum = 2

public val DBKIND_PGUID_NAME: Dbkindenum = 3

public val DBKIND_PGUID_PROPID: Dbkindenum = 4

public val DBKIND_PROPID: Dbkindenum = 5

public val DBPROPSET_CIFRMWRKCORE_EXT: Guid = Guid.fromU128(U128(0xafafaca5b5d111d0uL, 0x8c6200c04fc2db8duL))

public val DBPROPSET_FSCIFRMWRK_EXT: Guid = Guid.fromU128(U128(0xa9bd15266a8011d0uL, 0x8c9d0020af1d740euL))

public val DBPROPSET_MSIDXS_ROWSETEXT: Guid = Guid.fromU128(U128(0xaa6ee6b0e82811d0uL, 0xb23e00aa0047fc01uL))

public val DBPROPSET_QUERYEXT: Guid = Guid.fromU128(U128(0xa7ac77edf8d711ceuL, 0xa7980020f8008025uL))

public val DBPROPSET_SESS_QUERYEXT: Guid = Guid.fromU128(U128(0x636233092d8b4d17uL, 0xb1526e2956c26a70uL))

public val DBPROP_APPLICATION_NAME: UInt = 11u

public val DBPROP_CATALOGLISTID: UInt = 9u

public val DBPROP_CI_CATALOG_NAME: UInt = 2u

public val DBPROP_CI_DEPTHS: UInt = 4u

public val DBPROP_CI_EXCLUDE_SCOPES: UInt = 5u

public val DBPROP_CI_INCLUDE_SCOPES: UInt = 3u

public val DBPROP_CI_PROVIDER: UInt = 8u

public val DBPROP_CI_QUERY_TYPE: UInt = 7u

public val DBPROP_CI_SCOPE_FLAGS: UInt = 4u

public val DBPROP_CI_SECURITY_ID: UInt = 6u

public val DBPROP_CLIENT_CLSID: UInt = 3u

public val DBPROP_DEFAULT_EQUALS_BEHAVIOR: UInt = 2u

public val DBPROP_DEFERCATALOGVERIFICATION: UInt = 8u

public val DBPROP_DEFERNONINDEXEDTRIMMING: UInt = 3u

public val DBPROP_DONOTCOMPUTEEXPENSIVEPROPS: UInt = 15u

public val DBPROP_ENABLEROWSETEVENTS: UInt = 16u

public val DBPROP_FIRSTROWS: UInt = 7u

public val DBPROP_FREETEXTANYTERM: UInt = 12u

public val DBPROP_FREETEXTUSESTEMMING: UInt = 13u

public val DBPROP_GENERATEPARSETREE: UInt = 10u

public val DBPROP_GENERICOPTIONS_STRING: UInt = 6u

public val DBPROP_IGNORENOISEONLYCLAUSES: UInt = 5u

public val DBPROP_IGNORESBRI: UInt = 14u

public val DBPROP_MACHINE: UInt = 2u

public val DBPROP_USECONTENTINDEX: UInt = 2u

public val DBPROP_USEEXTENDEDDBTYPES: UInt = 4u

public val DBSETFUNC_ALL: UInt = 1u

public val DBSETFUNC_DISTINCT: UInt = 2u

public val DBSETFUNC_NONE: UInt = 0u

public val FILTER_E_ACCESS: Hresult = 0x80041703u.toInt()

public val FILTER_E_EMBEDDING_UNAVAILABLE: Hresult = 0x80041707u.toInt()

public val FILTER_E_END_OF_CHUNKS: Hresult = 0x80041700u.toInt()

public val FILTER_E_LINK_UNAVAILABLE: Hresult = 0x80041708u.toInt()

public val FILTER_E_NO_MORE_TEXT: Hresult = 0x80041701u.toInt()

public val FILTER_E_NO_MORE_VALUES: Hresult = 0x80041702u.toInt()

public val FILTER_E_NO_TEXT: Hresult = 0x80041705u.toInt()

public val FILTER_E_NO_VALUES: Hresult = 0x80041706u.toInt()

public val FILTER_E_PASSWORD: Hresult = 0x8004170Bu.toInt()

public val FILTER_E_UNKNOWNFORMAT: Hresult = 0x8004170Cu.toInt()

public val FILTER_S_LAST_TEXT: Hresult = 0x41709u.toInt()

public val FILTER_S_LAST_VALUES: Hresult = 0x4170Au.toInt()

public val FILTER_W_MONIKER_CLIPPED: Hresult = 0x41704u.toInt()

public val GENERATE_METHOD_EXACT: UInt = 0u

public val GENERATE_METHOD_INFLECT: UInt = 2u

public val GENERATE_METHOD_PREFIX: UInt = 1u

public val IFILTER_FLAGS_OLE_PROPERTIES: IfilterFlags = 1

public val IFILTER_INIT_APPLY_CRAWL_ATTRIBUTES: IfilterInit = 256

public val IFILTER_INIT_APPLY_INDEX_ATTRIBUTES: IfilterInit = 16

public val IFILTER_INIT_APPLY_OTHER_ATTRIBUTES: IfilterInit = 32

public val IFILTER_INIT_CANON_HYPHENS: IfilterInit = 4

public val IFILTER_INIT_CANON_PARAGRAPHS: IfilterInit = 1

public val IFILTER_INIT_CANON_SPACES: IfilterInit = 8

public val IFILTER_INIT_DISABLE_EMBEDDED: IfilterInit = 2048

public val IFILTER_INIT_EMIT_FORMATTING: IfilterInit = 4096

public val IFILTER_INIT_FILTER_AGGRESSIVE_BREAK: IfilterInit = 1024

public val IFILTER_INIT_FILTER_OWNED_VALUE_OK: IfilterInit = 512

public val IFILTER_INIT_HARD_LINE_BREAKS: IfilterInit = 2

public val IFILTER_INIT_INDEXING_ONLY: IfilterInit = 64

public val IFILTER_INIT_SEARCH_LINKS: IfilterInit = 128

public val LIFF_FORCE_TEXT_FILTER_FALLBACK: UInt = 3u

public val LIFF_IMPLEMENT_TEXT_FILTER_FALLBACK_POLICY: UInt = 2u

public val LIFF_LOAD_DEFINED_FILTER: UInt = 1u

public val MSIDXSPROP_COMMAND_LOCALE_STRING: UInt = 3u

public val MSIDXSPROP_MAX_RANK: UInt = 6u

public val MSIDXSPROP_PARSE_TREE: UInt = 5u

public val MSIDXSPROP_QUERY_RESTRICTION: UInt = 4u

public val MSIDXSPROP_RESULTS_FOUND: UInt = 7u

public val MSIDXSPROP_ROWSETQUERYSTATUS: UInt = 2u

public val MSIDXSPROP_SAME_SORTORDER_USED: UInt = 14u

public val MSIDXSPROP_SERVER_NLSVERSION: UInt = 12u

public val MSIDXSPROP_SERVER_NLSVER_DEFINED: UInt = 13u

public val MSIDXSPROP_SERVER_VERSION: UInt = 9u

public val MSIDXSPROP_SERVER_WINVER_MAJOR: UInt = 10u

public val MSIDXSPROP_SERVER_WINVER_MINOR: UInt = 11u

public val MSIDXSPROP_WHEREID: UInt = 8u

public val NOT_AN_ERROR: Hresult = 0x80000u.toInt()

public val PID_FILENAME: UInt = 100u

public val PROPID_QUERY_ALL: UInt = 6u

public val PROPID_QUERY_HITCOUNT: UInt = 4u

public val PROPID_QUERY_LASTSEENTIME: UInt = 10u

public val PROPID_QUERY_RANK: UInt = 3u

public val PROPID_QUERY_RANKVECTOR: UInt = 2u

public val PROPID_QUERY_UNFILTERED: UInt = 7u

public val PROPID_QUERY_VIRTUALPATH: UInt = 9u

public val PROPID_QUERY_WORKID: UInt = 5u

public val PROPID_STG_CONTENTS: UInt = 19u

public val PROXIMITY_UNIT_CHAPTER: UInt = 3u

public val PROXIMITY_UNIT_PARAGRAPH: UInt = 2u

public val PROXIMITY_UNIT_SENTENCE: UInt = 1u

public val PROXIMITY_UNIT_WORD: UInt = 0u

public val PSGUID_FILENAME: Guid = Guid.fromU128(U128(0x41cf5ae0f75a4806uL, 0xbd8759c7d9248eb9uL))

public val QUERY_DEEP: UInt = 1u

public val QUERY_PHYSICAL_PATH: UInt = 0u

public val QUERY_SHALLOW: UInt = 0u

public val QUERY_VIRTUAL_PATH: UInt = 2u

public val SCOPE_FLAG_DEEP: UInt = 2u

public val SCOPE_FLAG_INCLUDE: UInt = 1u

public val SCOPE_FLAG_MASK: UInt = 255u

public val SCOPE_TYPE_MASK: UInt = 4294967040u

public val SCOPE_TYPE_VPATH: UInt = 512u

public val SCOPE_TYPE_WINPATH: UInt = 256u

public val STAT_BUSY: UInt = 0u

public val STAT_COALESCE_COMP_ALL_NOISE: UInt = 8192u

public val STAT_CONTENT_OUT_OF_DATE: UInt = 32u

public val STAT_CONTENT_QUERY_INCOMPLETE: UInt = 128u

public val STAT_DONE: UInt = 2u

public val STAT_ERROR: UInt = 1u

public val STAT_MISSING_PROP_IN_RELDOC: UInt = 2048u

public val STAT_MISSING_RELDOC: UInt = 1024u

public val STAT_NOISE_WORDS: UInt = 16u

public val STAT_PARTIAL_SCOPE: UInt = 8u

public val STAT_REFRESH: UInt = 3u

public val STAT_REFRESH_INCOMPLETE: UInt = 64u

public val STAT_RELDOC_ACCESS_DENIED: UInt = 4096u

public val STAT_SHARING_VIOLATION: UInt = 512u

public val STAT_TIME_LIMIT_EXCEEDED: UInt = 256u

public val VECTOR_RANK_DICE: UInt = 3u

public val VECTOR_RANK_INNER: UInt = 2u

public val VECTOR_RANK_JACCARD: UInt = 4u

public val VECTOR_RANK_MAX: UInt = 1u

public val VECTOR_RANK_MIN: UInt = 0u

public val WORDREP_BREAK_EOC: WordrepBreakType = 3

public val WORDREP_BREAK_EOP: WordrepBreakType = 2

public val WORDREP_BREAK_EOS: WordrepBreakType = 1

public val WORDREP_BREAK_EOW: WordrepBreakType = 0
