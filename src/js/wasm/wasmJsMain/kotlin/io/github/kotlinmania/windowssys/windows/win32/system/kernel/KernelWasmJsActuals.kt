@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemKernelNapiAddon(): Boolean

private val _windowsWin32SystemKernelNapiAvailable: Boolean = _initWindowsWin32SystemKernelNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_kernel_rtlFirstEntrySList(p0)")
private external fun _wasm_windowssys_windows_win32_system_kernel_rtlFirstEntrySList(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_kernel_rtlInitializeSListHead(p0)")
private external fun _wasm_windowssys_windows_win32_system_kernel_rtlInitializeSListHead(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList(p0)")
private external fun _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList(p0)")
private external fun _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_kernel_rtlQueryDepthSList(p0)")
private external fun _wasm_windowssys_windows_win32_system_kernel_rtlQueryDepthSList(p0: String): Int

public actual fun rtlFirstEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAvailable) _wasm_windowssys_windows_win32_system_kernel_rtlFirstEntrySList((listhead?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSListHead(listhead: COpaquePointer?) {
    if (_windowsWin32SystemKernelNapiAvailable) {
        _wasm_windowssys_windows_win32_system_kernel_rtlInitializeSListHead((listhead?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInterlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAvailable) _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList((listhead?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAvailable) _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList((listhead?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAvailable) _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList((listhead?.value ?: 0L).toString(), (listentry?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAvailable) _wasm_windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx((listhead?.value ?: 0L).toString(), (list?.value ?: 0L).toString(), (listend?.value ?: 0L).toString(), count.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryDepthSList(listhead: COpaquePointer?): UShort =
    if (_windowsWin32SystemKernelNapiAvailable) _wasm_windowssys_windows_win32_system_kernel_rtlQueryDepthSList((listhead?.value ?: 0L).toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")
