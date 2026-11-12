@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDiagnosticsEtwNapiAddon(): Boolean

private val windowsWin32SystemDiagnosticsEtwNapiAvailable: Boolean = initWindowsWin32SystemDiagnosticsEtwNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(p0: String, p1: Int, p2: String, p3: Int, p4: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventRegister(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventRegister(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventWrite(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWrite(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(p0: String, p1: String, p2: String, p3: String, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(p0: String, p1: String, p2: Boolean, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(p0)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(p0: String): Int

public actual fun closeTrace(tracehandle: ProcesstraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle.rawAddress.toString(), instinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid.rawAddress.toString(), additionaldetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx(providerid: ConstPtr, sourceid: ConstPtr, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr, propertyarraycount: UInt, guidcount: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray.rawAddress.toString(), propertyarraycount.toInt(), guidcount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.rawAddress.toString(), inbuffersize.toInt(), outbuffer.rawAddress.toString(), outbuffersize.toInt(), returnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessControl(guid: ConstPtr, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid.rawAddress.toString(), operation.toInt(), sid.rawAddress.toString(), rights.toInt(), allowordeny).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessQuery(guid: ConstPtr, buffer: PsecurityDescriptor, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessRemove(guid: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode.toInt(), activityid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle.toString(), eventdescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventRegister(providerid: ConstPtr, enablecallback: Penablecallback, callbackcontext: ConstPtr, reghandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), reghandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr, informationlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle.toString(), informationclass, eventinformation.rawAddress.toString(), informationlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle.toString(), eventdescriptor.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr, filter: ULong, flags: UInt, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle.toString(), eventdescriptor.rawAddress.toString(), filter.toString(), flags.toInt(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle.toString(), level.toInt(), keyword.toString(), string.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceLoggerHandle(buffer: ConstPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceA(logfile: MutPtr): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromBufferStream(options: ConstPtr, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options.rawAddress.toString(), 0L.toString(), buffercompletioncontext.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr, logfileheader: MutPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.rawAddress.toString(), options.rawAddress.toString(), allocationsize.toString(), memorypartitionhandle.rawAddress.toString(), logfileheader.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceW(logfile: MutPtr): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTrace(handlearray: ConstPtr, handlecount: UInt, starttime: ConstPtr, endtime: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray.rawAddress.toString(), handlecount.toInt(), starttime.rawAddress.toString(), endtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr, buffersize: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle.toString(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesA(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesW(propertyarray: MutPtr, propertyarraycount: UInt, loggercount: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, returnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr, controlguid: ConstPtr, guidcount: UInt, traceguidreg: ConstPtr, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeTraceCallback(pguid: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTraceCallback(pguid: ConstPtr, eventcallback: PeventCallback): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid.rawAddress.toString(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceA(tracehandle: MutPtr, instancename: Pcstr, properties: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceW(tracehandle: MutPtr, instancename: Pcwstr, properties: MutPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr, eventmatchallflags: ConstPtr, eventfilterdescriptor: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs.rawAddress.toString(), eventmatchallflags.rawAddress.toString(), eventfilterdescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr, eventdescriptor: ConstPtr, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr, payloadfilter: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), eventmatchany, payloadpredicatecount.toInt(), payloadpredicates.rawAddress.toString(), payloadfilter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid.rawAddress.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, filtercount: MutPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), filtercount.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviders(pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr, buffersize: UInt, bufferrequired: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter, buffer.rawAddress.toString(), buffersize.toInt(), bufferrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhFormatProperty(eventinfo: ConstPtr, mapinfo: ConstPtr, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr, buffersize: MutPtr, buffer: Pwstr, userdataconsumed: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo.rawAddress.toString(), mapinfo.rawAddress.toString(), pointersize.toInt(), propertyintype.toInt(), propertyouttype.toInt(), propertylength.toInt(), userdatalength.toInt(), userdata.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString(), userdataconsumed.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventInformation(event: ConstPtr, tdhcontextcount: UInt, tdhcontext: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventMapInformation(pevent: ConstPtr, pmapname: Pcwstr, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent.rawAddress.toString(), pmapname.rawAddress.toString(), pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr, eventdescriptor: ConstPtr, buffer: MutPtr, buffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetProperty(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, buffersize: UInt, pbuffer: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), buffersize.toInt(), pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetPropertySize(pevent: ConstPtr, tdhcontextcount: UInt, ptdhcontext: ConstPtr, propertydatacount: UInt, ppropertydata: ConstPtr, ppropertysize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), ppropertysize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr, buffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle.toString(), eventrecord.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr, propertyname: Pcwstr, buffersize: MutPtr, buffer: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle.toString(), eventrecord.rawAddress.toString(), propertyname.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhOpenDecodingHandle(handle: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr, pbuffersize: MutPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid.rawAddress.toString(), eventfieldvalue.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle.toString(), eventtrace.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr, instinfo: ConstPtr, parentinstinfo: ConstPtr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle.toString(), eventtrace.rawAddress.toString(), instinfo.rawAddress.toString(), parentinstinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr, messagenumber: UShort, messagearglist: ConstPtr): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), messagearglist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr, informationlength: UInt, returnlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")
