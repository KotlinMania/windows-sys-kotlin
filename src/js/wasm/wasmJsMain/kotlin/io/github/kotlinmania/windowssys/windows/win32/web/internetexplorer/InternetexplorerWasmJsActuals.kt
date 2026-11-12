@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
private external fun initWindowsWin32WebInternetexplorerNapiAddon(): Boolean

private val windowsWin32WebInternetexplorerNapiAvailable: Boolean = initWindowsWin32WebInternetexplorerNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerComputeInvCMAP(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerComputeInvCMAP(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerCreateMIMEMap(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerCreateMIMEMap(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerDecodeImage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerDecodeImage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerDecodeImageEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerDecodeImageEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerDitherTo8(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerDitherTo8(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: Int, p9: Int, p10: Int, p11: Int, p12: Int, p13: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIECancelSaveFile(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIECancelSaveFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIECreateDirectory(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIECreateDirectory(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIECreateFile(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIECreateFile(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEDeleteFile(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEDeleteFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEFindFirstFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEFindFirstFile(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled()")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing()")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIELaunchURL(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIELaunchURL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEMoveFileEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEMoveFileEx(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy()")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy(): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIERegSetValueEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIERegSetValueEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIERemoveDirectory(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIERemoveDirectory(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIESaveFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIESaveFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled()")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingEnable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingEnable(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingEnableW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingEnableW(p0: String, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery()")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingEnabledQuery(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingFreeDetails(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingFreeDetails(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingInit()")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingInit(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingObtainCancel(p0)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingObtainCancel(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingObtainQuery(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingObtainQuery(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingSetupUI(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingSetupUI(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerRatingSetupUIW(p0, p1)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerRatingSetupUIW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32WebInternetexplorerSniffStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32WebInternetexplorerSniffStream(p0: String, p1: String, p2: String): Int

public actual fun computeInvCMAP(prgbcolors: ConstPtr, ncolors: UInt, pinvtable: MutPtr, cbtable: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerComputeInvCMAP(prgbcolors.rawAddress.toString(), ncolors.toInt(), pinvtable.rawAddress.toString(), cbtable.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMIMEMap(ppmap: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerCreateMIMEMap(ppmap.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImage(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerDecodeImage(pstream.rawAddress.toString(), pmap.rawAddress.toString(), peventsink.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImageEx(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr, pszmimetypeparam: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerDecodeImageEx(pstream.rawAddress.toString(), pmap.rawAddress.toString(), peventsink.rawAddress.toString(), pszmimetypeparam.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ditherTo8(pdestbits: MutPtr, ndestpitch: Int, psrcbits: MutPtr, nsrcpitch: Int, bfidsrc: ConstPtr, prgbdestcolors: MutPtr, prgbsrccolors: MutPtr, pbdestinvmap: MutPtr, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerDitherTo8(pdestbits.rawAddress.toString(), ndestpitch, psrcbits.rawAddress.toString(), nsrcpitch, bfidsrc.rawAddress.toString(), prgbdestcolors.rawAddress.toString(), prgbsrccolors.rawAddress.toString(), pbdestinvmap.rawAddress.toString(), x, y, cx, cy, ldesttrans, lsrctrans) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaxMIMEIDBytes(pnmaxbytes: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(pnmaxbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIECancelSaveFile(hstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIECreateDirectory(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    if (windowsWin32WebInternetexplorerNapiAvailable) MutPtr(wasmWindowssysWindowsWin32WebInternetexplorerIECreateFile(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEDeleteFile(lpfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: ConstPtr): Handle =
    if (windowsWin32WebInternetexplorerNapiAvailable) MutPtr(wasmWindowssysWindowsWin32WebInternetexplorerIEFindFirstFile(lpfilename.rawAddress.toString(), lpfindfiledata.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: ConstPtr): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), pcchcookiedata.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableFolderPath(clsidfolderid: ConstPtr, lppwstrpath: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(clsidfolderid.rawAddress.toString(), lppwstrpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableLowHKCU(phkey: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInPrivateFilteringEnabled(): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsInPrivateBrowsing(): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeProcess(pbresult: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(pbresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(lpwstrurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: MutPtr, lpinfo: ConstPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIELaunchURL(lpwstrurl.rawAddress.toString(), lpprocinfo.rawAddress.toString(), lpinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEMoveFileEx(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERefreshElevationPolicy(): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIERegSetValueEx(lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), reserved.toInt(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbmaxdata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIERemoveDirectory(lppathname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIESaveFile(hstate.rawAddress.toString(), lpwstrsourcefile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(hwnd.rawAddress.toString(), lpwstrfilename.rawAddress.toString(), cchmaxfilename.toInt(), lpwstrinitialdir.rawAddress.toString(), lpwstrfilter.rawAddress.toString(), lpwstrdefext.rawAddress.toString(), dwfilterindex.toInt(), dwflags.toInt(), phfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: MutPtr, phstate: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(hwnd.rawAddress.toString(), lpwstrinitialfilename.rawAddress.toString(), lpwstrinitialdir.rawAddress.toString(), lpwstrfilter.rawAddress.toString(), lpwstrdefext.rawAddress.toString(), dwfilterindex.toInt(), dwflags.toInt(), lppwstrdestinationfilepath.rawAddress.toString(), phstate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iETrackingProtectionEnabled(): Bool =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun identifyMIMEType(pbbytes: ConstPtr, nbytes: UInt, pnformat: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(pbbytes.rawAddress.toString(), nbytes.toInt(), pnformat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pszcontentdescription.rawAddress.toString(), pratingdetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pratingdetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pratingdetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pszcontentdescription.rawAddress.toString(), pratingdetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: MutPtr, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(hdlg.rawAddress.toString(), cbpasswordblob.toInt(), pbpasswordblob.rawAddress.toString(), lpszurl.rawAddress.toString(), falwaysnever, fsitepage, fapprovedsitesenforced) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(pszusername.rawAddress.toString(), pszurl.rawAddress.toString(), pszratinginfo.rawAddress.toString(), pdata.rawAddress.toString(), cbdata.toInt(), ppratingdetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(pszusername.rawAddress.toString(), pszurl.rawAddress.toString(), pszratinginfo.rawAddress.toString(), pdata.rawAddress.toString(), cbdata.toInt(), ppratingdetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(hwndowner.rawAddress.toString(), param1.rawAddress.toString(), lpszfilename.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(hwndowner.rawAddress.toString(), param1.rawAddress.toString(), lpszfilename.rawAddress.toString(), nshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingEnable(hwndparent.rawAddress.toString(), pszusername.rawAddress.toString(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingEnableW(hwndparent.rawAddress.toString(), pszusername.rawAddress.toString(), fenable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnabledQuery(): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingEnabledQuery() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingFreeDetails(pratingdetails: ConstPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingFreeDetails(pratingdetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingInit(): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingInit() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingObtainCancel(hratingobtainquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingObtainQuery(psztargeturl.rawAddress.toString(), dwuserdata.toInt(), fcallback.toString(), phratingobtainquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(psztargeturl.rawAddress.toString(), dwuserdata.toInt(), fcallback.toString(), phratingobtainquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingSetupUI(hdlg.rawAddress.toString(), pszusername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerRatingSetupUIW(hdlg.rawAddress.toString(), pszusername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniffStream(pinstream: MutPtr, pnformat: MutPtr, ppoutstream: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAvailable) wasmWindowssysWindowsWin32WebInternetexplorerSniffStream(pinstream.rawAddress.toString(), pnformat.rawAddress.toString(), ppoutstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
