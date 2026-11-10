package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult

public expect fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult

public expect fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: COpaquePointer?): Hresult

public expect fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult

public expect fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult

public expect fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult

public expect fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult

public expect fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult

public expect fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult

public expect fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, topnbinaries: UInt, binarystats: COpaquePointer?, statcount: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: COpaquePointer?, recordcount: COpaquePointer?, minrowid: COpaquePointer?, maxrowid: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, generalstats: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: COpaquePointer?, producernamecount: UInt, tagstats: COpaquePointer?, statcount: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: COpaquePointer?): Hresult

public expect fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: COpaquePointer?): Hresult

public expect fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: COpaquePointer?): Hresult

public expect fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: COpaquePointer?): Hresult

public expect fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: COpaquePointer?, providerid: COpaquePointer?, providername: Pcwstr, eventid: COpaquePointer?, eventname: Pcwstr, eventversion: COpaquePointer?, eventkeywords: COpaquePointer?, issampledin: COpaquePointer?): Hresult

public expect fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: COpaquePointer?): Hresult
