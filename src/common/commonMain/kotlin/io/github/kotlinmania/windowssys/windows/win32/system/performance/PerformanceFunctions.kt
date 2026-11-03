package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(requestcode: UInt, buffer: Long, buffersize: UInt): UInt
}

public fun BackupPerfRegistryToFileW(szfilename: PCWSTR, szcommentstring: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "BackupPerfRegistryToFileW", longArrayOf(szfilename, szcommentstring)).toUInt()
}

public fun InstallPerfDllA(szcomputername: PCSTR, lpinifile: PCSTR, dwflags: ULong): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "InstallPerfDllA", longArrayOf(szcomputername, lpinifile, dwflags.toLong())).toUInt()
}

public fun InstallPerfDllW(szcomputername: PCWSTR, lpinifile: PCWSTR, dwflags: ULong): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "InstallPerfDllW", longArrayOf(szcomputername, lpinifile, dwflags.toLong())).toUInt()
}

public fun LoadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "LoadPerfCounterTextStringsA", longArrayOf(lpcommandline, bquietmodearg.toLong())).toUInt()
}

public fun LoadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "LoadPerfCounterTextStringsW", longArrayOf(lpcommandline, bquietmodearg.toLong())).toUInt()
}

public fun PdhAddCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhAddCounterA", longArrayOf(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter)).toUInt()
}

public fun PdhAddCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhAddCounterW", longArrayOf(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter)).toUInt()
}

public fun PdhAddEnglishCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhAddEnglishCounterA", longArrayOf(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter)).toUInt()
}

public fun PdhAddEnglishCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhAddEnglishCounterW", longArrayOf(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter)).toUInt()
}

public fun PdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: PCSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhBindInputDataSourceA", longArrayOf(phdatasource, logfilenamelist)).toUInt()
}

public fun PdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhBindInputDataSourceW", longArrayOf(phdatasource, logfilenamelist)).toUInt()
}

public fun PdhBrowseCountersA(pbrowsedlgdata: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhBrowseCountersA", longArrayOf(pbrowsedlgdata)).toUInt()
}

public fun PdhBrowseCountersHA(pbrowsedlgdata: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhBrowseCountersHA", longArrayOf(pbrowsedlgdata)).toUInt()
}

public fun PdhBrowseCountersHW(pbrowsedlgdata: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhBrowseCountersHW", longArrayOf(pbrowsedlgdata)).toUInt()
}

public fun PdhBrowseCountersW(pbrowsedlgdata: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhBrowseCountersW", longArrayOf(pbrowsedlgdata)).toUInt()
}

public fun PdhCalculateCounterFromRawValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCalculateCounterFromRawValue", longArrayOf(hcounter, dwformat.toLong(), rawvalue1, rawvalue2, fmtvalue)).toUInt()
}

public fun PdhCloseLog(hlog: PDH_HLOG, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCloseLog", longArrayOf(hlog, dwflags.toLong())).toUInt()
}

public fun PdhCloseQuery(hquery: PDH_HQUERY): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCloseQuery", longArrayOf(hquery)).toUInt()
}

public fun PdhCollectQueryData(hquery: PDH_HQUERY): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCollectQueryData", longArrayOf(hquery)).toUInt()
}

public fun PdhCollectQueryDataEx(hquery: PDH_HQUERY, dwintervaltime: UInt, hnewdataevent: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCollectQueryDataEx", longArrayOf(hquery, dwintervaltime.toLong(), Win32DynamicFfi.objectSlot(hnewdataevent))).toUInt()
}

public fun PdhCollectQueryDataWithTime(hquery: PDH_HQUERY, plltimestamp: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCollectQueryDataWithTime", longArrayOf(hquery, plltimestamp)).toUInt()
}

public fun PdhComputeCounterStatistics(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: Long, data: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhComputeCounterStatistics", longArrayOf(hcounter, dwformat.toLong(), dwfirstentry.toLong(), dwnumentries.toLong(), lprawvaluearray, data)).toUInt()
}

public fun PdhConnectMachineA(szmachinename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhConnectMachineA", longArrayOf(szmachinename)).toUInt()
}

public fun PdhConnectMachineW(szmachinename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhConnectMachineW", longArrayOf(szmachinename)).toUInt()
}

public fun PdhCreateSQLTablesA(szdatasource: PCSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCreateSQLTablesA", longArrayOf(szdatasource)).toUInt()
}

public fun PdhCreateSQLTablesW(szdatasource: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhCreateSQLTablesW", longArrayOf(szdatasource)).toUInt()
}

public fun PdhEnumLogSetNamesA(szdatasource: PCSTR, mszdatasetnamelist: PSTR, pcchbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumLogSetNamesA", longArrayOf(szdatasource, mszdatasetnamelist, pcchbufferlength)).toUInt()
}

public fun PdhEnumLogSetNamesW(szdatasource: PCWSTR, mszdatasetnamelist: PWSTR, pcchbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumLogSetNamesW", longArrayOf(szdatasource, mszdatasetnamelist, pcchbufferlength)).toUInt()
}

public fun PdhEnumMachinesA(szdatasource: PCSTR, mszmachinelist: PSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumMachinesA", longArrayOf(szdatasource, mszmachinelist, pcchbuffersize)).toUInt()
}

public fun PdhEnumMachinesHA(hdatasource: PDH_HLOG, mszmachinelist: PSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumMachinesHA", longArrayOf(hdatasource, mszmachinelist, pcchbuffersize)).toUInt()
}

public fun PdhEnumMachinesHW(hdatasource: PDH_HLOG, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumMachinesHW", longArrayOf(hdatasource, mszmachinelist, pcchbuffersize)).toUInt()
}

public fun PdhEnumMachinesW(szdatasource: PCWSTR, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumMachinesW", longArrayOf(szdatasource, mszmachinelist, pcchbuffersize)).toUInt()
}

public fun PdhEnumObjectItemsA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectItemsA", longArrayOf(szdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toLong(), dwflags.toLong())).toUInt()
}

public fun PdhEnumObjectItemsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectItemsHA", longArrayOf(hdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toLong(), dwflags.toLong())).toUInt()
}

public fun PdhEnumObjectItemsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectItemsHW", longArrayOf(hdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toLong(), dwflags.toLong())).toUInt()
}

public fun PdhEnumObjectItemsW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectItemsW", longArrayOf(szdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toLong(), dwflags.toLong())).toUInt()
}

public fun PdhEnumObjectsA(szdatasource: PCSTR, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectsA", longArrayOf(szdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toLong(), brefresh.toLong())).toUInt()
}

public fun PdhEnumObjectsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectsHA", longArrayOf(hdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toLong(), brefresh.toLong())).toUInt()
}

public fun PdhEnumObjectsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectsHW", longArrayOf(hdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toLong(), brefresh.toLong())).toUInt()
}

public fun PdhEnumObjectsW(szdatasource: PCWSTR, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhEnumObjectsW", longArrayOf(szdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toLong(), brefresh.toLong())).toUInt()
}

public fun PdhExpandCounterPathA(szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhExpandCounterPathA", longArrayOf(szwildcardpath, mszexpandedpathlist, pcchpathlistlength)).toUInt()
}

public fun PdhExpandCounterPathW(szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhExpandCounterPathW", longArrayOf(szwildcardpath, mszexpandedpathlist, pcchpathlistlength)).toUInt()
}

public fun PdhExpandWildCardPathA(szdatasource: PCSTR, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhExpandWildCardPathA", longArrayOf(szdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toLong())).toUInt()
}

public fun PdhExpandWildCardPathHA(hdatasource: PDH_HLOG, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhExpandWildCardPathHA", longArrayOf(hdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toLong())).toUInt()
}

public fun PdhExpandWildCardPathHW(hdatasource: PDH_HLOG, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhExpandWildCardPathHW", longArrayOf(hdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toLong())).toUInt()
}

public fun PdhExpandWildCardPathW(szdatasource: PCWSTR, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhExpandWildCardPathW", longArrayOf(szdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toLong())).toUInt()
}

public fun PdhFormatFromRawValue(dwcountertype: UInt, dwformat: PDH_FMT, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhFormatFromRawValue", longArrayOf(dwcountertype.toLong(), dwformat.toLong(), ptimebase, prawvalue1, prawvalue2, pfmtvalue)).toUInt()
}

public fun PdhGetCounterInfoA(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetCounterInfoA", longArrayOf(hcounter, if (bretrieveexplaintext) 1L else 0L, pdwbuffersize, lpbuffer)).toUInt()
}

public fun PdhGetCounterInfoW(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetCounterInfoW", longArrayOf(hcounter, if (bretrieveexplaintext) 1L else 0L, pdwbuffersize, lpbuffer)).toUInt()
}

public fun PdhGetCounterTimeBase(hcounter: PDH_HCOUNTER, ptimebase: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetCounterTimeBase", longArrayOf(hcounter, ptimebase)).toUInt()
}

public fun PdhGetDataSourceTimeRangeA(szdatasource: PCSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDataSourceTimeRangeA", longArrayOf(szdatasource, pdwnumentries, pinfo, pdwbuffersize)).toUInt()
}

public fun PdhGetDataSourceTimeRangeH(hdatasource: PDH_HLOG, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDataSourceTimeRangeH", longArrayOf(hdatasource, pdwnumentries, pinfo, pdwbuffersize)).toUInt()
}

public fun PdhGetDataSourceTimeRangeW(szdatasource: PCWSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDataSourceTimeRangeW", longArrayOf(szdatasource, pdwnumentries, pinfo, pdwbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfCounterA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfCounterA", longArrayOf(szdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfCounterHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfCounterHA", longArrayOf(hdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfCounterHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfCounterHW", longArrayOf(hdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfCounterW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfCounterW", longArrayOf(szdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfObjectA(szdatasource: PCSTR, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfObjectA", longArrayOf(szdatasource, szmachinename, szdefaultobjectname, pcchbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfObjectHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfObjectHA", longArrayOf(hdatasource, szmachinename, szdefaultobjectname, pcchbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfObjectHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfObjectHW", longArrayOf(hdatasource, szmachinename, szdefaultobjectname, pcchbuffersize)).toUInt()
}

public fun PdhGetDefaultPerfObjectW(szdatasource: PCWSTR, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDefaultPerfObjectW", longArrayOf(szdatasource, szmachinename, szdefaultobjectname, pcchbuffersize)).toUInt()
}

public fun PdhGetDllVersion(lpdwversion: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetDllVersion", longArrayOf(lpdwversion)).toUInt()
}

public fun PdhGetFormattedCounterArrayA(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetFormattedCounterArrayA", longArrayOf(hcounter, dwformat.toLong(), lpdwbuffersize, lpdwitemcount, itembuffer)).toUInt()
}

public fun PdhGetFormattedCounterArrayW(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetFormattedCounterArrayW", longArrayOf(hcounter, dwformat.toLong(), lpdwbuffersize, lpdwitemcount, itembuffer)).toUInt()
}

public fun PdhGetFormattedCounterValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwtype: Long, pvalue: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetFormattedCounterValue", longArrayOf(hcounter, dwformat.toLong(), lpdwtype, pvalue)).toUInt()
}

public fun PdhGetLogFileSize(hlog: PDH_HLOG, llsize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetLogFileSize", longArrayOf(hlog, llsize)).toUInt()
}

public fun PdhGetLogSetGUID(hlog: PDH_HLOG, pguid: Long, prunid: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetLogSetGUID", longArrayOf(hlog, pguid, prunid)).toUInt()
}

public fun PdhGetRawCounterArrayA(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetRawCounterArrayA", longArrayOf(hcounter, lpdwbuffersize, lpdwitemcount, itembuffer)).toUInt()
}

public fun PdhGetRawCounterArrayW(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetRawCounterArrayW", longArrayOf(hcounter, lpdwbuffersize, lpdwitemcount, itembuffer)).toUInt()
}

public fun PdhGetRawCounterValue(hcounter: PDH_HCOUNTER, lpdwtype: Long, pvalue: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhGetRawCounterValue", longArrayOf(hcounter, lpdwtype, pvalue)).toUInt()
}

public fun PdhIsRealTimeQuery(hquery: PDH_HQUERY): BOOL {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhIsRealTimeQuery", longArrayOf(hquery)).toInt()
}

public fun PdhLookupPerfIndexByNameA(szmachinename: PCSTR, sznamebuffer: PCSTR, pdwindex: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhLookupPerfIndexByNameA", longArrayOf(szmachinename, sznamebuffer, pdwindex)).toUInt()
}

public fun PdhLookupPerfIndexByNameW(szmachinename: PCWSTR, sznamebuffer: PCWSTR, pdwindex: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhLookupPerfIndexByNameW", longArrayOf(szmachinename, sznamebuffer, pdwindex)).toUInt()
}

public fun PdhLookupPerfNameByIndexA(szmachinename: PCSTR, dwnameindex: UInt, sznamebuffer: PSTR, pcchnamebuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhLookupPerfNameByIndexA", longArrayOf(szmachinename, dwnameindex.toLong(), sznamebuffer, pcchnamebuffersize)).toUInt()
}

public fun PdhLookupPerfNameByIndexW(szmachinename: PCWSTR, dwnameindex: UInt, sznamebuffer: PWSTR, pcchnamebuffersize: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhLookupPerfNameByIndexW", longArrayOf(szmachinename, dwnameindex.toLong(), sznamebuffer, pcchnamebuffersize)).toUInt()
}

public fun PdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: PSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhMakeCounterPathA", longArrayOf(pcounterpathelements, szfullpathbuffer, pcchbuffersize, dwflags.toLong())).toUInt()
}

public fun PdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: PWSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhMakeCounterPathW", longArrayOf(pcounterpathelements, szfullpathbuffer, pcchbuffersize, dwflags.toLong())).toUInt()
}

public fun PdhOpenLogA(szlogfilename: PCSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCSTR, phlog: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhOpenLogA", longArrayOf(szlogfilename, dwaccessflags.toLong(), lpdwlogtype, hquery, dwmaxsize.toLong(), szusercaption, phlog)).toUInt()
}

public fun PdhOpenLogW(szlogfilename: PCWSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCWSTR, phlog: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhOpenLogW", longArrayOf(szlogfilename, dwaccessflags.toLong(), lpdwlogtype, hquery, dwmaxsize.toLong(), szusercaption, phlog)).toUInt()
}

public fun PdhOpenQueryA(szdatasource: PCSTR, dwuserdata: ULong, phquery: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhOpenQueryA", longArrayOf(szdatasource, dwuserdata.toLong(), phquery)).toUInt()
}

public fun PdhOpenQueryH(hdatasource: PDH_HLOG, dwuserdata: ULong, phquery: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhOpenQueryH", longArrayOf(hdatasource, dwuserdata.toLong(), phquery)).toUInt()
}

public fun PdhOpenQueryW(szdatasource: PCWSTR, dwuserdata: ULong, phquery: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhOpenQueryW", longArrayOf(szdatasource, dwuserdata.toLong(), phquery)).toUInt()
}

public fun PdhParseCounterPathA(szfullpathbuffer: PCSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhParseCounterPathA", longArrayOf(szfullpathbuffer, pcounterpathelements, pdwbuffersize, dwflags.toLong())).toUInt()
}

public fun PdhParseCounterPathW(szfullpathbuffer: PCWSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhParseCounterPathW", longArrayOf(szfullpathbuffer, pcounterpathelements, pdwbuffersize, dwflags.toLong())).toUInt()
}

public fun PdhParseInstanceNameA(szinstancestring: PCSTR, szinstancename: PSTR, pcchinstancenamelength: Long, szparentname: PSTR, pcchparentnamelength: Long, lpindex: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhParseInstanceNameA", longArrayOf(szinstancestring, szinstancename, pcchinstancenamelength, szparentname, pcchparentnamelength, lpindex)).toUInt()
}

public fun PdhParseInstanceNameW(szinstancestring: PCWSTR, szinstancename: PWSTR, pcchinstancenamelength: Long, szparentname: PWSTR, pcchparentnamelength: Long, lpindex: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhParseInstanceNameW", longArrayOf(szinstancestring, szinstancename, pcchinstancenamelength, szparentname, pcchparentnamelength, lpindex)).toUInt()
}

public fun PdhReadRawLogRecord(hlog: PDH_HLOG, ftrecord: Foundation.FILETIME, prawlogrecord: Long, pdwbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhReadRawLogRecord", longArrayOf(hlog, Win32DynamicFfi.objectSlot(ftrecord), prawlogrecord, pdwbufferlength)).toUInt()
}

public fun PdhRemoveCounter(hcounter: PDH_HCOUNTER): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhRemoveCounter", longArrayOf(hcounter)).toUInt()
}

public fun PdhSelectDataSourceA(hwndowner: Foundation.HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PSTR, pcchbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhSelectDataSourceA", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), dwflags.toLong(), szdatasource, pcchbufferlength)).toUInt()
}

public fun PdhSelectDataSourceW(hwndowner: Foundation.HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PWSTR, pcchbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhSelectDataSourceW", longArrayOf(Win32DynamicFfi.objectSlot(hwndowner), dwflags.toLong(), szdatasource, pcchbufferlength)).toUInt()
}

public fun PdhSetCounterScaleFactor(hcounter: PDH_HCOUNTER, lfactor: Int): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhSetCounterScaleFactor", longArrayOf(hcounter, lfactor.toLong())).toUInt()
}

public fun PdhSetDefaultRealTimeDataSource(dwdatasourceid: REAL_TIME_DATA_SOURCE_ID_FLAGS): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhSetDefaultRealTimeDataSource", longArrayOf(dwdatasourceid.toLong())).toUInt()
}

public fun PdhSetLogSetRunID(hlog: PDH_HLOG, runid: Int): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhSetLogSetRunID", longArrayOf(hlog, runid.toLong())).toUInt()
}

public fun PdhSetQueryTimeRange(hquery: PDH_HQUERY, pinfo: Long): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhSetQueryTimeRange", longArrayOf(hquery, pinfo)).toUInt()
}

public fun PdhUpdateLogA(hlog: PDH_HLOG, szuserstring: PCSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhUpdateLogA", longArrayOf(hlog, szuserstring)).toUInt()
}

public fun PdhUpdateLogFileCatalog(hlog: PDH_HLOG): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhUpdateLogFileCatalog", longArrayOf(hlog)).toUInt()
}

public fun PdhUpdateLogW(hlog: PDH_HLOG, szuserstring: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhUpdateLogW", longArrayOf(hlog, szuserstring)).toUInt()
}

public fun PdhValidatePathA(szfullpathbuffer: PCSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhValidatePathA", longArrayOf(szfullpathbuffer)).toUInt()
}

public fun PdhValidatePathExA(hdatasource: PDH_HLOG, szfullpathbuffer: PCSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhValidatePathExA", longArrayOf(hdatasource, szfullpathbuffer)).toUInt()
}

public fun PdhValidatePathExW(hdatasource: PDH_HLOG, szfullpathbuffer: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhValidatePathExW", longArrayOf(hdatasource, szfullpathbuffer)).toUInt()
}

public fun PdhValidatePathW(szfullpathbuffer: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhValidatePathW", longArrayOf(szfullpathbuffer)).toUInt()
}

public fun PdhVerifySQLDBA(szdatasource: PCSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhVerifySQLDBA", longArrayOf(szdatasource)).toUInt()
}

public fun PdhVerifySQLDBW(szdatasource: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("pdh.dll", "PdhVerifySQLDBW", longArrayOf(szdatasource)).toUInt()
}

public fun PerfAddCounters(hquery: Foundation.HANDLE, pcounters: Long, cbcounters: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfAddCounters", longArrayOf(Win32DynamicFfi.objectSlot(hquery), pcounters, cbcounters.toLong())).toUInt()
}

public fun PerfCloseQueryHandle(hquery: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfCloseQueryHandle", longArrayOf(Win32DynamicFfi.objectSlot(hquery))).toUInt()
}

public fun PerfCreateInstance(providerhandle: Foundation.HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfCreateInstance", longArrayOf(Win32DynamicFfi.objectSlot(providerhandle), countersetguid, name, id.toLong()))
}

public fun PerfDecrementULongCounterValue(provider: Foundation.HANDLE, instance: Long, counterid: UInt, value: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfDecrementULongCounterValue", longArrayOf(Win32DynamicFfi.objectSlot(provider), instance, counterid.toLong(), value.toLong())).toUInt()
}

public fun PerfDecrementULongLongCounterValue(provider: Foundation.HANDLE, instance: Long, counterid: UInt, value: ULong): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfDecrementULongLongCounterValue", longArrayOf(Win32DynamicFfi.objectSlot(provider), instance, counterid.toLong(), value.toLong())).toUInt()
}

public fun PerfDeleteCounters(hquery: Foundation.HANDLE, pcounters: Long, cbcounters: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfDeleteCounters", longArrayOf(Win32DynamicFfi.objectSlot(hquery), pcounters, cbcounters.toLong())).toUInt()
}

public fun PerfDeleteInstance(provider: Foundation.HANDLE, instanceblock: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfDeleteInstance", longArrayOf(Win32DynamicFfi.objectSlot(provider), instanceblock)).toUInt()
}

public fun PerfEnumerateCounterSet(szmachine: PCWSTR, pcountersetids: Long, ccountersetids: UInt, pccountersetidsactual: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfEnumerateCounterSet", longArrayOf(szmachine, pcountersetids, ccountersetids.toLong(), pccountersetidsactual)).toUInt()
}

public fun PerfEnumerateCounterSetInstances(szmachine: PCWSTR, pcountersetid: Long, pinstances: Long, cbinstances: UInt, pcbinstancesactual: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfEnumerateCounterSetInstances", longArrayOf(szmachine, pcountersetid, pinstances, cbinstances.toLong(), pcbinstancesactual)).toUInt()
}

public fun PerfIncrementULongCounterValue(provider: Foundation.HANDLE, instance: Long, counterid: UInt, value: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfIncrementULongCounterValue", longArrayOf(Win32DynamicFfi.objectSlot(provider), instance, counterid.toLong(), value.toLong())).toUInt()
}

public fun PerfIncrementULongLongCounterValue(provider: Foundation.HANDLE, instance: Long, counterid: UInt, value: ULong): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfIncrementULongLongCounterValue", longArrayOf(Win32DynamicFfi.objectSlot(provider), instance, counterid.toLong(), value.toLong())).toUInt()
}

public fun PerfOpenQueryHandle(szmachine: PCWSTR, phquery: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfOpenQueryHandle", longArrayOf(szmachine, phquery)).toUInt()
}

public fun PerfQueryCounterData(hquery: Foundation.HANDLE, pcounterblock: Long, cbcounterblock: UInt, pcbcounterblockactual: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfQueryCounterData", longArrayOf(Win32DynamicFfi.objectSlot(hquery), pcounterblock, cbcounterblock.toLong(), pcbcounterblockactual)).toUInt()
}

public fun PerfQueryCounterInfo(hquery: Foundation.HANDLE, pcounters: Long, cbcounters: UInt, pcbcountersactual: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfQueryCounterInfo", longArrayOf(Win32DynamicFfi.objectSlot(hquery), pcounters, cbcounters.toLong(), pcbcountersactual)).toUInt()
}

public fun PerfQueryCounterSetRegistrationInfo(szmachine: PCWSTR, pcountersetid: Long, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: Long, cbreginfo: UInt, pcbreginfoactual: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfQueryCounterSetRegistrationInfo", longArrayOf(szmachine, pcountersetid, requestcode.toLong(), requestlangid.toLong(), pbreginfo, cbreginfo.toLong(), pcbreginfoactual)).toUInt()
}

public fun PerfQueryInstance(providerhandle: Foundation.HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfQueryInstance", longArrayOf(Win32DynamicFfi.objectSlot(providerhandle), countersetguid, name, id.toLong()))
}

public fun PerfSetCounterRefValue(provider: Foundation.HANDLE, instance: Long, counterid: UInt, address: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfSetCounterRefValue", longArrayOf(Win32DynamicFfi.objectSlot(provider), instance, counterid.toLong(), address)).toUInt()
}

public fun PerfSetCounterSetInfo(providerhandle: Foundation.HANDLE, template: Long, templatesize: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfSetCounterSetInfo", longArrayOf(Win32DynamicFfi.objectSlot(providerhandle), template, templatesize.toLong())).toUInt()
}

public fun PerfSetULongCounterValue(provider: Foundation.HANDLE, instance: Long, counterid: UInt, value: UInt): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfSetULongCounterValue", longArrayOf(Win32DynamicFfi.objectSlot(provider), instance, counterid.toLong(), value.toLong())).toUInt()
}

public fun PerfSetULongLongCounterValue(provider: Foundation.HANDLE, instance: Long, counterid: UInt, value: ULong): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfSetULongLongCounterValue", longArrayOf(Win32DynamicFfi.objectSlot(provider), instance, counterid.toLong(), value.toLong())).toUInt()
}

public fun PerfStartProvider(providerguid: Long, controlcallback: PERFLIBREQUEST, phprovider: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfStartProvider", longArrayOf(providerguid, Win32DynamicFfi.objectSlot(controlcallback), phprovider)).toUInt()
}

public fun PerfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfStartProviderEx", longArrayOf(providerguid, providercontext, provider)).toUInt()
}

public fun PerfStopProvider(providerhandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("advapi32.dll", "PerfStopProvider", longArrayOf(Win32DynamicFfi.objectSlot(providerhandle))).toUInt()
}

public fun QueryPerformanceCounter(lpperformancecount: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryPerformanceCounter", longArrayOf(lpperformancecount)).toInt()
}

public fun QueryPerformanceFrequency(lpfrequency: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "QueryPerformanceFrequency", longArrayOf(lpfrequency)).toInt()
}

public fun RestorePerfRegistryFromFileW(szfilename: PCWSTR, szlangid: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "RestorePerfRegistryFromFileW", longArrayOf(szfilename, szlangid)).toUInt()
}

public fun SetServiceAsTrustedA(szreserved: PCSTR, szservicename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "SetServiceAsTrustedA", longArrayOf(szreserved, szservicename)).toUInt()
}

public fun SetServiceAsTrustedW(szreserved: PCWSTR, szservicename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "SetServiceAsTrustedW", longArrayOf(szreserved, szservicename)).toUInt()
}

public fun UnloadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "UnloadPerfCounterTextStringsA", longArrayOf(lpcommandline, bquietmodearg.toLong())).toUInt()
}

public fun UnloadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "UnloadPerfCounterTextStringsW", longArrayOf(lpcommandline, bquietmodearg.toLong())).toUInt()
}

public fun UpdatePerfNameFilesA(sznewctrfilepath: PCSTR, sznewhlpfilepath: PCSTR, szlanguageid: PCSTR, dwflags: ULong): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "UpdatePerfNameFilesA", longArrayOf(sznewctrfilepath, sznewhlpfilepath, szlanguageid, dwflags.toLong())).toUInt()
}

public fun UpdatePerfNameFilesW(sznewctrfilepath: PCWSTR, sznewhlpfilepath: PCWSTR, szlanguageid: PCWSTR, dwflags: ULong): UInt {
    return Win32DynamicFfi.invoke("loadperf.dll", "UpdatePerfNameFilesW", longArrayOf(sznewctrfilepath, sznewhlpfilepath, szlanguageid, dwflags.toLong())).toUInt()
}
