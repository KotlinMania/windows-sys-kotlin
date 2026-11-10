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

public actual fun computeInvCMAP(prgbcolors: COpaquePointer?, ncolors: UInt, pinvtable: COpaquePointer?, cbtable: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMIMEMap(ppmap: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decodeImage(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun decodeImageEx(pstream: COpaquePointer?, pmap: COpaquePointer?, peventsink: COpaquePointer?, pszmimetypeparam: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ditherTo8(pdestbits: COpaquePointer?, ndestpitch: Int, psrcbits: COpaquePointer?, nsrcpitch: Int, bfidsrc: COpaquePointer?, prgbdestcolors: COpaquePointer?, prgbsrccolors: COpaquePointer?, pbdestinvmap: COpaquePointer?, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMaxMIMEIDBytes(pnmaxbytes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEGetWriteableFolderPath(clsidfolderid: COpaquePointer?, lppwstrpath: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEGetWriteableLowHKCU(phkey: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEInPrivateFilteringEnabled(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEIsInPrivateBrowsing(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEIsProtectedModeProcess(pbresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: COpaquePointer?, lpinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iERefreshElevationPolicy(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbmaxdata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: COpaquePointer?, phstate: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iETrackingProtectionEnabled(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun identifyMIMEType(pbbytes: COpaquePointer?, nbytes: UInt, pnformat: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: COpaquePointer?, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: COpaquePointer?, cbdata: UInt, ppratingdetails: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingEnabledQuery(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingFreeDetails(pratingdetails: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingInit(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sniffStream(pinstream: COpaquePointer?, pnformat: COpaquePointer?, ppoutstream: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
