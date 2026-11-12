@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementWnetNapiAddon(): Boolean

private val windowsWin32NetworkmanagementWnetNapiAvailable: Boolean = initWindowsWin32NetworkmanagementWnetNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPAddConnection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPEnumResource(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPEnumResource(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetCaps(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetCaps(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetConnection(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPGetUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetUser(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

public actual fun multinetGetConnectionPerformanceA(lpnetresource: ConstPtr<Netresourcea>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(lpnetresource.rawAddress.toString(), lpnetconnectinfostruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multinetGetConnectionPerformanceW(lpnetresource: ConstPtr<Netresourcew>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(lpnetresource.rawAddress.toString(), lpnetconnectinfostruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPAddConnection(lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lpauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lpauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(lpname.rawAddress.toString(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(lpname.rawAddress.toString(), fforce, dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCloseEnum(henum: Handle): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(henum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPEnumResource(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPEnumResource(henum.rawAddress.toString(), lpccount.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr<UInt>, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(lpremotename.rawAddress.toString(), lpformattedname.rawAddress.toString(), lpnlength.rawAddress.toString(), dwflags.toInt(), dwavecharperline.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetCaps(ndex: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetCaps(ndex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetConnection(lplocalname.rawAddress.toString(), lpremotename.rawAddress.toString(), lpnbufferlen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(lplocalname.rawAddress.toString(), dwlevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr<Netconnectinfostruct>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(lpremotename.rawAddress.toString(), lpnetconnectinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr<UByte>, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr<UByte>, lpsizewriteuseoptions: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(lpremotepath.rawAddress.toString(), lpreaduseoptions.rawAddress.toString(), cbreaduseoptions.toInt(), lpwriteuseoptions.rawAddress.toString(), lpsizewriteuseoptions.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetResourceInformation(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lplpsystem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetResourceParent(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(lplocalpath.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPGetUser(lpname.rawAddress.toString(), lpusername.rawAddress.toString(), lpnbufferlen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress.toString(), lphenum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection2A(lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection2W(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(lpremotename.rawAddress.toString(), lppassword.rawAddress.toString(), lplocalname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(lpremotename.rawAddress.toString(), lppassword.rawAddress.toString(), lplocalname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(lpname.rawAddress.toString(), dwflags.toInt(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(lpname.rawAddress.toString(), dwflags.toInt(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(lpname.rawAddress.toString(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(lpname.rawAddress.toString(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(henum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(hwnd.rawAddress.toString(), dwtype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog1A(lpconndlgstruct: MutPtr<Connectdlgstructa>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(lpconndlgstruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog1W(lpconndlgstruct: MutPtr<Connectdlgstructw>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(lpconndlgstruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(hwnd.rawAddress.toString(), dwtype.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: ConstPtr<Discdlgstructa>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(lpconndlgstruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: ConstPtr<Discdlgstructw>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(lpconndlgstruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetEnumResourceA(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(henum.rawAddress.toString(), lpccount.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetEnumResourceW(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(henum.rawAddress.toString(), lpccount.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(lplocalname.rawAddress.toString(), lpremotename.rawAddress.toString(), lpnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(lplocalname.rawAddress.toString(), lpremotename.rawAddress.toString(), lpnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetLastErrorA(lperror: MutPtr<UInt>, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(lperror.rawAddress.toString(), lperrorbuf.rawAddress.toString(), nerrorbufsize.toInt(), lpnamebuf.rawAddress.toString(), nnamebufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetLastErrorW(lperror: MutPtr<UInt>, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(lperror.rawAddress.toString(), lperrorbuf.rawAddress.toString(), nerrorbufsize.toInt(), lpnamebuf.rawAddress.toString(), nnamebufsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(lpprovider.rawAddress.toString(), lpnetinfostruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(lpprovider.rawAddress.toString(), lpnetinfostruct.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(dwnettype.toInt(), lpprovidername.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(dwnettype.toInt(), lpprovidername.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceInformationA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pstr>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString(), lplpsystem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceInformationW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString(), lplpsystem.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceParentA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceParentW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(lplocalpath.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(lplocalpath.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(lpname.rawAddress.toString(), lpusername.rawAddress.toString(), lpnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(lpname.rawAddress.toString(), lpusername.rawAddress.toString(), lpnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcea>, lphenum: MutPtr<Handle>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress.toString(), lphenum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress.toString(), lphenum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr) {
    if (windowsWin32NetworkmanagementWnetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(err.toInt(), lperror.rawAddress.toString(), lpproviders.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr) {
    if (windowsWin32NetworkmanagementWnetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(err.toInt(), lperror.rawAddress.toString(), lpproviders.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpuserid.rawAddress.toString(), dwflags.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpuserid.rawAddress.toString(), dwflags.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
