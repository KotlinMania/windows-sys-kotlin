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

private object WindowsWin32WebInternetexplorerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerComputeInvCMAP(prgbcolors: Long, ncolors: Int, pinvtable: Long, cbtable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerCreateMIMEMap(ppmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerDecodeImage(pstream: Long, pmap: Long, peventsink: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerDecodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerDitherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(pnmaxbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIECancelSaveFile(hstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIECreateDirectory(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIECreateFile(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEDeleteFile(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEFindFirstFile(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, pcchcookiedata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(phkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled(): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing(): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(pbresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(lpwstrurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIELaunchURL(lpwstrurl: Long, lpprocinfo: Long, lpinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEMoveFileEx(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy(): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIERegSetValueEx(lpsubkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIERemoveDirectory(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIESaveFile(hstate: Long, lpwstrsourcefile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(lpszurl: Long, lpszcookiename: Long, lpszcookiedata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(hwnd: Long, lpwstrfilename: Long, cchmaxfilename: Int, lpwstrinitialdir: Long, lpwstrfilter: Long, lpwstrdefext: Long, dwfilterindex: Int, dwflags: Int, phfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(hwnd: Long, lpwstrinitialfilename: Long, lpwstrinitialdir: Long, lpwstrfilter: Long, lpwstrdefext: Long, dwfilterindex: Int, dwflags: Int, lppwstrdestinationfilepath: Long, phstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled(): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(pbbytes: Long, nbytes: Int, pnformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(hdlg: Long, pszusername: Long, pszcontentdescription: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(hdlg: Long, pszusername: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(hdlg: Long, pszusername: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(hdlg: Long, pszusername: Long, pszcontentdescription: Long, pratingdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(hdlg: Long, cbpasswordblob: Int, pbpasswordblob: Long, lpszurl: Long, falwaysnever: Int, fsitepage: Int, fapprovedsitesenforced: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(pszusername: Long, pszurl: Long, pszratinginfo: Long, pdata: Long, cbdata: Int, ppratingdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(pszusername: Long, pszurl: Long, pszratinginfo: Long, pdata: Long, cbdata: Int, ppratingdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(hwndowner: Long, param1: Long, lpszfilename: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(hwndowner: Long, param1: Long, lpszfilename: Long, nshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingEnable(hwndparent: Long, pszusername: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingEnableW(hwndparent: Long, pszusername: Long, fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery(): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingFreeDetails(pratingdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingInit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingObtainCancel(hratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingObtainQuery(psztargeturl: Long, dwuserdata: Int, fcallback: Long, phratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(psztargeturl: Long, dwuserdata: Int, fcallback: Long, phratingobtainquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingSetupUI(hdlg: Long, pszusername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerRatingSetupUIW(hdlg: Long, pszusername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32WebInternetexplorerSniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): Int
}

public actual fun computeInvCMAP(prgbcolors: ConstPtr, ncolors: UInt, pinvtable: MutPtr, cbtable: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerComputeInvCMAP(prgbcolors.rawAddress, ncolors.toInt(), pinvtable.rawAddress, cbtable.toInt())

public actual fun createMIMEMap(ppmap: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerCreateMIMEMap(ppmap.rawAddress)

public actual fun decodeImage(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerDecodeImage(pstream.rawAddress, pmap.rawAddress, peventsink.rawAddress)

public actual fun decodeImageEx(pstream: MutPtr, pmap: MutPtr, peventsink: MutPtr, pszmimetypeparam: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerDecodeImageEx(pstream.rawAddress, pmap.rawAddress, peventsink.rawAddress, pszmimetypeparam.rawAddress)

public actual fun ditherTo8(pdestbits: MutPtr, ndestpitch: Int, psrcbits: MutPtr, nsrcpitch: Int, bfidsrc: ConstPtr, prgbdestcolors: MutPtr, prgbsrccolors: MutPtr, pbdestinvmap: MutPtr, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerDitherTo8(pdestbits.rawAddress, ndestpitch, psrcbits.rawAddress, nsrcpitch, bfidsrc.rawAddress, prgbdestcolors.rawAddress, prgbsrccolors.rawAddress, pbdestinvmap.rawAddress, x, y, cx, cy, ldesttrans, lsrctrans)

public actual fun getMaxMIMEIDBytes(pnmaxbytes: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes(pnmaxbytes.rawAddress)

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIECancelSaveFile(hstate.rawAddress)

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIECreateDirectory(lppathname.rawAddress, lpsecurityattributes.rawAddress)

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    MutPtr(WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIECreateFile(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress))

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEDeleteFile(lpfilename.rawAddress)

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: ConstPtr): Handle =
    MutPtr(WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEFindFirstFile(lpfilename.rawAddress, lpfindfiledata.rawAddress))

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: ConstPtr): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx(lpfilename.rawAddress, finfolevelid, lpfileinformation.rawAddress)

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, pcchcookiedata.rawAddress, dwflags.toInt())

public actual fun iEGetWriteableFolderPath(clsidfolderid: ConstPtr, lppwstrpath: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath(clsidfolderid.rawAddress, lppwstrpath.rawAddress)

public actual fun iEGetWriteableLowHKCU(phkey: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU(phkey.rawAddress)

public actual fun iEInPrivateFilteringEnabled(): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled()

public actual fun iEIsInPrivateBrowsing(): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing()

public actual fun iEIsProtectedModeProcess(pbresult: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess(pbresult.rawAddress)

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL(lpwstrurl.rawAddress)

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: MutPtr, lpinfo: ConstPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIELaunchURL(lpwstrurl.rawAddress, lpprocinfo.rawAddress, lpinfo.rawAddress)

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEMoveFileEx(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, dwflags.toInt())

public actual fun iERefreshElevationPolicy(): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy()

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx(lpsubkey.rawAddress, reserved.toInt(), lpclass.rawAddress, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress, phkresult.rawAddress, lpdwdisposition.rawAddress)

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIERegSetValueEx(lpsubkey.rawAddress, lpvaluename.rawAddress, reserved.toInt(), dwtype.toInt(), lpdata.rawAddress, cbdata.toInt())

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    0

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbmaxdata: UInt): Hresult =
    0

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIERemoveDirectory(lppathname.rawAddress)

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIESaveFile(hstate.rawAddress, lpwstrsourcefile.rawAddress)

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie(lpszurl.rawAddress, lpszcookiename.rawAddress, lpszcookiedata.rawAddress, dwflags.toInt())

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog(hwnd.rawAddress, lpwstrfilename.rawAddress, cchmaxfilename.toInt(), lpwstrinitialdir.rawAddress, lpwstrfilter.rawAddress, lpwstrdefext.rawAddress, dwfilterindex.toInt(), dwflags.toInt(), phfile.rawAddress)

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: MutPtr, phstate: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog(hwnd.rawAddress, lpwstrinitialfilename.rawAddress, lpwstrinitialdir.rawAddress, lpwstrfilter.rawAddress, lpwstrdefext.rawAddress, dwfilterindex.toInt(), dwflags.toInt(), lppwstrdestinationfilepath.rawAddress, phstate.rawAddress)

public actual fun iETrackingProtectionEnabled(): Bool =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled()

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    0

public actual fun identifyMIMEType(pbbytes: ConstPtr, nbytes: UInt, pnformat: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType(pbbytes.rawAddress, nbytes.toInt(), pnformat.rawAddress)

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog(hdlg.rawAddress, pszusername.rawAddress, pszcontentdescription.rawAddress, pratingdetails.rawAddress)

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2(hdlg.rawAddress, pszusername.rawAddress, pratingdetails.rawAddress)

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W(hdlg.rawAddress, pszusername.rawAddress, pratingdetails.rawAddress)

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW(hdlg.rawAddress, pszusername.rawAddress, pszcontentdescription.rawAddress, pratingdetails.rawAddress)

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: MutPtr, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites(hdlg.rawAddress, cbpasswordblob.toInt(), pbpasswordblob.rawAddress, lpszurl.rawAddress, falwaysnever, fsitepage, fapprovedsitesenforced)

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess(pszusername.rawAddress, pszurl.rawAddress, pszratinginfo.rawAddress, pdata.rawAddress, cbdata.toInt(), ppratingdetails.rawAddress)

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: ConstPtr, cbdata: UInt, ppratingdetails: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW(pszusername.rawAddress, pszurl.rawAddress, pszratinginfo.rawAddress, pdata.rawAddress, cbdata.toInt(), ppratingdetails.rawAddress)

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal(hwndowner.rawAddress, param1.rawAddress, lpszfilename.rawAddress, nshow)

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal(hwndowner.rawAddress, param1.rawAddress, lpszfilename.rawAddress, nshow)

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingEnable(hwndparent.rawAddress, pszusername.rawAddress, fenable)

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingEnableW(hwndparent.rawAddress, pszusername.rawAddress, fenable)

public actual fun ratingEnabledQuery(): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery()

public actual fun ratingFreeDetails(pratingdetails: ConstPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingFreeDetails(pratingdetails.rawAddress)

public actual fun ratingInit(): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingInit()

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingObtainCancel(hratingobtainquery.rawAddress)

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingObtainQuery(psztargeturl.rawAddress, dwuserdata.toInt(), fcallback, phratingobtainquery.rawAddress)

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW(psztargeturl.rawAddress, dwuserdata.toInt(), fcallback, phratingobtainquery.rawAddress)

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingSetupUI(hdlg.rawAddress, pszusername.rawAddress)

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerRatingSetupUIW(hdlg.rawAddress, pszusername.rawAddress)

public actual fun sniffStream(pinstream: MutPtr, pnformat: MutPtr, ppoutstream: MutPtr): Hresult =
    WindowsWin32WebInternetexplorerJniBridge.windowssysWindowsWin32WebInternetexplorerSniffStream(pinstream.rawAddress, pnformat.rawAddress, ppoutstream.rawAddress)
