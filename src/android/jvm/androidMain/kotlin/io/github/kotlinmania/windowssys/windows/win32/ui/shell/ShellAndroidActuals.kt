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

private object WindowsWin32UiShellJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocCreateForClasses(rgclasses: Long, cclasses: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocGetPerceivedType(pszext: Long, ptype: Long, pflag: Long, ppsztype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocIsDangerous(pszassoc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocQueryKeyA(flags: Int, key: Int, pszassoc: Long, pszextra: Long, phkeyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocQueryKeyW(flags: Int, key: Int, pszassoc: Long, pszextra: Long, phkeyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocQueryStringA(flags: Int, str: Int, pszassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocQueryStringByKeyA(flags: Int, str: Int, hkassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocQueryStringByKeyW(flags: Int, str: Int, hkassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_assocQueryStringW(flags: Int, str: Int, pszassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_cdefFolderMenuCreate2(pidlfolder: Long, hwnd: Long, cidl: Int, apidl: Long, psf: Long, pfn: Long, nkeys: Int, ahkeys: Long, ppcm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_cidldataCreateFromIdarray(pidlfolder: Long, cidl: Int, apidl: Long, ppdtobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_chrCmpIA(w1: Short, w2: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_chrCmpIW(w1: Short, w2: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_colorAdjustLuma(clrrgb: Int, n: Int, fscale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_colorHLSToRGB(whue: Short, wluminance: Short, wsaturation: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_colorRGBToHLS(clrrgb: Int, pwhue: Long, pwluminance: Long, pwsaturation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_commandLineToArgvW(lpcmdline: Long, pnumargs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_connectToConnectionPoint(punk: Long, riidevent: Long, fconnect: Int, punktarget: Long, pdwcookie: Long, ppcpout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_createProfile(pszusersid: Long, pszusername: Long, pszprofilepath: Long, cchprofilepath: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dadAutoScroll(hwnd: Long, pad: Long, pptnow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dadDragLeave(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dadSetDragImage(him: Long, pptoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dadShowDragImage(fshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_defSubclassProc(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_deleteProfileA(lpsidstring: Long, lpprofilepath: Long, lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_deleteProfileW(lpsidstring: Long, lpprofilepath: Long, lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_doEnvironmentSubstA(pszsrc: Long, cchsrc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_doEnvironmentSubstW(pszsrc: Long, cchsrc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dragAcceptFiles(hwnd: Long, faccept: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dragFinish(hdrop: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dragQueryFileA(hdrop: Long, ifile: Int, lpszfile: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dragQueryFileW(hdrop: Long, ifile: Int, lpszfile: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_dragQueryPoint(hdrop: Long, ppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_driveType(idrive: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_duplicateIcon(hinst: Long, hicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractAssociatedIconA(hinst: Long, psziconpath: Long, piicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractAssociatedIconExA(hinst: Long, psziconpath: Long, piiconindex: Long, piiconid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractAssociatedIconExW(hinst: Long, psziconpath: Long, piiconindex: Long, piiconid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractAssociatedIconW(hinst: Long, psziconpath: Long, piicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractIconA(hinst: Long, pszexefilename: Long, niconindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractIconExA(lpszfile: Long, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractIconExW(lpszfile: Long, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_extractIconW(hinst: Long, pszexefilename: Long, niconindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_findExecutableA(lpfile: Long, lpdirectory: Long, lpresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_findExecutableW(lpfile: Long, lpdirectory: Long, lpresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getAcceptLanguagesA(pszlanguages: Long, pcchlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getAcceptLanguagesW(pszlanguages: Long, pcchlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getCurrentProcessExplicitAppUserModelID(appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getDpiForShellUIComponent(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getFileNameFromBrowse(hwnd: Long, pszfilepath: Long, cchfilepath: Int, pszworkingdir: Long, pszdefext: Long, pszfilters: Long, psztitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getMenuContextHelpId(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getMenuPosFromID(hmenu: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getProfileType(dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getProfilesDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getProfilesDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getScaleFactorForDevice(devicetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getScaleFactorForMonitor(hmon: Long, pscale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getUserProfileDirectoryA(htoken: Long, lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getUserProfileDirectoryW(htoken: Long, lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getWindowContextHelpId(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_getWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long, pdwrefdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hashData(pbdata: Long, cbdata: Int, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: Int, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateExtensionServices(pwzadditionalheaders: Long, phwnd: Long, pszusername: Long, pszpassword: Long, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: Long, pwzfriendlyname: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateFromString(pwztarget: Long, pwzlocation: Long, pwzfriendlyname: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateShortcut(grfhlshortcutf: Int, pihl: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromMoniker(grfhlshortcutf: Int, pimktarget: Long, pwzlocation: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromString(grfhlshortcutf: Int, pwztarget: Long, pwzlocation: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkGetSpecialReference(ureference: Int, ppwzreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkGetValueFromParams(pwzparams: Long, pwzname: Long, ppwzvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkIsShortcut(pwzfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: Int, pbc: Long, pibsc: Long, pihlbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkNavigateToStringReference(pwztarget: Long, pwzlocation: Long, pihlsite: Long, dwsitedata: Int, pihlframe: Long, grfhlnf: Int, pibc: Long, pibsc: Long, pihlbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: Int, pimktarget: Long, pwzlocation: Long, pwzfriendlyname: Long, puhlid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkOnRenameDocument(dwreserved: Int, pihlbc: Long, pimkold: Long, pimknew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkParseDisplayName(pibc: Long, pwzdisplayname: Long, fnoforceabs: Int, pccheaten: Long, ppimk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkQueryCreateFromData(pidataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkResolveMonikerForData(pimkreference: Long, reserved: Int, pibc: Long, cfmtetc: Int, rgfmtetc: Long, pibsc: Long, pimkbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkResolveShortcut(pwzshortcutfilename: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkResolveShortcutToMoniker(pwzshortcutfilename: Long, ppimktarget: Long, ppwzlocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkResolveShortcutToString(pwzshortcutfilename: Long, ppwztarget: Long, ppwzlocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkResolveStringForData(pwzreference: Long, reserved: Int, pibc: Long, cfmtetc: Int, rgfmtetc: Long, pibsc: Long, pimkbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkSetSpecialReference(ureference: Int, pwzreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkTranslateURL(pwzurl: Long, grfflags: Int, ppwztranslatedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_hlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: Int, pimktrgt: Long, pwzlocation: Long, pwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLAppendID(pidl: Long, pmkid: Long, fappend: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLClone(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLCloneFirst(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLCombine(pidl1: Long, pidl2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLCreateFromPathA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLCreateFromPathW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLFindChild(pidlparent: Long, pidlchild: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLFindLastID(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLFree(pidl: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLGetNext(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLGetSize(pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLIsEqual(pidl1: Long, pidl2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLIsParent(pidl1: Long, pidl2: Long, fimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLLoadFromStreamEx(pstm: Long, pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLRemoveLastID(pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iLSaveToStream(pstm: Long, pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamCopy(pstmfrom: Long, pstmto: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamRead(pstm: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamReadPidl(pstm: Long, ppidlout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamReadStr(pstm: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamReset(pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamSize(pstm: Long, pui: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamWrite(pstm: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamWritePidl(pstm: Long, pidlwrite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_istreamWriteStr(pstm: Long, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iunknownAtomicRelease(ppunk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iunknownGetSite(punk: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iunknownGetWindow(punk: Long, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iunknownQueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iunknownSet(ppunk: Long, punk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_iunknownSetSite(punk: Long, punksite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_importPrivacySettings(pszfilename: Long, pfparseprivacypreferences: Long, pfparsepersiterules: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_initNetworkAddressControl(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_initPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_initVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_intlStrEqWorkerA(fcasesens: Int, lpstring1: Long, lpstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_intlStrEqWorkerW(fcasesens: Int, lpstring1: Long, lpstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isCharSpaceA(wch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isCharSpaceW(wch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isInternetESCEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isLFNDriveA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isLFNDriveW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isNetDrive(idrive: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isOS(dwos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_isUserAnAdmin(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_loadUserProfileA(htoken: Long, lpprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_loadUserProfileW(htoken: Long, lpprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_oleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_openRegStream(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_parseURLA(pcszurl: Long, ppu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_parseURLW(pcszurl: Long, ppu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAddBackslashA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAddBackslashW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAddExtensionA(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAddExtensionW(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAllocCanonicalize(pszpathin: Long, dwflags: Int, ppszpathout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAllocCombine(pszpathin: Long, pszmore: Long, dwflags: Int, ppszpathout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAppendA(pszpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathAppendW(pszpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathBuildRootA(pszroot: Long, idrive: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathBuildRootW(pszroot: Long, idrive: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCanonicalizeA(pszbuf: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCanonicalizeW(pszbuf: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchAddBackslash(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchAddBackslashEx(pszpath: Long, cchpath: Long, ppszend: Long, pcchremaining: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchAddExtension(pszpath: Long, cchpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchAppend(pszpath: Long, cchpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchAppendEx(pszpath: Long, cchpath: Long, pszmore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchCanonicalize(pszpathout: Long, cchpathout: Long, pszpathin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchCanonicalizeEx(pszpathout: Long, cchpathout: Long, pszpathin: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchCombine(pszpathout: Long, cchpathout: Long, pszpathin: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchCombineEx(pszpathout: Long, cchpathout: Long, pszpathin: Long, pszmore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchFindExtension(pszpath: Long, cchpath: Long, ppszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchIsRoot(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchRemoveBackslash(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchRemoveBackslashEx(pszpath: Long, cchpath: Long, ppszend: Long, pcchremaining: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchRemoveExtension(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchRemoveFileSpec(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchRenameExtension(pszpath: Long, cchpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchSkipRoot(pszpath: Long, ppszrootend: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchStripPrefix(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCchStripToRoot(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCleanupSpec(pszdir: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCombineA(pszdest: Long, pszdir: Long, pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCombineW(pszdest: Long, pszdir: Long, pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCommonPrefixA(pszfile1: Long, pszfile2: Long, achpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCommonPrefixW(pszfile1: Long, pszfile2: Long, achpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCompactPathA(hdc: Long, pszpath: Long, dx: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCompactPathExA(pszout: Long, pszsrc: Long, cchmax: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCompactPathExW(pszout: Long, pszsrc: Long, cchmax: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCompactPathW(hdc: Long, pszpath: Long, dx: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCreateFromUrlA(pszurl: Long, pszpath: Long, pcchpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCreateFromUrlAlloc(pszin: Long, ppszout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathCreateFromUrlW(pszurl: Long, pszpath: Long, pcchpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFileExistsA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFileExistsW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindExtensionA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindExtensionW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindFileNameA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindFileNameW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindNextComponentA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindNextComponentW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindOnPathA(pszpath: Long, ppszotherdirs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindOnPathW(pszpath: Long, ppszotherdirs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindSuffixArrayA(pszpath: Long, apszsuffix: Long, iarraysize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathFindSuffixArrayW(pszpath: Long, apszsuffix: Long, iarraysize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathGetArgsA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathGetArgsW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathGetCharTypeA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathGetCharTypeW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathGetDriveNumberA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathGetDriveNumberW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathGetShortPath(pszlongpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsContentTypeA(pszpath: Long, pszcontenttype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsContentTypeW(pszpath: Long, pszcontenttype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsDirectoryA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsDirectoryW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsExe(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsFileSpecA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsFileSpecW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsLFNFileSpecA(pszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsLFNFileSpecW(pszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsNetworkPathA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsNetworkPathW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsPrefixA(pszprefix: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsPrefixW(pszprefix: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsRelativeA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsRelativeW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsRootA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsRootW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsSameRootA(pszpath1: Long, pszpath2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsSameRootW(pszpath1: Long, pszpath2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsSlowA(pszfile: Long, dwattr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsSlowW(pszfile: Long, dwattr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsSystemFolderA(pszpath: Long, dwattrb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsSystemFolderW(pszpath: Long, dwattrb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsUNCA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsUNCEx(pszpath: Long, ppszserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsUNCServerA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsUNCServerShareA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsUNCServerShareW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsUNCServerW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsUNCW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsURLA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathIsURLW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMakePrettyA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMakePrettyW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMakeSystemFolderA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMakeSystemFolderW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMakeUniqueName(pszuniquename: Long, cchmax: Int, psztemplate: Long, pszlongplate: Long, pszdir: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMatchSpecA(pszfile: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMatchSpecExA(pszfile: Long, pszspec: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMatchSpecExW(pszfile: Long, pszspec: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathMatchSpecW(pszfile: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathParseIconLocationA(psziconfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathParseIconLocationW(psziconfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathQualify(psz: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathQuoteSpacesA(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathQuoteSpacesW(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRelativePathToA(pszpath: Long, pszfrom: Long, dwattrfrom: Int, pszto: Long, dwattrto: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRelativePathToW(pszpath: Long, pszfrom: Long, dwattrfrom: Int, pszto: Long, dwattrto: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveArgsA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveArgsW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveBackslashA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveBackslashW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveBlanksA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveBlanksW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveExtensionA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveExtensionW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveFileSpecA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRemoveFileSpecW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRenameExtensionA(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathRenameExtensionW(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathResolve(pszpath: Long, dirs: Long, fflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathSearchAndQualifyA(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathSearchAndQualifyW(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathSetDlgItemPathA(hdlg: Long, id: Int, pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathSetDlgItemPathW(hdlg: Long, id: Int, pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathSkipRootA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathSkipRootW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathStripPathA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathStripPathW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathStripToRootA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathStripToRootW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsA(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsW(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUndecorateA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUndecorateW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUnquoteSpacesA(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathUnquoteSpacesW(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pathYetAnotherMakeUniqueName(pszuniquename: Long, pszpath: Long, pszshort: Long, pszfilespec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_pickIconDlg(hwnd: Long, psziconpath: Long, cchiconpath: Int, piiconindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_propVariantToStrRet(propvar: Long, pstrret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_qISearch(that: Long, pqit: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_readCabinetState(pcs: Long, clength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_realDriveType(idrive: Int, foktohitnet: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_registerAppConstrainedChangeNotification(routine: Long, context: Long, registration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_registerAppStateChangeNotification(routine: Long, context: Long, registration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_registerScaleChangeEvent(hevent: Long, pdwcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_registerScaleChangeNotifications(displaydevice: Int, hwndnotify: Long, umsgnotify: Int, pdwcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_removeWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_restartDialog(hwnd: Long, pszprompt: Long, dwreturn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_restartDialogEx(hwnd: Long, pszprompt: Long, dwreturn: Int, dwreasoncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_revokeScaleChangeNotifications(displaydevice: Int, dwcookie: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAddToRecentDocs(uflags: Int, pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAlloc(cb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAllocShared(pvdata: Long, dwsize: Int, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAnsiToAnsi(pszsrc: Long, pszdst: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAnsiToUnicode(pszsrc: Long, pwszdst: Long, cwchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAppBarMessage(dwmessage: Int, pdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAssocEnumHandlers(pszextra: Long, affilter: Int, ppenumhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAssocEnumHandlersForProtocolByApplication(protocol: Long, riid: Long, enumhandlers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHAutoComplete(hwndedit: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHBrowseForFolderA(lpbi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHBrowseForFolderW(lpbi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCLSIDFromString(psz: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shchangeNotificationLock(hchange: Long, dwprocid: Int, pppidl: Long, plevent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shchangeNotificationUnlock(hlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHChangeNotify(weventid: Int, uflags: Int, dwitem1: Long, dwitem2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHChangeNotifyDeregister(ulid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHChangeNotifyRegister(hwnd: Long, fsources: Int, fevents: Int, wmsg: Int, centries: Int, pshcne: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHChangeNotifyRegisterThread(status: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCloneSpecialIDList(hwnd: Long, csidl: Int, fcreate: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCoCreateInstance(pszclsid: Long, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCopyKeyA(hkeysrc: Long, pszsrcsubkey: Long, hkeydest: Long, freserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCopyKeyW(hkeysrc: Long, pszsrcsubkey: Long, hkeydest: Long, freserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateAssociationRegistration(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateDataObject(pidlfolder: Long, cidl: Int, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateDefaultExtractIcon(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateDirectory(hwnd: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateDirectoryExA(hwnd: Long, pszpath: Long, psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateDirectoryExW(hwnd: Long, pszpath: Long, psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateFileExtractIconW(pszfile: Long, dwfileattributes: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateItemFromParsingName(pszpath: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateItemFromRelativeName(psiparent: Long, pszname: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateItemInKnownFolder(kfid: Long, dwkfflags: Int, pszitem: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateMemStream(pinit: Long, cbinit: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateProcessAsUserW(pscpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreatePropSheetExtArray(hkey: Long, pszsubkey: Long, maxIface: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellFolderView(pcsfv: Long, ppsv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: Int, ppidl: Long, ppsiitemarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromIDLists(cidl: Int, rgpidl: Long, ppsiitemarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateShellPalette(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateStdEnumFmtEtc(cfmt: Int, afmt: Long, ppenumformatetc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateStreamOnFileA(pszfile: Long, grfmode: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateStreamOnFileEx(pszfile: Long, grfmode: Int, dwattributes: Int, fcreate: Int, pstmtemplate: Long, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateStreamOnFileW(pszfile: Long, grfmode: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateThread(pfnthreadproc: Long, pdata: Long, flags: Int, pfncallback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateThreadRef(pcref: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHCreateThreadWithHandle(pfnthreadproc: Long, pdata: Long, flags: Int, pfncallback: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDefExtractIconA(psziconfile: Long, iindex: Int, uflags: Int, phiconlarge: Long, phiconsmall: Long, niconsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDefExtractIconW(psziconfile: Long, iindex: Int, uflags: Int, phiconlarge: Long, phiconsmall: Long, niconsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyA(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyW(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDeleteKeyA(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDeleteKeyW(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDeleteValueA(hkey: Long, pszsubkey: Long, pszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDeleteValueW(hkey: Long, pszsubkey: Long, pszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDestroyPropSheetExtArray(hpsxa: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHDoDragDrop(hwnd: Long, pdata: Long, pdsrc: Long, dweffect: Int, pdweffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEmptyRecycleBinA(hwnd: Long, pszrootpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEmptyRecycleBinW(hwnd: Long, pszrootpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEnumKeyExA(hkey: Long, dwindex: Int, pszname: Long, pcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEnumKeyExW(hkey: Long, dwindex: Int, pszname: Long, pcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEnumValueA(hkey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEnumValueW(hkey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEnumerateUnreadMailAccountsW(hkeyuser: Long, dwindex: Int, pszmailaddress: Long, cchmailaddress: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHEvaluateSystemCommandTemplate(pszcmdtemplate: Long, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFileOperationA(lpfileop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFileOperationW(lpfileop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFindFiles(pidlfolder: Long, pidlsavefile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shfindInitMenuPopup(hmenu: Long, hwndowner: Long, idcmdfirst: Int, idcmdlast: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFlushSFCache()

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFormatDrive(hwnd: Long, drive: Int, fmtid: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFreeNameMappings(hnamemappings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHFreeShared(hdata: Long, dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetAttributesFromDataObject(pdo: Long, dwattributemask: Int, pdwattributes: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetDataFromIDListA(psf: Long, pidl: Long, nformat: Int, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetDataFromIDListW(psf: Long, pidl: Long, nformat: Int, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetDesktopFolder(ppshf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExA(pszdirectoryname: Long, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExW(pszdirectoryname: Long, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetDriveMedia(pszdrive: Long, pdwmediacontent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetFileInfoA(pszpath: Long, dwfileattributes: Int, psfi: Long, cbfileinfo: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetFileInfoW(pszpath: Long, dwfileattributes: Int, psfi: Long, cbfileinfo: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetFolderLocation(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetFolderPathA(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirA(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszsubdir: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirW(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszsubdir: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetFolderPathW(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetIDListFromObject(punk: Long, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexA(psziconpath: Long, iiconindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexW(psziconpath: Long, iiconindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetInstanceExplorer(ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetInverseCMAP(pbmap: Long, cbmap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetItemFromDataObject(pdtobj: Long, dwflags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetItemFromObject(punk: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetKnownFolderIDList(rfid: Long, dwflags: Int, htoken: Long, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetKnownFolderItem(rfid: Long, flags: Int, htoken: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetKnownFolderPath(rfid: Long, dwflags: Int, htoken: Long, ppszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetLocalizedName(pszpath: Long, pszresmodule: Long, cch: Int, pidsres: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetMalloc(ppmalloc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetNameFromIDList(pidl: Long, sigdnname: Int, ppszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetNewLinkInfoA(pszlinkto: Long, pszdir: Long, pszname: Long, pfmustcopy: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetNewLinkInfoW(pszlinkto: Long, pszdir: Long, pszname: Long, pfmustcopy: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetPathFromIDListA(pidl: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetPathFromIDListEx(pidl: Long, pszpath: Long, cchpath: Int, uopts: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetPathFromIDListW(pidl: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetSetFolderCustomSettings(pfcs: Long, pszpath: Long, dwreadwrite: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetSetSettings(lpss: Long, dwmask: Int, bset: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetSettings(psfs: Long, dwmask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetSpecialFolderLocation(hwnd: Long, csidl: Int, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathA(hwnd: Long, pszpath: Long, csidl: Int, fcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathW(hwnd: Long, pszpath: Long, csidl: Int, fcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetStockIconInfo(siid: Int, uflags: Int, psii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetThreadRef(ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetUnreadMailCountW(hkeyuser: Long, pszmailaddress: Long, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: Long, cchshellexecutecommand: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGetViewStatePropertyBag(pidl: Long, pszbagname: Long, dwflags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGlobalCounterDecrement(id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGlobalCounterGetValue(id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHGlobalCounterIncrement(id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHHandleUpdateImage(pidlextra: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHILCreateFromPath(pszpath: Long, ppidl: Long, rgfinout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHInvokePrinterCommandA(hwnd: Long, uaction: Int, lpbuf1: Long, lpbuf2: Long, fmodal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHInvokePrinterCommandW(hwnd: Long, uaction: Int, lpbuf1: Long, lpbuf2: Long, fmodal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHIsFileAvailableOffline(pwszpath: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHIsLowMemoryMachine(dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHLimitInputEdit(hwndedit: Long, psf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHLoadInProc(rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHLoadIndirectString(pszsource: Long, pszoutbuf: Long, cchoutbuf: Int, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHLoadNonloadedIconOverlayIdentifiers(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHLockShared(hdata: Long, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHMessageBoxCheckA(hwnd: Long, psztext: Long, pszcaption: Long, utype: Int, idefault: Int, pszregval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHMessageBoxCheckW(hwnd: Long, psztext: Long, pszcaption: Long, utype: Int, idefault: Int, pszregval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHMultiFileProperties(pdtobj: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHObjectProperties(hwnd: Long, shopobjecttype: Int, pszobjectname: Long, pszpropertypage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHOpenFolderAndSelectItems(pidlfolder: Long, cidl: Int, apidl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHOpenPropSheetW(pszcaption: Long, ahkeys: Long, ckeys: Int, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHOpenRegStream2A(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHOpenRegStream2W(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHOpenRegStreamA(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHOpenRegStreamW(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHOpenWithDialog(hwndparent: Long, poainfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHParseDisplayName(pszname: Long, pbc: Long, ppidl: Long, sfgaoin: Int, psfgaoout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHPathPrepareForWriteA(hwnd: Long, punkenablemodless: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHPathPrepareForWriteW(hwnd: Long, punkenablemodless: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHQueryInfoKeyA(hkey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHQueryInfoKeyW(hkey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHQueryRecycleBinA(pszrootpath: Long, pshqueryrbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHQueryRecycleBinW(pszrootpath: Long, pshqueryrbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHQueryUserNotificationState(pquns: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHQueryValueExA(hkey: Long, pszvalue: Long, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHQueryValueExW(hkey: Long, pszvalue: Long, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegCloseUSKey(huskey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegCreateUSKeyA(pszpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegCreateUSKeyW(pwzpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegDeleteUSValueA(huskey: Long, pszvalue: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegDeleteUSValueW(huskey: Long, pwzvalue: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegDuplicateHKey(hkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegEnumUSKeyA(huskey: Long, dwindex: Int, pszname: Long, pcchname: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegEnumUSKeyW(huskey: Long, dwindex: Int, pwzname: Long, pcchname: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegEnumUSValueA(huskey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegEnumUSValueW(huskey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueA(pszsubkey: Long, pszvalue: Long, fignorehkcu: Int, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueW(pszsubkey: Long, pszvalue: Long, fignorehkcu: Int, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetIntW(hk: Long, pwzkey: Long, idefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetPathA(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetPathW(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetUSValueA(pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetUSValueW(pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetValueFromHKCUHKLM(pwszkey: Long, pwszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegGetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegOpenUSKeyA(pszpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegOpenUSKeyW(pwzpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegQueryUSValueA(huskey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegQueryUSValueW(huskey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegSetPathA(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pcszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegSetPathW(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pcszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegSetUSValueA(pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegSetUSValueW(pwzsubkey: Long, pwzvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegWriteUSValueA(huskey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRegWriteUSValueW(huskey: Long, pwzvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHReleaseThreadRef(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRemoveLocalizedName(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHResolveLibrary(psilibrary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHRestricted(rest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSendMessageBroadcastA(umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSendMessageBroadcastW(umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetDefaultProperties(hwnd: Long, psi: Long, dwfileopflags: Int, pfops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetFolderPathA(csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetFolderPathW(csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetInstanceExplorer(punk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetKnownFolderPath(rfid: Long, dwflags: Int, htoken: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetLocalizedName(pszpath: Long, pszresmodule: Long, idsres: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetThreadRef(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetUnreadMailCountW(pszmailaddress: Long, dwcount: Int, pszshellexecutecommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shshellFolderViewMessage(hwndmain: Long, umsg: Int, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHShowManageLibraryUI(psilibrary: Long, hwndowner: Long, psztitle: Long, pszinstruction: Long, lmdoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSimpleIDListFromPath(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHSkipJunction(pbc: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHStartNetConnectionDialogW(hwnd: Long, pszremotename: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHStrDupA(psz: Long, ppwsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHStrDupW(psz: Long, ppwsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHStripMneumonicA(pszmenu: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHStripMneumonicW(pszmenu: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHTestTokenMembership(htoken: Long, ulrid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHUnicodeToAnsi(pwszsrc: Long, pszdst: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHUnicodeToUnicode(pwzsrc: Long, pwzdst: Long, cwchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHUnlockShared(pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHUpdateImageA(pszhashitem: Long, iindex: Int, uflags: Int, iimageindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHUpdateImageW(pszhashitem: Long, iindex: Int, uflags: Int, iimageindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_sHValidateUNC(hwndowner: Long, pszfile: Long, fconnect: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_setCurrentProcessExplicitAppUserModelID(appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_setMenuContextHelpId(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_setWindowContextHelpId(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_setWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long, dwrefdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellAboutA(hwnd: Long, szapp: Long, szotherstuff: Long, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellAboutW(hwnd: Long, szapp: Long, szotherstuff: Long, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellExecuteA(hwnd: Long, lpoperation: Long, lpfile: Long, lpparameters: Long, lpdirectory: Long, nshowcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellExecuteExA(pexecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellExecuteExW(pexecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellExecuteW(hwnd: Long, lpoperation: Long, lpfile: Long, lpparameters: Long, lpdirectory: Long, nshowcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellMessageBoxA(happinst: Long, hwnd: Long, lpctext: Long, lpctitle: Long, fustyle: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellMessageBoxW(happinst: Long, hwnd: Long, lpctext: Long, lpctitle: Long, fustyle: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellGetCachedImageIndex(pwsziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellGetCachedImageIndexA(psziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellGetCachedImageIndexW(psziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellGetImageLists(phiml: Long, phimlsmall: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellMergeMenus(hmdst: Long, hmsrc: Long, uinsert: Int, uidadjust: Int, uidadjustmax: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellNotifyIconA(dwmessage: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellNotifyIconGetRect(identifier: Long, iconlocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_shellNotifyIconW(dwmessage: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_signalFileOpen(pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_softwareUpdateMessageBox(hwnd: Long, pszdistunit: Long, dwflags: Int, psdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_stgMakeUniqueName(pstgparent: Long, pszfilespec: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCSpnA(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCSpnIA(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCSpnIW(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCSpnW(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCatBuffA(pszdest: Long, pszsrc: Long, cchdestbuffsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCatBuffW(pszdest: Long, pszsrc: Long, cchdestbuffsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCatChainW(pszdst: Long, cchdst: Int, ichat: Int, pszsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCatW(psz1: Long, psz2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strChrA(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strChrIA(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strChrIW(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strChrNIW(pszstart: Long, wmatch: Short, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strChrNW(pszstart: Long, wmatch: Short, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strChrW(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpCA(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpCW(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpICA(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpICW(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpIW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpLogicalW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNA(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNCA(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNCW(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNIA(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNICA(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNICW(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNIW(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpNW(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCmpW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCpyNW(pszdst: Long, pszsrc: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strCpyW(psz1: Long, psz2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strDupA(pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strDupW(pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFormatByteSize64A(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFormatByteSizeA(dw: Int, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFormatByteSizeEx(ull: Long, flags: Int, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFormatByteSizeW(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFormatKBSizeA(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFormatKBSizeW(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFromTimeIntervalA(pszout: Long, cchmax: Int, dwtimems: Int, digits: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strFromTimeIntervalW(pszout: Long, cchmax: Int, dwtimems: Int, digits: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strIsIntlEqualA(fcasesens: Int, pszstring1: Long, pszstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strIsIntlEqualW(fcasesens: Int, pszstring1: Long, pszstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strNCatA(psz1: Long, psz2: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strNCatW(psz1: Long, psz2: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strPBrkA(psz: Long, pszset: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strPBrkW(psz: Long, pszset: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRChrA(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRChrIA(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRChrIW(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRChrW(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRStrIA(pszsource: Long, pszlast: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRStrIW(pszsource: Long, pszlast: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRetToBufA(pstr: Long, pidl: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRetToBufW(pstr: Long, pidl: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRetToStrA(pstr: Long, pidl: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strRetToStrW(pstr: Long, pidl: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strSpnA(psz: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strSpnW(psz: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strStrA(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strStrIA(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strStrIW(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strStrNIW(pszfirst: Long, pszsrch: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strStrNW(pszfirst: Long, pszsrch: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strStrW(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strToInt64ExA(pszstring: Long, dwflags: Int, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strToInt64ExW(pszstring: Long, dwflags: Int, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strToIntA(pszsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strToIntExA(pszstring: Long, dwflags: Int, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strToIntExW(pszstring: Long, dwflags: Int, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strToIntW(pszsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strTrimA(psz: Long, psztrimchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_strTrimW(psz: Long, psztrimchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_unloadUserProfile(htoken: Long, hprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_unregisterAppConstrainedChangeNotification(registration: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_unregisterAppStateChangeNotification(registration: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_unregisterScaleChangeEvent(dwcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlApplySchemeA(pszin: Long, pszout: Long, pcchout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlApplySchemeW(pszin: Long, pszout: Long, pcchout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCanonicalizeA(pszurl: Long, pszcanonicalized: Long, pcchcanonicalized: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCanonicalizeW(pszurl: Long, pszcanonicalized: Long, pcchcanonicalized: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCombineA(pszbase: Long, pszrelative: Long, pszcombined: Long, pcchcombined: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCombineW(pszbase: Long, pszrelative: Long, pszcombined: Long, pcchcombined: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCompareA(psz1: Long, psz2: Long, fignoreslash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCompareW(psz1: Long, psz2: Long, fignoreslash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCreateFromPathA(pszpath: Long, pszurl: Long, pcchurl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlCreateFromPathW(pszpath: Long, pszurl: Long, pcchurl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlEscapeA(pszurl: Long, pszescaped: Long, pcchescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlEscapeW(pszurl: Long, pszescaped: Long, pcchescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlFixupW(pcszurl: Long, psztranslatedurl: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlGetLocationA(pszurl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlGetLocationW(pszurl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlGetPartA(pszin: Long, pszout: Long, pcchout: Long, dwpart: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlGetPartW(pszin: Long, pszout: Long, pcchout: Long, dwpart: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlHashA(pszurl: Long, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlHashW(pszurl: Long, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlIsA(pszurl: Long, urlis: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlIsNoHistoryA(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlIsNoHistoryW(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlIsOpaqueA(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlIsOpaqueW(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlIsW(pszurl: Long, urlis: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlUnescapeA(pszurl: Long, pszunescaped: Long, pcchunescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_urlUnescapeW(pszurl: Long, pszunescaped: Long, pcchunescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_variantToStrRet(varin: Long, pstrret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_whichPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_win32DeleteFile(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_winHelpA(hwndmain: Long, lpszhelp: Long, ucommand: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_winHelpW(hwndmain: Long, lpszhelp: Long, ucommand: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_writeCabinetState(pcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_wnsprintfA(pszdest: Long, cchdest: Int, pszfmt: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_wnsprintfW(pszdest: Long, cchdest: Int, pszfmt: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_wvnsprintfA(pszdest: Long, cchdest: Int, pszfmt: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_wvnsprintfW(pszdest: Long, cchdest: Int, pszfmt: Long, arglist: Long): Int
}

public actual fun assocCreate(clsid: Guid, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    0

public actual fun assocCreateForClasses(rgclasses: COpaquePointer?, cclasses: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocCreateForClasses((rgclasses?.value ?: 0L), cclasses.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun assocGetDetailsOfPropKey(psf: COpaquePointer?, pidl: COpaquePointer?, pkey: COpaquePointer?, pv: COpaquePointer?, pffoundpropkey: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocGetDetailsOfPropKey((psf?.value ?: 0L), (pidl?.value ?: 0L), (pkey?.value ?: 0L), (pv?.value ?: 0L), (pffoundpropkey?.value ?: 0L))

public actual fun assocGetPerceivedType(pszext: Pcwstr, ptype: COpaquePointer?, pflag: COpaquePointer?, ppsztype: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocGetPerceivedType((pszext?.value ?: 0L), (ptype?.value ?: 0L), (pflag?.value ?: 0L), (ppsztype?.value ?: 0L))

public actual fun assocIsDangerous(pszassoc: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocIsDangerous((pszassoc?.value ?: 0L))

public actual fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocQueryKeyA(flags.toInt(), key, (pszassoc?.value ?: 0L), (pszextra?.value ?: 0L), (phkeyout?.value ?: 0L))

public actual fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocQueryKeyW(flags.toInt(), key, (pszassoc?.value ?: 0L), (pszextra?.value ?: 0L), (phkeyout?.value ?: 0L))

public actual fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocQueryStringA(flags.toInt(), str, (pszassoc?.value ?: 0L), (pszextra?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L))

public actual fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocQueryStringByKeyA(flags.toInt(), str, (hkassoc?.value ?: 0L), (pszextra?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L))

public actual fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocQueryStringByKeyW(flags.toInt(), str, (hkassoc?.value ?: 0L), (pszextra?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L))

public actual fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_assocQueryStringW(flags.toInt(), str, (pszassoc?.value ?: 0L), (pszextra?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L))

public actual fun cdefFolderMenuCreate2(pidlfolder: COpaquePointer?, hwnd: Hwnd, cidl: UInt, apidl: COpaquePointer?, psf: COpaquePointer?, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: COpaquePointer?, ppcm: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_cdefFolderMenuCreate2((pidlfolder?.value ?: 0L), (hwnd?.value ?: 0L), cidl.toInt(), (apidl?.value ?: 0L), (psf?.value ?: 0L), 0L, nkeys.toInt(), (ahkeys?.value ?: 0L), (ppcm?.value ?: 0L))

public actual fun cidldataCreateFromIdarray(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, ppdtobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_cidldataCreateFromIdarray((pidlfolder?.value ?: 0L), cidl.toInt(), (apidl?.value ?: 0L), (ppdtobj?.value ?: 0L))

public actual fun chrCmpIA(w1: UShort, w2: UShort): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_chrCmpIA(w1.toShort(), w2.toShort())

public actual fun chrCmpIW(w1: UShort, w2: UShort): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_chrCmpIW(w1.toShort(), w2.toShort())

public actual fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_colorAdjustLuma(clrrgb.toInt(), n, fscale).toUInt()

public actual fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_colorHLSToRGB(whue.toShort(), wluminance.toShort(), wsaturation.toShort()).toUInt()

public actual fun colorRGBToHLS(clrrgb: Colorref, pwhue: COpaquePointer?, pwluminance: COpaquePointer?, pwsaturation: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_colorRGBToHLS(clrrgb.toInt(), (pwhue?.value ?: 0L), (pwluminance?.value ?: 0L), (pwsaturation?.value ?: 0L))
}

public actual fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_commandLineToArgvW((lpcmdline?.value ?: 0L), (pnumargs?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun connectToConnectionPoint(punk: COpaquePointer?, riidevent: COpaquePointer?, fconnect: Bool, punktarget: COpaquePointer?, pdwcookie: COpaquePointer?, ppcpout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_connectToConnectionPoint((punk?.value ?: 0L), (riidevent?.value ?: 0L), fconnect, (punktarget?.value ?: 0L), (pdwcookie?.value ?: 0L), (ppcpout?.value ?: 0L))

public actual fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_createProfile((pszusersid?.value ?: 0L), (pszusername?.value ?: 0L), (pszprofilepath?.value ?: 0L), cchprofilepath.toInt())

public actual fun dadAutoScroll(hwnd: Hwnd, pad: COpaquePointer?, pptnow: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dadAutoScroll((hwnd?.value ?: 0L), (pad?.value ?: 0L), (pptnow?.value ?: 0L))

public actual fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool =
    0

public actual fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: COpaquePointer?): Bool =
    0

public actual fun dadDragLeave(): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dadDragLeave()

public actual fun dadDragMove(pt: Point): Bool =
    0

public actual fun dadSetDragImage(him: Himagelist, pptoffset: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dadSetDragImage(him, (pptoffset?.value ?: 0L))

public actual fun dadShowDragImage(fshow: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dadShowDragImage(fshow)

public actual fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_defSubclassProc((hwnd?.value ?: 0L), umsg.toInt(), wparam.toLong(), lparam)

public actual fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_deleteProfileA((lpsidstring?.value ?: 0L), (lpprofilepath?.value ?: 0L), (lpcomputername?.value ?: 0L))

public actual fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_deleteProfileW((lpsidstring?.value ?: 0L), (lpprofilepath?.value ?: 0L), (lpcomputername?.value ?: 0L))

public actual fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_doEnvironmentSubstA((pszsrc?.value ?: 0L), cchsrc.toInt()).toUInt()

public actual fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_doEnvironmentSubstW((pszsrc?.value ?: 0L), cchsrc.toInt()).toUInt()

public actual fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dragAcceptFiles((hwnd?.value ?: 0L), faccept)
}

public actual fun dragFinish(hdrop: Hdrop) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dragFinish((hdrop?.value ?: 0L))
}

public actual fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dragQueryFileA((hdrop?.value ?: 0L), ifile.toInt(), (lpszfile?.value ?: 0L), cch.toInt()).toUInt()

public actual fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dragQueryFileW((hdrop?.value ?: 0L), ifile.toInt(), (lpszfile?.value ?: 0L), cch.toInt()).toUInt()

public actual fun dragQueryPoint(hdrop: Hdrop, ppt: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_dragQueryPoint((hdrop?.value ?: 0L), (ppt?.value ?: 0L))

public actual fun driveType(idrive: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_driveType(idrive)

public actual fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_duplicateIcon((hinst?.value ?: 0L), (hicon?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: COpaquePointer?): Hicon =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractAssociatedIconA((hinst?.value ?: 0L), (psziconpath?.value ?: 0L), (piicon?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractAssociatedIconExA((hinst?.value ?: 0L), (psziconpath?.value ?: 0L), (piiconindex?.value ?: 0L), (piiconid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: COpaquePointer?, piiconid: COpaquePointer?): Hicon =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractAssociatedIconExW((hinst?.value ?: 0L), (psziconpath?.value ?: 0L), (piiconindex?.value ?: 0L), (piiconid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: COpaquePointer?): Hicon =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractAssociatedIconW((hinst?.value ?: 0L), (psziconpath?.value ?: 0L), (piicon?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractIconA((hinst?.value ?: 0L), (pszexefilename?.value ?: 0L), niconindex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractIconExA((lpszfile?.value ?: 0L), niconindex, (phiconlarge?.value ?: 0L), (phiconsmall?.value ?: 0L), nicons.toInt()).toUInt()

public actual fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, nicons: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractIconExW((lpszfile?.value ?: 0L), niconindex, (phiconlarge?.value ?: 0L), (phiconsmall?.value ?: 0L), nicons.toInt()).toUInt()

public actual fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_extractIconW((hinst?.value ?: 0L), (pszexefilename?.value ?: 0L), niconindex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_findExecutableA((lpfile?.value ?: 0L), (lpdirectory?.value ?: 0L), (lpresult?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_findExecutableW((lpfile?.value ?: 0L), (lpdirectory?.value ?: 0L), (lpresult?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getAcceptLanguagesA((pszlanguages?.value ?: 0L), (pcchlanguages?.value ?: 0L))

public actual fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getAcceptLanguagesW((pszlanguages?.value ?: 0L), (pcchlanguages?.value ?: 0L))

public actual fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryA((lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getAllUsersProfileDirectoryW((lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getCurrentProcessExplicitAppUserModelID(appid: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getCurrentProcessExplicitAppUserModelID((appid?.value ?: 0L))

public actual fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryA((lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getDefaultUserProfileDirectoryW((lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getDpiForShellUIComponent(param0).toUInt()

public actual fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getFileNameFromBrowse((hwnd?.value ?: 0L), (pszfilepath?.value ?: 0L), cchfilepath.toInt(), (pszworkingdir?.value ?: 0L), (pszdefext?.value ?: 0L), (pszfilters?.value ?: 0L), (psztitle?.value ?: 0L))

public actual fun getMenuContextHelpId(param0: Hmenu): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getMenuContextHelpId((param0?.value ?: 0L)).toUInt()

public actual fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getMenuPosFromID((hmenu?.value ?: 0L), id.toInt())

public actual fun getProfileType(dwflags: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getProfileType((dwflags?.value ?: 0L))

public actual fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getProfilesDirectoryA((lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getProfilesDirectoryW((lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getScaleFactorForDevice(devicetype)

public actual fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getScaleFactorForMonitor((hmon?.value ?: 0L), (pscale?.value ?: 0L))

public actual fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getUserProfileDirectoryA((htoken?.value ?: 0L), (lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getUserProfileDirectoryW((htoken?.value ?: 0L), (lpprofiledir?.value ?: 0L), (lpcchsize?.value ?: 0L))

public actual fun getWindowContextHelpId(param0: Hwnd): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getWindowContextHelpId((param0?.value ?: 0L)).toUInt()

public actual fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_getWindowSubclass((hwnd?.value ?: 0L), 0L, uidsubclass.toLong(), (pdwrefdata?.value ?: 0L))

public actual fun hmonitorUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hmonitorUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun hmonitorUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hmonitorUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hmonitorUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hmonitorUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun hmonitorUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hmonitorUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hmonitorUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hashData(pbdata: COpaquePointer?, cbdata: UInt, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hashData((pbdata?.value ?: 0L), cbdata.toInt(), (pbhash?.value ?: 0L), cbhash.toInt())

public actual fun hlinkClone(pihl: COpaquePointer?, riid: COpaquePointer?, pihlsiteforclone: COpaquePointer?, dwsitedata: UInt, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkClone((pihl?.value ?: 0L), (riid?.value ?: 0L), (pihlsiteforclone?.value ?: 0L), dwsitedata.toInt(), (ppvobj?.value ?: 0L))

public actual fun hlinkCreateBrowseContext(piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateBrowseContext((piunkouter?.value ?: 0L), (riid?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateExtensionServices((pwzadditionalheaders?.value ?: 0L), (phwnd?.value ?: 0L), (pszusername?.value ?: 0L), (pszpassword?.value ?: 0L), (piunkouter?.value ?: 0L), (riid?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun hlinkCreateFromData(pidataobj: COpaquePointer?, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateFromData((pidataobj?.value ?: 0L), (pihlsite?.value ?: 0L), dwsitedata.toInt(), (piunkouter?.value ?: 0L), (riid?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun hlinkCreateFromMoniker(pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateFromMoniker((pimktrgt?.value ?: 0L), (pwzlocation?.value ?: 0L), (pwzfriendlyname?.value ?: 0L), (pihlsite?.value ?: 0L), dwsitedata.toInt(), (piunkouter?.value ?: 0L), (riid?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateFromString((pwztarget?.value ?: 0L), (pwzlocation?.value ?: 0L), (pwzfriendlyname?.value ?: 0L), (pihlsite?.value ?: 0L), dwsitedata.toInt(), (piunkouter?.value ?: 0L), (riid?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: COpaquePointer?, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateShortcut(grfhlshortcutf.toInt(), (pihl?.value ?: 0L), (pwzdir?.value ?: 0L), (pwzfilename?.value ?: 0L), (ppwzshortcutfile?.value ?: 0L), dwreserved.toInt())

public actual fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromMoniker(grfhlshortcutf.toInt(), (pimktarget?.value ?: 0L), (pwzlocation?.value ?: 0L), (pwzdir?.value ?: 0L), (pwzfilename?.value ?: 0L), (ppwzshortcutfile?.value ?: 0L), dwreserved.toInt())

public actual fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkCreateShortcutFromString(grfhlshortcutf.toInt(), (pwztarget?.value ?: 0L), (pwzlocation?.value ?: 0L), (pwzdir?.value ?: 0L), (pwzfilename?.value ?: 0L), (ppwzshortcutfile?.value ?: 0L), dwreserved.toInt())

public actual fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkGetSpecialReference(ureference.toInt(), (ppwzreference?.value ?: 0L))

public actual fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkGetValueFromParams((pwzparams?.value ?: 0L), (pwzname?.value ?: 0L), (ppwzvalue?.value ?: 0L))

public actual fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkIsShortcut((pwzfilename?.value ?: 0L))

public actual fun hlinkNavigate(pihl: COpaquePointer?, pihlframe: COpaquePointer?, grfhlnf: UInt, pbc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkNavigate((pihl?.value ?: 0L), (pihlframe?.value ?: 0L), grfhlnf.toInt(), (pbc?.value ?: 0L), (pibsc?.value ?: 0L), (pihlbc?.value ?: 0L))

public actual fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, pihlframe: COpaquePointer?, grfhlnf: UInt, pibc: COpaquePointer?, pibsc: COpaquePointer?, pihlbc: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkNavigateToStringReference((pwztarget?.value ?: 0L), (pwzlocation?.value ?: 0L), (pihlsite?.value ?: 0L), dwsitedata.toInt(), (pihlframe?.value ?: 0L), grfhlnf.toInt(), (pibc?.value ?: 0L), (pibsc?.value ?: 0L), (pihlbc?.value ?: 0L))

public actual fun hlinkOnNavigate(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, grfhlnf: UInt, pimktarget: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkOnNavigate((pihlframe?.value ?: 0L), (pihlbc?.value ?: 0L), grfhlnf.toInt(), (pimktarget?.value ?: 0L), (pwzlocation?.value ?: 0L), (pwzfriendlyname?.value ?: 0L), (puhlid?.value ?: 0L))

public actual fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: COpaquePointer?, pimkold: COpaquePointer?, pimknew: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkOnRenameDocument(dwreserved.toInt(), (pihlbc?.value ?: 0L), (pimkold?.value ?: 0L), (pimknew?.value ?: 0L))

public actual fun hlinkParseDisplayName(pibc: COpaquePointer?, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: COpaquePointer?, ppimk: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkParseDisplayName((pibc?.value ?: 0L), (pwzdisplayname?.value ?: 0L), fnoforceabs, (pccheaten?.value ?: 0L), (ppimk?.value ?: 0L))

public actual fun hlinkPreprocessMoniker(pibc: COpaquePointer?, pimkin: COpaquePointer?, ppimkout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkPreprocessMoniker((pibc?.value ?: 0L), (pimkin?.value ?: 0L), (ppimkout?.value ?: 0L))

public actual fun hlinkQueryCreateFromData(pidataobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkQueryCreateFromData((pidataobj?.value ?: 0L))

public actual fun hlinkResolveMonikerForData(pimkreference: COpaquePointer?, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkResolveMonikerForData((pimkreference?.value ?: 0L), reserved.toInt(), (pibc?.value ?: 0L), cfmtetc.toInt(), (rgfmtetc?.value ?: 0L), (pibsc?.value ?: 0L), (pimkbase?.value ?: 0L))

public actual fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: COpaquePointer?, dwsitedata: UInt, piunkouter: COpaquePointer?, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkResolveShortcut((pwzshortcutfilename?.value ?: 0L), (pihlsite?.value ?: 0L), dwsitedata.toInt(), (piunkouter?.value ?: 0L), (riid?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkResolveShortcutToMoniker((pwzshortcutfilename?.value ?: 0L), (ppimktarget?.value ?: 0L), (ppwzlocation?.value ?: 0L))

public actual fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: COpaquePointer?, ppwzlocation: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkResolveShortcutToString((pwzshortcutfilename?.value ?: 0L), (ppwztarget?.value ?: 0L), (ppwzlocation?.value ?: 0L))

public actual fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: COpaquePointer?, cfmtetc: UInt, rgfmtetc: COpaquePointer?, pibsc: COpaquePointer?, pimkbase: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkResolveStringForData((pwzreference?.value ?: 0L), reserved.toInt(), (pibc?.value ?: 0L), cfmtetc.toInt(), (rgfmtetc?.value ?: 0L), (pibsc?.value ?: 0L), (pimkbase?.value ?: 0L))

public actual fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkSetSpecialReference(ureference.toInt(), (pwzreference?.value ?: 0L))

public actual fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkTranslateURL((pwzurl?.value ?: 0L), grfflags.toInt(), (ppwztranslatedurl?.value ?: 0L))

public actual fun hlinkUpdateStackItem(pihlframe: COpaquePointer?, pihlbc: COpaquePointer?, uhlid: UInt, pimktrgt: COpaquePointer?, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_hlinkUpdateStackItem((pihlframe?.value ?: 0L), (pihlbc?.value ?: 0L), uhlid.toInt(), (pimktrgt?.value ?: 0L), (pwzlocation?.value ?: 0L), (pwzfriendlyname?.value ?: 0L))

public actual fun iLAppendID(pidl: COpaquePointer?, pmkid: COpaquePointer?, fappend: Bool): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLAppendID((pidl?.value ?: 0L), (pmkid?.value ?: 0L), fappend).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLClone(pidl: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLClone((pidl?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLCloneFirst(pidl: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLCloneFirst((pidl?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLCombine(pidl1: COpaquePointer?, pidl2: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLCombine((pidl1?.value ?: 0L), (pidl2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLCreateFromPathA(pszpath: Pcstr): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLCreateFromPathA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLCreateFromPathW(pszpath: Pcwstr): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLCreateFromPathW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLFindChild(pidlparent: COpaquePointer?, pidlchild: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLFindChild((pidlparent?.value ?: 0L), (pidlchild?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLFindLastID(pidl: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLFindLastID((pidl?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLFree(pidl: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLFree((pidl?.value ?: 0L))
}

public actual fun iLGetNext(pidl: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLGetNext((pidl?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iLGetSize(pidl: COpaquePointer?): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLGetSize((pidl?.value ?: 0L)).toUInt()

public actual fun iLIsEqual(pidl1: COpaquePointer?, pidl2: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLIsEqual((pidl1?.value ?: 0L), (pidl2?.value ?: 0L))

public actual fun iLIsParent(pidl1: COpaquePointer?, pidl2: COpaquePointer?, fimmediate: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLIsParent((pidl1?.value ?: 0L), (pidl2?.value ?: 0L), fimmediate)

public actual fun iLLoadFromStreamEx(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLLoadFromStreamEx((pstm?.value ?: 0L), (pidl?.value ?: 0L))

public actual fun iLRemoveLastID(pidl: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLRemoveLastID((pidl?.value ?: 0L))

public actual fun iLSaveToStream(pstm: COpaquePointer?, pidl: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iLSaveToStream((pstm?.value ?: 0L), (pidl?.value ?: 0L))

public actual fun istreamCopy(pstmfrom: COpaquePointer?, pstmto: COpaquePointer?, cb: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamCopy((pstmfrom?.value ?: 0L), (pstmto?.value ?: 0L), cb.toInt())

public actual fun istreamRead(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamRead((pstm?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())

public actual fun istreamReadPidl(pstm: COpaquePointer?, ppidlout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamReadPidl((pstm?.value ?: 0L), (ppidlout?.value ?: 0L))

public actual fun istreamReadStr(pstm: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamReadStr((pstm?.value ?: 0L), (ppsz?.value ?: 0L))

public actual fun istreamReset(pstm: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamReset((pstm?.value ?: 0L))

public actual fun istreamSize(pstm: COpaquePointer?, pui: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamSize((pstm?.value ?: 0L), (pui?.value ?: 0L))

public actual fun istreamWrite(pstm: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamWrite((pstm?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())

public actual fun istreamWritePidl(pstm: COpaquePointer?, pidlwrite: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamWritePidl((pstm?.value ?: 0L), (pidlwrite?.value ?: 0L))

public actual fun istreamWriteStr(pstm: COpaquePointer?, psz: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_istreamWriteStr((pstm?.value ?: 0L), (psz?.value ?: 0L))

public actual fun iunknownAtomicRelease(ppunk: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iunknownAtomicRelease((ppunk?.value ?: 0L))
}

public actual fun iunknownGetSite(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iunknownGetSite((punk?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun iunknownGetWindow(punk: COpaquePointer?, phwnd: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iunknownGetWindow((punk?.value ?: 0L), (phwnd?.value ?: 0L))

public actual fun iunknownQueryService(punk: COpaquePointer?, guidservice: COpaquePointer?, riid: COpaquePointer?, ppvout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iunknownQueryService((punk?.value ?: 0L), (guidservice?.value ?: 0L), (riid?.value ?: 0L), (ppvout?.value ?: 0L))

public actual fun iunknownSet(ppunk: COpaquePointer?, punk: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iunknownSet((ppunk?.value ?: 0L), (punk?.value ?: 0L))
}

public actual fun iunknownSetSite(punk: COpaquePointer?, punksite: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_iunknownSetSite((punk?.value ?: 0L), (punksite?.value ?: 0L))

public actual fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: COpaquePointer?, pfparsepersiterules: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_importPrivacySettings((pszfilename?.value ?: 0L), (pfparseprivacypreferences?.value ?: 0L), (pfparsepersiterules?.value ?: 0L))

public actual fun initNetworkAddressControl(): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_initNetworkAddressControl()

public actual fun initPropVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_initPropVariantFromStrRet((pstrret?.value ?: 0L), (pidl?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun initVariantFromStrRet(pstrret: COpaquePointer?, pidl: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_initVariantFromStrRet((pstrret?.value ?: 0L), (pidl?.value ?: 0L), (pvar?.value ?: 0L))

public actual fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_intlStrEqWorkerA(fcasesens, (lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L), nchar)

public actual fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_intlStrEqWorkerW(fcasesens, (lpstring1?.value ?: 0L), (lpstring2?.value ?: 0L), nchar)

public actual fun isCharSpaceA(wch: Byte): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isCharSpaceA(wch)

public actual fun isCharSpaceW(wch: UShort): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isCharSpaceW(wch.toShort())

public actual fun isInternetESCEnabled(): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isInternetESCEnabled()

public actual fun isLFNDriveA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isLFNDriveA((pszpath?.value ?: 0L))

public actual fun isLFNDriveW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isLFNDriveW((pszpath?.value ?: 0L))

public actual fun isNetDrive(idrive: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isNetDrive(idrive)

public actual fun isOS(dwos: OS): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isOS(dwos.toInt())

public actual fun isUserAnAdmin(): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_isUserAnAdmin()

public actual fun loadUserProfileA(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_loadUserProfileA((htoken?.value ?: 0L), (lpprofileinfo?.value ?: 0L))

public actual fun loadUserProfileW(htoken: Handle, lpprofileinfo: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_loadUserProfileW((htoken?.value ?: 0L), (lpprofileinfo?.value ?: 0L))

public actual fun oleSaveToStreamEx(piunk: COpaquePointer?, pistm: COpaquePointer?, fcleardirty: Bool): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_oleSaveToStreamEx((piunk?.value ?: 0L), (pistm?.value ?: 0L), fcleardirty)

public actual fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_openRegStream((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), grfmode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun parseURLA(pcszurl: Pcstr, ppu: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_parseURLA((pcszurl?.value ?: 0L), (ppu?.value ?: 0L))

public actual fun parseURLW(pcszurl: Pcwstr, ppu: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_parseURLW((pcszurl?.value ?: 0L), (ppu?.value ?: 0L))

public actual fun pathAddBackslashA(pszpath: Pstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAddBackslashA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathAddBackslashW(pszpath: Pwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAddBackslashW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAddExtensionA((pszpath?.value ?: 0L), (pszext?.value ?: 0L))

public actual fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAddExtensionW((pszpath?.value ?: 0L), (pszext?.value ?: 0L))

public actual fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAllocCanonicalize((pszpathin?.value ?: 0L), dwflags.toInt(), (ppszpathout?.value ?: 0L))

public actual fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAllocCombine((pszpathin?.value ?: 0L), (pszmore?.value ?: 0L), dwflags.toInt(), (ppszpathout?.value ?: 0L))

public actual fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAppendA((pszpath?.value ?: 0L), (pszmore?.value ?: 0L))

public actual fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathAppendW((pszpath?.value ?: 0L), (pszmore?.value ?: 0L))

public actual fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathBuildRootA((pszroot?.value ?: 0L), idrive).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathBuildRootW((pszroot?.value ?: 0L), idrive).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCanonicalizeA((pszbuf?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCanonicalizeW((pszbuf?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchAddBackslash((pszpath?.value ?: 0L), cchpath.toLong())

public actual fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchAddBackslashEx((pszpath?.value ?: 0L), cchpath.toLong(), (ppszend?.value ?: 0L), (pcchremaining?.value ?: 0L))

public actual fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchAddExtension((pszpath?.value ?: 0L), cchpath.toLong(), (pszext?.value ?: 0L))

public actual fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchAppend((pszpath?.value ?: 0L), cchpath.toLong(), (pszmore?.value ?: 0L))

public actual fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchAppendEx((pszpath?.value ?: 0L), cchpath.toLong(), (pszmore?.value ?: 0L), dwflags.toInt())

public actual fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchCanonicalize((pszpathout?.value ?: 0L), cchpathout.toLong(), (pszpathin?.value ?: 0L))

public actual fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchCanonicalizeEx((pszpathout?.value ?: 0L), cchpathout.toLong(), (pszpathin?.value ?: 0L), dwflags.toInt())

public actual fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchCombine((pszpathout?.value ?: 0L), cchpathout.toLong(), (pszpathin?.value ?: 0L), (pszmore?.value ?: 0L))

public actual fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchCombineEx((pszpathout?.value ?: 0L), cchpathout.toLong(), (pszpathin?.value ?: 0L), (pszmore?.value ?: 0L), dwflags.toInt())

public actual fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchFindExtension((pszpath?.value ?: 0L), cchpath.toLong(), (ppszext?.value ?: 0L))

public actual fun pathCchIsRoot(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchIsRoot((pszpath?.value ?: 0L))

public actual fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchRemoveBackslash((pszpath?.value ?: 0L), cchpath.toLong())

public actual fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: COpaquePointer?, pcchremaining: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchRemoveBackslashEx((pszpath?.value ?: 0L), cchpath.toLong(), (ppszend?.value ?: 0L), (pcchremaining?.value ?: 0L))

public actual fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchRemoveExtension((pszpath?.value ?: 0L), cchpath.toLong())

public actual fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchRemoveFileSpec((pszpath?.value ?: 0L), cchpath.toLong())

public actual fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchRenameExtension((pszpath?.value ?: 0L), cchpath.toLong(), (pszext?.value ?: 0L))

public actual fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchSkipRoot((pszpath?.value ?: 0L), (ppszrootend?.value ?: 0L))

public actual fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchStripPrefix((pszpath?.value ?: 0L), cchpath.toLong())

public actual fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCchStripToRoot((pszpath?.value ?: 0L), cchpath.toLong())

public actual fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCleanupSpec((pszdir?.value ?: 0L), (pszspec?.value ?: 0L))

public actual fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCombineA((pszdest?.value ?: 0L), (pszdir?.value ?: 0L), (pszfile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCombineW((pszdest?.value ?: 0L), (pszdir?.value ?: 0L), (pszfile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCommonPrefixA((pszfile1?.value ?: 0L), (pszfile2?.value ?: 0L), (achpath?.value ?: 0L))

public actual fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCommonPrefixW((pszfile1?.value ?: 0L), (pszfile2?.value ?: 0L), (achpath?.value ?: 0L))

public actual fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCompactPathA((hdc?.value ?: 0L), (pszpath?.value ?: 0L), dx.toInt())

public actual fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCompactPathExA((pszout?.value ?: 0L), (pszsrc?.value ?: 0L), cchmax.toInt(), dwflags.toInt())

public actual fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCompactPathExW((pszout?.value ?: 0L), (pszsrc?.value ?: 0L), cchmax.toInt(), dwflags.toInt())

public actual fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCompactPathW((hdc?.value ?: 0L), (pszpath?.value ?: 0L), dx.toInt())

public actual fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCreateFromUrlA((pszurl?.value ?: 0L), (pszpath?.value ?: 0L), (pcchpath?.value ?: 0L), dwflags.toInt())

public actual fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCreateFromUrlAlloc((pszin?.value ?: 0L), (ppszout?.value ?: 0L), dwflags.toInt())

public actual fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathCreateFromUrlW((pszurl?.value ?: 0L), (pszpath?.value ?: 0L), (pcchpath?.value ?: 0L), dwflags.toInt())

public actual fun pathFileExistsA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFileExistsA((pszpath?.value ?: 0L))

public actual fun pathFileExistsW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFileExistsW((pszpath?.value ?: 0L))

public actual fun pathFindExtensionA(pszpath: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindExtensionA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathFindExtensionW(pszpath: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindExtensionW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathFindFileNameA(pszpath: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindFileNameA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathFindFileNameW(pszpath: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindFileNameW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathFindNextComponentA(pszpath: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindNextComponentA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindNextComponentW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindOnPathA((pszpath?.value ?: 0L), (ppszotherdirs?.value ?: 0L))

public actual fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindOnPathW((pszpath?.value ?: 0L), (ppszotherdirs?.value ?: 0L))

public actual fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindSuffixArrayA((pszpath?.value ?: 0L), (apszsuffix?.value ?: 0L), iarraysize).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: COpaquePointer?, iarraysize: Int): Pcwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathFindSuffixArrayW((pszpath?.value ?: 0L), (apszsuffix?.value ?: 0L), iarraysize).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathGetArgsA(pszpath: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathGetArgsA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathGetArgsW(pszpath: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathGetArgsW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathGetCharTypeA(ch: UByte): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathGetCharTypeA(ch.toByte()).toUInt()

public actual fun pathGetCharTypeW(ch: UShort): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathGetCharTypeW(ch.toShort()).toUInt()

public actual fun pathGetDriveNumberA(pszpath: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathGetDriveNumberA((pszpath?.value ?: 0L))

public actual fun pathGetDriveNumberW(pszpath: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathGetDriveNumberW((pszpath?.value ?: 0L))

public actual fun pathGetShortPath(pszlongpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathGetShortPath((pszlongpath?.value ?: 0L))
}

public actual fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsContentTypeA((pszpath?.value ?: 0L), (pszcontenttype?.value ?: 0L))

public actual fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsContentTypeW((pszpath?.value ?: 0L), (pszcontenttype?.value ?: 0L))

public actual fun pathIsDirectoryA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsDirectoryA((pszpath?.value ?: 0L))

public actual fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyA((pszpath?.value ?: 0L))

public actual fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsDirectoryEmptyW((pszpath?.value ?: 0L))

public actual fun pathIsDirectoryW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsDirectoryW((pszpath?.value ?: 0L))

public actual fun pathIsExe(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsExe((pszpath?.value ?: 0L))

public actual fun pathIsFileSpecA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsFileSpecA((pszpath?.value ?: 0L))

public actual fun pathIsFileSpecW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsFileSpecW((pszpath?.value ?: 0L))

public actual fun pathIsLFNFileSpecA(pszname: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsLFNFileSpecA((pszname?.value ?: 0L))

public actual fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsLFNFileSpecW((pszname?.value ?: 0L))

public actual fun pathIsNetworkPathA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsNetworkPathA((pszpath?.value ?: 0L))

public actual fun pathIsNetworkPathW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsNetworkPathW((pszpath?.value ?: 0L))

public actual fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsPrefixA((pszprefix?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsPrefixW((pszprefix?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun pathIsRelativeA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsRelativeA((pszpath?.value ?: 0L))

public actual fun pathIsRelativeW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsRelativeW((pszpath?.value ?: 0L))

public actual fun pathIsRootA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsRootA((pszpath?.value ?: 0L))

public actual fun pathIsRootW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsRootW((pszpath?.value ?: 0L))

public actual fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsSameRootA((pszpath1?.value ?: 0L), (pszpath2?.value ?: 0L))

public actual fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsSameRootW((pszpath1?.value ?: 0L), (pszpath2?.value ?: 0L))

public actual fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsSlowA((pszfile?.value ?: 0L), dwattr.toInt())

public actual fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsSlowW((pszfile?.value ?: 0L), dwattr.toInt())

public actual fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsSystemFolderA((pszpath?.value ?: 0L), dwattrb.toInt())

public actual fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsSystemFolderW((pszpath?.value ?: 0L), dwattrb.toInt())

public actual fun pathIsUNCA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsUNCA((pszpath?.value ?: 0L))

public actual fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsUNCEx((pszpath?.value ?: 0L), (ppszserver?.value ?: 0L))

public actual fun pathIsUNCServerA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsUNCServerA((pszpath?.value ?: 0L))

public actual fun pathIsUNCServerShareA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsUNCServerShareA((pszpath?.value ?: 0L))

public actual fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsUNCServerShareW((pszpath?.value ?: 0L))

public actual fun pathIsUNCServerW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsUNCServerW((pszpath?.value ?: 0L))

public actual fun pathIsUNCW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsUNCW((pszpath?.value ?: 0L))

public actual fun pathIsURLA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsURLA((pszpath?.value ?: 0L))

public actual fun pathIsURLW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathIsURLW((pszpath?.value ?: 0L))

public actual fun pathMakePrettyA(pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMakePrettyA((pszpath?.value ?: 0L))

public actual fun pathMakePrettyW(pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMakePrettyW((pszpath?.value ?: 0L))

public actual fun pathMakeSystemFolderA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMakeSystemFolderA((pszpath?.value ?: 0L))

public actual fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMakeSystemFolderW((pszpath?.value ?: 0L))

public actual fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMakeUniqueName((pszuniquename?.value ?: 0L), cchmax.toInt(), (psztemplate?.value ?: 0L), (pszlongplate?.value ?: 0L), (pszdir?.value ?: 0L))

public actual fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMatchSpecA((pszfile?.value ?: 0L), (pszspec?.value ?: 0L))

public actual fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMatchSpecExA((pszfile?.value ?: 0L), (pszspec?.value ?: 0L), dwflags.toInt())

public actual fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMatchSpecExW((pszfile?.value ?: 0L), (pszspec?.value ?: 0L), dwflags.toInt())

public actual fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathMatchSpecW((pszfile?.value ?: 0L), (pszspec?.value ?: 0L))

public actual fun pathParseIconLocationA(psziconfile: Pstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathParseIconLocationA((psziconfile?.value ?: 0L))

public actual fun pathParseIconLocationW(psziconfile: Pwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathParseIconLocationW((psziconfile?.value ?: 0L))

public actual fun pathQualify(psz: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathQualify((psz?.value ?: 0L))
}

public actual fun pathQuoteSpacesA(lpsz: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathQuoteSpacesA((lpsz?.value ?: 0L))

public actual fun pathQuoteSpacesW(lpsz: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathQuoteSpacesW((lpsz?.value ?: 0L))

public actual fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRelativePathToA((pszpath?.value ?: 0L), (pszfrom?.value ?: 0L), dwattrfrom.toInt(), (pszto?.value ?: 0L), dwattrto.toInt())

public actual fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRelativePathToW((pszpath?.value ?: 0L), (pszfrom?.value ?: 0L), dwattrfrom.toInt(), (pszto?.value ?: 0L), dwattrto.toInt())

public actual fun pathRemoveArgsA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveArgsA((pszpath?.value ?: 0L))
}

public actual fun pathRemoveArgsW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveArgsW((pszpath?.value ?: 0L))
}

public actual fun pathRemoveBackslashA(pszpath: Pstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveBackslashA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveBackslashW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathRemoveBlanksA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveBlanksA((pszpath?.value ?: 0L))
}

public actual fun pathRemoveBlanksW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveBlanksW((pszpath?.value ?: 0L))
}

public actual fun pathRemoveExtensionA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveExtensionA((pszpath?.value ?: 0L))
}

public actual fun pathRemoveExtensionW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveExtensionW((pszpath?.value ?: 0L))
}

public actual fun pathRemoveFileSpecA(pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveFileSpecA((pszpath?.value ?: 0L))

public actual fun pathRemoveFileSpecW(pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRemoveFileSpecW((pszpath?.value ?: 0L))

public actual fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRenameExtensionA((pszpath?.value ?: 0L), (pszext?.value ?: 0L))

public actual fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathRenameExtensionW((pszpath?.value ?: 0L), (pszext?.value ?: 0L))

public actual fun pathResolve(pszpath: Pwstr, dirs: COpaquePointer?, fflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathResolve((pszpath?.value ?: 0L), (dirs?.value ?: 0L), fflags.toInt())

public actual fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathSearchAndQualifyA((pszpath?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathSearchAndQualifyW((pszpath?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathSetDlgItemPathA((hdlg?.value ?: 0L), id, (pszpath?.value ?: 0L))
}

public actual fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathSetDlgItemPathW((hdlg?.value ?: 0L), id, (pszpath?.value ?: 0L))
}

public actual fun pathSkipRootA(pszpath: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathSkipRootA((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathSkipRootW(pszpath: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathSkipRootW((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pathStripPathA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathStripPathA((pszpath?.value ?: 0L))
}

public actual fun pathStripPathW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathStripPathW((pszpath?.value ?: 0L))
}

public actual fun pathStripToRootA(pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathStripToRootA((pszpath?.value ?: 0L))

public actual fun pathStripToRootW(pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathStripToRootW((pszpath?.value ?: 0L))

public actual fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsA((pszpath?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUnExpandEnvStringsW((pszpath?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun pathUndecorateA(pszpath: Pstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUndecorateA((pszpath?.value ?: 0L))
}

public actual fun pathUndecorateW(pszpath: Pwstr) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUndecorateW((pszpath?.value ?: 0L))
}

public actual fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderA((pszpath?.value ?: 0L))

public actual fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUnmakeSystemFolderW((pszpath?.value ?: 0L))

public actual fun pathUnquoteSpacesA(lpsz: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUnquoteSpacesA((lpsz?.value ?: 0L))

public actual fun pathUnquoteSpacesW(lpsz: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathUnquoteSpacesW((lpsz?.value ?: 0L))

public actual fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pathYetAnotherMakeUniqueName((pszuniquename?.value ?: 0L), (pszpath?.value ?: 0L), (pszshort?.value ?: 0L), (pszfilespec?.value ?: 0L))

public actual fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_pickIconDlg((hwnd?.value ?: 0L), (psziconpath?.value ?: 0L), cchiconpath.toInt(), (piiconindex?.value ?: 0L))

public actual fun propVariantToStrRet(propvar: COpaquePointer?, pstrret: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_propVariantToStrRet((propvar?.value ?: 0L), (pstrret?.value ?: 0L))

public actual fun qISearch(that: COpaquePointer?, pqit: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_qISearch((that?.value ?: 0L), (pqit?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun readCabinetState(pcs: COpaquePointer?, clength: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_readCabinetState((pcs?.value ?: 0L), clength)

public actual fun realDriveType(idrive: Int, foktohitnet: Bool): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_realDriveType(idrive, foktohitnet)

public actual fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_registerAppConstrainedChangeNotification(0L, (context?.value ?: 0L), (registration?.value ?: 0L)).toUInt()

public actual fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: COpaquePointer?, registration: COpaquePointer?): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_registerAppStateChangeNotification(0L, (context?.value ?: 0L), (registration?.value ?: 0L)).toUInt()

public actual fun registerScaleChangeEvent(hevent: Handle, pdwcookie: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_registerScaleChangeEvent((hevent?.value ?: 0L), (pdwcookie?.value ?: 0L))

public actual fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_registerScaleChangeNotifications(displaydevice, (hwndnotify?.value ?: 0L), umsgnotify.toInt(), (pdwcookie?.value ?: 0L))

public actual fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_removeWindowSubclass((hwnd?.value ?: 0L), 0L, uidsubclass.toLong())

public actual fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_restartDialog((hwnd?.value ?: 0L), (pszprompt?.value ?: 0L), dwreturn.toInt())

public actual fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_restartDialogEx((hwnd?.value ?: 0L), (pszprompt?.value ?: 0L), dwreturn.toInt(), dwreasoncode.toInt())

public actual fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_revokeScaleChangeNotifications(displaydevice, dwcookie.toInt())

public actual fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    0u

public actual fun sHAddToRecentDocs(uflags: UInt, pv: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAddToRecentDocs(uflags.toInt(), (pv?.value ?: 0L))
}

public actual fun sHAlloc(cb: ULong): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAlloc(cb.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHAllocShared(pvdata: COpaquePointer?, dwsize: UInt, dwprocessid: UInt): Handle =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAllocShared((pvdata?.value ?: 0L), dwsize.toInt(), dwprocessid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAnsiToAnsi((pszsrc?.value ?: 0L), (pszdst?.value ?: 0L), cchbuf)

public actual fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAnsiToUnicode((pszsrc?.value ?: 0L), (pwszdst?.value ?: 0L), cwchbuf)

public actual fun sHAppBarMessage(dwmessage: UInt, pdata: COpaquePointer?): ULong =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAppBarMessage(dwmessage.toInt(), (pdata?.value ?: 0L)).toULong()

public actual fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAssocEnumHandlers((pszextra?.value ?: 0L), affilter, (ppenumhandler?.value ?: 0L))

public actual fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: COpaquePointer?, enumhandlers: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAssocEnumHandlersForProtocolByApplication((protocol?.value ?: 0L), (riid?.value ?: 0L), (enumhandlers?.value ?: 0L))

public actual fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHAutoComplete((hwndedit?.value ?: 0L), dwflags.toInt())

public actual fun sHBindToFolderIDListParent(psfroot: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHBindToFolderIDListParent((psfroot?.value ?: 0L), (pidl?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L), (ppidllast?.value ?: 0L))

public actual fun sHBindToFolderIDListParentEx(psfroot: COpaquePointer?, pidl: COpaquePointer?, ppbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHBindToFolderIDListParentEx((psfroot?.value ?: 0L), (pidl?.value ?: 0L), (ppbc?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L), (ppidllast?.value ?: 0L))

public actual fun sHBindToObject(psf: COpaquePointer?, pidl: COpaquePointer?, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHBindToObject((psf?.value ?: 0L), (pidl?.value ?: 0L), (pbc?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHBindToParent(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?, ppidllast: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHBindToParent((pidl?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L), (ppidllast?.value ?: 0L))

public actual fun sHBrowseForFolderA(lpbi: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHBrowseForFolderA((lpbi?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHBrowseForFolderW(lpbi: COpaquePointer?): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHBrowseForFolderW((lpbi?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHCLSIDFromString(psz: Pcwstr, pclsid: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCLSIDFromString((psz?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: COpaquePointer?, plevent: COpaquePointer?): Handle =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shchangeNotificationLock((hchange?.value ?: 0L), dwprocid.toInt(), (pppidl?.value ?: 0L), (plevent?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shchangeNotificationUnlock(hlock: Handle): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shchangeNotificationUnlock((hlock?.value ?: 0L))

public actual fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: COpaquePointer?, dwitem2: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHChangeNotify(weventid, uflags.toInt(), (dwitem1?.value ?: 0L), (dwitem2?.value ?: 0L))
}

public actual fun sHChangeNotifyDeregister(ulid: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHChangeNotifyDeregister(ulid.toInt())

public actual fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: COpaquePointer?): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHChangeNotifyRegister((hwnd?.value ?: 0L), fsources, fevents, wmsg.toInt(), centries, (pshcne?.value ?: 0L)).toUInt()

public actual fun sHChangeNotifyRegisterThread(status: ScnrtStatus) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHChangeNotifyRegisterThread(status)
}

public actual fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCloneSpecialIDList((hwnd?.value ?: 0L), csidl, fcreate).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: COpaquePointer?, punkouter: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCoCreateInstance((pszclsid?.value ?: 0L), (pclsid?.value ?: 0L), (punkouter?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCopyKeyA((hkeysrc?.value ?: 0L), (pszsrcsubkey?.value ?: 0L), (hkeydest?.value ?: 0L), freserved.toInt()).toUInt()

public actual fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCopyKeyW((hkeysrc?.value ?: 0L), (pszsrcsubkey?.value ?: 0L), (hkeydest?.value ?: 0L), freserved.toInt()).toUInt()

public actual fun sHCreateAssociationRegistration(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateAssociationRegistration((riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateDataObject(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, pdtinner: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateDataObject((pidlfolder?.value ?: 0L), cidl.toInt(), (apidl?.value ?: 0L), (pdtinner?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateDefaultContextMenu(pdcm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateDefaultContextMenu((pdcm?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateDefaultExtractIcon(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateDefaultExtractIcon((riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateDefaultPropertiesOp(psi: COpaquePointer?, ppfileop: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateDefaultPropertiesOp((psi?.value ?: 0L), (ppfileop?.value ?: 0L))

public actual fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateDirectory((hwnd?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateDirectoryExA((hwnd?.value ?: 0L), (pszpath?.value ?: 0L), (psa?.value ?: 0L))

public actual fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateDirectoryExW((hwnd?.value ?: 0L), (pszpath?.value ?: 0L), (psa?.value ?: 0L))

public actual fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateFileExtractIconW((pszfile?.value ?: 0L), dwfileattributes.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateItemFromIDList(pidl: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateItemFromIDList((pidl?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateItemFromParsingName((pszpath?.value ?: 0L), (pbc?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateItemFromRelativeName(psiparent: COpaquePointer?, pszname: Pcwstr, pbc: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateItemFromRelativeName((psiparent?.value ?: 0L), (pszname?.value ?: 0L), (pbc?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateItemInKnownFolder(kfid: COpaquePointer?, dwkfflags: UInt, pszitem: Pcwstr, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateItemInKnownFolder((kfid?.value ?: 0L), dwkfflags.toInt(), (pszitem?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateItemWithParent(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, riid: COpaquePointer?, ppvitem: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateItemWithParent((pidlparent?.value ?: 0L), (psfparent?.value ?: 0L), (pidl?.value ?: 0L), (riid?.value ?: 0L), (ppvitem?.value ?: 0L))

public actual fun sHCreateMemStream(pinit: COpaquePointer?, cbinit: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateMemStream((pinit?.value ?: 0L), cbinit.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHCreateProcessAsUserW(pscpi: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateProcessAsUserW((pscpi?.value ?: 0L))

public actual fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreatePropSheetExtArray((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), maxIface.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateQueryCancelAutoPlayMoniker((ppmoniker?.value ?: 0L))

public actual fun sHCreateShellFolderView(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellFolderView((pcsfv?.value ?: 0L), (ppsv?.value ?: 0L))

public actual fun sHCreateShellFolderViewEx(pcsfv: COpaquePointer?, ppsv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellFolderViewEx((pcsfv?.value ?: 0L), (ppsv?.value ?: 0L))

public actual fun sHCreateShellItem(pidlparent: COpaquePointer?, psfparent: COpaquePointer?, pidl: COpaquePointer?, ppsi: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellItem((pidlparent?.value ?: 0L), (psfparent?.value ?: 0L), (pidl?.value ?: 0L), (ppsi?.value ?: 0L))

public actual fun sHCreateShellItemArray(pidlparent: COpaquePointer?, psf: COpaquePointer?, cidl: UInt, ppidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellItemArray((pidlparent?.value ?: 0L), (psf?.value ?: 0L), cidl.toInt(), (ppidl?.value ?: 0L), (ppsiitemarray?.value ?: 0L))

public actual fun sHCreateShellItemArrayFromDataObject(pdo: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromDataObject((pdo?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: COpaquePointer?, ppsiitemarray: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromIDLists(cidl.toInt(), (rgpidl?.value ?: 0L), (ppsiitemarray?.value ?: 0L))

public actual fun sHCreateShellItemArrayFromShellItem(psi: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellItemArrayFromShellItem((psi?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHCreateShellPalette(hdc: Hdc): Hpalette =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateShellPalette((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: COpaquePointer?, ppenumformatetc: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateStdEnumFmtEtc(cfmt.toInt(), (afmt?.value ?: 0L), (ppenumformatetc?.value ?: 0L))

public actual fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateStreamOnFileA((pszfile?.value ?: 0L), grfmode.toInt(), (ppstm?.value ?: 0L))

public actual fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: COpaquePointer?, ppstm: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateStreamOnFileEx((pszfile?.value ?: 0L), grfmode.toInt(), dwattributes.toInt(), fcreate, (pstmtemplate?.value ?: 0L), (ppstm?.value ?: 0L))

public actual fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateStreamOnFileW((pszfile?.value ?: 0L), grfmode.toInt(), (ppstm?.value ?: 0L))

public actual fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateThread(0L, (pdata?.value ?: 0L), flags.toInt(), 0L)

public actual fun sHCreateThreadRef(pcref: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateThreadRef((pcref?.value ?: 0L), (ppunk?.value ?: 0L))

public actual fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: COpaquePointer?, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHCreateThreadWithHandle(0L, (pdata?.value ?: 0L), flags.toInt(), 0L, (phandle?.value ?: 0L))

public actual fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDefExtractIconA((psziconfile?.value ?: 0L), iindex, uflags.toInt(), (phiconlarge?.value ?: 0L), (phiconsmall?.value ?: 0L), niconsize.toInt())

public actual fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: COpaquePointer?, phiconsmall: COpaquePointer?, niconsize: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDefExtractIconW((psziconfile?.value ?: 0L), iindex, uflags.toInt(), (phiconlarge?.value ?: 0L), (phiconsmall?.value ?: 0L), niconsize.toInt())

public actual fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyA((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L)).toUInt()

public actual fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDeleteEmptyKeyW((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L)).toUInt()

public actual fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDeleteKeyA((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L)).toUInt()

public actual fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDeleteKeyW((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L)).toUInt()

public actual fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDeleteValueA((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L)).toUInt()

public actual fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDeleteValueW((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L)).toUInt()

public actual fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDestroyPropSheetExtArray((hpsxa?.value ?: 0L))
}

public actual fun sHDoDragDrop(hwnd: Hwnd, pdata: COpaquePointer?, pdsrc: COpaquePointer?, dweffect: Dropeffect, pdweffect: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHDoDragDrop((hwnd?.value ?: 0L), (pdata?.value ?: 0L), (pdsrc?.value ?: 0L), dweffect.toInt(), (pdweffect?.value ?: 0L))

public actual fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEmptyRecycleBinA((hwnd?.value ?: 0L), (pszrootpath?.value ?: 0L), dwflags.toInt())

public actual fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEmptyRecycleBinW((hwnd?.value ?: 0L), (pszrootpath?.value ?: 0L), dwflags.toInt())

public actual fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEnumKeyExA((hkey?.value ?: 0L), dwindex.toInt(), (pszname?.value ?: 0L), (pcchname?.value ?: 0L)).toUInt()

public actual fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEnumKeyExW((hkey?.value ?: 0L), dwindex.toInt(), (pszname?.value ?: 0L), (pcchname?.value ?: 0L)).toUInt()

public actual fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEnumValueA((hkey?.value ?: 0L), dwindex.toInt(), (pszvaluename?.value ?: 0L), (pcchvaluename?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEnumValueW((hkey?.value ?: 0L), dwindex.toInt(), (pszvaluename?.value ?: 0L), (pcchvaluename?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEnumerateUnreadMailAccountsW((hkeyuser?.value ?: 0L), dwindex.toInt(), (pszmailaddress?.value ?: 0L), cchmailaddress)

public actual fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: COpaquePointer?, ppszcommandline: COpaquePointer?, ppszparameters: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHEvaluateSystemCommandTemplate((pszcmdtemplate?.value ?: 0L), (ppszapplication?.value ?: 0L), (ppszcommandline?.value ?: 0L), (ppszparameters?.value ?: 0L))

public actual fun sHFileOperationA(lpfileop: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFileOperationA((lpfileop?.value ?: 0L))

public actual fun sHFileOperationW(lpfileop: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFileOperationW((lpfileop?.value ?: 0L))

public actual fun sHFindFiles(pidlfolder: COpaquePointer?, pidlsavefile: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFindFiles((pidlfolder?.value ?: 0L), (pidlsavefile?.value ?: 0L))

public actual fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shfindInitMenuPopup((hmenu?.value ?: 0L), (hwndowner?.value ?: 0L), idcmdfirst.toInt(), idcmdlast.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHFlushSFCache() {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFlushSFCache()
}

public actual fun sHFormatDateTimeA(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pstr, cchbuf: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFormatDateTimeA((pft?.value ?: 0L), (pdwflags?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun sHFormatDateTimeW(pft: COpaquePointer?, pdwflags: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFormatDateTimeW((pft?.value ?: 0L), (pdwflags?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFormatDrive((hwnd?.value ?: 0L), drive.toInt(), fmtid.toInt(), options.toInt()).toUInt()

public actual fun sHFree(pv: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFree((pv?.value ?: 0L))
}

public actual fun sHFreeNameMappings(hnamemappings: Handle) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFreeNameMappings((hnamemappings?.value ?: 0L))
}

public actual fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHFreeShared((hdata?.value ?: 0L), dwprocessid.toInt())

public actual fun sHGetAttributesFromDataObject(pdo: COpaquePointer?, dwattributemask: UInt, pdwattributes: COpaquePointer?, pcitems: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetAttributesFromDataObject((pdo?.value ?: 0L), dwattributemask.toInt(), (pdwattributes?.value ?: 0L), (pcitems?.value ?: 0L))

public actual fun sHGetDataFromIDListA(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetDataFromIDListA((psf?.value ?: 0L), (pidl?.value ?: 0L), nformat, (pv?.value ?: 0L), cb)

public actual fun sHGetDataFromIDListW(psf: COpaquePointer?, pidl: COpaquePointer?, nformat: ShgdfilFormat, pv: COpaquePointer?, cb: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetDataFromIDListW((psf?.value ?: 0L), (pidl?.value ?: 0L), nformat, (pv?.value ?: 0L), cb)

public actual fun sHGetDesktopFolder(ppshf: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetDesktopFolder((ppshf?.value ?: 0L))

public actual fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExA((pszdirectoryname?.value ?: 0L), (pulfreebytesavailabletocaller?.value ?: 0L), (pultotalnumberofbytes?.value ?: 0L), (pultotalnumberoffreebytes?.value ?: 0L))

public actual fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: COpaquePointer?, pultotalnumberofbytes: COpaquePointer?, pultotalnumberoffreebytes: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetDiskFreeSpaceExW((pszdirectoryname?.value ?: 0L), (pulfreebytesavailabletocaller?.value ?: 0L), (pultotalnumberofbytes?.value ?: 0L), (pultotalnumberoffreebytes?.value ?: 0L))

public actual fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetDriveMedia((pszdrive?.value ?: 0L), (pdwmediacontent?.value ?: 0L))

public actual fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetFileInfoA((pszpath?.value ?: 0L), dwfileattributes.toInt(), (psfi?.value ?: 0L), cbfileinfo.toInt(), uflags.toInt()).toULong()

public actual fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: COpaquePointer?, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetFileInfoW((pszpath?.value ?: 0L), dwfileattributes.toInt(), (psfi?.value ?: 0L), cbfileinfo.toInt(), uflags.toInt()).toULong()

public actual fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetFolderLocation((hwnd?.value ?: 0L), csidl, (htoken?.value ?: 0L), dwflags.toInt(), (ppidl?.value ?: 0L))

public actual fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetFolderPathA((hwnd?.value ?: 0L), csidl, (htoken?.value ?: 0L), dwflags.toInt(), (pszpath?.value ?: 0L))

public actual fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirA((hwnd?.value ?: 0L), csidl, (htoken?.value ?: 0L), dwflags.toInt(), (pszsubdir?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetFolderPathAndSubDirW((hwnd?.value ?: 0L), csidl, (htoken?.value ?: 0L), dwflags.toInt(), (pszsubdir?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetFolderPathW((hwnd?.value ?: 0L), csidl, (htoken?.value ?: 0L), dwflags.toInt(), (pszpath?.value ?: 0L))

public actual fun sHGetIDListFromObject(punk: COpaquePointer?, ppidl: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetIDListFromObject((punk?.value ?: 0L), (ppidl?.value ?: 0L))

public actual fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexA((psziconpath?.value ?: 0L), iiconindex)

public actual fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetIconOverlayIndexW((psziconpath?.value ?: 0L), iiconindex)

public actual fun sHGetImageList(iimagelist: Int, riid: COpaquePointer?, ppvobj: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetImageList(iimagelist, (riid?.value ?: 0L), (ppvobj?.value ?: 0L))

public actual fun sHGetInstanceExplorer(ppunk: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetInstanceExplorer((ppunk?.value ?: 0L))

public actual fun sHGetInverseCMAP(pbmap: COpaquePointer?, cbmap: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetInverseCMAP((pbmap?.value ?: 0L), cbmap.toInt())

public actual fun sHGetItemFromDataObject(pdtobj: COpaquePointer?, dwflags: DataobjGetItemFlags, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetItemFromDataObject((pdtobj?.value ?: 0L), dwflags, (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHGetItemFromObject(punk: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetItemFromObject((punk?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHGetKnownFolderIDList(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppidl: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetKnownFolderIDList((rfid?.value ?: 0L), dwflags.toInt(), (htoken?.value ?: 0L), (ppidl?.value ?: 0L))

public actual fun sHGetKnownFolderItem(rfid: COpaquePointer?, flags: KnownFolderFlag, htoken: Handle, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetKnownFolderItem((rfid?.value ?: 0L), flags, (htoken?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHGetKnownFolderPath(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, ppszpath: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetKnownFolderPath((rfid?.value ?: 0L), dwflags.toInt(), (htoken?.value ?: 0L), (ppszpath?.value ?: 0L))

public actual fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetLocalizedName((pszpath?.value ?: 0L), (pszresmodule?.value ?: 0L), cch.toInt(), (pidsres?.value ?: 0L))

public actual fun sHGetMalloc(ppmalloc: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetMalloc((ppmalloc?.value ?: 0L))

public actual fun sHGetNameFromIDList(pidl: COpaquePointer?, sigdnname: Sigdn, ppszname: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetNameFromIDList((pidl?.value ?: 0L), sigdnname, (ppszname?.value ?: 0L))

public actual fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetNewLinkInfoA((pszlinkto?.value ?: 0L), (pszdir?.value ?: 0L), (pszname?.value ?: 0L), (pfmustcopy?.value ?: 0L), uflags.toInt())

public actual fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: COpaquePointer?, uflags: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetNewLinkInfoW((pszlinkto?.value ?: 0L), (pszdir?.value ?: 0L), (pszname?.value ?: 0L), (pfmustcopy?.value ?: 0L), uflags.toInt())

public actual fun sHGetPathFromIDListA(pidl: COpaquePointer?, pszpath: Pstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetPathFromIDListA((pidl?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun sHGetPathFromIDListEx(pidl: COpaquePointer?, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetPathFromIDListEx((pidl?.value ?: 0L), (pszpath?.value ?: 0L), cchpath.toInt(), uopts.toInt())

public actual fun sHGetPathFromIDListW(pidl: COpaquePointer?, pszpath: Pwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetPathFromIDListW((pidl?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun sHGetRealIDL(psf: COpaquePointer?, pidlsimple: COpaquePointer?, ppidlreal: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetRealIDL((psf?.value ?: 0L), (pidlsimple?.value ?: 0L), (ppidlreal?.value ?: 0L))

public actual fun sHGetSetFolderCustomSettings(pfcs: COpaquePointer?, pszpath: Pcwstr, dwreadwrite: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetSetFolderCustomSettings((pfcs?.value ?: 0L), (pszpath?.value ?: 0L), dwreadwrite.toInt())

public actual fun sHGetSetSettings(lpss: COpaquePointer?, dwmask: SsfMask, bset: Bool) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetSetSettings((lpss?.value ?: 0L), dwmask.toInt(), bset)
}

public actual fun sHGetSettings(psfs: COpaquePointer?, dwmask: UInt) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetSettings((psfs?.value ?: 0L), dwmask.toInt())
}

public actual fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetSpecialFolderLocation((hwnd?.value ?: 0L), csidl, (ppidl?.value ?: 0L))

public actual fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathA((hwnd?.value ?: 0L), (pszpath?.value ?: 0L), csidl, fcreate)

public actual fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetSpecialFolderPathW((hwnd?.value ?: 0L), (pszpath?.value ?: 0L), csidl, fcreate)

public actual fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetStockIconInfo(siid, uflags.toInt(), (psii?.value ?: 0L))

public actual fun sHGetTemporaryPropertyForItem(psi: COpaquePointer?, propkey: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetTemporaryPropertyForItem((psi?.value ?: 0L), (propkey?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun sHGetThreadRef(ppunk: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetThreadRef((ppunk?.value ?: 0L))

public actual fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: COpaquePointer?, pfiletime: COpaquePointer?, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetUnreadMailCountW((hkeyuser?.value ?: 0L), (pszmailaddress?.value ?: 0L), (pdwcount?.value ?: 0L), (pfiletime?.value ?: 0L), (pszshellexecutecommand?.value ?: 0L), cchshellexecutecommand)

public actual fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetValueA((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetValueW((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHGetViewStatePropertyBag(pidl: COpaquePointer?, pszbagname: Pcwstr, dwflags: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGetViewStatePropertyBag((pidl?.value ?: 0L), (pszbagname?.value ?: 0L), dwflags.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun sHGlobalCounterDecrement(id: Shglobalcounter): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGlobalCounterDecrement(id)

public actual fun sHGlobalCounterGetValue(id: Shglobalcounter): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGlobalCounterGetValue(id)

public actual fun sHGlobalCounterIncrement(id: Shglobalcounter): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHGlobalCounterIncrement(id)

public actual fun sHHandleUpdateImage(pidlextra: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHHandleUpdateImage((pidlextra?.value ?: 0L))

public actual fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: COpaquePointer?, rgfinout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHILCreateFromPath((pszpath?.value ?: 0L), (ppidl?.value ?: 0L), (rgfinout?.value ?: 0L))

public actual fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHInvokePrinterCommandA((hwnd?.value ?: 0L), uaction.toInt(), (lpbuf1?.value ?: 0L), (lpbuf2?.value ?: 0L), fmodal)

public actual fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHInvokePrinterCommandW((hwnd?.value ?: 0L), uaction.toInt(), (lpbuf1?.value ?: 0L), (lpbuf2?.value ?: 0L), fmodal)

public actual fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHIsFileAvailableOffline((pwszpath?.value ?: 0L), (pdwstatus?.value ?: 0L))

public actual fun sHIsLowMemoryMachine(dwtype: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHIsLowMemoryMachine(dwtype.toInt())

public actual fun sHLimitInputEdit(hwndedit: Hwnd, psf: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHLimitInputEdit((hwndedit?.value ?: 0L), (psf?.value ?: 0L))

public actual fun sHLoadInProc(rclsid: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHLoadInProc((rclsid?.value ?: 0L))

public actual fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHLoadIndirectString((pszsource?.value ?: 0L), (pszoutbuf?.value ?: 0L), cchoutbuf.toInt(), (ppvreserved?.value ?: 0L))

public actual fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHLoadNonloadedIconOverlayIdentifiers()

public actual fun sHLockShared(hdata: Handle, dwprocessid: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHLockShared((hdata?.value ?: 0L), dwprocessid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHMapPIDLToSystemImageListIndex(pshf: COpaquePointer?, pidl: COpaquePointer?, piindexsel: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHMapPIDLToSystemImageListIndex((pshf?.value ?: 0L), (pidl?.value ?: 0L), (piindexsel?.value ?: 0L))

public actual fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHMessageBoxCheckA((hwnd?.value ?: 0L), (psztext?.value ?: 0L), (pszcaption?.value ?: 0L), utype.toInt(), idefault, (pszregval?.value ?: 0L))

public actual fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHMessageBoxCheckW((hwnd?.value ?: 0L), (psztext?.value ?: 0L), (pszcaption?.value ?: 0L), utype.toInt(), idefault, (pszregval?.value ?: 0L))

public actual fun sHMultiFileProperties(pdtobj: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHMultiFileProperties((pdtobj?.value ?: 0L), dwflags.toInt())

public actual fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHObjectProperties((hwnd?.value ?: 0L), shopobjecttype.toInt(), (pszobjectname?.value ?: 0L), (pszpropertypage?.value ?: 0L))

public actual fun sHOpenFolderAndSelectItems(pidlfolder: COpaquePointer?, cidl: UInt, apidl: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHOpenFolderAndSelectItems((pidlfolder?.value ?: 0L), cidl.toInt(), (apidl?.value ?: 0L), dwflags.toInt())

public actual fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: COpaquePointer?, ckeys: UInt, pclsiddefault: COpaquePointer?, pdtobj: COpaquePointer?, psb: COpaquePointer?, pstartpage: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHOpenPropSheetW((pszcaption?.value ?: 0L), (ahkeys?.value ?: 0L), ckeys.toInt(), (pclsiddefault?.value ?: 0L), (pdtobj?.value ?: 0L), (psb?.value ?: 0L), (pstartpage?.value ?: 0L))

public actual fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHOpenRegStream2A((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), grfmode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHOpenRegStream2W((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), grfmode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHOpenRegStreamA((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), grfmode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHOpenRegStreamW((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), grfmode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHOpenWithDialog((hwndparent?.value ?: 0L), (poainfo?.value ?: 0L))

public actual fun sHParseDisplayName(pszname: Pcwstr, pbc: COpaquePointer?, ppidl: COpaquePointer?, sfgaoin: UInt, psfgaoout: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHParseDisplayName((pszname?.value ?: 0L), (pbc?.value ?: 0L), (ppidl?.value ?: 0L), sfgaoin.toInt(), (psfgaoout?.value ?: 0L))

public actual fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHPathPrepareForWriteA((hwnd?.value ?: 0L), (punkenablemodless?.value ?: 0L), (pszpath?.value ?: 0L), dwflags.toInt())

public actual fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: COpaquePointer?, pszpath: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHPathPrepareForWriteW((hwnd?.value ?: 0L), (punkenablemodless?.value ?: 0L), (pszpath?.value ?: 0L), dwflags.toInt())

public actual fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHQueryInfoKeyA((hkey?.value ?: 0L), (pcsubkeys?.value ?: 0L), (pcchmaxsubkeylen?.value ?: 0L), (pcvalues?.value ?: 0L), (pcchmaxvaluenamelen?.value ?: 0L)).toUInt()

public actual fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHQueryInfoKeyW((hkey?.value ?: 0L), (pcsubkeys?.value ?: 0L), (pcchmaxsubkeylen?.value ?: 0L), (pcvalues?.value ?: 0L), (pcchmaxvaluenamelen?.value ?: 0L)).toUInt()

public actual fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHQueryRecycleBinA((pszrootpath?.value ?: 0L), (pshqueryrbinfo?.value ?: 0L))

public actual fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHQueryRecycleBinW((pszrootpath?.value ?: 0L), (pshqueryrbinfo?.value ?: 0L))

public actual fun sHQueryUserNotificationState(pquns: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHQueryUserNotificationState((pquns?.value ?: 0L))

public actual fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHQueryValueExA((hkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pdwreserved?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHQueryValueExW((hkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pdwreserved?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHRegCloseUSKey(huskey: Long): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegCloseUSKey(huskey).toUInt()

public actual fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegCreateUSKeyA((pszpath?.value ?: 0L), samdesired.toInt(), hrelativeuskey, (phnewuskey?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegCreateUSKeyW((pwzpath?.value ?: 0L), samdesired.toInt(), hrelativeuskey, (phnewuskey?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyA(huskey, (pszsubkey?.value ?: 0L), delregflags).toUInt()

public actual fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegDeleteEmptyUSKeyW(huskey, (pwzsubkey?.value ?: 0L), delregflags).toUInt()

public actual fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegDeleteUSValueA(huskey, (pszvalue?.value ?: 0L), delregflags).toUInt()

public actual fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegDeleteUSValueW(huskey, (pwzvalue?.value ?: 0L), delregflags).toUInt()

public actual fun sHRegDuplicateHKey(hkey: Hkey): Hkey =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegDuplicateHKey((hkey?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegEnumUSKeyA(huskey, dwindex.toInt(), (pszname?.value ?: 0L), (pcchname?.value ?: 0L), enumregflags).toUInt()

public actual fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegEnumUSKeyW(huskey, dwindex.toInt(), (pwzname?.value ?: 0L), (pcchname?.value ?: 0L), enumregflags).toUInt()

public actual fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegEnumUSValueA(huskey, dwindex.toInt(), (pszvaluename?.value ?: 0L), (pcchvaluename?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L), enumregflags).toUInt()

public actual fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: COpaquePointer?, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegEnumUSValueW(huskey, dwindex.toInt(), (pszvaluename?.value ?: 0L), (pcchvaluename?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L), enumregflags).toUInt()

public actual fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueA((pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), fignorehkcu, fdefault)

public actual fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetBoolUSValueW((pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), fignorehkcu, fdefault)

public actual fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetIntW((hk?.value ?: 0L), (pwzkey?.value ?: 0L), idefault)

public actual fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetPathA((hkey?.value ?: 0L), (pcszsubkey?.value ?: 0L), (pcszvalue?.value ?: 0L), (pszpath?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetPathW((hkey?.value ?: 0L), (pcszsubkey?.value ?: 0L), (pcszvalue?.value ?: 0L), (pszpath?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetUSValueA((pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L), fignorehkcu, (pvdefaultdata?.value ?: 0L), dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetUSValueW((pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L), fignorehkcu, (pvdefaultdata?.value ?: 0L), dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetValueA((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), srrfflags, (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetValueFromHKCUHKLM((pwszkey?.value ?: 0L), (pwszvalue?.value ?: 0L), srrfflags, (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegGetValueW((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), srrfflags, (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, fignorehkcu: Bool): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegOpenUSKeyA((pszpath?.value ?: 0L), samdesired.toInt(), hrelativeuskey, (phnewuskey?.value ?: 0L), fignorehkcu).toUInt()

public actual fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: COpaquePointer?, fignorehkcu: Bool): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegOpenUSKeyW((pwzpath?.value ?: 0L), samdesired.toInt(), hrelativeuskey, (phnewuskey?.value ?: 0L), fignorehkcu).toUInt()

public actual fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyA(huskey, (pcsubkeys?.value ?: 0L), (pcchmaxsubkeylen?.value ?: 0L), (pcvalues?.value ?: 0L), (pcchmaxvaluenamelen?.value ?: 0L), enumregflags).toUInt()

public actual fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: COpaquePointer?, pcchmaxsubkeylen: COpaquePointer?, pcvalues: COpaquePointer?, pcchmaxvaluenamelen: COpaquePointer?, enumregflags: ShregenumFlags): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegQueryInfoUSKeyW(huskey, (pcsubkeys?.value ?: 0L), (pcchmaxsubkeylen?.value ?: 0L), (pcvalues?.value ?: 0L), (pcchmaxvaluenamelen?.value ?: 0L), enumregflags).toUInt()

public actual fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegQueryUSValueA(huskey, (pszvalue?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L), fignorehkcu, (pvdefaultdata?.value ?: 0L), dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?, fignorehkcu: Bool, pvdefaultdata: COpaquePointer?, dwdefaultdatasize: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegQueryUSValueW(huskey, (pszvalue?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L), fignorehkcu, (pvdefaultdata?.value ?: 0L), dwdefaultdatasize.toInt()).toUInt()

public actual fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegSetPathA((hkey?.value ?: 0L), (pcszsubkey?.value ?: 0L), (pcszvalue?.value ?: 0L), (pcszpath?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegSetPathW((hkey?.value ?: 0L), (pcszsubkey?.value ?: 0L), (pcszvalue?.value ?: 0L), (pcszpath?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegSetUSValueA((pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), dwtype.toInt(), (pvdata?.value ?: 0L), cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegSetUSValueW((pwzsubkey?.value ?: 0L), (pwzvalue?.value ?: 0L), dwtype.toInt(), (pvdata?.value ?: 0L), cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegWriteUSValueA(huskey, (pszvalue?.value ?: 0L), dwtype.toInt(), (pvdata?.value ?: 0L), cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt, dwflags: UInt): Win32Error =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRegWriteUSValueW(huskey, (pwzvalue?.value ?: 0L), dwtype.toInt(), (pvdata?.value ?: 0L), cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun sHReleaseThreadRef(): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHReleaseThreadRef()

public actual fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRemoveLocalizedName((pszpath?.value ?: 0L))

public actual fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    0u

public actual fun sHResolveLibrary(psilibrary: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHResolveLibrary((psilibrary?.value ?: 0L))

public actual fun sHRestricted(rest: Restrictions): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHRestricted(rest).toUInt()

public actual fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSendMessageBroadcastA(umsg.toInt(), wparam.toLong(), lparam)

public actual fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSendMessageBroadcastW(umsg.toInt(), wparam.toLong(), lparam)

public actual fun sHSetDefaultProperties(hwnd: Hwnd, psi: COpaquePointer?, dwfileopflags: UInt, pfops: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetDefaultProperties((hwnd?.value ?: 0L), (psi?.value ?: 0L), dwfileopflags.toInt(), (pfops?.value ?: 0L))

public actual fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetFolderPathA(csidl, (htoken?.value ?: 0L), dwflags.toInt(), (pszpath?.value ?: 0L))

public actual fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetFolderPathW(csidl, (htoken?.value ?: 0L), dwflags.toInt(), (pszpath?.value ?: 0L))

public actual fun sHSetInstanceExplorer(punk: COpaquePointer?) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetInstanceExplorer((punk?.value ?: 0L))
}

public actual fun sHSetKnownFolderPath(rfid: COpaquePointer?, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetKnownFolderPath((rfid?.value ?: 0L), dwflags.toInt(), (htoken?.value ?: 0L), (pszpath?.value ?: 0L))

public actual fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetLocalizedName((pszpath?.value ?: 0L), (pszresmodule?.value ?: 0L), idsres)

public actual fun sHSetTemporaryPropertyForItem(psi: COpaquePointer?, propkey: COpaquePointer?, propvar: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetTemporaryPropertyForItem((psi?.value ?: 0L), (propkey?.value ?: 0L), (propvar?.value ?: 0L))

public actual fun sHSetThreadRef(punk: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetThreadRef((punk?.value ?: 0L))

public actual fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetUnreadMailCountW((pszmailaddress?.value ?: 0L), dwcount.toInt(), (pszshellexecutecommand?.value ?: 0L))

public actual fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetValueA((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), dwtype.toInt(), (pvdata?.value ?: 0L), cbdata.toInt())

public actual fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: COpaquePointer?, cbdata: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSetValueW((hkey?.value ?: 0L), (pszsubkey?.value ?: 0L), (pszvalue?.value ?: 0L), dwtype.toInt(), (pvdata?.value ?: 0L), cbdata.toInt())

public actual fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shshellFolderViewMessage((hwndmain?.value ?: 0L), umsg.toInt(), lparam)

public actual fun sHShowManageLibraryUI(psilibrary: COpaquePointer?, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHShowManageLibraryUI((psilibrary?.value ?: 0L), (hwndowner?.value ?: 0L), (psztitle?.value ?: 0L), (pszinstruction?.value ?: 0L), lmdoptions)

public actual fun sHSimpleIDListFromPath(pszpath: Pcwstr): COpaquePointer? =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSimpleIDListFromPath((pszpath?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sHSkipJunction(pbc: COpaquePointer?, pclsid: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHSkipJunction((pbc?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHStartNetConnectionDialogW((hwnd?.value ?: 0L), (pszremotename?.value ?: 0L), dwtype.toInt())

public actual fun sHStrDupA(psz: Pcstr, ppwsz: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHStrDupA((psz?.value ?: 0L), (ppwsz?.value ?: 0L))

public actual fun sHStrDupW(psz: Pcwstr, ppwsz: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHStrDupW((psz?.value ?: 0L), (ppwsz?.value ?: 0L))

public actual fun sHStripMneumonicA(pszmenu: Pstr): Byte =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHStripMneumonicA((pszmenu?.value ?: 0L))

public actual fun sHStripMneumonicW(pszmenu: Pwstr): UShort =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHStripMneumonicW((pszmenu?.value ?: 0L)).toUShort()

public actual fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHTestTokenMembership((htoken?.value ?: 0L), ulrid.toInt())

public actual fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHUnicodeToAnsi((pwszsrc?.value ?: 0L), (pszdst?.value ?: 0L), cchbuf)

public actual fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHUnicodeToUnicode((pwzsrc?.value ?: 0L), (pwzdst?.value ?: 0L), cwchbuf)

public actual fun sHUnlockShared(pvdata: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHUnlockShared((pvdata?.value ?: 0L))

public actual fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHUpdateImageA((pszhashitem?.value ?: 0L), iindex, uflags.toInt(), iimageindex)
}

public actual fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHUpdateImageW((pszhashitem?.value ?: 0L), iindex, uflags.toInt(), iimageindex)
}

public actual fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_sHValidateUNC((hwndowner?.value ?: 0L), (pszfile?.value ?: 0L), fconnect.toInt())

public actual fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_setCurrentProcessExplicitAppUserModelID((appid?.value ?: 0L))

public actual fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_setMenuContextHelpId((param0?.value ?: 0L), param1.toInt())

public actual fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_setWindowContextHelpId((param0?.value ?: 0L), param1.toInt())

public actual fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_setWindowSubclass((hwnd?.value ?: 0L), 0L, uidsubclass.toLong(), dwrefdata.toLong())

public actual fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellAboutA((hwnd?.value ?: 0L), (szapp?.value ?: 0L), (szotherstuff?.value ?: 0L), (hicon?.value ?: 0L))

public actual fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellAboutW((hwnd?.value ?: 0L), (szapp?.value ?: 0L), (szotherstuff?.value ?: 0L), (hicon?.value ?: 0L))

public actual fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellExecuteA((hwnd?.value ?: 0L), (lpoperation?.value ?: 0L), (lpfile?.value ?: 0L), (lpparameters?.value ?: 0L), (lpdirectory?.value ?: 0L), nshowcmd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shellExecuteExA(pexecinfo: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellExecuteExA((pexecinfo?.value ?: 0L))

public actual fun shellExecuteExW(pexecinfo: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellExecuteExW((pexecinfo?.value ?: 0L))

public actual fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellExecuteW((hwnd?.value ?: 0L), (lpoperation?.value ?: 0L), (lpfile?.value ?: 0L), (lpparameters?.value ?: 0L), (lpdirectory?.value ?: 0L), nshowcmd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellMessageBoxA((happinst?.value ?: 0L), (hwnd?.value ?: 0L), (lpctext?.value ?: 0L), (lpctitle?.value ?: 0L), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellMessageBoxW((happinst?.value ?: 0L), (hwnd?.value ?: 0L), (lpctext?.value ?: 0L), (lpctitle?.value ?: 0L), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellGetCachedImageIndex((pwsziconpath?.value ?: 0L), iiconindex, uiconflags.toInt())

public actual fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellGetCachedImageIndexA((psziconpath?.value ?: 0L), iiconindex, uiconflags.toInt())

public actual fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellGetCachedImageIndexW((psziconpath?.value ?: 0L), iiconindex, uiconflags.toInt())

public actual fun shellGetImageLists(phiml: COpaquePointer?, phimlsmall: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellGetImageLists((phiml?.value ?: 0L), (phimlsmall?.value ?: 0L))

public actual fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellMergeMenus((hmdst?.value ?: 0L), (hmsrc?.value ?: 0L), uinsert.toInt(), uidadjust.toInt(), uidadjustmax.toInt(), uflags.toInt()).toUInt()

public actual fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellNotifyIconA(dwmessage.toInt(), (lpdata?.value ?: 0L))

public actual fun shellNotifyIconGetRect(identifier: COpaquePointer?, iconlocation: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellNotifyIconGetRect((identifier?.value ?: 0L), (iconlocation?.value ?: 0L))

public actual fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_shellNotifyIconW(dwmessage.toInt(), (lpdata?.value ?: 0L))

public actual fun signalFileOpen(pidl: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_signalFileOpen((pidl?.value ?: 0L))

public actual fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: COpaquePointer?): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_softwareUpdateMessageBox((hwnd?.value ?: 0L), (pszdistunit?.value ?: 0L), dwflags.toInt(), (psdi?.value ?: 0L)).toUInt()

public actual fun stgMakeUniqueName(pstgparent: COpaquePointer?, pszfilespec: Pcwstr, grfmode: UInt, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_stgMakeUniqueName((pstgparent?.value ?: 0L), (pszfilespec?.value ?: 0L), grfmode.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCSpnA((pszstr?.value ?: 0L), (pszset?.value ?: 0L))

public actual fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCSpnIA((pszstr?.value ?: 0L), (pszset?.value ?: 0L))

public actual fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCSpnIW((pszstr?.value ?: 0L), (pszset?.value ?: 0L))

public actual fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCSpnW((pszstr?.value ?: 0L), (pszset?.value ?: 0L))

public actual fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCatBuffA((pszdest?.value ?: 0L), (pszsrc?.value ?: 0L), cchdestbuffsize).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCatBuffW((pszdest?.value ?: 0L), (pszsrc?.value ?: 0L), cchdestbuffsize).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCatChainW((pszdst?.value ?: 0L), cchdst.toInt(), ichat.toInt(), (pszsrc?.value ?: 0L)).toUInt()

public actual fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCatW((psz1?.value ?: 0L), (psz2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strChrA((pszstart?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strChrIA((pszstart?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strChrIW((pszstart?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strChrNIW((pszstart?.value ?: 0L), wmatch.toShort(), cchmax.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strChrNW((pszstart?.value ?: 0L), wmatch.toShort(), cchmax.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strChrW((pszstart?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpCA((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L))

public actual fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpCW((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L))

public actual fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpICA((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L))

public actual fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpICW((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L))

public actual fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpIW((psz1?.value ?: 0L), (psz2?.value ?: 0L))

public actual fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpLogicalW((psz1?.value ?: 0L), (psz2?.value ?: 0L))

public actual fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNA((psz1?.value ?: 0L), (psz2?.value ?: 0L), nchar)

public actual fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNCA((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L), nchar)

public actual fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNCW((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L), nchar)

public actual fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNIA((psz1?.value ?: 0L), (psz2?.value ?: 0L), nchar)

public actual fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNICA((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L), nchar)

public actual fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNICW((pszstr1?.value ?: 0L), (pszstr2?.value ?: 0L), nchar)

public actual fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNIW((psz1?.value ?: 0L), (psz2?.value ?: 0L), nchar)

public actual fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpNW((psz1?.value ?: 0L), (psz2?.value ?: 0L), nchar)

public actual fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCmpW((psz1?.value ?: 0L), (psz2?.value ?: 0L))

public actual fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCpyNW((pszdst?.value ?: 0L), (pszsrc?.value ?: 0L), cchmax).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strCpyW((psz1?.value ?: 0L), (psz2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strDupA(pszsrch: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strDupA((pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strDupW(pszsrch: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strDupW((pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFormatByteSize64A(qdw, (pszbuf?.value ?: 0L), cchbuf.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFormatByteSizeA(dw.toInt(), (pszbuf?.value ?: 0L), cchbuf.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFormatByteSizeEx(ull.toLong(), flags, (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFormatByteSizeW(qdw, (pszbuf?.value ?: 0L), cchbuf.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFormatKBSizeA(qdw, (pszbuf?.value ?: 0L), cchbuf.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFormatKBSizeW(qdw, (pszbuf?.value ?: 0L), cchbuf.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFromTimeIntervalA((pszout?.value ?: 0L), cchmax.toInt(), dwtimems.toInt(), digits)

public actual fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strFromTimeIntervalW((pszout?.value ?: 0L), cchmax.toInt(), dwtimems.toInt(), digits)

public actual fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strIsIntlEqualA(fcasesens, (pszstring1?.value ?: 0L), (pszstring2?.value ?: 0L), nchar)

public actual fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strIsIntlEqualW(fcasesens, (pszstring1?.value ?: 0L), (pszstring2?.value ?: 0L), nchar)

public actual fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strNCatA((psz1?.value ?: 0L), (psz2?.value ?: 0L), cchmax).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strNCatW((psz1?.value ?: 0L), (psz2?.value ?: 0L), cchmax).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strPBrkA((psz?.value ?: 0L), (pszset?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strPBrkW((psz?.value ?: 0L), (pszset?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRChrA((pszstart?.value ?: 0L), (pszend?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRChrIA((pszstart?.value ?: 0L), (pszend?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRChrIW((pszstart?.value ?: 0L), (pszend?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRChrW((pszstart?.value ?: 0L), (pszend?.value ?: 0L), wmatch.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRStrIA((pszsource?.value ?: 0L), (pszlast?.value ?: 0L), (pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRStrIW((pszsource?.value ?: 0L), (pszlast?.value ?: 0L), (pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strRetToBSTR(pstr: COpaquePointer?, pidl: COpaquePointer?, pbstr: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRetToBSTR((pstr?.value ?: 0L), (pidl?.value ?: 0L), (pbstr?.value ?: 0L))

public actual fun strRetToBufA(pstr: COpaquePointer?, pidl: COpaquePointer?, pszbuf: Pstr, cchbuf: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRetToBufA((pstr?.value ?: 0L), (pidl?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun strRetToBufW(pstr: COpaquePointer?, pidl: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRetToBufW((pstr?.value ?: 0L), (pidl?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun strRetToStrA(pstr: COpaquePointer?, pidl: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRetToStrA((pstr?.value ?: 0L), (pidl?.value ?: 0L), (ppsz?.value ?: 0L))

public actual fun strRetToStrW(pstr: COpaquePointer?, pidl: COpaquePointer?, ppsz: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strRetToStrW((pstr?.value ?: 0L), (pidl?.value ?: 0L), (ppsz?.value ?: 0L))

public actual fun strSpnA(psz: Pcstr, pszset: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strSpnA((psz?.value ?: 0L), (pszset?.value ?: 0L))

public actual fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strSpnW((psz?.value ?: 0L), (pszset?.value ?: 0L))

public actual fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strStrA((pszfirst?.value ?: 0L), (pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strStrIA((pszfirst?.value ?: 0L), (pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strStrIW((pszfirst?.value ?: 0L), (pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strStrNIW((pszfirst?.value ?: 0L), (pszsrch?.value ?: 0L), cchmax.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strStrNW((pszfirst?.value ?: 0L), (pszsrch?.value ?: 0L), cchmax.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strStrW((pszfirst?.value ?: 0L), (pszsrch?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strToInt64ExA((pszstring?.value ?: 0L), dwflags, (pllret?.value ?: 0L))

public actual fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strToInt64ExW((pszstring?.value ?: 0L), dwflags, (pllret?.value ?: 0L))

public actual fun strToIntA(pszsrc: Pcstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strToIntA((pszsrc?.value ?: 0L))

public actual fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strToIntExA((pszstring?.value ?: 0L), dwflags, (piret?.value ?: 0L))

public actual fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strToIntExW((pszstring?.value ?: 0L), dwflags, (piret?.value ?: 0L))

public actual fun strToIntW(pszsrc: Pcwstr): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strToIntW((pszsrc?.value ?: 0L))

public actual fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strTrimA((psz?.value ?: 0L), (psztrimchars?.value ?: 0L))

public actual fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_strTrimW((psz?.value ?: 0L), (psztrimchars?.value ?: 0L))

public actual fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_unloadUserProfile((htoken?.value ?: 0L), (hprofile?.value ?: 0L))

public actual fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_unregisterAppConstrainedChangeNotification(registration)
}

public actual fun unregisterAppStateChangeNotification(registration: PappstateRegistration) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_unregisterAppStateChangeNotification(registration)
}

public actual fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_unregisterScaleChangeEvent(dwcookie.toLong())

public actual fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlApplySchemeA((pszin?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L), dwflags.toInt())

public actual fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlApplySchemeW((pszin?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L), dwflags.toInt())

public actual fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCanonicalizeA((pszurl?.value ?: 0L), (pszcanonicalized?.value ?: 0L), (pcchcanonicalized?.value ?: 0L), dwflags.toInt())

public actual fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCanonicalizeW((pszurl?.value ?: 0L), (pszcanonicalized?.value ?: 0L), (pcchcanonicalized?.value ?: 0L), dwflags.toInt())

public actual fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCombineA((pszbase?.value ?: 0L), (pszrelative?.value ?: 0L), (pszcombined?.value ?: 0L), (pcchcombined?.value ?: 0L), dwflags.toInt())

public actual fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCombineW((pszbase?.value ?: 0L), (pszrelative?.value ?: 0L), (pszcombined?.value ?: 0L), (pcchcombined?.value ?: 0L), dwflags.toInt())

public actual fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCompareA((psz1?.value ?: 0L), (psz2?.value ?: 0L), fignoreslash)

public actual fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCompareW((psz1?.value ?: 0L), (psz2?.value ?: 0L), fignoreslash)

public actual fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCreateFromPathA((pszpath?.value ?: 0L), (pszurl?.value ?: 0L), (pcchurl?.value ?: 0L), dwflags.toInt())

public actual fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlCreateFromPathW((pszpath?.value ?: 0L), (pszurl?.value ?: 0L), (pcchurl?.value ?: 0L), dwflags.toInt())

public actual fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlEscapeA((pszurl?.value ?: 0L), (pszescaped?.value ?: 0L), (pcchescaped?.value ?: 0L), dwflags.toInt())

public actual fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlEscapeW((pszurl?.value ?: 0L), (pszescaped?.value ?: 0L), (pcchescaped?.value ?: 0L), dwflags.toInt())

public actual fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlFixupW((pcszurl?.value ?: 0L), (psztranslatedurl?.value ?: 0L), cchmax.toInt())

public actual fun urlGetLocationA(pszurl: Pcstr): Pcstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlGetLocationA((pszurl?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun urlGetLocationW(pszurl: Pcwstr): Pcwstr =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlGetLocationW((pszurl?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: COpaquePointer?, dwpart: UInt, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlGetPartA((pszin?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L), dwpart.toInt(), dwflags.toInt())

public actual fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: COpaquePointer?, dwpart: UInt, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlGetPartW((pszin?.value ?: 0L), (pszout?.value ?: 0L), (pcchout?.value ?: 0L), dwpart.toInt(), dwflags.toInt())

public actual fun urlHashA(pszurl: Pcstr, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlHashA((pszurl?.value ?: 0L), (pbhash?.value ?: 0L), cbhash.toInt())

public actual fun urlHashW(pszurl: Pcwstr, pbhash: COpaquePointer?, cbhash: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlHashW((pszurl?.value ?: 0L), (pbhash?.value ?: 0L), cbhash.toInt())

public actual fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlIsA((pszurl?.value ?: 0L), urlis)

public actual fun urlIsNoHistoryA(pszurl: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlIsNoHistoryA((pszurl?.value ?: 0L))

public actual fun urlIsNoHistoryW(pszurl: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlIsNoHistoryW((pszurl?.value ?: 0L))

public actual fun urlIsOpaqueA(pszurl: Pcstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlIsOpaqueA((pszurl?.value ?: 0L))

public actual fun urlIsOpaqueW(pszurl: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlIsOpaqueW((pszurl?.value ?: 0L))

public actual fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlIsW((pszurl?.value ?: 0L), urlis)

public actual fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlUnescapeA((pszurl?.value ?: 0L), (pszunescaped?.value ?: 0L), (pcchunescaped?.value ?: 0L), dwflags.toInt())

public actual fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_urlUnescapeW((pszurl?.value ?: 0L), (pszunescaped?.value ?: 0L), (pcchunescaped?.value ?: 0L), dwflags.toInt())

public actual fun variantToStrRet(varin: COpaquePointer?, pstrret: COpaquePointer?): Hresult =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_variantToStrRet((varin?.value ?: 0L), (pstrret?.value ?: 0L))

public actual fun whichPlatform(): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_whichPlatform().toUInt()

public actual fun win32DeleteFile(pszpath: Pcwstr): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_win32DeleteFile((pszpath?.value ?: 0L))

public actual fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_winHelpA((hwndmain?.value ?: 0L), (lpszhelp?.value ?: 0L), ucommand.toInt(), dwdata.toLong())

public actual fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_winHelpW((hwndmain?.value ?: 0L), (lpszhelp?.value ?: 0L), ucommand.toInt(), dwdata.toLong())

public actual fun writeCabinetState(pcs: COpaquePointer?): Bool =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_writeCabinetState((pcs?.value ?: 0L))

public actual fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_wnsprintfA((pszdest?.value ?: 0L), cchdest, (pszfmt?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_wnsprintfW((pszdest?.value ?: 0L), cchdest, (pszfmt?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_wvnsprintfA((pszdest?.value ?: 0L), cchdest, (pszfmt?.value ?: 0L), (arglist?.value ?: 0L))

public actual fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: COpaquePointer?): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_wvnsprintfW((pszdest?.value ?: 0L), cchdest, (pszfmt?.value ?: 0L), (arglist?.value ?: 0L))
