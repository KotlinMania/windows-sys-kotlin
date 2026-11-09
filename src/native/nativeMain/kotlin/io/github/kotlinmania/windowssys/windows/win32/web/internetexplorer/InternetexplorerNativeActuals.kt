@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ComputeInvCMAP(prgbcolors: Long, ncolors: UInt, pinvtable: Long, cbtable: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ComputeInvCMAP(prgbcolors.toCPointer<ByteVar>(), ncolors, pinvtable.toCPointer<ByteVar>(), cbtable)

public actual fun CreateMIMEMap(ppmap: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_CreateMIMEMap(ppmap.toCPointer<ByteVar>())

public actual fun DecodeImage(pstream: Long, pmap: Long, peventsink: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_DecodeImage(pstream.toCPointer<ByteVar>(), pmap.toCPointer<ByteVar>(), peventsink.toCPointer<ByteVar>())

public actual fun DecodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_DecodeImageEx(pstream.toCPointer<ByteVar>(), pmap.toCPointer<ByteVar>(), peventsink.toCPointer<ByteVar>(), pszmimetypeparam.toCPointer<ByteVar>())

public actual fun DitherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_DitherTo8(pdestbits.toCPointer<ByteVar>(), ndestpitch, psrcbits.toCPointer<ByteVar>(), nsrcpitch, bfidsrc.toCPointer<ByteVar>(), prgbdestcolors.toCPointer<ByteVar>(), prgbsrccolors.toCPointer<ByteVar>(), pbdestinvmap.toCPointer<ByteVar>(), x, y, cx, cy, ldesttrans, lsrctrans)

public actual fun GetMaxMIMEIDBytes(pnmaxbytes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_GetMaxMIMEIDBytes(pnmaxbytes.toCPointer<ByteVar>())

public actual fun IEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEAssociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun IECancelSaveFile(hstate: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IECancelSaveFile(hstate.toCPointer<ByteVar>())

public actual fun IECreateDirectory(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IECreateDirectory(lppathname.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun IECreateFile(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IECreateFile(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IEDeleteFile(lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEDeleteFile(lpfilename.toCPointer<ByteVar>())

public actual fun IEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEDisassociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun IEFindFirstFile(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEFindFirstFile(lpfilename.toCPointer<ByteVar>(), lpfindfiledata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun IEGetFileAttributesEx(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEGetFileAttributesEx(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfileinformation.toCPointer<ByteVar>())

public actual fun IEGetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, pcchcookiedata: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEGetProtectedModeCookie(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), pcchcookiedata.toCPointer<ByteVar>(), dwflags)

public actual fun IEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEGetWriteableFolderPath(clsidfolderid.toCPointer<ByteVar>(), lppwstrpath.toCPointer<ByteVar>())

public actual fun IEGetWriteableLowHKCU(phkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEGetWriteableLowHKCU(phkey.toCPointer<ByteVar>())

public actual fun IEInPrivateFilteringEnabled(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEInPrivateFilteringEnabled()

public actual fun IEIsInPrivateBrowsing(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEIsInPrivateBrowsing()

public actual fun IEIsProtectedModeProcess(pbresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeProcess(pbresult.toCPointer<ByteVar>())

public actual fun IEIsProtectedModeURL(lpwstrurl: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEIsProtectedModeURL(lpwstrurl.toCPointer<ByteVar>())

public actual fun IELaunchURL(lpwstrurl: PCWSTR, lpprocinfo: Long, lpinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IELaunchURL(lpwstrurl.toCPointer<ByteVar>(), lpprocinfo.toCPointer<ByteVar>(), lpinfo.toCPointer<ByteVar>())

public actual fun IEMoveFileEx(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEMoveFileEx(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), dwflags)

public actual fun IERefreshElevationPolicy(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IERefreshElevationPolicy()

public actual fun IERegCreateKeyEx(lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IERegCreateKeyEx(lpsubkey.toCPointer<ByteVar>(), reserved, lpclass.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), lpdwdisposition.toCPointer<ByteVar>())

public actual fun IERegSetValueEx(lpsubkey: PCWSTR, lpvaluename: PCWSTR, reserved: UInt, dwtype: UInt, lpdata: Long, cbdata: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IERegSetValueEx(lpsubkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), reserved, dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun IERegisterWritableRegistryKey(guid: GUID, lpsubkey: PCWSTR, fsubkeyallowed: BOOL): HRESULT =
    0

public actual fun IERegisterWritableRegistryValue(guid: GUID, lppath: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbmaxdata: UInt): HRESULT =
    0

public actual fun IERemoveDirectory(lppathname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IERemoveDirectory(lppathname.toCPointer<ByteVar>())

public actual fun IESaveFile(hstate: HANDLE, lpwstrsourcefile: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IESaveFile(hstate.toCPointer<ByteVar>(), lpwstrsourcefile.toCPointer<ByteVar>())

public actual fun IESetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IESetProtectedModeCookie(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), dwflags)

public actual fun IEShowOpenFileDialog(hwnd: HWND, lpwstrfilename: PWSTR, cchmaxfilename: UInt, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, phfile: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEShowOpenFileDialog(hwnd.toCPointer<ByteVar>(), lpwstrfilename.toCPointer<ByteVar>(), cchmaxfilename, lpwstrinitialdir.toCPointer<ByteVar>(), lpwstrfilter.toCPointer<ByteVar>(), lpwstrdefext.toCPointer<ByteVar>(), dwfilterindex, dwflags, phfile.toCPointer<ByteVar>())

public actual fun IEShowSaveFileDialog(hwnd: HWND, lpwstrinitialfilename: PCWSTR, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: Long, phstate: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IEShowSaveFileDialog(hwnd.toCPointer<ByteVar>(), lpwstrinitialfilename.toCPointer<ByteVar>(), lpwstrinitialdir.toCPointer<ByteVar>(), lpwstrfilter.toCPointer<ByteVar>(), lpwstrdefext.toCPointer<ByteVar>(), dwfilterindex, dwflags, lppwstrdestinationfilepath.toCPointer<ByteVar>(), phstate.toCPointer<ByteVar>())

public actual fun IETrackingProtectionEnabled(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IETrackingProtectionEnabled()

public actual fun IEUnregisterWritableRegistry(guid: GUID): HRESULT =
    0

public actual fun IdentifyMIMEType(pbbytes: Long, nbytes: UInt, pnformat: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_IdentifyMIMEType(pbbytes.toCPointer<ByteVar>(), nbytes, pnformat.toCPointer<ByteVar>())

public actual fun RatingAccessDeniedDialog(hdlg: HWND, pszusername: PCSTR, pszcontentdescription: PCSTR, pratingdetails: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog(hdlg.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), pszcontentdescription.toCPointer<ByteVar>(), pratingdetails.toCPointer<ByteVar>())

public actual fun RatingAccessDeniedDialog2(hdlg: HWND, pszusername: PCSTR, pratingdetails: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2(hdlg.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), pratingdetails.toCPointer<ByteVar>())

public actual fun RatingAccessDeniedDialog2W(hdlg: HWND, pszusername: PCWSTR, pratingdetails: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialog2W(hdlg.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), pratingdetails.toCPointer<ByteVar>())

public actual fun RatingAccessDeniedDialogW(hdlg: HWND, pszusername: PCWSTR, pszcontentdescription: PCWSTR, pratingdetails: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingAccessDeniedDialogW(hdlg.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), pszcontentdescription.toCPointer<ByteVar>(), pratingdetails.toCPointer<ByteVar>())

public actual fun RatingAddToApprovedSites(hdlg: HWND, cbpasswordblob: UInt, pbpasswordblob: Long, lpszurl: PCWSTR, falwaysnever: BOOL, fsitepage: BOOL, fapprovedsitesenforced: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingAddToApprovedSites(hdlg.toCPointer<ByteVar>(), cbpasswordblob, pbpasswordblob.toCPointer<ByteVar>(), lpszurl.toCPointer<ByteVar>(), falwaysnever, fsitepage, fapprovedsitesenforced)

public actual fun RatingCheckUserAccess(pszusername: PCSTR, pszurl: PCSTR, pszratinginfo: PCSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccess(pszusername.toCPointer<ByteVar>(), pszurl.toCPointer<ByteVar>(), pszratinginfo.toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>(), cbdata, ppratingdetails.toCPointer<ByteVar>())

public actual fun RatingCheckUserAccessW(pszusername: PCWSTR, pszurl: PCWSTR, pszratinginfo: PCWSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingCheckUserAccessW(pszusername.toCPointer<ByteVar>(), pszurl.toCPointer<ByteVar>(), pszratinginfo.toCPointer<ByteVar>(), pdata.toCPointer<ByteVar>(), cbdata, ppratingdetails.toCPointer<ByteVar>())

public actual fun RatingClickedOnPRFInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingClickedOnPRFInternal(hwndowner.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), nshow)

public actual fun RatingClickedOnRATInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingClickedOnRATInternal(hwndowner.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), nshow)

public actual fun RatingEnable(hwndparent: HWND, pszusername: PCSTR, fenable: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingEnable(hwndparent.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), fenable)

public actual fun RatingEnableW(hwndparent: HWND, pszusername: PCWSTR, fenable: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingEnableW(hwndparent.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>(), fenable)

public actual fun RatingEnabledQuery(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingEnabledQuery()

public actual fun RatingFreeDetails(pratingdetails: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingFreeDetails(pratingdetails.toCPointer<ByteVar>())

public actual fun RatingInit(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingInit()

public actual fun RatingObtainCancel(hratingobtainquery: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingObtainCancel(hratingobtainquery.toCPointer<ByteVar>())

public actual fun RatingObtainQuery(psztargeturl: PCSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingObtainQuery(psztargeturl.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery.toCPointer<ByteVar>())

public actual fun RatingObtainQueryW(psztargeturl: PCWSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingObtainQueryW(psztargeturl.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery.toCPointer<ByteVar>())

public actual fun RatingSetupUI(hdlg: HWND, pszusername: PCSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingSetupUI(hdlg.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>())

public actual fun RatingSetupUIW(hdlg: HWND, pszusername: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_RatingSetupUIW(hdlg.toCPointer<ByteVar>(), pszusername.toCPointer<ByteVar>())

public actual fun SniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_SniffStream(pinstream.toCPointer<ByteVar>(), pnformat.toCPointer<ByteVar>(), ppoutstream.toCPointer<ByteVar>())
