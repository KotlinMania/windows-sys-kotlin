@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemKernelNapiAddon(): Boolean

private val windowsWin32SystemKernelNapiAvailable: Boolean = initWindowsWin32SystemKernelNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemKernelRtlFirstEntrySList(p0)")
private external fun wasmWindowssysWindowsWin32SystemKernelRtlFirstEntrySList(p0: kotlin.String): kotlin.String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemKernelRtlInitializeSListHead(p0)")
private external fun wasmWindowssysWindowsWin32SystemKernelRtlInitializeSListHead(p0: kotlin.String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(p0)")
private external fun wasmWindowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(p0: kotlin.String): kotlin.String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(p0)")
private external fun wasmWindowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(p0: kotlin.String): kotlin.String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(p0: kotlin.String, p1: kotlin.String): kotlin.String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(p0: kotlin.String, p1: kotlin.String, p2: kotlin.String, p3: Int): kotlin.String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemKernelRtlQueryDepthSList(p0)")
private external fun wasmWindowssysWindowsWin32SystemKernelRtlQueryDepthSList(p0: kotlin.String): Int

public actual fun rtlFirstEntrySList(listhead: ConstPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemKernelRtlFirstEntrySList(listhead.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeSListHead(listhead: MutPtr) {
    if (windowsWin32SystemKernelNapiAvailable) {
        wasmWindowssysWindowsWin32SystemKernelRtlInitializeSListHead(listhead.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInterlockedFlushSList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(listhead.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPopEntrySList(listhead: MutPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(listhead.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr =
    if (windowsWin32SystemKernelNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(listhead.rawAddress.toString(), listentry.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInterlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr =
    if (windowsWin32SystemKernelNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(listhead.rawAddress.toString(), list.rawAddress.toString(), listend.rawAddress.toString(), count.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryDepthSList(listhead: ConstPtr): UShort =
    if (windowsWin32SystemKernelNapiAvailable) wasmWindowssysWindowsWin32SystemKernelRtlQueryDepthSList(listhead.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")
