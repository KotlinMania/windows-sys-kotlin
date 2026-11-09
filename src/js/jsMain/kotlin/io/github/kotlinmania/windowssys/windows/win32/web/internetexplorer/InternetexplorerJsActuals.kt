@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.GET_FILEEX_INFO_LEVELS

private val _windowsWin32WebInternetexplorerNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ComputeInvCMAP(prgbcolors: Long, ncolors: UInt, pinvtable: Long, cbtable: UInt): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_ComputeInvCMAP(prgbcolors.toString(), ncolors.toInt(), pinvtable.toString(), cbtable.toInt()) as Int) else 0

public actual fun CreateMIMEMap(ppmap: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_CreateMIMEMap(ppmap.toString()) as Int) else 0

public actual fun DecodeImage(pstream: Long, pmap: Long, peventsink: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_DecodeImage(pstream.toString(), pmap.toString(), peventsink.toString()) as Int) else 0

public actual fun DecodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: PCWSTR): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_DecodeImageEx(pstream.toString(), pmap.toString(), peventsink.toString(), pszmimetypeparam.toString()) as Int) else 0

public actual fun DitherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_DitherTo8(pdestbits.toString(), ndestpitch, psrcbits.toString(), nsrcpitch, bfidsrc.toString(), prgbdestcolors.toString(), prgbsrccolors.toString(), pbdestinvmap.toString(), x, y, cx, cy, ldesttrans, lsrctrans) as Int) else 0

public actual fun GetMaxMIMEIDBytes(pnmaxbytes: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_GetMaxMIMEIDBytes(pnmaxbytes.toString()) as Int) else 0

public actual fun IEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) as Int) else 0

public actual fun IECancelSaveFile(hstate: HANDLE): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IECancelSaveFile(hstate.toString()) as Int) else 0

public actual fun IECreateDirectory(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IECreateDirectory(lppathname.toString(), lpsecurityattributes.toString()) as Int) else 0

public actual fun IECreateFile(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IECreateFile(lpfilename.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.toString()) as String).toLong() else 0L

public actual fun IEDeleteFile(lpfilename: PCWSTR): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEDeleteFile(lpfilename.toString()) as Int) else 0

public actual fun IEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt()) as Int) else 0

public actual fun IEFindFirstFile(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEFindFirstFile(lpfilename.toString(), lpfindfiledata.toString()) as String).toLong() else 0L

public actual fun IEGetFileAttributesEx(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEGetFileAttributesEx(lpfilename.toString(), finfolevelid, lpfileinformation.toString()) as Int) else 0

public actual fun IEGetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, pcchcookiedata: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEGetProtectedModeCookie(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), pcchcookiedata.toString(), dwflags.toInt()) as Int) else 0

public actual fun IEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEGetWriteableFolderPath(clsidfolderid.toString(), lppwstrpath.toString()) as Int) else 0

public actual fun IEGetWriteableLowHKCU(phkey: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEGetWriteableLowHKCU(phkey.toString()) as Int) else 0

public actual fun IEInPrivateFilteringEnabled(): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEInPrivateFilteringEnabled() as Int) else 0

public actual fun IEIsInPrivateBrowsing(): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEIsInPrivateBrowsing() as Int) else 0

public actual fun IEIsProtectedModeProcess(pbresult: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeProcess(pbresult.toString()) as Int) else 0

public actual fun IEIsProtectedModeURL(lpwstrurl: PCWSTR): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeURL(lpwstrurl.toString()) as Int) else 0

public actual fun IELaunchURL(lpwstrurl: PCWSTR, lpprocinfo: Long, lpinfo: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IELaunchURL(lpwstrurl.toString(), lpprocinfo.toString(), lpinfo.toString()) as Int) else 0

public actual fun IEMoveFileEx(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: UInt): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEMoveFileEx(lpexistingfilename.toString(), lpnewfilename.toString(), dwflags.toInt()) as Int) else 0

public actual fun IERefreshElevationPolicy(): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IERefreshElevationPolicy() as Int) else 0

public actual fun IERegCreateKeyEx(lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IERegCreateKeyEx(lpsubkey.toString(), reserved.toInt(), lpclass.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.toString(), phkresult.toString(), lpdwdisposition.toString()) as Int) else 0

public actual fun IERegSetValueEx(lpsubkey: PCWSTR, lpvaluename: PCWSTR, reserved: UInt, dwtype: UInt, lpdata: Long, cbdata: UInt): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IERegSetValueEx(lpsubkey.toString(), lpvaluename.toString(), reserved.toInt(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int) else 0

public actual fun IERegisterWritableRegistryKey(guid: GUID, lpsubkey: PCWSTR, fsubkeyallowed: BOOL): HRESULT =
    0

public actual fun IERegisterWritableRegistryValue(guid: GUID, lppath: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbmaxdata: UInt): HRESULT =
    0

public actual fun IERemoveDirectory(lppathname: PCWSTR): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IERemoveDirectory(lppathname.toString()) as Int) else 0

public actual fun IESaveFile(hstate: HANDLE, lpwstrsourcefile: PCWSTR): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IESaveFile(hstate.toString(), lpwstrsourcefile.toString()) as Int) else 0

public actual fun IESetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IESetProtectedModeCookie(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), dwflags.toInt()) as Int) else 0

public actual fun IEShowOpenFileDialog(hwnd: HWND, lpwstrfilename: PWSTR, cchmaxfilename: UInt, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, phfile: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEShowOpenFileDialog(hwnd.toString(), lpwstrfilename.toString(), cchmaxfilename.toInt(), lpwstrinitialdir.toString(), lpwstrfilter.toString(), lpwstrdefext.toString(), dwfilterindex.toInt(), dwflags.toInt(), phfile.toString()) as Int) else 0

public actual fun IEShowSaveFileDialog(hwnd: HWND, lpwstrinitialfilename: PCWSTR, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: Long, phstate: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IEShowSaveFileDialog(hwnd.toString(), lpwstrinitialfilename.toString(), lpwstrinitialdir.toString(), lpwstrfilter.toString(), lpwstrdefext.toString(), dwfilterindex.toInt(), dwflags.toInt(), lppwstrdestinationfilepath.toString(), phstate.toString()) as Int) else 0

public actual fun IETrackingProtectionEnabled(): BOOL =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IETrackingProtectionEnabled() as Int) else 0

public actual fun IEUnregisterWritableRegistry(guid: GUID): HRESULT =
    0

public actual fun IdentifyMIMEType(pbbytes: Long, nbytes: UInt, pnformat: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_IdentifyMIMEType(pbbytes.toString(), nbytes.toInt(), pnformat.toString()) as Int) else 0

public actual fun RatingAccessDeniedDialog(hdlg: HWND, pszusername: PCSTR, pszcontentdescription: PCSTR, pratingdetails: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog(hdlg.toString(), pszusername.toString(), pszcontentdescription.toString(), pratingdetails.toString()) as Int) else 0

public actual fun RatingAccessDeniedDialog2(hdlg: HWND, pszusername: PCSTR, pratingdetails: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2(hdlg.toString(), pszusername.toString(), pratingdetails.toString()) as Int) else 0

public actual fun RatingAccessDeniedDialog2W(hdlg: HWND, pszusername: PCWSTR, pratingdetails: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2W(hdlg.toString(), pszusername.toString(), pratingdetails.toString()) as Int) else 0

public actual fun RatingAccessDeniedDialogW(hdlg: HWND, pszusername: PCWSTR, pszcontentdescription: PCWSTR, pratingdetails: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialogW(hdlg.toString(), pszusername.toString(), pszcontentdescription.toString(), pratingdetails.toString()) as Int) else 0

public actual fun RatingAddToApprovedSites(hdlg: HWND, cbpasswordblob: UInt, pbpasswordblob: Long, lpszurl: PCWSTR, falwaysnever: BOOL, fsitepage: BOOL, fapprovedsitesenforced: BOOL): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingAddToApprovedSites(hdlg.toString(), cbpasswordblob.toInt(), pbpasswordblob.toString(), lpszurl.toString(), falwaysnever, fsitepage, fapprovedsitesenforced) as Int) else 0

public actual fun RatingCheckUserAccess(pszusername: PCSTR, pszurl: PCSTR, pszratinginfo: PCSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccess(pszusername.toString(), pszurl.toString(), pszratinginfo.toString(), pdata.toString(), cbdata.toInt(), ppratingdetails.toString()) as Int) else 0

public actual fun RatingCheckUserAccessW(pszusername: PCWSTR, pszurl: PCWSTR, pszratinginfo: PCWSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccessW(pszusername.toString(), pszurl.toString(), pszratinginfo.toString(), pdata.toString(), cbdata.toInt(), ppratingdetails.toString()) as Int) else 0

public actual fun RatingClickedOnPRFInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingClickedOnPRFInternal(hwndowner.toString(), param1.toString(), lpszfilename.toString(), nshow) as Int) else 0

public actual fun RatingClickedOnRATInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingClickedOnRATInternal(hwndowner.toString(), param1.toString(), lpszfilename.toString(), nshow) as Int) else 0

public actual fun RatingEnable(hwndparent: HWND, pszusername: PCSTR, fenable: BOOL): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingEnable(hwndparent.toString(), pszusername.toString(), fenable) as Int) else 0

public actual fun RatingEnableW(hwndparent: HWND, pszusername: PCWSTR, fenable: BOOL): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingEnableW(hwndparent.toString(), pszusername.toString(), fenable) as Int) else 0

public actual fun RatingEnabledQuery(): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingEnabledQuery() as Int) else 0

public actual fun RatingFreeDetails(pratingdetails: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingFreeDetails(pratingdetails.toString()) as Int) else 0

public actual fun RatingInit(): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingInit() as Int) else 0

public actual fun RatingObtainCancel(hratingobtainquery: HANDLE): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingObtainCancel(hratingobtainquery.toString()) as Int) else 0

public actual fun RatingObtainQuery(psztargeturl: PCSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingObtainQuery(psztargeturl.toString(), dwuserdata.toInt(), fcallback.toString(), phratingobtainquery.toString()) as Int) else 0

public actual fun RatingObtainQueryW(psztargeturl: PCWSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingObtainQueryW(psztargeturl.toString(), dwuserdata.toInt(), fcallback.toString(), phratingobtainquery.toString()) as Int) else 0

public actual fun RatingSetupUI(hdlg: HWND, pszusername: PCSTR): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingSetupUI(hdlg.toString(), pszusername.toString()) as Int) else 0

public actual fun RatingSetupUIW(hdlg: HWND, pszusername: PCWSTR): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_RatingSetupUIW(hdlg.toString(), pszusername.toString()) as Int) else 0

public actual fun SniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): HRESULT =
    if (_windowsWin32WebInternetexplorerNapiAddon != null) (_windowsWin32WebInternetexplorerNapiAddon.windowssys_windows_win32_web_internetexplorer_SniffStream(pinstream.toString(), pnformat.toString(), ppoutstream.toString()) as Int) else 0
