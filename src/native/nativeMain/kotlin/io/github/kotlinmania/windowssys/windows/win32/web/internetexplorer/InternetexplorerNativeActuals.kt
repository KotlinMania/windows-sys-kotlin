@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun computeInvCMAP(prgbcolors: COpaquePointer?, ncolors: UInt, pinvtable: COpaquePointer?, cbtable: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_computeInvCMAP(prgbcolors?.value?.toCPointer<ByteVar>(), ncolors, pinvtable?.value?.toCPointer<ByteVar>(), cbtable)

public actual fun createMIMEMap(ppmap: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_createMIMEMap(ppmap?.value?.toCPointer<ByteVar>())

public actual fun decodeImage(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_decodeImage(pstream?.value?.toCPointer<ByteVar>(), pmap?.value?.toCPointer<ByteVar>(), peventsink?.value?.toCPointer<ByteVar>())

public actual fun decodeImageEx(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?, pszmimetypeparam: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_decodeImageEx(pstream?.value?.toCPointer<ByteVar>(), pmap?.value?.toCPointer<ByteVar>(), peventsink?.value?.toCPointer<ByteVar>(), pszmimetypeparam?.value?.toCPointer<ByteVar>())

public actual fun ditherTo8(pdestbits: COpaquePointer?, ndestpitch: Int, psrcbits: COpaquePointer?, nsrcpitch: Int, bfidsrc: COpaquePointer?, prgbdestcolors: COpaquePointer?, prgbsrccolors: COpaquePointer?, pbdestinvmap: COpaquePointer?, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ditherTo8(pdestbits?.value?.toCPointer<ByteVar>(), ndestpitch, psrcbits?.value?.toCPointer<ByteVar>(), nsrcpitch, bfidsrc?.value?.toCPointer<ByteVar>(), prgbdestcolors?.value?.toCPointer<ByteVar>(), prgbsrccolors?.value?.toCPointer<ByteVar>(), pbdestinvmap?.value?.toCPointer<ByteVar>(), x, y, cx, cy, ldesttrans, lsrctrans)

public actual fun getMaxMIMEIDBytes(pnmaxbytes: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes(pnmaxbytes?.value?.toCPointer<ByteVar>())

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iECancelSaveFile(hstate?.value?.toCPointer<ByteVar>())

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iECreateDirectory(lppathname?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iECreateFile(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEDeleteFile(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEFindFirstFile(lpfilename?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfileinformation?.value?.toCPointer<ByteVar>())

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: COpaquePointer?, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), pcchcookiedata?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun iEGetWriteableFolderPath(clsidfolderid: COpaquePointer?, lppwstrpath: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath(clsidfolderid?.value?.toCPointer<ByteVar>(), lppwstrpath?.value?.toCPointer<ByteVar>())

public actual fun iEGetWriteableLowHKCU(phkey: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU(phkey?.value?.toCPointer<ByteVar>())

public actual fun iEInPrivateFilteringEnabled(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled()

public actual fun iEIsInPrivateBrowsing(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing()

public actual fun iEIsProtectedModeProcess(pbresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess(pbresult?.value?.toCPointer<ByteVar>())

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL(lpwstrurl?.value?.toCPointer<ByteVar>())

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: COpaquePointer?, lpinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iELaunchURL(lpwstrurl?.value?.toCPointer<ByteVar>(), lpprocinfo?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEMoveFileEx(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun iERefreshElevationPolicy(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy()

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx(lpsubkey?.value?.toCPointer<ByteVar>(), reserved, lpclass?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>())

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERegSetValueEx(lpsubkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), reserved, dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    0

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbmaxdata: UInt): Hresult =
    0

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERemoveDirectory(lppathname?.value?.toCPointer<ByteVar>())

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iESaveFile(hstate?.value?.toCPointer<ByteVar>(), lpwstrsourcefile?.value?.toCPointer<ByteVar>())

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog(hwnd?.value?.toCPointer<ByteVar>(), lpwstrfilename?.value?.toCPointer<ByteVar>(), cchmaxfilename, lpwstrinitialdir?.value?.toCPointer<ByteVar>(), lpwstrfilter?.value?.toCPointer<ByteVar>(), lpwstrdefext?.value?.toCPointer<ByteVar>(), dwfilterindex, dwflags, phfile?.value?.toCPointer<ByteVar>())

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: COpaquePointer?, phstate: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog(hwnd?.value?.toCPointer<ByteVar>(), lpwstrinitialfilename?.value?.toCPointer<ByteVar>(), lpwstrinitialdir?.value?.toCPointer<ByteVar>(), lpwstrfilter?.value?.toCPointer<ByteVar>(), lpwstrdefext?.value?.toCPointer<ByteVar>(), dwfilterindex, dwflags, lppwstrdestinationfilepath?.value?.toCPointer<ByteVar>(), phstate?.value?.toCPointer<ByteVar>())

public actual fun iETrackingProtectionEnabled(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled()

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    0

public actual fun identifyMIMEType(pbbytes: COpaquePointer?, nbytes: UInt, pnformat: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_identifyMIMEType(pbbytes?.value?.toCPointer<ByteVar>(), nbytes, pnformat?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pszcontentdescription?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pszcontentdescription?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: COpaquePointer?, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites(hdlg?.value?.toCPointer<ByteVar>(), cbpasswordblob, pbpasswordblob?.value?.toCPointer<ByteVar>(), lpszurl?.value?.toCPointer<ByteVar>(), falwaysnever, fsitepage, fapprovedsitesenforced)

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess(pszusername?.value?.toCPointer<ByteVar>(), pszurl?.value?.toCPointer<ByteVar>(), pszratinginfo?.value?.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>(), cbdata, ppratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW(pszusername?.value?.toCPointer<ByteVar>(), pszurl?.value?.toCPointer<ByteVar>(), pszratinginfo?.value?.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>(), cbdata, ppratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal(hwndowner?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), nshow)

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal(hwndowner?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), nshow)

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingEnable(hwndparent?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), fenable)

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingEnableW(hwndparent?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), fenable)

public actual fun ratingEnabledQuery(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery()

public actual fun ratingFreeDetails(pratingdetails: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingFreeDetails(pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingInit(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingInit()

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingObtainCancel(hratingobtainquery?.value?.toCPointer<ByteVar>())

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingObtainQuery(psztargeturl?.value?.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery?.value?.toCPointer<ByteVar>())

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW(psztargeturl?.value?.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery?.value?.toCPointer<ByteVar>())

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingSetupUI(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>())

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingSetupUIW(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>())

public actual fun sniffStream(pinstream: COpaquePointer?, pnformat: COpaquePointer?, ppoutstream: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_sniffStream(pinstream?.value?.toCPointer<ByteVar>(), pnformat?.value?.toCPointer<ByteVar>(), ppoutstream?.value?.toCPointer<ByteVar>())
