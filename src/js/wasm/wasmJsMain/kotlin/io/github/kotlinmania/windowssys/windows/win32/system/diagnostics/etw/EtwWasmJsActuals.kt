@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
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

public actual fun controlTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun controlTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>, controlcode: EventTraceControl): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTraceInstanceId(reghandle: Handle, instinfo: MutPtr<EventInstanceInfo>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwCreateTraceInstanceId(reghandle.rawAddress.toString(), instinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cveEventWrite(cveid: Pcwstr, additionaldetails: Pcwstr): Int =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwCveEventWrite(cveid.rawAddress.toString(), additionaldetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTrace(enable: UInt, enableflag: UInt, enablelevel: UInt, controlguid: ConstPtr<Guid>, tracehandle: ControltraceHandle): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx(providerid: ConstPtr<Guid>, sourceid: ConstPtr<Guid>, tracehandle: ControltraceHandle, isenabled: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, enableproperty: UInt, enablefilterdesc: ConstPtr<EventFilterDescriptor>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableTraceEx2(tracehandle: ControltraceHandle, providerid: ConstPtr<Guid>, controlcode: UInt, level: UByte, matchanykeyword: ULong, matchallkeyword: ULong, timeout: UInt, enableparameters: ConstPtr<EnableTraceParameters>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuids(guidpropertiesarray: MutPtr<MutPtr<TraceGuidProperties>>, propertyarraycount: UInt, guidcount: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuids(guidpropertiesarray.rawAddress.toString(), propertyarraycount.toInt(), guidcount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateTraceGuidsEx(tracequeryinfoclass: TraceQueryInfoClass, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEnumerateTraceGuidsEx(tracequeryinfoclass, inbuffer.rawAddress.toString(), inbuffersize.toInt(), outbuffer.rawAddress.toString(), outbuffersize.toInt(), returnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessControl(guid: ConstPtr<Guid>, operation: UInt, sid: Psid, rights: UInt, allowordeny: Boolean): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessControl(guid.rawAddress.toString(), operation.toInt(), sid.rawAddress.toString(), rights.toInt(), allowordeny).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessQuery(guid: ConstPtr<Guid>, buffer: PsecurityDescriptor, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessQuery(guid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventAccessRemove(guid: ConstPtr<Guid>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventAccessRemove(guid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventActivityIdControl(controlcode.toInt(), activityid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventEnabled(reghandle.toString(), eventdescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventRegister(providerid: ConstPtr<Guid>, enablecallback: Penablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventRegister(providerid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), reghandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventSetInformation(reghandle.toString(), informationclass, eventinformation.rawAddress.toString(), informationlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventUnregister(reghandle: Reghandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventUnregister(reghandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWrite(reghandle.toString(), eventdescriptor.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteEx(reghandle.toString(), eventdescriptor.rawAddress.toString(), filter.toString(), flags.toInt(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, string: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteString(reghandle.toString(), level.toInt(), keyword.toString(), string.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eventWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwEventWriteTransfer(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableFlags(tracehandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableFlags(tracehandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceEnableLevel(tracehandle: ULong): UByte =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceEnableLevel(tracehandle.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTraceLoggerHandle(buffer: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwGetTraceLoggerHandle(buffer.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceA(logfile: MutPtr<EventTraceLogfilea>): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromBufferStream(options: ConstPtr<EtwOpenTraceOptions>, buffercompletioncallback: PetwBufferCompletionCallback, buffercompletioncontext: ConstPtr<CVoid>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromBufferStream(options.rawAddress.toString(), 0L.toString(), buffercompletioncontext.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromFile(logfilename: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromFile(logfilename.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLogger(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLogger(loggername.rawAddress.toString(), options.rawAddress.toString(), logfileheader.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceFromRealTimeLoggerWithAllocationOptions(loggername: Pcwstr, options: ConstPtr<EtwOpenTraceOptions>, allocationsize: ULong, memorypartitionhandle: Handle, logfileheader: MutPtr<TraceLogfileHeader>): ULong =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwOpenTraceFromRealTimeLoggerWithAllocationOptions(loggername.rawAddress.toString(), options.rawAddress.toString(), allocationsize.toString(), memorypartitionhandle.rawAddress.toString(), logfileheader.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTraceW(logfile: MutPtr<EventTraceLogfilew>): ProcesstraceHandle =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTrace(handlearray: ConstPtr<ProcesstraceHandle>, handlecount: UInt, starttime: ConstPtr<Filetime>, endtime: ConstPtr<Filetime>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTrace(handlearray.rawAddress.toString(), handlecount.toInt(), starttime.rawAddress.toString(), endtime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceAddBufferToBufferStream(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>, buffersize: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceAddBufferToBufferStream(tracehandle.toString(), buffer.rawAddress.toString(), buffersize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferDecrementReference(buffer: ConstPtr<EtwBufferHeader>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferDecrementReference(buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processTraceBufferIncrementReference(tracehandle: ULong, buffer: ConstPtr<EtwBufferHeader>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwProcessTraceBufferIncrementReference(tracehandle.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesA(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesA(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryAllTracesW(propertyarray: MutPtr<MutPtr<EventTraceProperties>>, propertyarraycount: UInt, loggercount: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwQueryAllTracesW(propertyarray.rawAddress.toString(), propertyarraycount.toInt(), loggercount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceProcessingHandle(processinghandle: ProcesstraceHandle, informationclass: EtwProcessHandleInfoType, inbuffer: ConstPtr<CVoid>, inbuffersize: UInt, outbuffer: MutPtr<CVoid>, outbuffersize: UInt, returnlength: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsA(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcstr, mofresourcename: Pcstr, registrationhandle: MutPtr<ULong>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsA(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerTraceGuidsW(requestaddress: Wmidprequest, requestcontext: ConstPtr<CVoid>, controlguid: ConstPtr<Guid>, guidcount: UInt, traceguidreg: ConstPtr<TraceGuidRegistration>, mofimagepath: Pcwstr, mofresourcename: Pcwstr, registrationhandle: MutPtr<ULong>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwRegisterTraceGuidsW(0L.toString(), requestcontext.rawAddress.toString(), controlguid.rawAddress.toString(), guidcount.toInt(), traceguidreg.rawAddress.toString(), mofimagepath.rawAddress.toString(), mofresourcename.rawAddress.toString(), registrationhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeTraceCallback(pguid: ConstPtr<Guid>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwRemoveTraceCallback(pguid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTraceCallback(pguid: ConstPtr<Guid>, eventcallback: PeventCallback): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwSetTraceCallback(pguid.rawAddress.toString(), 0L.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceA(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwStartTraceA(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startTraceW(tracehandle: MutPtr<ControltraceHandle>, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwStartTraceW(tracehandle.rawAddress.toString(), instancename.rawAddress.toString(), properties.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stopTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhAggregatePayloadFilters(payloadfiltercount: UInt, payloadfilterptrs: ConstPtr<ConstPtr<CVoid>>, eventmatchallflags: ConstPtr<Boolean>, eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhAggregatePayloadFilters(payloadfiltercount.toInt(), payloadfilterptrs.rawAddress.toString(), eventmatchallflags.rawAddress.toString(), eventfilterdescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor: MutPtr<EventFilterDescriptor>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCleanupPayloadEventFilterDescriptor(eventfilterdescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCloseDecodingHandle(handle: TdhHandle): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCloseDecodingHandle(handle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhCreatePayloadFilter(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, eventmatchany: Boolean, payloadpredicatecount: UInt, payloadpredicates: ConstPtr<PayloadFilterPredicate>, payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhCreatePayloadFilter(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), eventmatchany, payloadpredicatecount.toInt(), payloadpredicates.rawAddress.toString(), payloadfilter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhDeletePayloadFilter(payloadfilter: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhDeletePayloadFilter(payloadfilter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateManifestProviderEvents(providerguid: ConstPtr<Guid>, buffer: MutPtr<ProviderEventInfo>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateManifestProviderEvents(providerguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFieldInformation(pguid.rawAddress.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviderFilters(guid: ConstPtr<Guid>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, filtercount: MutPtr<UInt>, buffer: MutPtr<MutPtr<ProviderFilterInfo>>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviderFilters(guid.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), filtercount.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProviders(pbuffer: MutPtr<ProviderEnumerationInfo>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProviders(pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhEnumerateProvidersForDecodingSource(filter: DecodingSource, buffer: MutPtr<ProviderEnumerationInfo>, buffersize: UInt, bufferrequired: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhEnumerateProvidersForDecodingSource(filter, buffer.rawAddress.toString(), buffersize.toInt(), bufferrequired.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhFormatProperty(eventinfo: ConstPtr<TraceEventInfo>, mapinfo: ConstPtr<EventMapInfo>, pointersize: UInt, propertyintype: UShort, propertyouttype: UShort, propertylength: UShort, userdatalength: UShort, userdata: ConstPtr<UByte>, buffersize: MutPtr<UInt>, buffer: Pwstr, userdataconsumed: MutPtr<UShort>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhFormatProperty(eventinfo.rawAddress.toString(), mapinfo.rawAddress.toString(), pointersize.toInt(), propertyintype.toInt(), propertyouttype.toInt(), propertylength.toInt(), userdatalength.toInt(), userdata.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString(), userdataconsumed.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetDecodingParameter(handle: TdhHandle, tdhcontext: MutPtr<TdhContext>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventInformation(event: ConstPtr<EventRecord>, tdhcontextcount: UInt, tdhcontext: ConstPtr<TdhContext>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventInformation(event.rawAddress.toString(), tdhcontextcount.toInt(), tdhcontext.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetEventMapInformation(pevent: ConstPtr<EventRecord>, pmapname: Pcwstr, pbuffer: MutPtr<EventMapInfo>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetEventMapInformation(pevent.rawAddress.toString(), pmapname.rawAddress.toString(), pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetManifestEventInformation(providerguid: ConstPtr<Guid>, eventdescriptor: ConstPtr<EventDescriptor>, buffer: MutPtr<TraceEventInfo>, buffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetManifestEventInformation(providerguid.rawAddress.toString(), eventdescriptor.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetProperty(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, buffersize: UInt, pbuffer: MutPtr<UByte>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetProperty(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), buffersize.toInt(), pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetPropertySize(pevent: ConstPtr<EventRecord>, tdhcontextcount: UInt, ptdhcontext: ConstPtr<TdhContext>, propertydatacount: UInt, ppropertydata: ConstPtr<PropertyDataDescriptor>, ppropertysize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetPropertySize(pevent.rawAddress.toString(), tdhcontextcount.toInt(), ptdhcontext.rawAddress.toString(), propertydatacount.toInt(), ppropertydata.rawAddress.toString(), ppropertysize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppMessage(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppMessage(handle.toString(), eventrecord.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhGetWppProperty(handle: TdhHandle, eventrecord: ConstPtr<EventRecord>, propertyname: Pcwstr, buffersize: MutPtr<UInt>, buffer: MutPtr<UByte>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhGetWppProperty(handle.toString(), eventrecord.rawAddress.toString(), propertyname.rawAddress.toString(), buffersize.rawAddress.toString(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifest(manifest.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromBinary(binarypath: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromBinary(binarypath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhLoadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhLoadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhOpenDecodingHandle(handle: MutPtr<TdhHandle>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhOpenDecodingHandle(handle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhQueryProviderFieldInformation(pguid: ConstPtr<Guid>, eventfieldvalue: ULong, eventfieldtype: EventFieldType, pbuffer: MutPtr<ProviderFieldInfoarray>, pbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhQueryProviderFieldInformation(pguid.rawAddress.toString(), eventfieldvalue.toString(), eventfieldtype, pbuffer.rawAddress.toString(), pbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhSetDecodingParameter(handle: TdhHandle, tdhcontext: ConstPtr<TdhContext>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhSetDecodingParameter(handle.toString(), tdhcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifest(manifest: Pcwstr): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifest(manifest.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tdhUnloadManifestFromMemory(pdata: ConstPtr<CVoid>, cbdata: UInt): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTdhUnloadManifestFromMemory(pdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEvent(tracehandle: ULong, eventtrace: ConstPtr<EventTraceHeader>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceEvent(tracehandle.toString(), eventtrace.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceEventInstance(tracehandle: ULong, eventtrace: ConstPtr<EventInstanceHeader>, instinfo: ConstPtr<EventInstanceInfo>, parentinstinfo: ConstPtr<EventInstanceInfo>): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceEventInstance(tracehandle.toString(), eventtrace.rawAddress.toString(), instinfo.rawAddress.toString(), parentinstinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessage(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, vararg variadicArgs: Long): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceMessage(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceMessageVa(loggerhandle: ULong, messageflags: TraceMessageFlags, messageguid: ConstPtr<Guid>, messagenumber: UShort, messagearglist: ConstPtr<Byte>): Win32Error =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwTraceMessageVa(loggerhandle.toString(), messageflags.toInt(), messageguid.rawAddress.toString(), messagenumber.toInt(), messagearglist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceQueryInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: MutPtr<CVoid>, informationlength: UInt, returnlength: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun traceSetInformation(sessionhandle: ControltraceHandle, informationclass: TraceQueryInfoClass, traceinformation: ConstPtr<CVoid>, informationlength: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterTraceGuids(registrationhandle: ULong): UInt =
    if (windowsWin32SystemDiagnosticsEtwNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsEtwUnregisterTraceGuids(registrationhandle.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceA(tracehandle: ControltraceHandle, instancename: Pcstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateTraceW(tracehandle: ControltraceHandle, instancename: Pcwstr, properties: MutPtr<EventTraceProperties>): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")
