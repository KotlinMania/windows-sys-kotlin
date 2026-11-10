@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemComUrlmonNapiAddon(): Boolean

private val _windowsWin32SystemComUrlmonNapiAvailable: Boolean = _initWindowsWin32SystemComUrlmonNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetGetSession(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetSession(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetParseIUri(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetParseIUri(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetParseUrl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetParseUrl(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_compareSecurityIds(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_compareSecurityIds(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_copyBindInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_copyBindInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_copyStgMedium(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_copyStgMedium(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_createURLMoniker(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_createURLMoniker(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_createURLMonikerEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_faultInIEFeature(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_faultInIEFeature(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_findMediaType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_findMediaType(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_findMediaTypeClass(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_findMediaTypeClass(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_findMimeFromData(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_findMimeFromData(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_getClassFileOrMime(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_getClassFileOrMime(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_getClassURL(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_getClassURL(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_hlinkGoBack(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_hlinkGoBack(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_hlinkGoForward(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_hlinkGoForward(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_hlinkNavigateString(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_hlinkNavigateString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName()")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_iEInstallScope(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_iEInstallScope(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_isAsyncMoniker(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_isAsyncMoniker(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_isValidURL(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_isValidURL(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_registerMediaTypes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_registerMediaTypes(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_releaseBindInfo(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_releaseBindInfo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_urlmon_writeHitLogging(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_urlmon_writeHitLogging(p0: String): Int

public actual fun coGetClassObjectFromURL(rclassid: COpaquePointer?, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: COpaquePointer?, dwclscontext: Clsctx, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL((rclassid?.value ?: 0L).toString(), (szcode?.value ?: 0L).toString(), dwfileversionms.toInt(), dwfileversionls.toInt(), (sztype?.value ?: 0L).toString(), (pbindctx?.value ?: 0L).toString(), dwclscontext.toInt(), (pvreserved?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineIUri(pbaseuri: COpaquePointer?, prelativeuri: COpaquePointer?, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri((pbaseuri?.value ?: 0L).toString(), (prelativeuri?.value ?: 0L).toString(), dwcombineflags.toInt(), (ppcombineduri?.value ?: 0L).toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl((pwzbaseurl?.value ?: 0L).toString(), (pwzrelativeurl?.value ?: 0L).toString(), dwcombineflags.toInt(), (pszresult?.value ?: 0L).toString(), cchresult.toInt(), (pcchresult?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrlEx(pbaseuri: COpaquePointer?, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx((pbaseuri?.value ?: 0L).toString(), (pwzrelativeurl?.value ?: 0L).toString(), dwcombineflags.toInt(), (ppcombineduri?.value ?: 0L).toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl((pwzurl1?.value ?: 0L).toString(), (pwzurl2?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateSecurityManager(psp: COpaquePointer?, ppsm: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager((psp?.value ?: 0L).toString(), (ppsm?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateZoneManager(psp: COpaquePointer?, ppzm: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager((psp?.value ?: 0L).toString(), (ppzm?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags((pwzurl?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: COpaquePointer?, psuaction: Psuaction, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl((pwszurl?.value ?: 0L).toString(), (ppwszsecurl?.value ?: 0L).toString(), psuaction, dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrlEx(puri: COpaquePointer?, ppsecuri: COpaquePointer?, psuaction: Psuaction, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx((puri?.value ?: 0L).toString(), (ppsecuri?.value ?: 0L).toString(), psuaction, dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetGetSession(dwsessionmode.toInt(), (ppiinternetsession?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(featureentry, dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: COpaquePointer?, psecmgr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), (piuri?.value ?: 0L).toString(), (psecmgr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), (szurl?.value ?: 0L).toString(), (psecmgr?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled((szfromurl?.value ?: 0L).toString(), (sztourl?.value ?: 0L).toString(), (psecmgr?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseIUri(piuri: COpaquePointer?, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetParseIUri((piuri?.value ?: 0L).toString(), parseaction, dwflags.toInt(), (pwzresult?.value ?: 0L).toString(), cchresult.toInt(), (pcchresult?.value ?: 0L).toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetParseUrl((pwzurl?.value ?: 0L).toString(), parseaction, dwflags.toInt(), (pszresult?.value ?: 0L).toString(), cchresult.toInt(), (pcchresult?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbbuffer: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo((pwzurl?.value ?: 0L).toString(), queryoptions, dwqueryflags.toInt(), (pvbuffer?.value ?: 0L).toString(), cbbuffer.toInt(), (pcbbuffer?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareSecurityIds(pbsecurityid1: COpaquePointer?, dwlen1: UInt, pbsecurityid2: COpaquePointer?, dwlen2: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_compareSecurityIds((pbsecurityid1?.value ?: 0L).toString(), dwlen1.toInt(), (pbsecurityid2?.value ?: 0L).toString(), dwlen2.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compatFlagsFromClsid(pclsid: COpaquePointer?, pdwcompatflags: COpaquePointer?, pdwmiscstatusflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid((pclsid?.value ?: 0L).toString(), (pdwcompatflags?.value ?: 0L).toString(), (pdwmiscstatusflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyBindInfo(pcbisrc: COpaquePointer?, pbidest: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_copyBindInfo((pcbisrc?.value ?: 0L).toString(), (pbidest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyStgMedium(pcstgmedsrc: COpaquePointer?, pstgmeddest: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_copyStgMedium((pcstgmedsrc?.value ?: 0L).toString(), (pstgmeddest?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: COpaquePointer?, pefetc: COpaquePointer?, ppbc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(reserved.toInt(), (pbscb?.value ?: 0L).toString(), (pefetc?.value ?: 0L).toString(), (ppbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtxEx(pbc: COpaquePointer?, dwoptions: UInt, pbscb: COpaquePointer?, penum: COpaquePointer?, ppbc: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx((pbc?.value ?: 0L).toString(), dwoptions.toInt(), (pbscb?.value ?: 0L).toString(), (penum?.value ?: 0L).toString(), (ppbc?.value ?: 0L).toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: COpaquePointer?, ppenumfmtetc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(cfmtetc.toInt(), (rgfmtetc?.value ?: 0L).toString(), (ppenumfmtetc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMoniker(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_createURLMoniker((pmkctx?.value ?: 0L).toString(), (szurl?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_createURLMonikerEx((pmkctx?.value ?: 0L).toString(), (szurl?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx2(pmkctx: COpaquePointer?, puri: COpaquePointer?, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2((pmkctx?.value ?: 0L).toString(), (puri?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: COpaquePointer?, pquery: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_faultInIEFeature((hwnd?.value ?: 0L).toString(), (pclassspec?.value ?: 0L).toString(), (pquery?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_findMediaType((rgsztypes?.value ?: 0L).toString(), (rgcftypes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaTypeClass(pbc: COpaquePointer?, sztype: Pcstr, pclsid: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_findMediaTypeClass((pbc?.value ?: 0L).toString(), (sztype?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMimeFromData(pbc: COpaquePointer?, pwzurl: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_findMimeFromData((pbc?.value ?: 0L).toString(), (pwzurl?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), cbsize.toInt(), (pwzmimeproposed?.value ?: 0L).toString(), dwmimeflags.toInt(), (ppwzmimeout?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassFileOrMime(pbc: COpaquePointer?, szfilename: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_getClassFileOrMime((pbc?.value ?: 0L).toString(), (szfilename?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), cbsize.toInt(), (szmime?.value ?: 0L).toString(), dwreserved.toInt(), (pclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassURL(szurl: Pcwstr, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_getClassURL((szurl?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComponentIDFromCLSSPEC(pclassspec: COpaquePointer?, ppszcomponentid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC((pclassspec?.value ?: 0L).toString(), (ppszcomponentid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo((szdistunit?.value ?: 0L).toString(), (psdi?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoBack(punk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_hlinkGoBack((punk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoForward(punk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_hlinkGoForward((punk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateMoniker(punk: COpaquePointer?, pmktarget: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker((punk?.value ?: 0L).toString(), (pmktarget?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateString(punk: COpaquePointer?, sztarget: Pcwstr): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_hlinkNavigateString((punk?.value ?: 0L).toString(), (sztarget?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: COpaquePointer?, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker((pmktarget?.value ?: 0L).toString(), (szlocation?.value ?: 0L).toString(), (sztargetframename?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (param5?.value ?: 0L).toString(), grfhlnf.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString((sztarget?.value ?: 0L).toString(), (szlocation?.value ?: 0L).toString(), (sztargetframename?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (param5?.value ?: 0L).toString(), grfhlnf.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInstallScope(pdwscope: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_iEInstallScope((pdwscope?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAsyncMoniker(pmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_isAsyncMoniker((pmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA((pszurl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW((pwszurl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidURL(pbc: COpaquePointer?, szurl: Pcwstr, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_isValidURL((pbc?.value ?: 0L).toString(), (szurl?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkParseDisplayNameEx(pbc: COpaquePointer?, szdisplayname: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx((pbc?.value ?: 0L).toString(), (szdisplayname?.value ?: 0L).toString(), (pcheaten?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(dwoption.toInt(), (pszuaout?.value ?: 0L).toString(), (cbsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?, ppbscbprev: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback((pbc?.value ?: 0L).toString(), (pbscb?.value ?: 0L).toString(), (ppbscbprev?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator((pbc?.value ?: 0L).toString(), (pefetc?.value ?: 0L).toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypeClass(pbc: COpaquePointer?, ctypes: UInt, rgsztypes: COpaquePointer?, rgclsid: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass((pbc?.value ?: 0L).toString(), ctypes.toInt(), (rgsztypes?.value ?: 0L).toString(), (rgclsid?.value ?: 0L).toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: COpaquePointer?, rgcftypes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_registerMediaTypes(ctypes.toInt(), (rgsztypes?.value ?: 0L).toString(), (rgcftypes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseBindInfo(pbindinfo: COpaquePointer?) {
    if (_windowsWin32SystemComUrlmonNapiAvailable) {
        _wasm_windowssys_windows_win32_system_com_urlmon_releaseBindInfo((pbindinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revokeBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback((pbc?.value ?: 0L).toString(), (pbscb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator((pbc?.value ?: 0L).toString(), (pefetc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer((hobject?.value ?: 0L).toString(), ieobjecttype, dwaccessmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState((szdistunit?.value ?: 0L).toString(), dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), cchfilename.toInt(), param4.toInt(), (param5?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), cchfilename.toInt(), param4.toInt(), (param5?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbufferlengthout: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(dwoption.toInt(), (pbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), (pdwbufferlengthout?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(dwoption.toInt(), (pbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeHitLogging(lplogginginfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemComUrlmonNapiAvailable) _wasm_windowssys_windows_win32_system_com_urlmon_writeHitLogging((lplogginginfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
