@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.GetFileexInfoLevels

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32WebInternetexplorerNapiAddon(): Boolean

private val _windowsWin32WebInternetexplorerNapiAvailable: Boolean = _initWindowsWin32WebInternetexplorerNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_computeInvCMAP(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_computeInvCMAP(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_createMIMEMap(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_createMIMEMap(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_decodeImage(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_decodeImage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_decodeImageEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_decodeImageEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ditherTo8(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ditherTo8(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int, p13: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iECancelSaveFile(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iECancelSaveFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iECreateDirectory(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iECreateDirectory(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iECreateFile(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iECreateFile(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEDeleteFile(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEDeleteFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEFindFirstFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEFindFirstFile(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled()")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing()")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iELaunchURL(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iELaunchURL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEMoveFileEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEMoveFileEx(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy()")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iERegSetValueEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iERegSetValueEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iERemoveDirectory(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iERemoveDirectory(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iESaveFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iESaveFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled()")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_identifyMIMEType(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_identifyMIMEType(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingEnable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingEnable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingEnableW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingEnableW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery()")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingFreeDetails(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingFreeDetails(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingInit()")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingInit(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingObtainCancel(p0)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingObtainCancel(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingObtainQuery(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingObtainQuery(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingSetupUI(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingSetupUI(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_ratingSetupUIW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_ratingSetupUIW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_web_internetexplorer_sniffStream(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_web_internetexplorer_sniffStream(p0: String, p1: String, p2: String): Int

public actual fun computeInvCMAP(prgbcolors: COpaquePointer?, ncolors: UInt, pinvtable: COpaquePointer?, cbtable: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_computeInvCMAP((prgbcolors?.value ?: 0L).toString(), ncolors.toInt(), (pinvtable?.value ?: 0L).toString(), cbtable.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMIMEMap(ppmap: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_createMIMEMap((ppmap?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImage(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_decodeImage((pstream?.value ?: 0L).toString(), (pmap?.value ?: 0L).toString(), (peventsink?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImageEx(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?, pszmimetypeparam: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_decodeImageEx((pstream?.value ?: 0L).toString(), (pmap?.value ?: 0L).toString(), (peventsink?.value ?: 0L).toString(), (pszmimetypeparam?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ditherTo8(pdestbits: COpaquePointer?, ndestpitch: Int, psrcbits: COpaquePointer?, nsrcpitch: Int, bfidsrc: COpaquePointer?, prgbdestcolors: COpaquePointer?, prgbsrccolors: COpaquePointer?, pbdestinvmap: COpaquePointer?, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ditherTo8((pdestbits?.value ?: 0L).toString(), ndestpitch, (psrcbits?.value ?: 0L).toString(), nsrcpitch, (bfidsrc?.value ?: 0L).toString(), (prgbdestcolors?.value ?: 0L).toString(), (prgbsrccolors?.value ?: 0L).toString(), (pbdestinvmap?.value ?: 0L).toString(), x, y, cx, cy, ldesttrans, lsrctrans) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaxMIMEIDBytes(pnmaxbytes: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes((pnmaxbytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iECancelSaveFile((hstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iECreateDirectory((lppathname?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iECreateFile((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEDeleteFile((lpfilename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEFindFirstFile((lpfilename?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfileinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), (pcchcookiedata?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableFolderPath(clsidfolderid: COpaquePointer?, lppwstrpath: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath((clsidfolderid?.value ?: 0L).toString(), (lppwstrpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableLowHKCU(phkey: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU((phkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInPrivateFilteringEnabled(): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsInPrivateBrowsing(): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeProcess(pbresult: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess((pbresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL((lpwstrurl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: COpaquePointer?, lpinfo: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iELaunchURL((lpwstrurl?.value ?: 0L).toString(), (lpprocinfo?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEMoveFileEx((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERefreshElevationPolicy(): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx((lpsubkey?.value ?: 0L).toString(), reserved.toInt(), (lpclass?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iERegSetValueEx((lpsubkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), reserved.toInt(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbmaxdata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iERemoveDirectory((lppathname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iESaveFile((hstate?.value ?: 0L).toString(), (lpwstrsourcefile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog((hwnd?.value ?: 0L).toString(), (lpwstrfilename?.value ?: 0L).toString(), cchmaxfilename.toInt(), (lpwstrinitialdir?.value ?: 0L).toString(), (lpwstrfilter?.value ?: 0L).toString(), (lpwstrdefext?.value ?: 0L).toString(), dwfilterindex.toInt(), dwflags.toInt(), (phfile?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: COpaquePointer?, phstate: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog((hwnd?.value ?: 0L).toString(), (lpwstrinitialfilename?.value ?: 0L).toString(), (lpwstrinitialdir?.value ?: 0L).toString(), (lpwstrfilter?.value ?: 0L).toString(), (lpwstrdefext?.value ?: 0L).toString(), dwfilterindex.toInt(), dwflags.toInt(), (lppwstrdestinationfilepath?.value ?: 0L).toString(), (phstate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iETrackingProtectionEnabled(): Bool =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun identifyMIMEType(pbbytes: COpaquePointer?, nbytes: UInt, pnformat: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_identifyMIMEType((pbbytes?.value ?: 0L).toString(), nbytes.toInt(), (pnformat?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pszcontentdescription?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pszcontentdescription?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: COpaquePointer?, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites((hdlg?.value ?: 0L).toString(), cbpasswordblob.toInt(), (pbpasswordblob?.value ?: 0L).toString(), (lpszurl?.value ?: 0L).toString(), falwaysnever, fsitepage, fapprovedsitesenforced) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess((pszusername?.value ?: 0L).toString(), (pszurl?.value ?: 0L).toString(), (pszratinginfo?.value ?: 0L).toString(), (pdata?.value ?: 0L).toString(), cbdata.toInt(), (ppratingdetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW((pszusername?.value ?: 0L).toString(), (pszurl?.value ?: 0L).toString(), (pszratinginfo?.value ?: 0L).toString(), (pdata?.value ?: 0L).toString(), cbdata.toInt(), (ppratingdetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal((hwndowner?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal((hwndowner?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingEnable((hwndparent?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingEnableW((hwndparent?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnabledQuery(): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingFreeDetails(pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingFreeDetails((pratingdetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingInit(): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingObtainCancel((hratingobtainquery?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingObtainQuery((psztargeturl?.value ?: 0L).toString(), dwuserdata.toInt(), fcallback.toString(), (phratingobtainquery?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW((psztargeturl?.value ?: 0L).toString(), dwuserdata.toInt(), fcallback.toString(), (phratingobtainquery?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingSetupUI((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_ratingSetupUIW((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniffStream(pinstream: COpaquePointer?, pnformat: COpaquePointer?, ppoutstream: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAvailable) _wasm_windowssys_windows_win32_web_internetexplorer_sniffStream((pinstream?.value ?: 0L).toString(), (pnformat?.value ?: 0L).toString(), (ppoutstream?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
