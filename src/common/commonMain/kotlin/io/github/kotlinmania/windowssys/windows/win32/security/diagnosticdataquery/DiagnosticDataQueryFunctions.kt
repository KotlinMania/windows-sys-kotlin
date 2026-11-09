package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun DdqCancelDiagnosticRecordOperation(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT

public expect fun DdqCloseSession(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT

public expect fun DdqCreateSession(accesslevel: DdqAccessLevel, hsession: Long): HRESULT

public expect fun DdqExtractDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportkey: PCWSTR, destinationpath: PCWSTR): HRESULT

public expect fun DdqFreeDiagnosticRecordLocaleTags(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION): HRESULT

public expect fun DdqFreeDiagnosticRecordPage(hrecord: HDIAGNOSTIC_RECORD): HRESULT

public expect fun DdqFreeDiagnosticRecordProducerCategories(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION): HRESULT

public expect fun DdqFreeDiagnosticRecordProducers(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION): HRESULT

public expect fun DdqFreeDiagnosticReport(hreport: HDIAGNOSTIC_REPORT): HRESULT

public expect fun DdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): HRESULT

public expect fun DdqGetDiagnosticRecordAtIndex(hrecord: HDIAGNOSTIC_RECORD, index: UInt, record: Long): HRESULT

public expect fun DdqGetDiagnosticRecordBinaryDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, topnbinaries: UInt, binarystats: Long, statcount: Long): HRESULT

public expect fun DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, index: UInt, categorydescription: Long): HRESULT

public expect fun DdqGetDiagnosticRecordCategoryCount(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, categorydescriptioncount: Long): HRESULT

public expect fun DdqGetDiagnosticRecordCount(hrecord: HDIAGNOSTIC_RECORD, recordcount: Long): HRESULT

public expect fun DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, index: UInt, tagdescription: Long): HRESULT

public expect fun DdqGetDiagnosticRecordLocaleTagCount(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, tagdescriptioncount: Long): HRESULT

public expect fun DdqGetDiagnosticRecordLocaleTags(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, locale: PCWSTR, htagdescription: Long): HRESULT

public expect fun DdqGetDiagnosticRecordPage(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: Long): HRESULT

public expect fun DdqGetDiagnosticRecordPayload(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, rowid: Long, payload: Long): HRESULT

public expect fun DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, index: UInt, producerdescription: Long): HRESULT

public expect fun DdqGetDiagnosticRecordProducerCategories(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producername: PCWSTR, hcategorydescription: Long): HRESULT

public expect fun DdqGetDiagnosticRecordProducerCount(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, producerdescriptioncount: Long): HRESULT

public expect fun DdqGetDiagnosticRecordProducers(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, hproducerdescription: Long): HRESULT

public expect fun DdqGetDiagnosticRecordStats(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): HRESULT

public expect fun DdqGetDiagnosticRecordSummary(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, generalstats: Long): HRESULT

public expect fun DdqGetDiagnosticRecordTagDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, tagstats: Long, statcount: Long): HRESULT

public expect fun DdqGetDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, hreport: Long): HRESULT

public expect fun DdqGetDiagnosticReportAtIndex(hreport: HDIAGNOSTIC_REPORT, index: UInt, report: Long): HRESULT

public expect fun DdqGetDiagnosticReportCount(hreport: HDIAGNOSTIC_REPORT, reportcount: Long): HRESULT

public expect fun DdqGetDiagnosticReportStoreReportCount(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportcount: Long): HRESULT

public expect fun DdqGetSessionAccessLevel(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, accesslevel: Long): HRESULT

public expect fun DdqGetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, currentconfig: Long): HRESULT

public expect fun DdqIsDiagnosticRecordSampledIn(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, providergroup: Long, providerid: Long, providername: PCWSTR, eventid: Long, eventname: PCWSTR, eventversion: Long, eventkeywords: Long, issampledin: Long): HRESULT

public expect fun DdqSetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, desiredconfig: Long): HRESULT
