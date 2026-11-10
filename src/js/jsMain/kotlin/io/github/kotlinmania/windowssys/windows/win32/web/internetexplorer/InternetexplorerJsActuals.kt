@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32WebInternetexplorerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun computeInvCMAP(prgbcolors: COpaquePointer?, ncolors: UInt, pinvtable: COpaquePointer?, cbtable: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_computeInvCMAP((prgbcolors?.value ?: 0L).toString(), ncolors.toInt(), (pinvtable?.value ?: 0L).toString(), cbtable.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMIMEMap(ppmap: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_createMIMEMap((ppmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImage(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_decodeImage((pstream?.value ?: 0L).toString(), (pmap?.value ?: 0L).toString(), (peventsink?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decodeImageEx(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?, pszmimetypeparam: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_decodeImageEx((pstream?.value ?: 0L).toString(), (pmap?.value ?: 0L).toString(), (peventsink?.value ?: 0L).toString(), (pszmimetypeparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ditherTo8(pdestbits: COpaquePointer?, ndestpitch: Int, psrcbits: COpaquePointer?, nsrcpitch: Int, bfidsrc: COpaquePointer?, prgbdestcolors: COpaquePointer?, prgbsrccolors: COpaquePointer?, pbdestinvmap: COpaquePointer?, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ditherTo8((pdestbits?.value ?: 0L).toString(), ndestpitch, (psrcbits?.value ?: 0L).toString(), nsrcpitch, (bfidsrc?.value ?: 0L).toString(), (prgbdestcolors?.value ?: 0L).toString(), (prgbsrccolors?.value ?: 0L).toString(), (pbdestinvmap?.value ?: 0L).toString(), x, y, cx, cy, ldesttrans, lsrctrans) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMaxMIMEIDBytes(pnmaxbytes: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes((pnmaxbytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iECancelSaveFile((hstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iECreateDirectory((lppathname?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iECreateFile((lpfilename?.value ?: 0L).toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEDeleteFile((lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEFindFirstFile((lpfilename?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx((lpfilename?.value ?: 0L).toString(), finfolevelid, (lpfileinformation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), (pcchcookiedata?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableFolderPath(clsidfolderid: COpaquePointer?, lppwstrpath: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath((clsidfolderid?.value ?: 0L).toString(), (lppwstrpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetWriteableLowHKCU(phkey: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU((phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInPrivateFilteringEnabled(): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsInPrivateBrowsing(): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeProcess(pbresult: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess((pbresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL((lpwstrurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: COpaquePointer?, lpinfo: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iELaunchURL((lpwstrurl?.value ?: 0L).toString(), (lpprocinfo?.value ?: 0L).toString(), (lpinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEMoveFileEx((lpexistingfilename?.value ?: 0L).toString(), (lpnewfilename?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERefreshElevationPolicy(): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx((lpsubkey?.value ?: 0L).toString(), reserved.toInt(), (lpclass?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iERegSetValueEx((lpsubkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), reserved.toInt(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbmaxdata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iERemoveDirectory((lppathname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iESaveFile((hstate?.value ?: 0L).toString(), (lpwstrsourcefile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog((hwnd?.value ?: 0L).toString(), (lpwstrfilename?.value ?: 0L).toString(), cchmaxfilename.toInt(), (lpwstrinitialdir?.value ?: 0L).toString(), (lpwstrfilter?.value ?: 0L).toString(), (lpwstrdefext?.value ?: 0L).toString(), dwfilterindex.toInt(), dwflags.toInt(), (phfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: COpaquePointer?, phstate: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog((hwnd?.value ?: 0L).toString(), (lpwstrinitialfilename?.value ?: 0L).toString(), (lpwstrinitialdir?.value ?: 0L).toString(), (lpwstrfilter?.value ?: 0L).toString(), (lpwstrdefext?.value ?: 0L).toString(), dwfilterindex.toInt(), dwflags.toInt(), (lppwstrdestinationfilepath?.value ?: 0L).toString(), (phstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iETrackingProtectionEnabled(): Bool =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun identifyMIMEType(pbbytes: COpaquePointer?, nbytes: UInt, pnformat: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_identifyMIMEType((pbbytes?.value ?: 0L).toString(), nbytes.toInt(), (pnformat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pszcontentdescription?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), (pszcontentdescription?.value ?: 0L).toString(), (pratingdetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: COpaquePointer?, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites((hdlg?.value ?: 0L).toString(), cbpasswordblob.toInt(), (pbpasswordblob?.value ?: 0L).toString(), (lpszurl?.value ?: 0L).toString(), falwaysnever, fsitepage, fapprovedsitesenforced) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess((pszusername?.value ?: 0L).toString(), (pszurl?.value ?: 0L).toString(), (pszratinginfo?.value ?: 0L).toString(), (pdata?.value ?: 0L).toString(), cbdata.toInt(), (ppratingdetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW((pszusername?.value ?: 0L).toString(), (pszurl?.value ?: 0L).toString(), (pszratinginfo?.value ?: 0L).toString(), (pdata?.value ?: 0L).toString(), cbdata.toInt(), (ppratingdetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal((hwndowner?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal((hwndowner?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), nshow) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingEnable((hwndparent?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingEnableW((hwndparent?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingEnabledQuery(): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingFreeDetails(pratingdetails: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingFreeDetails((pratingdetails?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingInit(): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingInit() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingObtainCancel((hratingobtainquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingObtainQuery((psztargeturl?.value ?: 0L).toString(), dwuserdata.toInt(), fcallback.toString(), (phratingobtainquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW((psztargeturl?.value ?: 0L).toString(), dwuserdata.toInt(), fcallback.toString(), (phratingobtainquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingSetupUI((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ratingSetupUIW((hdlg?.value ?: 0L).toString(), (pszusername?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sniffStream(pinstream: COpaquePointer?, pnformat: COpaquePointer?, ppoutstream: COpaquePointer?): Hresult =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_sniffStream((pinstream?.value ?: 0L).toString(), (pnformat?.value ?: 0L).toString(), (ppoutstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
