package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun DdqCancelDiagnosticRecordOperation(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqCancelDiagnosticRecordOperation", longArrayOf(hsession)).toInt()
}

public fun DdqCloseSession(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqCloseSession", longArrayOf(hsession)).toInt()
}

public fun DdqCreateSession(accesslevel: DdqAccessLevel, hsession: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqCreateSession", longArrayOf(accesslevel.toLong(), hsession)).toInt()
}

public fun DdqExtractDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportkey: PCWSTR, destinationpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqExtractDiagnosticReport", longArrayOf(hsession, reportstoretype.toLong(), reportkey, destinationpath)).toInt()
}

public fun DdqFreeDiagnosticRecordLocaleTags(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqFreeDiagnosticRecordLocaleTags", longArrayOf(htagdescription)).toInt()
}

public fun DdqFreeDiagnosticRecordPage(hrecord: HDIAGNOSTIC_RECORD): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqFreeDiagnosticRecordPage", longArrayOf(hrecord)).toInt()
}

public fun DdqFreeDiagnosticRecordProducerCategories(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqFreeDiagnosticRecordProducerCategories", longArrayOf(hcategorydescription)).toInt()
}

public fun DdqFreeDiagnosticRecordProducers(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqFreeDiagnosticRecordProducers", longArrayOf(hproducerdescription)).toInt()
}

public fun DdqFreeDiagnosticReport(hreport: HDIAGNOSTIC_REPORT): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqFreeDiagnosticReport", longArrayOf(hreport)).toInt()
}

public fun DdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticDataAccessLevelAllowed", longArrayOf(accesslevel)).toInt()
}

public fun DdqGetDiagnosticRecordAtIndex(hrecord: HDIAGNOSTIC_RECORD, index: UInt, record: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordAtIndex", longArrayOf(hrecord, index.toLong(), record)).toInt()
}

public fun DdqGetDiagnosticRecordBinaryDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, topnbinaries: UInt, binarystats: Long, statcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordBinaryDistribution", longArrayOf(hsession, producernames, producernamecount.toLong(), topnbinaries.toLong(), binarystats, statcount)).toInt()
}

public fun DdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, index: UInt, categorydescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordCategoryAtIndex", longArrayOf(hcategorydescription, index.toLong(), categorydescription)).toInt()
}

public fun DdqGetDiagnosticRecordCategoryCount(hcategorydescription: HDIAGNOSTIC_EVENT_CATEGORY_DESCRIPTION, categorydescriptioncount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordCategoryCount", longArrayOf(hcategorydescription, categorydescriptioncount)).toInt()
}

public fun DdqGetDiagnosticRecordCount(hrecord: HDIAGNOSTIC_RECORD, recordcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordCount", longArrayOf(hrecord, recordcount)).toInt()
}

public fun DdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, index: UInt, tagdescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordLocaleTagAtIndex", longArrayOf(htagdescription, index.toLong(), tagdescription)).toInt()
}

public fun DdqGetDiagnosticRecordLocaleTagCount(htagdescription: HDIAGNOSTIC_EVENT_TAG_DESCRIPTION, tagdescriptioncount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordLocaleTagCount", longArrayOf(htagdescription, tagdescriptioncount)).toInt()
}

public fun DdqGetDiagnosticRecordLocaleTags(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, locale: PCWSTR, htagdescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordLocaleTags", longArrayOf(hsession, locale, htagdescription)).toInt()
}

public fun DdqGetDiagnosticRecordPage(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordPage", longArrayOf(hsession, searchcriteria, offset.toLong(), pagerecordcount.toLong(), baserowid, hrecord)).toInt()
}

public fun DdqGetDiagnosticRecordPayload(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, rowid: Long, payload: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordPayload", longArrayOf(hsession, rowid, payload)).toInt()
}

public fun DdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, index: UInt, producerdescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordProducerAtIndex", longArrayOf(hproducerdescription, index.toLong(), producerdescription)).toInt()
}

public fun DdqGetDiagnosticRecordProducerCategories(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producername: PCWSTR, hcategorydescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordProducerCategories", longArrayOf(hsession, producername, hcategorydescription)).toInt()
}

public fun DdqGetDiagnosticRecordProducerCount(hproducerdescription: HDIAGNOSTIC_EVENT_PRODUCER_DESCRIPTION, producerdescriptioncount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordProducerCount", longArrayOf(hproducerdescription, producerdescriptioncount)).toInt()
}

public fun DdqGetDiagnosticRecordProducers(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, hproducerdescription: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordProducers", longArrayOf(hsession, hproducerdescription)).toInt()
}

public fun DdqGetDiagnosticRecordStats(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordStats", longArrayOf(hsession, searchcriteria, recordcount, minrowid, maxrowid)).toInt()
}

public fun DdqGetDiagnosticRecordSummary(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, generalstats: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordSummary", longArrayOf(hsession, producernames, producernamecount.toLong(), generalstats)).toInt()
}

public fun DdqGetDiagnosticRecordTagDistribution(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, producernames: Long, producernamecount: UInt, tagstats: Long, statcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticRecordTagDistribution", longArrayOf(hsession, producernames, producernamecount.toLong(), tagstats, statcount)).toInt()
}

public fun DdqGetDiagnosticReport(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, hreport: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticReport", longArrayOf(hsession, reportstoretype.toLong(), hreport)).toInt()
}

public fun DdqGetDiagnosticReportAtIndex(hreport: HDIAGNOSTIC_REPORT, index: UInt, report: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticReportAtIndex", longArrayOf(hreport, index.toLong(), report)).toInt()
}

public fun DdqGetDiagnosticReportCount(hreport: HDIAGNOSTIC_REPORT, reportcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticReportCount", longArrayOf(hreport, reportcount)).toInt()
}

public fun DdqGetDiagnosticReportStoreReportCount(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, reportstoretype: UInt, reportcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetDiagnosticReportStoreReportCount", longArrayOf(hsession, reportstoretype.toLong(), reportcount)).toInt()
}

public fun DdqGetSessionAccessLevel(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, accesslevel: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetSessionAccessLevel", longArrayOf(hsession, accesslevel)).toInt()
}

public fun DdqGetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, currentconfig: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqGetTranscriptConfiguration", longArrayOf(hsession, currentconfig)).toInt()
}

public fun DdqIsDiagnosticRecordSampledIn(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, providergroup: Long, providerid: Long, providername: PCWSTR, eventid: Long, eventname: PCWSTR, eventversion: Long, eventkeywords: Long, issampledin: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqIsDiagnosticRecordSampledIn", longArrayOf(hsession, providergroup, providerid, providername, eventid, eventname, eventversion, eventkeywords, issampledin)).toInt()
}

public fun DdqSetTranscriptConfiguration(hsession: HDIAGNOSTIC_DATA_QUERY_SESSION, desiredconfig: Long): HRESULT {
    return Win32DynamicFfi.invoke("diagnosticdataquery.dll", "DdqSetTranscriptConfiguration", longArrayOf(hsession, desiredconfig)).toInt()
}
