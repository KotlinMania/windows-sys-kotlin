@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32WebInternetexplorerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun computeInvCMAP(prgbcolors: ConstPtr, ncolors: UInt, pinvtable: MutPtr, cbtable: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerComputeInvCMAP(prgbcolors.rawAddress.toString(), ncolors.toInt(), pinvtable.rawAddress.toString(), cbtable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMIMEMap(ppmap: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerCreateMIMEMap(ppmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImage(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerDecodeImage(pstream.rawAddress.toString(), pmap.rawAddress.toString(), peventsink.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImageEx(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr, pszmimetypeparam: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerDecodeImageEx(pstream.rawAddress.toString(), pmap.rawAddress.toString(), peventsink.rawAddress.toString(), pszmimetypeparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ditherTo8(pdestbits: MutPtr, ndestpitch: Int, psrcbits: MutPtr, nsrcpitch: Int, bfidsrc: ConstPtr, prgbdestcolors: MutPtr, prgbsrccolors: MutPtr, pbdestinvmap: MutPtr, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerDitherTo8(pdestbits.rawAddress.toString(), ndestpitch, psrcbits.rawAddress.toString(), nsrcpitch, bfidsrc.rawAddress.toString(), prgbdestcolors.rawAddress.toString(), prgbsrccolors.rawAddress.toString(), pbdestinvmap.rawAddress.toString(), x, y, cx, cy, ldesttrans, lsrctrans) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaxMIMEIDBytes(pnmaxbytes: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(pnmaxbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIECancelSaveFile(hstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIECreateDirectory(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    if (windowsWin32WebInternetexplorerNapiAddon != null) MutPtr((windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIECreateFile(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEDeleteFile(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: ConstPtr): Handle =
    if (windowsWin32WebInternetexplorerNapiAddon != null) MutPtr((windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEFindFirstFile(lpfilename.rawAddress.toString(), lpfindfiledata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: ConstPtr): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), pcchcookiedata.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableFolderPath(clsidfolderid: ConstPtr, lppwstrpath: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(clsidfolderid.rawAddress.toString(), lppwstrpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableLowHKCU(phkey: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInPrivateFilteringEnabled(): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsInPrivateBrowsing(): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeProcess(pbresult: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(pbresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(lpwstrurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: MutPtr, lpinfo: ConstPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIELaunchURL(lpwstrurl.rawAddress.toString(), lpprocinfo.rawAddress.toString(), lpinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEMoveFileEx(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERefreshElevationPolicy(): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIERegSetValueEx(lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), reserved.toInt(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbmaxdata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIERemoveDirectory(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIESaveFile(hstate.rawAddress.toString(), lpwstrsourcefile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(hwnd.rawAddress.toString(), lpwstrfilename.rawAddress.toString(), cchmaxfilename.toInt(), lpwstrinitialdir.rawAddress.toString(), lpwstrfilter.rawAddress.toString(), lpwstrdefext.rawAddress.toString(), dwfilterindex.toInt(), dwflags.toInt(), phfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: MutPtr, phstate: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(hwnd.rawAddress.toString(), lpwstrinitialfilename.rawAddress.toString(), lpwstrinitialdir.rawAddress.toString(), lpwstrfilter.rawAddress.toString(), lpwstrdefext.rawAddress.toString(), dwfilterindex.toInt(), dwflags.toInt(), lppwstrdestinationfilepath.rawAddress.toString(), phstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iETrackingProtectionEnabled(): Bool =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun identifyMIMEType(pbbytes: ConstPtr, nbytes: UInt, pnformat: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(pbbytes.rawAddress.toString(), nbytes.toInt(), pnformat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pszcontentdescription.rawAddress.toString(), pratingdetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pratingdetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pratingdetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(hdlg.rawAddress.toString(), pszusername.rawAddress.toString(), pszcontentdescription.rawAddress.toString(), pratingdetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: MutPtr, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(hdlg.rawAddress.toString(), cbpasswordblob.toInt(), pbpasswordblob.rawAddress.toString(), lpszurl.rawAddress.toString(), falwaysnever, fsitepage, fapprovedsitesenforced) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(pszusername.rawAddress.toString(), pszurl.rawAddress.toString(), pszratinginfo.rawAddress.toString(), pdata.rawAddress.toString(), cbdata.toInt(), ppratingdetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(pszusername.rawAddress.toString(), pszurl.rawAddress.toString(), pszratinginfo.rawAddress.toString(), pdata.rawAddress.toString(), cbdata.toInt(), ppratingdetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(hwndowner.rawAddress.toString(), param1.rawAddress.toString(), lpszfilename.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(hwndowner.rawAddress.toString(), param1.rawAddress.toString(), lpszfilename.rawAddress.toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingEnable(hwndparent.rawAddress.toString(), pszusername.rawAddress.toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingEnableW(hwndparent.rawAddress.toString(), pszusername.rawAddress.toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnabledQuery(): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingFreeDetails(pratingdetails: ConstPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingFreeDetails(pratingdetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingInit(): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingObtainCancel(hratingobtainquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingObtainQuery(psztargeturl.rawAddress.toString(), dwuserdata.toInt(), fcallback.toString(), phratingobtainquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(psztargeturl.rawAddress.toString(), dwuserdata.toInt(), fcallback.toString(), phratingobtainquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingSetupUI(hdlg.rawAddress.toString(), pszusername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerRatingSetupUIW(hdlg.rawAddress.toString(), pszusername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniffStream(pinstream: MutPtr, pnformat: MutPtr, ppoutstream: MutPtr): Hresult =
    if (windowsWin32WebInternetexplorerNapiAddon != null) (windowsWin32WebInternetexplorerNapiAddon.windowssysWindowsWin32WebInternetexplorerSniffStream(pinstream.rawAddress.toString(), pnformat.rawAddress.toString(), ppoutstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
