package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult

public expect fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult

public expect fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: MutPtr): Hresult

public expect fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult

public expect fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult

public expect fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult

public expect fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult

public expect fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult

public expect fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult

public expect fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, topnbinaries: UInt, binarystats: MutPtr, statcount: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr, recordcount: MutPtr, minrowid: MutPtr, maxrowid: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, generalstats: MutPtr): Hresult

public expect fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, tagstats: MutPtr, statcount: MutPtr): Hresult

public expect fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: MutPtr): Hresult

public expect fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: MutPtr): Hresult

public expect fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: MutPtr): Hresult

public expect fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: MutPtr): Hresult

public expect fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: MutPtr): Hresult

public expect fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: MutPtr): Hresult

public expect fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: ConstPtr, providerid: ConstPtr, providername: Pcwstr, eventid: ConstPtr, eventname: Pcwstr, eventversion: ConstPtr, eventkeywords: ConstPtr, issampledin: MutPtr): Hresult

public expect fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: ConstPtr): Hresult
