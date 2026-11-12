@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityDiagnosticdataqueryNapiAddon(): Boolean

private val windowsWin32SecurityDiagnosticdataqueryNapiAvailable: Boolean = initWindowsWin32SecurityDiagnosticdataqueryNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(p0)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(p0: String, p1: String): Int

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(hsession.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(hsession.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: MutPtr<HdiagnosticDataQuerySession>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(accesslevel, hsession.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(hsession.rawAddress.toString(), reportstoretype.toInt(), reportkey.rawAddress.toString(), destinationpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(htagdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(hrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(hcategorydescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(hproducerdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(hreport.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: MutPtr<DdqAccessLevel>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(accesslevel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: MutPtr<DiagnosticDataRecord>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(hrecord.rawAddress.toString(), index.toInt(), record.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, topnbinaries: UInt, binarystats: MutPtr<MutPtr<DiagnosticDataEventBinaryStats>>, statcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(hsession.rawAddress.toString(), producernames.rawAddress.toString(), producernamecount.toInt(), topnbinaries.toInt(), binarystats.rawAddress.toString(), statcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: MutPtr<DiagnosticDataEventCategoryDescription>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription.rawAddress.toString(), index.toInt(), categorydescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(hcategorydescription.rawAddress.toString(), categorydescriptioncount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(hrecord.rawAddress.toString(), recordcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: MutPtr<DiagnosticDataEventTagDescription>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription.rawAddress.toString(), index.toInt(), tagdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(htagdescription.rawAddress.toString(), tagdescriptioncount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: MutPtr<HdiagnosticEventTagDescription>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(hsession.rawAddress.toString(), locale.rawAddress.toString(), htagdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr<DiagnosticDataSearchCriteria>, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: MutPtr<HdiagnosticRecord>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(hsession.rawAddress.toString(), searchcriteria.rawAddress.toString(), offset.toInt(), pagerecordcount.toInt(), baserowid.toString(), hrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(hsession.rawAddress.toString(), rowid.toString(), payload.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: MutPtr<DiagnosticDataEventProducerDescription>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(hproducerdescription.rawAddress.toString(), index.toInt(), producerdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: MutPtr<HdiagnosticEventCategoryDescription>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(hsession.rawAddress.toString(), producername.rawAddress.toString(), hcategorydescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(hproducerdescription.rawAddress.toString(), producerdescriptioncount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: MutPtr<HdiagnosticEventProducerDescription>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(hsession.rawAddress.toString(), hproducerdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr<DiagnosticDataSearchCriteria>, recordcount: MutPtr<UInt>, minrowid: MutPtr<Long>, maxrowid: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(hsession.rawAddress.toString(), searchcriteria.rawAddress.toString(), recordcount.rawAddress.toString(), minrowid.rawAddress.toString(), maxrowid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, generalstats: MutPtr<DiagnosticDataGeneralStats>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(hsession.rawAddress.toString(), producernames.rawAddress.toString(), producernamecount.toInt(), generalstats.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, tagstats: MutPtr<MutPtr<DiagnosticDataEventTagStats>>, statcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(hsession.rawAddress.toString(), producernames.rawAddress.toString(), producernamecount.toInt(), tagstats.rawAddress.toString(), statcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: MutPtr<HdiagnosticReport>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(hsession.rawAddress.toString(), reportstoretype.toInt(), hreport.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: MutPtr<DiagnosticReportData>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(hreport.rawAddress.toString(), index.toInt(), report.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(hreport.rawAddress.toString(), reportcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(hsession.rawAddress.toString(), reportstoretype.toInt(), reportcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: MutPtr<DdqAccessLevel>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(hsession.rawAddress.toString(), accesslevel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: MutPtr<DiagnosticDataEventTranscriptConfiguration>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(hsession.rawAddress.toString(), currentconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: ConstPtr<Guid>, providerid: ConstPtr<Guid>, providername: Pcwstr, eventid: ConstPtr<UInt>, eventname: Pcwstr, eventversion: ConstPtr<UInt>, eventkeywords: ConstPtr<ULong>, issampledin: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(hsession.rawAddress.toString(), providergroup.rawAddress.toString(), providerid.rawAddress.toString(), providername.rawAddress.toString(), eventid.rawAddress.toString(), eventname.rawAddress.toString(), eventversion.rawAddress.toString(), eventkeywords.rawAddress.toString(), issampledin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: ConstPtr<DiagnosticDataEventTranscriptConfiguration>): Hresult =
    if (windowsWin32SecurityDiagnosticdataqueryNapiAvailable) wasmWindowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(hsession.rawAddress.toString(), desiredconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
