@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BackupPerfRegistryToFileW(szfilename: PCWSTR, szcommentstring: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_BackupPerfRegistryToFileW(szfilename.toCPointer<ByteVar>(), szcommentstring.toCPointer<ByteVar>())

public actual fun InstallPerfDllA(szcomputername: PCSTR, lpinifile: PCSTR, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_InstallPerfDllA(szcomputername.toCPointer<ByteVar>(), lpinifile.toCPointer<ByteVar>(), dwflags)

public actual fun InstallPerfDllW(szcomputername: PCWSTR, lpinifile: PCWSTR, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_InstallPerfDllW(szcomputername.toCPointer<ByteVar>(), lpinifile.toCPointer<ByteVar>(), dwflags)

public actual fun LoadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsA(lpcommandline.toCPointer<ByteVar>(), bquietmodearg)

public actual fun LoadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_LoadPerfCounterTextStringsW(lpcommandline.toCPointer<ByteVar>(), bquietmodearg)

public actual fun PdhAddCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhAddCounterA(hquery.toCPointer<ByteVar>(), szfullcounterpath.toCPointer<ByteVar>(), dwuserdata, phcounter.toCPointer<ByteVar>())

public actual fun PdhAddCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhAddCounterW(hquery.toCPointer<ByteVar>(), szfullcounterpath.toCPointer<ByteVar>(), dwuserdata, phcounter.toCPointer<ByteVar>())

public actual fun PdhAddEnglishCounterA(hquery: PDH_HQUERY, szfullcounterpath: PCSTR, dwuserdata: ULong, phcounter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhAddEnglishCounterA(hquery.toCPointer<ByteVar>(), szfullcounterpath.toCPointer<ByteVar>(), dwuserdata, phcounter.toCPointer<ByteVar>())

public actual fun PdhAddEnglishCounterW(hquery: PDH_HQUERY, szfullcounterpath: PCWSTR, dwuserdata: ULong, phcounter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhAddEnglishCounterW(hquery.toCPointer<ByteVar>(), szfullcounterpath.toCPointer<ByteVar>(), dwuserdata, phcounter.toCPointer<ByteVar>())

public actual fun PdhBindInputDataSourceA(phdatasource: Long, logfilenamelist: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhBindInputDataSourceA(phdatasource.toCPointer<ByteVar>(), logfilenamelist.toCPointer<ByteVar>())

public actual fun PdhBindInputDataSourceW(phdatasource: Long, logfilenamelist: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhBindInputDataSourceW(phdatasource.toCPointer<ByteVar>(), logfilenamelist.toCPointer<ByteVar>())

public actual fun PdhBrowseCountersA(pbrowsedlgdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhBrowseCountersA(pbrowsedlgdata.toCPointer<ByteVar>())

public actual fun PdhBrowseCountersHA(pbrowsedlgdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhBrowseCountersHA(pbrowsedlgdata.toCPointer<ByteVar>())

public actual fun PdhBrowseCountersHW(pbrowsedlgdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhBrowseCountersHW(pbrowsedlgdata.toCPointer<ByteVar>())

public actual fun PdhBrowseCountersW(pbrowsedlgdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhBrowseCountersW(pbrowsedlgdata.toCPointer<ByteVar>())

public actual fun PdhCalculateCounterFromRawValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, rawvalue1: Long, rawvalue2: Long, fmtvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCalculateCounterFromRawValue(hcounter.toCPointer<ByteVar>(), dwformat, rawvalue1.toCPointer<ByteVar>(), rawvalue2.toCPointer<ByteVar>(), fmtvalue.toCPointer<ByteVar>())

public actual fun PdhCloseLog(hlog: PDH_HLOG, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCloseLog(hlog.toCPointer<ByteVar>(), dwflags)

public actual fun PdhCloseQuery(hquery: PDH_HQUERY): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCloseQuery(hquery.toCPointer<ByteVar>())

public actual fun PdhCollectQueryData(hquery: PDH_HQUERY): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCollectQueryData(hquery.toCPointer<ByteVar>())

public actual fun PdhCollectQueryDataEx(hquery: PDH_HQUERY, dwintervaltime: UInt, hnewdataevent: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCollectQueryDataEx(hquery.toCPointer<ByteVar>(), dwintervaltime, hnewdataevent.toCPointer<ByteVar>())

public actual fun PdhCollectQueryDataWithTime(hquery: PDH_HQUERY, plltimestamp: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCollectQueryDataWithTime(hquery.toCPointer<ByteVar>(), plltimestamp.toCPointer<ByteVar>())

public actual fun PdhComputeCounterStatistics(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: Long, data: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhComputeCounterStatistics(hcounter.toCPointer<ByteVar>(), dwformat, dwfirstentry, dwnumentries, lprawvaluearray.toCPointer<ByteVar>(), data.toCPointer<ByteVar>())

public actual fun PdhConnectMachineA(szmachinename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhConnectMachineA(szmachinename.toCPointer<ByteVar>())

public actual fun PdhConnectMachineW(szmachinename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhConnectMachineW(szmachinename.toCPointer<ByteVar>())

public actual fun PdhCreateSQLTablesA(szdatasource: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCreateSQLTablesA(szdatasource.toCPointer<ByteVar>())

public actual fun PdhCreateSQLTablesW(szdatasource: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhCreateSQLTablesW(szdatasource.toCPointer<ByteVar>())

public actual fun PdhEnumLogSetNamesA(szdatasource: PCSTR, mszdatasetnamelist: PSTR, pcchbufferlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumLogSetNamesA(szdatasource.toCPointer<ByteVar>(), mszdatasetnamelist.toCPointer<ByteVar>(), pcchbufferlength.toCPointer<ByteVar>())

public actual fun PdhEnumLogSetNamesW(szdatasource: PCWSTR, mszdatasetnamelist: PWSTR, pcchbufferlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumLogSetNamesW(szdatasource.toCPointer<ByteVar>(), mszdatasetnamelist.toCPointer<ByteVar>(), pcchbufferlength.toCPointer<ByteVar>())

public actual fun PdhEnumMachinesA(szdatasource: PCSTR, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumMachinesA(szdatasource.toCPointer<ByteVar>(), mszmachinelist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhEnumMachinesHA(hdatasource: PDH_HLOG, mszmachinelist: PSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumMachinesHA(hdatasource.toCPointer<ByteVar>(), mszmachinelist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhEnumMachinesHW(hdatasource: PDH_HLOG, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumMachinesHW(hdatasource.toCPointer<ByteVar>(), mszmachinelist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhEnumMachinesW(szdatasource: PCWSTR, mszmachinelist: PWSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumMachinesW(szdatasource.toCPointer<ByteVar>(), mszmachinelist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhEnumObjectItemsA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectItemsA(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), mszcounterlist.toCPointer<ByteVar>(), pcchcounterlistlength.toCPointer<ByteVar>(), mszinstancelist.toCPointer<ByteVar>(), pcchinstancelistlength.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun PdhEnumObjectItemsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, mszcounterlist: PSTR, pcchcounterlistlength: Long, mszinstancelist: PSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectItemsHA(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), mszcounterlist.toCPointer<ByteVar>(), pcchcounterlistlength.toCPointer<ByteVar>(), mszinstancelist.toCPointer<ByteVar>(), pcchinstancelistlength.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun PdhEnumObjectItemsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectItemsHW(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), mszcounterlist.toCPointer<ByteVar>(), pcchcounterlistlength.toCPointer<ByteVar>(), mszinstancelist.toCPointer<ByteVar>(), pcchinstancelistlength.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun PdhEnumObjectItemsW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, mszcounterlist: PWSTR, pcchcounterlistlength: Long, mszinstancelist: PWSTR, pcchinstancelistlength: Long, dwdetaillevel: PERF_DETAIL, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectItemsW(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), mszcounterlist.toCPointer<ByteVar>(), pcchcounterlistlength.toCPointer<ByteVar>(), mszinstancelist.toCPointer<ByteVar>(), pcchinstancelistlength.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun PdhEnumObjectsA(szdatasource: PCSTR, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectsA(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), mszobjectlist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun PdhEnumObjectsHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, mszobjectlist: PSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectsHA(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), mszobjectlist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun PdhEnumObjectsHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectsHW(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), mszobjectlist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun PdhEnumObjectsW(szdatasource: PCWSTR, szmachinename: PCWSTR, mszobjectlist: PWSTR, pcchbuffersize: Long, dwdetaillevel: PERF_DETAIL, brefresh: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhEnumObjectsW(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), mszobjectlist.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun PdhExpandCounterPathA(szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhExpandCounterPathA(szwildcardpath.toCPointer<ByteVar>(), mszexpandedpathlist.toCPointer<ByteVar>(), pcchpathlistlength.toCPointer<ByteVar>())

public actual fun PdhExpandCounterPathW(szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhExpandCounterPathW(szwildcardpath.toCPointer<ByteVar>(), mszexpandedpathlist.toCPointer<ByteVar>(), pcchpathlistlength.toCPointer<ByteVar>())

public actual fun PdhExpandWildCardPathA(szdatasource: PCSTR, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhExpandWildCardPathA(szdatasource.toCPointer<ByteVar>(), szwildcardpath.toCPointer<ByteVar>(), mszexpandedpathlist.toCPointer<ByteVar>(), pcchpathlistlength.toCPointer<ByteVar>(), dwflags)

public actual fun PdhExpandWildCardPathHA(hdatasource: PDH_HLOG, szwildcardpath: PCSTR, mszexpandedpathlist: PSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhExpandWildCardPathHA(hdatasource.toCPointer<ByteVar>(), szwildcardpath.toCPointer<ByteVar>(), mszexpandedpathlist.toCPointer<ByteVar>(), pcchpathlistlength.toCPointer<ByteVar>(), dwflags)

public actual fun PdhExpandWildCardPathHW(hdatasource: PDH_HLOG, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhExpandWildCardPathHW(hdatasource.toCPointer<ByteVar>(), szwildcardpath.toCPointer<ByteVar>(), mszexpandedpathlist.toCPointer<ByteVar>(), pcchpathlistlength.toCPointer<ByteVar>(), dwflags)

public actual fun PdhExpandWildCardPathW(szdatasource: PCWSTR, szwildcardpath: PCWSTR, mszexpandedpathlist: PWSTR, pcchpathlistlength: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhExpandWildCardPathW(szdatasource.toCPointer<ByteVar>(), szwildcardpath.toCPointer<ByteVar>(), mszexpandedpathlist.toCPointer<ByteVar>(), pcchpathlistlength.toCPointer<ByteVar>(), dwflags)

public actual fun PdhFormatFromRawValue(dwcountertype: UInt, dwformat: PDH_FMT, ptimebase: Long, prawvalue1: Long, prawvalue2: Long, pfmtvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhFormatFromRawValue(dwcountertype, dwformat, ptimebase.toCPointer<ByteVar>(), prawvalue1.toCPointer<ByteVar>(), prawvalue2.toCPointer<ByteVar>(), pfmtvalue.toCPointer<ByteVar>())

public actual fun PdhGetCounterInfoA(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetCounterInfoA(hcounter.toCPointer<ByteVar>(), bretrieveexplaintext, pdwbuffersize.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>())

public actual fun PdhGetCounterInfoW(hcounter: PDH_HCOUNTER, bretrieveexplaintext: Boolean, pdwbuffersize: Long, lpbuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetCounterInfoW(hcounter.toCPointer<ByteVar>(), bretrieveexplaintext, pdwbuffersize.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>())

public actual fun PdhGetCounterTimeBase(hcounter: PDH_HCOUNTER, ptimebase: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetCounterTimeBase(hcounter.toCPointer<ByteVar>(), ptimebase.toCPointer<ByteVar>())

public actual fun PdhGetDataSourceTimeRangeA(szdatasource: PCSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeA(szdatasource.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>(), pinfo.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDataSourceTimeRangeH(hdatasource: PDH_HLOG, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeH(hdatasource.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>(), pinfo.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDataSourceTimeRangeW(szdatasource: PCWSTR, pdwnumentries: Long, pinfo: Long, pdwbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDataSourceTimeRangeW(szdatasource.toCPointer<ByteVar>(), pdwnumentries.toCPointer<ByteVar>(), pinfo.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfCounterA(szdatasource: PCSTR, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterA(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), szdefaultcountername.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfCounterHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szobjectname: PCSTR, szdefaultcountername: PSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHA(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), szdefaultcountername.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfCounterHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterHW(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), szdefaultcountername.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfCounterW(szdatasource: PCWSTR, szmachinename: PCWSTR, szobjectname: PCWSTR, szdefaultcountername: PWSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfCounterW(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), szdefaultcountername.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfObjectA(szdatasource: PCSTR, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectA(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szdefaultobjectname.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfObjectHA(hdatasource: PDH_HLOG, szmachinename: PCSTR, szdefaultobjectname: PSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHA(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szdefaultobjectname.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfObjectHW(hdatasource: PDH_HLOG, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectHW(hdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szdefaultobjectname.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDefaultPerfObjectW(szdatasource: PCWSTR, szmachinename: PCWSTR, szdefaultobjectname: PWSTR, pcchbuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDefaultPerfObjectW(szdatasource.toCPointer<ByteVar>(), szmachinename.toCPointer<ByteVar>(), szdefaultobjectname.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>())

public actual fun PdhGetDllVersion(lpdwversion: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetDllVersion(lpdwversion.toCPointer<ByteVar>())

public actual fun PdhGetFormattedCounterArrayA(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayA(hcounter.toCPointer<ByteVar>(), dwformat, lpdwbuffersize.toCPointer<ByteVar>(), lpdwitemcount.toCPointer<ByteVar>(), itembuffer.toCPointer<ByteVar>())

public actual fun PdhGetFormattedCounterArrayW(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetFormattedCounterArrayW(hcounter.toCPointer<ByteVar>(), dwformat, lpdwbuffersize.toCPointer<ByteVar>(), lpdwitemcount.toCPointer<ByteVar>(), itembuffer.toCPointer<ByteVar>())

public actual fun PdhGetFormattedCounterValue(hcounter: PDH_HCOUNTER, dwformat: PDH_FMT, lpdwtype: Long, pvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetFormattedCounterValue(hcounter.toCPointer<ByteVar>(), dwformat, lpdwtype.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>())

public actual fun PdhGetLogFileSize(hlog: PDH_HLOG, llsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetLogFileSize(hlog.toCPointer<ByteVar>(), llsize.toCPointer<ByteVar>())

public actual fun PdhGetLogSetGUID(hlog: PDH_HLOG, pguid: Long, prunid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetLogSetGUID(hlog.toCPointer<ByteVar>(), pguid.toCPointer<ByteVar>(), prunid.toCPointer<ByteVar>())

public actual fun PdhGetRawCounterArrayA(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetRawCounterArrayA(hcounter.toCPointer<ByteVar>(), lpdwbuffersize.toCPointer<ByteVar>(), lpdwitemcount.toCPointer<ByteVar>(), itembuffer.toCPointer<ByteVar>())

public actual fun PdhGetRawCounterArrayW(hcounter: PDH_HCOUNTER, lpdwbuffersize: Long, lpdwitemcount: Long, itembuffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetRawCounterArrayW(hcounter.toCPointer<ByteVar>(), lpdwbuffersize.toCPointer<ByteVar>(), lpdwitemcount.toCPointer<ByteVar>(), itembuffer.toCPointer<ByteVar>())

public actual fun PdhGetRawCounterValue(hcounter: PDH_HCOUNTER, lpdwtype: Long, pvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhGetRawCounterValue(hcounter.toCPointer<ByteVar>(), lpdwtype.toCPointer<ByteVar>(), pvalue.toCPointer<ByteVar>())

public actual fun PdhIsRealTimeQuery(hquery: PDH_HQUERY): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhIsRealTimeQuery(hquery.toCPointer<ByteVar>())

public actual fun PdhLookupPerfIndexByNameA(szmachinename: PCSTR, sznamebuffer: PCSTR, pdwindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameA(szmachinename.toCPointer<ByteVar>(), sznamebuffer.toCPointer<ByteVar>(), pdwindex.toCPointer<ByteVar>())

public actual fun PdhLookupPerfIndexByNameW(szmachinename: PCWSTR, sznamebuffer: PCWSTR, pdwindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhLookupPerfIndexByNameW(szmachinename.toCPointer<ByteVar>(), sznamebuffer.toCPointer<ByteVar>(), pdwindex.toCPointer<ByteVar>())

public actual fun PdhLookupPerfNameByIndexA(szmachinename: PCSTR, dwnameindex: UInt, sznamebuffer: PSTR, pcchnamebuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexA(szmachinename.toCPointer<ByteVar>(), dwnameindex, sznamebuffer.toCPointer<ByteVar>(), pcchnamebuffersize.toCPointer<ByteVar>())

public actual fun PdhLookupPerfNameByIndexW(szmachinename: PCWSTR, dwnameindex: UInt, sznamebuffer: PWSTR, pcchnamebuffersize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhLookupPerfNameByIndexW(szmachinename.toCPointer<ByteVar>(), dwnameindex, sznamebuffer.toCPointer<ByteVar>(), pcchnamebuffersize.toCPointer<ByteVar>())

public actual fun PdhMakeCounterPathA(pcounterpathelements: Long, szfullpathbuffer: PSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhMakeCounterPathA(pcounterpathelements.toCPointer<ByteVar>(), szfullpathbuffer.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>(), dwflags)

public actual fun PdhMakeCounterPathW(pcounterpathelements: Long, szfullpathbuffer: PWSTR, pcchbuffersize: Long, dwflags: PDH_PATH_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhMakeCounterPathW(pcounterpathelements.toCPointer<ByteVar>(), szfullpathbuffer.toCPointer<ByteVar>(), pcchbuffersize.toCPointer<ByteVar>(), dwflags)

public actual fun PdhOpenLogA(szlogfilename: PCSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCSTR, phlog: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhOpenLogA(szlogfilename.toCPointer<ByteVar>(), dwaccessflags, lpdwlogtype.toCPointer<ByteVar>(), hquery.toCPointer<ByteVar>(), dwmaxsize, szusercaption.toCPointer<ByteVar>(), phlog.toCPointer<ByteVar>())

public actual fun PdhOpenLogW(szlogfilename: PCWSTR, dwaccessflags: PDH_LOG, lpdwlogtype: Long, hquery: PDH_HQUERY, dwmaxsize: UInt, szusercaption: PCWSTR, phlog: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhOpenLogW(szlogfilename.toCPointer<ByteVar>(), dwaccessflags, lpdwlogtype.toCPointer<ByteVar>(), hquery.toCPointer<ByteVar>(), dwmaxsize, szusercaption.toCPointer<ByteVar>(), phlog.toCPointer<ByteVar>())

public actual fun PdhOpenQueryA(szdatasource: PCSTR, dwuserdata: ULong, phquery: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhOpenQueryA(szdatasource.toCPointer<ByteVar>(), dwuserdata, phquery.toCPointer<ByteVar>())

public actual fun PdhOpenQueryH(hdatasource: PDH_HLOG, dwuserdata: ULong, phquery: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhOpenQueryH(hdatasource.toCPointer<ByteVar>(), dwuserdata, phquery.toCPointer<ByteVar>())

public actual fun PdhOpenQueryW(szdatasource: PCWSTR, dwuserdata: ULong, phquery: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhOpenQueryW(szdatasource.toCPointer<ByteVar>(), dwuserdata, phquery.toCPointer<ByteVar>())

public actual fun PdhParseCounterPathA(szfullpathbuffer: PCSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhParseCounterPathA(szfullpathbuffer.toCPointer<ByteVar>(), pcounterpathelements.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), dwflags)

public actual fun PdhParseCounterPathW(szfullpathbuffer: PCWSTR, pcounterpathelements: Long, pdwbuffersize: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhParseCounterPathW(szfullpathbuffer.toCPointer<ByteVar>(), pcounterpathelements.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), dwflags)

public actual fun PdhParseInstanceNameA(szinstancestring: PCSTR, szinstancename: PSTR, pcchinstancenamelength: Long, szparentname: PSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhParseInstanceNameA(szinstancestring.toCPointer<ByteVar>(), szinstancename.toCPointer<ByteVar>(), pcchinstancenamelength.toCPointer<ByteVar>(), szparentname.toCPointer<ByteVar>(), pcchparentnamelength.toCPointer<ByteVar>(), lpindex.toCPointer<ByteVar>())

public actual fun PdhParseInstanceNameW(szinstancestring: PCWSTR, szinstancename: PWSTR, pcchinstancenamelength: Long, szparentname: PWSTR, pcchparentnamelength: Long, lpindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhParseInstanceNameW(szinstancestring.toCPointer<ByteVar>(), szinstancename.toCPointer<ByteVar>(), pcchinstancenamelength.toCPointer<ByteVar>(), szparentname.toCPointer<ByteVar>(), pcchparentnamelength.toCPointer<ByteVar>(), lpindex.toCPointer<ByteVar>())

public actual fun PdhReadRawLogRecord(hlog: PDH_HLOG, ftrecord: FILETIME, prawlogrecord: Long, pdwbufferlength: Long): UInt =
    0u

public actual fun PdhRemoveCounter(hcounter: PDH_HCOUNTER): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhRemoveCounter(hcounter.toCPointer<ByteVar>())

public actual fun PdhSelectDataSourceA(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PSTR, pcchbufferlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhSelectDataSourceA(hwndowner.toCPointer<ByteVar>(), dwflags, szdatasource.toCPointer<ByteVar>(), pcchbufferlength.toCPointer<ByteVar>())

public actual fun PdhSelectDataSourceW(hwndowner: HWND, dwflags: PDH_SELECT_DATA_SOURCE_FLAGS, szdatasource: PWSTR, pcchbufferlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhSelectDataSourceW(hwndowner.toCPointer<ByteVar>(), dwflags, szdatasource.toCPointer<ByteVar>(), pcchbufferlength.toCPointer<ByteVar>())

public actual fun PdhSetCounterScaleFactor(hcounter: PDH_HCOUNTER, lfactor: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhSetCounterScaleFactor(hcounter.toCPointer<ByteVar>(), lfactor)

public actual fun PdhSetDefaultRealTimeDataSource(dwdatasourceid: REAL_TIME_DATA_SOURCE_ID_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhSetDefaultRealTimeDataSource(dwdatasourceid)

public actual fun PdhSetLogSetRunID(hlog: PDH_HLOG, runid: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhSetLogSetRunID(hlog.toCPointer<ByteVar>(), runid)

public actual fun PdhSetQueryTimeRange(hquery: PDH_HQUERY, pinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhSetQueryTimeRange(hquery.toCPointer<ByteVar>(), pinfo.toCPointer<ByteVar>())

public actual fun PdhUpdateLogA(hlog: PDH_HLOG, szuserstring: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhUpdateLogA(hlog.toCPointer<ByteVar>(), szuserstring.toCPointer<ByteVar>())

public actual fun PdhUpdateLogFileCatalog(hlog: PDH_HLOG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhUpdateLogFileCatalog(hlog.toCPointer<ByteVar>())

public actual fun PdhUpdateLogW(hlog: PDH_HLOG, szuserstring: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhUpdateLogW(hlog.toCPointer<ByteVar>(), szuserstring.toCPointer<ByteVar>())

public actual fun PdhValidatePathA(szfullpathbuffer: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhValidatePathA(szfullpathbuffer.toCPointer<ByteVar>())

public actual fun PdhValidatePathExA(hdatasource: PDH_HLOG, szfullpathbuffer: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhValidatePathExA(hdatasource.toCPointer<ByteVar>(), szfullpathbuffer.toCPointer<ByteVar>())

public actual fun PdhValidatePathExW(hdatasource: PDH_HLOG, szfullpathbuffer: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhValidatePathExW(hdatasource.toCPointer<ByteVar>(), szfullpathbuffer.toCPointer<ByteVar>())

public actual fun PdhValidatePathW(szfullpathbuffer: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhValidatePathW(szfullpathbuffer.toCPointer<ByteVar>())

public actual fun PdhVerifySQLDBA(szdatasource: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhVerifySQLDBA(szdatasource.toCPointer<ByteVar>())

public actual fun PdhVerifySQLDBW(szdatasource: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PdhVerifySQLDBW(szdatasource.toCPointer<ByteVar>())

public actual fun PerfAddCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfAddCounters(hquery.toCPointer<ByteVar>(), pcounters.toCPointer<ByteVar>(), cbcounters)

public actual fun PerfCloseQueryHandle(hquery: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfCloseQueryHandle(hquery.toCPointer<ByteVar>())

public actual fun PerfCreateInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfCreateInstance(providerhandle.toCPointer<ByteVar>(), countersetguid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), id)?.toLong() ?: 0L

public actual fun PerfDecrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfDecrementULongCounterValue(provider.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>(), counterid, value)

public actual fun PerfDecrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfDecrementULongLongCounterValue(provider.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>(), counterid, value)

public actual fun PerfDeleteCounters(hquery: HANDLE, pcounters: Long, cbcounters: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfDeleteCounters(hquery.toCPointer<ByteVar>(), pcounters.toCPointer<ByteVar>(), cbcounters)

public actual fun PerfDeleteInstance(provider: HANDLE, instanceblock: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfDeleteInstance(provider.toCPointer<ByteVar>(), instanceblock.toCPointer<ByteVar>())

public actual fun PerfEnumerateCounterSet(szmachine: PCWSTR, pcountersetids: Long, ccountersetids: UInt, pccountersetidsactual: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfEnumerateCounterSet(szmachine.toCPointer<ByteVar>(), pcountersetids.toCPointer<ByteVar>(), ccountersetids, pccountersetidsactual.toCPointer<ByteVar>())

public actual fun PerfEnumerateCounterSetInstances(szmachine: PCWSTR, pcountersetid: Long, pinstances: Long, cbinstances: UInt, pcbinstancesactual: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfEnumerateCounterSetInstances(szmachine.toCPointer<ByteVar>(), pcountersetid.toCPointer<ByteVar>(), pinstances.toCPointer<ByteVar>(), cbinstances, pcbinstancesactual.toCPointer<ByteVar>())

public actual fun PerfIncrementULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfIncrementULongCounterValue(provider.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>(), counterid, value)

public actual fun PerfIncrementULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfIncrementULongLongCounterValue(provider.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>(), counterid, value)

public actual fun PerfOpenQueryHandle(szmachine: PCWSTR, phquery: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfOpenQueryHandle(szmachine.toCPointer<ByteVar>(), phquery.toCPointer<ByteVar>())

public actual fun PerfQueryCounterData(hquery: HANDLE, pcounterblock: Long, cbcounterblock: UInt, pcbcounterblockactual: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfQueryCounterData(hquery.toCPointer<ByteVar>(), pcounterblock.toCPointer<ByteVar>(), cbcounterblock, pcbcounterblockactual.toCPointer<ByteVar>())

public actual fun PerfQueryCounterInfo(hquery: HANDLE, pcounters: Long, cbcounters: UInt, pcbcountersactual: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfQueryCounterInfo(hquery.toCPointer<ByteVar>(), pcounters.toCPointer<ByteVar>(), cbcounters, pcbcountersactual.toCPointer<ByteVar>())

public actual fun PerfQueryCounterSetRegistrationInfo(szmachine: PCWSTR, pcountersetid: Long, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: Long, cbreginfo: UInt, pcbreginfoactual: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfQueryCounterSetRegistrationInfo(szmachine.toCPointer<ByteVar>(), pcountersetid.toCPointer<ByteVar>(), requestcode, requestlangid, pbreginfo.toCPointer<ByteVar>(), cbreginfo, pcbreginfoactual.toCPointer<ByteVar>())

public actual fun PerfQueryInstance(providerhandle: HANDLE, countersetguid: Long, name: PCWSTR, id: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfQueryInstance(providerhandle.toCPointer<ByteVar>(), countersetguid.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), id)?.toLong() ?: 0L

public actual fun PerfSetCounterRefValue(provider: HANDLE, instance: Long, counterid: UInt, address: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfSetCounterRefValue(provider.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>(), counterid, address.toCPointer<ByteVar>())

public actual fun PerfSetCounterSetInfo(providerhandle: HANDLE, template: Long, templatesize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfSetCounterSetInfo(providerhandle.toCPointer<ByteVar>(), template.toCPointer<ByteVar>(), templatesize)

public actual fun PerfSetULongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfSetULongCounterValue(provider.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>(), counterid, value)

public actual fun PerfSetULongLongCounterValue(provider: HANDLE, instance: Long, counterid: UInt, value: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfSetULongLongCounterValue(provider.toCPointer<ByteVar>(), instance.toCPointer<ByteVar>(), counterid, value)

public actual fun PerfStartProvider(providerguid: Long, controlcallback: PERFLIBREQUEST, phprovider: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfStartProvider(providerguid.toCPointer<ByteVar>(), controlcallback.toLong().toCPointer<ByteVar>(), phprovider.toCPointer<ByteVar>())

public actual fun PerfStartProviderEx(providerguid: Long, providercontext: Long, provider: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfStartProviderEx(providerguid.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>(), provider.toCPointer<ByteVar>())

public actual fun PerfStopProvider(providerhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_PerfStopProvider(providerhandle.toCPointer<ByteVar>())

public actual fun QueryPerformanceCounter(lpperformancecount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_QueryPerformanceCounter(lpperformancecount.toCPointer<ByteVar>())

public actual fun QueryPerformanceFrequency(lpfrequency: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_QueryPerformanceFrequency(lpfrequency.toCPointer<ByteVar>())

public actual fun RestorePerfRegistryFromFileW(szfilename: PCWSTR, szlangid: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_RestorePerfRegistryFromFileW(szfilename.toCPointer<ByteVar>(), szlangid.toCPointer<ByteVar>())

public actual fun SetServiceAsTrustedA(szreserved: PCSTR, szservicename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_SetServiceAsTrustedA(szreserved.toCPointer<ByteVar>(), szservicename.toCPointer<ByteVar>())

public actual fun SetServiceAsTrustedW(szreserved: PCWSTR, szservicename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_SetServiceAsTrustedW(szreserved.toCPointer<ByteVar>(), szservicename.toCPointer<ByteVar>())

public actual fun UnloadPerfCounterTextStringsA(lpcommandline: PCSTR, bquietmodearg: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsA(lpcommandline.toCPointer<ByteVar>(), bquietmodearg)

public actual fun UnloadPerfCounterTextStringsW(lpcommandline: PCWSTR, bquietmodearg: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_UnloadPerfCounterTextStringsW(lpcommandline.toCPointer<ByteVar>(), bquietmodearg)

public actual fun UpdatePerfNameFilesA(sznewctrfilepath: PCSTR, sznewhlpfilepath: PCSTR, szlanguageid: PCSTR, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_UpdatePerfNameFilesA(sznewctrfilepath.toCPointer<ByteVar>(), sznewhlpfilepath.toCPointer<ByteVar>(), szlanguageid.toCPointer<ByteVar>(), dwflags)

public actual fun UpdatePerfNameFilesW(sznewctrfilepath: PCWSTR, sznewhlpfilepath: PCWSTR, szlanguageid: PCWSTR, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_UpdatePerfNameFilesW(sznewctrfilepath.toCPointer<ByteVar>(), sznewhlpfilepath.toCPointer<ByteVar>(), szlanguageid.toCPointer<ByteVar>(), dwflags)
