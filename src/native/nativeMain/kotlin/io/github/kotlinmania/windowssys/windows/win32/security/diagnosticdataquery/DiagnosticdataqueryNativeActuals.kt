@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun DdqCancelDiagnosticRecordOperation(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqCancelDiagnosticRecordOperation(hsession.toCPointer<ByteVar>())

public actual fun DdqCloseSession(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqCloseSession(hsession.toCPointer<ByteVar>())

public actual fun DdqCreateSession(accesslevel: DdqAccessLevel, hsession: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqCreateSession(accesslevel, hsession.toCPointer<ByteVar>())

public actual fun DdqExtractDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportkey: PCWSTR, destinationpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqExtractDiagnosticReport(hsession.toCPointer<ByteVar>(), reportstoretype, reportkey.toCPointer<ByteVar>(), destinationpath.toCPointer<ByteVar>())

public actual fun DdqFreeDiagnosticRecordLocaleTags(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordLocaleTags(htagdescription.toCPointer<ByteVar>())

public actual fun DdqFreeDiagnosticRecordPage(hrecord: HDIAGNOSTIC_RECORD): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordPage(hrecord.toCPointer<ByteVar>())

public actual fun DdqFreeDiagnosticRecordProducerCategories(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducerCategories(hcategorydescription.toCPointer<ByteVar>())

public actual fun DdqFreeDiagnosticRecordProducers(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducers(hproducerdescription.toCPointer<ByteVar>())

public actual fun DdqFreeDiagnosticReport(hreport: HDIAGNOSTIC_REPORT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticReport(hreport.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticDataAccessLevelAllowed(accesslevel.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordAtIndex(hrecord: HDIAGNOSTIC_RECORD, index: UInt, record: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordAtIndex(hrecord.toCPointer<ByteVar>(), index, record.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordBinaryDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, topnbinaries: UInt, binarystats: Long, statcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordBinaryDistribution(hsession.toCPointer<ByteVar>(), producernames.toCPointer<ByteVar>(), producernamecount, topnbinaries, binarystats.toCPointer<ByteVar>(), statcount.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, index: UInt, categorydescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription.toCPointer<ByteVar>(), index, categorydescription.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordCategoryCount(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, categorydescriptioncount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryCount(hcategorydescription.toCPointer<ByteVar>(), categorydescriptioncount.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordCount(hrecord: HDIAGNOSTIC_RECORD, recordcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCount(hrecord.toCPointer<ByteVar>(), recordcount.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, index: UInt, tagdescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription.toCPointer<ByteVar>(), index, tagdescription.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordLocaleTagCount(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, tagdescriptioncount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagCount(htagdescription.toCPointer<ByteVar>(), tagdescriptioncount.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordLocaleTags(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, locale: PCWSTR, htagdescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTags(hsession.toCPointer<ByteVar>(), locale.toCPointer<ByteVar>(), htagdescription.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordPage(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPage(hsession.toCPointer<ByteVar>(), searchcriteria.toCPointer<ByteVar>(), offset, pagerecordcount, baserowid, hrecord.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordPayload(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, rowid: Long, payload: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPayload(hsession.toCPointer<ByteVar>(), rowid, payload.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, index: UInt, producerdescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription.toCPointer<ByteVar>(), index, producerdescription.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordProducerCategories(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producername: PCWSTR, hcategorydescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCategories(hsession.toCPointer<ByteVar>(), producername.toCPointer<ByteVar>(), hcategorydescription.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordProducerCount(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, producerdescriptioncount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCount(hproducerdescription.toCPointer<ByteVar>(), producerdescriptioncount.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordProducers(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, hproducerdescription: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducers(hsession.toCPointer<ByteVar>(), hproducerdescription.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordStats(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordStats(hsession.toCPointer<ByteVar>(), searchcriteria.toCPointer<ByteVar>(), recordcount.toCPointer<ByteVar>(), minrowid.toCPointer<ByteVar>(), maxrowid.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordSummary(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, generalstats: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordSummary(hsession.toCPointer<ByteVar>(), producernames.toCPointer<ByteVar>(), producernamecount, generalstats.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticRecordTagDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, tagstats: Long, statcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordTagDistribution(hsession.toCPointer<ByteVar>(), producernames.toCPointer<ByteVar>(), producernamecount, tagstats.toCPointer<ByteVar>(), statcount.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, hreport: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReport(hsession.toCPointer<ByteVar>(), reportstoretype, hreport.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticReportAtIndex(hreport: HDIAGNOSTIC_REPORT, index: UInt, report: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportAtIndex(hreport.toCPointer<ByteVar>(), index, report.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticReportCount(hreport: HDIAGNOSTIC_REPORT, reportcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportCount(hreport.toCPointer<ByteVar>(), reportcount.toCPointer<ByteVar>())

public actual fun DdqGetDiagnosticReportStoreReportCount(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportStoreReportCount(hsession.toCPointer<ByteVar>(), reportstoretype, reportcount.toCPointer<ByteVar>())

public actual fun DdqGetSessionAccessLevel(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, accesslevel: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetSessionAccessLevel(hsession.toCPointer<ByteVar>(), accesslevel.toCPointer<ByteVar>())

public actual fun DdqGetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, currentconfig: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqGetTranscriptConfiguration(hsession.toCPointer<ByteVar>(), currentconfig.toCPointer<ByteVar>())

public actual fun DdqIsDiagnosticRecordSampledIn(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, providergroup: Long, providerid: Long, providername: PCWSTR, eventid: Long, eventname: PCWSTR, eventversion: Long, eventkeywords: Long, issampledin: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqIsDiagnosticRecordSampledIn(hsession.toCPointer<ByteVar>(), providergroup.toCPointer<ByteVar>(), providerid.toCPointer<ByteVar>(), providername.toCPointer<ByteVar>(), eventid.toCPointer<ByteVar>(), eventname.toCPointer<ByteVar>(), eventversion.toCPointer<ByteVar>(), eventkeywords.toCPointer<ByteVar>(), issampledin.toCPointer<ByteVar>())

public actual fun DdqSetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, desiredconfig: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_DdqSetTranscriptConfiguration(hsession.toCPointer<ByteVar>(), desiredconfig.toCPointer<ByteVar>())
