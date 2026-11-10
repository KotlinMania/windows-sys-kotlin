@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val _windowsWin32SecurityDiagnosticdataqueryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqCancelDiagnosticRecordOperation((hsession?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqCloseSession((hsession?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqCreateSession(accesslevel, (hsession?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqExtractDiagnosticReport((hsession?.value ?: 0L).toString(), reportstoretype.toInt(), (reportkey?.value ?: 0L).toString(), (destinationpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordLocaleTags((htagdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordPage((hrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducerCategories((hcategorydescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducers((hproducerdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticReport((hreport?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticDataAccessLevelAllowed((accesslevel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordAtIndex((hrecord?.value ?: 0L).toString(), index.toInt(), (record?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, topnbinaries: UInt, binarystats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordBinaryDistribution((hsession?.value ?: 0L).toString(), (producernames?.value ?: 0L).toString(), producernamecount.toInt(), topnbinaries.toInt(), (binarystats?.value ?: 0L).toString(), (statcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryAtIndex((hcategorydescription?.value ?: 0L).toString(), index.toInt(), (categorydescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryCount((hcategorydescription?.value ?: 0L).toString(), (categorydescriptioncount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCount((hrecord?.value ?: 0L).toString(), (recordcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagAtIndex((htagdescription?.value ?: 0L).toString(), index.toInt(), (tagdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagCount((htagdescription?.value ?: 0L).toString(), (tagdescriptioncount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTags((hsession?.value ?: 0L).toString(), (locale?.value ?: 0L).toString(), (htagdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPage((hsession?.value ?: 0L).toString(), (searchcriteria?.value ?: 0L).toString(), offset.toInt(), pagerecordcount.toInt(), baserowid.toString(), (hrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPayload((hsession?.value ?: 0L).toString(), rowid.toString(), (payload?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerAtIndex((hproducerdescription?.value ?: 0L).toString(), index.toInt(), (producerdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCategories((hsession?.value ?: 0L).toString(), (producername?.value ?: 0L).toString(), (hcategorydescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCount((hproducerdescription?.value ?: 0L).toString(), (producerdescriptioncount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducers((hsession?.value ?: 0L).toString(), (hproducerdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, recordcount: COpaquePointer?, minrowid: COpaquePointer?, maxrowid: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordStats((hsession?.value ?: 0L).toString(), (searchcriteria?.value ?: 0L).toString(), (recordcount?.value ?: 0L).toString(), (minrowid?.value ?: 0L).toString(), (maxrowid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, generalstats: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordSummary((hsession?.value ?: 0L).toString(), (producernames?.value ?: 0L).toString(), producernamecount.toInt(), (generalstats?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, tagstats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordTagDistribution((hsession?.value ?: 0L).toString(), (producernames?.value ?: 0L).toString(), producernamecount.toInt(), (tagstats?.value ?: 0L).toString(), (statcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReport((hsession?.value ?: 0L).toString(), reportstoretype.toInt(), (hreport?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportAtIndex((hreport?.value ?: 0L).toString(), index.toInt(), (report?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportCount((hreport?.value ?: 0L).toString(), (reportcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportStoreReportCount((hsession?.value ?: 0L).toString(), reportstoretype.toInt(), (reportcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetSessionAccessLevel((hsession?.value ?: 0L).toString(), (accesslevel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqGetTranscriptConfiguration((hsession?.value ?: 0L).toString(), (currentconfig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: COpaquePointer?, providerid: COpaquePointer?, providername: Pcwstr, eventid: COpaquePointer?, eventname: Pcwstr, eventversion: COpaquePointer?, eventkeywords: COpaquePointer?, issampledin: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqIsDiagnosticRecordSampledIn((hsession?.value ?: 0L).toString(), (providergroup?.value ?: 0L).toString(), (providerid?.value ?: 0L).toString(), (providername?.value ?: 0L).toString(), (eventid?.value ?: 0L).toString(), (eventname?.value ?: 0L).toString(), (eventversion?.value ?: 0L).toString(), (eventkeywords?.value ?: 0L).toString(), (issampledin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (_windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssys_windows_win32_security_diagnosticdataquery_ddqSetTranscriptConfiguration((hsession?.value ?: 0L).toString(), (desiredconfig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
