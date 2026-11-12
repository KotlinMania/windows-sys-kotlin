@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemPerformanceNapiAddon(): Boolean

private val windowsWin32SystemPerformanceNapiAvailable: Boolean = initWindowsWin32SystemPerformanceNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceInstallPerfDllA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceInstallPerfDllA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceInstallPerfDllW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceInstallPerfDllW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhAddCounterA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhAddCounterA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhAddCounterW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhAddCounterW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhBrowseCountersA(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhBrowseCountersW(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCloseLog(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCloseLog(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCloseQuery(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCloseQuery(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCollectQueryData(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCollectQueryData(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhConnectMachineA(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhConnectMachineA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhConnectMachineW(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhConnectMachineW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumMachinesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumMachinesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectsA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhEnumObjectsW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetDllVersion(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetDllVersion(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetLogFileSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetLogFileSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhOpenLogA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhOpenLogA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhOpenLogW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhOpenLogW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhOpenQueryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhOpenQueryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhOpenQueryH(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhOpenQueryH(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhOpenQueryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhOpenQueryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhParseCounterPathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhParseCounterPathA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhParseCounterPathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhParseCounterPathW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhRemoveCounter(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhRemoveCounter(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhUpdateLogA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhUpdateLogA(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhUpdateLogW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhUpdateLogW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhValidatePathA(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathA(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhValidatePathExA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathExA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhValidatePathExW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathExW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhValidatePathW(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfAddCounters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfAddCounters(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfCreateInstance(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfCreateInstance(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfDeleteCounters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfDeleteCounters(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfDeleteInstance(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfDeleteInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfQueryCounterData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfQueryCounterData(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfQueryInstance(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfQueryInstance(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfStartProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfStartProvider(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfStartProviderEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfStartProviderEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformancePerfStopProvider(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformancePerfStopProvider(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(p0)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(p0: String, p1: String, p2: String, p3: String): Int

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceBackupPerfRegistryToFileW(szfilename.rawAddress.toString(), szcommentstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceInstallPerfDllA(szcomputername.rawAddress.toString(), lpinifile.rawAddress.toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceInstallPerfDllW(szcomputername.rawAddress.toString(), lpinifile.rawAddress.toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsA(lpcommandline.rawAddress.toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceLoadPerfCounterTextStringsW(lpcommandline.rawAddress.toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhAddCounterA(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhAddCounterW(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhAddEnglishCounterA(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: MutPtr<PdhHcounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhAddEnglishCounterW(hquery.rawAddress.toString(), szfullcounterpath.rawAddress.toString(), dwuserdata.toString(), phcounter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBindInputDataSourceA(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhBindInputDataSourceA(phdatasource.rawAddress.toString(), logfilenamelist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBindInputDataSourceW(phdatasource: MutPtr<PdhHlog>, logfilenamelist: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhBindInputDataSourceW(phdatasource.rawAddress.toString(), logfilenamelist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigA>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersA(pbrowsedlgdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHa>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersHA(pbrowsedlgdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigHw>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersHW(pbrowsedlgdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersW(pbrowsedlgdata: ConstPtr<PdhBrowseDlgConfigW>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhBrowseCountersW(pbrowsedlgdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: ConstPtr<PdhRawCounter>, rawvalue2: ConstPtr<PdhRawCounter>, fmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCalculateCounterFromRawValue(hcounter.rawAddress.toString(), dwformat.toInt(), rawvalue1.rawAddress.toString(), rawvalue2.rawAddress.toString(), fmtvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCloseLog(hlog.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCloseQuery(hquery.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCollectQueryData(hquery.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCollectQueryDataEx(hquery.rawAddress.toString(), dwintervaltime.toInt(), hnewdataevent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: MutPtr<Long>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCollectQueryDataWithTime(hquery.rawAddress.toString(), plltimestamp.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: ConstPtr<PdhRawCounter>, data: MutPtr<PdhStatistics>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhComputeCounterStatistics(hcounter.rawAddress.toString(), dwformat.toInt(), dwfirstentry.toInt(), dwnumentries.toInt(), lprawvaluearray.rawAddress.toString(), data.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhConnectMachineA(szmachinename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhConnectMachineW(szmachinename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCreateSQLTablesA(szdatasource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhCreateSQLTablesW(szdatasource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesA(szdatasource.rawAddress.toString(), mszdatasetnamelist.rawAddress.toString(), pcchbufferlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumLogSetNamesW(szdatasource.rawAddress.toString(), mszdatasetnamelist.rawAddress.toString(), pcchbufferlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesA(szdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesHA(hdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesHW(hdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumMachinesW(szdatasource.rawAddress.toString(), mszmachinelist.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: MutPtr<UInt>, mszinstancelist: Pwstr, pcchinstancelistlength: MutPtr<UInt>, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectItemsW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), mszcounterlist.rawAddress.toString(), pcchcounterlistlength.rawAddress.toString(), mszinstancelist.rawAddress.toString(), pcchinstancelistlength.rawAddress.toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: MutPtr<UInt>, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhEnumObjectsW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), mszobjectlist.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhExpandCounterPathA(szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhExpandCounterPathW(szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathA(szdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHA(hdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathHW(hdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhExpandWildCardPathW(szdatasource.rawAddress.toString(), szwildcardpath.rawAddress.toString(), mszexpandedpathlist.rawAddress.toString(), pcchpathlistlength.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: ConstPtr<Long>, prawvalue1: ConstPtr<PdhRawCounter>, prawvalue2: ConstPtr<PdhRawCounter>, pfmtvalue: MutPtr<PdhFmtCountervalue>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhFormatFromRawValue(dwcountertype.toInt(), dwformat.toInt(), ptimebase.rawAddress.toString(), prawvalue1.rawAddress.toString(), prawvalue2.rawAddress.toString(), pfmtvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoA>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetCounterInfoA(hcounter.rawAddress.toString(), bretrieveexplaintext, pdwbuffersize.rawAddress.toString(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: MutPtr<UInt>, lpbuffer: MutPtr<PdhCounterInfoW>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetCounterInfoW(hcounter.rawAddress.toString(), bretrieveexplaintext, pdwbuffersize.rawAddress.toString(), lpbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: MutPtr<Long>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetCounterTimeBase(hcounter.rawAddress.toString(), ptimebase.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeA(szdatasource.rawAddress.toString(), pdwnumentries.rawAddress.toString(), pinfo.rawAddress.toString(), pdwbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeH(hdatasource.rawAddress.toString(), pdwnumentries.rawAddress.toString(), pinfo.rawAddress.toString(), pdwbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: MutPtr<UInt>, pinfo: MutPtr<PdhTimeInfo>, pdwbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDataSourceTimeRangeW(szdatasource.rawAddress.toString(), pdwnumentries.rawAddress.toString(), pinfo.rawAddress.toString(), pdwbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfCounterW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szobjectname.rawAddress.toString(), szdefaultcountername.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectA(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHA(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectHW(hdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDefaultPerfObjectW(szdatasource.rawAddress.toString(), szmachinename.rawAddress.toString(), szdefaultobjectname.rawAddress.toString(), pcchbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDllVersion(lpdwversion: MutPtr<PdhDllVersion>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetDllVersion(lpdwversion.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemA>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayA(hcounter.rawAddress.toString(), dwformat.toInt(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhFmtCountervalueItemW>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetFormattedCounterArrayW(hcounter.rawAddress.toString(), dwformat.toInt(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhFmtCountervalue>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetFormattedCounterValue(hcounter.rawAddress.toString(), dwformat.toInt(), lpdwtype.rawAddress.toString(), pvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: MutPtr<Long>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetLogFileSize(hlog.rawAddress.toString(), llsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: MutPtr<Guid>, prunid: MutPtr<Int>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetLogSetGUID(hlog.rawAddress.toString(), pguid.rawAddress.toString(), prunid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemA>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayA(hcounter.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: MutPtr<UInt>, lpdwitemcount: MutPtr<UInt>, itembuffer: MutPtr<PdhRawCounterItemW>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetRawCounterArrayW(hcounter.rawAddress.toString(), lpdwbuffersize.rawAddress.toString(), lpdwitemcount.rawAddress.toString(), itembuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: MutPtr<UInt>, pvalue: MutPtr<PdhRawCounter>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhGetRawCounterValue(hcounter.rawAddress.toString(), lpdwtype.rawAddress.toString(), pvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhIsRealTimeQuery(hquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameA(szmachinename.rawAddress.toString(), sznamebuffer.rawAddress.toString(), pdwindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfIndexByNameW(szmachinename.rawAddress.toString(), sznamebuffer.rawAddress.toString(), pdwindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexA(szmachinename.rawAddress.toString(), dwnameindex.toInt(), sznamebuffer.rawAddress.toString(), pcchnamebuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhLookupPerfNameByIndexW(szmachinename.rawAddress.toString(), dwnameindex.toInt(), sznamebuffer.rawAddress.toString(), pcchnamebuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhMakeCounterPathA(pcounterpathelements: ConstPtr<PdhCounterPathElementsA>, szfullpathbuffer: Pstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhMakeCounterPathA(pcounterpathelements.rawAddress.toString(), szfullpathbuffer.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhMakeCounterPathW(pcounterpathelements: ConstPtr<PdhCounterPathElementsW>, szfullpathbuffer: Pwstr, pcchbuffersize: MutPtr<UInt>, dwflags: PdhPathFlags): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhMakeCounterPathW(pcounterpathelements.rawAddress.toString(), szfullpathbuffer.rawAddress.toString(), pcchbuffersize.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: MutPtr<PdhHlog>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhOpenLogA(szlogfilename.rawAddress.toString(), dwaccessflags.toInt(), lpdwlogtype.rawAddress.toString(), hquery.rawAddress.toString(), dwmaxsize.toInt(), szusercaption.rawAddress.toString(), phlog.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: MutPtr<PdhLogType>, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: MutPtr<PdhHlog>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhOpenLogW(szlogfilename.rawAddress.toString(), dwaccessflags.toInt(), lpdwlogtype.rawAddress.toString(), hquery.rawAddress.toString(), dwmaxsize.toInt(), szusercaption.rawAddress.toString(), phlog.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhOpenQueryA(szdatasource.rawAddress.toString(), dwuserdata.toString(), phquery.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhOpenQueryH(hdatasource.rawAddress.toString(), dwuserdata.toString(), phquery.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: MutPtr<PdhHquery>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhOpenQueryW(szdatasource.rawAddress.toString(), dwuserdata.toString(), phquery.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: MutPtr<PdhCounterPathElementsA>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhParseCounterPathA(szfullpathbuffer.rawAddress.toString(), pcounterpathelements.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: MutPtr<PdhCounterPathElementsW>, pdwbuffersize: MutPtr<UInt>, dwflags: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhParseCounterPathW(szfullpathbuffer.rawAddress.toString(), pcounterpathelements.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhParseInstanceNameA(szinstancestring.rawAddress.toString(), szinstancename.rawAddress.toString(), pcchinstancenamelength.rawAddress.toString(), szparentname.rawAddress.toString(), pcchparentnamelength.rawAddress.toString(), lpindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: MutPtr<UInt>, szparentname: Pwstr, pcchparentnamelength: MutPtr<UInt>, lpindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhParseInstanceNameW(szinstancestring.rawAddress.toString(), szinstancename.rawAddress.toString(), pcchinstancenamelength.rawAddress.toString(), szparentname.rawAddress.toString(), pcchparentnamelength.rawAddress.toString(), lpindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: MutPtr<PdhRawLogRecord>, pdwbufferlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhRemoveCounter(hcounter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhSelectDataSourceA(hwndowner.rawAddress.toString(), dwflags.toInt(), szdatasource.rawAddress.toString(), pcchbufferlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhSelectDataSourceW(hwndowner.rawAddress.toString(), dwflags.toInt(), szdatasource.rawAddress.toString(), pcchbufferlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhSetCounterScaleFactor(hcounter.rawAddress.toString(), lfactor).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhSetLogSetRunID(hlog.rawAddress.toString(), runid).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: ConstPtr<PdhTimeInfo>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhSetQueryTimeRange(hquery.rawAddress.toString(), pinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhUpdateLogA(hlog.rawAddress.toString(), szuserstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhUpdateLogFileCatalog(hlog.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhUpdateLogW(hlog.rawAddress.toString(), szuserstring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathA(szfullpathbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathExA(hdatasource.rawAddress.toString(), szfullpathbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathExW(hdatasource.rawAddress.toString(), szfullpathbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhValidatePathW(szfullpathbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhVerifySQLDBA(szdatasource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePdhVerifySQLDBW(szdatasource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfAddCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfAddCounters(hquery.rawAddress.toString(), pcounters.rawAddress.toString(), cbcounters.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfCloseQueryHandle(hquery.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    if (windowsWin32SystemPerformanceNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemPerformancePerfCreateInstance(providerhandle.rawAddress.toString(), countersetguid.rawAddress.toString(), name.rawAddress.toString(), id.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfDecrementULongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfDecrementULongLongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDeleteCounters(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfDeleteCounters(hquery.rawAddress.toString(), pcounters.rawAddress.toString(), cbcounters.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDeleteInstance(provider: Handle, instanceblock: ConstPtr<PerfCountersetInstance>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfDeleteInstance(provider.rawAddress.toString(), instanceblock.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: MutPtr<Guid>, ccountersetids: UInt, pccountersetidsactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfEnumerateCounterSet(szmachine.rawAddress.toString(), pcountersetids.rawAddress.toString(), ccountersetids.toInt(), pccountersetidsactual.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, pinstances: MutPtr<PerfInstanceHeader>, cbinstances: UInt, pcbinstancesactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfEnumerateCounterSetInstances(szmachine.rawAddress.toString(), pcountersetid.rawAddress.toString(), pinstances.rawAddress.toString(), cbinstances.toInt(), pcbinstancesactual.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfIncrementULongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfIncrementULongLongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: MutPtr<Handle>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfOpenQueryHandle(szmachine.rawAddress.toString(), phquery.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: MutPtr<PerfDataHeader>, cbcounterblock: UInt, pcbcounterblockactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfQueryCounterData(hquery.rawAddress.toString(), pcounterblock.rawAddress.toString(), cbcounterblock.toInt(), pcbcounterblockactual.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: MutPtr<PerfCounterIdentifier>, cbcounters: UInt, pcbcountersactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfQueryCounterInfo(hquery.rawAddress.toString(), pcounters.rawAddress.toString(), cbcounters.toInt(), pcbcountersactual.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: ConstPtr<Guid>, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: MutPtr<UByte>, cbreginfo: UInt, pcbreginfoactual: MutPtr<UInt>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfQueryCounterSetRegistrationInfo(szmachine.rawAddress.toString(), pcountersetid.rawAddress.toString(), requestcode, requestlangid.toInt(), pbreginfo.rawAddress.toString(), cbreginfo.toInt(), pcbreginfoactual.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: ConstPtr<Guid>, name: Pcwstr, id: UInt): MutPtr<PerfCountersetInstance> =
    if (windowsWin32SystemPerformanceNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemPerformancePerfQueryInstance(providerhandle.rawAddress.toString(), countersetguid.rawAddress.toString(), name.rawAddress.toString(), id.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetCounterRefValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, address: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfSetCounterRefValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), address.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: MutPtr<PerfCountersetInfo>, templatesize: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfSetCounterSetInfo(providerhandle.rawAddress.toString(), template.rawAddress.toString(), templatesize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetULongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: UInt): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfSetULongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: MutPtr<PerfCountersetInstance>, counterid: UInt, value: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfSetULongLongCounterValue(provider.rawAddress.toString(), instance.rawAddress.toString(), counterid.toInt(), value.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStartProvider(providerguid: ConstPtr<Guid>, controlcallback: Perflibrequest, phprovider: MutPtr<Handle>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfStartProvider(providerguid.rawAddress.toString(), 0L.toString(), phprovider.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStartProviderEx(providerguid: ConstPtr<Guid>, providercontext: ConstPtr<PerfProviderContext>, provider: MutPtr<Handle>): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfStartProviderEx(providerguid.rawAddress.toString(), providercontext.rawAddress.toString(), provider.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformancePerfStopProvider(providerhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPerformanceCounter(lpperformancecount: MutPtr<Long>): Bool =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceQueryPerformanceCounter(lpperformancecount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPerformanceFrequency(lpfrequency: MutPtr<Long>): Bool =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceQueryPerformanceFrequency(lpfrequency.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceRestorePerfRegistryFromFileW(szfilename.rawAddress.toString(), szlangid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceSetServiceAsTrustedA(szreserved.rawAddress.toString(), szservicename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceSetServiceAsTrustedW(szreserved.rawAddress.toString(), szservicename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsA(lpcommandline.rawAddress.toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceUnloadPerfCounterTextStringsW(lpcommandline.rawAddress.toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesA(sznewctrfilepath.rawAddress.toString(), sznewhlpfilepath.rawAddress.toString(), szlanguageid.rawAddress.toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    if (windowsWin32SystemPerformanceNapiAvailable) wasmWindowssysWindowsWin32SystemPerformanceUpdatePerfNameFilesW(sznewctrfilepath.rawAddress.toString(), sznewhlpfilepath.rawAddress.toString(), szlanguageid.rawAddress.toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
