@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemPerformanceNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(szfilename.rawAddress.toString(), szcommentstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceInstallPerfDllA(szcomputername.rawAddress.toString(), lpinifile.rawAddress.toString(), dwflags.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceInstallPerfDllW(szcomputername.rawAddress.toString(), lpinifile.rawAddress.toString(), dwflags.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(lpcommandline.rawAddress.toString(), bquietmodearg) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(lpcommandline.rawAddress.toString(), bquietmodearg) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhAddCounterA(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhAddCounterW(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBindInputDataSourceA(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(phdatasource.rawAddress.toString(), logfilenamelist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBindInputDataSourceW(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(phdatasource.rawAddress.toString(), logfilenamelist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigA>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhBrowseCountersA(pbrowsedlgdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHa>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(pbrowsedlgdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHw>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(pbrowsedlgdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigW>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhBrowseCountersW(pbrowsedlgdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: ConstPtr<PdhRawCounter>, rawvalue2: ConstPtr<PdhRawCounter>, fmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(hcounter.rawAddress.toString(), dwformat.toInt(), rawvalue1.rawAddress.toString(), rawvalue2.rawAddress.toString(), fmtvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCloseLog(hlog.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCloseQuery(hquery.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCollectQueryData(hquery.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(hquery.rawAddress.toString(), dwintervaltime.toInt(), hnewdataevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: MutPtr<Long>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(hquery.rawAddress.toString(), plltimestamp.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: ConstPtr<PdhRawCounter>, data: MutPtr<PdhStatistics>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(hcounter.rawAddress.toString(), dwformat.toInt(), dwfirstentry.toInt(), dwnumentries.toInt(), lprawvaluearray.rawAddress.toString(), data.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhConnectMachineA(szmachinename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhConnectMachineW(szmachinename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(szdatasource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(szdatasource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(szdatasource.rawAddress.toString(), mszdatasetnamelist.rawAddress.toString(), pcchbufferlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(szdatasource.rawAddress.toString(), mszdatasetnamelist.rawAddress.toString(), pcchbufferlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumMachinesA(szdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(hdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(hdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumMachinesW(szdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectsA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhEnumObjectsW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(szdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(hdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(hdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(szdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: ConstPtr<Long>, prawvalue1: ConstPtr<PdhRawCounter>, prawvalue2: ConstPtr<PdhRawCounter>, pfmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(dwcountertype.toInt(), dwformat.toInt(), ptimebase.rawAddress.toString(), prawvalue1.rawAddress.toString(), prawvalue2.rawAddress.toString(), pfmtvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoA>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(hcounter.rawAddress.toString(), bretrieveexplaintext, pdwbuffersize.rawAddress.toString(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoW>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(hcounter.rawAddress.toString(), bretrieveexplaintext, pdwbuffersize.rawAddress.toString(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: MutPtr<Long>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(hcounter.rawAddress.toString(), ptimebase.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(szdatasource.rawAddress.toString(), pdwnumentries.rawAddress.toString(), pinfo.rawAddress.toString(), pdwbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(hdatasource.rawAddress.toString(), pdwnumentries.rawAddress.toString(), pinfo.rawAddress.toString(), pdwbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(szdatasource.rawAddress.toString(), pdwnumentries.rawAddress.toString(), pinfo.rawAddress.toString(), pdwbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDllVersion(lpdwversion: MutPtr<PdhDllVersion>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetDllVersion(lpdwversion.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemA>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(hcounter.rawAddress.toString(), dwformat.toInt(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemW>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(hcounter.rawAddress.toString(), dwformat.toInt(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhFmtCountervalue>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(hcounter.rawAddress.toString(), dwformat.toInt(), lpdwtype.rawAddress.toString(), pvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: MutPtr<Long>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetLogFileSize(hlog.rawAddress.toString(), llsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: MutPtr<Guid>, prunid: MutPtr<Int>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(hlog.rawAddress.toString(), pguid.rawAddress.toString(), prunid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemA>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(hcounter.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemW>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(hcounter.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhRawCounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(hcounter.rawAddress.toString(), lpdwtype.rawAddress.toString(), pvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(hquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(szmachinename.rawAddress.toString(), sznamebuffer.rawAddress.toString(), pdwindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(szmachinename.rawAddress.toString(), sznamebuffer.rawAddress.toString(), pdwindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(szmachinename.rawAddress.toString(), dwnameindex.toInt(), sznamebuffer.rawAddress.toString(), pcchnamebuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(szmachinename.rawAddress.toString(), dwnameindex.toInt(), sznamebuffer.rawAddress.toString(), pcchnamebuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhMakeCounterPathA(pcounterpathelements: ConstPtr<PdhCounterPathElementsA>, szfullpathbuffer: Pstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(pcounterpathelements.rawAddress.toString(), szfullpathbuffer.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhMakeCounterPathW(pcounterpathelements: ConstPtr<PdhCounterPathElementsW>, szfullpathbuffer: Pwstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(pcounterpathelements.rawAddress.toString(), szfullpathbuffer.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: MutPtr<PdhHlog>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhOpenLogA(szlogfilename.rawAddress.toString(), dwaccessflags.toInt(), lpdwlogtype.rawAddress.toString(), hquery.rawAddress.toString(), dwmaxsize.toInt(), szusercaption.rawAddress.toString(), phlog.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: MutPtr<PdhHlog>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhOpenLogW(szlogfilename.rawAddress.toString(), dwaccessflags.toInt(), lpdwlogtype.rawAddress.toString(), hquery.rawAddress.toString(), dwmaxsize.toInt(), szusercaption.rawAddress.toString(), phlog.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhOpenQueryA(szdatasource.rawAddress.toString(), dwuserdata.toString(), phquery.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhOpenQueryH(hdatasource.rawAddress.toString(), dwuserdata.toString(), phquery.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhOpenQueryW(szdatasource.rawAddress.toString(), dwuserdata.toString(), phquery.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: MutPtr<PdhCounterPathElementsA>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhParseCounterPathA(szfullpathbuffer.rawAddress.toString(), pcounterpathelements.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: MutPtr<PdhCounterPathElementsW>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhParseCounterPathW(szfullpathbuffer.rawAddress.toString(), pcounterpathelements.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(szinstancestring.rawAddress.toString(), szinstancename.rawAddress.toString(), pcchinstancenamelength.rawAddress.toString(), szparentname.rawAddress.toString(), pcchparentnamelength.rawAddress.toString(), lpindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pwstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(szinstancestring.rawAddress.toString(), szinstancename.rawAddress.toString(), pcchinstancenamelength.rawAddress.toString(), szparentname.rawAddress.toString(), pcchparentnamelength.rawAddress.toString(), lpindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: MutPtr<PdhRawLogRecord>, pdwbufferlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhRemoveCounter(hcounter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(hwndowner.rawAddress.toString(), dwflags.toInt(), szdatasource.rawAddress.toString(), pcchbufferlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(hwndowner.rawAddress.toString(), dwflags.toInt(), szdatasource.rawAddress.toString(), pcchbufferlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(hcounter.rawAddress.toString(), lfactor) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(hlog.rawAddress.toString(), runid) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: ConstPtr<PdhTimeInfo>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(hquery.rawAddress.toString(), pinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhUpdateLogA(hlog.rawAddress.toString(), szuserstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(hlog.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhUpdateLogW(hlog.rawAddress.toString(), szuserstring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhValidatePathA(szfullpathbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhValidatePathExA(hdatasource.rawAddress.toString(), szfullpathbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhValidatePathExW(hdatasource.rawAddress.toString(), szfullpathbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhValidatePathW(szfullpathbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(szdatasource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(szdatasource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfAddCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfAddCounters(hquery.rawAddress.toString(), pcounters.rawAddress.toString(), cbcounters.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(hquery.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    if (windowsWin32SystemPerformanceNapiAddon != null) MutPtr((windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfCreateInstance(providerhandle.rawAddress.toString(), countersetguid.rawAddress.toString(), name.rawAddress.toString(), id.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDeleteCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfDeleteCounters(hquery.rawAddress.toString(), pcounters.rawAddress.toString(), cbcounters.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDeleteInstance(provider: Handle, instanceblock: ConstPtr<PerfCountersetInstance>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfDeleteInstance(provider.rawAddress.toString(), instanceblock.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: MutPtr<Guid>, ccountersetids: UInt, pccountersetidsactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(szmachine.rawAddress.toString(), pcountersetids.rawAddress.toString(), ccountersetids.toInt(), pccountersetidsactual.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, pinstances: MutPtr<PerfInstanceHeader>, cbinstances: UInt, pcbinstancesactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(szmachine.rawAddress.toString(), pcountersetid.rawAddress.toString(), pinstances.rawAddress.toString(), cbinstances.toInt(), pcbinstancesactual.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: MutPtr<Handle>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(szmachine.rawAddress.toString(), phquery.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: MutPtr<PerfDataHeader>, cbcounterblock: UInt, pcbcounterblockactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfQueryCounterData(hquery.rawAddress.toString(), pcounterblock.rawAddress.toString(), cbcounterblock.toInt(), pcbcounterblockactual.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt, pcbcountersactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(hquery.rawAddress.toString(), pcounters.rawAddress.toString(), cbcounters.toInt(), pcbcountersactual.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: MutPtr<UByte>, cbreginfo: UInt, pcbreginfoactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(szmachine.rawAddress.toString(), pcountersetid.rawAddress.toString(), requestcode, requestlangid.toInt(), pbreginfo.rawAddress.toString(), cbreginfo.toInt(), pcbreginfoactual.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    if (windowsWin32SystemPerformanceNapiAddon != null) MutPtr((windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfQueryInstance(providerhandle.rawAddress.toString(), countersetguid.rawAddress.toString(), name.rawAddress.toString(), id.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetCounterRefValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, address: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), address.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: MutPtr<PerfCountersetInfo>, templatesize: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(providerhandle.rawAddress.toString(), template.rawAddress.toString(), templatesize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStartProvider(providerguid: ConstPtr<Guid>, controlcallback: Perflibrequest, phprovider: MutPtr<Handle>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfStartProvider(providerguid.rawAddress.toString(), 0L.toString(), phprovider.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStartProviderEx(providerguid: ConstPtr<Guid>, providercontext: ConstPtr<PerfProviderContext>, provider: MutPtr<Handle>): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfStartProviderEx(providerguid.rawAddress.toString(), providercontext.rawAddress.toString(), provider.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformancePerfStopProvider(providerhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPerformanceCounter(lpperformancecount: MutPtr<Long>): Bool =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(lpperformancecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPerformanceFrequency(lpfrequency: MutPtr<Long>): Bool =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(lpfrequency.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(szfilename.rawAddress.toString(), szlangid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(szreserved.rawAddress.toString(), szservicename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(szreserved.rawAddress.toString(), szservicename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(lpcommandline.rawAddress.toString(), bquietmodearg) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(lpcommandline.rawAddress.toString(), bquietmodearg) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(sznewctrfilepath.rawAddress.toString(), sznewhlpfilepath.rawAddress.toString(), szlanguageid.rawAddress.toString(), dwflags.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAddon != null) (windowsWin32SystemPerformanceNapiAddon.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(sznewctrfilepath.rawAddress.toString(), sznewhlpfilepath.rawAddress.toString(), szlanguageid.rawAddress.toString(), dwflags.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
