@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDiagnosticsDebugExtensionsNapiAddon(): Boolean

private val windowsWin32SystemDiagnosticsDebugExtensionsNapiAvailable: Boolean = initWindowsWin32SystemDiagnosticsDebugExtensionsNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(p0: String, p1: Int, p2: String): Int

public actual fun createDataModelManager(debughost: MutPtr<CVoid>, manager: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(debughost.rawAddress.toString(), manager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(remoteoptions.rawAddress.toString(), interfaceid.rawAddress.toString(), iface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(remoteoptions.rawAddress.toString(), interfaceid.rawAddress.toString(), iface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugCreate(interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(interfaceid.rawAddress.toString(), iface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugCreateEx(interfaceid: ConstPtr<Guid>, dbgengoptions: UInt, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAvailable) wasmWindowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(interfaceid.rawAddress.toString(), dbgengoptions.toInt(), iface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
