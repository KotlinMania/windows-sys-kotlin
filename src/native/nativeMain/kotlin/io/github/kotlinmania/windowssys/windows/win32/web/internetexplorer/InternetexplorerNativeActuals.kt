@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerComputeInvCMAP
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerCreateMIMEMap
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerDecodeImage
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerDecodeImageEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerDitherTo8
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIECancelSaveFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIECreateDirectory
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIECreateFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEDeleteFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEFindFirstFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIELaunchURL
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEMoveFileEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIERegSetValueEx
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIERemoveDirectory
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIESaveFile
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingEnable
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingEnableW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingFreeDetails
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingInit
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingObtainCancel
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingObtainQuery
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingSetupUI
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerRatingSetupUIW
import io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer.cinterop.windowssysWindowsWin32WebInternetexplorerSniffStream
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun computeInvCMAP(prgbcolors: ConstPtr, ncolors: UInt, pinvtable: MutPtr, cbtable: UInt): Hresult =
    windowssysWindowsWin32WebInternetexplorerComputeInvCMAP(prgbcolors.rawAddress.toCPointer<ByteVar>(), ncolors, pinvtable.rawAddress.toCPointer<ByteVar>(), cbtable)

public actual fun createMIMEMap(ppmap: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerCreateMIMEMap(ppmap.rawAddress.toCPointer<ByteVar>())

public actual fun decodeImage(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerDecodeImage(pstream.rawAddress.toCPointer<ByteVar>(), pmap.rawAddress.toCPointer<ByteVar>(), peventsink.rawAddress.toCPointer<ByteVar>())

public actual fun decodeImageEx(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr, pszmimetypeparam: Pcwstr): Hresult =
    windowssysWindowsWin32WebInternetexplorerDecodeImageEx(pstream.rawAddress.toCPointer<ByteVar>(), pmap.rawAddress.toCPointer<ByteVar>(), peventsink.rawAddress.toCPointer<ByteVar>(), pszmimetypeparam.rawAddress.toCPointer<ByteVar>())

public actual fun ditherTo8(pdestbits: MutPtr, ndestpitch: Int, psrcbits: MutPtr, nsrcpitch: Int, bfidsrc: ConstPtr, prgbdestcolors: MutPtr, prgbsrccolors: MutPtr, pbdestinvmap: MutPtr, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    windowssysWindowsWin32WebInternetexplorerDitherTo8(pdestbits.rawAddress.toCPointer<ByteVar>(), ndestpitch, psrcbits.rawAddress.toCPointer<ByteVar>(), nsrcpitch, bfidsrc.rawAddress.toCPointer<ByteVar>(), prgbdestcolors.rawAddress.toCPointer<ByteVar>(), prgbsrccolors.rawAddress.toCPointer<ByteVar>(), pbdestinvmap.rawAddress.toCPointer<ByteVar>(), x, y, cx, cy, ldesttrans, lsrctrans)

public actual fun getMaxMIMEIDBytes(pnmaxbytes: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(pnmaxbytes.rawAddress.toCPointer<ByteVar>())

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    windowssysWindowsWin32WebInternetexplorerIECancelSaveFile(hstate.rawAddress.toCPointer<ByteVar>())

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    windowssysWindowsWin32WebInternetexplorerIECreateDirectory(lppathname.rawAddress.toCPointer<ByteVar>(), lpsecurityattributes.rawAddress.toCPointer<ByteVar>())

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    MutPtr(windowssysWindowsWin32WebInternetexplorerIECreateFile(lpfilename.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    windowssysWindowsWin32WebInternetexplorerIEDeleteFile(lpfilename.rawAddress.toCPointer<ByteVar>())

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(dwtabthreadid, dwassociatedthreadid)

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: ConstPtr): Handle =
    MutPtr(windowssysWindowsWin32WebInternetexplorerIEFindFirstFile(lpfilename.rawAddress.toCPointer<ByteVar>(), lpfindfiledata.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: ConstPtr): Bool =
    windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(lpfilename.rawAddress.toCPointer<ByteVar>(), finfolevelid, lpfileinformation.rawAddress.toCPointer<ByteVar>())

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: MutPtr, dwflags: UInt): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(lpszurl.rawAddress.toCPointer<ByteVar>(), lpszcookiename.rawAddress.toCPointer<ByteVar>(), lpszcookiedata.rawAddress.toCPointer<ByteVar>(), pcchcookiedata.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun iEGetWriteableFolderPath(clsidfolderid: ConstPtr, lppwstrpath: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(clsidfolderid.rawAddress.toCPointer<ByteVar>(), lppwstrpath.rawAddress.toCPointer<ByteVar>())

public actual fun iEGetWriteableLowHKCU(phkey: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(phkey.rawAddress.toCPointer<ByteVar>())

public actual fun iEInPrivateFilteringEnabled(): Bool =
    windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled()

public actual fun iEIsInPrivateBrowsing(): Bool =
    windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing()

public actual fun iEIsProtectedModeProcess(pbresult: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(pbresult.rawAddress.toCPointer<ByteVar>())

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(lpwstrurl.rawAddress.toCPointer<ByteVar>())

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: MutPtr, lpinfo: ConstPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIELaunchURL(lpwstrurl.rawAddress.toCPointer<ByteVar>(), lpprocinfo.rawAddress.toCPointer<ByteVar>(), lpinfo.rawAddress.toCPointer<ByteVar>())

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    windowssysWindowsWin32WebInternetexplorerIEMoveFileEx(lpexistingfilename.rawAddress.toCPointer<ByteVar>(), lpnewfilename.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun iERefreshElevationPolicy(): Hresult =
    windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy()

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(lpsubkey.rawAddress.toCPointer<ByteVar>(), reserved, lpclass.rawAddress.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), lpdwdisposition.rawAddress.toCPointer<ByteVar>())

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Hresult =
    windowssysWindowsWin32WebInternetexplorerIERegSetValueEx(lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), reserved, dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    0

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbmaxdata: UInt): Hresult =
    0

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    windowssysWindowsWin32WebInternetexplorerIERemoveDirectory(lppathname.rawAddress.toCPointer<ByteVar>())

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIESaveFile(hstate.rawAddress.toCPointer<ByteVar>(), lpwstrsourcefile.rawAddress.toCPointer<ByteVar>())

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(lpszurl.rawAddress.toCPointer<ByteVar>(), lpszcookiename.rawAddress.toCPointer<ByteVar>(), lpszcookiedata.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(hwnd.rawAddress.toCPointer<ByteVar>(), lpwstrfilename.rawAddress.toCPointer<ByteVar>(), cchmaxfilename, lpwstrinitialdir.rawAddress.toCPointer<ByteVar>(), lpwstrfilter.rawAddress.toCPointer<ByteVar>(), lpwstrdefext.rawAddress.toCPointer<ByteVar>(), dwfilterindex, dwflags, phfile.rawAddress.toCPointer<ByteVar>())

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: MutPtr, phstate: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(hwnd.rawAddress.toCPointer<ByteVar>(), lpwstrinitialfilename.rawAddress.toCPointer<ByteVar>(), lpwstrinitialdir.rawAddress.toCPointer<ByteVar>(), lpwstrfilter.rawAddress.toCPointer<ByteVar>(), lpwstrdefext.rawAddress.toCPointer<ByteVar>(), dwfilterindex, dwflags, lppwstrdestinationfilepath.rawAddress.toCPointer<ByteVar>(), phstate.rawAddress.toCPointer<ByteVar>())

public actual fun iETrackingProtectionEnabled(): Bool =
    windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled()

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    0

public actual fun identifyMIMEType(pbbytes: ConstPtr, nbytes: UInt, pnformat: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(pbbytes.rawAddress.toCPointer<ByteVar>(), nbytes, pnformat.rawAddress.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(hdlg.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>(), pszcontentdescription.rawAddress.toCPointer<ByteVar>(), pratingdetails.rawAddress.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(hdlg.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>(), pratingdetails.rawAddress.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(hdlg.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>(), pratingdetails.rawAddress.toCPointer<ByteVar>())

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(hdlg.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>(), pszcontentdescription.rawAddress.toCPointer<ByteVar>(), pratingdetails.rawAddress.toCPointer<ByteVar>())

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: MutPtr, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(hdlg.rawAddress.toCPointer<ByteVar>(), cbpasswordblob, pbpasswordblob.rawAddress.toCPointer<ByteVar>(), lpszurl.rawAddress.toCPointer<ByteVar>(), falwaysnever, fsitepage, fapprovedsitesenforced)

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(pszusername.rawAddress.toCPointer<ByteVar>(), pszurl.rawAddress.toCPointer<ByteVar>(), pszratinginfo.rawAddress.toCPointer<ByteVar>(), pdata.rawAddress.toCPointer<ByteVar>(), cbdata, ppratingdetails.rawAddress.toCPointer<ByteVar>())

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(pszusername.rawAddress.toCPointer<ByteVar>(), pszurl.rawAddress.toCPointer<ByteVar>(), pszratinginfo.rawAddress.toCPointer<ByteVar>(), pdata.rawAddress.toCPointer<ByteVar>(), cbdata, ppratingdetails.rawAddress.toCPointer<ByteVar>())

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(hwndowner.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), lpszfilename.rawAddress.toCPointer<ByteVar>(), nshow)

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(hwndowner.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), lpszfilename.rawAddress.toCPointer<ByteVar>(), nshow)

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingEnable(hwndparent.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>(), fenable)

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingEnableW(hwndparent.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>(), fenable)

public actual fun ratingEnabledQuery(): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery()

public actual fun ratingFreeDetails(pratingdetails: ConstPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingFreeDetails(pratingdetails.rawAddress.toCPointer<ByteVar>())

public actual fun ratingInit(): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingInit()

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingObtainCancel(hratingobtainquery.rawAddress.toCPointer<ByteVar>())

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingObtainQuery(psztargeturl.rawAddress.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery.rawAddress.toCPointer<ByteVar>())

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(psztargeturl.rawAddress.toCPointer<ByteVar>(), dwuserdata, fcallback, phratingobtainquery.rawAddress.toCPointer<ByteVar>())

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingSetupUI(hdlg.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>())

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    windowssysWindowsWin32WebInternetexplorerRatingSetupUIW(hdlg.rawAddress.toCPointer<ByteVar>(), pszusername.rawAddress.toCPointer<ByteVar>())

public actual fun sniffStream(pinstream: MutPtr, pnformat: MutPtr, ppoutstream: MutPtr): Hresult =
    windowssysWindowsWin32WebInternetexplorerSniffStream(pinstream.rawAddress.toCPointer<ByteVar>(), pnformat.rawAddress.toCPointer<ByteVar>(), ppoutstream.rawAddress.toCPointer<ByteVar>())
