// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqCancelDiagnosticRecordOperation(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqCloseSession(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqCreateSession(accesslevel : DdqAccessLevel, hsession : *mut HDIAGNOSTIC_DATA_QUERY_SESSION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqExtractDiagnosticReport(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype : u32, reportkey : windows_sys::core::PCWSTR, destinationpath : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqFreeDiagnosticRecordLocaleTags(htagdescription : HDIAGNOSTIC_EVENT_TAG_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqFreeDiagnosticRecordPage(hrecord : HDIAGNOSTIC_RECORD) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqFreeDiagnosticRecordProducerCategories(hcategorydescription : HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqFreeDiagnosticRecordProducers(hproducerdescription : HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqFreeDiagnosticReport(hreport : HDIAGNOSTIC_REPORT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticDataAccessLevelAllowed(accesslevel : *mut DdqAccessLevel) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordAtIndex(hrecord : HDIAGNOSTIC_RECORD, index : u32, record : *mut DIAGNOSTIC_DATA_RECORD) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordBinaryDistribution(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, producernames : *const windows_sys::core::PCWSTR, producernamecount : u32, topnbinaries : u32, binarystats : *mut *mut DIAGNOSTIC_DATA_EVENT_BINARY_STATS, statcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription : HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, index : u32, categorydescription : *mut DIAGNOSTIC_DATA_EVENT_CATEGORY_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordCategoryCount(hcategorydescription : HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, categorydescriptioncount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordCount(hrecord : HDIAGNOSTIC_RECORD, recordcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription : HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, index : u32, tagdescription : *mut DIAGNOSTIC_DATA_EVENT_TAG_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordLocaleTagCount(htagdescription : HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, tagdescriptioncount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordLocaleTags(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, locale : windows_sys::core::PCWSTR, htagdescription : *mut HDIAGNOSTIC_EVENT_TAG_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordPage(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria : *const DIAGNOSTIC_DATA_SEARCH_CRITERIA, offset : u32, pagerecordcount : u32, baserowid : i64, hrecord : *mut HDIAGNOSTIC_RECORD) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordPayload(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, rowid : i64, payload : *mut windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription : HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, index : u32, producerdescription : *mut DIAGNOSTIC_DATA_EVENT_PRODUCER_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordProducerCategories(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, producername : windows_sys::core::PCWSTR, hcategorydescription : *mut HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordProducerCount(hproducerdescription : HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, producerdescriptioncount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordProducers(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, hproducerdescription : *mut HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordStats(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria : *const DIAGNOSTIC_DATA_SEARCH_CRITERIA, recordcount : *mut u32, minrowid : *mut i64, maxrowid : *mut i64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordSummary(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, producernames : *const windows_sys::core::PCWSTR, producernamecount : u32, generalstats : *mut DIAGNOSTIC_DATA_GENERAL_STATS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticRecordTagDistribution(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, producernames : *const windows_sys::core::PCWSTR, producernamecount : u32, tagstats : *mut *mut DIAGNOSTIC_DATA_EVENT_TAG_STATS, statcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticReport(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype : u32, hreport : *mut HDIAGNOSTIC_REPORT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticReportAtIndex(hreport : HDIAGNOSTIC_REPORT, index : u32, report : *mut DIAGNOSTIC_REPORT_DATA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticReportCount(hreport : HDIAGNOSTIC_REPORT, reportcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetDiagnosticReportStoreReportCount(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype : u32, reportcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetSessionAccessLevel(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, accesslevel : *mut DdqAccessLevel) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqGetTranscriptConfiguration(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, currentconfig : *mut DIAGNOSTIC_DATA_EVENT_TRANSCRIPT_CONFIGURATION) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqIsDiagnosticRecordSampledIn(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, providergroup : *const windows_sys::core::GUID, providerid : *const windows_sys::core::GUID, providername : windows_sys::core::PCWSTR, eventid : *const u32, eventname : windows_sys::core::PCWSTR, eventversion : *const u32, eventkeywords : *const u64, issampledin : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("diagnosticdataquery.dll" "system" fn DdqSetTranscriptConfiguration(hsession : HDIAGNOSTIC_DATA_QUERY_SESSION, desiredconfig : *const DIAGNOSTIC_DATA_EVENT_TRANSCRIPT_CONFIGURATION) -> windows_sys::core::HRESULT);

public const val `AllUserData`: `DdqAccessLevel` = 2;
public const val `CurrentUserData`: `DdqAccessLevel` = 1;
// UNSUPPORTED Rust 38:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_DATA_EVENT_BINARY_STATS {
//     pub moduleName: windows_sys::core::PWSTR,
//     pub friendlyModuleName: windows_sys::core::PWSTR,
//     pub eventCount: u32,
//     pub uploadSizeBytes: u64,
// }

// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_DATA_EVENT_BINARY_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 51:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_DATA_EVENT_CATEGORY_DESCRIPTION {
//     pub id: i32,
//     pub name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_DATA_EVENT_CATEGORY_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 62:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_DATA_EVENT_PRODUCER_DESCRIPTION {
//     pub name: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 67:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_DATA_EVENT_PRODUCER_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 72:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_DATA_EVENT_TAG_DESCRIPTION {
//     pub privacyTag: i32,
//     pub name: windows_sys::core::PWSTR,
//     pub description: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 79:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_DATA_EVENT_TAG_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 84:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DIAGNOSTIC_DATA_EVENT_TAG_STATS {
//     pub privacyTag: i32,
//     pub eventCount: u32,
// }

// UNSUPPORTED Rust 90:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DIAGNOSTIC_DATA_EVENT_TRANSCRIPT_CONFIGURATION {
//     pub hoursOfHistoryToKeep: u32,
//     pub maxStoreMegabytes: u32,
//     pub requestedMaxStoreMegabytes: u32,
// }

// UNSUPPORTED Rust 97:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DIAGNOSTIC_DATA_GENERAL_STATS {
//     pub optInLevel: u32,
//     pub transcriptSizeBytes: u64,
//     pub oldestEventTimestamp: u64,
//     pub totalEventCountLast24Hours: u32,
//     pub averageDailyEvents: f32,
// }

// UNSUPPORTED Rust 106:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_DATA_RECORD {
//     pub rowId: i64,
//     pub timestamp: u64,
//     pub eventKeywords: u64,
//     pub fullEventName: windows_sys::core::PWSTR,
//     pub providerGroupGuid: windows_sys::core::PWSTR,
//     pub producerName: windows_sys::core::PWSTR,
//     pub privacyTags: *mut i32,
//     pub privacyTagCount: u32,
//     pub categoryIds: *mut i32,
//     pub categoryIdCount: u32,
//     pub isCoreData: windows_sys::core::BOOL,
//     pub extra1: windows_sys::core::PWSTR,
//     pub extra2: windows_sys::core::PWSTR,
//     pub extra3: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 124:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_DATA_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 129:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_DATA_SEARCH_CRITERIA {
//     pub producerNames: *const windows_sys::core::PCWSTR,
//     pub producerNameCount: u32,
//     pub textToMatch: windows_sys::core::PCWSTR,
//     pub categoryIds: *const i32,
//     pub categoryIdCount: u32,
//     pub privacyTags: *const i32,
//     pub privacyTagCount: u32,
//     pub coreDataOnly: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_DATA_SEARCH_CRITERIA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_REPORT_DATA {
//     pub signature: DIAGNOSTIC_REPORT_SIGNATURE,
//     pub bucketId: windows_sys::core::GUID,
//     pub reportId: windows_sys::core::GUID,
//     pub creationTime: super::super::Foundation::FILETIME,
//     pub sizeInBytes: u64,
//     pub cabId: windows_sys::core::PWSTR,
//     pub reportStatus: u32,
//     pub reportIntegratorId: windows_sys::core::GUID,
//     pub fileNames: *mut windows_sys::core::PWSTR,
//     pub fileCount: u32,
//     pub friendlyEventName: windows_sys::core::PWSTR,
//     pub applicationName: windows_sys::core::PWSTR,
//     pub applicationPath: windows_sys::core::PWSTR,
//     pub description: windows_sys::core::PWSTR,
//     pub bucketIdString: windows_sys::core::PWSTR,
//     pub legacyBucketId: u64,
//     pub reportKey: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 167:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_REPORT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 172:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_REPORT_PARAMETER {
//     pub name: [u16; 129],
//     pub value: [u16; 260],
// }

// UNSUPPORTED Rust 178:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_REPORT_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 183:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DIAGNOSTIC_REPORT_SIGNATURE {
//     pub eventName: [u16; 65],
//     pub parameters: [DIAGNOSTIC_REPORT_PARAMETER; 10],
// }

// UNSUPPORTED Rust 189:1: declaration Impl has no candidate rule
// impl Default for DIAGNOSTIC_REPORT_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DdqAccessLevel` = Int;
// UNSUPPORTED Rust 195:1: non-scalar type Ptr unsupported
// pub type HDIAGNOSTIC_DATA_QUERY_SESSION = *mut core::ffi::c_void;

// UNSUPPORTED Rust 196:1: non-scalar type Ptr unsupported
// pub type HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION = *mut core::ffi::c_void;

// UNSUPPORTED Rust 197:1: non-scalar type Ptr unsupported
// pub type HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION = *mut core::ffi::c_void;

// UNSUPPORTED Rust 198:1: non-scalar type Ptr unsupported
// pub type HDIAGNOSTIC_EVENT_TAG_DESCRIPTION = *mut core::ffi::c_void;

// UNSUPPORTED Rust 199:1: non-scalar type Ptr unsupported
// pub type HDIAGNOSTIC_RECORD = *mut core::ffi::c_void;

// UNSUPPORTED Rust 200:1: non-scalar type Ptr unsupported
// pub type HDIAGNOSTIC_REPORT = *mut core::ffi::c_void;

public const val `NoData`: `DdqAccessLevel` = 0;
