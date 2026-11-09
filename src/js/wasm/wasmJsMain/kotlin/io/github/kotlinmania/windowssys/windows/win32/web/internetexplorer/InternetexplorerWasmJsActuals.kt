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

public actual fun ComputeInvCMAP(prgbcolors: Long, ncolors: UInt, pinvtable: Long, cbtable: UInt): HRESULT =
    0

public actual fun CreateMIMEMap(ppmap: Long): HRESULT =
    0

public actual fun DecodeImage(pstream: Long, pmap: Long, peventsink: Long): HRESULT =
    0

public actual fun DecodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: PCWSTR): HRESULT =
    0

public actual fun DitherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): HRESULT =
    0

public actual fun GetMaxMIMEIDBytes(pnmaxbytes: Long): HRESULT =
    0

public actual fun IEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    0

public actual fun IECancelSaveFile(hstate: HANDLE): HRESULT =
    0

public actual fun IECreateDirectory(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun IECreateFile(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    0L

public actual fun IEDeleteFile(lpfilename: PCWSTR): BOOL =
    0

public actual fun IEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    0

public actual fun IEFindFirstFile(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    0L

public actual fun IEGetFileAttributesEx(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    0

public actual fun IEGetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, pcchcookiedata: Long, dwflags: UInt): HRESULT =
    0

public actual fun IEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): HRESULT =
    0

public actual fun IEGetWriteableLowHKCU(phkey: Long): HRESULT =
    0

public actual fun IEInPrivateFilteringEnabled(): BOOL =
    0

public actual fun IEIsInPrivateBrowsing(): BOOL =
    0

public actual fun IEIsProtectedModeProcess(pbresult: Long): HRESULT =
    0

public actual fun IEIsProtectedModeURL(lpwstrurl: PCWSTR): HRESULT =
    0

public actual fun IELaunchURL(lpwstrurl: PCWSTR, lpprocinfo: Long, lpinfo: Long): HRESULT =
    0

public actual fun IEMoveFileEx(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: UInt): BOOL =
    0

public actual fun IERefreshElevationPolicy(): HRESULT =
    0

public actual fun IERegCreateKeyEx(lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): HRESULT =
    0

public actual fun IERegSetValueEx(lpsubkey: PCWSTR, lpvaluename: PCWSTR, reserved: UInt, dwtype: UInt, lpdata: Long, cbdata: UInt): HRESULT =
    0

public actual fun IERegisterWritableRegistryKey(guid: GUID, lpsubkey: PCWSTR, fsubkeyallowed: BOOL): HRESULT =
    0

public actual fun IERegisterWritableRegistryValue(guid: GUID, lppath: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbmaxdata: UInt): HRESULT =
    0

public actual fun IERemoveDirectory(lppathname: PCWSTR): BOOL =
    0

public actual fun IESaveFile(hstate: HANDLE, lpwstrsourcefile: PCWSTR): HRESULT =
    0

public actual fun IESetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun IEShowOpenFileDialog(hwnd: HWND, lpwstrfilename: PWSTR, cchmaxfilename: UInt, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, phfile: Long): HRESULT =
    0

public actual fun IEShowSaveFileDialog(hwnd: HWND, lpwstrinitialfilename: PCWSTR, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: Long, phstate: Long): HRESULT =
    0

public actual fun IETrackingProtectionEnabled(): BOOL =
    0

public actual fun IEUnregisterWritableRegistry(guid: GUID): HRESULT =
    0

public actual fun IdentifyMIMEType(pbbytes: Long, nbytes: UInt, pnformat: Long): HRESULT =
    0

public actual fun RatingAccessDeniedDialog(hdlg: HWND, pszusername: PCSTR, pszcontentdescription: PCSTR, pratingdetails: Long): HRESULT =
    0

public actual fun RatingAccessDeniedDialog2(hdlg: HWND, pszusername: PCSTR, pratingdetails: Long): HRESULT =
    0

public actual fun RatingAccessDeniedDialog2W(hdlg: HWND, pszusername: PCWSTR, pratingdetails: Long): HRESULT =
    0

public actual fun RatingAccessDeniedDialogW(hdlg: HWND, pszusername: PCWSTR, pszcontentdescription: PCWSTR, pratingdetails: Long): HRESULT =
    0

public actual fun RatingAddToApprovedSites(hdlg: HWND, cbpasswordblob: UInt, pbpasswordblob: Long, lpszurl: PCWSTR, falwaysnever: BOOL, fsitepage: BOOL, fapprovedsitesenforced: BOOL): HRESULT =
    0

public actual fun RatingCheckUserAccess(pszusername: PCSTR, pszurl: PCSTR, pszratinginfo: PCSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    0

public actual fun RatingCheckUserAccessW(pszusername: PCWSTR, pszurl: PCWSTR, pszratinginfo: PCWSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    0

public actual fun RatingClickedOnPRFInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    0

public actual fun RatingClickedOnRATInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    0

public actual fun RatingEnable(hwndparent: HWND, pszusername: PCSTR, fenable: BOOL): HRESULT =
    0

public actual fun RatingEnableW(hwndparent: HWND, pszusername: PCWSTR, fenable: BOOL): HRESULT =
    0

public actual fun RatingEnabledQuery(): HRESULT =
    0

public actual fun RatingFreeDetails(pratingdetails: Long): HRESULT =
    0

public actual fun RatingInit(): HRESULT =
    0

public actual fun RatingObtainCancel(hratingobtainquery: HANDLE): HRESULT =
    0

public actual fun RatingObtainQuery(psztargeturl: PCSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    0

public actual fun RatingObtainQueryW(psztargeturl: PCWSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    0

public actual fun RatingSetupUI(hdlg: HWND, pszusername: PCSTR): HRESULT =
    0

public actual fun RatingSetupUIW(hdlg: HWND, pszusername: PCWSTR): HRESULT =
    0

public actual fun SniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): HRESULT =
    0
