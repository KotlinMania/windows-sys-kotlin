package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun ComputeInvCMAP(prgbcolors: Long, ncolors: UInt, pinvtable: Long, cbtable: UInt): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "ComputeInvCMAP", longArrayOf(prgbcolors, ncolors.toLong(), pinvtable, cbtable.toLong())).toInt()
}

public fun CreateMIMEMap(ppmap: Long): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "CreateMIMEMap", longArrayOf(ppmap)).toInt()
}

public fun DecodeImage(pstream: Long, pmap: Long, peventsink: Long): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "DecodeImage", longArrayOf(pstream, pmap, peventsink)).toInt()
}

public fun DecodeImageEx(pstream: Long, pmap: Long, peventsink: Long, pszmimetypeparam: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "DecodeImageEx", longArrayOf(pstream, pmap, peventsink, pszmimetypeparam)).toInt()
}

public fun DitherTo8(pdestbits: Long, ndestpitch: Int, psrcbits: Long, nsrcpitch: Int, bfidsrc: Long, prgbdestcolors: Long, prgbsrccolors: Long, pbdestinvmap: Long, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "DitherTo8", longArrayOf(pdestbits, ndestpitch.toLong(), psrcbits, nsrcpitch.toLong(), bfidsrc, prgbdestcolors, prgbsrccolors, pbdestinvmap, x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), ldesttrans.toLong(), lsrctrans.toLong())).toInt()
}

public fun GetMaxMIMEIDBytes(pnmaxbytes: Long): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "GetMaxMIMEIDBytes", longArrayOf(pnmaxbytes)).toInt()
}

public fun IEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEAssociateThreadWithTab", longArrayOf(dwtabthreadid.toLong(), dwassociatedthreadid.toLong())).toInt()
}

public fun IECancelSaveFile(hstate: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IECancelSaveFile", longArrayOf(hstate)).toInt()
}

public fun IECreateDirectory(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IECreateDirectory", longArrayOf(lppathname, lpsecurityattributes)).toInt()
}

public fun IECreateFile(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE {
    return Win32DynamicFfi.invoke("ieframe.dll", "IECreateFile", longArrayOf(lpfilename, dwdesiredaccess.toLong(), dwsharemode.toLong(), lpsecurityattributes, dwcreationdisposition.toLong(), dwflagsandattributes.toLong(), htemplatefile))
}

public fun IEDeleteFile(lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEDeleteFile", longArrayOf(lpfilename)).toInt()
}

public fun IEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEDisassociateThreadWithTab", longArrayOf(dwtabthreadid.toLong(), dwassociatedthreadid.toLong())).toInt()
}

public fun IEFindFirstFile(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEFindFirstFile", longArrayOf(lpfilename, lpfindfiledata))
}

public fun IEGetFileAttributesEx(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEGetFileAttributesEx", longArrayOf(lpfilename, finfolevelid.toLong(), lpfileinformation)).toInt()
}

public fun IEGetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, pcchcookiedata: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEGetProtectedModeCookie", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, pcchcookiedata, dwflags.toLong())).toInt()
}

public fun IEGetWriteableFolderPath(clsidfolderid: Long, lppwstrpath: Long): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEGetWriteableFolderPath", longArrayOf(clsidfolderid, lppwstrpath)).toInt()
}

public fun IEGetWriteableLowHKCU(phkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEGetWriteableLowHKCU", longArrayOf(phkey)).toInt()
}

public fun IEInPrivateFilteringEnabled(): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEInPrivateFilteringEnabled", longArrayOf()).toInt()
}

public fun IEIsInPrivateBrowsing(): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEIsInPrivateBrowsing", longArrayOf()).toInt()
}

public fun IEIsProtectedModeProcess(pbresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEIsProtectedModeProcess", longArrayOf(pbresult)).toInt()
}

public fun IEIsProtectedModeURL(lpwstrurl: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEIsProtectedModeURL", longArrayOf(lpwstrurl)).toInt()
}

public fun IELaunchURL(lpwstrurl: PCWSTR, lpprocinfo: Long, lpinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IELaunchURL", longArrayOf(lpwstrurl, lpprocinfo, lpinfo)).toInt()
}

public fun IEMoveFileEx(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEMoveFileEx", longArrayOf(lpexistingfilename, lpnewfilename, dwflags.toLong())).toInt()
}

public fun IERefreshElevationPolicy(): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IERefreshElevationPolicy", longArrayOf()).toInt()
}

public fun IERegCreateKeyEx(lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IERegCreateKeyEx", longArrayOf(lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition)).toInt()
}

public fun IERegSetValueEx(lpsubkey: PCWSTR, lpvaluename: PCWSTR, reserved: UInt, dwtype: UInt, lpdata: Long, cbdata: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IERegSetValueEx", longArrayOf(lpsubkey, lpvaluename, reserved.toLong(), dwtype.toLong(), lpdata, cbdata.toLong())).toInt()
}

public fun IERegisterWritableRegistryKey(guid: GUID, lpsubkey: PCWSTR, fsubkeyallowed: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IERegisterWritableRegistryKey", longArrayOf(run { val buf = ByteArray(16); buf[0] = (guid.data1.toInt() and 0xFF).toByte(); buf[1] = ((guid.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((guid.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((guid.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (guid.data2.toInt() and 0xFF).toByte(); buf[5] = ((guid.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (guid.data3.toInt() and 0xFF).toByte(); buf[7] = ((guid.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, guid.data4.size)) buf[8 + i] = guid.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, lpsubkey, fsubkeyallowed.toLong())).toInt()
}

public fun IERegisterWritableRegistryValue(guid: GUID, lppath: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbmaxdata: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IERegisterWritableRegistryValue", longArrayOf(run { val buf = ByteArray(16); buf[0] = (guid.data1.toInt() and 0xFF).toByte(); buf[1] = ((guid.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((guid.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((guid.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (guid.data2.toInt() and 0xFF).toByte(); buf[5] = ((guid.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (guid.data3.toInt() and 0xFF).toByte(); buf[7] = ((guid.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, guid.data4.size)) buf[8 + i] = guid.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, lppath, lpvaluename, dwtype.toLong(), lpdata, cbmaxdata.toLong())).toInt()
}

public fun IERemoveDirectory(lppathname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IERemoveDirectory", longArrayOf(lppathname)).toInt()
}

public fun IESaveFile(hstate: HANDLE, lpwstrsourcefile: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IESaveFile", longArrayOf(hstate, lpwstrsourcefile)).toInt()
}

public fun IESetProtectedModeCookie(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IESetProtectedModeCookie", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, dwflags.toLong())).toInt()
}

public fun IEShowOpenFileDialog(hwnd: HWND, lpwstrfilename: PWSTR, cchmaxfilename: UInt, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, phfile: Long): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEShowOpenFileDialog", longArrayOf(hwnd, lpwstrfilename, cchmaxfilename.toLong(), lpwstrinitialdir, lpwstrfilter, lpwstrdefext, dwfilterindex.toLong(), dwflags.toLong(), phfile)).toInt()
}

public fun IEShowSaveFileDialog(hwnd: HWND, lpwstrinitialfilename: PCWSTR, lpwstrinitialdir: PCWSTR, lpwstrfilter: PCWSTR, lpwstrdefext: PCWSTR, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: Long, phstate: Long): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEShowSaveFileDialog", longArrayOf(hwnd, lpwstrinitialfilename, lpwstrinitialdir, lpwstrfilter, lpwstrdefext, dwfilterindex.toLong(), dwflags.toLong(), lppwstrdestinationfilepath, phstate)).toInt()
}

public fun IETrackingProtectionEnabled(): BOOL {
    return Win32DynamicFfi.invoke("ieframe.dll", "IETrackingProtectionEnabled", longArrayOf()).toInt()
}

public fun IEUnregisterWritableRegistry(guid: GUID): HRESULT {
    return Win32DynamicFfi.invoke("ieframe.dll", "IEUnregisterWritableRegistry", longArrayOf(run { val buf = ByteArray(16); buf[0] = (guid.data1.toInt() and 0xFF).toByte(); buf[1] = ((guid.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((guid.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((guid.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (guid.data2.toInt() and 0xFF).toByte(); buf[5] = ((guid.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (guid.data3.toInt() and 0xFF).toByte(); buf[7] = ((guid.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, guid.data4.size)) buf[8 + i] = guid.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr })).toInt()
}

public fun IdentifyMIMEType(pbbytes: Long, nbytes: UInt, pnformat: Long): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "IdentifyMIMEType", longArrayOf(pbbytes, nbytes.toLong(), pnformat)).toInt()
}

public fun RatingAccessDeniedDialog(hdlg: HWND, pszusername: PCSTR, pszcontentdescription: PCSTR, pratingdetails: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingAccessDeniedDialog", longArrayOf(hdlg, pszusername, pszcontentdescription, pratingdetails)).toInt()
}

public fun RatingAccessDeniedDialog2(hdlg: HWND, pszusername: PCSTR, pratingdetails: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingAccessDeniedDialog2", longArrayOf(hdlg, pszusername, pratingdetails)).toInt()
}

public fun RatingAccessDeniedDialog2W(hdlg: HWND, pszusername: PCWSTR, pratingdetails: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingAccessDeniedDialog2W", longArrayOf(hdlg, pszusername, pratingdetails)).toInt()
}

public fun RatingAccessDeniedDialogW(hdlg: HWND, pszusername: PCWSTR, pszcontentdescription: PCWSTR, pratingdetails: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingAccessDeniedDialogW", longArrayOf(hdlg, pszusername, pszcontentdescription, pratingdetails)).toInt()
}

public fun RatingAddToApprovedSites(hdlg: HWND, cbpasswordblob: UInt, pbpasswordblob: Long, lpszurl: PCWSTR, falwaysnever: BOOL, fsitepage: BOOL, fapprovedsitesenforced: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingAddToApprovedSites", longArrayOf(hdlg, cbpasswordblob.toLong(), pbpasswordblob, lpszurl, falwaysnever.toLong(), fsitepage.toLong(), fapprovedsitesenforced.toLong())).toInt()
}

public fun RatingCheckUserAccess(pszusername: PCSTR, pszurl: PCSTR, pszratinginfo: PCSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingCheckUserAccess", longArrayOf(pszusername, pszurl, pszratinginfo, pdata, cbdata.toLong(), ppratingdetails)).toInt()
}

public fun RatingCheckUserAccessW(pszusername: PCWSTR, pszurl: PCWSTR, pszratinginfo: PCWSTR, pdata: Long, cbdata: UInt, ppratingdetails: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingCheckUserAccessW", longArrayOf(pszusername, pszurl, pszratinginfo, pdata, cbdata.toLong(), ppratingdetails)).toInt()
}

public fun RatingClickedOnPRFInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingClickedOnPRFInternal", longArrayOf(hwndowner, param1, lpszfilename, nshow.toLong())).toInt()
}

public fun RatingClickedOnRATInternal(hwndowner: HWND, param1: HINSTANCE, lpszfilename: PCSTR, nshow: Int): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingClickedOnRATInternal", longArrayOf(hwndowner, param1, lpszfilename, nshow.toLong())).toInt()
}

public fun RatingEnable(hwndparent: HWND, pszusername: PCSTR, fenable: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingEnable", longArrayOf(hwndparent, pszusername, fenable.toLong())).toInt()
}

public fun RatingEnableW(hwndparent: HWND, pszusername: PCWSTR, fenable: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingEnableW", longArrayOf(hwndparent, pszusername, fenable.toLong())).toInt()
}

public fun RatingEnabledQuery(): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingEnabledQuery", longArrayOf()).toInt()
}

public fun RatingFreeDetails(pratingdetails: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingFreeDetails", longArrayOf(pratingdetails)).toInt()
}

public fun RatingInit(): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingInit", longArrayOf()).toInt()
}

public fun RatingObtainCancel(hratingobtainquery: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingObtainCancel", longArrayOf(hratingobtainquery)).toInt()
}

public fun RatingObtainQuery(psztargeturl: PCSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingObtainQuery", longArrayOf(psztargeturl, dwuserdata.toLong(), fcallback, phratingobtainquery)).toInt()
}

public fun RatingObtainQueryW(psztargeturl: PCWSTR, dwuserdata: UInt, fcallback: Long, phratingobtainquery: Long): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingObtainQueryW", longArrayOf(psztargeturl, dwuserdata.toLong(), fcallback, phratingobtainquery)).toInt()
}

public fun RatingSetupUI(hdlg: HWND, pszusername: PCSTR): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingSetupUI", longArrayOf(hdlg, pszusername)).toInt()
}

public fun RatingSetupUIW(hdlg: HWND, pszusername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("msrating.dll", "RatingSetupUIW", longArrayOf(hdlg, pszusername)).toInt()
}

public fun SniffStream(pinstream: Long, pnformat: Long, ppoutstream: Long): HRESULT {
    return Win32DynamicFfi.invoke("imgutil.dll", "SniffStream", longArrayOf(pinstream, pnformat, ppoutstream)).toInt()
}
