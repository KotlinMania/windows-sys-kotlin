@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CreateDataModelManager(debughost: Long, manager: Long): HRESULT =
    if (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssys_windows_win32_system_diagnostics_debug_extensions_CreateDataModelManager(debughost.toString(), manager.toString()) as Int) else 0

public actual fun DebugConnect(remoteoptions: PCSTR, interfaceid: Long, iface: Long): HRESULT =
    if (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnect(remoteoptions.toString(), interfaceid.toString(), iface.toString()) as Int) else 0

public actual fun DebugConnectWide(remoteoptions: PCWSTR, interfaceid: Long, iface: Long): HRESULT =
    if (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnectWide(remoteoptions.toString(), interfaceid.toString(), iface.toString()) as Int) else 0

public actual fun DebugCreate(interfaceid: Long, iface: Long): HRESULT =
    if (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreate(interfaceid.toString(), iface.toString()) as Int) else 0

public actual fun DebugCreateEx(interfaceid: Long, dbgengoptions: UInt, iface: Long): HRESULT =
    if (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon != null) (_windowsWin32SystemDiagnosticsDebugExtensionsNapiAddon.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreateEx(interfaceid.toString(), dbgengoptions.toInt(), iface.toString()) as Int) else 0
