@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Rgbquad
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.GetFileexInfoLevels
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataa
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ProcessInformation

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun computeInvCMAP(prgbcolors: ConstPtr<Rgbquad>, ncolors: UInt, pinvtable: MutPtr<UByte>, cbtable: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerComputeInvCMAP")

public actual fun createMIMEMap(ppmap: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerCreateMIMEMap")

public actual fun decodeImage(pstream: MutPtr<CVoid>, pmap: MutPtr<CVoid>, peventsink: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerDecodeImage")

public actual fun decodeImageEx(pstream: MutPtr<CVoid>, pmap: MutPtr<CVoid>, peventsink: MutPtr<CVoid>, pszmimetypeparam: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerDecodeImageEx")

public actual fun ditherTo8(pdestbits: MutPtr<UByte>, ndestpitch: Int, psrcbits: MutPtr<UByte>, nsrcpitch: Int, bfidsrc: ConstPtr<Guid>, prgbdestcolors: MutPtr<Rgbquad>, prgbsrccolors: MutPtr<Rgbquad>, pbdestinvmap: MutPtr<UByte>, x: Int, y: Int, cx: Int, cy: Int, ldesttrans: Int, lsrctrans: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerDitherTo8")

public actual fun getMaxMIMEIDBytes(pnmaxbytes: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerGetMaxMIMEIDBytes")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

public actual fun iEAssociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    wasiWindowssysWindowsWin32WebInternetexplorerIEAssociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun iECancelSaveFile(hstate: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIECancelSaveFile")

public actual fun iECreateDirectory(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIECreateDirectory")

public actual fun iECreateFile(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIECreateFile")

public actual fun iEDeleteFile(lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEDeleteFile")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(dwtabthreadid: Int, dwassociatedthreadid: Int): Int

public actual fun iEDisassociateThreadWithTab(dwtabthreadid: UInt, dwassociatedthreadid: UInt): Hresult =
    wasiWindowssysWindowsWin32WebInternetexplorerIEDisassociateThreadWithTab(dwtabthreadid.toInt(), dwassociatedthreadid.toInt())

public actual fun iEFindFirstFile(lpfilename: Pcwstr, lpfindfiledata: ConstPtr<Win32FindDataa>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEFindFirstFile")

public actual fun iEGetFileAttributesEx(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEGetFileAttributesEx")

public actual fun iEGetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, pcchcookiedata: MutPtr<UInt>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEGetProtectedModeCookie")

public actual fun iEGetWriteableFolderPath(clsidfolderid: ConstPtr<Guid>, lppwstrpath: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEGetWriteableFolderPath")

public actual fun iEGetWriteableLowHKCU(phkey: MutPtr<Hkey>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEGetWriteableLowHKCU")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled(): Int

public actual fun iEInPrivateFilteringEnabled(): Bool =
    wasiWindowssysWindowsWin32WebInternetexplorerIEInPrivateFilteringEnabled()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing(): Int

public actual fun iEIsInPrivateBrowsing(): Bool =
    wasiWindowssysWindowsWin32WebInternetexplorerIEIsInPrivateBrowsing()

public actual fun iEIsProtectedModeProcess(pbresult: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeProcess")

public actual fun iEIsProtectedModeURL(lpwstrurl: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEIsProtectedModeURL")

public actual fun iELaunchURL(lpwstrurl: Pcwstr, lpprocinfo: MutPtr<ProcessInformation>, lpinfo: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIELaunchURL")

public actual fun iEMoveFileEx(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEMoveFileEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy(): Int

public actual fun iERefreshElevationPolicy(): Hresult =
    wasiWindowssysWindowsWin32WebInternetexplorerIERefreshElevationPolicy()

public actual fun iERegCreateKeyEx(lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIERegCreateKeyEx")

public actual fun iERegSetValueEx(lpsubkey: Pcwstr, lpvaluename: Pcwstr, reserved: UInt, dwtype: UInt, lpdata: ConstPtr<UByte>, cbdata: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIERegSetValueEx")

public actual fun iERegisterWritableRegistryKey(guid: Guid, lpsubkey: Pcwstr, fsubkeyallowed: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIERegisterWritableRegistryKey")

public actual fun iERegisterWritableRegistryValue(guid: Guid, lppath: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<UByte>, cbmaxdata: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIERegisterWritableRegistryValue")

public actual fun iERemoveDirectory(lppathname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIERemoveDirectory")

public actual fun iESaveFile(hstate: Handle, lpwstrsourcefile: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIESaveFile")

public actual fun iESetProtectedModeCookie(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIESetProtectedModeCookie")

public actual fun iEShowOpenFileDialog(hwnd: Hwnd, lpwstrfilename: Pwstr, cchmaxfilename: UInt, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, phfile: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEShowOpenFileDialog")

public actual fun iEShowSaveFileDialog(hwnd: Hwnd, lpwstrinitialfilename: Pcwstr, lpwstrinitialdir: Pcwstr, lpwstrfilter: Pcwstr, lpwstrdefext: Pcwstr, dwfilterindex: UInt, dwflags: UInt, lppwstrdestinationfilepath: MutPtr<Pwstr>, phstate: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEShowSaveFileDialog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled(): Int

public actual fun iETrackingProtectionEnabled(): Bool =
    wasiWindowssysWindowsWin32WebInternetexplorerIETrackingProtectionEnabled()

public actual fun iEUnregisterWritableRegistry(guid: Guid): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIEUnregisterWritableRegistry")

public actual fun identifyMIMEType(pbbytes: ConstPtr<UByte>, nbytes: UInt, pnformat: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerIdentifyMIMEType")

public actual fun ratingAccessDeniedDialog(hdlg: Hwnd, pszusername: Pcstr, pszcontentdescription: Pcstr, pratingdetails: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog")

public actual fun ratingAccessDeniedDialog2(hdlg: Hwnd, pszusername: Pcstr, pratingdetails: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2")

public actual fun ratingAccessDeniedDialog2W(hdlg: Hwnd, pszusername: Pcwstr, pratingdetails: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialog2W")

public actual fun ratingAccessDeniedDialogW(hdlg: Hwnd, pszusername: Pcwstr, pszcontentdescription: Pcwstr, pratingdetails: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingAccessDeniedDialogW")

public actual fun ratingAddToApprovedSites(hdlg: Hwnd, cbpasswordblob: UInt, pbpasswordblob: MutPtr<UByte>, lpszurl: Pcwstr, falwaysnever: Bool, fsitepage: Bool, fapprovedsitesenforced: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingAddToApprovedSites")

public actual fun ratingCheckUserAccess(pszusername: Pcstr, pszurl: Pcstr, pszratinginfo: Pcstr, pdata: ConstPtr<UByte>, cbdata: UInt, ppratingdetails: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccess")

public actual fun ratingCheckUserAccessW(pszusername: Pcwstr, pszurl: Pcwstr, pszratinginfo: Pcwstr, pdata: ConstPtr<UByte>, cbdata: UInt, ppratingdetails: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingCheckUserAccessW")

public actual fun ratingClickedOnPRFInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingClickedOnPRFInternal")

public actual fun ratingClickedOnRATInternal(hwndowner: Hwnd, param1: Hinstance, lpszfilename: Pcstr, nshow: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingClickedOnRATInternal")

public actual fun ratingEnable(hwndparent: Hwnd, pszusername: Pcstr, fenable: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingEnable")

public actual fun ratingEnableW(hwndparent: Hwnd, pszusername: Pcwstr, fenable: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingEnableW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerRatingEnabledQuery")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerRatingEnabledQuery(): Int

public actual fun ratingEnabledQuery(): Hresult =
    wasiWindowssysWindowsWin32WebInternetexplorerRatingEnabledQuery()

public actual fun ratingFreeDetails(pratingdetails: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingFreeDetails")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32WebInternetexplorerRatingInit")
private external fun wasiWindowssysWindowsWin32WebInternetexplorerRatingInit(): Int

public actual fun ratingInit(): Hresult =
    wasiWindowssysWindowsWin32WebInternetexplorerRatingInit()

public actual fun ratingObtainCancel(hratingobtainquery: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingObtainCancel")

public actual fun ratingObtainQuery(psztargeturl: Pcstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingObtainQuery")

public actual fun ratingObtainQueryW(psztargeturl: Pcwstr, dwuserdata: UInt, fcallback: Long, phratingobtainquery: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingObtainQueryW")

public actual fun ratingSetupUI(hdlg: Hwnd, pszusername: Pcstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingSetupUI")

public actual fun ratingSetupUIW(hdlg: Hwnd, pszusername: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerRatingSetupUIW")

public actual fun sniffStream(pinstream: MutPtr<CVoid>, pnformat: MutPtr<UInt>, ppoutstream: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32WebInternetexplorerSniffStream")
