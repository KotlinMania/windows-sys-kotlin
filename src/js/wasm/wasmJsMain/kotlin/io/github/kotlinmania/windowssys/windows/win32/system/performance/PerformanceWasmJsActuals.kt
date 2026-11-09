@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun BackupPerfRegistryToFileW(szfilename: PCWSTR, szcommentstring: PCWSTR): UInt =
    0u

public actual fun InstallPerfDllA(szcomputername: PCSTR, lpinifile: PCSTR, dwflags: ULong): UInt =
    0u

public actual fun InstallPerfDllW(szcomputername: PCWSTR, lpinifile: PCWSTR, dwflags: ULong): UInt =
    0u

public actual fun LoadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    0u

public actual fun LoadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    0u

public actual fun PdhAddCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    0u

public actual fun PdhAddCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    0u

public actual fun PdhAddEnglishCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    0u

public actual fun PdhAddEnglishCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    0u

public actual fun PdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: PCSTR): UInt =
    0u

public actual fun PdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: PCWSTR): UInt =
    0u

public actual fun PdhBrowseCountersA(pbrowsedlgdata: Long): UInt =
    0u

public actual fun PdhBrowseCountersHA(pbrowsedlgdata: Long): UInt =
    0u

public actual fun PdhBrowseCountersHW(pbrowsedlgdata: Long): UInt =
    0u

public actual fun PdhBrowseCountersW(pbrowsedlgdata: Long): UInt =
    0u

public actual fun PdhCalculateCounterFromRawValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): UInt =
    0u

public actual fun PdhCloseLog(hlog: PDH_HLOG, dwflags: UInt): UInt =
    0u

public actual fun PdhCloseQuery(hquery: PDH_HQUERY): UInt =
    0u

public actual fun PdhCollectQueryData(hquery: PDH_HQUERY): UInt =
    0u

public actual fun PdhCollectQueryDataEx(hquery: PDH_HQUERY, dwintervaltime: UInt, hnewdataevent: HANDLE): UInt =
    0u

public actual fun PdhCollectQueryDataWithTime(hquery: PDH_HQUERY, plltimestamp: Long): UInt =
    0u

public actual fun PdhComputeCounterStatistics(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: Long, data: Long): UInt =
    0u

public actual fun PdhConnectMachineA(szmachinename: PCSTR): UInt =
    0u

public actual fun PdhConnectMachineW(szmachinename: PCWSTR): UInt =
    0u

public actual fun PdhCreateSQLTablesA(szdatasource: PCSTR): UInt =
    0u

public actual fun PdhCreateSQLTablesW(szdatasource: PCWSTR): UInt =
    0u

public actual fun PdhEnumLogSetNamesA(szdatasource: PCSTR, mszdatasetnamelist: PSTR, pcchbufferlength: Long): UInt =
    0u

public actual fun PdhEnumLogSetNamesW(szdatasource: PCWSTR, mszdatasetnamelist: PWSTR, pcchbufferlength: Long): UInt =
    0u

public actual fun PdhEnumMachinesA(szdatasource: PCSTR, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhEnumMachinesHA(hdatasource: PDH_HLOG, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhEnumMachinesHW(hdatasource: PDH_HLOG, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhEnumMachinesW(szdatasource: PCWSTR, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhEnumObjectItemsA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    0u

public actual fun PdhEnumObjectItemsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    0u

public actual fun PdhEnumObjectItemsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    0u

public actual fun PdhEnumObjectItemsW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    0u

public actual fun PdhEnumObjectsA(szdatasource: PCSTR, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    0u

public actual fun PdhEnumObjectsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    0u

public actual fun PdhEnumObjectsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    0u

public actual fun PdhEnumObjectsW(szdatasource: PCWSTR, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    0u

public actual fun PdhExpandCounterPathA(szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long): UInt =
    0u

public actual fun PdhExpandCounterPathW(szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long): UInt =
    0u

public actual fun PdhExpandWildCardPathA(szdatasource: PCSTR, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    0u

public actual fun PdhExpandWildCardPathHA(hdatasource: PDH_HLOG, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    0u

public actual fun PdhExpandWildCardPathHW(hdatasource: PDH_HLOG, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    0u

public actual fun PdhExpandWildCardPathW(szdatasource: PCWSTR, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    0u

public actual fun PdhFormatFromRawValue(dwcountertype: UInt, dwformat: PDH_FMT, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): UInt =
    0u

public actual fun PdhGetCounterInfoA(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    0u

public actual fun PdhGetCounterInfoW(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    0u

public actual fun PdhGetCounterTimeBase(hcounter: PDH_HCOUNTER, ptimebase: Long): UInt =
    0u

public actual fun PdhGetDataSourceTimeRangeA(szdatasource: PCSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    0u

public actual fun PdhGetDataSourceTimeRangeH(hdatasource: PDH_HLOG, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    0u

public actual fun PdhGetDataSourceTimeRangeW(szdatasource: PCWSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfCounterA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfCounterHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfCounterHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfCounterW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfObjectA(szdatasource: PCSTR, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfObjectHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfObjectHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDefaultPerfObjectW(szdatasource: PCWSTR, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    0u

public actual fun PdhGetDllVersion(lpdwversion: Long): UInt =
    0u

public actual fun PdhGetFormattedCounterArrayA(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    0u

public actual fun PdhGetFormattedCounterArrayW(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    0u

public actual fun PdhGetFormattedCounterValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwtype: Long, pvalue: Long): UInt =
    0u

public actual fun PdhGetLogFileSize(hlog: PDH_HLOG, llsize: Long): UInt =
    0u

public actual fun PdhGetLogSetGUID(hlog: PDH_HLOG, pguid: Long, prunid: Long): UInt =
    0u

public actual fun PdhGetRawCounterArrayA(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    0u

public actual fun PdhGetRawCounterArrayW(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    0u

public actual fun PdhGetRawCounterValue(hcounter: PDH_HCOUNTER, lpdwtype: Long, pvalue: Long): UInt =
    0u

public actual fun PdhIsRealTimeQuery(hquery: PDH_HQUERY): BOOL =
    0

public actual fun PdhLookupPerfIndexByNameA(szmachinename: PCSTR, sznamebuffer: PCSTR, pdwindex: Long): UInt =
    0u

public actual fun PdhLookupPerfIndexByNameW(szmachinename: PCWSTR, sznamebuffer: PCWSTR, pdwindex: Long): UInt =
    0u

public actual fun PdhLookupPerfNameByIndexA(szmachinename: PCSTR, dwnameindex: UInt, sznamebuffer: PSTR, pcchnamebuffersize: Long): UInt =
    0u

public actual fun PdhLookupPerfNameByIndexW(szmachinename: PCWSTR, dwnameindex: UInt, sznamebuffer: PWSTR, pcchnamebuffersize: Long): UInt =
    0u

public actual fun PdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: PSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    0u

public actual fun PdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: PWSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    0u

public actual fun PdhOpenLogA(szlogfilename: PCSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCSTR, phlog: Long): UInt =
    0u

public actual fun PdhOpenLogW(szlogfilename: PCWSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCWSTR, phlog: Long): UInt =
    0u

public actual fun PdhOpenQueryA(szdatasource: PCSTR, dwuserdata: ULong, phquery: Long): UInt =
    0u

public actual fun PdhOpenQueryH(hdatasource: PDH_HLOG, dwuserdata: ULong, phquery: Long): UInt =
    0u

public actual fun PdhOpenQueryW(szdatasource: PCWSTR, dwuserdata: ULong, phquery: Long): UInt =
    0u

public actual fun PdhParseCounterPathA(szfullpathbuffer: PCSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    0u

public actual fun PdhParseCounterPathW(szfullpathbuffer: PCWSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    0u

public actual fun PdhParseInstanceNameA(szinstancestring: PCSTR, szinstancename: PSTR, pcchinstancenamelength: Long, szparentname: PSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    0u

public actual fun PdhParseInstanceNameW(szinstancestring: PCWSTR, szinstancename: PWSTR, pcchinstancenamelength: Long, szparentname: PWSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    0u

public actual fun PdhReadRawLogRecord(hlog: PDH_HLOG, ftrecord: FILETIME, prawlogrecord: Long, pdwbufferlength: Long): UInt =
    0u

public actual fun PdhRemoveCounter(hcounter: PDH_HCOUNTER): UInt =
    0u

public actual fun PdhSelectDataSourceA(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PSTR, pcchbufferlength: Long): UInt =
    0u

public actual fun PdhSelectDataSourceW(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PWSTR, pcchbufferlength: Long): UInt =
    0u

public actual fun PdhSetCounterScaleFactor(hcounter: PDH_HCOUNTER, lfactor: Int): UInt =
    0u

public actual fun PdhSetDefaultRealTimeDataSource(dwdatasourceid: REAL_TIME_DATA_SOURCE_ID_FLAGS): UInt =
    0u

public actual fun PdhSetLogSetRunID(hlog: PDH_HLOG, runid: Int): UInt =
    0u

public actual fun PdhSetQueryTimeRange(hquery: PDH_HQUERY, pinfo: Long): UInt =
    0u

public actual fun PdhUpdateLogA(hlog: PDH_HLOG, szuserstring: PCSTR): UInt =
    0u

public actual fun PdhUpdateLogFileCatalog(hlog: PDH_HLOG): UInt =
    0u

public actual fun PdhUpdateLogW(hlog: PDH_HLOG, szuserstring: PCWSTR): UInt =
    0u

public actual fun PdhValidatePathA(szfullpathbuffer: PCSTR): UInt =
    0u

public actual fun PdhValidatePathExA(hdatasource: PDH_HLOG, szfullpathbuffer: PCSTR): UInt =
    0u

public actual fun PdhValidatePathExW(hdatasource: PDH_HLOG, szfullpathbuffer: PCWSTR): UInt =
    0u

public actual fun PdhValidatePathW(szfullpathbuffer: PCWSTR): UInt =
    0u

public actual fun PdhVerifySQLDBA(szdatasource: PCSTR): UInt =
    0u

public actual fun PdhVerifySQLDBW(szdatasource: PCWSTR): UInt =
    0u

public actual fun PerfAddCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    0u

public actual fun PerfCloseQueryHandle(hquery: HANDLE): UInt =
    0u

public actual fun PerfCreateInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    0L

public actual fun PerfDecrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    0u

public actual fun PerfDecrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    0u

public actual fun PerfDeleteCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    0u

public actual fun PerfDeleteInstance(provider: HANDLE, instanceblock: Long): UInt =
    0u

public actual fun PerfEnumerateCounterSet(szmachine: PCWSTR, pcountersetids: Long, ccountersetids: UInt, pccountersetidsactual: Long): UInt =
    0u

public actual fun PerfEnumerateCounterSetInstances(szmachine: PCWSTR, pcountersetid: Long, pinstances: Long, cbinstances: UInt, pcbinstancesactual: Long): UInt =
    0u

public actual fun PerfIncrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    0u

public actual fun PerfIncrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    0u

public actual fun PerfOpenQueryHandle(szmachine: PCWSTR, phquery: Long): UInt =
    0u

public actual fun PerfQueryCounterData(hquery: HANDLE, pcounterblock: Long, cbcounterblock: UInt, pcbcounterblockactual: Long): UInt =
    0u

public actual fun PerfQueryCounterInfo(hquery: HANDLE, pcounters: Long, cbcounters: UInt, pcbcountersactual: Long): UInt =
    0u

public actual fun PerfQueryCounterSetRegistrationInfo(szmachine: PCWSTR, pcountersetid: Long, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: Long, cbreginfo: UInt, pcbreginfoactual: Long): UInt =
    0u

public actual fun PerfQueryInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    0L

public actual fun PerfSetCounterRefValue(provider: HANDLE, instance: Long, counterid: UInt, address: Long): UInt =
    0u

public actual fun PerfSetCounterSetInfo(providerhandle: HANDLE, template: Long, templatesize: UInt): UInt =
    0u

public actual fun PerfSetULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    0u

public actual fun PerfSetULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    0u

public actual fun PerfStartProvider(providerguid: Long, controlcallback: PERFLIBREQUEST, phprovider: Long): UInt =
    0u

public actual fun PerfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): UInt =
    0u

public actual fun PerfStopProvider(providerhandle: HANDLE): UInt =
    0u

public actual fun QueryPerformanceCounter(lpperformancecount: Long): BOOL =
    0

public actual fun QueryPerformanceFrequency(lpfrequency: Long): BOOL =
    0

public actual fun RestorePerfRegistryFromFileW(szfilename: PCWSTR, szlangid: PCWSTR): UInt =
    0u

public actual fun SetServiceAsTrustedA(szreserved: PCSTR, szservicename: PCSTR): UInt =
    0u

public actual fun SetServiceAsTrustedW(szreserved: PCWSTR, szservicename: PCWSTR): UInt =
    0u

public actual fun UnloadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    0u

public actual fun UnloadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    0u

public actual fun UpdatePerfNameFilesA(sznewctrfilepath: PCSTR, sznewhlpfilepath: PCSTR, szlanguageid: PCSTR, dwflags: ULong): UInt =
    0u

public actual fun UpdatePerfNameFilesW(sznewctrfilepath: PCWSTR, sznewhlpfilepath: PCWSTR, szlanguageid: PCWSTR, dwflags: ULong): UInt =
    0u
