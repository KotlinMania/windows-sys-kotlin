@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private val windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun createDataModelManager(debughost: MutPtr<CVoid>, manager: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(debughost.rawAddress.toString(), manager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(remoteoptions.rawAddress.toString(), interfaceid.rawAddress.toString(), iface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(remoteoptions.rawAddress.toString(), interfaceid.rawAddress.toString(), iface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugCreate(interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(interfaceid.rawAddress.toString(), iface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun debugCreateEx(interfaceid: ConstPtr<Guid>, dbgengoptions: UInt, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(interfaceid.rawAddress.toString(), dbgengoptions.toInt(), iface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
