@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val windowsWin32SystemKernelNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun rtlFirstEntrySList(listhead: ConstPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAddon != null) MutPtr((windowsWin32SystemKernelNapiAddon.windowssysWindowsWin32SystemKernelRtlFirstEntrySList(listhead.rawAddress.toString()) as kotlin.String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSListHead(listhead: MutPtr) {
    if (windowsWin32SystemKernelNapiAddon != null) {
        windowsWin32SystemKernelNapiAddon.windowssysWindowsWin32SystemKernelRtlInitializeSListHead(listhead.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInterlockedFlushSList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAddon != null) MutPtr((windowsWin32SystemKernelNapiAddon.windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(listhead.rawAddress.toString()) as kotlin.String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPopEntrySList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAddon != null) MutPtr((windowsWin32SystemKernelNapiAddon.windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(listhead.rawAddress.toString()) as kotlin.String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAddon != null) MutPtr((windowsWin32SystemKernelNapiAddon.windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(listhead.rawAddress.toString(), listentry.rawAddress.toString()) as kotlin.String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    if (windowsWin32SystemKernelNapiAddon != null) MutPtr((windowsWin32SystemKernelNapiAddon.windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(listhead.rawAddress.toString(), list.rawAddress.toString(), listend.rawAddress.toString(), count.toInt()) as kotlin.String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryDepthSList(listhead: ConstPtr): UShort =
    if (windowsWin32SystemKernelNapiAddon != null) (windowsWin32SystemKernelNapiAddon.windowssysWindowsWin32SystemKernelRtlQueryDepthSList(listhead.rawAddress.toString()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")
