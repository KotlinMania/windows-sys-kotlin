@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ShowWindowCmd

private object WindowsWin32UiShellJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocCreateForClasses(rgclasses: Long, cclasses: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocGetPerceivedType(pszext: Long, ptype: Long, pflag: Long, ppsztype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocIsDangerous(pszassoc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocQueryKeyA(flags: Int, key: Int, pszassoc: Long, pszextra: Long, phkeyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocQueryKeyW(flags: Int, key: Int, pszassoc: Long, pszextra: Long, phkeyout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocQueryStringA(flags: Int, str: Int, pszassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocQueryStringByKeyA(flags: Int, str: Int, hkassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocQueryStringByKeyW(flags: Int, str: Int, hkassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellAssocQueryStringW(flags: Int, str: Int, pszassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellCdefFolderMenuCreate2(pidlfolder: Long, hwnd: Long, cidl: Int, apidl: Long, psf: Long, pfn: Long, nkeys: Int, ahkeys: Long, ppcm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellCidldataCreateFromIdarray(pidlfolder: Long, cidl: Int, apidl: Long, ppdtobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellChrCmpIA(w1: Short, w2: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellChrCmpIW(w1: Short, w2: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellColorAdjustLuma(clrrgb: Int, n: Int, fscale: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellColorHLSToRGB(whue: Short, wluminance: Short, wsaturation: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellColorRGBToHLS(clrrgb: Int, pwhue: Long, pwluminance: Long, pwsaturation: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellCommandLineToArgvW(lpcmdline: Long, pnumargs: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: Int, punktarget: Long, pdwcookie: Long, ppcpout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellCreateProfile(pszusersid: Long, pszusername: Long, pszprofilepath: Long, cchprofilepath: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDadAutoScroll(hwnd: Long, pad: Long, pptnow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDadDragLeave(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDadSetDragImage(him: Long, pptoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDadShowDragImage(fshow: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDefSubclassProc(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDeleteProfileA(lpsidstring: Long, lpprofilepath: Long, lpcomputername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDeleteProfileW(lpsidstring: Long, lpprofilepath: Long, lpcomputername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDoEnvironmentSubstA(pszsrc: Long, cchsrc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDoEnvironmentSubstW(pszsrc: Long, cchsrc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDragAcceptFiles(hwnd: Long, faccept: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDragFinish(hdrop: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDragQueryFileA(hdrop: Long, ifile: Int, lpszfile: Long, cch: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDragQueryFileW(hdrop: Long, ifile: Int, lpszfile: Long, cch: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDragQueryPoint(hdrop: Long, ppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDriveType(idrive: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellDuplicateIcon(hinst: Long, hicon: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractAssociatedIconA(hinst: Long, psziconpath: Long, piicon: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractAssociatedIconExA(hinst: Long, psziconpath: Long, piiconindex: Long, piiconid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractAssociatedIconExW(hinst: Long, psziconpath: Long, piiconindex: Long, piiconid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractAssociatedIconW(hinst: Long, psziconpath: Long, piicon: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractIconA(hinst: Long, pszexefilename: Long, niconindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractIconExA(lpszfile: Long, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractIconExW(lpszfile: Long, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellExtractIconW(hinst: Long, pszexefilename: Long, niconindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellFindExecutableA(lpfile: Long, lpdirectory: Long, lpresult: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellFindExecutableW(lpfile: Long, lpdirectory: Long, lpresult: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetAcceptLanguagesA(pszlanguages: Long, pcchlanguages: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetAcceptLanguagesW(pszlanguages: Long, pcchlanguages: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetCurrentProcessExplicitAppUserModelID(appid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetDpiForShellUIComponent(param0: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetFileNameFromBrowse(hwnd: Long, pszfilepath: Long, cchfilepath: Int, pszworkingdir: Long, pszdefext: Long, pszfilters: Long, psztitle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetMenuContextHelpId(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetMenuPosFromID(hmenu: Long, id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetProfileType(dwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetProfilesDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetProfilesDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetScaleFactorForDevice(devicetype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetScaleFactorForMonitor(hmon: Long, pscale: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetUserProfileDirectoryA(htoken: Long, lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetUserProfileDirectoryW(htoken: Long, lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetWindowContextHelpId(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellGetWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long, pdwrefdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHmonitorUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHashData(pbdata: Long, cbdata: Int, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: Int, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateExtensionServices(pwzadditionalheaders: Long, phwnd: Long, pszusername: Long, pszpassword: Long, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: Long, pwzfriendlyname: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateFromString(pwztarget: Long, pwzlocation: Long, pwzfriendlyname: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateShortcut(grfhlshortcutf: Int, pihl: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateShortcutFromMoniker(grfhlshortcutf: Int, pimktarget: Long, pwzlocation: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkCreateShortcutFromString(grfhlshortcutf: Int, pwztarget: Long, pwzlocation: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkGetSpecialReference(ureference: Int, ppwzreference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkGetValueFromParams(pwzparams: Long, pwzname: Long, ppwzvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkIsShortcut(pwzfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: Int, pbc: Long, pibsc: Long, pihlbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkNavigateToStringReference(pwztarget: Long, pwzlocation: Long, pihlsite: Long, dwsitedata: Int, pihlframe: Long, grfhlnf: Int, pibc: Long, pibsc: Long, pihlbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: Int, pimktarget: Long, pwzlocation: Long, pwzfriendlyname: Long, puhlid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkOnRenameDocument(dwreserved: Int, pihlbc: Long, pimkold: Long, pimknew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkParseDisplayName(pibc: Long, pwzdisplayname: Long, fnoforceabs: Int, pccheaten: Long, ppimk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkQueryCreateFromData(pidataobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkResolveMonikerForData(pimkreference: Long, reserved: Int, pibc: Long, cfmtetc: Int, rgfmtetc: Long, pibsc: Long, pimkbase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkResolveShortcut(pwzshortcutfilename: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkResolveShortcutToMoniker(pwzshortcutfilename: Long, ppimktarget: Long, ppwzlocation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkResolveShortcutToString(pwzshortcutfilename: Long, ppwztarget: Long, ppwzlocation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkResolveStringForData(pwzreference: Long, reserved: Int, pibc: Long, cfmtetc: Int, rgfmtetc: Long, pibsc: Long, pimkbase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkSetSpecialReference(ureference: Int, pwzreference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkTranslateURL(pwzurl: Long, grfflags: Int, ppwztranslatedurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellHlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: Int, pimktrgt: Long, pwzlocation: Long, pwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILAppendID(pidl: Long, pmkid: Long, fappend: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILClone(pidl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILCloneFirst(pidl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILCombine(pidl1: Long, pidl2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILCreateFromPathA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILCreateFromPathW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILFindChild(pidlparent: Long, pidlchild: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILFindLastID(pidl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILFree(pidl: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILGetNext(pidl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILGetSize(pidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILIsEqual(pidl1: Long, pidl2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILIsParent(pidl1: Long, pidl2: Long, fimmediate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILLoadFromStreamEx(pstm: Long, pidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILRemoveLastID(pidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellILSaveToStream(pstm: Long, pidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamCopy(pstmfrom: Long, pstmto: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamRead(pstm: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamReadPidl(pstm: Long, ppidlout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamReadStr(pstm: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamReset(pstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamSize(pstm: Long, pui: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamWrite(pstm: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamWritePidl(pstm: Long, pidlwrite: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIstreamWriteStr(pstm: Long, psz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIunknownAtomicRelease(ppunk: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIunknownGetSite(punk: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIunknownGetWindow(punk: Long, phwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIunknownQueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIunknownSet(ppunk: Long, punk: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIunknownSetSite(punk: Long, punksite: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellImportPrivacySettings(pszfilename: Long, pfparseprivacypreferences: Long, pfparsepersiterules: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellInitNetworkAddressControl(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellInitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellInitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIntlStrEqWorkerA(fcasesens: Int, lpstring1: Long, lpstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIntlStrEqWorkerW(fcasesens: Int, lpstring1: Long, lpstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsCharSpaceA(wch: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsCharSpaceW(wch: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsInternetESCEnabled(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsLFNDriveA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsLFNDriveW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsNetDrive(idrive: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsOS(dwos: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellIsUserAnAdmin(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellLoadUserProfileA(htoken: Long, lpprofileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellLoadUserProfileW(htoken: Long, lpprofileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellOleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellOpenRegStream(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellParseURLA(pcszurl: Long, ppu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellParseURLW(pcszurl: Long, ppu: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAddBackslashA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAddBackslashW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAddExtensionA(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAddExtensionW(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAllocCanonicalize(pszpathin: Long, dwflags: Int, ppszpathout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAllocCombine(pszpathin: Long, pszmore: Long, dwflags: Int, ppszpathout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAppendA(pszpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathAppendW(pszpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathBuildRootA(pszroot: Long, idrive: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathBuildRootW(pszroot: Long, idrive: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCanonicalizeA(pszbuf: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCanonicalizeW(pszbuf: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchAddBackslash(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchAddBackslashEx(pszpath: Long, cchpath: Long, ppszend: Long, pcchremaining: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchAddExtension(pszpath: Long, cchpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchAppend(pszpath: Long, cchpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchAppendEx(pszpath: Long, cchpath: Long, pszmore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchCanonicalize(pszpathout: Long, cchpathout: Long, pszpathin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchCanonicalizeEx(pszpathout: Long, cchpathout: Long, pszpathin: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchCombine(pszpathout: Long, cchpathout: Long, pszpathin: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchCombineEx(pszpathout: Long, cchpathout: Long, pszpathin: Long, pszmore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchFindExtension(pszpath: Long, cchpath: Long, ppszext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchIsRoot(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchRemoveBackslash(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchRemoveBackslashEx(pszpath: Long, cchpath: Long, ppszend: Long, pcchremaining: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchRemoveExtension(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchRemoveFileSpec(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchRenameExtension(pszpath: Long, cchpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchSkipRoot(pszpath: Long, ppszrootend: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchStripPrefix(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCchStripToRoot(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCleanupSpec(pszdir: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCombineA(pszdest: Long, pszdir: Long, pszfile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCombineW(pszdest: Long, pszdir: Long, pszfile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCommonPrefixA(pszfile1: Long, pszfile2: Long, achpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCommonPrefixW(pszfile1: Long, pszfile2: Long, achpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCompactPathA(hdc: Long, pszpath: Long, dx: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCompactPathExA(pszout: Long, pszsrc: Long, cchmax: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCompactPathExW(pszout: Long, pszsrc: Long, cchmax: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCompactPathW(hdc: Long, pszpath: Long, dx: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCreateFromUrlA(pszurl: Long, pszpath: Long, pcchpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCreateFromUrlAlloc(pszin: Long, ppszout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathCreateFromUrlW(pszurl: Long, pszpath: Long, pcchpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFileExistsA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFileExistsW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindExtensionA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindExtensionW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindFileNameA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindFileNameW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindNextComponentA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindNextComponentW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindOnPathA(pszpath: Long, ppszotherdirs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindOnPathW(pszpath: Long, ppszotherdirs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindSuffixArrayA(pszpath: Long, apszsuffix: Long, iarraysize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathFindSuffixArrayW(pszpath: Long, apszsuffix: Long, iarraysize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathGetArgsA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathGetArgsW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathGetCharTypeA(ch: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathGetCharTypeW(ch: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathGetDriveNumberA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathGetDriveNumberW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathGetShortPath(pszlongpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsContentTypeA(pszpath: Long, pszcontenttype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsContentTypeW(pszpath: Long, pszcontenttype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsDirectoryA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsDirectoryEmptyA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsDirectoryEmptyW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsDirectoryW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsExe(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsFileSpecA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsFileSpecW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsLFNFileSpecA(pszname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsLFNFileSpecW(pszname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsNetworkPathA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsNetworkPathW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsPrefixA(pszprefix: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsPrefixW(pszprefix: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsRelativeA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsRelativeW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsRootA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsRootW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsSameRootA(pszpath1: Long, pszpath2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsSameRootW(pszpath1: Long, pszpath2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsSlowA(pszfile: Long, dwattr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsSlowW(pszfile: Long, dwattr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsSystemFolderA(pszpath: Long, dwattrb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsSystemFolderW(pszpath: Long, dwattrb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsUNCA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsUNCEx(pszpath: Long, ppszserver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsUNCServerA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsUNCServerShareA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsUNCServerShareW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsUNCServerW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsUNCW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsURLA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathIsURLW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMakePrettyA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMakePrettyW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMakeSystemFolderA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMakeSystemFolderW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMakeUniqueName(pszuniquename: Long, cchmax: Int, psztemplate: Long, pszlongplate: Long, pszdir: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMatchSpecA(pszfile: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMatchSpecExA(pszfile: Long, pszspec: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMatchSpecExW(pszfile: Long, pszspec: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathMatchSpecW(pszfile: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathParseIconLocationA(psziconfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathParseIconLocationW(psziconfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathQualify(psz: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathQuoteSpacesA(lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathQuoteSpacesW(lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRelativePathToA(pszpath: Long, pszfrom: Long, dwattrfrom: Int, pszto: Long, dwattrto: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRelativePathToW(pszpath: Long, pszfrom: Long, dwattrfrom: Int, pszto: Long, dwattrto: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveArgsA(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveArgsW(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveBackslashA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveBackslashW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveBlanksA(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveBlanksW(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveExtensionA(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveExtensionW(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveFileSpecA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRemoveFileSpecW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRenameExtensionA(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathRenameExtensionW(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathResolve(pszpath: Long, dirs: Long, fflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathSearchAndQualifyA(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathSearchAndQualifyW(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathSetDlgItemPathA(hdlg: Long, id: Int, pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathSetDlgItemPathW(hdlg: Long, id: Int, pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathSkipRootA(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathSkipRootW(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathStripPathA(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathStripPathW(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathStripToRootA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathStripToRootW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUnExpandEnvStringsA(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUnExpandEnvStringsW(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUndecorateA(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUndecorateW(pszpath: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUnmakeSystemFolderA(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUnmakeSystemFolderW(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUnquoteSpacesA(lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathUnquoteSpacesW(lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPathYetAnotherMakeUniqueName(pszuniquename: Long, pszpath: Long, pszshort: Long, pszfilespec: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPickIconDlg(hwnd: Long, psziconpath: Long, cchiconpath: Int, piiconindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellPropVariantToStrRet(propvar: Long, pstrret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellQISearch(that: Long, pqit: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellReadCabinetState(pcs: Long, clength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRealDriveType(idrive: Int, foktohitnet: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRegisterAppConstrainedChangeNotification(routine: Long, context: Long, registration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRegisterAppStateChangeNotification(routine: Long, context: Long, registration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRegisterScaleChangeEvent(hevent: Long, pdwcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRegisterScaleChangeNotifications(displaydevice: Int, hwndnotify: Long, umsgnotify: Int, pdwcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRemoveWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRestartDialog(hwnd: Long, pszprompt: Long, dwreturn: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRestartDialogEx(hwnd: Long, pszprompt: Long, dwreturn: Int, dwreasoncode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellRevokeScaleChangeNotifications(displaydevice: Int, dwcookie: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAddToRecentDocs(uflags: Int, pv: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAlloc(cb: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAllocShared(pvdata: Long, dwsize: Int, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAnsiToAnsi(pszsrc: Long, pszdst: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAnsiToUnicode(pszsrc: Long, pwszdst: Long, cwchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAppBarMessage(dwmessage: Int, pdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAssocEnumHandlers(pszextra: Long, affilter: Int, ppenumhandler: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAssocEnumHandlersForProtocolByApplication(protocol: Long, riid: Long, enumhandlers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHAutoComplete(hwndedit: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHBrowseForFolderA(lpbi: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHBrowseForFolderW(lpbi: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCLSIDFromString(psz: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShchangeNotificationLock(hchange: Long, dwprocid: Int, pppidl: Long, plevent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShchangeNotificationUnlock(hlock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHChangeNotify(weventid: Int, uflags: Int, dwitem1: Long, dwitem2: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHChangeNotifyDeregister(ulid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHChangeNotifyRegister(hwnd: Long, fsources: Int, fevents: Int, wmsg: Int, centries: Int, pshcne: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(status: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCloneSpecialIDList(hwnd: Long, csidl: Int, fcreate: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCoCreateInstance(pszclsid: Long, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCopyKeyA(hkeysrc: Long, pszsrcsubkey: Long, hkeydest: Long, freserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCopyKeyW(hkeysrc: Long, pszsrcsubkey: Long, hkeydest: Long, freserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateAssociationRegistration(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateDataObject(pidlfolder: Long, cidl: Int, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateDefaultExtractIcon(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateDirectory(hwnd: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateDirectoryExA(hwnd: Long, pszpath: Long, psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateDirectoryExW(hwnd: Long, pszpath: Long, psa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateFileExtractIconW(pszfile: Long, dwfileattributes: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateItemFromParsingName(pszpath: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateItemFromRelativeName(psiparent: Long, pszname: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateItemInKnownFolder(kfid: Long, dwkfflags: Int, pszitem: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateMemStream(pinit: Long, cbinit: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateProcessAsUserW(pscpi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreatePropSheetExtArray(hkey: Long, pszsubkey: Long, maxIface: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellFolderView(pcsfv: Long, ppsv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: Int, ppidl: Long, ppsiitemarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellItemArrayFromIDLists(cidl: Int, rgpidl: Long, ppsiitemarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateShellPalette(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateStdEnumFmtEtc(cfmt: Int, afmt: Long, ppenumformatetc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateStreamOnFileA(pszfile: Long, grfmode: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateStreamOnFileEx(pszfile: Long, grfmode: Int, dwattributes: Int, fcreate: Int, pstmtemplate: Long, ppstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateStreamOnFileW(pszfile: Long, grfmode: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateThread(pfnthreadproc: Long, pdata: Long, flags: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateThreadRef(pcref: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHCreateThreadWithHandle(pfnthreadproc: Long, pdata: Long, flags: Int, pfncallback: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDefExtractIconA(psziconfile: Long, iindex: Int, uflags: Int, phiconlarge: Long, phiconsmall: Long, niconsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDefExtractIconW(psziconfile: Long, iindex: Int, uflags: Int, phiconlarge: Long, phiconsmall: Long, niconsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDeleteEmptyKeyA(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDeleteEmptyKeyW(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDeleteKeyA(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDeleteKeyW(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDeleteValueA(hkey: Long, pszsubkey: Long, pszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDeleteValueW(hkey: Long, pszsubkey: Long, pszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDestroyPropSheetExtArray(hpsxa: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHDoDragDrop(hwnd: Long, pdata: Long, pdsrc: Long, dweffect: Int, pdweffect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEmptyRecycleBinA(hwnd: Long, pszrootpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEmptyRecycleBinW(hwnd: Long, pszrootpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEnumKeyExA(hkey: Long, dwindex: Int, pszname: Long, pcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEnumKeyExW(hkey: Long, dwindex: Int, pszname: Long, pcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEnumValueA(hkey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEnumValueW(hkey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEnumerateUnreadMailAccountsW(hkeyuser: Long, dwindex: Int, pszmailaddress: Long, cchmailaddress: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHEvaluateSystemCommandTemplate(pszcmdtemplate: Long, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFileOperationA(lpfileop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFileOperationW(lpfileop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFindFiles(pidlfolder: Long, pidlsavefile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShfindInitMenuPopup(hmenu: Long, hwndowner: Long, idcmdfirst: Int, idcmdlast: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFlushSFCache()

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFormatDrive(hwnd: Long, drive: Int, fmtid: Int, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFree(pv: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFreeNameMappings(hnamemappings: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHFreeShared(hdata: Long, dwprocessid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetAttributesFromDataObject(pdo: Long, dwattributemask: Int, pdwattributes: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetDataFromIDListA(psf: Long, pidl: Long, nformat: Int, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetDataFromIDListW(psf: Long, pidl: Long, nformat: Int, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetDesktopFolder(ppshf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExA(pszdirectoryname: Long, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExW(pszdirectoryname: Long, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetDriveMedia(pszdrive: Long, pdwmediacontent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetFileInfoA(pszpath: Long, dwfileattributes: Int, psfi: Long, cbfileinfo: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetFileInfoW(pszpath: Long, dwfileattributes: Int, psfi: Long, cbfileinfo: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetFolderLocation(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, ppidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetFolderPathA(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirA(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszsubdir: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirW(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszsubdir: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetFolderPathW(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetIDListFromObject(punk: Long, ppidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetIconOverlayIndexA(psziconpath: Long, iiconindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetIconOverlayIndexW(psziconpath: Long, iiconindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetInstanceExplorer(ppunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetInverseCMAP(pbmap: Long, cbmap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetItemFromDataObject(pdtobj: Long, dwflags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetItemFromObject(punk: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetKnownFolderIDList(rfid: Long, dwflags: Int, htoken: Long, ppidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetKnownFolderItem(rfid: Long, flags: Int, htoken: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetKnownFolderPath(rfid: Long, dwflags: Int, htoken: Long, ppszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetLocalizedName(pszpath: Long, pszresmodule: Long, cch: Int, pidsres: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetMalloc(ppmalloc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetNameFromIDList(pidl: Long, sigdnname: Int, ppszname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetNewLinkInfoA(pszlinkto: Long, pszdir: Long, pszname: Long, pfmustcopy: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetNewLinkInfoW(pszlinkto: Long, pszdir: Long, pszname: Long, pfmustcopy: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetPathFromIDListA(pidl: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetPathFromIDListEx(pidl: Long, pszpath: Long, cchpath: Int, uopts: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetPathFromIDListW(pidl: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetSetFolderCustomSettings(pfcs: Long, pszpath: Long, dwreadwrite: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetSetSettings(lpss: Long, dwmask: Int, bset: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetSettings(psfs: Long, dwmask: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetSpecialFolderLocation(hwnd: Long, csidl: Int, ppidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetSpecialFolderPathA(hwnd: Long, pszpath: Long, csidl: Int, fcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetSpecialFolderPathW(hwnd: Long, pszpath: Long, csidl: Int, fcreate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetStockIconInfo(siid: Int, uflags: Int, psii: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetThreadRef(ppunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetUnreadMailCountW(hkeyuser: Long, pszmailaddress: Long, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: Long, cchshellexecutecommand: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGetViewStatePropertyBag(pidl: Long, pszbagname: Long, dwflags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGlobalCounterDecrement(id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGlobalCounterGetValue(id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHGlobalCounterIncrement(id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHHandleUpdateImage(pidlextra: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHILCreateFromPath(pszpath: Long, ppidl: Long, rgfinout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHInvokePrinterCommandA(hwnd: Long, uaction: Int, lpbuf1: Long, lpbuf2: Long, fmodal: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHInvokePrinterCommandW(hwnd: Long, uaction: Int, lpbuf1: Long, lpbuf2: Long, fmodal: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHIsFileAvailableOffline(pwszpath: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHIsLowMemoryMachine(dwtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHLimitInputEdit(hwndedit: Long, psf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHLoadInProc(rclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHLoadIndirectString(pszsource: Long, pszoutbuf: Long, cchoutbuf: Int, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHLockShared(hdata: Long, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHMessageBoxCheckA(hwnd: Long, psztext: Long, pszcaption: Long, utype: Int, idefault: Int, pszregval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHMessageBoxCheckW(hwnd: Long, psztext: Long, pszcaption: Long, utype: Int, idefault: Int, pszregval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHMultiFileProperties(pdtobj: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHObjectProperties(hwnd: Long, shopobjecttype: Int, pszobjectname: Long, pszpropertypage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHOpenFolderAndSelectItems(pidlfolder: Long, cidl: Int, apidl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHOpenPropSheetW(pszcaption: Long, ahkeys: Long, ckeys: Int, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHOpenRegStream2A(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHOpenRegStream2W(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHOpenRegStreamA(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHOpenRegStreamW(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHOpenWithDialog(hwndparent: Long, poainfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHParseDisplayName(pszname: Long, pbc: Long, ppidl: Long, sfgaoin: Int, psfgaoout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHPathPrepareForWriteA(hwnd: Long, punkenablemodless: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHPathPrepareForWriteW(hwnd: Long, punkenablemodless: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHQueryInfoKeyA(hkey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHQueryInfoKeyW(hkey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHQueryRecycleBinA(pszrootpath: Long, pshqueryrbinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHQueryRecycleBinW(pszrootpath: Long, pshqueryrbinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHQueryUserNotificationState(pquns: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHQueryValueExA(hkey: Long, pszvalue: Long, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHQueryValueExW(hkey: Long, pszvalue: Long, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegCloseUSKey(huskey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegCreateUSKeyA(pszpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegCreateUSKeyW(pwzpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegDeleteUSValueA(huskey: Long, pszvalue: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegDeleteUSValueW(huskey: Long, pwzvalue: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegDuplicateHKey(hkey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegEnumUSKeyA(huskey: Long, dwindex: Int, pszname: Long, pcchname: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegEnumUSKeyW(huskey: Long, dwindex: Int, pwzname: Long, pcchname: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegEnumUSValueA(huskey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegEnumUSValueW(huskey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetBoolUSValueA(pszsubkey: Long, pszvalue: Long, fignorehkcu: Int, fdefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetBoolUSValueW(pszsubkey: Long, pszvalue: Long, fignorehkcu: Int, fdefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetIntW(hk: Long, pwzkey: Long, idefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetPathA(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetPathW(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetUSValueA(pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetUSValueW(pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetValueFromHKCUHKLM(pwszkey: Long, pwszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegGetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegOpenUSKeyA(pszpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegOpenUSKeyW(pwzpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegQueryUSValueA(huskey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegQueryUSValueW(huskey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegSetPathA(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pcszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegSetPathW(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pcszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegSetUSValueA(pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegSetUSValueW(pwzsubkey: Long, pwzvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegWriteUSValueA(huskey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRegWriteUSValueW(huskey: Long, pwzvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHReleaseThreadRef(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRemoveLocalizedName(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHResolveLibrary(psilibrary: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHRestricted(rest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSendMessageBroadcastA(umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSendMessageBroadcastW(umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetDefaultProperties(hwnd: Long, psi: Long, dwfileopflags: Int, pfops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetFolderPathA(csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetFolderPathW(csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetInstanceExplorer(punk: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetKnownFolderPath(rfid: Long, dwflags: Int, htoken: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetLocalizedName(pszpath: Long, pszresmodule: Long, idsres: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetThreadRef(punk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetUnreadMailCountW(pszmailaddress: Long, dwcount: Int, pszshellexecutecommand: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShshellFolderViewMessage(hwndmain: Long, umsg: Int, lparam: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHShowManageLibraryUI(psilibrary: Long, hwndowner: Long, psztitle: Long, pszinstruction: Long, lmdoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSimpleIDListFromPath(pszpath: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHSkipJunction(pbc: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHStartNetConnectionDialogW(hwnd: Long, pszremotename: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHStrDupA(psz: Long, ppwsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHStrDupW(psz: Long, ppwsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHStripMneumonicA(pszmenu: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHStripMneumonicW(pszmenu: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHTestTokenMembership(htoken: Long, ulrid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHUnicodeToAnsi(pwszsrc: Long, pszdst: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHUnicodeToUnicode(pwzsrc: Long, pwzdst: Long, cwchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHUnlockShared(pvdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHUpdateImageA(pszhashitem: Long, iindex: Int, uflags: Int, iimageindex: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHUpdateImageW(pszhashitem: Long, iindex: Int, uflags: Int, iimageindex: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSHValidateUNC(hwndowner: Long, pszfile: Long, fconnect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSetCurrentProcessExplicitAppUserModelID(appid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSetMenuContextHelpId(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSetWindowContextHelpId(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSetWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long, dwrefdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellAboutA(hwnd: Long, szapp: Long, szotherstuff: Long, hicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellAboutW(hwnd: Long, szapp: Long, szotherstuff: Long, hicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellExecuteA(hwnd: Long, lpoperation: Long, lpfile: Long, lpparameters: Long, lpdirectory: Long, nshowcmd: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellExecuteExA(pexecinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellExecuteExW(pexecinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellExecuteW(hwnd: Long, lpoperation: Long, lpfile: Long, lpparameters: Long, lpdirectory: Long, nshowcmd: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellMessageBoxA(happinst: Long, hwnd: Long, lpctext: Long, lpctitle: Long, fustyle: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellMessageBoxW(happinst: Long, hwnd: Long, lpctext: Long, lpctitle: Long, fustyle: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellGetCachedImageIndex(pwsziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellGetCachedImageIndexA(psziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellGetCachedImageIndexW(psziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellGetImageLists(phiml: Long, phimlsmall: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellMergeMenus(hmdst: Long, hmsrc: Long, uinsert: Int, uidadjust: Int, uidadjustmax: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellNotifyIconA(dwmessage: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellNotifyIconGetRect(identifier: Long, iconlocation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellShellNotifyIconW(dwmessage: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSignalFileOpen(pidl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellSoftwareUpdateMessageBox(hwnd: Long, pszdistunit: Long, dwflags: Int, psdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStgMakeUniqueName(pstgparent: Long, pszfilespec: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCSpnA(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCSpnIA(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCSpnIW(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCSpnW(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCatBuffA(pszdest: Long, pszsrc: Long, cchdestbuffsize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCatBuffW(pszdest: Long, pszsrc: Long, cchdestbuffsize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCatChainW(pszdst: Long, cchdst: Int, ichat: Int, pszsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCatW(psz1: Long, psz2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrChrA(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrChrIA(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrChrIW(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrChrNIW(pszstart: Long, wmatch: Short, cchmax: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrChrNW(pszstart: Long, wmatch: Short, cchmax: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrChrW(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpCA(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpCW(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpICA(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpICW(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpIW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpLogicalW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNA(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNCA(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNCW(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNIA(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNICA(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNICW(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNIW(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpNW(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCmpW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCpyNW(pszdst: Long, pszsrc: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrCpyW(psz1: Long, psz2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrDupA(pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrDupW(pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFormatByteSize64A(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFormatByteSizeA(dw: Int, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFormatByteSizeEx(ull: Long, flags: Int, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFormatByteSizeW(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFormatKBSizeA(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFormatKBSizeW(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFromTimeIntervalA(pszout: Long, cchmax: Int, dwtimems: Int, digits: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrFromTimeIntervalW(pszout: Long, cchmax: Int, dwtimems: Int, digits: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrIsIntlEqualA(fcasesens: Int, pszstring1: Long, pszstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrIsIntlEqualW(fcasesens: Int, pszstring1: Long, pszstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrNCatA(psz1: Long, psz2: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrNCatW(psz1: Long, psz2: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrPBrkA(psz: Long, pszset: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrPBrkW(psz: Long, pszset: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRChrA(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRChrIA(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRChrIW(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRChrW(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRStrIA(pszsource: Long, pszlast: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRStrIW(pszsource: Long, pszlast: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRetToBufA(pstr: Long, pidl: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRetToBufW(pstr: Long, pidl: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrSpnA(psz: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrSpnW(psz: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrStrA(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrStrIA(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrStrIW(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrStrNIW(pszfirst: Long, pszsrch: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrStrNW(pszfirst: Long, pszsrch: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrStrW(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrToInt64ExA(pszstring: Long, dwflags: Int, pllret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrToInt64ExW(pszstring: Long, dwflags: Int, pllret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrToIntA(pszsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrToIntExA(pszstring: Long, dwflags: Int, piret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrToIntExW(pszstring: Long, dwflags: Int, piret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrToIntW(pszsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrTrimA(psz: Long, psztrimchars: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellStrTrimW(psz: Long, psztrimchars: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUnloadUserProfile(htoken: Long, hprofile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(registration: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(registration: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUnregisterScaleChangeEvent(dwcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlApplySchemeA(pszin: Long, pszout: Long, pcchout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlApplySchemeW(pszin: Long, pszout: Long, pcchout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCanonicalizeA(pszurl: Long, pszcanonicalized: Long, pcchcanonicalized: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCanonicalizeW(pszurl: Long, pszcanonicalized: Long, pcchcanonicalized: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCombineA(pszbase: Long, pszrelative: Long, pszcombined: Long, pcchcombined: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCombineW(pszbase: Long, pszrelative: Long, pszcombined: Long, pcchcombined: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCompareA(psz1: Long, psz2: Long, fignoreslash: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCompareW(psz1: Long, psz2: Long, fignoreslash: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCreateFromPathA(pszpath: Long, pszurl: Long, pcchurl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlCreateFromPathW(pszpath: Long, pszurl: Long, pcchurl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlEscapeA(pszurl: Long, pszescaped: Long, pcchescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlEscapeW(pszurl: Long, pszescaped: Long, pcchescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlFixupW(pcszurl: Long, psztranslatedurl: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlGetLocationA(pszurl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlGetLocationW(pszurl: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlGetPartA(pszin: Long, pszout: Long, pcchout: Long, dwpart: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlGetPartW(pszin: Long, pszout: Long, pcchout: Long, dwpart: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlHashA(pszurl: Long, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlHashW(pszurl: Long, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlIsA(pszurl: Long, urlis: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlIsNoHistoryA(pszurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlIsNoHistoryW(pszurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlIsOpaqueA(pszurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlIsOpaqueW(pszurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlIsW(pszurl: Long, urlis: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlUnescapeA(pszurl: Long, pszunescaped: Long, pcchunescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellUrlUnescapeW(pszurl: Long, pszunescaped: Long, pcchunescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellVariantToStrRet(varin: Long, pstrret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWhichPlatform(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWin32DeleteFile(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWinHelpA(hwndmain: Long, lpszhelp: Long, ucommand: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWinHelpW(hwndmain: Long, lpszhelp: Long, ucommand: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWriteCabinetState(pcs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWnsprintfA(pszdest: Long, cchdest: Int, pszfmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWnsprintfW(pszdest: Long, cchdest: Int, pszfmt: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWvnsprintfA(pszdest: Long, cchdest: Int, pszfmt: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiShellWvnsprintfW(pszdest: Long, cchdest: Int, pszfmt: Long, arglist: Long): Int
}

public actual fun assocCreate(clsid: Guid, riid: ConstPtr, ppv: MutPtr): Hresult =
    0

public actual fun assocCreateForClasses(rgclasses: ConstPtr, cclasses: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocCreateForClasses(rgclasses.rawAddress, cclasses.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun assocGetDetailsOfPropKey(psf: MutPtr, pidl: ConstPtr, pkey: ConstPtr, pv: MutPtr, pffoundpropkey: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocGetDetailsOfPropKey(psf.rawAddress, pidl.rawAddress, pkey.rawAddress, pv.rawAddress, pffoundpropkey.rawAddress)

public actual fun assocGetPerceivedType(pszext: Pcwstr, ptype: MutPtr, pflag: MutPtr, ppsztype: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocGetPerceivedType(pszext.rawAddress, ptype.rawAddress, pflag.rawAddress, ppsztype.rawAddress)

public actual fun assocIsDangerous(pszassoc: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocIsDangerous(pszassoc.rawAddress)

public actual fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocQueryKeyA(flags.toInt(), key, pszassoc.rawAddress, pszextra.rawAddress, phkeyout.rawAddress)

public actual fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocQueryKeyW(flags.toInt(), key, pszassoc.rawAddress, pszextra.rawAddress, phkeyout.rawAddress)

public actual fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocQueryStringA(flags.toInt(), str, pszassoc.rawAddress, pszextra.rawAddress, pszout.rawAddress, pcchout.rawAddress)

public actual fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocQueryStringByKeyA(flags.toInt(), str, hkassoc.rawAddress, pszextra.rawAddress, pszout.rawAddress, pcchout.rawAddress)

public actual fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocQueryStringByKeyW(flags.toInt(), str, hkassoc.rawAddress, pszextra.rawAddress, pszout.rawAddress, pcchout.rawAddress)

public actual fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellAssocQueryStringW(flags.toInt(), str, pszassoc.rawAddress, pszextra.rawAddress, pszout.rawAddress, pcchout.rawAddress)

public actual fun cdefFolderMenuCreate2(pidlfolder: ConstPtr, hwnd: Hwnd, cidl: UInt, apidl: ConstPtr, psf: MutPtr, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: ConstPtr, ppcm: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellCdefFolderMenuCreate2(pidlfolder.rawAddress, hwnd.rawAddress, cidl.toInt(), apidl.rawAddress, psf.rawAddress, 0L, nkeys.toInt(), ahkeys.rawAddress, ppcm.rawAddress)

public actual fun cidldataCreateFromIdarray(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, ppdtobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellCidldataCreateFromIdarray(pidlfolder.rawAddress, cidl.toInt(), apidl.rawAddress, ppdtobj.rawAddress)

public actual fun chrCmpIA(w1: UShort, w2: UShort): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellChrCmpIA(w1.toShort(), w2.toShort())

public actual fun chrCmpIW(w1: UShort, w2: UShort): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellChrCmpIW(w1.toShort(), w2.toShort())

public actual fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellColorAdjustLuma(clrrgb.toInt(), n, fscale).toUInt()

public actual fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellColorHLSToRGB(whue.toShort(), wluminance.toShort(), wsaturation.toShort()).toUInt()

public actual fun colorRGBToHLS(clrrgb: Colorref, pwhue: MutPtr, pwluminance: MutPtr, pwsaturation: MutPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellColorRGBToHLS(clrrgb.toInt(), pwhue.rawAddress, pwluminance.rawAddress, pwsaturation.rawAddress)
}

public actual fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: MutPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellCommandLineToArgvW(lpcmdline.rawAddress, pnumargs.rawAddress))

public actual fun connectToConnectionPoint(punk: MutPtr, riidevent: ConstPtr, fconnect: Bool, punktarget: MutPtr, pdwcookie: MutPtr, ppcpout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellConnectToConnectionPoint(punk.rawAddress, riidevent.rawAddress, fconnect, punktarget.rawAddress, pdwcookie.rawAddress, ppcpout.rawAddress)

public actual fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellCreateProfile(pszusersid.rawAddress, pszusername.rawAddress, pszprofilepath.rawAddress, cchprofilepath.toInt())

public actual fun dadAutoScroll(hwnd: Hwnd, pad: MutPtr, pptnow: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDadAutoScroll(hwnd.rawAddress, pad.rawAddress, pptnow.rawAddress)

public actual fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool =
    0

public actual fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: MutPtr): Bool =
    0

public actual fun dadDragLeave(): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDadDragLeave()

public actual fun dadDragMove(pt: Point): Bool =
    0

public actual fun dadSetDragImage(him: Himagelist, pptoffset: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDadSetDragImage(him, pptoffset.rawAddress)

public actual fun dadShowDragImage(fshow: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDadShowDragImage(fshow)

public actual fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDefSubclassProc(hwnd.rawAddress, umsg.toInt(), wparam.toLong(), lparam)

public actual fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDeleteProfileA(lpsidstring.rawAddress, lpprofilepath.rawAddress, lpcomputername.rawAddress)

public actual fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDeleteProfileW(lpsidstring.rawAddress, lpprofilepath.rawAddress, lpcomputername.rawAddress)

public actual fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDoEnvironmentSubstA(pszsrc.rawAddress, cchsrc.toInt()).toUInt()

public actual fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDoEnvironmentSubstW(pszsrc.rawAddress, cchsrc.toInt()).toUInt()

public actual fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDragAcceptFiles(hwnd.rawAddress, faccept)
}

public actual fun dragFinish(hdrop: Hdrop) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDragFinish(hdrop.rawAddress)
}

public actual fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDragQueryFileA(hdrop.rawAddress, ifile.toInt(), lpszfile.rawAddress, cch.toInt()).toUInt()

public actual fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDragQueryFileW(hdrop.rawAddress, ifile.toInt(), lpszfile.rawAddress, cch.toInt()).toUInt()

public actual fun dragQueryPoint(hdrop: Hdrop, ppt: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDragQueryPoint(hdrop.rawAddress, ppt.rawAddress)

public actual fun driveType(idrive: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDriveType(idrive)

public actual fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellDuplicateIcon(hinst.rawAddress, hicon.rawAddress))

public actual fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: MutPtr): Hicon =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractAssociatedIconA(hinst.rawAddress, psziconpath.rawAddress, piicon.rawAddress))

public actual fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: MutPtr, piiconid: MutPtr): Hicon =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractAssociatedIconExA(hinst.rawAddress, psziconpath.rawAddress, piiconindex.rawAddress, piiconid.rawAddress))

public actual fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: MutPtr, piiconid: MutPtr): Hicon =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractAssociatedIconExW(hinst.rawAddress, psziconpath.rawAddress, piiconindex.rawAddress, piiconid.rawAddress))

public actual fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: MutPtr): Hicon =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractAssociatedIconW(hinst.rawAddress, psziconpath.rawAddress, piicon.rawAddress))

public actual fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractIconA(hinst.rawAddress, pszexefilename.rawAddress, niconindex.toInt()))

public actual fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: MutPtr, phiconsmall: MutPtr, nicons: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractIconExA(lpszfile.rawAddress, niconindex, phiconlarge.rawAddress, phiconsmall.rawAddress, nicons.toInt()).toUInt()

public actual fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: MutPtr, phiconsmall: MutPtr, nicons: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractIconExW(lpszfile.rawAddress, niconindex, phiconlarge.rawAddress, phiconsmall.rawAddress, nicons.toInt()).toUInt()

public actual fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellExtractIconW(hinst.rawAddress, pszexefilename.rawAddress, niconindex.toInt()))

public actual fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellFindExecutableA(lpfile.rawAddress, lpdirectory.rawAddress, lpresult.rawAddress))

public actual fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellFindExecutableW(lpfile.rawAddress, lpdirectory.rawAddress, lpresult.rawAddress))

public actual fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetAcceptLanguagesA(pszlanguages.rawAddress, pcchlanguages.rawAddress)

public actual fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetAcceptLanguagesW(pszlanguages.rawAddress, pcchlanguages.rawAddress)

public actual fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryA(lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryW(lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getCurrentProcessExplicitAppUserModelID(appid: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetCurrentProcessExplicitAppUserModelID(appid.rawAddress)

public actual fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryA(lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryW(lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetDpiForShellUIComponent(param0).toUInt()

public actual fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetFileNameFromBrowse(hwnd.rawAddress, pszfilepath.rawAddress, cchfilepath.toInt(), pszworkingdir.rawAddress, pszdefext.rawAddress, pszfilters.rawAddress, psztitle.rawAddress)

public actual fun getMenuContextHelpId(param0: Hmenu): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetMenuContextHelpId(param0.rawAddress).toUInt()

public actual fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetMenuPosFromID(hmenu.rawAddress, id.toInt())

public actual fun getProfileType(dwflags: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetProfileType(dwflags.rawAddress)

public actual fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetProfilesDirectoryA(lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetProfilesDirectoryW(lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetScaleFactorForDevice(devicetype)

public actual fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetScaleFactorForMonitor(hmon.rawAddress, pscale.rawAddress)

public actual fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetUserProfileDirectoryA(htoken.rawAddress, lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetUserProfileDirectoryW(htoken.rawAddress, lpprofiledir.rawAddress, lpcchsize.rawAddress)

public actual fun getWindowContextHelpId(param0: Hwnd): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetWindowContextHelpId(param0.rawAddress).toUInt()

public actual fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellGetWindowSubclass(hwnd.rawAddress, 0L, uidsubclass.toLong(), pdwrefdata.rawAddress)

public actual fun hmonitorUserFree(param0: ConstPtr, param1: ConstPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun hmonitorUserFree64(param0: ConstPtr, param1: ConstPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun hmonitorUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hmonitorUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hmonitorUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hmonitorUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun hmonitorUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hmonitorUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHmonitorUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun hashData(pbdata: ConstPtr, cbdata: UInt, pbhash: MutPtr, cbhash: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHashData(pbdata.rawAddress, cbdata.toInt(), pbhash.rawAddress, cbhash.toInt())

public actual fun hlinkClone(pihl: MutPtr, riid: ConstPtr, pihlsiteforclone: MutPtr, dwsitedata: UInt, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkClone(pihl.rawAddress, riid.rawAddress, pihlsiteforclone.rawAddress, dwsitedata.toInt(), ppvobj.rawAddress)

public actual fun hlinkCreateBrowseContext(piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateBrowseContext(piunkouter.rawAddress, riid.rawAddress, ppvobj.rawAddress)

public actual fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateExtensionServices(pwzadditionalheaders.rawAddress, phwnd.rawAddress, pszusername.rawAddress, pszpassword.rawAddress, piunkouter.rawAddress, riid.rawAddress, ppvobj.rawAddress)

public actual fun hlinkCreateFromData(pidataobj: MutPtr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateFromData(pidataobj.rawAddress, pihlsite.rawAddress, dwsitedata.toInt(), piunkouter.rawAddress, riid.rawAddress, ppvobj.rawAddress)

public actual fun hlinkCreateFromMoniker(pimktrgt: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateFromMoniker(pimktrgt.rawAddress, pwzlocation.rawAddress, pwzfriendlyname.rawAddress, pihlsite.rawAddress, dwsitedata.toInt(), piunkouter.rawAddress, riid.rawAddress, ppvobj.rawAddress)

public actual fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateFromString(pwztarget.rawAddress, pwzlocation.rawAddress, pwzfriendlyname.rawAddress, pihlsite.rawAddress, dwsitedata.toInt(), piunkouter.rawAddress, riid.rawAddress, ppvobj.rawAddress)

public actual fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: MutPtr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateShortcut(grfhlshortcutf.toInt(), pihl.rawAddress, pwzdir.rawAddress, pwzfilename.rawAddress, ppwzshortcutfile.rawAddress, dwreserved.toInt())

public actual fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: MutPtr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateShortcutFromMoniker(grfhlshortcutf.toInt(), pimktarget.rawAddress, pwzlocation.rawAddress, pwzdir.rawAddress, pwzfilename.rawAddress, ppwzshortcutfile.rawAddress, dwreserved.toInt())

public actual fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkCreateShortcutFromString(grfhlshortcutf.toInt(), pwztarget.rawAddress, pwzlocation.rawAddress, pwzdir.rawAddress, pwzfilename.rawAddress, ppwzshortcutfile.rawAddress, dwreserved.toInt())

public actual fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkGetSpecialReference(ureference.toInt(), ppwzreference.rawAddress)

public actual fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkGetValueFromParams(pwzparams.rawAddress, pwzname.rawAddress, ppwzvalue.rawAddress)

public actual fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkIsShortcut(pwzfilename.rawAddress)

public actual fun hlinkNavigate(pihl: MutPtr, pihlframe: MutPtr, grfhlnf: UInt, pbc: MutPtr, pibsc: MutPtr, pihlbc: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkNavigate(pihl.rawAddress, pihlframe.rawAddress, grfhlnf.toInt(), pbc.rawAddress, pibsc.rawAddress, pihlbc.rawAddress)

public actual fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, pihlframe: MutPtr, grfhlnf: UInt, pibc: MutPtr, pibsc: MutPtr, pihlbc: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkNavigateToStringReference(pwztarget.rawAddress, pwzlocation.rawAddress, pihlsite.rawAddress, dwsitedata.toInt(), pihlframe.rawAddress, grfhlnf.toInt(), pibc.rawAddress, pibsc.rawAddress, pihlbc.rawAddress)

public actual fun hlinkOnNavigate(pihlframe: MutPtr, pihlbc: MutPtr, grfhlnf: UInt, pimktarget: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkOnNavigate(pihlframe.rawAddress, pihlbc.rawAddress, grfhlnf.toInt(), pimktarget.rawAddress, pwzlocation.rawAddress, pwzfriendlyname.rawAddress, puhlid.rawAddress)

public actual fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: MutPtr, pimkold: MutPtr, pimknew: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkOnRenameDocument(dwreserved.toInt(), pihlbc.rawAddress, pimkold.rawAddress, pimknew.rawAddress)

public actual fun hlinkParseDisplayName(pibc: MutPtr, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: MutPtr, ppimk: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkParseDisplayName(pibc.rawAddress, pwzdisplayname.rawAddress, fnoforceabs, pccheaten.rawAddress, ppimk.rawAddress)

public actual fun hlinkPreprocessMoniker(pibc: MutPtr, pimkin: MutPtr, ppimkout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkPreprocessMoniker(pibc.rawAddress, pimkin.rawAddress, ppimkout.rawAddress)

public actual fun hlinkQueryCreateFromData(pidataobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkQueryCreateFromData(pidataobj.rawAddress)

public actual fun hlinkResolveMonikerForData(pimkreference: MutPtr, reserved: UInt, pibc: MutPtr, cfmtetc: UInt, rgfmtetc: MutPtr, pibsc: MutPtr, pimkbase: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkResolveMonikerForData(pimkreference.rawAddress, reserved.toInt(), pibc.rawAddress, cfmtetc.toInt(), rgfmtetc.rawAddress, pibsc.rawAddress, pimkbase.rawAddress)

public actual fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: MutPtr, dwsitedata: UInt, piunkouter: MutPtr, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkResolveShortcut(pwzshortcutfilename.rawAddress, pihlsite.rawAddress, dwsitedata.toInt(), piunkouter.rawAddress, riid.rawAddress, ppvobj.rawAddress)

public actual fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: MutPtr, ppwzlocation: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkResolveShortcutToMoniker(pwzshortcutfilename.rawAddress, ppimktarget.rawAddress, ppwzlocation.rawAddress)

public actual fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: MutPtr, ppwzlocation: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkResolveShortcutToString(pwzshortcutfilename.rawAddress, ppwztarget.rawAddress, ppwzlocation.rawAddress)

public actual fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: MutPtr, cfmtetc: UInt, rgfmtetc: MutPtr, pibsc: MutPtr, pimkbase: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkResolveStringForData(pwzreference.rawAddress, reserved.toInt(), pibc.rawAddress, cfmtetc.toInt(), rgfmtetc.rawAddress, pibsc.rawAddress, pimkbase.rawAddress)

public actual fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkSetSpecialReference(ureference.toInt(), pwzreference.rawAddress)

public actual fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkTranslateURL(pwzurl.rawAddress, grfflags.toInt(), ppwztranslatedurl.rawAddress)

public actual fun hlinkUpdateStackItem(pihlframe: MutPtr, pihlbc: MutPtr, uhlid: UInt, pimktrgt: MutPtr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellHlinkUpdateStackItem(pihlframe.rawAddress, pihlbc.rawAddress, uhlid.toInt(), pimktrgt.rawAddress, pwzlocation.rawAddress, pwzfriendlyname.rawAddress)

public actual fun iLAppendID(pidl: ConstPtr, pmkid: ConstPtr, fappend: Bool): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILAppendID(pidl.rawAddress, pmkid.rawAddress, fappend))

public actual fun iLClone(pidl: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILClone(pidl.rawAddress))

public actual fun iLCloneFirst(pidl: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILCloneFirst(pidl.rawAddress))

public actual fun iLCombine(pidl1: ConstPtr, pidl2: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILCombine(pidl1.rawAddress, pidl2.rawAddress))

public actual fun iLCreateFromPathA(pszpath: Pcstr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILCreateFromPathA(pszpath.rawAddress))

public actual fun iLCreateFromPathW(pszpath: Pcwstr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILCreateFromPathW(pszpath.rawAddress))

public actual fun iLFindChild(pidlparent: ConstPtr, pidlchild: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILFindChild(pidlparent.rawAddress, pidlchild.rawAddress))

public actual fun iLFindLastID(pidl: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILFindLastID(pidl.rawAddress))

public actual fun iLFree(pidl: ConstPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILFree(pidl.rawAddress)
}

public actual fun iLGetNext(pidl: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILGetNext(pidl.rawAddress))

public actual fun iLGetSize(pidl: ConstPtr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILGetSize(pidl.rawAddress).toUInt()

public actual fun iLIsEqual(pidl1: ConstPtr, pidl2: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILIsEqual(pidl1.rawAddress, pidl2.rawAddress)

public actual fun iLIsParent(pidl1: ConstPtr, pidl2: ConstPtr, fimmediate: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILIsParent(pidl1.rawAddress, pidl2.rawAddress, fimmediate)

public actual fun iLLoadFromStreamEx(pstm: MutPtr, pidl: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILLoadFromStreamEx(pstm.rawAddress, pidl.rawAddress)

public actual fun iLRemoveLastID(pidl: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILRemoveLastID(pidl.rawAddress)

public actual fun iLSaveToStream(pstm: MutPtr, pidl: ConstPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellILSaveToStream(pstm.rawAddress, pidl.rawAddress)

public actual fun istreamCopy(pstmfrom: MutPtr, pstmto: MutPtr, cb: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamCopy(pstmfrom.rawAddress, pstmto.rawAddress, cb.toInt())

public actual fun istreamRead(pstm: MutPtr, pv: MutPtr, cb: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamRead(pstm.rawAddress, pv.rawAddress, cb.toInt())

public actual fun istreamReadPidl(pstm: MutPtr, ppidlout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamReadPidl(pstm.rawAddress, ppidlout.rawAddress)

public actual fun istreamReadStr(pstm: MutPtr, ppsz: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamReadStr(pstm.rawAddress, ppsz.rawAddress)

public actual fun istreamReset(pstm: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamReset(pstm.rawAddress)

public actual fun istreamSize(pstm: MutPtr, pui: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamSize(pstm.rawAddress, pui.rawAddress)

public actual fun istreamWrite(pstm: MutPtr, pv: ConstPtr, cb: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamWrite(pstm.rawAddress, pv.rawAddress, cb.toInt())

public actual fun istreamWritePidl(pstm: MutPtr, pidlwrite: ConstPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamWritePidl(pstm.rawAddress, pidlwrite.rawAddress)

public actual fun istreamWriteStr(pstm: MutPtr, psz: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIstreamWriteStr(pstm.rawAddress, psz.rawAddress)

public actual fun iunknownAtomicRelease(ppunk: MutPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIunknownAtomicRelease(ppunk.rawAddress)
}

public actual fun iunknownGetSite(punk: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIunknownGetSite(punk.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun iunknownGetWindow(punk: MutPtr, phwnd: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIunknownGetWindow(punk.rawAddress, phwnd.rawAddress)

public actual fun iunknownQueryService(punk: MutPtr, guidservice: ConstPtr, riid: ConstPtr, ppvout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIunknownQueryService(punk.rawAddress, guidservice.rawAddress, riid.rawAddress, ppvout.rawAddress)

public actual fun iunknownSet(ppunk: MutPtr, punk: MutPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIunknownSet(ppunk.rawAddress, punk.rawAddress)
}

public actual fun iunknownSetSite(punk: MutPtr, punksite: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIunknownSetSite(punk.rawAddress, punksite.rawAddress)

public actual fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: MutPtr, pfparsepersiterules: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellImportPrivacySettings(pszfilename.rawAddress, pfparseprivacypreferences.rawAddress, pfparsepersiterules.rawAddress)

public actual fun initNetworkAddressControl(): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellInitNetworkAddressControl()

public actual fun initPropVariantFromStrRet(pstrret: MutPtr, pidl: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellInitPropVariantFromStrRet(pstrret.rawAddress, pidl.rawAddress, ppropvar.rawAddress)

public actual fun initVariantFromStrRet(pstrret: ConstPtr, pidl: ConstPtr, pvar: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellInitVariantFromStrRet(pstrret.rawAddress, pidl.rawAddress, pvar.rawAddress)

public actual fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIntlStrEqWorkerA(fcasesens, lpstring1.rawAddress, lpstring2.rawAddress, nchar)

public actual fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIntlStrEqWorkerW(fcasesens, lpstring1.rawAddress, lpstring2.rawAddress, nchar)

public actual fun isCharSpaceA(wch: Byte): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsCharSpaceA(wch)

public actual fun isCharSpaceW(wch: UShort): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsCharSpaceW(wch.toShort())

public actual fun isInternetESCEnabled(): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsInternetESCEnabled()

public actual fun isLFNDriveA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsLFNDriveA(pszpath.rawAddress)

public actual fun isLFNDriveW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsLFNDriveW(pszpath.rawAddress)

public actual fun isNetDrive(idrive: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsNetDrive(idrive)

public actual fun isOS(dwos: OS): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsOS(dwos.toInt())

public actual fun isUserAnAdmin(): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellIsUserAnAdmin()

public actual fun loadUserProfileA(htoken: Handle, lpprofileinfo: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellLoadUserProfileA(htoken.rawAddress, lpprofileinfo.rawAddress)

public actual fun loadUserProfileW(htoken: Handle, lpprofileinfo: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellLoadUserProfileW(htoken.rawAddress, lpprofileinfo.rawAddress)

public actual fun oleSaveToStreamEx(piunk: MutPtr, pistm: MutPtr, fcleardirty: Bool): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellOleSaveToStreamEx(piunk.rawAddress, pistm.rawAddress, fcleardirty)

public actual fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellOpenRegStream(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, grfmode.toInt()))

public actual fun parseURLA(pcszurl: Pcstr, ppu: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellParseURLA(pcszurl.rawAddress, ppu.rawAddress)

public actual fun parseURLW(pcszurl: Pcwstr, ppu: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellParseURLW(pcszurl.rawAddress, ppu.rawAddress)

public actual fun pathAddBackslashA(pszpath: Pstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAddBackslashA(pszpath.rawAddress))

public actual fun pathAddBackslashW(pszpath: Pwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAddBackslashW(pszpath.rawAddress))

public actual fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAddExtensionA(pszpath.rawAddress, pszext.rawAddress)

public actual fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAddExtensionW(pszpath.rawAddress, pszext.rawAddress)

public actual fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAllocCanonicalize(pszpathin.rawAddress, dwflags.toInt(), ppszpathout.rawAddress)

public actual fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAllocCombine(pszpathin.rawAddress, pszmore.rawAddress, dwflags.toInt(), ppszpathout.rawAddress)

public actual fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAppendA(pszpath.rawAddress, pszmore.rawAddress)

public actual fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathAppendW(pszpath.rawAddress, pszmore.rawAddress)

public actual fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathBuildRootA(pszroot.rawAddress, idrive))

public actual fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathBuildRootW(pszroot.rawAddress, idrive))

public actual fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCanonicalizeA(pszbuf.rawAddress, pszpath.rawAddress)

public actual fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCanonicalizeW(pszbuf.rawAddress, pszpath.rawAddress)

public actual fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchAddBackslash(pszpath.rawAddress, cchpath.toLong())

public actual fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr, pcchremaining: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchAddBackslashEx(pszpath.rawAddress, cchpath.toLong(), ppszend.rawAddress, pcchremaining.rawAddress)

public actual fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchAddExtension(pszpath.rawAddress, cchpath.toLong(), pszext.rawAddress)

public actual fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchAppend(pszpath.rawAddress, cchpath.toLong(), pszmore.rawAddress)

public actual fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchAppendEx(pszpath.rawAddress, cchpath.toLong(), pszmore.rawAddress, dwflags.toInt())

public actual fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchCanonicalize(pszpathout.rawAddress, cchpathout.toLong(), pszpathin.rawAddress)

public actual fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchCanonicalizeEx(pszpathout.rawAddress, cchpathout.toLong(), pszpathin.rawAddress, dwflags.toInt())

public actual fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchCombine(pszpathout.rawAddress, cchpathout.toLong(), pszpathin.rawAddress, pszmore.rawAddress)

public actual fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchCombineEx(pszpathout.rawAddress, cchpathout.toLong(), pszpathin.rawAddress, pszmore.rawAddress, dwflags.toInt())

public actual fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchFindExtension(pszpath.rawAddress, cchpath.toLong(), ppszext.rawAddress)

public actual fun pathCchIsRoot(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchIsRoot(pszpath.rawAddress)

public actual fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchRemoveBackslash(pszpath.rawAddress, cchpath.toLong())

public actual fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr, pcchremaining: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchRemoveBackslashEx(pszpath.rawAddress, cchpath.toLong(), ppszend.rawAddress, pcchremaining.rawAddress)

public actual fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchRemoveExtension(pszpath.rawAddress, cchpath.toLong())

public actual fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchRemoveFileSpec(pszpath.rawAddress, cchpath.toLong())

public actual fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchRenameExtension(pszpath.rawAddress, cchpath.toLong(), pszext.rawAddress)

public actual fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchSkipRoot(pszpath.rawAddress, ppszrootend.rawAddress)

public actual fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchStripPrefix(pszpath.rawAddress, cchpath.toLong())

public actual fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCchStripToRoot(pszpath.rawAddress, cchpath.toLong())

public actual fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCleanupSpec(pszdir.rawAddress, pszspec.rawAddress)

public actual fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCombineA(pszdest.rawAddress, pszdir.rawAddress, pszfile.rawAddress))

public actual fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCombineW(pszdest.rawAddress, pszdir.rawAddress, pszfile.rawAddress))

public actual fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCommonPrefixA(pszfile1.rawAddress, pszfile2.rawAddress, achpath.rawAddress)

public actual fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCommonPrefixW(pszfile1.rawAddress, pszfile2.rawAddress, achpath.rawAddress)

public actual fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCompactPathA(hdc.rawAddress, pszpath.rawAddress, dx.toInt())

public actual fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCompactPathExA(pszout.rawAddress, pszsrc.rawAddress, cchmax.toInt(), dwflags.toInt())

public actual fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCompactPathExW(pszout.rawAddress, pszsrc.rawAddress, cchmax.toInt(), dwflags.toInt())

public actual fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCompactPathW(hdc.rawAddress, pszpath.rawAddress, dx.toInt())

public actual fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCreateFromUrlA(pszurl.rawAddress, pszpath.rawAddress, pcchpath.rawAddress, dwflags.toInt())

public actual fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCreateFromUrlAlloc(pszin.rawAddress, ppszout.rawAddress, dwflags.toInt())

public actual fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathCreateFromUrlW(pszurl.rawAddress, pszpath.rawAddress, pcchpath.rawAddress, dwflags.toInt())

public actual fun pathFileExistsA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFileExistsA(pszpath.rawAddress)

public actual fun pathFileExistsW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFileExistsW(pszpath.rawAddress)

public actual fun pathFindExtensionA(pszpath: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindExtensionA(pszpath.rawAddress))

public actual fun pathFindExtensionW(pszpath: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindExtensionW(pszpath.rawAddress))

public actual fun pathFindFileNameA(pszpath: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindFileNameA(pszpath.rawAddress))

public actual fun pathFindFileNameW(pszpath: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindFileNameW(pszpath.rawAddress))

public actual fun pathFindNextComponentA(pszpath: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindNextComponentA(pszpath.rawAddress))

public actual fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindNextComponentW(pszpath.rawAddress))

public actual fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindOnPathA(pszpath.rawAddress, ppszotherdirs.rawAddress)

public actual fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindOnPathW(pszpath.rawAddress, ppszotherdirs.rawAddress)

public actual fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: ConstPtr, iarraysize: Int): Pcstr =
    ConstPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindSuffixArrayA(pszpath.rawAddress, apszsuffix.rawAddress, iarraysize))

public actual fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: ConstPtr, iarraysize: Int): Pcwstr =
    ConstPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathFindSuffixArrayW(pszpath.rawAddress, apszsuffix.rawAddress, iarraysize))

public actual fun pathGetArgsA(pszpath: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathGetArgsA(pszpath.rawAddress))

public actual fun pathGetArgsW(pszpath: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathGetArgsW(pszpath.rawAddress))

public actual fun pathGetCharTypeA(ch: UByte): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathGetCharTypeA(ch.toByte()).toUInt()

public actual fun pathGetCharTypeW(ch: UShort): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathGetCharTypeW(ch.toShort()).toUInt()

public actual fun pathGetDriveNumberA(pszpath: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathGetDriveNumberA(pszpath.rawAddress)

public actual fun pathGetDriveNumberW(pszpath: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathGetDriveNumberW(pszpath.rawAddress)

public actual fun pathGetShortPath(pszlongpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathGetShortPath(pszlongpath.rawAddress)
}

public actual fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsContentTypeA(pszpath.rawAddress, pszcontenttype.rawAddress)

public actual fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsContentTypeW(pszpath.rawAddress, pszcontenttype.rawAddress)

public actual fun pathIsDirectoryA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsDirectoryA(pszpath.rawAddress)

public actual fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsDirectoryEmptyA(pszpath.rawAddress)

public actual fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsDirectoryEmptyW(pszpath.rawAddress)

public actual fun pathIsDirectoryW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsDirectoryW(pszpath.rawAddress)

public actual fun pathIsExe(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsExe(pszpath.rawAddress)

public actual fun pathIsFileSpecA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsFileSpecA(pszpath.rawAddress)

public actual fun pathIsFileSpecW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsFileSpecW(pszpath.rawAddress)

public actual fun pathIsLFNFileSpecA(pszname: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsLFNFileSpecA(pszname.rawAddress)

public actual fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsLFNFileSpecW(pszname.rawAddress)

public actual fun pathIsNetworkPathA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsNetworkPathA(pszpath.rawAddress)

public actual fun pathIsNetworkPathW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsNetworkPathW(pszpath.rawAddress)

public actual fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsPrefixA(pszprefix.rawAddress, pszpath.rawAddress)

public actual fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsPrefixW(pszprefix.rawAddress, pszpath.rawAddress)

public actual fun pathIsRelativeA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsRelativeA(pszpath.rawAddress)

public actual fun pathIsRelativeW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsRelativeW(pszpath.rawAddress)

public actual fun pathIsRootA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsRootA(pszpath.rawAddress)

public actual fun pathIsRootW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsRootW(pszpath.rawAddress)

public actual fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsSameRootA(pszpath1.rawAddress, pszpath2.rawAddress)

public actual fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsSameRootW(pszpath1.rawAddress, pszpath2.rawAddress)

public actual fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsSlowA(pszfile.rawAddress, dwattr.toInt())

public actual fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsSlowW(pszfile.rawAddress, dwattr.toInt())

public actual fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsSystemFolderA(pszpath.rawAddress, dwattrb.toInt())

public actual fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsSystemFolderW(pszpath.rawAddress, dwattrb.toInt())

public actual fun pathIsUNCA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsUNCA(pszpath.rawAddress)

public actual fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsUNCEx(pszpath.rawAddress, ppszserver.rawAddress)

public actual fun pathIsUNCServerA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsUNCServerA(pszpath.rawAddress)

public actual fun pathIsUNCServerShareA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsUNCServerShareA(pszpath.rawAddress)

public actual fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsUNCServerShareW(pszpath.rawAddress)

public actual fun pathIsUNCServerW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsUNCServerW(pszpath.rawAddress)

public actual fun pathIsUNCW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsUNCW(pszpath.rawAddress)

public actual fun pathIsURLA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsURLA(pszpath.rawAddress)

public actual fun pathIsURLW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathIsURLW(pszpath.rawAddress)

public actual fun pathMakePrettyA(pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMakePrettyA(pszpath.rawAddress)

public actual fun pathMakePrettyW(pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMakePrettyW(pszpath.rawAddress)

public actual fun pathMakeSystemFolderA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMakeSystemFolderA(pszpath.rawAddress)

public actual fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMakeSystemFolderW(pszpath.rawAddress)

public actual fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMakeUniqueName(pszuniquename.rawAddress, cchmax.toInt(), psztemplate.rawAddress, pszlongplate.rawAddress, pszdir.rawAddress)

public actual fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMatchSpecA(pszfile.rawAddress, pszspec.rawAddress)

public actual fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMatchSpecExA(pszfile.rawAddress, pszspec.rawAddress, dwflags.toInt())

public actual fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMatchSpecExW(pszfile.rawAddress, pszspec.rawAddress, dwflags.toInt())

public actual fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathMatchSpecW(pszfile.rawAddress, pszspec.rawAddress)

public actual fun pathParseIconLocationA(psziconfile: Pstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathParseIconLocationA(psziconfile.rawAddress)

public actual fun pathParseIconLocationW(psziconfile: Pwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathParseIconLocationW(psziconfile.rawAddress)

public actual fun pathQualify(psz: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathQualify(psz.rawAddress)
}

public actual fun pathQuoteSpacesA(lpsz: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathQuoteSpacesA(lpsz.rawAddress)

public actual fun pathQuoteSpacesW(lpsz: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathQuoteSpacesW(lpsz.rawAddress)

public actual fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRelativePathToA(pszpath.rawAddress, pszfrom.rawAddress, dwattrfrom.toInt(), pszto.rawAddress, dwattrto.toInt())

public actual fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRelativePathToW(pszpath.rawAddress, pszfrom.rawAddress, dwattrfrom.toInt(), pszto.rawAddress, dwattrto.toInt())

public actual fun pathRemoveArgsA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveArgsA(pszpath.rawAddress)
}

public actual fun pathRemoveArgsW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveArgsW(pszpath.rawAddress)
}

public actual fun pathRemoveBackslashA(pszpath: Pstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveBackslashA(pszpath.rawAddress))

public actual fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveBackslashW(pszpath.rawAddress))

public actual fun pathRemoveBlanksA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveBlanksA(pszpath.rawAddress)
}

public actual fun pathRemoveBlanksW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveBlanksW(pszpath.rawAddress)
}

public actual fun pathRemoveExtensionA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveExtensionA(pszpath.rawAddress)
}

public actual fun pathRemoveExtensionW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveExtensionW(pszpath.rawAddress)
}

public actual fun pathRemoveFileSpecA(pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveFileSpecA(pszpath.rawAddress)

public actual fun pathRemoveFileSpecW(pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRemoveFileSpecW(pszpath.rawAddress)

public actual fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRenameExtensionA(pszpath.rawAddress, pszext.rawAddress)

public actual fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathRenameExtensionW(pszpath.rawAddress, pszext.rawAddress)

public actual fun pathResolve(pszpath: Pwstr, dirs: ConstPtr, fflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathResolve(pszpath.rawAddress, dirs.rawAddress, fflags.toInt())

public actual fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathSearchAndQualifyA(pszpath.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathSearchAndQualifyW(pszpath.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathSetDlgItemPathA(hdlg.rawAddress, id, pszpath.rawAddress)
}

public actual fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathSetDlgItemPathW(hdlg.rawAddress, id, pszpath.rawAddress)
}

public actual fun pathSkipRootA(pszpath: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathSkipRootA(pszpath.rawAddress))

public actual fun pathSkipRootW(pszpath: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathSkipRootW(pszpath.rawAddress))

public actual fun pathStripPathA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathStripPathA(pszpath.rawAddress)
}

public actual fun pathStripPathW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathStripPathW(pszpath.rawAddress)
}

public actual fun pathStripToRootA(pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathStripToRootA(pszpath.rawAddress)

public actual fun pathStripToRootW(pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathStripToRootW(pszpath.rawAddress)

public actual fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUnExpandEnvStringsA(pszpath.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUnExpandEnvStringsW(pszpath.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun pathUndecorateA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUndecorateA(pszpath.rawAddress)
}

public actual fun pathUndecorateW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUndecorateW(pszpath.rawAddress)
}

public actual fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUnmakeSystemFolderA(pszpath.rawAddress)

public actual fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUnmakeSystemFolderW(pszpath.rawAddress)

public actual fun pathUnquoteSpacesA(lpsz: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUnquoteSpacesA(lpsz.rawAddress)

public actual fun pathUnquoteSpacesW(lpsz: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathUnquoteSpacesW(lpsz.rawAddress)

public actual fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPathYetAnotherMakeUniqueName(pszuniquename.rawAddress, pszpath.rawAddress, pszshort.rawAddress, pszfilespec.rawAddress)

public actual fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: MutPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPickIconDlg(hwnd.rawAddress, psziconpath.rawAddress, cchiconpath.toInt(), piiconindex.rawAddress)

public actual fun propVariantToStrRet(propvar: ConstPtr, pstrret: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellPropVariantToStrRet(propvar.rawAddress, pstrret.rawAddress)

public actual fun qISearch(that: MutPtr, pqit: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellQISearch(that.rawAddress, pqit.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun readCabinetState(pcs: MutPtr, clength: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellReadCabinetState(pcs.rawAddress, clength)

public actual fun realDriveType(idrive: Int, foktohitnet: Bool): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRealDriveType(idrive, foktohitnet)

public actual fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: ConstPtr, registration: MutPtr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRegisterAppConstrainedChangeNotification(0L, context.rawAddress, registration.rawAddress).toUInt()

public actual fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: ConstPtr, registration: MutPtr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRegisterAppStateChangeNotification(0L, context.rawAddress, registration.rawAddress).toUInt()

public actual fun registerScaleChangeEvent(hevent: Handle, pdwcookie: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRegisterScaleChangeEvent(hevent.rawAddress, pdwcookie.rawAddress)

public actual fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRegisterScaleChangeNotifications(displaydevice, hwndnotify.rawAddress, umsgnotify.toInt(), pdwcookie.rawAddress)

public actual fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRemoveWindowSubclass(hwnd.rawAddress, 0L, uidsubclass.toLong())

public actual fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRestartDialog(hwnd.rawAddress, pszprompt.rawAddress, dwreturn.toInt())

public actual fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRestartDialogEx(hwnd.rawAddress, pszprompt.rawAddress, dwreturn.toInt(), dwreasoncode.toInt())

public actual fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellRevokeScaleChangeNotifications(displaydevice, dwcookie.toInt())

public actual fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    0u

public actual fun sHAddToRecentDocs(uflags: UInt, pv: ConstPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAddToRecentDocs(uflags.toInt(), pv.rawAddress)
}

public actual fun sHAlloc(cb: ULong): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAlloc(cb.toLong()))

public actual fun sHAllocShared(pvdata: ConstPtr, dwsize: UInt, dwprocessid: UInt): Handle =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAllocShared(pvdata.rawAddress, dwsize.toInt(), dwprocessid.toInt()))

public actual fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAnsiToAnsi(pszsrc.rawAddress, pszdst.rawAddress, cchbuf)

public actual fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAnsiToUnicode(pszsrc.rawAddress, pwszdst.rawAddress, cwchbuf)

public actual fun sHAppBarMessage(dwmessage: UInt, pdata: MutPtr): ULong =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAppBarMessage(dwmessage.toInt(), pdata.rawAddress).toULong()

public actual fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAssocEnumHandlers(pszextra.rawAddress, affilter, ppenumhandler.rawAddress)

public actual fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: ConstPtr, enumhandlers: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAssocEnumHandlersForProtocolByApplication(protocol.rawAddress, riid.rawAddress, enumhandlers.rawAddress)

public actual fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHAutoComplete(hwndedit.rawAddress, dwflags.toInt())

public actual fun sHBindToFolderIDListParent(psfroot: MutPtr, pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHBindToFolderIDListParent(psfroot.rawAddress, pidl.rawAddress, riid.rawAddress, ppv.rawAddress, ppidllast.rawAddress)

public actual fun sHBindToFolderIDListParentEx(psfroot: MutPtr, pidl: ConstPtr, ppbc: MutPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHBindToFolderIDListParentEx(psfroot.rawAddress, pidl.rawAddress, ppbc.rawAddress, riid.rawAddress, ppv.rawAddress, ppidllast.rawAddress)

public actual fun sHBindToObject(psf: MutPtr, pidl: ConstPtr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHBindToObject(psf.rawAddress, pidl.rawAddress, pbc.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHBindToParent(pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr, ppidllast: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHBindToParent(pidl.rawAddress, riid.rawAddress, ppv.rawAddress, ppidllast.rawAddress)

public actual fun sHBrowseForFolderA(lpbi: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHBrowseForFolderA(lpbi.rawAddress))

public actual fun sHBrowseForFolderW(lpbi: ConstPtr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHBrowseForFolderW(lpbi.rawAddress))

public actual fun sHCLSIDFromString(psz: Pcwstr, pclsid: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCLSIDFromString(psz.rawAddress, pclsid.rawAddress)

public actual fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: MutPtr, plevent: MutPtr): Handle =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShchangeNotificationLock(hchange.rawAddress, dwprocid.toInt(), pppidl.rawAddress, plevent.rawAddress))

public actual fun shchangeNotificationUnlock(hlock: Handle): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShchangeNotificationUnlock(hlock.rawAddress)

public actual fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: ConstPtr, dwitem2: ConstPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHChangeNotify(weventid, uflags.toInt(), dwitem1.rawAddress, dwitem2.rawAddress)
}

public actual fun sHChangeNotifyDeregister(ulid: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHChangeNotifyDeregister(ulid.toInt())

public actual fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: ConstPtr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHChangeNotifyRegister(hwnd.rawAddress, fsources, fevents, wmsg.toInt(), centries, pshcne.rawAddress).toUInt()

public actual fun sHChangeNotifyRegisterThread(status: ScnrtStatus) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(status)
}

public actual fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCloneSpecialIDList(hwnd.rawAddress, csidl, fcreate))

public actual fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: ConstPtr, punkouter: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCoCreateInstance(pszclsid.rawAddress, pclsid.rawAddress, punkouter.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCopyKeyA(hkeysrc.rawAddress, pszsrcsubkey.rawAddress, hkeydest.rawAddress, freserved.toInt()).toUInt()

public actual fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCopyKeyW(hkeysrc.rawAddress, pszsrcsubkey.rawAddress, hkeydest.rawAddress, freserved.toInt()).toUInt()

public actual fun sHCreateAssociationRegistration(riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateAssociationRegistration(riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateDataObject(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, pdtinner: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateDataObject(pidlfolder.rawAddress, cidl.toInt(), apidl.rawAddress, pdtinner.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateDefaultContextMenu(pdcm: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateDefaultContextMenu(pdcm.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateDefaultExtractIcon(riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateDefaultExtractIcon(riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateDefaultPropertiesOp(psi: MutPtr, ppfileop: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateDefaultPropertiesOp(psi.rawAddress, ppfileop.rawAddress)

public actual fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateDirectory(hwnd.rawAddress, pszpath.rawAddress)

public actual fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: ConstPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateDirectoryExA(hwnd.rawAddress, pszpath.rawAddress, psa.rawAddress)

public actual fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: ConstPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateDirectoryExW(hwnd.rawAddress, pszpath.rawAddress, psa.rawAddress)

public actual fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateFileExtractIconW(pszfile.rawAddress, dwfileattributes.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateItemFromIDList(pidl: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateItemFromIDList(pidl.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateItemFromParsingName(pszpath.rawAddress, pbc.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateItemFromRelativeName(psiparent: MutPtr, pszname: Pcwstr, pbc: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateItemFromRelativeName(psiparent.rawAddress, pszname.rawAddress, pbc.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateItemInKnownFolder(kfid: ConstPtr, dwkfflags: UInt, pszitem: Pcwstr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateItemInKnownFolder(kfid.rawAddress, dwkfflags.toInt(), pszitem.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateItemWithParent(pidlparent: ConstPtr, psfparent: MutPtr, pidl: ConstPtr, riid: ConstPtr, ppvitem: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateItemWithParent(pidlparent.rawAddress, psfparent.rawAddress, pidl.rawAddress, riid.rawAddress, ppvitem.rawAddress)

public actual fun sHCreateMemStream(pinit: ConstPtr, cbinit: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateMemStream(pinit.rawAddress, cbinit.toInt()))

public actual fun sHCreateProcessAsUserW(pscpi: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateProcessAsUserW(pscpi.rawAddress)

public actual fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreatePropSheetExtArray(hkey.rawAddress, pszsubkey.rawAddress, maxIface.toInt()))

public actual fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateQueryCancelAutoPlayMoniker(ppmoniker.rawAddress)

public actual fun sHCreateShellFolderView(pcsfv: ConstPtr, ppsv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellFolderView(pcsfv.rawAddress, ppsv.rawAddress)

public actual fun sHCreateShellFolderViewEx(pcsfv: ConstPtr, ppsv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellFolderViewEx(pcsfv.rawAddress, ppsv.rawAddress)

public actual fun sHCreateShellItem(pidlparent: ConstPtr, psfparent: MutPtr, pidl: ConstPtr, ppsi: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellItem(pidlparent.rawAddress, psfparent.rawAddress, pidl.rawAddress, ppsi.rawAddress)

public actual fun sHCreateShellItemArray(pidlparent: ConstPtr, psf: MutPtr, cidl: UInt, ppidl: ConstPtr, ppsiitemarray: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellItemArray(pidlparent.rawAddress, psf.rawAddress, cidl.toInt(), ppidl.rawAddress, ppsiitemarray.rawAddress)

public actual fun sHCreateShellItemArrayFromDataObject(pdo: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromDataObject(pdo.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: ConstPtr, ppsiitemarray: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromIDLists(cidl.toInt(), rgpidl.rawAddress, ppsiitemarray.rawAddress)

public actual fun sHCreateShellItemArrayFromShellItem(psi: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromShellItem(psi.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHCreateShellPalette(hdc: Hdc): Hpalette =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateShellPalette(hdc.rawAddress))

public actual fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: ConstPtr, ppenumformatetc: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateStdEnumFmtEtc(cfmt.toInt(), afmt.rawAddress, ppenumformatetc.rawAddress)

public actual fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateStreamOnFileA(pszfile.rawAddress, grfmode.toInt(), ppstm.rawAddress)

public actual fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: MutPtr, ppstm: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateStreamOnFileEx(pszfile.rawAddress, grfmode.toInt(), dwattributes.toInt(), fcreate, pstmtemplate.rawAddress, ppstm.rawAddress)

public actual fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateStreamOnFileW(pszfile.rawAddress, grfmode.toInt(), ppstm.rawAddress)

public actual fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr, flags: UInt, pfncallback: LpthreadStartRoutine): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateThread(0L, pdata.rawAddress, flags.toInt(), 0L)

public actual fun sHCreateThreadRef(pcref: MutPtr, ppunk: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateThreadRef(pcref.rawAddress, ppunk.rawAddress)

public actual fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHCreateThreadWithHandle(0L, pdata.rawAddress, flags.toInt(), 0L, phandle.rawAddress)

public actual fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr, phiconsmall: MutPtr, niconsize: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDefExtractIconA(psziconfile.rawAddress, iindex, uflags.toInt(), phiconlarge.rawAddress, phiconsmall.rawAddress, niconsize.toInt())

public actual fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr, phiconsmall: MutPtr, niconsize: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDefExtractIconW(psziconfile.rawAddress, iindex, uflags.toInt(), phiconlarge.rawAddress, phiconsmall.rawAddress, niconsize.toInt())

public actual fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDeleteEmptyKeyA(hkey.rawAddress, pszsubkey.rawAddress).toUInt()

public actual fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDeleteEmptyKeyW(hkey.rawAddress, pszsubkey.rawAddress).toUInt()

public actual fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDeleteKeyA(hkey.rawAddress, pszsubkey.rawAddress).toUInt()

public actual fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDeleteKeyW(hkey.rawAddress, pszsubkey.rawAddress).toUInt()

public actual fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDeleteValueA(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress).toUInt()

public actual fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDeleteValueW(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress).toUInt()

public actual fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDestroyPropSheetExtArray(hpsxa.rawAddress)
}

public actual fun sHDoDragDrop(hwnd: Hwnd, pdata: MutPtr, pdsrc: MutPtr, dweffect: Dropeffect, pdweffect: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHDoDragDrop(hwnd.rawAddress, pdata.rawAddress, pdsrc.rawAddress, dweffect.toInt(), pdweffect.rawAddress)

public actual fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEmptyRecycleBinA(hwnd.rawAddress, pszrootpath.rawAddress, dwflags.toInt())

public actual fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEmptyRecycleBinW(hwnd.rawAddress, pszrootpath.rawAddress, dwflags.toInt())

public actual fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEnumKeyExA(hkey.rawAddress, dwindex.toInt(), pszname.rawAddress, pcchname.rawAddress).toUInt()

public actual fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEnumKeyExW(hkey.rawAddress, dwindex.toInt(), pszname.rawAddress, pcchname.rawAddress).toUInt()

public actual fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEnumValueA(hkey.rawAddress, dwindex.toInt(), pszvaluename.rawAddress, pcchvaluename.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEnumValueW(hkey.rawAddress, dwindex.toInt(), pszvaluename.rawAddress, pcchvaluename.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEnumerateUnreadMailAccountsW(hkeyuser.rawAddress, dwindex.toInt(), pszmailaddress.rawAddress, cchmailaddress)

public actual fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: MutPtr, ppszcommandline: MutPtr, ppszparameters: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHEvaluateSystemCommandTemplate(pszcmdtemplate.rawAddress, ppszapplication.rawAddress, ppszcommandline.rawAddress, ppszparameters.rawAddress)

public actual fun sHFileOperationA(lpfileop: MutPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFileOperationA(lpfileop.rawAddress)

public actual fun sHFileOperationW(lpfileop: MutPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFileOperationW(lpfileop.rawAddress)

public actual fun sHFindFiles(pidlfolder: ConstPtr, pidlsavefile: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFindFiles(pidlfolder.rawAddress, pidlsavefile.rawAddress)

public actual fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShfindInitMenuPopup(hmenu.rawAddress, hwndowner.rawAddress, idcmdfirst.toInt(), idcmdlast.toInt()))

public actual fun sHFlushSFCache() {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFlushSFCache()
}

public actual fun sHFormatDateTimeA(pft: ConstPtr, pdwflags: MutPtr, pszbuf: Pstr, cchbuf: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFormatDateTimeA(pft.rawAddress, pdwflags.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun sHFormatDateTimeW(pft: ConstPtr, pdwflags: MutPtr, pszbuf: Pwstr, cchbuf: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFormatDateTimeW(pft.rawAddress, pdwflags.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFormatDrive(hwnd.rawAddress, drive.toInt(), fmtid.toInt(), options.toInt()).toUInt()

public actual fun sHFree(pv: ConstPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFree(pv.rawAddress)
}

public actual fun sHFreeNameMappings(hnamemappings: Handle) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFreeNameMappings(hnamemappings.rawAddress)
}

public actual fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHFreeShared(hdata.rawAddress, dwprocessid.toInt())

public actual fun sHGetAttributesFromDataObject(pdo: MutPtr, dwattributemask: UInt, pdwattributes: MutPtr, pcitems: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetAttributesFromDataObject(pdo.rawAddress, dwattributemask.toInt(), pdwattributes.rawAddress, pcitems.rawAddress)

public actual fun sHGetDataFromIDListA(psf: MutPtr, pidl: ConstPtr, nformat: ShgdfilFormat, pv: MutPtr, cb: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetDataFromIDListA(psf.rawAddress, pidl.rawAddress, nformat, pv.rawAddress, cb)

public actual fun sHGetDataFromIDListW(psf: MutPtr, pidl: ConstPtr, nformat: ShgdfilFormat, pv: MutPtr, cb: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetDataFromIDListW(psf.rawAddress, pidl.rawAddress, nformat, pv.rawAddress, cb)

public actual fun sHGetDesktopFolder(ppshf: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetDesktopFolder(ppshf.rawAddress)

public actual fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: MutPtr, pultotalnumberofbytes: MutPtr, pultotalnumberoffreebytes: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExA(pszdirectoryname.rawAddress, pulfreebytesavailabletocaller.rawAddress, pultotalnumberofbytes.rawAddress, pultotalnumberoffreebytes.rawAddress)

public actual fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: MutPtr, pultotalnumberofbytes: MutPtr, pultotalnumberoffreebytes: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExW(pszdirectoryname.rawAddress, pulfreebytesavailabletocaller.rawAddress, pultotalnumberofbytes.rawAddress, pultotalnumberoffreebytes.rawAddress)

public actual fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetDriveMedia(pszdrive.rawAddress, pdwmediacontent.rawAddress)

public actual fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetFileInfoA(pszpath.rawAddress, dwfileattributes.toInt(), psfi.rawAddress, cbfileinfo.toInt(), uflags.toInt()).toULong()

public actual fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetFileInfoW(pszpath.rawAddress, dwfileattributes.toInt(), psfi.rawAddress, cbfileinfo.toInt(), uflags.toInt()).toULong()

public actual fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetFolderLocation(hwnd.rawAddress, csidl, htoken.rawAddress, dwflags.toInt(), ppidl.rawAddress)

public actual fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetFolderPathA(hwnd.rawAddress, csidl, htoken.rawAddress, dwflags.toInt(), pszpath.rawAddress)

public actual fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirA(hwnd.rawAddress, csidl, htoken.rawAddress, dwflags.toInt(), pszsubdir.rawAddress, pszpath.rawAddress)

public actual fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirW(hwnd.rawAddress, csidl, htoken.rawAddress, dwflags.toInt(), pszsubdir.rawAddress, pszpath.rawAddress)

public actual fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetFolderPathW(hwnd.rawAddress, csidl, htoken.rawAddress, dwflags.toInt(), pszpath.rawAddress)

public actual fun sHGetIDListFromObject(punk: MutPtr, ppidl: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetIDListFromObject(punk.rawAddress, ppidl.rawAddress)

public actual fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetIconOverlayIndexA(psziconpath.rawAddress, iiconindex)

public actual fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetIconOverlayIndexW(psziconpath.rawAddress, iiconindex)

public actual fun sHGetImageList(iimagelist: Int, riid: ConstPtr, ppvobj: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetImageList(iimagelist, riid.rawAddress, ppvobj.rawAddress)

public actual fun sHGetInstanceExplorer(ppunk: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetInstanceExplorer(ppunk.rawAddress)

public actual fun sHGetInverseCMAP(pbmap: MutPtr, cbmap: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetInverseCMAP(pbmap.rawAddress, cbmap.toInt())

public actual fun sHGetItemFromDataObject(pdtobj: MutPtr, dwflags: DataobjGetItemFlags, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetItemFromDataObject(pdtobj.rawAddress, dwflags, riid.rawAddress, ppv.rawAddress)

public actual fun sHGetItemFromObject(punk: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetItemFromObject(punk.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHGetKnownFolderIDList(rfid: ConstPtr, dwflags: UInt, htoken: Handle, ppidl: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetKnownFolderIDList(rfid.rawAddress, dwflags.toInt(), htoken.rawAddress, ppidl.rawAddress)

public actual fun sHGetKnownFolderItem(rfid: ConstPtr, flags: KnownFolderFlag, htoken: Handle, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetKnownFolderItem(rfid.rawAddress, flags, htoken.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun sHGetKnownFolderPath(rfid: ConstPtr, dwflags: UInt, htoken: Handle, ppszpath: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetKnownFolderPath(rfid.rawAddress, dwflags.toInt(), htoken.rawAddress, ppszpath.rawAddress)

public actual fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetLocalizedName(pszpath.rawAddress, pszresmodule.rawAddress, cch.toInt(), pidsres.rawAddress)

public actual fun sHGetMalloc(ppmalloc: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetMalloc(ppmalloc.rawAddress)

public actual fun sHGetNameFromIDList(pidl: ConstPtr, sigdnname: Sigdn, ppszname: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetNameFromIDList(pidl.rawAddress, sigdnname, ppszname.rawAddress)

public actual fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: MutPtr, uflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetNewLinkInfoA(pszlinkto.rawAddress, pszdir.rawAddress, pszname.rawAddress, pfmustcopy.rawAddress, uflags.toInt())

public actual fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: MutPtr, uflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetNewLinkInfoW(pszlinkto.rawAddress, pszdir.rawAddress, pszname.rawAddress, pfmustcopy.rawAddress, uflags.toInt())

public actual fun sHGetPathFromIDListA(pidl: ConstPtr, pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetPathFromIDListA(pidl.rawAddress, pszpath.rawAddress)

public actual fun sHGetPathFromIDListEx(pidl: ConstPtr, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetPathFromIDListEx(pidl.rawAddress, pszpath.rawAddress, cchpath.toInt(), uopts.toInt())

public actual fun sHGetPathFromIDListW(pidl: ConstPtr, pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetPathFromIDListW(pidl.rawAddress, pszpath.rawAddress)

public actual fun sHGetRealIDL(psf: MutPtr, pidlsimple: ConstPtr, ppidlreal: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetRealIDL(psf.rawAddress, pidlsimple.rawAddress, ppidlreal.rawAddress)

public actual fun sHGetSetFolderCustomSettings(pfcs: MutPtr, pszpath: Pcwstr, dwreadwrite: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetSetFolderCustomSettings(pfcs.rawAddress, pszpath.rawAddress, dwreadwrite.toInt())

public actual fun sHGetSetSettings(lpss: MutPtr, dwmask: SsfMask, bset: Bool) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetSetSettings(lpss.rawAddress, dwmask.toInt(), bset)
}

public actual fun sHGetSettings(psfs: MutPtr, dwmask: UInt) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetSettings(psfs.rawAddress, dwmask.toInt())
}

public actual fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetSpecialFolderLocation(hwnd.rawAddress, csidl, ppidl.rawAddress)

public actual fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetSpecialFolderPathA(hwnd.rawAddress, pszpath.rawAddress, csidl, fcreate)

public actual fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetSpecialFolderPathW(hwnd.rawAddress, pszpath.rawAddress, csidl, fcreate)

public actual fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetStockIconInfo(siid, uflags.toInt(), psii.rawAddress)

public actual fun sHGetTemporaryPropertyForItem(psi: MutPtr, propkey: ConstPtr, ppropvar: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetTemporaryPropertyForItem(psi.rawAddress, propkey.rawAddress, ppropvar.rawAddress)

public actual fun sHGetThreadRef(ppunk: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetThreadRef(ppunk.rawAddress)

public actual fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: MutPtr, pfiletime: MutPtr, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetUnreadMailCountW(hkeyuser.rawAddress, pszmailaddress.rawAddress, pdwcount.rawAddress, pfiletime.rawAddress, pszshellexecutecommand.rawAddress, cchshellexecutecommand)

public actual fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetValueA(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetValueW(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHGetViewStatePropertyBag(pidl: ConstPtr, pszbagname: Pcwstr, dwflags: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGetViewStatePropertyBag(pidl.rawAddress, pszbagname.rawAddress, dwflags.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun sHGlobalCounterDecrement(id: Shglobalcounter): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGlobalCounterDecrement(id)

public actual fun sHGlobalCounterGetValue(id: Shglobalcounter): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGlobalCounterGetValue(id)

public actual fun sHGlobalCounterIncrement(id: Shglobalcounter): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHGlobalCounterIncrement(id)

public actual fun sHHandleUpdateImage(pidlextra: ConstPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHHandleUpdateImage(pidlextra.rawAddress)

public actual fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: MutPtr, rgfinout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHILCreateFromPath(pszpath.rawAddress, ppidl.rawAddress, rgfinout.rawAddress)

public actual fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHInvokePrinterCommandA(hwnd.rawAddress, uaction.toInt(), lpbuf1.rawAddress, lpbuf2.rawAddress, fmodal)

public actual fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHInvokePrinterCommandW(hwnd.rawAddress, uaction.toInt(), lpbuf1.rawAddress, lpbuf2.rawAddress, fmodal)

public actual fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHIsFileAvailableOffline(pwszpath.rawAddress, pdwstatus.rawAddress)

public actual fun sHIsLowMemoryMachine(dwtype: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHIsLowMemoryMachine(dwtype.toInt())

public actual fun sHLimitInputEdit(hwndedit: Hwnd, psf: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHLimitInputEdit(hwndedit.rawAddress, psf.rawAddress)

public actual fun sHLoadInProc(rclsid: ConstPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHLoadInProc(rclsid.rawAddress)

public actual fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: ConstPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHLoadIndirectString(pszsource.rawAddress, pszoutbuf.rawAddress, cchoutbuf.toInt(), ppvreserved.rawAddress)

public actual fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers()

public actual fun sHLockShared(hdata: Handle, dwprocessid: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHLockShared(hdata.rawAddress, dwprocessid.toInt()))

public actual fun sHMapPIDLToSystemImageListIndex(pshf: MutPtr, pidl: ConstPtr, piindexsel: MutPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHMapPIDLToSystemImageListIndex(pshf.rawAddress, pidl.rawAddress, piindexsel.rawAddress)

public actual fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHMessageBoxCheckA(hwnd.rawAddress, psztext.rawAddress, pszcaption.rawAddress, utype.toInt(), idefault, pszregval.rawAddress)

public actual fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHMessageBoxCheckW(hwnd.rawAddress, psztext.rawAddress, pszcaption.rawAddress, utype.toInt(), idefault, pszregval.rawAddress)

public actual fun sHMultiFileProperties(pdtobj: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHMultiFileProperties(pdtobj.rawAddress, dwflags.toInt())

public actual fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHObjectProperties(hwnd.rawAddress, shopobjecttype.toInt(), pszobjectname.rawAddress, pszpropertypage.rawAddress)

public actual fun sHOpenFolderAndSelectItems(pidlfolder: ConstPtr, cidl: UInt, apidl: ConstPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHOpenFolderAndSelectItems(pidlfolder.rawAddress, cidl.toInt(), apidl.rawAddress, dwflags.toInt())

public actual fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: ConstPtr, ckeys: UInt, pclsiddefault: ConstPtr, pdtobj: MutPtr, psb: MutPtr, pstartpage: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHOpenPropSheetW(pszcaption.rawAddress, ahkeys.rawAddress, ckeys.toInt(), pclsiddefault.rawAddress, pdtobj.rawAddress, psb.rawAddress, pstartpage.rawAddress)

public actual fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHOpenRegStream2A(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, grfmode.toInt()))

public actual fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHOpenRegStream2W(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, grfmode.toInt()))

public actual fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHOpenRegStreamA(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, grfmode.toInt()))

public actual fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHOpenRegStreamW(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, grfmode.toInt()))

public actual fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: ConstPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHOpenWithDialog(hwndparent.rawAddress, poainfo.rawAddress)

public actual fun sHParseDisplayName(pszname: Pcwstr, pbc: MutPtr, ppidl: MutPtr, sfgaoin: UInt, psfgaoout: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHParseDisplayName(pszname.rawAddress, pbc.rawAddress, ppidl.rawAddress, sfgaoin.toInt(), psfgaoout.rawAddress)

public actual fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: MutPtr, pszpath: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHPathPrepareForWriteA(hwnd.rawAddress, punkenablemodless.rawAddress, pszpath.rawAddress, dwflags.toInt())

public actual fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: MutPtr, pszpath: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHPathPrepareForWriteW(hwnd.rawAddress, punkenablemodless.rawAddress, pszpath.rawAddress, dwflags.toInt())

public actual fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHQueryInfoKeyA(hkey.rawAddress, pcsubkeys.rawAddress, pcchmaxsubkeylen.rawAddress, pcvalues.rawAddress, pcchmaxvaluenamelen.rawAddress).toUInt()

public actual fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHQueryInfoKeyW(hkey.rawAddress, pcsubkeys.rawAddress, pcchmaxsubkeylen.rawAddress, pcvalues.rawAddress, pcchmaxvaluenamelen.rawAddress).toUInt()

public actual fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHQueryRecycleBinA(pszrootpath.rawAddress, pshqueryrbinfo.rawAddress)

public actual fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHQueryRecycleBinW(pszrootpath.rawAddress, pshqueryrbinfo.rawAddress)

public actual fun sHQueryUserNotificationState(pquns: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHQueryUserNotificationState(pquns.rawAddress)

public actual fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: ConstPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHQueryValueExA(hkey.rawAddress, pszvalue.rawAddress, pdwreserved.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: ConstPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHQueryValueExW(hkey.rawAddress, pszvalue.rawAddress, pdwreserved.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHRegCloseUSKey(huskey: Long): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegCloseUSKey(huskey).toUInt()

public actual fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegCreateUSKeyA(pszpath.rawAddress, samdesired.toInt(), hrelativeuskey, phnewuskey.rawAddress, dwflags.toInt()).toUInt()

public actual fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegCreateUSKeyW(pwzpath.rawAddress, samdesired.toInt(), hrelativeuskey, phnewuskey.rawAddress, dwflags.toInt()).toUInt()

public actual fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyA(huskey, pszsubkey.rawAddress, delregflags).toUInt()

public actual fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyW(huskey, pwzsubkey.rawAddress, delregflags).toUInt()

public actual fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegDeleteUSValueA(huskey, pszvalue.rawAddress, delregflags).toUInt()

public actual fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegDeleteUSValueW(huskey, pwzvalue.rawAddress, delregflags).toUInt()

public actual fun sHRegDuplicateHKey(hkey: Hkey): Hkey =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegDuplicateHKey(hkey.rawAddress))

public actual fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegEnumUSKeyA(huskey, dwindex.toInt(), pszname.rawAddress, pcchname.rawAddress, enumregflags).toUInt()

public actual fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegEnumUSKeyW(huskey, dwindex.toInt(), pwzname.rawAddress, pcchname.rawAddress, enumregflags).toUInt()

public actual fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegEnumUSValueA(huskey, dwindex.toInt(), pszvaluename.rawAddress, pcchvaluename.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress, enumregflags).toUInt()

public actual fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegEnumUSValueW(huskey, dwindex.toInt(), pszvaluename.rawAddress, pcchvaluename.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress, enumregflags).toUInt()

public actual fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetBoolUSValueA(pszsubkey.rawAddress, pszvalue.rawAddress, fignorehkcu, fdefault)

public actual fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetBoolUSValueW(pszsubkey.rawAddress, pszvalue.rawAddress, fignorehkcu, fdefault)

public actual fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetIntW(hk.rawAddress, pwzkey.rawAddress, idefault)

public actual fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetPathA(hkey.rawAddress, pcszsubkey.rawAddress, pcszvalue.rawAddress, pszpath.rawAddress, dwflags.toInt()).toUInt()

public actual fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetPathW(hkey.rawAddress, pcszsubkey.rawAddress, pcszvalue.rawAddress, pszpath.rawAddress, dwflags.toInt()).toUInt()

public actual fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetUSValueA(pszsubkey.rawAddress, pszvalue.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress, fignorehkcu, pvdefaultdata.rawAddress, dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetUSValueW(pszsubkey.rawAddress, pszvalue.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress, fignorehkcu, pvdefaultdata.rawAddress, dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetValueA(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, srrfflags, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetValueFromHKCUHKLM(pwszkey.rawAddress, pwszvalue.rawAddress, srrfflags, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegGetValueW(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, srrfflags, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, fignorehkcu: Bool): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegOpenUSKeyA(pszpath.rawAddress, samdesired.toInt(), hrelativeuskey, phnewuskey.rawAddress, fignorehkcu).toUInt()

public actual fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr, fignorehkcu: Bool): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegOpenUSKeyW(pwzpath.rawAddress, samdesired.toInt(), hrelativeuskey, phnewuskey.rawAddress, fignorehkcu).toUInt()

public actual fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyA(huskey, pcsubkeys.rawAddress, pcchmaxsubkeylen.rawAddress, pcvalues.rawAddress, pcchmaxvaluenamelen.rawAddress, enumregflags).toUInt()

public actual fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: MutPtr, pcchmaxsubkeylen: MutPtr, pcvalues: MutPtr, pcchmaxvaluenamelen: MutPtr, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyW(huskey, pcsubkeys.rawAddress, pcchmaxsubkeylen.rawAddress, pcvalues.rawAddress, pcchmaxvaluenamelen.rawAddress, enumregflags).toUInt()

public actual fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegQueryUSValueA(huskey, pszvalue.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress, fignorehkcu, pvdefaultdata.rawAddress, dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr, fignorehkcu: Bool, pvdefaultdata: ConstPtr, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegQueryUSValueW(huskey, pszvalue.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress, fignorehkcu, pvdefaultdata.rawAddress, dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegSetPathA(hkey.rawAddress, pcszsubkey.rawAddress, pcszvalue.rawAddress, pcszpath.rawAddress, dwflags.toInt()).toUInt()

public actual fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegSetPathW(hkey.rawAddress, pcszsubkey.rawAddress, pcszvalue.rawAddress, pcszpath.rawAddress, dwflags.toInt()).toUInt()

public actual fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegSetUSValueA(pszsubkey.rawAddress, pszvalue.rawAddress, dwtype.toInt(), pvdata.rawAddress, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegSetUSValueW(pwzsubkey.rawAddress, pwzvalue.rawAddress, dwtype.toInt(), pvdata.rawAddress, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegWriteUSValueA(huskey, pszvalue.rawAddress, dwtype.toInt(), pvdata.rawAddress, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRegWriteUSValueW(huskey, pwzvalue.rawAddress, dwtype.toInt(), pvdata.rawAddress, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHReleaseThreadRef(): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHReleaseThreadRef()

public actual fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRemoveLocalizedName(pszpath.rawAddress)

public actual fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    0u

public actual fun sHResolveLibrary(psilibrary: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHResolveLibrary(psilibrary.rawAddress)

public actual fun sHRestricted(rest: Restrictions): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHRestricted(rest).toUInt()

public actual fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSendMessageBroadcastA(umsg.toInt(), wparam.toLong(), lparam)

public actual fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSendMessageBroadcastW(umsg.toInt(), wparam.toLong(), lparam)

public actual fun sHSetDefaultProperties(hwnd: Hwnd, psi: MutPtr, dwfileopflags: UInt, pfops: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetDefaultProperties(hwnd.rawAddress, psi.rawAddress, dwfileopflags.toInt(), pfops.rawAddress)

public actual fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetFolderPathA(csidl, htoken.rawAddress, dwflags.toInt(), pszpath.rawAddress)

public actual fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetFolderPathW(csidl, htoken.rawAddress, dwflags.toInt(), pszpath.rawAddress)

public actual fun sHSetInstanceExplorer(punk: MutPtr) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetInstanceExplorer(punk.rawAddress)
}

public actual fun sHSetKnownFolderPath(rfid: ConstPtr, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetKnownFolderPath(rfid.rawAddress, dwflags.toInt(), htoken.rawAddress, pszpath.rawAddress)

public actual fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetLocalizedName(pszpath.rawAddress, pszresmodule.rawAddress, idsres)

public actual fun sHSetTemporaryPropertyForItem(psi: MutPtr, propkey: ConstPtr, propvar: ConstPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetTemporaryPropertyForItem(psi.rawAddress, propkey.rawAddress, propvar.rawAddress)

public actual fun sHSetThreadRef(punk: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetThreadRef(punk.rawAddress)

public actual fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetUnreadMailCountW(pszmailaddress.rawAddress, dwcount.toInt(), pszshellexecutecommand.rawAddress)

public actual fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetValueA(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, dwtype.toInt(), pvdata.rawAddress, cbdata.toInt())

public actual fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr, cbdata: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSetValueW(hkey.rawAddress, pszsubkey.rawAddress, pszvalue.rawAddress, dwtype.toInt(), pvdata.rawAddress, cbdata.toInt())

public actual fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShshellFolderViewMessage(hwndmain.rawAddress, umsg.toInt(), lparam)

public actual fun sHShowManageLibraryUI(psilibrary: MutPtr, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHShowManageLibraryUI(psilibrary.rawAddress, hwndowner.rawAddress, psztitle.rawAddress, pszinstruction.rawAddress, lmdoptions)

public actual fun sHSimpleIDListFromPath(pszpath: Pcwstr): MutPtr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSimpleIDListFromPath(pszpath.rawAddress))

public actual fun sHSkipJunction(pbc: MutPtr, pclsid: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHSkipJunction(pbc.rawAddress, pclsid.rawAddress)

public actual fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHStartNetConnectionDialogW(hwnd.rawAddress, pszremotename.rawAddress, dwtype.toInt())

public actual fun sHStrDupA(psz: Pcstr, ppwsz: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHStrDupA(psz.rawAddress, ppwsz.rawAddress)

public actual fun sHStrDupW(psz: Pcwstr, ppwsz: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHStrDupW(psz.rawAddress, ppwsz.rawAddress)

public actual fun sHStripMneumonicA(pszmenu: Pstr): Byte =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHStripMneumonicA(pszmenu.rawAddress)

public actual fun sHStripMneumonicW(pszmenu: Pwstr): UShort =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHStripMneumonicW(pszmenu.rawAddress).toUShort()

public actual fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHTestTokenMembership(htoken.rawAddress, ulrid.toInt())

public actual fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHUnicodeToAnsi(pwszsrc.rawAddress, pszdst.rawAddress, cchbuf)

public actual fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHUnicodeToUnicode(pwzsrc.rawAddress, pwzdst.rawAddress, cwchbuf)

public actual fun sHUnlockShared(pvdata: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHUnlockShared(pvdata.rawAddress)

public actual fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHUpdateImageA(pszhashitem.rawAddress, iindex, uflags.toInt(), iimageindex)
}

public actual fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHUpdateImageW(pszhashitem.rawAddress, iindex, uflags.toInt(), iimageindex)
}

public actual fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSHValidateUNC(hwndowner.rawAddress, pszfile.rawAddress, fconnect.toInt())

public actual fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSetCurrentProcessExplicitAppUserModelID(appid.rawAddress)

public actual fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSetMenuContextHelpId(param0.rawAddress, param1.toInt())

public actual fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSetWindowContextHelpId(param0.rawAddress, param1.toInt())

public actual fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSetWindowSubclass(hwnd.rawAddress, 0L, uidsubclass.toLong(), dwrefdata.toLong())

public actual fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellAboutA(hwnd.rawAddress, szapp.rawAddress, szotherstuff.rawAddress, hicon.rawAddress)

public actual fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellAboutW(hwnd.rawAddress, szapp.rawAddress, szotherstuff.rawAddress, hicon.rawAddress)

public actual fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellExecuteA(hwnd.rawAddress, lpoperation.rawAddress, lpfile.rawAddress, lpparameters.rawAddress, lpdirectory.rawAddress, nshowcmd))

public actual fun shellExecuteExA(pexecinfo: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellExecuteExA(pexecinfo.rawAddress)

public actual fun shellExecuteExW(pexecinfo: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellExecuteExW(pexecinfo.rawAddress)

public actual fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellExecuteW(hwnd.rawAddress, lpoperation.rawAddress, lpfile.rawAddress, lpparameters.rawAddress, lpdirectory.rawAddress, nshowcmd))

public actual fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellMessageBoxA(happinst.rawAddress, hwnd.rawAddress, lpctext.rawAddress, lpctitle.rawAddress, fustyle.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellMessageBoxW(happinst.rawAddress, hwnd.rawAddress, lpctext.rawAddress, lpctitle.rawAddress, fustyle.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellGetCachedImageIndex(pwsziconpath.rawAddress, iiconindex, uiconflags.toInt())

public actual fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellGetCachedImageIndexA(psziconpath.rawAddress, iiconindex, uiconflags.toInt())

public actual fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellGetCachedImageIndexW(psziconpath.rawAddress, iiconindex, uiconflags.toInt())

public actual fun shellGetImageLists(phiml: MutPtr, phimlsmall: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellGetImageLists(phiml.rawAddress, phimlsmall.rawAddress)

public actual fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellMergeMenus(hmdst.rawAddress, hmsrc.rawAddress, uinsert.toInt(), uidadjust.toInt(), uidadjustmax.toInt(), uflags.toInt()).toUInt()

public actual fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellNotifyIconA(dwmessage.toInt(), lpdata.rawAddress)

public actual fun shellNotifyIconGetRect(identifier: ConstPtr, iconlocation: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellNotifyIconGetRect(identifier.rawAddress, iconlocation.rawAddress)

public actual fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellShellNotifyIconW(dwmessage.toInt(), lpdata.rawAddress)

public actual fun signalFileOpen(pidl: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSignalFileOpen(pidl.rawAddress)

public actual fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: MutPtr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellSoftwareUpdateMessageBox(hwnd.rawAddress, pszdistunit.rawAddress, dwflags.toInt(), psdi.rawAddress).toUInt()

public actual fun stgMakeUniqueName(pstgparent: MutPtr, pszfilespec: Pcwstr, grfmode: UInt, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStgMakeUniqueName(pstgparent.rawAddress, pszfilespec.rawAddress, grfmode.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCSpnA(pszstr.rawAddress, pszset.rawAddress)

public actual fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCSpnIA(pszstr.rawAddress, pszset.rawAddress)

public actual fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCSpnIW(pszstr.rawAddress, pszset.rawAddress)

public actual fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCSpnW(pszstr.rawAddress, pszset.rawAddress)

public actual fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCatBuffA(pszdest.rawAddress, pszsrc.rawAddress, cchdestbuffsize))

public actual fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCatBuffW(pszdest.rawAddress, pszsrc.rawAddress, cchdestbuffsize))

public actual fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCatChainW(pszdst.rawAddress, cchdst.toInt(), ichat.toInt(), pszsrc.rawAddress).toUInt()

public actual fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCatW(psz1.rawAddress, psz2.rawAddress))

public actual fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrChrA(pszstart.rawAddress, wmatch.toShort()))

public actual fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrChrIA(pszstart.rawAddress, wmatch.toShort()))

public actual fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrChrIW(pszstart.rawAddress, wmatch.toShort()))

public actual fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrChrNIW(pszstart.rawAddress, wmatch.toShort(), cchmax.toInt()))

public actual fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrChrNW(pszstart.rawAddress, wmatch.toShort(), cchmax.toInt()))

public actual fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrChrW(pszstart.rawAddress, wmatch.toShort()))

public actual fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpCA(pszstr1.rawAddress, pszstr2.rawAddress)

public actual fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpCW(pszstr1.rawAddress, pszstr2.rawAddress)

public actual fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpICA(pszstr1.rawAddress, pszstr2.rawAddress)

public actual fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpICW(pszstr1.rawAddress, pszstr2.rawAddress)

public actual fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpIW(psz1.rawAddress, psz2.rawAddress)

public actual fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpLogicalW(psz1.rawAddress, psz2.rawAddress)

public actual fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNA(psz1.rawAddress, psz2.rawAddress, nchar)

public actual fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNCA(pszstr1.rawAddress, pszstr2.rawAddress, nchar)

public actual fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNCW(pszstr1.rawAddress, pszstr2.rawAddress, nchar)

public actual fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNIA(psz1.rawAddress, psz2.rawAddress, nchar)

public actual fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNICA(pszstr1.rawAddress, pszstr2.rawAddress, nchar)

public actual fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNICW(pszstr1.rawAddress, pszstr2.rawAddress, nchar)

public actual fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNIW(psz1.rawAddress, psz2.rawAddress, nchar)

public actual fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpNW(psz1.rawAddress, psz2.rawAddress, nchar)

public actual fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCmpW(psz1.rawAddress, psz2.rawAddress)

public actual fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCpyNW(pszdst.rawAddress, pszsrc.rawAddress, cchmax))

public actual fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrCpyW(psz1.rawAddress, psz2.rawAddress))

public actual fun strDupA(pszsrch: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrDupA(pszsrch.rawAddress))

public actual fun strDupW(pszsrch: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrDupW(pszsrch.rawAddress))

public actual fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFormatByteSize64A(qdw, pszbuf.rawAddress, cchbuf.toInt()))

public actual fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFormatByteSizeA(dw.toInt(), pszbuf.rawAddress, cchbuf.toInt()))

public actual fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFormatByteSizeEx(ull.toLong(), flags, pszbuf.rawAddress, cchbuf.toInt())

public actual fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFormatByteSizeW(qdw, pszbuf.rawAddress, cchbuf.toInt()))

public actual fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFormatKBSizeA(qdw, pszbuf.rawAddress, cchbuf.toInt()))

public actual fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFormatKBSizeW(qdw, pszbuf.rawAddress, cchbuf.toInt()))

public actual fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFromTimeIntervalA(pszout.rawAddress, cchmax.toInt(), dwtimems.toInt(), digits)

public actual fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrFromTimeIntervalW(pszout.rawAddress, cchmax.toInt(), dwtimems.toInt(), digits)

public actual fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrIsIntlEqualA(fcasesens, pszstring1.rawAddress, pszstring2.rawAddress, nchar)

public actual fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrIsIntlEqualW(fcasesens, pszstring1.rawAddress, pszstring2.rawAddress, nchar)

public actual fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrNCatA(psz1.rawAddress, psz2.rawAddress, cchmax))

public actual fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrNCatW(psz1.rawAddress, psz2.rawAddress, cchmax))

public actual fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrPBrkA(psz.rawAddress, pszset.rawAddress))

public actual fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrPBrkW(psz.rawAddress, pszset.rawAddress))

public actual fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRChrA(pszstart.rawAddress, pszend.rawAddress, wmatch.toShort()))

public actual fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRChrIA(pszstart.rawAddress, pszend.rawAddress, wmatch.toShort()))

public actual fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRChrIW(pszstart.rawAddress, pszend.rawAddress, wmatch.toShort()))

public actual fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRChrW(pszstart.rawAddress, pszend.rawAddress, wmatch.toShort()))

public actual fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRStrIA(pszsource.rawAddress, pszlast.rawAddress, pszsrch.rawAddress))

public actual fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRStrIW(pszsource.rawAddress, pszlast.rawAddress, pszsrch.rawAddress))

public actual fun strRetToBSTR(pstr: MutPtr, pidl: ConstPtr, pbstr: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRetToBSTR(pstr.rawAddress, pidl.rawAddress, pbstr.rawAddress)

public actual fun strRetToBufA(pstr: MutPtr, pidl: ConstPtr, pszbuf: Pstr, cchbuf: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRetToBufA(pstr.rawAddress, pidl.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun strRetToBufW(pstr: MutPtr, pidl: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRetToBufW(pstr.rawAddress, pidl.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun strRetToStrA(pstr: MutPtr, pidl: ConstPtr, ppsz: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRetToStrA(pstr.rawAddress, pidl.rawAddress, ppsz.rawAddress)

public actual fun strRetToStrW(pstr: MutPtr, pidl: ConstPtr, ppsz: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrRetToStrW(pstr.rawAddress, pidl.rawAddress, ppsz.rawAddress)

public actual fun strSpnA(psz: Pcstr, pszset: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrSpnA(psz.rawAddress, pszset.rawAddress)

public actual fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrSpnW(psz.rawAddress, pszset.rawAddress)

public actual fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrStrA(pszfirst.rawAddress, pszsrch.rawAddress))

public actual fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrStrIA(pszfirst.rawAddress, pszsrch.rawAddress))

public actual fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrStrIW(pszfirst.rawAddress, pszsrch.rawAddress))

public actual fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrStrNIW(pszfirst.rawAddress, pszsrch.rawAddress, cchmax.toInt()))

public actual fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrStrNW(pszfirst.rawAddress, pszsrch.rawAddress, cchmax.toInt()))

public actual fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    MutPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrStrW(pszfirst.rawAddress, pszsrch.rawAddress))

public actual fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrToInt64ExA(pszstring.rawAddress, dwflags, pllret.rawAddress)

public actual fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrToInt64ExW(pszstring.rawAddress, dwflags, pllret.rawAddress)

public actual fun strToIntA(pszsrc: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrToIntA(pszsrc.rawAddress)

public actual fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrToIntExA(pszstring.rawAddress, dwflags, piret.rawAddress)

public actual fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: MutPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrToIntExW(pszstring.rawAddress, dwflags, piret.rawAddress)

public actual fun strToIntW(pszsrc: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrToIntW(pszsrc.rawAddress)

public actual fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrTrimA(psz.rawAddress, psztrimchars.rawAddress)

public actual fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellStrTrimW(psz.rawAddress, psztrimchars.rawAddress)

public actual fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUnloadUserProfile(htoken.rawAddress, hprofile.rawAddress)

public actual fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(registration)
}

public actual fun unregisterAppStateChangeNotification(registration: PappstateRegistration) {
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(registration)
}

public actual fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUnregisterScaleChangeEvent(dwcookie.toLong())

public actual fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlApplySchemeA(pszin.rawAddress, pszout.rawAddress, pcchout.rawAddress, dwflags.toInt())

public actual fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlApplySchemeW(pszin.rawAddress, pszout.rawAddress, pcchout.rawAddress, dwflags.toInt())

public actual fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCanonicalizeA(pszurl.rawAddress, pszcanonicalized.rawAddress, pcchcanonicalized.rawAddress, dwflags.toInt())

public actual fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCanonicalizeW(pszurl.rawAddress, pszcanonicalized.rawAddress, pcchcanonicalized.rawAddress, dwflags.toInt())

public actual fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCombineA(pszbase.rawAddress, pszrelative.rawAddress, pszcombined.rawAddress, pcchcombined.rawAddress, dwflags.toInt())

public actual fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCombineW(pszbase.rawAddress, pszrelative.rawAddress, pszcombined.rawAddress, pcchcombined.rawAddress, dwflags.toInt())

public actual fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCompareA(psz1.rawAddress, psz2.rawAddress, fignoreslash)

public actual fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCompareW(psz1.rawAddress, psz2.rawAddress, fignoreslash)

public actual fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCreateFromPathA(pszpath.rawAddress, pszurl.rawAddress, pcchurl.rawAddress, dwflags.toInt())

public actual fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlCreateFromPathW(pszpath.rawAddress, pszurl.rawAddress, pcchurl.rawAddress, dwflags.toInt())

public actual fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlEscapeA(pszurl.rawAddress, pszescaped.rawAddress, pcchescaped.rawAddress, dwflags.toInt())

public actual fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlEscapeW(pszurl.rawAddress, pszescaped.rawAddress, pcchescaped.rawAddress, dwflags.toInt())

public actual fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlFixupW(pcszurl.rawAddress, psztranslatedurl.rawAddress, cchmax.toInt())

public actual fun urlGetLocationA(pszurl: Pcstr): Pcstr =
    ConstPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlGetLocationA(pszurl.rawAddress))

public actual fun urlGetLocationW(pszurl: Pcwstr): Pcwstr =
    ConstPtr(WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlGetLocationW(pszurl.rawAddress))

public actual fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr, dwpart: UInt, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlGetPartA(pszin.rawAddress, pszout.rawAddress, pcchout.rawAddress, dwpart.toInt(), dwflags.toInt())

public actual fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr, dwpart: UInt, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlGetPartW(pszin.rawAddress, pszout.rawAddress, pcchout.rawAddress, dwpart.toInt(), dwflags.toInt())

public actual fun urlHashA(pszurl: Pcstr, pbhash: MutPtr, cbhash: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlHashA(pszurl.rawAddress, pbhash.rawAddress, cbhash.toInt())

public actual fun urlHashW(pszurl: Pcwstr, pbhash: MutPtr, cbhash: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlHashW(pszurl.rawAddress, pbhash.rawAddress, cbhash.toInt())

public actual fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlIsA(pszurl.rawAddress, urlis)

public actual fun urlIsNoHistoryA(pszurl: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlIsNoHistoryA(pszurl.rawAddress)

public actual fun urlIsNoHistoryW(pszurl: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlIsNoHistoryW(pszurl.rawAddress)

public actual fun urlIsOpaqueA(pszurl: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlIsOpaqueA(pszurl.rawAddress)

public actual fun urlIsOpaqueW(pszurl: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlIsOpaqueW(pszurl.rawAddress)

public actual fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlIsW(pszurl.rawAddress, urlis)

public actual fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlUnescapeA(pszurl.rawAddress, pszunescaped.rawAddress, pcchunescaped.rawAddress, dwflags.toInt())

public actual fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellUrlUnescapeW(pszurl.rawAddress, pszunescaped.rawAddress, pcchunescaped.rawAddress, dwflags.toInt())

public actual fun variantToStrRet(varin: ConstPtr, pstrret: MutPtr): Hresult =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellVariantToStrRet(varin.rawAddress, pstrret.rawAddress)

public actual fun whichPlatform(): UInt =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWhichPlatform().toUInt()

public actual fun win32DeleteFile(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWin32DeleteFile(pszpath.rawAddress)

public actual fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWinHelpA(hwndmain.rawAddress, lpszhelp.rawAddress, ucommand.toInt(), dwdata.toLong())

public actual fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWinHelpW(hwndmain.rawAddress, lpszhelp.rawAddress, ucommand.toInt(), dwdata.toLong())

public actual fun writeCabinetState(pcs: ConstPtr): Bool =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWriteCabinetState(pcs.rawAddress)

public actual fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWnsprintfA(pszdest.rawAddress, cchdest, pszfmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWnsprintfW(pszdest.rawAddress, cchdest, pszfmt.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: ConstPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWvnsprintfA(pszdest.rawAddress, cchdest, pszfmt.rawAddress, arglist.rawAddress)

public actual fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: ConstPtr): Int =
    WindowsWin32UiShellJniBridge.windowssysWindowsWin32UiShellWvnsprintfW(pszdest.rawAddress, cchdest, pszfmt.rawAddress, arglist.rawAddress)
