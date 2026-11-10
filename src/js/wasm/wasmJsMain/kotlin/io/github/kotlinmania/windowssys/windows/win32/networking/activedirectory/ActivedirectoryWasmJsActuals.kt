@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkingActivedirectoryNapiAddon(): Boolean

private val _windowsWin32NetworkingActivedirectoryNapiAvailable: Boolean = _initWindowsWin32NetworkingActivedirectoryNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsBuildEnumerator(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsBuildEnumerator(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayInt(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayInt(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayStr(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayStr(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsDecodeBinaryData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsDecodeBinaryData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsEncodeBinaryData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsEncodeBinaryData(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsEnumerateNext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsEnumerateNext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsFreeEnumerator(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsFreeEnumerator(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsGetLastError(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsGetLastError(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsGetObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsGetObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsOpenObject(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsOpenObject(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsPropCheckIfWritable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropCheckIfWritable(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsPropCreateNotifyObj(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropCreateNotifyObj(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsPropGetInitInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropGetInitInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsPropSendErrorMessage(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropSendErrorMessage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsPropSetHwnd(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropSetHwnd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsPropSetHwndWithTitle(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropSetHwndWithTitle(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsPropShowErrorDialog(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropShowErrorDialog(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_aDsSetLastError(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_aDsSetLastError(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_adsFreeAdsValues(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_adsFreeAdsValues(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_adsTypeToPropVariant(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_adsTypeToPropVariant(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_allocADsMem(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_allocADsMem(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_allocADsStr(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_allocADsStr(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_binarySDToSecurityDescriptor(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_binarySDToSecurityDescriptor(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindByInstanceA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindByInstanceA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindByInstanceW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindByInstanceW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindToISTGA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindToISTGA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindToISTGW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindToISTGW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindWithCredA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithCredA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindWithCredW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithCredW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBindingSetTimeout(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBindingSetTimeout(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerA(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerW(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackNamesA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackNamesA(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackNamesW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackNamesW(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackSpn2A(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn2A(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackSpn2W(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn2W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackSpn3W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn3W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackSpn4W(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn4W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackSpnA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpnA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackSpnW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpnW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoA(p0: Int, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoW(p0: Int, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeNameResultA(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeNameResultA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeNameResultW(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeNameResultW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreePasswordCredentials(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreePasswordCredentials(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapA(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapW(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapW(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayA(p0: Int, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayW(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcCloseW(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcCloseW(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcNameA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNameA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcNameW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNameW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcNextA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNextA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcNextW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNextW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcOpenA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcOpenA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcOpenW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcOpenW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetForestTrustInformationW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetForestTrustInformationW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetFriendlyClassName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetFriendlyClassName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetIcon(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetIcon(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetRdnW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetRdnW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetSiteNameA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSiteNameA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetSiteNameW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSiteNameW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetSpnA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSpnA(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsGetSpnW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSpnW(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsIsMangledDnA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledDnA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsIsMangledDnW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledDnW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListInfoForServerA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListInfoForServerA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListInfoForServerW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListInfoForServerW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListRolesA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListRolesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListRolesW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListRolesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListServersInSiteA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersInSiteA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListServersInSiteW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersInSiteW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListSitesA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListSitesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsListSitesW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsListSitesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsMakeSpnA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsMakeSpnA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsMakeSpnW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsMakeSpnW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsMergeForestTrustInformationW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsMergeForestTrustInformationW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsQuerySitesFree(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsQuerySitesFree(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaAddA(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaAddA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaAddW(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaAddW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaConsistencyCheck(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaConsistencyCheck(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaDelA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaDelA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaDelW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaDelW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaFreeInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaFreeInfo(p0: Int, p1: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfo2W(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfo2W(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfoW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfoW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaModifyA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaModifyA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaModifyW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaModifyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsRoleFreeMemory(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsRoleFreeMemory(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsRoleGetPrimaryDomainInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsRoleGetPrimaryDomainInformation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsUnBindA(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsUnBindA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsUnBindW(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsUnBindW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueA(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueW(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameA(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameW(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_freeADsMem(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_freeADsMem(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_freeADsStr(p0)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_freeADsStr(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_propVariantToAdsType(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_propVariantToAdsType(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_reallocADsMem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_reallocADsMem(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networking_activedirectory_reallocADsStr(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networking_activedirectory_reallocADsStr(p0: String, p1: String): Int

public actual fun aDsBuildEnumerator(padscontainer: COpaquePointer?, ppenumvariant: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsBuildEnumerator((padscontainer?.value ?: 0L).toString(), (ppenumvariant?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: COpaquePointer?, dwobjecttypes: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayInt((lpdwobjecttypes?.value ?: 0L).toString(), dwobjecttypes.toInt(), (pvar?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsBuildVarArrayStr(lpppathnames: COpaquePointer?, dwpathnames: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayStr((lpppathnames?.value ?: 0L).toString(), dwpathnames.toInt(), (pvar?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: COpaquePointer?, pdwdestlen: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsDecodeBinaryData((szsrcdata?.value ?: 0L).toString(), (ppbdestdata?.value ?: 0L).toString(), (pdwdestlen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsEncodeBinaryData(pbsrcdata: COpaquePointer?, dwsrclen: UInt, ppszdestdata: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsEncodeBinaryData((pbsrcdata?.value ?: 0L).toString(), dwsrclen.toInt(), (ppszdestdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsEnumerateNext(penumvariant: COpaquePointer?, celements: UInt, pvar: COpaquePointer?, pcelementsfetched: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsEnumerateNext((penumvariant?.value ?: 0L).toString(), celements.toInt(), (pvar?.value ?: 0L).toString(), (pcelementsfetched?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsFreeEnumerator(penumvariant: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsFreeEnumerator((penumvariant?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsGetLastError(lperror: COpaquePointer?, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsGetLastError((lperror?.value ?: 0L).toString(), (lperrorbuf?.value ?: 0L).toString(), dwerrorbuflen.toInt(), (lpnamebuf?.value ?: 0L).toString(), dwnamebuflen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsGetObject((lpszpathname?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsOpenObject((lpszpathname?.value ?: 0L).toString(), (lpszusername?.value ?: 0L).toString(), (lpszpassword?.value ?: 0L).toString(), dwreserved.toInt(), (riid?.value ?: 0L).toString(), (ppobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropCheckIfWritable((pwzattr?.value ?: 0L).toString(), (pwritableattrs?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropCreateNotifyObj(pappthddataobj: COpaquePointer?, pwzadsobjname: Pcwstr, phnotifyobj: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropCreateNotifyObj((pappthddataobj?.value ?: 0L).toString(), (pwzadsobjname?.value ?: 0L).toString(), (phnotifyobj?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropGetInitInfo((hnotifyobj?.value ?: 0L).toString(), (pinitparams?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropSendErrorMessage((hnotifyobj?.value ?: 0L).toString(), (perror?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropSetHwnd((hnotifyobj?.value ?: 0L).toString(), (hpage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropSetHwndWithTitle((hnotifyobj?.value ?: 0L).toString(), (hpage?.value ?: 0L).toString(), (ptztitle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_aDsPropShowErrorDialog((hnotifyobj?.value ?: 0L).toString(), (hpage?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_aDsSetLastError(dwerr.toInt(), (pszerror?.value ?: 0L).toString(), (pszprovider?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun adsFreeAdsValues(padsvalues: COpaquePointer?, dwnumvalues: UInt) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_adsFreeAdsValues((padsvalues?.value ?: 0L).toString(), dwnumvalues.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun adsTypeToPropVariant(padsvalues: COpaquePointer?, dwnumvalues: UInt, pvariant: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_adsTypeToPropVariant((padsvalues?.value ?: 0L).toString(), dwnumvalues.toInt(), (pvariant?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocADsMem(cb: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_allocADsMem(cb.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_allocADsStr((pstr?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_binarySDToSecurityDescriptor((psecuritydescriptor?.value ?: 0L).toString(), (pvarsec?.value ?: 0L).toString(), (pszservername?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), (password?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryA((hds?.value ?: 0L).toString(), flags.toInt(), (srcdomain?.value ?: 0L).toString(), (srcprincipal?.value ?: 0L).toString(), (srcdomaincontroller?.value ?: 0L).toString(), (srcdomaincreds?.value ?: 0L).toString(), (dstdomain?.value ?: 0L).toString(), (dstprincipal?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryW((hds?.value ?: 0L).toString(), flags.toInt(), (srcdomain?.value ?: 0L).toString(), (srcprincipal?.value ?: 0L).toString(), (srcdomaincontroller?.value ?: 0L).toString(), (srcdomaincreds?.value ?: 0L).toString(), (dstdomain?.value ?: 0L).toString(), (dstprincipal?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesA((computername?.value ?: 0L).toString(), entrycount.toInt(), (socketaddresses?.value ?: 0L).toString(), (sitenames?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExA((computername?.value ?: 0L).toString(), entrycount.toInt(), (socketaddresses?.value ?: 0L).toString(), (sitenames?.value ?: 0L).toString(), (subnetnames?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExW((computername?.value ?: 0L).toString(), entrycount.toInt(), (socketaddresses?.value ?: 0L).toString(), (sitenames?.value ?: 0L).toString(), (subnetnames?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesW((computername?.value ?: 0L).toString(), entrycount.toInt(), (socketaddresses?.value ?: 0L).toString(), (sitenames?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindA((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: COpaquePointer?, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindByInstanceA((servername?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString(), (instanceguid?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (serviceprincipalname?.value ?: 0L).toString(), bindflags.toInt(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: COpaquePointer?, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindByInstanceW((servername?.value ?: 0L).toString(), (annotation?.value ?: 0L).toString(), (instanceguid?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (serviceprincipalname?.value ?: 0L).toString(), bindflags.toInt(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindToISTGA(sitename: Pcstr, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindToISTGA((sitename?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindToISTGW((sitename?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindW((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithCredA((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithCredW((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnA((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (serviceprincipalname?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExA((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (serviceprincipalname?.value ?: 0L).toString(), bindflags.toInt(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExW((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (serviceprincipalname?.value ?: 0L).toString(), bindflags.toInt(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindWithSpnW((domaincontrollername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (authidentity?.value ?: 0L).toString(), (serviceprincipalname?.value ?: 0L).toString(), (phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBindingSetTimeout((hds?.value ?: 0L).toString(), ctimeoutsecs.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBrowseForContainerA(pinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerA((pinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBrowseForContainerW(pinfo: COpaquePointer?): Int =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerW((pinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerA((serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (pcspnlength?.value ?: 0L).toString(), (pszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerW((serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (pcspnlength?.value ?: 0L).toString(), (pszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackNamesA((hds?.value ?: 0L).toString(), flags, formatoffered, formatdesired, cnames.toInt(), (rpnames?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackNamesW((hds?.value ?: 0L).toString(), flags, formatoffered, formatdesired, cnames.toInt(), (rpnames?.value ?: 0L).toString(), (ppresult?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn2A((pszspn?.value ?: 0L).toString(), cspn.toInt(), (pcserviceclass?.value ?: 0L).toString(), (serviceclass?.value ?: 0L).toString(), (pcservicename?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (pcinstancename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (pinstanceport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn2W((pszspn?.value ?: 0L).toString(), cspn.toInt(), (pcserviceclass?.value ?: 0L).toString(), (serviceclass?.value ?: 0L).toString(), (pcservicename?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (pcinstancename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (pinstanceport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pportnumber: COpaquePointer?, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn3W((pszspn?.value ?: 0L).toString(), cspn.toInt(), (pchostname?.value ?: 0L).toString(), (hostname?.value ?: 0L).toString(), (pcinstancename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (pportnumber?.value ?: 0L).toString(), (pcdomainname?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), (pcrealmname?.value ?: 0L).toString(), (realmname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pcportname: COpaquePointer?, portname: Pwstr, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpn4W((pszspn?.value ?: 0L).toString(), cspn.toInt(), (pchostname?.value ?: 0L).toString(), (hostname?.value ?: 0L).toString(), (pcinstancename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (pcportname?.value ?: 0L).toString(), (portname?.value ?: 0L).toString(), (pcdomainname?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), (pcrealmname?.value ?: 0L).toString(), (realmname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpnA((pszspn?.value ?: 0L).toString(), (pcserviceclass?.value ?: 0L).toString(), (serviceclass?.value ?: 0L).toString(), (pcservicename?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (pcinstancename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (pinstanceport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackSpnW((pszspn?.value ?: 0L).toString(), (pcserviceclass?.value ?: 0L).toString(), (serviceclass?.value ?: 0L).toString(), (pcservicename?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (pcinstancename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (pinstanceport?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnA((pszrdn?.value ?: 0L).toString(), cchrdn.toInt(), (pguid?.value ?: 0L).toString(), (pedsmanglefor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnW((pszrdn?.value ?: 0L).toString(), cchrdn.toInt(), (pguid?.value ?: 0L).toString(), (pedsmanglefor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsA((servername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (domainguid?.value ?: 0L).toString(), (dsaguid?.value ?: 0L).toString(), (dnshostname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsW((servername?.value ?: 0L).toString(), (dnsdomainname?.value ?: 0L).toString(), (domainguid?.value ?: 0L).toString(), (dsaguid?.value ?: 0L).toString(), (dnshostname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsA((servername?.value ?: 0L).toString(), flags.toInt(), (domains?.value ?: 0L).toString(), (domaincount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsW((servername?.value ?: 0L).toString(), flags.toInt(), (domains?.value ?: 0L).toString(), (domaincount?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoA(infolevel.toInt(), cinfo.toInt(), (pinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoW(infolevel.toInt(), cinfo.toInt(), (pinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeNameResultA(presult: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeNameResultA((presult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeNameResultW(presult: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeNameResultW((presult?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreePasswordCredentials(authidentity: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreePasswordCredentials((authidentity?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSchemaGuidMapA(pguidmap: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapA((pguidmap?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSchemaGuidMapW(pguidmap: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapW((pguidmap?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayA(cspn.toInt(), (rpszspn?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayW(cspn.toInt(), (rpszspn?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsGetDcCloseW(getdccontexthandle: Handle) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcCloseW((getdccontexthandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: COpaquePointer?, sitename: Pcstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNameA((computername?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), (domainguid?.value ?: 0L).toString(), (sitename?.value ?: 0L).toString(), flags.toInt(), (domaincontrollerinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: COpaquePointer?, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNameW((computername?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), (domainguid?.value ?: 0L).toString(), (sitename?.value ?: 0L).toString(), flags.toInt(), (domaincontrollerinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNextA((getdccontexthandle?.value ?: 0L).toString(), (sockaddresscount?.value ?: 0L).toString(), (sockaddresses?.value ?: 0L).toString(), (dnshostname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcNextW((getdccontexthandle?.value ?: 0L).toString(), (sockaddresscount?.value ?: 0L).toString(), (sockaddresses?.value ?: 0L).toString(), (dnshostname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: COpaquePointer?, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcOpenA((dnsname?.value ?: 0L).toString(), optionflags.toInt(), (sitename?.value ?: 0L).toString(), (domainguid?.value ?: 0L).toString(), (dnsforestname?.value ?: 0L).toString(), dcflags.toInt(), (retgetdccontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: COpaquePointer?, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcOpenW((dnsname?.value ?: 0L).toString(), optionflags.toInt(), (sitename?.value ?: 0L).toString(), (domainguid?.value ?: 0L).toString(), (dnsforestname?.value ?: 0L).toString(), dcflags.toInt(), (retgetdccontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageA((servername?.value ?: 0L).toString(), (entrycount?.value ?: 0L).toString(), (sitenames?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageW((servername?.value ?: 0L).toString(), (entrycount?.value ?: 0L).toString(), (sitenames?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoA((hds?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), infolevel.toInt(), (pcout?.value ?: 0L).toString(), (ppinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoW((hds?.value ?: 0L).toString(), (domainname?.value ?: 0L).toString(), infolevel.toInt(), (pcout?.value ?: 0L).toString(), (ppinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetForestTrustInformationW((servername?.value ?: 0L).toString(), (trusteddomainname?.value ?: 0L).toString(), flags.toInt(), (foresttrustinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetFriendlyClassName((pszobjectclass?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), cchbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetIcon(dwflags.toInt(), (pszobjectclass?.value ?: 0L).toString(), cximage, cyimage).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetRdnW(ppdn: COpaquePointer?, pcdn: COpaquePointer?, ppkey: COpaquePointer?, pckey: COpaquePointer?, ppval: COpaquePointer?, pcval: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetRdnW((ppdn?.value ?: 0L).toString(), (pcdn?.value ?: 0L).toString(), (ppkey?.value ?: 0L).toString(), (pckey?.value ?: 0L).toString(), (ppval?.value ?: 0L).toString(), (pcval?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSiteNameA((computername?.value ?: 0L).toString(), (sitename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSiteNameW((computername?.value ?: 0L).toString(), (sitename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSpnA(servicetype, (serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), instanceport.toInt(), cinstancenames.toInt(), (pinstancenames?.value ?: 0L).toString(), (pinstanceports?.value ?: 0L).toString(), (pcspn?.value ?: 0L).toString(), (prpszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsGetSpnW(servicetype, (serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), instanceport.toInt(), cinstancenames.toInt(), (pinstancenames?.value ?: 0L).toString(), (pinstanceports?.value ?: 0L).toString(), (pcspn?.value ?: 0L).toString(), (prpszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityA((hds?.value ?: 0L).toString(), flags.toInt(), (srcprincipal?.value ?: 0L).toString(), (dstprincipal?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityW((hds?.value ?: 0L).toString(), flags.toInt(), (srcprincipal?.value ?: 0L).toString(), (dstprincipal?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledDnA((pszdn?.value ?: 0L).toString(), edsmanglefor) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledDnW((pszdn?.value ?: 0L).toString(), edsmanglefor) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueA((pszrdn?.value ?: 0L).toString(), crdn.toInt(), edsmanglefordesired) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueW((pszrdn?.value ?: 0L).toString(), crdn.toInt(), edsmanglefordesired) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteA((hds?.value ?: 0L).toString(), (site?.value ?: 0L).toString(), (ppdomains?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteW((hds?.value ?: 0L).toString(), (site?.value ?: 0L).toString(), (ppdomains?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListInfoForServerA((hds?.value ?: 0L).toString(), (server?.value ?: 0L).toString(), (ppinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListInfoForServerW((hds?.value ?: 0L).toString(), (server?.value ?: 0L).toString(), (ppinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListRolesA(hds: Handle, pproles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListRolesA((hds?.value ?: 0L).toString(), (pproles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListRolesW(hds: Handle, pproles: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListRolesW((hds?.value ?: 0L).toString(), (pproles?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteA((hds?.value ?: 0L).toString(), (domain?.value ?: 0L).toString(), (site?.value ?: 0L).toString(), (ppservers?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteW((hds?.value ?: 0L).toString(), (domain?.value ?: 0L).toString(), (site?.value ?: 0L).toString(), (ppservers?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersInSiteA((hds?.value ?: 0L).toString(), (site?.value ?: 0L).toString(), (ppservers?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListServersInSiteW((hds?.value ?: 0L).toString(), (site?.value ?: 0L).toString(), (ppservers?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListSitesA(hds: Handle, ppsites: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListSitesA((hds?.value ?: 0L).toString(), (ppsites?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListSitesW(hds: Handle, ppsites: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsListSitesW((hds?.value ?: 0L).toString(), (ppsites?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsA((user?.value ?: 0L).toString(), (domain?.value ?: 0L).toString(), (password?.value ?: 0L).toString(), (pauthidentity?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsW((user?.value ?: 0L).toString(), (domain?.value ?: 0L).toString(), (password?.value ?: 0L).toString(), (pauthidentity?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsMakeSpnA((serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), instanceport.toInt(), (referrer?.value ?: 0L).toString(), (pcspnlength?.value ?: 0L).toString(), (pszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsMakeSpnW((serviceclass?.value ?: 0L).toString(), (servicename?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), instanceport.toInt(), (referrer?.value ?: 0L).toString(), (pcspnlength?.value ?: 0L).toString(), (pszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsA((hds?.value ?: 0L).toString(), cguids.toInt(), (rguids?.value ?: 0L).toString(), (ppguidmap?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsW((hds?.value ?: 0L).toString(), cguids.toInt(), (rguids?.value ?: 0L).toString(), (ppguidmap?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: COpaquePointer?, oldforesttrustinfo: COpaquePointer?, mergedforesttrustinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsMergeForestTrustInformationW((domainname?.value ?: 0L).toString(), (newforesttrustinfo?.value ?: 0L).toString(), (oldforesttrustinfo?.value ?: 0L).toString(), (mergedforesttrustinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostA((hds?.value ?: 0L).toString(), (pszfromsite?.value ?: 0L).toString(), (rgsztosites?.value ?: 0L).toString(), ctosites.toInt(), dwflags.toInt(), (prgsiteinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostW((hds?.value ?: 0L).toString(), (pwszfromsite?.value ?: 0L).toString(), (rgwsztosites?.value ?: 0L).toString(), ctosites.toInt(), dwflags.toInt(), (prgsiteinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesFree(rgsiteinfo: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsQuerySitesFree((rgsiteinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueA(cunquotedrdnvaluelength.toInt(), (psunquotedrdnvalue?.value ?: 0L).toString(), (pcquotedrdnvaluelength?.value ?: 0L).toString(), (psquotedrdnvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueW(cunquotedrdnvaluelength.toInt(), (psunquotedrdnvalue?.value ?: 0L).toString(), (pcquotedrdnvaluelength?.value ?: 0L).toString(), (psquotedrdnvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainA((hds?.value ?: 0L).toString(), (domaindn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainW((hds?.value ?: 0L).toString(), (domaindn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerA((hds?.value ?: 0L).toString(), (serverdn?.value ?: 0L).toString(), (domaindn?.value ?: 0L).toString(), (flastdcindomain?.value ?: 0L).toString(), fcommit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerW((hds?.value ?: 0L).toString(), (serverdn?.value ?: 0L).toString(), (domaindn?.value ?: 0L).toString(), (flastdcindomain?.value ?: 0L).toString(), fcommit).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaAddA((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (sourcedsadn?.value ?: 0L).toString(), (transportdn?.value ?: 0L).toString(), (sourcedsaaddress?.value ?: 0L).toString(), (pschedule?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaAddW((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (sourcedsadn?.value ?: 0L).toString(), (transportdn?.value ?: 0L).toString(), (sourcedsaaddress?.value ?: 0L).toString(), (pschedule?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaConsistencyCheck((hds?.value ?: 0L).toString(), taskid, dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaDelA((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (dsasrc?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaDelW((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (dsasrc?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaFreeInfo(infotype, (pinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfo2W((hds?.value ?: 0L).toString(), infotype, (pszobject?.value ?: 0L).toString(), (puuidforsourcedsaobjguid?.value ?: 0L).toString(), (pszattributename?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), dwflags.toInt(), dwenumerationcontext.toInt(), (ppinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfoW((hds?.value ?: 0L).toString(), infotype, (pszobject?.value ?: 0L).toString(), (puuidforsourcedsaobjguid?.value ?: 0L).toString(), (ppinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaModifyA((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (puuidsourcedsa?.value ?: 0L).toString(), (transportdn?.value ?: 0L).toString(), (sourcedsaaddress?.value ?: 0L).toString(), (pschedule?.value ?: 0L).toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaModifyW((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (puuidsourcedsa?.value ?: 0L).toString(), (transportdn?.value ?: 0L).toString(), (sourcedsaaddress?.value ?: 0L).toString(), (pschedule?.value ?: 0L).toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncA((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (puuiddsasrc?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllA((hds?.value ?: 0L).toString(), (psznamecontext?.value ?: 0L).toString(), ulflags.toInt(), pfncallback.toString(), (pcallbackdata?.value ?: 0L).toString(), (perrors?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllW((hds?.value ?: 0L).toString(), (psznamecontext?.value ?: 0L).toString(), ulflags.toInt(), pfncallback.toString(), (pcallbackdata?.value ?: 0L).toString(), (perrors?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaSyncW((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (puuiddsasrc?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: COpaquePointer?, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsA((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (dsadest?.value ?: 0L).toString(), (puuiddsadest?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: COpaquePointer?, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsW((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (dsadest?.value ?: 0L).toString(), (puuiddsadest?.value ?: 0L).toString(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsA((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (puuiddsasrc?.value ?: 0L).toString(), uloptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsW((hds?.value ?: 0L).toString(), (namecontext?.value ?: 0L).toString(), (puuiddsasrc?.value ?: 0L).toString(), uloptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRoleFreeMemory(buffer: COpaquePointer?) {
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) {
        _wasm_windowssys_windows_win32_networking_activedirectory_dsRoleFreeMemory((buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsRoleGetPrimaryDomainInformation((lpserver?.value ?: 0L).toString(), infolevel, (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnA(operation, (serviceclass?.value ?: 0L).toString(), (userobjectdn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnW(operation, (serviceclass?.value ?: 0L).toString(), (userobjectdn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnBindA(phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsUnBindA((phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnBindW(phds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsUnBindW((phds?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueA(cquotedrdnvaluelength.toInt(), (psquotedrdnvalue?.value ?: 0L).toString(), (pcunquotedrdnvaluelength?.value ?: 0L).toString(), (psunquotedrdnvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueW(cquotedrdnvaluelength.toInt(), (psquotedrdnvalue?.value ?: 0L).toString(), (pcunquotedrdnvaluelength?.value ?: 0L).toString(), (psunquotedrdnvalue?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameA((subnetname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameW((subnetname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnA((hds?.value ?: 0L).toString(), operation, (pszaccount?.value ?: 0L).toString(), cspn.toInt(), (rpszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnW((hds?.value ?: 0L).toString(), operation, (pszaccount?.value ?: 0L).toString(), cspn.toInt(), (rpszspn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeADsMem(pmem: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_freeADsMem((pmem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_freeADsStr((pstr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToAdsType(pvariant: COpaquePointer?, dwnumvariant: UInt, ppadsvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_propVariantToAdsType((pvariant?.value ?: 0L).toString(), dwnumvariant.toInt(), (ppadsvalues?.value ?: 0L).toString(), (pdwnumvalues?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocADsMem(poldmem: COpaquePointer?, cbold: UInt, cbnew: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_reallocADsMem((poldmem?.value ?: 0L).toString(), cbold.toInt(), cbnew.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocADsStr(ppstr: COpaquePointer?, pstr: Pcwstr): Bool =
    if (_windowsWin32NetworkingActivedirectoryNapiAvailable) _wasm_windowssys_windows_win32_networking_activedirectory_reallocADsStr((ppstr?.value ?: 0L).toString(), (pstr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant, ppsecuritydescriptor: COpaquePointer?, pdwsdlength: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")
