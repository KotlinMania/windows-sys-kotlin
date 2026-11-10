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

private object WindowsWin32WebInternetexplorerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_computeInvCMAP(prgbcolors: Long, ncolors: Int, pinvtable: Long, cbtable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_createMIMEMap(ppmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_decodeImage(pstream: Long, pmap: Long, peventsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_decodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ditherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes(pnmaxbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iECancelSaveFile(hstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iECreateDirectory(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iECreateFile(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEDeleteFile(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEFindFirstFile(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, pcchcookiedata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU(phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess(pbresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL(lpwstrurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iELaunchURL(lpwstrurl: Long, lpprocinfo: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEMoveFileEx(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx(lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iERegSetValueEx(lpsubkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iERemoveDirectory(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iESaveFile(hstate: Long, lpwstrsourcefile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog(hwnd: Long, lpwstrfilename: Long, cchmaxfilename: Int, lpwstrinitialdir: Long, lpwstrfilter: Long, lpwstrdefext: Long, dwfilterindex: Int, dwflags: Int, phfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog(hwnd: Long, lpwstrinitialfilename: Long, lpwstrinitialdir: Long, lpwstrfilter: Long, lpwstrdefext: Long, dwfilterindex: Int, dwflags: Int, lppwstrdestinationfilepath: Long, phstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_identifyMIMEType(pbbytes: Long, nbytes: Int, pnformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog(hdlg: Long, pszusername: Long, pszcontentdescription: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2(hdlg: Long, pszusername: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W(hdlg: Long, pszusername: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW(hdlg: Long, pszusername: Long, pszcontentdescription: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites(hdlg: Long, cbpasswordblob: Int, pbpasswordblob: Long, lpszurl: Long, falwaysnever: Int, fsitepage: Int, fapprovedsitesenforced: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess(pszusername: Long, pszurl: Long, pszratinginfo: Long, pdata: Long, cbdata: Int, ppratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW(pszusername: Long, pszurl: Long, pszratinginfo: Long, pdata: Long, cbdata: Int, ppratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal(hwndowner: Long, param1: Long, lpszfilename: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal(hwndowner: Long, param1: Long, lpszfilename: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingEnable(hwndparent: Long, pszusername: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingEnableW(hwndparent: Long, pszusername: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingFreeDetails(pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingObtainCancel(hratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingObtainQuery(psztargeturl: Long, dwuserdata: Int, fcallback: Long, phratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW(psztargeturl: Long, dwuserdata: Int, fcallback: Long, phratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingSetupUI(hdlg: Long, pszusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ratingSetupUIW(hdlg: Long, pszusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_sniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): Int
}

public actual fun computeInvCMAP(prgbcolors: COpaquePointer?, ncolors: UInt, pinvtable: COpaquePointer?, cbtable: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_computeInvCMAP((prgbcolors?.value ?: 0L), ncolors.toInt(), (pinvtable?.value ?: 0L), cbtable.toInt())

public actual fun createMIMEMap(ppmap: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_createMIMEMap((ppmap?.value ?: 0L))

public actual fun decodeImage(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_decodeImage((pstream?.value ?: 0L), (pmap?.value ?: 0L), (peventsink?.value ?: 0L))

public actual fun decodeImageEx(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?, pszmimetypeparam: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_decodeImageEx((pstream?.value ?: 0L), (pmap?.value ?: 0L), (peventsink?.value ?: 0L), (pszmimetypeparam?.value ?: 0L))

public actual fun ditherTo8(pdestbits: COpaquePointer?, ndestpitch: Int, psrcbits: COpaquePointer?, nsrcpitch: Int, bfidsrc: COpaquePointer?, prgbdestcolors: COpaquePointer?, prgbsrccolors: COpaquePointer?, pbdestinvmap: COpaquePointer?, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ditherTo8((pdestbits?.value ?: 0L), ndestpitch, (psrcbits?.value ?: 0L), nsrcpitch, (bfidsrc?.value ?: 0L), (prgbdestcolors?.value ?: 0L), (prgbsrccolors?.value ?: 0L), (pbdestinvmap?.value ?: 0L), x, y, cx, cy, ldesttrans, lsrctrans)

public actual fun getMaxMIMEIDBytes(pnmaxbytes: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes((pnmaxbytes?.value ?: 0L))

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iECancelSaveFile((hstate?.value ?: 0L))

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iECreateDirectory((lppathname?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iECreateFile((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEDeleteFile((lpfilename?.value ?: 0L))

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEFindFirstFile((lpfilename?.value ?: 0L), (lpfindfiledata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx((lpfilename?.value ?: 0L), finfolevelid, (lpfileinformation?.value ?: 0L))

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), (pcchcookiedata?.value ?: 0L), dwflags.toInt())

public actual fun iEGetWriteableFolderPath(clsidfolderid: COpaquePointer?, lppwstrpath: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath((clsidfolderid?.value ?: 0L), (lppwstrpath?.value ?: 0L))

public actual fun iEGetWriteableLowHKCU(phkey: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU((phkey?.value ?: 0L))

public actual fun iEInPrivateFilteringEnabled(): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled()

public actual fun iEIsInPrivateBrowsing(): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing()

public actual fun iEIsProtectedModeProcess(pbresult: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess((pbresult?.value ?: 0L))

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL((lpwstrurl?.value ?: 0L))

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: COpaquePointer?, lpinfo: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iELaunchURL((lpwstrurl?.value ?: 0L), (lpprocinfo?.value ?: 0L), (lpinfo?.value ?: 0L))

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEMoveFileEx((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), dwflags.toInt())

public actual fun iERefreshElevationPolicy(): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy()

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx((lpsubkey?.value ?: 0L), reserved.toInt(), (lpclass?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L), (phkresult?.value ?: 0L), (lpdwdisposition?.value ?: 0L))

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iERegSetValueEx((lpsubkey?.value ?: 0L), (lpvaluename?.value ?: 0L), reserved.toInt(), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt())

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    0

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbmaxdata: UInt): Hresult =
    0

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iERemoveDirectory((lppathname?.value ?: 0L))

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iESaveFile((hstate?.value ?: 0L), (lpwstrsourcefile?.value ?: 0L))

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie((lpszurl?.value ?: 0L), (lpszcookiename?.value ?: 0L), (lpszcookiedata?.value ?: 0L), dwflags.toInt())

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog((hwnd?.value ?: 0L), (lpwstrfilename?.value ?: 0L), cchmaxfilename.toInt(), (lpwstrinitialdir?.value ?: 0L), (lpwstrfilter?.value ?: 0L), (lpwstrdefext?.value ?: 0L), dwfilterindex.toInt(), dwflags.toInt(), (phfile?.value ?: 0L))

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: COpaquePointer?, phstate: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog((hwnd?.value ?: 0L), (lpwstrinitialfilename?.value ?: 0L), (lpwstrinitialdir?.value ?: 0L), (lpwstrfilter?.value ?: 0L), (lpwstrdefext?.value ?: 0L), dwfilterindex.toInt(), dwflags.toInt(), (lppwstrdestinationfilepath?.value ?: 0L), (phstate?.value ?: 0L))

public actual fun iETrackingProtectionEnabled(): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled()

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    0

public actual fun identifyMIMEType(pbbytes: COpaquePointer?, nbytes: UInt, pnformat: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_identifyMIMEType((pbbytes?.value ?: 0L), nbytes.toInt(), (pnformat?.value ?: 0L))

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog((hdlg?.value ?: 0L), (pszusername?.value ?: 0L), (pszcontentdescription?.value ?: 0L), (pratingdetails?.value ?: 0L))

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2((hdlg?.value ?: 0L), (pszusername?.value ?: 0L), (pratingdetails?.value ?: 0L))

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W((hdlg?.value ?: 0L), (pszusername?.value ?: 0L), (pratingdetails?.value ?: 0L))

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW((hdlg?.value ?: 0L), (pszusername?.value ?: 0L), (pszcontentdescription?.value ?: 0L), (pratingdetails?.value ?: 0L))

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: COpaquePointer?, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites((hdlg?.value ?: 0L), cbpasswordblob.toInt(), (pbpasswordblob?.value ?: 0L), (lpszurl?.value ?: 0L), falwaysnever, fsitepage, fapprovedsitesenforced)

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess((pszusername?.value ?: 0L), (pszurl?.value ?: 0L), (pszratinginfo?.value ?: 0L), (pdata?.value ?: 0L), cbdata.toInt(), (ppratingdetails?.value ?: 0L))

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW((pszusername?.value ?: 0L), (pszurl?.value ?: 0L), (pszratinginfo?.value ?: 0L), (pdata?.value ?: 0L), cbdata.toInt(), (ppratingdetails?.value ?: 0L))

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal((hwndowner?.value ?: 0L), (param1?.value ?: 0L), (lpszfilename?.value ?: 0L), nshow)

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal((hwndowner?.value ?: 0L), (param1?.value ?: 0L), (lpszfilename?.value ?: 0L), nshow)

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingEnable((hwndparent?.value ?: 0L), (pszusername?.value ?: 0L), fenable)

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingEnableW((hwndparent?.value ?: 0L), (pszusername?.value ?: 0L), fenable)

public actual fun ratingEnabledQuery(): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery()

public actual fun ratingFreeDetails(pratingdetails: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingFreeDetails((pratingdetails?.value ?: 0L))

public actual fun ratingInit(): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingInit()

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingObtainCancel((hratingobtainquery?.value ?: 0L))

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingObtainQuery((psztargeturl?.value ?: 0L), dwuserdata.toInt(), fcallback, (phratingobtainquery?.value ?: 0L))

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW((psztargeturl?.value ?: 0L), dwuserdata.toInt(), fcallback, (phratingobtainquery?.value ?: 0L))

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingSetupUI((hdlg?.value ?: 0L), (pszusername?.value ?: 0L))

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ratingSetupUIW((hdlg?.value ?: 0L), (pszusername?.value ?: 0L))

public actual fun sniffStream(pinstream: COpaquePointer?, pnformat: COpaquePointer?, ppoutstream: COpaquePointer?): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_sniffStream((pinstream?.value ?: 0L), (pnformat?.value ?: 0L), (ppoutstream?.value ?: 0L))
