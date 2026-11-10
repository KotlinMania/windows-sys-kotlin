@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementWnetNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementWnetNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementWnetNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPAddConnection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection3(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPAddConnection3(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPAddConnection4(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPAddConnection4(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPEnumResource(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPEnumResource(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPFormatNetworkName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPFormatNetworkName(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetCaps(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetCaps(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetConnection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetConnection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetConnection3(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetConnection3(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetConnectionPerformance(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetConnectionPerformance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetPersistentUseOptionsForConnection(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetPersistentUseOptionsForConnection(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetResourceInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetResourceInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetResourceParent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetResourceParent(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetUniversalName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetUniversalName(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPGetUser(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_nPOpenEnum(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_nPOpenEnum(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2A(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2W(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3A(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3A(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3W(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3W(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4A(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4A(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4W(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4W(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2A(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2A(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2W(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetCloseEnum(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCloseEnum(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1A(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1A(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1W(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1W(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1A(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1A(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1W(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1W(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetUserA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUserA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetGetUserW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUserW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumA(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumW(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorA(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorW(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4A(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4A(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4W(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

public actual fun multinetGetConnectionPerformanceA(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceA((lpnetresource?.value ?: 0L).toString(), (lpnetconnectinfostruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multinetGetConnectionPerformanceW(lpnetresource: COpaquePointer?, lpnetconnectinfostruct: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceW((lpnetresource?.value ?: 0L).toString(), (lpnetconnectinfostruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPAddConnection((lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPAddConnection3((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lpauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPAddConnection4((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (lpauthbuffer?.value ?: 0L).toString(), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L).toString(), cbuseoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection((lpname?.value ?: 0L).toString(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection2((lpname?.value ?: 0L).toString(), fforce, dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCloseEnum(henum: Handle): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPCloseEnum((henum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPEnumResource(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPEnumResource((henum?.value ?: 0L).toString(), (lpccount?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: COpaquePointer?, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPFormatNetworkName((lpremotename?.value ?: 0L).toString(), (lpformattedname?.value ?: 0L).toString(), (lpnlength?.value ?: 0L).toString(), dwflags.toInt(), dwavecharperline.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetCaps(ndex: UInt): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetCaps(ndex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetConnection((lplocalname?.value ?: 0L).toString(), (lpremotename?.value ?: 0L).toString(), (lpnbufferlen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetConnection3((lplocalname?.value ?: 0L).toString(), dwlevel.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetConnectionPerformance((lpremotename?.value ?: 0L).toString(), (lpnetconnectinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: COpaquePointer?, cbreaduseoptions: UInt, lpwriteuseoptions: COpaquePointer?, lpsizewriteuseoptions: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetPersistentUseOptionsForConnection((lpremotepath?.value ?: 0L).toString(), (lpreaduseoptions?.value ?: 0L).toString(), cbreaduseoptions.toInt(), (lpwriteuseoptions?.value ?: 0L).toString(), (lpsizewriteuseoptions?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetResourceInformation(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?, lplpsystem: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetResourceInformation((lpnetresource?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString(), (lplpsystem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetResourceParent(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetResourceParent((lpnetresource?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetUniversalName((lplocalpath?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPGetUser((lpname?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), (lpnbufferlen?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_nPOpenEnum(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), (lpnetresource?.value ?: 0L).toString(), (lphenum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection2A(lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2A((lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection2W(lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2W((lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3A((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3W((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4A((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (pauthbuffer?.value ?: 0L).toString(), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L).toString(), cbuseoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: COpaquePointer?, cbuseoptions: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4W((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (pauthbuffer?.value ?: 0L).toString(), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L).toString(), cbuseoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionA((lpremotename?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lplocalname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionW((lpremotename?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lplocalname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2A((lpname?.value ?: 0L).toString(), dwflags.toInt(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2W((lpname?.value ?: 0L).toString(), dwflags.toInt(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionA((lpname?.value ?: 0L).toString(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionW((lpname?.value ?: 0L).toString(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetCloseEnum((henum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog((hwnd?.value ?: 0L).toString(), dwtype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1A((lpconndlgstruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1W((lpconndlgstruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog((hwnd?.value ?: 0L).toString(), dwtype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1A((lpconndlgstruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1W((lpconndlgstruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetEnumResourceA(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceA((henum?.value ?: 0L).toString(), (lpccount?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetEnumResourceW(henum: Handle, lpccount: COpaquePointer?, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceW((henum?.value ?: 0L).toString(), (lpccount?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionA((lplocalname?.value ?: 0L).toString(), (lpremotename?.value ?: 0L).toString(), (lpnlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionW((lplocalname?.value ?: 0L).toString(), (lpremotename?.value ?: 0L).toString(), (lpnlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetLastErrorA(lperror: COpaquePointer?, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorA((lperror?.value ?: 0L).toString(), (lperrorbuf?.value ?: 0L).toString(), nerrorbufsize.toInt(), (lpnamebuf?.value ?: 0L).toString(), nnamebufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetLastErrorW(lperror: COpaquePointer?, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorW((lperror?.value ?: 0L).toString(), (lperrorbuf?.value ?: 0L).toString(), nerrorbufsize.toInt(), (lpnamebuf?.value ?: 0L).toString(), nnamebufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationA((lpprovider?.value ?: 0L).toString(), (lpnetinfostruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationW((lpprovider?.value ?: 0L).toString(), (lpnetinfostruct?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameA(dwnettype.toInt(), (lpprovidername?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameW(dwnettype.toInt(), (lpprovidername?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceInformationA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationA((lpnetresource?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpcbbuffer?.value ?: 0L).toString(), (lplpsystem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceInformationW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?, lplpsystem: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationW((lpnetresource?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpcbbuffer?.value ?: 0L).toString(), (lplpsystem?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceParentA(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentA((lpnetresource?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpcbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceParentW(lpnetresource: COpaquePointer?, lpbuffer: COpaquePointer?, lpcbbuffer: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentW((lpnetresource?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), (lpcbbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameA((lplocalpath?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: COpaquePointer?, lpbuffersize: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameW((lplocalpath?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUserA((lpname?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), (lpnlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetGetUserW((lpname?.value ?: 0L).toString(), (lpusername?.value ?: 0L).toString(), (lpnlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumA(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), (lpnetresource?.value ?: 0L).toString(), (lphenum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: COpaquePointer?, lphenum: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumW(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), (lpnetresource?.value ?: 0L).toString(), (lphenum?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr) {
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorA(err.toInt(), (lperror?.value ?: 0L).toString(), (lpproviders?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr) {
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorW(err.toInt(), (lperror?.value ?: 0L).toString(), (lpproviders?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4A((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (pauthbuffer?.value ?: 0L).toString(), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L).toString(), cbuseoptions.toInt(), (lpaccessname?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString(), (lpresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: COpaquePointer?, pauthbuffer: COpaquePointer?, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: COpaquePointer?, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4W((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (pauthbuffer?.value ?: 0L).toString(), cbauthbuffer.toInt(), dwflags.toInt(), (lpuseoptions?.value ?: 0L).toString(), cbuseoptions.toInt(), (lpaccessname?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString(), (lpresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionA((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpuserid?.value ?: 0L).toString(), dwflags.toInt(), (lpaccessname?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString(), (lpresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: COpaquePointer?, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: COpaquePointer?, lpresult: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementWnetNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionW((hwndowner?.value ?: 0L).toString(), (lpnetresource?.value ?: 0L).toString(), (lppassword?.value ?: 0L).toString(), (lpuserid?.value ?: 0L).toString(), dwflags.toInt(), (lpaccessname?.value ?: 0L).toString(), (lpbuffersize?.value ?: 0L).toString(), (lpresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
