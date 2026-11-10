@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemDiagnosticsEtwNapiAddon(): Boolean

private val _windowsWin32SystemDiagnosticsEtwNapiAvailable: Boolean = _initWindowsWin32SystemDiagnosticsEtwNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_cveEventWrite(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_cveEventWrite(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventAccessControl(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventAccessControl(p0: String, p1: Int, p2: String, p3: Int, p4: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventEnabled(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventEnabled(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventRegister(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventRegister(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventUnregister(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventUnregister(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventWrite(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWrite(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventWriteString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWriteString(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_processTrace(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_processTrace(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_setTraceCallback(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_setTraceCallback(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_startTraceA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_startTraceA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_startTraceW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_startTraceW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter(p0: String, p1: String, p2: Boolean, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_traceEvent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_traceEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_traceMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_traceMessage(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(p0)")
private external fun _wasm_windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(p0: String): Int

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_createTraceInstanceId((reghandle?.value ?: 0L).toString(), (instinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_cveEventWrite((cveid?.value ?: 0L).toString(), (additionaldetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: COpaquePointer?, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx(providerid: COpaquePointer?, sourceid: COpaquePointer?, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: COpaquePointer?, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuids(guidpropertiesarray: COpaquePointer?, propertyarraycount: UInt, guidcount: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuids((guidpropertiesarray?.value ?: 0L).toString(), propertyarraycount.toInt(), (guidcount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_enumerateTraceGuidsEx(tracequeryinfoclass, (inbuffer?.value ?: 0L).toString(), inbuffersize.toInt(), (outbuffer?.value ?: 0L).toString(), outbuffersize.toInt(), (returnlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessControl(guid: COpaquePointer?, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventAccessControl((guid?.value ?: 0L).toString(), operation.toInt(), (sid?.value ?: 0L).toString(), rights.toInt(), allowordeny).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessQuery(guid: COpaquePointer?, buffer: PsecurityDescriptor, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventAccessQuery((guid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessRemove(guid: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventAccessRemove((guid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventActivityIdControl(controlcode.toInt(), (activityid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventEnabled(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventRegister(providerid: COpaquePointer?, enablecallback: Penablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventRegister((providerid?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (reghandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventSetInformation(reghandle.toString(), informationclass, (eventinformation?.value ?: 0L).toString(), informationlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventUnregister(reghandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWrite(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWriteEx(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), filter.toString(), flags.toInt(), (activityid?.value ?: 0L).toString(), (relatedactivityid?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWriteString(reghandle.toString(), level.toInt(), keyword.toString(), (string?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_eventWriteTransfer(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), (activityid?.value ?: 0L).toString(), (relatedactivityid?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_getTraceEnableFlags(tracehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_getTraceEnableLevel(tracehandle.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceLoggerHandle(buffer: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_getTraceLoggerHandle((buffer?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceA(logfile: COpaquePointer?): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromBufferStream(options: COpaquePointer?, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromBufferStream((options?.value ?: 0L).toString(), 0L.toString(), (buffercompletioncontext?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromFile((logfilename?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (logfileheader?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: COpaquePointer?, logfileheader: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLogger((loggername?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (logfileheader?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: COpaquePointer?, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: COpaquePointer?): ULong =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_openTraceFromRealTimeLoggerWithAllocationOptions((loggername?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), allocationsize.toString(), (memorypartitionhandle?.value ?: 0L).toString(), (logfileheader?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceW(logfile: COpaquePointer?): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTrace(handlearray: COpaquePointer?, handlecount: UInt, starttime: COpaquePointer?, endtime: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_processTrace((handlearray?.value ?: 0L).toString(), handlecount.toInt(), (starttime?.value ?: 0L).toString(), (endtime?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: COpaquePointer?, buffersize: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_processTraceAddBufferToBufferStream(tracehandle.toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferDecrementReference(buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_processTraceBufferDecrementReference((buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_processTraceBufferIncrementReference(tracehandle.toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesA(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_queryAllTracesA((propertyarray?.value ?: 0L).toString(), propertyarraycount.toInt(), (loggercount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesW(propertyarray: COpaquePointer?, propertyarraycount: UInt, loggercount: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_queryAllTracesW((propertyarray?.value ?: 0L).toString(), propertyarraycount.toInt(), (loggercount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: COpaquePointer?, inbuffersize: UInt, outbuffer: COpaquePointer?, outbuffersize: UInt, returnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsA(0L.toString(), (requestcontext?.value ?: 0L).toString(), (controlguid?.value ?: 0L).toString(), guidcount.toInt(), (traceguidreg?.value ?: 0L).toString(), (mofimagepath?.value ?: 0L).toString(), (mofresourcename?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: COpaquePointer?, controlguid: COpaquePointer?, guidcount: UInt, traceguidreg: COpaquePointer?, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_registerTraceGuidsW(0L.toString(), (requestcontext?.value ?: 0L).toString(), (controlguid?.value ?: 0L).toString(), guidcount.toInt(), (traceguidreg?.value ?: 0L).toString(), (mofimagepath?.value ?: 0L).toString(), (mofresourcename?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeTraceCallback(pguid: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_removeTraceCallback((pguid?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTraceCallback(pguid: COpaquePointer?, eventcallback: PeventCallback): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_setTraceCallback((pguid?.value ?: 0L).toString(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceA(tracehandle: COpaquePointer?, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_startTraceA((tracehandle?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (properties?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceW(tracehandle: COpaquePointer?, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_startTraceW((tracehandle?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (properties?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: COpaquePointer?, eventmatchallflags: COpaquePointer?, eventfilterdescriptor: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhAggregatePayloadFilters(payloadfiltercount.toInt(), (payloadfilterptrs?.value ?: 0L).toString(), (eventmatchallflags?.value ?: 0L).toString(), (eventfilterdescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhCleanupPayloadEventFilterDescriptor((eventfilterdescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhCloseDecodingHandle(handle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCreatePayloadFilter(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: COpaquePointer?, payloadfilter: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhCreatePayloadFilter((providerguid?.value ?: 0L).toString(), (eventdescriptor?.value ?: 0L).toString(), eventmatchany, payloadpredicatecount.toInt(), (payloadpredicates?.value ?: 0L).toString(), (payloadfilter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhDeletePayloadFilter(payloadfilter: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhDeletePayloadFilter((payloadfilter?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateManifestProviderEvents((providerguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFieldInformation(pguid: COpaquePointer?, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFieldInformation((pguid?.value ?: 0L).toString(), eventfieldtype, (pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFilters(guid: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, filtercount: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviderFilters((guid?.value ?: 0L).toString(), tdhcontextcount.toInt(), (tdhcontext?.value ?: 0L).toString(), (filtercount?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviders(pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProviders((pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: COpaquePointer?, buffersize: UInt, bufferrequired: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhEnumerateProvidersForDecodingSource(filter, (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bufferrequired?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhFormatProperty(eventinfo: COpaquePointer?, mapinfo: COpaquePointer?, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: COpaquePointer?, buffersize: COpaquePointer?, buffer: Pwstr, userdataconsumed: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhFormatProperty((eventinfo?.value ?: 0L).toString(), (mapinfo?.value ?: 0L).toString(), pointersize.toInt(), propertyintype.toInt(), propertyouttype.toInt(), propertylength.toInt(), userdatalength.toInt(), (userdata?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (userdataconsumed?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetDecodingParameter(handle.toString(), (tdhcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventInformation(event: COpaquePointer?, tdhcontextcount: UInt, tdhcontext: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetEventInformation((event?.value ?: 0L).toString(), tdhcontextcount.toInt(), (tdhcontext?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventMapInformation(pevent: COpaquePointer?, pmapname: Pcwstr, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetEventMapInformation((pevent?.value ?: 0L).toString(), (pmapname?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetManifestEventInformation(providerguid: COpaquePointer?, eventdescriptor: COpaquePointer?, buffer: COpaquePointer?, buffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetManifestEventInformation((providerguid?.value ?: 0L).toString(), (eventdescriptor?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetProperty(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, buffersize: UInt, pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetProperty((pevent?.value ?: 0L).toString(), tdhcontextcount.toInt(), (ptdhcontext?.value ?: 0L).toString(), propertydatacount.toInt(), (ppropertydata?.value ?: 0L).toString(), buffersize.toInt(), (pbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetPropertySize(pevent: COpaquePointer?, tdhcontextcount: UInt, ptdhcontext: COpaquePointer?, propertydatacount: UInt, ppropertydata: COpaquePointer?, ppropertysize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetPropertySize((pevent?.value ?: 0L).toString(), tdhcontextcount.toInt(), (ptdhcontext?.value ?: 0L).toString(), propertydatacount.toInt(), (ppropertydata?.value ?: 0L).toString(), (ppropertysize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: COpaquePointer?, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetWppMessage(handle.toString(), (eventrecord?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: COpaquePointer?, propertyname: Pcwstr, buffersize: COpaquePointer?, buffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhGetWppProperty(handle.toString(), (eventrecord?.value ?: 0L).toString(), (propertyname?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifest((manifest?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromBinary((binarypath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhLoadManifestFromMemory((pdata?.value ?: 0L).toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhOpenDecodingHandle(handle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhOpenDecodingHandle((handle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhQueryProviderFieldInformation(pguid: COpaquePointer?, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: COpaquePointer?, pbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhQueryProviderFieldInformation((pguid?.value ?: 0L).toString(), eventfieldvalue.toString(), eventfieldtype, (pbuffer?.value ?: 0L).toString(), (pbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhSetDecodingParameter(handle.toString(), (tdhcontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifest((manifest?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifestFromMemory(pdata: COpaquePointer?, cbdata: UInt): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_tdhUnloadManifestFromMemory((pdata?.value ?: 0L).toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEvent(tracehandle: ULong, eventtrace: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_traceEvent(tracehandle.toString(), (eventtrace?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: COpaquePointer?, instinfo: COpaquePointer?, parentinstinfo: COpaquePointer?): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_traceEventInstance(tracehandle.toString(), (eventtrace?.value ?: 0L).toString(), (instinfo?.value ?: 0L).toString(), (parentinstinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_traceMessage(loggerhandle.toString(), messageflags.toInt(), (messageguid?.value ?: 0L).toString(), messagenumber.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: COpaquePointer?, messagenumber: UShort, messagearglist: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_traceMessageVa(loggerhandle.toString(), messageflags.toInt(), (messageguid?.value ?: 0L).toString(), messagenumber.toInt(), (messagearglist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: COpaquePointer?, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    if (_windowsWin32SystemDiagnosticsEtwNapiAvailable) _wasm_windowssys_windows_win32_system_diagnostics_etw_unregisterTraceGuids(registrationhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")
