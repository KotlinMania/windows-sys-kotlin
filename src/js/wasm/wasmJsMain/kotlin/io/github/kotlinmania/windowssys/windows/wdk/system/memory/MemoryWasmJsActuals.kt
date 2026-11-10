@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkSystemMemoryNapiAddon(): Boolean

private val _windowsWdkSystemMemoryNapiAvailable: Boolean = _initWindowsWdkSystemMemoryNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_memory_ntMapViewOfSection(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_memory_ntMapViewOfSection(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_memory_ntOpenSection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_memory_ntOpenSection(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_memory_ntUnmapViewOfSection(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_memory_ntUnmapViewOfSection(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_memory_zwMapViewOfSection(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_memory_zwMapViewOfSection(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_memory_zwOpenSection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_memory_zwOpenSection(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_memory_zwUnmapViewOfSection(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_memory_zwUnmapViewOfSection(p0: String, p1: String): Int

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAvailable) _wasm_windowssys_windows_wdk_system_memory_ntMapViewOfSection((sectionhandle?.value ?: 0L).toString(), (processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), zerobits.toString(), commitsize.toString(), (sectionoffset?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString(), inheritdisposition, allocationtype.toInt(), win32protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAvailable) _wasm_windowssys_windows_wdk_system_memory_ntOpenSection((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAvailable) _wasm_windowssys_windows_wdk_system_memory_ntUnmapViewOfSection((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAvailable) _wasm_windowssys_windows_wdk_system_memory_zwMapViewOfSection((sectionhandle?.value ?: 0L).toString(), (processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString(), zerobits.toString(), commitsize.toString(), (sectionoffset?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString(), inheritdisposition, allocationtype.toInt(), win32protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAvailable) _wasm_windowssys_windows_wdk_system_memory_zwOpenSection((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemMemoryNapiAvailable) _wasm_windowssys_windows_wdk_system_memory_zwUnmapViewOfSection((processhandle?.value ?: 0L).toString(), (baseaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
