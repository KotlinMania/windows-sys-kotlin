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

public expect fun assocCreate(clsid: Guid, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun assocCreateForClasses(rgclasses: COpaquePointer?, cclasses: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun assocGetDetailsOfPropKey(psf: COpaquePointer?, pidl: COpaquePointer?, pkey: COpaquePointer?, pv: COpaquePointer?, pffoundpropkey: COpaquePointer?): Hresult

public expect fun assocGetPerceivedType(pszext: Pcwstr, ptype: COpaquePointer?, pflag: COpaquePointer?, ppsztype: COpaquePointer?): Hresult

public expect fun assocIsDangerous(pszassoc: Pcwstr): Bool

public expect fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: COpaquePointer?): Hresult

public expect fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: COpaquePointer?): Hresult

public expect fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult

public expect fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult

public expect fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult

public expect fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult

public expect fun cdefFolderMenuCreate2(pidlfolder: COpaquePointer?, hwnd: Hwnd, cidl: UInt, apidl: COpaquePointer?, psf: COpaquePointer?, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: COpaquePointer?, ppcm: COpaquePointer?): Hresult

public expect fun cidldataCreateFromIdarray(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, ppdtobj: COpaquePointer?): Hresult

public expect fun chrCmpIA(w1: UShort, w2: UShort): Bool

public expect fun chrCmpIW(w1: UShort, w2: UShort): Bool

public expect fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref

public expect fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref

public expect fun colorRGBToHLS(clrrgb: Colorref, pwhue: COpaquePointer?, pwluminance: COpaquePointer?, pwsaturation: COpaquePointer?)

public expect fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: COpaquePointer?): COpaquePointer?

public expect fun connectToConnectionPoint(punk: COpaquePointer?, riidevent: COpaquePointer?, fconnect: Bool, punktarget: COpaquePointer?, pdwcookie: COpaquePointer?, ppcpout: COpaquePointer?): Hresult

public expect fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult

public expect fun dadAutoScroll(hwnd: Hwnd, pad: COpaquePointer?, pptnow: COpaquePointer?): Bool

public expect fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool

public expect fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: COpaquePointer?): Bool

public expect fun dadDragLeave(): Bool

public expect fun dadDragMove(pt: Point): Bool

public expect fun dadSetDragImage(him: Himagelist, pptoffset: COpaquePointer?): Bool

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

public expect fun dragQueryPoint(hdrop: Hdrop, ppt: COpaquePointer?): Bool

public expect fun driveType(idrive: Int): Int

public expect fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon

public expect fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: COpaquePointer?): Hicon

public expect fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon

public expect fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon

public expect fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: COpaquePointer?): Hicon

public expect fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon

public expect fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt

public expect fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt

public expect fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon

public expect fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance

public expect fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance

public expect fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: COpaquePointer?): Hresult

public expect fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: COpaquePointer?): Hresult

public expect fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool

public expect fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool

public expect fun getCurrentProcessExplicitAppUserModelID(appid: COpaquePointer?): Hresult

public expect fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool

public expect fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool

public expect fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt

public expect fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool

public expect fun getMenuContextHelpId(param0: Hmenu): UInt

public expect fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int

public expect fun getProfileType(dwflags: COpaquePointer?): Bool

public expect fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool

public expect fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool

public expect fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor

public expect fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: COpaquePointer?): Hresult

public expect fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool

public expect fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool

public expect fun getWindowContextHelpId(param0: Hwnd): UInt

public expect fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: COpaquePointer?): Bool

public expect fun hmonitorUserFree(param0: COpaquePointer?, param1: COpaquePointer?)

public expect fun hmonitorUserFree64(param0: COpaquePointer?, param1: COpaquePointer?)

public expect fun hmonitorUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun hmonitorUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun hmonitorUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt

public expect fun hmonitorUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt

public expect fun hmonitorUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun hmonitorUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun hashData(pbdata: COpaquePointer?, cbdata: UInt, pbhash: COpaquePointer?, cbhash: UInt): Hresult

public expect fun hlinkClone(pihl: COpaquePointer?, riid: COpaquePointer?, pihlsiteforclone: COpaquePointer?, dwsitedata: UInt, ppvobj: COpaquePointer?): Hresult

public expect fun hlinkCreateBrowseContext(piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun hlinkCreateFromData(pidataobj: COpaquePointer?, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun hlinkCreateFromMoniker(pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: COpaquePointer?, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: COpaquePointer?): Hresult

public expect fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: COpaquePointer?): Hresult

public expect fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult

public expect fun hlinkNavigate(pihl: COpaquePointer?, pihlframe: COpaquePointer?, grfhlnf: UInt, pbc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult

public expect fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, pihlframe: COpaquePointer?, grfhlnf: UInt, pibc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult

public expect fun hlinkOnNavigate(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, grfhlnf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: COpaquePointer?): Hresult

public expect fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: COpaquePointer?, pimkold: COpaquePointer?, pimknew: COpaquePointer?): Hresult

public expect fun hlinkParseDisplayName(pibc: COpaquePointer?, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: COpaquePointer?, ppimk: COpaquePointer?): Hresult

public expect fun hlinkPreprocessMoniker(pibc: COpaquePointer?, pimkin: COpaquePointer?, ppimkout: COpaquePointer?): Hresult

public expect fun hlinkQueryCreateFromData(pidataobj: COpaquePointer?): Hresult

public expect fun hlinkResolveMonikerForData(pimkreference: COpaquePointer?, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult

public expect fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult

public expect fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult

public expect fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult

public expect fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult

public expect fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: COpaquePointer?): Hresult

public expect fun hlinkUpdateStackItem(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, uhlid: UInt, pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult

public expect fun iLAppendID(pidl: COpaquePointer?, pmkid: COpaquePointer?, fappend: Bool): COpaquePointer?

public expect fun iLClone(pidl: COpaquePointer?): COpaquePointer?

public expect fun iLCloneFirst(pidl: COpaquePointer?): COpaquePointer?

public expect fun iLCombine(pidl1: COpaquePointer?, pidl2: COpaquePointer?): COpaquePointer?

public expect fun iLCreateFromPathA(pszpath: Pcstr): COpaquePointer?

public expect fun iLCreateFromPathW(pszpath: Pcwstr): COpaquePointer?

public expect fun iLFindChild(pidlparent: COpaquePointer?, pidlchild: COpaquePointer?): COpaquePointer?

public expect fun iLFindLastID(pidl: COpaquePointer?): COpaquePointer?

public expect fun iLFree(pidl: COpaquePointer?)

public expect fun iLGetNext(pidl: COpaquePointer?): COpaquePointer?

public expect fun iLGetSize(pidl: COpaquePointer?): UInt

public expect fun iLIsEqual(pidl1: COpaquePointer?, pidl2: COpaquePointer?): Bool

public expect fun iLIsParent(pidl1: COpaquePointer?, pidl2: COpaquePointer?, fimmediate: Bool): Bool

public expect fun iLLoadFromStreamEx(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult

public expect fun iLRemoveLastID(pidl: COpaquePointer?): Bool

public expect fun iLSaveToStream(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult

public expect fun istreamCopy(pstmfrom: COpaquePointer?, pstmto: COpaquePointer?, cb: UInt): Hresult

public expect fun istreamRead(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult

public expect fun istreamReadPidl(pstm: COpaquePointer?, ppidlout: COpaquePointer?): Hresult

public expect fun istreamReadStr(pstm: COpaquePointer?, ppsz: COpaquePointer?): Hresult

public expect fun istreamReset(pstm: COpaquePointer?): Hresult

public expect fun istreamSize(pstm: COpaquePointer?, pui: COpaquePointer?): Hresult

public expect fun istreamWrite(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult

public expect fun istreamWritePidl(pstm: COpaquePointer?, pidlwrite: COpaquePointer?): Hresult

public expect fun istreamWriteStr(pstm: COpaquePointer?, psz: Pcwstr): Hresult

public expect fun iunknownAtomicRelease(ppunk: COpaquePointer?)

public expect fun iunknownGetSite(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun iunknownGetWindow(punk: COpaquePointer?, phwnd: COpaquePointer?): Hresult

public expect fun iunknownQueryService(punk: COpaquePointer?, guidservice: COpaquePointer?, riid: COpaquePointer?, ppvout: COpaquePointer?): Hresult

public expect fun iunknownSet(ppunk: COpaquePointer?, punk: COpaquePointer?)

public expect fun iunknownSetSite(punk: COpaquePointer?, punksite: COpaquePointer?): Hresult

public expect fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: COpaquePointer?, pfparsepersiterules: COpaquePointer?): Bool

public expect fun initNetworkAddressControl(): Bool

public expect fun initPropVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun initVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, pvar: COpaquePointer?): Hresult

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

public expect fun loadUserProfileA(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool

public expect fun loadUserProfileW(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool

public expect fun oleSaveToStreamEx(piunk: COpaquePointer?, pistm: COpaquePointer?, fcleardirty: Bool): Hresult

public expect fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer?

public expect fun parseURLA(pcszurl: Pcstr, ppu: COpaquePointer?): Hresult

public expect fun parseURLW(pcszurl: Pcwstr, ppu: COpaquePointer?): Hresult

public expect fun pathAddBackslashA(pszpath: Pstr): Pstr

public expect fun pathAddBackslashW(pszpath: Pwstr): Pwstr

public expect fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool

public expect fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool

public expect fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult

public expect fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult

public expect fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool

public expect fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool

public expect fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr

public expect fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr

public expect fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool

public expect fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool

public expect fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult

public expect fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult

public expect fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult

public expect fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult

public expect fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult

public expect fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: COpaquePointer?): Hresult

public expect fun pathCchIsRoot(pszpath: Pcwstr): Bool

public expect fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult

public expect fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult

public expect fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: COpaquePointer?): Hresult

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

public expect fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult

public expect fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: COpaquePointer?, dwflags: UInt): Hresult

public expect fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult

public expect fun pathFileExistsA(pszpath: Pcstr): Bool

public expect fun pathFileExistsW(pszpath: Pcwstr): Bool

public expect fun pathFindExtensionA(pszpath: Pcstr): Pstr

public expect fun pathFindExtensionW(pszpath: Pcwstr): Pwstr

public expect fun pathFindFileNameA(pszpath: Pcstr): Pstr

public expect fun pathFindFileNameW(pszpath: Pcwstr): Pwstr

public expect fun pathFindNextComponentA(pszpath: Pcstr): Pstr

public expect fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr

public expect fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: COpaquePointer?): Bool

public expect fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: COpaquePointer?): Bool

public expect fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcstr

public expect fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcwstr

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

public expect fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: COpaquePointer?): Bool

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

public expect fun pathResolve(pszpath: Pwstr, dirs: COpaquePointer?, fflags: UInt): Int

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

public expect fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: COpaquePointer?): Int

public expect fun propVariantToStrRet(propvar: COpaquePointer?, pstrret: COpaquePointer?): Hresult

public expect fun qISearch(that: COpaquePointer?, pqit: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun readCabinetState(pcs: COpaquePointer?, clength: Int): Bool

public expect fun realDriveType(idrive: Int, foktohitnet: Bool): Int

public expect fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt

public expect fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt

public expect fun registerScaleChangeEvent(hevent: Handle, pdwcookie: COpaquePointer?): Hresult

public expect fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: COpaquePointer?): Hresult

public expect fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool

public expect fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int

public expect fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int

public expect fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult

public expect fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt

public expect fun sHAddToRecentDocs(uflags: UInt, pv: COpaquePointer?)

public expect fun sHAlloc(cb: ULong): COpaquePointer?

public expect fun sHAllocShared(pvdata: COpaquePointer?, dwsize: UInt, dwprocessid: UInt): Handle

public expect fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int

public expect fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int

public expect fun sHAppBarMessage(dwmessage: UInt, pdata: COpaquePointer?): ULong

public expect fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: COpaquePointer?): Hresult

public expect fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: COpaquePointer?, enumhandlers: COpaquePointer?): Hresult

public expect fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult

public expect fun sHBindToFolderIDListParent(psfroot: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult

public expect fun sHBindToFolderIDListParentEx(psfroot: COpaquePointer?, pidl: COpaquePointer?, ppbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult

public expect fun sHBindToObject(psf: COpaquePointer?, pidl: COpaquePointer?, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHBindToParent(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult

public expect fun sHBrowseForFolderA(lpbi: COpaquePointer?): COpaquePointer?

public expect fun sHBrowseForFolderW(lpbi: COpaquePointer?): COpaquePointer?

public expect fun sHCLSIDFromString(psz: Pcwstr, pclsid: COpaquePointer?): Hresult

public expect fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: COpaquePointer?, plevent: COpaquePointer?): Handle

public expect fun shchangeNotificationUnlock(hlock: Handle): Bool

public expect fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: COpaquePointer?, dwitem2: COpaquePointer?)

public expect fun sHChangeNotifyDeregister(ulid: UInt): Bool

public expect fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: COpaquePointer?): UInt

public expect fun sHChangeNotifyRegisterThread(status: ScnrtStatus)

public expect fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): COpaquePointer?

public expect fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error

public expect fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error

public expect fun sHCreateAssociationRegistration(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateDataObject(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, pdtinner: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateDefaultContextMenu(pdcm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateDefaultExtractIcon(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateDefaultPropertiesOp(psi: COpaquePointer?, ppfileop: COpaquePointer?): Hresult

public expect fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int

public expect fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: COpaquePointer?): Int

public expect fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: COpaquePointer?): Int

public expect fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateItemFromIDList(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateItemFromRelativeName(psiparent: COpaquePointer?, pszname: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateItemInKnownFolder(kfid: COpaquePointer?, dwkfflags: UInt, pszitem: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateItemWithParent(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppvitem: COpaquePointer?): Hresult

public expect fun sHCreateMemStream(pinit: COpaquePointer?, cbinit: UInt): COpaquePointer?

public expect fun sHCreateProcessAsUserW(pscpi: COpaquePointer?): Bool

public expect fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa

public expect fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: COpaquePointer?): Hresult

public expect fun sHCreateShellFolderView(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult

public expect fun sHCreateShellFolderViewEx(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult

public expect fun sHCreateShellItem(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, ppsi: COpaquePointer?): Hresult

public expect fun sHCreateShellItemArray(pidlparent: COpaquePointer?, psf: COpaquePointer?, cidl: UInt, ppidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult

public expect fun sHCreateShellItemArrayFromDataObject(pdo: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult

public expect fun sHCreateShellItemArrayFromShellItem(psi: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHCreateShellPalette(hdc: Hdc): Hpalette

public expect fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: COpaquePointer?, ppenumformatetc: COpaquePointer?): Hresult

public expect fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult

public expect fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: COpaquePointer?, ppstm: COpaquePointer?): Hresult

public expect fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult

public expect fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine): Bool

public expect fun sHCreateThreadRef(pcref: COpaquePointer?, ppunk: COpaquePointer?): Hresult

public expect fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: COpaquePointer?): Bool

public expect fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult

public expect fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult

public expect fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error

public expect fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error

public expect fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error

public expect fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error

public expect fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error

public expect fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error

public expect fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa)

public expect fun sHDoDragDrop(hwnd: Hwnd, pdata: COpaquePointer?, pdsrc: COpaquePointer?, dweffect: Dropeffect, pdweffect: COpaquePointer?): Hresult

public expect fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult

public expect fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult

public expect fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?): Win32Error

public expect fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: COpaquePointer?): Win32Error

public expect fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error

public expect fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error

public expect fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult

public expect fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: COpaquePointer?, ppszcommandline: COpaquePointer?, ppszparameters: COpaquePointer?): Hresult

public expect fun sHFileOperationA(lpfileop: COpaquePointer?): Int

public expect fun sHFileOperationW(lpfileop: COpaquePointer?): Int

public expect fun sHFindFiles(pidlfolder: COpaquePointer?, pidlsavefile: COpaquePointer?): Bool

public expect fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): COpaquePointer?

public expect fun sHFlushSFCache()

public expect fun sHFormatDateTimeA(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pstr, cchbuf: UInt): Int

public expect fun sHFormatDateTimeW(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Int

public expect fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt

public expect fun sHFree(pv: COpaquePointer?)

public expect fun sHFreeNameMappings(hnamemappings: Handle)

public expect fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool

public expect fun sHGetAttributesFromDataObject(pdo: COpaquePointer?, dwattributemask: UInt, pdwattributes: COpaquePointer?, pcitems: COpaquePointer?): Hresult

public expect fun sHGetDataFromIDListA(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult

public expect fun sHGetDataFromIDListW(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult

public expect fun sHGetDesktopFolder(ppshf: COpaquePointer?): Hresult

public expect fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool

public expect fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool

public expect fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: COpaquePointer?): Hresult

public expect fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong

public expect fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong

public expect fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: COpaquePointer?): Hresult

public expect fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult

public expect fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult

public expect fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult

public expect fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult

public expect fun sHGetIDListFromObject(punk: COpaquePointer?, ppidl: COpaquePointer?): Hresult

public expect fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int

public expect fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int

public expect fun sHGetImageList(iimagelist: Int, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult

public expect fun sHGetInstanceExplorer(ppunk: COpaquePointer?): Hresult

public expect fun sHGetInverseCMAP(pbmap: COpaquePointer?, cbmap: UInt): Hresult

public expect fun sHGetItemFromDataObject(pdtobj: COpaquePointer?, dwflags: DataobjGetItemFlags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHGetItemFromObject(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHGetKnownFolderIDList(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppidl: COpaquePointer?): Hresult

public expect fun sHGetKnownFolderItem(rfid: COpaquePointer?, flags: KnownFolderFlag, htoken: Handle, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHGetKnownFolderPath(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppszpath: COpaquePointer?): Hresult

public expect fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: COpaquePointer?): Hresult

public expect fun sHGetMalloc(ppmalloc: COpaquePointer?): Hresult

public expect fun sHGetNameFromIDList(pidl: COpaquePointer?, sigdnname: Sigdn, ppszname: COpaquePointer?): Hresult

public expect fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool

public expect fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool

public expect fun sHGetPathFromIDListA(pidl: COpaquePointer?, pszpath: Pstr): Bool

public expect fun sHGetPathFromIDListEx(pidl: COpaquePointer?, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool

public expect fun sHGetPathFromIDListW(pidl: COpaquePointer?, pszpath: Pwstr): Bool

public expect fun sHGetRealIDL(psf: COpaquePointer?, pidlsimple: COpaquePointer?, ppidlreal: COpaquePointer?): Hresult

public expect fun sHGetSetFolderCustomSettings(pfcs: COpaquePointer?, pszpath: Pcwstr, dwreadwrite: UInt): Hresult

public expect fun sHGetSetSettings(lpss: COpaquePointer?, dwmask: SsfMask, bset: Bool)

public expect fun sHGetSettings(psfs: COpaquePointer?, dwmask: UInt)

public expect fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: COpaquePointer?): Hresult

public expect fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool

public expect fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool

public expect fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: COpaquePointer?): Hresult

public expect fun sHGetTemporaryPropertyForItem(psi: COpaquePointer?, propkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun sHGetThreadRef(ppunk: COpaquePointer?): Hresult

public expect fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: COpaquePointer?, pfiletime: COpaquePointer?, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult

public expect fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error

public expect fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error

public expect fun sHGetViewStatePropertyBag(pidl: COpaquePointer?, pszbagname: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun sHGlobalCounterDecrement(id: Shglobalcounter): Int

public expect fun sHGlobalCounterGetValue(id: Shglobalcounter): Int

public expect fun sHGlobalCounterIncrement(id: Shglobalcounter): Int

public expect fun sHHandleUpdateImage(pidlextra: COpaquePointer?): Int

public expect fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: COpaquePointer?, rgfinout: COpaquePointer?): Hresult

public expect fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool

public expect fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool

public expect fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: COpaquePointer?): Hresult

public expect fun sHIsLowMemoryMachine(dwtype: UInt): Bool

public expect fun sHLimitInputEdit(hwndedit: Hwnd, psf: COpaquePointer?): Hresult

public expect fun sHLoadInProc(rclsid: COpaquePointer?): Hresult

public expect fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: COpaquePointer?): Hresult

public expect fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult

public expect fun sHLockShared(hdata: Handle, dwprocessid: UInt): COpaquePointer?

public expect fun sHMapPIDLToSystemImageListIndex(pshf: COpaquePointer?, pidl: COpaquePointer?, piindexsel: COpaquePointer?): Int

public expect fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int

public expect fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int

public expect fun sHMultiFileProperties(pdtobj: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool

public expect fun sHOpenFolderAndSelectItems(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: COpaquePointer?, ckeys: UInt, pclsiddefault: COpaquePointer?, pdtobj: COpaquePointer?, psb: COpaquePointer?, pstartpage: Pcwstr): Bool

public expect fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer?

public expect fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer?

public expect fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer?

public expect fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer?

public expect fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: COpaquePointer?): Hresult

public expect fun sHParseDisplayName(pszname: Pcwstr, pbc: COpaquePointer?, ppidl: COpaquePointer?, sfgaoin: UInt, psfgaoout: COpaquePointer?): Hresult

public expect fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcstr, dwflags: UInt): Hresult

public expect fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcwstr, dwflags: UInt): Hresult

public expect fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error

public expect fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error

public expect fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: COpaquePointer?): Hresult

public expect fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: COpaquePointer?): Hresult

public expect fun sHQueryUserNotificationState(pquns: COpaquePointer?): Hresult

public expect fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error

public expect fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error

public expect fun sHRegCloseUSKey(huskey: Long): Win32Error

public expect fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error

public expect fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error

public expect fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDuplicateHKey(hkey: Hkey): Hkey

public expect fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool

public expect fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool
