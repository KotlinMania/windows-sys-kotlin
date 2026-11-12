package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult

public expect fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult

public expect fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: MutPtr<HdiagnosticDataQuerySession>): Hresult

public expect fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult

public expect fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult

public expect fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult

public expect fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult

public expect fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult

public expect fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult

public expect fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: MutPtr<DdqAccessLevel>): Hresult

public expect fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: MutPtr<DiagnosticDataRecord>): Hresult

public expect fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, topnbinaries: UInt, binarystats: MutPtr<MutPtr<DiagnosticDataEventBinaryStats>>, statcount: MutPtr<UInt>): Hresult

public expect fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: MutPtr<DiagnosticDataEventCategoryDescription>): Hresult

public expect fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: MutPtr<UInt>): Hresult

public expect fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: MutPtr<UInt>): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: MutPtr<DiagnosticDataEventTagDescription>): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: MutPtr<UInt>): Hresult

public expect fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: MutPtr<HdiagnosticEventTagDescription>): Hresult

public expect fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr<DiagnosticDataSearchCriteria>, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: MutPtr<HdiagnosticRecord>): Hresult

public expect fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: MutPtr<Pcwstr>): Hresult

public expect fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: MutPtr<DiagnosticDataEventProducerDescription>): Hresult

public expect fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: MutPtr<HdiagnosticEventCategoryDescription>): Hresult

public expect fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: MutPtr<UInt>): Hresult

public expect fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: MutPtr<HdiagnosticEventProducerDescription>): Hresult

public expect fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr<DiagnosticDataSearchCriteria>, recordcount: MutPtr<UInt>, minrowid: MutPtr<Long>, maxrowid: MutPtr<Long>): Hresult

public expect fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, generalstats: MutPtr<DiagnosticDataGeneralStats>): Hresult

public expect fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr<Pcwstr>, producernamecount: UInt, tagstats: MutPtr<MutPtr<DiagnosticDataEventTagStats>>, statcount: MutPtr<UInt>): Hresult

public expect fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: MutPtr<HdiagnosticReport>): Hresult

public expect fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: MutPtr<DiagnosticReportData>): Hresult

public expect fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: MutPtr<UInt>): Hresult

public expect fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: MutPtr<UInt>): Hresult

public expect fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: MutPtr<DdqAccessLevel>): Hresult

public expect fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: MutPtr<DiagnosticDataEventTranscriptConfiguration>): Hresult

public expect fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: ConstPtr<Guid>, providerid: ConstPtr<Guid>, providername: Pcwstr, eventid: ConstPtr<UInt>, eventname: Pcwstr, eventversion: ConstPtr<UInt>, eventkeywords: ConstPtr<ULong>, issampledin: MutPtr<Bool>): Hresult

public expect fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: ConstPtr<DiagnosticDataEventTranscriptConfiguration>): Hresult
