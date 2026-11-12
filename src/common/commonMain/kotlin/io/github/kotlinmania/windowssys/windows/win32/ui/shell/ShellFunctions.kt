package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Dropeffect
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.DeviceScaleFactor
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Itemidlist
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Perceived
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Shitemid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Strret
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

public expect fun assocCreate(clsid: Guid, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun assocCreateForClasses(rgclasses: ConstPtr<Associationelement>, cclasses: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun assocGetDetailsOfPropKey(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, pkey: ConstPtr<Propertykey>, pv: MutPtr<Variant.Variant>, pffoundpropkey: MutPtr<Bool>): Hresult

public expect fun assocGetPerceivedType(pszext: Pcwstr, ptype: MutPtr<Perceived>, pflag: MutPtr<UInt>, ppsztype: MutPtr<Pwstr>): Hresult

public expect fun assocIsDangerous(pszassoc: Pcwstr): Bool

public expect fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: MutPtr<Hkey>): Hresult

public expect fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: MutPtr<Hkey>): Hresult

public expect fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>): Hresult

public expect fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>): Hresult

public expect fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>): Hresult

public expect fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>): Hresult

public expect fun cdefFolderMenuCreate2(pidlfolder: ConstPtr<Itemidlist>, hwnd: Hwnd, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, psf: MutPtr<CVoid>, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: ConstPtr<Hkey>, ppcm: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun cidldataCreateFromIdarray(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, ppdtobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun chrCmpIA(w1: UShort, w2: UShort): Bool

public expect fun chrCmpIW(w1: UShort, w2: UShort): Bool

public expect fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref

public expect fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref

public expect fun colorRGBToHLS(clrrgb: Colorref, pwhue: MutPtr<UShort>, pwluminance: MutPtr<UShort>, pwsaturation: MutPtr<UShort>)

public expect fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: MutPtr<Int>): MutPtr<Pwstr>

public expect fun connectToConnectionPoint(punk: MutPtr<CVoid>, riidevent: ConstPtr<Guid>, fconnect: Bool, punktarget: MutPtr<CVoid>, pdwcookie: MutPtr<UInt>, ppcpout: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult

public expect fun dadAutoScroll(hwnd: Hwnd, pad: MutPtr<AutoScrollData>, pptnow: ConstPtr<Point>): Bool

public expect fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool

public expect fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: MutPtr<CVoid>): Bool

public expect fun dadDragLeave(): Bool

public expect fun dadDragMove(pt: Point): Bool

public expect fun dadSetDragImage(him: Himagelist, pptoffset: MutPtr<Point>): Bool

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

public expect fun dragQueryPoint(hdrop: Hdrop, ppt: MutPtr<Point>): Bool

public expect fun driveType(idrive: Int): Int

public expect fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon

public expect fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: MutPtr<UShort>): Hicon

public expect fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: MutPtr<UShort>, piiconid: MutPtr<UShort>): Hicon

public expect fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: MutPtr<UShort>, piiconid: MutPtr<UShort>): Hicon

public expect fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: MutPtr<UShort>): Hicon

public expect fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon

public expect fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, nicons: UInt): UInt

public expect fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, nicons: UInt): UInt

public expect fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon

public expect fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance

public expect fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance

public expect fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: MutPtr<UInt>): Hresult

public expect fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: MutPtr<UInt>): Hresult

public expect fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getCurrentProcessExplicitAppUserModelID(appid: MutPtr<Pwstr>): Hresult

public expect fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt

public expect fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool

public expect fun getMenuContextHelpId(param0: Hmenu): UInt

public expect fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int

public expect fun getProfileType(dwflags: MutPtr<UInt>): Bool

public expect fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor

public expect fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: MutPtr<DeviceScaleFactor>): Hresult

public expect fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool

public expect fun getWindowContextHelpId(param0: Hwnd): UInt

public expect fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: MutPtr<ULong>): Bool

public expect fun hmonitorUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmonitor>)

public expect fun hmonitorUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmonitor>)

public expect fun hmonitorUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmonitor>): MutPtr<UByte>

public expect fun hmonitorUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmonitor>): MutPtr<UByte>

public expect fun hmonitorUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmonitor>): UInt

public expect fun hmonitorUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmonitor>): UInt

public expect fun hmonitorUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmonitor>): MutPtr<UByte>

public expect fun hmonitorUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmonitor>): MutPtr<UByte>

public expect fun hashData(pbdata: ConstPtr<UByte>, cbdata: UInt, pbhash: MutPtr<UByte>, cbhash: UInt): Hresult

public expect fun hlinkClone(pihl: MutPtr<CVoid>, riid: ConstPtr<Guid>, pihlsiteforclone: MutPtr<CVoid>, dwsitedata: UInt, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkCreateBrowseContext(piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkCreateFromData(pidataobj: MutPtr<CVoid>, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkCreateFromMoniker(pimktrgt: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: MutPtr<CVoid>, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult

public expect fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult

public expect fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult

public expect fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: MutPtr<Pwstr>): Hresult

public expect fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: MutPtr<Pwstr>): Hresult

public expect fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult

public expect fun hlinkNavigate(pihl: MutPtr<CVoid>, pihlframe: MutPtr<CVoid>, grfhlnf: UInt, pbc: MutPtr<CVoid>, pibsc: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>): Hresult

public expect fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, pihlframe: MutPtr<CVoid>, grfhlnf: UInt, pibc: MutPtr<CVoid>, pibsc: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>): Hresult

public expect fun hlinkOnNavigate(pihlframe: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>, grfhlnf: UInt, pimktarget: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: MutPtr<UInt>): Hresult

public expect fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: MutPtr<CVoid>, pimkold: MutPtr<CVoid>, pimknew: MutPtr<CVoid>): Hresult

public expect fun hlinkParseDisplayName(pibc: MutPtr<CVoid>, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: MutPtr<UInt>, ppimk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkPreprocessMoniker(pibc: MutPtr<CVoid>, pimkin: MutPtr<CVoid>, ppimkout: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkQueryCreateFromData(pidataobj: MutPtr<CVoid>): Hresult

public expect fun hlinkResolveMonikerForData(pimkreference: MutPtr<CVoid>, reserved: UInt, pibc: MutPtr<CVoid>, cfmtetc: UInt, rgfmtetc: MutPtr<Formatetc>, pibsc: MutPtr<CVoid>, pimkbase: MutPtr<CVoid>): Hresult

public expect fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: MutPtr<MutPtr<CVoid>>, ppwzlocation: MutPtr<Pwstr>): Hresult

public expect fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: MutPtr<Pwstr>, ppwzlocation: MutPtr<Pwstr>): Hresult

public expect fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: MutPtr<CVoid>, cfmtetc: UInt, rgfmtetc: MutPtr<Formatetc>, pibsc: MutPtr<CVoid>, pimkbase: MutPtr<CVoid>): Hresult

public expect fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult

public expect fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: MutPtr<Pwstr>): Hresult

public expect fun hlinkUpdateStackItem(pihlframe: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>, uhlid: UInt, pimktrgt: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult

public expect fun iLAppendID(pidl: ConstPtr<Itemidlist>, pmkid: ConstPtr<Shitemid>, fappend: Bool): MutPtr<Itemidlist>

public expect fun iLClone(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist>

public expect fun iLCloneFirst(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist>

public expect fun iLCombine(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>): MutPtr<Itemidlist>

public expect fun iLCreateFromPathA(pszpath: Pcstr): MutPtr<Itemidlist>

public expect fun iLCreateFromPathW(pszpath: Pcwstr): MutPtr<Itemidlist>

public expect fun iLFindChild(pidlparent: ConstPtr<Itemidlist>, pidlchild: ConstPtr<Itemidlist>): MutPtr<Itemidlist>

public expect fun iLFindLastID(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist>

public expect fun iLFree(pidl: ConstPtr<Itemidlist>)

public expect fun iLGetNext(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist>

public expect fun iLGetSize(pidl: ConstPtr<Itemidlist>): UInt

public expect fun iLIsEqual(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>): Bool

public expect fun iLIsParent(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>, fimmediate: Bool): Bool

public expect fun iLLoadFromStreamEx(pstm: MutPtr<CVoid>, pidl: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun iLRemoveLastID(pidl: MutPtr<Itemidlist>): Bool

public expect fun iLSaveToStream(pstm: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>): Hresult

public expect fun istreamCopy(pstmfrom: MutPtr<CVoid>, pstmto: MutPtr<CVoid>, cb: UInt): Hresult

public expect fun istreamRead(pstm: MutPtr<CVoid>, pv: MutPtr<CVoid>, cb: UInt): Hresult

public expect fun istreamReadPidl(pstm: MutPtr<CVoid>, ppidlout: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun istreamReadStr(pstm: MutPtr<CVoid>, ppsz: MutPtr<Pwstr>): Hresult

public expect fun istreamReset(pstm: MutPtr<CVoid>): Hresult

public expect fun istreamSize(pstm: MutPtr<CVoid>, pui: MutPtr<ULong>): Hresult

public expect fun istreamWrite(pstm: MutPtr<CVoid>, pv: ConstPtr<CVoid>, cb: UInt): Hresult

public expect fun istreamWritePidl(pstm: MutPtr<CVoid>, pidlwrite: ConstPtr<Itemidlist>): Hresult

public expect fun istreamWriteStr(pstm: MutPtr<CVoid>, psz: Pcwstr): Hresult

public expect fun iunknownAtomicRelease(ppunk: MutPtr<MutPtr<CVoid>>)

public expect fun iunknownGetSite(punk: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun iunknownGetWindow(punk: MutPtr<CVoid>, phwnd: MutPtr<Hwnd>): Hresult

public expect fun iunknownQueryService(punk: MutPtr<CVoid>, guidservice: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppvout: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun iunknownSet(ppunk: MutPtr<MutPtr<CVoid>>, punk: MutPtr<CVoid>)

public expect fun iunknownSetSite(punk: MutPtr<CVoid>, punksite: MutPtr<CVoid>): Hresult

public expect fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: MutPtr<Bool>, pfparsepersiterules: MutPtr<Bool>): Bool

public expect fun initNetworkAddressControl(): Bool

public expect fun initPropVariantFromStrRet(pstrret: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, ppropvar: MutPtr<Propvariant>): Hresult

public expect fun initVariantFromStrRet(pstrret: ConstPtr<Strret>, pidl: ConstPtr<Itemidlist>, pvar: MutPtr<Variant.Variant>): Hresult

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

public expect fun loadUserProfileA(htoken: Handle, lpprofileinfo: MutPtr<Profileinfoa>): Bool

public expect fun loadUserProfileW(htoken: Handle, lpprofileinfo: MutPtr<Profileinfow>): Bool

public expect fun oleSaveToStreamEx(piunk: MutPtr<CVoid>, pistm: MutPtr<CVoid>, fcleardirty: Bool): Hresult

public expect fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid>

public expect fun parseURLA(pcszurl: Pcstr, ppu: MutPtr<Parsedurla>): Hresult

public expect fun parseURLW(pcszurl: Pcwstr, ppu: MutPtr<Parsedurlw>): Hresult

public expect fun pathAddBackslashA(pszpath: Pstr): Pstr

public expect fun pathAddBackslashW(pszpath: Pwstr): Pwstr

public expect fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool

public expect fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool

public expect fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr<Pwstr>): Hresult

public expect fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr<Pwstr>): Hresult

public expect fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool

public expect fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool

public expect fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr

public expect fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr

public expect fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool

public expect fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool

public expect fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr<Pwstr>, pcchremaining: MutPtr<ULong>): Hresult

public expect fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult

public expect fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult

public expect fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult

public expect fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult

public expect fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult

public expect fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: MutPtr<Pcwstr>): Hresult

public expect fun pathCchIsRoot(pszpath: Pcwstr): Bool

public expect fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr<Pwstr>, pcchremaining: MutPtr<ULong>): Hresult

public expect fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult

public expect fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult

public expect fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: MutPtr<Pcwstr>): Hresult

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

public expect fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: MutPtr<Pwstr>, dwflags: UInt): Hresult

public expect fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun pathFileExistsA(pszpath: Pcstr): Bool

public expect fun pathFileExistsW(pszpath: Pcwstr): Bool

public expect fun pathFindExtensionA(pszpath: Pcstr): Pstr

public expect fun pathFindExtensionW(pszpath: Pcwstr): Pwstr

public expect fun pathFindFileNameA(pszpath: Pcstr): Pstr

public expect fun pathFindFileNameW(pszpath: Pcwstr): Pwstr

public expect fun pathFindNextComponentA(pszpath: Pcstr): Pstr

public expect fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr

public expect fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: ConstPtr<ConstPtr<Byte>>): Bool

public expect fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: ConstPtr<ConstPtr<UShort>>): Bool

public expect fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: ConstPtr<Pcstr>, iarraysize: Int): Pcstr

public expect fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: ConstPtr<Pcwstr>, iarraysize: Int): Pcwstr

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

public expect fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: MutPtr<Pcwstr>): Bool

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

public expect fun pathResolve(pszpath: Pwstr, dirs: ConstPtr<ConstPtr<UShort>>, fflags: UInt): Int

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

public expect fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: MutPtr<Int>): Int

public expect fun propVariantToStrRet(propvar: ConstPtr<Propvariant>, pstrret: MutPtr<Strret>): Hresult

public expect fun qISearch(that: MutPtr<CVoid>, pqit: ConstPtr<Qitab>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun readCabinetState(pcs: MutPtr<Cabinetstate>, clength: Int): Bool

public expect fun realDriveType(idrive: Int, foktohitnet: Bool): Int

public expect fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: ConstPtr<CVoid>, registration: MutPtr<PappconstrainRegistration>): UInt

public expect fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: ConstPtr<CVoid>, registration: MutPtr<PappstateRegistration>): UInt

public expect fun registerScaleChangeEvent(hevent: Handle, pdwcookie: MutPtr<ULong>): Hresult

public expect fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: MutPtr<UInt>): Hresult

public expect fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool

public expect fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int

public expect fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int

public expect fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult

public expect fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt

public expect fun sHAddToRecentDocs(uflags: UInt, pv: ConstPtr<CVoid>)

public expect fun sHAlloc(cb: ULong): MutPtr<CVoid>

public expect fun sHAllocShared(pvdata: ConstPtr<CVoid>, dwsize: UInt, dwprocessid: UInt): Handle

public expect fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int

public expect fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int

public expect fun sHAppBarMessage(dwmessage: UInt, pdata: MutPtr<Appbardata>): ULong

public expect fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: ConstPtr<Guid>, enumhandlers: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult

public expect fun sHBindToFolderIDListParent(psfroot: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHBindToFolderIDListParentEx(psfroot: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, ppbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHBindToObject(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHBindToParent(pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHBrowseForFolderA(lpbi: ConstPtr<Browseinfoa>): MutPtr<Itemidlist>

public expect fun sHBrowseForFolderW(lpbi: ConstPtr<Browseinfow>): MutPtr<Itemidlist>

public expect fun sHCLSIDFromString(psz: Pcwstr, pclsid: MutPtr<Guid>): Hresult

public expect fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: MutPtr<MutPtr<MutPtr<Itemidlist>>>, plevent: MutPtr<Int>): Handle

public expect fun shchangeNotificationUnlock(hlock: Handle): Bool

public expect fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: ConstPtr<CVoid>, dwitem2: ConstPtr<CVoid>)

public expect fun sHChangeNotifyDeregister(ulid: UInt): Bool

public expect fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: ConstPtr<SHChangeNotifyEntry>): UInt

public expect fun sHChangeNotifyRegisterThread(status: ScnrtStatus)

public expect fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): MutPtr<Itemidlist>

public expect fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error

public expect fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error

public expect fun sHCreateAssociationRegistration(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateDataObject(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, pdtinner: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateDefaultContextMenu(pdcm: ConstPtr<Defcontextmenu>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateDefaultExtractIcon(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateDefaultPropertiesOp(psi: MutPtr<CVoid>, ppfileop: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int

public expect fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: ConstPtr<SecurityAttributes>): Int

public expect fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: ConstPtr<SecurityAttributes>): Int

public expect fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateItemFromIDList(pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateItemFromRelativeName(psiparent: MutPtr<CVoid>, pszname: Pcwstr, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateItemInKnownFolder(kfid: ConstPtr<Guid>, dwkfflags: UInt, pszitem: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateItemWithParent(pidlparent: ConstPtr<Itemidlist>, psfparent: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppvitem: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateMemStream(pinit: ConstPtr<UByte>, cbinit: UInt): MutPtr<CVoid>

public expect fun sHCreateProcessAsUserW(pscpi: MutPtr<Shcreateprocessinfow>): Bool

public expect fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa

public expect fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellFolderView(pcsfv: ConstPtr<SfvCreate>, ppsv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellFolderViewEx(pcsfv: ConstPtr<Csfv>, ppsv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellItem(pidlparent: ConstPtr<Itemidlist>, psfparent: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, ppsi: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellItemArray(pidlparent: ConstPtr<Itemidlist>, psf: MutPtr<CVoid>, cidl: UInt, ppidl: ConstPtr<ConstPtr<Itemidlist>>, ppsiitemarray: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellItemArrayFromDataObject(pdo: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: ConstPtr<ConstPtr<Itemidlist>>, ppsiitemarray: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellItemArrayFromShellItem(psi: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateShellPalette(hdc: Hdc): Hpalette

public expect fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: ConstPtr<Formatetc>, ppenumformatetc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr<CVoid>, flags: UInt, pfncallback: LpthreadStartRoutine): Bool

public expect fun sHCreateThreadRef(pcref: MutPtr<Int>, ppunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr<CVoid>, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: MutPtr<Handle>): Bool

public expect fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, niconsize: UInt): Hresult

public expect fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, niconsize: UInt): Hresult

public expect fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error

public expect fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error

public expect fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error

public expect fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error

public expect fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error

public expect fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error

public expect fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa)

public expect fun sHDoDragDrop(hwnd: Hwnd, pdata: MutPtr<CVoid>, pdsrc: MutPtr<CVoid>, dweffect: Dropeffect, pdweffect: MutPtr<Dropeffect>): Hresult

public expect fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult

public expect fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult

public expect fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: MutPtr<UInt>): Win32Error

public expect fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: MutPtr<UInt>): Win32Error

public expect fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult

public expect fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: MutPtr<Pwstr>, ppszcommandline: MutPtr<Pwstr>, ppszparameters: MutPtr<Pwstr>): Hresult

public expect fun sHFileOperationA(lpfileop: MutPtr<Shfileopstructa>): Int

public expect fun sHFileOperationW(lpfileop: MutPtr<Shfileopstructw>): Int

public expect fun sHFindFiles(pidlfolder: ConstPtr<Itemidlist>, pidlsavefile: ConstPtr<Itemidlist>): Bool

public expect fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): MutPtr<CVoid>

public expect fun sHFlushSFCache()

public expect fun sHFormatDateTimeA(pft: ConstPtr<Filetime>, pdwflags: MutPtr<UInt>, pszbuf: Pstr, cchbuf: UInt): Int

public expect fun sHFormatDateTimeW(pft: ConstPtr<Filetime>, pdwflags: MutPtr<UInt>, pszbuf: Pwstr, cchbuf: UInt): Int

public expect fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt

public expect fun sHFree(pv: ConstPtr<CVoid>)

public expect fun sHFreeNameMappings(hnamemappings: Handle)

public expect fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool

public expect fun sHGetAttributesFromDataObject(pdo: MutPtr<CVoid>, dwattributemask: UInt, pdwattributes: MutPtr<UInt>, pcitems: MutPtr<UInt>): Hresult

public expect fun sHGetDataFromIDListA(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, nformat: ShgdfilFormat, pv: MutPtr<CVoid>, cb: Int): Hresult

public expect fun sHGetDataFromIDListW(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, nformat: ShgdfilFormat, pv: MutPtr<CVoid>, cb: Int): Hresult

public expect fun sHGetDesktopFolder(ppshf: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: MutPtr<ULong>, pultotalnumberofbytes: MutPtr<ULong>, pultotalnumberoffreebytes: MutPtr<ULong>): Bool

public expect fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: MutPtr<ULong>, pultotalnumberofbytes: MutPtr<ULong>, pultotalnumberoffreebytes: MutPtr<ULong>): Bool

public expect fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: MutPtr<UInt>): Hresult

public expect fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr<Shfileinfoa>, cbfileinfo: UInt, uflags: ShgfiFlags): ULong

public expect fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr<Shfileinfow>, cbfileinfo: UInt, uflags: ShgfiFlags): ULong

public expect fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult

public expect fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult

public expect fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult

public expect fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult

public expect fun sHGetIDListFromObject(punk: MutPtr<CVoid>, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int

public expect fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int

public expect fun sHGetImageList(iimagelist: Int, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetInstanceExplorer(ppunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetInverseCMAP(pbmap: MutPtr<UByte>, cbmap: UInt): Hresult

public expect fun sHGetItemFromDataObject(pdtobj: MutPtr<CVoid>, dwflags: DataobjGetItemFlags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetItemFromObject(punk: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetKnownFolderIDList(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHGetKnownFolderItem(rfid: ConstPtr<Guid>, flags: KnownFolderFlag, htoken: Handle, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetKnownFolderPath(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, ppszpath: MutPtr<Pwstr>): Hresult

public expect fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: MutPtr<Int>): Hresult

public expect fun sHGetMalloc(ppmalloc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetNameFromIDList(pidl: ConstPtr<Itemidlist>, sigdnname: Sigdn, ppszname: MutPtr<Pwstr>): Hresult

public expect fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: MutPtr<Bool>, uflags: UInt): Bool

public expect fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: MutPtr<Bool>, uflags: UInt): Bool

public expect fun sHGetPathFromIDListA(pidl: ConstPtr<Itemidlist>, pszpath: Pstr): Bool

public expect fun sHGetPathFromIDListEx(pidl: ConstPtr<Itemidlist>, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool

public expect fun sHGetPathFromIDListW(pidl: ConstPtr<Itemidlist>, pszpath: Pwstr): Bool

public expect fun sHGetRealIDL(psf: MutPtr<CVoid>, pidlsimple: ConstPtr<Itemidlist>, ppidlreal: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHGetSetFolderCustomSettings(pfcs: MutPtr<Shfoldercustomsettings>, pszpath: Pcwstr, dwreadwrite: UInt): Hresult

public expect fun sHGetSetSettings(lpss: MutPtr<Shellstatea>, dwmask: SsfMask, bset: Bool)

public expect fun sHGetSettings(psfs: MutPtr<Shellflagstate>, dwmask: UInt)

public expect fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult

public expect fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool

public expect fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool

public expect fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: MutPtr<Shstockiconinfo>): Hresult

public expect fun sHGetTemporaryPropertyForItem(psi: MutPtr<CVoid>, propkey: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult

public expect fun sHGetThreadRef(ppunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: MutPtr<UInt>, pfiletime: MutPtr<Filetime>, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult

public expect fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun sHGetViewStatePropertyBag(pidl: ConstPtr<Itemidlist>, pszbagname: Pcwstr, dwflags: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun sHGlobalCounterDecrement(id: Shglobalcounter): Int

public expect fun sHGlobalCounterGetValue(id: Shglobalcounter): Int

public expect fun sHGlobalCounterIncrement(id: Shglobalcounter): Int

public expect fun sHHandleUpdateImage(pidlextra: ConstPtr<Itemidlist>): Int

public expect fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: MutPtr<MutPtr<Itemidlist>>, rgfinout: MutPtr<UInt>): Hresult

public expect fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool

public expect fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool

public expect fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: MutPtr<UInt>): Hresult

public expect fun sHIsLowMemoryMachine(dwtype: UInt): Bool

public expect fun sHLimitInputEdit(hwndedit: Hwnd, psf: MutPtr<CVoid>): Hresult

public expect fun sHLoadInProc(rclsid: ConstPtr<Guid>): Hresult

public expect fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: ConstPtr<ConstPtr<CVoid>>): Hresult

public expect fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult

public expect fun sHLockShared(hdata: Handle, dwprocessid: UInt): MutPtr<CVoid>

public expect fun sHMapPIDLToSystemImageListIndex(pshf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, piindexsel: MutPtr<Int>): Int

public expect fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int

public expect fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int

public expect fun sHMultiFileProperties(pdtobj: MutPtr<CVoid>, dwflags: UInt): Hresult

public expect fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool

public expect fun sHOpenFolderAndSelectItems(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, dwflags: UInt): Hresult

public expect fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: ConstPtr<Hkey>, ckeys: UInt, pclsiddefault: ConstPtr<Guid>, pdtobj: MutPtr<CVoid>, psb: MutPtr<CVoid>, pstartpage: Pcwstr): Bool

public expect fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr<CVoid>

public expect fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid>

public expect fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr<CVoid>

public expect fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid>

public expect fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: ConstPtr<Openasinfo>): Hresult

public expect fun sHParseDisplayName(pszname: Pcwstr, pbc: MutPtr<CVoid>, ppidl: MutPtr<MutPtr<Itemidlist>>, sfgaoin: UInt, psfgaoout: MutPtr<UInt>): Hresult

public expect fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: MutPtr<CVoid>, pszpath: Pcstr, dwflags: UInt): Hresult

public expect fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: MutPtr<CVoid>, pszpath: Pcwstr, dwflags: UInt): Hresult

public expect fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>): Win32Error

public expect fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>): Win32Error

public expect fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: MutPtr<Shqueryrbinfo>): Hresult

public expect fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: MutPtr<Shqueryrbinfo>): Hresult

public expect fun sHQueryUserNotificationState(pquns: MutPtr<QueryUserNotificationState>): Hresult

public expect fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: ConstPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: ConstPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun sHRegCloseUSKey(huskey: Long): Win32Error

public expect fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, dwflags: UInt): Win32Error

public expect fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, dwflags: UInt): Win32Error

public expect fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error

public expect fun sHRegDuplicateHKey(hkey: Hkey): Hkey

public expect fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error

public expect fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool

public expect fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool
