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

private object WindowsWin32UiShellJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocCreateForClasses(rgclasses: Long, cclasses: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocGetPerceivedType(pszext: Long, ptype: Long, pflag: Long, ppsztype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocIsDangerous(pszassoc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocQueryKeyA(flags: Int, key: Int, pszassoc: Long, pszextra: Long, phkeyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocQueryKeyW(flags: Int, key: Int, pszassoc: Long, pszextra: Long, phkeyout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocQueryStringA(flags: Int, str: Int, pszassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocQueryStringByKeyA(flags: Int, str: Int, hkassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocQueryStringByKeyW(flags: Int, str: Int, hkassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_AssocQueryStringW(flags: Int, str: Int, pszassoc: Long, pszextra: Long, pszout: Long, pcchout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_CDefFolderMenu_Create2(pidlfolder: Long, hwnd: Long, cidl: Int, apidl: Long, psf: Long, pfn: Long, nkeys: Int, ahkeys: Long, ppcm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_CIDLData_CreateFromIDArray(pidlfolder: Long, cidl: Int, apidl: Long, ppdtobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ChrCmpIA(w1: Short, w2: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ChrCmpIW(w1: Short, w2: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ColorAdjustLuma(clrrgb: Int, n: Int, fscale: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ColorHLSToRGB(whue: Short, wluminance: Short, wsaturation: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ColorRGBToHLS(clrrgb: Int, pwhue: Long, pwluminance: Long, pwsaturation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_CommandLineToArgvW(lpcmdline: Long, pnumargs: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: Int, punktarget: Long, pdwcookie: Long, ppcpout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_CreateProfile(pszusersid: Long, pszusername: Long, pszprofilepath: Long, cchprofilepath: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DAD_AutoScroll(hwnd: Long, pad: Long, pptnow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DAD_DragLeave(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DAD_SetDragImage(him: Long, pptoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DAD_ShowDragImage(fshow: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DefSubclassProc(hwnd: Long, umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DeleteProfileA(lpsidstring: Long, lpprofilepath: Long, lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DeleteProfileW(lpsidstring: Long, lpprofilepath: Long, lpcomputername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DoEnvironmentSubstA(pszsrc: Long, cchsrc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DoEnvironmentSubstW(pszsrc: Long, cchsrc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DragAcceptFiles(hwnd: Long, faccept: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DragFinish(hdrop: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DragQueryFileA(hdrop: Long, ifile: Int, lpszfile: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DragQueryFileW(hdrop: Long, ifile: Int, lpszfile: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DragQueryPoint(hdrop: Long, ppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DriveType(idrive: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_DuplicateIcon(hinst: Long, hicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractAssociatedIconA(hinst: Long, psziconpath: Long, piicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractAssociatedIconExA(hinst: Long, psziconpath: Long, piiconindex: Long, piiconid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractAssociatedIconExW(hinst: Long, psziconpath: Long, piiconindex: Long, piiconid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractAssociatedIconW(hinst: Long, psziconpath: Long, piicon: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractIconA(hinst: Long, pszexefilename: Long, niconindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractIconExA(lpszfile: Long, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractIconExW(lpszfile: Long, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ExtractIconW(hinst: Long, pszexefilename: Long, niconindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_FindExecutableA(lpfile: Long, lpdirectory: Long, lpresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_FindExecutableW(lpfile: Long, lpdirectory: Long, lpresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetAcceptLanguagesA(pszlanguages: Long, pcchlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetAcceptLanguagesW(pszlanguages: Long, pcchlanguages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetCurrentProcessExplicitAppUserModelID(appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetDpiForShellUIComponent(param0: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetFileNameFromBrowse(hwnd: Long, pszfilepath: Long, cchfilepath: Int, pszworkingdir: Long, pszdefext: Long, pszfilters: Long, psztitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetMenuContextHelpId(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetMenuPosFromID(hmenu: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetProfileType(dwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetProfilesDirectoryA(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetProfilesDirectoryW(lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetScaleFactorForDevice(devicetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetScaleFactorForMonitor(hmon: Long, pscale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetUserProfileDirectoryA(htoken: Long, lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetUserProfileDirectoryW(htoken: Long, lpprofiledir: Long, lpcchsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetWindowContextHelpId(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_GetWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long, pdwrefdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HashData(pbdata: Long, cbdata: Int, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: Int, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateExtensionServices(pwzadditionalheaders: Long, phwnd: Long, pszusername: Long, pszpassword: Long, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: Long, pwzfriendlyname: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateFromString(pwztarget: Long, pwzlocation: Long, pwzfriendlyname: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateShortcut(grfhlshortcutf: Int, pihl: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromMoniker(grfhlshortcutf: Int, pimktarget: Long, pwzlocation: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromString(grfhlshortcutf: Int, pwztarget: Long, pwzlocation: Long, pwzdir: Long, pwzfilename: Long, ppwzshortcutfile: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkGetSpecialReference(ureference: Int, ppwzreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkGetValueFromParams(pwzparams: Long, pwzname: Long, ppwzvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkIsShortcut(pwzfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: Int, pbc: Long, pibsc: Long, pihlbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkNavigateToStringReference(pwztarget: Long, pwzlocation: Long, pihlsite: Long, dwsitedata: Int, pihlframe: Long, grfhlnf: Int, pibc: Long, pibsc: Long, pihlbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: Int, pimktarget: Long, pwzlocation: Long, pwzfriendlyname: Long, puhlid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkOnRenameDocument(dwreserved: Int, pihlbc: Long, pimkold: Long, pimknew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkParseDisplayName(pibc: Long, pwzdisplayname: Long, fnoforceabs: Int, pccheaten: Long, ppimk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkQueryCreateFromData(pidataobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkResolveMonikerForData(pimkreference: Long, reserved: Int, pibc: Long, cfmtetc: Int, rgfmtetc: Long, pibsc: Long, pimkbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkResolveShortcut(pwzshortcutfilename: Long, pihlsite: Long, dwsitedata: Int, piunkouter: Long, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkResolveShortcutToMoniker(pwzshortcutfilename: Long, ppimktarget: Long, ppwzlocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkResolveShortcutToString(pwzshortcutfilename: Long, ppwztarget: Long, ppwzlocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkResolveStringForData(pwzreference: Long, reserved: Int, pibc: Long, cfmtetc: Int, rgfmtetc: Long, pibsc: Long, pimkbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkSetSpecialReference(ureference: Int, pwzreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkTranslateURL(pwzurl: Long, grfflags: Int, ppwztranslatedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_HlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: Int, pimktrgt: Long, pwzlocation: Long, pwzfriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILAppendID(pidl: Long, pmkid: Long, fappend: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILClone(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILCloneFirst(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILCombine(pidl1: Long, pidl2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILCreateFromPathA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILCreateFromPathW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILFindChild(pidlparent: Long, pidlchild: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILFindLastID(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILFree(pidl: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILGetNext(pidl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILGetSize(pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILIsEqual(pidl1: Long, pidl2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILIsParent(pidl1: Long, pidl2: Long, fimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILLoadFromStreamEx(pstm: Long, pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILRemoveLastID(pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ILSaveToStream(pstm: Long, pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_Copy(pstmfrom: Long, pstmto: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_Read(pstm: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_ReadPidl(pstm: Long, ppidlout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_ReadStr(pstm: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_Reset(pstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_Size(pstm: Long, pui: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_Write(pstm: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_WritePidl(pstm: Long, pidlwrite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IStream_WriteStr(pstm: Long, psz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IUnknown_AtomicRelease(ppunk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IUnknown_GetSite(punk: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IUnknown_GetWindow(punk: Long, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IUnknown_QueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IUnknown_Set(ppunk: Long, punk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IUnknown_SetSite(punk: Long, punksite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ImportPrivacySettings(pszfilename: Long, pfparseprivacypreferences: Long, pfparsepersiterules: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_InitNetworkAddressControl(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_InitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_InitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IntlStrEqWorkerA(fcasesens: Int, lpstring1: Long, lpstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IntlStrEqWorkerW(fcasesens: Int, lpstring1: Long, lpstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsCharSpaceA(wch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsCharSpaceW(wch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsInternetESCEnabled(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsLFNDriveA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsLFNDriveW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsNetDrive(idrive: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsOS(dwos: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_IsUserAnAdmin(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_LoadUserProfileA(htoken: Long, lpprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_LoadUserProfileW(htoken: Long, lpprofileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_OleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_OpenRegStream(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ParseURLA(pcszurl: Long, ppu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ParseURLW(pcszurl: Long, ppu: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAddBackslashA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAddBackslashW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAddExtensionA(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAddExtensionW(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAllocCanonicalize(pszpathin: Long, dwflags: Int, ppszpathout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAllocCombine(pszpathin: Long, pszmore: Long, dwflags: Int, ppszpathout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAppendA(pszpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathAppendW(pszpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathBuildRootA(pszroot: Long, idrive: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathBuildRootW(pszroot: Long, idrive: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCanonicalizeA(pszbuf: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCanonicalizeW(pszbuf: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchAddBackslash(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchAddBackslashEx(pszpath: Long, cchpath: Long, ppszend: Long, pcchremaining: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchAddExtension(pszpath: Long, cchpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchAppend(pszpath: Long, cchpath: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchAppendEx(pszpath: Long, cchpath: Long, pszmore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchCanonicalize(pszpathout: Long, cchpathout: Long, pszpathin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchCanonicalizeEx(pszpathout: Long, cchpathout: Long, pszpathin: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchCombine(pszpathout: Long, cchpathout: Long, pszpathin: Long, pszmore: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchCombineEx(pszpathout: Long, cchpathout: Long, pszpathin: Long, pszmore: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchFindExtension(pszpath: Long, cchpath: Long, ppszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchIsRoot(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchRemoveBackslash(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchRemoveBackslashEx(pszpath: Long, cchpath: Long, ppszend: Long, pcchremaining: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchRemoveExtension(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchRemoveFileSpec(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchRenameExtension(pszpath: Long, cchpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchSkipRoot(pszpath: Long, ppszrootend: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchStripPrefix(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCchStripToRoot(pszpath: Long, cchpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCleanupSpec(pszdir: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCombineA(pszdest: Long, pszdir: Long, pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCombineW(pszdest: Long, pszdir: Long, pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCommonPrefixA(pszfile1: Long, pszfile2: Long, achpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCommonPrefixW(pszfile1: Long, pszfile2: Long, achpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCompactPathA(hdc: Long, pszpath: Long, dx: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCompactPathExA(pszout: Long, pszsrc: Long, cchmax: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCompactPathExW(pszout: Long, pszsrc: Long, cchmax: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCompactPathW(hdc: Long, pszpath: Long, dx: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCreateFromUrlA(pszurl: Long, pszpath: Long, pcchpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCreateFromUrlAlloc(pszin: Long, ppszout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathCreateFromUrlW(pszurl: Long, pszpath: Long, pcchpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFileExistsA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFileExistsW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindExtensionA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindExtensionW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindFileNameA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindFileNameW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindNextComponentA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindNextComponentW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindOnPathA(pszpath: Long, ppszotherdirs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindOnPathW(pszpath: Long, ppszotherdirs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindSuffixArrayA(pszpath: Long, apszsuffix: Long, iarraysize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathFindSuffixArrayW(pszpath: Long, apszsuffix: Long, iarraysize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathGetArgsA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathGetArgsW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathGetCharTypeA(ch: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathGetCharTypeW(ch: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathGetDriveNumberA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathGetDriveNumberW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathGetShortPath(pszlongpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsContentTypeA(pszpath: Long, pszcontenttype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsContentTypeW(pszpath: Long, pszcontenttype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsDirectoryA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsDirectoryW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsExe(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsFileSpecA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsFileSpecW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsLFNFileSpecA(pszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsLFNFileSpecW(pszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsNetworkPathA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsNetworkPathW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsPrefixA(pszprefix: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsPrefixW(pszprefix: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsRelativeA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsRelativeW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsRootA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsRootW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsSameRootA(pszpath1: Long, pszpath2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsSameRootW(pszpath1: Long, pszpath2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsSlowA(pszfile: Long, dwattr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsSlowW(pszfile: Long, dwattr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsSystemFolderA(pszpath: Long, dwattrb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsSystemFolderW(pszpath: Long, dwattrb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsUNCA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsUNCEx(pszpath: Long, ppszserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsUNCServerA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsUNCServerShareA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsUNCServerShareW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsUNCServerW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsUNCW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsURLA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathIsURLW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMakePrettyA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMakePrettyW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMakeSystemFolderA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMakeSystemFolderW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMakeUniqueName(pszuniquename: Long, cchmax: Int, psztemplate: Long, pszlongplate: Long, pszdir: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMatchSpecA(pszfile: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMatchSpecExA(pszfile: Long, pszspec: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMatchSpecExW(pszfile: Long, pszspec: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathMatchSpecW(pszfile: Long, pszspec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathParseIconLocationA(psziconfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathParseIconLocationW(psziconfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathQualify(psz: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathQuoteSpacesA(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathQuoteSpacesW(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRelativePathToA(pszpath: Long, pszfrom: Long, dwattrfrom: Int, pszto: Long, dwattrto: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRelativePathToW(pszpath: Long, pszfrom: Long, dwattrfrom: Int, pszto: Long, dwattrto: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveArgsA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveArgsW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveBackslashA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveBackslashW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveBlanksA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveBlanksW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveExtensionA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveExtensionW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveFileSpecA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRemoveFileSpecW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRenameExtensionA(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathRenameExtensionW(pszpath: Long, pszext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathResolve(pszpath: Long, dirs: Long, fflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathSearchAndQualifyA(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathSearchAndQualifyW(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathSetDlgItemPathA(hdlg: Long, id: Int, pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathSetDlgItemPathW(hdlg: Long, id: Int, pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathSkipRootA(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathSkipRootW(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathStripPathA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathStripPathW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathStripToRootA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathStripToRootW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsA(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsW(pszpath: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUndecorateA(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUndecorateW(pszpath: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderA(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderW(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUnquoteSpacesA(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathUnquoteSpacesW(lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PathYetAnotherMakeUniqueName(pszuniquename: Long, pszpath: Long, pszshort: Long, pszfilespec: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PickIconDlg(hwnd: Long, psziconpath: Long, cchiconpath: Int, piiconindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_PropVariantToStrRet(propvar: Long, pstrret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_QISearch(that: Long, pqit: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ReadCabinetState(pcs: Long, clength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RealDriveType(idrive: Int, foktohitnet: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RegisterAppConstrainedChangeNotification(routine: Long, context: Long, registration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RegisterAppStateChangeNotification(routine: Long, context: Long, registration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RegisterScaleChangeEvent(hevent: Long, pdwcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RegisterScaleChangeNotifications(displaydevice: Int, hwndnotify: Long, umsgnotify: Int, pdwcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RemoveWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RestartDialog(hwnd: Long, pszprompt: Long, dwreturn: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RestartDialogEx(hwnd: Long, pszprompt: Long, dwreturn: Int, dwreasoncode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_RevokeScaleChangeNotifications(displaydevice: Int, dwcookie: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAddToRecentDocs(uflags: Int, pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAlloc(cb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAllocShared(pvdata: Long, dwsize: Int, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAnsiToAnsi(pszsrc: Long, pszdst: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAnsiToUnicode(pszsrc: Long, pwszdst: Long, cwchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAppBarMessage(dwmessage: Int, pdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAssocEnumHandlers(pszextra: Long, affilter: Int, ppenumhandler: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAssocEnumHandlersForProtocolByApplication(protocol: Long, riid: Long, enumhandlers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHAutoComplete(hwndedit: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHBrowseForFolderA(lpbi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHBrowseForFolderW(lpbi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCLSIDFromString(psz: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHChangeNotification_Lock(hchange: Long, dwprocid: Int, pppidl: Long, plevent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHChangeNotification_Unlock(hlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHChangeNotify(weventid: Int, uflags: Int, dwitem1: Long, dwitem2: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHChangeNotifyDeregister(ulid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHChangeNotifyRegister(hwnd: Long, fsources: Int, fevents: Int, wmsg: Int, centries: Int, pshcne: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHChangeNotifyRegisterThread(status: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCloneSpecialIDList(hwnd: Long, csidl: Int, fcreate: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCoCreateInstance(pszclsid: Long, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCopyKeyA(hkeysrc: Long, pszsrcsubkey: Long, hkeydest: Long, freserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCopyKeyW(hkeysrc: Long, pszsrcsubkey: Long, hkeydest: Long, freserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateAssociationRegistration(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateDataObject(pidlfolder: Long, cidl: Int, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateDefaultExtractIcon(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateDirectory(hwnd: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateDirectoryExA(hwnd: Long, pszpath: Long, psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateDirectoryExW(hwnd: Long, pszpath: Long, psa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateFileExtractIconW(pszfile: Long, dwfileattributes: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateItemFromParsingName(pszpath: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateItemFromRelativeName(psiparent: Long, pszname: Long, pbc: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateItemInKnownFolder(kfid: Long, dwkfflags: Int, pszitem: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateMemStream(pinit: Long, cbinit: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateProcessAsUserW(pscpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreatePropSheetExtArray(hkey: Long, pszsubkey: Long, max_iface: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellFolderView(pcsfv: Long, ppsv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: Int, ppidl: Long, ppsiitemarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromIDLists(cidl: Int, rgpidl: Long, ppsiitemarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateShellPalette(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateStdEnumFmtEtc(cfmt: Int, afmt: Long, ppenumformatetc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateStreamOnFileA(pszfile: Long, grfmode: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateStreamOnFileEx(pszfile: Long, grfmode: Int, dwattributes: Int, fcreate: Int, pstmtemplate: Long, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateStreamOnFileW(pszfile: Long, grfmode: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHCreateThreadRef(pcref: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDefExtractIconA(psziconfile: Long, iindex: Int, uflags: Int, phiconlarge: Long, phiconsmall: Long, niconsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDefExtractIconW(psziconfile: Long, iindex: Int, uflags: Int, phiconlarge: Long, phiconsmall: Long, niconsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyA(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyW(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDeleteKeyA(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDeleteKeyW(hkey: Long, pszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDeleteValueA(hkey: Long, pszsubkey: Long, pszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDeleteValueW(hkey: Long, pszsubkey: Long, pszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDestroyPropSheetExtArray(hpsxa: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHDoDragDrop(hwnd: Long, pdata: Long, pdsrc: Long, dweffect: Int, pdweffect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEmptyRecycleBinA(hwnd: Long, pszrootpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEmptyRecycleBinW(hwnd: Long, pszrootpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEnumKeyExA(hkey: Long, dwindex: Int, pszname: Long, pcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEnumKeyExW(hkey: Long, dwindex: Int, pszname: Long, pcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEnumValueA(hkey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEnumValueW(hkey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEnumerateUnreadMailAccountsW(hkeyuser: Long, dwindex: Int, pszmailaddress: Long, cchmailaddress: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHEvaluateSystemCommandTemplate(pszcmdtemplate: Long, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFileOperationA(lpfileop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFileOperationW(lpfileop: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFindFiles(pidlfolder: Long, pidlsavefile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFind_InitMenuPopup(hmenu: Long, hwndowner: Long, idcmdfirst: Int, idcmdlast: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFlushSFCache()

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFormatDrive(hwnd: Long, drive: Int, fmtid: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFreeNameMappings(hnamemappings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHFreeShared(hdata: Long, dwprocessid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetAttributesFromDataObject(pdo: Long, dwattributemask: Int, pdwattributes: Long, pcitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetDataFromIDListA(psf: Long, pidl: Long, nformat: Int, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetDataFromIDListW(psf: Long, pidl: Long, nformat: Int, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetDesktopFolder(ppshf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExA(pszdirectoryname: Long, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExW(pszdirectoryname: Long, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetDriveMedia(pszdrive: Long, pdwmediacontent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetFileInfoA(pszpath: Long, dwfileattributes: Int, psfi: Long, cbfileinfo: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetFileInfoW(pszpath: Long, dwfileattributes: Int, psfi: Long, cbfileinfo: Int, uflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetFolderLocation(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetFolderPathA(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirA(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszsubdir: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirW(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszsubdir: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetFolderPathW(hwnd: Long, csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetIDListFromObject(punk: Long, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexA(psziconpath: Long, iiconindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexW(psziconpath: Long, iiconindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetInstanceExplorer(ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetInverseCMAP(pbmap: Long, cbmap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetItemFromDataObject(pdtobj: Long, dwflags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetItemFromObject(punk: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetKnownFolderIDList(rfid: Long, dwflags: Int, htoken: Long, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetKnownFolderItem(rfid: Long, flags: Int, htoken: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetKnownFolderPath(rfid: Long, dwflags: Int, htoken: Long, ppszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetLocalizedName(pszpath: Long, pszresmodule: Long, cch: Int, pidsres: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetMalloc(ppmalloc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetNameFromIDList(pidl: Long, sigdnname: Int, ppszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetNewLinkInfoA(pszlinkto: Long, pszdir: Long, pszname: Long, pfmustcopy: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetNewLinkInfoW(pszlinkto: Long, pszdir: Long, pszname: Long, pfmustcopy: Long, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetPathFromIDListA(pidl: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetPathFromIDListEx(pidl: Long, pszpath: Long, cchpath: Int, uopts: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetPathFromIDListW(pidl: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetSetFolderCustomSettings(pfcs: Long, pszpath: Long, dwreadwrite: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetSetSettings(lpss: Long, dwmask: Int, bset: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetSettings(psfs: Long, dwmask: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetSpecialFolderLocation(hwnd: Long, csidl: Int, ppidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathA(hwnd: Long, pszpath: Long, csidl: Int, fcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathW(hwnd: Long, pszpath: Long, csidl: Int, fcreate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetStockIconInfo(siid: Int, uflags: Int, psii: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetThreadRef(ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetUnreadMailCountW(hkeyuser: Long, pszmailaddress: Long, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: Long, cchshellexecutecommand: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGetViewStatePropertyBag(pidl: Long, pszbagname: Long, dwflags: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGlobalCounterDecrement(id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGlobalCounterGetValue(id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHGlobalCounterIncrement(id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHHandleUpdateImage(pidlextra: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHILCreateFromPath(pszpath: Long, ppidl: Long, rgfinout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHInvokePrinterCommandA(hwnd: Long, uaction: Int, lpbuf1: Long, lpbuf2: Long, fmodal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHInvokePrinterCommandW(hwnd: Long, uaction: Int, lpbuf1: Long, lpbuf2: Long, fmodal: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHIsFileAvailableOffline(pwszpath: Long, pdwstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHIsLowMemoryMachine(dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHLimitInputEdit(hwndedit: Long, psf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHLoadInProc(rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHLoadIndirectString(pszsource: Long, pszoutbuf: Long, cchoutbuf: Int, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHLoadNonloadedIconOverlayIdentifiers(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHLockShared(hdata: Long, dwprocessid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHMessageBoxCheckA(hwnd: Long, psztext: Long, pszcaption: Long, utype: Int, idefault: Int, pszregval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHMessageBoxCheckW(hwnd: Long, psztext: Long, pszcaption: Long, utype: Int, idefault: Int, pszregval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHMultiFileProperties(pdtobj: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHObjectProperties(hwnd: Long, shopobjecttype: Int, pszobjectname: Long, pszpropertypage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHOpenFolderAndSelectItems(pidlfolder: Long, cidl: Int, apidl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHOpenPropSheetW(pszcaption: Long, ahkeys: Long, ckeys: Int, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHOpenRegStream2A(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHOpenRegStream2W(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHOpenRegStreamA(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHOpenRegStreamW(hkey: Long, pszsubkey: Long, pszvalue: Long, grfmode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHOpenWithDialog(hwndparent: Long, poainfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHParseDisplayName(pszname: Long, pbc: Long, ppidl: Long, sfgaoin: Int, psfgaoout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHPathPrepareForWriteA(hwnd: Long, punkenablemodless: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHPathPrepareForWriteW(hwnd: Long, punkenablemodless: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHQueryInfoKeyA(hkey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHQueryInfoKeyW(hkey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHQueryRecycleBinA(pszrootpath: Long, pshqueryrbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHQueryRecycleBinW(pszrootpath: Long, pshqueryrbinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHQueryUserNotificationState(pquns: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHQueryValueExA(hkey: Long, pszvalue: Long, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHQueryValueExW(hkey: Long, pszvalue: Long, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegCloseUSKey(huskey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegCreateUSKeyA(pszpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegCreateUSKeyW(pwzpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegDeleteUSValueA(huskey: Long, pszvalue: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegDeleteUSValueW(huskey: Long, pwzvalue: Long, delregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegDuplicateHKey(hkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegEnumUSKeyA(huskey: Long, dwindex: Int, pszname: Long, pcchname: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegEnumUSKeyW(huskey: Long, dwindex: Int, pwzname: Long, pcchname: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegEnumUSValueA(huskey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegEnumUSValueW(huskey: Long, dwindex: Int, pszvaluename: Long, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueA(pszsubkey: Long, pszvalue: Long, fignorehkcu: Int, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueW(pszsubkey: Long, pszvalue: Long, fignorehkcu: Int, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetIntW(hk: Long, pwzkey: Long, idefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetPathA(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetPathW(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetUSValueA(pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetUSValueW(pszsubkey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetValueFromHKCUHKLM(pwszkey: Long, pwszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegGetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegOpenUSKeyA(pszpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegOpenUSKeyW(pwzpath: Long, samdesired: Int, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegQueryUSValueA(huskey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegQueryUSValueW(huskey: Long, pszvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: Int, pvdefaultdata: Long, dwdefaultdatasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegSetPathA(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pcszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegSetPathW(hkey: Long, pcszsubkey: Long, pcszvalue: Long, pcszpath: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegSetUSValueA(pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegSetUSValueW(pwzsubkey: Long, pwzvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegWriteUSValueA(huskey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRegWriteUSValueW(huskey: Long, pwzvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHReleaseThreadRef(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRemoveLocalizedName(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHResolveLibrary(psilibrary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHRestricted(rest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSendMessageBroadcastA(umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSendMessageBroadcastW(umsg: Int, wparam: Long, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetDefaultProperties(hwnd: Long, psi: Long, dwfileopflags: Int, pfops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetFolderPathA(csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetFolderPathW(csidl: Int, htoken: Long, dwflags: Int, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetInstanceExplorer(punk: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetKnownFolderPath(rfid: Long, dwflags: Int, htoken: Long, pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetLocalizedName(pszpath: Long, pszresmodule: Long, idsres: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetThreadRef(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetUnreadMailCountW(pszmailaddress: Long, dwcount: Int, pszshellexecutecommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetValueA(hkey: Long, pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSetValueW(hkey: Long, pszsubkey: Long, pszvalue: Long, dwtype: Int, pvdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHShellFolderView_Message(hwndmain: Long, umsg: Int, lparam: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHShowManageLibraryUI(psilibrary: Long, hwndowner: Long, psztitle: Long, pszinstruction: Long, lmdoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSimpleIDListFromPath(pszpath: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHSkipJunction(pbc: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHStartNetConnectionDialogW(hwnd: Long, pszremotename: Long, dwtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHStrDupA(psz: Long, ppwsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHStrDupW(psz: Long, ppwsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHStripMneumonicA(pszmenu: Long): Byte

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHStripMneumonicW(pszmenu: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHTestTokenMembership(htoken: Long, ulrid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHUnicodeToAnsi(pwszsrc: Long, pszdst: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHUnicodeToUnicode(pwzsrc: Long, pwzdst: Long, cwchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHUnlockShared(pvdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHUpdateImageA(pszhashitem: Long, iindex: Int, uflags: Int, iimageindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHUpdateImageW(pszhashitem: Long, iindex: Int, uflags: Int, iimageindex: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SHValidateUNC(hwndowner: Long, pszfile: Long, fconnect: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SetCurrentProcessExplicitAppUserModelID(appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SetMenuContextHelpId(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SetWindowContextHelpId(param0: Long, param1: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SetWindowSubclass(hwnd: Long, pfnsubclass: Long, uidsubclass: Long, dwrefdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ShellAboutA(hwnd: Long, szapp: Long, szotherstuff: Long, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ShellAboutW(hwnd: Long, szapp: Long, szotherstuff: Long, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ShellExecuteA(hwnd: Long, lpoperation: Long, lpfile: Long, lpparameters: Long, lpdirectory: Long, nshowcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ShellExecuteExA(pexecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ShellExecuteExW(pexecinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_ShellExecuteW(hwnd: Long, lpoperation: Long, lpfile: Long, lpparameters: Long, lpdirectory: Long, nshowcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndex(pwsziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexA(psziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexW(psziconpath: Long, iiconindex: Int, uiconflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_GetImageLists(phiml: Long, phimlsmall: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_MergeMenus(hmdst: Long, hmsrc: Long, uinsert: Int, uidadjust: Int, uidadjustmax: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_NotifyIconA(dwmessage: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_NotifyIconGetRect(identifier: Long, iconlocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Shell_NotifyIconW(dwmessage: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SignalFileOpen(pidl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_SoftwareUpdateMessageBox(hwnd: Long, pszdistunit: Long, dwflags: Int, psdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StgMakeUniqueName(pstgparent: Long, pszfilespec: Long, grfmode: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCSpnA(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCSpnIA(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCSpnIW(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCSpnW(pszstr: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCatBuffA(pszdest: Long, pszsrc: Long, cchdestbuffsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCatBuffW(pszdest: Long, pszsrc: Long, cchdestbuffsize: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCatChainW(pszdst: Long, cchdst: Int, ichat: Int, pszsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCatW(psz1: Long, psz2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrChrA(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrChrIA(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrChrIW(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrChrNIW(pszstart: Long, wmatch: Short, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrChrNW(pszstart: Long, wmatch: Short, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrChrW(pszstart: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpCA(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpCW(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpICA(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpICW(pszstr1: Long, pszstr2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpIW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpLogicalW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNA(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNCA(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNCW(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNIA(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNICA(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNICW(pszstr1: Long, pszstr2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNIW(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpNW(psz1: Long, psz2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCmpW(psz1: Long, psz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCpyNW(pszdst: Long, pszsrc: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrCpyW(psz1: Long, psz2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrDupA(pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrDupW(pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFormatByteSize64A(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFormatByteSizeA(dw: Int, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFormatByteSizeEx(ull: Long, flags: Int, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFormatByteSizeW(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFormatKBSizeA(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFormatKBSizeW(qdw: Long, pszbuf: Long, cchbuf: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFromTimeIntervalA(pszout: Long, cchmax: Int, dwtimems: Int, digits: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrFromTimeIntervalW(pszout: Long, cchmax: Int, dwtimems: Int, digits: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrIsIntlEqualA(fcasesens: Int, pszstring1: Long, pszstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrIsIntlEqualW(fcasesens: Int, pszstring1: Long, pszstring2: Long, nchar: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrNCatA(psz1: Long, psz2: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrNCatW(psz1: Long, psz2: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrPBrkA(psz: Long, pszset: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrPBrkW(psz: Long, pszset: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRChrA(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRChrIA(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRChrIW(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRChrW(pszstart: Long, pszend: Long, wmatch: Short): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRStrIA(pszsource: Long, pszlast: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRStrIW(pszsource: Long, pszlast: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRetToBufA(pstr: Long, pidl: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRetToBufW(pstr: Long, pidl: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrSpnA(psz: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrSpnW(psz: Long, pszset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrStrA(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrStrIA(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrStrIW(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrStrNIW(pszfirst: Long, pszsrch: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrStrNW(pszfirst: Long, pszsrch: Long, cchmax: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrStrW(pszfirst: Long, pszsrch: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrToInt64ExA(pszstring: Long, dwflags: Int, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrToInt64ExW(pszstring: Long, dwflags: Int, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrToIntA(pszsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrToIntExA(pszstring: Long, dwflags: Int, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrToIntExW(pszstring: Long, dwflags: Int, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrToIntW(pszsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrTrimA(psz: Long, psztrimchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_StrTrimW(psz: Long, psztrimchars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UnloadUserProfile(htoken: Long, hprofile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UnregisterAppConstrainedChangeNotification(registration: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UnregisterAppStateChangeNotification(registration: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UnregisterScaleChangeEvent(dwcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlApplySchemeA(pszin: Long, pszout: Long, pcchout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlApplySchemeW(pszin: Long, pszout: Long, pcchout: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCanonicalizeA(pszurl: Long, pszcanonicalized: Long, pcchcanonicalized: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCanonicalizeW(pszurl: Long, pszcanonicalized: Long, pcchcanonicalized: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCombineA(pszbase: Long, pszrelative: Long, pszcombined: Long, pcchcombined: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCombineW(pszbase: Long, pszrelative: Long, pszcombined: Long, pcchcombined: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCompareA(psz1: Long, psz2: Long, fignoreslash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCompareW(psz1: Long, psz2: Long, fignoreslash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCreateFromPathA(pszpath: Long, pszurl: Long, pcchurl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlCreateFromPathW(pszpath: Long, pszurl: Long, pcchurl: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlEscapeA(pszurl: Long, pszescaped: Long, pcchescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlEscapeW(pszurl: Long, pszescaped: Long, pcchescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlFixupW(pcszurl: Long, psztranslatedurl: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlGetLocationA(pszurl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlGetLocationW(pszurl: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlGetPartA(pszin: Long, pszout: Long, pcchout: Long, dwpart: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlGetPartW(pszin: Long, pszout: Long, pcchout: Long, dwpart: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlHashA(pszurl: Long, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlHashW(pszurl: Long, pbhash: Long, cbhash: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlIsA(pszurl: Long, urlis: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlIsNoHistoryA(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlIsNoHistoryW(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlIsOpaqueA(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlIsOpaqueW(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlIsW(pszurl: Long, urlis: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlUnescapeA(pszurl: Long, pszunescaped: Long, pcchunescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_UrlUnescapeW(pszurl: Long, pszunescaped: Long, pcchunescaped: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_VariantToStrRet(varin: Long, pstrret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_WhichPlatform(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_Win32DeleteFile(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_WinHelpA(hwndmain: Long, lpszhelp: Long, ucommand: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_WinHelpW(hwndmain: Long, lpszhelp: Long, ucommand: Int, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_WriteCabinetState(pcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_wvnsprintfA(pszdest: Long, cchdest: Int, pszfmt: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_shell_wvnsprintfW(pszdest: Long, cchdest: Int, pszfmt: Long, arglist: Long): Int
}

public actual fun AssocCreate(clsid: GUID, riid: Long, ppv: Long): HRESULT =
    0

public actual fun AssocCreateForClasses(rgclasses: Long, cclasses: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocCreateForClasses(rgclasses, cclasses.toInt(), riid, ppv)

public actual fun AssocGetDetailsOfPropKey(psf: Long, pidl: Long, pkey: Long, pv: Long, pffoundpropkey: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocGetDetailsOfPropKey(psf, pidl, pkey, pv, pffoundpropkey)

public actual fun AssocGetPerceivedType(pszext: PCWSTR, ptype: Long, pflag: Long, ppsztype: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocGetPerceivedType(pszext, ptype, pflag, ppsztype)

public actual fun AssocIsDangerous(pszassoc: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocIsDangerous(pszassoc)

public actual fun AssocQueryKeyA(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCSTR, pszextra: PCSTR, phkeyout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocQueryKeyA(flags.toInt(), key, pszassoc, pszextra, phkeyout)

public actual fun AssocQueryKeyW(flags: ASSOCF, key: ASSOCKEY, pszassoc: PCWSTR, pszextra: PCWSTR, phkeyout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocQueryKeyW(flags.toInt(), key, pszassoc, pszextra, phkeyout)

public actual fun AssocQueryStringA(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCSTR, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocQueryStringA(flags.toInt(), str, pszassoc, pszextra, pszout, pcchout)

public actual fun AssocQueryStringByKeyA(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCSTR, pszout: PSTR, pcchout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocQueryStringByKeyA(flags.toInt(), str, hkassoc, pszextra, pszout, pcchout)

public actual fun AssocQueryStringByKeyW(flags: ASSOCF, str: ASSOCSTR, hkassoc: HKEY, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocQueryStringByKeyW(flags.toInt(), str, hkassoc, pszextra, pszout, pcchout)

public actual fun AssocQueryStringW(flags: ASSOCF, str: ASSOCSTR, pszassoc: PCWSTR, pszextra: PCWSTR, pszout: PWSTR, pcchout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_AssocQueryStringW(flags.toInt(), str, pszassoc, pszextra, pszout, pcchout)

public actual fun CDefFolderMenu_Create2(pidlfolder: Long, hwnd: HWND, cidl: UInt, apidl: Long, psf: Long, pfn: LPFNDFMCALLBACK, nkeys: UInt, ahkeys: Long, ppcm: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_CDefFolderMenu_Create2(pidlfolder, hwnd, cidl.toInt(), apidl, psf, pfn.toLong(), nkeys.toInt(), ahkeys, ppcm)

public actual fun CIDLData_CreateFromIDArray(pidlfolder: Long, cidl: UInt, apidl: Long, ppdtobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_CIDLData_CreateFromIDArray(pidlfolder, cidl.toInt(), apidl, ppdtobj)

public actual fun ChrCmpIA(w1: UShort, w2: UShort): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ChrCmpIA(w1.toShort(), w2.toShort())

public actual fun ChrCmpIW(w1: UShort, w2: UShort): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ChrCmpIW(w1.toShort(), w2.toShort())

public actual fun ColorAdjustLuma(clrrgb: COLORREF, n: Int, fscale: BOOL): COLORREF =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ColorAdjustLuma(clrrgb.toInt(), n, fscale).toUInt()

public actual fun ColorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): COLORREF =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ColorHLSToRGB(whue.toShort(), wluminance.toShort(), wsaturation.toShort()).toUInt()

public actual fun ColorRGBToHLS(clrrgb: COLORREF, pwhue: Long, pwluminance: Long, pwsaturation: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ColorRGBToHLS(clrrgb.toInt(), pwhue, pwluminance, pwsaturation)
}

public actual fun CommandLineToArgvW(lpcmdline: PCWSTR, pnumargs: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_CommandLineToArgvW(lpcmdline, pnumargs)

public actual fun ConnectToConnectionPoint(punk: Long, riidevent: Long, fconnect: BOOL, punktarget: Long, pdwcookie: Long, ppcpout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ConnectToConnectionPoint(punk, riidevent, fconnect, punktarget, pdwcookie, ppcpout)

public actual fun CreateProfile(pszusersid: PCWSTR, pszusername: PCWSTR, pszprofilepath: PWSTR, cchprofilepath: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_CreateProfile(pszusersid, pszusername, pszprofilepath, cchprofilepath.toInt())

public actual fun DAD_AutoScroll(hwnd: HWND, pad: Long, pptnow: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DAD_AutoScroll(hwnd, pad, pptnow)

public actual fun DAD_DragEnterEx(hwndtarget: HWND, ptstart: POINT): BOOL =
    0

public actual fun DAD_DragEnterEx2(hwndtarget: HWND, ptstart: POINT, pdtobject: Long): BOOL =
    0

public actual fun DAD_DragLeave(): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DAD_DragLeave()

public actual fun DAD_DragMove(pt: POINT): BOOL =
    0

public actual fun DAD_SetDragImage(him: HIMAGELIST, pptoffset: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DAD_SetDragImage(him, pptoffset)

public actual fun DAD_ShowDragImage(fshow: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DAD_ShowDragImage(fshow)

public actual fun DefSubclassProc(hwnd: HWND, umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DefSubclassProc(hwnd, umsg.toInt(), wparam.toLong(), lparam)

public actual fun DeleteProfileA(lpsidstring: PCSTR, lpprofilepath: PCSTR, lpcomputername: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DeleteProfileA(lpsidstring, lpprofilepath, lpcomputername)

public actual fun DeleteProfileW(lpsidstring: PCWSTR, lpprofilepath: PCWSTR, lpcomputername: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DeleteProfileW(lpsidstring, lpprofilepath, lpcomputername)

public actual fun DoEnvironmentSubstA(pszsrc: PSTR, cchsrc: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DoEnvironmentSubstA(pszsrc, cchsrc.toInt()).toUInt()

public actual fun DoEnvironmentSubstW(pszsrc: PWSTR, cchsrc: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DoEnvironmentSubstW(pszsrc, cchsrc.toInt()).toUInt()

public actual fun DragAcceptFiles(hwnd: HWND, faccept: BOOL) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DragAcceptFiles(hwnd, faccept)
}

public actual fun DragFinish(hdrop: HDROP) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DragFinish(hdrop)
}

public actual fun DragQueryFileA(hdrop: HDROP, ifile: UInt, lpszfile: PSTR, cch: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DragQueryFileA(hdrop, ifile.toInt(), lpszfile, cch.toInt()).toUInt()

public actual fun DragQueryFileW(hdrop: HDROP, ifile: UInt, lpszfile: PWSTR, cch: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DragQueryFileW(hdrop, ifile.toInt(), lpszfile, cch.toInt()).toUInt()

public actual fun DragQueryPoint(hdrop: HDROP, ppt: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DragQueryPoint(hdrop, ppt)

public actual fun DriveType(idrive: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DriveType(idrive)

public actual fun DuplicateIcon(hinst: HINSTANCE, hicon: HICON): HICON =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_DuplicateIcon(hinst, hicon)

public actual fun ExtractAssociatedIconA(hinst: HINSTANCE, psziconpath: PSTR, piicon: Long): HICON =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractAssociatedIconA(hinst, psziconpath, piicon)

public actual fun ExtractAssociatedIconExA(hinst: HINSTANCE, psziconpath: PSTR, piiconindex: Long, piiconid: Long): HICON =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractAssociatedIconExA(hinst, psziconpath, piiconindex, piiconid)

public actual fun ExtractAssociatedIconExW(hinst: HINSTANCE, psziconpath: PWSTR, piiconindex: Long, piiconid: Long): HICON =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractAssociatedIconExW(hinst, psziconpath, piiconindex, piiconid)

public actual fun ExtractAssociatedIconW(hinst: HINSTANCE, psziconpath: PWSTR, piicon: Long): HICON =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractAssociatedIconW(hinst, psziconpath, piicon)

public actual fun ExtractIconA(hinst: HINSTANCE, pszexefilename: PCSTR, niconindex: UInt): HICON =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractIconA(hinst, pszexefilename, niconindex.toInt())

public actual fun ExtractIconExA(lpszfile: PCSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractIconExA(lpszfile, niconindex, phiconlarge, phiconsmall, nicons.toInt()).toUInt()

public actual fun ExtractIconExW(lpszfile: PCWSTR, niconindex: Int, phiconlarge: Long, phiconsmall: Long, nicons: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractIconExW(lpszfile, niconindex, phiconlarge, phiconsmall, nicons.toInt()).toUInt()

public actual fun ExtractIconW(hinst: HINSTANCE, pszexefilename: PCWSTR, niconindex: UInt): HICON =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ExtractIconW(hinst, pszexefilename, niconindex.toInt())

public actual fun FindExecutableA(lpfile: PCSTR, lpdirectory: PCSTR, lpresult: PSTR): HINSTANCE =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_FindExecutableA(lpfile, lpdirectory, lpresult)

public actual fun FindExecutableW(lpfile: PCWSTR, lpdirectory: PCWSTR, lpresult: PWSTR): HINSTANCE =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_FindExecutableW(lpfile, lpdirectory, lpresult)

public actual fun GetAcceptLanguagesA(pszlanguages: PSTR, pcchlanguages: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetAcceptLanguagesA(pszlanguages, pcchlanguages)

public actual fun GetAcceptLanguagesW(pszlanguages: PWSTR, pcchlanguages: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetAcceptLanguagesW(pszlanguages, pcchlanguages)

public actual fun GetAllUsersProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryA(lpprofiledir, lpcchsize)

public actual fun GetAllUsersProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetAllUsersProfileDirectoryW(lpprofiledir, lpcchsize)

public actual fun GetCurrentProcessExplicitAppUserModelID(appid: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetCurrentProcessExplicitAppUserModelID(appid)

public actual fun GetDefaultUserProfileDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryA(lpprofiledir, lpcchsize)

public actual fun GetDefaultUserProfileDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetDefaultUserProfileDirectoryW(lpprofiledir, lpcchsize)

public actual fun GetDpiForShellUIComponent(param0: SHELL_UI_COMPONENT): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetDpiForShellUIComponent(param0).toUInt()

public actual fun GetFileNameFromBrowse(hwnd: HWND, pszfilepath: PWSTR, cchfilepath: UInt, pszworkingdir: PCWSTR, pszdefext: PCWSTR, pszfilters: PCWSTR, psztitle: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetFileNameFromBrowse(hwnd, pszfilepath, cchfilepath.toInt(), pszworkingdir, pszdefext, pszfilters, psztitle)

public actual fun GetMenuContextHelpId(param0: HMENU): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetMenuContextHelpId(param0).toUInt()

public actual fun GetMenuPosFromID(hmenu: HMENU, id: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetMenuPosFromID(hmenu, id.toInt())

public actual fun GetProfileType(dwflags: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetProfileType(dwflags)

public actual fun GetProfilesDirectoryA(lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetProfilesDirectoryA(lpprofiledir, lpcchsize)

public actual fun GetProfilesDirectoryW(lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetProfilesDirectoryW(lpprofiledir, lpcchsize)

public actual fun GetScaleFactorForDevice(devicetype: DISPLAY_DEVICE_TYPE): DEVICE_SCALE_FACTOR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetScaleFactorForDevice(devicetype)

public actual fun GetScaleFactorForMonitor(hmon: HMONITOR, pscale: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetScaleFactorForMonitor(hmon, pscale)

public actual fun GetUserProfileDirectoryA(htoken: HANDLE, lpprofiledir: PSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetUserProfileDirectoryA(htoken, lpprofiledir, lpcchsize)

public actual fun GetUserProfileDirectoryW(htoken: HANDLE, lpprofiledir: PWSTR, lpcchsize: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetUserProfileDirectoryW(htoken, lpprofiledir, lpcchsize)

public actual fun GetWindowContextHelpId(param0: HWND): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetWindowContextHelpId(param0).toUInt()

public actual fun GetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, pdwrefdata: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_GetWindowSubclass(hwnd, pfnsubclass.toLong(), uidsubclass.toLong(), pdwrefdata)

public actual fun HMONITOR_UserFree(param0: Long, param1: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserFree(param0, param1)
}

public actual fun HMONITOR_UserFree64(param0: Long, param1: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserFree64(param0, param1)
}

public actual fun HMONITOR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal(param0, param1, param2)

public actual fun HMONITOR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserMarshal64(param0, param1, param2)

public actual fun HMONITOR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun HMONITOR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun HMONITOR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal(param0, param1, param2)

public actual fun HMONITOR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HMONITOR_UserUnmarshal64(param0, param1, param2)

public actual fun HashData(pbdata: Long, cbdata: UInt, pbhash: Long, cbhash: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HashData(pbdata, cbdata.toInt(), pbhash, cbhash.toInt())

public actual fun HlinkClone(pihl: Long, riid: Long, pihlsiteforclone: Long, dwsitedata: UInt, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkClone(pihl, riid, pihlsiteforclone, dwsitedata.toInt(), ppvobj)

public actual fun HlinkCreateBrowseContext(piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateBrowseContext(piunkouter, riid, ppvobj)

public actual fun HlinkCreateExtensionServices(pwzadditionalheaders: PCWSTR, phwnd: HWND, pszusername: PCWSTR, pszpassword: PCWSTR, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateExtensionServices(pwzadditionalheaders, phwnd, pszusername, pszpassword, piunkouter, riid, ppvobj)

public actual fun HlinkCreateFromData(pidataobj: Long, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateFromData(pidataobj, pihlsite, dwsitedata.toInt(), piunkouter, riid, ppvobj)

public actual fun HlinkCreateFromMoniker(pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateFromMoniker(pimktrgt, pwzlocation, pwzfriendlyname, pihlsite, dwsitedata.toInt(), piunkouter, riid, ppvobj)

public actual fun HlinkCreateFromString(pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateFromString(pwztarget, pwzlocation, pwzfriendlyname, pihlsite, dwsitedata.toInt(), piunkouter, riid, ppvobj)

public actual fun HlinkCreateShortcut(grfhlshortcutf: UInt, pihl: Long, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateShortcut(grfhlshortcutf.toInt(), pihl, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved.toInt())

public actual fun HlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromMoniker(grfhlshortcutf.toInt(), pimktarget, pwzlocation, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved.toInt())

public actual fun HlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: PCWSTR, pwzlocation: PCWSTR, pwzdir: PCWSTR, pwzfilename: PCWSTR, ppwzshortcutfile: Long, dwreserved: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkCreateShortcutFromString(grfhlshortcutf.toInt(), pwztarget, pwzlocation, pwzdir, pwzfilename, ppwzshortcutfile, dwreserved.toInt())

public actual fun HlinkGetSpecialReference(ureference: UInt, ppwzreference: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkGetSpecialReference(ureference.toInt(), ppwzreference)

public actual fun HlinkGetValueFromParams(pwzparams: PCWSTR, pwzname: PCWSTR, ppwzvalue: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkGetValueFromParams(pwzparams, pwzname, ppwzvalue)

public actual fun HlinkIsShortcut(pwzfilename: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkIsShortcut(pwzfilename)

public actual fun HlinkNavigate(pihl: Long, pihlframe: Long, grfhlnf: UInt, pbc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkNavigate(pihl, pihlframe, grfhlnf.toInt(), pbc, pibsc, pihlbc)

public actual fun HlinkNavigateToStringReference(pwztarget: PCWSTR, pwzlocation: PCWSTR, pihlsite: Long, dwsitedata: UInt, pihlframe: Long, grfhlnf: UInt, pibc: Long, pibsc: Long, pihlbc: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkNavigateToStringReference(pwztarget, pwzlocation, pihlsite, dwsitedata.toInt(), pihlframe, grfhlnf.toInt(), pibc, pibsc, pihlbc)

public actual fun HlinkOnNavigate(pihlframe: Long, pihlbc: Long, grfhlnf: UInt, pimktarget: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR, puhlid: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkOnNavigate(pihlframe, pihlbc, grfhlnf.toInt(), pimktarget, pwzlocation, pwzfriendlyname, puhlid)

public actual fun HlinkOnRenameDocument(dwreserved: UInt, pihlbc: Long, pimkold: Long, pimknew: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkOnRenameDocument(dwreserved.toInt(), pihlbc, pimkold, pimknew)

public actual fun HlinkParseDisplayName(pibc: Long, pwzdisplayname: PCWSTR, fnoforceabs: BOOL, pccheaten: Long, ppimk: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkParseDisplayName(pibc, pwzdisplayname, fnoforceabs, pccheaten, ppimk)

public actual fun HlinkPreprocessMoniker(pibc: Long, pimkin: Long, ppimkout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkPreprocessMoniker(pibc, pimkin, ppimkout)

public actual fun HlinkQueryCreateFromData(pidataobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkQueryCreateFromData(pidataobj)

public actual fun HlinkResolveMonikerForData(pimkreference: Long, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkResolveMonikerForData(pimkreference, reserved.toInt(), pibc, cfmtetc.toInt(), rgfmtetc, pibsc, pimkbase)

public actual fun HlinkResolveShortcut(pwzshortcutfilename: PCWSTR, pihlsite: Long, dwsitedata: UInt, piunkouter: Long, riid: Long, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkResolveShortcut(pwzshortcutfilename, pihlsite, dwsitedata.toInt(), piunkouter, riid, ppvobj)

public actual fun HlinkResolveShortcutToMoniker(pwzshortcutfilename: PCWSTR, ppimktarget: Long, ppwzlocation: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkResolveShortcutToMoniker(pwzshortcutfilename, ppimktarget, ppwzlocation)

public actual fun HlinkResolveShortcutToString(pwzshortcutfilename: PCWSTR, ppwztarget: Long, ppwzlocation: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkResolveShortcutToString(pwzshortcutfilename, ppwztarget, ppwzlocation)

public actual fun HlinkResolveStringForData(pwzreference: PCWSTR, reserved: UInt, pibc: Long, cfmtetc: UInt, rgfmtetc: Long, pibsc: Long, pimkbase: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkResolveStringForData(pwzreference, reserved.toInt(), pibc, cfmtetc.toInt(), rgfmtetc, pibsc, pimkbase)

public actual fun HlinkSetSpecialReference(ureference: UInt, pwzreference: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkSetSpecialReference(ureference.toInt(), pwzreference)

public actual fun HlinkTranslateURL(pwzurl: PCWSTR, grfflags: UInt, ppwztranslatedurl: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkTranslateURL(pwzurl, grfflags.toInt(), ppwztranslatedurl)

public actual fun HlinkUpdateStackItem(pihlframe: Long, pihlbc: Long, uhlid: UInt, pimktrgt: Long, pwzlocation: PCWSTR, pwzfriendlyname: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_HlinkUpdateStackItem(pihlframe, pihlbc, uhlid.toInt(), pimktrgt, pwzlocation, pwzfriendlyname)

public actual fun ILAppendID(pidl: Long, pmkid: Long, fappend: BOOL): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILAppendID(pidl, pmkid, fappend)

public actual fun ILClone(pidl: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILClone(pidl)

public actual fun ILCloneFirst(pidl: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILCloneFirst(pidl)

public actual fun ILCombine(pidl1: Long, pidl2: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILCombine(pidl1, pidl2)

public actual fun ILCreateFromPathA(pszpath: PCSTR): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILCreateFromPathA(pszpath)

public actual fun ILCreateFromPathW(pszpath: PCWSTR): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILCreateFromPathW(pszpath)

public actual fun ILFindChild(pidlparent: Long, pidlchild: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILFindChild(pidlparent, pidlchild)

public actual fun ILFindLastID(pidl: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILFindLastID(pidl)

public actual fun ILFree(pidl: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILFree(pidl)
}

public actual fun ILGetNext(pidl: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILGetNext(pidl)

public actual fun ILGetSize(pidl: Long): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILGetSize(pidl).toUInt()

public actual fun ILIsEqual(pidl1: Long, pidl2: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILIsEqual(pidl1, pidl2)

public actual fun ILIsParent(pidl1: Long, pidl2: Long, fimmediate: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILIsParent(pidl1, pidl2, fimmediate)

public actual fun ILLoadFromStreamEx(pstm: Long, pidl: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILLoadFromStreamEx(pstm, pidl)

public actual fun ILRemoveLastID(pidl: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILRemoveLastID(pidl)

public actual fun ILSaveToStream(pstm: Long, pidl: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ILSaveToStream(pstm, pidl)

public actual fun IStream_Copy(pstmfrom: Long, pstmto: Long, cb: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_Copy(pstmfrom, pstmto, cb.toInt())

public actual fun IStream_Read(pstm: Long, pv: Long, cb: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_Read(pstm, pv, cb.toInt())

public actual fun IStream_ReadPidl(pstm: Long, ppidlout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_ReadPidl(pstm, ppidlout)

public actual fun IStream_ReadStr(pstm: Long, ppsz: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_ReadStr(pstm, ppsz)

public actual fun IStream_Reset(pstm: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_Reset(pstm)

public actual fun IStream_Size(pstm: Long, pui: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_Size(pstm, pui)

public actual fun IStream_Write(pstm: Long, pv: Long, cb: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_Write(pstm, pv, cb.toInt())

public actual fun IStream_WritePidl(pstm: Long, pidlwrite: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_WritePidl(pstm, pidlwrite)

public actual fun IStream_WriteStr(pstm: Long, psz: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IStream_WriteStr(pstm, psz)

public actual fun IUnknown_AtomicRelease(ppunk: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IUnknown_AtomicRelease(ppunk)
}

public actual fun IUnknown_GetSite(punk: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IUnknown_GetSite(punk, riid, ppv)

public actual fun IUnknown_GetWindow(punk: Long, phwnd: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IUnknown_GetWindow(punk, phwnd)

public actual fun IUnknown_QueryService(punk: Long, guidservice: Long, riid: Long, ppvout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IUnknown_QueryService(punk, guidservice, riid, ppvout)

public actual fun IUnknown_Set(ppunk: Long, punk: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IUnknown_Set(ppunk, punk)
}

public actual fun IUnknown_SetSite(punk: Long, punksite: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IUnknown_SetSite(punk, punksite)

public actual fun ImportPrivacySettings(pszfilename: PCWSTR, pfparseprivacypreferences: Long, pfparsepersiterules: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ImportPrivacySettings(pszfilename, pfparseprivacypreferences, pfparsepersiterules)

public actual fun InitNetworkAddressControl(): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_InitNetworkAddressControl()

public actual fun InitPropVariantFromStrRet(pstrret: Long, pidl: Long, ppropvar: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_InitPropVariantFromStrRet(pstrret, pidl, ppropvar)

public actual fun InitVariantFromStrRet(pstrret: Long, pidl: Long, pvar: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_InitVariantFromStrRet(pstrret, pidl, pvar)

public actual fun IntlStrEqWorkerA(fcasesens: BOOL, lpstring1: PCSTR, lpstring2: PCSTR, nchar: Int): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IntlStrEqWorkerA(fcasesens, lpstring1, lpstring2, nchar)

public actual fun IntlStrEqWorkerW(fcasesens: BOOL, lpstring1: PCWSTR, lpstring2: PCWSTR, nchar: Int): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IntlStrEqWorkerW(fcasesens, lpstring1, lpstring2, nchar)

public actual fun IsCharSpaceA(wch: Byte): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsCharSpaceA(wch)

public actual fun IsCharSpaceW(wch: UShort): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsCharSpaceW(wch.toShort())

public actual fun IsInternetESCEnabled(): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsInternetESCEnabled()

public actual fun IsLFNDriveA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsLFNDriveA(pszpath)

public actual fun IsLFNDriveW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsLFNDriveW(pszpath)

public actual fun IsNetDrive(idrive: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsNetDrive(idrive)

public actual fun IsOS(dwos: OS): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsOS(dwos.toInt())

public actual fun IsUserAnAdmin(): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_IsUserAnAdmin()

public actual fun LoadUserProfileA(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_LoadUserProfileA(htoken, lpprofileinfo)

public actual fun LoadUserProfileW(htoken: HANDLE, lpprofileinfo: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_LoadUserProfileW(htoken, lpprofileinfo)

public actual fun OleSaveToStreamEx(piunk: Long, pistm: Long, fcleardirty: BOOL): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_OleSaveToStreamEx(piunk, pistm, fcleardirty)

public actual fun OpenRegStream(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_OpenRegStream(hkey, pszsubkey, pszvalue, grfmode.toInt())

public actual fun ParseURLA(pcszurl: PCSTR, ppu: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ParseURLA(pcszurl, ppu)

public actual fun ParseURLW(pcszurl: PCWSTR, ppu: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ParseURLW(pcszurl, ppu)

public actual fun PathAddBackslashA(pszpath: PSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAddBackslashA(pszpath)

public actual fun PathAddBackslashW(pszpath: PWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAddBackslashW(pszpath)

public actual fun PathAddExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAddExtensionA(pszpath, pszext)

public actual fun PathAddExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAddExtensionW(pszpath, pszext)

public actual fun PathAllocCanonicalize(pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAllocCanonicalize(pszpathin, dwflags.toInt(), ppszpathout)

public actual fun PathAllocCombine(pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS, ppszpathout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAllocCombine(pszpathin, pszmore, dwflags.toInt(), ppszpathout)

public actual fun PathAppendA(pszpath: PSTR, pszmore: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAppendA(pszpath, pszmore)

public actual fun PathAppendW(pszpath: PWSTR, pszmore: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathAppendW(pszpath, pszmore)

public actual fun PathBuildRootA(pszroot: PSTR, idrive: Int): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathBuildRootA(pszroot, idrive)

public actual fun PathBuildRootW(pszroot: PWSTR, idrive: Int): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathBuildRootW(pszroot, idrive)

public actual fun PathCanonicalizeA(pszbuf: PSTR, pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCanonicalizeA(pszbuf, pszpath)

public actual fun PathCanonicalizeW(pszbuf: PWSTR, pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCanonicalizeW(pszbuf, pszpath)

public actual fun PathCchAddBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchAddBackslash(pszpath, cchpath.toLong())

public actual fun PathCchAddBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchAddBackslashEx(pszpath, cchpath.toLong(), ppszend, pcchremaining)

public actual fun PathCchAddExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchAddExtension(pszpath, cchpath.toLong(), pszext)

public actual fun PathCchAppend(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchAppend(pszpath, cchpath.toLong(), pszmore)

public actual fun PathCchAppendEx(pszpath: PWSTR, cchpath: ULong, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchAppendEx(pszpath, cchpath.toLong(), pszmore, dwflags.toInt())

public actual fun PathCchCanonicalize(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchCanonicalize(pszpathout, cchpathout.toLong(), pszpathin)

public actual fun PathCchCanonicalizeEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchCanonicalizeEx(pszpathout, cchpathout.toLong(), pszpathin, dwflags.toInt())

public actual fun PathCchCombine(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchCombine(pszpathout, cchpathout.toLong(), pszpathin, pszmore)

public actual fun PathCchCombineEx(pszpathout: PWSTR, cchpathout: ULong, pszpathin: PCWSTR, pszmore: PCWSTR, dwflags: PATHCCH_OPTIONS): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchCombineEx(pszpathout, cchpathout.toLong(), pszpathin, pszmore, dwflags.toInt())

public actual fun PathCchFindExtension(pszpath: PCWSTR, cchpath: ULong, ppszext: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchFindExtension(pszpath, cchpath.toLong(), ppszext)

public actual fun PathCchIsRoot(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchIsRoot(pszpath)

public actual fun PathCchRemoveBackslash(pszpath: PWSTR, cchpath: ULong): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchRemoveBackslash(pszpath, cchpath.toLong())

public actual fun PathCchRemoveBackslashEx(pszpath: PWSTR, cchpath: ULong, ppszend: Long, pcchremaining: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchRemoveBackslashEx(pszpath, cchpath.toLong(), ppszend, pcchremaining)

public actual fun PathCchRemoveExtension(pszpath: PWSTR, cchpath: ULong): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchRemoveExtension(pszpath, cchpath.toLong())

public actual fun PathCchRemoveFileSpec(pszpath: PWSTR, cchpath: ULong): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchRemoveFileSpec(pszpath, cchpath.toLong())

public actual fun PathCchRenameExtension(pszpath: PWSTR, cchpath: ULong, pszext: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchRenameExtension(pszpath, cchpath.toLong(), pszext)

public actual fun PathCchSkipRoot(pszpath: PCWSTR, ppszrootend: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchSkipRoot(pszpath, ppszrootend)

public actual fun PathCchStripPrefix(pszpath: PWSTR, cchpath: ULong): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchStripPrefix(pszpath, cchpath.toLong())

public actual fun PathCchStripToRoot(pszpath: PWSTR, cchpath: ULong): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCchStripToRoot(pszpath, cchpath.toLong())

public actual fun PathCleanupSpec(pszdir: PCWSTR, pszspec: PWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCleanupSpec(pszdir, pszspec)

public actual fun PathCombineA(pszdest: PSTR, pszdir: PCSTR, pszfile: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCombineA(pszdest, pszdir, pszfile)

public actual fun PathCombineW(pszdest: PWSTR, pszdir: PCWSTR, pszfile: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCombineW(pszdest, pszdir, pszfile)

public actual fun PathCommonPrefixA(pszfile1: PCSTR, pszfile2: PCSTR, achpath: PSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCommonPrefixA(pszfile1, pszfile2, achpath)

public actual fun PathCommonPrefixW(pszfile1: PCWSTR, pszfile2: PCWSTR, achpath: PWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCommonPrefixW(pszfile1, pszfile2, achpath)

public actual fun PathCompactPathA(hdc: HDC, pszpath: PSTR, dx: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCompactPathA(hdc, pszpath, dx.toInt())

public actual fun PathCompactPathExA(pszout: PSTR, pszsrc: PCSTR, cchmax: UInt, dwflags: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCompactPathExA(pszout, pszsrc, cchmax.toInt(), dwflags.toInt())

public actual fun PathCompactPathExW(pszout: PWSTR, pszsrc: PCWSTR, cchmax: UInt, dwflags: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCompactPathExW(pszout, pszsrc, cchmax.toInt(), dwflags.toInt())

public actual fun PathCompactPathW(hdc: HDC, pszpath: PWSTR, dx: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCompactPathW(hdc, pszpath, dx.toInt())

public actual fun PathCreateFromUrlA(pszurl: PCSTR, pszpath: PSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCreateFromUrlA(pszurl, pszpath, pcchpath, dwflags.toInt())

public actual fun PathCreateFromUrlAlloc(pszin: PCWSTR, ppszout: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCreateFromUrlAlloc(pszin, ppszout, dwflags.toInt())

public actual fun PathCreateFromUrlW(pszurl: PCWSTR, pszpath: PWSTR, pcchpath: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathCreateFromUrlW(pszurl, pszpath, pcchpath, dwflags.toInt())

public actual fun PathFileExistsA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFileExistsA(pszpath)

public actual fun PathFileExistsW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFileExistsW(pszpath)

public actual fun PathFindExtensionA(pszpath: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindExtensionA(pszpath)

public actual fun PathFindExtensionW(pszpath: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindExtensionW(pszpath)

public actual fun PathFindFileNameA(pszpath: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindFileNameA(pszpath)

public actual fun PathFindFileNameW(pszpath: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindFileNameW(pszpath)

public actual fun PathFindNextComponentA(pszpath: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindNextComponentA(pszpath)

public actual fun PathFindNextComponentW(pszpath: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindNextComponentW(pszpath)

public actual fun PathFindOnPathA(pszpath: PSTR, ppszotherdirs: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindOnPathA(pszpath, ppszotherdirs)

public actual fun PathFindOnPathW(pszpath: PWSTR, ppszotherdirs: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindOnPathW(pszpath, ppszotherdirs)

public actual fun PathFindSuffixArrayA(pszpath: PCSTR, apszsuffix: Long, iarraysize: Int): PCSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindSuffixArrayA(pszpath, apszsuffix, iarraysize)

public actual fun PathFindSuffixArrayW(pszpath: PCWSTR, apszsuffix: Long, iarraysize: Int): PCWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathFindSuffixArrayW(pszpath, apszsuffix, iarraysize)

public actual fun PathGetArgsA(pszpath: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathGetArgsA(pszpath)

public actual fun PathGetArgsW(pszpath: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathGetArgsW(pszpath)

public actual fun PathGetCharTypeA(ch: UByte): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathGetCharTypeA(ch.toByte()).toUInt()

public actual fun PathGetCharTypeW(ch: UShort): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathGetCharTypeW(ch.toShort()).toUInt()

public actual fun PathGetDriveNumberA(pszpath: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathGetDriveNumberA(pszpath)

public actual fun PathGetDriveNumberW(pszpath: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathGetDriveNumberW(pszpath)

public actual fun PathGetShortPath(pszlongpath: PWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathGetShortPath(pszlongpath)
}

public actual fun PathIsContentTypeA(pszpath: PCSTR, pszcontenttype: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsContentTypeA(pszpath, pszcontenttype)

public actual fun PathIsContentTypeW(pszpath: PCWSTR, pszcontenttype: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsContentTypeW(pszpath, pszcontenttype)

public actual fun PathIsDirectoryA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsDirectoryA(pszpath)

public actual fun PathIsDirectoryEmptyA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyA(pszpath)

public actual fun PathIsDirectoryEmptyW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsDirectoryEmptyW(pszpath)

public actual fun PathIsDirectoryW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsDirectoryW(pszpath)

public actual fun PathIsExe(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsExe(pszpath)

public actual fun PathIsFileSpecA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsFileSpecA(pszpath)

public actual fun PathIsFileSpecW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsFileSpecW(pszpath)

public actual fun PathIsLFNFileSpecA(pszname: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsLFNFileSpecA(pszname)

public actual fun PathIsLFNFileSpecW(pszname: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsLFNFileSpecW(pszname)

public actual fun PathIsNetworkPathA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsNetworkPathA(pszpath)

public actual fun PathIsNetworkPathW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsNetworkPathW(pszpath)

public actual fun PathIsPrefixA(pszprefix: PCSTR, pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsPrefixA(pszprefix, pszpath)

public actual fun PathIsPrefixW(pszprefix: PCWSTR, pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsPrefixW(pszprefix, pszpath)

public actual fun PathIsRelativeA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsRelativeA(pszpath)

public actual fun PathIsRelativeW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsRelativeW(pszpath)

public actual fun PathIsRootA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsRootA(pszpath)

public actual fun PathIsRootW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsRootW(pszpath)

public actual fun PathIsSameRootA(pszpath1: PCSTR, pszpath2: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsSameRootA(pszpath1, pszpath2)

public actual fun PathIsSameRootW(pszpath1: PCWSTR, pszpath2: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsSameRootW(pszpath1, pszpath2)

public actual fun PathIsSlowA(pszfile: PCSTR, dwattr: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsSlowA(pszfile, dwattr.toInt())

public actual fun PathIsSlowW(pszfile: PCWSTR, dwattr: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsSlowW(pszfile, dwattr.toInt())

public actual fun PathIsSystemFolderA(pszpath: PCSTR, dwattrb: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsSystemFolderA(pszpath, dwattrb.toInt())

public actual fun PathIsSystemFolderW(pszpath: PCWSTR, dwattrb: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsSystemFolderW(pszpath, dwattrb.toInt())

public actual fun PathIsUNCA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsUNCA(pszpath)

public actual fun PathIsUNCEx(pszpath: PCWSTR, ppszserver: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsUNCEx(pszpath, ppszserver)

public actual fun PathIsUNCServerA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsUNCServerA(pszpath)

public actual fun PathIsUNCServerShareA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsUNCServerShareA(pszpath)

public actual fun PathIsUNCServerShareW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsUNCServerShareW(pszpath)

public actual fun PathIsUNCServerW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsUNCServerW(pszpath)

public actual fun PathIsUNCW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsUNCW(pszpath)

public actual fun PathIsURLA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsURLA(pszpath)

public actual fun PathIsURLW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathIsURLW(pszpath)

public actual fun PathMakePrettyA(pszpath: PSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMakePrettyA(pszpath)

public actual fun PathMakePrettyW(pszpath: PWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMakePrettyW(pszpath)

public actual fun PathMakeSystemFolderA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMakeSystemFolderA(pszpath)

public actual fun PathMakeSystemFolderW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMakeSystemFolderW(pszpath)

public actual fun PathMakeUniqueName(pszuniquename: PWSTR, cchmax: UInt, psztemplate: PCWSTR, pszlongplate: PCWSTR, pszdir: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMakeUniqueName(pszuniquename, cchmax.toInt(), psztemplate, pszlongplate, pszdir)

public actual fun PathMatchSpecA(pszfile: PCSTR, pszspec: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMatchSpecA(pszfile, pszspec)

public actual fun PathMatchSpecExA(pszfile: PCSTR, pszspec: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMatchSpecExA(pszfile, pszspec, dwflags.toInt())

public actual fun PathMatchSpecExW(pszfile: PCWSTR, pszspec: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMatchSpecExW(pszfile, pszspec, dwflags.toInt())

public actual fun PathMatchSpecW(pszfile: PCWSTR, pszspec: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathMatchSpecW(pszfile, pszspec)

public actual fun PathParseIconLocationA(psziconfile: PSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathParseIconLocationA(psziconfile)

public actual fun PathParseIconLocationW(psziconfile: PWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathParseIconLocationW(psziconfile)

public actual fun PathQualify(psz: PWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathQualify(psz)
}

public actual fun PathQuoteSpacesA(lpsz: PSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathQuoteSpacesA(lpsz)

public actual fun PathQuoteSpacesW(lpsz: PWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathQuoteSpacesW(lpsz)

public actual fun PathRelativePathToA(pszpath: PSTR, pszfrom: PCSTR, dwattrfrom: UInt, pszto: PCSTR, dwattrto: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRelativePathToA(pszpath, pszfrom, dwattrfrom.toInt(), pszto, dwattrto.toInt())

public actual fun PathRelativePathToW(pszpath: PWSTR, pszfrom: PCWSTR, dwattrfrom: UInt, pszto: PCWSTR, dwattrto: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRelativePathToW(pszpath, pszfrom, dwattrfrom.toInt(), pszto, dwattrto.toInt())

public actual fun PathRemoveArgsA(pszpath: PSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveArgsA(pszpath)
}

public actual fun PathRemoveArgsW(pszpath: PWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveArgsW(pszpath)
}

public actual fun PathRemoveBackslashA(pszpath: PSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveBackslashA(pszpath)

public actual fun PathRemoveBackslashW(pszpath: PWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveBackslashW(pszpath)

public actual fun PathRemoveBlanksA(pszpath: PSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveBlanksA(pszpath)
}

public actual fun PathRemoveBlanksW(pszpath: PWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveBlanksW(pszpath)
}

public actual fun PathRemoveExtensionA(pszpath: PSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveExtensionA(pszpath)
}

public actual fun PathRemoveExtensionW(pszpath: PWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveExtensionW(pszpath)
}

public actual fun PathRemoveFileSpecA(pszpath: PSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveFileSpecA(pszpath)

public actual fun PathRemoveFileSpecW(pszpath: PWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRemoveFileSpecW(pszpath)

public actual fun PathRenameExtensionA(pszpath: PSTR, pszext: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRenameExtensionA(pszpath, pszext)

public actual fun PathRenameExtensionW(pszpath: PWSTR, pszext: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathRenameExtensionW(pszpath, pszext)

public actual fun PathResolve(pszpath: PWSTR, dirs: Long, fflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathResolve(pszpath, dirs, fflags.toInt())

public actual fun PathSearchAndQualifyA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathSearchAndQualifyA(pszpath, pszbuf, cchbuf.toInt())

public actual fun PathSearchAndQualifyW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathSearchAndQualifyW(pszpath, pszbuf, cchbuf.toInt())

public actual fun PathSetDlgItemPathA(hdlg: HWND, id: Int, pszpath: PCSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathSetDlgItemPathA(hdlg, id, pszpath)
}

public actual fun PathSetDlgItemPathW(hdlg: HWND, id: Int, pszpath: PCWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathSetDlgItemPathW(hdlg, id, pszpath)
}

public actual fun PathSkipRootA(pszpath: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathSkipRootA(pszpath)

public actual fun PathSkipRootW(pszpath: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathSkipRootW(pszpath)

public actual fun PathStripPathA(pszpath: PSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathStripPathA(pszpath)
}

public actual fun PathStripPathW(pszpath: PWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathStripPathW(pszpath)
}

public actual fun PathStripToRootA(pszpath: PSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathStripToRootA(pszpath)

public actual fun PathStripToRootW(pszpath: PWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathStripToRootW(pszpath)

public actual fun PathUnExpandEnvStringsA(pszpath: PCSTR, pszbuf: PSTR, cchbuf: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsA(pszpath, pszbuf, cchbuf.toInt())

public actual fun PathUnExpandEnvStringsW(pszpath: PCWSTR, pszbuf: PWSTR, cchbuf: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUnExpandEnvStringsW(pszpath, pszbuf, cchbuf.toInt())

public actual fun PathUndecorateA(pszpath: PSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUndecorateA(pszpath)
}

public actual fun PathUndecorateW(pszpath: PWSTR) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUndecorateW(pszpath)
}

public actual fun PathUnmakeSystemFolderA(pszpath: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderA(pszpath)

public actual fun PathUnmakeSystemFolderW(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUnmakeSystemFolderW(pszpath)

public actual fun PathUnquoteSpacesA(lpsz: PSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUnquoteSpacesA(lpsz)

public actual fun PathUnquoteSpacesW(lpsz: PWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathUnquoteSpacesW(lpsz)

public actual fun PathYetAnotherMakeUniqueName(pszuniquename: PWSTR, pszpath: PCWSTR, pszshort: PCWSTR, pszfilespec: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PathYetAnotherMakeUniqueName(pszuniquename, pszpath, pszshort, pszfilespec)

public actual fun PickIconDlg(hwnd: HWND, psziconpath: PWSTR, cchiconpath: UInt, piiconindex: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PickIconDlg(hwnd, psziconpath, cchiconpath.toInt(), piiconindex)

public actual fun PropVariantToStrRet(propvar: Long, pstrret: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_PropVariantToStrRet(propvar, pstrret)

public actual fun QISearch(that: Long, pqit: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_QISearch(that, pqit, riid, ppv)

public actual fun ReadCabinetState(pcs: Long, clength: Int): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ReadCabinetState(pcs, clength)

public actual fun RealDriveType(idrive: Int, foktohitnet: BOOL): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RealDriveType(idrive, foktohitnet)

public actual fun RegisterAppConstrainedChangeNotification(routine: PAPPCONSTRAIN_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RegisterAppConstrainedChangeNotification(routine.toLong(), context, registration).toUInt()

public actual fun RegisterAppStateChangeNotification(routine: PAPPSTATE_CHANGE_ROUTINE, context: Long, registration: Long): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RegisterAppStateChangeNotification(routine.toLong(), context, registration).toUInt()

public actual fun RegisterScaleChangeEvent(hevent: HANDLE, pdwcookie: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RegisterScaleChangeEvent(hevent, pdwcookie)

public actual fun RegisterScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, hwndnotify: HWND, umsgnotify: UInt, pdwcookie: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RegisterScaleChangeNotifications(displaydevice, hwndnotify, umsgnotify.toInt(), pdwcookie)

public actual fun RemoveWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RemoveWindowSubclass(hwnd, pfnsubclass.toLong(), uidsubclass.toLong())

public actual fun RestartDialog(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RestartDialog(hwnd, pszprompt, dwreturn.toInt())

public actual fun RestartDialogEx(hwnd: HWND, pszprompt: PCWSTR, dwreturn: UInt, dwreasoncode: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RestartDialogEx(hwnd, pszprompt, dwreturn.toInt(), dwreasoncode.toInt())

public actual fun RevokeScaleChangeNotifications(displaydevice: DISPLAY_DEVICE_TYPE, dwcookie: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_RevokeScaleChangeNotifications(displaydevice, dwcookie.toInt())

public actual fun SHAddFromPropSheetExtArray(hpsxa: HPSXA, lpfnaddpage: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHAddToRecentDocs(uflags: UInt, pv: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAddToRecentDocs(uflags.toInt(), pv)
}

public actual fun SHAlloc(cb: ULong): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAlloc(cb.toLong())

public actual fun SHAllocShared(pvdata: Long, dwsize: UInt, dwprocessid: UInt): HANDLE =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAllocShared(pvdata, dwsize.toInt(), dwprocessid.toInt())

public actual fun SHAnsiToAnsi(pszsrc: PCSTR, pszdst: PSTR, cchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAnsiToAnsi(pszsrc, pszdst, cchbuf)

public actual fun SHAnsiToUnicode(pszsrc: PCSTR, pwszdst: PWSTR, cwchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAnsiToUnicode(pszsrc, pwszdst, cwchbuf)

public actual fun SHAppBarMessage(dwmessage: UInt, pdata: Long): ULong =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAppBarMessage(dwmessage.toInt(), pdata).toULong()

public actual fun SHAssocEnumHandlers(pszextra: PCWSTR, affilter: ASSOC_FILTER, ppenumhandler: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAssocEnumHandlers(pszextra, affilter, ppenumhandler)

public actual fun SHAssocEnumHandlersForProtocolByApplication(protocol: PCWSTR, riid: Long, enumhandlers: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAssocEnumHandlersForProtocolByApplication(protocol, riid, enumhandlers)

public actual fun SHAutoComplete(hwndedit: HWND, dwflags: SHELL_AUTOCOMPLETE_FLAGS): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHAutoComplete(hwndedit, dwflags.toInt())

public actual fun SHBindToFolderIDListParent(psfroot: Long, pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHBindToFolderIDListParent(psfroot, pidl, riid, ppv, ppidllast)

public actual fun SHBindToFolderIDListParentEx(psfroot: Long, pidl: Long, ppbc: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHBindToFolderIDListParentEx(psfroot, pidl, ppbc, riid, ppv, ppidllast)

public actual fun SHBindToObject(psf: Long, pidl: Long, pbc: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHBindToObject(psf, pidl, pbc, riid, ppv)

public actual fun SHBindToParent(pidl: Long, riid: Long, ppv: Long, ppidllast: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHBindToParent(pidl, riid, ppv, ppidllast)

public actual fun SHBrowseForFolderA(lpbi: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHBrowseForFolderA(lpbi)

public actual fun SHBrowseForFolderW(lpbi: Long): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHBrowseForFolderW(lpbi)

public actual fun SHCLSIDFromString(psz: PCWSTR, pclsid: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCLSIDFromString(psz, pclsid)

public actual fun SHChangeNotification_Lock(hchange: HANDLE, dwprocid: UInt, pppidl: Long, plevent: Long): HANDLE =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHChangeNotification_Lock(hchange, dwprocid.toInt(), pppidl, plevent)

public actual fun SHChangeNotification_Unlock(hlock: HANDLE): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHChangeNotification_Unlock(hlock)

public actual fun SHChangeNotify(weventid: Int, uflags: SHCNF_FLAGS, dwitem1: Long, dwitem2: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHChangeNotify(weventid, uflags.toInt(), dwitem1, dwitem2)
}

public actual fun SHChangeNotifyDeregister(ulid: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHChangeNotifyDeregister(ulid.toInt())

public actual fun SHChangeNotifyRegister(hwnd: HWND, fsources: SHCNRF_SOURCE, fevents: Int, wmsg: UInt, centries: Int, pshcne: Long): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHChangeNotifyRegister(hwnd, fsources, fevents, wmsg.toInt(), centries, pshcne).toUInt()

public actual fun SHChangeNotifyRegisterThread(status: SCNRT_STATUS) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHChangeNotifyRegisterThread(status)
}

public actual fun SHCloneSpecialIDList(hwnd: HWND, csidl: Int, fcreate: BOOL): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCloneSpecialIDList(hwnd, csidl, fcreate)

public actual fun SHCoCreateInstance(pszclsid: PCWSTR, pclsid: Long, punkouter: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCoCreateInstance(pszclsid, pclsid, punkouter, riid, ppv)

public actual fun SHCopyKeyA(hkeysrc: HKEY, pszsrcsubkey: PCSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCopyKeyA(hkeysrc, pszsrcsubkey, hkeydest, freserved.toInt()).toUInt()

public actual fun SHCopyKeyW(hkeysrc: HKEY, pszsrcsubkey: PCWSTR, hkeydest: HKEY, freserved: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCopyKeyW(hkeysrc, pszsrcsubkey, hkeydest, freserved.toInt()).toUInt()

public actual fun SHCreateAssociationRegistration(riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateAssociationRegistration(riid, ppv)

public actual fun SHCreateDataObject(pidlfolder: Long, cidl: UInt, apidl: Long, pdtinner: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateDataObject(pidlfolder, cidl.toInt(), apidl, pdtinner, riid, ppv)

public actual fun SHCreateDefaultContextMenu(pdcm: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateDefaultContextMenu(pdcm, riid, ppv)

public actual fun SHCreateDefaultExtractIcon(riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateDefaultExtractIcon(riid, ppv)

public actual fun SHCreateDefaultPropertiesOp(psi: Long, ppfileop: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateDefaultPropertiesOp(psi, ppfileop)

public actual fun SHCreateDirectory(hwnd: HWND, pszpath: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateDirectory(hwnd, pszpath)

public actual fun SHCreateDirectoryExA(hwnd: HWND, pszpath: PCSTR, psa: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateDirectoryExA(hwnd, pszpath, psa)

public actual fun SHCreateDirectoryExW(hwnd: HWND, pszpath: PCWSTR, psa: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateDirectoryExW(hwnd, pszpath, psa)

public actual fun SHCreateFileExtractIconW(pszfile: PCWSTR, dwfileattributes: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateFileExtractIconW(pszfile, dwfileattributes.toInt(), riid, ppv)

public actual fun SHCreateItemFromIDList(pidl: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateItemFromIDList(pidl, riid, ppv)

public actual fun SHCreateItemFromParsingName(pszpath: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateItemFromParsingName(pszpath, pbc, riid, ppv)

public actual fun SHCreateItemFromRelativeName(psiparent: Long, pszname: PCWSTR, pbc: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateItemFromRelativeName(psiparent, pszname, pbc, riid, ppv)

public actual fun SHCreateItemInKnownFolder(kfid: Long, dwkfflags: UInt, pszitem: PCWSTR, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateItemInKnownFolder(kfid, dwkfflags.toInt(), pszitem, riid, ppv)

public actual fun SHCreateItemWithParent(pidlparent: Long, psfparent: Long, pidl: Long, riid: Long, ppvitem: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateItemWithParent(pidlparent, psfparent, pidl, riid, ppvitem)

public actual fun SHCreateMemStream(pinit: Long, cbinit: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateMemStream(pinit, cbinit.toInt())

public actual fun SHCreateProcessAsUserW(pscpi: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateProcessAsUserW(pscpi)

public actual fun SHCreatePropSheetExtArray(hkey: HKEY, pszsubkey: PCWSTR, max_iface: UInt): HPSXA =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreatePropSheetExtArray(hkey, pszsubkey, max_iface.toInt())

public actual fun SHCreateQueryCancelAutoPlayMoniker(ppmoniker: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateQueryCancelAutoPlayMoniker(ppmoniker)

public actual fun SHCreateShellFolderView(pcsfv: Long, ppsv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellFolderView(pcsfv, ppsv)

public actual fun SHCreateShellFolderViewEx(pcsfv: Long, ppsv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellFolderViewEx(pcsfv, ppsv)

public actual fun SHCreateShellItem(pidlparent: Long, psfparent: Long, pidl: Long, ppsi: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellItem(pidlparent, psfparent, pidl, ppsi)

public actual fun SHCreateShellItemArray(pidlparent: Long, psf: Long, cidl: UInt, ppidl: Long, ppsiitemarray: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellItemArray(pidlparent, psf, cidl.toInt(), ppidl, ppsiitemarray)

public actual fun SHCreateShellItemArrayFromDataObject(pdo: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromDataObject(pdo, riid, ppv)

public actual fun SHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: Long, ppsiitemarray: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromIDLists(cidl.toInt(), rgpidl, ppsiitemarray)

public actual fun SHCreateShellItemArrayFromShellItem(psi: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellItemArrayFromShellItem(psi, riid, ppv)

public actual fun SHCreateShellPalette(hdc: HDC): HPALETTE =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateShellPalette(hdc)

public actual fun SHCreateStdEnumFmtEtc(cfmt: UInt, afmt: Long, ppenumformatetc: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateStdEnumFmtEtc(cfmt.toInt(), afmt, ppenumformatetc)

public actual fun SHCreateStreamOnFileA(pszfile: PCSTR, grfmode: UInt, ppstm: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileA(pszfile, grfmode.toInt(), ppstm)

public actual fun SHCreateStreamOnFileEx(pszfile: PCWSTR, grfmode: UInt, dwattributes: UInt, fcreate: BOOL, pstmtemplate: Long, ppstm: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileEx(pszfile, grfmode.toInt(), dwattributes.toInt(), fcreate, pstmtemplate, ppstm)

public actual fun SHCreateStreamOnFileW(pszfile: PCWSTR, grfmode: UInt, ppstm: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateStreamOnFileW(pszfile, grfmode.toInt(), ppstm)

public actual fun SHCreateThread(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE): BOOL =
    0

public actual fun SHCreateThreadRef(pcref: Long, ppunk: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHCreateThreadRef(pcref, ppunk)

public actual fun SHCreateThreadWithHandle(pfnthreadproc: LPTHREAD_START_ROUTINE, pdata: Long, flags: UInt, pfncallback: LPTHREAD_START_ROUTINE, phandle: Long): BOOL =
    0

public actual fun SHDefExtractIconA(psziconfile: PCSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDefExtractIconA(psziconfile, iindex, uflags.toInt(), phiconlarge, phiconsmall, niconsize.toInt())

public actual fun SHDefExtractIconW(psziconfile: PCWSTR, iindex: Int, uflags: UInt, phiconlarge: Long, phiconsmall: Long, niconsize: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDefExtractIconW(psziconfile, iindex, uflags.toInt(), phiconlarge, phiconsmall, niconsize.toInt())

public actual fun SHDeleteEmptyKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyA(hkey, pszsubkey).toUInt()

public actual fun SHDeleteEmptyKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDeleteEmptyKeyW(hkey, pszsubkey).toUInt()

public actual fun SHDeleteKeyA(hkey: HKEY, pszsubkey: PCSTR): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDeleteKeyA(hkey, pszsubkey).toUInt()

public actual fun SHDeleteKeyW(hkey: HKEY, pszsubkey: PCWSTR): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDeleteKeyW(hkey, pszsubkey).toUInt()

public actual fun SHDeleteValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDeleteValueA(hkey, pszsubkey, pszvalue).toUInt()

public actual fun SHDeleteValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDeleteValueW(hkey, pszsubkey, pszvalue).toUInt()

public actual fun SHDestroyPropSheetExtArray(hpsxa: HPSXA) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDestroyPropSheetExtArray(hpsxa)
}

public actual fun SHDoDragDrop(hwnd: HWND, pdata: Long, pdsrc: Long, dweffect: DROPEFFECT, pdweffect: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHDoDragDrop(hwnd, pdata, pdsrc, dweffect.toInt(), pdweffect)

public actual fun SHEmptyRecycleBinA(hwnd: HWND, pszrootpath: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEmptyRecycleBinA(hwnd, pszrootpath, dwflags.toInt())

public actual fun SHEmptyRecycleBinW(hwnd: HWND, pszrootpath: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEmptyRecycleBinW(hwnd, pszrootpath, dwflags.toInt())

public actual fun SHEnumKeyExA(hkey: HKEY, dwindex: UInt, pszname: PSTR, pcchname: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEnumKeyExA(hkey, dwindex.toInt(), pszname, pcchname).toUInt()

public actual fun SHEnumKeyExW(hkey: HKEY, dwindex: UInt, pszname: PWSTR, pcchname: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEnumKeyExW(hkey, dwindex.toInt(), pszname, pcchname).toUInt()

public actual fun SHEnumValueA(hkey: HKEY, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEnumValueA(hkey, dwindex.toInt(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHEnumValueW(hkey: HKEY, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEnumValueW(hkey, dwindex.toInt(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHEnumerateUnreadMailAccountsW(hkeyuser: HKEY, dwindex: UInt, pszmailaddress: PWSTR, cchmailaddress: Int): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEnumerateUnreadMailAccountsW(hkeyuser, dwindex.toInt(), pszmailaddress, cchmailaddress)

public actual fun SHEvaluateSystemCommandTemplate(pszcmdtemplate: PCWSTR, ppszapplication: Long, ppszcommandline: Long, ppszparameters: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHEvaluateSystemCommandTemplate(pszcmdtemplate, ppszapplication, ppszcommandline, ppszparameters)

public actual fun SHFileOperationA(lpfileop: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFileOperationA(lpfileop)

public actual fun SHFileOperationW(lpfileop: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFileOperationW(lpfileop)

public actual fun SHFindFiles(pidlfolder: Long, pidlsavefile: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFindFiles(pidlfolder, pidlsavefile)

public actual fun SHFind_InitMenuPopup(hmenu: HMENU, hwndowner: HWND, idcmdfirst: UInt, idcmdlast: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFind_InitMenuPopup(hmenu, hwndowner, idcmdfirst.toInt(), idcmdlast.toInt())

public actual fun SHFlushSFCache() {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFlushSFCache()
}

public actual fun SHFormatDateTimeA(pft: Long, pdwflags: Long, pszbuf: PSTR, cchbuf: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFormatDateTimeA(pft, pdwflags, pszbuf, cchbuf.toInt())

public actual fun SHFormatDateTimeW(pft: Long, pdwflags: Long, pszbuf: PWSTR, cchbuf: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFormatDateTimeW(pft, pdwflags, pszbuf, cchbuf.toInt())

public actual fun SHFormatDrive(hwnd: HWND, drive: UInt, fmtid: SHFMT_ID, options: UInt): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFormatDrive(hwnd, drive.toInt(), fmtid.toInt(), options.toInt()).toUInt()

public actual fun SHFree(pv: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFree(pv)
}

public actual fun SHFreeNameMappings(hnamemappings: HANDLE) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFreeNameMappings(hnamemappings)
}

public actual fun SHFreeShared(hdata: HANDLE, dwprocessid: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHFreeShared(hdata, dwprocessid.toInt())

public actual fun SHGetAttributesFromDataObject(pdo: Long, dwattributemask: UInt, pdwattributes: Long, pcitems: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetAttributesFromDataObject(pdo, dwattributemask.toInt(), pdwattributes, pcitems)

public actual fun SHGetDataFromIDListA(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetDataFromIDListA(psf, pidl, nformat, pv, cb)

public actual fun SHGetDataFromIDListW(psf: Long, pidl: Long, nformat: SHGDFIL_FORMAT, pv: Long, cb: Int): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetDataFromIDListW(psf, pidl, nformat, pv, cb)

public actual fun SHGetDesktopFolder(ppshf: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetDesktopFolder(ppshf)

public actual fun SHGetDiskFreeSpaceExA(pszdirectoryname: PCSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExA(pszdirectoryname, pulfreebytesavailabletocaller, pultotalnumberofbytes, pultotalnumberoffreebytes)

public actual fun SHGetDiskFreeSpaceExW(pszdirectoryname: PCWSTR, pulfreebytesavailabletocaller: Long, pultotalnumberofbytes: Long, pultotalnumberoffreebytes: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetDiskFreeSpaceExW(pszdirectoryname, pulfreebytesavailabletocaller, pultotalnumberofbytes, pultotalnumberoffreebytes)

public actual fun SHGetDriveMedia(pszdrive: PCWSTR, pdwmediacontent: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetDriveMedia(pszdrive, pdwmediacontent)

public actual fun SHGetFileInfoA(pszpath: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetFileInfoA(pszpath, dwfileattributes.toInt(), psfi, cbfileinfo.toInt(), uflags.toInt()).toULong()

public actual fun SHGetFileInfoW(pszpath: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES, psfi: Long, cbfileinfo: UInt, uflags: SHGFI_FLAGS): ULong =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetFileInfoW(pszpath, dwfileattributes.toInt(), psfi, cbfileinfo.toInt(), uflags.toInt()).toULong()

public actual fun SHGetFolderLocation(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, ppidl: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetFolderLocation(hwnd, csidl, htoken, dwflags.toInt(), ppidl)

public actual fun SHGetFolderPathA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetFolderPathA(hwnd, csidl, htoken, dwflags.toInt(), pszpath)

public actual fun SHGetFolderPathAndSubDirA(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCSTR, pszpath: PSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirA(hwnd, csidl, htoken, dwflags.toInt(), pszsubdir, pszpath)

public actual fun SHGetFolderPathAndSubDirW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszsubdir: PCWSTR, pszpath: PWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetFolderPathAndSubDirW(hwnd, csidl, htoken, dwflags.toInt(), pszsubdir, pszpath)

public actual fun SHGetFolderPathW(hwnd: HWND, csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetFolderPathW(hwnd, csidl, htoken, dwflags.toInt(), pszpath)

public actual fun SHGetIDListFromObject(punk: Long, ppidl: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetIDListFromObject(punk, ppidl)

public actual fun SHGetIconOverlayIndexA(psziconpath: PCSTR, iiconindex: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexA(psziconpath, iiconindex)

public actual fun SHGetIconOverlayIndexW(psziconpath: PCWSTR, iiconindex: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetIconOverlayIndexW(psziconpath, iiconindex)

public actual fun SHGetImageList(iimagelist: Int, riid: Long, ppvobj: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetImageList(iimagelist, riid, ppvobj)

public actual fun SHGetInstanceExplorer(ppunk: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetInstanceExplorer(ppunk)

public actual fun SHGetInverseCMAP(pbmap: Long, cbmap: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetInverseCMAP(pbmap, cbmap.toInt())

public actual fun SHGetItemFromDataObject(pdtobj: Long, dwflags: DATAOBJ_GET_ITEM_FLAGS, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetItemFromDataObject(pdtobj, dwflags, riid, ppv)

public actual fun SHGetItemFromObject(punk: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetItemFromObject(punk, riid, ppv)

public actual fun SHGetKnownFolderIDList(rfid: Long, dwflags: UInt, htoken: HANDLE, ppidl: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetKnownFolderIDList(rfid, dwflags.toInt(), htoken, ppidl)

public actual fun SHGetKnownFolderItem(rfid: Long, flags: KNOWN_FOLDER_FLAG, htoken: HANDLE, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetKnownFolderItem(rfid, flags, htoken, riid, ppv)

public actual fun SHGetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, ppszpath: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetKnownFolderPath(rfid, dwflags.toInt(), htoken, ppszpath)

public actual fun SHGetLocalizedName(pszpath: PCWSTR, pszresmodule: PWSTR, cch: UInt, pidsres: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetLocalizedName(pszpath, pszresmodule, cch.toInt(), pidsres)

public actual fun SHGetMalloc(ppmalloc: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetMalloc(ppmalloc)

public actual fun SHGetNameFromIDList(pidl: Long, sigdnname: SIGDN, ppszname: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetNameFromIDList(pidl, sigdnname, ppszname)

public actual fun SHGetNewLinkInfoA(pszlinkto: PCSTR, pszdir: PCSTR, pszname: PSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetNewLinkInfoA(pszlinkto, pszdir, pszname, pfmustcopy, uflags.toInt())

public actual fun SHGetNewLinkInfoW(pszlinkto: PCWSTR, pszdir: PCWSTR, pszname: PWSTR, pfmustcopy: Long, uflags: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetNewLinkInfoW(pszlinkto, pszdir, pszname, pfmustcopy, uflags.toInt())

public actual fun SHGetPathFromIDListA(pidl: Long, pszpath: PSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetPathFromIDListA(pidl, pszpath)

public actual fun SHGetPathFromIDListEx(pidl: Long, pszpath: PWSTR, cchpath: UInt, uopts: GPFIDL_FLAGS): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetPathFromIDListEx(pidl, pszpath, cchpath.toInt(), uopts.toInt())

public actual fun SHGetPathFromIDListW(pidl: Long, pszpath: PWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetPathFromIDListW(pidl, pszpath)

public actual fun SHGetRealIDL(psf: Long, pidlsimple: Long, ppidlreal: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetRealIDL(psf, pidlsimple, ppidlreal)

public actual fun SHGetSetFolderCustomSettings(pfcs: Long, pszpath: PCWSTR, dwreadwrite: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetSetFolderCustomSettings(pfcs, pszpath, dwreadwrite.toInt())

public actual fun SHGetSetSettings(lpss: Long, dwmask: SSF_MASK, bset: BOOL) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetSetSettings(lpss, dwmask.toInt(), bset)
}

public actual fun SHGetSettings(psfs: Long, dwmask: UInt) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetSettings(psfs, dwmask.toInt())
}

public actual fun SHGetSpecialFolderLocation(hwnd: HWND, csidl: Int, ppidl: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetSpecialFolderLocation(hwnd, csidl, ppidl)

public actual fun SHGetSpecialFolderPathA(hwnd: HWND, pszpath: PSTR, csidl: Int, fcreate: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathA(hwnd, pszpath, csidl, fcreate)

public actual fun SHGetSpecialFolderPathW(hwnd: HWND, pszpath: PWSTR, csidl: Int, fcreate: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetSpecialFolderPathW(hwnd, pszpath, csidl, fcreate)

public actual fun SHGetStockIconInfo(siid: SHSTOCKICONID, uflags: SHGSI_FLAGS, psii: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetStockIconInfo(siid, uflags.toInt(), psii)

public actual fun SHGetTemporaryPropertyForItem(psi: Long, propkey: Long, ppropvar: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetTemporaryPropertyForItem(psi, propkey, ppropvar)

public actual fun SHGetThreadRef(ppunk: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetThreadRef(ppunk)

public actual fun SHGetUnreadMailCountW(hkeyuser: HKEY, pszmailaddress: PCWSTR, pdwcount: Long, pfiletime: Long, pszshellexecutecommand: PWSTR, cchshellexecutecommand: Int): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetUnreadMailCountW(hkeyuser, pszmailaddress, pdwcount, pfiletime, pszshellexecutecommand, cchshellexecutecommand)

public actual fun SHGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetValueA(hkey, pszsubkey, pszvalue, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetValueW(hkey, pszsubkey, pszvalue, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHGetViewStatePropertyBag(pidl: Long, pszbagname: PCWSTR, dwflags: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGetViewStatePropertyBag(pidl, pszbagname, dwflags.toInt(), riid, ppv)

public actual fun SHGlobalCounterDecrement(id: SHGLOBALCOUNTER): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGlobalCounterDecrement(id)

public actual fun SHGlobalCounterGetValue(id: SHGLOBALCOUNTER): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGlobalCounterGetValue(id)

public actual fun SHGlobalCounterIncrement(id: SHGLOBALCOUNTER): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHGlobalCounterIncrement(id)

public actual fun SHHandleUpdateImage(pidlextra: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHHandleUpdateImage(pidlextra)

public actual fun SHILCreateFromPath(pszpath: PCWSTR, ppidl: Long, rgfinout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHILCreateFromPath(pszpath, ppidl, rgfinout)

public actual fun SHInvokePrinterCommandA(hwnd: HWND, uaction: UInt, lpbuf1: PCSTR, lpbuf2: PCSTR, fmodal: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHInvokePrinterCommandA(hwnd, uaction.toInt(), lpbuf1, lpbuf2, fmodal)

public actual fun SHInvokePrinterCommandW(hwnd: HWND, uaction: UInt, lpbuf1: PCWSTR, lpbuf2: PCWSTR, fmodal: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHInvokePrinterCommandW(hwnd, uaction.toInt(), lpbuf1, lpbuf2, fmodal)

public actual fun SHIsFileAvailableOffline(pwszpath: PCWSTR, pdwstatus: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHIsFileAvailableOffline(pwszpath, pdwstatus)

public actual fun SHIsLowMemoryMachine(dwtype: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHIsLowMemoryMachine(dwtype.toInt())

public actual fun SHLimitInputEdit(hwndedit: HWND, psf: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHLimitInputEdit(hwndedit, psf)

public actual fun SHLoadInProc(rclsid: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHLoadInProc(rclsid)

public actual fun SHLoadIndirectString(pszsource: PCWSTR, pszoutbuf: PWSTR, cchoutbuf: UInt, ppvreserved: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHLoadIndirectString(pszsource, pszoutbuf, cchoutbuf.toInt(), ppvreserved)

public actual fun SHLoadNonloadedIconOverlayIdentifiers(): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHLoadNonloadedIconOverlayIdentifiers()

public actual fun SHLockShared(hdata: HANDLE, dwprocessid: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHLockShared(hdata, dwprocessid.toInt())

public actual fun SHMapPIDLToSystemImageListIndex(pshf: Long, pidl: Long, piindexsel: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHMapPIDLToSystemImageListIndex(pshf, pidl, piindexsel)

public actual fun SHMessageBoxCheckA(hwnd: HWND, psztext: PCSTR, pszcaption: PCSTR, utype: UInt, idefault: Int, pszregval: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHMessageBoxCheckA(hwnd, psztext, pszcaption, utype.toInt(), idefault, pszregval)

public actual fun SHMessageBoxCheckW(hwnd: HWND, psztext: PCWSTR, pszcaption: PCWSTR, utype: UInt, idefault: Int, pszregval: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHMessageBoxCheckW(hwnd, psztext, pszcaption, utype.toInt(), idefault, pszregval)

public actual fun SHMultiFileProperties(pdtobj: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHMultiFileProperties(pdtobj, dwflags.toInt())

public actual fun SHObjectProperties(hwnd: HWND, shopobjecttype: UInt, pszobjectname: PCWSTR, pszpropertypage: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHObjectProperties(hwnd, shopobjecttype.toInt(), pszobjectname, pszpropertypage)

public actual fun SHOpenFolderAndSelectItems(pidlfolder: Long, cidl: UInt, apidl: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHOpenFolderAndSelectItems(pidlfolder, cidl.toInt(), apidl, dwflags.toInt())

public actual fun SHOpenPropSheetW(pszcaption: PCWSTR, ahkeys: Long, ckeys: UInt, pclsiddefault: Long, pdtobj: Long, psb: Long, pstartpage: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHOpenPropSheetW(pszcaption, ahkeys, ckeys.toInt(), pclsiddefault, pdtobj, psb, pstartpage)

public actual fun SHOpenRegStream2A(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHOpenRegStream2A(hkey, pszsubkey, pszvalue, grfmode.toInt())

public actual fun SHOpenRegStream2W(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHOpenRegStream2W(hkey, pszsubkey, pszvalue, grfmode.toInt())

public actual fun SHOpenRegStreamA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, grfmode: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHOpenRegStreamA(hkey, pszsubkey, pszvalue, grfmode.toInt())

public actual fun SHOpenRegStreamW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, grfmode: UInt): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHOpenRegStreamW(hkey, pszsubkey, pszvalue, grfmode.toInt())

public actual fun SHOpenWithDialog(hwndparent: HWND, poainfo: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHOpenWithDialog(hwndparent, poainfo)

public actual fun SHParseDisplayName(pszname: PCWSTR, pbc: Long, ppidl: Long, sfgaoin: UInt, psfgaoout: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHParseDisplayName(pszname, pbc, ppidl, sfgaoin.toInt(), psfgaoout)

public actual fun SHPathPrepareForWriteA(hwnd: HWND, punkenablemodless: Long, pszpath: PCSTR, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHPathPrepareForWriteA(hwnd, punkenablemodless, pszpath, dwflags.toInt())

public actual fun SHPathPrepareForWriteW(hwnd: HWND, punkenablemodless: Long, pszpath: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHPathPrepareForWriteW(hwnd, punkenablemodless, pszpath, dwflags.toInt())

public actual fun SHQueryInfoKeyA(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHQueryInfoKeyA(hkey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen).toUInt()

public actual fun SHQueryInfoKeyW(hkey: HKEY, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHQueryInfoKeyW(hkey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen).toUInt()

public actual fun SHQueryRecycleBinA(pszrootpath: PCSTR, pshqueryrbinfo: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHQueryRecycleBinA(pszrootpath, pshqueryrbinfo)

public actual fun SHQueryRecycleBinW(pszrootpath: PCWSTR, pshqueryrbinfo: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHQueryRecycleBinW(pszrootpath, pshqueryrbinfo)

public actual fun SHQueryUserNotificationState(pquns: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHQueryUserNotificationState(pquns)

public actual fun SHQueryValueExA(hkey: HKEY, pszvalue: PCSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHQueryValueExA(hkey, pszvalue, pdwreserved, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHQueryValueExW(hkey: HKEY, pszvalue: PCWSTR, pdwreserved: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHQueryValueExW(hkey, pszvalue, pdwreserved, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHRegCloseUSKey(huskey: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegCloseUSKey(huskey).toUInt()

public actual fun SHRegCreateUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegCreateUSKeyA(pszpath, samdesired.toInt(), hrelativeuskey, phnewuskey, dwflags.toInt()).toUInt()

public actual fun SHRegCreateUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegCreateUSKeyW(pwzpath, samdesired.toInt(), hrelativeuskey, phnewuskey, dwflags.toInt()).toUInt()

public actual fun SHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyA(huskey, pszsubkey, delregflags).toUInt()

public actual fun SHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegDeleteEmptyUSKeyW(huskey, pwzsubkey, delregflags).toUInt()

public actual fun SHRegDeleteUSValueA(huskey: Long, pszvalue: PCSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegDeleteUSValueA(huskey, pszvalue, delregflags).toUInt()

public actual fun SHRegDeleteUSValueW(huskey: Long, pwzvalue: PCWSTR, delregflags: SHREGDEL_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegDeleteUSValueW(huskey, pwzvalue, delregflags).toUInt()

public actual fun SHRegDuplicateHKey(hkey: HKEY): HKEY =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegDuplicateHKey(hkey)

public actual fun SHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: PSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegEnumUSKeyA(huskey, dwindex.toInt(), pszname, pcchname, enumregflags).toUInt()

public actual fun SHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: PWSTR, pcchname: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegEnumUSKeyW(huskey, dwindex.toInt(), pwzname, pcchname, enumregflags).toUInt()

public actual fun SHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: PSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegEnumUSValueA(huskey, dwindex.toInt(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata, enumregflags).toUInt()

public actual fun SHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: PWSTR, pcchvaluename: Long, pdwtype: Long, pvdata: Long, pcbdata: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegEnumUSValueW(huskey, dwindex.toInt(), pszvaluename, pcchvaluename, pdwtype, pvdata, pcbdata, enumregflags).toUInt()

public actual fun SHRegGetBoolUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueA(pszsubkey, pszvalue, fignorehkcu, fdefault)

public actual fun SHRegGetBoolUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, fignorehkcu: BOOL, fdefault: BOOL): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetBoolUSValueW(pszsubkey, pszvalue, fignorehkcu, fdefault)

public actual fun SHRegGetIntW(hk: HKEY, pwzkey: PCWSTR, idefault: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetIntW(hk, pwzkey, idefault)

public actual fun SHRegGetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pszpath: PSTR, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetPathA(hkey, pcszsubkey, pcszvalue, pszpath, dwflags.toInt()).toUInt()

public actual fun SHRegGetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pszpath: PWSTR, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetPathW(hkey, pcszsubkey, pcszvalue, pszpath, dwflags.toInt()).toUInt()

public actual fun SHRegGetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetUSValueA(pszsubkey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize.toInt()).toUInt()

public actual fun SHRegGetUSValueW(pszsubkey: PCWSTR, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetUSValueW(pszsubkey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize.toInt()).toUInt()

public actual fun SHRegGetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetValueA(hkey, pszsubkey, pszvalue, srrfflags, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHRegGetValueFromHKCUHKLM(pwszkey: PCWSTR, pwszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetValueFromHKCUHKLM(pwszkey, pwszvalue, srrfflags, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHRegGetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, srrfflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegGetValueW(hkey, pszsubkey, pszvalue, srrfflags, pdwtype, pvdata, pcbdata).toUInt()

public actual fun SHRegOpenUSKeyA(pszpath: PCSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegOpenUSKeyA(pszpath, samdesired.toInt(), hrelativeuskey, phnewuskey, fignorehkcu).toUInt()

public actual fun SHRegOpenUSKeyW(pwzpath: PCWSTR, samdesired: UInt, hrelativeuskey: Long, phnewuskey: Long, fignorehkcu: BOOL): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegOpenUSKeyW(pwzpath, samdesired.toInt(), hrelativeuskey, phnewuskey, fignorehkcu).toUInt()

public actual fun SHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyA(huskey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen, enumregflags).toUInt()

public actual fun SHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: Long, pcchmaxsubkeylen: Long, pcvalues: Long, pcchmaxvaluenamelen: Long, enumregflags: SHREGENUM_FLAGS): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegQueryInfoUSKeyW(huskey, pcsubkeys, pcchmaxsubkeylen, pcvalues, pcchmaxvaluenamelen, enumregflags).toUInt()

public actual fun SHRegQueryUSValueA(huskey: Long, pszvalue: PCSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegQueryUSValueA(huskey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize.toInt()).toUInt()

public actual fun SHRegQueryUSValueW(huskey: Long, pszvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long, fignorehkcu: BOOL, pvdefaultdata: Long, dwdefaultdatasize: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegQueryUSValueW(huskey, pszvalue, pdwtype, pvdata, pcbdata, fignorehkcu, pvdefaultdata, dwdefaultdatasize.toInt()).toUInt()

public actual fun SHRegSetPathA(hkey: HKEY, pcszsubkey: PCSTR, pcszvalue: PCSTR, pcszpath: PCSTR, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegSetPathA(hkey, pcszsubkey, pcszvalue, pcszpath, dwflags.toInt()).toUInt()

public actual fun SHRegSetPathW(hkey: HKEY, pcszsubkey: PCWSTR, pcszvalue: PCWSTR, pcszpath: PCWSTR, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegSetPathW(hkey, pcszsubkey, pcszvalue, pcszpath, dwflags.toInt()).toUInt()

public actual fun SHRegSetUSValueA(pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegSetUSValueA(pszsubkey, pszvalue, dwtype.toInt(), pvdata, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun SHRegSetUSValueW(pwzsubkey: PCWSTR, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegSetUSValueW(pwzsubkey, pwzvalue, dwtype.toInt(), pvdata, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun SHRegWriteUSValueA(huskey: Long, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegWriteUSValueA(huskey, pszvalue, dwtype.toInt(), pvdata, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun SHRegWriteUSValueW(huskey: Long, pwzvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt, dwflags: UInt): WIN32_ERROR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRegWriteUSValueW(huskey, pwzvalue, dwtype.toInt(), pvdata, cbdata.toInt(), dwflags.toInt()).toUInt()

public actual fun SHReleaseThreadRef(): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHReleaseThreadRef()

public actual fun SHRemoveLocalizedName(pszpath: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRemoveLocalizedName(pszpath)

public actual fun SHReplaceFromPropSheetExtArray(hpsxa: HPSXA, upageid: UInt, lpfnreplacewith: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt =
    0u

public actual fun SHResolveLibrary(psilibrary: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHResolveLibrary(psilibrary)

public actual fun SHRestricted(rest: RESTRICTIONS): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHRestricted(rest).toUInt()

public actual fun SHSendMessageBroadcastA(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSendMessageBroadcastA(umsg.toInt(), wparam.toLong(), lparam)

public actual fun SHSendMessageBroadcastW(umsg: UInt, wparam: WPARAM, lparam: LPARAM): LRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSendMessageBroadcastW(umsg.toInt(), wparam.toLong(), lparam)

public actual fun SHSetDefaultProperties(hwnd: HWND, psi: Long, dwfileopflags: UInt, pfops: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetDefaultProperties(hwnd, psi, dwfileopflags.toInt(), pfops)

public actual fun SHSetFolderPathA(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetFolderPathA(csidl, htoken, dwflags.toInt(), pszpath)

public actual fun SHSetFolderPathW(csidl: Int, htoken: HANDLE, dwflags: UInt, pszpath: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetFolderPathW(csidl, htoken, dwflags.toInt(), pszpath)

public actual fun SHSetInstanceExplorer(punk: Long) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetInstanceExplorer(punk)
}

public actual fun SHSetKnownFolderPath(rfid: Long, dwflags: UInt, htoken: HANDLE, pszpath: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetKnownFolderPath(rfid, dwflags.toInt(), htoken, pszpath)

public actual fun SHSetLocalizedName(pszpath: PCWSTR, pszresmodule: PCWSTR, idsres: Int): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetLocalizedName(pszpath, pszresmodule, idsres)

public actual fun SHSetTemporaryPropertyForItem(psi: Long, propkey: Long, propvar: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetTemporaryPropertyForItem(psi, propkey, propvar)

public actual fun SHSetThreadRef(punk: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetThreadRef(punk)

public actual fun SHSetUnreadMailCountW(pszmailaddress: PCWSTR, dwcount: UInt, pszshellexecutecommand: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetUnreadMailCountW(pszmailaddress, dwcount.toInt(), pszshellexecutecommand)

public actual fun SHSetValueA(hkey: HKEY, pszsubkey: PCSTR, pszvalue: PCSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetValueA(hkey, pszsubkey, pszvalue, dwtype.toInt(), pvdata, cbdata.toInt())

public actual fun SHSetValueW(hkey: HKEY, pszsubkey: PCWSTR, pszvalue: PCWSTR, dwtype: UInt, pvdata: Long, cbdata: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSetValueW(hkey, pszsubkey, pszvalue, dwtype.toInt(), pvdata, cbdata.toInt())

public actual fun SHShellFolderView_Message(hwndmain: HWND, umsg: UInt, lparam: LPARAM): LRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHShellFolderView_Message(hwndmain, umsg.toInt(), lparam)

public actual fun SHShowManageLibraryUI(psilibrary: Long, hwndowner: HWND, psztitle: PCWSTR, pszinstruction: PCWSTR, lmdoptions: LIBRARYMANAGEDIALOGOPTIONS): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHShowManageLibraryUI(psilibrary, hwndowner, psztitle, pszinstruction, lmdoptions)

public actual fun SHSimpleIDListFromPath(pszpath: PCWSTR): Long =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSimpleIDListFromPath(pszpath)

public actual fun SHSkipJunction(pbc: Long, pclsid: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHSkipJunction(pbc, pclsid)

public actual fun SHStartNetConnectionDialogW(hwnd: HWND, pszremotename: PCWSTR, dwtype: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHStartNetConnectionDialogW(hwnd, pszremotename, dwtype.toInt())

public actual fun SHStrDupA(psz: PCSTR, ppwsz: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHStrDupA(psz, ppwsz)

public actual fun SHStrDupW(psz: PCWSTR, ppwsz: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHStrDupW(psz, ppwsz)

public actual fun SHStripMneumonicA(pszmenu: PSTR): Byte =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHStripMneumonicA(pszmenu)

public actual fun SHStripMneumonicW(pszmenu: PWSTR): UShort =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHStripMneumonicW(pszmenu).toUShort()

public actual fun SHTestTokenMembership(htoken: HANDLE, ulrid: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHTestTokenMembership(htoken, ulrid.toInt())

public actual fun SHUnicodeToAnsi(pwszsrc: PCWSTR, pszdst: PSTR, cchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHUnicodeToAnsi(pwszsrc, pszdst, cchbuf)

public actual fun SHUnicodeToUnicode(pwzsrc: PCWSTR, pwzdst: PWSTR, cwchbuf: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHUnicodeToUnicode(pwzsrc, pwzdst, cwchbuf)

public actual fun SHUnlockShared(pvdata: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHUnlockShared(pvdata)

public actual fun SHUpdateImageA(pszhashitem: PCSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHUpdateImageA(pszhashitem, iindex, uflags.toInt(), iimageindex)
}

public actual fun SHUpdateImageW(pszhashitem: PCWSTR, iindex: Int, uflags: UInt, iimageindex: Int) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHUpdateImageW(pszhashitem, iindex, uflags.toInt(), iimageindex)
}

public actual fun SHValidateUNC(hwndowner: HWND, pszfile: PWSTR, fconnect: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SHValidateUNC(hwndowner, pszfile, fconnect.toInt())

public actual fun SetCurrentProcessExplicitAppUserModelID(appid: PCWSTR): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SetCurrentProcessExplicitAppUserModelID(appid)

public actual fun SetMenuContextHelpId(param0: HMENU, param1: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SetMenuContextHelpId(param0, param1.toInt())

public actual fun SetWindowContextHelpId(param0: HWND, param1: UInt): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SetWindowContextHelpId(param0, param1.toInt())

public actual fun SetWindowSubclass(hwnd: HWND, pfnsubclass: SUBCLASSPROC, uidsubclass: ULong, dwrefdata: ULong): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SetWindowSubclass(hwnd, pfnsubclass.toLong(), uidsubclass.toLong(), dwrefdata.toLong())

public actual fun ShellAboutA(hwnd: HWND, szapp: PCSTR, szotherstuff: PCSTR, hicon: HICON): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ShellAboutA(hwnd, szapp, szotherstuff, hicon)

public actual fun ShellAboutW(hwnd: HWND, szapp: PCWSTR, szotherstuff: PCWSTR, hicon: HICON): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ShellAboutW(hwnd, szapp, szotherstuff, hicon)

public actual fun ShellExecuteA(hwnd: HWND, lpoperation: PCSTR, lpfile: PCSTR, lpparameters: PCSTR, lpdirectory: PCSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ShellExecuteA(hwnd, lpoperation, lpfile, lpparameters, lpdirectory, nshowcmd)

public actual fun ShellExecuteExA(pexecinfo: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ShellExecuteExA(pexecinfo)

public actual fun ShellExecuteExW(pexecinfo: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ShellExecuteExW(pexecinfo)

public actual fun ShellExecuteW(hwnd: HWND, lpoperation: PCWSTR, lpfile: PCWSTR, lpparameters: PCWSTR, lpdirectory: PCWSTR, nshowcmd: SHOW_WINDOW_CMD): HINSTANCE =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_ShellExecuteW(hwnd, lpoperation, lpfile, lpparameters, lpdirectory, nshowcmd)

public actual fun ShellMessageBoxA(happinst: HINSTANCE, hwnd: HWND, lpctext: PCSTR, lpctitle: PCSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun ShellMessageBoxW(happinst: HINSTANCE, hwnd: HWND, lpctext: PCWSTR, lpctitle: PCWSTR, fustyle: MESSAGEBOX_STYLE): Int =
    0

public actual fun Shell_GetCachedImageIndex(pwsziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndex(pwsziconpath, iiconindex, uiconflags.toInt())

public actual fun Shell_GetCachedImageIndexA(psziconpath: PCSTR, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexA(psziconpath, iiconindex, uiconflags.toInt())

public actual fun Shell_GetCachedImageIndexW(psziconpath: PCWSTR, iiconindex: Int, uiconflags: UInt): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_GetCachedImageIndexW(psziconpath, iiconindex, uiconflags.toInt())

public actual fun Shell_GetImageLists(phiml: Long, phimlsmall: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_GetImageLists(phiml, phimlsmall)

public actual fun Shell_MergeMenus(hmdst: HMENU, hmsrc: HMENU, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MM_FLAGS): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_MergeMenus(hmdst, hmsrc, uinsert.toInt(), uidadjust.toInt(), uidadjustmax.toInt(), uflags.toInt()).toUInt()

public actual fun Shell_NotifyIconA(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_NotifyIconA(dwmessage.toInt(), lpdata)

public actual fun Shell_NotifyIconGetRect(identifier: Long, iconlocation: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_NotifyIconGetRect(identifier, iconlocation)

public actual fun Shell_NotifyIconW(dwmessage: NOTIFY_ICON_MESSAGE, lpdata: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Shell_NotifyIconW(dwmessage.toInt(), lpdata)

public actual fun SignalFileOpen(pidl: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SignalFileOpen(pidl)

public actual fun SoftwareUpdateMessageBox(hwnd: HWND, pszdistunit: PCWSTR, dwflags: UInt, psdi: Long): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_SoftwareUpdateMessageBox(hwnd, pszdistunit, dwflags.toInt(), psdi).toUInt()

public actual fun StgMakeUniqueName(pstgparent: Long, pszfilespec: PCWSTR, grfmode: UInt, riid: Long, ppv: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StgMakeUniqueName(pstgparent, pszfilespec, grfmode.toInt(), riid, ppv)

public actual fun StrCSpnA(pszstr: PCSTR, pszset: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCSpnA(pszstr, pszset)

public actual fun StrCSpnIA(pszstr: PCSTR, pszset: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCSpnIA(pszstr, pszset)

public actual fun StrCSpnIW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCSpnIW(pszstr, pszset)

public actual fun StrCSpnW(pszstr: PCWSTR, pszset: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCSpnW(pszstr, pszset)

public actual fun StrCatBuffA(pszdest: PSTR, pszsrc: PCSTR, cchdestbuffsize: Int): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCatBuffA(pszdest, pszsrc, cchdestbuffsize)

public actual fun StrCatBuffW(pszdest: PWSTR, pszsrc: PCWSTR, cchdestbuffsize: Int): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCatBuffW(pszdest, pszsrc, cchdestbuffsize)

public actual fun StrCatChainW(pszdst: PWSTR, cchdst: UInt, ichat: UInt, pszsrc: PCWSTR): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCatChainW(pszdst, cchdst.toInt(), ichat.toInt(), pszsrc).toUInt()

public actual fun StrCatW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCatW(psz1, psz2)

public actual fun StrChrA(pszstart: PCSTR, wmatch: UShort): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrChrA(pszstart, wmatch.toShort())

public actual fun StrChrIA(pszstart: PCSTR, wmatch: UShort): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrChrIA(pszstart, wmatch.toShort())

public actual fun StrChrIW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrChrIW(pszstart, wmatch.toShort())

public actual fun StrChrNIW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrChrNIW(pszstart, wmatch.toShort(), cchmax.toInt())

public actual fun StrChrNW(pszstart: PCWSTR, wmatch: UShort, cchmax: UInt): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrChrNW(pszstart, wmatch.toShort(), cchmax.toInt())

public actual fun StrChrW(pszstart: PCWSTR, wmatch: UShort): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrChrW(pszstart, wmatch.toShort())

public actual fun StrCmpCA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpCA(pszstr1, pszstr2)

public actual fun StrCmpCW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpCW(pszstr1, pszstr2)

public actual fun StrCmpICA(pszstr1: PCSTR, pszstr2: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpICA(pszstr1, pszstr2)

public actual fun StrCmpICW(pszstr1: PCWSTR, pszstr2: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpICW(pszstr1, pszstr2)

public actual fun StrCmpIW(psz1: PCWSTR, psz2: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpIW(psz1, psz2)

public actual fun StrCmpLogicalW(psz1: PCWSTR, psz2: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpLogicalW(psz1, psz2)

public actual fun StrCmpNA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNA(psz1, psz2, nchar)

public actual fun StrCmpNCA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNCA(pszstr1, pszstr2, nchar)

public actual fun StrCmpNCW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNCW(pszstr1, pszstr2, nchar)

public actual fun StrCmpNIA(psz1: PCSTR, psz2: PCSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNIA(psz1, psz2, nchar)

public actual fun StrCmpNICA(pszstr1: PCSTR, pszstr2: PCSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNICA(pszstr1, pszstr2, nchar)

public actual fun StrCmpNICW(pszstr1: PCWSTR, pszstr2: PCWSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNICW(pszstr1, pszstr2, nchar)

public actual fun StrCmpNIW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNIW(psz1, psz2, nchar)

public actual fun StrCmpNW(psz1: PCWSTR, psz2: PCWSTR, nchar: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpNW(psz1, psz2, nchar)

public actual fun StrCmpW(psz1: PCWSTR, psz2: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCmpW(psz1, psz2)

public actual fun StrCpyNW(pszdst: PWSTR, pszsrc: PCWSTR, cchmax: Int): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCpyNW(pszdst, pszsrc, cchmax)

public actual fun StrCpyW(psz1: PWSTR, psz2: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrCpyW(psz1, psz2)

public actual fun StrDupA(pszsrch: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrDupA(pszsrch)

public actual fun StrDupW(pszsrch: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrDupW(pszsrch)

public actual fun StrFormatByteSize64A(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFormatByteSize64A(qdw, pszbuf, cchbuf.toInt())

public actual fun StrFormatByteSizeA(dw: UInt, pszbuf: PSTR, cchbuf: UInt): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFormatByteSizeA(dw.toInt(), pszbuf, cchbuf.toInt())

public actual fun StrFormatByteSizeEx(ull: ULong, flags: SFBS_FLAGS, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFormatByteSizeEx(ull.toLong(), flags, pszbuf, cchbuf.toInt())

public actual fun StrFormatByteSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFormatByteSizeW(qdw, pszbuf, cchbuf.toInt())

public actual fun StrFormatKBSizeA(qdw: Long, pszbuf: PSTR, cchbuf: UInt): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFormatKBSizeA(qdw, pszbuf, cchbuf.toInt())

public actual fun StrFormatKBSizeW(qdw: Long, pszbuf: PWSTR, cchbuf: UInt): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFormatKBSizeW(qdw, pszbuf, cchbuf.toInt())

public actual fun StrFromTimeIntervalA(pszout: PSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFromTimeIntervalA(pszout, cchmax.toInt(), dwtimems.toInt(), digits)

public actual fun StrFromTimeIntervalW(pszout: PWSTR, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrFromTimeIntervalW(pszout, cchmax.toInt(), dwtimems.toInt(), digits)

public actual fun StrIsIntlEqualA(fcasesens: BOOL, pszstring1: PCSTR, pszstring2: PCSTR, nchar: Int): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrIsIntlEqualA(fcasesens, pszstring1, pszstring2, nchar)

public actual fun StrIsIntlEqualW(fcasesens: BOOL, pszstring1: PCWSTR, pszstring2: PCWSTR, nchar: Int): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrIsIntlEqualW(fcasesens, pszstring1, pszstring2, nchar)

public actual fun StrNCatA(psz1: PSTR, psz2: PCSTR, cchmax: Int): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrNCatA(psz1, psz2, cchmax)

public actual fun StrNCatW(psz1: PWSTR, psz2: PCWSTR, cchmax: Int): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrNCatW(psz1, psz2, cchmax)

public actual fun StrPBrkA(psz: PCSTR, pszset: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrPBrkA(psz, pszset)

public actual fun StrPBrkW(psz: PCWSTR, pszset: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrPBrkW(psz, pszset)

public actual fun StrRChrA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRChrA(pszstart, pszend, wmatch.toShort())

public actual fun StrRChrIA(pszstart: PCSTR, pszend: PCSTR, wmatch: UShort): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRChrIA(pszstart, pszend, wmatch.toShort())

public actual fun StrRChrIW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRChrIW(pszstart, pszend, wmatch.toShort())

public actual fun StrRChrW(pszstart: PCWSTR, pszend: PCWSTR, wmatch: UShort): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRChrW(pszstart, pszend, wmatch.toShort())

public actual fun StrRStrIA(pszsource: PCSTR, pszlast: PCSTR, pszsrch: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRStrIA(pszsource, pszlast, pszsrch)

public actual fun StrRStrIW(pszsource: PCWSTR, pszlast: PCWSTR, pszsrch: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRStrIW(pszsource, pszlast, pszsrch)

public actual fun StrRetToBSTR(pstr: Long, pidl: Long, pbstr: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRetToBSTR(pstr, pidl, pbstr)

public actual fun StrRetToBufA(pstr: Long, pidl: Long, pszbuf: PSTR, cchbuf: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRetToBufA(pstr, pidl, pszbuf, cchbuf.toInt())

public actual fun StrRetToBufW(pstr: Long, pidl: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRetToBufW(pstr, pidl, pszbuf, cchbuf.toInt())

public actual fun StrRetToStrA(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRetToStrA(pstr, pidl, ppsz)

public actual fun StrRetToStrW(pstr: Long, pidl: Long, ppsz: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrRetToStrW(pstr, pidl, ppsz)

public actual fun StrSpnA(psz: PCSTR, pszset: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrSpnA(psz, pszset)

public actual fun StrSpnW(psz: PCWSTR, pszset: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrSpnW(psz, pszset)

public actual fun StrStrA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrStrA(pszfirst, pszsrch)

public actual fun StrStrIA(pszfirst: PCSTR, pszsrch: PCSTR): PSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrStrIA(pszfirst, pszsrch)

public actual fun StrStrIW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrStrIW(pszfirst, pszsrch)

public actual fun StrStrNIW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrStrNIW(pszfirst, pszsrch, cchmax.toInt())

public actual fun StrStrNW(pszfirst: PCWSTR, pszsrch: PCWSTR, cchmax: UInt): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrStrNW(pszfirst, pszsrch, cchmax.toInt())

public actual fun StrStrW(pszfirst: PCWSTR, pszsrch: PCWSTR): PWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrStrW(pszfirst, pszsrch)

public actual fun StrToInt64ExA(pszstring: PCSTR, dwflags: Int, pllret: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrToInt64ExA(pszstring, dwflags, pllret)

public actual fun StrToInt64ExW(pszstring: PCWSTR, dwflags: Int, pllret: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrToInt64ExW(pszstring, dwflags, pllret)

public actual fun StrToIntA(pszsrc: PCSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrToIntA(pszsrc)

public actual fun StrToIntExA(pszstring: PCSTR, dwflags: Int, piret: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrToIntExA(pszstring, dwflags, piret)

public actual fun StrToIntExW(pszstring: PCWSTR, dwflags: Int, piret: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrToIntExW(pszstring, dwflags, piret)

public actual fun StrToIntW(pszsrc: PCWSTR): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrToIntW(pszsrc)

public actual fun StrTrimA(psz: PSTR, psztrimchars: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrTrimA(psz, psztrimchars)

public actual fun StrTrimW(psz: PWSTR, psztrimchars: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_StrTrimW(psz, psztrimchars)

public actual fun UnloadUserProfile(htoken: HANDLE, hprofile: HANDLE): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UnloadUserProfile(htoken, hprofile)

public actual fun UnregisterAppConstrainedChangeNotification(registration: PAPPCONSTRAIN_REGISTRATION) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UnregisterAppConstrainedChangeNotification(registration)
}

public actual fun UnregisterAppStateChangeNotification(registration: PAPPSTATE_REGISTRATION) {
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UnregisterAppStateChangeNotification(registration)
}

public actual fun UnregisterScaleChangeEvent(dwcookie: ULong): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UnregisterScaleChangeEvent(dwcookie.toLong())

public actual fun UrlApplySchemeA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlApplySchemeA(pszin, pszout, pcchout, dwflags.toInt())

public actual fun UrlApplySchemeW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlApplySchemeW(pszin, pszout, pcchout, dwflags.toInt())

public actual fun UrlCanonicalizeA(pszurl: PCSTR, pszcanonicalized: PSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCanonicalizeA(pszurl, pszcanonicalized, pcchcanonicalized, dwflags.toInt())

public actual fun UrlCanonicalizeW(pszurl: PCWSTR, pszcanonicalized: PWSTR, pcchcanonicalized: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCanonicalizeW(pszurl, pszcanonicalized, pcchcanonicalized, dwflags.toInt())

public actual fun UrlCombineA(pszbase: PCSTR, pszrelative: PCSTR, pszcombined: PSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCombineA(pszbase, pszrelative, pszcombined, pcchcombined, dwflags.toInt())

public actual fun UrlCombineW(pszbase: PCWSTR, pszrelative: PCWSTR, pszcombined: PWSTR, pcchcombined: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCombineW(pszbase, pszrelative, pszcombined, pcchcombined, dwflags.toInt())

public actual fun UrlCompareA(psz1: PCSTR, psz2: PCSTR, fignoreslash: BOOL): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCompareA(psz1, psz2, fignoreslash)

public actual fun UrlCompareW(psz1: PCWSTR, psz2: PCWSTR, fignoreslash: BOOL): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCompareW(psz1, psz2, fignoreslash)

public actual fun UrlCreateFromPathA(pszpath: PCSTR, pszurl: PSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCreateFromPathA(pszpath, pszurl, pcchurl, dwflags.toInt())

public actual fun UrlCreateFromPathW(pszpath: PCWSTR, pszurl: PWSTR, pcchurl: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlCreateFromPathW(pszpath, pszurl, pcchurl, dwflags.toInt())

public actual fun UrlEscapeA(pszurl: PCSTR, pszescaped: PSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlEscapeA(pszurl, pszescaped, pcchescaped, dwflags.toInt())

public actual fun UrlEscapeW(pszurl: PCWSTR, pszescaped: PWSTR, pcchescaped: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlEscapeW(pszurl, pszescaped, pcchescaped, dwflags.toInt())

public actual fun UrlFixupW(pcszurl: PCWSTR, psztranslatedurl: PWSTR, cchmax: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlFixupW(pcszurl, psztranslatedurl, cchmax.toInt())

public actual fun UrlGetLocationA(pszurl: PCSTR): PCSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlGetLocationA(pszurl)

public actual fun UrlGetLocationW(pszurl: PCWSTR): PCWSTR =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlGetLocationW(pszurl)

public actual fun UrlGetPartA(pszin: PCSTR, pszout: PSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlGetPartA(pszin, pszout, pcchout, dwpart.toInt(), dwflags.toInt())

public actual fun UrlGetPartW(pszin: PCWSTR, pszout: PWSTR, pcchout: Long, dwpart: UInt, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlGetPartW(pszin, pszout, pcchout, dwpart.toInt(), dwflags.toInt())

public actual fun UrlHashA(pszurl: PCSTR, pbhash: Long, cbhash: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlHashA(pszurl, pbhash, cbhash.toInt())

public actual fun UrlHashW(pszurl: PCWSTR, pbhash: Long, cbhash: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlHashW(pszurl, pbhash, cbhash.toInt())

public actual fun UrlIsA(pszurl: PCSTR, urlis: URLIS): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlIsA(pszurl, urlis)

public actual fun UrlIsNoHistoryA(pszurl: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlIsNoHistoryA(pszurl)

public actual fun UrlIsNoHistoryW(pszurl: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlIsNoHistoryW(pszurl)

public actual fun UrlIsOpaqueA(pszurl: PCSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlIsOpaqueA(pszurl)

public actual fun UrlIsOpaqueW(pszurl: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlIsOpaqueW(pszurl)

public actual fun UrlIsW(pszurl: PCWSTR, urlis: URLIS): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlIsW(pszurl, urlis)

public actual fun UrlUnescapeA(pszurl: PSTR, pszunescaped: PSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlUnescapeA(pszurl, pszunescaped, pcchunescaped, dwflags.toInt())

public actual fun UrlUnescapeW(pszurl: PWSTR, pszunescaped: PWSTR, pcchunescaped: Long, dwflags: UInt): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_UrlUnescapeW(pszurl, pszunescaped, pcchunescaped, dwflags.toInt())

public actual fun VariantToStrRet(varin: Long, pstrret: Long): HRESULT =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_VariantToStrRet(varin, pstrret)

public actual fun WhichPlatform(): UInt =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_WhichPlatform().toUInt()

public actual fun Win32DeleteFile(pszpath: PCWSTR): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_Win32DeleteFile(pszpath)

public actual fun WinHelpA(hwndmain: HWND, lpszhelp: PCSTR, ucommand: UInt, dwdata: ULong): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_WinHelpA(hwndmain, lpszhelp, ucommand.toInt(), dwdata.toLong())

public actual fun WinHelpW(hwndmain: HWND, lpszhelp: PCWSTR, ucommand: UInt, dwdata: ULong): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_WinHelpW(hwndmain, lpszhelp, ucommand.toInt(), dwdata.toLong())

public actual fun WriteCabinetState(pcs: Long): BOOL =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_WriteCabinetState(pcs)

public actual fun wnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR): Int =
    0

public actual fun wnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR): Int =
    0

public actual fun wvnsprintfA(pszdest: PSTR, cchdest: Int, pszfmt: PCSTR, arglist: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_wvnsprintfA(pszdest, cchdest, pszfmt, arglist)

public actual fun wvnsprintfW(pszdest: PWSTR, cchdest: Int, pszfmt: PCWSTR, arglist: Long): Int =
    WindowsWin32UiShellJniBridge.windowssys_windows_win32_ui_shell_wvnsprintfW(pszdest, cchdest, pszfmt, arglist)
