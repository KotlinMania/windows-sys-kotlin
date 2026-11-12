@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW")

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceInstallPerfDllA")

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceInstallPerfDllW")

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA")

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW")

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhAddCounterA")

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhAddCounterW")

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA")

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW")

public actual fun pdhBindInputDataSourceA(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA")

public actual fun pdhBindInputDataSourceW(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW")

public actual fun pdhBrowseCountersA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigA>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhBrowseCountersA")

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHa>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA")

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHw>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW")

public actual fun pdhBrowseCountersW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigW>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhBrowseCountersW")

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: ConstPtr<PdhRawCounter>, rawvalue2: ConstPtr<PdhRawCounter>, fmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue")

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCloseLog")

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCloseQuery")

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCollectQueryData")

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx")

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: MutPtr<Long>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime")

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: ConstPtr<PdhRawCounter>, data: MutPtr<PdhStatistics>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics")

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhConnectMachineA")

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhConnectMachineW")

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA")

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW")

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA")

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW")

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumMachinesA")

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA")

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW")

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumMachinesW")

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA")

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA")

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW")

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW")

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectsA")

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA")

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW")

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhEnumObjectsW")

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA")

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW")

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA")

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA")

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW")

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW")

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: ConstPtr<Long>, prawvalue1: ConstPtr<PdhRawCounter>, prawvalue2: ConstPtr<PdhRawCounter>, pfmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue")

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoA>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA")

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoW>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW")

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: MutPtr<Long>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase")

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA")

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH")

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW")

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA")

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA")

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW")

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW")

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA")

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA")

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW")

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW")

public actual fun pdhGetDllVersion(lpdwversion: MutPtr<PdhDllVersion>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetDllVersion")

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemA>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA")

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemW>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW")

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhFmtCountervalue>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue")

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: MutPtr<Long>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetLogFileSize")

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: MutPtr<Guid>, prunid: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID")

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemA>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA")

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemW>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW")

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhRawCounter>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue")

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery")

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA")

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW")

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA")

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW")

public actual fun pdhMakeCounterPathA(pcounterpathelements: ConstPtr<PdhCounterPathElementsA>, szfullpathbuffer: Pstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA")

public actual fun pdhMakeCounterPathW(pcounterpathelements: ConstPtr<PdhCounterPathElementsW>, szfullpathbuffer: Pwstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW")

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: MutPtr<PdhHlog>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhOpenLogA")

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: MutPtr<PdhHlog>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhOpenLogW")

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhOpenQueryA")

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhOpenQueryH")

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhOpenQueryW")

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: MutPtr<PdhCounterPathElementsA>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhParseCounterPathA")

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: MutPtr<PdhCounterPathElementsW>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhParseCounterPathW")

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA")

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pwstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW")

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: MutPtr<PdhRawLogRecord>, pdwbufferlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhReadRawLogRecord")

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhRemoveCounter")

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA")

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW")

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource")
private external fun wasiWindowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(dwdatasourceid: Int): Int

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    wasiWindowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()).toUInt()

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID")

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: ConstPtr<PdhTimeInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange")

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhUpdateLogA")

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog")

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhUpdateLogW")

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhValidatePathA")

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhValidatePathExA")

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhValidatePathExW")

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhValidatePathW")

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA")

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW")

public actual fun perfAddCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfAddCounters")

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle")

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfCreateInstance")

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue")

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue")

public actual fun perfDeleteCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfDeleteCounters")

public actual fun perfDeleteInstance(provider: Handle, instanceblock: ConstPtr<PerfCountersetInstance>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfDeleteInstance")

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: MutPtr<Guid>, ccountersetids: UInt, pccountersetidsactual: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet")

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, pinstances: MutPtr<PerfInstanceHeader>, cbinstances: UInt, pcbinstancesactual: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances")

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue")

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue")

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle")

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: MutPtr<PerfDataHeader>, cbcounterblock: UInt, pcbcounterblockactual: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfQueryCounterData")

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt, pcbcountersactual: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo")

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: MutPtr<UByte>, cbreginfo: UInt, pcbreginfoactual: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo")

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfQueryInstance")

public actual fun perfSetCounterRefValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, address: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue")

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: MutPtr<PerfCountersetInfo>, templatesize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo")

public actual fun perfSetULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue")

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue")

public actual fun perfStartProvider(providerguid: ConstPtr<Guid>, controlcallback: Perflibrequest, phprovider: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfStartProvider")

public actual fun perfStartProviderEx(providerguid: ConstPtr<Guid>, providercontext: ConstPtr<PerfProviderContext>, provider: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfStartProviderEx")

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformancePerfStopProvider")

public actual fun queryPerformanceCounter(lpperformancecount: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter")

public actual fun queryPerformanceFrequency(lpfrequency: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency")

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW")

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA")

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW")

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA")

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW")

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA")

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW")
