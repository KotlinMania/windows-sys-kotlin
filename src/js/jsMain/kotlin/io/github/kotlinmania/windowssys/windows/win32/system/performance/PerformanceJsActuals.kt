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

private val _windowsWin32SystemPerformanceNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun BackupPerfRegistryToFileW(szfilename: PCWSTR, szcommentstring: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_BackupPerfRegistryToFileW(szfilename.toString(), szcommentstring.toString()) as Int).toUInt() else 0u

public actual fun InstallPerfDllA(szcomputername: PCSTR, lpinifile: PCSTR, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_InstallPerfDllA(szcomputername.toString(), lpinifile.toString(), dwflags.toString()) as Int).toUInt() else 0u

public actual fun InstallPerfDllW(szcomputername: PCWSTR, lpinifile: PCWSTR, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_InstallPerfDllW(szcomputername.toString(), lpinifile.toString(), dwflags.toString()) as Int).toUInt() else 0u

public actual fun LoadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsA(lpcommandline.toString(), bquietmodearg) as Int).toUInt() else 0u

public actual fun LoadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsW(lpcommandline.toString(), bquietmodearg) as Int).toUInt() else 0u

public actual fun PdhAddCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhAddCounterA(hquery.toString(), szfullcounterpath.toString(), dwuserdata.toString(), phcounter.toString()) as Int).toUInt() else 0u

public actual fun PdhAddCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhAddCounterW(hquery.toString(), szfullcounterpath.toString(), dwuserdata.toString(), phcounter.toString()) as Int).toUInt() else 0u

public actual fun PdhAddEnglishCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhAddEnglishCounterA(hquery.toString(), szfullcounterpath.toString(), dwuserdata.toString(), phcounter.toString()) as Int).toUInt() else 0u

public actual fun PdhAddEnglishCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhAddEnglishCounterW(hquery.toString(), szfullcounterpath.toString(), dwuserdata.toString(), phcounter.toString()) as Int).toUInt() else 0u

public actual fun PdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhBindInputDataSourceA(phdatasource.toString(), logfilenamelist.toString()) as Int).toUInt() else 0u

public actual fun PdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhBindInputDataSourceW(phdatasource.toString(), logfilenamelist.toString()) as Int).toUInt() else 0u

public actual fun PdhBrowseCountersA(pbrowsedlgdata: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhBrowseCountersA(pbrowsedlgdata.toString()) as Int).toUInt() else 0u

public actual fun PdhBrowseCountersHA(pbrowsedlgdata: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhBrowseCountersHA(pbrowsedlgdata.toString()) as Int).toUInt() else 0u

public actual fun PdhBrowseCountersHW(pbrowsedlgdata: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhBrowseCountersHW(pbrowsedlgdata.toString()) as Int).toUInt() else 0u

public actual fun PdhBrowseCountersW(pbrowsedlgdata: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhBrowseCountersW(pbrowsedlgdata.toString()) as Int).toUInt() else 0u

public actual fun PdhCalculateCounterFromRawValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCalculateCounterFromRawValue(hcounter.toString(), dwformat.toInt(), rawvalue1.toString(), rawvalue2.toString(), fmtvalue.toString()) as Int).toUInt() else 0u

public actual fun PdhCloseLog(hlog: PDH_HLOG, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCloseLog(hlog.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhCloseQuery(hquery: PDH_HQUERY): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCloseQuery(hquery.toString()) as Int).toUInt() else 0u

public actual fun PdhCollectQueryData(hquery: PDH_HQUERY): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCollectQueryData(hquery.toString()) as Int).toUInt() else 0u

public actual fun PdhCollectQueryDataEx(hquery: PDH_HQUERY, dwintervaltime: UInt, hnewdataevent: HANDLE): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCollectQueryDataEx(hquery.toString(), dwintervaltime.toInt(), hnewdataevent.toString()) as Int).toUInt() else 0u

public actual fun PdhCollectQueryDataWithTime(hquery: PDH_HQUERY, plltimestamp: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCollectQueryDataWithTime(hquery.toString(), plltimestamp.toString()) as Int).toUInt() else 0u

public actual fun PdhComputeCounterStatistics(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: Long, data: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhComputeCounterStatistics(hcounter.toString(), dwformat.toInt(), dwfirstentry.toInt(), dwnumentries.toInt(), lprawvaluearray.toString(), data.toString()) as Int).toUInt() else 0u

public actual fun PdhConnectMachineA(szmachinename: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhConnectMachineA(szmachinename.toString()) as Int).toUInt() else 0u

public actual fun PdhConnectMachineW(szmachinename: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhConnectMachineW(szmachinename.toString()) as Int).toUInt() else 0u

public actual fun PdhCreateSQLTablesA(szdatasource: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCreateSQLTablesA(szdatasource.toString()) as Int).toUInt() else 0u

public actual fun PdhCreateSQLTablesW(szdatasource: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhCreateSQLTablesW(szdatasource.toString()) as Int).toUInt() else 0u

public actual fun PdhEnumLogSetNamesA(szdatasource: PCSTR, mszdatasetnamelist: PSTR, pcchbufferlength: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumLogSetNamesA(szdatasource.toString(), mszdatasetnamelist.toString(), pcchbufferlength.toString()) as Int).toUInt() else 0u

public actual fun PdhEnumLogSetNamesW(szdatasource: PCWSTR, mszdatasetnamelist: PWSTR, pcchbufferlength: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumLogSetNamesW(szdatasource.toString(), mszdatasetnamelist.toString(), pcchbufferlength.toString()) as Int).toUInt() else 0u

public actual fun PdhEnumMachinesA(szdatasource: PCSTR, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumMachinesA(szdatasource.toString(), mszmachinelist.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhEnumMachinesHA(hdatasource: PDH_HLOG, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumMachinesHA(hdatasource.toString(), mszmachinelist.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhEnumMachinesHW(hdatasource: PDH_HLOG, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumMachinesHW(hdatasource.toString(), mszmachinelist.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhEnumMachinesW(szdatasource: PCWSTR, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumMachinesW(szdatasource.toString(), mszmachinelist.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhEnumObjectItemsA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectItemsA(szdatasource.toString(), szmachinename.toString(), szobjectname.toString(), mszcounterlist.toString(), pcchcounterlistlength.toString(), mszinstancelist.toString(), pcchinstancelistlength.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhEnumObjectItemsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectItemsHA(hdatasource.toString(), szmachinename.toString(), szobjectname.toString(), mszcounterlist.toString(), pcchcounterlistlength.toString(), mszinstancelist.toString(), pcchinstancelistlength.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhEnumObjectItemsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectItemsHW(hdatasource.toString(), szmachinename.toString(), szobjectname.toString(), mszcounterlist.toString(), pcchcounterlistlength.toString(), mszinstancelist.toString(), pcchinstancelistlength.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhEnumObjectItemsW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectItemsW(szdatasource.toString(), szmachinename.toString(), szobjectname.toString(), mszcounterlist.toString(), pcchcounterlistlength.toString(), mszinstancelist.toString(), pcchinstancelistlength.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhEnumObjectsA(szdatasource: PCSTR, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectsA(szdatasource.toString(), szmachinename.toString(), mszobjectlist.toString(), pcchbuffersize.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else 0u

public actual fun PdhEnumObjectsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectsHA(hdatasource.toString(), szmachinename.toString(), mszobjectlist.toString(), pcchbuffersize.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else 0u

public actual fun PdhEnumObjectsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectsHW(hdatasource.toString(), szmachinename.toString(), mszobjectlist.toString(), pcchbuffersize.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else 0u

public actual fun PdhEnumObjectsW(szdatasource: PCWSTR, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhEnumObjectsW(szdatasource.toString(), szmachinename.toString(), mszobjectlist.toString(), pcchbuffersize.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else 0u

public actual fun PdhExpandCounterPathA(szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhExpandCounterPathA(szwildcardpath.toString(), mszexpandedpathlist.toString(), pcchpathlistlength.toString()) as Int).toUInt() else 0u

public actual fun PdhExpandCounterPathW(szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhExpandCounterPathW(szwildcardpath.toString(), mszexpandedpathlist.toString(), pcchpathlistlength.toString()) as Int).toUInt() else 0u

public actual fun PdhExpandWildCardPathA(szdatasource: PCSTR, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhExpandWildCardPathA(szdatasource.toString(), szwildcardpath.toString(), mszexpandedpathlist.toString(), pcchpathlistlength.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhExpandWildCardPathHA(hdatasource: PDH_HLOG, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhExpandWildCardPathHA(hdatasource.toString(), szwildcardpath.toString(), mszexpandedpathlist.toString(), pcchpathlistlength.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhExpandWildCardPathHW(hdatasource: PDH_HLOG, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhExpandWildCardPathHW(hdatasource.toString(), szwildcardpath.toString(), mszexpandedpathlist.toString(), pcchpathlistlength.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhExpandWildCardPathW(szdatasource: PCWSTR, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhExpandWildCardPathW(szdatasource.toString(), szwildcardpath.toString(), mszexpandedpathlist.toString(), pcchpathlistlength.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhFormatFromRawValue(dwcountertype: UInt, dwformat: PDH_FMT, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhFormatFromRawValue(dwcountertype.toInt(), dwformat.toInt(), ptimebase.toString(), prawvalue1.toString(), prawvalue2.toString(), pfmtvalue.toString()) as Int).toUInt() else 0u

public actual fun PdhGetCounterInfoA(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetCounterInfoA(hcounter.toString(), bretrieveexplaintext, pdwbuffersize.toString(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhGetCounterInfoW(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetCounterInfoW(hcounter.toString(), bretrieveexplaintext, pdwbuffersize.toString(), lpbuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhGetCounterTimeBase(hcounter: PDH_HCOUNTER, ptimebase: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetCounterTimeBase(hcounter.toString(), ptimebase.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDataSourceTimeRangeA(szdatasource: PCSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeA(szdatasource.toString(), pdwnumentries.toString(), pinfo.toString(), pdwbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDataSourceTimeRangeH(hdatasource: PDH_HLOG, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeH(hdatasource.toString(), pdwnumentries.toString(), pinfo.toString(), pdwbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDataSourceTimeRangeW(szdatasource: PCWSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeW(szdatasource.toString(), pdwnumentries.toString(), pinfo.toString(), pdwbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfCounterA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterA(szdatasource.toString(), szmachinename.toString(), szobjectname.toString(), szdefaultcountername.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfCounterHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHA(hdatasource.toString(), szmachinename.toString(), szobjectname.toString(), szdefaultcountername.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfCounterHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHW(hdatasource.toString(), szmachinename.toString(), szobjectname.toString(), szdefaultcountername.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfCounterW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterW(szdatasource.toString(), szmachinename.toString(), szobjectname.toString(), szdefaultcountername.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfObjectA(szdatasource: PCSTR, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectA(szdatasource.toString(), szmachinename.toString(), szdefaultobjectname.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfObjectHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHA(hdatasource.toString(), szmachinename.toString(), szdefaultobjectname.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfObjectHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHW(hdatasource.toString(), szmachinename.toString(), szdefaultobjectname.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDefaultPerfObjectW(szdatasource: PCWSTR, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectW(szdatasource.toString(), szmachinename.toString(), szdefaultobjectname.toString(), pcchbuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetDllVersion(lpdwversion: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetDllVersion(lpdwversion.toString()) as Int).toUInt() else 0u

public actual fun PdhGetFormattedCounterArrayA(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayA(hcounter.toString(), dwformat.toInt(), lpdwbuffersize.toString(), lpdwitemcount.toString(), itembuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhGetFormattedCounterArrayW(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayW(hcounter.toString(), dwformat.toInt(), lpdwbuffersize.toString(), lpdwitemcount.toString(), itembuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhGetFormattedCounterValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwtype: Long, pvalue: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetFormattedCounterValue(hcounter.toString(), dwformat.toInt(), lpdwtype.toString(), pvalue.toString()) as Int).toUInt() else 0u

public actual fun PdhGetLogFileSize(hlog: PDH_HLOG, llsize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetLogFileSize(hlog.toString(), llsize.toString()) as Int).toUInt() else 0u

public actual fun PdhGetLogSetGUID(hlog: PDH_HLOG, pguid: Long, prunid: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetLogSetGUID(hlog.toString(), pguid.toString(), prunid.toString()) as Int).toUInt() else 0u

public actual fun PdhGetRawCounterArrayA(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetRawCounterArrayA(hcounter.toString(), lpdwbuffersize.toString(), lpdwitemcount.toString(), itembuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhGetRawCounterArrayW(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetRawCounterArrayW(hcounter.toString(), lpdwbuffersize.toString(), lpdwitemcount.toString(), itembuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhGetRawCounterValue(hcounter: PDH_HCOUNTER, lpdwtype: Long, pvalue: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhGetRawCounterValue(hcounter.toString(), lpdwtype.toString(), pvalue.toString()) as Int).toUInt() else 0u

public actual fun PdhIsRealTimeQuery(hquery: PDH_HQUERY): BOOL =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhIsRealTimeQuery(hquery.toString()) as Int) else 0

public actual fun PdhLookupPerfIndexByNameA(szmachinename: PCSTR, sznamebuffer: PCSTR, pdwindex: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameA(szmachinename.toString(), sznamebuffer.toString(), pdwindex.toString()) as Int).toUInt() else 0u

public actual fun PdhLookupPerfIndexByNameW(szmachinename: PCWSTR, sznamebuffer: PCWSTR, pdwindex: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameW(szmachinename.toString(), sznamebuffer.toString(), pdwindex.toString()) as Int).toUInt() else 0u

public actual fun PdhLookupPerfNameByIndexA(szmachinename: PCSTR, dwnameindex: UInt, sznamebuffer: PSTR, pcchnamebuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexA(szmachinename.toString(), dwnameindex.toInt(), sznamebuffer.toString(), pcchnamebuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhLookupPerfNameByIndexW(szmachinename: PCWSTR, dwnameindex: UInt, sznamebuffer: PWSTR, pcchnamebuffersize: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexW(szmachinename.toString(), dwnameindex.toInt(), sznamebuffer.toString(), pcchnamebuffersize.toString()) as Int).toUInt() else 0u

public actual fun PdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: PSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhMakeCounterPathA(pcounterpathelements.toString(), szfullpathbuffer.toString(), pcchbuffersize.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: PWSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhMakeCounterPathW(pcounterpathelements.toString(), szfullpathbuffer.toString(), pcchbuffersize.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhOpenLogA(szlogfilename: PCSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCSTR, phlog: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhOpenLogA(szlogfilename.toString(), dwaccessflags.toInt(), lpdwlogtype.toString(), hquery.toString(), dwmaxsize.toInt(), szusercaption.toString(), phlog.toString()) as Int).toUInt() else 0u

public actual fun PdhOpenLogW(szlogfilename: PCWSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCWSTR, phlog: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhOpenLogW(szlogfilename.toString(), dwaccessflags.toInt(), lpdwlogtype.toString(), hquery.toString(), dwmaxsize.toInt(), szusercaption.toString(), phlog.toString()) as Int).toUInt() else 0u

public actual fun PdhOpenQueryA(szdatasource: PCSTR, dwuserdata: ULong, phquery: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhOpenQueryA(szdatasource.toString(), dwuserdata.toString(), phquery.toString()) as Int).toUInt() else 0u

public actual fun PdhOpenQueryH(hdatasource: PDH_HLOG, dwuserdata: ULong, phquery: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhOpenQueryH(hdatasource.toString(), dwuserdata.toString(), phquery.toString()) as Int).toUInt() else 0u

public actual fun PdhOpenQueryW(szdatasource: PCWSTR, dwuserdata: ULong, phquery: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhOpenQueryW(szdatasource.toString(), dwuserdata.toString(), phquery.toString()) as Int).toUInt() else 0u

public actual fun PdhParseCounterPathA(szfullpathbuffer: PCSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhParseCounterPathA(szfullpathbuffer.toString(), pcounterpathelements.toString(), pdwbuffersize.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhParseCounterPathW(szfullpathbuffer: PCWSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhParseCounterPathW(szfullpathbuffer.toString(), pcounterpathelements.toString(), pdwbuffersize.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun PdhParseInstanceNameA(szinstancestring: PCSTR, szinstancename: PSTR, pcchinstancenamelength: Long, szparentname: PSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhParseInstanceNameA(szinstancestring.toString(), szinstancename.toString(), pcchinstancenamelength.toString(), szparentname.toString(), pcchparentnamelength.toString(), lpindex.toString()) as Int).toUInt() else 0u

public actual fun PdhParseInstanceNameW(szinstancestring: PCWSTR, szinstancename: PWSTR, pcchinstancenamelength: Long, szparentname: PWSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhParseInstanceNameW(szinstancestring.toString(), szinstancename.toString(), pcchinstancenamelength.toString(), szparentname.toString(), pcchparentnamelength.toString(), lpindex.toString()) as Int).toUInt() else 0u

public actual fun PdhReadRawLogRecord(hlog: PDH_HLOG, ftrecord: FILETIME, prawlogrecord: Long, pdwbufferlength: Long): UInt =
    0u

public actual fun PdhRemoveCounter(hcounter: PDH_HCOUNTER): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhRemoveCounter(hcounter.toString()) as Int).toUInt() else 0u

public actual fun PdhSelectDataSourceA(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PSTR, pcchbufferlength: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhSelectDataSourceA(hwndowner.toString(), dwflags.toInt(), szdatasource.toString(), pcchbufferlength.toString()) as Int).toUInt() else 0u

public actual fun PdhSelectDataSourceW(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PWSTR, pcchbufferlength: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhSelectDataSourceW(hwndowner.toString(), dwflags.toInt(), szdatasource.toString(), pcchbufferlength.toString()) as Int).toUInt() else 0u

public actual fun PdhSetCounterScaleFactor(hcounter: PDH_HCOUNTER, lfactor: Int): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhSetCounterScaleFactor(hcounter.toString(), lfactor) as Int).toUInt() else 0u

public actual fun PdhSetDefaultRealTimeDataSource(dwdatasourceid: REAL_TIME_DATA_SOURCE_ID_FLAGS): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()) as Int).toUInt() else 0u

public actual fun PdhSetLogSetRunID(hlog: PDH_HLOG, runid: Int): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhSetLogSetRunID(hlog.toString(), runid) as Int).toUInt() else 0u

public actual fun PdhSetQueryTimeRange(hquery: PDH_HQUERY, pinfo: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhSetQueryTimeRange(hquery.toString(), pinfo.toString()) as Int).toUInt() else 0u

public actual fun PdhUpdateLogA(hlog: PDH_HLOG, szuserstring: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhUpdateLogA(hlog.toString(), szuserstring.toString()) as Int).toUInt() else 0u

public actual fun PdhUpdateLogFileCatalog(hlog: PDH_HLOG): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhUpdateLogFileCatalog(hlog.toString()) as Int).toUInt() else 0u

public actual fun PdhUpdateLogW(hlog: PDH_HLOG, szuserstring: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhUpdateLogW(hlog.toString(), szuserstring.toString()) as Int).toUInt() else 0u

public actual fun PdhValidatePathA(szfullpathbuffer: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhValidatePathA(szfullpathbuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhValidatePathExA(hdatasource: PDH_HLOG, szfullpathbuffer: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhValidatePathExA(hdatasource.toString(), szfullpathbuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhValidatePathExW(hdatasource: PDH_HLOG, szfullpathbuffer: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhValidatePathExW(hdatasource.toString(), szfullpathbuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhValidatePathW(szfullpathbuffer: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhValidatePathW(szfullpathbuffer.toString()) as Int).toUInt() else 0u

public actual fun PdhVerifySQLDBA(szdatasource: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhVerifySQLDBA(szdatasource.toString()) as Int).toUInt() else 0u

public actual fun PdhVerifySQLDBW(szdatasource: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PdhVerifySQLDBW(szdatasource.toString()) as Int).toUInt() else 0u

public actual fun PerfAddCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfAddCounters(hquery.toString(), pcounters.toString(), cbcounters.toInt()) as Int).toUInt() else 0u

public actual fun PerfCloseQueryHandle(hquery: HANDLE): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfCloseQueryHandle(hquery.toString()) as Int).toUInt() else 0u

public actual fun PerfCreateInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfCreateInstance(providerhandle.toString(), countersetguid.toString(), name.toString(), id.toInt()) as String).toLong() else 0L

public actual fun PerfDecrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfDecrementULongCounterValue(provider.toString(), instance.toString(), counterid.toInt(), value.toInt()) as Int).toUInt() else 0u

public actual fun PerfDecrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfDecrementULongLongCounterValue(provider.toString(), instance.toString(), counterid.toInt(), value.toString()) as Int).toUInt() else 0u

public actual fun PerfDeleteCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfDeleteCounters(hquery.toString(), pcounters.toString(), cbcounters.toInt()) as Int).toUInt() else 0u

public actual fun PerfDeleteInstance(provider: HANDLE, instanceblock: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfDeleteInstance(provider.toString(), instanceblock.toString()) as Int).toUInt() else 0u

public actual fun PerfEnumerateCounterSet(szmachine: PCWSTR, pcountersetids: Long, ccountersetids: UInt, pccountersetidsactual: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfEnumerateCounterSet(szmachine.toString(), pcountersetids.toString(), ccountersetids.toInt(), pccountersetidsactual.toString()) as Int).toUInt() else 0u

public actual fun PerfEnumerateCounterSetInstances(szmachine: PCWSTR, pcountersetid: Long, pinstances: Long, cbinstances: UInt, pcbinstancesactual: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfEnumerateCounterSetInstances(szmachine.toString(), pcountersetid.toString(), pinstances.toString(), cbinstances.toInt(), pcbinstancesactual.toString()) as Int).toUInt() else 0u

public actual fun PerfIncrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfIncrementULongCounterValue(provider.toString(), instance.toString(), counterid.toInt(), value.toInt()) as Int).toUInt() else 0u

public actual fun PerfIncrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfIncrementULongLongCounterValue(provider.toString(), instance.toString(), counterid.toInt(), value.toString()) as Int).toUInt() else 0u

public actual fun PerfOpenQueryHandle(szmachine: PCWSTR, phquery: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfOpenQueryHandle(szmachine.toString(), phquery.toString()) as Int).toUInt() else 0u

public actual fun PerfQueryCounterData(hquery: HANDLE, pcounterblock: Long, cbcounterblock: UInt, pcbcounterblockactual: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfQueryCounterData(hquery.toString(), pcounterblock.toString(), cbcounterblock.toInt(), pcbcounterblockactual.toString()) as Int).toUInt() else 0u

public actual fun PerfQueryCounterInfo(hquery: HANDLE, pcounters: Long, cbcounters: UInt, pcbcountersactual: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfQueryCounterInfo(hquery.toString(), pcounters.toString(), cbcounters.toInt(), pcbcountersactual.toString()) as Int).toUInt() else 0u

public actual fun PerfQueryCounterSetRegistrationInfo(szmachine: PCWSTR, pcountersetid: Long, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: Long, cbreginfo: UInt, pcbreginfoactual: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfQueryCounterSetRegistrationInfo(szmachine.toString(), pcountersetid.toString(), requestcode, requestlangid.toInt(), pbreginfo.toString(), cbreginfo.toInt(), pcbreginfoactual.toString()) as Int).toUInt() else 0u

public actual fun PerfQueryInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfQueryInstance(providerhandle.toString(), countersetguid.toString(), name.toString(), id.toInt()) as String).toLong() else 0L

public actual fun PerfSetCounterRefValue(provider: HANDLE, instance: Long, counterid: UInt, address: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfSetCounterRefValue(provider.toString(), instance.toString(), counterid.toInt(), address.toString()) as Int).toUInt() else 0u

public actual fun PerfSetCounterSetInfo(providerhandle: HANDLE, template: Long, templatesize: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfSetCounterSetInfo(providerhandle.toString(), template.toString(), templatesize.toInt()) as Int).toUInt() else 0u

public actual fun PerfSetULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfSetULongCounterValue(provider.toString(), instance.toString(), counterid.toInt(), value.toInt()) as Int).toUInt() else 0u

public actual fun PerfSetULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfSetULongLongCounterValue(provider.toString(), instance.toString(), counterid.toInt(), value.toString()) as Int).toUInt() else 0u

public actual fun PerfStartProvider(providerguid: Long, controlcallback: PERFLIBREQUEST, phprovider: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfStartProvider(providerguid.toString(), controlcallback.toLong().toString(), phprovider.toString()) as Int).toUInt() else 0u

public actual fun PerfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfStartProviderEx(providerguid.toString(), providercontext.toString(), provider.toString()) as Int).toUInt() else 0u

public actual fun PerfStopProvider(providerhandle: HANDLE): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_PerfStopProvider(providerhandle.toString()) as Int).toUInt() else 0u

public actual fun QueryPerformanceCounter(lpperformancecount: Long): BOOL =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_QueryPerformanceCounter(lpperformancecount.toString()) as Int) else 0

public actual fun QueryPerformanceFrequency(lpfrequency: Long): BOOL =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_QueryPerformanceFrequency(lpfrequency.toString()) as Int) else 0

public actual fun RestorePerfRegistryFromFileW(szfilename: PCWSTR, szlangid: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_RestorePerfRegistryFromFileW(szfilename.toString(), szlangid.toString()) as Int).toUInt() else 0u

public actual fun SetServiceAsTrustedA(szreserved: PCSTR, szservicename: PCSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_SetServiceAsTrustedA(szreserved.toString(), szservicename.toString()) as Int).toUInt() else 0u

public actual fun SetServiceAsTrustedW(szreserved: PCWSTR, szservicename: PCWSTR): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_SetServiceAsTrustedW(szreserved.toString(), szservicename.toString()) as Int).toUInt() else 0u

public actual fun UnloadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsA(lpcommandline.toString(), bquietmodearg) as Int).toUInt() else 0u

public actual fun UnloadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsW(lpcommandline.toString(), bquietmodearg) as Int).toUInt() else 0u

public actual fun UpdatePerfNameFilesA(sznewctrfilepath: PCSTR, sznewhlpfilepath: PCSTR, szlanguageid: PCSTR, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_UpdatePerfNameFilesA(sznewctrfilepath.toString(), sznewhlpfilepath.toString(), szlanguageid.toString(), dwflags.toString()) as Int).toUInt() else 0u

public actual fun UpdatePerfNameFilesW(sznewctrfilepath: PCWSTR, sznewhlpfilepath: PCWSTR, szlanguageid: PCWSTR, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAddon != null) (_windowsWin32SystemPerformanceNapiAddon.windowssys_windows_win32_system_performance_UpdatePerfNameFilesW(sznewctrfilepath.toString(), sznewhlpfilepath.toString(), szlanguageid.toString(), dwflags.toString()) as Int).toUInt() else 0u
