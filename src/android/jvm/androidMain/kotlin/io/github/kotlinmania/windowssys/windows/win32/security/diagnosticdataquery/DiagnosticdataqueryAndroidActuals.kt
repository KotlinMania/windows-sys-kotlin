@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SecurityDiagnosticdataqueryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqCancelDiagnosticRecordOperation(hsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqCloseSession(hsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqCreateSession(accesslevel: Int, hsession: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqExtractDiagnosticReport(hsession: Long, reportstoretype: Int, reportkey: Long, destinationpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordLocaleTags(htagdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordPage(hrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducerCategories(hcategorydescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducers(hproducerdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticReport(hreport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordAtIndex(hrecord: Long, index: Int, record: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordBinaryDistribution(hsession: Long, producernames: Long, producernamecount: Int, topnbinaries: Int, binarystats: Long, statcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: Long, index: Int, categorydescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryCount(hcategorydescription: Long, categorydescriptioncount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCount(hrecord: Long, recordcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: Long, index: Int, tagdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagCount(htagdescription: Long, tagdescriptioncount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTags(hsession: Long, locale: Long, htagdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPage(hsession: Long, searchcriteria: Long, offset: Int, pagerecordcount: Int, baserowid: Long, hrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPayload(hsession: Long, rowid: Long, payload: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: Long, index: Int, producerdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCategories(hsession: Long, producername: Long, hcategorydescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCount(hproducerdescription: Long, producerdescriptioncount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducers(hsession: Long, hproducerdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordStats(hsession: Long, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordSummary(hsession: Long, producernames: Long, producernamecount: Int, generalstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordTagDistribution(hsession: Long, producernames: Long, producernamecount: Int, tagstats: Long, statcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReport(hsession: Long, reportstoretype: Int, hreport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportAtIndex(hreport: Long, index: Int, report: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportCount(hreport: Long, reportcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportStoreReportCount(hsession: Long, reportstoretype: Int, reportcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetSessionAccessLevel(hsession: Long, accesslevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqGetTranscriptConfiguration(hsession: Long, currentconfig: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqIsDiagnosticRecordSampledIn(hsession: Long, providergroup: Long, providerid: Long, providername: Long, eventid: Long, eventname: Long, eventversion: Long, eventkeywords: Long, issampledin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_diagnosticdataquery_DdqSetTranscriptConfiguration(hsession: Long, desiredconfig: Long): Int
}

public actual fun DdqCancelDiagnosticRecordOperation(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqCancelDiagnosticRecordOperation(hsession)

public actual fun DdqCloseSession(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqCloseSession(hsession)

public actual fun DdqCreateSession(accesslevel: DdqAccessLevel, hsession: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqCreateSession(accesslevel, hsession)

public actual fun DdqExtractDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportkey: PCWSTR, destinationpath: PCWSTR): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqExtractDiagnosticReport(hsession, reportstoretype.toInt(), reportkey, destinationpath)

public actual fun DdqFreeDiagnosticRecordLocaleTags(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordLocaleTags(htagdescription)

public actual fun DdqFreeDiagnosticRecordPage(hrecord: HDIAGNOSTIC_RECORD): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordPage(hrecord)

public actual fun DdqFreeDiagnosticRecordProducerCategories(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducerCategories(hcategorydescription)

public actual fun DdqFreeDiagnosticRecordProducers(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducers(hproducerdescription)

public actual fun DdqFreeDiagnosticReport(hreport: HDIAGNOSTIC_REPORT): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticReport(hreport)

public actual fun DdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticDataAccessLevelAllowed(accesslevel)

public actual fun DdqGetDiagnosticRecordAtIndex(hrecord: HDIAGNOSTIC_RECORD, index: UInt, record: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordAtIndex(hrecord, index.toInt(), record)

public actual fun DdqGetDiagnosticRecordBinaryDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, topnbinaries: UInt, binarystats: Long, statcount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordBinaryDistribution(hsession, producernames, producernamecount.toInt(), topnbinaries.toInt(), binarystats, statcount)

public actual fun DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, index: UInt, categorydescription: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription, index.toInt(), categorydescription)

public actual fun DdqGetDiagnosticRecordCategoryCount(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, categorydescriptioncount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryCount(hcategorydescription, categorydescriptioncount)

public actual fun DdqGetDiagnosticRecordCount(hrecord: HDIAGNOSTIC_RECORD, recordcount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCount(hrecord, recordcount)

public actual fun DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, index: UInt, tagdescription: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription, index.toInt(), tagdescription)

public actual fun DdqGetDiagnosticRecordLocaleTagCount(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, tagdescriptioncount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagCount(htagdescription, tagdescriptioncount)

public actual fun DdqGetDiagnosticRecordLocaleTags(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, locale: PCWSTR, htagdescription: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTags(hsession, locale, htagdescription)

public actual fun DdqGetDiagnosticRecordPage(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPage(hsession, searchcriteria, offset.toInt(), pagerecordcount.toInt(), baserowid, hrecord)

public actual fun DdqGetDiagnosticRecordPayload(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, rowid: Long, payload: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPayload(hsession, rowid, payload)

public actual fun DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, index: UInt, producerdescription: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription, index.toInt(), producerdescription)

public actual fun DdqGetDiagnosticRecordProducerCategories(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producername: PCWSTR, hcategorydescription: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCategories(hsession, producername, hcategorydescription)

public actual fun DdqGetDiagnosticRecordProducerCount(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, producerdescriptioncount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCount(hproducerdescription, producerdescriptioncount)

public actual fun DdqGetDiagnosticRecordProducers(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, hproducerdescription: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducers(hsession, hproducerdescription)

public actual fun DdqGetDiagnosticRecordStats(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordStats(hsession, searchcriteria, recordcount, minrowid, maxrowid)

public actual fun DdqGetDiagnosticRecordSummary(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, generalstats: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordSummary(hsession, producernames, producernamecount.toInt(), generalstats)

public actual fun DdqGetDiagnosticRecordTagDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, tagstats: Long, statcount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordTagDistribution(hsession, producernames, producernamecount.toInt(), tagstats, statcount)

public actual fun DdqGetDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, hreport: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReport(hsession, reportstoretype.toInt(), hreport)

public actual fun DdqGetDiagnosticReportAtIndex(hreport: HDIAGNOSTIC_REPORT, index: UInt, report: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportAtIndex(hreport, index.toInt(), report)

public actual fun DdqGetDiagnosticReportCount(hreport: HDIAGNOSTIC_REPORT, reportcount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportCount(hreport, reportcount)

public actual fun DdqGetDiagnosticReportStoreReportCount(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportcount: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportStoreReportCount(hsession, reportstoretype.toInt(), reportcount)

public actual fun DdqGetSessionAccessLevel(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, accesslevel: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetSessionAccessLevel(hsession, accesslevel)

public actual fun DdqGetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, currentconfig: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqGetTranscriptConfiguration(hsession, currentconfig)

public actual fun DdqIsDiagnosticRecordSampledIn(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, providergroup: Long, providerid: Long, providername: PCWSTR, eventid: Long, eventname: PCWSTR, eventversion: Long, eventkeywords: Long, issampledin: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqIsDiagnosticRecordSampledIn(hsession, providergroup, providerid, providername, eventid, eventname, eventversion, eventkeywords, issampledin)

public actual fun DdqSetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, desiredconfig: Long): HRESULT =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssys_windows_win32_security_diagnosticdataquery_DdqSetTranscriptConfiguration(hsession, desiredconfig)
