@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32SecurityDiagnosticdataqueryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(hsession.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(hsession.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(accesslevel, hsession.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(hsession.rawAddress.toString(), reportstoretype.toInt(), reportkey.rawAddress.toString(), destinationpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(htagdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(hrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(hcategorydescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(hproducerdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(hreport.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(accesslevel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(hrecord.rawAddress.toString(), index.toInt(), record.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, topnbinaries: UInt, binarystats: MutPtr, statcount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(hsession.rawAddress.toString(), producernames.rawAddress.toString(), producernamecount.toInt(), topnbinaries.toInt(), binarystats.rawAddress.toString(), statcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription.rawAddress.toString(), index.toInt(), categorydescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(hcategorydescription.rawAddress.toString(), categorydescriptioncount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(hrecord.rawAddress.toString(), recordcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription.rawAddress.toString(), index.toInt(), tagdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(htagdescription.rawAddress.toString(), tagdescriptioncount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(hsession.rawAddress.toString(), locale.rawAddress.toString(), htagdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(hsession.rawAddress.toString(), searchcriteria.rawAddress.toString(), offset.toInt(), pagerecordcount.toInt(), baserowid.toString(), hrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(hsession.rawAddress.toString(), rowid.toString(), payload.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(hproducerdescription.rawAddress.toString(), index.toInt(), producerdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(hsession.rawAddress.toString(), producername.rawAddress.toString(), hcategorydescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(hproducerdescription.rawAddress.toString(), producerdescriptioncount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(hsession.rawAddress.toString(), hproducerdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr, recordcount: MutPtr, minrowid: MutPtr, maxrowid: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(hsession.rawAddress.toString(), searchcriteria.rawAddress.toString(), recordcount.rawAddress.toString(), minrowid.rawAddress.toString(), maxrowid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, generalstats: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(hsession.rawAddress.toString(), producernames.rawAddress.toString(), producernamecount.toInt(), generalstats.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, tagstats: MutPtr, statcount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(hsession.rawAddress.toString(), producernames.rawAddress.toString(), producernamecount.toInt(), tagstats.rawAddress.toString(), statcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(hsession.rawAddress.toString(), reportstoretype.toInt(), hreport.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(hreport.rawAddress.toString(), index.toInt(), report.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(hreport.rawAddress.toString(), reportcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(hsession.rawAddress.toString(), reportstoretype.toInt(), reportcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(hsession.rawAddress.toString(), accesslevel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(hsession.rawAddress.toString(), currentconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: ConstPtr, providerid: ConstPtr, providername: Pcwstr, eventid: ConstPtr, eventname: Pcwstr, eventversion: ConstPtr, eventkeywords: ConstPtr, issampledin: MutPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(hsession.rawAddress.toString(), providergroup.rawAddress.toString(), providerid.rawAddress.toString(), providername.rawAddress.toString(), eventid.rawAddress.toString(), eventname.rawAddress.toString(), eventversion.rawAddress.toString(), eventkeywords.rawAddress.toString(), issampledin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: ConstPtr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAddon != null) (windowsWin32SecurityDiagnosticdataqueryNapiAddon.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(hsession.rawAddress.toString(), desiredconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
