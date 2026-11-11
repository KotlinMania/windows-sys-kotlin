@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqCancelDiagnosticRecordOperation
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqCloseSession
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqCreateSession
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqExtractDiagnosticReport
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordLocaleTags
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordPage
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducerCategories
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducers
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticReport
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticDataAccessLevelAllowed
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordBinaryDistribution
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTags
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPage
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPayload
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCategories
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducers
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordStats
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordSummary
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordTagDistribution
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReport
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportStoreReportCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetSessionAccessLevel
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqGetTranscriptConfiguration
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqIsDiagnosticRecordSampledIn
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssys_windows_win32_security_diagnosticdataquery_ddqSetTranscriptConfiguration
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqCancelDiagnosticRecordOperation(hsession?.value?.toCPointer<ByteVar>())

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqCloseSession(hsession?.value?.toCPointer<ByteVar>())

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqCreateSession(accesslevel, hsession?.value?.toCPointer<ByteVar>())

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqExtractDiagnosticReport(hsession?.value?.toCPointer<ByteVar>(), reportstoretype, reportkey?.value?.toCPointer<ByteVar>(), destinationpath?.value?.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordLocaleTags(htagdescription?.value?.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordPage(hrecord?.value?.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducerCategories(hcategorydescription?.value?.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducers(hproducerdescription?.value?.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticReport(hreport?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticDataAccessLevelAllowed(accesslevel?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordAtIndex(hrecord?.value?.toCPointer<ByteVar>(), index, record?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, topnbinaries: UInt, binarystats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordBinaryDistribution(hsession?.value?.toCPointer<ByteVar>(), producernames?.value?.toCPointer<ByteVar>(), producernamecount, topnbinaries, binarystats?.value?.toCPointer<ByteVar>(), statcount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription?.value?.toCPointer<ByteVar>(), index, categorydescription?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryCount(hcategorydescription?.value?.toCPointer<ByteVar>(), categorydescriptioncount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCount(hrecord?.value?.toCPointer<ByteVar>(), recordcount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription?.value?.toCPointer<ByteVar>(), index, tagdescription?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagCount(htagdescription?.value?.toCPointer<ByteVar>(), tagdescriptioncount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTags(hsession?.value?.toCPointer<ByteVar>(), locale?.value?.toCPointer<ByteVar>(), htagdescription?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPage(hsession?.value?.toCPointer<ByteVar>(), searchcriteria?.value?.toCPointer<ByteVar>(), offset, pagerecordcount, baserowid, hrecord?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPayload(hsession?.value?.toCPointer<ByteVar>(), rowid, payload?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription?.value?.toCPointer<ByteVar>(), index, producerdescription?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCategories(hsession?.value?.toCPointer<ByteVar>(), producername?.value?.toCPointer<ByteVar>(), hcategorydescription?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCount(hproducerdescription?.value?.toCPointer<ByteVar>(), producerdescriptioncount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducers(hsession?.value?.toCPointer<ByteVar>(), hproducerdescription?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, recordcount: COpaquePointer?, minrowid: COpaquePointer?, maxrowid: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordStats(hsession?.value?.toCPointer<ByteVar>(), searchcriteria?.value?.toCPointer<ByteVar>(), recordcount?.value?.toCPointer<ByteVar>(), minrowid?.value?.toCPointer<ByteVar>(), maxrowid?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, generalstats: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordSummary(hsession?.value?.toCPointer<ByteVar>(), producernames?.value?.toCPointer<ByteVar>(), producernamecount, generalstats?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, tagstats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordTagDistribution(hsession?.value?.toCPointer<ByteVar>(), producernames?.value?.toCPointer<ByteVar>(), producernamecount, tagstats?.value?.toCPointer<ByteVar>(), statcount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReport(hsession?.value?.toCPointer<ByteVar>(), reportstoretype, hreport?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportAtIndex(hreport?.value?.toCPointer<ByteVar>(), index, report?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportCount(hreport?.value?.toCPointer<ByteVar>(), reportcount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportStoreReportCount(hsession?.value?.toCPointer<ByteVar>(), reportstoretype, reportcount?.value?.toCPointer<ByteVar>())

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetSessionAccessLevel(hsession?.value?.toCPointer<ByteVar>(), accesslevel?.value?.toCPointer<ByteVar>())

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqGetTranscriptConfiguration(hsession?.value?.toCPointer<ByteVar>(), currentconfig?.value?.toCPointer<ByteVar>())

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: COpaquePointer?, providerid: COpaquePointer?, providername: Pcwstr, eventid: COpaquePointer?, eventname: Pcwstr, eventversion: COpaquePointer?, eventkeywords: COpaquePointer?, issampledin: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqIsDiagnosticRecordSampledIn(hsession?.value?.toCPointer<ByteVar>(), providergroup?.value?.toCPointer<ByteVar>(), providerid?.value?.toCPointer<ByteVar>(), providername?.value?.toCPointer<ByteVar>(), eventid?.value?.toCPointer<ByteVar>(), eventname?.value?.toCPointer<ByteVar>(), eventversion?.value?.toCPointer<ByteVar>(), eventkeywords?.value?.toCPointer<ByteVar>(), issampledin?.value?.toCPointer<ByteVar>())

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_diagnosticdataquery_ddqSetTranscriptConfiguration(hsession?.value?.toCPointer<ByteVar>(), desiredconfig?.value?.toCPointer<ByteVar>())
