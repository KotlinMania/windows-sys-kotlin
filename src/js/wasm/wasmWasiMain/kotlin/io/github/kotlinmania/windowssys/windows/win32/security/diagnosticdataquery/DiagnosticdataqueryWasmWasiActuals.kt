@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, topnbinaries: UInt, binarystats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, recordcount: COpaquePointer?, minrowid: COpaquePointer?, maxrowid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, generalstats: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, tagstats: COpaquePointer?, statcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: COpaquePointer?, providerid: COpaquePointer?, providername: Pcwstr, eventid: COpaquePointer?, eventname: Pcwstr, eventversion: COpaquePointer?, eventkeywords: COpaquePointer?, issampledin: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
