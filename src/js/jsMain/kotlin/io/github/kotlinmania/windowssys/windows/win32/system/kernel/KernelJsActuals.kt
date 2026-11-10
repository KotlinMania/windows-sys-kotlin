@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer

private val _windowsWin32SystemKernelNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun rtlFirstEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_rtlFirstEntrySList((listhead?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSListHead(listhead: COpaquePointer?) {
    if (_windowsWin32SystemKernelNapiAddon != null) {
        _windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_rtlInitializeSListHead((listhead?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInterlockedFlushSList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList((listhead?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList((listhead?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList((listhead?.value ?: 0L).toString(), (listentry?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer? =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx((listhead?.value ?: 0L).toString(), (list?.value ?: 0L).toString(), (listend?.value ?: 0L).toString(), count.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryDepthSList(listhead: COpaquePointer?): UShort =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_rtlQueryDepthSList((listhead?.value ?: 0L).toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")
