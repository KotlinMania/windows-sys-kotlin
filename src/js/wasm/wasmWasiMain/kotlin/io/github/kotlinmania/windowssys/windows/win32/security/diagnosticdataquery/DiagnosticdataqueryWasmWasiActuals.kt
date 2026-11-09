@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun DdqCancelDiagnosticRecordOperation(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    0

public actual fun DdqCloseSession(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    0

public actual fun DdqCreateSession(accesslevel: DdqAccessLevel, hsession: Long): HRESULT =
    0

public actual fun DdqExtractDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportkey: PCWSTR, destinationpath: PCWSTR): HRESULT =
    0

public actual fun DdqFreeDiagnosticRecordLocaleTags(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION): HRESULT =
    0

public actual fun DdqFreeDiagnosticRecordPage(hrecord: HDIAGNOSTIC_RECORD): HRESULT =
    0

public actual fun DdqFreeDiagnosticRecordProducerCategories(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION): HRESULT =
    0

public actual fun DdqFreeDiagnosticRecordProducers(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION): HRESULT =
    0

public actual fun DdqFreeDiagnosticReport(hreport: HDIAGNOSTIC_REPORT): HRESULT =
    0

public actual fun DdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordAtIndex(hrecord: HDIAGNOSTIC_RECORD, index: UInt, record: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordBinaryDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, topnbinaries: UInt, binarystats: Long, statcount: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, index: UInt, categorydescription: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordCategoryCount(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, categorydescriptioncount: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordCount(hrecord: HDIAGNOSTIC_RECORD, recordcount: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, index: UInt, tagdescription: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordLocaleTagCount(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, tagdescriptioncount: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordLocaleTags(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, locale: PCWSTR, htagdescription: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordPage(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordPayload(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, rowid: Long, payload: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, index: UInt, producerdescription: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordProducerCategories(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producername: PCWSTR, hcategorydescription: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordProducerCount(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, producerdescriptioncount: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordProducers(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, hproducerdescription: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordStats(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordSummary(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, generalstats: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticRecordTagDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, tagstats: Long, statcount: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, hreport: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticReportAtIndex(hreport: HDIAGNOSTIC_REPORT, index: UInt, report: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticReportCount(hreport: HDIAGNOSTIC_REPORT, reportcount: Long): HRESULT =
    0

public actual fun DdqGetDiagnosticReportStoreReportCount(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportcount: Long): HRESULT =
    0

public actual fun DdqGetSessionAccessLevel(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, accesslevel: Long): HRESULT =
    0

public actual fun DdqGetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, currentconfig: Long): HRESULT =
    0

public actual fun DdqIsDiagnosticRecordSampledIn(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, providergroup: Long, providerid: Long, providername: PCWSTR, eventid: Long, eventname: PCWSTR, eventversion: Long, eventkeywords: Long, issampledin: Long): HRESULT =
    0

public actual fun DdqSetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, desiredconfig: Long): HRESULT =
    0
