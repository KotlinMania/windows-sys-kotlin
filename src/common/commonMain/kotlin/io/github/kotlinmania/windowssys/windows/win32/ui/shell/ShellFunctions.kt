package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun assocCreate(clsid: Guid, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun assocCreateForClasses(rgclasses: ConstPtr, cclasses: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun assocGetDetailsOfPropKey(psf: MutPtr, pidl: ConstPtr, pkey: ConstPtr, pv: MutPtr, pffoundpropkey: MutPtr): Hresult

public expect fun assocGetPerceivedType(pszext: Pcwstr, ptype: MutPtr, pflag: MutPtr, ppsztype: MutPtr): Hresult

public expect fun assocIsDangerous(pszassoc: Pcwstr): Bool

public expect fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: MutPtr): Hresult

public expect fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: MutPtr): Hresult

public expect fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr): Hresult

public expect fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr): Hresult

public expect fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr): Hresult

public expect fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr): Hresult

public expect fun cdefFolderMenuCreate2(pidlfolder: ConstPtr, hwnd: Hwnd, cidl: UInt, apidl: ConstPtr, psf: MutPtr, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: ConstPtr, ppcm: MutPtr): Hresult

public expect fun cidldataCreateFromIdarray(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, ppdtobj: MutPtr): Hresult

public expect fun chrCmpIA(w1: UShort, w2: UShort): Bool

public expect fun chrCmpIW(w1: UShort, w2: UShort): Bool

public expect fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref

public expect fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref

public expect fun colorRGBToHLS(clrrgb: Colorref, pwhue: MutPtr, pwluminance: MutPtr, pwsaturation: MutPtr)

public expect fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: MutPtr): MutPtr

public expect fun connectToConnectionPoint(punk: MutPtr, riidevent: ConstPtr, fconnect: Bool, punktarget: MutPtr, pdwcookie: MutPtr, ppcpout: MutPtr): Hresult

public expect fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult

public expect fun dadAutoScroll(hwnd: Hwnd, pad: MutPtr, pptnow: ConstPtr): Bool

public expect fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool

public expect fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: MutPtr): Bool

public expect fun dadDragLeave(): Bool

public expect fun dadDragMove(pt: Point): Bool

public expect fun dadSetDragImage(him: Himagelist, pptoffset: MutPtr): Bool

public expect fun dadShowDragImage(fshow: Bool): Bool

public expect fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult

public expect fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool

public expect fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool

public expect fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt

public expect fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt

public expect fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool)

public expect fun dragFinish(hdrop: Hdrop)

public expect fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt

public expect fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt

public expect fun dragQueryPoint(hdrop: Hdrop, ppt: MutPtr): Bool

public expect fun driveType(idrive: Int): Int

public expect fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon

public expect fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: MutPtr): Hicon

public expect fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: MutPtr, piiconid: MutPtr): Hicon

public expect fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: MutPtr, piiconid: MutPtr): Hicon

public expect fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: MutPtr): Hicon

public expect fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon

public expect fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: MutPtr, phiconsmall: MutPtr, nicons: UInt): UInt

public expect fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: MutPtr, phiconsmall: MutPtr, nicons: UInt): UInt

public expect fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon

public expect fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance

public expect fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance

public expect fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: MutPtr): Hresult

public expect fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: MutPtr): Hresult

public expect fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool

public expect fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool

public expect fun getCurrentProcessExplicitAppUserModelID(appid: MutPtr): Hresult

public expect fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool

public expect fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool

public expect fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt

public expect fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool

public expect fun getMenuContextHelpId(param0: Hmenu): UInt

public expect fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int

public expect fun getProfileType(dwflags: MutPtr): Bool

public expect fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool

public expect fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool

public expect fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor

public expect fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: MutPtr): Hresult

public expect fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: MutPtr): Bool

public expect fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool

public expect fun getWindowContextHelpId(param0: Hwnd): UInt

public expect fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: MutPtr): Bool

public expect fun hmonitorUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun hmonitorUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun hmonitorUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hmonitorUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun hmonitorUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hmonitorUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun hmonitorUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hmonitorUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun hashData(pbdata: ConstPtr, cbdata: UInt, pbhash: MutPtr, cbhash: UInt): Hresult

public expect fun hlinkClone(pihl: MutPtr, riid: ConstPtr, pihlsiteforclone: MutPtr, dwsitedata: UInt, ppvobj: MutPtr): Hresult

public expect fun hlinkCreateBrowseContext(piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun hlinkCreateFromData(pidataobj: MutPtr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun hlinkCreateFromMoniker(pimktrgt: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: MutPtr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult

public expect fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: MutPtr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult

public expect fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult

public expect fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: MutPtr): Hresult

public expect fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: MutPtr): Hresult

public expect fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult

public expect fun hlinkNavigate(pihl: MutPtr, pihlframe: MutPtr, grfhlnf: UInt, pbc: MutPtr, pibsc: MutPtr, pihlbc: MutPtr): Hresult

public expect fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, pihlframe: MutPtr, grfhlnf: UInt, pibc: MutPtr, pibsc: MutPtr, pihlbc: MutPtr): Hresult

public expect fun hlinkOnNavigate(pihlframe: MutPtr, pihlbc: MutPtr, grfhlnf: UInt, pimktarget: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: MutPtr): Hresult

public expect fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: MutPtr, pimkold: MutPtr, pimknew: MutPtr): Hresult

public expect fun hlinkParseDisplayName(pibc: MutPtr, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: MutPtr, ppimk: MutPtr): Hresult

public expect fun hlinkPreprocessMoniker(pibc: MutPtr, pimkin: MutPtr, ppimkout: MutPtr): Hresult

public expect fun hlinkQueryCreateFromData(pidataobj: MutPtr): Hresult

public expect fun hlinkResolveMonikerForData(pimkreference: MutPtr, reserved: UInt, pibc: MutPtr, cfmtetc: UInt, rgfmtetc: MutPtr, pibsc: MutPtr, pimkbase: MutPtr): Hresult

public expect fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: MutPtr, ppwzlocation: MutPtr): Hresult

public expect fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: MutPtr, ppwzlocation: MutPtr): Hresult

public expect fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: MutPtr, cfmtetc: UInt, rgfmtetc: MutPtr, pibsc: MutPtr, pimkbase: MutPtr): Hresult

public expect fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult

public expect fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: MutPtr): Hresult

public expect fun hlinkUpdateStackItem(pihlframe: MutPtr, pihlbc: MutPtr, uhlid: UInt, pimktrgt: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult

public expect fun iLAppendID(pidl: ConstPtr, pmkid: ConstPtr, fappend: Bool): MutPtr

public expect fun iLClone(pidl: ConstPtr): MutPtr

public expect fun iLCloneFirst(pidl: ConstPtr): MutPtr

public expect fun iLCombine(pidl1: ConstPtr, pidl2: ConstPtr): MutPtr

public expect fun iLCreateFromPathA(pszpath: Pcstr): MutPtr

public expect fun iLCreateFromPathW(pszpath: Pcwstr): MutPtr

public expect fun iLFindChild(pidlparent: ConstPtr, pidlchild: ConstPtr): MutPtr

public expect fun iLFindLastID(pidl: ConstPtr): MutPtr

public expect fun iLFree(pidl: ConstPtr)

public expect fun iLGetNext(pidl: ConstPtr): MutPtr

public expect fun iLGetSize(pidl: ConstPtr): UInt

public expect fun iLIsEqual(pidl1: ConstPtr, pidl2: ConstPtr): Bool

public expect fun iLIsParent(pidl1: ConstPtr, pidl2: ConstPtr, fimmediate: Bool): Bool

public expect fun iLLoadFromStreamEx(pstm: MutPtr, pidl: MutPtr): Hresult

public expect fun iLRemoveLastID(pidl: MutPtr): Bool

public expect fun iLSaveToStream(pstm: MutPtr, pidl: ConstPtr): Hresult

public expect fun istreamCopy(pstmfrom: MutPtr, pstmto: MutPtr, cb: UInt): Hresult

public expect fun istreamRead(pstm: MutPtr, pv: MutPtr, cb: UInt): Hresult

public expect fun istreamReadPidl(pstm: MutPtr, ppidlout: MutPtr): Hresult

public expect fun istreamReadStr(pstm: MutPtr, ppsz: MutPtr): Hresult

public expect fun istreamReset(pstm: MutPtr): Hresult

public expect fun istreamSize(pstm: MutPtr, pui: MutPtr): Hresult

public expect fun istreamWrite(pstm: MutPtr, pv: ConstPtr, cb: UInt): Hresult

public expect fun istreamWritePidl(pstm: MutPtr, pidlwrite: ConstPtr): Hresult

public expect fun istreamWriteStr(pstm: MutPtr, psz: Pcwstr): Hresult

public expect fun iunknownAtomicRelease(ppunk: MutPtr)

public expect fun iunknownGetSite(punk: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun iunknownGetWindow(punk: MutPtr, phwnd: MutPtr): Hresult

public expect fun iunknownQueryService(punk: MutPtr, guidservice: ConstPtr, riid: ConstPtr, ppvout: MutPtr): Hresult

public expect fun iunknownSet(ppunk: MutPtr, punk: MutPtr)

public expect fun iunknownSetSite(punk: MutPtr, punksite: MutPtr): Hresult

public expect fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: MutPtr, pfparsepersiterules: MutPtr): Bool

public expect fun initNetworkAddressControl(): Bool

public expect fun initPropVariantFromStrRet(pstrret: MutPtr, pidl: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun initVariantFromStrRet(pstrret: ConstPtr, pidl: ConstPtr, pvar: MutPtr): Hresult

public expect fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool

public expect fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool

public expect fun isCharSpaceA(wch: Byte): Bool

public expect fun isCharSpaceW(wch: UShort): Bool

public expect fun isInternetESCEnabled(): Bool

public expect fun isLFNDriveA(pszpath: Pcstr): Bool

public expect fun isLFNDriveW(pszpath: Pcwstr): Bool

public expect fun isNetDrive(idrive: Int): Int

public expect fun isOS(dwos: OS): Bool

public expect fun isUserAnAdmin(): Bool

public expect fun loadUserProfileA(htoken: Handle, lpprofileinfo: MutPtr): Bool

public expect fun loadUserProfileW(htoken: Handle, lpprofileinfo: MutPtr): Bool

public expect fun oleSaveToStreamEx(piunk: MutPtr, pistm: MutPtr, fcleardirty: Bool): Hresult

public expect fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr

public expect fun parseURLA(pcszurl: Pcstr, ppu: MutPtr): Hresult

public expect fun parseURLW(pcszurl: Pcwstr, ppu: MutPtr): Hresult

public expect fun pathAddBackslashA(pszpath: Pstr): Pstr

public expect fun pathAddBackslashW(pszpath: Pwstr): Pwstr

public expect fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool

public expect fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool

public expect fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr): Hresult

public expect fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr): Hresult

public expect fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool

public expect fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool

public expect fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr

public expect fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr

public expect fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool

public expect fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool

public expect fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr, pcchremaining: MutPtr): Hresult

public expect fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult

public expect fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult

public expect fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult

public expect fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult

public expect fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: MutPtr): Hresult

public expect fun pathCchIsRoot(pszpath: Pcwstr): Bool

public expect fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr, pcchremaining: MutPtr): Hresult

public expect fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult

public expect fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: MutPtr): Hresult

public expect fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int

public expect fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr

public expect fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr

public expect fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int

public expect fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int

public expect fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool

public expect fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool

public expect fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool

public expect fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool

public expect fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: MutPtr, dwflags: UInt): Hresult

public expect fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: MutPtr, dwflags: UInt): Hresult

public expect fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: MutPtr, dwflags: UInt): Hresult

public expect fun pathFileExistsA(pszpath: Pcstr): Bool

public expect fun pathFileExistsW(pszpath: Pcwstr): Bool

public expect fun pathFindExtensionA(pszpath: Pcstr): Pstr

public expect fun pathFindExtensionW(pszpath: Pcwstr): Pwstr

public expect fun pathFindFileNameA(pszpath: Pcstr): Pstr

public expect fun pathFindFileNameW(pszpath: Pcwstr): Pwstr

public expect fun pathFindNextComponentA(pszpath: Pcstr): Pstr

public expect fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr

public expect fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: ConstPtr): Bool

public expect fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: ConstPtr): Bool

public expect fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: ConstPtr, iarraysize: Int): Pcstr

public expect fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: ConstPtr, iarraysize: Int): Pcwstr

public expect fun pathGetArgsA(pszpath: Pcstr): Pstr

public expect fun pathGetArgsW(pszpath: Pcwstr): Pwstr

public expect fun pathGetCharTypeA(ch: UByte): UInt

public expect fun pathGetCharTypeW(ch: UShort): UInt

public expect fun pathGetDriveNumberA(pszpath: Pcstr): Int

public expect fun pathGetDriveNumberW(pszpath: Pcwstr): Int

public expect fun pathGetShortPath(pszlongpath: Pwstr)

public expect fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool

public expect fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool

public expect fun pathIsDirectoryA(pszpath: Pcstr): Bool

public expect fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool

public expect fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool

public expect fun pathIsDirectoryW(pszpath: Pcwstr): Bool

public expect fun pathIsExe(pszpath: Pcwstr): Bool

public expect fun pathIsFileSpecA(pszpath: Pcstr): Bool

public expect fun pathIsFileSpecW(pszpath: Pcwstr): Bool

public expect fun pathIsLFNFileSpecA(pszname: Pcstr): Bool

public expect fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool

public expect fun pathIsNetworkPathA(pszpath: Pcstr): Bool

public expect fun pathIsNetworkPathW(pszpath: Pcwstr): Bool

public expect fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool

public expect fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool

public expect fun pathIsRelativeA(pszpath: Pcstr): Bool

public expect fun pathIsRelativeW(pszpath: Pcwstr): Bool

public expect fun pathIsRootA(pszpath: Pcstr): Bool

public expect fun pathIsRootW(pszpath: Pcwstr): Bool

public expect fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool

public expect fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool

public expect fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool

public expect fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool

public expect fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool

public expect fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool

public expect fun pathIsUNCA(pszpath: Pcstr): Bool

public expect fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: MutPtr): Bool

public expect fun pathIsUNCServerA(pszpath: Pcstr): Bool

public expect fun pathIsUNCServerShareA(pszpath: Pcstr): Bool

public expect fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool

public expect fun pathIsUNCServerW(pszpath: Pcwstr): Bool

public expect fun pathIsUNCW(pszpath: Pcwstr): Bool

public expect fun pathIsURLA(pszpath: Pcstr): Bool

public expect fun pathIsURLW(pszpath: Pcwstr): Bool

public expect fun pathMakePrettyA(pszpath: Pstr): Bool

public expect fun pathMakePrettyW(pszpath: Pwstr): Bool

public expect fun pathMakeSystemFolderA(pszpath: Pcstr): Bool

public expect fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool

public expect fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool

public expect fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool

public expect fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult

public expect fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult

public expect fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool

public expect fun pathParseIconLocationA(psziconfile: Pstr): Int

public expect fun pathParseIconLocationW(psziconfile: Pwstr): Int

public expect fun pathQualify(psz: Pwstr)

public expect fun pathQuoteSpacesA(lpsz: Pstr): Bool

public expect fun pathQuoteSpacesW(lpsz: Pwstr): Bool

public expect fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool

public expect fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool

public expect fun pathRemoveArgsA(pszpath: Pstr)

public expect fun pathRemoveArgsW(pszpath: Pwstr)

public expect fun pathRemoveBackslashA(pszpath: Pstr): Pstr

public expect fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr

public expect fun pathRemoveBlanksA(pszpath: Pstr)

public expect fun pathRemoveBlanksW(pszpath: Pwstr)

public expect fun pathRemoveExtensionA(pszpath: Pstr)

public expect fun pathRemoveExtensionW(pszpath: Pwstr)

public expect fun pathRemoveFileSpecA(pszpath: Pstr): Bool

public expect fun pathRemoveFileSpecW(pszpath: Pwstr): Bool

public expect fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool

public expect fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool

public expect fun pathResolve(pszpath: Pwstr, dirs: ConstPtr, fflags: UInt): Int

public expect fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool

public expect fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool

public expect fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr)

public expect fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr)

public expect fun pathSkipRootA(pszpath: Pcstr): Pstr

public expect fun pathSkipRootW(pszpath: Pcwstr): Pwstr

public expect fun pathStripPathA(pszpath: Pstr)

public expect fun pathStripPathW(pszpath: Pwstr)

public expect fun pathStripToRootA(pszpath: Pstr): Bool

public expect fun pathStripToRootW(pszpath: Pwstr): Bool

public expect fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool

public expect fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool

public expect fun pathUndecorateA(pszpath: Pstr)

public expect fun pathUndecorateW(pszpath: Pwstr)

public expect fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool

public expect fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool

public expect fun pathUnquoteSpacesA(lpsz: Pstr): Bool

public expect fun pathUnquoteSpacesW(lpsz: Pwstr): Bool

public expect fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool

public expect fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: MutPtr): Int

public expect fun propVariantToStrRet(propvar: ConstPtr, pstrret: MutPtr): Hresult

public expect fun qISearch(that: MutPtr, pqit: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun readCabinetState(pcs: MutPtr, clength: Int): Bool

public expect fun realDriveType(idrive: Int, foktohitnet: Bool): Int

public expect fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: ConstPtr, registration: MutPtr): UInt

public expect fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: ConstPtr, registration: MutPtr): UInt

public expect fun registerScaleChangeEvent(hevent: Handle, pdwcookie: MutPtr): Hresult

public expect fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: MutPtr): Hresult

public expect fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool

public expect fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int

public expect fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int

public expect fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult

public expect fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt

public expect fun sHAddToRecentDocs(uflags: UInt, pv: ConstPtr)

public expect fun sHAlloc(cb: ULong): MutPtr

public expect fun sHAllocShared(pvdata: ConstPtr, dwsize: UInt, dwprocessid: UInt): Handle

public expect fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int

public expect fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int

public expect fun sHAppBarMessage(dwmessage: UInt, pdata: MutPtr): ULong

public expect fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: MutPtr): Hresult

public expect fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: ConstPtr, enumhandlers: MutPtr): Hresult

public expect fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult

public expect fun sHBindToFolderIDListParent(psfroot: MutPtr, pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult

public expect fun sHBindToFolderIDListParentEx(psfroot: MutPtr, pidl: ConstPtr, ppbc: MutPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult

public expect fun sHBindToObject(psf: MutPtr, pidl: ConstPtr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHBindToParent(pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult

public expect fun sHBrowseForFolderA(lpbi: ConstPtr): MutPtr

public expect fun sHBrowseForFolderW(lpbi: ConstPtr): MutPtr

public expect fun sHCLSIDFromString(psz: Pcwstr, pclsid: MutPtr): Hresult

public expect fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: MutPtr, plevent: MutPtr): Handle

public expect fun shchangeNotificationUnlock(hlock: Handle): Bool

public expect fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: ConstPtr, dwitem2: ConstPtr)

public expect fun sHChangeNotifyDeregister(ulid: UInt): Bool

public expect fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: ConstPtr): UInt

public expect fun sHChangeNotifyRegisterThread(status: ScnrtStatus)

public expect fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): MutPtr

public expect fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error

public expect fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error

public expect fun sHCreateAssociationRegistration(riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateDataObject(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, pdtinner: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateDefaultContextMenu(pdcm: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateDefaultExtractIcon(riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateDefaultPropertiesOp(psi: MutPtr, ppfileop: MutPtr): Hresult

public expect fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int

public expect fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: ConstPtr): Int

public expect fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: ConstPtr): Int

public expect fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateItemFromIDList(pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateItemFromRelativeName(psiparent: MutPtr, pszname: Pcwstr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateItemInKnownFolder(kfid: ConstPtr, dwkfflags: UInt, pszitem: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateItemWithParent(pidlparent: ConstPtr, psfparent: MutPtr, pidl: ConstPtr, riid: ConstPtr, ppvitem: MutPtr): Hresult

public expect fun sHCreateMemStream(pinit: ConstPtr, cbinit: UInt): MutPtr

public expect fun sHCreateProcessAsUserW(pscpi: MutPtr): Bool

public expect fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa

public expect fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: MutPtr): Hresult

public expect fun sHCreateShellFolderView(pcsfv: ConstPtr, ppsv: MutPtr): Hresult

public expect fun sHCreateShellFolderViewEx(pcsfv: ConstPtr, ppsv: MutPtr): Hresult

public expect fun sHCreateShellItem(pidlparent: ConstPtr, psfparent: MutPtr, pidl: ConstPtr, ppsi: MutPtr): Hresult

public expect fun sHCreateShellItemArray(pidlparent: ConstPtr, psf: MutPtr, cidl: UInt, ppidl: ConstPtr, ppsiitemarray: MutPtr): Hresult

public expect fun sHCreateShellItemArrayFromDataObject(pdo: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: ConstPtr, ppsiitemarray: MutPtr): Hresult

public expect fun sHCreateShellItemArrayFromShellItem(psi: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHCreateShellPalette(hdc: Hdc): Hpalette

public expect fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: ConstPtr, ppenumformatetc: MutPtr): Hresult

public expect fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: MutPtr): Hresult

public expect fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: MutPtr, ppstm: MutPtr): Hresult

public expect fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: MutPtr): Hresult

public expect fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr, flags: UInt, pfncallback: LpthreadStartRoutine): Bool

public expect fun sHCreateThreadRef(pcref: MutPtr, ppunk: MutPtr): Hresult

public expect fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: MutPtr): Bool

public expect fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr, phiconsmall: MutPtr, niconsize: UInt): Hresult

public expect fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr, phiconsmall: MutPtr, niconsize: UInt): Hresult

public expect fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error

public expect fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error

public expect fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error

public expect fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error

public expect fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error

public expect fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error

public expect fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa)

public expect fun sHDoDragDrop(hwnd: Hwnd, pdata: MutPtr, pdsrc: MutPtr, dweffect: Dropeffect, pdweffect: MutPtr): Hresult

public expect fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult

public expect fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult

public expect fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: MutPtr): Win32Error

public expect fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: MutPtr): Win32Error

public expect fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult

public expect fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: MutPtr, ppszcommandline: MutPtr, ppszparameters: MutPtr): Hresult

public expect fun sHFileOperationA(lpfileop: MutPtr): Int

public expect fun sHFileOperationW(lpfileop: MutPtr): Int

public expect fun sHFindFiles(pidlfolder: ConstPtr, pidlsavefile: ConstPtr): Bool

public expect fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): MutPtr

public expect fun sHFlushSFCache()

public expect fun sHFormatDateTimeA(pft: ConstPtr, pdwflags: MutPtr, pszbuf: Pstr, cchbuf: UInt): Int

public expect fun sHFormatDateTimeW(pft: ConstPtr, pdwflags: MutPtr, pszbuf: Pwstr, cchbuf: UInt): Int

public expect fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt

public expect fun sHFree(pv: ConstPtr)

public expect fun sHFreeNameMappings(hnamemappings: Handle)

public expect fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool

public expect fun sHGetAttributesFromDataObject(pdo: MutPtr, dwattributemask: UInt, pdwattributes: MutPtr, pcitems: MutPtr): Hresult

public expect fun sHGetDataFromIDListA(psf: MutPtr, pidl: ConstPtr, nformat: ShgdfilFormat, pv: MutPtr, cb: Int): Hresult

public expect fun sHGetDataFromIDListW(psf: MutPtr, pidl: ConstPtr, nformat: ShgdfilFormat, pv: MutPtr, cb: Int): Hresult

public expect fun sHGetDesktopFolder(ppshf: MutPtr): Hresult

public expect fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: MutPtr, pultotalnumberofbytes: MutPtr, pultotalnumberoffreebytes: MutPtr): Bool

public expect fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: MutPtr, pultotalnumberofbytes: MutPtr, pultotalnumberoffreebytes: MutPtr): Bool

public expect fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: MutPtr): Hresult

public expect fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr, cbfileinfo: UInt, uflags: ShgfiFlags): ULong

public expect fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr, cbfileinfo: UInt, uflags: ShgfiFlags): ULong

public expect fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: MutPtr): Hresult

public expect fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult

public expect fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult

public expect fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult

public expect fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult

public expect fun sHGetIDListFromObject(punk: MutPtr, ppidl: MutPtr): Hresult

public expect fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int

public expect fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int

public expect fun sHGetImageList(iimagelist: Int, riid: ConstPtr, ppvobj: MutPtr): Hresult

public expect fun sHGetInstanceExplorer(ppunk: MutPtr): Hresult

public expect fun sHGetInverseCMAP(pbmap: MutPtr, cbmap: UInt): Hresult

public expect fun sHGetItemFromDataObject(pdtobj: MutPtr, dwflags: DataobjGetItemFlags, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHGetItemFromObject(punk: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHGetKnownFolderIDList(rfid: ConstPtr, dwflags: UInt, htoken: Handle, ppidl: MutPtr): Hresult

public expect fun sHGetKnownFolderItem(rfid: ConstPtr, flags: KnownFolderFlag, htoken: Handle, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHGetKnownFolderPath(rfid: ConstPtr, dwflags: UInt, htoken: Handle, ppszpath: MutPtr): Hresult

public expect fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: MutPtr): Hresult

public expect fun sHGetMalloc(ppmalloc: MutPtr): Hresult

public expect fun sHGetNameFromIDList(pidl: ConstPtr, sigdnname: Sigdn, ppszname: MutPtr): Hresult

public expect fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: MutPtr, uflags: UInt): Bool

public expect fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: MutPtr, uflags: UInt): Bool

public expect fun sHGetPathFromIDListA(pidl: ConstPtr, pszpath: Pstr): Bool

public expect fun sHGetPathFromIDListEx(pidl: ConstPtr, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool

public expect fun sHGetPathFromIDListW(pidl: ConstPtr, pszpath: Pwstr): Bool

public expect fun sHGetRealIDL(psf: MutPtr, pidlsimple: ConstPtr, ppidlreal: MutPtr): Hresult

public expect fun sHGetSetFolderCustomSettings(pfcs: MutPtr, pszpath: Pcwstr, dwreadwrite: UInt): Hresult

public expect fun sHGetSetSettings(lpss: MutPtr, dwmask: SsfMask, bset: Bool)

public expect fun sHGetSettings(psfs: MutPtr, dwmask: UInt)

public expect fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: MutPtr): Hresult

public expect fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool

public expect fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool

public expect fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: MutPtr): Hresult

public expect fun sHGetTemporaryPropertyForItem(psi: MutPtr, propkey: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun sHGetThreadRef(ppunk: MutPtr): Hresult

public expect fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: MutPtr, pfiletime: MutPtr, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult

public expect fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHGetViewStatePropertyBag(pidl: ConstPtr, pszbagname: Pcwstr, dwflags: UInt, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun sHGlobalCounterDecrement(id: Shglobalcounter): Int

public expect fun sHGlobalCounterGetValue(id: Shglobalcounter): Int

public expect fun sHGlobalCounterIncrement(id: Shglobalcounter): Int

public expect fun sHHandleUpdateImage(pidlextra: ConstPtr): Int

public expect fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: MutPtr, rgfinout: MutPtr): Hresult

public expect fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool

public expect fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool

public expect fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: MutPtr): Hresult

public expect fun sHIsLowMemoryMachine(dwtype: UInt): Bool

public expect fun sHLimitInputEdit(hwndedit: Hwnd, psf: MutPtr): Hresult

public expect fun sHLoadInProc(rclsid: ConstPtr): Hresult

public expect fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: ConstPtr): Hresult

public expect fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult

public expect fun sHLockShared(hdata: Handle, dwprocessid: UInt): MutPtr

public expect fun sHMapPIDLToSystemImageListIndex(pshf: MutPtr, pidl: ConstPtr, piindexsel: MutPtr): Int

public expect fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int

public expect fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int

public expect fun sHMultiFileProperties(pdtobj: MutPtr, dwflags: UInt): Hresult

public expect fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool

public expect fun sHOpenFolderAndSelectItems(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, dwflags: UInt): Hresult

public expect fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: ConstPtr, ckeys: UInt, pclsiddefault: ConstPtr, pdtobj: MutPtr, psb: MutPtr, pstartpage: Pcwstr): Bool

public expect fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr

public expect fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr

public expect fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr

public expect fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr

public expect fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: ConstPtr): Hresult

public expect fun sHParseDisplayName(pszname: Pcwstr, pbc: MutPtr, ppidl: MutPtr, sfgaoin: UInt, psfgaoout: MutPtr): Hresult

public expect fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: MutPtr, pszpath: Pcstr, dwflags: UInt): Hresult

public expect fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: MutPtr, pszpath: Pcwstr, dwflags: UInt): Hresult

public expect fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr): Win32Error

public expect fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr): Win32Error

public expect fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: MutPtr): Hresult

public expect fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: MutPtr): Hresult

public expect fun sHQueryUserNotificationState(pquns: MutPtr): Hresult

public expect fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: ConstPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: ConstPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun sHRegCloseUSKey(huskey: Long): Win32Error

public expect fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, dwflags: UInt): Win32Error

public expect fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, dwflags: UInt): Win32Error

public expect fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDuplicateHKey(hkey: Hkey): Hkey

public expect fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: MutPtr, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: MutPtr, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool

public expect fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool
