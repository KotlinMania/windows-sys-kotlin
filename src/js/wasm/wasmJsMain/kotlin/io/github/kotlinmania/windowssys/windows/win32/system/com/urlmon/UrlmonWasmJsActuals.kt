@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.com.Bindinfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.Querycontext
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.system.com.UClsspec

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemComUrlmonNapiAddon(): Boolean

private val windowsWin32SystemComUrlmonNapiAvailable: Boolean = initWindowsWin32SystemComUrlmonNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetGetSession(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetSession(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCompareSecurityIds(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCompareSecurityIds(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCopyBindInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCopyBindInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCopyStgMedium(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCopyStgMedium(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCreateURLMoniker(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCreateURLMoniker(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonFaultInIEFeature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonFaultInIEFeature(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonFindMediaType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonFindMediaType(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonFindMimeFromData(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonFindMimeFromData(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonGetClassURL(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonGetClassURL(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonHlinkGoBack(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonHlinkGoBack(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonHlinkGoForward(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonHlinkGoForward(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonHlinkNavigateString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonHlinkNavigateString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName()")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonIEInstallScope(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonIEInstallScope(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonIsValidURL(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonIsValidURL(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonObtainUserAgentString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonObtainUserAgentString(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonReleaseBindInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonReleaseBindInfo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLOpenStreamA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLOpenStreamA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonURLOpenStreamW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonURLOpenStreamW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(p0: Int, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComUrlmonWriteHitLogging(p0)")
private external fun wasmWindowssysWindowsWin32SystemComUrlmonWriteHitLogging(p0: String): Int

public actual fun coGetClassObjectFromURL(rclassid: ConstPtr<Guid>, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr<CVoid>, dwclscontext: Clsctx, pvreserved: ConstPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(rclassid.rawAddress.toString(), szcode.rawAddress.toString(), dwfileversionms.toInt(), dwfileversionls.toInt(), sztype.rawAddress.toString(), pbindctx.rawAddress.toString(), dwclscontext.toInt(), pvreserved.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineIUri(pbaseuri: MutPtr<CVoid>, prelativeuri: MutPtr<CVoid>, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(pbaseuri.rawAddress.toString(), prelativeuri.rawAddress.toString(), dwcombineflags.toInt(), ppcombineduri.rawAddress.toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(pwzbaseurl.rawAddress.toString(), pwzrelativeurl.rawAddress.toString(), dwcombineflags.toInt(), pszresult.rawAddress.toString(), cchresult.toInt(), pcchresult.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrlEx(pbaseuri: MutPtr<CVoid>, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(pbaseuri.rawAddress.toString(), pwzrelativeurl.rawAddress.toString(), dwcombineflags.toInt(), ppcombineduri.rawAddress.toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(pwzurl1.rawAddress.toString(), pwzurl2.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateSecurityManager(psp: MutPtr<CVoid>, ppsm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(psp.rawAddress.toString(), ppsm.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateZoneManager(psp: MutPtr<CVoid>, ppzm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(psp.rawAddress.toString(), ppzm.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr<UInt>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(pwzurl.rawAddress.toString(), pdwflags.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr<Pwstr>, psuaction: Psuaction, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(pwszurl.rawAddress.toString(), ppwszsecurl.rawAddress.toString(), psuaction, dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrlEx(puri: MutPtr<CVoid>, ppsecuri: MutPtr<MutPtr<CVoid>>, psuaction: Psuaction, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(puri.rawAddress.toString(), ppsecuri.rawAddress.toString(), psuaction, dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetGetSession(dwsessionmode.toInt(), ppiinternetsession.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry, dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr<CVoid>, psecmgr: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), piuri.rawAddress.toString(), psecmgr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), szurl.rawAddress.toString(), psecmgr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr<CVoid>, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(szfromurl.rawAddress.toString(), sztourl.rawAddress.toString(), psecmgr.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseIUri(piuri: MutPtr<CVoid>, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(piuri.rawAddress.toString(), parseaction, dwflags.toInt(), pwzresult.rawAddress.toString(), cchresult.toInt(), pcchresult.rawAddress.toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(pwzurl.rawAddress.toString(), parseaction, dwflags.toInt(), pszresult.rawAddress.toString(), cchresult.toInt(), pcchresult.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbbuffer: MutPtr<UInt>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(pwzurl.rawAddress.toString(), queryoptions, dwqueryflags.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.toInt(), pcbbuffer.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareSecurityIds(pbsecurityid1: ConstPtr<UByte>, dwlen1: UInt, pbsecurityid2: ConstPtr<UByte>, dwlen2: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCompareSecurityIds(pbsecurityid1.rawAddress.toString(), dwlen1.toInt(), pbsecurityid2.rawAddress.toString(), dwlen2.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compatFlagsFromClsid(pclsid: ConstPtr<Guid>, pdwcompatflags: MutPtr<UInt>, pdwmiscstatusflags: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(pclsid.rawAddress.toString(), pdwcompatflags.rawAddress.toString(), pdwmiscstatusflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyBindInfo(pcbisrc: ConstPtr<Bindinfo>, pbidest: MutPtr<Bindinfo>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCopyBindInfo(pcbisrc.rawAddress.toString(), pbidest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyStgMedium(pcstgmedsrc: ConstPtr<Stgmedium>, pstgmeddest: MutPtr<Stgmedium>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCopyStgMedium(pcstgmedsrc.rawAddress.toString(), pstgmeddest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(reserved.toInt(), pbscb.rawAddress.toString(), pefetc.rawAddress.toString(), ppbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtxEx(pbc: MutPtr<CVoid>, dwoptions: UInt, pbscb: MutPtr<CVoid>, penum: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(pbc.rawAddress.toString(), dwoptions.toInt(), pbscb.rawAddress.toString(), penum.rawAddress.toString(), ppbc.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr<Formatetc>, ppenumfmtetc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(cfmtetc.toInt(), rgfmtetc.rawAddress.toString(), ppenumfmtetc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMoniker(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCreateURLMoniker(pmkctx.rawAddress.toString(), szurl.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(pmkctx.rawAddress.toString(), szurl.rawAddress.toString(), ppmk.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx2(pmkctx: MutPtr<CVoid>, puri: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(pmkctx.rawAddress.toString(), puri.rawAddress.toString(), ppmk.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr<UClsspec>, pquery: MutPtr<Querycontext>, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonFaultInIEFeature(hwnd.rawAddress.toString(), pclassspec.rawAddress.toString(), pquery.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonFindMediaType(rgsztypes.rawAddress.toString(), rgcftypes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaTypeClass(pbc: MutPtr<CVoid>, sztype: Pcstr, pclsid: MutPtr<Guid>, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(pbc.rawAddress.toString(), sztype.rawAddress.toString(), pclsid.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMimeFromData(pbc: MutPtr<CVoid>, pwzurl: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonFindMimeFromData(pbc.rawAddress.toString(), pwzurl.rawAddress.toString(), pbuffer.rawAddress.toString(), cbsize.toInt(), pwzmimeproposed.rawAddress.toString(), dwmimeflags.toInt(), ppwzmimeout.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassFileOrMime(pbc: MutPtr<CVoid>, szfilename: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(pbc.rawAddress.toString(), szfilename.rawAddress.toString(), pbuffer.rawAddress.toString(), cbsize.toInt(), szmime.rawAddress.toString(), dwreserved.toInt(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassURL(szurl: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonGetClassURL(szurl.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr<UClsspec>, ppszcomponentid: MutPtr<Pstr>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(pclassspec.rawAddress.toString(), ppszcomponentid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr<Softdistinfo>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(szdistunit.rawAddress.toString(), psdi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoBack(punk: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonHlinkGoBack(punk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoForward(punk: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonHlinkGoForward(punk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateMoniker(punk: MutPtr<CVoid>, pmktarget: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(punk.rawAddress.toString(), pmktarget.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateString(punk: MutPtr<CVoid>, sztarget: Pcwstr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonHlinkNavigateString(punk.rawAddress.toString(), sztarget.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr<CVoid>, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(pmktarget.rawAddress.toString(), szlocation.rawAddress.toString(), sztargetframename.rawAddress.toString(), punk.rawAddress.toString(), pbc.rawAddress.toString(), param5.rawAddress.toString(), grfhlnf.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(sztarget.rawAddress.toString(), szlocation.rawAddress.toString(), sztargetframename.rawAddress.toString(), punk.rawAddress.toString(), pbc.rawAddress.toString(), param5.rawAddress.toString(), grfhlnf.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    if (windowsWin32SystemComUrlmonNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInstallScope(pdwscope: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonIEInstallScope(pdwscope.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAsyncMoniker(pmk: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(pmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(pszurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(pwszurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidURL(pbc: MutPtr<CVoid>, szurl: Pcwstr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonIsValidURL(pbc.rawAddress.toString(), szurl.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkParseDisplayNameEx(pbc: MutPtr<CVoid>, szdisplayname: Pcwstr, pcheaten: MutPtr<UInt>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(pbc.rawAddress.toString(), szdisplayname.rawAddress.toString(), pcheaten.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonObtainUserAgentString(dwoption.toInt(), pszuaout.rawAddress.toString(), cbsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>, ppbscbprev: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(pbc.rawAddress.toString(), pbscb.rawAddress.toString(), ppbscbprev.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(pbc.rawAddress.toString(), pefetc.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypeClass(pbc: MutPtr<CVoid>, ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgclsid: ConstPtr<Guid>, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(pbc.rawAddress.toString(), ctypes.toInt(), rgsztypes.rawAddress.toString(), rgclsid.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgcftypes: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(ctypes.toInt(), rgsztypes.rawAddress.toString(), rgcftypes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseBindInfo(pbindinfo: MutPtr<Bindinfo>) {
    if (windowsWin32SystemComUrlmonNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComUrlmonReleaseBindInfo(pbindinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revokeBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(pbc.rawAddress.toString(), pbscb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(pbc.rawAddress.toString(), pefetc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(hobject.rawAddress.toString(), ieobjecttype, dwaccessmask.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(szdistunit.rawAddress.toString(), dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), cchfilename.toInt(), param4.toInt(), param5.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), cchfilename.toInt(), param4.toInt(), param5.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLOpenStreamA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonURLOpenStreamW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbufferlengthout: MutPtr<UInt>, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(dwoption.toInt(), pbuffer.rawAddress.toString(), dwbufferlength.toInt(), pdwbufferlengthout.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(dwoption.toInt(), pbuffer.rawAddress.toString(), dwbufferlength.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeHitLogging(lplogginginfo: ConstPtr<HitLoggingInfo>): Bool =
    if (windowsWin32SystemComUrlmonNapiAvailable) wasmWindowssysWindowsWin32SystemComUrlmonWriteHitLogging(lplogginginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
