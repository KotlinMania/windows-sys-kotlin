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

private object WindowsWin32WebInternetexplorerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_ComputeInvCMAP(prgbcolors: Long, ncolors: Int, pinvtable: Long, cbtable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_CreateMIMEMap(ppmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_DecodeImage(pstream: Long, pmap: Long, peventsink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_DecodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_DitherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_GetMaxMIMEIDBytes(pnmaxbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEAssociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IECancelSaveFile(hstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IECreateDirectory(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IECreateFile(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEDeleteFile(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEDisassociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEFindFirstFile(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEGetFileAttributesEx(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEGetProtectedModeCookie(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, pcchcookiedata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEGetWriteableLowHKCU(phkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEInPrivateFilteringEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEIsInPrivateBrowsing(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeProcess(pbresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeURL(lpwstrurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IELaunchURL(lpwstrurl: Long, lpprocinfo: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEMoveFileEx(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IERefreshElevationPolicy(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IERegCreateKeyEx(lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IERegSetValueEx(lpsubkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IERemoveDirectory(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IESaveFile(hstate: Long, lpwstrsourcefile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IESetProtectedModeCookie(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEShowOpenFileDialog(hwnd: Long, lpwstrfilename: Long, cchmaxfilename: Int, lpwstrinitialdir: Long, lpwstrfilter: Long, lpwstrdefext: Long, dwfilterindex: Int, dwflags: Int, phfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IEShowSaveFileDialog(hwnd: Long, lpwstrinitialfilename: Long, lpwstrinitialdir: Long, lpwstrfilter: Long, lpwstrdefext: Long, dwfilterindex: Int, dwflags: Int, lppwstrdestinationfilepath: Long, phstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IETrackingProtectionEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_IdentifyMIMEType(pbbytes: Long, nbytes: Int, pnformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog(hdlg: Long, pszusername: Long, pszcontentdescription: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2(hdlg: Long, pszusername: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2W(hdlg: Long, pszusername: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialogW(hdlg: Long, pszusername: Long, pszcontentdescription: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingAddToApprovedSites(hdlg: Long, cbpasswordblob: Int, pbpasswordblob: Long, lpszurl: Long, falwaysnever: Int, fsitepage: Int, fapprovedsitesenforced: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccess(pszusername: Long, pszurl: Long, pszratinginfo: Long, pdata: Long, cbdata: Int, ppratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccessW(pszusername: Long, pszurl: Long, pszratinginfo: Long, pdata: Long, cbdata: Int, ppratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingClickedOnPRFInternal(hwndowner: Long, param1: Long, lpszfilename: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingClickedOnRATInternal(hwndowner: Long, param1: Long, lpszfilename: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingEnable(hwndparent: Long, pszusername: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingEnableW(hwndparent: Long, pszusername: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingEnabledQuery(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingFreeDetails(pratingdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingObtainCancel(hratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingObtainQuery(psztargeturl: Long, dwuserdata: Int, fcallback: Long, phratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingObtainQueryW(psztargeturl: Long, dwuserdata: Int, fcallback: Long, phratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingSetupUI(hdlg: Long, pszusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_RatingSetupUIW(hdlg: Long, pszusername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_web_internetexplorer_SniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): Int
}

public actual fun ComputeInvCMAP(prgbcolors: Long, ncolors: UInt, pinvtable: Long, cbtable: UInt): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_ComputeInvCMAP(prgbcolors, ncolors.toInt(), pinvtable, cbtable.toInt())

public actual fun CreateMIMEMap(ppmap: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_CreateMIMEMap(ppmap)

public actual fun DecodeImage(pstream: Long, pmap: Long, peventsink: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_DecodeImage(pstream, pmap, peventsink)

public actual fun DecodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: PCWSTR): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_DecodeImageEx(pstream, pmap, peventsink, pszmimetypeparam)

public actual fun DitherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_DitherTo8(pdestbits, ndestpitch, psrcbits, nsrcpitch, bfidsrc, prgbdestcolors, prgbsrccolors, pbdestinvmap, x, y, cx, cy, ldesttrans, lsrctrans)

public actual fun GetMaxMIMEIDBytes(pnmaxbytes: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_GetMaxMIMEIDBytes(pnmaxbytes)

public actual fun IEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun IECancelSaveFile(hstate: HANDLE): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IECancelSaveFile(hstate)

public actual fun IECreateDirectory(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IECreateDirectory(lppathname, lpsecurityattributes)

public actual fun IECreateFile(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IECreateFile(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile)

public actual fun IEDeleteFile(lpfilename: PCWSTR): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEDeleteFile(lpfilename)

public actual fun IEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun IEFindFirstFile(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEFindFirstFile(lpfilename, lpfindfiledata)

public actual fun IEGetFileAttributesEx(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEGetFileAttributesEx(lpfilename, finfolevelid, lpfileinformation)

public actual fun IEGetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, pcchcookiedata: Long, dwflags: UInt): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEGetProtectedModeCookie(lpszurl, lpszcookiename, lpszcookiedata, pcchcookiedata, dwflags.toInt())

public actual fun IEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEGetWriteableFolderPath(clsidfolderid, lppwstrpath)

public actual fun IEGetWriteableLowHKCU(phkey: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEGetWriteableLowHKCU(phkey)

public actual fun IEInPrivateFilteringEnabled(): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEInPrivateFilteringEnabled()

public actual fun IEIsInPrivateBrowsing(): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEIsInPrivateBrowsing()

public actual fun IEIsProtectedModeProcess(pbresult: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeProcess(pbresult)

public actual fun IEIsProtectedModeURL(lpwstrurl: PCWSTR): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeURL(lpwstrurl)

public actual fun IELaunchURL(lpwstrurl: PCWSTR, lpprocinfo: Long, lpinfo: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IELaunchURL(lpwstrurl, lpprocinfo, lpinfo)

public actual fun IEMoveFileEx(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: UInt): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEMoveFileEx(lpexistingfilename, lpnewfilename, dwflags.toInt())

public actual fun IERefreshElevationPolicy(): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IERefreshElevationPolicy()

public actual fun IERegCreateKeyEx(lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IERegCreateKeyEx(lpsubkey, reserved.toInt(), lpclass, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes, phkresult, lpdwdisposition)

public actual fun IERegSetValueEx(lpsubkey: PCWSTR, lpvaluename: PCWSTR, reserved: UInt, dwtype: UInt, lpdata: Long, cbdata: UInt): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IERegSetValueEx(lpsubkey, lpvaluename, reserved.toInt(), dwtype.toInt(), lpdata, cbdata.toInt())

public actual fun IERegisterWritableRegistryKey(guid: GUID, lpsubkey: PCWSTR, fsubkeyallowed: BOOL): HRESULT =
    0

public actual fun IERegisterWritableRegistryValue(guid: GUID, lppath: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbmaxdata: UInt): HRESULT =
    0

public actual fun IERemoveDirectory(lppathname: PCWSTR): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IERemoveDirectory(lppathname)

public actual fun IESaveFile(hstate: HANDLE, lpwstrsourcefile: PCWSTR): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IESaveFile(hstate, lpwstrsourcefile)

public actual fun IESetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IESetProtectedModeCookie(lpszurl, lpszcookiename, lpszcookiedata, dwflags.toInt())

public actual fun IEShowOpenFileDialog(hwnd: HWND, lpwstrfilename: PWSTR, cchmaxfilename: UInt, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, phfile: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEShowOpenFileDialog(hwnd, lpwstrfilename, cchmaxfilename.toInt(), lpwstrinitialdir, lpwstrfilter, lpwstrdefext, dwfilterindex.toInt(), dwflags.toInt(), phfile)

public actual fun IEShowSaveFileDialog(hwnd: HWND, lpwstrinitialfilename: PCWSTR, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: Long, phstate: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IEShowSaveFileDialog(hwnd, lpwstrinitialfilename, lpwstrinitialdir, lpwstrfilter, lpwstrdefext, dwfilterindex.toInt(), dwflags.toInt(), lppwstrdestinationfilepath, phstate)

public actual fun IETrackingProtectionEnabled(): BOOL =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IETrackingProtectionEnabled()

public actual fun IEUnregisterWritableRegistry(guid: GUID): HRESULT =
    0

public actual fun IdentifyMIMEType(pbbytes: Long, nbytes: UInt, pnformat: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_IdentifyMIMEType(pbbytes, nbytes.toInt(), pnformat)

public actual fun RatingAccessDeniedDialog(hdlg: HWND, pszusername: PCSTR, pszcontentdescription: PCSTR, pratingdetails: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog(hdlg, pszusername, pszcontentdescription, pratingdetails)

public actual fun RatingAccessDeniedDialog2(hdlg: HWND, pszusername: PCSTR, pratingdetails: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2(hdlg, pszusername, pratingdetails)

public actual fun RatingAccessDeniedDialog2W(hdlg: HWND, pszusername: PCWSTR, pratingdetails: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2W(hdlg, pszusername, pratingdetails)

public actual fun RatingAccessDeniedDialogW(hdlg: HWND, pszusername: PCWSTR, pszcontentdescription: PCWSTR, pratingdetails: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialogW(hdlg, pszusername, pszcontentdescription, pratingdetails)

public actual fun RatingAddToApprovedSites(hdlg: HWND, cbpasswordblob: UInt, pbpasswordblob: Long, lpszurl: PCWSTR, falwaysnever: BOOL, fsitepage: BOOL, fapprovedsitesenforced: BOOL): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingAddToApprovedSites(hdlg, cbpasswordblob.toInt(), pbpasswordblob, lpszurl, falwaysnever, fsitepage, fapprovedsitesenforced)

public actual fun RatingCheckUserAccess(pszusername: PCSTR, pszurl: PCSTR, pszratinginfo: PCSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccess(pszusername, pszurl, pszratinginfo, pdata, cbdata.toInt(), ppratingdetails)

public actual fun RatingCheckUserAccessW(pszusername: PCWSTR, pszurl: PCWSTR, pszratinginfo: PCWSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccessW(pszusername, pszurl, pszratinginfo, pdata, cbdata.toInt(), ppratingdetails)

public actual fun RatingClickedOnPRFInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingClickedOnPRFInternal(hwndowner, param1, lpszfilename, nshow)

public actual fun RatingClickedOnRATInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingClickedOnRATInternal(hwndowner, param1, lpszfilename, nshow)

public actual fun RatingEnable(hwndparent: HWND, pszusername: PCSTR, fenable: BOOL): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingEnable(hwndparent, pszusername, fenable)

public actual fun RatingEnableW(hwndparent: HWND, pszusername: PCWSTR, fenable: BOOL): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingEnableW(hwndparent, pszusername, fenable)

public actual fun RatingEnabledQuery(): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingEnabledQuery()

public actual fun RatingFreeDetails(pratingdetails: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingFreeDetails(pratingdetails)

public actual fun RatingInit(): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingInit()

public actual fun RatingObtainCancel(hratingobtainquery: HANDLE): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingObtainCancel(hratingobtainquery)

public actual fun RatingObtainQuery(psztargeturl: PCSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingObtainQuery(psztargeturl, dwuserdata.toInt(), fcallback, phratingobtainquery)

public actual fun RatingObtainQueryW(psztargeturl: PCWSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingObtainQueryW(psztargeturl, dwuserdata.toInt(), fcallback, phratingobtainquery)

public actual fun RatingSetupUI(hdlg: HWND, pszusername: PCSTR): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingSetupUI(hdlg, pszusername)

public actual fun RatingSetupUIW(hdlg: HWND, pszusername: PCWSTR): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_RatingSetupUIW(hdlg, pszusername)

public actual fun SniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): HRESULT =
    WindowsWin32WebInternetexplorerJniBridge.windowssys_windows_win32_web_internetexplorer_SniffStream(pinstream, pnformat, ppoutstream)
