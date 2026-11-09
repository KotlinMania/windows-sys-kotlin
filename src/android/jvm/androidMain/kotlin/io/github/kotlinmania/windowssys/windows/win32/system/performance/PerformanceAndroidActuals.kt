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

private object WindowsWin32SystemPerformanceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_BackupPerfRegistryToFileW(szfilename: Long, szcommentstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_InstallPerfDllA(szcomputername: Long, lpinifile: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_InstallPerfDllW(szcomputername: Long, lpinifile: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsA(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsW(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhAddCounterA(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhAddCounterW(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhAddEnglishCounterA(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhAddEnglishCounterW(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhBrowseCountersA(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhBrowseCountersHA(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhBrowseCountersHW(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhBrowseCountersW(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCalculateCounterFromRawValue(hcounter: Long, dwformat: Int, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCloseLog(hlog: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCloseQuery(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCollectQueryData(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCollectQueryDataEx(hquery: Long, dwintervaltime: Int, hnewdataevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCollectQueryDataWithTime(hquery: Long, plltimestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhComputeCounterStatistics(hcounter: Long, dwformat: Int, dwfirstentry: Int, dwnumentries: Int, lprawvaluearray: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhConnectMachineA(szmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhConnectMachineW(szmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCreateSQLTablesA(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhCreateSQLTablesW(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumLogSetNamesA(szdatasource: Long, mszdatasetnamelist: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumLogSetNamesW(szdatasource: Long, mszdatasetnamelist: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumMachinesA(szdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumMachinesHA(hdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumMachinesHW(hdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumMachinesW(szdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectItemsA(szdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectItemsHA(hdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectItemsHW(hdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectItemsW(szdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectsA(szdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectsHA(hdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectsHW(hdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhEnumObjectsW(szdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhExpandCounterPathA(szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhExpandCounterPathW(szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhExpandWildCardPathA(szdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhExpandWildCardPathHA(hdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhExpandWildCardPathHW(hdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhExpandWildCardPathW(szdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhFormatFromRawValue(dwcountertype: Int, dwformat: Int, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetCounterInfoA(hcounter: Long, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetCounterInfoW(hcounter: Long, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetCounterTimeBase(hcounter: Long, ptimebase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeA(szdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeH(hdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeW(szdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterA(szdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHA(hdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHW(hdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterW(szdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectA(szdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHA(hdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHW(hdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectW(szdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetDllVersion(lpdwversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayA(hcounter: Long, dwformat: Int, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayW(hcounter: Long, dwformat: Int, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetFormattedCounterValue(hcounter: Long, dwformat: Int, lpdwtype: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetLogFileSize(hlog: Long, llsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetLogSetGUID(hlog: Long, pguid: Long, prunid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetRawCounterArrayA(hcounter: Long, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetRawCounterArrayW(hcounter: Long, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhGetRawCounterValue(hcounter: Long, lpdwtype: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhIsRealTimeQuery(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameA(szmachinename: Long, sznamebuffer: Long, pdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameW(szmachinename: Long, sznamebuffer: Long, pdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexA(szmachinename: Long, dwnameindex: Int, sznamebuffer: Long, pcchnamebuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexW(szmachinename: Long, dwnameindex: Int, sznamebuffer: Long, pcchnamebuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: Long, pcchbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: Long, pcchbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhOpenLogA(szlogfilename: Long, dwaccessflags: Int, lpdwlogtype: Long, hquery: Long, dwmaxsize: Int, szusercaption: Long, phlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhOpenLogW(szlogfilename: Long, dwaccessflags: Int, lpdwlogtype: Long, hquery: Long, dwmaxsize: Int, szusercaption: Long, phlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhOpenQueryA(szdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhOpenQueryH(hdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhOpenQueryW(szdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhParseCounterPathA(szfullpathbuffer: Long, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhParseCounterPathW(szfullpathbuffer: Long, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhParseInstanceNameA(szinstancestring: Long, szinstancename: Long, pcchinstancenamelength: Long, szparentname: Long, pcchparentnamelength: Long, lpindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhParseInstanceNameW(szinstancestring: Long, szinstancename: Long, pcchinstancenamelength: Long, szparentname: Long, pcchparentnamelength: Long, lpindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhRemoveCounter(hcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhSelectDataSourceA(hwndowner: Long, dwflags: Int, szdatasource: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhSelectDataSourceW(hwndowner: Long, dwflags: Int, szdatasource: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhSetCounterScaleFactor(hcounter: Long, lfactor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhSetDefaultRealTimeDataSource(dwdatasourceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhSetLogSetRunID(hlog: Long, runid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhSetQueryTimeRange(hquery: Long, pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhUpdateLogA(hlog: Long, szuserstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhUpdateLogFileCatalog(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhUpdateLogW(hlog: Long, szuserstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhValidatePathA(szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhValidatePathExA(hdatasource: Long, szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhValidatePathExW(hdatasource: Long, szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhValidatePathW(szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhVerifySQLDBA(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PdhVerifySQLDBW(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfAddCounters(hquery: Long, pcounters: Long, cbcounters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfCloseQueryHandle(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfCreateInstance(providerhandle: Long, countersetguid: Long, name: Long, id: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfDecrementULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfDecrementULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfDeleteCounters(hquery: Long, pcounters: Long, cbcounters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfDeleteInstance(provider: Long, instanceblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfEnumerateCounterSet(szmachine: Long, pcountersetids: Long, ccountersetids: Int, pccountersetidsactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfEnumerateCounterSetInstances(szmachine: Long, pcountersetid: Long, pinstances: Long, cbinstances: Int, pcbinstancesactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfIncrementULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfIncrementULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfOpenQueryHandle(szmachine: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfQueryCounterData(hquery: Long, pcounterblock: Long, cbcounterblock: Int, pcbcounterblockactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfQueryCounterInfo(hquery: Long, pcounters: Long, cbcounters: Int, pcbcountersactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfQueryCounterSetRegistrationInfo(szmachine: Long, pcountersetid: Long, requestcode: Int, requestlangid: Int, pbreginfo: Long, cbreginfo: Int, pcbreginfoactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfQueryInstance(providerhandle: Long, countersetguid: Long, name: Long, id: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfSetCounterRefValue(provider: Long, instance: Long, counterid: Int, address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfSetCounterSetInfo(providerhandle: Long, template: Long, templatesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfSetULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfSetULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfStartProvider(providerguid: Long, controlcallback: Long, phprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_PerfStopProvider(providerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_QueryPerformanceCounter(lpperformancecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_QueryPerformanceFrequency(lpfrequency: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_RestorePerfRegistryFromFileW(szfilename: Long, szlangid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_SetServiceAsTrustedA(szreserved: Long, szservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_SetServiceAsTrustedW(szreserved: Long, szservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsA(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsW(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_UpdatePerfNameFilesA(sznewctrfilepath: Long, sznewhlpfilepath: Long, szlanguageid: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_UpdatePerfNameFilesW(sznewctrfilepath: Long, sznewhlpfilepath: Long, szlanguageid: Long, dwflags: Long): Int
}

public actual fun BackupPerfRegistryToFileW(szfilename: PCWSTR, szcommentstring: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_BackupPerfRegistryToFileW(szfilename, szcommentstring).toUInt()

public actual fun InstallPerfDllA(szcomputername: PCSTR, lpinifile: PCSTR, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_InstallPerfDllA(szcomputername, lpinifile, dwflags.toLong()).toUInt()

public actual fun InstallPerfDllW(szcomputername: PCWSTR, lpinifile: PCWSTR, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_InstallPerfDllW(szcomputername, lpinifile, dwflags.toLong()).toUInt()

public actual fun LoadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsA(lpcommandline, bquietmodearg).toUInt()

public actual fun LoadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsW(lpcommandline, bquietmodearg).toUInt()

public actual fun PdhAddCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhAddCounterA(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter).toUInt()

public actual fun PdhAddCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhAddCounterW(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter).toUInt()

public actual fun PdhAddEnglishCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhAddEnglishCounterA(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter).toUInt()

public actual fun PdhAddEnglishCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhAddEnglishCounterW(hquery, szfullcounterpath, dwuserdata.toLong(), phcounter).toUInt()

public actual fun PdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhBindInputDataSourceA(phdatasource, logfilenamelist).toUInt()

public actual fun PdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhBindInputDataSourceW(phdatasource, logfilenamelist).toUInt()

public actual fun PdhBrowseCountersA(pbrowsedlgdata: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhBrowseCountersA(pbrowsedlgdata).toUInt()

public actual fun PdhBrowseCountersHA(pbrowsedlgdata: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhBrowseCountersHA(pbrowsedlgdata).toUInt()

public actual fun PdhBrowseCountersHW(pbrowsedlgdata: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhBrowseCountersHW(pbrowsedlgdata).toUInt()

public actual fun PdhBrowseCountersW(pbrowsedlgdata: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhBrowseCountersW(pbrowsedlgdata).toUInt()

public actual fun PdhCalculateCounterFromRawValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCalculateCounterFromRawValue(hcounter, dwformat.toInt(), rawvalue1, rawvalue2, fmtvalue).toUInt()

public actual fun PdhCloseLog(hlog: PDH_HLOG, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCloseLog(hlog, dwflags.toInt()).toUInt()

public actual fun PdhCloseQuery(hquery: PDH_HQUERY): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCloseQuery(hquery).toUInt()

public actual fun PdhCollectQueryData(hquery: PDH_HQUERY): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCollectQueryData(hquery).toUInt()

public actual fun PdhCollectQueryDataEx(hquery: PDH_HQUERY, dwintervaltime: UInt, hnewdataevent: HANDLE): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCollectQueryDataEx(hquery, dwintervaltime.toInt(), hnewdataevent).toUInt()

public actual fun PdhCollectQueryDataWithTime(hquery: PDH_HQUERY, plltimestamp: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCollectQueryDataWithTime(hquery, plltimestamp).toUInt()

public actual fun PdhComputeCounterStatistics(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: Long, data: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhComputeCounterStatistics(hcounter, dwformat.toInt(), dwfirstentry.toInt(), dwnumentries.toInt(), lprawvaluearray, data).toUInt()

public actual fun PdhConnectMachineA(szmachinename: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhConnectMachineA(szmachinename).toUInt()

public actual fun PdhConnectMachineW(szmachinename: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhConnectMachineW(szmachinename).toUInt()

public actual fun PdhCreateSQLTablesA(szdatasource: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCreateSQLTablesA(szdatasource).toUInt()

public actual fun PdhCreateSQLTablesW(szdatasource: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhCreateSQLTablesW(szdatasource).toUInt()

public actual fun PdhEnumLogSetNamesA(szdatasource: PCSTR, mszdatasetnamelist: PSTR, pcchbufferlength: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumLogSetNamesA(szdatasource, mszdatasetnamelist, pcchbufferlength).toUInt()

public actual fun PdhEnumLogSetNamesW(szdatasource: PCWSTR, mszdatasetnamelist: PWSTR, pcchbufferlength: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumLogSetNamesW(szdatasource, mszdatasetnamelist, pcchbufferlength).toUInt()

public actual fun PdhEnumMachinesA(szdatasource: PCSTR, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumMachinesA(szdatasource, mszmachinelist, pcchbuffersize).toUInt()

public actual fun PdhEnumMachinesHA(hdatasource: PDH_HLOG, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumMachinesHA(hdatasource, mszmachinelist, pcchbuffersize).toUInt()

public actual fun PdhEnumMachinesHW(hdatasource: PDH_HLOG, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumMachinesHW(hdatasource, mszmachinelist, pcchbuffersize).toUInt()

public actual fun PdhEnumMachinesW(szdatasource: PCWSTR, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumMachinesW(szdatasource, mszmachinelist, pcchbuffersize).toUInt()

public actual fun PdhEnumObjectItemsA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectItemsA(szdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun PdhEnumObjectItemsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectItemsHA(hdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun PdhEnumObjectItemsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectItemsHW(hdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun PdhEnumObjectItemsW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectItemsW(szdatasource, szmachinename, szobjectname, mszcounterlist, pcchcounterlistlength, mszinstancelist, pcchinstancelistlength, dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun PdhEnumObjectsA(szdatasource: PCSTR, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectsA(szdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun PdhEnumObjectsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectsHA(hdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun PdhEnumObjectsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectsHW(hdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun PdhEnumObjectsW(szdatasource: PCWSTR, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhEnumObjectsW(szdatasource, szmachinename, mszobjectlist, pcchbuffersize, dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun PdhExpandCounterPathA(szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhExpandCounterPathA(szwildcardpath, mszexpandedpathlist, pcchpathlistlength).toUInt()

public actual fun PdhExpandCounterPathW(szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhExpandCounterPathW(szwildcardpath, mszexpandedpathlist, pcchpathlistlength).toUInt()

public actual fun PdhExpandWildCardPathA(szdatasource: PCSTR, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhExpandWildCardPathA(szdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toInt()).toUInt()

public actual fun PdhExpandWildCardPathHA(hdatasource: PDH_HLOG, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhExpandWildCardPathHA(hdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toInt()).toUInt()

public actual fun PdhExpandWildCardPathHW(hdatasource: PDH_HLOG, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhExpandWildCardPathHW(hdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toInt()).toUInt()

public actual fun PdhExpandWildCardPathW(szdatasource: PCWSTR, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhExpandWildCardPathW(szdatasource, szwildcardpath, mszexpandedpathlist, pcchpathlistlength, dwflags.toInt()).toUInt()

public actual fun PdhFormatFromRawValue(dwcountertype: UInt, dwformat: PDH_FMT, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhFormatFromRawValue(dwcountertype.toInt(), dwformat.toInt(), ptimebase, prawvalue1, prawvalue2, pfmtvalue).toUInt()

public actual fun PdhGetCounterInfoA(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetCounterInfoA(hcounter, bretrieveexplaintext, pdwbuffersize, lpbuffer).toUInt()

public actual fun PdhGetCounterInfoW(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetCounterInfoW(hcounter, bretrieveexplaintext, pdwbuffersize, lpbuffer).toUInt()

public actual fun PdhGetCounterTimeBase(hcounter: PDH_HCOUNTER, ptimebase: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetCounterTimeBase(hcounter, ptimebase).toUInt()

public actual fun PdhGetDataSourceTimeRangeA(szdatasource: PCSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeA(szdatasource, pdwnumentries, pinfo, pdwbuffersize).toUInt()

public actual fun PdhGetDataSourceTimeRangeH(hdatasource: PDH_HLOG, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeH(hdatasource, pdwnumentries, pinfo, pdwbuffersize).toUInt()

public actual fun PdhGetDataSourceTimeRangeW(szdatasource: PCWSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeW(szdatasource, pdwnumentries, pinfo, pdwbuffersize).toUInt()

public actual fun PdhGetDefaultPerfCounterA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterA(szdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize).toUInt()

public actual fun PdhGetDefaultPerfCounterHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHA(hdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize).toUInt()

public actual fun PdhGetDefaultPerfCounterHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHW(hdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize).toUInt()

public actual fun PdhGetDefaultPerfCounterW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterW(szdatasource, szmachinename, szobjectname, szdefaultcountername, pcchbuffersize).toUInt()

public actual fun PdhGetDefaultPerfObjectA(szdatasource: PCSTR, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectA(szdatasource, szmachinename, szdefaultobjectname, pcchbuffersize).toUInt()

public actual fun PdhGetDefaultPerfObjectHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHA(hdatasource, szmachinename, szdefaultobjectname, pcchbuffersize).toUInt()

public actual fun PdhGetDefaultPerfObjectHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHW(hdatasource, szmachinename, szdefaultobjectname, pcchbuffersize).toUInt()

public actual fun PdhGetDefaultPerfObjectW(szdatasource: PCWSTR, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectW(szdatasource, szmachinename, szdefaultobjectname, pcchbuffersize).toUInt()

public actual fun PdhGetDllVersion(lpdwversion: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetDllVersion(lpdwversion).toUInt()

public actual fun PdhGetFormattedCounterArrayA(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayA(hcounter, dwformat.toInt(), lpdwbuffersize, lpdwitemcount, itembuffer).toUInt()

public actual fun PdhGetFormattedCounterArrayW(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayW(hcounter, dwformat.toInt(), lpdwbuffersize, lpdwitemcount, itembuffer).toUInt()

public actual fun PdhGetFormattedCounterValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwtype: Long, pvalue: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetFormattedCounterValue(hcounter, dwformat.toInt(), lpdwtype, pvalue).toUInt()

public actual fun PdhGetLogFileSize(hlog: PDH_HLOG, llsize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetLogFileSize(hlog, llsize).toUInt()

public actual fun PdhGetLogSetGUID(hlog: PDH_HLOG, pguid: Long, prunid: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetLogSetGUID(hlog, pguid, prunid).toUInt()

public actual fun PdhGetRawCounterArrayA(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetRawCounterArrayA(hcounter, lpdwbuffersize, lpdwitemcount, itembuffer).toUInt()

public actual fun PdhGetRawCounterArrayW(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetRawCounterArrayW(hcounter, lpdwbuffersize, lpdwitemcount, itembuffer).toUInt()

public actual fun PdhGetRawCounterValue(hcounter: PDH_HCOUNTER, lpdwtype: Long, pvalue: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhGetRawCounterValue(hcounter, lpdwtype, pvalue).toUInt()

public actual fun PdhIsRealTimeQuery(hquery: PDH_HQUERY): BOOL =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhIsRealTimeQuery(hquery)

public actual fun PdhLookupPerfIndexByNameA(szmachinename: PCSTR, sznamebuffer: PCSTR, pdwindex: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameA(szmachinename, sznamebuffer, pdwindex).toUInt()

public actual fun PdhLookupPerfIndexByNameW(szmachinename: PCWSTR, sznamebuffer: PCWSTR, pdwindex: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameW(szmachinename, sznamebuffer, pdwindex).toUInt()

public actual fun PdhLookupPerfNameByIndexA(szmachinename: PCSTR, dwnameindex: UInt, sznamebuffer: PSTR, pcchnamebuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexA(szmachinename, dwnameindex.toInt(), sznamebuffer, pcchnamebuffersize).toUInt()

public actual fun PdhLookupPerfNameByIndexW(szmachinename: PCWSTR, dwnameindex: UInt, sznamebuffer: PWSTR, pcchnamebuffersize: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexW(szmachinename, dwnameindex.toInt(), sznamebuffer, pcchnamebuffersize).toUInt()

public actual fun PdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: PSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhMakeCounterPathA(pcounterpathelements, szfullpathbuffer, pcchbuffersize, dwflags.toInt()).toUInt()

public actual fun PdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: PWSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhMakeCounterPathW(pcounterpathelements, szfullpathbuffer, pcchbuffersize, dwflags.toInt()).toUInt()

public actual fun PdhOpenLogA(szlogfilename: PCSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCSTR, phlog: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhOpenLogA(szlogfilename, dwaccessflags.toInt(), lpdwlogtype, hquery, dwmaxsize.toInt(), szusercaption, phlog).toUInt()

public actual fun PdhOpenLogW(szlogfilename: PCWSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCWSTR, phlog: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhOpenLogW(szlogfilename, dwaccessflags.toInt(), lpdwlogtype, hquery, dwmaxsize.toInt(), szusercaption, phlog).toUInt()

public actual fun PdhOpenQueryA(szdatasource: PCSTR, dwuserdata: ULong, phquery: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhOpenQueryA(szdatasource, dwuserdata.toLong(), phquery).toUInt()

public actual fun PdhOpenQueryH(hdatasource: PDH_HLOG, dwuserdata: ULong, phquery: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhOpenQueryH(hdatasource, dwuserdata.toLong(), phquery).toUInt()

public actual fun PdhOpenQueryW(szdatasource: PCWSTR, dwuserdata: ULong, phquery: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhOpenQueryW(szdatasource, dwuserdata.toLong(), phquery).toUInt()

public actual fun PdhParseCounterPathA(szfullpathbuffer: PCSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhParseCounterPathA(szfullpathbuffer, pcounterpathelements, pdwbuffersize, dwflags.toInt()).toUInt()

public actual fun PdhParseCounterPathW(szfullpathbuffer: PCWSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhParseCounterPathW(szfullpathbuffer, pcounterpathelements, pdwbuffersize, dwflags.toInt()).toUInt()

public actual fun PdhParseInstanceNameA(szinstancestring: PCSTR, szinstancename: PSTR, pcchinstancenamelength: Long, szparentname: PSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhParseInstanceNameA(szinstancestring, szinstancename, pcchinstancenamelength, szparentname, pcchparentnamelength, lpindex).toUInt()

public actual fun PdhParseInstanceNameW(szinstancestring: PCWSTR, szinstancename: PWSTR, pcchinstancenamelength: Long, szparentname: PWSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhParseInstanceNameW(szinstancestring, szinstancename, pcchinstancenamelength, szparentname, pcchparentnamelength, lpindex).toUInt()

public actual fun PdhReadRawLogRecord(hlog: PDH_HLOG, ftrecord: FILETIME, prawlogrecord: Long, pdwbufferlength: Long): UInt =
    0u

public actual fun PdhRemoveCounter(hcounter: PDH_HCOUNTER): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhRemoveCounter(hcounter).toUInt()

public actual fun PdhSelectDataSourceA(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PSTR, pcchbufferlength: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhSelectDataSourceA(hwndowner, dwflags.toInt(), szdatasource, pcchbufferlength).toUInt()

public actual fun PdhSelectDataSourceW(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PWSTR, pcchbufferlength: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhSelectDataSourceW(hwndowner, dwflags.toInt(), szdatasource, pcchbufferlength).toUInt()

public actual fun PdhSetCounterScaleFactor(hcounter: PDH_HCOUNTER, lfactor: Int): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhSetCounterScaleFactor(hcounter, lfactor).toUInt()

public actual fun PdhSetDefaultRealTimeDataSource(dwdatasourceid: REAL_TIME_DATA_SOURCE_ID_FLAGS): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()).toUInt()

public actual fun PdhSetLogSetRunID(hlog: PDH_HLOG, runid: Int): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhSetLogSetRunID(hlog, runid).toUInt()

public actual fun PdhSetQueryTimeRange(hquery: PDH_HQUERY, pinfo: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhSetQueryTimeRange(hquery, pinfo).toUInt()

public actual fun PdhUpdateLogA(hlog: PDH_HLOG, szuserstring: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhUpdateLogA(hlog, szuserstring).toUInt()

public actual fun PdhUpdateLogFileCatalog(hlog: PDH_HLOG): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhUpdateLogFileCatalog(hlog).toUInt()

public actual fun PdhUpdateLogW(hlog: PDH_HLOG, szuserstring: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhUpdateLogW(hlog, szuserstring).toUInt()

public actual fun PdhValidatePathA(szfullpathbuffer: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhValidatePathA(szfullpathbuffer).toUInt()

public actual fun PdhValidatePathExA(hdatasource: PDH_HLOG, szfullpathbuffer: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhValidatePathExA(hdatasource, szfullpathbuffer).toUInt()

public actual fun PdhValidatePathExW(hdatasource: PDH_HLOG, szfullpathbuffer: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhValidatePathExW(hdatasource, szfullpathbuffer).toUInt()

public actual fun PdhValidatePathW(szfullpathbuffer: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhValidatePathW(szfullpathbuffer).toUInt()

public actual fun PdhVerifySQLDBA(szdatasource: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhVerifySQLDBA(szdatasource).toUInt()

public actual fun PdhVerifySQLDBW(szdatasource: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PdhVerifySQLDBW(szdatasource).toUInt()

public actual fun PerfAddCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfAddCounters(hquery, pcounters, cbcounters.toInt()).toUInt()

public actual fun PerfCloseQueryHandle(hquery: HANDLE): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfCloseQueryHandle(hquery).toUInt()

public actual fun PerfCreateInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfCreateInstance(providerhandle, countersetguid, name, id.toInt())

public actual fun PerfDecrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfDecrementULongCounterValue(provider, instance, counterid.toInt(), value.toInt()).toUInt()

public actual fun PerfDecrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfDecrementULongLongCounterValue(provider, instance, counterid.toInt(), value.toLong()).toUInt()

public actual fun PerfDeleteCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfDeleteCounters(hquery, pcounters, cbcounters.toInt()).toUInt()

public actual fun PerfDeleteInstance(provider: HANDLE, instanceblock: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfDeleteInstance(provider, instanceblock).toUInt()

public actual fun PerfEnumerateCounterSet(szmachine: PCWSTR, pcountersetids: Long, ccountersetids: UInt, pccountersetidsactual: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfEnumerateCounterSet(szmachine, pcountersetids, ccountersetids.toInt(), pccountersetidsactual).toUInt()

public actual fun PerfEnumerateCounterSetInstances(szmachine: PCWSTR, pcountersetid: Long, pinstances: Long, cbinstances: UInt, pcbinstancesactual: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfEnumerateCounterSetInstances(szmachine, pcountersetid, pinstances, cbinstances.toInt(), pcbinstancesactual).toUInt()

public actual fun PerfIncrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfIncrementULongCounterValue(provider, instance, counterid.toInt(), value.toInt()).toUInt()

public actual fun PerfIncrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfIncrementULongLongCounterValue(provider, instance, counterid.toInt(), value.toLong()).toUInt()

public actual fun PerfOpenQueryHandle(szmachine: PCWSTR, phquery: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfOpenQueryHandle(szmachine, phquery).toUInt()

public actual fun PerfQueryCounterData(hquery: HANDLE, pcounterblock: Long, cbcounterblock: UInt, pcbcounterblockactual: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfQueryCounterData(hquery, pcounterblock, cbcounterblock.toInt(), pcbcounterblockactual).toUInt()

public actual fun PerfQueryCounterInfo(hquery: HANDLE, pcounters: Long, cbcounters: UInt, pcbcountersactual: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfQueryCounterInfo(hquery, pcounters, cbcounters.toInt(), pcbcountersactual).toUInt()

public actual fun PerfQueryCounterSetRegistrationInfo(szmachine: PCWSTR, pcountersetid: Long, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: Long, cbreginfo: UInt, pcbreginfoactual: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfQueryCounterSetRegistrationInfo(szmachine, pcountersetid, requestcode, requestlangid.toInt(), pbreginfo, cbreginfo.toInt(), pcbreginfoactual).toUInt()

public actual fun PerfQueryInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfQueryInstance(providerhandle, countersetguid, name, id.toInt())

public actual fun PerfSetCounterRefValue(provider: HANDLE, instance: Long, counterid: UInt, address: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfSetCounterRefValue(provider, instance, counterid.toInt(), address).toUInt()

public actual fun PerfSetCounterSetInfo(providerhandle: HANDLE, template: Long, templatesize: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfSetCounterSetInfo(providerhandle, template, templatesize.toInt()).toUInt()

public actual fun PerfSetULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfSetULongCounterValue(provider, instance, counterid.toInt(), value.toInt()).toUInt()

public actual fun PerfSetULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfSetULongLongCounterValue(provider, instance, counterid.toInt(), value.toLong()).toUInt()

public actual fun PerfStartProvider(providerguid: Long, controlcallback: PERFLIBREQUEST, phprovider: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfStartProvider(providerguid, controlcallback.toLong(), phprovider).toUInt()

public actual fun PerfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfStartProviderEx(providerguid, providercontext, provider).toUInt()

public actual fun PerfStopProvider(providerhandle: HANDLE): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_PerfStopProvider(providerhandle).toUInt()

public actual fun QueryPerformanceCounter(lpperformancecount: Long): BOOL =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_QueryPerformanceCounter(lpperformancecount)

public actual fun QueryPerformanceFrequency(lpfrequency: Long): BOOL =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_QueryPerformanceFrequency(lpfrequency)

public actual fun RestorePerfRegistryFromFileW(szfilename: PCWSTR, szlangid: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_RestorePerfRegistryFromFileW(szfilename, szlangid).toUInt()

public actual fun SetServiceAsTrustedA(szreserved: PCSTR, szservicename: PCSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_SetServiceAsTrustedA(szreserved, szservicename).toUInt()

public actual fun SetServiceAsTrustedW(szreserved: PCWSTR, szservicename: PCWSTR): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_SetServiceAsTrustedW(szreserved, szservicename).toUInt()

public actual fun UnloadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsA(lpcommandline, bquietmodearg).toUInt()

public actual fun UnloadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsW(lpcommandline, bquietmodearg).toUInt()

public actual fun UpdatePerfNameFilesA(sznewctrfilepath: PCSTR, sznewhlpfilepath: PCSTR, szlanguageid: PCSTR, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_UpdatePerfNameFilesA(sznewctrfilepath, sznewhlpfilepath, szlanguageid, dwflags.toLong()).toUInt()

public actual fun UpdatePerfNameFilesW(sznewctrfilepath: PCWSTR, sznewhlpfilepath: PCWSTR, szlanguageid: PCWSTR, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_UpdatePerfNameFilesW(sznewctrfilepath, sznewhlpfilepath, szlanguageid, dwflags.toLong()).toUInt()
