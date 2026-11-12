package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
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

public expect fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt

public expect fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt

public expect fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt

public expect fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt

public expect fun pdhBindInputDataSourceA(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcstr): UInt

public expect fun pdhBindInputDataSourceW(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcwstr): UInt

public expect fun pdhBrowseCountersA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigA>): UInt

public expect fun pdhBrowseCountersHA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHa>): UInt

public expect fun pdhBrowseCountersHW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHw>): UInt

public expect fun pdhBrowseCountersW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigW>): UInt

public expect fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: ConstPtr<PdhRawCounter>, rawvalue2: ConstPtr<PdhRawCounter>, fmtvalue: MutPtr<PdhFmtCountervalue>): UInt

public expect fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt

public expect fun pdhCloseQuery(hquery: PdhHquery): UInt

public expect fun pdhCollectQueryData(hquery: PdhHquery): UInt

public expect fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt

public expect fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: MutPtr<Long>): UInt

public expect fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: ConstPtr<PdhRawCounter>, data: MutPtr<PdhStatistics>): UInt

public expect fun pdhConnectMachineA(szmachinename: Pcstr): UInt

public expect fun pdhConnectMachineW(szmachinename: Pcwstr): UInt

public expect fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt

public expect fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt

public expect fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: MutPtr<UInt>): UInt

public expect fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt

public expect fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt

public expect fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt

public expect fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>): UInt

public expect fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>): UInt

public expect fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: ConstPtr<Long>, prawvalue1: ConstPtr<PdhRawCounter>, prawvalue2: ConstPtr<PdhRawCounter>, pfmtvalue: MutPtr<PdhFmtCountervalue>): UInt

public expect fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoA>): UInt

public expect fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoW>): UInt

public expect fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: MutPtr<Long>): UInt

public expect fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt

public expect fun pdhGetDllVersion(lpdwversion: MutPtr<PdhDllVersion>): UInt

public expect fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemA>): UInt

public expect fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemW>): UInt

public expect fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhFmtCountervalue>): UInt

public expect fun pdhGetLogFileSize(hlog: PdhHlog, llsize: MutPtr<Long>): UInt

public expect fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: MutPtr<Guid>, prunid: MutPtr<Int>): UInt

public expect fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemA>): UInt

public expect fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemW>): UInt

public expect fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhRawCounter>): UInt

public expect fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool

public expect fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: MutPtr<UInt>): UInt

public expect fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: MutPtr<UInt>): UInt

public expect fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: MutPtr<UInt>): UInt

public expect fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: MutPtr<UInt>): UInt

public expect fun pdhMakeCounterPathA(pcounterpathelements: ConstPtr<PdhCounterPathElementsA>, szfullpathbuffer: Pstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt

public expect fun pdhMakeCounterPathW(pcounterpathelements: ConstPtr<PdhCounterPathElementsW>, szfullpathbuffer: Pwstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt

public expect fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: MutPtr<PdhHlog>): UInt

public expect fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: MutPtr<PdhHlog>): UInt

public expect fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt

public expect fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt

public expect fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt

public expect fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: MutPtr<PdhCounterPathElementsA>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: MutPtr<PdhCounterPathElementsW>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt

public expect fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt

public expect fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pwstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt

public expect fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: MutPtr<PdhRawLogRecord>, pdwbufferlength: MutPtr<UInt>): UInt

public expect fun pdhRemoveCounter(hcounter: PdhHcounter): UInt

public expect fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: MutPtr<UInt>): UInt

public expect fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt

public expect fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt

public expect fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt

public expect fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt

public expect fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: ConstPtr<PdhTimeInfo>): UInt

public expect fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt

public expect fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt

public expect fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt

public expect fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt

public expect fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt

public expect fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt

public expect fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt

public expect fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt

public expect fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt

public expect fun perfAddCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt

public expect fun perfCloseQueryHandle(hquery: Handle): UInt

public expect fun perfCreateInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance>

public expect fun perfDecrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt

public expect fun perfDecrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt

public expect fun perfDeleteCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt

public expect fun perfDeleteInstance(provider: Handle, instanceblock: ConstPtr<PerfCountersetInstance>): UInt

public expect fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: MutPtr<Guid>, ccountersetids: UInt, pccountersetidsactual: MutPtr<UInt>): UInt

public expect fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, pinstances: MutPtr<PerfInstanceHeader>, cbinstances: UInt, pcbinstancesactual: MutPtr<UInt>): UInt

public expect fun perfIncrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt

public expect fun perfIncrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt

public expect fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: MutPtr<Handle>): UInt

public expect fun perfQueryCounterData(hquery: Handle, pcounterblock: MutPtr<PerfDataHeader>, cbcounterblock: UInt, pcbcounterblockactual: MutPtr<UInt>): UInt

public expect fun perfQueryCounterInfo(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt, pcbcountersactual: MutPtr<UInt>): UInt

public expect fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: MutPtr<UByte>, cbreginfo: UInt, pcbreginfoactual: MutPtr<UInt>): UInt

public expect fun perfQueryInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance>

public expect fun perfSetCounterRefValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, address: ConstPtr<CVoid>): UInt

public expect fun perfSetCounterSetInfo(providerhandle: Handle, template: MutPtr<PerfCountersetInfo>, templatesize: UInt): UInt

public expect fun perfSetULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt

public expect fun perfSetULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt

public expect fun perfStartProvider(providerguid: ConstPtr<Guid>, controlcallback: Perflibrequest, phprovider: MutPtr<Handle>): UInt

public expect fun perfStartProviderEx(providerguid: ConstPtr<Guid>, providercontext: ConstPtr<PerfProviderContext>, provider: MutPtr<Handle>): UInt

public expect fun perfStopProvider(providerhandle: Handle): UInt

public expect fun queryPerformanceCounter(lpperformancecount: MutPtr<Long>): Bool

public expect fun queryPerformanceFrequency(lpfrequency: MutPtr<Long>): Bool

public expect fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt

public expect fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt

public expect fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt

public expect fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt

public expect fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt

public expect fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt

public expect fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt
