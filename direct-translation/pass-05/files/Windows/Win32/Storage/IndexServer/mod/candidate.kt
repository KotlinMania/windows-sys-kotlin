// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=query.dll, ABI=system, export=BindIFilterFromStorage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
public external fun `BindIFilterFromStorage`(`pstg` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppiunk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=query.dll, ABI=system, export=BindIFilterFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `BindIFilterFromStream`(`pstm` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppiunk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=query.dll, ABI=system, export=LoadIFilter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadIFilter`(`pwcspath` : `windows_sys`.`core`.`PCWSTR`, `punkouter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `ppiunk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=query.dll, ABI=system, export=LoadIFilterEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadIFilterEx`(`pwcspath` : `windows_sys`.`core`.`PCWSTR`, `dwflags` : UInt, `riid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `ppiunk` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
public typealias `CHUNKSTATE` = Int;
public typealias `CHUNK_BREAKTYPE` = Int;
public const val `CHUNK_EOC`: `CHUNK_BREAKTYPE` = 4;
public const val `CHUNK_EOP`: `CHUNK_BREAKTYPE` = 3;
public const val `CHUNK_EOS`: `CHUNK_BREAKTYPE` = 2;
public const val `CHUNK_EOW`: `CHUNK_BREAKTYPE` = 1;
public const val `CHUNK_FILTER_OWNED_VALUE`: `CHUNKSTATE` = 4;
public const val `CHUNK_NO_BREAK`: `CHUNK_BREAKTYPE` = 0;
public const val `CHUNK_TEXT`: `CHUNKSTATE` = 1;
public const val `CHUNK_VALUE`: `CHUNKSTATE` = 2;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CIADMIN`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("::_nodocstore_::");
public const val `CICAT_ALL_OPENED`: UInt = 32u;
public const val `CICAT_GET_STATE`: UInt = 16u;
public const val `CICAT_NO_QUERY`: UInt = 8u;
public const val `CICAT_READONLY`: UInt = 2u;
public const val `CICAT_STOPPED`: UInt = 1u;
public const val `CICAT_WRITABLE`: UInt = 4u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `CINULLCATALOG`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("::_noindex_::");
public const val `CI_PROVIDER_ALL`: UInt = 4294967295u;
public const val `CI_PROVIDER_INDEXING_SERVICE`: UInt = 2u;
public const val `CI_PROVIDER_MSSEARCH`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CI_STATE` (
    public var `cbStruct`: UInt,
    public var `cWordList`: UInt,
    public var `cPersistentIndex`: UInt,
    public var `cQueries`: UInt,
    public var `cDocuments`: UInt,
    public var `cFreshTest`: UInt,
    public var `dwMergeProgress`: UInt,
    public var `eState`: UInt,
    public var `cFilteredDocuments`: UInt,
    public var `cTotalDocuments`: UInt,
    public var `cPendingScans`: UInt,
    public var `dwIndexSize`: UInt,
    public var `cUniqueKeys`: UInt,
    public var `cSecQDocuments`: UInt,
    public var `dwPropCacheSize`: UInt,
)
public const val `CI_STATE_ANNEALING_MERGE`: UInt = 8u;
public const val `CI_STATE_BATTERY_POLICY`: UInt = 262144u;
public const val `CI_STATE_BATTERY_POWER`: UInt = 2048u;
public const val `CI_STATE_CONTENT_SCAN_REQUIRED`: UInt = 4u;
public const val `CI_STATE_DELETION_MERGE`: UInt = 32768u;
public const val `CI_STATE_HIGH_CPU`: UInt = 131072u;
public const val `CI_STATE_HIGH_IO`: UInt = 256u;
public const val `CI_STATE_INDEX_MIGRATION_MERGE`: UInt = 64u;
public const val `CI_STATE_LOW_DISK`: UInt = 65536u;
public const val `CI_STATE_LOW_MEMORY`: UInt = 128u;
public const val `CI_STATE_MASTER_MERGE`: UInt = 2u;
public const val `CI_STATE_MASTER_MERGE_PAUSED`: UInt = 512u;
public const val `CI_STATE_READING_USNS`: UInt = 16384u;
public const val `CI_STATE_READ_ONLY`: UInt = 1024u;
public const val `CI_STATE_RECOVERING`: UInt = 32u;
public const val `CI_STATE_SCANNING`: UInt = 16u;
public const val `CI_STATE_SHADOW_MERGE`: UInt = 1u;
public const val `CI_STATE_STARTING`: UInt = 8192u;
public const val `CI_STATE_USER_ACTIVE`: UInt = 4096u;
public const val `CI_VERSION_WDS30`: UInt = 258u;
public const val `CI_VERSION_WDS40`: UInt = 265u;
public const val `CI_VERSION_WIN70`: UInt = 1792u;
// UNSUPPORTED Rust 69:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_INDEX_SERVER_DSO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf9ae8980_7e52_11d0_8964_00c04fd611d7);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBID` (
    public var `uGuid`: `DBID_0`,
    public var `eKind`: UInt,
    public var `uName`: `DBID_1`,
)
// UNSUPPORTED Rust 78:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 84:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(2))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub union DBID_0 {
//     pub guid: windows_sys::core::GUID,
//     pub pguid: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 91:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 97:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(2))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub union DBID_1 {
//     pub pwszName: windows_sys::core::PWSTR,
//     pub ulPropid: u32,
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for DBID_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DBID` (
    public var `uGuid`: `DBID_0`,
    public var `eKind`: UInt,
    public var `uName`: `DBID_1`,
)
// UNSUPPORTED Rust 118:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 124:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union DBID_0 {
//     pub guid: windows_sys::core::GUID,
//     pub pguid: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 131:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 137:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union DBID_1 {
//     pub pwszName: windows_sys::core::PWSTR,
//     pub ulPropid: u32,
// }

// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for DBID_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DBKINDENUM` = Int;
public const val `DBKIND_GUID`: `DBKINDENUM` = 6;
public const val `DBKIND_GUID_NAME`: `DBKINDENUM` = 0;
public const val `DBKIND_GUID_PROPID`: `DBKINDENUM` = 1;
public const val `DBKIND_NAME`: `DBKINDENUM` = 2;
public const val `DBKIND_PGUID_NAME`: `DBKINDENUM` = 3;
public const val `DBKIND_PGUID_PROPID`: `DBKINDENUM` = 4;
public const val `DBKIND_PROPID`: `DBKINDENUM` = 5;
// UNSUPPORTED Rust 158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DBPROPSET_CIFRMWRKCORE_EXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xafafaca5_b5d1_11d0_8c62_00c04fc2db8d);

// UNSUPPORTED Rust 159:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DBPROPSET_FSCIFRMWRK_EXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9bd1526_6a80_11d0_8c9d_0020af1d740e);

// UNSUPPORTED Rust 160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DBPROPSET_MSIDXS_ROWSETEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaa6ee6b0_e828_11d0_b23e_00aa0047fc01);

// UNSUPPORTED Rust 161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DBPROPSET_QUERYEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7ac77ed_f8d7_11ce_a798_0020f8008025);

// UNSUPPORTED Rust 162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const DBPROPSET_SESS_QUERYEXT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63623309_2d8b_4d17_b152_6e2956c26a70);

public const val `DBPROP_APPLICATION_NAME`: UInt = 11u;
public const val `DBPROP_CATALOGLISTID`: UInt = 9u;
public const val `DBPROP_CI_CATALOG_NAME`: UInt = 2u;
public const val `DBPROP_CI_DEPTHS`: UInt = 4u;
public const val `DBPROP_CI_EXCLUDE_SCOPES`: UInt = 5u;
public const val `DBPROP_CI_INCLUDE_SCOPES`: UInt = 3u;
public const val `DBPROP_CI_PROVIDER`: UInt = 8u;
public const val `DBPROP_CI_QUERY_TYPE`: UInt = 7u;
public const val `DBPROP_CI_SCOPE_FLAGS`: UInt = 4u;
public const val `DBPROP_CI_SECURITY_ID`: UInt = 6u;
public const val `DBPROP_CLIENT_CLSID`: UInt = 3u;
public const val `DBPROP_DEFAULT_EQUALS_BEHAVIOR`: UInt = 2u;
public const val `DBPROP_DEFERCATALOGVERIFICATION`: UInt = 8u;
public const val `DBPROP_DEFERNONINDEXEDTRIMMING`: UInt = 3u;
public const val `DBPROP_DONOTCOMPUTEEXPENSIVEPROPS`: UInt = 15u;
public const val `DBPROP_ENABLEROWSETEVENTS`: UInt = 16u;
public const val `DBPROP_FIRSTROWS`: UInt = 7u;
public const val `DBPROP_FREETEXTANYTERM`: UInt = 12u;
public const val `DBPROP_FREETEXTUSESTEMMING`: UInt = 13u;
public const val `DBPROP_GENERATEPARSETREE`: UInt = 10u;
public const val `DBPROP_GENERICOPTIONS_STRING`: UInt = 6u;
public const val `DBPROP_IGNORENOISEONLYCLAUSES`: UInt = 5u;
public const val `DBPROP_IGNORESBRI`: UInt = 14u;
public const val `DBPROP_MACHINE`: UInt = 2u;
public const val `DBPROP_USECONTENTINDEX`: UInt = 2u;
public const val `DBPROP_USEEXTENDEDDBTYPES`: UInt = 4u;
public const val `DBSETFUNC_ALL`: UInt = 1u;
public const val `DBSETFUNC_DISTINCT`: UInt = 2u;
public const val `DBSETFUNC_NONE`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FILTERREGION` (
    public var `idChunk`: UInt,
    public var `cwcStart`: UInt,
    public var `cwcExtent`: UInt,
)
public const val `FILTER_E_ACCESS`: Int = -2147215613;
public const val `FILTER_E_EMBEDDING_UNAVAILABLE`: Int = -2147215609;
public const val `FILTER_E_END_OF_CHUNKS`: Int = -2147215616;
public const val `FILTER_E_LINK_UNAVAILABLE`: Int = -2147215608;
public const val `FILTER_E_NO_MORE_TEXT`: Int = -2147215615;
public const val `FILTER_E_NO_MORE_VALUES`: Int = -2147215614;
public const val `FILTER_E_NO_TEXT`: Int = -2147215611;
public const val `FILTER_E_NO_VALUES`: Int = -2147215610;
public const val `FILTER_E_PASSWORD`: Int = -2147215605;
public const val `FILTER_E_UNKNOWNFORMAT`: Int = -2147215604;
public const val `FILTER_S_LAST_TEXT`: Int = 268041;
public const val `FILTER_S_LAST_VALUES`: Int = 268042;
public const val `FILTER_W_MONIKER_CLIPPED`: Int = 268036;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FULLPROPSPEC` (
    public var `guidPropSet`: `windows_sys`.`core`.`GUID`,
    public var `psProperty`: `super`.`super`.`System`.`Com`.`StructuredStorage`.`PROPSPEC`,
)
// UNSUPPORTED Rust 219:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for FULLPROPSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `GENERATE_METHOD_EXACT`: UInt = 0u;
public const val `GENERATE_METHOD_INFLECT`: UInt = 2u;
public const val `GENERATE_METHOD_PREFIX`: UInt = 1u;
public typealias `IFILTER_FLAGS` = Int;
public const val `IFILTER_FLAGS_OLE_PROPERTIES`: `IFILTER_FLAGS` = 1;
public typealias `IFILTER_INIT` = Int;
public const val `IFILTER_INIT_APPLY_CRAWL_ATTRIBUTES`: `IFILTER_INIT` = 256;
public const val `IFILTER_INIT_APPLY_INDEX_ATTRIBUTES`: `IFILTER_INIT` = 16;
public const val `IFILTER_INIT_APPLY_OTHER_ATTRIBUTES`: `IFILTER_INIT` = 32;
public const val `IFILTER_INIT_CANON_HYPHENS`: `IFILTER_INIT` = 4;
public const val `IFILTER_INIT_CANON_PARAGRAPHS`: `IFILTER_INIT` = 1;
public const val `IFILTER_INIT_CANON_SPACES`: `IFILTER_INIT` = 8;
public const val `IFILTER_INIT_DISABLE_EMBEDDED`: `IFILTER_INIT` = 2048;
public const val `IFILTER_INIT_EMIT_FORMATTING`: `IFILTER_INIT` = 4096;
public const val `IFILTER_INIT_FILTER_AGGRESSIVE_BREAK`: `IFILTER_INIT` = 1024;
public const val `IFILTER_INIT_FILTER_OWNED_VALUE_OK`: `IFILTER_INIT` = 512;
public const val `IFILTER_INIT_HARD_LINE_BREAKS`: `IFILTER_INIT` = 2;
public const val `IFILTER_INIT_INDEXING_ONLY`: `IFILTER_INIT` = 64;
public const val `IFILTER_INIT_SEARCH_LINKS`: `IFILTER_INIT` = 128;
public const val `LIFF_FORCE_TEXT_FILTER_FALLBACK`: UInt = 3u;
public const val `LIFF_IMPLEMENT_TEXT_FILTER_FALLBACK_POLICY`: UInt = 2u;
public const val `LIFF_LOAD_DEFINED_FILTER`: UInt = 1u;
public const val `MSIDXSPROP_COMMAND_LOCALE_STRING`: UInt = 3u;
public const val `MSIDXSPROP_MAX_RANK`: UInt = 6u;
public const val `MSIDXSPROP_PARSE_TREE`: UInt = 5u;
public const val `MSIDXSPROP_QUERY_RESTRICTION`: UInt = 4u;
public const val `MSIDXSPROP_RESULTS_FOUND`: UInt = 7u;
public const val `MSIDXSPROP_ROWSETQUERYSTATUS`: UInt = 2u;
public const val `MSIDXSPROP_SAME_SORTORDER_USED`: UInt = 14u;
public const val `MSIDXSPROP_SERVER_NLSVERSION`: UInt = 12u;
public const val `MSIDXSPROP_SERVER_NLSVER_DEFINED`: UInt = 13u;
public const val `MSIDXSPROP_SERVER_VERSION`: UInt = 9u;
public const val `MSIDXSPROP_SERVER_WINVER_MAJOR`: UInt = 10u;
public const val `MSIDXSPROP_SERVER_WINVER_MINOR`: UInt = 11u;
public const val `MSIDXSPROP_WHEREID`: UInt = 8u;
public const val `NOT_AN_ERROR`: Int = 524288;
public const val `PID_FILENAME`: UInt = 100u;
public const val `PROPID_QUERY_ALL`: UInt = 6u;
public const val `PROPID_QUERY_HITCOUNT`: UInt = 4u;
public const val `PROPID_QUERY_LASTSEENTIME`: UInt = 10u;
public const val `PROPID_QUERY_RANK`: UInt = 3u;
public const val `PROPID_QUERY_RANKVECTOR`: UInt = 2u;
public const val `PROPID_QUERY_UNFILTERED`: UInt = 7u;
public const val `PROPID_QUERY_VIRTUALPATH`: UInt = 9u;
public const val `PROPID_QUERY_WORKID`: UInt = 5u;
public const val `PROPID_STG_CONTENTS`: UInt = 19u;
public const val `PROXIMITY_UNIT_CHAPTER`: UInt = 3u;
public const val `PROXIMITY_UNIT_PARAGRAPH`: UInt = 2u;
public const val `PROXIMITY_UNIT_SENTENCE`: UInt = 1u;
public const val `PROXIMITY_UNIT_WORD`: UInt = 0u;
// UNSUPPORTED Rust 275:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const PSGUID_FILENAME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x41cf5ae0_f75a_4806_bd87_59c7d9248eb9);

public const val `QUERY_DEEP`: UInt = 1u;
public const val `QUERY_PHYSICAL_PATH`: UInt = 0u;
public const val `QUERY_SHALLOW`: UInt = 0u;
public const val `QUERY_VIRTUAL_PATH`: UInt = 2u;
public const val `SCOPE_FLAG_DEEP`: UInt = 2u;
public const val `SCOPE_FLAG_INCLUDE`: UInt = 1u;
public const val `SCOPE_FLAG_MASK`: UInt = 255u;
public const val `SCOPE_TYPE_MASK`: UInt = 4294967040u;
public const val `SCOPE_TYPE_VPATH`: UInt = 512u;
public const val `SCOPE_TYPE_WINPATH`: UInt = 256u;
public const val `STAT_BUSY`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STAT_CHUNK` (
    public var `idChunk`: UInt,
    public var `breakType`: `CHUNK_BREAKTYPE`,
    public var `flags`: `CHUNKSTATE`,
    public var `locale`: UInt,
    public var `attribute`: `FULLPROPSPEC`,
    public var `idChunkSource`: UInt,
    public var `cwcStartSource`: UInt,
    public var `cwcLenSource`: UInt,
)
// UNSUPPORTED Rust 300:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// impl Default for STAT_CHUNK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STAT_COALESCE_COMP_ALL_NOISE`: UInt = 8192u;
public const val `STAT_CONTENT_OUT_OF_DATE`: UInt = 32u;
public const val `STAT_CONTENT_QUERY_INCOMPLETE`: UInt = 128u;
public const val `STAT_DONE`: UInt = 2u;
public const val `STAT_ERROR`: UInt = 1u;
public const val `STAT_MISSING_PROP_IN_RELDOC`: UInt = 2048u;
public const val `STAT_MISSING_RELDOC`: UInt = 1024u;
public const val `STAT_NOISE_WORDS`: UInt = 16u;
public const val `STAT_PARTIAL_SCOPE`: UInt = 8u;
public const val `STAT_REFRESH`: UInt = 3u;
public const val `STAT_REFRESH_INCOMPLETE`: UInt = 64u;
public const val `STAT_RELDOC_ACCESS_DENIED`: UInt = 4096u;
public const val `STAT_SHARING_VIOLATION`: UInt = 512u;
public const val `STAT_TIME_LIMIT_EXCEEDED`: UInt = 256u;
public const val `VECTOR_RANK_DICE`: UInt = 3u;
public const val `VECTOR_RANK_INNER`: UInt = 2u;
public const val `VECTOR_RANK_JACCARD`: UInt = 4u;
public const val `VECTOR_RANK_MAX`: UInt = 1u;
public const val `VECTOR_RANK_MIN`: UInt = 0u;
public const val `WORDREP_BREAK_EOC`: `WORDREP_BREAK_TYPE` = 3;
public const val `WORDREP_BREAK_EOP`: `WORDREP_BREAK_TYPE` = 2;
public const val `WORDREP_BREAK_EOS`: `WORDREP_BREAK_TYPE` = 1;
public const val `WORDREP_BREAK_EOW`: `WORDREP_BREAK_TYPE` = 0;
public typealias `WORDREP_BREAK_TYPE` = Int;
