@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SecurityDiagnosticdataqueryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(hsession: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(hsession: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(accesslevel: Int, hsession: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(hsession: Long, reportstoretype: Int, reportkey: Long, destinationpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(htagdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(hrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(hcategorydescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(hproducerdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(hreport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(accesslevel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(hrecord: Long, index: Int, record: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(hsession: Long, producernames: Long, producernamecount: Int, topnbinaries: Int, binarystats: Long, statcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: Long, index: Int, categorydescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(hcategorydescription: Long, categorydescriptioncount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(hrecord: Long, recordcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: Long, index: Int, tagdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(htagdescription: Long, tagdescriptioncount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(hsession: Long, locale: Long, htagdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(hsession: Long, searchcriteria: Long, offset: Int, pagerecordcount: Int, baserowid: Long, hrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(hsession: Long, rowid: Long, payload: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(hproducerdescription: Long, index: Int, producerdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(hsession: Long, producername: Long, hcategorydescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(hproducerdescription: Long, producerdescriptioncount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(hsession: Long, hproducerdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(hsession: Long, searchcriteria: Long, recordcount: Long, minrowid: Long, maxrowid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(hsession: Long, producernames: Long, producernamecount: Int, generalstats: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(hsession: Long, producernames: Long, producernamecount: Int, tagstats: Long, statcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(hsession: Long, reportstoretype: Int, hreport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(hreport: Long, index: Int, report: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(hreport: Long, reportcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(hsession: Long, reportstoretype: Int, reportcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(hsession: Long, accesslevel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(hsession: Long, currentconfig: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(hsession: Long, providergroup: Long, providerid: Long, providername: Long, eventid: Long, eventname: Long, eventversion: Long, eventkeywords: Long, issampledin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(hsession: Long, desiredconfig: Long): Int
}

public actual fun ddqCancelDiagnosticRecordOperation(hsession: HdiagnosticDataQuerySession): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(hsession.rawAddress)

public actual fun ddqCloseSession(hsession: HdiagnosticDataQuerySession): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(hsession.rawAddress)

public actual fun ddqCreateSession(accesslevel: DdqAccessLevel, hsession: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(accesslevel, hsession.rawAddress)

public actual fun ddqExtractDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportkey: Pcwstr, destinationpath: Pcwstr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(hsession.rawAddress, reportstoretype.toInt(), reportkey.rawAddress, destinationpath.rawAddress)

public actual fun ddqFreeDiagnosticRecordLocaleTags(htagdescription: HdiagnosticEventTagDescription): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(htagdescription.rawAddress)

public actual fun ddqFreeDiagnosticRecordPage(hrecord: HdiagnosticRecord): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(hrecord.rawAddress)

public actual fun ddqFreeDiagnosticRecordProducerCategories(hcategorydescription: HdiagnosticEventCategoryDescription): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(hcategorydescription.rawAddress)

public actual fun ddqFreeDiagnosticRecordProducers(hproducerdescription: HdiagnosticEventProducerDescription): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(hproducerdescription.rawAddress)

public actual fun ddqFreeDiagnosticReport(hreport: HdiagnosticReport): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(hreport.rawAddress)

public actual fun ddqGetDiagnosticDataAccessLevelAllowed(accesslevel: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(accesslevel.rawAddress)

public actual fun ddqGetDiagnosticRecordAtIndex(hrecord: HdiagnosticRecord, index: UInt, record: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(hrecord.rawAddress, index.toInt(), record.rawAddress)

public actual fun ddqGetDiagnosticRecordBinaryDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, topnbinaries: UInt, binarystats: MutPtr, statcount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(hsession.rawAddress, producernames.rawAddress, producernamecount.toInt(), topnbinaries.toInt(), binarystats.rawAddress, statcount.rawAddress)

public actual fun ddqGetDiagnosticRecordCategoryAtIndex(hcategorydescription: HdiagnosticEventCategoryDescription, index: UInt, categorydescription: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(hcategorydescription.rawAddress, index.toInt(), categorydescription.rawAddress)

public actual fun ddqGetDiagnosticRecordCategoryCount(hcategorydescription: HdiagnosticEventCategoryDescription, categorydescriptioncount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(hcategorydescription.rawAddress, categorydescriptioncount.rawAddress)

public actual fun ddqGetDiagnosticRecordCount(hrecord: HdiagnosticRecord, recordcount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(hrecord.rawAddress, recordcount.rawAddress)

public actual fun ddqGetDiagnosticRecordLocaleTagAtIndex(htagdescription: HdiagnosticEventTagDescription, index: UInt, tagdescription: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(htagdescription.rawAddress, index.toInt(), tagdescription.rawAddress)

public actual fun ddqGetDiagnosticRecordLocaleTagCount(htagdescription: HdiagnosticEventTagDescription, tagdescriptioncount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(htagdescription.rawAddress, tagdescriptioncount.rawAddress)

public actual fun ddqGetDiagnosticRecordLocaleTags(hsession: HdiagnosticDataQuerySession, locale: Pcwstr, htagdescription: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(hsession.rawAddress, locale.rawAddress, htagdescription.rawAddress)

public actual fun ddqGetDiagnosticRecordPage(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr, offset: UInt, pagerecordcount: UInt, baserowid: Long, hrecord: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(hsession.rawAddress, searchcriteria.rawAddress, offset.toInt(), pagerecordcount.toInt(), baserowid, hrecord.rawAddress)

public actual fun ddqGetDiagnosticRecordPayload(hsession: HdiagnosticDataQuerySession, rowid: Long, payload: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(hsession.rawAddress, rowid, payload.rawAddress)

public actual fun ddqGetDiagnosticRecordProducerAtIndex(hproducerdescription: HdiagnosticEventProducerDescription, index: UInt, producerdescription: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(hproducerdescription.rawAddress, index.toInt(), producerdescription.rawAddress)

public actual fun ddqGetDiagnosticRecordProducerCategories(hsession: HdiagnosticDataQuerySession, producername: Pcwstr, hcategorydescription: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(hsession.rawAddress, producername.rawAddress, hcategorydescription.rawAddress)

public actual fun ddqGetDiagnosticRecordProducerCount(hproducerdescription: HdiagnosticEventProducerDescription, producerdescriptioncount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(hproducerdescription.rawAddress, producerdescriptioncount.rawAddress)

public actual fun ddqGetDiagnosticRecordProducers(hsession: HdiagnosticDataQuerySession, hproducerdescription: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(hsession.rawAddress, hproducerdescription.rawAddress)

public actual fun ddqGetDiagnosticRecordStats(hsession: HdiagnosticDataQuerySession, searchcriteria: ConstPtr, recordcount: MutPtr, minrowid: MutPtr, maxrowid: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(hsession.rawAddress, searchcriteria.rawAddress, recordcount.rawAddress, minrowid.rawAddress, maxrowid.rawAddress)

public actual fun ddqGetDiagnosticRecordSummary(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, generalstats: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(hsession.rawAddress, producernames.rawAddress, producernamecount.toInt(), generalstats.rawAddress)

public actual fun ddqGetDiagnosticRecordTagDistribution(hsession: HdiagnosticDataQuerySession, producernames: ConstPtr, producernamecount: UInt, tagstats: MutPtr, statcount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(hsession.rawAddress, producernames.rawAddress, producernamecount.toInt(), tagstats.rawAddress, statcount.rawAddress)

public actual fun ddqGetDiagnosticReport(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, hreport: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(hsession.rawAddress, reportstoretype.toInt(), hreport.rawAddress)

public actual fun ddqGetDiagnosticReportAtIndex(hreport: HdiagnosticReport, index: UInt, report: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(hreport.rawAddress, index.toInt(), report.rawAddress)

public actual fun ddqGetDiagnosticReportCount(hreport: HdiagnosticReport, reportcount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(hreport.rawAddress, reportcount.rawAddress)

public actual fun ddqGetDiagnosticReportStoreReportCount(hsession: HdiagnosticDataQuerySession, reportstoretype: UInt, reportcount: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(hsession.rawAddress, reportstoretype.toInt(), reportcount.rawAddress)

public actual fun ddqGetSessionAccessLevel(hsession: HdiagnosticDataQuerySession, accesslevel: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(hsession.rawAddress, accesslevel.rawAddress)

public actual fun ddqGetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, currentconfig: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(hsession.rawAddress, currentconfig.rawAddress)

public actual fun ddqIsDiagnosticRecordSampledIn(hsession: HdiagnosticDataQuerySession, providergroup: ConstPtr, providerid: ConstPtr, providername: Pcwstr, eventid: ConstPtr, eventname: Pcwstr, eventversion: ConstPtr, eventkeywords: ConstPtr, issampledin: MutPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(hsession.rawAddress, providergroup.rawAddress, providerid.rawAddress, providername.rawAddress, eventid.rawAddress, eventname.rawAddress, eventversion.rawAddress, eventkeywords.rawAddress, issampledin.rawAddress)

public actual fun ddqSetTranscriptConfiguration(hsession: HdiagnosticDataQuerySession, desiredconfig: ConstPtr): Hresult =
    WindowsWin32SecurityDiagnosticdataqueryJniBridge.windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(hsession.rawAddress, desiredconfig.rawAddress)
