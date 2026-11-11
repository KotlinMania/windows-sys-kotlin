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
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_computeInvCMAP
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_createMIMEMap
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_decodeImage
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_decodeImageEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ditherTo8
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iECancelSaveFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iECreateDirectory
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iECreateFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEDeleteFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEFindFirstFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iELaunchURL
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEMoveFileEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERegSetValueEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iERemoveDirectory
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iESaveFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_identifyMIMEType
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingEnable
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingEnableW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingFreeDetails
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingInit
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingObtainCancel
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingObtainQuery
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingSetupUI
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_ratingSetupUIW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssys_windows_win32_web_internetexplorer_sniffStream
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun computeInvCMAP(prgbcolors: COpaquePointer?, ncolors: UInt, pinvtable: COpaquePointer?, cbtable: UInt): Hresult =
    windowssys_windows_win32_web_internetexplorer_computeInvCMAP(prgbcolors?.value?.toCPointer<ByteVar>(), ncolors, pinvtable?.value?.toCPointer<ByteVar>(), cbtable)

public actual fun createMIMEMap(ppmap: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_createMIMEMap(ppmap?.value?.toCPointer<ByteVar>())

public actual fun decodeImage(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_decodeImage(pstream?.value?.toCPointer<ByteVar>(), pmap?.value?.toCPointer<ByteVar>(), peventsink?.value?.toCPointer<ByteVar>())

public actual fun decodeImageEx(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?, pszmimetypeparam: Pcwstr): Hresult =
    windowssys_windows_win32_web_internetexplorer_decodeImageEx(pstream?.value?.toCPointer<ByteVar>(), pmap?.value?.toCPointer<ByteVar>(), peventsink?.value?.toCPointer<ByteVar>(), pszmimetypeparam?.value?.toCPointer<ByteVar>())

public actual fun ditherTo8(pdestbits: COpaquePointer?, ndestpitch: Int, psrcbits: COpaquePointer?, nsrcpitch: Int, bfidsrc: COpaquePointer?, prgbdestcolors: COpaquePointer?, prgbsrccolors: COpaquePointer?, pbdestinvmap: COpaquePointer?, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    windowssys_windows_win32_web_internetexplorer_ditherTo8(pdestbits?.value?.toCPointer<ByteVar>(), ndestpitch, psrcbits?.value?.toCPointer<ByteVar>(), nsrcpitch, bfidsrc?.value?.toCPointer<ByteVar>(), prgbdestcolors?.value?.toCPointer<ByteVar>(), prgbsrccolors?.value?.toCPointer<ByteVar>(), pbdestinvmap?.value?.toCPointer<ByteVar>(), x, y, cx, cy, ldesttrans, lsrctrans)

public actual fun getMaxMIMEIDBytes(pnmaxbytes: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_getMaxMIMEIDBytes(pnmaxbytes?.value?.toCPointer<ByteVar>())

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEAssociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    windowssys_windows_win32_web_internetexplorer_iECancelSaveFile(hstate?.value?.toCPointer<ByteVar>())

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    windowssys_windows_win32_web_internetexplorer_iECreateDirectory(lppathname?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    windowssys_windows_win32_web_internetexplorer_iECreateFile(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    windowssys_windows_win32_web_internetexplorer_iEDeleteFile(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEDisassociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    windowssys_windows_win32_web_internetexplorer_iEFindFirstFile(lpfilename?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    windowssys_windows_win32_web_internetexplorer_iEGetFileAttributesEx(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfileinformation?.value?.toCPointer<ByteVar>())

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: COpaquePointer?, dwflags: UInt): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEGetProtectedModeCookie(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), pcchcookiedata?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun iEGetWriteableFolderPath(clsidfolderid: COpaquePointer?, lppwstrpath: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEGetWriteableFolderPath(clsidfolderid?.value?.toCPointer<ByteVar>(), lppwstrpath?.value?.toCPointer<ByteVar>())

public actual fun iEGetWriteableLowHKCU(phkey: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEGetWriteableLowHKCU(phkey?.value?.toCPointer<ByteVar>())

public actual fun iEInPrivateFilteringEnabled(): Bool =
    windowssys_windows_win32_web_internetexplorer_iEInPrivateFilteringEnabled()

public actual fun iEIsInPrivateBrowsing(): Bool =
    windowssys_windows_win32_web_internetexplorer_iEIsInPrivateBrowsing()

public actual fun iEIsProtectedModeProcess(pbresult: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeProcess(pbresult?.value?.toCPointer<ByteVar>())

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEIsProtectedModeURL(lpwstrurl?.value?.toCPointer<ByteVar>())

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: COpaquePointer?, lpinfo: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_iELaunchURL(lpwstrurl?.value?.toCPointer<ByteVar>(), lpprocinfo?.value?.toCPointer<ByteVar>(), lpinfo?.value?.toCPointer<ByteVar>())

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    windowssys_windows_win32_web_internetexplorer_iEMoveFileEx(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun iERefreshElevationPolicy(): Hresult =
    windowssys_windows_win32_web_internetexplorer_iERefreshElevationPolicy()

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_iERegCreateKeyEx(lpsubkey?.value?.toCPointer<ByteVar>(), reserved, lpclass?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>())

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Hresult =
    windowssys_windows_win32_web_internetexplorer_iERegSetValueEx(lpsubkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), reserved, dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    0

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbmaxdata: UInt): Hresult =
    0

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    windowssys_windows_win32_web_internetexplorer_iERemoveDirectory(lppathname?.value?.toCPointer<ByteVar>())

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    windowssys_windows_win32_web_internetexplorer_iESaveFile(hstate?.value?.toCPointer<ByteVar>(), lpwstrsourcefile?.value?.toCPointer<ByteVar>())

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    windowssys_windows_win32_web_internetexplorer_iESetProtectedModeCookie(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEShowOpenFileDialog(hwnd?.value?.toCPointer<ByteVar>(), lpwstrfilename?.value?.toCPointer<ByteVar>(), cchmaxfilename, lpwstrinitialdir?.value?.toCPointer<ByteVar>(), lpwstrfilter?.value?.toCPointer<ByteVar>(), lpwstrdefext?.value?.toCPointer<ByteVar>(), dwfilterindex, dwflags, phfile?.value?.toCPointer<ByteVar>())

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: COpaquePointer?, phstate: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_iEShowSaveFileDialog(hwnd?.value?.toCPointer<ByteVar>(), lpwstrinitialfilename?.value?.toCPointer<ByteVar>(), lpwstrinitialdir?.value?.toCPointer<ByteVar>(), lpwstrfilter?.value?.toCPointer<ByteVar>(), lpwstrdefext?.value?.toCPointer<ByteVar>(), dwfilterindex, dwflags, lppwstrdestinationfilepath?.value?.toCPointer<ByteVar>(), phstate?.value?.toCPointer<ByteVar>())

public actual fun iETrackingProtectionEnabled(): Bool =
    windowssys_windows_win32_web_internetexplorer_iETrackingProtectionEnabled()

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    0

public actual fun identifyMIMEType(pbbytes: COpaquePointer?, nbytes: UInt, pnformat: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_identifyMIMEType(pbbytes?.value?.toCPointer<ByteVar>(), nbytes, pnformat?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pszcontentdescription?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialog2W(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingAccessDeniedDialogW(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), pszcontentdescription?.value?.toCPointer<ByteVar>(), pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: COpaquePointer?, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingAddToApprovedSites(hdlg?.value?.toCPointer<ByteVar>(), cbpasswordblob, pbpasswordblob?.value?.toCPointer<ByteVar>(), lpszurl?.value?.toCPointer<ByteVar>(), falwaysnever, fsitepage, fapprovedsitesenforced)

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccess(pszusername?.value?.toCPointer<ByteVar>(), pszurl?.value?.toCPointer<ByteVar>(), pszratinginfo?.value?.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>(), cbdata, ppratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingCheckUserAccessW(pszusername?.value?.toCPointer<ByteVar>(), pszurl?.value?.toCPointer<ByteVar>(), pszratinginfo?.value?.toCPointer<ByteVar>(), pdata?.value?.toCPointer<ByteVar>(), cbdata, ppratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingClickedOnPRFInternal(hwndowner?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), nshow)

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingClickedOnRATInternal(hwndowner?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), nshow)

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingEnable(hwndparent?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), fenable)

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingEnableW(hwndparent?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>(), fenable)

public actual fun ratingEnabledQuery(): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingEnabledQuery()

public actual fun ratingFreeDetails(pratingdetails: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingFreeDetails(pratingdetails?.value?.toCPointer<ByteVar>())

public actual fun ratingInit(): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingInit()

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingObtainCancel(hratingobtainquery?.value?.toCPointer<ByteVar>())

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingObtainQuery(psztargeturl?.value?.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery?.value?.toCPointer<ByteVar>())

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingObtainQueryW(psztargeturl?.value?.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery?.value?.toCPointer<ByteVar>())

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingSetupUI(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>())

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    windowssys_windows_win32_web_internetexplorer_ratingSetupUIW(hdlg?.value?.toCPointer<ByteVar>(), pszusername?.value?.toCPointer<ByteVar>())

public actual fun sniffStream(pinstream: COpaquePointer?, pnformat: COpaquePointer?, ppoutstream: COpaquePointer?): Hresult =
    windowssys_windows_win32_web_internetexplorer_sniffStream(pinstream?.value?.toCPointer<ByteVar>(), pnformat?.value?.toCPointer<ByteVar>(), ppoutstream?.value?.toCPointer<ByteVar>())
