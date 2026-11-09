@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMONITOR
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_FLAGS_AND_ATTRIBUTES
import io.github.kotlinmania.windowssys.windows.win32.system.ole.DROPEFFECT
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LPTHREAD_START_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HIMAGELIST
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.LPFNSVADDPROPSHEETPAGE
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.DEVICE_SCALE_FACTOR
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HMENU
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MESSAGEBOX_STYLE
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.SHOW_WINDOW_CMD

public actual fun AssocCreate(clsid: GUID, riid: Long, ppv: Long): HRESULT =
    0

public actual fun AssocCreateForClasses(rgclasses: Long, cclasses: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun AssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): HRESULT =
    0

public actual fun AssocGetPerceivedType(pszext: PCWSTR, ptype: Long, pflag: Long, ppsztype: Long): HRESULT =
    0

public actual fun AssocIsDangerous(pszassoc: PCWSTR): BOOL =
    0

public actual fun AssocQueryKeyA(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCSTR, pszextra: PCSTR, phkeyout: Long): HRESULT =
    0

public actual fun AssocQueryKeyW(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCWSTR, pszextra: PCWSTR, phkeyout: Long): HRESULT =
    0

public actual fun AssocQueryStringA(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCSTR, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    0

public actual fun AssocQueryStringByKeyA(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    0

public actual fun AssocQueryStringByKeyW(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    0

public actual fun AssocQueryStringW(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCWSTR, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    0

public actual fun CDefFolderMenu_Create2(pidlfolder: Long, hwnd: HWND, cidl: UInt, apidl: Long, psf: Long, pfn: LPFNDFMCALLBACK, nkeys: UInt, ahkeys: Long, ppcm: Long): HRESULT =
    0

public actual fun CIDLData_CreateFromIDArray(pidlfolder: Long, cidl: UInt, apidl: Long, ppdtobj: Long): HRESULT =
    0

public actual fun ChrCmpIA(w1: UShort, w2: UShort): BOOL =
    0

public actual fun ChrCmpIW(w1: UShort, w2: UShort): BOOL =
    0

public actual fun ColorAdjustLuma(clrrgb: COLORREF, n: Int, fscale: BOOL): COLORREF =
    0u

public actual fun ColorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): COLORREF =
    0u

public actual fun ColorRGBToHLS(clrrgb: COLORREF, pwhue: Long, pwluminance: Long, pwsaturation: Long) {
}

public actual fun CommandLineToArgvW(lpcmdline: PCWSTR, pnumargs: Long): Long =
    0L

public actual fun ConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: BOOL, punktarget: Long, pdwcookie: Long, ppcpout: Long): HRESULT =
    0

public actual fun CreateProfile(pszusersid: PCWSTR, pszusername: PCWSTR, pszprofilepath: PWSTR, cchprofilepath: UInt): HRESULT =
    0

public actual fun DAD_AutoScroll(hwnd: HWND, pad: Long, pptnow: Long): BOOL =
    0

public actual fun DAD_DragEnterEx(hwndtarget: HWND, ptstart: POINT): BOOL =
    0

public actual fun DAD_DragEnterEx2(hwndtarget: HWND, ptstart: POINT, pdtobject: Long): BOOL =
    0

public actual fun DAD_DragLeave(): BOOL =
    0

public actual fun DAD_DragMove(pt: POINT): BOOL =
    0

public actual fun DAD_SetDragImage(him: HIMAGELIST, pptoffset: Long): BOOL =
    0

public actual fun DAD_ShowDragImage(fshow: BOOL): BOOL =
    0

public actual fun DefSubclassProc(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun DeleteProfileA(lpsidstring: PCSTR, lpprofilepath: PCSTR, lpcomputername: PCSTR): BOOL =
    0

public actual fun DeleteProfileW(lpsidstring: PCWSTR, lpprofilepath: PCWSTR, lpcomputername: PCWSTR): BOOL =
    0

public actual fun DoEnvironmentSubstA(pszsrc: PSTR, cchsrc: UInt): UInt =
    0u

public actual fun DoEnvironmentSubstW(pszsrc: PWSTR, cchsrc: UInt): UInt =
    0u

public actual fun DragAcceptFiles(hwnd: HWND, faccept: BOOL) {
}

public actual fun DragFinish(hdrop: HDROP) {
}

public actual fun DragQueryFileA(hdrop: HDROP, ifile: UInt, lpszfile: PSTR, cch: UInt): UInt =
    0u

public actual fun DragQueryFileW(hdrop: HDROP, ifile: UInt, lpszfile: PWSTR, cch: UInt): UInt =
    0u

public actual fun DragQueryPoint(hdrop: HDROP, ppt: Long): BOOL =
    0

public actual fun DriveType(idrive: Int): Int =
    0

public actual fun DuplicateIcon(hinst: HINSTANCE, hicon: HICON): HICON =
    0L

public actual fun ExtractAssociatedIconA(hinst: HINSTANCE, psziconpath: PSTR, piicon: Long): HICON =
    0L

public actual fun ExtractAssociatedIconExA(hinst: HINSTANCE, psziconpath: PSTR, piiconindex: Long, piiconid: Long): HICON =
    0L

public actual fun ExtractAssociatedIconExW(hinst: HINSTANCE, psziconpath: PWSTR, piiconindex: Long, piiconid: Long): HICON =
    0L

public actual fun ExtractAssociatedIconW(hinst: HINSTANCE, psziconpath: PWSTR, piicon: Long): HICON =
    0L

public actual fun ExtractIconA(hinst: HINSTANCE, pszexefilename: PCSTR, niconindex: UInt): HICON =
    0L

public actual fun ExtractIconExA(lpszfile: PCSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    0u

public actual fun ExtractIconExW(lpszfile: PCWSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    0u

public actual fun ExtractIconW(hinst: HINSTANCE, pszexefilename: PCWSTR, niconindex: UInt): HICON =
    0L

public actual fun FindExecutableA(lpfile: PCSTR, lpdirectory: PCSTR, lpresult: PSTR): HINSTANCE =
    0L

public actual fun FindExecutableW(lpfile: PCWSTR, lpdirectory: PCWSTR, lpresult: PWSTR): HINSTANCE =
    0L

public actual fun GetAcceptLanguagesA(pszlanguages: PSTR, pcchlanguages: Long): HRESULT =
    0

public actual fun GetAcceptLanguagesW(pszlanguages: PWSTR, pcchlanguages: Long): HRESULT =
    0

public actual fun GetAllUsersProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetAllUsersProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetCurrentProcessExplicitAppUserModelID(appid: Long): HRESULT =
    0

public actual fun GetDefaultUserProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetDefaultUserProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetDpiForShellUIComponent(param0: SHELL_UI_COMPONENT): UInt =
    0u

public actual fun GetFileNameFromBrowse(hwnd: HWND, pszfilepath: PWSTR, cchfilepath: UInt, pszworkingdir: PCWSTR, pszdefext: PCWSTR, pszfilters: PCWSTR, psztitle: PCWSTR): BOOL =
    0

public actual fun GetMenuContextHelpId(param0: HMENU): UInt =
    0u

public actual fun GetMenuPosFromID(hmenu: HMENU, id: UInt): Int =
    0

public actual fun GetProfileType(dwflags: Long): BOOL =
    0

public actual fun GetProfilesDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetProfilesDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetScaleFactorForDevice(devicetype: DISPLAY_DEVICE_TYPE): DEVICE_SCALE_FACTOR =
    0

public actual fun GetScaleFactorForMonitor(hmon: HMONITOR, pscale: Long): HRESULT =
    0

public actual fun GetUserProfileDirectoryA(htoken: HANDLE, lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetUserProfileDirectoryW(htoken: HANDLE, lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    0

public actual fun GetWindowContextHelpId(param0: HWND): UInt =
    0u

public actual fun GetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, pdwrefdata: Long): BOOL =
    0

public actual fun HMONITOR_UserFree(param0: Long, param1: Long) {
}

public actual fun HMONITOR_UserFree64(param0: Long, param1: Long) {
}

public actual fun HMONITOR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HMONITOR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HMONITOR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HMONITOR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun HMONITOR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HMONITOR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun HashData(pbdata: Long, cbdata: UInt, pbhash: Long, cbhash: UInt): HRESULT =
    0

public actual fun HlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: UInt, ppvobj: Long): HRESULT =
    0

public actual fun HlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    0

public actual fun HlinkCreateExtensionServices(pwzadditionalheaders: PCWSTR, phwnd: HWND, pszusername: PCWSTR, pszpassword: PCWSTR, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    0

public actual fun HlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    0

public actual fun HlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    0

public actual fun HlinkCreateFromString(pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    0

public actual fun HlinkCreateShortcut(grfhlshortcutf: UInt, pihl: Long, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    0

public actual fun HlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    0

public actual fun HlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    0

public actual fun HlinkGetSpecialReference(ureference: UInt, ppwzreference: Long): HRESULT =
    0

public actual fun HlinkGetValueFromParams(pwzparams: PCWSTR, pwzname: PCWSTR, ppwzvalue: Long): HRESULT =
    0

public actual fun HlinkIsShortcut(pwzfilename: PCWSTR): HRESULT =
    0

public actual fun HlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: UInt, pbc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    0

public actual fun HlinkNavigateToStringReference(pwztarget: PCWSTR, pwzlocation: PCWSTR, pihlsite: Long, dwsitedata: UInt, pihlframe: Long, grfhlnf: UInt, pibc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    0

public actual fun HlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, puhlid: Long): HRESULT =
    0

public actual fun HlinkOnRenameDocument(dwreserved: UInt, pihlbc: Long, pimkold: Long, pimknew: Long): HRESULT =
    0

public actual fun HlinkParseDisplayName(pibc: Long, pwzdisplayname: PCWSTR, fnoforceabs: BOOL, pccheaten: Long, ppimk: Long): HRESULT =
    0

public actual fun HlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): HRESULT =
    0

public actual fun HlinkQueryCreateFromData(pidataobj: Long): HRESULT =
    0

public actual fun HlinkResolveMonikerForData(pimkreference: Long, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    0

public actual fun HlinkResolveShortcut(pwzshortcutfilename: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    0

public actual fun HlinkResolveShortcutToMoniker(pwzshortcutfilename: PCWSTR, ppimktarget: Long, ppwzlocation: Long): HRESULT =
    0

public actual fun HlinkResolveShortcutToString(pwzshortcutfilename: PCWSTR, ppwztarget: Long, ppwzlocation: Long): HRESULT =
    0

public actual fun HlinkResolveStringForData(pwzreference: PCWSTR, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    0

public actual fun HlinkSetSpecialReference(ureference: UInt, pwzreference: PCWSTR): HRESULT =
    0

public actual fun HlinkTranslateURL(pwzurl: PCWSTR, grfflags: UInt, ppwztranslatedurl: Long): HRESULT =
    0

public actual fun HlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: UInt, pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    0

public actual fun ILAppendID(pidl: Long, pmkid: Long, fappend: BOOL): Long =
    0L

public actual fun ILClone(pidl: Long): Long =
    0L

public actual fun ILCloneFirst(pidl: Long): Long =
    0L

public actual fun ILCombine(pidl1: Long, pidl2: Long): Long =
    0L

public actual fun ILCreateFromPathA(pszpath: PCSTR): Long =
    0L

public actual fun ILCreateFromPathW(pszpath: PCWSTR): Long =
    0L

public actual fun ILFindChild(pidlparent: Long, pidlchild: Long): Long =
    0L

public actual fun ILFindLastID(pidl: Long): Long =
    0L

public actual fun ILFree(pidl: Long) {
}

public actual fun ILGetNext(pidl: Long): Long =
    0L

public actual fun ILGetSize(pidl: Long): UInt =
    0u

public actual fun ILIsEqual(pidl1: Long, pidl2: Long): BOOL =
    0

public actual fun ILIsParent(pidl1: Long, pidl2: Long, fimmediate: BOOL): BOOL =
    0

public actual fun ILLoadFromStreamEx(pstm: Long, pidl: Long): HRESULT =
    0

public actual fun ILRemoveLastID(pidl: Long): BOOL =
    0

public actual fun ILSaveToStream(pstm: Long, pidl: Long): HRESULT =
    0

public actual fun IStream_Copy(pstmfrom: Long, pstmto: Long, cb: UInt): HRESULT =
    0

public actual fun IStream_Read(pstm: Long, pv: Long, cb: UInt): HRESULT =
    0

public actual fun IStream_ReadPidl(pstm: Long, ppidlout: Long): HRESULT =
    0

public actual fun IStream_ReadStr(pstm: Long, ppsz: Long): HRESULT =
    0

public actual fun IStream_Reset(pstm: Long): HRESULT =
    0

public actual fun IStream_Size(pstm: Long, pui: Long): HRESULT =
    0

public actual fun IStream_Write(pstm: Long, pv: Long, cb: UInt): HRESULT =
    0

public actual fun IStream_WritePidl(pstm: Long, pidlwrite: Long): HRESULT =
    0

public actual fun IStream_WriteStr(pstm: Long, psz: PCWSTR): HRESULT =
    0

public actual fun IUnknown_AtomicRelease(ppunk: Long) {
}

public actual fun IUnknown_GetSite(punk: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun IUnknown_GetWindow(punk: Long, phwnd: Long): HRESULT =
    0

public actual fun IUnknown_QueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): HRESULT =
    0

public actual fun IUnknown_Set(ppunk: Long, punk: Long) {
}

public actual fun IUnknown_SetSite(punk: Long, punksite: Long): HRESULT =
    0

public actual fun ImportPrivacySettings(pszfilename: PCWSTR, pfparseprivacypreferences: Long, pfparsepersiterules: Long): BOOL =
    0

public actual fun InitNetworkAddressControl(): BOOL =
    0

public actual fun InitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): HRESULT =
    0

public actual fun InitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): HRESULT =
    0

public actual fun IntlStrEqWorkerA(fcasesens: BOOL, lpstring1: PCSTR, lpstring2: PCSTR, nchar: Int): BOOL =
    0

public actual fun IntlStrEqWorkerW(fcasesens: BOOL, lpstring1: PCWSTR, lpstring2: PCWSTR, nchar: Int): BOOL =
    0

public actual fun IsCharSpaceA(wch: Byte): BOOL =
    0

public actual fun IsCharSpaceW(wch: UShort): BOOL =
    0

public actual fun IsInternetESCEnabled(): BOOL =
    0

public actual fun IsLFNDriveA(pszpath: PCSTR): BOOL =
    0

public actual fun IsLFNDriveW(pszpath: PCWSTR): BOOL =
    0

public actual fun IsNetDrive(idrive: Int): Int =
    0

public actual fun IsOS(dwos: OS): BOOL =
    0

public actual fun IsUserAnAdmin(): BOOL =
    0

public actual fun LoadUserProfileA(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    0

public actual fun LoadUserProfileW(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    0

public actual fun OleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: BOOL): HRESULT =
    0

public actual fun OpenRegStream(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    0L

public actual fun ParseURLA(pcszurl: PCSTR, ppu: Long): HRESULT =
    0

public actual fun ParseURLW(pcszurl: PCWSTR, ppu: Long): HRESULT =
    0

public actual fun PathAddBackslashA(pszpath: PSTR): PSTR =
    0L

public actual fun PathAddBackslashW(pszpath: PWSTR): PWSTR =
    0L

public actual fun PathAddExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    0

public actual fun PathAddExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    0

public actual fun PathAllocCanonicalize(pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    0

public actual fun PathAllocCombine(pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    0

public actual fun PathAppendA(pszpath: PSTR, pszmore: PCSTR): BOOL =
    0

public actual fun PathAppendW(pszpath: PWSTR, pszmore: PCWSTR): BOOL =
    0

public actual fun PathBuildRootA(pszroot: PSTR, idrive: Int): PSTR =
    0L

public actual fun PathBuildRootW(pszroot: PWSTR, idrive: Int): PWSTR =
    0L

public actual fun PathCanonicalizeA(pszbuf: PSTR, pszpath: PCSTR): BOOL =
    0

public actual fun PathCanonicalizeW(pszbuf: PWSTR, pszpath: PCWSTR): BOOL =
    0

public actual fun PathCchAddBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    0

public actual fun PathCchAddBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    0

public actual fun PathCchAddExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    0

public actual fun PathCchAppend(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR): HRESULT =
    0

public actual fun PathCchAppendEx(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    0

public actual fun PathCchCanonicalize(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR): HRESULT =
    0

public actual fun PathCchCanonicalizeEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    0

public actual fun PathCchCombine(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR): HRESULT =
    0

public actual fun PathCchCombineEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    0

public actual fun PathCchFindExtension(pszpath: PCWSTR, cchpath: ULong, ppszext: Long): HRESULT =
    0

public actual fun PathCchIsRoot(pszpath: PCWSTR): BOOL =
    0

public actual fun PathCchRemoveBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    0

public actual fun PathCchRemoveBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    0

public actual fun PathCchRemoveExtension(pszpath: PWSTR, cchpath: ULong): HRESULT =
    0

public actual fun PathCchRemoveFileSpec(pszpath: PWSTR, cchpath: ULong): HRESULT =
    0

public actual fun PathCchRenameExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    0

public actual fun PathCchSkipRoot(pszpath: PCWSTR, ppszrootend: Long): HRESULT =
    0

public actual fun PathCchStripPrefix(pszpath: PWSTR, cchpath: ULong): HRESULT =
    0

public actual fun PathCchStripToRoot(pszpath: PWSTR, cchpath: ULong): HRESULT =
    0

public actual fun PathCleanupSpec(pszdir: PCWSTR, pszspec: PWSTR): Int =
    0

public actual fun PathCombineA(pszdest: PSTR, pszdir: PCSTR, pszfile: PCSTR): PSTR =
    0L

public actual fun PathCombineW(pszdest: PWSTR, pszdir: PCWSTR, pszfile: PCWSTR): PWSTR =
    0L

public actual fun PathCommonPrefixA(pszfile1: PCSTR, pszfile2: PCSTR, achpath: PSTR): Int =
    0

public actual fun PathCommonPrefixW(pszfile1: PCWSTR, pszfile2: PCWSTR, achpath: PWSTR): Int =
    0

public actual fun PathCompactPathA(hdc: HDC, pszpath: PSTR, dx: UInt): BOOL =
    0

public actual fun PathCompactPathExA(pszout: PSTR, pszsrc: PCSTR, cchmax: UInt, dwflags: UInt): BOOL =
    0

public actual fun PathCompactPathExW(pszout: PWSTR, pszsrc: PCWSTR, cchmax: UInt, dwflags: UInt): BOOL =
    0

public actual fun PathCompactPathW(hdc: HDC, pszpath: PWSTR, dx: UInt): BOOL =
    0

public actual fun PathCreateFromUrlA(pszurl: PCSTR, pszpath: PSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    0

public actual fun PathCreateFromUrlAlloc(pszin: PCWSTR, ppszout: Long, dwflags: UInt): HRESULT =
    0

public actual fun PathCreateFromUrlW(pszurl: PCWSTR, pszpath: PWSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    0

public actual fun PathFileExistsA(pszpath: PCSTR): BOOL =
    0

public actual fun PathFileExistsW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathFindExtensionA(pszpath: PCSTR): PSTR =
    0L

public actual fun PathFindExtensionW(pszpath: PCWSTR): PWSTR =
    0L

public actual fun PathFindFileNameA(pszpath: PCSTR): PSTR =
    0L

public actual fun PathFindFileNameW(pszpath: PCWSTR): PWSTR =
    0L

public actual fun PathFindNextComponentA(pszpath: PCSTR): PSTR =
    0L

public actual fun PathFindNextComponentW(pszpath: PCWSTR): PWSTR =
    0L

public actual fun PathFindOnPathA(pszpath: PSTR, ppszotherdirs: Long): BOOL =
    0

public actual fun PathFindOnPathW(pszpath: PWSTR, ppszotherdirs: Long): BOOL =
    0

public actual fun PathFindSuffixArrayA(pszpath: PCSTR, apszsuffix: Long, iarraysize: Int): PCSTR =
    0L

public actual fun PathFindSuffixArrayW(pszpath: PCWSTR, apszsuffix: Long, iarraysize: Int): PCWSTR =
    0L

public actual fun PathGetArgsA(pszpath: PCSTR): PSTR =
    0L

public actual fun PathGetArgsW(pszpath: PCWSTR): PWSTR =
    0L

public actual fun PathGetCharTypeA(ch: UByte): UInt =
    0u

public actual fun PathGetCharTypeW(ch: UShort): UInt =
    0u

public actual fun PathGetDriveNumberA(pszpath: PCSTR): Int =
    0

public actual fun PathGetDriveNumberW(pszpath: PCWSTR): Int =
    0

public actual fun PathGetShortPath(pszlongpath: PWSTR) {
}

public actual fun PathIsContentTypeA(pszpath: PCSTR, pszcontenttype: PCSTR): BOOL =
    0

public actual fun PathIsContentTypeW(pszpath: PCWSTR, pszcontenttype: PCWSTR): BOOL =
    0

public actual fun PathIsDirectoryA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsDirectoryEmptyA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsDirectoryEmptyW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsDirectoryW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsExe(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsFileSpecA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsFileSpecW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsLFNFileSpecA(pszname: PCSTR): BOOL =
    0

public actual fun PathIsLFNFileSpecW(pszname: PCWSTR): BOOL =
    0

public actual fun PathIsNetworkPathA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsNetworkPathW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsPrefixA(pszprefix: PCSTR, pszpath: PCSTR): BOOL =
    0

public actual fun PathIsPrefixW(pszprefix: PCWSTR, pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsRelativeA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsRelativeW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsRootA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsRootW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsSameRootA(pszpath1: PCSTR, pszpath2: PCSTR): BOOL =
    0

public actual fun PathIsSameRootW(pszpath1: PCWSTR, pszpath2: PCWSTR): BOOL =
    0

public actual fun PathIsSlowA(pszfile: PCSTR, dwattr: UInt): BOOL =
    0

public actual fun PathIsSlowW(pszfile: PCWSTR, dwattr: UInt): BOOL =
    0

public actual fun PathIsSystemFolderA(pszpath: PCSTR, dwattrb: UInt): BOOL =
    0

public actual fun PathIsSystemFolderW(pszpath: PCWSTR, dwattrb: UInt): BOOL =
    0

public actual fun PathIsUNCA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsUNCEx(pszpath: PCWSTR, ppszserver: Long): BOOL =
    0

public actual fun PathIsUNCServerA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsUNCServerShareA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsUNCServerShareW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsUNCServerW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsUNCW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathIsURLA(pszpath: PCSTR): BOOL =
    0

public actual fun PathIsURLW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathMakePrettyA(pszpath: PSTR): BOOL =
    0

public actual fun PathMakePrettyW(pszpath: PWSTR): BOOL =
    0

public actual fun PathMakeSystemFolderA(pszpath: PCSTR): BOOL =
    0

public actual fun PathMakeSystemFolderW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathMakeUniqueName(pszuniquename: PWSTR, cchmax: UInt, psztemplate: PCWSTR, pszlongplate: PCWSTR, pszdir: PCWSTR): BOOL =
    0

public actual fun PathMatchSpecA(pszfile: PCSTR, pszspec: PCSTR): BOOL =
    0

public actual fun PathMatchSpecExA(pszfile: PCSTR, pszspec: PCSTR, dwflags: UInt): HRESULT =
    0

public actual fun PathMatchSpecExW(pszfile: PCWSTR, pszspec: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun PathMatchSpecW(pszfile: PCWSTR, pszspec: PCWSTR): BOOL =
    0

public actual fun PathParseIconLocationA(psziconfile: PSTR): Int =
    0

public actual fun PathParseIconLocationW(psziconfile: PWSTR): Int =
    0

public actual fun PathQualify(psz: PWSTR) {
}

public actual fun PathQuoteSpacesA(lpsz: PSTR): BOOL =
    0

public actual fun PathQuoteSpacesW(lpsz: PWSTR): BOOL =
    0

public actual fun PathRelativePathToA(pszpath: PSTR, pszfrom: PCSTR, dwattrfrom: UInt, pszto: PCSTR, dwattrto: UInt): BOOL =
    0

public actual fun PathRelativePathToW(pszpath: PWSTR, pszfrom: PCWSTR, dwattrfrom: UInt, pszto: PCWSTR, dwattrto: UInt): BOOL =
    0

public actual fun PathRemoveArgsA(pszpath: PSTR) {
}

public actual fun PathRemoveArgsW(pszpath: PWSTR) {
}

public actual fun PathRemoveBackslashA(pszpath: PSTR): PSTR =
    0L

public actual fun PathRemoveBackslashW(pszpath: PWSTR): PWSTR =
    0L

public actual fun PathRemoveBlanksA(pszpath: PSTR) {
}

public actual fun PathRemoveBlanksW(pszpath: PWSTR) {
}

public actual fun PathRemoveExtensionA(pszpath: PSTR) {
}

public actual fun PathRemoveExtensionW(pszpath: PWSTR) {
}

public actual fun PathRemoveFileSpecA(pszpath: PSTR): BOOL =
    0

public actual fun PathRemoveFileSpecW(pszpath: PWSTR): BOOL =
    0

public actual fun PathRenameExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    0

public actual fun PathRenameExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    0

public actual fun PathResolve(pszpath: PWSTR, dirs: Long, fflags: UInt): Int =
    0

public actual fun PathSearchAndQualifyA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    0

public actual fun PathSearchAndQualifyW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    0

public actual fun PathSetDlgItemPathA(hdlg: HWND, id: Int, pszpath: PCSTR) {
}

public actual fun PathSetDlgItemPathW(hdlg: HWND, id: Int, pszpath: PCWSTR) {
}

public actual fun PathSkipRootA(pszpath: PCSTR): PSTR =
    0L

public actual fun PathSkipRootW(pszpath: PCWSTR): PWSTR =
    0L

public actual fun PathStripPathA(pszpath: PSTR) {
}

public actual fun PathStripPathW(pszpath: PWSTR) {
}

public actual fun PathStripToRootA(pszpath: PSTR): BOOL =
    0

public actual fun PathStripToRootW(pszpath: PWSTR): BOOL =
    0

public actual fun PathUnExpandEnvStringsA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    0

public actual fun PathUnExpandEnvStringsW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    0

public actual fun PathUndecorateA(pszpath: PSTR) {
}

public actual fun PathUndecorateW(pszpath: PWSTR) {
}

public actual fun PathUnmakeSystemFolderA(pszpath: PCSTR): BOOL =
    0

public actual fun PathUnmakeSystemFolderW(pszpath: PCWSTR): BOOL =
    0

public actual fun PathUnquoteSpacesA(lpsz: PSTR): BOOL =
    0

public actual fun PathUnquoteSpacesW(lpsz: PWSTR): BOOL =
    0

public actual fun PathYetAnotherMakeUniqueName(pszuniquename: PWSTR, pszpath: PCWSTR, pszshort: PCWSTR, pszfilespec: PCWSTR): BOOL =
    0

public actual fun PickIconDlg(hwnd: HWND, psziconpath: PWSTR, cchiconpath: UInt, piiconindex: Long): Int =
    0

public actual fun PropVariantToStrRet(propvar: Long, pstrret: Long): HRESULT =
    0

public actual fun QISearch(that: Long, pqit: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun ReadCabinetState(pcs: Long, clength: Int): BOOL =
    0

public actual fun RealDriveType(idrive: Int, foktohitnet: BOOL): Int =
    0

public actual fun RegisterAppConstrainedChangeNotification(routine: PAPPCONSTRAIN_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    0u

public actual fun RegisterAppStateChangeNotification(routine: PAPPSTATE_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    0u

public actual fun RegisterScaleChangeEvent(hevent: HANDLE, pdwcookie: Long): HRESULT =
    0

public actual fun RegisterScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, hwndnotify: HWND, umsgnotify: UInt, pdwcookie: Long): HRESULT =
    0

public actual fun RemoveWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong): BOOL =
    0

public actual fun RestartDialog(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt): Int =
    0

public actual fun RestartDialogEx(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt, dwreasoncode: UInt): Int =
    0

public actual fun RevokeScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, dwcookie: UInt): HRESULT =
    0

public actual fun SHAddFromPropSheetExtArray(hpsxa: HPSXA, lpfnaddpage: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHAddToRecentDocs(uflags: UInt, pv: Long) {
}

public actual fun SHAlloc(cb: ULong): Long =
    0L

public actual fun SHAllocShared(pvdata: Long, dwsize: UInt, dwprocessid: UInt): HANDLE =
    0L

public actual fun SHAnsiToAnsi(pszsrc: PCSTR, pszdst: PSTR, cchbuf: Int): Int =
    0

public actual fun SHAnsiToUnicode(pszsrc: PCSTR, pwszdst: PWSTR, cwchbuf: Int): Int =
    0

public actual fun SHAppBarMessage(dwmessage: UInt, pdata: Long): ULong =
    0uL

public actual fun SHAssocEnumHandlers(pszextra: PCWSTR, affilter: ASSOC_FILTER, ppenumhandler: Long): HRESULT =
    0

public actual fun SHAssocEnumHandlersForProtocolByApplication(protocol: PCWSTR, riid: Long, enumhandlers: Long): HRESULT =
    0

public actual fun SHAutoComplete(hwndedit: HWND, dwflags: SHELL_AUTOCOMPLETE_FLAGS): HRESULT =
    0

public actual fun SHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    0

public actual fun SHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    0

public actual fun SHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    0

public actual fun SHBrowseForFolderA(lpbi: Long): Long =
    0L

public actual fun SHBrowseForFolderW(lpbi: Long): Long =
    0L

public actual fun SHCLSIDFromString(psz: PCWSTR, pclsid: Long): HRESULT =
    0

public actual fun SHChangeNotification_Lock(hchange: HANDLE, dwprocid: UInt, pppidl: Long, plevent: Long): HANDLE =
    0L

public actual fun SHChangeNotification_Unlock(hlock: HANDLE): BOOL =
    0

public actual fun SHChangeNotify(weventid: Int, uflags: SHCNF_FLAGS, dwitem1: Long, dwitem2: Long) {
}

public actual fun SHChangeNotifyDeregister(ulid: UInt): BOOL =
    0

public actual fun SHChangeNotifyRegister(hwnd: HWND, fsources: SHCNRF_SOURCE, fevents: Int, wmsg: UInt, centries: Int, pshcne: Long): UInt =
    0u

public actual fun SHChangeNotifyRegisterThread(status: SCNRT_STATUS) {
}

public actual fun SHCloneSpecialIDList(hwnd: HWND, csidl: Int, fcreate: BOOL): Long =
    0L

public actual fun SHCoCreateInstance(pszclsid: PCWSTR, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCopyKeyA(hkeysrc: HKEY, pszsrcsubkey: PCSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    0u

public actual fun SHCopyKeyW(hkeysrc: HKEY, pszsrcsubkey: PCWSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    0u

public actual fun SHCreateAssociationRegistration(riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateDataObject(pidlfolder: Long, cidl: UInt, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateDefaultExtractIcon(riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): HRESULT =
    0

public actual fun SHCreateDirectory(hwnd: HWND, pszpath: PCWSTR): Int =
    0

public actual fun SHCreateDirectoryExA(hwnd: HWND, pszpath: PCSTR, psa: Long): Int =
    0

public actual fun SHCreateDirectoryExW(hwnd: HWND, pszpath: PCWSTR, psa: Long): Int =
    0

public actual fun SHCreateFileExtractIconW(pszfile: PCWSTR, dwfileattributes: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateItemFromParsingName(pszpath: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateItemFromRelativeName(psiparent: Long, pszname: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateItemInKnownFolder(kfid: Long, dwkfflags: UInt, pszitem: PCWSTR, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): HRESULT =
    0

public actual fun SHCreateMemStream(pinit: Long, cbinit: UInt): Long =
    0L

public actual fun SHCreateProcessAsUserW(pscpi: Long): BOOL =
    0

public actual fun SHCreatePropSheetExtArray(hkey: HKEY, pszsubkey: PCWSTR, max_iface: UInt): HPSXA =
    0L

public actual fun SHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): HRESULT =
    0

public actual fun SHCreateShellFolderView(pcsfv: Long, ppsv: Long): HRESULT =
    0

public actual fun SHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): HRESULT =
    0

public actual fun SHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): HRESULT =
    0

public actual fun SHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: UInt, ppidl: Long, ppsiitemarray: Long): HRESULT =
    0

public actual fun SHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: Long, ppsiitemarray: Long): HRESULT =
    0

public actual fun SHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHCreateShellPalette(hdc: HDC): HPALETTE =
    0L

public actual fun SHCreateStdEnumFmtEtc(cfmt: UInt, afmt: Long, ppenumformatetc: Long): HRESULT =
    0

public actual fun SHCreateStreamOnFileA(pszfile: PCSTR, grfmode: UInt, ppstm: Long): HRESULT =
    0

public actual fun SHCreateStreamOnFileEx(pszfile: PCWSTR, grfmode: UInt, dwattributes: UInt, fcreate: BOOL, pstmtemplate: Long, ppstm: Long): HRESULT =
    0

public actual fun SHCreateStreamOnFileW(pszfile: PCWSTR, grfmode: UInt, ppstm: Long): HRESULT =
    0

public actual fun SHCreateThread(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE): BOOL =
    0

public actual fun SHCreateThreadRef(pcref: Long, ppunk: Long): HRESULT =
    0

public actual fun SHCreateThreadWithHandle(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE, phandle: Long): BOOL =
    0

public actual fun SHDefExtractIconA(psziconfile: PCSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    0

public actual fun SHDefExtractIconW(psziconfile: PCWSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    0

public actual fun SHDeleteEmptyKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    0u

public actual fun SHDeleteEmptyKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    0u

public actual fun SHDeleteKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    0u

public actual fun SHDeleteKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    0u

public actual fun SHDeleteValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR): WIN32_ERROR =
    0u

public actual fun SHDeleteValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR): WIN32_ERROR =
    0u

public actual fun SHDestroyPropSheetExtArray(hpsxa: HPSXA) {
}

public actual fun SHDoDragDrop(hwnd: HWND, pdata: Long, pdsrc: Long, dweffect: DROPEFFECT, pdweffect: Long): HRESULT =
    0

public actual fun SHEmptyRecycleBinA(hwnd: HWND, pszrootpath: PCSTR, dwflags: UInt): HRESULT =
    0

public actual fun SHEmptyRecycleBinW(hwnd: HWND, pszrootpath: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun SHEnumKeyExA(hkey: HKEY, dwindex: UInt, pszname: PSTR, pcchname: Long): WIN32_ERROR =
    0u

public actual fun SHEnumKeyExW(hkey: HKEY, dwindex: UInt, pszname: PWSTR, pcchname: Long): WIN32_ERROR =
    0u

public actual fun SHEnumValueA(hkey: HKEY, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHEnumValueW(hkey: HKEY, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHEnumerateUnreadMailAccountsW(hkeyuser: HKEY, dwindex: UInt, pszmailaddress: PWSTR, cchmailaddress: Int): HRESULT =
    0

public actual fun SHEvaluateSystemCommandTemplate(pszcmdtemplate: PCWSTR, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): HRESULT =
    0

public actual fun SHFileOperationA(lpfileop: Long): Int =
    0

public actual fun SHFileOperationW(lpfileop: Long): Int =
    0

public actual fun SHFindFiles(pidlfolder: Long, pidlsavefile: Long): BOOL =
    0

public actual fun SHFind_InitMenuPopup(hmenu: HMENU, hwndowner: HWND, idcmdfirst: UInt, idcmdlast: UInt): Long =
    0L

public actual fun SHFlushSFCache() {
}

public actual fun SHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: PSTR, cchbuf: UInt): Int =
    0

public actual fun SHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: PWSTR, cchbuf: UInt): Int =
    0

public actual fun SHFormatDrive(hwnd: HWND, drive: UInt, fmtid: SHFMT_ID, options: UInt): UInt =
    0u

public actual fun SHFree(pv: Long) {
}

public actual fun SHFreeNameMappings(hnamemappings: HANDLE) {
}

public actual fun SHFreeShared(hdata: HANDLE, dwprocessid: UInt): BOOL =
    0

public actual fun SHGetAttributesFromDataObject(pdo: Long, dwattributemask: UInt, pdwattributes: Long, pcitems: Long): HRESULT =
    0

public actual fun SHGetDataFromIDListA(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    0

public actual fun SHGetDataFromIDListW(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    0

public actual fun SHGetDesktopFolder(ppshf: Long): HRESULT =
    0

public actual fun SHGetDiskFreeSpaceExA(pszdirectoryname: PCSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    0

public actual fun SHGetDiskFreeSpaceExW(pszdirectoryname: PCWSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    0

public actual fun SHGetDriveMedia(pszdrive: PCWSTR, pdwmediacontent: Long): HRESULT =
    0

public actual fun SHGetFileInfoA(pszpath: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    0uL

public actual fun SHGetFileInfoW(pszpath: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    0uL

public actual fun SHGetFolderLocation(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, ppidl: Long): HRESULT =
    0

public actual fun SHGetFolderPathA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PSTR): HRESULT =
    0

public actual fun SHGetFolderPathAndSubDirA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCSTR, pszpath: PSTR): HRESULT =
    0

public actual fun SHGetFolderPathAndSubDirW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCWSTR, pszpath: PWSTR): HRESULT =
    0

public actual fun SHGetFolderPathW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PWSTR): HRESULT =
    0

public actual fun SHGetIDListFromObject(punk: Long, ppidl: Long): HRESULT =
    0

public actual fun SHGetIconOverlayIndexA(psziconpath: PCSTR, iiconindex: Int): Int =
    0

public actual fun SHGetIconOverlayIndexW(psziconpath: PCWSTR, iiconindex: Int): Int =
    0

public actual fun SHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): HRESULT =
    0

public actual fun SHGetInstanceExplorer(ppunk: Long): HRESULT =
    0

public actual fun SHGetInverseCMAP(pbmap: Long, cbmap: UInt): HRESULT =
    0

public actual fun SHGetItemFromDataObject(pdtobj: Long, dwflags: DATAOBJ_GET_ITEM_FLAGS, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHGetItemFromObject(punk: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHGetKnownFolderIDList(rfid: Long, dwflags: UInt, htoken: HANDLE, ppidl: Long): HRESULT =
    0

public actual fun SHGetKnownFolderItem(rfid: Long, flags: KNOWN_FOLDER_FLAG, htoken: HANDLE, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHGetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, ppszpath: Long): HRESULT =
    0

public actual fun SHGetLocalizedName(pszpath: PCWSTR, pszresmodule: PWSTR, cch: UInt, pidsres: Long): HRESULT =
    0

public actual fun SHGetMalloc(ppmalloc: Long): HRESULT =
    0

public actual fun SHGetNameFromIDList(pidl: Long, sigdnname: SIGDN, ppszname: Long): HRESULT =
    0

public actual fun SHGetNewLinkInfoA(pszlinkto: PCSTR, pszdir: PCSTR, pszname: PSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    0

public actual fun SHGetNewLinkInfoW(pszlinkto: PCWSTR, pszdir: PCWSTR, pszname: PWSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    0

public actual fun SHGetPathFromIDListA(pidl: Long, pszpath: PSTR): BOOL =
    0

public actual fun SHGetPathFromIDListEx(pidl: Long, pszpath: PWSTR, cchpath: UInt, uopts: GPFIDL_FLAGS): BOOL =
    0

public actual fun SHGetPathFromIDListW(pidl: Long, pszpath: PWSTR): BOOL =
    0

public actual fun SHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): HRESULT =
    0

public actual fun SHGetSetFolderCustomSettings(pfcs: Long, pszpath: PCWSTR, dwreadwrite: UInt): HRESULT =
    0

public actual fun SHGetSetSettings(lpss: Long, dwmask: SSF_MASK, bset: BOOL) {
}

public actual fun SHGetSettings(psfs: Long, dwmask: UInt) {
}

public actual fun SHGetSpecialFolderLocation(hwnd: HWND, csidl: Int, ppidl: Long): HRESULT =
    0

public actual fun SHGetSpecialFolderPathA(hwnd: HWND, pszpath: PSTR, csidl: Int, fcreate: BOOL): BOOL =
    0

public actual fun SHGetSpecialFolderPathW(hwnd: HWND, pszpath: PWSTR, csidl: Int, fcreate: BOOL): BOOL =
    0

public actual fun SHGetStockIconInfo(siid: SHSTOCKICONID, uflags: SHGSI_FLAGS, psii: Long): HRESULT =
    0

public actual fun SHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): HRESULT =
    0

public actual fun SHGetThreadRef(ppunk: Long): HRESULT =
    0

public actual fun SHGetUnreadMailCountW(hkeyuser: HKEY, pszmailaddress: PCWSTR, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: PWSTR, cchshellexecutecommand: Int): HRESULT =
    0

public actual fun SHGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHGetViewStatePropertyBag(pidl: Long, pszbagname: PCWSTR, dwflags: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun SHGlobalCounterDecrement(id: SHGLOBALCOUNTER): Int =
    0

public actual fun SHGlobalCounterGetValue(id: SHGLOBALCOUNTER): Int =
    0

public actual fun SHGlobalCounterIncrement(id: SHGLOBALCOUNTER): Int =
    0

public actual fun SHHandleUpdateImage(pidlextra: Long): Int =
    0

public actual fun SHILCreateFromPath(pszpath: PCWSTR, ppidl: Long, rgfinout: Long): HRESULT =
    0

public actual fun SHInvokePrinterCommandA(hwnd: HWND, uaction: UInt, lpbuf1: PCSTR, lpbuf2: PCSTR, fmodal: BOOL): BOOL =
    0

public actual fun SHInvokePrinterCommandW(hwnd: HWND, uaction: UInt, lpbuf1: PCWSTR, lpbuf2: PCWSTR, fmodal: BOOL): BOOL =
    0

public actual fun SHIsFileAvailableOffline(pwszpath: PCWSTR, pdwstatus: Long): HRESULT =
    0

public actual fun SHIsLowMemoryMachine(dwtype: UInt): BOOL =
    0

public actual fun SHLimitInputEdit(hwndedit: HWND, psf: Long): HRESULT =
    0

public actual fun SHLoadInProc(rclsid: Long): HRESULT =
    0

public actual fun SHLoadIndirectString(pszsource: PCWSTR, pszoutbuf: PWSTR, cchoutbuf: UInt, ppvreserved: Long): HRESULT =
    0

public actual fun SHLoadNonloadedIconOverlayIdentifiers(): HRESULT =
    0

public actual fun SHLockShared(hdata: HANDLE, dwprocessid: UInt): Long =
    0L

public actual fun SHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int =
    0

public actual fun SHMessageBoxCheckA(hwnd: HWND, psztext: PCSTR, pszcaption: PCSTR, utype: UInt, idefault: Int, pszregval: PCSTR): Int =
    0

public actual fun SHMessageBoxCheckW(hwnd: HWND, psztext: PCWSTR, pszcaption: PCWSTR, utype: UInt, idefault: Int, pszregval: PCWSTR): Int =
    0

public actual fun SHMultiFileProperties(pdtobj: Long, dwflags: UInt): HRESULT =
    0

public actual fun SHObjectProperties(hwnd: HWND, shopobjecttype: UInt, pszobjectname: PCWSTR, pszpropertypage: PCWSTR): BOOL =
    0

public actual fun SHOpenFolderAndSelectItems(pidlfolder: Long, cidl: UInt, apidl: Long, dwflags: UInt): HRESULT =
    0

public actual fun SHOpenPropSheetW(pszcaption: PCWSTR, ahkeys: Long, ckeys: UInt, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: PCWSTR): BOOL =
    0

public actual fun SHOpenRegStream2A(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    0L

public actual fun SHOpenRegStream2W(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    0L

public actual fun SHOpenRegStreamA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    0L

public actual fun SHOpenRegStreamW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    0L

public actual fun SHOpenWithDialog(hwndparent: HWND, poainfo: Long): HRESULT =
    0

public actual fun SHParseDisplayName(pszname: PCWSTR, pbc: Long, ppidl: Long, sfgaoin: UInt, psfgaoout: Long): HRESULT =
    0

public actual fun SHPathPrepareForWriteA(hwnd: HWND, punkenablemodless: Long, pszpath: PCSTR, dwflags: UInt): HRESULT =
    0

public actual fun SHPathPrepareForWriteW(hwnd: HWND, punkenablemodless: Long, pszpath: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun SHQueryInfoKeyA(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    0u

public actual fun SHQueryInfoKeyW(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    0u

public actual fun SHQueryRecycleBinA(pszrootpath: PCSTR, pshqueryrbinfo: Long): HRESULT =
    0

public actual fun SHQueryRecycleBinW(pszrootpath: PCWSTR, pshqueryrbinfo: Long): HRESULT =
    0

public actual fun SHQueryUserNotificationState(pquns: Long): HRESULT =
    0

public actual fun SHQueryValueExA(hkey: HKEY, pszvalue: PCSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHQueryValueExW(hkey: HKEY, pszvalue: PCWSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHRegCloseUSKey(huskey: Long): WIN32_ERROR =
    0u

public actual fun SHRegCreateUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegCreateUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegDeleteUSValueA(huskey: Long, pszvalue: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegDeleteUSValueW(huskey: Long, pwzvalue: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegDuplicateHKey(hkey: HKEY): HKEY =
    0L

public actual fun SHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: PSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: PWSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegGetBoolUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    0

public actual fun SHRegGetBoolUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    0

public actual fun SHRegGetIntW(hk: HKEY, pwzkey: PCWSTR, idefault: Int): Int =
    0

public actual fun SHRegGetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pszpath: PSTR, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegGetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pszpath: PWSTR, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegGetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    0u

public actual fun SHRegGetUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    0u

public actual fun SHRegGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHRegGetValueFromHKCUHKLM(pwszkey: PCWSTR, pwszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHRegGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun SHRegOpenUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    0u

public actual fun SHRegOpenUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    0u

public actual fun SHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    0u

public actual fun SHRegQueryUSValueA(huskey: Long, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    0u

public actual fun SHRegQueryUSValueW(huskey: Long, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    0u

public actual fun SHRegSetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pcszpath: PCSTR, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegSetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pcszpath: PCWSTR, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegSetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegSetUSValueW(pwzsubkey: PCWSTR, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegWriteUSValueA(huskey: Long, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHRegWriteUSValueW(huskey: Long, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun SHReleaseThreadRef(): HRESULT =
    0

public actual fun SHRemoveLocalizedName(pszpath: PCWSTR): HRESULT =
    0

public actual fun SHReplaceFromPropSheetExtArray(hpsxa: HPSXA, upageid: UInt, lpfnreplacewith: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHResolveLibrary(psilibrary: Long): HRESULT =
    0

public actual fun SHRestricted(rest: RESTRICTIONS): UInt =
    0u

public actual fun SHSendMessageBroadcastA(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun SHSendMessageBroadcastW(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    0L

public actual fun SHSetDefaultProperties(hwnd: HWND, psi: Long, dwfileopflags: UInt, pfops: Long): HRESULT =
    0

public actual fun SHSetFolderPathA(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCSTR): HRESULT =
    0

public actual fun SHSetFolderPathW(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCWSTR): HRESULT =
    0

public actual fun SHSetInstanceExplorer(punk: Long) {
}

public actual fun SHSetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, pszpath: PCWSTR): HRESULT =
    0

public actual fun SHSetLocalizedName(pszpath: PCWSTR, pszresmodule: PCWSTR, idsres: Int): HRESULT =
    0

public actual fun SHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): HRESULT =
    0

public actual fun SHSetThreadRef(punk: Long): HRESULT =
    0

public actual fun SHSetUnreadMailCountW(pszmailaddress: PCWSTR, dwcount: UInt, pszshellexecutecommand: PCWSTR): HRESULT =
    0

public actual fun SHSetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    0

public actual fun SHSetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    0

public actual fun SHShellFolderView_Message(hwndmain: HWND, umsg: UInt, lparam: LPARAM): LRESULT =
    0L

public actual fun SHShowManageLibraryUI(psilibrary: Long, hwndowner: HWND, psztitle: PCWSTR, pszinstruction: PCWSTR, lmdoptions: LIBRARYMANAGEDIALOGOPTIONS): HRESULT =
    0

public actual fun SHSimpleIDListFromPath(pszpath: PCWSTR): Long =
    0L

public actual fun SHSkipJunction(pbc: Long, pclsid: Long): BOOL =
    0

public actual fun SHStartNetConnectionDialogW(hwnd: HWND, pszremotename: PCWSTR, dwtype: UInt): HRESULT =
    0

public actual fun SHStrDupA(psz: PCSTR, ppwsz: Long): HRESULT =
    0

public actual fun SHStrDupW(psz: PCWSTR, ppwsz: Long): HRESULT =
    0

public actual fun SHStripMneumonicA(pszmenu: PSTR): Byte =
    0

public actual fun SHStripMneumonicW(pszmenu: PWSTR): UShort =
    0u

public actual fun SHTestTokenMembership(htoken: HANDLE, ulrid: UInt): BOOL =
    0

public actual fun SHUnicodeToAnsi(pwszsrc: PCWSTR, pszdst: PSTR, cchbuf: Int): Int =
    0

public actual fun SHUnicodeToUnicode(pwzsrc: PCWSTR, pwzdst: PWSTR, cwchbuf: Int): Int =
    0

public actual fun SHUnlockShared(pvdata: Long): BOOL =
    0

public actual fun SHUpdateImageA(pszhashitem: PCSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
}

public actual fun SHUpdateImageW(pszhashitem: PCWSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
}

public actual fun SHValidateUNC(hwndowner: HWND, pszfile: PWSTR, fconnect: UInt): BOOL =
    0

public actual fun SetCurrentProcessExplicitAppUserModelID(appid: PCWSTR): HRESULT =
    0

public actual fun SetMenuContextHelpId(param0: HMENU, param1: UInt): BOOL =
    0

public actual fun SetWindowContextHelpId(param0: HWND, param1: UInt): BOOL =
    0

public actual fun SetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, dwrefdata: ULong): BOOL =
    0

public actual fun ShellAboutA(hwnd: HWND, szapp: PCSTR, szotherstuff: PCSTR, hicon: HICON): Int =
    0

public actual fun ShellAboutW(hwnd: HWND, szapp: PCWSTR, szotherstuff: PCWSTR, hicon: HICON): Int =
    0

public actual fun ShellExecuteA(hwnd: HWND, lpoperation: PCSTR, lpfile: PCSTR, lpparameters: PCSTR, lpdirectory: PCSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    0L

public actual fun ShellExecuteExA(pexecinfo: Long): BOOL =
    0

public actual fun ShellExecuteExW(pexecinfo: Long): BOOL =
    0

public actual fun ShellExecuteW(hwnd: HWND, lpoperation: PCWSTR, lpfile: PCWSTR, lpparameters: PCWSTR, lpdirectory: PCWSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    0L

public actual fun ShellMessageBoxA(happinst: HINSTANCE, hwnd: HWND, lpctext: PCSTR, lpctitle: PCSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun ShellMessageBoxW(happinst: HINSTANCE, hwnd: HWND, lpctext: PCWSTR, lpctitle: PCWSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun Shell_GetCachedImageIndex(pwsziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    0

public actual fun Shell_GetCachedImageIndexA(psziconpath: PCSTR, iiconindex: Int, uiconflags: UInt): Int =
    0

public actual fun Shell_GetCachedImageIndexW(psziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    0

public actual fun Shell_GetImageLists(phiml: Long, phimlsmall: Long): BOOL =
    0

public actual fun Shell_MergeMenus(hmdst: HMENU, hmsrc: HMENU, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MM_FLAGS): UInt =
    0u

public actual fun Shell_NotifyIconA(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    0

public actual fun Shell_NotifyIconGetRect(identifier: Long, iconlocation: Long): HRESULT =
    0

public actual fun Shell_NotifyIconW(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    0

public actual fun SignalFileOpen(pidl: Long): BOOL =
    0

public actual fun SoftwareUpdateMessageBox(hwnd: HWND, pszdistunit: PCWSTR, dwflags: UInt, psdi: Long): UInt =
    0u

public actual fun StgMakeUniqueName(pstgparent: Long, pszfilespec: PCWSTR, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    0

public actual fun StrCSpnA(pszstr: PCSTR, pszset: PCSTR): Int =
    0

public actual fun StrCSpnIA(pszstr: PCSTR, pszset: PCSTR): Int =
    0

public actual fun StrCSpnIW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    0

public actual fun StrCSpnW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    0

public actual fun StrCatBuffA(pszdest: PSTR, pszsrc: PCSTR, cchdestbuffsize: Int): PSTR =
    0L

public actual fun StrCatBuffW(pszdest: PWSTR, pszsrc: PCWSTR, cchdestbuffsize: Int): PWSTR =
    0L

public actual fun StrCatChainW(pszdst: PWSTR, cchdst: UInt, ichat: UInt, pszsrc: PCWSTR): UInt =
    0u

public actual fun StrCatW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    0L

public actual fun StrChrA(pszstart: PCSTR, wmatch: UShort): PSTR =
    0L

public actual fun StrChrIA(pszstart: PCSTR, wmatch: UShort): PSTR =
    0L

public actual fun StrChrIW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    0L

public actual fun StrChrNIW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    0L

public actual fun StrChrNW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    0L

public actual fun StrChrW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    0L

public actual fun StrCmpCA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    0

public actual fun StrCmpCW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    0

public actual fun StrCmpICA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    0

public actual fun StrCmpICW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    0

public actual fun StrCmpIW(psz1: PCWSTR, psz2: PCWSTR): Int =
    0

public actual fun StrCmpLogicalW(psz1: PCWSTR, psz2: PCWSTR): Int =
    0

public actual fun StrCmpNA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    0

public actual fun StrCmpNCA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    0

public actual fun StrCmpNCW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    0

public actual fun StrCmpNIA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    0

public actual fun StrCmpNICA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    0

public actual fun StrCmpNICW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    0

public actual fun StrCmpNIW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    0

public actual fun StrCmpNW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    0

public actual fun StrCmpW(psz1: PCWSTR, psz2: PCWSTR): Int =
    0

public actual fun StrCpyNW(pszdst: PWSTR, pszsrc: PCWSTR, cchmax: Int): PWSTR =
    0L

public actual fun StrCpyW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    0L

public actual fun StrDupA(pszsrch: PCSTR): PSTR =
    0L

public actual fun StrDupW(pszsrch: PCWSTR): PWSTR =
    0L

public actual fun StrFormatByteSize64A(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    0L

public actual fun StrFormatByteSizeA(dw: UInt, pszbuf: PSTR, cchbuf: UInt): PSTR =
    0L

public actual fun StrFormatByteSizeEx(ull: ULong, flags: SFBS_FLAGS, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    0

public actual fun StrFormatByteSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    0L

public actual fun StrFormatKBSizeA(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    0L

public actual fun StrFormatKBSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    0L

public actual fun StrFromTimeIntervalA(pszout: PSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    0

public actual fun StrFromTimeIntervalW(pszout: PWSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    0

public actual fun StrIsIntlEqualA(fcasesens: BOOL, pszstring1: PCSTR, pszstring2: PCSTR, nchar: Int): BOOL =
    0

public actual fun StrIsIntlEqualW(fcasesens: BOOL, pszstring1: PCWSTR, pszstring2: PCWSTR, nchar: Int): BOOL =
    0

public actual fun StrNCatA(psz1: PSTR, psz2: PCSTR, cchmax: Int): PSTR =
    0L

public actual fun StrNCatW(psz1: PWSTR, psz2: PCWSTR, cchmax: Int): PWSTR =
    0L

public actual fun StrPBrkA(psz: PCSTR, pszset: PCSTR): PSTR =
    0L

public actual fun StrPBrkW(psz: PCWSTR, pszset: PCWSTR): PWSTR =
    0L

public actual fun StrRChrA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    0L

public actual fun StrRChrIA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    0L

public actual fun StrRChrIW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    0L

public actual fun StrRChrW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    0L

public actual fun StrRStrIA(pszsource: PCSTR, pszlast: PCSTR, pszsrch: PCSTR): PSTR =
    0L

public actual fun StrRStrIW(pszsource: PCWSTR, pszlast: PCWSTR, pszsrch: PCWSTR): PWSTR =
    0L

public actual fun StrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): HRESULT =
    0

public actual fun StrRetToBufA(pstr: Long, pidl: Long, pszbuf: PSTR, cchbuf: UInt): HRESULT =
    0

public actual fun StrRetToBufW(pstr: Long, pidl: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    0

public actual fun StrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    0

public actual fun StrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    0

public actual fun StrSpnA(psz: PCSTR, pszset: PCSTR): Int =
    0

public actual fun StrSpnW(psz: PCWSTR, pszset: PCWSTR): Int =
    0

public actual fun StrStrA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    0L

public actual fun StrStrIA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    0L

public actual fun StrStrIW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    0L

public actual fun StrStrNIW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    0L

public actual fun StrStrNW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    0L

public actual fun StrStrW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    0L

public actual fun StrToInt64ExA(pszstring: PCSTR, dwflags: Int, pllret: Long): BOOL =
    0

public actual fun StrToInt64ExW(pszstring: PCWSTR, dwflags: Int, pllret: Long): BOOL =
    0

public actual fun StrToIntA(pszsrc: PCSTR): Int =
    0

public actual fun StrToIntExA(pszstring: PCSTR, dwflags: Int, piret: Long): BOOL =
    0

public actual fun StrToIntExW(pszstring: PCWSTR, dwflags: Int, piret: Long): BOOL =
    0

public actual fun StrToIntW(pszsrc: PCWSTR): Int =
    0

public actual fun StrTrimA(psz: PSTR, psztrimchars: PCSTR): BOOL =
    0

public actual fun StrTrimW(psz: PWSTR, psztrimchars: PCWSTR): BOOL =
    0

public actual fun UnloadUserProfile(htoken: HANDLE, hprofile: HANDLE): BOOL =
    0

public actual fun UnregisterAppConstrainedChangeNotification(registration: PAPPCONSTRAIN_REGISTRATION) {
}

public actual fun UnregisterAppStateChangeNotification(registration: PAPPSTATE_REGISTRATION) {
}

public actual fun UnregisterScaleChangeEvent(dwcookie: ULong): HRESULT =
    0

public actual fun UrlApplySchemeA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlApplySchemeW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlCanonicalizeA(pszurl: PCSTR, pszcanonicalized: PSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlCanonicalizeW(pszurl: PCWSTR, pszcanonicalized: PWSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlCombineA(pszbase: PCSTR, pszrelative: PCSTR, pszcombined: PSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlCombineW(pszbase: PCWSTR, pszrelative: PCWSTR, pszcombined: PWSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlCompareA(psz1: PCSTR, psz2: PCSTR, fignoreslash: BOOL): Int =
    0

public actual fun UrlCompareW(psz1: PCWSTR, psz2: PCWSTR, fignoreslash: BOOL): Int =
    0

public actual fun UrlCreateFromPathA(pszpath: PCSTR, pszurl: PSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlCreateFromPathW(pszpath: PCWSTR, pszurl: PWSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlEscapeA(pszurl: PCSTR, pszescaped: PSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlEscapeW(pszurl: PCWSTR, pszescaped: PWSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlFixupW(pcszurl: PCWSTR, psztranslatedurl: PWSTR, cchmax: UInt): HRESULT =
    0

public actual fun UrlGetLocationA(pszurl: PCSTR): PCSTR =
    0L

public actual fun UrlGetLocationW(pszurl: PCWSTR): PCWSTR =
    0L

public actual fun UrlGetPartA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    0

public actual fun UrlGetPartW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    0

public actual fun UrlHashA(pszurl: PCSTR, pbhash: Long, cbhash: UInt): HRESULT =
    0

public actual fun UrlHashW(pszurl: PCWSTR, pbhash: Long, cbhash: UInt): HRESULT =
    0

public actual fun UrlIsA(pszurl: PCSTR, urlis: URLIS): BOOL =
    0

public actual fun UrlIsNoHistoryA(pszurl: PCSTR): BOOL =
    0

public actual fun UrlIsNoHistoryW(pszurl: PCWSTR): BOOL =
    0

public actual fun UrlIsOpaqueA(pszurl: PCSTR): BOOL =
    0

public actual fun UrlIsOpaqueW(pszurl: PCWSTR): BOOL =
    0

public actual fun UrlIsW(pszurl: PCWSTR, urlis: URLIS): BOOL =
    0

public actual fun UrlUnescapeA(pszurl: PSTR, pszunescaped: PSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    0

public actual fun UrlUnescapeW(pszurl: PWSTR, pszunescaped: PWSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    0

public actual fun VariantToStrRet(varin: Long, pstrret: Long): HRESULT =
    0

public actual fun WhichPlatform(): UInt =
    0u

public actual fun Win32DeleteFile(pszpath: PCWSTR): BOOL =
    0

public actual fun WinHelpA(hwndmain: HWND, lpszhelp: PCSTR, ucommand: UInt, dwdata: ULong): BOOL =
    0

public actual fun WinHelpW(hwndmain: HWND, lpszhelp: PCWSTR, ucommand: UInt, dwdata: ULong): BOOL =
    0

public actual fun WriteCabinetState(pcs: Long): BOOL =
    0

public actual fun wnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR): Int =
    0

public actual fun wnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR): Int =
    0

public actual fun wvnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, arglist: Long): Int =
    0

public actual fun wvnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, arglist: Long): Int =
    0
