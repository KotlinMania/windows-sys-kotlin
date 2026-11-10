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

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhBindInputDataSourceA(phdatasource: COpaquePointer?, logfilenamelist: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhBindInputDataSourceW(phdatasource: COpaquePointer?, logfilenamelist: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhBrowseCountersA(pbrowsedlgdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhBrowseCountersW(pbrowsedlgdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: COpaquePointer?, rawvalue2: COpaquePointer?, fmtvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: COpaquePointer?, data: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: COpaquePointer?, prawvalue1: COpaquePointer?, prawvalue2: COpaquePointer?, pfmtvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetDllVersion(lpdwversion: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: COpaquePointer?, prunid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhMakeCounterPathA(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhMakeCounterPathW(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pwstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pwstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: COpaquePointer?, pdwbufferlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfAddCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfDeleteCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfDeleteInstance(provider: Handle, instanceblock: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: COpaquePointer?, ccountersetids: UInt, pccountersetidsactual: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: COpaquePointer?, pinstances: COpaquePointer?, cbinstances: UInt, pcbinstancesactual: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: COpaquePointer?, cbcounterblock: UInt, pcbcounterblockactual: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt, pcbcountersactual: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: COpaquePointer?, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: COpaquePointer?, cbreginfo: UInt, pcbreginfoactual: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfSetCounterRefValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, address: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: COpaquePointer?, templatesize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfSetULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfStartProvider(providerguid: COpaquePointer?, controlcallback: Perflibrequest, phprovider: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfStartProviderEx(providerguid: COpaquePointer?, providercontext: COpaquePointer?, provider: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryPerformanceCounter(lpperformancecount: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun queryPerformanceFrequency(lpfrequency: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
