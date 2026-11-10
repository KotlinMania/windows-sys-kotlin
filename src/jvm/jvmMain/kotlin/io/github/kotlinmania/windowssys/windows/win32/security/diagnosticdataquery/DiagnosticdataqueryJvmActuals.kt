@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SecurityDiagnosticdataqueryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqCancelDiagnosticRecordOperation(hsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqCloseSession(hsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqCreateSession(accesslevel: Int, hsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqExtractDiagnosticReport(hsession: Long, reportstoretype: Int, reportkey: Long, destinationpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordLocaleTags(htagdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordPage(hrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducers(hproducerdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticReport(hreport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordAtIndex(hrecord: Long, index: Int, record: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordBinaryDistribution(hsession: Long, producernames: Long, producernamecount: Int, topnbinaries: Int, binarystats: Long, statcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: Long, index: Int, categorydescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryCount(hcategorydescription: Long, categorydescriptioncount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCount(hrecord: Long, recordcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: Long, index: Int, tagdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagCount(htagdescription: Long, tagdescriptioncount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTags(hsession: Long, locale: Long, htagdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPage(hsession: Long, searchcriteria: Long, offset: Int, pagerecordcount: Int, baserowid: Long, hrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPayload(hsession: Long, rowid: Long, payload: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: Long, index: Int, producerdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCategories(hsession: Long, producername: Long, hcategorydescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCount(hproducerdescription: Long, producerdescriptioncount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducers(hsession: Long, hproducerdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordStats(hsession: Long, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordSummary(hsession: Long, producernames: Long, producernamecount: Int, generalstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordTagDistribution(hsession: Long, producernames: Long, producernamecount: Int, tagstats: Long, statcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReport(hsession: Long, reportstoretype: Int, hreport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportAtIndex(hreport: Long, index: Int, report: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportCount(hreport: Long, reportcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportStoreReportCount(hsession: Long, reportstoretype: Int, reportcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetSessionAccessLevel(hsession: Long, accesslevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqGetTranscriptConfiguration(hsession: Long, currentconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqIsDiagnosticRecordSampledIn(hsession: Long, providergroup: Long, providerid: Long, providername: Long, eventid: Long, eventname: Long, eventversion: Long, eventkeywords: Long, issampledin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_ddqSetTranscriptConfiguration(hsession: Long, desiredconfig: Long): Int
}

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqCancelDiagnosticRecordOperation((hsession?.value ?: 0L))

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqCloseSession((hsession?.value ?: 0L))

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqCreateSession(accesslevel, (hsession?.value ?: 0L))

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqExtractDiagnosticReport((hsession?.value ?: 0L), reportstoretype.toInt(), (reportkey?.value ?: 0L), (destinationpath?.value ?: 0L))

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordLocaleTags((htagdescription?.value ?: 0L))

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordPage((hrecord?.value ?: 0L))

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducerCategories((hcategorydescription?.value ?: 0L))

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducers((hproducerdescription?.value ?: 0L))

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticReport((hreport?.value ?: 0L))

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticDataAccessLevelAllowed((accesslevel?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordAtIndex((hrecord?.value ?: 0L), index.toInt(), (record?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, topnbinaries: UInt, binarystats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordBinaryDistribution((hsession?.value ?: 0L), (producernames?.value ?: 0L), producernamecount.toInt(), topnbinaries.toInt(), (binarystats?.value ?: 0L), (statcount?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryAtIndex((hcategorydescription?.value ?: 0L), index.toInt(), (categorydescription?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryCount((hcategorydescription?.value ?: 0L), (categorydescriptioncount?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCount((hrecord?.value ?: 0L), (recordcount?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagAtIndex((htagdescription?.value ?: 0L), index.toInt(), (tagdescription?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagCount((htagdescription?.value ?: 0L), (tagdescriptioncount?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTags((hsession?.value ?: 0L), (locale?.value ?: 0L), (htagdescription?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPage((hsession?.value ?: 0L), (searchcriteria?.value ?: 0L), offset.toInt(), pagerecordcount.toInt(), baserowid, (hrecord?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPayload((hsession?.value ?: 0L), rowid, (payload?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerAtIndex((hproducerdescription?.value ?: 0L), index.toInt(), (producerdescription?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCategories((hsession?.value ?: 0L), (producername?.value ?: 0L), (hcategorydescription?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCount((hproducerdescription?.value ?: 0L), (producerdescriptioncount?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducers((hsession?.value ?: 0L), (hproducerdescription?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, recordcount: COpaquePointer?, minrowid: COpaquePointer?, maxrowid: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordStats((hsession?.value ?: 0L), (searchcriteria?.value ?: 0L), (recordcount?.value ?: 0L), (minrowid?.value ?: 0L), (maxrowid?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, generalstats: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordSummary((hsession?.value ?: 0L), (producernames?.value ?: 0L), producernamecount.toInt(), (generalstats?.value ?: 0L))

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, tagstats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordTagDistribution((hsession?.value ?: 0L), (producernames?.value ?: 0L), producernamecount.toInt(), (tagstats?.value ?: 0L), (statcount?.value ?: 0L))

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReport((hsession?.value ?: 0L), reportstoretype.toInt(), (hreport?.value ?: 0L))

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportAtIndex((hreport?.value ?: 0L), index.toInt(), (report?.value ?: 0L))

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportCount((hreport?.value ?: 0L), (reportcount?.value ?: 0L))

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportStoreReportCount((hsession?.value ?: 0L), reportstoretype.toInt(), (reportcount?.value ?: 0L))

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetSessionAccessLevel((hsession?.value ?: 0L), (accesslevel?.value ?: 0L))

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqGetTranscriptConfiguration((hsession?.value ?: 0L), (currentconfig?.value ?: 0L))

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: COpaquePointer?, providerid: COpaquePointer?, providername: Pcwstr, eventid: COpaquePointer?, eventname: Pcwstr, eventversion: COpaquePointer?, eventkeywords: COpaquePointer?, issampledin: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqIsDiagnosticRecordSampledIn((hsession?.value ?: 0L), (providergroup?.value ?: 0L), (providerid?.value ?: 0L), (providername?.value ?: 0L), (eventid?.value ?: 0L), (eventname?.value ?: 0L), (eventversion?.value ?: 0L), (eventkeywords?.value ?: 0L), (issampledin?.value ?: 0L))

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: COpaquePointer?): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_ddqSetTranscriptConfiguration((hsession?.value ?: 0L), (desiredconfig?.value ?: 0L))
