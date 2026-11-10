@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_backupPerfRegistryToFileW(szfilename?.value?.toCPointer<ByteVar>(), szcommentstring?.value?.toCPointer<ByteVar>())

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_installPerfDllA(szcomputername?.value?.toCPointer<ByteVar>(), lpinifile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_installPerfDllW(szcomputername?.value?.toCPointer<ByteVar>(), lpinifile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_loadPerfCounterTextStringsA(lpcommandline?.value?.toCPointer<ByteVar>(), bquietmodearg)

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_loadPerfCounterTextStringsW(lpcommandline?.value?.toCPointer<ByteVar>(), bquietmodearg)

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhAddCounterA(hquery?.value?.toCPointer<ByteVar>(), szfullcounterpath?.value?.toCPointer<ByteVar>(), dwuserdata, phcounter?.value?.toCPointer<ByteVar>())

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhAddCounterW(hquery?.value?.toCPointer<ByteVar>(), szfullcounterpath?.value?.toCPointer<ByteVar>(), dwuserdata, phcounter?.value?.toCPointer<ByteVar>())

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhAddEnglishCounterA(hquery?.value?.toCPointer<ByteVar>(), szfullcounterpath?.value?.toCPointer<ByteVar>(), dwuserdata, phcounter?.value?.toCPointer<ByteVar>())

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhAddEnglishCounterW(hquery?.value?.toCPointer<ByteVar>(), szfullcounterpath?.value?.toCPointer<ByteVar>(), dwuserdata, phcounter?.value?.toCPointer<ByteVar>())

public actual fun pdhBindInputDataSourceA(phdatasource: COpaquePointer?, logfilenamelist: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhBindInputDataSourceA(phdatasource?.value?.toCPointer<ByteVar>(), logfilenamelist?.value?.toCPointer<ByteVar>())

public actual fun pdhBindInputDataSourceW(phdatasource: COpaquePointer?, logfilenamelist: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhBindInputDataSourceW(phdatasource?.value?.toCPointer<ByteVar>(), logfilenamelist?.value?.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersA(pbrowsedlgdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhBrowseCountersA(pbrowsedlgdata?.value?.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhBrowseCountersHA(pbrowsedlgdata?.value?.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhBrowseCountersHW(pbrowsedlgdata?.value?.toCPointer<ByteVar>())

public actual fun pdhBrowseCountersW(pbrowsedlgdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhBrowseCountersW(pbrowsedlgdata?.value?.toCPointer<ByteVar>())

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: COpaquePointer?, rawvalue2: COpaquePointer?, fmtvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCalculateCounterFromRawValue(hcounter?.value?.toCPointer<ByteVar>(), dwformat, rawvalue1?.value?.toCPointer<ByteVar>(), rawvalue2?.value?.toCPointer<ByteVar>(), fmtvalue?.value?.toCPointer<ByteVar>())

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCloseLog(hlog?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCloseQuery(hquery?.value?.toCPointer<ByteVar>())

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCollectQueryData(hquery?.value?.toCPointer<ByteVar>())

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCollectQueryDataEx(hquery?.value?.toCPointer<ByteVar>(), dwintervaltime, hnewdataevent?.value?.toCPointer<ByteVar>())

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCollectQueryDataWithTime(hquery?.value?.toCPointer<ByteVar>(), plltimestamp?.value?.toCPointer<ByteVar>())

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: COpaquePointer?, data: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhComputeCounterStatistics(hcounter?.value?.toCPointer<ByteVar>(), dwformat, dwfirstentry, dwnumentries, lprawvaluearray?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhConnectMachineA(szmachinename?.value?.toCPointer<ByteVar>())

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhConnectMachineW(szmachinename?.value?.toCPointer<ByteVar>())

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCreateSQLTablesA(szdatasource?.value?.toCPointer<ByteVar>())

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhCreateSQLTablesW(szdatasource?.value?.toCPointer<ByteVar>())

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumLogSetNamesA(szdatasource?.value?.toCPointer<ByteVar>(), mszdatasetnamelist?.value?.toCPointer<ByteVar>(), pcchbufferlength?.value?.toCPointer<ByteVar>())

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumLogSetNamesW(szdatasource?.value?.toCPointer<ByteVar>(), mszdatasetnamelist?.value?.toCPointer<ByteVar>(), pcchbufferlength?.value?.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumMachinesA(szdatasource?.value?.toCPointer<ByteVar>(), mszmachinelist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumMachinesHA(hdatasource?.value?.toCPointer<ByteVar>(), mszmachinelist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumMachinesHW(hdatasource?.value?.toCPointer<ByteVar>(), mszmachinelist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumMachinesW(szdatasource?.value?.toCPointer<ByteVar>(), mszmachinelist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectItemsA(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), mszcounterlist?.value?.toCPointer<ByteVar>(), pcchcounterlistlength?.value?.toCPointer<ByteVar>(), mszinstancelist?.value?.toCPointer<ByteVar>(), pcchinstancelistlength?.value?.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectItemsHA(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), mszcounterlist?.value?.toCPointer<ByteVar>(), pcchcounterlistlength?.value?.toCPointer<ByteVar>(), mszinstancelist?.value?.toCPointer<ByteVar>(), pcchinstancelistlength?.value?.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectItemsHW(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), mszcounterlist?.value?.toCPointer<ByteVar>(), pcchcounterlistlength?.value?.toCPointer<ByteVar>(), mszinstancelist?.value?.toCPointer<ByteVar>(), pcchinstancelistlength?.value?.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectItemsW(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), mszcounterlist?.value?.toCPointer<ByteVar>(), pcchcounterlistlength?.value?.toCPointer<ByteVar>(), mszinstancelist?.value?.toCPointer<ByteVar>(), pcchinstancelistlength?.value?.toCPointer<ByteVar>(), dwdetaillevel, dwflags)

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectsA(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), mszobjectlist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectsHA(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), mszobjectlist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectsHW(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), mszobjectlist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhEnumObjectsW(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), mszobjectlist?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>(), dwdetaillevel, brefresh)

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhExpandCounterPathA(szwildcardpath?.value?.toCPointer<ByteVar>(), mszexpandedpathlist?.value?.toCPointer<ByteVar>(), pcchpathlistlength?.value?.toCPointer<ByteVar>())

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhExpandCounterPathW(szwildcardpath?.value?.toCPointer<ByteVar>(), mszexpandedpathlist?.value?.toCPointer<ByteVar>(), pcchpathlistlength?.value?.toCPointer<ByteVar>())

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhExpandWildCardPathA(szdatasource?.value?.toCPointer<ByteVar>(), szwildcardpath?.value?.toCPointer<ByteVar>(), mszexpandedpathlist?.value?.toCPointer<ByteVar>(), pcchpathlistlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhExpandWildCardPathHA(hdatasource?.value?.toCPointer<ByteVar>(), szwildcardpath?.value?.toCPointer<ByteVar>(), mszexpandedpathlist?.value?.toCPointer<ByteVar>(), pcchpathlistlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhExpandWildCardPathHW(hdatasource?.value?.toCPointer<ByteVar>(), szwildcardpath?.value?.toCPointer<ByteVar>(), mszexpandedpathlist?.value?.toCPointer<ByteVar>(), pcchpathlistlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhExpandWildCardPathW(szdatasource?.value?.toCPointer<ByteVar>(), szwildcardpath?.value?.toCPointer<ByteVar>(), mszexpandedpathlist?.value?.toCPointer<ByteVar>(), pcchpathlistlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: COpaquePointer?, prawvalue1: COpaquePointer?, prawvalue2: COpaquePointer?, pfmtvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhFormatFromRawValue(dwcountertype, dwformat, ptimebase?.value?.toCPointer<ByteVar>(), prawvalue1?.value?.toCPointer<ByteVar>(), prawvalue2?.value?.toCPointer<ByteVar>(), pfmtvalue?.value?.toCPointer<ByteVar>())

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetCounterInfoA(hcounter?.value?.toCPointer<ByteVar>(), bretrieveexplaintext, pdwbuffersize?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetCounterInfoW(hcounter?.value?.toCPointer<ByteVar>(), bretrieveexplaintext, pdwbuffersize?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetCounterTimeBase(hcounter?.value?.toCPointer<ByteVar>(), ptimebase?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeA(szdatasource?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>(), pinfo?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeH(hdatasource?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>(), pinfo?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeW(szdatasource?.value?.toCPointer<ByteVar>(), pdwnumentries?.value?.toCPointer<ByteVar>(), pinfo?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterA(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), szdefaultcountername?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHA(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), szdefaultcountername?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHW(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), szdefaultcountername?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterW(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szobjectname?.value?.toCPointer<ByteVar>(), szdefaultcountername?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectA(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szdefaultobjectname?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHA(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szdefaultobjectname?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHW(hdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szdefaultobjectname?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectW(szdatasource?.value?.toCPointer<ByteVar>(), szmachinename?.value?.toCPointer<ByteVar>(), szdefaultobjectname?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetDllVersion(lpdwversion: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetDllVersion(lpdwversion?.value?.toCPointer<ByteVar>())

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayA(hcounter?.value?.toCPointer<ByteVar>(), dwformat, lpdwbuffersize?.value?.toCPointer<ByteVar>(), lpdwitemcount?.value?.toCPointer<ByteVar>(), itembuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayW(hcounter?.value?.toCPointer<ByteVar>(), dwformat, lpdwbuffersize?.value?.toCPointer<ByteVar>(), lpdwitemcount?.value?.toCPointer<ByteVar>(), itembuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetFormattedCounterValue(hcounter?.value?.toCPointer<ByteVar>(), dwformat, lpdwtype?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>())

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetLogFileSize(hlog?.value?.toCPointer<ByteVar>(), llsize?.value?.toCPointer<ByteVar>())

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: COpaquePointer?, prunid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetLogSetGUID(hlog?.value?.toCPointer<ByteVar>(), pguid?.value?.toCPointer<ByteVar>(), prunid?.value?.toCPointer<ByteVar>())

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetRawCounterArrayA(hcounter?.value?.toCPointer<ByteVar>(), lpdwbuffersize?.value?.toCPointer<ByteVar>(), lpdwitemcount?.value?.toCPointer<ByteVar>(), itembuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetRawCounterArrayW(hcounter?.value?.toCPointer<ByteVar>(), lpdwbuffersize?.value?.toCPointer<ByteVar>(), lpdwitemcount?.value?.toCPointer<ByteVar>(), itembuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhGetRawCounterValue(hcounter?.value?.toCPointer<ByteVar>(), lpdwtype?.value?.toCPointer<ByteVar>(), pvalue?.value?.toCPointer<ByteVar>())

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhIsRealTimeQuery(hquery?.value?.toCPointer<ByteVar>())

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameA(szmachinename?.value?.toCPointer<ByteVar>(), sznamebuffer?.value?.toCPointer<ByteVar>(), pdwindex?.value?.toCPointer<ByteVar>())

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameW(szmachinename?.value?.toCPointer<ByteVar>(), sznamebuffer?.value?.toCPointer<ByteVar>(), pdwindex?.value?.toCPointer<ByteVar>())

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexA(szmachinename?.value?.toCPointer<ByteVar>(), dwnameindex, sznamebuffer?.value?.toCPointer<ByteVar>(), pcchnamebuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexW(szmachinename?.value?.toCPointer<ByteVar>(), dwnameindex, sznamebuffer?.value?.toCPointer<ByteVar>(), pcchnamebuffersize?.value?.toCPointer<ByteVar>())

public actual fun pdhMakeCounterPathA(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhMakeCounterPathA(pcounterpathelements?.value?.toCPointer<ByteVar>(), szfullpathbuffer?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhMakeCounterPathW(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pwstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhMakeCounterPathW(pcounterpathelements?.value?.toCPointer<ByteVar>(), szfullpathbuffer?.value?.toCPointer<ByteVar>(), pcchbuffersize?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhOpenLogA(szlogfilename?.value?.toCPointer<ByteVar>(), dwaccessflags, lpdwlogtype?.value?.toCPointer<ByteVar>(), hquery?.value?.toCPointer<ByteVar>(), dwmaxsize, szusercaption?.value?.toCPointer<ByteVar>(), phlog?.value?.toCPointer<ByteVar>())

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhOpenLogW(szlogfilename?.value?.toCPointer<ByteVar>(), dwaccessflags, lpdwlogtype?.value?.toCPointer<ByteVar>(), hquery?.value?.toCPointer<ByteVar>(), dwmaxsize, szusercaption?.value?.toCPointer<ByteVar>(), phlog?.value?.toCPointer<ByteVar>())

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhOpenQueryA(szdatasource?.value?.toCPointer<ByteVar>(), dwuserdata, phquery?.value?.toCPointer<ByteVar>())

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhOpenQueryH(hdatasource?.value?.toCPointer<ByteVar>(), dwuserdata, phquery?.value?.toCPointer<ByteVar>())

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhOpenQueryW(szdatasource?.value?.toCPointer<ByteVar>(), dwuserdata, phquery?.value?.toCPointer<ByteVar>())

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhParseCounterPathA(szfullpathbuffer?.value?.toCPointer<ByteVar>(), pcounterpathelements?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhParseCounterPathW(szfullpathbuffer?.value?.toCPointer<ByteVar>(), pcounterpathelements?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhParseInstanceNameA(szinstancestring?.value?.toCPointer<ByteVar>(), szinstancename?.value?.toCPointer<ByteVar>(), pcchinstancenamelength?.value?.toCPointer<ByteVar>(), szparentname?.value?.toCPointer<ByteVar>(), pcchparentnamelength?.value?.toCPointer<ByteVar>(), lpindex?.value?.toCPointer<ByteVar>())

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pwstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhParseInstanceNameW(szinstancestring?.value?.toCPointer<ByteVar>(), szinstancename?.value?.toCPointer<ByteVar>(), pcchinstancenamelength?.value?.toCPointer<ByteVar>(), szparentname?.value?.toCPointer<ByteVar>(), pcchparentnamelength?.value?.toCPointer<ByteVar>(), lpindex?.value?.toCPointer<ByteVar>())

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: COpaquePointer?, pdwbufferlength: COpaquePointer?): UInt =
    0u

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhRemoveCounter(hcounter?.value?.toCPointer<ByteVar>())

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhSelectDataSourceA(hwndowner?.value?.toCPointer<ByteVar>(), dwflags, szdatasource?.value?.toCPointer<ByteVar>(), pcchbufferlength?.value?.toCPointer<ByteVar>())

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhSelectDataSourceW(hwndowner?.value?.toCPointer<ByteVar>(), dwflags, szdatasource?.value?.toCPointer<ByteVar>(), pcchbufferlength?.value?.toCPointer<ByteVar>())

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhSetCounterScaleFactor(hcounter?.value?.toCPointer<ByteVar>(), lfactor)

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhSetDefaultRealTimeDataSource(dwdatasourceid)

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhSetLogSetRunID(hlog?.value?.toCPointer<ByteVar>(), runid)

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhSetQueryTimeRange(hquery?.value?.toCPointer<ByteVar>(), pinfo?.value?.toCPointer<ByteVar>())

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhUpdateLogA(hlog?.value?.toCPointer<ByteVar>(), szuserstring?.value?.toCPointer<ByteVar>())

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhUpdateLogFileCatalog(hlog?.value?.toCPointer<ByteVar>())

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhUpdateLogW(hlog?.value?.toCPointer<ByteVar>(), szuserstring?.value?.toCPointer<ByteVar>())

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhValidatePathA(szfullpathbuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhValidatePathExA(hdatasource?.value?.toCPointer<ByteVar>(), szfullpathbuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhValidatePathExW(hdatasource?.value?.toCPointer<ByteVar>(), szfullpathbuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhValidatePathW(szfullpathbuffer?.value?.toCPointer<ByteVar>())

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhVerifySQLDBA(szdatasource?.value?.toCPointer<ByteVar>())

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_pdhVerifySQLDBW(szdatasource?.value?.toCPointer<ByteVar>())

public actual fun perfAddCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfAddCounters(hquery?.value?.toCPointer<ByteVar>(), pcounters?.value?.toCPointer<ByteVar>(), cbcounters)

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfCloseQueryHandle(hquery?.value?.toCPointer<ByteVar>())

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfCreateInstance(providerhandle?.value?.toCPointer<ByteVar>(), countersetguid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), id)?.let { COpaquePointer(it.toLong()) }

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfDecrementULongCounterValue(provider?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>(), counterid, value)

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfDecrementULongLongCounterValue(provider?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>(), counterid, value)

public actual fun perfDeleteCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfDeleteCounters(hquery?.value?.toCPointer<ByteVar>(), pcounters?.value?.toCPointer<ByteVar>(), cbcounters)

public actual fun perfDeleteInstance(provider: Handle, instanceblock: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfDeleteInstance(provider?.value?.toCPointer<ByteVar>(), instanceblock?.value?.toCPointer<ByteVar>())

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: COpaquePointer?, ccountersetids: UInt, pccountersetidsactual: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfEnumerateCounterSet(szmachine?.value?.toCPointer<ByteVar>(), pcountersetids?.value?.toCPointer<ByteVar>(), ccountersetids, pccountersetidsactual?.value?.toCPointer<ByteVar>())

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: COpaquePointer?, pinstances: COpaquePointer?, cbinstances: UInt, pcbinstancesactual: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfEnumerateCounterSetInstances(szmachine?.value?.toCPointer<ByteVar>(), pcountersetid?.value?.toCPointer<ByteVar>(), pinstances?.value?.toCPointer<ByteVar>(), cbinstances, pcbinstancesactual?.value?.toCPointer<ByteVar>())

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfIncrementULongCounterValue(provider?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>(), counterid, value)

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfIncrementULongLongCounterValue(provider?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>(), counterid, value)

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfOpenQueryHandle(szmachine?.value?.toCPointer<ByteVar>(), phquery?.value?.toCPointer<ByteVar>())

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: COpaquePointer?, cbcounterblock: UInt, pcbcounterblockactual: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfQueryCounterData(hquery?.value?.toCPointer<ByteVar>(), pcounterblock?.value?.toCPointer<ByteVar>(), cbcounterblock, pcbcounterblockactual?.value?.toCPointer<ByteVar>())

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt, pcbcountersactual: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfQueryCounterInfo(hquery?.value?.toCPointer<ByteVar>(), pcounters?.value?.toCPointer<ByteVar>(), cbcounters, pcbcountersactual?.value?.toCPointer<ByteVar>())

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: COpaquePointer?, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: COpaquePointer?, cbreginfo: UInt, pcbreginfoactual: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfQueryCounterSetRegistrationInfo(szmachine?.value?.toCPointer<ByteVar>(), pcountersetid?.value?.toCPointer<ByteVar>(), requestcode, requestlangid, pbreginfo?.value?.toCPointer<ByteVar>(), cbreginfo, pcbreginfoactual?.value?.toCPointer<ByteVar>())

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfQueryInstance(providerhandle?.value?.toCPointer<ByteVar>(), countersetguid?.value?.toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), id)?.let { COpaquePointer(it.toLong()) }

public actual fun perfSetCounterRefValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, address: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfSetCounterRefValue(provider?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>(), counterid, address?.value?.toCPointer<ByteVar>())

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: COpaquePointer?, templatesize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfSetCounterSetInfo(providerhandle?.value?.toCPointer<ByteVar>(), template?.value?.toCPointer<ByteVar>(), templatesize)

public actual fun perfSetULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfSetULongCounterValue(provider?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>(), counterid, value)

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfSetULongLongCounterValue(provider?.value?.toCPointer<ByteVar>(), instance?.value?.toCPointer<ByteVar>(), counterid, value)

public actual fun perfStartProvider(providerguid: COpaquePointer?, controlcallback: Perflibrequest, phprovider: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfStartProvider(providerguid?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), phprovider?.value?.toCPointer<ByteVar>())

public actual fun perfStartProviderEx(providerguid: COpaquePointer?, providercontext: COpaquePointer?, provider: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfStartProviderEx(providerguid?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>(), provider?.value?.toCPointer<ByteVar>())

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_perfStopProvider(providerhandle?.value?.toCPointer<ByteVar>())

public actual fun queryPerformanceCounter(lpperformancecount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_queryPerformanceCounter(lpperformancecount?.value?.toCPointer<ByteVar>())

public actual fun queryPerformanceFrequency(lpfrequency: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_queryPerformanceFrequency(lpfrequency?.value?.toCPointer<ByteVar>())

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_restorePerfRegistryFromFileW(szfilename?.value?.toCPointer<ByteVar>(), szlangid?.value?.toCPointer<ByteVar>())

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_setServiceAsTrustedA(szreserved?.value?.toCPointer<ByteVar>(), szservicename?.value?.toCPointer<ByteVar>())

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_setServiceAsTrustedW(szreserved?.value?.toCPointer<ByteVar>(), szservicename?.value?.toCPointer<ByteVar>())

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsA(lpcommandline?.value?.toCPointer<ByteVar>(), bquietmodearg)

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsW(lpcommandline?.value?.toCPointer<ByteVar>(), bquietmodearg)

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_updatePerfNameFilesA(sznewctrfilepath?.value?.toCPointer<ByteVar>(), sznewhlpfilepath?.value?.toCPointer<ByteVar>(), szlanguageid?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.performance.cinterop.windowssys_windows_win32_system_performance_updatePerfNameFilesW(sznewctrfilepath?.value?.toCPointer<ByteVar>(), sznewhlpfilepath?.value?.toCPointer<ByteVar>(), szlanguageid?.value?.toCPointer<ByteVar>(), dwflags)
