@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemPerformanceNapiAddon(): Boolean

private val _windowsWin32SystemPerformanceNapiAvailable: Boolean = _initWindowsWin32SystemPerformanceNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_backupPerfRegistryToFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_backupPerfRegistryToFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_installPerfDllA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_installPerfDllA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_installPerfDllW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_installPerfDllW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_loadPerfCounterTextStringsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_loadPerfCounterTextStringsA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_loadPerfCounterTextStringsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_loadPerfCounterTextStringsW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhAddCounterA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhAddCounterA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhAddCounterW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhAddCounterW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhAddEnglishCounterA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhAddEnglishCounterA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhAddEnglishCounterW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhAddEnglishCounterW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhBindInputDataSourceA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhBindInputDataSourceA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhBindInputDataSourceW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhBindInputDataSourceW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhBrowseCountersA(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhBrowseCountersHA(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersHA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhBrowseCountersHW(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersHW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhBrowseCountersW(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCalculateCounterFromRawValue(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCalculateCounterFromRawValue(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCloseLog(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCloseLog(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCloseQuery(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCloseQuery(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCollectQueryData(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCollectQueryData(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCollectQueryDataEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCollectQueryDataEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCollectQueryDataWithTime(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCollectQueryDataWithTime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhComputeCounterStatistics(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhComputeCounterStatistics(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhConnectMachineA(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhConnectMachineA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhConnectMachineW(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhConnectMachineW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCreateSQLTablesA(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCreateSQLTablesA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhCreateSQLTablesW(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhCreateSQLTablesW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumLogSetNamesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumLogSetNamesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumLogSetNamesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumLogSetNamesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumMachinesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumMachinesHA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesHA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumMachinesHW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesHW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumMachinesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectItemsA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectItemsHA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsHA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectItemsHW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsHW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectItemsW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectsA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectsHA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsHA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectsHW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsHW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhEnumObjectsW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhExpandCounterPathA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhExpandCounterPathA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhExpandCounterPathW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhExpandCounterPathW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhExpandWildCardPathA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhExpandWildCardPathHA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathHA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhExpandWildCardPathHW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathHW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhExpandWildCardPathW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhFormatFromRawValue(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhFormatFromRawValue(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetCounterInfoA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetCounterInfoA(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetCounterInfoW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetCounterInfoW(p0: String, p1: Boolean, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetCounterTimeBase(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetCounterTimeBase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeH(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeH(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetDllVersion(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetDllVersion(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetFormattedCounterValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetFormattedCounterValue(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetLogFileSize(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetLogFileSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetLogSetGUID(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetLogSetGUID(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetRawCounterArrayA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetRawCounterArrayA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetRawCounterArrayW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetRawCounterArrayW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhGetRawCounterValue(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhGetRawCounterValue(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhIsRealTimeQuery(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhIsRealTimeQuery(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhMakeCounterPathA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhMakeCounterPathA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhMakeCounterPathW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhMakeCounterPathW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhOpenLogA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhOpenLogA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhOpenLogW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhOpenLogW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhOpenQueryA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhOpenQueryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhOpenQueryH(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhOpenQueryH(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhOpenQueryW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhOpenQueryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhParseCounterPathA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhParseCounterPathA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhParseCounterPathW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhParseCounterPathW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhParseInstanceNameA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhParseInstanceNameA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhParseInstanceNameW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhParseInstanceNameW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhRemoveCounter(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhRemoveCounter(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhSelectDataSourceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhSelectDataSourceA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhSelectDataSourceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhSelectDataSourceW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhSetCounterScaleFactor(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhSetCounterScaleFactor(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhSetDefaultRealTimeDataSource(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhSetDefaultRealTimeDataSource(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhSetLogSetRunID(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhSetLogSetRunID(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhSetQueryTimeRange(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhSetQueryTimeRange(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhUpdateLogA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhUpdateLogA(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhUpdateLogFileCatalog(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhUpdateLogFileCatalog(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhUpdateLogW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhUpdateLogW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhValidatePathA(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhValidatePathA(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhValidatePathExA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhValidatePathExA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhValidatePathExW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhValidatePathExW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhValidatePathW(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhValidatePathW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhVerifySQLDBA(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhVerifySQLDBA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_pdhVerifySQLDBW(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_pdhVerifySQLDBW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfAddCounters(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfAddCounters(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfCloseQueryHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfCloseQueryHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfCreateInstance(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfCreateInstance(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfDecrementULongCounterValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfDecrementULongCounterValue(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfDecrementULongLongCounterValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfDecrementULongLongCounterValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfDeleteCounters(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfDeleteCounters(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfDeleteInstance(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfDeleteInstance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfEnumerateCounterSet(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfEnumerateCounterSet(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfEnumerateCounterSetInstances(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfEnumerateCounterSetInstances(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfIncrementULongCounterValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfIncrementULongCounterValue(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfIncrementULongLongCounterValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfIncrementULongLongCounterValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfOpenQueryHandle(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfOpenQueryHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfQueryCounterData(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfQueryCounterData(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfQueryCounterInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfQueryCounterInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfQueryCounterSetRegistrationInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfQueryCounterSetRegistrationInfo(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfQueryInstance(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfQueryInstance(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfSetCounterRefValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfSetCounterRefValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfSetCounterSetInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfSetCounterSetInfo(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfSetULongCounterValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfSetULongCounterValue(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfSetULongLongCounterValue(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfSetULongLongCounterValue(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfStartProvider(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfStartProvider(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfStartProviderEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfStartProviderEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_perfStopProvider(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_perfStopProvider(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_queryPerformanceCounter(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_queryPerformanceCounter(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_queryPerformanceFrequency(p0)")
private external fun _wasm_windowssys_windows_win32_system_performance_queryPerformanceFrequency(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_restorePerfRegistryFromFileW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_restorePerfRegistryFromFileW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_setServiceAsTrustedA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_setServiceAsTrustedA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_setServiceAsTrustedW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_setServiceAsTrustedW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_updatePerfNameFilesA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_updatePerfNameFilesA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_performance_updatePerfNameFilesW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_performance_updatePerfNameFilesW(p0: String, p1: String, p2: String, p3: String): Int

public actual fun backupPerfRegistryToFileW(szfilename: Pcwstr, szcommentstring: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_backupPerfRegistryToFileW((szfilename?.value ?: 0L).toString(), (szcommentstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPerfDllA(szcomputername: Pcstr, lpinifile: Pcstr, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_installPerfDllA((szcomputername?.value ?: 0L).toString(), (lpinifile?.value ?: 0L).toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installPerfDllW(szcomputername: Pcwstr, lpinifile: Pcwstr, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_installPerfDllW((szcomputername?.value ?: 0L).toString(), (lpinifile?.value ?: 0L).toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_loadPerfCounterTextStringsA((lpcommandline?.value ?: 0L).toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_loadPerfCounterTextStringsW((lpcommandline?.value ?: 0L).toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhAddCounterA((hquery?.value ?: 0L).toString(), (szfullcounterpath?.value ?: 0L).toString(), dwuserdata.toString(), (phcounter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhAddCounterW((hquery?.value ?: 0L).toString(), (szfullcounterpath?.value ?: 0L).toString(), dwuserdata.toString(), (phcounter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddEnglishCounterA(hquery: PdhHquery, szfullcounterpath: Pcstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhAddEnglishCounterA((hquery?.value ?: 0L).toString(), (szfullcounterpath?.value ?: 0L).toString(), dwuserdata.toString(), (phcounter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhAddEnglishCounterW(hquery: PdhHquery, szfullcounterpath: Pcwstr, dwuserdata: ULong, phcounter: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhAddEnglishCounterW((hquery?.value ?: 0L).toString(), (szfullcounterpath?.value ?: 0L).toString(), dwuserdata.toString(), (phcounter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBindInputDataSourceA(phdatasource: COpaquePointer?, logfilenamelist: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhBindInputDataSourceA((phdatasource?.value ?: 0L).toString(), (logfilenamelist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBindInputDataSourceW(phdatasource: COpaquePointer?, logfilenamelist: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhBindInputDataSourceW((phdatasource?.value ?: 0L).toString(), (logfilenamelist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersA(pbrowsedlgdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersA((pbrowsedlgdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersHA(pbrowsedlgdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersHA((pbrowsedlgdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersHW(pbrowsedlgdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersHW((pbrowsedlgdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhBrowseCountersW(pbrowsedlgdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhBrowseCountersW((pbrowsedlgdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCalculateCounterFromRawValue(hcounter: PdhHcounter, dwformat: PdhFmt, rawvalue1: COpaquePointer?, rawvalue2: COpaquePointer?, fmtvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCalculateCounterFromRawValue((hcounter?.value ?: 0L).toString(), dwformat.toInt(), (rawvalue1?.value ?: 0L).toString(), (rawvalue2?.value ?: 0L).toString(), (fmtvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCloseLog(hlog: PdhHlog, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCloseLog((hlog?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCloseQuery(hquery: PdhHquery): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCloseQuery((hquery?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryData(hquery: PdhHquery): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCollectQueryData((hquery?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryDataEx(hquery: PdhHquery, dwintervaltime: UInt, hnewdataevent: Handle): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCollectQueryDataEx((hquery?.value ?: 0L).toString(), dwintervaltime.toInt(), (hnewdataevent?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCollectQueryDataWithTime(hquery: PdhHquery, plltimestamp: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCollectQueryDataWithTime((hquery?.value ?: 0L).toString(), (plltimestamp?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhComputeCounterStatistics(hcounter: PdhHcounter, dwformat: PdhFmt, dwfirstentry: UInt, dwnumentries: UInt, lprawvaluearray: COpaquePointer?, data: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhComputeCounterStatistics((hcounter?.value ?: 0L).toString(), dwformat.toInt(), dwfirstentry.toInt(), dwnumentries.toInt(), (lprawvaluearray?.value ?: 0L).toString(), (data?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhConnectMachineA(szmachinename: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhConnectMachineA((szmachinename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhConnectMachineW(szmachinename: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhConnectMachineW((szmachinename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCreateSQLTablesA(szdatasource: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCreateSQLTablesA((szdatasource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhCreateSQLTablesW(szdatasource: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhCreateSQLTablesW((szdatasource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumLogSetNamesA(szdatasource: Pcstr, mszdatasetnamelist: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumLogSetNamesA((szdatasource?.value ?: 0L).toString(), (mszdatasetnamelist?.value ?: 0L).toString(), (pcchbufferlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumLogSetNamesW(szdatasource: Pcwstr, mszdatasetnamelist: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumLogSetNamesW((szdatasource?.value ?: 0L).toString(), (mszdatasetnamelist?.value ?: 0L).toString(), (pcchbufferlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesA(szdatasource: Pcstr, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesA((szdatasource?.value ?: 0L).toString(), (mszmachinelist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesHA(hdatasource: PdhHlog, mszmachinelist: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesHA((hdatasource?.value ?: 0L).toString(), (mszmachinelist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesHW(hdatasource: PdhHlog, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesHW((hdatasource?.value ?: 0L).toString(), (mszmachinelist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumMachinesW(szdatasource: Pcwstr, mszmachinelist: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumMachinesW((szdatasource?.value ?: 0L).toString(), (mszmachinelist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsA((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (mszcounterlist?.value ?: 0L).toString(), (pcchcounterlistlength?.value ?: 0L).toString(), (mszinstancelist?.value ?: 0L).toString(), (pcchinstancelistlength?.value ?: 0L).toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, mszcounterlist: Pstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsHA((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (mszcounterlist?.value ?: 0L).toString(), (pcchcounterlistlength?.value ?: 0L).toString(), (mszinstancelist?.value ?: 0L).toString(), (pcchinstancelistlength?.value ?: 0L).toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsHW((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (mszcounterlist?.value ?: 0L).toString(), (pcchcounterlistlength?.value ?: 0L).toString(), (mszinstancelist?.value ?: 0L).toString(), (pcchinstancelistlength?.value ?: 0L).toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectItemsW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, mszcounterlist: Pwstr, pcchcounterlistlength: COpaquePointer?, mszinstancelist: Pwstr, pcchinstancelistlength: COpaquePointer?, dwdetaillevel: PerfDetail, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectItemsW((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (mszcounterlist?.value ?: 0L).toString(), (pcchcounterlistlength?.value ?: 0L).toString(), (mszinstancelist?.value ?: 0L).toString(), (pcchinstancelistlength?.value ?: 0L).toString(), dwdetaillevel.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsA(szdatasource: Pcstr, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsA((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (mszobjectlist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsHA(hdatasource: PdhHlog, szmachinename: Pcstr, mszobjectlist: Pstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsHA((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (mszobjectlist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsHW(hdatasource: PdhHlog, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsHW((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (mszobjectlist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhEnumObjectsW(szdatasource: Pcwstr, szmachinename: Pcwstr, mszobjectlist: Pwstr, pcchbuffersize: COpaquePointer?, dwdetaillevel: PerfDetail, brefresh: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhEnumObjectsW((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (mszobjectlist?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString(), dwdetaillevel.toInt(), brefresh).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandCounterPathA(szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhExpandCounterPathA((szwildcardpath?.value ?: 0L).toString(), (mszexpandedpathlist?.value ?: 0L).toString(), (pcchpathlistlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandCounterPathW(szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhExpandCounterPathW((szwildcardpath?.value ?: 0L).toString(), (mszexpandedpathlist?.value ?: 0L).toString(), (pcchpathlistlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathA(szdatasource: Pcstr, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathA((szdatasource?.value ?: 0L).toString(), (szwildcardpath?.value ?: 0L).toString(), (mszexpandedpathlist?.value ?: 0L).toString(), (pcchpathlistlength?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathHA(hdatasource: PdhHlog, szwildcardpath: Pcstr, mszexpandedpathlist: Pstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathHA((hdatasource?.value ?: 0L).toString(), (szwildcardpath?.value ?: 0L).toString(), (mszexpandedpathlist?.value ?: 0L).toString(), (pcchpathlistlength?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathHW(hdatasource: PdhHlog, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathHW((hdatasource?.value ?: 0L).toString(), (szwildcardpath?.value ?: 0L).toString(), (mszexpandedpathlist?.value ?: 0L).toString(), (pcchpathlistlength?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhExpandWildCardPathW(szdatasource: Pcwstr, szwildcardpath: Pcwstr, mszexpandedpathlist: Pwstr, pcchpathlistlength: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhExpandWildCardPathW((szdatasource?.value ?: 0L).toString(), (szwildcardpath?.value ?: 0L).toString(), (mszexpandedpathlist?.value ?: 0L).toString(), (pcchpathlistlength?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhFormatFromRawValue(dwcountertype: UInt, dwformat: PdhFmt, ptimebase: COpaquePointer?, prawvalue1: COpaquePointer?, prawvalue2: COpaquePointer?, pfmtvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhFormatFromRawValue(dwcountertype.toInt(), dwformat.toInt(), (ptimebase?.value ?: 0L).toString(), (prawvalue1?.value ?: 0L).toString(), (prawvalue2?.value ?: 0L).toString(), (pfmtvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterInfoA(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetCounterInfoA((hcounter?.value ?: 0L).toString(), bretrieveexplaintext, (pdwbuffersize?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterInfoW(hcounter: PdhHcounter, bretrieveexplaintext: Boolean, pdwbuffersize: COpaquePointer?, lpbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetCounterInfoW((hcounter?.value ?: 0L).toString(), bretrieveexplaintext, (pdwbuffersize?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetCounterTimeBase(hcounter: PdhHcounter, ptimebase: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetCounterTimeBase((hcounter?.value ?: 0L).toString(), (ptimebase?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeA(szdatasource: Pcstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeA((szdatasource?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString(), (pinfo?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeH(hdatasource: PdhHlog, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeH((hdatasource?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString(), (pinfo?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDataSourceTimeRangeW(szdatasource: Pcwstr, pdwnumentries: COpaquePointer?, pinfo: COpaquePointer?, pdwbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDataSourceTimeRangeW((szdatasource?.value ?: 0L).toString(), (pdwnumentries?.value ?: 0L).toString(), (pinfo?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterA(szdatasource: Pcstr, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterA((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (szdefaultcountername?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterHA(hdatasource: PdhHlog, szmachinename: Pcstr, szobjectname: Pcstr, szdefaultcountername: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHA((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (szdefaultcountername?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterHW((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (szdefaultcountername?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfCounterW(szdatasource: Pcwstr, szmachinename: Pcwstr, szobjectname: Pcwstr, szdefaultcountername: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfCounterW((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (szdefaultcountername?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectA(szdatasource: Pcstr, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectA((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szdefaultobjectname?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectHA(hdatasource: PdhHlog, szmachinename: Pcstr, szdefaultobjectname: Pstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHA((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szdefaultobjectname?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectHW(hdatasource: PdhHlog, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectHW((hdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szdefaultobjectname?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDefaultPerfObjectW(szdatasource: Pcwstr, szmachinename: Pcwstr, szdefaultobjectname: Pwstr, pcchbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDefaultPerfObjectW((szdatasource?.value ?: 0L).toString(), (szmachinename?.value ?: 0L).toString(), (szdefaultobjectname?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetDllVersion(lpdwversion: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetDllVersion((lpdwversion?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterArrayA(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayA((hcounter?.value ?: 0L).toString(), dwformat.toInt(), (lpdwbuffersize?.value ?: 0L).toString(), (lpdwitemcount?.value ?: 0L).toString(), (itembuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterArrayW(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetFormattedCounterArrayW((hcounter?.value ?: 0L).toString(), dwformat.toInt(), (lpdwbuffersize?.value ?: 0L).toString(), (lpdwitemcount?.value ?: 0L).toString(), (itembuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetFormattedCounterValue(hcounter: PdhHcounter, dwformat: PdhFmt, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetFormattedCounterValue((hcounter?.value ?: 0L).toString(), dwformat.toInt(), (lpdwtype?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetLogFileSize(hlog: PdhHlog, llsize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetLogFileSize((hlog?.value ?: 0L).toString(), (llsize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetLogSetGUID(hlog: PdhHlog, pguid: COpaquePointer?, prunid: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetLogSetGUID((hlog?.value ?: 0L).toString(), (pguid?.value ?: 0L).toString(), (prunid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterArrayA(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetRawCounterArrayA((hcounter?.value ?: 0L).toString(), (lpdwbuffersize?.value ?: 0L).toString(), (lpdwitemcount?.value ?: 0L).toString(), (itembuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterArrayW(hcounter: PdhHcounter, lpdwbuffersize: COpaquePointer?, lpdwitemcount: COpaquePointer?, itembuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetRawCounterArrayW((hcounter?.value ?: 0L).toString(), (lpdwbuffersize?.value ?: 0L).toString(), (lpdwitemcount?.value ?: 0L).toString(), (itembuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhGetRawCounterValue(hcounter: PdhHcounter, lpdwtype: COpaquePointer?, pvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhGetRawCounterValue((hcounter?.value ?: 0L).toString(), (lpdwtype?.value ?: 0L).toString(), (pvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhIsRealTimeQuery(hquery: PdhHquery): Bool =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhIsRealTimeQuery((hquery?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfIndexByNameA(szmachinename: Pcstr, sznamebuffer: Pcstr, pdwindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameA((szmachinename?.value ?: 0L).toString(), (sznamebuffer?.value ?: 0L).toString(), (pdwindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfIndexByNameW(szmachinename: Pcwstr, sznamebuffer: Pcwstr, pdwindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfIndexByNameW((szmachinename?.value ?: 0L).toString(), (sznamebuffer?.value ?: 0L).toString(), (pdwindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfNameByIndexA(szmachinename: Pcstr, dwnameindex: UInt, sznamebuffer: Pstr, pcchnamebuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexA((szmachinename?.value ?: 0L).toString(), dwnameindex.toInt(), (sznamebuffer?.value ?: 0L).toString(), (pcchnamebuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhLookupPerfNameByIndexW(szmachinename: Pcwstr, dwnameindex: UInt, sznamebuffer: Pwstr, pcchnamebuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhLookupPerfNameByIndexW((szmachinename?.value ?: 0L).toString(), dwnameindex.toInt(), (sznamebuffer?.value ?: 0L).toString(), (pcchnamebuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhMakeCounterPathA(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhMakeCounterPathA((pcounterpathelements?.value ?: 0L).toString(), (szfullpathbuffer?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhMakeCounterPathW(pcounterpathelements: COpaquePointer?, szfullpathbuffer: Pwstr, pcchbuffersize: COpaquePointer?, dwflags: PdhPathFlags): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhMakeCounterPathW((pcounterpathelements?.value ?: 0L).toString(), (szfullpathbuffer?.value ?: 0L).toString(), (pcchbuffersize?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenLogA(szlogfilename: Pcstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcstr, phlog: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhOpenLogA((szlogfilename?.value ?: 0L).toString(), dwaccessflags.toInt(), (lpdwlogtype?.value ?: 0L).toString(), (hquery?.value ?: 0L).toString(), dwmaxsize.toInt(), (szusercaption?.value ?: 0L).toString(), (phlog?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenLogW(szlogfilename: Pcwstr, dwaccessflags: PdhLog, lpdwlogtype: COpaquePointer?, hquery: PdhHquery, dwmaxsize: UInt, szusercaption: Pcwstr, phlog: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhOpenLogW((szlogfilename?.value ?: 0L).toString(), dwaccessflags.toInt(), (lpdwlogtype?.value ?: 0L).toString(), (hquery?.value ?: 0L).toString(), dwmaxsize.toInt(), (szusercaption?.value ?: 0L).toString(), (phlog?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryA(szdatasource: Pcstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhOpenQueryA((szdatasource?.value ?: 0L).toString(), dwuserdata.toString(), (phquery?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryH(hdatasource: PdhHlog, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhOpenQueryH((hdatasource?.value ?: 0L).toString(), dwuserdata.toString(), (phquery?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhOpenQueryW(szdatasource: Pcwstr, dwuserdata: ULong, phquery: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhOpenQueryW((szdatasource?.value ?: 0L).toString(), dwuserdata.toString(), (phquery?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseCounterPathA(szfullpathbuffer: Pcstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhParseCounterPathA((szfullpathbuffer?.value ?: 0L).toString(), (pcounterpathelements?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseCounterPathW(szfullpathbuffer: Pcwstr, pcounterpathelements: COpaquePointer?, pdwbuffersize: COpaquePointer?, dwflags: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhParseCounterPathW((szfullpathbuffer?.value ?: 0L).toString(), (pcounterpathelements?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseInstanceNameA(szinstancestring: Pcstr, szinstancename: Pstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhParseInstanceNameA((szinstancestring?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString(), (pcchinstancenamelength?.value ?: 0L).toString(), (szparentname?.value ?: 0L).toString(), (pcchparentnamelength?.value ?: 0L).toString(), (lpindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhParseInstanceNameW(szinstancestring: Pcwstr, szinstancename: Pwstr, pcchinstancenamelength: COpaquePointer?, szparentname: Pwstr, pcchparentnamelength: COpaquePointer?, lpindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhParseInstanceNameW((szinstancestring?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString(), (pcchinstancenamelength?.value ?: 0L).toString(), (szparentname?.value ?: 0L).toString(), (pcchparentnamelength?.value ?: 0L).toString(), (lpindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhReadRawLogRecord(hlog: PdhHlog, ftrecord: Filetime, prawlogrecord: COpaquePointer?, pdwbufferlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhRemoveCounter(hcounter: PdhHcounter): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhRemoveCounter((hcounter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSelectDataSourceA(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pstr, pcchbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhSelectDataSourceA((hwndowner?.value ?: 0L).toString(), dwflags.toInt(), (szdatasource?.value ?: 0L).toString(), (pcchbufferlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSelectDataSourceW(hwndowner: Hwnd, dwflags: PdhSelectDataSourceFlags, szdatasource: Pwstr, pcchbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhSelectDataSourceW((hwndowner?.value ?: 0L).toString(), dwflags.toInt(), (szdatasource?.value ?: 0L).toString(), (pcchbufferlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetCounterScaleFactor(hcounter: PdhHcounter, lfactor: Int): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhSetCounterScaleFactor((hcounter?.value ?: 0L).toString(), lfactor).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetDefaultRealTimeDataSource(dwdatasourceid: RealTimeDataSourceIdFlags): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhSetDefaultRealTimeDataSource(dwdatasourceid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetLogSetRunID(hlog: PdhHlog, runid: Int): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhSetLogSetRunID((hlog?.value ?: 0L).toString(), runid).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhSetQueryTimeRange(hquery: PdhHquery, pinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhSetQueryTimeRange((hquery?.value ?: 0L).toString(), (pinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogA(hlog: PdhHlog, szuserstring: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhUpdateLogA((hlog?.value ?: 0L).toString(), (szuserstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogFileCatalog(hlog: PdhHlog): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhUpdateLogFileCatalog((hlog?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhUpdateLogW(hlog: PdhHlog, szuserstring: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhUpdateLogW((hlog?.value ?: 0L).toString(), (szuserstring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathA(szfullpathbuffer: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhValidatePathA((szfullpathbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathExA(hdatasource: PdhHlog, szfullpathbuffer: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhValidatePathExA((hdatasource?.value ?: 0L).toString(), (szfullpathbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathExW(hdatasource: PdhHlog, szfullpathbuffer: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhValidatePathExW((hdatasource?.value ?: 0L).toString(), (szfullpathbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhValidatePathW(szfullpathbuffer: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhValidatePathW((szfullpathbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhVerifySQLDBA(szdatasource: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhVerifySQLDBA((szdatasource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pdhVerifySQLDBW(szdatasource: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_pdhVerifySQLDBW((szdatasource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfAddCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfAddCounters((hquery?.value ?: 0L).toString(), (pcounters?.value ?: 0L).toString(), cbcounters.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfCloseQueryHandle(hquery: Handle): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfCloseQueryHandle((hquery?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfCreateInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfCreateInstance((providerhandle?.value ?: 0L).toString(), (countersetguid?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), id.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDecrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfDecrementULongCounterValue((provider?.value ?: 0L).toString(), (instance?.value ?: 0L).toString(), counterid.toInt(), value.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDecrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfDecrementULongLongCounterValue((provider?.value ?: 0L).toString(), (instance?.value ?: 0L).toString(), counterid.toInt(), value.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDeleteCounters(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfDeleteCounters((hquery?.value ?: 0L).toString(), (pcounters?.value ?: 0L).toString(), cbcounters.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfDeleteInstance(provider: Handle, instanceblock: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfDeleteInstance((provider?.value ?: 0L).toString(), (instanceblock?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfEnumerateCounterSet(szmachine: Pcwstr, pcountersetids: COpaquePointer?, ccountersetids: UInt, pccountersetidsactual: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfEnumerateCounterSet((szmachine?.value ?: 0L).toString(), (pcountersetids?.value ?: 0L).toString(), ccountersetids.toInt(), (pccountersetidsactual?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfEnumerateCounterSetInstances(szmachine: Pcwstr, pcountersetid: COpaquePointer?, pinstances: COpaquePointer?, cbinstances: UInt, pcbinstancesactual: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfEnumerateCounterSetInstances((szmachine?.value ?: 0L).toString(), (pcountersetid?.value ?: 0L).toString(), (pinstances?.value ?: 0L).toString(), cbinstances.toInt(), (pcbinstancesactual?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfIncrementULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfIncrementULongCounterValue((provider?.value ?: 0L).toString(), (instance?.value ?: 0L).toString(), counterid.toInt(), value.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfIncrementULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfIncrementULongLongCounterValue((provider?.value ?: 0L).toString(), (instance?.value ?: 0L).toString(), counterid.toInt(), value.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfOpenQueryHandle(szmachine: Pcwstr, phquery: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfOpenQueryHandle((szmachine?.value ?: 0L).toString(), (phquery?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterData(hquery: Handle, pcounterblock: COpaquePointer?, cbcounterblock: UInt, pcbcounterblockactual: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfQueryCounterData((hquery?.value ?: 0L).toString(), (pcounterblock?.value ?: 0L).toString(), cbcounterblock.toInt(), (pcbcounterblockactual?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterInfo(hquery: Handle, pcounters: COpaquePointer?, cbcounters: UInt, pcbcountersactual: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfQueryCounterInfo((hquery?.value ?: 0L).toString(), (pcounters?.value ?: 0L).toString(), cbcounters.toInt(), (pcbcountersactual?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryCounterSetRegistrationInfo(szmachine: Pcwstr, pcountersetid: COpaquePointer?, requestcode: PerfRegInfoType, requestlangid: UInt, pbreginfo: COpaquePointer?, cbreginfo: UInt, pcbreginfoactual: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfQueryCounterSetRegistrationInfo((szmachine?.value ?: 0L).toString(), (pcountersetid?.value ?: 0L).toString(), requestcode, requestlangid.toInt(), (pbreginfo?.value ?: 0L).toString(), cbreginfo.toInt(), (pcbreginfoactual?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfQueryInstance(providerhandle: Handle, countersetguid: COpaquePointer?, name: Pcwstr, id: UInt): COpaquePointer? =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfQueryInstance((providerhandle?.value ?: 0L).toString(), (countersetguid?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), id.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetCounterRefValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, address: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfSetCounterRefValue((provider?.value ?: 0L).toString(), (instance?.value ?: 0L).toString(), counterid.toInt(), (address?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetCounterSetInfo(providerhandle: Handle, template: COpaquePointer?, templatesize: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfSetCounterSetInfo((providerhandle?.value ?: 0L).toString(), (template?.value ?: 0L).toString(), templatesize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetULongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: UInt): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfSetULongCounterValue((provider?.value ?: 0L).toString(), (instance?.value ?: 0L).toString(), counterid.toInt(), value.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfSetULongLongCounterValue(provider: Handle, instance: COpaquePointer?, counterid: UInt, value: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfSetULongLongCounterValue((provider?.value ?: 0L).toString(), (instance?.value ?: 0L).toString(), counterid.toInt(), value.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStartProvider(providerguid: COpaquePointer?, controlcallback: Perflibrequest, phprovider: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfStartProvider((providerguid?.value ?: 0L).toString(), 0L.toString(), (phprovider?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStartProviderEx(providerguid: COpaquePointer?, providercontext: COpaquePointer?, provider: COpaquePointer?): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfStartProviderEx((providerguid?.value ?: 0L).toString(), (providercontext?.value ?: 0L).toString(), (provider?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun perfStopProvider(providerhandle: Handle): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_perfStopProvider((providerhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPerformanceCounter(lpperformancecount: COpaquePointer?): Bool =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_queryPerformanceCounter((lpperformancecount?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryPerformanceFrequency(lpfrequency: COpaquePointer?): Bool =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_queryPerformanceFrequency((lpfrequency?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restorePerfRegistryFromFileW(szfilename: Pcwstr, szlangid: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_restorePerfRegistryFromFileW((szfilename?.value ?: 0L).toString(), (szlangid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceAsTrustedA(szreserved: Pcstr, szservicename: Pcstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_setServiceAsTrustedA((szreserved?.value ?: 0L).toString(), (szservicename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setServiceAsTrustedW(szreserved: Pcwstr, szservicename: Pcwstr): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_setServiceAsTrustedW((szreserved?.value ?: 0L).toString(), (szservicename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadPerfCounterTextStringsA(lpcommandline: Pcstr, bquietmodearg: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsA((lpcommandline?.value ?: 0L).toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadPerfCounterTextStringsW(lpcommandline: Pcwstr, bquietmodearg: Bool): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_unloadPerfCounterTextStringsW((lpcommandline?.value ?: 0L).toString(), bquietmodearg).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePerfNameFilesA(sznewctrfilepath: Pcstr, sznewhlpfilepath: Pcstr, szlanguageid: Pcstr, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_updatePerfNameFilesA((sznewctrfilepath?.value ?: 0L).toString(), (sznewhlpfilepath?.value ?: 0L).toString(), (szlanguageid?.value ?: 0L).toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updatePerfNameFilesW(sznewctrfilepath: Pcwstr, sznewhlpfilepath: Pcwstr, szlanguageid: Pcwstr, dwflags: ULong): UInt =
    if (_windowsWin32SystemPerformanceNapiAvailable) _wasm_windowssys_windows_win32_system_performance_updatePerfNameFilesW((sznewctrfilepath?.value ?: 0L).toString(), (sznewhlpfilepath?.value ?: 0L).toString(), (szlanguageid?.value ?: 0L).toString(), dwflags.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
