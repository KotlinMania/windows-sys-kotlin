@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemPerformanceJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_backupPerfRegistryToFileW(szfilename: Long, szcommentstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_installPerfDllA(szcomputername: Long, lpinifile: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_installPerfDllW(szcomputername: Long, lpinifile: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_loadPerfCounterTextStringsA(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_loadPerfCounterTextStringsW(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhAddCounterA(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhAddCounterW(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhAddEnglishCounterA(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhAddEnglishCounterW(hquery: Long, szfullcounterpath: Long, dwuserdata: Long, phcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhBrowseCountersA(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhBrowseCountersHA(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhBrowseCountersHW(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhBrowseCountersW(pbrowsedlgdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCalculateCounterFromRawValue(hcounter: Long, dwformat: Int, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCloseLog(hlog: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCloseQuery(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCollectQueryData(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCollectQueryDataEx(hquery: Long, dwintervaltime: Int, hnewdataevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCollectQueryDataWithTime(hquery: Long, plltimestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhComputeCounterStatistics(hcounter: Long, dwformat: Int, dwfirstentry: Int, dwnumentries: Int, lprawvaluearray: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhConnectMachineA(szmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhConnectMachineW(szmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCreateSQLTablesA(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhCreateSQLTablesW(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumLogSetNamesA(szdatasource: Long, mszdatasetnamelist: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumLogSetNamesW(szdatasource: Long, mszdatasetnamelist: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumMachinesA(szdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumMachinesHA(hdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumMachinesHW(hdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumMachinesW(szdatasource: Long, mszmachinelist: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectItemsA(szdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectItemsHA(hdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectItemsHW(hdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectItemsW(szdatasource: Long, szmachinename: Long, szobjectname: Long, mszcounterlist: Long, pcchcounterlistlength: Long, mszinstancelist: Long, pcchinstancelistlength: Long, dwdetaillevel: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectsA(szdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectsHA(hdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectsHW(hdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhEnumObjectsW(szdatasource: Long, szmachinename: Long, mszobjectlist: Long, pcchbuffersize: Long, dwdetaillevel: Int, brefresh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhExpandCounterPathA(szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhExpandCounterPathW(szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhExpandWildCardPathA(szdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhExpandWildCardPathHA(hdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhExpandWildCardPathHW(hdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhExpandWildCardPathW(szdatasource: Long, szwildcardpath: Long, mszexpandedpathlist: Long, pcchpathlistlength: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhFormatFromRawValue(dwcountertype: Int, dwformat: Int, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetCounterInfoA(hcounter: Long, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetCounterInfoW(hcounter: Long, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetCounterTimeBase(hcounter: Long, ptimebase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeA(szdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeH(hdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeW(szdatasource: Long, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterA(szdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHA(hdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHW(hdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterW(szdatasource: Long, szmachinename: Long, szobjectname: Long, szdefaultcountername: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectA(szdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHA(hdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHW(hdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectW(szdatasource: Long, szmachinename: Long, szdefaultobjectname: Long, pcchbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetDllVersion(lpdwversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayA(hcounter: Long, dwformat: Int, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayW(hcounter: Long, dwformat: Int, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetFormattedCounterValue(hcounter: Long, dwformat: Int, lpdwtype: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetLogFileSize(hlog: Long, llsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetLogSetGUID(hlog: Long, pguid: Long, prunid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetRawCounterArrayA(hcounter: Long, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetRawCounterArrayW(hcounter: Long, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhGetRawCounterValue(hcounter: Long, lpdwtype: Long, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhIsRealTimeQuery(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameA(szmachinename: Long, sznamebuffer: Long, pdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameW(szmachinename: Long, sznamebuffer: Long, pdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexA(szmachinename: Long, dwnameindex: Int, sznamebuffer: Long, pcchnamebuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexW(szmachinename: Long, dwnameindex: Int, sznamebuffer: Long, pcchnamebuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: Long, pcchbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: Long, pcchbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhOpenLogA(szlogfilename: Long, dwaccessflags: Int, lpdwlogtype: Long, hquery: Long, dwmaxsize: Int, szusercaption: Long, phlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhOpenLogW(szlogfilename: Long, dwaccessflags: Int, lpdwlogtype: Long, hquery: Long, dwmaxsize: Int, szusercaption: Long, phlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhOpenQueryA(szdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhOpenQueryH(hdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhOpenQueryW(szdatasource: Long, dwuserdata: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhParseCounterPathA(szfullpathbuffer: Long, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhParseCounterPathW(szfullpathbuffer: Long, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhParseInstanceNameA(szinstancestring: Long, szinstancename: Long, pcchinstancenamelength: Long, szparentname: Long, pcchparentnamelength: Long, lpindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhParseInstanceNameW(szinstancestring: Long, szinstancename: Long, pcchinstancenamelength: Long, szparentname: Long, pcchparentnamelength: Long, lpindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhRemoveCounter(hcounter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhSelectDataSourceA(hwndowner: Long, dwflags: Int, szdatasource: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhSelectDataSourceW(hwndowner: Long, dwflags: Int, szdatasource: Long, pcchbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhSetCounterScaleFactor(hcounter: Long, lfactor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhSetDefaultRealTimeDataSource(dwdatasourceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhSetLogSetRunID(hlog: Long, runid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhSetQueryTimeRange(hquery: Long, pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhUpdateLogA(hlog: Long, szuserstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhUpdateLogFileCatalog(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhUpdateLogW(hlog: Long, szuserstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhValidatePathA(szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhValidatePathExA(hdatasource: Long, szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhValidatePathExW(hdatasource: Long, szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhValidatePathW(szfullpathbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhVerifySQLDBA(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_pdhVerifySQLDBW(szdatasource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfAddCounters(hquery: Long, pcounters: Long, cbcounters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfCloseQueryHandle(hquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfCreateInstance(providerhandle: Long, countersetguid: Long, name: Long, id: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfDecrementULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfDecrementULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfDeleteCounters(hquery: Long, pcounters: Long, cbcounters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfDeleteInstance(provider: Long, instanceblock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfEnumerateCounterSet(szmachine: Long, pcountersetids: Long, ccountersetids: Int, pccountersetidsactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfEnumerateCounterSetInstances(szmachine: Long, pcountersetid: Long, pinstances: Long, cbinstances: Int, pcbinstancesactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfIncrementULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfIncrementULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfOpenQueryHandle(szmachine: Long, phquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfQueryCounterData(hquery: Long, pcounterblock: Long, cbcounterblock: Int, pcbcounterblockactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfQueryCounterInfo(hquery: Long, pcounters: Long, cbcounters: Int, pcbcountersactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfQueryCounterSetRegistrationInfo(szmachine: Long, pcountersetid: Long, requestcode: Int, requestlangid: Int, pbreginfo: Long, cbreginfo: Int, pcbreginfoactual: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfQueryInstance(providerhandle: Long, countersetguid: Long, name: Long, id: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfSetCounterRefValue(provider: Long, instance: Long, counterid: Int, address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfSetCounterSetInfo(providerhandle: Long, template: Long, templatesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfSetULongCounterValue(provider: Long, instance: Long, counterid: Int, value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfSetULongLongCounterValue(provider: Long, instance: Long, counterid: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfStartProvider(providerguid: Long, controlcallback: Long, phprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_perfStopProvider(providerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_queryPerformanceCounter(lpperformancecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_queryPerformanceFrequency(lpfrequency: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_restorePerfRegistryFromFileW(szfilename: Long, szlangid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_setServiceAsTrustedA(szreserved: Long, szservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_setServiceAsTrustedW(szreserved: Long, szservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsA(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsW(lpcommandline: Long, bquietmodearg: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_updatePerfNameFilesA(sznewctrfilepath: Long, sznewhlpfilepath: Long, szlanguageid: Long, dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_performance_updatePerfNameFilesW(sznewctrfilepath: Long, sznewhlpfilepath: Long, szlanguageid: Long, dwflags: Long): Int
}

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_backupPerfRegistryToFileW((szfilename?.value ?: 0L), (szcommentstring?.value ?: 0L)).toUInt()

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_installPerfDllA((szcomputername?.value ?: 0L), (lpinifile?.value ?: 0L), dwflags.toLong()).toUInt()

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_installPerfDllW((szcomputername?.value ?: 0L), (lpinifile?.value ?: 0L), dwflags.toLong()).toUInt()

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_loadPerfCounterTextStringsA((lpcommandline?.value ?: 0L), bquietmodearg).toUInt()

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_loadPerfCounterTextStringsW((lpcommandline?.value ?: 0L), bquietmodearg).toUInt()

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhAddCounterA((hquery?.value ?: 0L), (szfullcounterpath?.value ?: 0L), dwuserdata.toLong(), (phcounter?.value ?: 0L)).toUInt()

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhAddCounterW((hquery?.value ?: 0L), (szfullcounterpath?.value ?: 0L), dwuserdata.toLong(), (phcounter?.value ?: 0L)).toUInt()

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhAddEnglishCounterA((hquery?.value ?: 0L), (szfullcounterpath?.value ?: 0L), dwuserdata.toLong(), (phcounter?.value ?: 0L)).toUInt()

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhAddEnglishCounterW((hquery?.value ?: 0L), (szfullcounterpath?.value ?: 0L), dwuserdata.toLong(), (phcounter?.value ?: 0L)).toUInt()

public actual fun pdhBindInputDataSourceA(phdatasource: COpaquePointer?, logfilenamelist: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhBindInputDataSourceA((phdatasource?.value ?: 0L), (logfilenamelist?.value ?: 0L)).toUInt()

public actual fun pdhBindInputDataSourceW(phdatasource: COpaquePointer?, logfilenamelist: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhBindInputDataSourceW((phdatasource?.value ?: 0L), (logfilenamelist?.value ?: 0L)).toUInt()

public actual fun pdhBrowseCountersA(pbrowsedlgdata: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhBrowseCountersA((pbrowsedlgdata?.value ?: 0L)).toUInt()

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhBrowseCountersHA((pbrowsedlgdata?.value ?: 0L)).toUInt()

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhBrowseCountersHW((pbrowsedlgdata?.value ?: 0L)).toUInt()

public actual fun pdhBrowseCountersW(pbrowsedlgdata: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhBrowseCountersW((pbrowsedlgdata?.value ?: 0L)).toUInt()

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: COpaquePointer?, rawvalue2: COpaquePointer?, fmtvalue: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCalculateCounterFromRawValue((hcounter?.value ?: 0L), dwformat.toInt(), (rawvalue1?.value ?: 0L), (rawvalue2?.value ?: 0L), (fmtvalue?.value ?: 0L)).toUInt()

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCloseLog((hlog?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCloseQuery((hquery?.value ?: 0L)).toUInt()

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCollectQueryData((hquery?.value ?: 0L)).toUInt()

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCollectQueryDataEx((hquery?.value ?: 0L), dwintervaltime.toInt(), (hnewdataevent?.value ?: 0L)).toUInt()

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCollectQueryDataWithTime((hquery?.value ?: 0L), (plltimestamp?.value ?: 0L)).toUInt()

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: COpaquePointer?, data: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhComputeCounterStatistics((hcounter?.value ?: 0L), dwformat.toInt(), dwfirstentry.toInt(), dwnumentries.toInt(), (lprawvaluearray?.value ?: 0L), (data?.value ?: 0L)).toUInt()

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhConnectMachineA((szmachinename?.value ?: 0L)).toUInt()

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhConnectMachineW((szmachinename?.value ?: 0L)).toUInt()

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCreateSQLTablesA((szdatasource?.value ?: 0L)).toUInt()

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhCreateSQLTablesW((szdatasource?.value ?: 0L)).toUInt()

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumLogSetNamesA((szdatasource?.value ?: 0L), (mszdatasetnamelist?.value ?: 0L), (pcchbufferlength?.value ?: 0L)).toUInt()

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumLogSetNamesW((szdatasource?.value ?: 0L), (mszdatasetnamelist?.value ?: 0L), (pcchbufferlength?.value ?: 0L)).toUInt()

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumMachinesA((szdatasource?.value ?: 0L), (mszmachinelist?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumMachinesHA((hdatasource?.value ?: 0L), (mszmachinelist?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumMachinesHW((hdatasource?.value ?: 0L), (mszmachinelist?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumMachinesW((szdatasource?.value ?: 0L), (mszmachinelist?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectItemsA((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (mszcounterlist?.value ?: 0L), (pcchcounterlistlength?.value ?: 0L), (mszinstancelist?.value ?: 0L), (pcchinstancelistlength?.value ?: 0L), dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectItemsHA((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (mszcounterlist?.value ?: 0L), (pcchcounterlistlength?.value ?: 0L), (mszinstancelist?.value ?: 0L), (pcchinstancelistlength?.value ?: 0L), dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectItemsHW((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (mszcounterlist?.value ?: 0L), (pcchcounterlistlength?.value ?: 0L), (mszinstancelist?.value ?: 0L), (pcchinstancelistlength?.value ?: 0L), dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectItemsW((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (mszcounterlist?.value ?: 0L), (pcchcounterlistlength?.value ?: 0L), (mszinstancelist?.value ?: 0L), (pcchinstancelistlength?.value ?: 0L), dwdetaillevel.toInt(), dwflags.toInt()).toUInt()

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectsA((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (mszobjectlist?.value ?: 0L), (pcchbuffersize?.value ?: 0L), dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectsHA((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (mszobjectlist?.value ?: 0L), (pcchbuffersize?.value ?: 0L), dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectsHW((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (mszobjectlist?.value ?: 0L), (pcchbuffersize?.value ?: 0L), dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhEnumObjectsW((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (mszobjectlist?.value ?: 0L), (pcchbuffersize?.value ?: 0L), dwdetaillevel.toInt(), brefresh).toUInt()

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhExpandCounterPathA((szwildcardpath?.value ?: 0L), (mszexpandedpathlist?.value ?: 0L), (pcchpathlistlength?.value ?: 0L)).toUInt()

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhExpandCounterPathW((szwildcardpath?.value ?: 0L), (mszexpandedpathlist?.value ?: 0L), (pcchpathlistlength?.value ?: 0L)).toUInt()

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhExpandWildCardPathA((szdatasource?.value ?: 0L), (szwildcardpath?.value ?: 0L), (mszexpandedpathlist?.value ?: 0L), (pcchpathlistlength?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhExpandWildCardPathHA((hdatasource?.value ?: 0L), (szwildcardpath?.value ?: 0L), (mszexpandedpathlist?.value ?: 0L), (pcchpathlistlength?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhExpandWildCardPathHW((hdatasource?.value ?: 0L), (szwildcardpath?.value ?: 0L), (mszexpandedpathlist?.value ?: 0L), (pcchpathlistlength?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhExpandWildCardPathW((szdatasource?.value ?: 0L), (szwildcardpath?.value ?: 0L), (mszexpandedpathlist?.value ?: 0L), (pcchpathlistlength?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: COpaquePointer?, prawvalue1: COpaquePointer?, prawvalue2: COpaquePointer?, pfmtvalue: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhFormatFromRawValue(dwcountertype.toInt(), dwformat.toInt(), (ptimebase?.value ?: 0L), (prawvalue1?.value ?: 0L), (prawvalue2?.value ?: 0L), (pfmtvalue?.value ?: 0L)).toUInt()

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetCounterInfoA((hcounter?.value ?: 0L), bretrieveexplaintext, (pdwbuffersize?.value ?: 0L), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetCounterInfoW((hcounter?.value ?: 0L), bretrieveexplaintext, (pdwbuffersize?.value ?: 0L), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetCounterTimeBase((hcounter?.value ?: 0L), (ptimebase?.value ?: 0L)).toUInt()

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeA((szdatasource?.value ?: 0L), (pdwnumentries?.value ?: 0L), (pinfo?.value ?: 0L), (pdwbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeH((hdatasource?.value ?: 0L), (pdwnumentries?.value ?: 0L), (pinfo?.value ?: 0L), (pdwbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeW((szdatasource?.value ?: 0L), (pdwnumentries?.value ?: 0L), (pinfo?.value ?: 0L), (pdwbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterA((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (szdefaultcountername?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHA((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (szdefaultcountername?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHW((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (szdefaultcountername?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterW((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szobjectname?.value ?: 0L), (szdefaultcountername?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectA((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szdefaultobjectname?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHA((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szdefaultobjectname?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHW((hdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szdefaultobjectname?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectW((szdatasource?.value ?: 0L), (szmachinename?.value ?: 0L), (szdefaultobjectname?.value ?: 0L), (pcchbuffersize?.value ?: 0L)).toUInt()

public actual fun pdhGetDllVersion(lpdwversion: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetDllVersion((lpdwversion?.value ?: 0L)).toUInt()

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayA((hcounter?.value ?: 0L), dwformat.toInt(), (lpdwbuffersize?.value ?: 0L), (lpdwitemcount?.value ?: 0L), (itembuffer?.value ?: 0L)).toUInt()

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayW((hcounter?.value ?: 0L), dwformat.toInt(), (lpdwbuffersize?.value ?: 0L), (lpdwitemcount?.value ?: 0L), (itembuffer?.value ?: 0L)).toUInt()

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetFormattedCounterValue((hcounter?.value ?: 0L), dwformat.toInt(), (lpdwtype?.value ?: 0L), (pvalue?.value ?: 0L)).toUInt()

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetLogFileSize((hlog?.value ?: 0L), (llsize?.value ?: 0L)).toUInt()

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: COpaquePointer?, prunid: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetLogSetGUID((hlog?.value ?: 0L), (pguid?.value ?: 0L), (prunid?.value ?: 0L)).toUInt()

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetRawCounterArrayA((hcounter?.value ?: 0L), (lpdwbuffersize?.value ?: 0L), (lpdwitemcount?.value ?: 0L), (itembuffer?.value ?: 0L)).toUInt()

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetRawCounterArrayW((hcounter?.value ?: 0L), (lpdwbuffersize?.value ?: 0L), (lpdwitemcount?.value ?: 0L), (itembuffer?.value ?: 0L)).toUInt()

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhGetRawCounterValue((hcounter?.value ?: 0L), (lpdwtype?.value ?: 0L), (pvalue?.value ?: 0L)).toUInt()

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhIsRealTimeQuery((hquery?.value ?: 0L))

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameA((szmachinename?.value ?: 0L), (sznamebuffer?.value ?: 0L), (pdwindex?.value ?: 0L)).toUInt()

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameW((szmachinename?.value ?: 0L), (sznamebuffer?.value ?: 0L), (pdwindex?.value ?: 0L)).toUInt()

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexA((szmachinename?.value ?: 0L), dwnameindex.toInt(), (sznamebuffer?.value ?: 0L), (pcchnamebuffersize?.value ?: 0L)).toUInt()

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexW((szmachinename?.value ?: 0L), dwnameindex.toInt(), (sznamebuffer?.value ?: 0L), (pcchnamebuffersize?.value ?: 0L)).toUInt()

public actual fun pdhMakeCounterPathA(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhMakeCounterPathA((pcounterpathelements?.value ?: 0L), (szfullpathbuffer?.value ?: 0L), (pcchbuffersize?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhMakeCounterPathW(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pwstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhMakeCounterPathW((pcounterpathelements?.value ?: 0L), (szfullpathbuffer?.value ?: 0L), (pcchbuffersize?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhOpenLogA((szlogfilename?.value ?: 0L), dwaccessflags.toInt(), (lpdwlogtype?.value ?: 0L), (hquery?.value ?: 0L), dwmaxsize.toInt(), (szusercaption?.value ?: 0L), (phlog?.value ?: 0L)).toUInt()

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhOpenLogW((szlogfilename?.value ?: 0L), dwaccessflags.toInt(), (lpdwlogtype?.value ?: 0L), (hquery?.value ?: 0L), dwmaxsize.toInt(), (szusercaption?.value ?: 0L), (phlog?.value ?: 0L)).toUInt()

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhOpenQueryA((szdatasource?.value ?: 0L), dwuserdata.toLong(), (phquery?.value ?: 0L)).toUInt()

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhOpenQueryH((hdatasource?.value ?: 0L), dwuserdata.toLong(), (phquery?.value ?: 0L)).toUInt()

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhOpenQueryW((szdatasource?.value ?: 0L), dwuserdata.toLong(), (phquery?.value ?: 0L)).toUInt()

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhParseCounterPathA((szfullpathbuffer?.value ?: 0L), (pcounterpathelements?.value ?: 0L), (pdwbuffersize?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhParseCounterPathW((szfullpathbuffer?.value ?: 0L), (pcounterpathelements?.value ?: 0L), (pdwbuffersize?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhParseInstanceNameA((szinstancestring?.value ?: 0L), (szinstancename?.value ?: 0L), (pcchinstancenamelength?.value ?: 0L), (szparentname?.value ?: 0L), (pcchparentnamelength?.value ?: 0L), (lpindex?.value ?: 0L)).toUInt()

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pwstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhParseInstanceNameW((szinstancestring?.value ?: 0L), (szinstancename?.value ?: 0L), (pcchinstancenamelength?.value ?: 0L), (szparentname?.value ?: 0L), (pcchparentnamelength?.value ?: 0L), (lpindex?.value ?: 0L)).toUInt()

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: COpaquePointer?, pdwbufferlength: COpaquePointer?): UInt =
    0u

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhRemoveCounter((hcounter?.value ?: 0L)).toUInt()

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhSelectDataSourceA((hwndowner?.value ?: 0L), dwflags.toInt(), (szdatasource?.value ?: 0L), (pcchbufferlength?.value ?: 0L)).toUInt()

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhSelectDataSourceW((hwndowner?.value ?: 0L), dwflags.toInt(), (szdatasource?.value ?: 0L), (pcchbufferlength?.value ?: 0L)).toUInt()

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhSetCounterScaleFactor((hcounter?.value ?: 0L), lfactor).toUInt()

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()).toUInt()

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhSetLogSetRunID((hlog?.value ?: 0L), runid).toUInt()

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhSetQueryTimeRange((hquery?.value ?: 0L), (pinfo?.value ?: 0L)).toUInt()

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhUpdateLogA((hlog?.value ?: 0L), (szuserstring?.value ?: 0L)).toUInt()

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhUpdateLogFileCatalog((hlog?.value ?: 0L)).toUInt()

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhUpdateLogW((hlog?.value ?: 0L), (szuserstring?.value ?: 0L)).toUInt()

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhValidatePathA((szfullpathbuffer?.value ?: 0L)).toUInt()

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhValidatePathExA((hdatasource?.value ?: 0L), (szfullpathbuffer?.value ?: 0L)).toUInt()

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhValidatePathExW((hdatasource?.value ?: 0L), (szfullpathbuffer?.value ?: 0L)).toUInt()

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhValidatePathW((szfullpathbuffer?.value ?: 0L)).toUInt()

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhVerifySQLDBA((szdatasource?.value ?: 0L)).toUInt()

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_pdhVerifySQLDBW((szdatasource?.value ?: 0L)).toUInt()

public actual fun perfAddCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfAddCounters((hquery?.value ?: 0L), (pcounters?.value ?: 0L), cbcounters.toInt()).toUInt()

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfCloseQueryHandle((hquery?.value ?: 0L)).toUInt()

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfCreateInstance((providerhandle?.value ?: 0L), (countersetguid?.value ?: 0L), (name?.value ?: 0L), id.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfDecrementULongCounterValue((provider?.value ?: 0L), (instance?.value ?: 0L), counterid.toInt(), value.toInt()).toUInt()

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfDecrementULongLongCounterValue((provider?.value ?: 0L), (instance?.value ?: 0L), counterid.toInt(), value.toLong()).toUInt()

public actual fun perfDeleteCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfDeleteCounters((hquery?.value ?: 0L), (pcounters?.value ?: 0L), cbcounters.toInt()).toUInt()

public actual fun perfDeleteInstance(provider: Handle, instanceblock: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfDeleteInstance((provider?.value ?: 0L), (instanceblock?.value ?: 0L)).toUInt()

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: COpaquePointer?, ccountersetids: UInt, pccountersetidsactual: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfEnumerateCounterSet((szmachine?.value ?: 0L), (pcountersetids?.value ?: 0L), ccountersetids.toInt(), (pccountersetidsactual?.value ?: 0L)).toUInt()

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: COpaquePointer?, pinstances: COpaquePointer?, cbinstances: UInt, pcbinstancesactual: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfEnumerateCounterSetInstances((szmachine?.value ?: 0L), (pcountersetid?.value ?: 0L), (pinstances?.value ?: 0L), cbinstances.toInt(), (pcbinstancesactual?.value ?: 0L)).toUInt()

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfIncrementULongCounterValue((provider?.value ?: 0L), (instance?.value ?: 0L), counterid.toInt(), value.toInt()).toUInt()

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfIncrementULongLongCounterValue((provider?.value ?: 0L), (instance?.value ?: 0L), counterid.toInt(), value.toLong()).toUInt()

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfOpenQueryHandle((szmachine?.value ?: 0L), (phquery?.value ?: 0L)).toUInt()

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: COpaquePointer?, cbcounterblock: UInt, pcbcounterblockactual: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfQueryCounterData((hquery?.value ?: 0L), (pcounterblock?.value ?: 0L), cbcounterblock.toInt(), (pcbcounterblockactual?.value ?: 0L)).toUInt()

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt, pcbcountersactual: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfQueryCounterInfo((hquery?.value ?: 0L), (pcounters?.value ?: 0L), cbcounters.toInt(), (pcbcountersactual?.value ?: 0L)).toUInt()

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: COpaquePointer?, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: COpaquePointer?, cbreginfo: UInt, pcbreginfoactual: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfQueryCounterSetRegistrationInfo((szmachine?.value ?: 0L), (pcountersetid?.value ?: 0L), requestcode, requestlangid.toInt(), (pbreginfo?.value ?: 0L), cbreginfo.toInt(), (pcbreginfoactual?.value ?: 0L)).toUInt()

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfQueryInstance((providerhandle?.value ?: 0L), (countersetguid?.value ?: 0L), (name?.value ?: 0L), id.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun perfSetCounterRefValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, address: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfSetCounterRefValue((provider?.value ?: 0L), (instance?.value ?: 0L), counterid.toInt(), (address?.value ?: 0L)).toUInt()

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: COpaquePointer?, templatesize: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfSetCounterSetInfo((providerhandle?.value ?: 0L), (template?.value ?: 0L), templatesize.toInt()).toUInt()

public actual fun perfSetULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfSetULongCounterValue((provider?.value ?: 0L), (instance?.value ?: 0L), counterid.toInt(), value.toInt()).toUInt()

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfSetULongLongCounterValue((provider?.value ?: 0L), (instance?.value ?: 0L), counterid.toInt(), value.toLong()).toUInt()

public actual fun perfStartProvider(providerguid: COpaquePointer?, controlcallback: Perflibrequest, phprovider: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfStartProvider((providerguid?.value ?: 0L), 0L, (phprovider?.value ?: 0L)).toUInt()

public actual fun perfStartProviderEx(providerguid: COpaquePointer?, providercontext: COpaquePointer?, provider: COpaquePointer?): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfStartProviderEx((providerguid?.value ?: 0L), (providercontext?.value ?: 0L), (provider?.value ?: 0L)).toUInt()

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_perfStopProvider((providerhandle?.value ?: 0L)).toUInt()

public actual fun queryPerformanceCounter(lpperformancecount: COpaquePointer?): Bool =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_queryPerformanceCounter((lpperformancecount?.value ?: 0L))

public actual fun queryPerformanceFrequency(lpfrequency: COpaquePointer?): Bool =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_queryPerformanceFrequency((lpfrequency?.value ?: 0L))

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_restorePerfRegistryFromFileW((szfilename?.value ?: 0L), (szlangid?.value ?: 0L)).toUInt()

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_setServiceAsTrustedA((szreserved?.value ?: 0L), (szservicename?.value ?: 0L)).toUInt()

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_setServiceAsTrustedW((szreserved?.value ?: 0L), (szservicename?.value ?: 0L)).toUInt()

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsA((lpcommandline?.value ?: 0L), bquietmodearg).toUInt()

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsW((lpcommandline?.value ?: 0L), bquietmodearg).toUInt()

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_updatePerfNameFilesA((sznewctrfilepath?.value ?: 0L), (sznewhlpfilepath?.value ?: 0L), (szlanguageid?.value ?: 0L), dwflags.toLong()).toUInt()

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    WindowsWin32SystemPerformanceJniBridge.windowssys_windows_win32_system_performance_updatePerfNameFilesW((sznewctrfilepath?.value ?: 0L), (sznewhlpfilepath?.value ?: 0L), (szlanguageid?.value ?: 0L), dwflags.toLong()).toUInt()
