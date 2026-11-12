@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn
import io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery.cinterop.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(hsession.rawAddress.toCPointer<ByteVar>())

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(hsession.rawAddress.toCPointer<ByteVar>())

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: MutPtr<HdiagnosticDataQuerySession>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(accesslevel, hsession.rawAddress.toCPointer<ByteVar>())

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(hsession.rawAddress.toCPointer<ByteVar>(), reportstoretype, reportkey.rawAddress.toCPointer<ByteVar>(), destinationpath.rawAddress.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(htagdescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(hrecord.rawAddress.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(hcategorydescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(hproducerdescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(hreport.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: MutPtr<DdqAccessLevel>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(accesslevel.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: MutPtr<DiagnosticDataRecord>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(hrecord.rawAddress.toCPointer<ByteVar>(), index, record.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, topnbinaries: UInt, binarystats: MutPtr<MutPtr<DiagnosticDataEventBinaryStats>>, statcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(hsession.rawAddress.toCPointer<ByteVar>(), producernames.rawAddress.toCPointer<ByteVar>(), producernamecount, topnbinaries, binarystats.rawAddress.toCPointer<ByteVar>(), statcount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: MutPtr<DiagnosticDataEventCategoryDescription>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription.rawAddress.toCPointer<ByteVar>(), index, categorydescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(hcategorydescription.rawAddress.toCPointer<ByteVar>(), categorydescriptioncount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(hrecord.rawAddress.toCPointer<ByteVar>(), recordcount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: MutPtr<DiagnosticDataEventTagDescription>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription.rawAddress.toCPointer<ByteVar>(), index, tagdescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(htagdescription.rawAddress.toCPointer<ByteVar>(), tagdescriptioncount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: MutPtr<HdiagnosticEventTagDescription>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(hsession.rawAddress.toCPointer<ByteVar>(), locale.rawAddress.toCPointer<ByteVar>(), htagdescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr<DiagnosticDataSearchCriteria>, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: MutPtr<HdiagnosticRecord>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(hsession.rawAddress.toCPointer<ByteVar>(), searchcriteria.rawAddress.toCPointer<ByteVar>(), offset, pagerecordcount, baserowid, hrecord.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: MutPtr<Pcwstr>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(hsession.rawAddress.toCPointer<ByteVar>(), rowid, payload.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: MutPtr<DiagnosticDataEventProducerDescription>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(hproducerdescription.rawAddress.toCPointer<ByteVar>(), index, producerdescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: MutPtr<HdiagnosticEventCategoryDescription>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(hsession.rawAddress.toCPointer<ByteVar>(), producername.rawAddress.toCPointer<ByteVar>(), hcategorydescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(hproducerdescription.rawAddress.toCPointer<ByteVar>(), producerdescriptioncount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: MutPtr<HdiagnosticEventProducerDescription>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(hsession.rawAddress.toCPointer<ByteVar>(), hproducerdescription.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr<DiagnosticDataSearchCriteria>, recordcount: MutPtr<UInt>, minrowid: MutPtr<Long>, maxrowid: MutPtr<Long>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(hsession.rawAddress.toCPointer<ByteVar>(), searchcriteria.rawAddress.toCPointer<ByteVar>(), recordcount.rawAddress.toCPointer<ByteVar>(), minrowid.rawAddress.toCPointer<ByteVar>(), maxrowid.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, generalstats: MutPtr<DiagnosticDataGeneralStats>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(hsession.rawAddress.toCPointer<ByteVar>(), producernames.rawAddress.toCPointer<ByteVar>(), producernamecount, generalstats.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, tagstats: MutPtr<MutPtr<DiagnosticDataEventTagStats>>, statcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(hsession.rawAddress.toCPointer<ByteVar>(), producernames.rawAddress.toCPointer<ByteVar>(), producernamecount, tagstats.rawAddress.toCPointer<ByteVar>(), statcount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: MutPtr<HdiagnosticReport>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(hsession.rawAddress.toCPointer<ByteVar>(), reportstoretype, hreport.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: MutPtr<DiagnosticReportData>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(hreport.rawAddress.toCPointer<ByteVar>(), index, report.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(hreport.rawAddress.toCPointer<ByteVar>(), reportcount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(hsession.rawAddress.toCPointer<ByteVar>(), reportstoretype, reportcount.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: MutPtr<DdqAccessLevel>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(hsession.rawAddress.toCPointer<ByteVar>(), accesslevel.rawAddress.toCPointer<ByteVar>())

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: MutPtr<DiagnosticDataEventTranscriptConfiguration>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(hsession.rawAddress.toCPointer<ByteVar>(), currentconfig.rawAddress.toCPointer<ByteVar>())

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: ConstPtr<Guid>, providerid: ConstPtr<Guid>, providername: Pcwstr, eventid: ConstPtr<UInt>, eventname: Pcwstr, eventversion: ConstPtr<UInt>, eventkeywords: ConstPtr<ULong>, issampledin: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(hsession.rawAddress.toCPointer<ByteVar>(), providergroup.rawAddress.toCPointer<ByteVar>(), providerid.rawAddress.toCPointer<ByteVar>(), providername.rawAddress.toCPointer<ByteVar>(), eventid.rawAddress.toCPointer<ByteVar>(), eventname.rawAddress.toCPointer<ByteVar>(), eventversion.rawAddress.toCPointer<ByteVar>(), eventkeywords.rawAddress.toCPointer<ByteVar>(), issampledin.rawAddress.toCPointer<ByteVar>())

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: ConstPtr<DiagnosticDataEventTranscriptConfiguration>): Hresult =
    windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(hsession.rawAddress.toCPointer<ByteVar>(), desiredconfig.rawAddress.toCPointer<ByteVar>())
