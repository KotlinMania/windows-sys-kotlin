@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32SecurityDiagnosticdataqueryNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun DdqCancelDiagnosticRecordOperation(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqCancelDiagnosticRecordOperation(hsession.toString()) as Int) else 0

public actual fun DdqCloseSession(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqCloseSession(hsession.toString()) as Int) else 0

public actual fun DdqCreateSession(accesslevel: DdqAccessLevel, hsession: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqCreateSession(accesslevel, hsession.toString()) as Int) else 0

public actual fun DdqExtractDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportkey: PCWSTR, destinationpath: PCWSTR): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqExtractDiagnosticReport(hsession.toString(), reportstoretype.toInt(), reportkey.toString(), destinationpath.toString()) as Int) else 0

public actual fun DdqFreeDiagnosticRecordLocaleTags(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordLocaleTags(htagdescription.toString()) as Int) else 0

public actual fun DdqFreeDiagnosticRecordPage(hrecord: HDIAGNOSTIC_RECORD): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordPage(hrecord.toString()) as Int) else 0

public actual fun DdqFreeDiagnosticRecordProducerCategories(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducerCategories(hcategorydescription.toString()) as Int) else 0

public actual fun DdqFreeDiagnosticRecordProducers(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticRecordProducers(hproducerdescription.toString()) as Int) else 0

public actual fun DdqFreeDiagnosticReport(hreport: HDIAGNOSTIC_REPORT): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqFreeDiagnosticReport(hreport.toString()) as Int) else 0

public actual fun DdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticDataAccessLevelAllowed(accesslevel.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordAtIndex(hrecord: HDIAGNOSTIC_RECORD, index: UInt, record: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordAtIndex(hrecord.toString(), index.toInt(), record.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordBinaryDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, topnbinaries: UInt, binarystats: Long, statcount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordBinaryDistribution(hsession.toString(), producernames.toString(), producernamecount.toInt(), topnbinaries.toInt(), binarystats.toString(), statcount.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, index: UInt, categorydescription: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription.toString(), index.toInt(), categorydescription.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordCategoryCount(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, categorydescriptioncount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCategoryCount(hcategorydescription.toString(), categorydescriptioncount.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordCount(hrecord: HDIAGNOSTIC_RECORD, recordcount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordCount(hrecord.toString(), recordcount.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, index: UInt, tagdescription: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription.toString(), index.toInt(), tagdescription.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordLocaleTagCount(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, tagdescriptioncount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTagCount(htagdescription.toString(), tagdescriptioncount.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordLocaleTags(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, locale: PCWSTR, htagdescription: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordLocaleTags(hsession.toString(), locale.toString(), htagdescription.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordPage(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPage(hsession.toString(), searchcriteria.toString(), offset.toInt(), pagerecordcount.toInt(), baserowid.toString(), hrecord.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordPayload(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, rowid: Long, payload: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordPayload(hsession.toString(), rowid.toString(), payload.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, index: UInt, producerdescription: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription.toString(), index.toInt(), producerdescription.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordProducerCategories(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producername: PCWSTR, hcategorydescription: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCategories(hsession.toString(), producername.toString(), hcategorydescription.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordProducerCount(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, producerdescriptioncount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducerCount(hproducerdescription.toString(), producerdescriptioncount.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordProducers(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, hproducerdescription: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordProducers(hsession.toString(), hproducerdescription.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordStats(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordStats(hsession.toString(), searchcriteria.toString(), recordcount.toString(), minrowid.toString(), maxrowid.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordSummary(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, generalstats: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordSummary(hsession.toString(), producernames.toString(), producernamecount.toInt(), generalstats.toString()) as Int) else 0

public actual fun DdqGetDiagnosticRecordTagDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, tagstats: Long, statcount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticRecordTagDistribution(hsession.toString(), producernames.toString(), producernamecount.toInt(), tagstats.toString(), statcount.toString()) as Int) else 0

public actual fun DdqGetDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, hreport: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReport(hsession.toString(), reportstoretype.toInt(), hreport.toString()) as Int) else 0

public actual fun DdqGetDiagnosticReportAtIndex(hreport: HDIAGNOSTIC_REPORT, index: UInt, report: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportAtIndex(hreport.toString(), index.toInt(), report.toString()) as Int) else 0

public actual fun DdqGetDiagnosticReportCount(hreport: HDIAGNOSTIC_REPORT, reportcount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportCount(hreport.toString(), reportcount.toString()) as Int) else 0

public actual fun DdqGetDiagnosticReportStoreReportCount(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportcount: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetDiagnosticReportStoreReportCount(hsession.toString(), reportstoretype.toInt(), reportcount.toString()) as Int) else 0

public actual fun DdqGetSessionAccessLevel(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, accesslevel: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetSessionAccessLevel(hsession.toString(), accesslevel.toString()) as Int) else 0

public actual fun DdqGetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, currentconfig: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqGetTranscriptConfiguration(hsession.toString(), currentconfig.toString()) as Int) else 0

public actual fun DdqIsDiagnosticRecordSampledIn(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, providergroup: Long, providerid: Long, providername: PCWSTR, eventid: Long, eventname: PCWSTR, eventversion: Long, eventkeywords: Long, issampledin: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqIsDiagnosticRecordSampledIn(hsession.toString(), providergroup.toString(), providerid.toString(), providername.toString(), eventid.toString(), eventname.toString(), eventversion.toString(), eventkeywords.toString(), issampledin.toString()) as Int) else 0

public actual fun DdqSetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, desiredconfig: Long): HRESULT =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_DdqSetTranscriptConfiguration(hsession.toString(), desiredconfig.toString()) as Int) else 0
