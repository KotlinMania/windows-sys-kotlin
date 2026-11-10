@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Dropeffect
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.DeviceScaleFactor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ShowWindowCmd

public actual fun assocCreate(clsid: Guid, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocCreateForClasses(rgclasses: COpaquePointer?, cclasses: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocGetDetailsOfPropKey(psf: COpaquePointer?, pidl: COpaquePointer?, pkey: COpaquePointer?, pv: COpaquePointer?, pffoundpropkey: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocGetPerceivedType(pszext: Pcwstr, ptype: COpaquePointer?, pflag: COpaquePointer?, ppsztype: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocIsDangerous(pszassoc: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cdefFolderMenuCreate2(pidlfolder: COpaquePointer?, hwnd: Hwnd, cidl: UInt, apidl: COpaquePointer?, psf: COpaquePointer?, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: COpaquePointer?, ppcm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cidldataCreateFromIdarray(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, ppdtobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chrCmpIA(w1: UShort, w2: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chrCmpIW(w1: UShort, w2: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun colorRGBToHLS(clrrgb: Colorref, pwhue: COpaquePointer?, pwluminance: COpaquePointer?, pwsaturation: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun connectToConnectionPoint(punk: COpaquePointer?, riidevent: COpaquePointer?, fconnect: Bool, punktarget: COpaquePointer?, pdwcookie: COpaquePointer?, ppcpout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dadAutoScroll(hwnd: Hwnd, pad: COpaquePointer?, pptnow: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dadDragLeave(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dadDragMove(pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dadSetDragImage(him: Himagelist, pptoffset: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dadShowDragImage(fshow: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dragFinish(hdrop: Hdrop): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dragQueryPoint(hdrop: Hdrop, ppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun driveType(idrive: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: COpaquePointer?): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: COpaquePointer?): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentProcessExplicitAppUserModelID(appid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuContextHelpId(param0: Hmenu): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProfileType(dwflags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowContextHelpId(param0: Hwnd): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserFree(param0: COpaquePointer?, param1: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserFree64(param0: COpaquePointer?, param1: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hmonitorUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hashData(pbdata: COpaquePointer?, cbdata: UInt, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkClone(pihl: COpaquePointer?, riid: COpaquePointer?, pihlsiteforclone: COpaquePointer?, dwsitedata: UInt, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateBrowseContext(piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateFromData(pidataobj: COpaquePointer?, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateFromMoniker(pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: COpaquePointer?, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkNavigate(pihl: COpaquePointer?, pihlframe: COpaquePointer?, grfhlnf: UInt, pbc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, pihlframe: COpaquePointer?, grfhlnf: UInt, pibc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkOnNavigate(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, grfhlnf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: COpaquePointer?, pimkold: COpaquePointer?, pimknew: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkParseDisplayName(pibc: COpaquePointer?, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: COpaquePointer?, ppimk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkPreprocessMoniker(pibc: COpaquePointer?, pimkin: COpaquePointer?, ppimkout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkQueryCreateFromData(pidataobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkResolveMonikerForData(pimkreference: COpaquePointer?, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hlinkUpdateStackItem(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, uhlid: UInt, pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLAppendID(pidl: COpaquePointer?, pmkid: COpaquePointer?, fappend: Bool): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLClone(pidl: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLCloneFirst(pidl: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLCombine(pidl1: COpaquePointer?, pidl2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLCreateFromPathA(pszpath: Pcstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLCreateFromPathW(pszpath: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLFindChild(pidlparent: COpaquePointer?, pidlchild: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLFindLastID(pidl: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLFree(pidl: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLGetNext(pidl: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLGetSize(pidl: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLIsEqual(pidl1: COpaquePointer?, pidl2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLIsParent(pidl1: COpaquePointer?, pidl2: COpaquePointer?, fimmediate: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLLoadFromStreamEx(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLRemoveLastID(pidl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iLSaveToStream(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamCopy(pstmfrom: COpaquePointer?, pstmto: COpaquePointer?, cb: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamRead(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamReadPidl(pstm: COpaquePointer?, ppidlout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamReadStr(pstm: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamReset(pstm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamSize(pstm: COpaquePointer?, pui: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamWrite(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamWritePidl(pstm: COpaquePointer?, pidlwrite: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun istreamWriteStr(pstm: COpaquePointer?, psz: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownAtomicRelease(ppunk: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownGetSite(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownGetWindow(punk: COpaquePointer?, phwnd: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownQueryService(punk: COpaquePointer?, guidservice: COpaquePointer?, riid: COpaquePointer?, ppvout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownSet(ppunk: COpaquePointer?, punk: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun iunknownSetSite(punk: COpaquePointer?, punksite: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: COpaquePointer?, pfparsepersiterules: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initNetworkAddressControl(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initPropVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun initVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharSpaceA(wch: Byte): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isCharSpaceW(wch: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isInternetESCEnabled(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isLFNDriveA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isLFNDriveW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isNetDrive(idrive: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isOS(dwos: OS): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isUserAnAdmin(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadUserProfileA(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadUserProfileW(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oleSaveToStreamEx(piunk: COpaquePointer?, pistm: COpaquePointer?, fcleardirty: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun parseURLA(pcszurl: Pcstr, ppu: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun parseURLW(pcszurl: Pcwstr, ppu: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAddBackslashA(pszpath: Pstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAddBackslashW(pszpath: Pwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchIsRoot(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFileExistsA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFileExistsW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindExtensionA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindExtensionW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindFileNameA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindFileNameW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindNextComponentA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathGetArgsA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathGetArgsW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathGetCharTypeA(ch: UByte): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathGetCharTypeW(ch: UShort): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathGetDriveNumberA(pszpath: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathGetDriveNumberW(pszpath: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathGetShortPath(pszlongpath: Pwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsDirectoryA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsDirectoryW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsExe(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsFileSpecA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsFileSpecW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsLFNFileSpecA(pszname: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsNetworkPathA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsNetworkPathW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsRelativeA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsRelativeW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsRootA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsRootW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsUNCA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsUNCServerA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsUNCServerShareA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsUNCServerW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsUNCW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsURLA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathIsURLW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMakePrettyA(pszpath: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMakePrettyW(pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMakeSystemFolderA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathParseIconLocationA(psziconfile: Pstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathParseIconLocationW(psziconfile: Pwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathQualify(psz: Pwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathQuoteSpacesA(lpsz: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathQuoteSpacesW(lpsz: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveArgsA(pszpath: Pstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveArgsW(pszpath: Pwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveBackslashA(pszpath: Pstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveBlanksA(pszpath: Pstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveBlanksW(pszpath: Pwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveExtensionA(pszpath: Pstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveExtensionW(pszpath: Pwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveFileSpecA(pszpath: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRemoveFileSpecW(pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathResolve(pszpath: Pwstr, dirs: COpaquePointer?, fflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathSkipRootA(pszpath: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathSkipRootW(pszpath: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathStripPathA(pszpath: Pstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathStripPathW(pszpath: Pwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathStripToRootA(pszpath: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathStripToRootW(pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUndecorateA(pszpath: Pstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUndecorateW(pszpath: Pwstr): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUnquoteSpacesA(lpsz: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathUnquoteSpacesW(lpsz: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun propVariantToStrRet(propvar: COpaquePointer?, pstrret: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun qISearch(that: COpaquePointer?, pqit: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readCabinetState(pcs: COpaquePointer?, clength: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realDriveType(idrive: Int, foktohitnet: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerScaleChangeEvent(hevent: Handle, pdwcookie: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAddToRecentDocs(uflags: UInt, pv: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAlloc(cb: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAllocShared(pvdata: COpaquePointer?, dwsize: UInt, dwprocessid: UInt): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAppBarMessage(dwmessage: UInt, pdata: COpaquePointer?): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: COpaquePointer?, enumhandlers: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHBindToFolderIDListParent(psfroot: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHBindToFolderIDListParentEx(psfroot: COpaquePointer?, pidl: COpaquePointer?, ppbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHBindToObject(psf: COpaquePointer?, pidl: COpaquePointer?, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHBindToParent(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHBrowseForFolderA(lpbi: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHBrowseForFolderW(lpbi: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCLSIDFromString(psz: Pcwstr, pclsid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: COpaquePointer?, plevent: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shchangeNotificationUnlock(hlock: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: COpaquePointer?, dwitem2: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHChangeNotifyDeregister(ulid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHChangeNotifyRegisterThread(status: ScnrtStatus): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateAssociationRegistration(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateDataObject(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, pdtinner: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateDefaultContextMenu(pdcm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateDefaultExtractIcon(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateDefaultPropertiesOp(psi: COpaquePointer?, ppfileop: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateItemFromIDList(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateItemFromRelativeName(psiparent: COpaquePointer?, pszname: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateItemInKnownFolder(kfid: COpaquePointer?, dwkfflags: UInt, pszitem: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateItemWithParent(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppvitem: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateMemStream(pinit: COpaquePointer?, cbinit: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateProcessAsUserW(pscpi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellFolderView(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellFolderViewEx(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellItem(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, ppsi: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellItemArray(pidlparent: COpaquePointer?, psf: COpaquePointer?, cidl: UInt, ppidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellItemArrayFromDataObject(pdo: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellItemArrayFromShellItem(psi: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateShellPalette(hdc: Hdc): Hpalette =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: COpaquePointer?, ppenumformatetc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: COpaquePointer?, ppstm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateThreadRef(pcref: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHDoDragDrop(hwnd: Hwnd, pdata: COpaquePointer?, pdsrc: COpaquePointer?, dweffect: Dropeffect, pdweffect: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: COpaquePointer?, ppszcommandline: COpaquePointer?, ppszparameters: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFileOperationA(lpfileop: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFileOperationW(lpfileop: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFindFiles(pidlfolder: COpaquePointer?, pidlsavefile: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFlushSFCache(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFormatDateTimeA(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pstr, cchbuf: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFormatDateTimeW(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFree(pv: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFreeNameMappings(hnamemappings: Handle): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetAttributesFromDataObject(pdo: COpaquePointer?, dwattributemask: UInt, pdwattributes: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetDataFromIDListA(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetDataFromIDListW(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetDesktopFolder(ppshf: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetIDListFromObject(punk: COpaquePointer?, ppidl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetImageList(iimagelist: Int, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetInstanceExplorer(ppunk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetInverseCMAP(pbmap: COpaquePointer?, cbmap: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetItemFromDataObject(pdtobj: COpaquePointer?, dwflags: DataobjGetItemFlags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetItemFromObject(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetKnownFolderIDList(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppidl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetKnownFolderItem(rfid: COpaquePointer?, flags: KnownFolderFlag, htoken: Handle, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetKnownFolderPath(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppszpath: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetMalloc(ppmalloc: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetNameFromIDList(pidl: COpaquePointer?, sigdnname: Sigdn, ppszname: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetPathFromIDListA(pidl: COpaquePointer?, pszpath: Pstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetPathFromIDListEx(pidl: COpaquePointer?, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetPathFromIDListW(pidl: COpaquePointer?, pszpath: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetRealIDL(psf: COpaquePointer?, pidlsimple: COpaquePointer?, ppidlreal: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetSetFolderCustomSettings(pfcs: COpaquePointer?, pszpath: Pcwstr, dwreadwrite: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetSetSettings(lpss: COpaquePointer?, dwmask: SsfMask, bset: Bool): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetSettings(psfs: COpaquePointer?, dwmask: UInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetTemporaryPropertyForItem(psi: COpaquePointer?, propkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetThreadRef(ppunk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: COpaquePointer?, pfiletime: COpaquePointer?, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGetViewStatePropertyBag(pidl: COpaquePointer?, pszbagname: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGlobalCounterDecrement(id: Shglobalcounter): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGlobalCounterGetValue(id: Shglobalcounter): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHGlobalCounterIncrement(id: Shglobalcounter): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHHandleUpdateImage(pidlextra: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: COpaquePointer?, rgfinout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHIsLowMemoryMachine(dwtype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHLimitInputEdit(hwndedit: Hwnd, psf: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHLoadInProc(rclsid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHLockShared(hdata: Handle, dwprocessid: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHMapPIDLToSystemImageListIndex(pshf: COpaquePointer?, pidl: COpaquePointer?, piindexsel: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHMultiFileProperties(pdtobj: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHOpenFolderAndSelectItems(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: COpaquePointer?, ckeys: UInt, pclsiddefault: COpaquePointer?, pdtobj: COpaquePointer?, psb: COpaquePointer?, pstartpage: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHParseDisplayName(pszname: Pcwstr, pbc: COpaquePointer?, ppidl: COpaquePointer?, sfgaoin: UInt, psfgaoout: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHQueryUserNotificationState(pquns: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegCloseUSKey(huskey: Long): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegDuplicateHKey(hkey: Hkey): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, fignorehkcu: Bool): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, fignorehkcu: Bool): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHReleaseThreadRef(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHResolveLibrary(psilibrary: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHRestricted(rest: Restrictions): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetDefaultProperties(hwnd: Hwnd, psi: COpaquePointer?, dwfileopflags: UInt, pfops: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetInstanceExplorer(punk: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetKnownFolderPath(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetTemporaryPropertyForItem(psi: COpaquePointer?, propkey: COpaquePointer?, propvar: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetThreadRef(punk: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHShowManageLibraryUI(psilibrary: COpaquePointer?, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSimpleIDListFromPath(pszpath: Pcwstr): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHSkipJunction(pbc: COpaquePointer?, pclsid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHStrDupA(psz: Pcstr, ppwsz: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHStrDupW(psz: Pcwstr, ppwsz: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHStripMneumonicA(pszmenu: Pstr): Byte =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHStripMneumonicW(pszmenu: Pwstr): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHUnlockShared(pvdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellExecuteExA(pexecinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellExecuteExW(pexecinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellGetImageLists(phiml: COpaquePointer?, phimlsmall: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellNotifyIconGetRect(identifier: COpaquePointer?, iconlocation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun signalFileOpen(pidl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stgMakeUniqueName(pstgparent: COpaquePointer?, pszfilespec: Pcwstr, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strDupA(pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strDupW(pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRetToBSTR(pstr: COpaquePointer?, pidl: COpaquePointer?, pbstr: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRetToBufA(pstr: COpaquePointer?, pidl: COpaquePointer?, pszbuf: Pstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRetToBufW(pstr: COpaquePointer?, pidl: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRetToStrA(pstr: COpaquePointer?, pidl: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strRetToStrW(pstr: COpaquePointer?, pidl: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strSpnA(psz: Pcstr, pszset: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strToIntA(pszsrc: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strToIntW(pszsrc: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterAppStateChangeNotification(registration: PappstateRegistration): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlGetLocationA(pszurl: Pcstr): Pcstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlGetLocationW(pszurl: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: COpaquePointer?, dwpart: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?, dwpart: UInt, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlHashA(pszurl: Pcstr, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlHashW(pszurl: Pcwstr, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlIsNoHistoryA(pszurl: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlIsNoHistoryW(pszurl: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlIsOpaqueA(pszurl: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlIsOpaqueW(pszurl: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: COpaquePointer?, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun variantToStrRet(varin: COpaquePointer?, pstrret: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun whichPlatform(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun win32DeleteFile(pszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writeCabinetState(pcs: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
