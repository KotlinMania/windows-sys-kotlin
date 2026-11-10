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

public expect fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt

public expect fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt

public expect fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt

public expect fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt

public expect fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt

public expect fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt

public expect fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt

public expect fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt

public expect fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt

public expect fun pdhBindInputDataSourceA(phdatasource: COpaquePointer?, logfilenamelist: Pcstr): UInt

public expect fun pdhBindInputDataSourceW(phdatasource: COpaquePointer?, logfilenamelist: Pcwstr): UInt

public expect fun pdhBrowseCountersA(pbrowsedlgdata: COpaquePointer?): UInt

public expect fun pdhBrowseCountersHA(pbrowsedlgdata: COpaquePointer?): UInt

public expect fun pdhBrowseCountersHW(pbrowsedlgdata: COpaquePointer?): UInt

public expect fun pdhBrowseCountersW(pbrowsedlgdata: COpaquePointer?): UInt

public expect fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: COpaquePointer?, rawvalue2: COpaquePointer?, fmtvalue: COpaquePointer?): UInt

public expect fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt

public expect fun pdhCloseQuery(hquery: PdhHquery): UInt

public expect fun pdhCollectQueryData(hquery: PdhHquery): UInt

public expect fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt

public expect fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: COpaquePointer?): UInt

public expect fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: COpaquePointer?, data: COpaquePointer?): UInt

public expect fun pdhConnectMachineA(szmachinename: Pcstr): UInt

public expect fun pdhConnectMachineW(szmachinename: Pcwstr): UInt

public expect fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt

public expect fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt

public expect fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: COpaquePointer?): UInt

public expect fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: COpaquePointer?): UInt

public expect fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?): UInt

public expect fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?): UInt

public expect fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt

public expect fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt

public expect fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt

public expect fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt

public expect fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: COpaquePointer?, prawvalue1: COpaquePointer?, prawvalue2: COpaquePointer?, pfmtvalue: COpaquePointer?): UInt

public expect fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt

public expect fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt

public expect fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: COpaquePointer?): UInt

public expect fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt

public expect fun pdhGetDllVersion(lpdwversion: COpaquePointer?): UInt

public expect fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt

public expect fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt

public expect fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt

public expect fun pdhGetLogFileSize(hlog: PdhHlog, llsize: COpaquePointer?): UInt

public expect fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: COpaquePointer?, prunid: COpaquePointer?): UInt

public expect fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt

public expect fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt

public expect fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt

public expect fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool

public expect fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: COpaquePointer?): UInt

public expect fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: COpaquePointer?): UInt

public expect fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: COpaquePointer?): UInt

public expect fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: COpaquePointer?): UInt

public expect fun pdhMakeCounterPathA(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt

public expect fun pdhMakeCounterPathW(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pwstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt

public expect fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: COpaquePointer?): UInt

public expect fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: COpaquePointer?): UInt

public expect fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt

public expect fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: COpaquePointer?): UInt

public expect fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt

public expect fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt

public expect fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt

public expect fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt

public expect fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pwstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt

public expect fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: COpaquePointer?, pdwbufferlength: COpaquePointer?): UInt

public expect fun pdhRemoveCounter(hcounter: PdhHcounter): UInt

public expect fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: COpaquePointer?): UInt

public expect fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: COpaquePointer?): UInt

public expect fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt

public expect fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt

public expect fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt

public expect fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: COpaquePointer?): UInt

public expect fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt

public expect fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt

public expect fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt

public expect fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt

public expect fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt

public expect fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt

public expect fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt

public expect fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt

public expect fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt

public expect fun perfAddCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt

public expect fun perfCloseQueryHandle(hquery: Handle): UInt

public expect fun perfCreateInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer?

public expect fun perfDecrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt

public expect fun perfDecrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt

public expect fun perfDeleteCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt

public expect fun perfDeleteInstance(provider: Handle, instanceblock: COpaquePointer?): UInt

public expect fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: COpaquePointer?, ccountersetids: UInt, pccountersetidsactual: COpaquePointer?): UInt

public expect fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: COpaquePointer?, pinstances: COpaquePointer?, cbinstances: UInt, pcbinstancesactual: COpaquePointer?): UInt

public expect fun perfIncrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt

public expect fun perfIncrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt

public expect fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: COpaquePointer?): UInt

public expect fun perfQueryCounterData(hquery: Handle, pcounterblock: COpaquePointer?, cbcounterblock: UInt, pcbcounterblockactual: COpaquePointer?): UInt

public expect fun perfQueryCounterInfo(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt, pcbcountersactual: COpaquePointer?): UInt

public expect fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: COpaquePointer?, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: COpaquePointer?, cbreginfo: UInt, pcbreginfoactual: COpaquePointer?): UInt

public expect fun perfQueryInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer?

public expect fun perfSetCounterRefValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, address: COpaquePointer?): UInt

public expect fun perfSetCounterSetInfo(providerhandle: Handle, template: COpaquePointer?, templatesize: UInt): UInt

public expect fun perfSetULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt

public expect fun perfSetULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt

public expect fun perfStartProvider(providerguid: COpaquePointer?, controlcallback: Perflibrequest, phprovider: COpaquePointer?): UInt

public expect fun perfStartProviderEx(providerguid: COpaquePointer?, providercontext: COpaquePointer?, provider: COpaquePointer?): UInt

public expect fun perfStopProvider(providerhandle: Handle): UInt

public expect fun queryPerformanceCounter(lpperformancecount: COpaquePointer?): Bool

public expect fun queryPerformanceFrequency(lpfrequency: COpaquePointer?): Bool

public expect fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt

public expect fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt

public expect fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt

public expect fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt

public expect fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt

public expect fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt

public expect fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt
