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

public expect fun AssocCreate(clsid: GUID, riid: Long, ppv: Long): HRESULT

public expect fun AssocCreateForClasses(rgclasses: Long, cclasses: UInt, riid: Long, ppv: Long): HRESULT

public expect fun AssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): HRESULT

public expect fun AssocGetPerceivedType(pszext: PCWSTR, ptype: Long, pflag: Long, ppsztype: Long): HRESULT

public expect fun AssocIsDangerous(pszassoc: PCWSTR): BOOL

public expect fun AssocQueryKeyA(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCSTR, pszextra: PCSTR, phkeyout: Long): HRESULT

public expect fun AssocQueryKeyW(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCWSTR, pszextra: PCWSTR, phkeyout: Long): HRESULT

public expect fun AssocQueryStringA(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCSTR, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT

public expect fun AssocQueryStringByKeyA(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT

public expect fun AssocQueryStringByKeyW(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT

public expect fun AssocQueryStringW(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCWSTR, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT

public expect fun CDefFolderMenu_Create2(pidlfolder: Long, hwnd: HWND, cidl: UInt, apidl: Long, psf: Long, pfn: LPFNDFMCALLBACK, nkeys: UInt, ahkeys: Long, ppcm: Long): HRESULT

public expect fun CIDLData_CreateFromIDArray(pidlfolder: Long, cidl: UInt, apidl: Long, ppdtobj: Long): HRESULT

public expect fun ChrCmpIA(w1: UShort, w2: UShort): BOOL

public expect fun ChrCmpIW(w1: UShort, w2: UShort): BOOL

public expect fun ColorAdjustLuma(clrrgb: COLORREF, n: Int, fscale: BOOL): COLORREF

public expect fun ColorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): COLORREF

public expect fun ColorRGBToHLS(clrrgb: COLORREF, pwhue: Long, pwluminance: Long, pwsaturation: Long)

public expect fun CommandLineToArgvW(lpcmdline: PCWSTR, pnumargs: Long): Long

public expect fun ConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: BOOL, punktarget: Long, pdwcookie: Long, ppcpout: Long): HRESULT

public expect fun CreateProfile(pszusersid: PCWSTR, pszusername: PCWSTR, pszprofilepath: PWSTR, cchprofilepath: UInt): HRESULT

public expect fun DAD_AutoScroll(hwnd: HWND, pad: Long, pptnow: Long): BOOL

public expect fun DAD_DragEnterEx(hwndtarget: HWND, ptstart: POINT): BOOL

public expect fun DAD_DragEnterEx2(hwndtarget: HWND, ptstart: POINT, pdtobject: Long): BOOL

public expect fun DAD_DragLeave(): BOOL

public expect fun DAD_DragMove(pt: POINT): BOOL

public expect fun DAD_SetDragImage(him: HIMAGELIST, pptoffset: Long): BOOL

public expect fun DAD_ShowDragImage(fshow: BOOL): BOOL

public expect fun DefSubclassProc(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT

public expect fun DeleteProfileA(lpsidstring: PCSTR, lpprofilepath: PCSTR, lpcomputername: PCSTR): BOOL

public expect fun DeleteProfileW(lpsidstring: PCWSTR, lpprofilepath: PCWSTR, lpcomputername: PCWSTR): BOOL

public expect fun DoEnvironmentSubstA(pszsrc: PSTR, cchsrc: UInt): UInt

public expect fun DoEnvironmentSubstW(pszsrc: PWSTR, cchsrc: UInt): UInt

public expect fun DragAcceptFiles(hwnd: HWND, faccept: BOOL)

public expect fun DragFinish(hdrop: HDROP)

public expect fun DragQueryFileA(hdrop: HDROP, ifile: UInt, lpszfile: PSTR, cch: UInt): UInt

public expect fun DragQueryFileW(hdrop: HDROP, ifile: UInt, lpszfile: PWSTR, cch: UInt): UInt

public expect fun DragQueryPoint(hdrop: HDROP, ppt: Long): BOOL

public expect fun DriveType(idrive: Int): Int

public expect fun DuplicateIcon(hinst: HINSTANCE, hicon: HICON): HICON

public expect fun ExtractAssociatedIconA(hinst: HINSTANCE, psziconpath: PSTR, piicon: Long): HICON

public expect fun ExtractAssociatedIconExA(hinst: HINSTANCE, psziconpath: PSTR, piiconindex: Long, piiconid: Long): HICON

public expect fun ExtractAssociatedIconExW(hinst: HINSTANCE, psziconpath: PWSTR, piiconindex: Long, piiconid: Long): HICON

public expect fun ExtractAssociatedIconW(hinst: HINSTANCE, psziconpath: PWSTR, piicon: Long): HICON

public expect fun ExtractIconA(hinst: HINSTANCE, pszexefilename: PCSTR, niconindex: UInt): HICON

public expect fun ExtractIconExA(lpszfile: PCSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt

public expect fun ExtractIconExW(lpszfile: PCWSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt

public expect fun ExtractIconW(hinst: HINSTANCE, pszexefilename: PCWSTR, niconindex: UInt): HICON

public expect fun FindExecutableA(lpfile: PCSTR, lpdirectory: PCSTR, lpresult: PSTR): HINSTANCE

public expect fun FindExecutableW(lpfile: PCWSTR, lpdirectory: PCWSTR, lpresult: PWSTR): HINSTANCE

public expect fun GetAcceptLanguagesA(pszlanguages: PSTR, pcchlanguages: Long): HRESULT

public expect fun GetAcceptLanguagesW(pszlanguages: PWSTR, pcchlanguages: Long): HRESULT

public expect fun GetAllUsersProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL

public expect fun GetAllUsersProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL

public expect fun GetCurrentProcessExplicitAppUserModelID(appid: Long): HRESULT

public expect fun GetDefaultUserProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL

public expect fun GetDefaultUserProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL

public expect fun GetDpiForShellUIComponent(param0: SHELL_UI_COMPONENT): UInt

public expect fun GetFileNameFromBrowse(hwnd: HWND, pszfilepath: PWSTR, cchfilepath: UInt, pszworkingdir: PCWSTR, pszdefext: PCWSTR, pszfilters: PCWSTR, psztitle: PCWSTR): BOOL

public expect fun GetMenuContextHelpId(param0: HMENU): UInt

public expect fun GetMenuPosFromID(hmenu: HMENU, id: UInt): Int

public expect fun GetProfileType(dwflags: Long): BOOL

public expect fun GetProfilesDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL

public expect fun GetProfilesDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL

public expect fun GetScaleFactorForDevice(devicetype: DISPLAY_DEVICE_TYPE): DEVICE_SCALE_FACTOR

public expect fun GetScaleFactorForMonitor(hmon: HMONITOR, pscale: Long): HRESULT

public expect fun GetUserProfileDirectoryA(htoken: HANDLE, lpprofiledir: PSTR, lpcchsize: Long): BOOL

public expect fun GetUserProfileDirectoryW(htoken: HANDLE, lpprofiledir: PWSTR, lpcchsize: Long): BOOL

public expect fun GetWindowContextHelpId(param0: HWND): UInt

public expect fun GetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, pdwrefdata: Long): BOOL

public expect fun HMONITOR_UserFree(param0: Long, param1: Long)

public expect fun HMONITOR_UserFree64(param0: Long, param1: Long)

public expect fun HMONITOR_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HMONITOR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HMONITOR_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HMONITOR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun HMONITOR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun HMONITOR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun HashData(pbdata: Long, cbdata: UInt, pbhash: Long, cbhash: UInt): HRESULT

public expect fun HlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: UInt, ppvobj: Long): HRESULT

public expect fun HlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): HRESULT

public expect fun HlinkCreateExtensionServices(pwzadditionalheaders: PCWSTR, phwnd: HWND, pszusername: PCWSTR, pszpassword: PCWSTR, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT

public expect fun HlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT

public expect fun HlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT

public expect fun HlinkCreateFromString(pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT

public expect fun HlinkCreateShortcut(grfhlshortcutf: UInt, pihl: Long, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT

public expect fun HlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT

public expect fun HlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT

public expect fun HlinkGetSpecialReference(ureference: UInt, ppwzreference: Long): HRESULT

public expect fun HlinkGetValueFromParams(pwzparams: PCWSTR, pwzname: PCWSTR, ppwzvalue: Long): HRESULT

public expect fun HlinkIsShortcut(pwzfilename: PCWSTR): HRESULT

public expect fun HlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: UInt, pbc: Long, pibsc: Long, pihlbc: Long): HRESULT

public expect fun HlinkNavigateToStringReference(pwztarget: PCWSTR, pwzlocation: PCWSTR, pihlsite: Long, dwsitedata: UInt, pihlframe: Long, grfhlnf: UInt, pibc: Long, pibsc: Long, pihlbc: Long): HRESULT

public expect fun HlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, puhlid: Long): HRESULT

public expect fun HlinkOnRenameDocument(dwreserved: UInt, pihlbc: Long, pimkold: Long, pimknew: Long): HRESULT

public expect fun HlinkParseDisplayName(pibc: Long, pwzdisplayname: PCWSTR, fnoforceabs: BOOL, pccheaten: Long, ppimk: Long): HRESULT

public expect fun HlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): HRESULT

public expect fun HlinkQueryCreateFromData(pidataobj: Long): HRESULT

public expect fun HlinkResolveMonikerForData(pimkreference: Long, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT

public expect fun HlinkResolveShortcut(pwzshortcutfilename: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT

public expect fun HlinkResolveShortcutToMoniker(pwzshortcutfilename: PCWSTR, ppimktarget: Long, ppwzlocation: Long): HRESULT

public expect fun HlinkResolveShortcutToString(pwzshortcutfilename: PCWSTR, ppwztarget: Long, ppwzlocation: Long): HRESULT

public expect fun HlinkResolveStringForData(pwzreference: PCWSTR, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT

public expect fun HlinkSetSpecialReference(ureference: UInt, pwzreference: PCWSTR): HRESULT

public expect fun HlinkTranslateURL(pwzurl: PCWSTR, grfflags: UInt, ppwztranslatedurl: Long): HRESULT

public expect fun HlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: UInt, pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT

public expect fun ILAppendID(pidl: Long, pmkid: Long, fappend: BOOL): Long

public expect fun ILClone(pidl: Long): Long

public expect fun ILCloneFirst(pidl: Long): Long

public expect fun ILCombine(pidl1: Long, pidl2: Long): Long

public expect fun ILCreateFromPathA(pszpath: PCSTR): Long

public expect fun ILCreateFromPathW(pszpath: PCWSTR): Long

public expect fun ILFindChild(pidlparent: Long, pidlchild: Long): Long

public expect fun ILFindLastID(pidl: Long): Long

public expect fun ILFree(pidl: Long)

public expect fun ILGetNext(pidl: Long): Long

public expect fun ILGetSize(pidl: Long): UInt

public expect fun ILIsEqual(pidl1: Long, pidl2: Long): BOOL

public expect fun ILIsParent(pidl1: Long, pidl2: Long, fimmediate: BOOL): BOOL

public expect fun ILLoadFromStreamEx(pstm: Long, pidl: Long): HRESULT

public expect fun ILRemoveLastID(pidl: Long): BOOL

public expect fun ILSaveToStream(pstm: Long, pidl: Long): HRESULT

public expect fun IStream_Copy(pstmfrom: Long, pstmto: Long, cb: UInt): HRESULT

public expect fun IStream_Read(pstm: Long, pv: Long, cb: UInt): HRESULT

public expect fun IStream_ReadPidl(pstm: Long, ppidlout: Long): HRESULT

public expect fun IStream_ReadStr(pstm: Long, ppsz: Long): HRESULT

public expect fun IStream_Reset(pstm: Long): HRESULT

public expect fun IStream_Size(pstm: Long, pui: Long): HRESULT

public expect fun IStream_Write(pstm: Long, pv: Long, cb: UInt): HRESULT

public expect fun IStream_WritePidl(pstm: Long, pidlwrite: Long): HRESULT

public expect fun IStream_WriteStr(pstm: Long, psz: PCWSTR): HRESULT

public expect fun IUnknown_AtomicRelease(ppunk: Long)

public expect fun IUnknown_GetSite(punk: Long, riid: Long, ppv: Long): HRESULT

public expect fun IUnknown_GetWindow(punk: Long, phwnd: Long): HRESULT

public expect fun IUnknown_QueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): HRESULT

public expect fun IUnknown_Set(ppunk: Long, punk: Long)

public expect fun IUnknown_SetSite(punk: Long, punksite: Long): HRESULT

public expect fun ImportPrivacySettings(pszfilename: PCWSTR, pfparseprivacypreferences: Long, pfparsepersiterules: Long): BOOL

public expect fun InitNetworkAddressControl(): BOOL

public expect fun InitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): HRESULT

public expect fun InitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): HRESULT

public expect fun IntlStrEqWorkerA(fcasesens: BOOL, lpstring1: PCSTR, lpstring2: PCSTR, nchar: Int): BOOL

public expect fun IntlStrEqWorkerW(fcasesens: BOOL, lpstring1: PCWSTR, lpstring2: PCWSTR, nchar: Int): BOOL

public expect fun IsCharSpaceA(wch: Byte): BOOL

public expect fun IsCharSpaceW(wch: UShort): BOOL

public expect fun IsInternetESCEnabled(): BOOL

public expect fun IsLFNDriveA(pszpath: PCSTR): BOOL

public expect fun IsLFNDriveW(pszpath: PCWSTR): BOOL

public expect fun IsNetDrive(idrive: Int): Int

public expect fun IsOS(dwos: OS): BOOL

public expect fun IsUserAnAdmin(): BOOL

public expect fun LoadUserProfileA(htoken: HANDLE, lpprofileinfo: Long): BOOL

public expect fun LoadUserProfileW(htoken: HANDLE, lpprofileinfo: Long): BOOL

public expect fun OleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: BOOL): HRESULT

public expect fun OpenRegStream(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long

public expect fun ParseURLA(pcszurl: PCSTR, ppu: Long): HRESULT

public expect fun ParseURLW(pcszurl: PCWSTR, ppu: Long): HRESULT

public expect fun PathAddBackslashA(pszpath: PSTR): PSTR

public expect fun PathAddBackslashW(pszpath: PWSTR): PWSTR

public expect fun PathAddExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL

public expect fun PathAddExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL

public expect fun PathAllocCanonicalize(pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT

public expect fun PathAllocCombine(pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT

public expect fun PathAppendA(pszpath: PSTR, pszmore: PCSTR): BOOL

public expect fun PathAppendW(pszpath: PWSTR, pszmore: PCWSTR): BOOL

public expect fun PathBuildRootA(pszroot: PSTR, idrive: Int): PSTR

public expect fun PathBuildRootW(pszroot: PWSTR, idrive: Int): PWSTR

public expect fun PathCanonicalizeA(pszbuf: PSTR, pszpath: PCSTR): BOOL

public expect fun PathCanonicalizeW(pszbuf: PWSTR, pszpath: PCWSTR): BOOL

public expect fun PathCchAddBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT

public expect fun PathCchAddBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT

public expect fun PathCchAddExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT

public expect fun PathCchAppend(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR): HRESULT

public expect fun PathCchAppendEx(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT

public expect fun PathCchCanonicalize(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR): HRESULT

public expect fun PathCchCanonicalizeEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT

public expect fun PathCchCombine(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR): HRESULT

public expect fun PathCchCombineEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT

public expect fun PathCchFindExtension(pszpath: PCWSTR, cchpath: ULong, ppszext: Long): HRESULT

public expect fun PathCchIsRoot(pszpath: PCWSTR): BOOL

public expect fun PathCchRemoveBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT

public expect fun PathCchRemoveBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT

public expect fun PathCchRemoveExtension(pszpath: PWSTR, cchpath: ULong): HRESULT

public expect fun PathCchRemoveFileSpec(pszpath: PWSTR, cchpath: ULong): HRESULT

public expect fun PathCchRenameExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT

public expect fun PathCchSkipRoot(pszpath: PCWSTR, ppszrootend: Long): HRESULT

public expect fun PathCchStripPrefix(pszpath: PWSTR, cchpath: ULong): HRESULT

public expect fun PathCchStripToRoot(pszpath: PWSTR, cchpath: ULong): HRESULT

public expect fun PathCleanupSpec(pszdir: PCWSTR, pszspec: PWSTR): Int

public expect fun PathCombineA(pszdest: PSTR, pszdir: PCSTR, pszfile: PCSTR): PSTR

public expect fun PathCombineW(pszdest: PWSTR, pszdir: PCWSTR, pszfile: PCWSTR): PWSTR

public expect fun PathCommonPrefixA(pszfile1: PCSTR, pszfile2: PCSTR, achpath: PSTR): Int

public expect fun PathCommonPrefixW(pszfile1: PCWSTR, pszfile2: PCWSTR, achpath: PWSTR): Int

public expect fun PathCompactPathA(hdc: HDC, pszpath: PSTR, dx: UInt): BOOL

public expect fun PathCompactPathExA(pszout: PSTR, pszsrc: PCSTR, cchmax: UInt, dwflags: UInt): BOOL

public expect fun PathCompactPathExW(pszout: PWSTR, pszsrc: PCWSTR, cchmax: UInt, dwflags: UInt): BOOL

public expect fun PathCompactPathW(hdc: HDC, pszpath: PWSTR, dx: UInt): BOOL

public expect fun PathCreateFromUrlA(pszurl: PCSTR, pszpath: PSTR, pcchpath: Long, dwflags: UInt): HRESULT

public expect fun PathCreateFromUrlAlloc(pszin: PCWSTR, ppszout: Long, dwflags: UInt): HRESULT

public expect fun PathCreateFromUrlW(pszurl: PCWSTR, pszpath: PWSTR, pcchpath: Long, dwflags: UInt): HRESULT

public expect fun PathFileExistsA(pszpath: PCSTR): BOOL

public expect fun PathFileExistsW(pszpath: PCWSTR): BOOL

public expect fun PathFindExtensionA(pszpath: PCSTR): PSTR

public expect fun PathFindExtensionW(pszpath: PCWSTR): PWSTR

public expect fun PathFindFileNameA(pszpath: PCSTR): PSTR

public expect fun PathFindFileNameW(pszpath: PCWSTR): PWSTR

public expect fun PathFindNextComponentA(pszpath: PCSTR): PSTR

public expect fun PathFindNextComponentW(pszpath: PCWSTR): PWSTR

public expect fun PathFindOnPathA(pszpath: PSTR, ppszotherdirs: Long): BOOL

public expect fun PathFindOnPathW(pszpath: PWSTR, ppszotherdirs: Long): BOOL

public expect fun PathFindSuffixArrayA(pszpath: PCSTR, apszsuffix: Long, iarraysize: Int): PCSTR

public expect fun PathFindSuffixArrayW(pszpath: PCWSTR, apszsuffix: Long, iarraysize: Int): PCWSTR

public expect fun PathGetArgsA(pszpath: PCSTR): PSTR

public expect fun PathGetArgsW(pszpath: PCWSTR): PWSTR

public expect fun PathGetCharTypeA(ch: UByte): UInt

public expect fun PathGetCharTypeW(ch: UShort): UInt

public expect fun PathGetDriveNumberA(pszpath: PCSTR): Int

public expect fun PathGetDriveNumberW(pszpath: PCWSTR): Int

public expect fun PathGetShortPath(pszlongpath: PWSTR)

public expect fun PathIsContentTypeA(pszpath: PCSTR, pszcontenttype: PCSTR): BOOL

public expect fun PathIsContentTypeW(pszpath: PCWSTR, pszcontenttype: PCWSTR): BOOL

public expect fun PathIsDirectoryA(pszpath: PCSTR): BOOL

public expect fun PathIsDirectoryEmptyA(pszpath: PCSTR): BOOL

public expect fun PathIsDirectoryEmptyW(pszpath: PCWSTR): BOOL

public expect fun PathIsDirectoryW(pszpath: PCWSTR): BOOL

public expect fun PathIsExe(pszpath: PCWSTR): BOOL

public expect fun PathIsFileSpecA(pszpath: PCSTR): BOOL

public expect fun PathIsFileSpecW(pszpath: PCWSTR): BOOL

public expect fun PathIsLFNFileSpecA(pszname: PCSTR): BOOL

public expect fun PathIsLFNFileSpecW(pszname: PCWSTR): BOOL

public expect fun PathIsNetworkPathA(pszpath: PCSTR): BOOL

public expect fun PathIsNetworkPathW(pszpath: PCWSTR): BOOL

public expect fun PathIsPrefixA(pszprefix: PCSTR, pszpath: PCSTR): BOOL

public expect fun PathIsPrefixW(pszprefix: PCWSTR, pszpath: PCWSTR): BOOL

public expect fun PathIsRelativeA(pszpath: PCSTR): BOOL

public expect fun PathIsRelativeW(pszpath: PCWSTR): BOOL

public expect fun PathIsRootA(pszpath: PCSTR): BOOL

public expect fun PathIsRootW(pszpath: PCWSTR): BOOL

public expect fun PathIsSameRootA(pszpath1: PCSTR, pszpath2: PCSTR): BOOL

public expect fun PathIsSameRootW(pszpath1: PCWSTR, pszpath2: PCWSTR): BOOL

public expect fun PathIsSlowA(pszfile: PCSTR, dwattr: UInt): BOOL

public expect fun PathIsSlowW(pszfile: PCWSTR, dwattr: UInt): BOOL

public expect fun PathIsSystemFolderA(pszpath: PCSTR, dwattrb: UInt): BOOL

public expect fun PathIsSystemFolderW(pszpath: PCWSTR, dwattrb: UInt): BOOL

public expect fun PathIsUNCA(pszpath: PCSTR): BOOL

public expect fun PathIsUNCEx(pszpath: PCWSTR, ppszserver: Long): BOOL

public expect fun PathIsUNCServerA(pszpath: PCSTR): BOOL

public expect fun PathIsUNCServerShareA(pszpath: PCSTR): BOOL

public expect fun PathIsUNCServerShareW(pszpath: PCWSTR): BOOL

public expect fun PathIsUNCServerW(pszpath: PCWSTR): BOOL

public expect fun PathIsUNCW(pszpath: PCWSTR): BOOL

public expect fun PathIsURLA(pszpath: PCSTR): BOOL

public expect fun PathIsURLW(pszpath: PCWSTR): BOOL

public expect fun PathMakePrettyA(pszpath: PSTR): BOOL

public expect fun PathMakePrettyW(pszpath: PWSTR): BOOL

public expect fun PathMakeSystemFolderA(pszpath: PCSTR): BOOL

public expect fun PathMakeSystemFolderW(pszpath: PCWSTR): BOOL

public expect fun PathMakeUniqueName(pszuniquename: PWSTR, cchmax: UInt, psztemplate: PCWSTR, pszlongplate: PCWSTR, pszdir: PCWSTR): BOOL

public expect fun PathMatchSpecA(pszfile: PCSTR, pszspec: PCSTR): BOOL

public expect fun PathMatchSpecExA(pszfile: PCSTR, pszspec: PCSTR, dwflags: UInt): HRESULT

public expect fun PathMatchSpecExW(pszfile: PCWSTR, pszspec: PCWSTR, dwflags: UInt): HRESULT

public expect fun PathMatchSpecW(pszfile: PCWSTR, pszspec: PCWSTR): BOOL

public expect fun PathParseIconLocationA(psziconfile: PSTR): Int

public expect fun PathParseIconLocationW(psziconfile: PWSTR): Int

public expect fun PathQualify(psz: PWSTR)

public expect fun PathQuoteSpacesA(lpsz: PSTR): BOOL

public expect fun PathQuoteSpacesW(lpsz: PWSTR): BOOL

public expect fun PathRelativePathToA(pszpath: PSTR, pszfrom: PCSTR, dwattrfrom: UInt, pszto: PCSTR, dwattrto: UInt): BOOL

public expect fun PathRelativePathToW(pszpath: PWSTR, pszfrom: PCWSTR, dwattrfrom: UInt, pszto: PCWSTR, dwattrto: UInt): BOOL

public expect fun PathRemoveArgsA(pszpath: PSTR)

public expect fun PathRemoveArgsW(pszpath: PWSTR)

public expect fun PathRemoveBackslashA(pszpath: PSTR): PSTR

public expect fun PathRemoveBackslashW(pszpath: PWSTR): PWSTR

public expect fun PathRemoveBlanksA(pszpath: PSTR)

public expect fun PathRemoveBlanksW(pszpath: PWSTR)

public expect fun PathRemoveExtensionA(pszpath: PSTR)

public expect fun PathRemoveExtensionW(pszpath: PWSTR)

public expect fun PathRemoveFileSpecA(pszpath: PSTR): BOOL

public expect fun PathRemoveFileSpecW(pszpath: PWSTR): BOOL

public expect fun PathRenameExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL

public expect fun PathRenameExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL

public expect fun PathResolve(pszpath: PWSTR, dirs: Long, fflags: UInt): Int

public expect fun PathSearchAndQualifyA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL

public expect fun PathSearchAndQualifyW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL

public expect fun PathSetDlgItemPathA(hdlg: HWND, id: Int, pszpath: PCSTR)

public expect fun PathSetDlgItemPathW(hdlg: HWND, id: Int, pszpath: PCWSTR)

public expect fun PathSkipRootA(pszpath: PCSTR): PSTR

public expect fun PathSkipRootW(pszpath: PCWSTR): PWSTR

public expect fun PathStripPathA(pszpath: PSTR)

public expect fun PathStripPathW(pszpath: PWSTR)

public expect fun PathStripToRootA(pszpath: PSTR): BOOL

public expect fun PathStripToRootW(pszpath: PWSTR): BOOL

public expect fun PathUnExpandEnvStringsA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL

public expect fun PathUnExpandEnvStringsW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL

public expect fun PathUndecorateA(pszpath: PSTR)

public expect fun PathUndecorateW(pszpath: PWSTR)

public expect fun PathUnmakeSystemFolderA(pszpath: PCSTR): BOOL

public expect fun PathUnmakeSystemFolderW(pszpath: PCWSTR): BOOL

public expect fun PathUnquoteSpacesA(lpsz: PSTR): BOOL

public expect fun PathUnquoteSpacesW(lpsz: PWSTR): BOOL

public expect fun PathYetAnotherMakeUniqueName(pszuniquename: PWSTR, pszpath: PCWSTR, pszshort: PCWSTR, pszfilespec: PCWSTR): BOOL

public expect fun PickIconDlg(hwnd: HWND, psziconpath: PWSTR, cchiconpath: UInt, piiconindex: Long): Int

public expect fun PropVariantToStrRet(propvar: Long, pstrret: Long): HRESULT

public expect fun QISearch(that: Long, pqit: Long, riid: Long, ppv: Long): HRESULT

public expect fun ReadCabinetState(pcs: Long, clength: Int): BOOL

public expect fun RealDriveType(idrive: Int, foktohitnet: BOOL): Int

public expect fun RegisterAppConstrainedChangeNotification(routine: PAPPCONSTRAIN_CHANGE_ROUTINE, context: Long, registration: Long): UInt

public expect fun RegisterAppStateChangeNotification(routine: PAPPSTATE_CHANGE_ROUTINE, context: Long, registration: Long): UInt

public expect fun RegisterScaleChangeEvent(hevent: HANDLE, pdwcookie: Long): HRESULT

public expect fun RegisterScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, hwndnotify: HWND, umsgnotify: UInt, pdwcookie: Long): HRESULT

public expect fun RemoveWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong): BOOL

public expect fun RestartDialog(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt): Int

public expect fun RestartDialogEx(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt, dwreasoncode: UInt): Int

public expect fun RevokeScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, dwcookie: UInt): HRESULT

public expect fun SHAddFromPropSheetExtArray(hpsxa: HPSXA, lpfnaddpage: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt

public expect fun SHAddToRecentDocs(uflags: UInt, pv: Long)

public expect fun SHAlloc(cb: ULong): Long

public expect fun SHAllocShared(pvdata: Long, dwsize: UInt, dwprocessid: UInt): HANDLE

public expect fun SHAnsiToAnsi(pszsrc: PCSTR, pszdst: PSTR, cchbuf: Int): Int

public expect fun SHAnsiToUnicode(pszsrc: PCSTR, pwszdst: PWSTR, cwchbuf: Int): Int

public expect fun SHAppBarMessage(dwmessage: UInt, pdata: Long): ULong

public expect fun SHAssocEnumHandlers(pszextra: PCWSTR, affilter: ASSOC_FILTER, ppenumhandler: Long): HRESULT

public expect fun SHAssocEnumHandlersForProtocolByApplication(protocol: PCWSTR, riid: Long, enumhandlers: Long): HRESULT

public expect fun SHAutoComplete(hwndedit: HWND, dwflags: SHELL_AUTOCOMPLETE_FLAGS): HRESULT

public expect fun SHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT

public expect fun SHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT

public expect fun SHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT

public expect fun SHBrowseForFolderA(lpbi: Long): Long

public expect fun SHBrowseForFolderW(lpbi: Long): Long

public expect fun SHCLSIDFromString(psz: PCWSTR, pclsid: Long): HRESULT

public expect fun SHChangeNotification_Lock(hchange: HANDLE, dwprocid: UInt, pppidl: Long, plevent: Long): HANDLE

public expect fun SHChangeNotification_Unlock(hlock: HANDLE): BOOL

public expect fun SHChangeNotify(weventid: Int, uflags: SHCNF_FLAGS, dwitem1: Long, dwitem2: Long)

public expect fun SHChangeNotifyDeregister(ulid: UInt): BOOL

public expect fun SHChangeNotifyRegister(hwnd: HWND, fsources: SHCNRF_SOURCE, fevents: Int, wmsg: UInt, centries: Int, pshcne: Long): UInt

public expect fun SHChangeNotifyRegisterThread(status: SCNRT_STATUS)

public expect fun SHCloneSpecialIDList(hwnd: HWND, csidl: Int, fcreate: BOOL): Long

public expect fun SHCoCreateInstance(pszclsid: PCWSTR, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCopyKeyA(hkeysrc: HKEY, pszsrcsubkey: PCSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR

public expect fun SHCopyKeyW(hkeysrc: HKEY, pszsrcsubkey: PCWSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR

public expect fun SHCreateAssociationRegistration(riid: Long, ppv: Long): HRESULT

public expect fun SHCreateDataObject(pidlfolder: Long, cidl: UInt, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateDefaultExtractIcon(riid: Long, ppv: Long): HRESULT

public expect fun SHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): HRESULT

public expect fun SHCreateDirectory(hwnd: HWND, pszpath: PCWSTR): Int

public expect fun SHCreateDirectoryExA(hwnd: HWND, pszpath: PCSTR, psa: Long): Int

public expect fun SHCreateDirectoryExW(hwnd: HWND, pszpath: PCWSTR, psa: Long): Int

public expect fun SHCreateFileExtractIconW(pszfile: PCWSTR, dwfileattributes: UInt, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateItemFromParsingName(pszpath: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateItemFromRelativeName(psiparent: Long, pszname: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateItemInKnownFolder(kfid: Long, dwkfflags: UInt, pszitem: PCWSTR, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): HRESULT

public expect fun SHCreateMemStream(pinit: Long, cbinit: UInt): Long

public expect fun SHCreateProcessAsUserW(pscpi: Long): BOOL

public expect fun SHCreatePropSheetExtArray(hkey: HKEY, pszsubkey: PCWSTR, max_iface: UInt): HPSXA

public expect fun SHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): HRESULT

public expect fun SHCreateShellFolderView(pcsfv: Long, ppsv: Long): HRESULT

public expect fun SHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): HRESULT

public expect fun SHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): HRESULT

public expect fun SHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: UInt, ppidl: Long, ppsiitemarray: Long): HRESULT

public expect fun SHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: Long, ppsiitemarray: Long): HRESULT

public expect fun SHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHCreateShellPalette(hdc: HDC): HPALETTE

public expect fun SHCreateStdEnumFmtEtc(cfmt: UInt, afmt: Long, ppenumformatetc: Long): HRESULT

public expect fun SHCreateStreamOnFileA(pszfile: PCSTR, grfmode: UInt, ppstm: Long): HRESULT

public expect fun SHCreateStreamOnFileEx(pszfile: PCWSTR, grfmode: UInt, dwattributes: UInt, fcreate: BOOL, pstmtemplate: Long, ppstm: Long): HRESULT

public expect fun SHCreateStreamOnFileW(pszfile: PCWSTR, grfmode: UInt, ppstm: Long): HRESULT

public expect fun SHCreateThread(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE): BOOL

public expect fun SHCreateThreadRef(pcref: Long, ppunk: Long): HRESULT

public expect fun SHCreateThreadWithHandle(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE, phandle: Long): BOOL

public expect fun SHDefExtractIconA(psziconfile: PCSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT

public expect fun SHDefExtractIconW(psziconfile: PCWSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT

public expect fun SHDeleteEmptyKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR

public expect fun SHDeleteEmptyKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR

public expect fun SHDeleteKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR

public expect fun SHDeleteKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR

public expect fun SHDeleteValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR): WIN32_ERROR

public expect fun SHDeleteValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR): WIN32_ERROR

public expect fun SHDestroyPropSheetExtArray(hpsxa: HPSXA)

public expect fun SHDoDragDrop(hwnd: HWND, pdata: Long, pdsrc: Long, dweffect: DROPEFFECT, pdweffect: Long): HRESULT

public expect fun SHEmptyRecycleBinA(hwnd: HWND, pszrootpath: PCSTR, dwflags: UInt): HRESULT

public expect fun SHEmptyRecycleBinW(hwnd: HWND, pszrootpath: PCWSTR, dwflags: UInt): HRESULT

public expect fun SHEnumKeyExA(hkey: HKEY, dwindex: UInt, pszname: PSTR, pcchname: Long): WIN32_ERROR

public expect fun SHEnumKeyExW(hkey: HKEY, dwindex: UInt, pszname: PWSTR, pcchname: Long): WIN32_ERROR

public expect fun SHEnumValueA(hkey: HKEY, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHEnumValueW(hkey: HKEY, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHEnumerateUnreadMailAccountsW(hkeyuser: HKEY, dwindex: UInt, pszmailaddress: PWSTR, cchmailaddress: Int): HRESULT

public expect fun SHEvaluateSystemCommandTemplate(pszcmdtemplate: PCWSTR, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): HRESULT

public expect fun SHFileOperationA(lpfileop: Long): Int

public expect fun SHFileOperationW(lpfileop: Long): Int

public expect fun SHFindFiles(pidlfolder: Long, pidlsavefile: Long): BOOL

public expect fun SHFind_InitMenuPopup(hmenu: HMENU, hwndowner: HWND, idcmdfirst: UInt, idcmdlast: UInt): Long

public expect fun SHFlushSFCache()

public expect fun SHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: PSTR, cchbuf: UInt): Int

public expect fun SHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: PWSTR, cchbuf: UInt): Int

public expect fun SHFormatDrive(hwnd: HWND, drive: UInt, fmtid: SHFMT_ID, options: UInt): UInt

public expect fun SHFree(pv: Long)

public expect fun SHFreeNameMappings(hnamemappings: HANDLE)

public expect fun SHFreeShared(hdata: HANDLE, dwprocessid: UInt): BOOL

public expect fun SHGetAttributesFromDataObject(pdo: Long, dwattributemask: UInt, pdwattributes: Long, pcitems: Long): HRESULT

public expect fun SHGetDataFromIDListA(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT

public expect fun SHGetDataFromIDListW(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT

public expect fun SHGetDesktopFolder(ppshf: Long): HRESULT

public expect fun SHGetDiskFreeSpaceExA(pszdirectoryname: PCSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL

public expect fun SHGetDiskFreeSpaceExW(pszdirectoryname: PCWSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL

public expect fun SHGetDriveMedia(pszdrive: PCWSTR, pdwmediacontent: Long): HRESULT

public expect fun SHGetFileInfoA(pszpath: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong

public expect fun SHGetFileInfoW(pszpath: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong

public expect fun SHGetFolderLocation(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, ppidl: Long): HRESULT

public expect fun SHGetFolderPathA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PSTR): HRESULT

public expect fun SHGetFolderPathAndSubDirA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCSTR, pszpath: PSTR): HRESULT

public expect fun SHGetFolderPathAndSubDirW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCWSTR, pszpath: PWSTR): HRESULT

public expect fun SHGetFolderPathW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PWSTR): HRESULT

public expect fun SHGetIDListFromObject(punk: Long, ppidl: Long): HRESULT

public expect fun SHGetIconOverlayIndexA(psziconpath: PCSTR, iiconindex: Int): Int

public expect fun SHGetIconOverlayIndexW(psziconpath: PCWSTR, iiconindex: Int): Int

public expect fun SHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): HRESULT

public expect fun SHGetInstanceExplorer(ppunk: Long): HRESULT

public expect fun SHGetInverseCMAP(pbmap: Long, cbmap: UInt): HRESULT

public expect fun SHGetItemFromDataObject(pdtobj: Long, dwflags: DATAOBJ_GET_ITEM_FLAGS, riid: Long, ppv: Long): HRESULT

public expect fun SHGetItemFromObject(punk: Long, riid: Long, ppv: Long): HRESULT

public expect fun SHGetKnownFolderIDList(rfid: Long, dwflags: UInt, htoken: HANDLE, ppidl: Long): HRESULT

public expect fun SHGetKnownFolderItem(rfid: Long, flags: KNOWN_FOLDER_FLAG, htoken: HANDLE, riid: Long, ppv: Long): HRESULT

public expect fun SHGetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, ppszpath: Long): HRESULT

public expect fun SHGetLocalizedName(pszpath: PCWSTR, pszresmodule: PWSTR, cch: UInt, pidsres: Long): HRESULT

public expect fun SHGetMalloc(ppmalloc: Long): HRESULT

public expect fun SHGetNameFromIDList(pidl: Long, sigdnname: SIGDN, ppszname: Long): HRESULT

public expect fun SHGetNewLinkInfoA(pszlinkto: PCSTR, pszdir: PCSTR, pszname: PSTR, pfmustcopy: Long, uflags: UInt): BOOL

public expect fun SHGetNewLinkInfoW(pszlinkto: PCWSTR, pszdir: PCWSTR, pszname: PWSTR, pfmustcopy: Long, uflags: UInt): BOOL

public expect fun SHGetPathFromIDListA(pidl: Long, pszpath: PSTR): BOOL

public expect fun SHGetPathFromIDListEx(pidl: Long, pszpath: PWSTR, cchpath: UInt, uopts: GPFIDL_FLAGS): BOOL

public expect fun SHGetPathFromIDListW(pidl: Long, pszpath: PWSTR): BOOL

public expect fun SHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): HRESULT

public expect fun SHGetSetFolderCustomSettings(pfcs: Long, pszpath: PCWSTR, dwreadwrite: UInt): HRESULT

public expect fun SHGetSetSettings(lpss: Long, dwmask: SSF_MASK, bset: BOOL)

public expect fun SHGetSettings(psfs: Long, dwmask: UInt)

public expect fun SHGetSpecialFolderLocation(hwnd: HWND, csidl: Int, ppidl: Long): HRESULT

public expect fun SHGetSpecialFolderPathA(hwnd: HWND, pszpath: PSTR, csidl: Int, fcreate: BOOL): BOOL

public expect fun SHGetSpecialFolderPathW(hwnd: HWND, pszpath: PWSTR, csidl: Int, fcreate: BOOL): BOOL

public expect fun SHGetStockIconInfo(siid: SHSTOCKICONID, uflags: SHGSI_FLAGS, psii: Long): HRESULT

public expect fun SHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): HRESULT

public expect fun SHGetThreadRef(ppunk: Long): HRESULT

public expect fun SHGetUnreadMailCountW(hkeyuser: HKEY, pszmailaddress: PCWSTR, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: PWSTR, cchshellexecutecommand: Int): HRESULT

public expect fun SHGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHGetViewStatePropertyBag(pidl: Long, pszbagname: PCWSTR, dwflags: UInt, riid: Long, ppv: Long): HRESULT

public expect fun SHGlobalCounterDecrement(id: SHGLOBALCOUNTER): Int

public expect fun SHGlobalCounterGetValue(id: SHGLOBALCOUNTER): Int

public expect fun SHGlobalCounterIncrement(id: SHGLOBALCOUNTER): Int

public expect fun SHHandleUpdateImage(pidlextra: Long): Int

public expect fun SHILCreateFromPath(pszpath: PCWSTR, ppidl: Long, rgfinout: Long): HRESULT

public expect fun SHInvokePrinterCommandA(hwnd: HWND, uaction: UInt, lpbuf1: PCSTR, lpbuf2: PCSTR, fmodal: BOOL): BOOL

public expect fun SHInvokePrinterCommandW(hwnd: HWND, uaction: UInt, lpbuf1: PCWSTR, lpbuf2: PCWSTR, fmodal: BOOL): BOOL

public expect fun SHIsFileAvailableOffline(pwszpath: PCWSTR, pdwstatus: Long): HRESULT

public expect fun SHIsLowMemoryMachine(dwtype: UInt): BOOL

public expect fun SHLimitInputEdit(hwndedit: HWND, psf: Long): HRESULT

public expect fun SHLoadInProc(rclsid: Long): HRESULT

public expect fun SHLoadIndirectString(pszsource: PCWSTR, pszoutbuf: PWSTR, cchoutbuf: UInt, ppvreserved: Long): HRESULT

public expect fun SHLoadNonloadedIconOverlayIdentifiers(): HRESULT

public expect fun SHLockShared(hdata: HANDLE, dwprocessid: UInt): Long

public expect fun SHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int

public expect fun SHMessageBoxCheckA(hwnd: HWND, psztext: PCSTR, pszcaption: PCSTR, utype: UInt, idefault: Int, pszregval: PCSTR): Int

public expect fun SHMessageBoxCheckW(hwnd: HWND, psztext: PCWSTR, pszcaption: PCWSTR, utype: UInt, idefault: Int, pszregval: PCWSTR): Int

public expect fun SHMultiFileProperties(pdtobj: Long, dwflags: UInt): HRESULT

public expect fun SHObjectProperties(hwnd: HWND, shopobjecttype: UInt, pszobjectname: PCWSTR, pszpropertypage: PCWSTR): BOOL

public expect fun SHOpenFolderAndSelectItems(pidlfolder: Long, cidl: UInt, apidl: Long, dwflags: UInt): HRESULT

public expect fun SHOpenPropSheetW(pszcaption: PCWSTR, ahkeys: Long, ckeys: UInt, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: PCWSTR): BOOL

public expect fun SHOpenRegStream2A(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long

public expect fun SHOpenRegStream2W(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long

public expect fun SHOpenRegStreamA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long

public expect fun SHOpenRegStreamW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long

public expect fun SHOpenWithDialog(hwndparent: HWND, poainfo: Long): HRESULT

public expect fun SHParseDisplayName(pszname: PCWSTR, pbc: Long, ppidl: Long, sfgaoin: UInt, psfgaoout: Long): HRESULT

public expect fun SHPathPrepareForWriteA(hwnd: HWND, punkenablemodless: Long, pszpath: PCSTR, dwflags: UInt): HRESULT

public expect fun SHPathPrepareForWriteW(hwnd: HWND, punkenablemodless: Long, pszpath: PCWSTR, dwflags: UInt): HRESULT

public expect fun SHQueryInfoKeyA(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR

public expect fun SHQueryInfoKeyW(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR

public expect fun SHQueryRecycleBinA(pszrootpath: PCSTR, pshqueryrbinfo: Long): HRESULT

public expect fun SHQueryRecycleBinW(pszrootpath: PCWSTR, pshqueryrbinfo: Long): HRESULT

public expect fun SHQueryUserNotificationState(pquns: Long): HRESULT

public expect fun SHQueryValueExA(hkey: HKEY, pszvalue: PCSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHQueryValueExW(hkey: HKEY, pszvalue: PCWSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun SHRegCloseUSKey(huskey: Long): WIN32_ERROR

public expect fun SHRegCreateUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR

public expect fun SHRegCreateUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR

public expect fun SHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR

public expect fun SHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR

public expect fun SHRegDeleteUSValueA(huskey: Long, pszvalue: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR

public expect fun SHRegDeleteUSValueW(huskey: Long, pwzvalue: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR

public expect fun SHRegDuplicateHKey(hkey: HKEY): HKEY

public expect fun SHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: PSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR

public expect fun SHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: PWSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR

public expect fun SHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR

public expect fun SHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR

public expect fun SHRegGetBoolUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL

public expect fun SHRegGetBoolUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL
