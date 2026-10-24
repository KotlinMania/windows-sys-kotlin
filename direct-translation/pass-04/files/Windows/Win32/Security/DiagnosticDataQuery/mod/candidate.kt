// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqCancelDiagnosticRecordOperation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqCancelDiagnosticRecordOperation`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqCloseSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqCloseSession`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqCreateSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqCreateSession`(`accesslevel` : `DdqAccessLevel`, `hsession` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDIAGNOSTIC_DATA_QUERY_SESSION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqExtractDiagnosticReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqExtractDiagnosticReport`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `reportstoretype` : UInt, `reportkey` : `windows_sys`.`core`.`PCWSTR`, `destinationpath` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqFreeDiagnosticRecordLocaleTags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqFreeDiagnosticRecordLocaleTags`(`htagdescription` : `HDIAGNOSTIC_EVENT_TAG_DESCRIPTION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqFreeDiagnosticRecordPage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqFreeDiagnosticRecordPage`(`hrecord` : `HDIAGNOSTIC_RECORD`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqFreeDiagnosticRecordProducerCategories; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqFreeDiagnosticRecordProducerCategories`(`hcategorydescription` : `HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqFreeDiagnosticRecordProducers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqFreeDiagnosticRecordProducers`(`hproducerdescription` : `HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqFreeDiagnosticReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqFreeDiagnosticReport`(`hreport` : `HDIAGNOSTIC_REPORT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticDataAccessLevelAllowed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticDataAccessLevelAllowed`(`accesslevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DdqAccessLevel`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordAtIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordAtIndex`(`hrecord` : `HDIAGNOSTIC_RECORD`, `index` : UInt, `record` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_RECORD`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordBinaryDistribution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordBinaryDistribution`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `producernames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `producernamecount` : UInt, `topnbinaries` : UInt, `binarystats` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DIAGNOSTIC_DATA_EVENT_BINARY_STATS`>>?, `statcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordCategoryAtIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordCategoryAtIndex`(`hcategorydescription` : `HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION`, `index` : UInt, `categorydescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_EVENT_CATEGORY_DESCRIPTION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordCategoryCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordCategoryCount`(`hcategorydescription` : `HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION`, `categorydescriptioncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordCount`(`hrecord` : `HDIAGNOSTIC_RECORD`, `recordcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordLocaleTagAtIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordLocaleTagAtIndex`(`htagdescription` : `HDIAGNOSTIC_EVENT_TAG_DESCRIPTION`, `index` : UInt, `tagdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_EVENT_TAG_DESCRIPTION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordLocaleTagCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordLocaleTagCount`(`htagdescription` : `HDIAGNOSTIC_EVENT_TAG_DESCRIPTION`, `tagdescriptioncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordLocaleTags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordLocaleTags`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `locale` : `windows_sys`.`core`.`PCWSTR`, `htagdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDIAGNOSTIC_EVENT_TAG_DESCRIPTION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordPage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordPage`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `searchcriteria` : /* Rust *const */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_SEARCH_CRITERIA`>?, `offset` : UInt, `pagerecordcount` : UInt, `baserowid` : Long, `hrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDIAGNOSTIC_RECORD`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordPayload; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordPayload`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `rowid` : Long, `payload` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordProducerAtIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordProducerAtIndex`(`hproducerdescription` : `HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION`, `index` : UInt, `producerdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_EVENT_PRODUCER_DESCRIPTION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordProducerCategories; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordProducerCategories`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `producername` : `windows_sys`.`core`.`PCWSTR`, `hcategorydescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordProducerCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordProducerCount`(`hproducerdescription` : `HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION`, `producerdescriptioncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordProducers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordProducers`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `hproducerdescription` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordStats`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `searchcriteria` : /* Rust *const */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_SEARCH_CRITERIA`>?, `recordcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `minrowid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?, `maxrowid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordSummary; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordSummary`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `producernames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `producernamecount` : UInt, `generalstats` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_GENERAL_STATS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticRecordTagDistribution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticRecordTagDistribution`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `producernames` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?, `producernamecount` : UInt, `tagstats` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`DIAGNOSTIC_DATA_EVENT_TAG_STATS`>>?, `statcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticReport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticReport`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `reportstoretype` : UInt, `hreport` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HDIAGNOSTIC_REPORT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticReportAtIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticReportAtIndex`(`hreport` : `HDIAGNOSTIC_REPORT`, `index` : UInt, `report` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_REPORT_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticReportCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticReportCount`(`hreport` : `HDIAGNOSTIC_REPORT`, `reportcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetDiagnosticReportStoreReportCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetDiagnosticReportStoreReportCount`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `reportstoretype` : UInt, `reportcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetSessionAccessLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetSessionAccessLevel`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `accesslevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DdqAccessLevel`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqGetTranscriptConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqGetTranscriptConfiguration`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `currentconfig` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_EVENT_TRANSCRIPT_CONFIGURATION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqIsDiagnosticRecordSampledIn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqIsDiagnosticRecordSampledIn`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `providergroup` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providerid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `providername` : `windows_sys`.`core`.`PCWSTR`, `eventid` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `eventname` : `windows_sys`.`core`.`PCWSTR`, `eventversion` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `eventkeywords` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `issampledin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=diagnosticdataquery.dll, ABI=system, export=DdqSetTranscriptConfiguration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DdqSetTranscriptConfiguration`(`hsession` : `HDIAGNOSTIC_DATA_QUERY_SESSION`, `desiredconfig` : /* Rust *const */ kotlinx.cinterop.CPointer<`DIAGNOSTIC_DATA_EVENT_TRANSCRIPT_CONFIGURATION`>?) : `windows_sys`.`core`.`HRESULT`
public const val `AllUserData`: `DdqAccessLevel` = 2;
public const val `CurrentUserData`: `DdqAccessLevel` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_DATA_EVENT_BINARY_STATS` (
    public var `moduleName`: `windows_sys`.`core`.`PWSTR`,
    public var `friendlyModuleName`: `windows_sys`.`core`.`PWSTR`,
    public var `eventCount`: UInt,
    public var `uploadSizeBytes`: ULong,
)
// UNSUPPORTED Rust 46:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_DATA_EVENT_BINARY_STATS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_DATA_EVENT_CATEGORY_DESCRIPTION` (
    public var `id`: Int,
    public var `name`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 57:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_DATA_EVENT_CATEGORY_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_DATA_EVENT_PRODUCER_DESCRIPTION` (
    public var `name`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 67:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_DATA_EVENT_PRODUCER_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_DATA_EVENT_TAG_DESCRIPTION` (
    public var `privacyTag`: Int,
    public var `name`: `windows_sys`.`core`.`PWSTR`,
    public var `description`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 79:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_DATA_EVENT_TAG_DESCRIPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIAGNOSTIC_DATA_EVENT_TAG_STATS` (
    public var `privacyTag`: Int,
    public var `eventCount`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIAGNOSTIC_DATA_EVENT_TRANSCRIPT_CONFIGURATION` (
    public var `hoursOfHistoryToKeep`: UInt,
    public var `maxStoreMegabytes`: UInt,
    public var `requestedMaxStoreMegabytes`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DIAGNOSTIC_DATA_GENERAL_STATS` (
    public var `optInLevel`: UInt,
    public var `transcriptSizeBytes`: ULong,
    public var `oldestEventTimestamp`: ULong,
    public var `totalEventCountLast24Hours`: UInt,
    public var `averageDailyEvents`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_DATA_RECORD` (
    public var `rowId`: Long,
    public var `timestamp`: ULong,
    public var `eventKeywords`: ULong,
    public var `fullEventName`: `windows_sys`.`core`.`PWSTR`,
    public var `providerGroupGuid`: `windows_sys`.`core`.`PWSTR`,
    public var `producerName`: `windows_sys`.`core`.`PWSTR`,
    public var `privacyTags`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `privacyTagCount`: UInt,
    public var `categoryIds`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `categoryIdCount`: UInt,
    public var `isCoreData`: `windows_sys`.`core`.`BOOL`,
    public var `extra1`: `windows_sys`.`core`.`PWSTR`,
    public var `extra2`: `windows_sys`.`core`.`PWSTR`,
    public var `extra3`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 124:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_DATA_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_DATA_SEARCH_CRITERIA` (
    public var `producerNames`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
    public var `producerNameCount`: UInt,
    public var `textToMatch`: `windows_sys`.`core`.`PCWSTR`,
    public var `categoryIds`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `categoryIdCount`: UInt,
    public var `privacyTags`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?,
    public var `privacyTagCount`: UInt,
    public var `coreDataOnly`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 141:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_DATA_SEARCH_CRITERIA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_REPORT_DATA` (
    public var `signature`: `DIAGNOSTIC_REPORT_SIGNATURE`,
    public var `bucketId`: `windows_sys`.`core`.`GUID`,
    public var `reportId`: `windows_sys`.`core`.`GUID`,
    public var `creationTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `sizeInBytes`: ULong,
    public var `cabId`: `windows_sys`.`core`.`PWSTR`,
    public var `reportStatus`: UInt,
    public var `reportIntegratorId`: `windows_sys`.`core`.`GUID`,
    public var `fileNames`: /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?,
    public var `fileCount`: UInt,
    public var `friendlyEventName`: `windows_sys`.`core`.`PWSTR`,
    public var `applicationName`: `windows_sys`.`core`.`PWSTR`,
    public var `applicationPath`: `windows_sys`.`core`.`PWSTR`,
    public var `description`: `windows_sys`.`core`.`PWSTR`,
    public var `bucketIdString`: `windows_sys`.`core`.`PWSTR`,
    public var `legacyBucketId`: ULong,
    public var `reportKey`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 167:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_REPORT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 129 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_REPORT_PARAMETER` (
    public var `name`: UShortArray,
    public var `value`: UShortArray,
)
// UNSUPPORTED Rust 178:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_REPORT_PARAMETER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 65 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DIAGNOSTIC_REPORT_SIGNATURE` (
    public var `eventName`: UShortArray,
    public var `parameters`: Array<`DIAGNOSTIC_REPORT_PARAMETER`>,
)
// UNSUPPORTED Rust 189:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DIAGNOSTIC_REPORT_SIGNATURE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DdqAccessLevel` = Int;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDIAGNOSTIC_DATA_QUERY_SESSION` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDIAGNOSTIC_EVENT_TAG_DESCRIPTION` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDIAGNOSTIC_RECORD` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDIAGNOSTIC_REPORT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `NoData`: `DdqAccessLevel` = 0;
